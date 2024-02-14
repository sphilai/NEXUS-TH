/*
 * PROJECT：eca0027
 * 
 * W1008PltzItem の検索条件Domainクラス
 * テーブル概要：Palletize Item/????????  As line information of palletizing, table to hold the information of item number unit. Information instruction palletizing export request goods, RT recommended packing, Shigeyuki goods, made ??of parts, in materials, dummy RT material is stored./???????????????????????????????????????RT???????????????????????????RT???????????
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/06/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * W1008PltzItem の検索条件Domainクラスです。<BR>
 * テーブル概要：Palletize Item/????????  As line information of palletizing, table to hold the information of item number unit. Information instruction palletizing export request goods, RT recommended packing, Shigeyuki goods, made ??of parts, in materials, dummy RT material is stored./???????????????????????????????????????RT???????????????????????????RT???????????<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/06/05 16:25:47<BR>
 * 
 * テーブル定義から2558/06/05に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1008PltzItemCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * MAIN MARK/??????
     */
    private String mainMark;

    /**
     * BRANCH/??
     */
    private BigDecimal brch;

    /**
     * PALLETIZE ITEM NO/?????????
     */
    private String pltzItemNo;

    /**
     * PACKAGE CODE/????
     */
    private String pkgCd;

    /**
     * ITEM DESCRIPTION/????
     */
    private String itemDescription;

    /**
     * QUANTITY/??
     */
    private BigDecimal qty;

    /**
     * QUANTITY UNIT/????
     */
    private String qtyUnit;

    /**
     * TAG QUANTITY/???
     */
    private BigDecimal tagQty;

    /**
     * ITEM TYPE/????  1:Parts,
2:Materials,
3:PKG Materials,
4:Equipment,
9:Other
     */
    private String itemTyp;

    /**
     * NET WEIGHT/?????
     */
    private BigDecimal netWeight;

    /**
     * ITEM WEIGHT/????  ???
     */
    private BigDecimal itemWeight;

    /**
     * WEIGHT UNIT/????
     */
    private String weightUnit;

    /**
     * SHIPPING LOT/?????
     */
    private BigDecimal shippingLot;

    /**
     * PACKAGE TYPE/?????  1:Inner,
2:Outer,
3:Dummy,
4:E-RT
     */
    private String pkgTyp;

    /**
     * MODEL CODE/?????
     */
    private String modelCd;

    /**
     * EXPORT LIMIT TYPE/??????
     */
    private String expLimitTyp;

    /**
     * DENGER ITEM FLAG/??????  Y:Danger Item, N:Not
     */
    private String dngrItemFlg;

    /**
     * ORIGIN COUNTRY CODE/??????
     */
    private String originCntryCd;

    /**
     * CURRENCY CODE/?????
     */
    private String currCd;

    /**
     * PLANT CODE/???????
     */
    private String plntCd;

    /**
     * RT FLAG/RT????  Y:RT, N:Not
     */
    private String rtFlg;

    /**
     * KIT FLAG/KIT????  Y:Export Request KIT Item, N:Not
     */
    private String kitFlg;

    /**
     * EXPORT REQUEST NO/????NO
     */
    private String expRequestNo;
    /**
     * EXPORT REQUEST ITEM ID OR EXPORT REQUEST KIT ID/??????ID
     */
    private BigDecimal expRequestItemId;
    /**
     * EXPORT REQUEST KIT ID
     */
    private BigDecimal expRequestKitId;
    /**
     * LINE NO/?????
     */
    private BigDecimal lineNo;

    /**
     * KIT BRANCH/KIT???
     */
    private BigDecimal kitBrch;

    /**
     * MIX TAG NO/MIX??NO
     */
    private String mixTagNo;

    /**
     * PALLETIZE INSTRUCTION NO/????NO
     */
    private String pltzInstrNo;

    /**
     * PARENT FLAG/????  Y:Parent Item, N:Child Item
     */
    private String parFlg;

    /**
     * KIT PARENT ITEM NO/?KIT????
     */
    private String kitParItemNo;

    /**
     * CUSTOMER PO NO/???PO NO  M???????
     */
    private String customerPoNo;

    /**
     * CUSTOMER ITEM NO/???????  M???????
     */
    private String customerItemNo;

    /**
     * UNIT PRICE/??
     */
    private BigDecimal unitPrice;

    /**
     * HS CODE/HS???
     */
    private String hsCd;

    /**
     * INPUT METHOD TYPE/??????  10:Auto, 20:Manual
Packaging materials registration means of EIS Product. Set to null palletizing except when EIS Product/?????????????????????????null???
     */
    private String inputMethTyp;

    /**
     * UPDATE FUNCTION ID/????ID
     */
    private String comUpdateFuncId;

    /**
     * UPDATE USER ID/???
     */
    private String comUpdateUserId;

    /**
     * UPDATE TIMESTAMP????
     */
    private Timestamp comUpdateTimestamp;

    /**
     * CREATE FUNCTION ID/????ID
     */
    private String comCreateFuncId;

    /**
     * CREATE USER ID/???
     */
    private String comCreateUserId;

    /**
     * CREATE TIMESTAMP/????
     */
    private Timestamp comCreateTimestamp;

    /**
     * MAIN MARK/??????（大なり）
     */
    private String mainMarkGreaterThan;

    /**
     * MAIN MARK/??????（大なりイコール）
     */
    private String mainMarkGreaterThanEqual;

    /**
     * MAIN MARK/??????（小なり）
     */
    private String mainMarkLessThan;

    /**
     * MAIN MARK/??????（小なりイコール）
     */
    private String mainMarkLessThanEqual;

    /**
     * MAIN MARK/??????（前方一致）
     */
    private String mainMarkLikeFront;

    /**
     * PALLETIZE ITEM NO/?????????（大なり）
     */
    private String pltzItemNoGreaterThan;

    /**
     * PALLETIZE ITEM NO/?????????（大なりイコール）
     */
    private String pltzItemNoGreaterThanEqual;

    /**
     * PALLETIZE ITEM NO/?????????（小なり）
     */
    private String pltzItemNoLessThan;

    /**
     * PALLETIZE ITEM NO/?????????（小なりイコール）
     */
    private String pltzItemNoLessThanEqual;

    /**
     * PALLETIZE ITEM NO/?????????（前方一致）
     */
    private String pltzItemNoLikeFront;

    /**
     * PACKAGE CODE/????（大なり）
     */
    private String pkgCdGreaterThan;

    /**
     * PACKAGE CODE/????（大なりイコール）
     */
    private String pkgCdGreaterThanEqual;

    /**
     * PACKAGE CODE/????（小なり）
     */
    private String pkgCdLessThan;

    /**
     * PACKAGE CODE/????（小なりイコール）
     */
    private String pkgCdLessThanEqual;

    /**
     * PACKAGE CODE/????（前方一致）
     */
    private String pkgCdLikeFront;

    /**
     * ITEM DESCRIPTION/????（大なり）
     */
    private String itemDescriptionGreaterThan;

    /**
     * ITEM DESCRIPTION/????（大なりイコール）
     */
    private String itemDescriptionGreaterThanEqual;

    /**
     * ITEM DESCRIPTION/????（小なり）
     */
    private String itemDescriptionLessThan;

    /**
     * ITEM DESCRIPTION/????（小なりイコール）
     */
    private String itemDescriptionLessThanEqual;

    /**
     * ITEM DESCRIPTION/????（前方一致）
     */
    private String itemDescriptionLikeFront;

    /**
     * QUANTITY UNIT/????（大なり）
     */
    private String qtyUnitGreaterThan;

    /**
     * QUANTITY UNIT/????（大なりイコール）
     */
    private String qtyUnitGreaterThanEqual;

    /**
     * QUANTITY UNIT/????（小なり）
     */
    private String qtyUnitLessThan;

    /**
     * QUANTITY UNIT/????（小なりイコール）
     */
    private String qtyUnitLessThanEqual;

    /**
     * QUANTITY UNIT/????（前方一致）
     */
    private String qtyUnitLikeFront;

    /**
     * ITEM TYPE/????  1:Parts,
2:Materials,
3:PKG Materials,
4:Equipment,
9:Other（大なり）
     */
    private String itemTypGreaterThan;

    /**
     * ITEM TYPE/????  1:Parts,
2:Materials,
3:PKG Materials,
4:Equipment,
9:Other（大なりイコール）
     */
    private String itemTypGreaterThanEqual;

    /**
     * ITEM TYPE/????  1:Parts,
2:Materials,
3:PKG Materials,
4:Equipment,
9:Other（小なり）
     */
    private String itemTypLessThan;

    /**
     * ITEM TYPE/????  1:Parts,
2:Materials,
3:PKG Materials,
4:Equipment,
9:Other（小なりイコール）
     */
    private String itemTypLessThanEqual;

    /**
     * ITEM TYPE/????  1:Parts,
2:Materials,
3:PKG Materials,
4:Equipment,
9:Other（前方一致）
     */
    private String itemTypLikeFront;

    /**
     * WEIGHT UNIT/????（大なり）
     */
    private String weightUnitGreaterThan;

    /**
     * WEIGHT UNIT/????（大なりイコール）
     */
    private String weightUnitGreaterThanEqual;

    /**
     * WEIGHT UNIT/????（小なり）
     */
    private String weightUnitLessThan;

    /**
     * WEIGHT UNIT/????（小なりイコール）
     */
    private String weightUnitLessThanEqual;

    /**
     * WEIGHT UNIT/????（前方一致）
     */
    private String weightUnitLikeFront;

    /**
     * PACKAGE TYPE/?????  1:Inner,
2:Outer,
3:Dummy,
4:E-RT（大なり）
     */
    private String pkgTypGreaterThan;

    /**
     * PACKAGE TYPE/?????  1:Inner,
2:Outer,
3:Dummy,
4:E-RT（大なりイコール）
     */
    private String pkgTypGreaterThanEqual;

    /**
     * PACKAGE TYPE/?????  1:Inner,
2:Outer,
3:Dummy,
4:E-RT（小なり）
     */
    private String pkgTypLessThan;

    /**
     * PACKAGE TYPE/?????  1:Inner,
2:Outer,
3:Dummy,
4:E-RT（小なりイコール）
     */
    private String pkgTypLessThanEqual;

    /**
     * PACKAGE TYPE/?????  1:Inner,
2:Outer,
3:Dummy,
4:E-RT（前方一致）
     */
    private String pkgTypLikeFront;

    /**
     * MODEL CODE/?????（大なり）
     */
    private String modelCdGreaterThan;

    /**
     * MODEL CODE/?????（大なりイコール）
     */
    private String modelCdGreaterThanEqual;

    /**
     * MODEL CODE/?????（小なり）
     */
    private String modelCdLessThan;

    /**
     * MODEL CODE/?????（小なりイコール）
     */
    private String modelCdLessThanEqual;

    /**
     * MODEL CODE/?????（前方一致）
     */
    private String modelCdLikeFront;

    /**
     * EXPORT LIMIT TYPE/??????（大なり）
     */
    private String expLimitTypGreaterThan;

    /**
     * EXPORT LIMIT TYPE/??????（大なりイコール）
     */
    private String expLimitTypGreaterThanEqual;

    /**
     * EXPORT LIMIT TYPE/??????（小なり）
     */
    private String expLimitTypLessThan;

    /**
     * EXPORT LIMIT TYPE/??????（小なりイコール）
     */
    private String expLimitTypLessThanEqual;

    /**
     * EXPORT LIMIT TYPE/??????（前方一致）
     */
    private String expLimitTypLikeFront;

    /**
     * DENGER ITEM FLAG/??????  Y:Danger Item, N:Not（大なり）
     */
    private String dngrItemFlgGreaterThan;

    /**
     * DENGER ITEM FLAG/??????  Y:Danger Item, N:Not（大なりイコール）
     */
    private String dngrItemFlgGreaterThanEqual;

    /**
     * DENGER ITEM FLAG/??????  Y:Danger Item, N:Not（小なり）
     */
    private String dngrItemFlgLessThan;

    /**
     * DENGER ITEM FLAG/??????  Y:Danger Item, N:Not（小なりイコール）
     */
    private String dngrItemFlgLessThanEqual;

    /**
     * DENGER ITEM FLAG/??????  Y:Danger Item, N:Not（前方一致）
     */
    private String dngrItemFlgLikeFront;

    /**
     * ORIGIN COUNTRY CODE/??????（大なり）
     */
    private String originCntryCdGreaterThan;

    /**
     * ORIGIN COUNTRY CODE/??????（大なりイコール）
     */
    private String originCntryCdGreaterThanEqual;

    /**
     * ORIGIN COUNTRY CODE/??????（小なり）
     */
    private String originCntryCdLessThan;

    /**
     * ORIGIN COUNTRY CODE/??????（小なりイコール）
     */
    private String originCntryCdLessThanEqual;

    /**
     * ORIGIN COUNTRY CODE/??????（前方一致）
     */
    private String originCntryCdLikeFront;

    /**
     * CURRENCY CODE/?????（大なり）
     */
    private String currCdGreaterThan;

    /**
     * CURRENCY CODE/?????（大なりイコール）
     */
    private String currCdGreaterThanEqual;

    /**
     * CURRENCY CODE/?????（小なり）
     */
    private String currCdLessThan;

    /**
     * CURRENCY CODE/?????（小なりイコール）
     */
    private String currCdLessThanEqual;

    /**
     * CURRENCY CODE/?????（前方一致）
     */
    private String currCdLikeFront;

    /**
     * PLANT CODE/???????（大なり）
     */
    private String plntCdGreaterThan;

    /**
     * PLANT CODE/???????（大なりイコール）
     */
    private String plntCdGreaterThanEqual;

    /**
     * PLANT CODE/???????（小なり）
     */
    private String plntCdLessThan;

    /**
     * PLANT CODE/???????（小なりイコール）
     */
    private String plntCdLessThanEqual;

    /**
     * PLANT CODE/???????（前方一致）
     */
    private String plntCdLikeFront;

    /**
     * RT FLAG/RT????  Y:RT, N:Not（大なり）
     */
    private String rtFlgGreaterThan;

    /**
     * RT FLAG/RT????  Y:RT, N:Not（大なりイコール）
     */
    private String rtFlgGreaterThanEqual;

    /**
     * RT FLAG/RT????  Y:RT, N:Not（小なり）
     */
    private String rtFlgLessThan;

    /**
     * RT FLAG/RT????  Y:RT, N:Not（小なりイコール）
     */
    private String rtFlgLessThanEqual;

    /**
     * RT FLAG/RT????  Y:RT, N:Not（前方一致）
     */
    private String rtFlgLikeFront;

    /**
     * KIT FLAG/KIT????  Y:Export Request KIT Item, N:Not（大なり）
     */
    private String kitFlgGreaterThan;

    /**
     * KIT FLAG/KIT????  Y:Export Request KIT Item, N:Not（大なりイコール）
     */
    private String kitFlgGreaterThanEqual;

    /**
     * KIT FLAG/KIT????  Y:Export Request KIT Item, N:Not（小なり）
     */
    private String kitFlgLessThan;

    /**
     * KIT FLAG/KIT????  Y:Export Request KIT Item, N:Not（小なりイコール）
     */
    private String kitFlgLessThanEqual;

    /**
     * KIT FLAG/KIT????  Y:Export Request KIT Item, N:Not（前方一致）
     */
    private String kitFlgLikeFront;

    /**
     * EXPORT REQUEST NO/????NO（大なり）
     */
    private String expRequestNoGreaterThan;

    /**
     * EXPORT REQUEST NO/????NO（大なりイコール）
     */
    private String expRequestNoGreaterThanEqual;

    /**
     * EXPORT REQUEST NO/????NO（小なり）
     */
    private String expRequestNoLessThan;

    /**
     * EXPORT REQUEST NO/????NO（小なりイコール）
     */
    private String expRequestNoLessThanEqual;

    /**
     * EXPORT REQUEST NO/????NO（前方一致）
     */
    private String expRequestNoLikeFront;

    /**
     * MIX TAG NO/MIX??NO（大なり）
     */
    private String mixTagNoGreaterThan;

    /**
     * MIX TAG NO/MIX??NO（大なりイコール）
     */
    private String mixTagNoGreaterThanEqual;

    /**
     * MIX TAG NO/MIX??NO（小なり）
     */
    private String mixTagNoLessThan;

    /**
     * MIX TAG NO/MIX??NO（小なりイコール）
     */
    private String mixTagNoLessThanEqual;

    /**
     * MIX TAG NO/MIX??NO（前方一致）
     */
    private String mixTagNoLikeFront;

    /**
     * PALLETIZE INSTRUCTION NO/????NO（大なり）
     */
    private String pltzInstrNoGreaterThan;

    /**
     * PALLETIZE INSTRUCTION NO/????NO（大なりイコール）
     */
    private String pltzInstrNoGreaterThanEqual;

    /**
     * PALLETIZE INSTRUCTION NO/????NO（小なり）
     */
    private String pltzInstrNoLessThan;

    /**
     * PALLETIZE INSTRUCTION NO/????NO（小なりイコール）
     */
    private String pltzInstrNoLessThanEqual;

    /**
     * PALLETIZE INSTRUCTION NO/????NO（前方一致）
     */
    private String pltzInstrNoLikeFront;

    /**
     * PARENT FLAG/????  Y:Parent Item, N:Child Item（大なり）
     */
    private String parFlgGreaterThan;

    /**
     * PARENT FLAG/????  Y:Parent Item, N:Child Item（大なりイコール）
     */
    private String parFlgGreaterThanEqual;

    /**
     * PARENT FLAG/????  Y:Parent Item, N:Child Item（小なり）
     */
    private String parFlgLessThan;

    /**
     * PARENT FLAG/????  Y:Parent Item, N:Child Item（小なりイコール）
     */
    private String parFlgLessThanEqual;

    /**
     * PARENT FLAG/????  Y:Parent Item, N:Child Item（前方一致）
     */
    private String parFlgLikeFront;

    /**
     * KIT PARENT ITEM NO/?KIT????（大なり）
     */
    private String kitParItemNoGreaterThan;

    /**
     * KIT PARENT ITEM NO/?KIT????（大なりイコール）
     */
    private String kitParItemNoGreaterThanEqual;

    /**
     * KIT PARENT ITEM NO/?KIT????（小なり）
     */
    private String kitParItemNoLessThan;

    /**
     * KIT PARENT ITEM NO/?KIT????（小なりイコール）
     */
    private String kitParItemNoLessThanEqual;

    /**
     * KIT PARENT ITEM NO/?KIT????（前方一致）
     */
    private String kitParItemNoLikeFront;

    /**
     * CUSTOMER PO NO/???PO NO  M???????（大なり）
     */
    private String customerPoNoGreaterThan;

    /**
     * CUSTOMER PO NO/???PO NO  M???????（大なりイコール）
     */
    private String customerPoNoGreaterThanEqual;

    /**
     * CUSTOMER PO NO/???PO NO  M???????（小なり）
     */
    private String customerPoNoLessThan;

    /**
     * CUSTOMER PO NO/???PO NO  M???????（小なりイコール）
     */
    private String customerPoNoLessThanEqual;

    /**
     * CUSTOMER PO NO/???PO NO  M???????（前方一致）
     */
    private String customerPoNoLikeFront;

    /**
     * CUSTOMER ITEM NO/???????  M???????（大なり）
     */
    private String customerItemNoGreaterThan;

    /**
     * CUSTOMER ITEM NO/???????  M???????（大なりイコール）
     */
    private String customerItemNoGreaterThanEqual;

    /**
     * CUSTOMER ITEM NO/???????  M???????（小なり）
     */
    private String customerItemNoLessThan;

    /**
     * CUSTOMER ITEM NO/???????  M???????（小なりイコール）
     */
    private String customerItemNoLessThanEqual;

    /**
     * CUSTOMER ITEM NO/???????  M???????（前方一致）
     */
    private String customerItemNoLikeFront;

    /**
     * HS CODE/HS???（大なり）
     */
    private String hsCdGreaterThan;

    /**
     * HS CODE/HS???（大なりイコール）
     */
    private String hsCdGreaterThanEqual;

    /**
     * HS CODE/HS???（小なり）
     */
    private String hsCdLessThan;

    /**
     * HS CODE/HS???（小なりイコール）
     */
    private String hsCdLessThanEqual;

    /**
     * HS CODE/HS???（前方一致）
     */
    private String hsCdLikeFront;

    /**
     * INPUT METHOD TYPE/??????  10:Auto, 20:Manual
Packaging materials registration means of EIS Product. Set to null palletizing except when EIS Product/?????????????????????????null???（大なり）
     */
    private String inputMethTypGreaterThan;

    /**
     * INPUT METHOD TYPE/??????  10:Auto, 20:Manual
Packaging materials registration means of EIS Product. Set to null palletizing except when EIS Product/?????????????????????????null???（大なりイコール）
     */
    private String inputMethTypGreaterThanEqual;

    /**
     * INPUT METHOD TYPE/??????  10:Auto, 20:Manual
Packaging materials registration means of EIS Product. Set to null palletizing except when EIS Product/?????????????????????????null???（小なり）
     */
    private String inputMethTypLessThan;

    /**
     * INPUT METHOD TYPE/??????  10:Auto, 20:Manual
Packaging materials registration means of EIS Product. Set to null palletizing except when EIS Product/?????????????????????????null???（小なりイコール）
     */
    private String inputMethTypLessThanEqual;

    /**
     * INPUT METHOD TYPE/??????  10:Auto, 20:Manual
Packaging materials registration means of EIS Product. Set to null palletizing except when EIS Product/?????????????????????????null???（前方一致）
     */
    private String inputMethTypLikeFront;

    /**
     * UPDATE FUNCTION ID/????ID（大なり）
     */
    private String comUpdateFuncIdGreaterThan;

    /**
     * UPDATE FUNCTION ID/????ID（大なりイコール）
     */
    private String comUpdateFuncIdGreaterThanEqual;

    /**
     * UPDATE FUNCTION ID/????ID（小なり）
     */
    private String comUpdateFuncIdLessThan;

    /**
     * UPDATE FUNCTION ID/????ID（小なりイコール）
     */
    private String comUpdateFuncIdLessThanEqual;

    /**
     * UPDATE FUNCTION ID/????ID（前方一致）
     */
    private String comUpdateFuncIdLikeFront;

    /**
     * UPDATE USER ID/???（大なり）
     */
    private String comUpdateUserIdGreaterThan;

    /**
     * UPDATE USER ID/???（大なりイコール）
     */
    private String comUpdateUserIdGreaterThanEqual;

    /**
     * UPDATE USER ID/???（小なり）
     */
    private String comUpdateUserIdLessThan;

    /**
     * UPDATE USER ID/???（小なりイコール）
     */
    private String comUpdateUserIdLessThanEqual;

    /**
     * UPDATE USER ID/???（前方一致）
     */
    private String comUpdateUserIdLikeFront;

    /**
     * CREATE FUNCTION ID/????ID（大なり）
     */
    private String comCreateFuncIdGreaterThan;

    /**
     * CREATE FUNCTION ID/????ID（大なりイコール）
     */
    private String comCreateFuncIdGreaterThanEqual;

    /**
     * CREATE FUNCTION ID/????ID（小なり）
     */
    private String comCreateFuncIdLessThan;

    /**
     * CREATE FUNCTION ID/????ID（小なりイコール）
     */
    private String comCreateFuncIdLessThanEqual;

    /**
     * CREATE FUNCTION ID/????ID（前方一致）
     */
    private String comCreateFuncIdLikeFront;

    /**
     * CREATE USER ID/???（大なり）
     */
    private String comCreateUserIdGreaterThan;

    /**
     * CREATE USER ID/???（大なりイコール）
     */
    private String comCreateUserIdGreaterThanEqual;

    /**
     * CREATE USER ID/???（小なり）
     */
    private String comCreateUserIdLessThan;

    /**
     * CREATE USER ID/???（小なりイコール）
     */
    private String comCreateUserIdLessThanEqual;

    /**
     * CREATE USER ID/???（前方一致）
     */
    private String comCreateUserIdLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public W1008PltzItemCriteriaDomain() {
    }

    /**
     * mainMark のゲッターメソッドです。
     * 
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * mainMark のセッターメソッドです。
     * 
     * @param mainMark mainMark に設定する
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * brch のゲッターメソッドです。
     * 
     * @return the brch
     */
    public BigDecimal getBrch() {
        return brch;
    }

    /**
     * brch のセッターメソッドです。
     * 
     * @param brch brch に設定する
     */
    public void setBrch(BigDecimal brch) {
        this.brch = brch;
    }

    /**
     * pltzItemNo のゲッターメソッドです。
     * 
     * @return the pltzItemNo
     */
    public String getPltzItemNo() {
        return pltzItemNo;
    }

    /**
     * pltzItemNo のセッターメソッドです。
     * 
     * @param pltzItemNo pltzItemNo に設定する
     */
    public void setPltzItemNo(String pltzItemNo) {
        this.pltzItemNo = pltzItemNo;
    }

    /**
     * pkgCd のゲッターメソッドです。
     * 
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * pkgCd のセッターメソッドです。
     * 
     * @param pkgCd pkgCd に設定する
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }

    /**
     * itemDescription のゲッターメソッドです。
     * 
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * itemDescription のセッターメソッドです。
     * 
     * @param itemDescription itemDescription に設定する
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * qty のゲッターメソッドです。
     * 
     * @return the qty
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * qty のセッターメソッドです。
     * 
     * @param qty qty に設定する
     */
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    /**
     * qtyUnit のゲッターメソッドです。
     * 
     * @return the qtyUnit
     */
    public String getQtyUnit() {
        return qtyUnit;
    }

    /**
     * qtyUnit のセッターメソッドです。
     * 
     * @param qtyUnit qtyUnit に設定する
     */
    public void setQtyUnit(String qtyUnit) {
        this.qtyUnit = qtyUnit;
    }

    /**
     * tagQty のゲッターメソッドです。
     * 
     * @return the tagQty
     */
    public BigDecimal getTagQty() {
        return tagQty;
    }

    /**
     * tagQty のセッターメソッドです。
     * 
     * @param tagQty tagQty に設定する
     */
    public void setTagQty(BigDecimal tagQty) {
        this.tagQty = tagQty;
    }

    /**
     * itemTyp のゲッターメソッドです。
     * 
     * @return the itemTyp
     */
    public String getItemTyp() {
        return itemTyp;
    }

    /**
     * itemTyp のセッターメソッドです。
     * 
     * @param itemTyp itemTyp に設定する
     */
    public void setItemTyp(String itemTyp) {
        this.itemTyp = itemTyp;
    }

    /**
     * netWeight のゲッターメソッドです。
     * 
     * @return the netWeight
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * netWeight のセッターメソッドです。
     * 
     * @param netWeight netWeight に設定する
     */
    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * itemWeight のゲッターメソッドです。
     * 
     * @return the itemWeight
     */
    public BigDecimal getItemWeight() {
        return itemWeight;
    }

    /**
     * itemWeight のセッターメソッドです。
     * 
     * @param itemWeight itemWeight に設定する
     */
    public void setItemWeight(BigDecimal itemWeight) {
        this.itemWeight = itemWeight;
    }

    /**
     * weightUnit のゲッターメソッドです。
     * 
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * weightUnit のセッターメソッドです。
     * 
     * @param weightUnit weightUnit に設定する
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * shippingLot のゲッターメソッドです。
     * 
     * @return the shippingLot
     */
    public BigDecimal getShippingLot() {
        return shippingLot;
    }

    /**
     * shippingLot のセッターメソッドです。
     * 
     * @param shippingLot shippingLot に設定する
     */
    public void setShippingLot(BigDecimal shippingLot) {
        this.shippingLot = shippingLot;
    }

    /**
     * pkgTyp のゲッターメソッドです。
     * 
     * @return the pkgTyp
     */
    public String getPkgTyp() {
        return pkgTyp;
    }

    /**
     * pkgTyp のセッターメソッドです。
     * 
     * @param pkgTyp pkgTyp に設定する
     */
    public void setPkgTyp(String pkgTyp) {
        this.pkgTyp = pkgTyp;
    }

    /**
     * modelCd のゲッターメソッドです。
     * 
     * @return the modelCd
     */
    public String getModelCd() {
        return modelCd;
    }

    /**
     * modelCd のセッターメソッドです。
     * 
     * @param modelCd modelCd に設定する
     */
    public void setModelCd(String modelCd) {
        this.modelCd = modelCd;
    }

    /**
     * expLimitTyp のゲッターメソッドです。
     * 
     * @return the expLimitTyp
     */
    public String getExpLimitTyp() {
        return expLimitTyp;
    }

    /**
     * expLimitTyp のセッターメソッドです。
     * 
     * @param expLimitTyp expLimitTyp に設定する
     */
    public void setExpLimitTyp(String expLimitTyp) {
        this.expLimitTyp = expLimitTyp;
    }

    /**
     * dngrItemFlg のゲッターメソッドです。
     * 
     * @return the dngrItemFlg
     */
    public String getDngrItemFlg() {
        return dngrItemFlg;
    }

    /**
     * dngrItemFlg のセッターメソッドです。
     * 
     * @param dngrItemFlg dngrItemFlg に設定する
     */
    public void setDngrItemFlg(String dngrItemFlg) {
        this.dngrItemFlg = dngrItemFlg;
    }

    /**
     * originCntryCd のゲッターメソッドです。
     * 
     * @return the originCntryCd
     */
    public String getOriginCntryCd() {
        return originCntryCd;
    }

    /**
     * originCntryCd のセッターメソッドです。
     * 
     * @param originCntryCd originCntryCd に設定する
     */
    public void setOriginCntryCd(String originCntryCd) {
        this.originCntryCd = originCntryCd;
    }

    /**
     * currCd のゲッターメソッドです。
     * 
     * @return the currCd
     */
    public String getCurrCd() {
        return currCd;
    }

    /**
     * currCd のセッターメソッドです。
     * 
     * @param currCd currCd に設定する
     */
    public void setCurrCd(String currCd) {
        this.currCd = currCd;
    }

    /**
     * plntCd のゲッターメソッドです。
     * 
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * plntCd のセッターメソッドです。
     * 
     * @param plntCd plntCd に設定する
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * rtFlg のゲッターメソッドです。
     * 
     * @return the rtFlg
     */
    public String getRtFlg() {
        return rtFlg;
    }

    /**
     * rtFlg のセッターメソッドです。
     * 
     * @param rtFlg rtFlg に設定する
     */
    public void setRtFlg(String rtFlg) {
        this.rtFlg = rtFlg;
    }

    /**
     * kitFlg のゲッターメソッドです。
     * 
     * @return the kitFlg
     */
    public String getKitFlg() {
        return kitFlg;
    }

    /**
     * kitFlg のセッターメソッドです。
     * 
     * @param kitFlg kitFlg に設定する
     */
    public void setKitFlg(String kitFlg) {
        this.kitFlg = kitFlg;
    }

    /**
     * expRequestNo のゲッターメソッドです。
     * 
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * expRequestNo のセッターメソッドです。
     * 
     * @param expRequestNo expRequestNo に設定する
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /**
     * lineNo のゲッターメソッドです。
     * 
     * @return the lineNo
     */
    public BigDecimal getLineNo() {
        return lineNo;
    }

    /**
     * lineNo のセッターメソッドです。
     * 
     * @param lineNo lineNo に設定する
     */
    public void setLineNo(BigDecimal lineNo) {
        this.lineNo = lineNo;
    }

    /**
     * kitBrch のゲッターメソッドです。
     * 
     * @return the kitBrch
     */
    public BigDecimal getKitBrch() {
        return kitBrch;
    }

    /**
     * kitBrch のセッターメソッドです。
     * 
     * @param kitBrch kitBrch に設定する
     */
    public void setKitBrch(BigDecimal kitBrch) {
        this.kitBrch = kitBrch;
    }

    /**
     * mixTagNo のゲッターメソッドです。
     * 
     * @return the mixTagNo
     */
    public String getMixTagNo() {
        return mixTagNo;
    }

    /**
     * mixTagNo のセッターメソッドです。
     * 
     * @param mixTagNo mixTagNo に設定する
     */
    public void setMixTagNo(String mixTagNo) {
        this.mixTagNo = mixTagNo;
    }

    /**
     * pltzInstrNo のゲッターメソッドです。
     * 
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * pltzInstrNo のセッターメソッドです。
     * 
     * @param pltzInstrNo pltzInstrNo に設定する
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
    }

    /**
     * parFlg のゲッターメソッドです。
     * 
     * @return the parFlg
     */
    public String getParFlg() {
        return parFlg;
    }

    /**
     * parFlg のセッターメソッドです。
     * 
     * @param parFlg parFlg に設定する
     */
    public void setParFlg(String parFlg) {
        this.parFlg = parFlg;
    }

    /**
     * kitParItemNo のゲッターメソッドです。
     * 
     * @return the kitParItemNo
     */
    public String getKitParItemNo() {
        return kitParItemNo;
    }

    /**
     * kitParItemNo のセッターメソッドです。
     * 
     * @param kitParItemNo kitParItemNo に設定する
     */
    public void setKitParItemNo(String kitParItemNo) {
        this.kitParItemNo = kitParItemNo;
    }

    /**
     * customerPoNo のゲッターメソッドです。
     * 
     * @return the customerPoNo
     */
    public String getCustomerPoNo() {
        return customerPoNo;
    }

    /**
     * customerPoNo のセッターメソッドです。
     * 
     * @param customerPoNo customerPoNo に設定する
     */
    public void setCustomerPoNo(String customerPoNo) {
        this.customerPoNo = customerPoNo;
    }

    /**
     * customerItemNo のゲッターメソッドです。
     * 
     * @return the customerItemNo
     */
    public String getCustomerItemNo() {
        return customerItemNo;
    }

    /**
     * customerItemNo のセッターメソッドです。
     * 
     * @param customerItemNo customerItemNo に設定する
     */
    public void setCustomerItemNo(String customerItemNo) {
        this.customerItemNo = customerItemNo;
    }

    /**
     * unitPrice のゲッターメソッドです。
     * 
     * @return the unitPrice
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * unitPrice のセッターメソッドです。
     * 
     * @param unitPrice unitPrice に設定する
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * hsCd のゲッターメソッドです。
     * 
     * @return the hsCd
     */
    public String getHsCd() {
        return hsCd;
    }

    /**
     * hsCd のセッターメソッドです。
     * 
     * @param hsCd hsCd に設定する
     */
    public void setHsCd(String hsCd) {
        this.hsCd = hsCd;
    }

    /**
     * inputMethTyp のゲッターメソッドです。
     * 
     * @return the inputMethTyp
     */
    public String getInputMethTyp() {
        return inputMethTyp;
    }

    /**
     * inputMethTyp のセッターメソッドです。
     * 
     * @param inputMethTyp inputMethTyp に設定する
     */
    public void setInputMethTyp(String inputMethTyp) {
        this.inputMethTyp = inputMethTyp;
    }

    /**
     * comUpdateFuncId のゲッターメソッドです。
     * 
     * @return the comUpdateFuncId
     */
    public String getComUpdateFuncId() {
        return comUpdateFuncId;
    }

    /**
     * comUpdateFuncId のセッターメソッドです。
     * 
     * @param comUpdateFuncId comUpdateFuncId に設定する
     */
    public void setComUpdateFuncId(String comUpdateFuncId) {
        this.comUpdateFuncId = comUpdateFuncId;
    }

    /**
     * comUpdateUserId のゲッターメソッドです。
     * 
     * @return the comUpdateUserId
     */
    public String getComUpdateUserId() {
        return comUpdateUserId;
    }

    /**
     * comUpdateUserId のセッターメソッドです。
     * 
     * @param comUpdateUserId comUpdateUserId に設定する
     */
    public void setComUpdateUserId(String comUpdateUserId) {
        this.comUpdateUserId = comUpdateUserId;
    }

    /**
     * comUpdateTimestamp のゲッターメソッドです。
     * 
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * comUpdateTimestamp のセッターメソッドです。
     * 
     * @param comUpdateTimestamp comUpdateTimestamp に設定する
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

    /**
     * comCreateFuncId のゲッターメソッドです。
     * 
     * @return the comCreateFuncId
     */
    public String getComCreateFuncId() {
        return comCreateFuncId;
    }

    /**
     * comCreateFuncId のセッターメソッドです。
     * 
     * @param comCreateFuncId comCreateFuncId に設定する
     */
    public void setComCreateFuncId(String comCreateFuncId) {
        this.comCreateFuncId = comCreateFuncId;
    }

    /**
     * comCreateUserId のゲッターメソッドです。
     * 
     * @return the comCreateUserId
     */
    public String getComCreateUserId() {
        return comCreateUserId;
    }

    /**
     * comCreateUserId のセッターメソッドです。
     * 
     * @param comCreateUserId comCreateUserId に設定する
     */
    public void setComCreateUserId(String comCreateUserId) {
        this.comCreateUserId = comCreateUserId;
    }

    /**
     * comCreateTimestamp のゲッターメソッドです。
     * 
     * @return the comCreateTimestamp
     */
    public Timestamp getComCreateTimestamp() {
        return comCreateTimestamp;
    }

    /**
     * comCreateTimestamp のセッターメソッドです。
     * 
     * @param comCreateTimestamp comCreateTimestamp に設定する
     */
    public void setComCreateTimestamp(Timestamp comCreateTimestamp) {
        this.comCreateTimestamp = comCreateTimestamp;
    }

    /**
     * mainMarkGreaterThan のゲッターメソッドです。
     * 
     * @return the mainMarkGreaterThan
     */
    public String getMainMarkGreaterThan() {
        return mainMarkGreaterThan;
    }

    /**
     * mainMarkGreaterThan のセッターメソッドです。
     * 
     * @param mainMarkGreaterThan mainMarkGreaterThan に設定する
     */
    public void setMainMarkGreaterThan(String mainMarkGreaterThan) {
        this.mainMarkGreaterThan = mainMarkGreaterThan;
    }

    /**
     * mainMarkGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the mainMarkGreaterThanEqual
     */
    public String getMainMarkGreaterThanEqual() {
        return mainMarkGreaterThanEqual;
    }

    /**
     * mainMarkGreaterThanEqual のセッターメソッドです。
     * 
     * @param mainMarkGreaterThanEqual mainMarkGreaterThanEqual に設定する
     */
    public void setMainMarkGreaterThanEqual(String mainMarkGreaterThanEqual) {
        this.mainMarkGreaterThanEqual = mainMarkGreaterThanEqual;
    }

    /**
     * mainMarkLessThan のゲッターメソッドです。
     * 
     * @return the mainMarkLessThan
     */
    public String getMainMarkLessThan() {
        return mainMarkLessThan;
    }

    /**
     * mainMarkLessThan のセッターメソッドです。
     * 
     * @param mainMarkLessThan mainMarkLessThan に設定する
     */
    public void setMainMarkLessThan(String mainMarkLessThan) {
        this.mainMarkLessThan = mainMarkLessThan;
    }

    /**
     * mainMarkLessThanEqual のゲッターメソッドです。
     * 
     * @return the mainMarkLessThanEqual
     */
    public String getMainMarkLessThanEqual() {
        return mainMarkLessThanEqual;
    }

    /**
     * mainMarkLessThanEqual のセッターメソッドです。
     * 
     * @param mainMarkLessThanEqual mainMarkLessThanEqual に設定する
     */
    public void setMainMarkLessThanEqual(String mainMarkLessThanEqual) {
        this.mainMarkLessThanEqual = mainMarkLessThanEqual;
    }

    /**
     * mainMarkLikeFront のゲッターメソッドです。
     * 
     * @return the mainMarkLikeFront
     */
    public String getMainMarkLikeFront() {
        return mainMarkLikeFront;
    }

    /**
     * mainMarkLikeFront のセッターメソッドです。
     * 
     * @param mainMarkLikeFront mainMarkLikeFront に設定する
     */
    public void setMainMarkLikeFront(String mainMarkLikeFront) {
        this.mainMarkLikeFront = mainMarkLikeFront;
    }

    /**
     * pltzItemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the pltzItemNoGreaterThan
     */
    public String getPltzItemNoGreaterThan() {
        return pltzItemNoGreaterThan;
    }

    /**
     * pltzItemNoGreaterThan のセッターメソッドです。
     * 
     * @param pltzItemNoGreaterThan pltzItemNoGreaterThan に設定する
     */
    public void setPltzItemNoGreaterThan(String pltzItemNoGreaterThan) {
        this.pltzItemNoGreaterThan = pltzItemNoGreaterThan;
    }

    /**
     * pltzItemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pltzItemNoGreaterThanEqual
     */
    public String getPltzItemNoGreaterThanEqual() {
        return pltzItemNoGreaterThanEqual;
    }

    /**
     * pltzItemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param pltzItemNoGreaterThanEqual pltzItemNoGreaterThanEqual に設定する
     */
    public void setPltzItemNoGreaterThanEqual(String pltzItemNoGreaterThanEqual) {
        this.pltzItemNoGreaterThanEqual = pltzItemNoGreaterThanEqual;
    }

    /**
     * pltzItemNoLessThan のゲッターメソッドです。
     * 
     * @return the pltzItemNoLessThan
     */
    public String getPltzItemNoLessThan() {
        return pltzItemNoLessThan;
    }

    /**
     * pltzItemNoLessThan のセッターメソッドです。
     * 
     * @param pltzItemNoLessThan pltzItemNoLessThan に設定する
     */
    public void setPltzItemNoLessThan(String pltzItemNoLessThan) {
        this.pltzItemNoLessThan = pltzItemNoLessThan;
    }

    /**
     * pltzItemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the pltzItemNoLessThanEqual
     */
    public String getPltzItemNoLessThanEqual() {
        return pltzItemNoLessThanEqual;
    }

    /**
     * pltzItemNoLessThanEqual のセッターメソッドです。
     * 
     * @param pltzItemNoLessThanEqual pltzItemNoLessThanEqual に設定する
     */
    public void setPltzItemNoLessThanEqual(String pltzItemNoLessThanEqual) {
        this.pltzItemNoLessThanEqual = pltzItemNoLessThanEqual;
    }

    /**
     * pltzItemNoLikeFront のゲッターメソッドです。
     * 
     * @return the pltzItemNoLikeFront
     */
    public String getPltzItemNoLikeFront() {
        return pltzItemNoLikeFront;
    }

    /**
     * pltzItemNoLikeFront のセッターメソッドです。
     * 
     * @param pltzItemNoLikeFront pltzItemNoLikeFront に設定する
     */
    public void setPltzItemNoLikeFront(String pltzItemNoLikeFront) {
        this.pltzItemNoLikeFront = pltzItemNoLikeFront;
    }

    /**
     * pkgCdGreaterThan のゲッターメソッドです。
     * 
     * @return the pkgCdGreaterThan
     */
    public String getPkgCdGreaterThan() {
        return pkgCdGreaterThan;
    }

    /**
     * pkgCdGreaterThan のセッターメソッドです。
     * 
     * @param pkgCdGreaterThan pkgCdGreaterThan に設定する
     */
    public void setPkgCdGreaterThan(String pkgCdGreaterThan) {
        this.pkgCdGreaterThan = pkgCdGreaterThan;
    }

    /**
     * pkgCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pkgCdGreaterThanEqual
     */
    public String getPkgCdGreaterThanEqual() {
        return pkgCdGreaterThanEqual;
    }

    /**
     * pkgCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param pkgCdGreaterThanEqual pkgCdGreaterThanEqual に設定する
     */
    public void setPkgCdGreaterThanEqual(String pkgCdGreaterThanEqual) {
        this.pkgCdGreaterThanEqual = pkgCdGreaterThanEqual;
    }

    /**
     * pkgCdLessThan のゲッターメソッドです。
     * 
     * @return the pkgCdLessThan
     */
    public String getPkgCdLessThan() {
        return pkgCdLessThan;
    }

    /**
     * pkgCdLessThan のセッターメソッドです。
     * 
     * @param pkgCdLessThan pkgCdLessThan に設定する
     */
    public void setPkgCdLessThan(String pkgCdLessThan) {
        this.pkgCdLessThan = pkgCdLessThan;
    }

    /**
     * pkgCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the pkgCdLessThanEqual
     */
    public String getPkgCdLessThanEqual() {
        return pkgCdLessThanEqual;
    }

    /**
     * pkgCdLessThanEqual のセッターメソッドです。
     * 
     * @param pkgCdLessThanEqual pkgCdLessThanEqual に設定する
     */
    public void setPkgCdLessThanEqual(String pkgCdLessThanEqual) {
        this.pkgCdLessThanEqual = pkgCdLessThanEqual;
    }

    /**
     * pkgCdLikeFront のゲッターメソッドです。
     * 
     * @return the pkgCdLikeFront
     */
    public String getPkgCdLikeFront() {
        return pkgCdLikeFront;
    }

    /**
     * pkgCdLikeFront のセッターメソッドです。
     * 
     * @param pkgCdLikeFront pkgCdLikeFront に設定する
     */
    public void setPkgCdLikeFront(String pkgCdLikeFront) {
        this.pkgCdLikeFront = pkgCdLikeFront;
    }

    /**
     * itemDescriptionGreaterThan のゲッターメソッドです。
     * 
     * @return the itemDescriptionGreaterThan
     */
    public String getItemDescriptionGreaterThan() {
        return itemDescriptionGreaterThan;
    }

    /**
     * itemDescriptionGreaterThan のセッターメソッドです。
     * 
     * @param itemDescriptionGreaterThan itemDescriptionGreaterThan に設定する
     */
    public void setItemDescriptionGreaterThan(String itemDescriptionGreaterThan) {
        this.itemDescriptionGreaterThan = itemDescriptionGreaterThan;
    }

    /**
     * itemDescriptionGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the itemDescriptionGreaterThanEqual
     */
    public String getItemDescriptionGreaterThanEqual() {
        return itemDescriptionGreaterThanEqual;
    }

    /**
     * itemDescriptionGreaterThanEqual のセッターメソッドです。
     * 
     * @param itemDescriptionGreaterThanEqual itemDescriptionGreaterThanEqual に設定する
     */
    public void setItemDescriptionGreaterThanEqual(String itemDescriptionGreaterThanEqual) {
        this.itemDescriptionGreaterThanEqual = itemDescriptionGreaterThanEqual;
    }

    /**
     * itemDescriptionLessThan のゲッターメソッドです。
     * 
     * @return the itemDescriptionLessThan
     */
    public String getItemDescriptionLessThan() {
        return itemDescriptionLessThan;
    }

    /**
     * itemDescriptionLessThan のセッターメソッドです。
     * 
     * @param itemDescriptionLessThan itemDescriptionLessThan に設定する
     */
    public void setItemDescriptionLessThan(String itemDescriptionLessThan) {
        this.itemDescriptionLessThan = itemDescriptionLessThan;
    }

    /**
     * itemDescriptionLessThanEqual のゲッターメソッドです。
     * 
     * @return the itemDescriptionLessThanEqual
     */
    public String getItemDescriptionLessThanEqual() {
        return itemDescriptionLessThanEqual;
    }

    /**
     * itemDescriptionLessThanEqual のセッターメソッドです。
     * 
     * @param itemDescriptionLessThanEqual itemDescriptionLessThanEqual に設定する
     */
    public void setItemDescriptionLessThanEqual(String itemDescriptionLessThanEqual) {
        this.itemDescriptionLessThanEqual = itemDescriptionLessThanEqual;
    }

    /**
     * itemDescriptionLikeFront のゲッターメソッドです。
     * 
     * @return the itemDescriptionLikeFront
     */
    public String getItemDescriptionLikeFront() {
        return itemDescriptionLikeFront;
    }

    /**
     * itemDescriptionLikeFront のセッターメソッドです。
     * 
     * @param itemDescriptionLikeFront itemDescriptionLikeFront に設定する
     */
    public void setItemDescriptionLikeFront(String itemDescriptionLikeFront) {
        this.itemDescriptionLikeFront = itemDescriptionLikeFront;
    }

    /**
     * qtyUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the qtyUnitGreaterThan
     */
    public String getQtyUnitGreaterThan() {
        return qtyUnitGreaterThan;
    }

    /**
     * qtyUnitGreaterThan のセッターメソッドです。
     * 
     * @param qtyUnitGreaterThan qtyUnitGreaterThan に設定する
     */
    public void setQtyUnitGreaterThan(String qtyUnitGreaterThan) {
        this.qtyUnitGreaterThan = qtyUnitGreaterThan;
    }

    /**
     * qtyUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the qtyUnitGreaterThanEqual
     */
    public String getQtyUnitGreaterThanEqual() {
        return qtyUnitGreaterThanEqual;
    }

    /**
     * qtyUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param qtyUnitGreaterThanEqual qtyUnitGreaterThanEqual に設定する
     */
    public void setQtyUnitGreaterThanEqual(String qtyUnitGreaterThanEqual) {
        this.qtyUnitGreaterThanEqual = qtyUnitGreaterThanEqual;
    }

    /**
     * qtyUnitLessThan のゲッターメソッドです。
     * 
     * @return the qtyUnitLessThan
     */
    public String getQtyUnitLessThan() {
        return qtyUnitLessThan;
    }

    /**
     * qtyUnitLessThan のセッターメソッドです。
     * 
     * @param qtyUnitLessThan qtyUnitLessThan に設定する
     */
    public void setQtyUnitLessThan(String qtyUnitLessThan) {
        this.qtyUnitLessThan = qtyUnitLessThan;
    }

    /**
     * qtyUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the qtyUnitLessThanEqual
     */
    public String getQtyUnitLessThanEqual() {
        return qtyUnitLessThanEqual;
    }

    /**
     * qtyUnitLessThanEqual のセッターメソッドです。
     * 
     * @param qtyUnitLessThanEqual qtyUnitLessThanEqual に設定する
     */
    public void setQtyUnitLessThanEqual(String qtyUnitLessThanEqual) {
        this.qtyUnitLessThanEqual = qtyUnitLessThanEqual;
    }

    /**
     * qtyUnitLikeFront のゲッターメソッドです。
     * 
     * @return the qtyUnitLikeFront
     */
    public String getQtyUnitLikeFront() {
        return qtyUnitLikeFront;
    }

    /**
     * qtyUnitLikeFront のセッターメソッドです。
     * 
     * @param qtyUnitLikeFront qtyUnitLikeFront に設定する
     */
    public void setQtyUnitLikeFront(String qtyUnitLikeFront) {
        this.qtyUnitLikeFront = qtyUnitLikeFront;
    }

    /**
     * itemTypGreaterThan のゲッターメソッドです。
     * 
     * @return the itemTypGreaterThan
     */
    public String getItemTypGreaterThan() {
        return itemTypGreaterThan;
    }

    /**
     * itemTypGreaterThan のセッターメソッドです。
     * 
     * @param itemTypGreaterThan itemTypGreaterThan に設定する
     */
    public void setItemTypGreaterThan(String itemTypGreaterThan) {
        this.itemTypGreaterThan = itemTypGreaterThan;
    }

    /**
     * itemTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the itemTypGreaterThanEqual
     */
    public String getItemTypGreaterThanEqual() {
        return itemTypGreaterThanEqual;
    }

    /**
     * itemTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param itemTypGreaterThanEqual itemTypGreaterThanEqual に設定する
     */
    public void setItemTypGreaterThanEqual(String itemTypGreaterThanEqual) {
        this.itemTypGreaterThanEqual = itemTypGreaterThanEqual;
    }

    /**
     * itemTypLessThan のゲッターメソッドです。
     * 
     * @return the itemTypLessThan
     */
    public String getItemTypLessThan() {
        return itemTypLessThan;
    }

    /**
     * itemTypLessThan のセッターメソッドです。
     * 
     * @param itemTypLessThan itemTypLessThan に設定する
     */
    public void setItemTypLessThan(String itemTypLessThan) {
        this.itemTypLessThan = itemTypLessThan;
    }

    /**
     * itemTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the itemTypLessThanEqual
     */
    public String getItemTypLessThanEqual() {
        return itemTypLessThanEqual;
    }

    /**
     * itemTypLessThanEqual のセッターメソッドです。
     * 
     * @param itemTypLessThanEqual itemTypLessThanEqual に設定する
     */
    public void setItemTypLessThanEqual(String itemTypLessThanEqual) {
        this.itemTypLessThanEqual = itemTypLessThanEqual;
    }

    /**
     * <p>Getter method for expRequestItemId.</p>
     *
     * @return the expRequestItemId
     */
    public BigDecimal getExpRequestItemId() {
        return expRequestItemId;
    }

    /**
     * <p>Setter method for expRequestItemId.</p>
     *
     * @param expRequestItemId Set for expRequestItemId
     */
    public void setExpRequestItemId(BigDecimal expRequestItemId) {
        this.expRequestItemId = expRequestItemId;
    }

    /**
     * <p>Getter method for expRequestKitId.</p>
     *
     * @return the expRequestKitId
     */
    public BigDecimal getExpRequestKitId() {
        return expRequestKitId;
    }

    /**
     * <p>Setter method for expRequestKitId.</p>
     *
     * @param expRequestKitId Set for expRequestKitId
     */
    public void setExpRequestKitId(BigDecimal expRequestKitId) {
        this.expRequestKitId = expRequestKitId;
    }

    /**
     * itemTypLikeFront のゲッターメソッドです。
     * 
     * @return the itemTypLikeFront
     */
    public String getItemTypLikeFront() {
        return itemTypLikeFront;
    }

    /**
     * itemTypLikeFront のセッターメソッドです。
     * 
     * @param itemTypLikeFront itemTypLikeFront に設定する
     */
    public void setItemTypLikeFront(String itemTypLikeFront) {
        this.itemTypLikeFront = itemTypLikeFront;
    }

    /**
     * weightUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the weightUnitGreaterThan
     */
    public String getWeightUnitGreaterThan() {
        return weightUnitGreaterThan;
    }

    /**
     * weightUnitGreaterThan のセッターメソッドです。
     * 
     * @param weightUnitGreaterThan weightUnitGreaterThan に設定する
     */
    public void setWeightUnitGreaterThan(String weightUnitGreaterThan) {
        this.weightUnitGreaterThan = weightUnitGreaterThan;
    }

    /**
     * weightUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the weightUnitGreaterThanEqual
     */
    public String getWeightUnitGreaterThanEqual() {
        return weightUnitGreaterThanEqual;
    }

    /**
     * weightUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param weightUnitGreaterThanEqual weightUnitGreaterThanEqual に設定する
     */
    public void setWeightUnitGreaterThanEqual(String weightUnitGreaterThanEqual) {
        this.weightUnitGreaterThanEqual = weightUnitGreaterThanEqual;
    }

    /**
     * weightUnitLessThan のゲッターメソッドです。
     * 
     * @return the weightUnitLessThan
     */
    public String getWeightUnitLessThan() {
        return weightUnitLessThan;
    }

    /**
     * weightUnitLessThan のセッターメソッドです。
     * 
     * @param weightUnitLessThan weightUnitLessThan に設定する
     */
    public void setWeightUnitLessThan(String weightUnitLessThan) {
        this.weightUnitLessThan = weightUnitLessThan;
    }

    /**
     * weightUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the weightUnitLessThanEqual
     */
    public String getWeightUnitLessThanEqual() {
        return weightUnitLessThanEqual;
    }

    /**
     * weightUnitLessThanEqual のセッターメソッドです。
     * 
     * @param weightUnitLessThanEqual weightUnitLessThanEqual に設定する
     */
    public void setWeightUnitLessThanEqual(String weightUnitLessThanEqual) {
        this.weightUnitLessThanEqual = weightUnitLessThanEqual;
    }

    /**
     * weightUnitLikeFront のゲッターメソッドです。
     * 
     * @return the weightUnitLikeFront
     */
    public String getWeightUnitLikeFront() {
        return weightUnitLikeFront;
    }

    /**
     * weightUnitLikeFront のセッターメソッドです。
     * 
     * @param weightUnitLikeFront weightUnitLikeFront に設定する
     */
    public void setWeightUnitLikeFront(String weightUnitLikeFront) {
        this.weightUnitLikeFront = weightUnitLikeFront;
    }

    /**
     * pkgTypGreaterThan のゲッターメソッドです。
     * 
     * @return the pkgTypGreaterThan
     */
    public String getPkgTypGreaterThan() {
        return pkgTypGreaterThan;
    }

    /**
     * pkgTypGreaterThan のセッターメソッドです。
     * 
     * @param pkgTypGreaterThan pkgTypGreaterThan に設定する
     */
    public void setPkgTypGreaterThan(String pkgTypGreaterThan) {
        this.pkgTypGreaterThan = pkgTypGreaterThan;
    }

    /**
     * pkgTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pkgTypGreaterThanEqual
     */
    public String getPkgTypGreaterThanEqual() {
        return pkgTypGreaterThanEqual;
    }

    /**
     * pkgTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param pkgTypGreaterThanEqual pkgTypGreaterThanEqual に設定する
     */
    public void setPkgTypGreaterThanEqual(String pkgTypGreaterThanEqual) {
        this.pkgTypGreaterThanEqual = pkgTypGreaterThanEqual;
    }

    /**
     * pkgTypLessThan のゲッターメソッドです。
     * 
     * @return the pkgTypLessThan
     */
    public String getPkgTypLessThan() {
        return pkgTypLessThan;
    }

    /**
     * pkgTypLessThan のセッターメソッドです。
     * 
     * @param pkgTypLessThan pkgTypLessThan に設定する
     */
    public void setPkgTypLessThan(String pkgTypLessThan) {
        this.pkgTypLessThan = pkgTypLessThan;
    }

    /**
     * pkgTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the pkgTypLessThanEqual
     */
    public String getPkgTypLessThanEqual() {
        return pkgTypLessThanEqual;
    }

    /**
     * pkgTypLessThanEqual のセッターメソッドです。
     * 
     * @param pkgTypLessThanEqual pkgTypLessThanEqual に設定する
     */
    public void setPkgTypLessThanEqual(String pkgTypLessThanEqual) {
        this.pkgTypLessThanEqual = pkgTypLessThanEqual;
    }

    /**
     * pkgTypLikeFront のゲッターメソッドです。
     * 
     * @return the pkgTypLikeFront
     */
    public String getPkgTypLikeFront() {
        return pkgTypLikeFront;
    }

    /**
     * pkgTypLikeFront のセッターメソッドです。
     * 
     * @param pkgTypLikeFront pkgTypLikeFront に設定する
     */
    public void setPkgTypLikeFront(String pkgTypLikeFront) {
        this.pkgTypLikeFront = pkgTypLikeFront;
    }

    /**
     * modelCdGreaterThan のゲッターメソッドです。
     * 
     * @return the modelCdGreaterThan
     */
    public String getModelCdGreaterThan() {
        return modelCdGreaterThan;
    }

    /**
     * modelCdGreaterThan のセッターメソッドです。
     * 
     * @param modelCdGreaterThan modelCdGreaterThan に設定する
     */
    public void setModelCdGreaterThan(String modelCdGreaterThan) {
        this.modelCdGreaterThan = modelCdGreaterThan;
    }

    /**
     * modelCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the modelCdGreaterThanEqual
     */
    public String getModelCdGreaterThanEqual() {
        return modelCdGreaterThanEqual;
    }

    /**
     * modelCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param modelCdGreaterThanEqual modelCdGreaterThanEqual に設定する
     */
    public void setModelCdGreaterThanEqual(String modelCdGreaterThanEqual) {
        this.modelCdGreaterThanEqual = modelCdGreaterThanEqual;
    }

    /**
     * modelCdLessThan のゲッターメソッドです。
     * 
     * @return the modelCdLessThan
     */
    public String getModelCdLessThan() {
        return modelCdLessThan;
    }

    /**
     * modelCdLessThan のセッターメソッドです。
     * 
     * @param modelCdLessThan modelCdLessThan に設定する
     */
    public void setModelCdLessThan(String modelCdLessThan) {
        this.modelCdLessThan = modelCdLessThan;
    }

    /**
     * modelCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the modelCdLessThanEqual
     */
    public String getModelCdLessThanEqual() {
        return modelCdLessThanEqual;
    }

    /**
     * modelCdLessThanEqual のセッターメソッドです。
     * 
     * @param modelCdLessThanEqual modelCdLessThanEqual に設定する
     */
    public void setModelCdLessThanEqual(String modelCdLessThanEqual) {
        this.modelCdLessThanEqual = modelCdLessThanEqual;
    }

    /**
     * modelCdLikeFront のゲッターメソッドです。
     * 
     * @return the modelCdLikeFront
     */
    public String getModelCdLikeFront() {
        return modelCdLikeFront;
    }

    /**
     * modelCdLikeFront のセッターメソッドです。
     * 
     * @param modelCdLikeFront modelCdLikeFront に設定する
     */
    public void setModelCdLikeFront(String modelCdLikeFront) {
        this.modelCdLikeFront = modelCdLikeFront;
    }

    /**
     * expLimitTypGreaterThan のゲッターメソッドです。
     * 
     * @return the expLimitTypGreaterThan
     */
    public String getExpLimitTypGreaterThan() {
        return expLimitTypGreaterThan;
    }

    /**
     * expLimitTypGreaterThan のセッターメソッドです。
     * 
     * @param expLimitTypGreaterThan expLimitTypGreaterThan に設定する
     */
    public void setExpLimitTypGreaterThan(String expLimitTypGreaterThan) {
        this.expLimitTypGreaterThan = expLimitTypGreaterThan;
    }

    /**
     * expLimitTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the expLimitTypGreaterThanEqual
     */
    public String getExpLimitTypGreaterThanEqual() {
        return expLimitTypGreaterThanEqual;
    }

    /**
     * expLimitTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param expLimitTypGreaterThanEqual expLimitTypGreaterThanEqual に設定する
     */
    public void setExpLimitTypGreaterThanEqual(String expLimitTypGreaterThanEqual) {
        this.expLimitTypGreaterThanEqual = expLimitTypGreaterThanEqual;
    }

    /**
     * expLimitTypLessThan のゲッターメソッドです。
     * 
     * @return the expLimitTypLessThan
     */
    public String getExpLimitTypLessThan() {
        return expLimitTypLessThan;
    }

    /**
     * expLimitTypLessThan のセッターメソッドです。
     * 
     * @param expLimitTypLessThan expLimitTypLessThan に設定する
     */
    public void setExpLimitTypLessThan(String expLimitTypLessThan) {
        this.expLimitTypLessThan = expLimitTypLessThan;
    }

    /**
     * expLimitTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the expLimitTypLessThanEqual
     */
    public String getExpLimitTypLessThanEqual() {
        return expLimitTypLessThanEqual;
    }

    /**
     * expLimitTypLessThanEqual のセッターメソッドです。
     * 
     * @param expLimitTypLessThanEqual expLimitTypLessThanEqual に設定する
     */
    public void setExpLimitTypLessThanEqual(String expLimitTypLessThanEqual) {
        this.expLimitTypLessThanEqual = expLimitTypLessThanEqual;
    }

    /**
     * expLimitTypLikeFront のゲッターメソッドです。
     * 
     * @return the expLimitTypLikeFront
     */
    public String getExpLimitTypLikeFront() {
        return expLimitTypLikeFront;
    }

    /**
     * expLimitTypLikeFront のセッターメソッドです。
     * 
     * @param expLimitTypLikeFront expLimitTypLikeFront に設定する
     */
    public void setExpLimitTypLikeFront(String expLimitTypLikeFront) {
        this.expLimitTypLikeFront = expLimitTypLikeFront;
    }

    /**
     * dngrItemFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the dngrItemFlgGreaterThan
     */
    public String getDngrItemFlgGreaterThan() {
        return dngrItemFlgGreaterThan;
    }

    /**
     * dngrItemFlgGreaterThan のセッターメソッドです。
     * 
     * @param dngrItemFlgGreaterThan dngrItemFlgGreaterThan に設定する
     */
    public void setDngrItemFlgGreaterThan(String dngrItemFlgGreaterThan) {
        this.dngrItemFlgGreaterThan = dngrItemFlgGreaterThan;
    }

    /**
     * dngrItemFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dngrItemFlgGreaterThanEqual
     */
    public String getDngrItemFlgGreaterThanEqual() {
        return dngrItemFlgGreaterThanEqual;
    }

    /**
     * dngrItemFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param dngrItemFlgGreaterThanEqual dngrItemFlgGreaterThanEqual に設定する
     */
    public void setDngrItemFlgGreaterThanEqual(String dngrItemFlgGreaterThanEqual) {
        this.dngrItemFlgGreaterThanEqual = dngrItemFlgGreaterThanEqual;
    }

    /**
     * dngrItemFlgLessThan のゲッターメソッドです。
     * 
     * @return the dngrItemFlgLessThan
     */
    public String getDngrItemFlgLessThan() {
        return dngrItemFlgLessThan;
    }

    /**
     * dngrItemFlgLessThan のセッターメソッドです。
     * 
     * @param dngrItemFlgLessThan dngrItemFlgLessThan に設定する
     */
    public void setDngrItemFlgLessThan(String dngrItemFlgLessThan) {
        this.dngrItemFlgLessThan = dngrItemFlgLessThan;
    }

    /**
     * dngrItemFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the dngrItemFlgLessThanEqual
     */
    public String getDngrItemFlgLessThanEqual() {
        return dngrItemFlgLessThanEqual;
    }

    /**
     * dngrItemFlgLessThanEqual のセッターメソッドです。
     * 
     * @param dngrItemFlgLessThanEqual dngrItemFlgLessThanEqual に設定する
     */
    public void setDngrItemFlgLessThanEqual(String dngrItemFlgLessThanEqual) {
        this.dngrItemFlgLessThanEqual = dngrItemFlgLessThanEqual;
    }

    /**
     * dngrItemFlgLikeFront のゲッターメソッドです。
     * 
     * @return the dngrItemFlgLikeFront
     */
    public String getDngrItemFlgLikeFront() {
        return dngrItemFlgLikeFront;
    }

    /**
     * dngrItemFlgLikeFront のセッターメソッドです。
     * 
     * @param dngrItemFlgLikeFront dngrItemFlgLikeFront に設定する
     */
    public void setDngrItemFlgLikeFront(String dngrItemFlgLikeFront) {
        this.dngrItemFlgLikeFront = dngrItemFlgLikeFront;
    }

    /**
     * originCntryCdGreaterThan のゲッターメソッドです。
     * 
     * @return the originCntryCdGreaterThan
     */
    public String getOriginCntryCdGreaterThan() {
        return originCntryCdGreaterThan;
    }

    /**
     * originCntryCdGreaterThan のセッターメソッドです。
     * 
     * @param originCntryCdGreaterThan originCntryCdGreaterThan に設定する
     */
    public void setOriginCntryCdGreaterThan(String originCntryCdGreaterThan) {
        this.originCntryCdGreaterThan = originCntryCdGreaterThan;
    }

    /**
     * originCntryCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the originCntryCdGreaterThanEqual
     */
    public String getOriginCntryCdGreaterThanEqual() {
        return originCntryCdGreaterThanEqual;
    }

    /**
     * originCntryCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param originCntryCdGreaterThanEqual originCntryCdGreaterThanEqual に設定する
     */
    public void setOriginCntryCdGreaterThanEqual(String originCntryCdGreaterThanEqual) {
        this.originCntryCdGreaterThanEqual = originCntryCdGreaterThanEqual;
    }

    /**
     * originCntryCdLessThan のゲッターメソッドです。
     * 
     * @return the originCntryCdLessThan
     */
    public String getOriginCntryCdLessThan() {
        return originCntryCdLessThan;
    }

    /**
     * originCntryCdLessThan のセッターメソッドです。
     * 
     * @param originCntryCdLessThan originCntryCdLessThan に設定する
     */
    public void setOriginCntryCdLessThan(String originCntryCdLessThan) {
        this.originCntryCdLessThan = originCntryCdLessThan;
    }

    /**
     * originCntryCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the originCntryCdLessThanEqual
     */
    public String getOriginCntryCdLessThanEqual() {
        return originCntryCdLessThanEqual;
    }

    /**
     * originCntryCdLessThanEqual のセッターメソッドです。
     * 
     * @param originCntryCdLessThanEqual originCntryCdLessThanEqual に設定する
     */
    public void setOriginCntryCdLessThanEqual(String originCntryCdLessThanEqual) {
        this.originCntryCdLessThanEqual = originCntryCdLessThanEqual;
    }

    /**
     * originCntryCdLikeFront のゲッターメソッドです。
     * 
     * @return the originCntryCdLikeFront
     */
    public String getOriginCntryCdLikeFront() {
        return originCntryCdLikeFront;
    }

    /**
     * originCntryCdLikeFront のセッターメソッドです。
     * 
     * @param originCntryCdLikeFront originCntryCdLikeFront に設定する
     */
    public void setOriginCntryCdLikeFront(String originCntryCdLikeFront) {
        this.originCntryCdLikeFront = originCntryCdLikeFront;
    }

    /**
     * currCdGreaterThan のゲッターメソッドです。
     * 
     * @return the currCdGreaterThan
     */
    public String getCurrCdGreaterThan() {
        return currCdGreaterThan;
    }

    /**
     * currCdGreaterThan のセッターメソッドです。
     * 
     * @param currCdGreaterThan currCdGreaterThan に設定する
     */
    public void setCurrCdGreaterThan(String currCdGreaterThan) {
        this.currCdGreaterThan = currCdGreaterThan;
    }

    /**
     * currCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the currCdGreaterThanEqual
     */
    public String getCurrCdGreaterThanEqual() {
        return currCdGreaterThanEqual;
    }

    /**
     * currCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param currCdGreaterThanEqual currCdGreaterThanEqual に設定する
     */
    public void setCurrCdGreaterThanEqual(String currCdGreaterThanEqual) {
        this.currCdGreaterThanEqual = currCdGreaterThanEqual;
    }

    /**
     * currCdLessThan のゲッターメソッドです。
     * 
     * @return the currCdLessThan
     */
    public String getCurrCdLessThan() {
        return currCdLessThan;
    }

    /**
     * currCdLessThan のセッターメソッドです。
     * 
     * @param currCdLessThan currCdLessThan に設定する
     */
    public void setCurrCdLessThan(String currCdLessThan) {
        this.currCdLessThan = currCdLessThan;
    }

    /**
     * currCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the currCdLessThanEqual
     */
    public String getCurrCdLessThanEqual() {
        return currCdLessThanEqual;
    }

    /**
     * currCdLessThanEqual のセッターメソッドです。
     * 
     * @param currCdLessThanEqual currCdLessThanEqual に設定する
     */
    public void setCurrCdLessThanEqual(String currCdLessThanEqual) {
        this.currCdLessThanEqual = currCdLessThanEqual;
    }

    /**
     * currCdLikeFront のゲッターメソッドです。
     * 
     * @return the currCdLikeFront
     */
    public String getCurrCdLikeFront() {
        return currCdLikeFront;
    }

    /**
     * currCdLikeFront のセッターメソッドです。
     * 
     * @param currCdLikeFront currCdLikeFront に設定する
     */
    public void setCurrCdLikeFront(String currCdLikeFront) {
        this.currCdLikeFront = currCdLikeFront;
    }

    /**
     * plntCdGreaterThan のゲッターメソッドです。
     * 
     * @return the plntCdGreaterThan
     */
    public String getPlntCdGreaterThan() {
        return plntCdGreaterThan;
    }

    /**
     * plntCdGreaterThan のセッターメソッドです。
     * 
     * @param plntCdGreaterThan plntCdGreaterThan に設定する
     */
    public void setPlntCdGreaterThan(String plntCdGreaterThan) {
        this.plntCdGreaterThan = plntCdGreaterThan;
    }

    /**
     * plntCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the plntCdGreaterThanEqual
     */
    public String getPlntCdGreaterThanEqual() {
        return plntCdGreaterThanEqual;
    }

    /**
     * plntCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param plntCdGreaterThanEqual plntCdGreaterThanEqual に設定する
     */
    public void setPlntCdGreaterThanEqual(String plntCdGreaterThanEqual) {
        this.plntCdGreaterThanEqual = plntCdGreaterThanEqual;
    }

    /**
     * plntCdLessThan のゲッターメソッドです。
     * 
     * @return the plntCdLessThan
     */
    public String getPlntCdLessThan() {
        return plntCdLessThan;
    }

    /**
     * plntCdLessThan のセッターメソッドです。
     * 
     * @param plntCdLessThan plntCdLessThan に設定する
     */
    public void setPlntCdLessThan(String plntCdLessThan) {
        this.plntCdLessThan = plntCdLessThan;
    }

    /**
     * plntCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the plntCdLessThanEqual
     */
    public String getPlntCdLessThanEqual() {
        return plntCdLessThanEqual;
    }

    /**
     * plntCdLessThanEqual のセッターメソッドです。
     * 
     * @param plntCdLessThanEqual plntCdLessThanEqual に設定する
     */
    public void setPlntCdLessThanEqual(String plntCdLessThanEqual) {
        this.plntCdLessThanEqual = plntCdLessThanEqual;
    }

    /**
     * plntCdLikeFront のゲッターメソッドです。
     * 
     * @return the plntCdLikeFront
     */
    public String getPlntCdLikeFront() {
        return plntCdLikeFront;
    }

    /**
     * plntCdLikeFront のセッターメソッドです。
     * 
     * @param plntCdLikeFront plntCdLikeFront に設定する
     */
    public void setPlntCdLikeFront(String plntCdLikeFront) {
        this.plntCdLikeFront = plntCdLikeFront;
    }

    /**
     * rtFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the rtFlgGreaterThan
     */
    public String getRtFlgGreaterThan() {
        return rtFlgGreaterThan;
    }

    /**
     * rtFlgGreaterThan のセッターメソッドです。
     * 
     * @param rtFlgGreaterThan rtFlgGreaterThan に設定する
     */
    public void setRtFlgGreaterThan(String rtFlgGreaterThan) {
        this.rtFlgGreaterThan = rtFlgGreaterThan;
    }

    /**
     * rtFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the rtFlgGreaterThanEqual
     */
    public String getRtFlgGreaterThanEqual() {
        return rtFlgGreaterThanEqual;
    }

    /**
     * rtFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param rtFlgGreaterThanEqual rtFlgGreaterThanEqual に設定する
     */
    public void setRtFlgGreaterThanEqual(String rtFlgGreaterThanEqual) {
        this.rtFlgGreaterThanEqual = rtFlgGreaterThanEqual;
    }

    /**
     * rtFlgLessThan のゲッターメソッドです。
     * 
     * @return the rtFlgLessThan
     */
    public String getRtFlgLessThan() {
        return rtFlgLessThan;
    }

    /**
     * rtFlgLessThan のセッターメソッドです。
     * 
     * @param rtFlgLessThan rtFlgLessThan に設定する
     */
    public void setRtFlgLessThan(String rtFlgLessThan) {
        this.rtFlgLessThan = rtFlgLessThan;
    }

    /**
     * rtFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the rtFlgLessThanEqual
     */
    public String getRtFlgLessThanEqual() {
        return rtFlgLessThanEqual;
    }

    /**
     * rtFlgLessThanEqual のセッターメソッドです。
     * 
     * @param rtFlgLessThanEqual rtFlgLessThanEqual に設定する
     */
    public void setRtFlgLessThanEqual(String rtFlgLessThanEqual) {
        this.rtFlgLessThanEqual = rtFlgLessThanEqual;
    }

    /**
     * rtFlgLikeFront のゲッターメソッドです。
     * 
     * @return the rtFlgLikeFront
     */
    public String getRtFlgLikeFront() {
        return rtFlgLikeFront;
    }

    /**
     * rtFlgLikeFront のセッターメソッドです。
     * 
     * @param rtFlgLikeFront rtFlgLikeFront に設定する
     */
    public void setRtFlgLikeFront(String rtFlgLikeFront) {
        this.rtFlgLikeFront = rtFlgLikeFront;
    }

    /**
     * kitFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the kitFlgGreaterThan
     */
    public String getKitFlgGreaterThan() {
        return kitFlgGreaterThan;
    }

    /**
     * kitFlgGreaterThan のセッターメソッドです。
     * 
     * @param kitFlgGreaterThan kitFlgGreaterThan に設定する
     */
    public void setKitFlgGreaterThan(String kitFlgGreaterThan) {
        this.kitFlgGreaterThan = kitFlgGreaterThan;
    }

    /**
     * kitFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the kitFlgGreaterThanEqual
     */
    public String getKitFlgGreaterThanEqual() {
        return kitFlgGreaterThanEqual;
    }

    /**
     * kitFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param kitFlgGreaterThanEqual kitFlgGreaterThanEqual に設定する
     */
    public void setKitFlgGreaterThanEqual(String kitFlgGreaterThanEqual) {
        this.kitFlgGreaterThanEqual = kitFlgGreaterThanEqual;
    }

    /**
     * kitFlgLessThan のゲッターメソッドです。
     * 
     * @return the kitFlgLessThan
     */
    public String getKitFlgLessThan() {
        return kitFlgLessThan;
    }

    /**
     * kitFlgLessThan のセッターメソッドです。
     * 
     * @param kitFlgLessThan kitFlgLessThan に設定する
     */
    public void setKitFlgLessThan(String kitFlgLessThan) {
        this.kitFlgLessThan = kitFlgLessThan;
    }

    /**
     * kitFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the kitFlgLessThanEqual
     */
    public String getKitFlgLessThanEqual() {
        return kitFlgLessThanEqual;
    }

    /**
     * kitFlgLessThanEqual のセッターメソッドです。
     * 
     * @param kitFlgLessThanEqual kitFlgLessThanEqual に設定する
     */
    public void setKitFlgLessThanEqual(String kitFlgLessThanEqual) {
        this.kitFlgLessThanEqual = kitFlgLessThanEqual;
    }

    /**
     * kitFlgLikeFront のゲッターメソッドです。
     * 
     * @return the kitFlgLikeFront
     */
    public String getKitFlgLikeFront() {
        return kitFlgLikeFront;
    }

    /**
     * kitFlgLikeFront のセッターメソッドです。
     * 
     * @param kitFlgLikeFront kitFlgLikeFront に設定する
     */
    public void setKitFlgLikeFront(String kitFlgLikeFront) {
        this.kitFlgLikeFront = kitFlgLikeFront;
    }

    /**
     * expRequestNoGreaterThan のゲッターメソッドです。
     * 
     * @return the expRequestNoGreaterThan
     */
    public String getExpRequestNoGreaterThan() {
        return expRequestNoGreaterThan;
    }

    /**
     * expRequestNoGreaterThan のセッターメソッドです。
     * 
     * @param expRequestNoGreaterThan expRequestNoGreaterThan に設定する
     */
    public void setExpRequestNoGreaterThan(String expRequestNoGreaterThan) {
        this.expRequestNoGreaterThan = expRequestNoGreaterThan;
    }

    /**
     * expRequestNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the expRequestNoGreaterThanEqual
     */
    public String getExpRequestNoGreaterThanEqual() {
        return expRequestNoGreaterThanEqual;
    }

    /**
     * expRequestNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param expRequestNoGreaterThanEqual expRequestNoGreaterThanEqual に設定する
     */
    public void setExpRequestNoGreaterThanEqual(String expRequestNoGreaterThanEqual) {
        this.expRequestNoGreaterThanEqual = expRequestNoGreaterThanEqual;
    }

    /**
     * expRequestNoLessThan のゲッターメソッドです。
     * 
     * @return the expRequestNoLessThan
     */
    public String getExpRequestNoLessThan() {
        return expRequestNoLessThan;
    }

    /**
     * expRequestNoLessThan のセッターメソッドです。
     * 
     * @param expRequestNoLessThan expRequestNoLessThan に設定する
     */
    public void setExpRequestNoLessThan(String expRequestNoLessThan) {
        this.expRequestNoLessThan = expRequestNoLessThan;
    }

    /**
     * expRequestNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the expRequestNoLessThanEqual
     */
    public String getExpRequestNoLessThanEqual() {
        return expRequestNoLessThanEqual;
    }

    /**
     * expRequestNoLessThanEqual のセッターメソッドです。
     * 
     * @param expRequestNoLessThanEqual expRequestNoLessThanEqual に設定する
     */
    public void setExpRequestNoLessThanEqual(String expRequestNoLessThanEqual) {
        this.expRequestNoLessThanEqual = expRequestNoLessThanEqual;
    }

    /**
     * expRequestNoLikeFront のゲッターメソッドです。
     * 
     * @return the expRequestNoLikeFront
     */
    public String getExpRequestNoLikeFront() {
        return expRequestNoLikeFront;
    }

    /**
     * expRequestNoLikeFront のセッターメソッドです。
     * 
     * @param expRequestNoLikeFront expRequestNoLikeFront に設定する
     */
    public void setExpRequestNoLikeFront(String expRequestNoLikeFront) {
        this.expRequestNoLikeFront = expRequestNoLikeFront;
    }

    /**
     * mixTagNoGreaterThan のゲッターメソッドです。
     * 
     * @return the mixTagNoGreaterThan
     */
    public String getMixTagNoGreaterThan() {
        return mixTagNoGreaterThan;
    }

    /**
     * mixTagNoGreaterThan のセッターメソッドです。
     * 
     * @param mixTagNoGreaterThan mixTagNoGreaterThan に設定する
     */
    public void setMixTagNoGreaterThan(String mixTagNoGreaterThan) {
        this.mixTagNoGreaterThan = mixTagNoGreaterThan;
    }

    /**
     * mixTagNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the mixTagNoGreaterThanEqual
     */
    public String getMixTagNoGreaterThanEqual() {
        return mixTagNoGreaterThanEqual;
    }

    /**
     * mixTagNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param mixTagNoGreaterThanEqual mixTagNoGreaterThanEqual に設定する
     */
    public void setMixTagNoGreaterThanEqual(String mixTagNoGreaterThanEqual) {
        this.mixTagNoGreaterThanEqual = mixTagNoGreaterThanEqual;
    }

    /**
     * mixTagNoLessThan のゲッターメソッドです。
     * 
     * @return the mixTagNoLessThan
     */
    public String getMixTagNoLessThan() {
        return mixTagNoLessThan;
    }

    /**
     * mixTagNoLessThan のセッターメソッドです。
     * 
     * @param mixTagNoLessThan mixTagNoLessThan に設定する
     */
    public void setMixTagNoLessThan(String mixTagNoLessThan) {
        this.mixTagNoLessThan = mixTagNoLessThan;
    }

    /**
     * mixTagNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the mixTagNoLessThanEqual
     */
    public String getMixTagNoLessThanEqual() {
        return mixTagNoLessThanEqual;
    }

    /**
     * mixTagNoLessThanEqual のセッターメソッドです。
     * 
     * @param mixTagNoLessThanEqual mixTagNoLessThanEqual に設定する
     */
    public void setMixTagNoLessThanEqual(String mixTagNoLessThanEqual) {
        this.mixTagNoLessThanEqual = mixTagNoLessThanEqual;
    }

    /**
     * mixTagNoLikeFront のゲッターメソッドです。
     * 
     * @return the mixTagNoLikeFront
     */
    public String getMixTagNoLikeFront() {
        return mixTagNoLikeFront;
    }

    /**
     * mixTagNoLikeFront のセッターメソッドです。
     * 
     * @param mixTagNoLikeFront mixTagNoLikeFront に設定する
     */
    public void setMixTagNoLikeFront(String mixTagNoLikeFront) {
        this.mixTagNoLikeFront = mixTagNoLikeFront;
    }

    /**
     * pltzInstrNoGreaterThan のゲッターメソッドです。
     * 
     * @return the pltzInstrNoGreaterThan
     */
    public String getPltzInstrNoGreaterThan() {
        return pltzInstrNoGreaterThan;
    }

    /**
     * pltzInstrNoGreaterThan のセッターメソッドです。
     * 
     * @param pltzInstrNoGreaterThan pltzInstrNoGreaterThan に設定する
     */
    public void setPltzInstrNoGreaterThan(String pltzInstrNoGreaterThan) {
        this.pltzInstrNoGreaterThan = pltzInstrNoGreaterThan;
    }

    /**
     * pltzInstrNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrNoGreaterThanEqual
     */
    public String getPltzInstrNoGreaterThanEqual() {
        return pltzInstrNoGreaterThanEqual;
    }

    /**
     * pltzInstrNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrNoGreaterThanEqual pltzInstrNoGreaterThanEqual に設定する
     */
    public void setPltzInstrNoGreaterThanEqual(String pltzInstrNoGreaterThanEqual) {
        this.pltzInstrNoGreaterThanEqual = pltzInstrNoGreaterThanEqual;
    }

    /**
     * pltzInstrNoLessThan のゲッターメソッドです。
     * 
     * @return the pltzInstrNoLessThan
     */
    public String getPltzInstrNoLessThan() {
        return pltzInstrNoLessThan;
    }

    /**
     * pltzInstrNoLessThan のセッターメソッドです。
     * 
     * @param pltzInstrNoLessThan pltzInstrNoLessThan に設定する
     */
    public void setPltzInstrNoLessThan(String pltzInstrNoLessThan) {
        this.pltzInstrNoLessThan = pltzInstrNoLessThan;
    }

    /**
     * pltzInstrNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrNoLessThanEqual
     */
    public String getPltzInstrNoLessThanEqual() {
        return pltzInstrNoLessThanEqual;
    }

    /**
     * pltzInstrNoLessThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrNoLessThanEqual pltzInstrNoLessThanEqual に設定する
     */
    public void setPltzInstrNoLessThanEqual(String pltzInstrNoLessThanEqual) {
        this.pltzInstrNoLessThanEqual = pltzInstrNoLessThanEqual;
    }

    /**
     * pltzInstrNoLikeFront のゲッターメソッドです。
     * 
     * @return the pltzInstrNoLikeFront
     */
    public String getPltzInstrNoLikeFront() {
        return pltzInstrNoLikeFront;
    }

    /**
     * pltzInstrNoLikeFront のセッターメソッドです。
     * 
     * @param pltzInstrNoLikeFront pltzInstrNoLikeFront に設定する
     */
    public void setPltzInstrNoLikeFront(String pltzInstrNoLikeFront) {
        this.pltzInstrNoLikeFront = pltzInstrNoLikeFront;
    }

    /**
     * parFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the parFlgGreaterThan
     */
    public String getParFlgGreaterThan() {
        return parFlgGreaterThan;
    }

    /**
     * parFlgGreaterThan のセッターメソッドです。
     * 
     * @param parFlgGreaterThan parFlgGreaterThan に設定する
     */
    public void setParFlgGreaterThan(String parFlgGreaterThan) {
        this.parFlgGreaterThan = parFlgGreaterThan;
    }

    /**
     * parFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the parFlgGreaterThanEqual
     */
    public String getParFlgGreaterThanEqual() {
        return parFlgGreaterThanEqual;
    }

    /**
     * parFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param parFlgGreaterThanEqual parFlgGreaterThanEqual に設定する
     */
    public void setParFlgGreaterThanEqual(String parFlgGreaterThanEqual) {
        this.parFlgGreaterThanEqual = parFlgGreaterThanEqual;
    }

    /**
     * parFlgLessThan のゲッターメソッドです。
     * 
     * @return the parFlgLessThan
     */
    public String getParFlgLessThan() {
        return parFlgLessThan;
    }

    /**
     * parFlgLessThan のセッターメソッドです。
     * 
     * @param parFlgLessThan parFlgLessThan に設定する
     */
    public void setParFlgLessThan(String parFlgLessThan) {
        this.parFlgLessThan = parFlgLessThan;
    }

    /**
     * parFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the parFlgLessThanEqual
     */
    public String getParFlgLessThanEqual() {
        return parFlgLessThanEqual;
    }

    /**
     * parFlgLessThanEqual のセッターメソッドです。
     * 
     * @param parFlgLessThanEqual parFlgLessThanEqual に設定する
     */
    public void setParFlgLessThanEqual(String parFlgLessThanEqual) {
        this.parFlgLessThanEqual = parFlgLessThanEqual;
    }

    /**
     * parFlgLikeFront のゲッターメソッドです。
     * 
     * @return the parFlgLikeFront
     */
    public String getParFlgLikeFront() {
        return parFlgLikeFront;
    }

    /**
     * parFlgLikeFront のセッターメソッドです。
     * 
     * @param parFlgLikeFront parFlgLikeFront に設定する
     */
    public void setParFlgLikeFront(String parFlgLikeFront) {
        this.parFlgLikeFront = parFlgLikeFront;
    }

    /**
     * kitParItemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the kitParItemNoGreaterThan
     */
    public String getKitParItemNoGreaterThan() {
        return kitParItemNoGreaterThan;
    }

    /**
     * kitParItemNoGreaterThan のセッターメソッドです。
     * 
     * @param kitParItemNoGreaterThan kitParItemNoGreaterThan に設定する
     */
    public void setKitParItemNoGreaterThan(String kitParItemNoGreaterThan) {
        this.kitParItemNoGreaterThan = kitParItemNoGreaterThan;
    }

    /**
     * kitParItemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the kitParItemNoGreaterThanEqual
     */
    public String getKitParItemNoGreaterThanEqual() {
        return kitParItemNoGreaterThanEqual;
    }

    /**
     * kitParItemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param kitParItemNoGreaterThanEqual kitParItemNoGreaterThanEqual に設定する
     */
    public void setKitParItemNoGreaterThanEqual(String kitParItemNoGreaterThanEqual) {
        this.kitParItemNoGreaterThanEqual = kitParItemNoGreaterThanEqual;
    }

    /**
     * kitParItemNoLessThan のゲッターメソッドです。
     * 
     * @return the kitParItemNoLessThan
     */
    public String getKitParItemNoLessThan() {
        return kitParItemNoLessThan;
    }

    /**
     * kitParItemNoLessThan のセッターメソッドです。
     * 
     * @param kitParItemNoLessThan kitParItemNoLessThan に設定する
     */
    public void setKitParItemNoLessThan(String kitParItemNoLessThan) {
        this.kitParItemNoLessThan = kitParItemNoLessThan;
    }

    /**
     * kitParItemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the kitParItemNoLessThanEqual
     */
    public String getKitParItemNoLessThanEqual() {
        return kitParItemNoLessThanEqual;
    }

    /**
     * kitParItemNoLessThanEqual のセッターメソッドです。
     * 
     * @param kitParItemNoLessThanEqual kitParItemNoLessThanEqual に設定する
     */
    public void setKitParItemNoLessThanEqual(String kitParItemNoLessThanEqual) {
        this.kitParItemNoLessThanEqual = kitParItemNoLessThanEqual;
    }

    /**
     * kitParItemNoLikeFront のゲッターメソッドです。
     * 
     * @return the kitParItemNoLikeFront
     */
    public String getKitParItemNoLikeFront() {
        return kitParItemNoLikeFront;
    }

    /**
     * kitParItemNoLikeFront のセッターメソッドです。
     * 
     * @param kitParItemNoLikeFront kitParItemNoLikeFront に設定する
     */
    public void setKitParItemNoLikeFront(String kitParItemNoLikeFront) {
        this.kitParItemNoLikeFront = kitParItemNoLikeFront;
    }

    /**
     * customerPoNoGreaterThan のゲッターメソッドです。
     * 
     * @return the customerPoNoGreaterThan
     */
    public String getCustomerPoNoGreaterThan() {
        return customerPoNoGreaterThan;
    }

    /**
     * customerPoNoGreaterThan のセッターメソッドです。
     * 
     * @param customerPoNoGreaterThan customerPoNoGreaterThan に設定する
     */
    public void setCustomerPoNoGreaterThan(String customerPoNoGreaterThan) {
        this.customerPoNoGreaterThan = customerPoNoGreaterThan;
    }

    /**
     * customerPoNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerPoNoGreaterThanEqual
     */
    public String getCustomerPoNoGreaterThanEqual() {
        return customerPoNoGreaterThanEqual;
    }

    /**
     * customerPoNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerPoNoGreaterThanEqual customerPoNoGreaterThanEqual に設定する
     */
    public void setCustomerPoNoGreaterThanEqual(String customerPoNoGreaterThanEqual) {
        this.customerPoNoGreaterThanEqual = customerPoNoGreaterThanEqual;
    }

    /**
     * customerPoNoLessThan のゲッターメソッドです。
     * 
     * @return the customerPoNoLessThan
     */
    public String getCustomerPoNoLessThan() {
        return customerPoNoLessThan;
    }

    /**
     * customerPoNoLessThan のセッターメソッドです。
     * 
     * @param customerPoNoLessThan customerPoNoLessThan に設定する
     */
    public void setCustomerPoNoLessThan(String customerPoNoLessThan) {
        this.customerPoNoLessThan = customerPoNoLessThan;
    }

    /**
     * customerPoNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerPoNoLessThanEqual
     */
    public String getCustomerPoNoLessThanEqual() {
        return customerPoNoLessThanEqual;
    }

    /**
     * customerPoNoLessThanEqual のセッターメソッドです。
     * 
     * @param customerPoNoLessThanEqual customerPoNoLessThanEqual に設定する
     */
    public void setCustomerPoNoLessThanEqual(String customerPoNoLessThanEqual) {
        this.customerPoNoLessThanEqual = customerPoNoLessThanEqual;
    }

    /**
     * customerPoNoLikeFront のゲッターメソッドです。
     * 
     * @return the customerPoNoLikeFront
     */
    public String getCustomerPoNoLikeFront() {
        return customerPoNoLikeFront;
    }

    /**
     * customerPoNoLikeFront のセッターメソッドです。
     * 
     * @param customerPoNoLikeFront customerPoNoLikeFront に設定する
     */
    public void setCustomerPoNoLikeFront(String customerPoNoLikeFront) {
        this.customerPoNoLikeFront = customerPoNoLikeFront;
    }

    /**
     * customerItemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the customerItemNoGreaterThan
     */
    public String getCustomerItemNoGreaterThan() {
        return customerItemNoGreaterThan;
    }

    /**
     * customerItemNoGreaterThan のセッターメソッドです。
     * 
     * @param customerItemNoGreaterThan customerItemNoGreaterThan に設定する
     */
    public void setCustomerItemNoGreaterThan(String customerItemNoGreaterThan) {
        this.customerItemNoGreaterThan = customerItemNoGreaterThan;
    }

    /**
     * customerItemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerItemNoGreaterThanEqual
     */
    public String getCustomerItemNoGreaterThanEqual() {
        return customerItemNoGreaterThanEqual;
    }

    /**
     * customerItemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerItemNoGreaterThanEqual customerItemNoGreaterThanEqual に設定する
     */
    public void setCustomerItemNoGreaterThanEqual(String customerItemNoGreaterThanEqual) {
        this.customerItemNoGreaterThanEqual = customerItemNoGreaterThanEqual;
    }

    /**
     * customerItemNoLessThan のゲッターメソッドです。
     * 
     * @return the customerItemNoLessThan
     */
    public String getCustomerItemNoLessThan() {
        return customerItemNoLessThan;
    }

    /**
     * customerItemNoLessThan のセッターメソッドです。
     * 
     * @param customerItemNoLessThan customerItemNoLessThan に設定する
     */
    public void setCustomerItemNoLessThan(String customerItemNoLessThan) {
        this.customerItemNoLessThan = customerItemNoLessThan;
    }

    /**
     * customerItemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerItemNoLessThanEqual
     */
    public String getCustomerItemNoLessThanEqual() {
        return customerItemNoLessThanEqual;
    }

    /**
     * customerItemNoLessThanEqual のセッターメソッドです。
     * 
     * @param customerItemNoLessThanEqual customerItemNoLessThanEqual に設定する
     */
    public void setCustomerItemNoLessThanEqual(String customerItemNoLessThanEqual) {
        this.customerItemNoLessThanEqual = customerItemNoLessThanEqual;
    }

    /**
     * customerItemNoLikeFront のゲッターメソッドです。
     * 
     * @return the customerItemNoLikeFront
     */
    public String getCustomerItemNoLikeFront() {
        return customerItemNoLikeFront;
    }

    /**
     * customerItemNoLikeFront のセッターメソッドです。
     * 
     * @param customerItemNoLikeFront customerItemNoLikeFront に設定する
     */
    public void setCustomerItemNoLikeFront(String customerItemNoLikeFront) {
        this.customerItemNoLikeFront = customerItemNoLikeFront;
    }

    /**
     * hsCdGreaterThan のゲッターメソッドです。
     * 
     * @return the hsCdGreaterThan
     */
    public String getHsCdGreaterThan() {
        return hsCdGreaterThan;
    }

    /**
     * hsCdGreaterThan のセッターメソッドです。
     * 
     * @param hsCdGreaterThan hsCdGreaterThan に設定する
     */
    public void setHsCdGreaterThan(String hsCdGreaterThan) {
        this.hsCdGreaterThan = hsCdGreaterThan;
    }

    /**
     * hsCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the hsCdGreaterThanEqual
     */
    public String getHsCdGreaterThanEqual() {
        return hsCdGreaterThanEqual;
    }

    /**
     * hsCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param hsCdGreaterThanEqual hsCdGreaterThanEqual に設定する
     */
    public void setHsCdGreaterThanEqual(String hsCdGreaterThanEqual) {
        this.hsCdGreaterThanEqual = hsCdGreaterThanEqual;
    }

    /**
     * hsCdLessThan のゲッターメソッドです。
     * 
     * @return the hsCdLessThan
     */
    public String getHsCdLessThan() {
        return hsCdLessThan;
    }

    /**
     * hsCdLessThan のセッターメソッドです。
     * 
     * @param hsCdLessThan hsCdLessThan に設定する
     */
    public void setHsCdLessThan(String hsCdLessThan) {
        this.hsCdLessThan = hsCdLessThan;
    }

    /**
     * hsCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the hsCdLessThanEqual
     */
    public String getHsCdLessThanEqual() {
        return hsCdLessThanEqual;
    }

    /**
     * hsCdLessThanEqual のセッターメソッドです。
     * 
     * @param hsCdLessThanEqual hsCdLessThanEqual に設定する
     */
    public void setHsCdLessThanEqual(String hsCdLessThanEqual) {
        this.hsCdLessThanEqual = hsCdLessThanEqual;
    }

    /**
     * hsCdLikeFront のゲッターメソッドです。
     * 
     * @return the hsCdLikeFront
     */
    public String getHsCdLikeFront() {
        return hsCdLikeFront;
    }

    /**
     * hsCdLikeFront のセッターメソッドです。
     * 
     * @param hsCdLikeFront hsCdLikeFront に設定する
     */
    public void setHsCdLikeFront(String hsCdLikeFront) {
        this.hsCdLikeFront = hsCdLikeFront;
    }

    /**
     * inputMethTypGreaterThan のゲッターメソッドです。
     * 
     * @return the inputMethTypGreaterThan
     */
    public String getInputMethTypGreaterThan() {
        return inputMethTypGreaterThan;
    }

    /**
     * inputMethTypGreaterThan のセッターメソッドです。
     * 
     * @param inputMethTypGreaterThan inputMethTypGreaterThan に設定する
     */
    public void setInputMethTypGreaterThan(String inputMethTypGreaterThan) {
        this.inputMethTypGreaterThan = inputMethTypGreaterThan;
    }

    /**
     * inputMethTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the inputMethTypGreaterThanEqual
     */
    public String getInputMethTypGreaterThanEqual() {
        return inputMethTypGreaterThanEqual;
    }

    /**
     * inputMethTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param inputMethTypGreaterThanEqual inputMethTypGreaterThanEqual に設定する
     */
    public void setInputMethTypGreaterThanEqual(String inputMethTypGreaterThanEqual) {
        this.inputMethTypGreaterThanEqual = inputMethTypGreaterThanEqual;
    }

    /**
     * inputMethTypLessThan のゲッターメソッドです。
     * 
     * @return the inputMethTypLessThan
     */
    public String getInputMethTypLessThan() {
        return inputMethTypLessThan;
    }

    /**
     * inputMethTypLessThan のセッターメソッドです。
     * 
     * @param inputMethTypLessThan inputMethTypLessThan に設定する
     */
    public void setInputMethTypLessThan(String inputMethTypLessThan) {
        this.inputMethTypLessThan = inputMethTypLessThan;
    }

    /**
     * inputMethTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the inputMethTypLessThanEqual
     */
    public String getInputMethTypLessThanEqual() {
        return inputMethTypLessThanEqual;
    }

    /**
     * inputMethTypLessThanEqual のセッターメソッドです。
     * 
     * @param inputMethTypLessThanEqual inputMethTypLessThanEqual に設定する
     */
    public void setInputMethTypLessThanEqual(String inputMethTypLessThanEqual) {
        this.inputMethTypLessThanEqual = inputMethTypLessThanEqual;
    }

    /**
     * inputMethTypLikeFront のゲッターメソッドです。
     * 
     * @return the inputMethTypLikeFront
     */
    public String getInputMethTypLikeFront() {
        return inputMethTypLikeFront;
    }

    /**
     * inputMethTypLikeFront のセッターメソッドです。
     * 
     * @param inputMethTypLikeFront inputMethTypLikeFront に設定する
     */
    public void setInputMethTypLikeFront(String inputMethTypLikeFront) {
        this.inputMethTypLikeFront = inputMethTypLikeFront;
    }

    /**
     * comUpdateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThan
     */
    public String getComUpdateFuncIdGreaterThan() {
        return comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThan comUpdateFuncIdGreaterThan に設定する
     */
    public void setComUpdateFuncIdGreaterThan(String comUpdateFuncIdGreaterThan) {
        this.comUpdateFuncIdGreaterThan = comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThanEqual
     */
    public String getComUpdateFuncIdGreaterThanEqual() {
        return comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThanEqual comUpdateFuncIdGreaterThanEqual に設定する
     */
    public void setComUpdateFuncIdGreaterThanEqual(String comUpdateFuncIdGreaterThanEqual) {
        this.comUpdateFuncIdGreaterThanEqual = comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThan
     */
    public String getComUpdateFuncIdLessThan() {
        return comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThan comUpdateFuncIdLessThan に設定する
     */
    public void setComUpdateFuncIdLessThan(String comUpdateFuncIdLessThan) {
        this.comUpdateFuncIdLessThan = comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThanEqual
     */
    public String getComUpdateFuncIdLessThanEqual() {
        return comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThanEqual comUpdateFuncIdLessThanEqual に設定する
     */
    public void setComUpdateFuncIdLessThanEqual(String comUpdateFuncIdLessThanEqual) {
        this.comUpdateFuncIdLessThanEqual = comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLikeFront
     */
    public String getComUpdateFuncIdLikeFront() {
        return comUpdateFuncIdLikeFront;
    }

    /**
     * comUpdateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLikeFront comUpdateFuncIdLikeFront に設定する
     */
    public void setComUpdateFuncIdLikeFront(String comUpdateFuncIdLikeFront) {
        this.comUpdateFuncIdLikeFront = comUpdateFuncIdLikeFront;
    }

    /**
     * comUpdateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThan
     */
    public String getComUpdateUserIdGreaterThan() {
        return comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThan comUpdateUserIdGreaterThan に設定する
     */
    public void setComUpdateUserIdGreaterThan(String comUpdateUserIdGreaterThan) {
        this.comUpdateUserIdGreaterThan = comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThanEqual
     */
    public String getComUpdateUserIdGreaterThanEqual() {
        return comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThanEqual comUpdateUserIdGreaterThanEqual に設定する
     */
    public void setComUpdateUserIdGreaterThanEqual(String comUpdateUserIdGreaterThanEqual) {
        this.comUpdateUserIdGreaterThanEqual = comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThan
     */
    public String getComUpdateUserIdLessThan() {
        return comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThan comUpdateUserIdLessThan に設定する
     */
    public void setComUpdateUserIdLessThan(String comUpdateUserIdLessThan) {
        this.comUpdateUserIdLessThan = comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThanEqual
     */
    public String getComUpdateUserIdLessThanEqual() {
        return comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThanEqual comUpdateUserIdLessThanEqual に設定する
     */
    public void setComUpdateUserIdLessThanEqual(String comUpdateUserIdLessThanEqual) {
        this.comUpdateUserIdLessThanEqual = comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLikeFront
     */
    public String getComUpdateUserIdLikeFront() {
        return comUpdateUserIdLikeFront;
    }

    /**
     * comUpdateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateUserIdLikeFront comUpdateUserIdLikeFront に設定する
     */
    public void setComUpdateUserIdLikeFront(String comUpdateUserIdLikeFront) {
        this.comUpdateUserIdLikeFront = comUpdateUserIdLikeFront;
    }

    /**
     * comCreateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThan
     */
    public String getComCreateFuncIdGreaterThan() {
        return comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThan comCreateFuncIdGreaterThan に設定する
     */
    public void setComCreateFuncIdGreaterThan(String comCreateFuncIdGreaterThan) {
        this.comCreateFuncIdGreaterThan = comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThanEqual
     */
    public String getComCreateFuncIdGreaterThanEqual() {
        return comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThanEqual comCreateFuncIdGreaterThanEqual に設定する
     */
    public void setComCreateFuncIdGreaterThanEqual(String comCreateFuncIdGreaterThanEqual) {
        this.comCreateFuncIdGreaterThanEqual = comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThan
     */
    public String getComCreateFuncIdLessThan() {
        return comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThan comCreateFuncIdLessThan に設定する
     */
    public void setComCreateFuncIdLessThan(String comCreateFuncIdLessThan) {
        this.comCreateFuncIdLessThan = comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThanEqual
     */
    public String getComCreateFuncIdLessThanEqual() {
        return comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThanEqual comCreateFuncIdLessThanEqual に設定する
     */
    public void setComCreateFuncIdLessThanEqual(String comCreateFuncIdLessThanEqual) {
        this.comCreateFuncIdLessThanEqual = comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLikeFront
     */
    public String getComCreateFuncIdLikeFront() {
        return comCreateFuncIdLikeFront;
    }

    /**
     * comCreateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateFuncIdLikeFront comCreateFuncIdLikeFront に設定する
     */
    public void setComCreateFuncIdLikeFront(String comCreateFuncIdLikeFront) {
        this.comCreateFuncIdLikeFront = comCreateFuncIdLikeFront;
    }

    /**
     * comCreateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThan
     */
    public String getComCreateUserIdGreaterThan() {
        return comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThan comCreateUserIdGreaterThan に設定する
     */
    public void setComCreateUserIdGreaterThan(String comCreateUserIdGreaterThan) {
        this.comCreateUserIdGreaterThan = comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThanEqual
     */
    public String getComCreateUserIdGreaterThanEqual() {
        return comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThanEqual comCreateUserIdGreaterThanEqual に設定する
     */
    public void setComCreateUserIdGreaterThanEqual(String comCreateUserIdGreaterThanEqual) {
        this.comCreateUserIdGreaterThanEqual = comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThan
     */
    public String getComCreateUserIdLessThan() {
        return comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThan のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThan comCreateUserIdLessThan に設定する
     */
    public void setComCreateUserIdLessThan(String comCreateUserIdLessThan) {
        this.comCreateUserIdLessThan = comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThanEqual
     */
    public String getComCreateUserIdLessThanEqual() {
        return comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThanEqual comCreateUserIdLessThanEqual に設定する
     */
    public void setComCreateUserIdLessThanEqual(String comCreateUserIdLessThanEqual) {
        this.comCreateUserIdLessThanEqual = comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLikeFront
     */
    public String getComCreateUserIdLikeFront() {
        return comCreateUserIdLikeFront;
    }

    /**
     * comCreateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateUserIdLikeFront comCreateUserIdLikeFront に設定する
     */
    public void setComCreateUserIdLikeFront(String comCreateUserIdLikeFront) {
        this.comCreateUserIdLikeFront = comCreateUserIdLikeFront;
    }

}

