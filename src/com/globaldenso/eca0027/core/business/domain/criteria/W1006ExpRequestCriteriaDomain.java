/*
 * PROJECT：eca0027
 * 
 * W1006ExpRequest の検索条件Domainクラス
 * テーブル概要：Export Request/????  Table to hold the header information of the export request/???????????????????
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/24  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * W1006ExpRequest の検索条件Domainクラスです。<BR>
 * テーブル概要：Export Request/????  Table to hold the header information of the export request/???????????????????<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/04/24 15:48:14<BR>
 * 
 * テーブル定義から2558/04/24に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1006ExpRequestCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * EXPORT REQUEST NO/????NO
     */
    private String expRequestNo;

    /**
     * SHIPPER CODE/?????
     */
    private String shipperCd;

    /**
     * REQUEST ISSUER COMPANY CODE/???????
     */
    private String requestIssuerCompCd;

    /**
     * REQUEST ISSUER DEPARTMENT NAME/???????
     */
    private String requestIssuerDeptNm;

    /**
     * REQUEST ISSUER ID/???ID
     */
    private String requestIssuerId;

    /**
     * REQUEST ISSUER NAME/????
     */
    private String requestIssuerNm;

    /**
     * ISSUER COMPANY TEL/????TEL
     */
    private String issuerCompTel;

    /**
     * ISSUER COMPANY NICE NET/????NICE-NET
     */
    private String issuerCompNiceNet;

    /**
     * INVOICE CATEGORY/????  C:Commercial value,
I:Commercial value (I),
N:No commercial value
     */
    private String invoiceCtgry;

    /**
     * RE EXPORT GOODS FLAG/???????  Y:Re-export, N:Not
     */
    private String reExpGoodsFlg;

    /**
     * IMPORT INVOICE NO 1/???????NO1
     */
    private String impInvoiceNo1;

    /**
     * IMPORT INVOICE NO 2/???????NO2
     */
    private String impInvoiceNo2;

    /**
     * ITEM TYPE/????  1:Parts,
2:Materials,
3:PKG Materials,
4:Equipment,
9:Other
     */
    private String itemTyp;

    /**
     * DESCRIPTION/??
     */
    private String description;

    /**
     * ORIGIN COUNTRY CODE/??????
     */
    private String originCntryCd;

    /**
     * QUANTITY UNIT/????
     */
    private String qtyUnit;

    /**
     * WEIGHT UNIT/????
     */
    private String weightUnit;

    /**
     * CUSTOMER SHIP TO CODE/??????????
     */
    private String customerShipTo;

    /**
     * ACCOUNTEE CODE/??????
     */
    private String accounteeCd;

    /**
     * ACCOUNTEE COMPANY NAME/???????
     */
    private String accounteeCompNm;

    /**
     * ACCOUNTEE COMPANY ADDRESS/???????
     */
    private String accounteeCompAddr;

    /**
     * ACCOUNTEE COMPANY TEL/?????TEL
     */
    private String accounteeCompTel;

    /**
     * CONTAINER SORTING KEY/????????
     */
    private String containerSortingKey;

    /**
     * CONSIGNEE CODE/??????
     */
    private String consigneeCd;

    /**
     * CONSIGNEE COMPANY NAME/???????
     */
    private String consigneeCompNm;

    /**
     * CONSIGNEE COUNTRY CODE/???????
     */
    private String consigneeCntryCd;

    /**
     * CONSIGNEE COMPANY ADDRESS/???????
     */
    private String consigneeCompAddr;

    /**
     * CONSIGNEE COMPANY TEL/?????TEL
     */
    private String consigneeCompTel;

    /**
     * SHIP TO CODE/??????
     */
    private String shipToCd;

    /**
     * SHIP TO COMPANY NAME/???????
     */
    private String shipToCompNm;

    /**
     * SHIP TO COUNTRY CODE/???????
     */
    private String shipToCntryCd;

    /**
     * SHIP TO COMPANY ADDRESS/???????
     */
    private String shipToCompAddr;

    /**
     * SHIP TO COMPANY TEL/?????TEL
     */
    private String shipToCompTel;

    /**
     * SHIP TO COMPANY DEPARTMENT NAME/?????????
     */
    private String shipToCompDeptNm;

    /**
     * SHIP TO ATTN NAME/????????
     */
    private String shipToAttnNm;

    /**
     * CURRENCY CODE/?????
     */
    private String currCd;

    /**
     * PRICE TERMS/????  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship
     */
    private String priceTerms;

    /**
     * PRICE TERMS 1/????1  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship
     */
    private String priceTerms1;

    /**
     * PRICE TERMS 2/????2  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship
     */
    private String priceTerms2;

    /**
     * PAYMENT METHOD/????  L:L/C,
P:D/P,
A:D/A,
M:Payment in Advance,
R:Deferred Payment,
X:T/T RemiW1006ance
     */
    private String payMeth;

    /**
     * PAYMENT TERMS/????
     */
    private String payTerms;

    /**
     * TRADE TERMS/????  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship
     */
    private String tradeTerms;

    /**
     * TRANSPORT CODE/???????
     */
    private String trnsCd;

    /**
     * SPLIT SHIPPING NG FLAG/?????????  Y:Prohibit Division, N:Allowed Division
     */
    private String splitShippingNgFlg;

    /**
     * DUE DATE/??
     */
    private Date dueDt;

    /**
     * REQUEST SHIP DATE/?????
     */
    private Date requiredShipDt;

    /**
     * PACKING WAREHOUSE CODE/???????
     */
    private String packingWhCd;

    /**
     * PACKING COMPANY LOCATION FLAG/???????  Y:Self, N:Other
     */
    private String packingCompLocationFlg;

    /**
     * PACKING COMPANY CODE/???????
     */
    private String packingCompCd;

    /**
     * PACKING COMPANY DEPARTMENT NAME/???????
     */
    private String packingCompDeptNm;

    /**
     * REQUEST TO PACKING REMARKS/??????
     */
    private String requestToPackingSec;

    /**
     * CASEMARK NOTATION/??????????
     */
    private String casemarkNotation;

    /**
     * FREIGHT RESPONSIBLE CODE/????????
     */
    private String freightResponsibleCd;

    /**
     * CATEGORY CODE 1/?????1
     */
    private String ctgryCd1;

    /**
     * BUDGET NO 1/????1
     */
    private String budgetNo1;

    /**
     * JOB NO 1/JOB NO1
     */
    private String jobNo1;

    /**
     * PERCENT 1/??1
     */
    private BigDecimal per1;

    /**
     * CATEGORY CODE 2/?????2
     */
    private String ctgryCd2;

    /**
     * BUDGET NO 2/????2
     */
    private String budgetNo2;

    /**
     * JOB NO 2/JOB NO2
     */
    private String jobNo2;

    /**
     * PERCENT 2/??2
     */
    private BigDecimal per2;

    /**
     * CATEGORY CODE 3/?????3
     */
    private String ctgryCd3;

    /**
     * BUDGET NO 3/????3
     */
    private String budgetNo3;

    /**
     * JOB NO 3/JOB NO3
     */
    private String jobNo3;

    /**
     * PERCENT 3/??3
     */
    private BigDecimal per3;

    /**
     * PREPARE_EXP_INVOICE_CTGRY
     */
    private String prepareExpInvoiceCtgry;

    /**
     * SUPPLIER INVOICE NO/????????NO
     */
    private String supplierInvoiceNo;

    /**
     * CUSTOMER CODE/??????
     */
    private String customerCd;

    /**
     * CREATE ORIGIN TYPE/?????
     */
    private String createOriginTyp;

    /**
     * REQUEST DATE/???
     */
    private Date requestDt;

    /**
     * REQUEST STATUS/???????  10:has not completed request,
20:has not print approval equest,
30:has not received packing Dep.,
40:has not Packed,
50:In progress of PKG,
60:Issue all CML,
90:Cancel
     */
    private String requestStatus;

    /**
     * REQUEST LAST UPDATE DATE/???????
     */
    private Date requestLastUpdateDt;

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
     * SHIPPER CODE/?????（大なり）
     */
    private String shipperCdGreaterThan;

    /**
     * SHIPPER CODE/?????（大なりイコール）
     */
    private String shipperCdGreaterThanEqual;

    /**
     * SHIPPER CODE/?????（小なり）
     */
    private String shipperCdLessThan;

    /**
     * SHIPPER CODE/?????（小なりイコール）
     */
    private String shipperCdLessThanEqual;

    /**
     * SHIPPER CODE/?????（前方一致）
     */
    private String shipperCdLikeFront;

    /**
     * REQUEST ISSUER COMPANY CODE/???????（大なり）
     */
    private String requestIssuerCompCdGreaterThan;

    /**
     * REQUEST ISSUER COMPANY CODE/???????（大なりイコール）
     */
    private String requestIssuerCompCdGreaterThanEqual;

    /**
     * REQUEST ISSUER COMPANY CODE/???????（小なり）
     */
    private String requestIssuerCompCdLessThan;

    /**
     * REQUEST ISSUER COMPANY CODE/???????（小なりイコール）
     */
    private String requestIssuerCompCdLessThanEqual;

    /**
     * REQUEST ISSUER COMPANY CODE/???????（前方一致）
     */
    private String requestIssuerCompCdLikeFront;

    /**
     * REQUEST ISSUER DEPARTMENT NAME/???????（大なり）
     */
    private String requestIssuerDeptNmGreaterThan;

    /**
     * REQUEST ISSUER DEPARTMENT NAME/???????（大なりイコール）
     */
    private String requestIssuerDeptNmGreaterThanEqual;

    /**
     * REQUEST ISSUER DEPARTMENT NAME/???????（小なり）
     */
    private String requestIssuerDeptNmLessThan;

    /**
     * REQUEST ISSUER DEPARTMENT NAME/???????（小なりイコール）
     */
    private String requestIssuerDeptNmLessThanEqual;

    /**
     * REQUEST ISSUER DEPARTMENT NAME/???????（前方一致）
     */
    private String requestIssuerDeptNmLikeFront;

    /**
     * REQUEST ISSUER ID/???ID（大なり）
     */
    private String requestIssuerIdGreaterThan;

    /**
     * REQUEST ISSUER ID/???ID（大なりイコール）
     */
    private String requestIssuerIdGreaterThanEqual;

    /**
     * REQUEST ISSUER ID/???ID（小なり）
     */
    private String requestIssuerIdLessThan;

    /**
     * REQUEST ISSUER ID/???ID（小なりイコール）
     */
    private String requestIssuerIdLessThanEqual;

    /**
     * REQUEST ISSUER ID/???ID（前方一致）
     */
    private String requestIssuerIdLikeFront;

    /**
     * REQUEST ISSUER NAME/????（大なり）
     */
    private String requestIssuerNmGreaterThan;

    /**
     * REQUEST ISSUER NAME/????（大なりイコール）
     */
    private String requestIssuerNmGreaterThanEqual;

    /**
     * REQUEST ISSUER NAME/????（小なり）
     */
    private String requestIssuerNmLessThan;

    /**
     * REQUEST ISSUER NAME/????（小なりイコール）
     */
    private String requestIssuerNmLessThanEqual;

    /**
     * REQUEST ISSUER NAME/????（前方一致）
     */
    private String requestIssuerNmLikeFront;

    /**
     * ISSUER COMPANY TEL/????TEL（大なり）
     */
    private String issuerCompTelGreaterThan;

    /**
     * ISSUER COMPANY TEL/????TEL（大なりイコール）
     */
    private String issuerCompTelGreaterThanEqual;

    /**
     * ISSUER COMPANY TEL/????TEL（小なり）
     */
    private String issuerCompTelLessThan;

    /**
     * ISSUER COMPANY TEL/????TEL（小なりイコール）
     */
    private String issuerCompTelLessThanEqual;

    /**
     * ISSUER COMPANY TEL/????TEL（前方一致）
     */
    private String issuerCompTelLikeFront;

    /**
     * ISSUER COMPANY NICE NET/????NICE-NET（大なり）
     */
    private String issuerCompNiceNetGreaterThan;

    /**
     * ISSUER COMPANY NICE NET/????NICE-NET（大なりイコール）
     */
    private String issuerCompNiceNetGreaterThanEqual;

    /**
     * ISSUER COMPANY NICE NET/????NICE-NET（小なり）
     */
    private String issuerCompNiceNetLessThan;

    /**
     * ISSUER COMPANY NICE NET/????NICE-NET（小なりイコール）
     */
    private String issuerCompNiceNetLessThanEqual;

    /**
     * ISSUER COMPANY NICE NET/????NICE-NET（前方一致）
     */
    private String issuerCompNiceNetLikeFront;

    /**
     * INVOICE CATEGORY/????  C:Commercial value,
I:Commercial value (I),
N:No commercial value（大なり）
     */
    private String invoiceCtgryGreaterThan;

    /**
     * INVOICE CATEGORY/????  C:Commercial value,
I:Commercial value (I),
N:No commercial value（大なりイコール）
     */
    private String invoiceCtgryGreaterThanEqual;

    /**
     * INVOICE CATEGORY/????  C:Commercial value,
I:Commercial value (I),
N:No commercial value（小なり）
     */
    private String invoiceCtgryLessThan;

    /**
     * INVOICE CATEGORY/????  C:Commercial value,
I:Commercial value (I),
N:No commercial value（小なりイコール）
     */
    private String invoiceCtgryLessThanEqual;

    /**
     * INVOICE CATEGORY/????  C:Commercial value,
I:Commercial value (I),
N:No commercial value（前方一致）
     */
    private String invoiceCtgryLikeFront;

    /**
     * RE EXPORT GOODS FLAG/???????  Y:Re-export, N:Not（大なり）
     */
    private String reExpGoodsFlgGreaterThan;

    /**
     * RE EXPORT GOODS FLAG/???????  Y:Re-export, N:Not（大なりイコール）
     */
    private String reExpGoodsFlgGreaterThanEqual;

    /**
     * RE EXPORT GOODS FLAG/???????  Y:Re-export, N:Not（小なり）
     */
    private String reExpGoodsFlgLessThan;

    /**
     * RE EXPORT GOODS FLAG/???????  Y:Re-export, N:Not（小なりイコール）
     */
    private String reExpGoodsFlgLessThanEqual;

    /**
     * RE EXPORT GOODS FLAG/???????  Y:Re-export, N:Not（前方一致）
     */
    private String reExpGoodsFlgLikeFront;

    /**
     * IMPORT INVOICE NO 1/???????NO1（大なり）
     */
    private String impInvoiceNo1GreaterThan;

    /**
     * IMPORT INVOICE NO 1/???????NO1（大なりイコール）
     */
    private String impInvoiceNo1GreaterThanEqual;

    /**
     * IMPORT INVOICE NO 1/???????NO1（小なり）
     */
    private String impInvoiceNo1LessThan;

    /**
     * IMPORT INVOICE NO 1/???????NO1（小なりイコール）
     */
    private String impInvoiceNo1LessThanEqual;

    /**
     * IMPORT INVOICE NO 1/???????NO1（前方一致）
     */
    private String impInvoiceNo1LikeFront;

    /**
     * IMPORT INVOICE NO 2/???????NO2（大なり）
     */
    private String impInvoiceNo2GreaterThan;

    /**
     * IMPORT INVOICE NO 2/???????NO2（大なりイコール）
     */
    private String impInvoiceNo2GreaterThanEqual;

    /**
     * IMPORT INVOICE NO 2/???????NO2（小なり）
     */
    private String impInvoiceNo2LessThan;

    /**
     * IMPORT INVOICE NO 2/???????NO2（小なりイコール）
     */
    private String impInvoiceNo2LessThanEqual;

    /**
     * IMPORT INVOICE NO 2/???????NO2（前方一致）
     */
    private String impInvoiceNo2LikeFront;

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
     * DESCRIPTION/??（大なり）
     */
    private String descriptionGreaterThan;

    /**
     * DESCRIPTION/??（大なりイコール）
     */
    private String descriptionGreaterThanEqual;

    /**
     * DESCRIPTION/??（小なり）
     */
    private String descriptionLessThan;

    /**
     * DESCRIPTION/??（小なりイコール）
     */
    private String descriptionLessThanEqual;

    /**
     * DESCRIPTION/??（前方一致）
     */
    private String descriptionLikeFront;

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
     * CUSTOMER SHIP TO CODE/??????????（大なり）
     */
    private String customerShipToGreaterThan;

    /**
     * CUSTOMER SHIP TO CODE/??????????（大なりイコール）
     */
    private String customerShipToGreaterThanEqual;

    /**
     * CUSTOMER SHIP TO CODE/??????????（小なり）
     */
    private String customerShipToLessThan;

    /**
     * CUSTOMER SHIP TO CODE/??????????（小なりイコール）
     */
    private String customerShipToLessThanEqual;

    /**
     * CUSTOMER SHIP TO CODE/??????????（前方一致）
     */
    private String customerShipToLikeFront;

    /**
     * ACCOUNTEE CODE/??????（大なり）
     */
    private String accounteeCdGreaterThan;

    /**
     * ACCOUNTEE CODE/??????（大なりイコール）
     */
    private String accounteeCdGreaterThanEqual;

    /**
     * ACCOUNTEE CODE/??????（小なり）
     */
    private String accounteeCdLessThan;

    /**
     * ACCOUNTEE CODE/??????（小なりイコール）
     */
    private String accounteeCdLessThanEqual;

    /**
     * ACCOUNTEE CODE/??????（前方一致）
     */
    private String accounteeCdLikeFront;

    /**
     * ACCOUNTEE COMPANY NAME/???????（大なり）
     */
    private String accounteeCompNmGreaterThan;

    /**
     * ACCOUNTEE COMPANY NAME/???????（大なりイコール）
     */
    private String accounteeCompNmGreaterThanEqual;

    /**
     * ACCOUNTEE COMPANY NAME/???????（小なり）
     */
    private String accounteeCompNmLessThan;

    /**
     * ACCOUNTEE COMPANY NAME/???????（小なりイコール）
     */
    private String accounteeCompNmLessThanEqual;

    /**
     * ACCOUNTEE COMPANY NAME/???????（前方一致）
     */
    private String accounteeCompNmLikeFront;

    /**
     * ACCOUNTEE COMPANY ADDRESS/???????（大なり）
     */
    private String accounteeCompAddrGreaterThan;

    /**
     * ACCOUNTEE COMPANY ADDRESS/???????（大なりイコール）
     */
    private String accounteeCompAddrGreaterThanEqual;

    /**
     * ACCOUNTEE COMPANY ADDRESS/???????（小なり）
     */
    private String accounteeCompAddrLessThan;

    /**
     * ACCOUNTEE COMPANY ADDRESS/???????（小なりイコール）
     */
    private String accounteeCompAddrLessThanEqual;

    /**
     * ACCOUNTEE COMPANY ADDRESS/???????（前方一致）
     */
    private String accounteeCompAddrLikeFront;

    /**
     * ACCOUNTEE COMPANY TEL/?????TEL（大なり）
     */
    private String accounteeCompTelGreaterThan;

    /**
     * ACCOUNTEE COMPANY TEL/?????TEL（大なりイコール）
     */
    private String accounteeCompTelGreaterThanEqual;

    /**
     * ACCOUNTEE COMPANY TEL/?????TEL（小なり）
     */
    private String accounteeCompTelLessThan;

    /**
     * ACCOUNTEE COMPANY TEL/?????TEL（小なりイコール）
     */
    private String accounteeCompTelLessThanEqual;

    /**
     * ACCOUNTEE COMPANY TEL/?????TEL（前方一致）
     */
    private String accounteeCompTelLikeFront;

    /**
     * CONTAINER SORTING KEY/????????（大なり）
     */
    private String containerSortingKeyGreaterThan;

    /**
     * CONTAINER SORTING KEY/????????（大なりイコール）
     */
    private String containerSortingKeyGreaterThanEqual;

    /**
     * CONTAINER SORTING KEY/????????（小なり）
     */
    private String containerSortingKeyLessThan;

    /**
     * CONTAINER SORTING KEY/????????（小なりイコール）
     */
    private String containerSortingKeyLessThanEqual;

    /**
     * CONTAINER SORTING KEY/????????（前方一致）
     */
    private String containerSortingKeyLikeFront;

    /**
     * CONSIGNEE CODE/??????（大なり）
     */
    private String consigneeCdGreaterThan;

    /**
     * CONSIGNEE CODE/??????（大なりイコール）
     */
    private String consigneeCdGreaterThanEqual;

    /**
     * CONSIGNEE CODE/??????（小なり）
     */
    private String consigneeCdLessThan;

    /**
     * CONSIGNEE CODE/??????（小なりイコール）
     */
    private String consigneeCdLessThanEqual;

    /**
     * CONSIGNEE CODE/??????（前方一致）
     */
    private String consigneeCdLikeFront;

    /**
     * CONSIGNEE COMPANY NAME/???????（大なり）
     */
    private String consigneeCompNmGreaterThan;

    /**
     * CONSIGNEE COMPANY NAME/???????（大なりイコール）
     */
    private String consigneeCompNmGreaterThanEqual;

    /**
     * CONSIGNEE COMPANY NAME/???????（小なり）
     */
    private String consigneeCompNmLessThan;

    /**
     * CONSIGNEE COMPANY NAME/???????（小なりイコール）
     */
    private String consigneeCompNmLessThanEqual;

    /**
     * CONSIGNEE COMPANY NAME/???????（前方一致）
     */
    private String consigneeCompNmLikeFront;

    /**
     * CONSIGNEE COUNTRY CODE/???????（大なり）
     */
    private String consigneeCntryCdGreaterThan;

    /**
     * CONSIGNEE COUNTRY CODE/???????（大なりイコール）
     */
    private String consigneeCntryCdGreaterThanEqual;

    /**
     * CONSIGNEE COUNTRY CODE/???????（小なり）
     */
    private String consigneeCntryCdLessThan;

    /**
     * CONSIGNEE COUNTRY CODE/???????（小なりイコール）
     */
    private String consigneeCntryCdLessThanEqual;

    /**
     * CONSIGNEE COUNTRY CODE/???????（前方一致）
     */
    private String consigneeCntryCdLikeFront;

    /**
     * CONSIGNEE COMPANY ADDRESS/???????（大なり）
     */
    private String consigneeCompAddrGreaterThan;

    /**
     * CONSIGNEE COMPANY ADDRESS/???????（大なりイコール）
     */
    private String consigneeCompAddrGreaterThanEqual;

    /**
     * CONSIGNEE COMPANY ADDRESS/???????（小なり）
     */
    private String consigneeCompAddrLessThan;

    /**
     * CONSIGNEE COMPANY ADDRESS/???????（小なりイコール）
     */
    private String consigneeCompAddrLessThanEqual;

    /**
     * CONSIGNEE COMPANY ADDRESS/???????（前方一致）
     */
    private String consigneeCompAddrLikeFront;

    /**
     * CONSIGNEE COMPANY TEL/?????TEL（大なり）
     */
    private String consigneeCompTelGreaterThan;

    /**
     * CONSIGNEE COMPANY TEL/?????TEL（大なりイコール）
     */
    private String consigneeCompTelGreaterThanEqual;

    /**
     * CONSIGNEE COMPANY TEL/?????TEL（小なり）
     */
    private String consigneeCompTelLessThan;

    /**
     * CONSIGNEE COMPANY TEL/?????TEL（小なりイコール）
     */
    private String consigneeCompTelLessThanEqual;

    /**
     * CONSIGNEE COMPANY TEL/?????TEL（前方一致）
     */
    private String consigneeCompTelLikeFront;

    /**
     * SHIP TO CODE/??????（大なり）
     */
    private String shipToCdGreaterThan;

    /**
     * SHIP TO CODE/??????（大なりイコール）
     */
    private String shipToCdGreaterThanEqual;

    /**
     * SHIP TO CODE/??????（小なり）
     */
    private String shipToCdLessThan;

    /**
     * SHIP TO CODE/??????（小なりイコール）
     */
    private String shipToCdLessThanEqual;

    /**
     * SHIP TO CODE/??????（前方一致）
     */
    private String shipToCdLikeFront;

    /**
     * SHIP TO COMPANY NAME/???????（大なり）
     */
    private String shipToCompNmGreaterThan;

    /**
     * SHIP TO COMPANY NAME/???????（大なりイコール）
     */
    private String shipToCompNmGreaterThanEqual;

    /**
     * SHIP TO COMPANY NAME/???????（小なり）
     */
    private String shipToCompNmLessThan;

    /**
     * SHIP TO COMPANY NAME/???????（小なりイコール）
     */
    private String shipToCompNmLessThanEqual;

    /**
     * SHIP TO COMPANY NAME/???????（前方一致）
     */
    private String shipToCompNmLikeFront;

    /**
     * SHIP TO COUNTRY CODE/???????（大なり）
     */
    private String shipToCntryCdGreaterThan;

    /**
     * SHIP TO COUNTRY CODE/???????（大なりイコール）
     */
    private String shipToCntryCdGreaterThanEqual;

    /**
     * SHIP TO COUNTRY CODE/???????（小なり）
     */
    private String shipToCntryCdLessThan;

    /**
     * SHIP TO COUNTRY CODE/???????（小なりイコール）
     */
    private String shipToCntryCdLessThanEqual;

    /**
     * SHIP TO COUNTRY CODE/???????（前方一致）
     */
    private String shipToCntryCdLikeFront;

    /**
     * SHIP TO COMPANY ADDRESS/???????（大なり）
     */
    private String shipToCompAddrGreaterThan;

    /**
     * SHIP TO COMPANY ADDRESS/???????（大なりイコール）
     */
    private String shipToCompAddrGreaterThanEqual;

    /**
     * SHIP TO COMPANY ADDRESS/???????（小なり）
     */
    private String shipToCompAddrLessThan;

    /**
     * SHIP TO COMPANY ADDRESS/???????（小なりイコール）
     */
    private String shipToCompAddrLessThanEqual;

    /**
     * SHIP TO COMPANY ADDRESS/???????（前方一致）
     */
    private String shipToCompAddrLikeFront;

    /**
     * SHIP TO COMPANY TEL/?????TEL（大なり）
     */
    private String shipToCompTelGreaterThan;

    /**
     * SHIP TO COMPANY TEL/?????TEL（大なりイコール）
     */
    private String shipToCompTelGreaterThanEqual;

    /**
     * SHIP TO COMPANY TEL/?????TEL（小なり）
     */
    private String shipToCompTelLessThan;

    /**
     * SHIP TO COMPANY TEL/?????TEL（小なりイコール）
     */
    private String shipToCompTelLessThanEqual;

    /**
     * SHIP TO COMPANY TEL/?????TEL（前方一致）
     */
    private String shipToCompTelLikeFront;

    /**
     * SHIP TO COMPANY DEPARTMENT NAME/?????????（大なり）
     */
    private String shipToCompDeptNmGreaterThan;

    /**
     * SHIP TO COMPANY DEPARTMENT NAME/?????????（大なりイコール）
     */
    private String shipToCompDeptNmGreaterThanEqual;

    /**
     * SHIP TO COMPANY DEPARTMENT NAME/?????????（小なり）
     */
    private String shipToCompDeptNmLessThan;

    /**
     * SHIP TO COMPANY DEPARTMENT NAME/?????????（小なりイコール）
     */
    private String shipToCompDeptNmLessThanEqual;

    /**
     * SHIP TO COMPANY DEPARTMENT NAME/?????????（前方一致）
     */
    private String shipToCompDeptNmLikeFront;

    /**
     * SHIP TO AttN NAME/????????（大なり）
     */
    private String shipToAttnNmGreaterThan;

    /**
     * SHIP TO AttN NAME/????????（大なりイコール）
     */
    private String shipToAttnNmGreaterThanEqual;

    /**
     * SHIP TO AttN NAME/????????（小なり）
     */
    private String shipToAttnNmLessThan;

    /**
     * SHIP TO AttN NAME/????????（小なりイコール）
     */
    private String shipToAttnNmLessThanEqual;

    /**
     * SHIP TO AttN NAME/????????（前方一致）
     */
    private String shipToAttnNmLikeFront;

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
     * PRICE TERMS/????  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（大なり）
     */
    private String priceTermsGreaterThan;

    /**
     * PRICE TERMS/????  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（大なりイコール）
     */
    private String priceTermsGreaterThanEqual;

    /**
     * PRICE TERMS/????  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（小なり）
     */
    private String priceTermsLessThan;

    /**
     * PRICE TERMS/????  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（小なりイコール）
     */
    private String priceTermsLessThanEqual;

    /**
     * PRICE TERMS/????  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（前方一致）
     */
    private String priceTermsLikeFront;

    /**
     * PRICE TERMS 1/????1  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（大なり）
     */
    private String priceTerms1GreaterThan;

    /**
     * PRICE TERMS 1/????1  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（大なりイコール）
     */
    private String priceTerms1GreaterThanEqual;

    /**
     * PRICE TERMS 1/????1  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（小なり）
     */
    private String priceTerms1LessThan;

    /**
     * PRICE TERMS 1/????1  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（小なりイコール）
     */
    private String priceTerms1LessThanEqual;

    /**
     * PRICE TERMS 1/????1  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（前方一致）
     */
    private String priceTerms1LikeFront;

    /**
     * PRICE TERMS 2/????2  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（大なり）
     */
    private String priceTerms2GreaterThan;

    /**
     * PRICE TERMS 2/????2  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（大なりイコール）
     */
    private String priceTerms2GreaterThanEqual;

    /**
     * PRICE TERMS 2/????2  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（小なり）
     */
    private String priceTerms2LessThan;

    /**
     * PRICE TERMS 2/????2  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（小なりイコール）
     */
    private String priceTerms2LessThanEqual;

    /**
     * PRICE TERMS 2/????2  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（前方一致）
     */
    private String priceTerms2LikeFront;

    /**
     * PAYMENT METHOD/????  L:L/C,
P:D/P,
A:D/A,
M:Payment in Advance,
R:Deferred Payment,
X:T/T RemiW1006ance（大なり）
     */
    private String payMethGreaterThan;

    /**
     * PAYMENT METHOD/????  L:L/C,
P:D/P,
A:D/A,
M:Payment in Advance,
R:Deferred Payment,
X:T/T RemiW1006ance（大なりイコール）
     */
    private String payMethGreaterThanEqual;

    /**
     * PAYMENT METHOD/????  L:L/C,
P:D/P,
A:D/A,
M:Payment in Advance,
R:Deferred Payment,
X:T/T RemiW1006ance（小なり）
     */
    private String payMethLessThan;

    /**
     * PAYMENT METHOD/????  L:L/C,
P:D/P,
A:D/A,
M:Payment in Advance,
R:Deferred Payment,
X:T/T RemiW1006ance（小なりイコール）
     */
    private String payMethLessThanEqual;

    /**
     * PAYMENT METHOD/????  L:L/C,
P:D/P,
A:D/A,
M:Payment in Advance,
R:Deferred Payment,
X:T/T RemiW1006ance（前方一致）
     */
    private String payMethLikeFront;

    /**
     * PAYMENT TERMS/????（大なり）
     */
    private String payTermsGreaterThan;

    /**
     * PAYMENT TERMS/????（大なりイコール）
     */
    private String payTermsGreaterThanEqual;

    /**
     * PAYMENT TERMS/????（小なり）
     */
    private String payTermsLessThan;

    /**
     * PAYMENT TERMS/????（小なりイコール）
     */
    private String payTermsLessThanEqual;

    /**
     * PAYMENT TERMS/????（前方一致）
     */
    private String payTermsLikeFront;

    /**
     * TRADE TERMS/????  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（大なり）
     */
    private String tradeTermsGreaterThan;

    /**
     * TRADE TERMS/????  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（大なりイコール）
     */
    private String tradeTermsGreaterThanEqual;

    /**
     * TRADE TERMS/????  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（小なり）
     */
    private String tradeTermsLessThan;

    /**
     * TRADE TERMS/????  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（小なりイコール）
     */
    private String tradeTermsLessThanEqual;

    /**
     * TRADE TERMS/????  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship（前方一致）
     */
    private String tradeTermsLikeFront;

    /**
     * TRANSPORT CODE/???????（大なり）
     */
    private String trnsCdGreaterThan;

    /**
     * TRANSPORT CODE/???????（大なりイコール）
     */
    private String trnsCdGreaterThanEqual;

    /**
     * TRANSPORT CODE/???????（小なり）
     */
    private String trnsCdLessThan;

    /**
     * TRANSPORT CODE/???????（小なりイコール）
     */
    private String trnsCdLessThanEqual;

    /**
     * TRANSPORT CODE/???????（前方一致）
     */
    private String trnsCdLikeFront;

    /**
     * SPLIT SHIPPING NG FLAG/?????????  Y:Prohibit Division, N:Allowed Division（大なり）
     */
    private String splitShippingNgFlgGreaterThan;

    /**
     * SPLIT SHIPPING NG FLAG/?????????  Y:Prohibit Division, N:Allowed Division（大なりイコール）
     */
    private String splitShippingNgFlgGreaterThanEqual;

    /**
     * SPLIT SHIPPING NG FLAG/?????????  Y:Prohibit Division, N:Allowed Division（小なり）
     */
    private String splitShippingNgFlgLessThan;

    /**
     * SPLIT SHIPPING NG FLAG/?????????  Y:Prohibit Division, N:Allowed Division（小なりイコール）
     */
    private String splitShippingNgFlgLessThanEqual;

    /**
     * SPLIT SHIPPING NG FLAG/?????????  Y:Prohibit Division, N:Allowed Division（前方一致）
     */
    private String splitShippingNgFlgLikeFront;

    /**
     * DUE DATE/??（大なりイコール）
     */
    private Date dueDtGreaterThanEqual;

    /**
     * DUE DATE/??（小なりイコール）
     */
    private Date dueDtLessThanEqual;

    /**
     * REQUEST SHIP DATE/?????（大なりイコール）
     */
    private Date requiredShipDtGreaterThanEqual;

    /**
     * REQUEST SHIP DATE/?????（小なりイコール）
     */
    private Date requiredShipDtLessThanEqual;

    /**
     * PACKING WAREHOUSE CODE/???????（大なり）
     */
    private String packingWhCdGreaterThan;

    /**
     * PACKING WAREHOUSE CODE/???????（大なりイコール）
     */
    private String packingWhCdGreaterThanEqual;

    /**
     * PACKING WAREHOUSE CODE/???????（小なり）
     */
    private String packingWhCdLessThan;

    /**
     * PACKING WAREHOUSE CODE/???????（小なりイコール）
     */
    private String packingWhCdLessThanEqual;

    /**
     * PACKING WAREHOUSE CODE/???????（前方一致）
     */
    private String packingWhCdLikeFront;

    /**
     * PACKING COMPANY LOCATION FLAG/???????  Y:Self, N:Other（大なり）
     */
    private String packingCompLocationFlgGreaterThan;

    /**
     * PACKING COMPANY LOCATION FLAG/???????  Y:Self, N:Other（大なりイコール）
     */
    private String packingCompLocationFlgGreaterThanEqual;

    /**
     * PACKING COMPANY LOCATION FLAG/???????  Y:Self, N:Other（小なり）
     */
    private String packingCompLocationFlgLessThan;

    /**
     * PACKING COMPANY LOCATION FLAG/???????  Y:Self, N:Other（小なりイコール）
     */
    private String packingCompLocationFlgLessThanEqual;

    /**
     * PACKING COMPANY LOCATION FLAG/???????  Y:Self, N:Other（前方一致）
     */
    private String packingCompLocationFlgLikeFront;

    /**
     * PACKING COMPANY CODE/???????（大なり）
     */
    private String packingCompCdGreaterThan;

    /**
     * PACKING COMPANY CODE/???????（大なりイコール）
     */
    private String packingCompCdGreaterThanEqual;

    /**
     * PACKING COMPANY CODE/???????（小なり）
     */
    private String packingCompCdLessThan;

    /**
     * PACKING COMPANY CODE/???????（小なりイコール）
     */
    private String packingCompCdLessThanEqual;

    /**
     * PACKING COMPANY CODE/???????（前方一致）
     */
    private String packingCompCdLikeFront;

    /**
     * PACKING COMPANY DEPARTMENT NAME/???????（大なり）
     */
    private String packingCompDeptNmGreaterThan;

    /**
     * PACKING COMPANY DEPARTMENT NAME/???????（大なりイコール）
     */
    private String packingCompDeptNmGreaterThanEqual;

    /**
     * PACKING COMPANY DEPARTMENT NAME/???????（小なり）
     */
    private String packingCompDeptNmLessThan;

    /**
     * PACKING COMPANY DEPARTMENT NAME/???????（小なりイコール）
     */
    private String packingCompDeptNmLessThanEqual;

    /**
     * PACKING COMPANY DEPARTMENT NAME/???????（前方一致）
     */
    private String packingCompDeptNmLikeFront;

    /**
     * REQUEST TO PACKING REMARKS/??????（大なり）
     */
    private String requestToPackingSecGreaterThan;

    /**
     * REQUEST TO PACKING REMARKS/??????（大なりイコール）
     */
    private String requestToPackingSecGreaterThanEqual;

    /**
     * REQUEST TO PACKING REMARKS/??????（小なり）
     */
    private String requestToPackingSecLessThan;

    /**
     * REQUEST TO PACKING REMARKS/??????（小なりイコール）
     */
    private String requestToPackingSecLessThanEqual;

    /**
     * REQUEST TO PACKING REMARKS/??????（前方一致）
     */
    private String requestToPackingSecLikeFront;

    /**
     * CASEMARK NOTATION/??????????（大なり）
     */
    private String casemarkNotationGreaterThan;

    /**
     * CASEMARK NOTATION/??????????（大なりイコール）
     */
    private String casemarkNotationGreaterThanEqual;

    /**
     * CASEMARK NOTATION/??????????（小なり）
     */
    private String casemarkNotationLessThan;

    /**
     * CASEMARK NOTATION/??????????（小なりイコール）
     */
    private String casemarkNotationLessThanEqual;

    /**
     * CASEMARK NOTATION/??????????（前方一致）
     */
    private String casemarkNotationLikeFront;

    /**
     * FREIGHT RESPONSIBLE CODE/????????（大なり）
     */
    private String freightResponsibleCdGreaterThan;

    /**
     * FREIGHT RESPONSIBLE CODE/????????（大なりイコール）
     */
    private String freightResponsibleCdGreaterThanEqual;

    /**
     * FREIGHT RESPONSIBLE CODE/????????（小なり）
     */
    private String freightResponsibleCdLessThan;

    /**
     * FREIGHT RESPONSIBLE CODE/????????（小なりイコール）
     */
    private String freightResponsibleCdLessThanEqual;

    /**
     * FREIGHT RESPONSIBLE CODE/????????（前方一致）
     */
    private String freightResponsibleCdLikeFront;

    /**
     * CATEGORY CODE 1/?????1（大なり）
     */
    private String ctgryCd1GreaterThan;

    /**
     * CATEGORY CODE 1/?????1（大なりイコール）
     */
    private String ctgryCd1GreaterThanEqual;

    /**
     * CATEGORY CODE 1/?????1（小なり）
     */
    private String ctgryCd1LessThan;

    /**
     * CATEGORY CODE 1/?????1（小なりイコール）
     */
    private String ctgryCd1LessThanEqual;

    /**
     * CATEGORY CODE 1/?????1（前方一致）
     */
    private String ctgryCd1LikeFront;

    /**
     * BUDGET NO 1/????1（大なり）
     */
    private String budgetNo1GreaterThan;

    /**
     * BUDGET NO 1/????1（大なりイコール）
     */
    private String budgetNo1GreaterThanEqual;

    /**
     * BUDGET NO 1/????1（小なり）
     */
    private String budgetNo1LessThan;

    /**
     * BUDGET NO 1/????1（小なりイコール）
     */
    private String budgetNo1LessThanEqual;

    /**
     * BUDGET NO 1/????1（前方一致）
     */
    private String budgetNo1LikeFront;

    /**
     * JOB NO 1/JOB NO1（大なり）
     */
    private String jobNo1GreaterThan;

    /**
     * JOB NO 1/JOB NO1（大なりイコール）
     */
    private String jobNo1GreaterThanEqual;

    /**
     * JOB NO 1/JOB NO1（小なり）
     */
    private String jobNo1LessThan;

    /**
     * JOB NO 1/JOB NO1（小なりイコール）
     */
    private String jobNo1LessThanEqual;

    /**
     * JOB NO 1/JOB NO1（前方一致）
     */
    private String jobNo1LikeFront;

    /**
     * CATEGORY CODE 2/?????2（大なり）
     */
    private String ctgryCd2GreaterThan;

    /**
     * CATEGORY CODE 2/?????2（大なりイコール）
     */
    private String ctgryCd2GreaterThanEqual;

    /**
     * CATEGORY CODE 2/?????2（小なり）
     */
    private String ctgryCd2LessThan;

    /**
     * CATEGORY CODE 2/?????2（小なりイコール）
     */
    private String ctgryCd2LessThanEqual;

    /**
     * CATEGORY CODE 2/?????2（前方一致）
     */
    private String ctgryCd2LikeFront;

    /**
     * BUDGET NO 2/????2（大なり）
     */
    private String budgetNo2GreaterThan;

    /**
     * BUDGET NO 2/????2（大なりイコール）
     */
    private String budgetNo2GreaterThanEqual;

    /**
     * BUDGET NO 2/????2（小なり）
     */
    private String budgetNo2LessThan;

    /**
     * BUDGET NO 2/????2（小なりイコール）
     */
    private String budgetNo2LessThanEqual;

    /**
     * BUDGET NO 2/????2（前方一致）
     */
    private String budgetNo2LikeFront;

    /**
     * JOB NO 2/JOB NO2（大なり）
     */
    private String jobNo2GreaterThan;

    /**
     * JOB NO 2/JOB NO2（大なりイコール）
     */
    private String jobNo2GreaterThanEqual;

    /**
     * JOB NO 2/JOB NO2（小なり）
     */
    private String jobNo2LessThan;

    /**
     * JOB NO 2/JOB NO2（小なりイコール）
     */
    private String jobNo2LessThanEqual;

    /**
     * JOB NO 2/JOB NO2（前方一致）
     */
    private String jobNo2LikeFront;

    /**
     * CATEGORY CODE 3/?????3（大なり）
     */
    private String ctgryCd3GreaterThan;

    /**
     * CATEGORY CODE 3/?????3（大なりイコール）
     */
    private String ctgryCd3GreaterThanEqual;

    /**
     * CATEGORY CODE 3/?????3（小なり）
     */
    private String ctgryCd3LessThan;

    /**
     * CATEGORY CODE 3/?????3（小なりイコール）
     */
    private String ctgryCd3LessThanEqual;

    /**
     * CATEGORY CODE 3/?????3（前方一致）
     */
    private String ctgryCd3LikeFront;

    /**
     * BUDGET NO 3/????3（大なり）
     */
    private String budgetNo3GreaterThan;

    /**
     * BUDGET NO 3/????3（大なりイコール）
     */
    private String budgetNo3GreaterThanEqual;

    /**
     * BUDGET NO 3/????3（小なり）
     */
    private String budgetNo3LessThan;

    /**
     * BUDGET NO 3/????3（小なりイコール）
     */
    private String budgetNo3LessThanEqual;

    /**
     * BUDGET NO 3/????3（前方一致）
     */
    private String budgetNo3LikeFront;

    /**
     * JOB NO 3/JOB NO3（大なり）
     */
    private String jobNo3GreaterThan;

    /**
     * JOB NO 3/JOB NO3（大なりイコール）
     */
    private String jobNo3GreaterThanEqual;

    /**
     * JOB NO 3/JOB NO3（小なり）
     */
    private String jobNo3LessThan;

    /**
     * JOB NO 3/JOB NO3（小なりイコール）
     */
    private String jobNo3LessThanEqual;

    /**
     * JOB NO 3/JOB NO3（前方一致）
     */
    private String jobNo3LikeFront;

    /**
     * PREPARE_EXP_INVOICE_CTGRY（大なり）
     */
    private String prepareExpInvoiceCtgryGreaterThan;

    /**
     * PREPARE_EXP_INVOICE_CTGRY（大なりイコール）
     */
    private String prepareExpInvoiceCtgryGreaterThanEqual;

    /**
     * PREPARE_EXP_INVOICE_CTGRY（小なり）
     */
    private String prepareExpInvoiceCtgryLessThan;

    /**
     * PREPARE_EXP_INVOICE_CTGRY（小なりイコール）
     */
    private String prepareExpInvoiceCtgryLessThanEqual;

    /**
     * PREPARE_EXP_INVOICE_CTGRY（前方一致）
     */
    private String prepareExpInvoiceCtgryLikeFront;

    /**
     * SUPPLIER INVOICE NO/????????NO（大なり）
     */
    private String supplierInvoiceNoGreaterThan;

    /**
     * SUPPLIER INVOICE NO/????????NO（大なりイコール）
     */
    private String supplierInvoiceNoGreaterThanEqual;

    /**
     * SUPPLIER INVOICE NO/????????NO（小なり）
     */
    private String supplierInvoiceNoLessThan;

    /**
     * SUPPLIER INVOICE NO/????????NO（小なりイコール）
     */
    private String supplierInvoiceNoLessThanEqual;

    /**
     * SUPPLIER INVOICE NO/????????NO（前方一致）
     */
    private String supplierInvoiceNoLikeFront;

    /**
     * CUSTOMER CODE/??????（大なり）
     */
    private String customerCdGreaterThan;

    /**
     * CUSTOMER CODE/??????（大なりイコール）
     */
    private String customerCdGreaterThanEqual;

    /**
     * CUSTOMER CODE/??????（小なり）
     */
    private String customerCdLessThan;

    /**
     * CUSTOMER CODE/??????（小なりイコール）
     */
    private String customerCdLessThanEqual;

    /**
     * CUSTOMER CODE/??????（前方一致）
     */
    private String customerCdLikeFront;

    /**
     * CREATE ORIGIN TYPE/?????（大なり）
     */
    private String createOriginTypGreaterThan;

    /**
     * CREATE ORIGIN TYPE/?????（大なりイコール）
     */
    private String createOriginTypGreaterThanEqual;

    /**
     * CREATE ORIGIN TYPE/?????（小なり）
     */
    private String createOriginTypLessThan;

    /**
     * CREATE ORIGIN TYPE/?????（小なりイコール）
     */
    private String createOriginTypLessThanEqual;

    /**
     * CREATE ORIGIN TYPE/?????（前方一致）
     */
    private String createOriginTypLikeFront;

    /**
     * REQUEST DATE/???（大なりイコール）
     */
    private Date requestDtGreaterThanEqual;

    /**
     * REQUEST DATE/???（小なりイコール）
     */
    private Date requestDtLessThanEqual;

    /**
     * REQUEST STATUS/???????  10:has not completed request,
20:has not print approval equest,
30:has not received packing Dep.,
40:has not Packed,
50:In progress of PKG,
60:Issue all CML,
90:Cancel（大なり）
     */
    private String requestStatusGreaterThan;

    /**
     * REQUEST STATUS/???????  10:has not completed request,
20:has not print approval equest,
30:has not received packing Dep.,
40:has not Packed,
50:In progress of PKG,
60:Issue all CML,
90:Cancel（大なりイコール）
     */
    private String requestStatusGreaterThanEqual;

    /**
     * REQUEST STATUS/???????  10:has not completed request,
20:has not print approval equest,
30:has not received packing Dep.,
40:has not Packed,
50:In progress of PKG,
60:Issue all CML,
90:Cancel（小なり）
     */
    private String requestStatusLessThan;

    /**
     * REQUEST STATUS/???????  10:has not completed request,
20:has not print approval equest,
30:has not received packing Dep.,
40:has not Packed,
50:In progress of PKG,
60:Issue all CML,
90:Cancel（小なりイコール）
     */
    private String requestStatusLessThanEqual;

    /**
     * REQUEST STATUS/???????  10:has not completed request,
20:has not print approval equest,
30:has not received packing Dep.,
40:has not Packed,
50:In progress of PKG,
60:Issue all CML,
90:Cancel（前方一致）
     */
    private String requestStatusLikeFront;

    /**
     * REQUEST LAST UPDATE DATE/???????（大なりイコール）
     */
    private Date requestLastUpdateDtGreaterThanEqual;

    /**
     * REQUEST LAST UPDATE DATE/???????（小なりイコール）
     */
    private Date requestLastUpdateDtLessThanEqual;

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
    public W1006ExpRequestCriteriaDomain() {
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
     * shipperCd のゲッターメソッドです。
     * 
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * shipperCd のセッターメソッドです。
     * 
     * @param shipperCd shipperCd に設定する
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * requestIssuerCompCd のゲッターメソッドです。
     * 
     * @return the requestIssuerCompCd
     */
    public String getRequestIssuerCompCd() {
        return requestIssuerCompCd;
    }

    /**
     * requestIssuerCompCd のセッターメソッドです。
     * 
     * @param requestIssuerCompCd requestIssuerCompCd に設定する
     */
    public void setRequestIssuerCompCd(String requestIssuerCompCd) {
        this.requestIssuerCompCd = requestIssuerCompCd;
    }

    /**
     * requestIssuerDeptNm のゲッターメソッドです。
     * 
     * @return the requestIssuerDeptNm
     */
    public String getRequestIssuerDeptNm() {
        return requestIssuerDeptNm;
    }

    /**
     * requestIssuerDeptNm のセッターメソッドです。
     * 
     * @param requestIssuerDeptNm requestIssuerDeptNm に設定する
     */
    public void setRequestIssuerDeptNm(String requestIssuerDeptNm) {
        this.requestIssuerDeptNm = requestIssuerDeptNm;
    }

    /**
     * requestIssuerId のゲッターメソッドです。
     * 
     * @return the requestIssuerId
     */
    public String getRequestIssuerId() {
        return requestIssuerId;
    }

    /**
     * requestIssuerId のセッターメソッドです。
     * 
     * @param requestIssuerId requestIssuerId に設定する
     */
    public void setRequestIssuerId(String requestIssuerId) {
        this.requestIssuerId = requestIssuerId;
    }

    /**
     * requestIssuerNm のゲッターメソッドです。
     * 
     * @return the requestIssuerNm
     */
    public String getRequestIssuerNm() {
        return requestIssuerNm;
    }

    /**
     * requestIssuerNm のセッターメソッドです。
     * 
     * @param requestIssuerNm requestIssuerNm に設定する
     */
    public void setRequestIssuerNm(String requestIssuerNm) {
        this.requestIssuerNm = requestIssuerNm;
    }

    /**
     * issuerCompTel のゲッターメソッドです。
     * 
     * @return the issuerCompTel
     */
    public String getIssuerCompTel() {
        return issuerCompTel;
    }

    /**
     * issuerCompTel のセッターメソッドです。
     * 
     * @param issuerCompTel issuerCompTel に設定する
     */
    public void setIssuerCompTel(String issuerCompTel) {
        this.issuerCompTel = issuerCompTel;
    }

    /**
     * issuerCompNiceNet のゲッターメソッドです。
     * 
     * @return the issuerCompNiceNet
     */
    public String getIssuerCompNiceNet() {
        return issuerCompNiceNet;
    }

    /**
     * issuerCompNiceNet のセッターメソッドです。
     * 
     * @param issuerCompNiceNet issuerCompNiceNet に設定する
     */
    public void setIssuerCompNiceNet(String issuerCompNiceNet) {
        this.issuerCompNiceNet = issuerCompNiceNet;
    }

    /**
     * invoiceCtgry のゲッターメソッドです。
     * 
     * @return the invoiceCtgry
     */
    public String getInvoiceCtgry() {
        return invoiceCtgry;
    }

    /**
     * invoiceCtgry のセッターメソッドです。
     * 
     * @param invoiceCtgry invoiceCtgry に設定する
     */
    public void setInvoiceCtgry(String invoiceCtgry) {
        this.invoiceCtgry = invoiceCtgry;
    }

    /**
     * reExpGoodsFlg のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlg
     */
    public String getReExpGoodsFlg() {
        return reExpGoodsFlg;
    }

    /**
     * reExpGoodsFlg のセッターメソッドです。
     * 
     * @param reExpGoodsFlg reExpGoodsFlg に設定する
     */
    public void setReExpGoodsFlg(String reExpGoodsFlg) {
        this.reExpGoodsFlg = reExpGoodsFlg;
    }

    /**
     * impInvoiceNo1 のゲッターメソッドです。
     * 
     * @return the impInvoiceNo1
     */
    public String getImpInvoiceNo1() {
        return impInvoiceNo1;
    }

    /**
     * impInvoiceNo1 のセッターメソッドです。
     * 
     * @param impInvoiceNo1 impInvoiceNo1 に設定する
     */
    public void setImpInvoiceNo1(String impInvoiceNo1) {
        this.impInvoiceNo1 = impInvoiceNo1;
    }

    /**
     * impInvoiceNo2 のゲッターメソッドです。
     * 
     * @return the impInvoiceNo2
     */
    public String getImpInvoiceNo2() {
        return impInvoiceNo2;
    }

    /**
     * impInvoiceNo2 のセッターメソッドです。
     * 
     * @param impInvoiceNo2 impInvoiceNo2 に設定する
     */
    public void setImpInvoiceNo2(String impInvoiceNo2) {
        this.impInvoiceNo2 = impInvoiceNo2;
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
     * description のゲッターメソッドです。
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * description のセッターメソッドです。
     * 
     * @param description description に設定する
     */
    public void setDescription(String description) {
        this.description = description;
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
     * customerShipTo のゲッターメソッドです。
     * 
     * @return the customerShipTo
     */
    public String getCustomerShipTo() {
        return customerShipTo;
    }

    /**
     * customerShipTo のセッターメソッドです。
     * 
     * @param customerShipTo customerShipTo に設定する
     */
    public void setCustomerShipTo(String customerShipTo) {
        this.customerShipTo = customerShipTo;
    }

    /**
     * accounteeCd のゲッターメソッドです。
     * 
     * @return the accounteeCd
     */
    public String getAccounteeCd() {
        return accounteeCd;
    }

    /**
     * accounteeCd のセッターメソッドです。
     * 
     * @param accounteeCd accounteeCd に設定する
     */
    public void setAccounteeCd(String accounteeCd) {
        this.accounteeCd = accounteeCd;
    }

    /**
     * accounteeCompNm のゲッターメソッドです。
     * 
     * @return the accounteeCompNm
     */
    public String getAccounteeCompNm() {
        return accounteeCompNm;
    }

    /**
     * accounteeCompNm のセッターメソッドです。
     * 
     * @param accounteeCompNm accounteeCompNm に設定する
     */
    public void setAccounteeCompNm(String accounteeCompNm) {
        this.accounteeCompNm = accounteeCompNm;
    }

    /**
     * accounteeCompAddr のゲッターメソッドです。
     * 
     * @return the accounteeCompAddr
     */
    public String getAccounteeCompAddr() {
        return accounteeCompAddr;
    }

    /**
     * accounteeCompAddr のセッターメソッドです。
     * 
     * @param accounteeCompAddr accounteeCompAddr に設定する
     */
    public void setAccounteeCompAddr(String accounteeCompAddr) {
        this.accounteeCompAddr = accounteeCompAddr;
    }

    /**
     * accounteeCompTel のゲッターメソッドです。
     * 
     * @return the accounteeCompTel
     */
    public String getAccounteeCompTel() {
        return accounteeCompTel;
    }

    /**
     * accounteeCompTel のセッターメソッドです。
     * 
     * @param accounteeCompTel accounteeCompTel に設定する
     */
    public void setAccounteeCompTel(String accounteeCompTel) {
        this.accounteeCompTel = accounteeCompTel;
    }

    /**
     * containerSortingKey のゲッターメソッドです。
     * 
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * containerSortingKey のセッターメソッドです。
     * 
     * @param containerSortingKey containerSortingKey に設定する
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * consigneeCd のゲッターメソッドです。
     * 
     * @return the consigneeCd
     */
    public String getConsigneeCd() {
        return consigneeCd;
    }

    /**
     * consigneeCd のセッターメソッドです。
     * 
     * @param consigneeCd consigneeCd に設定する
     */
    public void setConsigneeCd(String consigneeCd) {
        this.consigneeCd = consigneeCd;
    }

    /**
     * consigneeCompNm のゲッターメソッドです。
     * 
     * @return the consigneeCompNm
     */
    public String getConsigneeCompNm() {
        return consigneeCompNm;
    }

    /**
     * consigneeCompNm のセッターメソッドです。
     * 
     * @param consigneeCompNm consigneeCompNm に設定する
     */
    public void setConsigneeCompNm(String consigneeCompNm) {
        this.consigneeCompNm = consigneeCompNm;
    }

    /**
     * consigneeCntryCd のゲッターメソッドです。
     * 
     * @return the consigneeCntryCd
     */
    public String getConsigneeCntryCd() {
        return consigneeCntryCd;
    }

    /**
     * consigneeCntryCd のセッターメソッドです。
     * 
     * @param consigneeCntryCd consigneeCntryCd に設定する
     */
    public void setConsigneeCntryCd(String consigneeCntryCd) {
        this.consigneeCntryCd = consigneeCntryCd;
    }

    /**
     * consigneeCompAddr のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr
     */
    public String getConsigneeCompAddr() {
        return consigneeCompAddr;
    }

    /**
     * consigneeCompAddr のセッターメソッドです。
     * 
     * @param consigneeCompAddr consigneeCompAddr に設定する
     */
    public void setConsigneeCompAddr(String consigneeCompAddr) {
        this.consigneeCompAddr = consigneeCompAddr;
    }

    /**
     * consigneeCompTel のゲッターメソッドです。
     * 
     * @return the consigneeCompTel
     */
    public String getConsigneeCompTel() {
        return consigneeCompTel;
    }

    /**
     * consigneeCompTel のセッターメソッドです。
     * 
     * @param consigneeCompTel consigneeCompTel に設定する
     */
    public void setConsigneeCompTel(String consigneeCompTel) {
        this.consigneeCompTel = consigneeCompTel;
    }

    /**
     * shipToCd のゲッターメソッドです。
     * 
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * shipToCd のセッターメソッドです。
     * 
     * @param shipToCd shipToCd に設定する
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }

    /**
     * shipToCompNm のゲッターメソッドです。
     * 
     * @return the shipToCompNm
     */
    public String getShipToCompNm() {
        return shipToCompNm;
    }

    /**
     * shipToCompNm のセッターメソッドです。
     * 
     * @param shipToCompNm shipToCompNm に設定する
     */
    public void setShipToCompNm(String shipToCompNm) {
        this.shipToCompNm = shipToCompNm;
    }

    /**
     * shipToCntryCd のゲッターメソッドです。
     * 
     * @return the shipToCntryCd
     */
    public String getShipToCntryCd() {
        return shipToCntryCd;
    }

    /**
     * shipToCntryCd のセッターメソッドです。
     * 
     * @param shipToCntryCd shipToCntryCd に設定する
     */
    public void setShipToCntryCd(String shipToCntryCd) {
        this.shipToCntryCd = shipToCntryCd;
    }

    /**
     * shipToCompAddr のゲッターメソッドです。
     * 
     * @return the shipToCompAddr
     */
    public String getShipToCompAddr() {
        return shipToCompAddr;
    }

    /**
     * shipToCompAddr のセッターメソッドです。
     * 
     * @param shipToCompAddr shipToCompAddr に設定する
     */
    public void setShipToCompAddr(String shipToCompAddr) {
        this.shipToCompAddr = shipToCompAddr;
    }

    /**
     * shipToCompTel のゲッターメソッドです。
     * 
     * @return the shipToCompTel
     */
    public String getShipToCompTel() {
        return shipToCompTel;
    }

    /**
     * shipToCompTel のセッターメソッドです。
     * 
     * @param shipToCompTel shipToCompTel に設定する
     */
    public void setShipToCompTel(String shipToCompTel) {
        this.shipToCompTel = shipToCompTel;
    }

    /**
     * shipToCompDeptNm のゲッターメソッドです。
     * 
     * @return the shipToCompDeptNm
     */
    public String getShipToCompDeptNm() {
        return shipToCompDeptNm;
    }

    /**
     * shipToCompDeptNm のセッターメソッドです。
     * 
     * @param shipToCompDeptNm shipToCompDeptNm に設定する
     */
    public void setShipToCompDeptNm(String shipToCompDeptNm) {
        this.shipToCompDeptNm = shipToCompDeptNm;
    }

    /**
     * shipToAttnNm のゲッターメソッドです。
     * 
     * @return the shipToAttnNm
     */
    public String getShipToAttnNm() {
        return shipToAttnNm;
    }

    /**
     * shipToAttnNm のセッターメソッドです。
     * 
     * @param shipToAttnNm shipToAttnNm に設定する
     */
    public void setShipToAttnNm(String shipToAttnNm) {
        this.shipToAttnNm = shipToAttnNm;
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
     * priceTerms のゲッターメソッドです。
     * 
     * @return the priceTerms
     */
    public String getPriceTerms() {
        return priceTerms;
    }

    /**
     * priceTerms のセッターメソッドです。
     * 
     * @param priceTerms priceTerms に設定する
     */
    public void setPriceTerms(String priceTerms) {
        this.priceTerms = priceTerms;
    }

    /**
     * priceTerms1 のゲッターメソッドです。
     * 
     * @return the priceTerms1
     */
    public String getPriceTerms1() {
        return priceTerms1;
    }

    /**
     * priceTerms1 のセッターメソッドです。
     * 
     * @param priceTerms1 priceTerms1 に設定する
     */
    public void setPriceTerms1(String priceTerms1) {
        this.priceTerms1 = priceTerms1;
    }

    /**
     * priceTerms2 のゲッターメソッドです。
     * 
     * @return the priceTerms2
     */
    public String getPriceTerms2() {
        return priceTerms2;
    }

    /**
     * priceTerms2 のセッターメソッドです。
     * 
     * @param priceTerms2 priceTerms2 に設定する
     */
    public void setPriceTerms2(String priceTerms2) {
        this.priceTerms2 = priceTerms2;
    }

    /**
     * payMeth のゲッターメソッドです。
     * 
     * @return the payMeth
     */
    public String getPayMeth() {
        return payMeth;
    }

    /**
     * payMeth のセッターメソッドです。
     * 
     * @param payMeth payMeth に設定する
     */
    public void setPayMeth(String payMeth) {
        this.payMeth = payMeth;
    }

    /**
     * payTerms のゲッターメソッドです。
     * 
     * @return the payTerms
     */
    public String getPayTerms() {
        return payTerms;
    }

    /**
     * payTerms のセッターメソッドです。
     * 
     * @param payTerms payTerms に設定する
     */
    public void setPayTerms(String payTerms) {
        this.payTerms = payTerms;
    }

    /**
     * tradeTerms のゲッターメソッドです。
     * 
     * @return the tradeTerms
     */
    public String geW1006radeTerms() {
        return tradeTerms;
    }

    /**
     * tradeTerms のセッターメソッドです。
     * 
     * @param tradeTerms tradeTerms に設定する
     */
    public void seW1006radeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    /**
     * trnsCd のゲッターメソッドです。
     * 
     * @return the trnsCd
     */
    public String geW1006rnsCd() {
        return trnsCd;
    }

    /**
     * trnsCd のセッターメソッドです。
     * 
     * @param trnsCd trnsCd に設定する
     */
    public void seW1006rnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * splitShippingNgFlg のゲッターメソッドです。
     * 
     * @return the splitShippingNgFlg
     */
    public String getSplitShippingNgFlg() {
        return splitShippingNgFlg;
    }

    /**
     * splitShippingNgFlg のセッターメソッドです。
     * 
     * @param splitShippingNgFlg splitShippingNgFlg に設定する
     */
    public void setSplitShippingNgFlg(String splitShippingNgFlg) {
        this.splitShippingNgFlg = splitShippingNgFlg;
    }

    /**
     * dueDt のゲッターメソッドです。
     * 
     * @return the dueDt
     */
    public Date getDueDt() {
        return dueDt;
    }

    /**
     * dueDt のセッターメソッドです。
     * 
     * @param dueDt dueDt に設定する
     */
    public void setDueDt(Date dueDt) {
        this.dueDt = dueDt;
    }

    /**
     * requiredShipDt のゲッターメソッドです。
     * 
     * @return the requiredShipDt
     */
    public Date getRequiredShipDt() {
        return requiredShipDt;
    }

    /**
     * requiredShipDt のセッターメソッドです。
     * 
     * @param requiredShipDt requiredShipDt に設定する
     */
    public void setRequiredShipDt(Date requiredShipDt) {
        this.requiredShipDt = requiredShipDt;
    }

    /**
     * packingWhCd のゲッターメソッドです。
     * 
     * @return the packingWhCd
     */
    public String getPackingWhCd() {
        return packingWhCd;
    }

    /**
     * packingWhCd のセッターメソッドです。
     * 
     * @param packingWhCd packingWhCd に設定する
     */
    public void setPackingWhCd(String packingWhCd) {
        this.packingWhCd = packingWhCd;
    }

    /**
     * packingCompLocationFlg のゲッターメソッドです。
     * 
     * @return the packingCompLocationFlg
     */
    public String getPackingCompLocationFlg() {
        return packingCompLocationFlg;
    }

    /**
     * packingCompLocationFlg のセッターメソッドです。
     * 
     * @param packingCompLocationFlg packingCompLocationFlg に設定する
     */
    public void setPackingCompLocationFlg(String packingCompLocationFlg) {
        this.packingCompLocationFlg = packingCompLocationFlg;
    }

    /**
     * packingCompCd のゲッターメソッドです。
     * 
     * @return the packingCompCd
     */
    public String getPackingCompCd() {
        return packingCompCd;
    }

    /**
     * packingCompCd のセッターメソッドです。
     * 
     * @param packingCompCd packingCompCd に設定する
     */
    public void setPackingCompCd(String packingCompCd) {
        this.packingCompCd = packingCompCd;
    }

    /**
     * packingCompDeptNm のゲッターメソッドです。
     * 
     * @return the packingCompDeptNm
     */
    public String getPackingCompDeptNm() {
        return packingCompDeptNm;
    }

    /**
     * packingCompDeptNm のセッターメソッドです。
     * 
     * @param packingCompDeptNm packingCompDeptNm に設定する
     */
    public void setPackingCompDeptNm(String packingCompDeptNm) {
        this.packingCompDeptNm = packingCompDeptNm;
    }

    /**
     * requestToPackingSec のゲッターメソッドです。
     * 
     * @return the requestToPackingSec
     */
    public String getRequestToPackingSec() {
        return requestToPackingSec;
    }

    /**
     * requestToPackingSec のセッターメソッドです。
     * 
     * @param requestToPackingSec requestToPackingSec に設定する
     */
    public void setRequestToPackingSec(String requestToPackingSec) {
        this.requestToPackingSec = requestToPackingSec;
    }

    /**
     * casemarkNotation のゲッターメソッドです。
     * 
     * @return the casemarkNotation
     */
    public String getCasemarkNotation() {
        return casemarkNotation;
    }

    /**
     * casemarkNotation のセッターメソッドです。
     * 
     * @param casemarkNotation casemarkNotation に設定する
     */
    public void setCasemarkNotation(String casemarkNotation) {
        this.casemarkNotation = casemarkNotation;
    }

    /**
     * freightResponsibleCd のゲッターメソッドです。
     * 
     * @return the freightResponsibleCd
     */
    public String getFreightResponsibleCd() {
        return freightResponsibleCd;
    }

    /**
     * freightResponsibleCd のセッターメソッドです。
     * 
     * @param freightResponsibleCd freightResponsibleCd に設定する
     */
    public void setFreightResponsibleCd(String freightResponsibleCd) {
        this.freightResponsibleCd = freightResponsibleCd;
    }

    /**
     * ctgryCd1 のゲッターメソッドです。
     * 
     * @return the ctgryCd1
     */
    public String getCtgryCd1() {
        return ctgryCd1;
    }

    /**
     * ctgryCd1 のセッターメソッドです。
     * 
     * @param ctgryCd1 ctgryCd1 に設定する
     */
    public void setCtgryCd1(String ctgryCd1) {
        this.ctgryCd1 = ctgryCd1;
    }

    /**
     * budgetNo1 のゲッターメソッドです。
     * 
     * @return the budgetNo1
     */
    public String getBudgetNo1() {
        return budgetNo1;
    }

    /**
     * budgetNo1 のセッターメソッドです。
     * 
     * @param budgetNo1 budgetNo1 に設定する
     */
    public void setBudgetNo1(String budgetNo1) {
        this.budgetNo1 = budgetNo1;
    }

    /**
     * jobNo1 のゲッターメソッドです。
     * 
     * @return the jobNo1
     */
    public String getJobNo1() {
        return jobNo1;
    }

    /**
     * jobNo1 のセッターメソッドです。
     * 
     * @param jobNo1 jobNo1 に設定する
     */
    public void setJobNo1(String jobNo1) {
        this.jobNo1 = jobNo1;
    }

    /**
     * per1 のゲッターメソッドです。
     * 
     * @return the per1
     */
    public BigDecimal getPer1() {
        return per1;
    }

    /**
     * per1 のセッターメソッドです。
     * 
     * @param per1 per1 に設定する
     */
    public void setPer1(BigDecimal per1) {
        this.per1 = per1;
    }

    /**
     * ctgryCd2 のゲッターメソッドです。
     * 
     * @return the ctgryCd2
     */
    public String getCtgryCd2() {
        return ctgryCd2;
    }

    /**
     * ctgryCd2 のセッターメソッドです。
     * 
     * @param ctgryCd2 ctgryCd2 に設定する
     */
    public void setCtgryCd2(String ctgryCd2) {
        this.ctgryCd2 = ctgryCd2;
    }

    /**
     * budgetNo2 のゲッターメソッドです。
     * 
     * @return the budgetNo2
     */
    public String getBudgetNo2() {
        return budgetNo2;
    }

    /**
     * budgetNo2 のセッターメソッドです。
     * 
     * @param budgetNo2 budgetNo2 に設定する
     */
    public void setBudgetNo2(String budgetNo2) {
        this.budgetNo2 = budgetNo2;
    }

    /**
     * jobNo2 のゲッターメソッドです。
     * 
     * @return the jobNo2
     */
    public String getJobNo2() {
        return jobNo2;
    }

    /**
     * jobNo2 のセッターメソッドです。
     * 
     * @param jobNo2 jobNo2 に設定する
     */
    public void setJobNo2(String jobNo2) {
        this.jobNo2 = jobNo2;
    }

    /**
     * per2 のゲッターメソッドです。
     * 
     * @return the per2
     */
    public BigDecimal getPer2() {
        return per2;
    }

    /**
     * per2 のセッターメソッドです。
     * 
     * @param per2 per2 に設定する
     */
    public void setPer2(BigDecimal per2) {
        this.per2 = per2;
    }

    /**
     * ctgryCd3 のゲッターメソッドです。
     * 
     * @return the ctgryCd3
     */
    public String getCtgryCd3() {
        return ctgryCd3;
    }

    /**
     * ctgryCd3 のセッターメソッドです。
     * 
     * @param ctgryCd3 ctgryCd3 に設定する
     */
    public void setCtgryCd3(String ctgryCd3) {
        this.ctgryCd3 = ctgryCd3;
    }

    /**
     * budgetNo3 のゲッターメソッドです。
     * 
     * @return the budgetNo3
     */
    public String getBudgetNo3() {
        return budgetNo3;
    }

    /**
     * budgetNo3 のセッターメソッドです。
     * 
     * @param budgetNo3 budgetNo3 に設定する
     */
    public void setBudgetNo3(String budgetNo3) {
        this.budgetNo3 = budgetNo3;
    }

    /**
     * jobNo3 のゲッターメソッドです。
     * 
     * @return the jobNo3
     */
    public String getJobNo3() {
        return jobNo3;
    }

    /**
     * jobNo3 のセッターメソッドです。
     * 
     * @param jobNo3 jobNo3 に設定する
     */
    public void setJobNo3(String jobNo3) {
        this.jobNo3 = jobNo3;
    }

    /**
     * per3 のゲッターメソッドです。
     * 
     * @return the per3
     */
    public BigDecimal getPer3() {
        return per3;
    }

    /**
     * per3 のセッターメソッドです。
     * 
     * @param per3 per3 に設定する
     */
    public void setPer3(BigDecimal per3) {
        this.per3 = per3;
    }

    /**
     * prepareExpInvoiceCtgry のゲッターメソッドです。
     * 
     * @return the prepareExpInvoiceCtgry
     */
    public String getPrepareExpInvoiceCtgry() {
        return prepareExpInvoiceCtgry;
    }

    /**
     * prepareExpInvoiceCtgry のセッターメソッドです。
     * 
     * @param prepareExpInvoiceCtgry prepareExpInvoiceCtgry に設定する
     */
    public void setPrepareExpInvoiceCtgry(String prepareExpInvoiceCtgry) {
        this.prepareExpInvoiceCtgry = prepareExpInvoiceCtgry;
    }

    /**
     * supplierInvoiceNo のゲッターメソッドです。
     * 
     * @return the supplierInvoiceNo
     */
    public String getSupplierInvoiceNo() {
        return supplierInvoiceNo;
    }

    /**
     * supplierInvoiceNo のセッターメソッドです。
     * 
     * @param supplierInvoiceNo supplierInvoiceNo に設定する
     */
    public void setSupplierInvoiceNo(String supplierInvoiceNo) {
        this.supplierInvoiceNo = supplierInvoiceNo;
    }

    /**
     * customerCd のゲッターメソッドです。
     * 
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * customerCd のセッターメソッドです。
     * 
     * @param customerCd customerCd に設定する
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * createOriginTyp のゲッターメソッドです。
     * 
     * @return the createOriginTyp
     */
    public String getCreateOriginTyp() {
        return createOriginTyp;
    }

    /**
     * createOriginTyp のセッターメソッドです。
     * 
     * @param createOriginTyp createOriginTyp に設定する
     */
    public void setCreateOriginTyp(String createOriginTyp) {
        this.createOriginTyp = createOriginTyp;
    }

    /**
     * requestDt のゲッターメソッドです。
     * 
     * @return the requestDt
     */
    public Date getRequestDt() {
        return requestDt;
    }

    /**
     * requestDt のセッターメソッドです。
     * 
     * @param requestDt requestDt に設定する
     */
    public void setRequestDt(Date requestDt) {
        this.requestDt = requestDt;
    }

    /**
     * requestStatus のゲッターメソッドです。
     * 
     * @return the requestStatus
     */
    public String getRequestStatus() {
        return requestStatus;
    }

    /**
     * requestStatus のセッターメソッドです。
     * 
     * @param requestStatus requestStatus に設定する
     */
    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    /**
     * requestLastUpdateDt のゲッターメソッドです。
     * 
     * @return the requestLastUpdateDt
     */
    public Date getRequestLastUpdateDt() {
        return requestLastUpdateDt;
    }

    /**
     * requestLastUpdateDt のセッターメソッドです。
     * 
     * @param requestLastUpdateDt requestLastUpdateDt に設定する
     */
    public void setRequestLastUpdateDt(Date requestLastUpdateDt) {
        this.requestLastUpdateDt = requestLastUpdateDt;
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
     * shipperCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCdGreaterThan
     */
    public String getShipperCdGreaterThan() {
        return shipperCdGreaterThan;
    }

    /**
     * shipperCdGreaterThan のセッターメソッドです。
     * 
     * @param shipperCdGreaterThan shipperCdGreaterThan に設定する
     */
    public void setShipperCdGreaterThan(String shipperCdGreaterThan) {
        this.shipperCdGreaterThan = shipperCdGreaterThan;
    }

    /**
     * shipperCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCdGreaterThanEqual
     */
    public String getShipperCdGreaterThanEqual() {
        return shipperCdGreaterThanEqual;
    }

    /**
     * shipperCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCdGreaterThanEqual shipperCdGreaterThanEqual に設定する
     */
    public void setShipperCdGreaterThanEqual(String shipperCdGreaterThanEqual) {
        this.shipperCdGreaterThanEqual = shipperCdGreaterThanEqual;
    }

    /**
     * shipperCdLessThan のゲッターメソッドです。
     * 
     * @return the shipperCdLessThan
     */
    public String getShipperCdLessThan() {
        return shipperCdLessThan;
    }

    /**
     * shipperCdLessThan のセッターメソッドです。
     * 
     * @param shipperCdLessThan shipperCdLessThan に設定する
     */
    public void setShipperCdLessThan(String shipperCdLessThan) {
        this.shipperCdLessThan = shipperCdLessThan;
    }

    /**
     * shipperCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCdLessThanEqual
     */
    public String getShipperCdLessThanEqual() {
        return shipperCdLessThanEqual;
    }

    /**
     * shipperCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipperCdLessThanEqual shipperCdLessThanEqual に設定する
     */
    public void setShipperCdLessThanEqual(String shipperCdLessThanEqual) {
        this.shipperCdLessThanEqual = shipperCdLessThanEqual;
    }

    /**
     * shipperCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipperCdLikeFront
     */
    public String getShipperCdLikeFront() {
        return shipperCdLikeFront;
    }

    /**
     * shipperCdLikeFront のセッターメソッドです。
     * 
     * @param shipperCdLikeFront shipperCdLikeFront に設定する
     */
    public void setShipperCdLikeFront(String shipperCdLikeFront) {
        this.shipperCdLikeFront = shipperCdLikeFront;
    }

    /**
     * requestIssuerCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the requestIssuerCompCdGreaterThan
     */
    public String getRequestIssuerCompCdGreaterThan() {
        return requestIssuerCompCdGreaterThan;
    }

    /**
     * requestIssuerCompCdGreaterThan のセッターメソッドです。
     * 
     * @param requestIssuerCompCdGreaterThan requestIssuerCompCdGreaterThan に設定する
     */
    public void setRequestIssuerCompCdGreaterThan(String requestIssuerCompCdGreaterThan) {
        this.requestIssuerCompCdGreaterThan = requestIssuerCompCdGreaterThan;
    }

    /**
     * requestIssuerCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the requestIssuerCompCdGreaterThanEqual
     */
    public String getRequestIssuerCompCdGreaterThanEqual() {
        return requestIssuerCompCdGreaterThanEqual;
    }

    /**
     * requestIssuerCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param requestIssuerCompCdGreaterThanEqual requestIssuerCompCdGreaterThanEqual に設定する
     */
    public void setRequestIssuerCompCdGreaterThanEqual(String requestIssuerCompCdGreaterThanEqual) {
        this.requestIssuerCompCdGreaterThanEqual = requestIssuerCompCdGreaterThanEqual;
    }

    /**
     * requestIssuerCompCdLessThan のゲッターメソッドです。
     * 
     * @return the requestIssuerCompCdLessThan
     */
    public String getRequestIssuerCompCdLessThan() {
        return requestIssuerCompCdLessThan;
    }

    /**
     * requestIssuerCompCdLessThan のセッターメソッドです。
     * 
     * @param requestIssuerCompCdLessThan requestIssuerCompCdLessThan に設定する
     */
    public void setRequestIssuerCompCdLessThan(String requestIssuerCompCdLessThan) {
        this.requestIssuerCompCdLessThan = requestIssuerCompCdLessThan;
    }

    /**
     * requestIssuerCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the requestIssuerCompCdLessThanEqual
     */
    public String getRequestIssuerCompCdLessThanEqual() {
        return requestIssuerCompCdLessThanEqual;
    }

    /**
     * requestIssuerCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param requestIssuerCompCdLessThanEqual requestIssuerCompCdLessThanEqual に設定する
     */
    public void setRequestIssuerCompCdLessThanEqual(String requestIssuerCompCdLessThanEqual) {
        this.requestIssuerCompCdLessThanEqual = requestIssuerCompCdLessThanEqual;
    }

    /**
     * requestIssuerCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the requestIssuerCompCdLikeFront
     */
    public String getRequestIssuerCompCdLikeFront() {
        return requestIssuerCompCdLikeFront;
    }

    /**
     * requestIssuerCompCdLikeFront のセッターメソッドです。
     * 
     * @param requestIssuerCompCdLikeFront requestIssuerCompCdLikeFront に設定する
     */
    public void setRequestIssuerCompCdLikeFront(String requestIssuerCompCdLikeFront) {
        this.requestIssuerCompCdLikeFront = requestIssuerCompCdLikeFront;
    }

    /**
     * requestIssuerDeptNmGreaterThan のゲッターメソッドです。
     * 
     * @return the requestIssuerDeptNmGreaterThan
     */
    public String getRequestIssuerDeptNmGreaterThan() {
        return requestIssuerDeptNmGreaterThan;
    }

    /**
     * requestIssuerDeptNmGreaterThan のセッターメソッドです。
     * 
     * @param requestIssuerDeptNmGreaterThan requestIssuerDeptNmGreaterThan に設定する
     */
    public void setRequestIssuerDeptNmGreaterThan(String requestIssuerDeptNmGreaterThan) {
        this.requestIssuerDeptNmGreaterThan = requestIssuerDeptNmGreaterThan;
    }

    /**
     * requestIssuerDeptNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the requestIssuerDeptNmGreaterThanEqual
     */
    public String getRequestIssuerDeptNmGreaterThanEqual() {
        return requestIssuerDeptNmGreaterThanEqual;
    }

    /**
     * requestIssuerDeptNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param requestIssuerDeptNmGreaterThanEqual requestIssuerDeptNmGreaterThanEqual に設定する
     */
    public void setRequestIssuerDeptNmGreaterThanEqual(String requestIssuerDeptNmGreaterThanEqual) {
        this.requestIssuerDeptNmGreaterThanEqual = requestIssuerDeptNmGreaterThanEqual;
    }

    /**
     * requestIssuerDeptNmLessThan のゲッターメソッドです。
     * 
     * @return the requestIssuerDeptNmLessThan
     */
    public String getRequestIssuerDeptNmLessThan() {
        return requestIssuerDeptNmLessThan;
    }

    /**
     * requestIssuerDeptNmLessThan のセッターメソッドです。
     * 
     * @param requestIssuerDeptNmLessThan requestIssuerDeptNmLessThan に設定する
     */
    public void setRequestIssuerDeptNmLessThan(String requestIssuerDeptNmLessThan) {
        this.requestIssuerDeptNmLessThan = requestIssuerDeptNmLessThan;
    }

    /**
     * requestIssuerDeptNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the requestIssuerDeptNmLessThanEqual
     */
    public String getRequestIssuerDeptNmLessThanEqual() {
        return requestIssuerDeptNmLessThanEqual;
    }

    /**
     * requestIssuerDeptNmLessThanEqual のセッターメソッドです。
     * 
     * @param requestIssuerDeptNmLessThanEqual requestIssuerDeptNmLessThanEqual に設定する
     */
    public void setRequestIssuerDeptNmLessThanEqual(String requestIssuerDeptNmLessThanEqual) {
        this.requestIssuerDeptNmLessThanEqual = requestIssuerDeptNmLessThanEqual;
    }

    /**
     * requestIssuerDeptNmLikeFront のゲッターメソッドです。
     * 
     * @return the requestIssuerDeptNmLikeFront
     */
    public String getRequestIssuerDeptNmLikeFront() {
        return requestIssuerDeptNmLikeFront;
    }

    /**
     * requestIssuerDeptNmLikeFront のセッターメソッドです。
     * 
     * @param requestIssuerDeptNmLikeFront requestIssuerDeptNmLikeFront に設定する
     */
    public void setRequestIssuerDeptNmLikeFront(String requestIssuerDeptNmLikeFront) {
        this.requestIssuerDeptNmLikeFront = requestIssuerDeptNmLikeFront;
    }

    /**
     * requestIssuerIdGreaterThan のゲッターメソッドです。
     * 
     * @return the requestIssuerIdGreaterThan
     */
    public String getRequestIssuerIdGreaterThan() {
        return requestIssuerIdGreaterThan;
    }

    /**
     * requestIssuerIdGreaterThan のセッターメソッドです。
     * 
     * @param requestIssuerIdGreaterThan requestIssuerIdGreaterThan に設定する
     */
    public void setRequestIssuerIdGreaterThan(String requestIssuerIdGreaterThan) {
        this.requestIssuerIdGreaterThan = requestIssuerIdGreaterThan;
    }

    /**
     * requestIssuerIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the requestIssuerIdGreaterThanEqual
     */
    public String getRequestIssuerIdGreaterThanEqual() {
        return requestIssuerIdGreaterThanEqual;
    }

    /**
     * requestIssuerIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param requestIssuerIdGreaterThanEqual requestIssuerIdGreaterThanEqual に設定する
     */
    public void setRequestIssuerIdGreaterThanEqual(String requestIssuerIdGreaterThanEqual) {
        this.requestIssuerIdGreaterThanEqual = requestIssuerIdGreaterThanEqual;
    }

    /**
     * requestIssuerIdLessThan のゲッターメソッドです。
     * 
     * @return the requestIssuerIdLessThan
     */
    public String getRequestIssuerIdLessThan() {
        return requestIssuerIdLessThan;
    }

    /**
     * requestIssuerIdLessThan のセッターメソッドです。
     * 
     * @param requestIssuerIdLessThan requestIssuerIdLessThan に設定する
     */
    public void setRequestIssuerIdLessThan(String requestIssuerIdLessThan) {
        this.requestIssuerIdLessThan = requestIssuerIdLessThan;
    }

    /**
     * requestIssuerIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the requestIssuerIdLessThanEqual
     */
    public String getRequestIssuerIdLessThanEqual() {
        return requestIssuerIdLessThanEqual;
    }

    /**
     * requestIssuerIdLessThanEqual のセッターメソッドです。
     * 
     * @param requestIssuerIdLessThanEqual requestIssuerIdLessThanEqual に設定する
     */
    public void setRequestIssuerIdLessThanEqual(String requestIssuerIdLessThanEqual) {
        this.requestIssuerIdLessThanEqual = requestIssuerIdLessThanEqual;
    }

    /**
     * requestIssuerIdLikeFront のゲッターメソッドです。
     * 
     * @return the requestIssuerIdLikeFront
     */
    public String getRequestIssuerIdLikeFront() {
        return requestIssuerIdLikeFront;
    }

    /**
     * requestIssuerIdLikeFront のセッターメソッドです。
     * 
     * @param requestIssuerIdLikeFront requestIssuerIdLikeFront に設定する
     */
    public void setRequestIssuerIdLikeFront(String requestIssuerIdLikeFront) {
        this.requestIssuerIdLikeFront = requestIssuerIdLikeFront;
    }

    /**
     * requestIssuerNmGreaterThan のゲッターメソッドです。
     * 
     * @return the requestIssuerNmGreaterThan
     */
    public String getRequestIssuerNmGreaterThan() {
        return requestIssuerNmGreaterThan;
    }

    /**
     * requestIssuerNmGreaterThan のセッターメソッドです。
     * 
     * @param requestIssuerNmGreaterThan requestIssuerNmGreaterThan に設定する
     */
    public void setRequestIssuerNmGreaterThan(String requestIssuerNmGreaterThan) {
        this.requestIssuerNmGreaterThan = requestIssuerNmGreaterThan;
    }

    /**
     * requestIssuerNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the requestIssuerNmGreaterThanEqual
     */
    public String getRequestIssuerNmGreaterThanEqual() {
        return requestIssuerNmGreaterThanEqual;
    }

    /**
     * requestIssuerNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param requestIssuerNmGreaterThanEqual requestIssuerNmGreaterThanEqual に設定する
     */
    public void setRequestIssuerNmGreaterThanEqual(String requestIssuerNmGreaterThanEqual) {
        this.requestIssuerNmGreaterThanEqual = requestIssuerNmGreaterThanEqual;
    }

    /**
     * requestIssuerNmLessThan のゲッターメソッドです。
     * 
     * @return the requestIssuerNmLessThan
     */
    public String getRequestIssuerNmLessThan() {
        return requestIssuerNmLessThan;
    }

    /**
     * requestIssuerNmLessThan のセッターメソッドです。
     * 
     * @param requestIssuerNmLessThan requestIssuerNmLessThan に設定する
     */
    public void setRequestIssuerNmLessThan(String requestIssuerNmLessThan) {
        this.requestIssuerNmLessThan = requestIssuerNmLessThan;
    }

    /**
     * requestIssuerNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the requestIssuerNmLessThanEqual
     */
    public String getRequestIssuerNmLessThanEqual() {
        return requestIssuerNmLessThanEqual;
    }

    /**
     * requestIssuerNmLessThanEqual のセッターメソッドです。
     * 
     * @param requestIssuerNmLessThanEqual requestIssuerNmLessThanEqual に設定する
     */
    public void setRequestIssuerNmLessThanEqual(String requestIssuerNmLessThanEqual) {
        this.requestIssuerNmLessThanEqual = requestIssuerNmLessThanEqual;
    }

    /**
     * requestIssuerNmLikeFront のゲッターメソッドです。
     * 
     * @return the requestIssuerNmLikeFront
     */
    public String getRequestIssuerNmLikeFront() {
        return requestIssuerNmLikeFront;
    }

    /**
     * requestIssuerNmLikeFront のセッターメソッドです。
     * 
     * @param requestIssuerNmLikeFront requestIssuerNmLikeFront に設定する
     */
    public void setRequestIssuerNmLikeFront(String requestIssuerNmLikeFront) {
        this.requestIssuerNmLikeFront = requestIssuerNmLikeFront;
    }

    /**
     * issuerCompTelGreaterThan のゲッターメソッドです。
     * 
     * @return the issuerCompTelGreaterThan
     */
    public String getIssuerCompTelGreaterThan() {
        return issuerCompTelGreaterThan;
    }

    /**
     * issuerCompTelGreaterThan のセッターメソッドです。
     * 
     * @param issuerCompTelGreaterThan issuerCompTelGreaterThan に設定する
     */
    public void setIssuerCompTelGreaterThan(String issuerCompTelGreaterThan) {
        this.issuerCompTelGreaterThan = issuerCompTelGreaterThan;
    }

    /**
     * issuerCompTelGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the issuerCompTelGreaterThanEqual
     */
    public String getIssuerCompTelGreaterThanEqual() {
        return issuerCompTelGreaterThanEqual;
    }

    /**
     * issuerCompTelGreaterThanEqual のセッターメソッドです。
     * 
     * @param issuerCompTelGreaterThanEqual issuerCompTelGreaterThanEqual に設定する
     */
    public void setIssuerCompTelGreaterThanEqual(String issuerCompTelGreaterThanEqual) {
        this.issuerCompTelGreaterThanEqual = issuerCompTelGreaterThanEqual;
    }

    /**
     * issuerCompTelLessThan のゲッターメソッドです。
     * 
     * @return the issuerCompTelLessThan
     */
    public String getIssuerCompTelLessThan() {
        return issuerCompTelLessThan;
    }

    /**
     * issuerCompTelLessThan のセッターメソッドです。
     * 
     * @param issuerCompTelLessThan issuerCompTelLessThan に設定する
     */
    public void setIssuerCompTelLessThan(String issuerCompTelLessThan) {
        this.issuerCompTelLessThan = issuerCompTelLessThan;
    }

    /**
     * issuerCompTelLessThanEqual のゲッターメソッドです。
     * 
     * @return the issuerCompTelLessThanEqual
     */
    public String getIssuerCompTelLessThanEqual() {
        return issuerCompTelLessThanEqual;
    }

    /**
     * issuerCompTelLessThanEqual のセッターメソッドです。
     * 
     * @param issuerCompTelLessThanEqual issuerCompTelLessThanEqual に設定する
     */
    public void setIssuerCompTelLessThanEqual(String issuerCompTelLessThanEqual) {
        this.issuerCompTelLessThanEqual = issuerCompTelLessThanEqual;
    }

    /**
     * issuerCompTelLikeFront のゲッターメソッドです。
     * 
     * @return the issuerCompTelLikeFront
     */
    public String getIssuerCompTelLikeFront() {
        return issuerCompTelLikeFront;
    }

    /**
     * issuerCompTelLikeFront のセッターメソッドです。
     * 
     * @param issuerCompTelLikeFront issuerCompTelLikeFront に設定する
     */
    public void setIssuerCompTelLikeFront(String issuerCompTelLikeFront) {
        this.issuerCompTelLikeFront = issuerCompTelLikeFront;
    }

    /**
     * issuerCompNiceNetGreaterThan のゲッターメソッドです。
     * 
     * @return the issuerCompNiceNetGreaterThan
     */
    public String getIssuerCompNiceNetGreaterThan() {
        return issuerCompNiceNetGreaterThan;
    }

    /**
     * issuerCompNiceNetGreaterThan のセッターメソッドです。
     * 
     * @param issuerCompNiceNetGreaterThan issuerCompNiceNetGreaterThan に設定する
     */
    public void setIssuerCompNiceNetGreaterThan(String issuerCompNiceNetGreaterThan) {
        this.issuerCompNiceNetGreaterThan = issuerCompNiceNetGreaterThan;
    }

    /**
     * issuerCompNiceNetGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the issuerCompNiceNetGreaterThanEqual
     */
    public String getIssuerCompNiceNetGreaterThanEqual() {
        return issuerCompNiceNetGreaterThanEqual;
    }

    /**
     * issuerCompNiceNetGreaterThanEqual のセッターメソッドです。
     * 
     * @param issuerCompNiceNetGreaterThanEqual issuerCompNiceNetGreaterThanEqual に設定する
     */
    public void setIssuerCompNiceNetGreaterThanEqual(String issuerCompNiceNetGreaterThanEqual) {
        this.issuerCompNiceNetGreaterThanEqual = issuerCompNiceNetGreaterThanEqual;
    }

    /**
     * issuerCompNiceNetLessThan のゲッターメソッドです。
     * 
     * @return the issuerCompNiceNetLessThan
     */
    public String getIssuerCompNiceNetLessThan() {
        return issuerCompNiceNetLessThan;
    }

    /**
     * issuerCompNiceNetLessThan のセッターメソッドです。
     * 
     * @param issuerCompNiceNetLessThan issuerCompNiceNetLessThan に設定する
     */
    public void setIssuerCompNiceNetLessThan(String issuerCompNiceNetLessThan) {
        this.issuerCompNiceNetLessThan = issuerCompNiceNetLessThan;
    }

    /**
     * issuerCompNiceNetLessThanEqual のゲッターメソッドです。
     * 
     * @return the issuerCompNiceNetLessThanEqual
     */
    public String getIssuerCompNiceNetLessThanEqual() {
        return issuerCompNiceNetLessThanEqual;
    }

    /**
     * issuerCompNiceNetLessThanEqual のセッターメソッドです。
     * 
     * @param issuerCompNiceNetLessThanEqual issuerCompNiceNetLessThanEqual に設定する
     */
    public void setIssuerCompNiceNetLessThanEqual(String issuerCompNiceNetLessThanEqual) {
        this.issuerCompNiceNetLessThanEqual = issuerCompNiceNetLessThanEqual;
    }

    /**
     * issuerCompNiceNetLikeFront のゲッターメソッドです。
     * 
     * @return the issuerCompNiceNetLikeFront
     */
    public String getIssuerCompNiceNetLikeFront() {
        return issuerCompNiceNetLikeFront;
    }

    /**
     * issuerCompNiceNetLikeFront のセッターメソッドです。
     * 
     * @param issuerCompNiceNetLikeFront issuerCompNiceNetLikeFront に設定する
     */
    public void setIssuerCompNiceNetLikeFront(String issuerCompNiceNetLikeFront) {
        this.issuerCompNiceNetLikeFront = issuerCompNiceNetLikeFront;
    }

    /**
     * invoiceCtgryGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceCtgryGreaterThan
     */
    public String getInvoiceCtgryGreaterThan() {
        return invoiceCtgryGreaterThan;
    }

    /**
     * invoiceCtgryGreaterThan のセッターメソッドです。
     * 
     * @param invoiceCtgryGreaterThan invoiceCtgryGreaterThan に設定する
     */
    public void setInvoiceCtgryGreaterThan(String invoiceCtgryGreaterThan) {
        this.invoiceCtgryGreaterThan = invoiceCtgryGreaterThan;
    }

    /**
     * invoiceCtgryGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceCtgryGreaterThanEqual
     */
    public String getInvoiceCtgryGreaterThanEqual() {
        return invoiceCtgryGreaterThanEqual;
    }

    /**
     * invoiceCtgryGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceCtgryGreaterThanEqual invoiceCtgryGreaterThanEqual に設定する
     */
    public void setInvoiceCtgryGreaterThanEqual(String invoiceCtgryGreaterThanEqual) {
        this.invoiceCtgryGreaterThanEqual = invoiceCtgryGreaterThanEqual;
    }

    /**
     * invoiceCtgryLessThan のゲッターメソッドです。
     * 
     * @return the invoiceCtgryLessThan
     */
    public String getInvoiceCtgryLessThan() {
        return invoiceCtgryLessThan;
    }

    /**
     * invoiceCtgryLessThan のセッターメソッドです。
     * 
     * @param invoiceCtgryLessThan invoiceCtgryLessThan に設定する
     */
    public void setInvoiceCtgryLessThan(String invoiceCtgryLessThan) {
        this.invoiceCtgryLessThan = invoiceCtgryLessThan;
    }

    /**
     * invoiceCtgryLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceCtgryLessThanEqual
     */
    public String getInvoiceCtgryLessThanEqual() {
        return invoiceCtgryLessThanEqual;
    }

    /**
     * invoiceCtgryLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceCtgryLessThanEqual invoiceCtgryLessThanEqual に設定する
     */
    public void setInvoiceCtgryLessThanEqual(String invoiceCtgryLessThanEqual) {
        this.invoiceCtgryLessThanEqual = invoiceCtgryLessThanEqual;
    }

    /**
     * invoiceCtgryLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceCtgryLikeFront
     */
    public String getInvoiceCtgryLikeFront() {
        return invoiceCtgryLikeFront;
    }

    /**
     * invoiceCtgryLikeFront のセッターメソッドです。
     * 
     * @param invoiceCtgryLikeFront invoiceCtgryLikeFront に設定する
     */
    public void setInvoiceCtgryLikeFront(String invoiceCtgryLikeFront) {
        this.invoiceCtgryLikeFront = invoiceCtgryLikeFront;
    }

    /**
     * reExpGoodsFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlgGreaterThan
     */
    public String getReExpGoodsFlgGreaterThan() {
        return reExpGoodsFlgGreaterThan;
    }

    /**
     * reExpGoodsFlgGreaterThan のセッターメソッドです。
     * 
     * @param reExpGoodsFlgGreaterThan reExpGoodsFlgGreaterThan に設定する
     */
    public void setReExpGoodsFlgGreaterThan(String reExpGoodsFlgGreaterThan) {
        this.reExpGoodsFlgGreaterThan = reExpGoodsFlgGreaterThan;
    }

    /**
     * reExpGoodsFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlgGreaterThanEqual
     */
    public String getReExpGoodsFlgGreaterThanEqual() {
        return reExpGoodsFlgGreaterThanEqual;
    }

    /**
     * reExpGoodsFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param reExpGoodsFlgGreaterThanEqual reExpGoodsFlgGreaterThanEqual に設定する
     */
    public void setReExpGoodsFlgGreaterThanEqual(String reExpGoodsFlgGreaterThanEqual) {
        this.reExpGoodsFlgGreaterThanEqual = reExpGoodsFlgGreaterThanEqual;
    }

    /**
     * reExpGoodsFlgLessThan のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlgLessThan
     */
    public String getReExpGoodsFlgLessThan() {
        return reExpGoodsFlgLessThan;
    }

    /**
     * reExpGoodsFlgLessThan のセッターメソッドです。
     * 
     * @param reExpGoodsFlgLessThan reExpGoodsFlgLessThan に設定する
     */
    public void setReExpGoodsFlgLessThan(String reExpGoodsFlgLessThan) {
        this.reExpGoodsFlgLessThan = reExpGoodsFlgLessThan;
    }

    /**
     * reExpGoodsFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlgLessThanEqual
     */
    public String getReExpGoodsFlgLessThanEqual() {
        return reExpGoodsFlgLessThanEqual;
    }

    /**
     * reExpGoodsFlgLessThanEqual のセッターメソッドです。
     * 
     * @param reExpGoodsFlgLessThanEqual reExpGoodsFlgLessThanEqual に設定する
     */
    public void setReExpGoodsFlgLessThanEqual(String reExpGoodsFlgLessThanEqual) {
        this.reExpGoodsFlgLessThanEqual = reExpGoodsFlgLessThanEqual;
    }

    /**
     * reExpGoodsFlgLikeFront のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlgLikeFront
     */
    public String getReExpGoodsFlgLikeFront() {
        return reExpGoodsFlgLikeFront;
    }

    /**
     * reExpGoodsFlgLikeFront のセッターメソッドです。
     * 
     * @param reExpGoodsFlgLikeFront reExpGoodsFlgLikeFront に設定する
     */
    public void setReExpGoodsFlgLikeFront(String reExpGoodsFlgLikeFront) {
        this.reExpGoodsFlgLikeFront = reExpGoodsFlgLikeFront;
    }

    /**
     * impInvoiceNo1GreaterThan のゲッターメソッドです。
     * 
     * @return the impInvoiceNo1GreaterThan
     */
    public String getImpInvoiceNo1GreaterThan() {
        return impInvoiceNo1GreaterThan;
    }

    /**
     * impInvoiceNo1GreaterThan のセッターメソッドです。
     * 
     * @param impInvoiceNo1GreaterThan impInvoiceNo1GreaterThan に設定する
     */
    public void setImpInvoiceNo1GreaterThan(String impInvoiceNo1GreaterThan) {
        this.impInvoiceNo1GreaterThan = impInvoiceNo1GreaterThan;
    }

    /**
     * impInvoiceNo1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the impInvoiceNo1GreaterThanEqual
     */
    public String getImpInvoiceNo1GreaterThanEqual() {
        return impInvoiceNo1GreaterThanEqual;
    }

    /**
     * impInvoiceNo1GreaterThanEqual のセッターメソッドです。
     * 
     * @param impInvoiceNo1GreaterThanEqual impInvoiceNo1GreaterThanEqual に設定する
     */
    public void setImpInvoiceNo1GreaterThanEqual(String impInvoiceNo1GreaterThanEqual) {
        this.impInvoiceNo1GreaterThanEqual = impInvoiceNo1GreaterThanEqual;
    }

    /**
     * impInvoiceNo1LessThan のゲッターメソッドです。
     * 
     * @return the impInvoiceNo1LessThan
     */
    public String getImpInvoiceNo1LessThan() {
        return impInvoiceNo1LessThan;
    }

    /**
     * impInvoiceNo1LessThan のセッターメソッドです。
     * 
     * @param impInvoiceNo1LessThan impInvoiceNo1LessThan に設定する
     */
    public void setImpInvoiceNo1LessThan(String impInvoiceNo1LessThan) {
        this.impInvoiceNo1LessThan = impInvoiceNo1LessThan;
    }

    /**
     * impInvoiceNo1LessThanEqual のゲッターメソッドです。
     * 
     * @return the impInvoiceNo1LessThanEqual
     */
    public String getImpInvoiceNo1LessThanEqual() {
        return impInvoiceNo1LessThanEqual;
    }

    /**
     * impInvoiceNo1LessThanEqual のセッターメソッドです。
     * 
     * @param impInvoiceNo1LessThanEqual impInvoiceNo1LessThanEqual に設定する
     */
    public void setImpInvoiceNo1LessThanEqual(String impInvoiceNo1LessThanEqual) {
        this.impInvoiceNo1LessThanEqual = impInvoiceNo1LessThanEqual;
    }

    /**
     * impInvoiceNo1LikeFront のゲッターメソッドです。
     * 
     * @return the impInvoiceNo1LikeFront
     */
    public String getImpInvoiceNo1LikeFront() {
        return impInvoiceNo1LikeFront;
    }

    /**
     * impInvoiceNo1LikeFront のセッターメソッドです。
     * 
     * @param impInvoiceNo1LikeFront impInvoiceNo1LikeFront に設定する
     */
    public void setImpInvoiceNo1LikeFront(String impInvoiceNo1LikeFront) {
        this.impInvoiceNo1LikeFront = impInvoiceNo1LikeFront;
    }

    /**
     * impInvoiceNo2GreaterThan のゲッターメソッドです。
     * 
     * @return the impInvoiceNo2GreaterThan
     */
    public String getImpInvoiceNo2GreaterThan() {
        return impInvoiceNo2GreaterThan;
    }

    /**
     * impInvoiceNo2GreaterThan のセッターメソッドです。
     * 
     * @param impInvoiceNo2GreaterThan impInvoiceNo2GreaterThan に設定する
     */
    public void setImpInvoiceNo2GreaterThan(String impInvoiceNo2GreaterThan) {
        this.impInvoiceNo2GreaterThan = impInvoiceNo2GreaterThan;
    }

    /**
     * impInvoiceNo2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the impInvoiceNo2GreaterThanEqual
     */
    public String getImpInvoiceNo2GreaterThanEqual() {
        return impInvoiceNo2GreaterThanEqual;
    }

    /**
     * impInvoiceNo2GreaterThanEqual のセッターメソッドです。
     * 
     * @param impInvoiceNo2GreaterThanEqual impInvoiceNo2GreaterThanEqual に設定する
     */
    public void setImpInvoiceNo2GreaterThanEqual(String impInvoiceNo2GreaterThanEqual) {
        this.impInvoiceNo2GreaterThanEqual = impInvoiceNo2GreaterThanEqual;
    }

    /**
     * impInvoiceNo2LessThan のゲッターメソッドです。
     * 
     * @return the impInvoiceNo2LessThan
     */
    public String getImpInvoiceNo2LessThan() {
        return impInvoiceNo2LessThan;
    }

    /**
     * impInvoiceNo2LessThan のセッターメソッドです。
     * 
     * @param impInvoiceNo2LessThan impInvoiceNo2LessThan に設定する
     */
    public void setImpInvoiceNo2LessThan(String impInvoiceNo2LessThan) {
        this.impInvoiceNo2LessThan = impInvoiceNo2LessThan;
    }

    /**
     * impInvoiceNo2LessThanEqual のゲッターメソッドです。
     * 
     * @return the impInvoiceNo2LessThanEqual
     */
    public String getImpInvoiceNo2LessThanEqual() {
        return impInvoiceNo2LessThanEqual;
    }

    /**
     * impInvoiceNo2LessThanEqual のセッターメソッドです。
     * 
     * @param impInvoiceNo2LessThanEqual impInvoiceNo2LessThanEqual に設定する
     */
    public void setImpInvoiceNo2LessThanEqual(String impInvoiceNo2LessThanEqual) {
        this.impInvoiceNo2LessThanEqual = impInvoiceNo2LessThanEqual;
    }

    /**
     * impInvoiceNo2LikeFront のゲッターメソッドです。
     * 
     * @return the impInvoiceNo2LikeFront
     */
    public String getImpInvoiceNo2LikeFront() {
        return impInvoiceNo2LikeFront;
    }

    /**
     * impInvoiceNo2LikeFront のセッターメソッドです。
     * 
     * @param impInvoiceNo2LikeFront impInvoiceNo2LikeFront に設定する
     */
    public void setImpInvoiceNo2LikeFront(String impInvoiceNo2LikeFront) {
        this.impInvoiceNo2LikeFront = impInvoiceNo2LikeFront;
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
     * descriptionGreaterThan のゲッターメソッドです。
     * 
     * @return the descriptionGreaterThan
     */
    public String getDescriptionGreaterThan() {
        return descriptionGreaterThan;
    }

    /**
     * descriptionGreaterThan のセッターメソッドです。
     * 
     * @param descriptionGreaterThan descriptionGreaterThan に設定する
     */
    public void setDescriptionGreaterThan(String descriptionGreaterThan) {
        this.descriptionGreaterThan = descriptionGreaterThan;
    }

    /**
     * descriptionGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the descriptionGreaterThanEqual
     */
    public String getDescriptionGreaterThanEqual() {
        return descriptionGreaterThanEqual;
    }

    /**
     * descriptionGreaterThanEqual のセッターメソッドです。
     * 
     * @param descriptionGreaterThanEqual descriptionGreaterThanEqual に設定する
     */
    public void setDescriptionGreaterThanEqual(String descriptionGreaterThanEqual) {
        this.descriptionGreaterThanEqual = descriptionGreaterThanEqual;
    }

    /**
     * descriptionLessThan のゲッターメソッドです。
     * 
     * @return the descriptionLessThan
     */
    public String getDescriptionLessThan() {
        return descriptionLessThan;
    }

    /**
     * descriptionLessThan のセッターメソッドです。
     * 
     * @param descriptionLessThan descriptionLessThan に設定する
     */
    public void setDescriptionLessThan(String descriptionLessThan) {
        this.descriptionLessThan = descriptionLessThan;
    }

    /**
     * descriptionLessThanEqual のゲッターメソッドです。
     * 
     * @return the descriptionLessThanEqual
     */
    public String getDescriptionLessThanEqual() {
        return descriptionLessThanEqual;
    }

    /**
     * descriptionLessThanEqual のセッターメソッドです。
     * 
     * @param descriptionLessThanEqual descriptionLessThanEqual に設定する
     */
    public void setDescriptionLessThanEqual(String descriptionLessThanEqual) {
        this.descriptionLessThanEqual = descriptionLessThanEqual;
    }

    /**
     * descriptionLikeFront のゲッターメソッドです。
     * 
     * @return the descriptionLikeFront
     */
    public String getDescriptionLikeFront() {
        return descriptionLikeFront;
    }

    /**
     * descriptionLikeFront のセッターメソッドです。
     * 
     * @param descriptionLikeFront descriptionLikeFront に設定する
     */
    public void setDescriptionLikeFront(String descriptionLikeFront) {
        this.descriptionLikeFront = descriptionLikeFront;
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
     * customerShipToGreaterThan のゲッターメソッドです。
     * 
     * @return the customerShipToGreaterThan
     */
    public String getCustomerShipToGreaterThan() {
        return customerShipToGreaterThan;
    }

    /**
     * customerShipToGreaterThan のセッターメソッドです。
     * 
     * @param customerShipToGreaterThan customerShipToGreaterThan に設定する
     */
    public void setCustomerShipToGreaterThan(String customerShipToGreaterThan) {
        this.customerShipToGreaterThan = customerShipToGreaterThan;
    }

    /**
     * customerShipToGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerShipToGreaterThanEqual
     */
    public String getCustomerShipToGreaterThanEqual() {
        return customerShipToGreaterThanEqual;
    }

    /**
     * customerShipToGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerShipToGreaterThanEqual customerShipToGreaterThanEqual に設定する
     */
    public void setCustomerShipToGreaterThanEqual(String customerShipToGreaterThanEqual) {
        this.customerShipToGreaterThanEqual = customerShipToGreaterThanEqual;
    }

    /**
     * customerShipToLessThan のゲッターメソッドです。
     * 
     * @return the customerShipToLessThan
     */
    public String getCustomerShipToLessThan() {
        return customerShipToLessThan;
    }

    /**
     * customerShipToLessThan のセッターメソッドです。
     * 
     * @param customerShipToLessThan customerShipToLessThan に設定する
     */
    public void setCustomerShipToLessThan(String customerShipToLessThan) {
        this.customerShipToLessThan = customerShipToLessThan;
    }

    /**
     * customerShipToLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerShipToLessThanEqual
     */
    public String getCustomerShipToLessThanEqual() {
        return customerShipToLessThanEqual;
    }

    /**
     * customerShipToLessThanEqual のセッターメソッドです。
     * 
     * @param customerShipToLessThanEqual customerShipToLessThanEqual に設定する
     */
    public void setCustomerShipToLessThanEqual(String customerShipToLessThanEqual) {
        this.customerShipToLessThanEqual = customerShipToLessThanEqual;
    }

    /**
     * customerShipToLikeFront のゲッターメソッドです。
     * 
     * @return the customerShipToLikeFront
     */
    public String getCustomerShipToLikeFront() {
        return customerShipToLikeFront;
    }

    /**
     * customerShipToLikeFront のセッターメソッドです。
     * 
     * @param customerShipToLikeFront customerShipToLikeFront に設定する
     */
    public void setCustomerShipToLikeFront(String customerShipToLikeFront) {
        this.customerShipToLikeFront = customerShipToLikeFront;
    }

    /**
     * accounteeCdGreaterThan のゲッターメソッドです。
     * 
     * @return the accounteeCdGreaterThan
     */
    public String getAccounteeCdGreaterThan() {
        return accounteeCdGreaterThan;
    }

    /**
     * accounteeCdGreaterThan のセッターメソッドです。
     * 
     * @param accounteeCdGreaterThan accounteeCdGreaterThan に設定する
     */
    public void setAccounteeCdGreaterThan(String accounteeCdGreaterThan) {
        this.accounteeCdGreaterThan = accounteeCdGreaterThan;
    }

    /**
     * accounteeCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the accounteeCdGreaterThanEqual
     */
    public String getAccounteeCdGreaterThanEqual() {
        return accounteeCdGreaterThanEqual;
    }

    /**
     * accounteeCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param accounteeCdGreaterThanEqual accounteeCdGreaterThanEqual に設定する
     */
    public void setAccounteeCdGreaterThanEqual(String accounteeCdGreaterThanEqual) {
        this.accounteeCdGreaterThanEqual = accounteeCdGreaterThanEqual;
    }

    /**
     * accounteeCdLessThan のゲッターメソッドです。
     * 
     * @return the accounteeCdLessThan
     */
    public String getAccounteeCdLessThan() {
        return accounteeCdLessThan;
    }

    /**
     * accounteeCdLessThan のセッターメソッドです。
     * 
     * @param accounteeCdLessThan accounteeCdLessThan に設定する
     */
    public void setAccounteeCdLessThan(String accounteeCdLessThan) {
        this.accounteeCdLessThan = accounteeCdLessThan;
    }

    /**
     * accounteeCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the accounteeCdLessThanEqual
     */
    public String getAccounteeCdLessThanEqual() {
        return accounteeCdLessThanEqual;
    }

    /**
     * accounteeCdLessThanEqual のセッターメソッドです。
     * 
     * @param accounteeCdLessThanEqual accounteeCdLessThanEqual に設定する
     */
    public void setAccounteeCdLessThanEqual(String accounteeCdLessThanEqual) {
        this.accounteeCdLessThanEqual = accounteeCdLessThanEqual;
    }

    /**
     * accounteeCdLikeFront のゲッターメソッドです。
     * 
     * @return the accounteeCdLikeFront
     */
    public String getAccounteeCdLikeFront() {
        return accounteeCdLikeFront;
    }

    /**
     * accounteeCdLikeFront のセッターメソッドです。
     * 
     * @param accounteeCdLikeFront accounteeCdLikeFront に設定する
     */
    public void setAccounteeCdLikeFront(String accounteeCdLikeFront) {
        this.accounteeCdLikeFront = accounteeCdLikeFront;
    }

    /**
     * accounteeCompNmGreaterThan のゲッターメソッドです。
     * 
     * @return the accounteeCompNmGreaterThan
     */
    public String getAccounteeCompNmGreaterThan() {
        return accounteeCompNmGreaterThan;
    }

    /**
     * accounteeCompNmGreaterThan のセッターメソッドです。
     * 
     * @param accounteeCompNmGreaterThan accounteeCompNmGreaterThan に設定する
     */
    public void setAccounteeCompNmGreaterThan(String accounteeCompNmGreaterThan) {
        this.accounteeCompNmGreaterThan = accounteeCompNmGreaterThan;
    }

    /**
     * accounteeCompNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the accounteeCompNmGreaterThanEqual
     */
    public String getAccounteeCompNmGreaterThanEqual() {
        return accounteeCompNmGreaterThanEqual;
    }

    /**
     * accounteeCompNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param accounteeCompNmGreaterThanEqual accounteeCompNmGreaterThanEqual に設定する
     */
    public void setAccounteeCompNmGreaterThanEqual(String accounteeCompNmGreaterThanEqual) {
        this.accounteeCompNmGreaterThanEqual = accounteeCompNmGreaterThanEqual;
    }

    /**
     * accounteeCompNmLessThan のゲッターメソッドです。
     * 
     * @return the accounteeCompNmLessThan
     */
    public String getAccounteeCompNmLessThan() {
        return accounteeCompNmLessThan;
    }

    /**
     * accounteeCompNmLessThan のセッターメソッドです。
     * 
     * @param accounteeCompNmLessThan accounteeCompNmLessThan に設定する
     */
    public void setAccounteeCompNmLessThan(String accounteeCompNmLessThan) {
        this.accounteeCompNmLessThan = accounteeCompNmLessThan;
    }

    /**
     * accounteeCompNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the accounteeCompNmLessThanEqual
     */
    public String getAccounteeCompNmLessThanEqual() {
        return accounteeCompNmLessThanEqual;
    }

    /**
     * accounteeCompNmLessThanEqual のセッターメソッドです。
     * 
     * @param accounteeCompNmLessThanEqual accounteeCompNmLessThanEqual に設定する
     */
    public void setAccounteeCompNmLessThanEqual(String accounteeCompNmLessThanEqual) {
        this.accounteeCompNmLessThanEqual = accounteeCompNmLessThanEqual;
    }

    /**
     * accounteeCompNmLikeFront のゲッターメソッドです。
     * 
     * @return the accounteeCompNmLikeFront
     */
    public String getAccounteeCompNmLikeFront() {
        return accounteeCompNmLikeFront;
    }

    /**
     * accounteeCompNmLikeFront のセッターメソッドです。
     * 
     * @param accounteeCompNmLikeFront accounteeCompNmLikeFront に設定する
     */
    public void setAccounteeCompNmLikeFront(String accounteeCompNmLikeFront) {
        this.accounteeCompNmLikeFront = accounteeCompNmLikeFront;
    }

    /**
     * accounteeCompAddrGreaterThan のゲッターメソッドです。
     * 
     * @return the accounteeCompAddrGreaterThan
     */
    public String getAccounteeCompAddrGreaterThan() {
        return accounteeCompAddrGreaterThan;
    }

    /**
     * accounteeCompAddrGreaterThan のセッターメソッドです。
     * 
     * @param accounteeCompAddrGreaterThan accounteeCompAddrGreaterThan に設定する
     */
    public void setAccounteeCompAddrGreaterThan(String accounteeCompAddrGreaterThan) {
        this.accounteeCompAddrGreaterThan = accounteeCompAddrGreaterThan;
    }

    /**
     * accounteeCompAddrGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the accounteeCompAddrGreaterThanEqual
     */
    public String getAccounteeCompAddrGreaterThanEqual() {
        return accounteeCompAddrGreaterThanEqual;
    }

    /**
     * accounteeCompAddrGreaterThanEqual のセッターメソッドです。
     * 
     * @param accounteeCompAddrGreaterThanEqual accounteeCompAddrGreaterThanEqual に設定する
     */
    public void setAccounteeCompAddrGreaterThanEqual(String accounteeCompAddrGreaterThanEqual) {
        this.accounteeCompAddrGreaterThanEqual = accounteeCompAddrGreaterThanEqual;
    }

    /**
     * accounteeCompAddrLessThan のゲッターメソッドです。
     * 
     * @return the accounteeCompAddrLessThan
     */
    public String getAccounteeCompAddrLessThan() {
        return accounteeCompAddrLessThan;
    }

    /**
     * accounteeCompAddrLessThan のセッターメソッドです。
     * 
     * @param accounteeCompAddrLessThan accounteeCompAddrLessThan に設定する
     */
    public void setAccounteeCompAddrLessThan(String accounteeCompAddrLessThan) {
        this.accounteeCompAddrLessThan = accounteeCompAddrLessThan;
    }

    /**
     * accounteeCompAddrLessThanEqual のゲッターメソッドです。
     * 
     * @return the accounteeCompAddrLessThanEqual
     */
    public String getAccounteeCompAddrLessThanEqual() {
        return accounteeCompAddrLessThanEqual;
    }

    /**
     * accounteeCompAddrLessThanEqual のセッターメソッドです。
     * 
     * @param accounteeCompAddrLessThanEqual accounteeCompAddrLessThanEqual に設定する
     */
    public void setAccounteeCompAddrLessThanEqual(String accounteeCompAddrLessThanEqual) {
        this.accounteeCompAddrLessThanEqual = accounteeCompAddrLessThanEqual;
    }

    /**
     * accounteeCompAddrLikeFront のゲッターメソッドです。
     * 
     * @return the accounteeCompAddrLikeFront
     */
    public String getAccounteeCompAddrLikeFront() {
        return accounteeCompAddrLikeFront;
    }

    /**
     * accounteeCompAddrLikeFront のセッターメソッドです。
     * 
     * @param accounteeCompAddrLikeFront accounteeCompAddrLikeFront に設定する
     */
    public void setAccounteeCompAddrLikeFront(String accounteeCompAddrLikeFront) {
        this.accounteeCompAddrLikeFront = accounteeCompAddrLikeFront;
    }

    /**
     * accounteeCompTelGreaterThan のゲッターメソッドです。
     * 
     * @return the accounteeCompTelGreaterThan
     */
    public String getAccounteeCompTelGreaterThan() {
        return accounteeCompTelGreaterThan;
    }

    /**
     * accounteeCompTelGreaterThan のセッターメソッドです。
     * 
     * @param accounteeCompTelGreaterThan accounteeCompTelGreaterThan に設定する
     */
    public void setAccounteeCompTelGreaterThan(String accounteeCompTelGreaterThan) {
        this.accounteeCompTelGreaterThan = accounteeCompTelGreaterThan;
    }

    /**
     * accounteeCompTelGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the accounteeCompTelGreaterThanEqual
     */
    public String getAccounteeCompTelGreaterThanEqual() {
        return accounteeCompTelGreaterThanEqual;
    }

    /**
     * accounteeCompTelGreaterThanEqual のセッターメソッドです。
     * 
     * @param accounteeCompTelGreaterThanEqual accounteeCompTelGreaterThanEqual に設定する
     */
    public void setAccounteeCompTelGreaterThanEqual(String accounteeCompTelGreaterThanEqual) {
        this.accounteeCompTelGreaterThanEqual = accounteeCompTelGreaterThanEqual;
    }

    /**
     * accounteeCompTelLessThan のゲッターメソッドです。
     * 
     * @return the accounteeCompTelLessThan
     */
    public String getAccounteeCompTelLessThan() {
        return accounteeCompTelLessThan;
    }

    /**
     * accounteeCompTelLessThan のセッターメソッドです。
     * 
     * @param accounteeCompTelLessThan accounteeCompTelLessThan に設定する
     */
    public void setAccounteeCompTelLessThan(String accounteeCompTelLessThan) {
        this.accounteeCompTelLessThan = accounteeCompTelLessThan;
    }

    /**
     * accounteeCompTelLessThanEqual のゲッターメソッドです。
     * 
     * @return the accounteeCompTelLessThanEqual
     */
    public String getAccounteeCompTelLessThanEqual() {
        return accounteeCompTelLessThanEqual;
    }

    /**
     * accounteeCompTelLessThanEqual のセッターメソッドです。
     * 
     * @param accounteeCompTelLessThanEqual accounteeCompTelLessThanEqual に設定する
     */
    public void setAccounteeCompTelLessThanEqual(String accounteeCompTelLessThanEqual) {
        this.accounteeCompTelLessThanEqual = accounteeCompTelLessThanEqual;
    }

    /**
     * accounteeCompTelLikeFront のゲッターメソッドです。
     * 
     * @return the accounteeCompTelLikeFront
     */
    public String getAccounteeCompTelLikeFront() {
        return accounteeCompTelLikeFront;
    }

    /**
     * accounteeCompTelLikeFront のセッターメソッドです。
     * 
     * @param accounteeCompTelLikeFront accounteeCompTelLikeFront に設定する
     */
    public void setAccounteeCompTelLikeFront(String accounteeCompTelLikeFront) {
        this.accounteeCompTelLikeFront = accounteeCompTelLikeFront;
    }

    /**
     * containerSortingKeyGreaterThan のゲッターメソッドです。
     * 
     * @return the containerSortingKeyGreaterThan
     */
    public String getContainerSortingKeyGreaterThan() {
        return containerSortingKeyGreaterThan;
    }

    /**
     * containerSortingKeyGreaterThan のセッターメソッドです。
     * 
     * @param containerSortingKeyGreaterThan containerSortingKeyGreaterThan に設定する
     */
    public void setContainerSortingKeyGreaterThan(String containerSortingKeyGreaterThan) {
        this.containerSortingKeyGreaterThan = containerSortingKeyGreaterThan;
    }

    /**
     * containerSortingKeyGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerSortingKeyGreaterThanEqual
     */
    public String getContainerSortingKeyGreaterThanEqual() {
        return containerSortingKeyGreaterThanEqual;
    }

    /**
     * containerSortingKeyGreaterThanEqual のセッターメソッドです。
     * 
     * @param containerSortingKeyGreaterThanEqual containerSortingKeyGreaterThanEqual に設定する
     */
    public void setContainerSortingKeyGreaterThanEqual(String containerSortingKeyGreaterThanEqual) {
        this.containerSortingKeyGreaterThanEqual = containerSortingKeyGreaterThanEqual;
    }

    /**
     * containerSortingKeyLessThan のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLessThan
     */
    public String getContainerSortingKeyLessThan() {
        return containerSortingKeyLessThan;
    }

    /**
     * containerSortingKeyLessThan のセッターメソッドです。
     * 
     * @param containerSortingKeyLessThan containerSortingKeyLessThan に設定する
     */
    public void setContainerSortingKeyLessThan(String containerSortingKeyLessThan) {
        this.containerSortingKeyLessThan = containerSortingKeyLessThan;
    }

    /**
     * containerSortingKeyLessThanEqual のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLessThanEqual
     */
    public String getContainerSortingKeyLessThanEqual() {
        return containerSortingKeyLessThanEqual;
    }

    /**
     * containerSortingKeyLessThanEqual のセッターメソッドです。
     * 
     * @param containerSortingKeyLessThanEqual containerSortingKeyLessThanEqual に設定する
     */
    public void setContainerSortingKeyLessThanEqual(String containerSortingKeyLessThanEqual) {
        this.containerSortingKeyLessThanEqual = containerSortingKeyLessThanEqual;
    }

    /**
     * containerSortingKeyLikeFront のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLikeFront
     */
    public String getContainerSortingKeyLikeFront() {
        return containerSortingKeyLikeFront;
    }

    /**
     * containerSortingKeyLikeFront のセッターメソッドです。
     * 
     * @param containerSortingKeyLikeFront containerSortingKeyLikeFront に設定する
     */
    public void setContainerSortingKeyLikeFront(String containerSortingKeyLikeFront) {
        this.containerSortingKeyLikeFront = containerSortingKeyLikeFront;
    }

    /**
     * consigneeCdGreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCdGreaterThan
     */
    public String getConsigneeCdGreaterThan() {
        return consigneeCdGreaterThan;
    }

    /**
     * consigneeCdGreaterThan のセッターメソッドです。
     * 
     * @param consigneeCdGreaterThan consigneeCdGreaterThan に設定する
     */
    public void setConsigneeCdGreaterThan(String consigneeCdGreaterThan) {
        this.consigneeCdGreaterThan = consigneeCdGreaterThan;
    }

    /**
     * consigneeCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCdGreaterThanEqual
     */
    public String getConsigneeCdGreaterThanEqual() {
        return consigneeCdGreaterThanEqual;
    }

    /**
     * consigneeCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCdGreaterThanEqual consigneeCdGreaterThanEqual に設定する
     */
    public void setConsigneeCdGreaterThanEqual(String consigneeCdGreaterThanEqual) {
        this.consigneeCdGreaterThanEqual = consigneeCdGreaterThanEqual;
    }

    /**
     * consigneeCdLessThan のゲッターメソッドです。
     * 
     * @return the consigneeCdLessThan
     */
    public String getConsigneeCdLessThan() {
        return consigneeCdLessThan;
    }

    /**
     * consigneeCdLessThan のセッターメソッドです。
     * 
     * @param consigneeCdLessThan consigneeCdLessThan に設定する
     */
    public void setConsigneeCdLessThan(String consigneeCdLessThan) {
        this.consigneeCdLessThan = consigneeCdLessThan;
    }

    /**
     * consigneeCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCdLessThanEqual
     */
    public String getConsigneeCdLessThanEqual() {
        return consigneeCdLessThanEqual;
    }

    /**
     * consigneeCdLessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCdLessThanEqual consigneeCdLessThanEqual に設定する
     */
    public void setConsigneeCdLessThanEqual(String consigneeCdLessThanEqual) {
        this.consigneeCdLessThanEqual = consigneeCdLessThanEqual;
    }

    /**
     * consigneeCdLikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCdLikeFront
     */
    public String getConsigneeCdLikeFront() {
        return consigneeCdLikeFront;
    }

    /**
     * consigneeCdLikeFront のセッターメソッドです。
     * 
     * @param consigneeCdLikeFront consigneeCdLikeFront に設定する
     */
    public void setConsigneeCdLikeFront(String consigneeCdLikeFront) {
        this.consigneeCdLikeFront = consigneeCdLikeFront;
    }

    /**
     * consigneeCompNmGreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCompNmGreaterThan
     */
    public String getConsigneeCompNmGreaterThan() {
        return consigneeCompNmGreaterThan;
    }

    /**
     * consigneeCompNmGreaterThan のセッターメソッドです。
     * 
     * @param consigneeCompNmGreaterThan consigneeCompNmGreaterThan に設定する
     */
    public void setConsigneeCompNmGreaterThan(String consigneeCompNmGreaterThan) {
        this.consigneeCompNmGreaterThan = consigneeCompNmGreaterThan;
    }

    /**
     * consigneeCompNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompNmGreaterThanEqual
     */
    public String getConsigneeCompNmGreaterThanEqual() {
        return consigneeCompNmGreaterThanEqual;
    }

    /**
     * consigneeCompNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompNmGreaterThanEqual consigneeCompNmGreaterThanEqual に設定する
     */
    public void setConsigneeCompNmGreaterThanEqual(String consigneeCompNmGreaterThanEqual) {
        this.consigneeCompNmGreaterThanEqual = consigneeCompNmGreaterThanEqual;
    }

    /**
     * consigneeCompNmLessThan のゲッターメソッドです。
     * 
     * @return the consigneeCompNmLessThan
     */
    public String getConsigneeCompNmLessThan() {
        return consigneeCompNmLessThan;
    }

    /**
     * consigneeCompNmLessThan のセッターメソッドです。
     * 
     * @param consigneeCompNmLessThan consigneeCompNmLessThan に設定する
     */
    public void setConsigneeCompNmLessThan(String consigneeCompNmLessThan) {
        this.consigneeCompNmLessThan = consigneeCompNmLessThan;
    }

    /**
     * consigneeCompNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompNmLessThanEqual
     */
    public String getConsigneeCompNmLessThanEqual() {
        return consigneeCompNmLessThanEqual;
    }

    /**
     * consigneeCompNmLessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompNmLessThanEqual consigneeCompNmLessThanEqual に設定する
     */
    public void setConsigneeCompNmLessThanEqual(String consigneeCompNmLessThanEqual) {
        this.consigneeCompNmLessThanEqual = consigneeCompNmLessThanEqual;
    }

    /**
     * consigneeCompNmLikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCompNmLikeFront
     */
    public String getConsigneeCompNmLikeFront() {
        return consigneeCompNmLikeFront;
    }

    /**
     * consigneeCompNmLikeFront のセッターメソッドです。
     * 
     * @param consigneeCompNmLikeFront consigneeCompNmLikeFront に設定する
     */
    public void setConsigneeCompNmLikeFront(String consigneeCompNmLikeFront) {
        this.consigneeCompNmLikeFront = consigneeCompNmLikeFront;
    }

    /**
     * consigneeCntryCdGreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCntryCdGreaterThan
     */
    public String getConsigneeCntryCdGreaterThan() {
        return consigneeCntryCdGreaterThan;
    }

    /**
     * consigneeCntryCdGreaterThan のセッターメソッドです。
     * 
     * @param consigneeCntryCdGreaterThan consigneeCntryCdGreaterThan に設定する
     */
    public void setConsigneeCntryCdGreaterThan(String consigneeCntryCdGreaterThan) {
        this.consigneeCntryCdGreaterThan = consigneeCntryCdGreaterThan;
    }

    /**
     * consigneeCntryCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCntryCdGreaterThanEqual
     */
    public String getConsigneeCntryCdGreaterThanEqual() {
        return consigneeCntryCdGreaterThanEqual;
    }

    /**
     * consigneeCntryCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCntryCdGreaterThanEqual consigneeCntryCdGreaterThanEqual に設定する
     */
    public void setConsigneeCntryCdGreaterThanEqual(String consigneeCntryCdGreaterThanEqual) {
        this.consigneeCntryCdGreaterThanEqual = consigneeCntryCdGreaterThanEqual;
    }

    /**
     * consigneeCntryCdLessThan のゲッターメソッドです。
     * 
     * @return the consigneeCntryCdLessThan
     */
    public String getConsigneeCntryCdLessThan() {
        return consigneeCntryCdLessThan;
    }

    /**
     * consigneeCntryCdLessThan のセッターメソッドです。
     * 
     * @param consigneeCntryCdLessThan consigneeCntryCdLessThan に設定する
     */
    public void setConsigneeCntryCdLessThan(String consigneeCntryCdLessThan) {
        this.consigneeCntryCdLessThan = consigneeCntryCdLessThan;
    }

    /**
     * consigneeCntryCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCntryCdLessThanEqual
     */
    public String getConsigneeCntryCdLessThanEqual() {
        return consigneeCntryCdLessThanEqual;
    }

    /**
     * consigneeCntryCdLessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCntryCdLessThanEqual consigneeCntryCdLessThanEqual に設定する
     */
    public void setConsigneeCntryCdLessThanEqual(String consigneeCntryCdLessThanEqual) {
        this.consigneeCntryCdLessThanEqual = consigneeCntryCdLessThanEqual;
    }

    /**
     * consigneeCntryCdLikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCntryCdLikeFront
     */
    public String getConsigneeCntryCdLikeFront() {
        return consigneeCntryCdLikeFront;
    }

    /**
     * consigneeCntryCdLikeFront のセッターメソッドです。
     * 
     * @param consigneeCntryCdLikeFront consigneeCntryCdLikeFront に設定する
     */
    public void setConsigneeCntryCdLikeFront(String consigneeCntryCdLikeFront) {
        this.consigneeCntryCdLikeFront = consigneeCntryCdLikeFront;
    }

    /**
     * consigneeCompAddrGreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCompAddrGreaterThan
     */
    public String getConsigneeCompAddrGreaterThan() {
        return consigneeCompAddrGreaterThan;
    }

    /**
     * consigneeCompAddrGreaterThan のセッターメソッドです。
     * 
     * @param consigneeCompAddrGreaterThan consigneeCompAddrGreaterThan に設定する
     */
    public void setConsigneeCompAddrGreaterThan(String consigneeCompAddrGreaterThan) {
        this.consigneeCompAddrGreaterThan = consigneeCompAddrGreaterThan;
    }

    /**
     * consigneeCompAddrGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompAddrGreaterThanEqual
     */
    public String getConsigneeCompAddrGreaterThanEqual() {
        return consigneeCompAddrGreaterThanEqual;
    }

    /**
     * consigneeCompAddrGreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompAddrGreaterThanEqual consigneeCompAddrGreaterThanEqual に設定する
     */
    public void setConsigneeCompAddrGreaterThanEqual(String consigneeCompAddrGreaterThanEqual) {
        this.consigneeCompAddrGreaterThanEqual = consigneeCompAddrGreaterThanEqual;
    }

    /**
     * consigneeCompAddrLessThan のゲッターメソッドです。
     * 
     * @return the consigneeCompAddrLessThan
     */
    public String getConsigneeCompAddrLessThan() {
        return consigneeCompAddrLessThan;
    }

    /**
     * consigneeCompAddrLessThan のセッターメソッドです。
     * 
     * @param consigneeCompAddrLessThan consigneeCompAddrLessThan に設定する
     */
    public void setConsigneeCompAddrLessThan(String consigneeCompAddrLessThan) {
        this.consigneeCompAddrLessThan = consigneeCompAddrLessThan;
    }

    /**
     * consigneeCompAddrLessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompAddrLessThanEqual
     */
    public String getConsigneeCompAddrLessThanEqual() {
        return consigneeCompAddrLessThanEqual;
    }

    /**
     * consigneeCompAddrLessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompAddrLessThanEqual consigneeCompAddrLessThanEqual に設定する
     */
    public void setConsigneeCompAddrLessThanEqual(String consigneeCompAddrLessThanEqual) {
        this.consigneeCompAddrLessThanEqual = consigneeCompAddrLessThanEqual;
    }

    /**
     * consigneeCompAddrLikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCompAddrLikeFront
     */
    public String getConsigneeCompAddrLikeFront() {
        return consigneeCompAddrLikeFront;
    }

    /**
     * consigneeCompAddrLikeFront のセッターメソッドです。
     * 
     * @param consigneeCompAddrLikeFront consigneeCompAddrLikeFront に設定する
     */
    public void setConsigneeCompAddrLikeFront(String consigneeCompAddrLikeFront) {
        this.consigneeCompAddrLikeFront = consigneeCompAddrLikeFront;
    }

    /**
     * consigneeCompTelGreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCompTelGreaterThan
     */
    public String getConsigneeCompTelGreaterThan() {
        return consigneeCompTelGreaterThan;
    }

    /**
     * consigneeCompTelGreaterThan のセッターメソッドです。
     * 
     * @param consigneeCompTelGreaterThan consigneeCompTelGreaterThan に設定する
     */
    public void setConsigneeCompTelGreaterThan(String consigneeCompTelGreaterThan) {
        this.consigneeCompTelGreaterThan = consigneeCompTelGreaterThan;
    }

    /**
     * consigneeCompTelGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompTelGreaterThanEqual
     */
    public String getConsigneeCompTelGreaterThanEqual() {
        return consigneeCompTelGreaterThanEqual;
    }

    /**
     * consigneeCompTelGreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompTelGreaterThanEqual consigneeCompTelGreaterThanEqual に設定する
     */
    public void setConsigneeCompTelGreaterThanEqual(String consigneeCompTelGreaterThanEqual) {
        this.consigneeCompTelGreaterThanEqual = consigneeCompTelGreaterThanEqual;
    }

    /**
     * consigneeCompTelLessThan のゲッターメソッドです。
     * 
     * @return the consigneeCompTelLessThan
     */
    public String getConsigneeCompTelLessThan() {
        return consigneeCompTelLessThan;
    }

    /**
     * consigneeCompTelLessThan のセッターメソッドです。
     * 
     * @param consigneeCompTelLessThan consigneeCompTelLessThan に設定する
     */
    public void setConsigneeCompTelLessThan(String consigneeCompTelLessThan) {
        this.consigneeCompTelLessThan = consigneeCompTelLessThan;
    }

    /**
     * consigneeCompTelLessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompTelLessThanEqual
     */
    public String getConsigneeCompTelLessThanEqual() {
        return consigneeCompTelLessThanEqual;
    }

    /**
     * consigneeCompTelLessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompTelLessThanEqual consigneeCompTelLessThanEqual に設定する
     */
    public void setConsigneeCompTelLessThanEqual(String consigneeCompTelLessThanEqual) {
        this.consigneeCompTelLessThanEqual = consigneeCompTelLessThanEqual;
    }

    /**
     * consigneeCompTelLikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCompTelLikeFront
     */
    public String getConsigneeCompTelLikeFront() {
        return consigneeCompTelLikeFront;
    }

    /**
     * consigneeCompTelLikeFront のセッターメソッドです。
     * 
     * @param consigneeCompTelLikeFront consigneeCompTelLikeFront に設定する
     */
    public void setConsigneeCompTelLikeFront(String consigneeCompTelLikeFront) {
        this.consigneeCompTelLikeFront = consigneeCompTelLikeFront;
    }

    /**
     * shipToCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCdGreaterThan
     */
    public String getShipToCdGreaterThan() {
        return shipToCdGreaterThan;
    }

    /**
     * shipToCdGreaterThan のセッターメソッドです。
     * 
     * @param shipToCdGreaterThan shipToCdGreaterThan に設定する
     */
    public void setShipToCdGreaterThan(String shipToCdGreaterThan) {
        this.shipToCdGreaterThan = shipToCdGreaterThan;
    }

    /**
     * shipToCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCdGreaterThanEqual
     */
    public String getShipToCdGreaterThanEqual() {
        return shipToCdGreaterThanEqual;
    }

    /**
     * shipToCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCdGreaterThanEqual shipToCdGreaterThanEqual に設定する
     */
    public void setShipToCdGreaterThanEqual(String shipToCdGreaterThanEqual) {
        this.shipToCdGreaterThanEqual = shipToCdGreaterThanEqual;
    }

    /**
     * shipToCdLessThan のゲッターメソッドです。
     * 
     * @return the shipToCdLessThan
     */
    public String getShipToCdLessThan() {
        return shipToCdLessThan;
    }

    /**
     * shipToCdLessThan のセッターメソッドです。
     * 
     * @param shipToCdLessThan shipToCdLessThan に設定する
     */
    public void setShipToCdLessThan(String shipToCdLessThan) {
        this.shipToCdLessThan = shipToCdLessThan;
    }

    /**
     * shipToCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCdLessThanEqual
     */
    public String getShipToCdLessThanEqual() {
        return shipToCdLessThanEqual;
    }

    /**
     * shipToCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCdLessThanEqual shipToCdLessThanEqual に設定する
     */
    public void setShipToCdLessThanEqual(String shipToCdLessThanEqual) {
        this.shipToCdLessThanEqual = shipToCdLessThanEqual;
    }

    /**
     * shipToCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCdLikeFront
     */
    public String getShipToCdLikeFront() {
        return shipToCdLikeFront;
    }

    /**
     * shipToCdLikeFront のセッターメソッドです。
     * 
     * @param shipToCdLikeFront shipToCdLikeFront に設定する
     */
    public void setShipToCdLikeFront(String shipToCdLikeFront) {
        this.shipToCdLikeFront = shipToCdLikeFront;
    }

    /**
     * shipToCompNmGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCompNmGreaterThan
     */
    public String getShipToCompNmGreaterThan() {
        return shipToCompNmGreaterThan;
    }

    /**
     * shipToCompNmGreaterThan のセッターメソッドです。
     * 
     * @param shipToCompNmGreaterThan shipToCompNmGreaterThan に設定する
     */
    public void setShipToCompNmGreaterThan(String shipToCompNmGreaterThan) {
        this.shipToCompNmGreaterThan = shipToCompNmGreaterThan;
    }

    /**
     * shipToCompNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompNmGreaterThanEqual
     */
    public String getShipToCompNmGreaterThanEqual() {
        return shipToCompNmGreaterThanEqual;
    }

    /**
     * shipToCompNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCompNmGreaterThanEqual shipToCompNmGreaterThanEqual に設定する
     */
    public void setShipToCompNmGreaterThanEqual(String shipToCompNmGreaterThanEqual) {
        this.shipToCompNmGreaterThanEqual = shipToCompNmGreaterThanEqual;
    }

    /**
     * shipToCompNmLessThan のゲッターメソッドです。
     * 
     * @return the shipToCompNmLessThan
     */
    public String getShipToCompNmLessThan() {
        return shipToCompNmLessThan;
    }

    /**
     * shipToCompNmLessThan のセッターメソッドです。
     * 
     * @param shipToCompNmLessThan shipToCompNmLessThan に設定する
     */
    public void setShipToCompNmLessThan(String shipToCompNmLessThan) {
        this.shipToCompNmLessThan = shipToCompNmLessThan;
    }

    /**
     * shipToCompNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompNmLessThanEqual
     */
    public String getShipToCompNmLessThanEqual() {
        return shipToCompNmLessThanEqual;
    }

    /**
     * shipToCompNmLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCompNmLessThanEqual shipToCompNmLessThanEqual に設定する
     */
    public void setShipToCompNmLessThanEqual(String shipToCompNmLessThanEqual) {
        this.shipToCompNmLessThanEqual = shipToCompNmLessThanEqual;
    }

    /**
     * shipToCompNmLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCompNmLikeFront
     */
    public String getShipToCompNmLikeFront() {
        return shipToCompNmLikeFront;
    }

    /**
     * shipToCompNmLikeFront のセッターメソッドです。
     * 
     * @param shipToCompNmLikeFront shipToCompNmLikeFront に設定する
     */
    public void setShipToCompNmLikeFront(String shipToCompNmLikeFront) {
        this.shipToCompNmLikeFront = shipToCompNmLikeFront;
    }

    /**
     * shipToCntryCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCntryCdGreaterThan
     */
    public String getShipToCntryCdGreaterThan() {
        return shipToCntryCdGreaterThan;
    }

    /**
     * shipToCntryCdGreaterThan のセッターメソッドです。
     * 
     * @param shipToCntryCdGreaterThan shipToCntryCdGreaterThan に設定する
     */
    public void setShipToCntryCdGreaterThan(String shipToCntryCdGreaterThan) {
        this.shipToCntryCdGreaterThan = shipToCntryCdGreaterThan;
    }

    /**
     * shipToCntryCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCntryCdGreaterThanEqual
     */
    public String getShipToCntryCdGreaterThanEqual() {
        return shipToCntryCdGreaterThanEqual;
    }

    /**
     * shipToCntryCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCntryCdGreaterThanEqual shipToCntryCdGreaterThanEqual に設定する
     */
    public void setShipToCntryCdGreaterThanEqual(String shipToCntryCdGreaterThanEqual) {
        this.shipToCntryCdGreaterThanEqual = shipToCntryCdGreaterThanEqual;
    }

    /**
     * shipToCntryCdLessThan のゲッターメソッドです。
     * 
     * @return the shipToCntryCdLessThan
     */
    public String getShipToCntryCdLessThan() {
        return shipToCntryCdLessThan;
    }

    /**
     * shipToCntryCdLessThan のセッターメソッドです。
     * 
     * @param shipToCntryCdLessThan shipToCntryCdLessThan に設定する
     */
    public void setShipToCntryCdLessThan(String shipToCntryCdLessThan) {
        this.shipToCntryCdLessThan = shipToCntryCdLessThan;
    }

    /**
     * shipToCntryCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCntryCdLessThanEqual
     */
    public String getShipToCntryCdLessThanEqual() {
        return shipToCntryCdLessThanEqual;
    }

    /**
     * shipToCntryCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCntryCdLessThanEqual shipToCntryCdLessThanEqual に設定する
     */
    public void setShipToCntryCdLessThanEqual(String shipToCntryCdLessThanEqual) {
        this.shipToCntryCdLessThanEqual = shipToCntryCdLessThanEqual;
    }

    /**
     * shipToCntryCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCntryCdLikeFront
     */
    public String getShipToCntryCdLikeFront() {
        return shipToCntryCdLikeFront;
    }

    /**
     * shipToCntryCdLikeFront のセッターメソッドです。
     * 
     * @param shipToCntryCdLikeFront shipToCntryCdLikeFront に設定する
     */
    public void setShipToCntryCdLikeFront(String shipToCntryCdLikeFront) {
        this.shipToCntryCdLikeFront = shipToCntryCdLikeFront;
    }

    /**
     * shipToCompAddrGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCompAddrGreaterThan
     */
    public String getShipToCompAddrGreaterThan() {
        return shipToCompAddrGreaterThan;
    }

    /**
     * shipToCompAddrGreaterThan のセッターメソッドです。
     * 
     * @param shipToCompAddrGreaterThan shipToCompAddrGreaterThan に設定する
     */
    public void setShipToCompAddrGreaterThan(String shipToCompAddrGreaterThan) {
        this.shipToCompAddrGreaterThan = shipToCompAddrGreaterThan;
    }

    /**
     * shipToCompAddrGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompAddrGreaterThanEqual
     */
    public String getShipToCompAddrGreaterThanEqual() {
        return shipToCompAddrGreaterThanEqual;
    }

    /**
     * shipToCompAddrGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCompAddrGreaterThanEqual shipToCompAddrGreaterThanEqual に設定する
     */
    public void setShipToCompAddrGreaterThanEqual(String shipToCompAddrGreaterThanEqual) {
        this.shipToCompAddrGreaterThanEqual = shipToCompAddrGreaterThanEqual;
    }

    /**
     * shipToCompAddrLessThan のゲッターメソッドです。
     * 
     * @return the shipToCompAddrLessThan
     */
    public String getShipToCompAddrLessThan() {
        return shipToCompAddrLessThan;
    }

    /**
     * shipToCompAddrLessThan のセッターメソッドです。
     * 
     * @param shipToCompAddrLessThan shipToCompAddrLessThan に設定する
     */
    public void setShipToCompAddrLessThan(String shipToCompAddrLessThan) {
        this.shipToCompAddrLessThan = shipToCompAddrLessThan;
    }

    /**
     * shipToCompAddrLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompAddrLessThanEqual
     */
    public String getShipToCompAddrLessThanEqual() {
        return shipToCompAddrLessThanEqual;
    }

    /**
     * shipToCompAddrLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCompAddrLessThanEqual shipToCompAddrLessThanEqual に設定する
     */
    public void setShipToCompAddrLessThanEqual(String shipToCompAddrLessThanEqual) {
        this.shipToCompAddrLessThanEqual = shipToCompAddrLessThanEqual;
    }

    /**
     * shipToCompAddrLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCompAddrLikeFront
     */
    public String getShipToCompAddrLikeFront() {
        return shipToCompAddrLikeFront;
    }

    /**
     * shipToCompAddrLikeFront のセッターメソッドです。
     * 
     * @param shipToCompAddrLikeFront shipToCompAddrLikeFront に設定する
     */
    public void setShipToCompAddrLikeFront(String shipToCompAddrLikeFront) {
        this.shipToCompAddrLikeFront = shipToCompAddrLikeFront;
    }

    /**
     * shipToCompTelGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCompTelGreaterThan
     */
    public String getShipToCompTelGreaterThan() {
        return shipToCompTelGreaterThan;
    }

    /**
     * shipToCompTelGreaterThan のセッターメソッドです。
     * 
     * @param shipToCompTelGreaterThan shipToCompTelGreaterThan に設定する
     */
    public void setShipToCompTelGreaterThan(String shipToCompTelGreaterThan) {
        this.shipToCompTelGreaterThan = shipToCompTelGreaterThan;
    }

    /**
     * shipToCompTelGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompTelGreaterThanEqual
     */
    public String getShipToCompTelGreaterThanEqual() {
        return shipToCompTelGreaterThanEqual;
    }

    /**
     * shipToCompTelGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCompTelGreaterThanEqual shipToCompTelGreaterThanEqual に設定する
     */
    public void setShipToCompTelGreaterThanEqual(String shipToCompTelGreaterThanEqual) {
        this.shipToCompTelGreaterThanEqual = shipToCompTelGreaterThanEqual;
    }

    /**
     * shipToCompTelLessThan のゲッターメソッドです。
     * 
     * @return the shipToCompTelLessThan
     */
    public String getShipToCompTelLessThan() {
        return shipToCompTelLessThan;
    }

    /**
     * shipToCompTelLessThan のセッターメソッドです。
     * 
     * @param shipToCompTelLessThan shipToCompTelLessThan に設定する
     */
    public void setShipToCompTelLessThan(String shipToCompTelLessThan) {
        this.shipToCompTelLessThan = shipToCompTelLessThan;
    }

    /**
     * shipToCompTelLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompTelLessThanEqual
     */
    public String getShipToCompTelLessThanEqual() {
        return shipToCompTelLessThanEqual;
    }

    /**
     * shipToCompTelLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCompTelLessThanEqual shipToCompTelLessThanEqual に設定する
     */
    public void setShipToCompTelLessThanEqual(String shipToCompTelLessThanEqual) {
        this.shipToCompTelLessThanEqual = shipToCompTelLessThanEqual;
    }

    /**
     * shipToCompTelLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCompTelLikeFront
     */
    public String getShipToCompTelLikeFront() {
        return shipToCompTelLikeFront;
    }

    /**
     * shipToCompTelLikeFront のセッターメソッドです。
     * 
     * @param shipToCompTelLikeFront shipToCompTelLikeFront に設定する
     */
    public void setShipToCompTelLikeFront(String shipToCompTelLikeFront) {
        this.shipToCompTelLikeFront = shipToCompTelLikeFront;
    }

    /**
     * shipToCompDeptNmGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCompDeptNmGreaterThan
     */
    public String getShipToCompDeptNmGreaterThan() {
        return shipToCompDeptNmGreaterThan;
    }

    /**
     * shipToCompDeptNmGreaterThan のセッターメソッドです。
     * 
     * @param shipToCompDeptNmGreaterThan shipToCompDeptNmGreaterThan に設定する
     */
    public void setShipToCompDeptNmGreaterThan(String shipToCompDeptNmGreaterThan) {
        this.shipToCompDeptNmGreaterThan = shipToCompDeptNmGreaterThan;
    }

    /**
     * shipToCompDeptNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompDeptNmGreaterThanEqual
     */
    public String getShipToCompDeptNmGreaterThanEqual() {
        return shipToCompDeptNmGreaterThanEqual;
    }

    /**
     * shipToCompDeptNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCompDeptNmGreaterThanEqual shipToCompDeptNmGreaterThanEqual に設定する
     */
    public void setShipToCompDeptNmGreaterThanEqual(String shipToCompDeptNmGreaterThanEqual) {
        this.shipToCompDeptNmGreaterThanEqual = shipToCompDeptNmGreaterThanEqual;
    }

    /**
     * shipToCompDeptNmLessThan のゲッターメソッドです。
     * 
     * @return the shipToCompDeptNmLessThan
     */
    public String getShipToCompDeptNmLessThan() {
        return shipToCompDeptNmLessThan;
    }

    /**
     * shipToCompDeptNmLessThan のセッターメソッドです。
     * 
     * @param shipToCompDeptNmLessThan shipToCompDeptNmLessThan に設定する
     */
    public void setShipToCompDeptNmLessThan(String shipToCompDeptNmLessThan) {
        this.shipToCompDeptNmLessThan = shipToCompDeptNmLessThan;
    }

    /**
     * shipToCompDeptNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompDeptNmLessThanEqual
     */
    public String getShipToCompDeptNmLessThanEqual() {
        return shipToCompDeptNmLessThanEqual;
    }

    /**
     * shipToCompDeptNmLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCompDeptNmLessThanEqual shipToCompDeptNmLessThanEqual に設定する
     */
    public void setShipToCompDeptNmLessThanEqual(String shipToCompDeptNmLessThanEqual) {
        this.shipToCompDeptNmLessThanEqual = shipToCompDeptNmLessThanEqual;
    }

    /**
     * shipToCompDeptNmLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCompDeptNmLikeFront
     */
    public String getShipToCompDeptNmLikeFront() {
        return shipToCompDeptNmLikeFront;
    }

    /**
     * shipToCompDeptNmLikeFront のセッターメソッドです。
     * 
     * @param shipToCompDeptNmLikeFront shipToCompDeptNmLikeFront に設定する
     */
    public void setShipToCompDeptNmLikeFront(String shipToCompDeptNmLikeFront) {
        this.shipToCompDeptNmLikeFront = shipToCompDeptNmLikeFront;
    }

    /**
     * shipToAttnNmGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToAttnNmGreaterThan
     */
    public String getShipToAttnNmGreaterThan() {
        return shipToAttnNmGreaterThan;
    }

    /**
     * shipToAttnNmGreaterThan のセッターメソッドです。
     * 
     * @param shipToAttnNmGreaterThan shipToAttnNmGreaterThan に設定する
     */
    public void setShipToAttnNmGreaterThan(String shipToAttnNmGreaterThan) {
        this.shipToAttnNmGreaterThan = shipToAttnNmGreaterThan;
    }

    /**
     * shipToAttnNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToAttnNmGreaterThanEqual
     */
    public String getShipToAttnNmGreaterThanEqual() {
        return shipToAttnNmGreaterThanEqual;
    }

    /**
     * shipToAttnNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToAttnNmGreaterThanEqual shipToAttnNmGreaterThanEqual に設定する
     */
    public void setShipToAttnNmGreaterThanEqual(String shipToAttnNmGreaterThanEqual) {
        this.shipToAttnNmGreaterThanEqual = shipToAttnNmGreaterThanEqual;
    }

    /**
     * shipToAttnNmLessThan のゲッターメソッドです。
     * 
     * @return the shipToAttnNmLessThan
     */
    public String getShipToAttnNmLessThan() {
        return shipToAttnNmLessThan;
    }

    /**
     * shipToAttnNmLessThan のセッターメソッドです。
     * 
     * @param shipToAttnNmLessThan shipToAttnNmLessThan に設定する
     */
    public void setShipToAttnNmLessThan(String shipToAttnNmLessThan) {
        this.shipToAttnNmLessThan = shipToAttnNmLessThan;
    }

    /**
     * shipToAttnNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToAttnNmLessThanEqual
     */
    public String getShipToAttnNmLessThanEqual() {
        return shipToAttnNmLessThanEqual;
    }

    /**
     * shipToAttnNmLessThanEqual のセッターメソッドです。
     * 
     * @param shipToAttnNmLessThanEqual shipToAttnNmLessThanEqual に設定する
     */
    public void setShipToAttnNmLessThanEqual(String shipToAttnNmLessThanEqual) {
        this.shipToAttnNmLessThanEqual = shipToAttnNmLessThanEqual;
    }

    /**
     * shipToAttnNmLikeFront のゲッターメソッドです。
     * 
     * @return the shipToAttnNmLikeFront
     */
    public String getShipToAttnNmLikeFront() {
        return shipToAttnNmLikeFront;
    }

    /**
     * shipToAttnNmLikeFront のセッターメソッドです。
     * 
     * @param shipToAttnNmLikeFront shipToAttnNmLikeFront に設定する
     */
    public void setShipToAttnNmLikeFront(String shipToAttnNmLikeFront) {
        this.shipToAttnNmLikeFront = shipToAttnNmLikeFront;
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
     * priceTermsGreaterThan のゲッターメソッドです。
     * 
     * @return the priceTermsGreaterThan
     */
    public String getPriceTermsGreaterThan() {
        return priceTermsGreaterThan;
    }

    /**
     * priceTermsGreaterThan のセッターメソッドです。
     * 
     * @param priceTermsGreaterThan priceTermsGreaterThan に設定する
     */
    public void setPriceTermsGreaterThan(String priceTermsGreaterThan) {
        this.priceTermsGreaterThan = priceTermsGreaterThan;
    }

    /**
     * priceTermsGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the priceTermsGreaterThanEqual
     */
    public String getPriceTermsGreaterThanEqual() {
        return priceTermsGreaterThanEqual;
    }

    /**
     * priceTermsGreaterThanEqual のセッターメソッドです。
     * 
     * @param priceTermsGreaterThanEqual priceTermsGreaterThanEqual に設定する
     */
    public void setPriceTermsGreaterThanEqual(String priceTermsGreaterThanEqual) {
        this.priceTermsGreaterThanEqual = priceTermsGreaterThanEqual;
    }

    /**
     * priceTermsLessThan のゲッターメソッドです。
     * 
     * @return the priceTermsLessThan
     */
    public String getPriceTermsLessThan() {
        return priceTermsLessThan;
    }

    /**
     * priceTermsLessThan のセッターメソッドです。
     * 
     * @param priceTermsLessThan priceTermsLessThan に設定する
     */
    public void setPriceTermsLessThan(String priceTermsLessThan) {
        this.priceTermsLessThan = priceTermsLessThan;
    }

    /**
     * priceTermsLessThanEqual のゲッターメソッドです。
     * 
     * @return the priceTermsLessThanEqual
     */
    public String getPriceTermsLessThanEqual() {
        return priceTermsLessThanEqual;
    }

    /**
     * priceTermsLessThanEqual のセッターメソッドです。
     * 
     * @param priceTermsLessThanEqual priceTermsLessThanEqual に設定する
     */
    public void setPriceTermsLessThanEqual(String priceTermsLessThanEqual) {
        this.priceTermsLessThanEqual = priceTermsLessThanEqual;
    }

    /**
     * priceTermsLikeFront のゲッターメソッドです。
     * 
     * @return the priceTermsLikeFront
     */
    public String getPriceTermsLikeFront() {
        return priceTermsLikeFront;
    }

    /**
     * priceTermsLikeFront のセッターメソッドです。
     * 
     * @param priceTermsLikeFront priceTermsLikeFront に設定する
     */
    public void setPriceTermsLikeFront(String priceTermsLikeFront) {
        this.priceTermsLikeFront = priceTermsLikeFront;
    }

    /**
     * priceTerms1GreaterThan のゲッターメソッドです。
     * 
     * @return the priceTerms1GreaterThan
     */
    public String getPriceTerms1GreaterThan() {
        return priceTerms1GreaterThan;
    }

    /**
     * priceTerms1GreaterThan のセッターメソッドです。
     * 
     * @param priceTerms1GreaterThan priceTerms1GreaterThan に設定する
     */
    public void setPriceTerms1GreaterThan(String priceTerms1GreaterThan) {
        this.priceTerms1GreaterThan = priceTerms1GreaterThan;
    }

    /**
     * priceTerms1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the priceTerms1GreaterThanEqual
     */
    public String getPriceTerms1GreaterThanEqual() {
        return priceTerms1GreaterThanEqual;
    }

    /**
     * priceTerms1GreaterThanEqual のセッターメソッドです。
     * 
     * @param priceTerms1GreaterThanEqual priceTerms1GreaterThanEqual に設定する
     */
    public void setPriceTerms1GreaterThanEqual(String priceTerms1GreaterThanEqual) {
        this.priceTerms1GreaterThanEqual = priceTerms1GreaterThanEqual;
    }

    /**
     * priceTerms1LessThan のゲッターメソッドです。
     * 
     * @return the priceTerms1LessThan
     */
    public String getPriceTerms1LessThan() {
        return priceTerms1LessThan;
    }

    /**
     * priceTerms1LessThan のセッターメソッドです。
     * 
     * @param priceTerms1LessThan priceTerms1LessThan に設定する
     */
    public void setPriceTerms1LessThan(String priceTerms1LessThan) {
        this.priceTerms1LessThan = priceTerms1LessThan;
    }

    /**
     * priceTerms1LessThanEqual のゲッターメソッドです。
     * 
     * @return the priceTerms1LessThanEqual
     */
    public String getPriceTerms1LessThanEqual() {
        return priceTerms1LessThanEqual;
    }

    /**
     * priceTerms1LessThanEqual のセッターメソッドです。
     * 
     * @param priceTerms1LessThanEqual priceTerms1LessThanEqual に設定する
     */
    public void setPriceTerms1LessThanEqual(String priceTerms1LessThanEqual) {
        this.priceTerms1LessThanEqual = priceTerms1LessThanEqual;
    }

    /**
     * priceTerms1LikeFront のゲッターメソッドです。
     * 
     * @return the priceTerms1LikeFront
     */
    public String getPriceTerms1LikeFront() {
        return priceTerms1LikeFront;
    }

    /**
     * priceTerms1LikeFront のセッターメソッドです。
     * 
     * @param priceTerms1LikeFront priceTerms1LikeFront に設定する
     */
    public void setPriceTerms1LikeFront(String priceTerms1LikeFront) {
        this.priceTerms1LikeFront = priceTerms1LikeFront;
    }

    /**
     * priceTerms2GreaterThan のゲッターメソッドです。
     * 
     * @return the priceTerms2GreaterThan
     */
    public String getPriceTerms2GreaterThan() {
        return priceTerms2GreaterThan;
    }

    /**
     * priceTerms2GreaterThan のセッターメソッドです。
     * 
     * @param priceTerms2GreaterThan priceTerms2GreaterThan に設定する
     */
    public void setPriceTerms2GreaterThan(String priceTerms2GreaterThan) {
        this.priceTerms2GreaterThan = priceTerms2GreaterThan;
    }

    /**
     * priceTerms2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the priceTerms2GreaterThanEqual
     */
    public String getPriceTerms2GreaterThanEqual() {
        return priceTerms2GreaterThanEqual;
    }

    /**
     * priceTerms2GreaterThanEqual のセッターメソッドです。
     * 
     * @param priceTerms2GreaterThanEqual priceTerms2GreaterThanEqual に設定する
     */
    public void setPriceTerms2GreaterThanEqual(String priceTerms2GreaterThanEqual) {
        this.priceTerms2GreaterThanEqual = priceTerms2GreaterThanEqual;
    }

    /**
     * priceTerms2LessThan のゲッターメソッドです。
     * 
     * @return the priceTerms2LessThan
     */
    public String getPriceTerms2LessThan() {
        return priceTerms2LessThan;
    }

    /**
     * priceTerms2LessThan のセッターメソッドです。
     * 
     * @param priceTerms2LessThan priceTerms2LessThan に設定する
     */
    public void setPriceTerms2LessThan(String priceTerms2LessThan) {
        this.priceTerms2LessThan = priceTerms2LessThan;
    }

    /**
     * priceTerms2LessThanEqual のゲッターメソッドです。
     * 
     * @return the priceTerms2LessThanEqual
     */
    public String getPriceTerms2LessThanEqual() {
        return priceTerms2LessThanEqual;
    }

    /**
     * priceTerms2LessThanEqual のセッターメソッドです。
     * 
     * @param priceTerms2LessThanEqual priceTerms2LessThanEqual に設定する
     */
    public void setPriceTerms2LessThanEqual(String priceTerms2LessThanEqual) {
        this.priceTerms2LessThanEqual = priceTerms2LessThanEqual;
    }

    /**
     * priceTerms2LikeFront のゲッターメソッドです。
     * 
     * @return the priceTerms2LikeFront
     */
    public String getPriceTerms2LikeFront() {
        return priceTerms2LikeFront;
    }

    /**
     * priceTerms2LikeFront のセッターメソッドです。
     * 
     * @param priceTerms2LikeFront priceTerms2LikeFront に設定する
     */
    public void setPriceTerms2LikeFront(String priceTerms2LikeFront) {
        this.priceTerms2LikeFront = priceTerms2LikeFront;
    }

    /**
     * payMethGreaterThan のゲッターメソッドです。
     * 
     * @return the payMethGreaterThan
     */
    public String getPayMethGreaterThan() {
        return payMethGreaterThan;
    }

    /**
     * payMethGreaterThan のセッターメソッドです。
     * 
     * @param payMethGreaterThan payMethGreaterThan に設定する
     */
    public void setPayMethGreaterThan(String payMethGreaterThan) {
        this.payMethGreaterThan = payMethGreaterThan;
    }

    /**
     * payMethGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the payMethGreaterThanEqual
     */
    public String getPayMethGreaterThanEqual() {
        return payMethGreaterThanEqual;
    }

    /**
     * payMethGreaterThanEqual のセッターメソッドです。
     * 
     * @param payMethGreaterThanEqual payMethGreaterThanEqual に設定する
     */
    public void setPayMethGreaterThanEqual(String payMethGreaterThanEqual) {
        this.payMethGreaterThanEqual = payMethGreaterThanEqual;
    }

    /**
     * payMethLessThan のゲッターメソッドです。
     * 
     * @return the payMethLessThan
     */
    public String getPayMethLessThan() {
        return payMethLessThan;
    }

    /**
     * payMethLessThan のセッターメソッドです。
     * 
     * @param payMethLessThan payMethLessThan に設定する
     */
    public void setPayMethLessThan(String payMethLessThan) {
        this.payMethLessThan = payMethLessThan;
    }

    /**
     * payMethLessThanEqual のゲッターメソッドです。
     * 
     * @return the payMethLessThanEqual
     */
    public String getPayMethLessThanEqual() {
        return payMethLessThanEqual;
    }

    /**
     * payMethLessThanEqual のセッターメソッドです。
     * 
     * @param payMethLessThanEqual payMethLessThanEqual に設定する
     */
    public void setPayMethLessThanEqual(String payMethLessThanEqual) {
        this.payMethLessThanEqual = payMethLessThanEqual;
    }

    /**
     * payMethLikeFront のゲッターメソッドです。
     * 
     * @return the payMethLikeFront
     */
    public String getPayMethLikeFront() {
        return payMethLikeFront;
    }

    /**
     * payMethLikeFront のセッターメソッドです。
     * 
     * @param payMethLikeFront payMethLikeFront に設定する
     */
    public void setPayMethLikeFront(String payMethLikeFront) {
        this.payMethLikeFront = payMethLikeFront;
    }

    /**
     * payTermsGreaterThan のゲッターメソッドです。
     * 
     * @return the payTermsGreaterThan
     */
    public String getPayTermsGreaterThan() {
        return payTermsGreaterThan;
    }

    /**
     * payTermsGreaterThan のセッターメソッドです。
     * 
     * @param payTermsGreaterThan payTermsGreaterThan に設定する
     */
    public void setPayTermsGreaterThan(String payTermsGreaterThan) {
        this.payTermsGreaterThan = payTermsGreaterThan;
    }

    /**
     * payTermsGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the payTermsGreaterThanEqual
     */
    public String getPayTermsGreaterThanEqual() {
        return payTermsGreaterThanEqual;
    }

    /**
     * payTermsGreaterThanEqual のセッターメソッドです。
     * 
     * @param payTermsGreaterThanEqual payTermsGreaterThanEqual に設定する
     */
    public void setPayTermsGreaterThanEqual(String payTermsGreaterThanEqual) {
        this.payTermsGreaterThanEqual = payTermsGreaterThanEqual;
    }

    /**
     * payTermsLessThan のゲッターメソッドです。
     * 
     * @return the payTermsLessThan
     */
    public String getPayTermsLessThan() {
        return payTermsLessThan;
    }

    /**
     * payTermsLessThan のセッターメソッドです。
     * 
     * @param payTermsLessThan payTermsLessThan に設定する
     */
    public void setPayTermsLessThan(String payTermsLessThan) {
        this.payTermsLessThan = payTermsLessThan;
    }

    /**
     * payTermsLessThanEqual のゲッターメソッドです。
     * 
     * @return the payTermsLessThanEqual
     */
    public String getPayTermsLessThanEqual() {
        return payTermsLessThanEqual;
    }

    /**
     * payTermsLessThanEqual のセッターメソッドです。
     * 
     * @param payTermsLessThanEqual payTermsLessThanEqual に設定する
     */
    public void setPayTermsLessThanEqual(String payTermsLessThanEqual) {
        this.payTermsLessThanEqual = payTermsLessThanEqual;
    }

    /**
     * payTermsLikeFront のゲッターメソッドです。
     * 
     * @return the payTermsLikeFront
     */
    public String getPayTermsLikeFront() {
        return payTermsLikeFront;
    }

    /**
     * payTermsLikeFront のセッターメソッドです。
     * 
     * @param payTermsLikeFront payTermsLikeFront に設定する
     */
    public void setPayTermsLikeFront(String payTermsLikeFront) {
        this.payTermsLikeFront = payTermsLikeFront;
    }

    /**
     * tradeTermsGreaterThan のゲッターメソッドです。
     * 
     * @return the tradeTermsGreaterThan
     */
    public String geW1006radeTermsGreaterThan() {
        return tradeTermsGreaterThan;
    }

    /**
     * tradeTermsGreaterThan のセッターメソッドです。
     * 
     * @param tradeTermsGreaterThan tradeTermsGreaterThan に設定する
     */
    public void seW1006radeTermsGreaterThan(String tradeTermsGreaterThan) {
        this.tradeTermsGreaterThan = tradeTermsGreaterThan;
    }

    /**
     * tradeTermsGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the tradeTermsGreaterThanEqual
     */
    public String geW1006radeTermsGreaterThanEqual() {
        return tradeTermsGreaterThanEqual;
    }

    /**
     * tradeTermsGreaterThanEqual のセッターメソッドです。
     * 
     * @param tradeTermsGreaterThanEqual tradeTermsGreaterThanEqual に設定する
     */
    public void seW1006radeTermsGreaterThanEqual(String tradeTermsGreaterThanEqual) {
        this.tradeTermsGreaterThanEqual = tradeTermsGreaterThanEqual;
    }

    /**
     * tradeTermsLessThan のゲッターメソッドです。
     * 
     * @return the tradeTermsLessThan
     */
    public String geW1006radeTermsLessThan() {
        return tradeTermsLessThan;
    }

    /**
     * tradeTermsLessThan のセッターメソッドです。
     * 
     * @param tradeTermsLessThan tradeTermsLessThan に設定する
     */
    public void seW1006radeTermsLessThan(String tradeTermsLessThan) {
        this.tradeTermsLessThan = tradeTermsLessThan;
    }

    /**
     * tradeTermsLessThanEqual のゲッターメソッドです。
     * 
     * @return the tradeTermsLessThanEqual
     */
    public String geW1006radeTermsLessThanEqual() {
        return tradeTermsLessThanEqual;
    }

    /**
     * tradeTermsLessThanEqual のセッターメソッドです。
     * 
     * @param tradeTermsLessThanEqual tradeTermsLessThanEqual に設定する
     */
    public void seW1006radeTermsLessThanEqual(String tradeTermsLessThanEqual) {
        this.tradeTermsLessThanEqual = tradeTermsLessThanEqual;
    }

    /**
     * tradeTermsLikeFront のゲッターメソッドです。
     * 
     * @return the tradeTermsLikeFront
     */
    public String geW1006radeTermsLikeFront() {
        return tradeTermsLikeFront;
    }

    /**
     * tradeTermsLikeFront のセッターメソッドです。
     * 
     * @param tradeTermsLikeFront tradeTermsLikeFront に設定する
     */
    public void seW1006radeTermsLikeFront(String tradeTermsLikeFront) {
        this.tradeTermsLikeFront = tradeTermsLikeFront;
    }

    /**
     * trnsCdGreaterThan のゲッターメソッドです。
     * 
     * @return the trnsCdGreaterThan
     */
    public String geW1006rnsCdGreaterThan() {
        return trnsCdGreaterThan;
    }

    /**
     * trnsCdGreaterThan のセッターメソッドです。
     * 
     * @param trnsCdGreaterThan trnsCdGreaterThan に設定する
     */
    public void seW1006rnsCdGreaterThan(String trnsCdGreaterThan) {
        this.trnsCdGreaterThan = trnsCdGreaterThan;
    }

    /**
     * trnsCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdGreaterThanEqual
     */
    public String geW1006rnsCdGreaterThanEqual() {
        return trnsCdGreaterThanEqual;
    }

    /**
     * trnsCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param trnsCdGreaterThanEqual trnsCdGreaterThanEqual に設定する
     */
    public void seW1006rnsCdGreaterThanEqual(String trnsCdGreaterThanEqual) {
        this.trnsCdGreaterThanEqual = trnsCdGreaterThanEqual;
    }

    /**
     * trnsCdLessThan のゲッターメソッドです。
     * 
     * @return the trnsCdLessThan
     */
    public String geW1006rnsCdLessThan() {
        return trnsCdLessThan;
    }

    /**
     * trnsCdLessThan のセッターメソッドです。
     * 
     * @param trnsCdLessThan trnsCdLessThan に設定する
     */
    public void seW1006rnsCdLessThan(String trnsCdLessThan) {
        this.trnsCdLessThan = trnsCdLessThan;
    }

    /**
     * trnsCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdLessThanEqual
     */
    public String geW1006rnsCdLessThanEqual() {
        return trnsCdLessThanEqual;
    }

    /**
     * trnsCdLessThanEqual のセッターメソッドです。
     * 
     * @param trnsCdLessThanEqual trnsCdLessThanEqual に設定する
     */
    public void seW1006rnsCdLessThanEqual(String trnsCdLessThanEqual) {
        this.trnsCdLessThanEqual = trnsCdLessThanEqual;
    }

    /**
     * trnsCdLikeFront のゲッターメソッドです。
     * 
     * @return the trnsCdLikeFront
     */
    public String geW1006rnsCdLikeFront() {
        return trnsCdLikeFront;
    }

    /**
     * trnsCdLikeFront のセッターメソッドです。
     * 
     * @param trnsCdLikeFront trnsCdLikeFront に設定する
     */
    public void seW1006rnsCdLikeFront(String trnsCdLikeFront) {
        this.trnsCdLikeFront = trnsCdLikeFront;
    }

    /**
     * splitShippingNgFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the splitShippingNgFlgGreaterThan
     */
    public String getSplitShippingNgFlgGreaterThan() {
        return splitShippingNgFlgGreaterThan;
    }

    /**
     * splitShippingNgFlgGreaterThan のセッターメソッドです。
     * 
     * @param splitShippingNgFlgGreaterThan splitShippingNgFlgGreaterThan に設定する
     */
    public void setSplitShippingNgFlgGreaterThan(String splitShippingNgFlgGreaterThan) {
        this.splitShippingNgFlgGreaterThan = splitShippingNgFlgGreaterThan;
    }

    /**
     * splitShippingNgFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the splitShippingNgFlgGreaterThanEqual
     */
    public String getSplitShippingNgFlgGreaterThanEqual() {
        return splitShippingNgFlgGreaterThanEqual;
    }

    /**
     * splitShippingNgFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param splitShippingNgFlgGreaterThanEqual splitShippingNgFlgGreaterThanEqual に設定する
     */
    public void setSplitShippingNgFlgGreaterThanEqual(String splitShippingNgFlgGreaterThanEqual) {
        this.splitShippingNgFlgGreaterThanEqual = splitShippingNgFlgGreaterThanEqual;
    }

    /**
     * splitShippingNgFlgLessThan のゲッターメソッドです。
     * 
     * @return the splitShippingNgFlgLessThan
     */
    public String getSplitShippingNgFlgLessThan() {
        return splitShippingNgFlgLessThan;
    }

    /**
     * splitShippingNgFlgLessThan のセッターメソッドです。
     * 
     * @param splitShippingNgFlgLessThan splitShippingNgFlgLessThan に設定する
     */
    public void setSplitShippingNgFlgLessThan(String splitShippingNgFlgLessThan) {
        this.splitShippingNgFlgLessThan = splitShippingNgFlgLessThan;
    }

    /**
     * splitShippingNgFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the splitShippingNgFlgLessThanEqual
     */
    public String getSplitShippingNgFlgLessThanEqual() {
        return splitShippingNgFlgLessThanEqual;
    }

    /**
     * splitShippingNgFlgLessThanEqual のセッターメソッドです。
     * 
     * @param splitShippingNgFlgLessThanEqual splitShippingNgFlgLessThanEqual に設定する
     */
    public void setSplitShippingNgFlgLessThanEqual(String splitShippingNgFlgLessThanEqual) {
        this.splitShippingNgFlgLessThanEqual = splitShippingNgFlgLessThanEqual;
    }

    /**
     * splitShippingNgFlgLikeFront のゲッターメソッドです。
     * 
     * @return the splitShippingNgFlgLikeFront
     */
    public String getSplitShippingNgFlgLikeFront() {
        return splitShippingNgFlgLikeFront;
    }

    /**
     * splitShippingNgFlgLikeFront のセッターメソッドです。
     * 
     * @param splitShippingNgFlgLikeFront splitShippingNgFlgLikeFront に設定する
     */
    public void setSplitShippingNgFlgLikeFront(String splitShippingNgFlgLikeFront) {
        this.splitShippingNgFlgLikeFront = splitShippingNgFlgLikeFront;
    }

    /**
     * dueDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dueDtGreaterThanEqual
     */
    public Date getDueDtGreaterThanEqual() {
        return dueDtGreaterThanEqual;
    }

    /**
     * dueDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param dueDtGreaterThanEqual dueDtGreaterThanEqual に設定する
     */
    public void setDueDtGreaterThanEqual(Date dueDtGreaterThanEqual) {
        this.dueDtGreaterThanEqual = dueDtGreaterThanEqual;
    }

    /**
     * dueDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the dueDtLessThanEqual
     */
    public Date getDueDtLessThanEqual() {
        return dueDtLessThanEqual;
    }

    /**
     * dueDtLessThanEqual のセッターメソッドです。
     * 
     * @param dueDtLessThanEqual dueDtLessThanEqual に設定する
     */
    public void setDueDtLessThanEqual(Date dueDtLessThanEqual) {
        this.dueDtLessThanEqual = dueDtLessThanEqual;
    }

    /**
     * requiredShipDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the requiredShipDtGreaterThanEqual
     */
    public Date getRequiredShipDtGreaterThanEqual() {
        return requiredShipDtGreaterThanEqual;
    }

    /**
     * requiredShipDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param requiredShipDtGreaterThanEqual requiredShipDtGreaterThanEqual に設定する
     */
    public void setRequiredShipDtGreaterThanEqual(Date requiredShipDtGreaterThanEqual) {
        this.requiredShipDtGreaterThanEqual = requiredShipDtGreaterThanEqual;
    }

    /**
     * requiredShipDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the requiredShipDtLessThanEqual
     */
    public Date getRequiredShipDtLessThanEqual() {
        return requiredShipDtLessThanEqual;
    }

    /**
     * requiredShipDtLessThanEqual のセッターメソッドです。
     * 
     * @param requiredShipDtLessThanEqual requiredShipDtLessThanEqual に設定する
     */
    public void setRequiredShipDtLessThanEqual(Date requiredShipDtLessThanEqual) {
        this.requiredShipDtLessThanEqual = requiredShipDtLessThanEqual;
    }

    /**
     * packingWhCdGreaterThan のゲッターメソッドです。
     * 
     * @return the packingWhCdGreaterThan
     */
    public String getPackingWhCdGreaterThan() {
        return packingWhCdGreaterThan;
    }

    /**
     * packingWhCdGreaterThan のセッターメソッドです。
     * 
     * @param packingWhCdGreaterThan packingWhCdGreaterThan に設定する
     */
    public void setPackingWhCdGreaterThan(String packingWhCdGreaterThan) {
        this.packingWhCdGreaterThan = packingWhCdGreaterThan;
    }

    /**
     * packingWhCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the packingWhCdGreaterThanEqual
     */
    public String getPackingWhCdGreaterThanEqual() {
        return packingWhCdGreaterThanEqual;
    }

    /**
     * packingWhCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param packingWhCdGreaterThanEqual packingWhCdGreaterThanEqual に設定する
     */
    public void setPackingWhCdGreaterThanEqual(String packingWhCdGreaterThanEqual) {
        this.packingWhCdGreaterThanEqual = packingWhCdGreaterThanEqual;
    }

    /**
     * packingWhCdLessThan のゲッターメソッドです。
     * 
     * @return the packingWhCdLessThan
     */
    public String getPackingWhCdLessThan() {
        return packingWhCdLessThan;
    }

    /**
     * packingWhCdLessThan のセッターメソッドです。
     * 
     * @param packingWhCdLessThan packingWhCdLessThan に設定する
     */
    public void setPackingWhCdLessThan(String packingWhCdLessThan) {
        this.packingWhCdLessThan = packingWhCdLessThan;
    }

    /**
     * packingWhCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the packingWhCdLessThanEqual
     */
    public String getPackingWhCdLessThanEqual() {
        return packingWhCdLessThanEqual;
    }

    /**
     * packingWhCdLessThanEqual のセッターメソッドです。
     * 
     * @param packingWhCdLessThanEqual packingWhCdLessThanEqual に設定する
     */
    public void setPackingWhCdLessThanEqual(String packingWhCdLessThanEqual) {
        this.packingWhCdLessThanEqual = packingWhCdLessThanEqual;
    }

    /**
     * packingWhCdLikeFront のゲッターメソッドです。
     * 
     * @return the packingWhCdLikeFront
     */
    public String getPackingWhCdLikeFront() {
        return packingWhCdLikeFront;
    }

    /**
     * packingWhCdLikeFront のセッターメソッドです。
     * 
     * @param packingWhCdLikeFront packingWhCdLikeFront に設定する
     */
    public void setPackingWhCdLikeFront(String packingWhCdLikeFront) {
        this.packingWhCdLikeFront = packingWhCdLikeFront;
    }

    /**
     * packingCompLocationFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the packingCompLocationFlgGreaterThan
     */
    public String getPackingCompLocationFlgGreaterThan() {
        return packingCompLocationFlgGreaterThan;
    }

    /**
     * packingCompLocationFlgGreaterThan のセッターメソッドです。
     * 
     * @param packingCompLocationFlgGreaterThan packingCompLocationFlgGreaterThan に設定する
     */
    public void setPackingCompLocationFlgGreaterThan(String packingCompLocationFlgGreaterThan) {
        this.packingCompLocationFlgGreaterThan = packingCompLocationFlgGreaterThan;
    }

    /**
     * packingCompLocationFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the packingCompLocationFlgGreaterThanEqual
     */
    public String getPackingCompLocationFlgGreaterThanEqual() {
        return packingCompLocationFlgGreaterThanEqual;
    }

    /**
     * packingCompLocationFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param packingCompLocationFlgGreaterThanEqual packingCompLocationFlgGreaterThanEqual に設定する
     */
    public void setPackingCompLocationFlgGreaterThanEqual(String packingCompLocationFlgGreaterThanEqual) {
        this.packingCompLocationFlgGreaterThanEqual = packingCompLocationFlgGreaterThanEqual;
    }

    /**
     * packingCompLocationFlgLessThan のゲッターメソッドです。
     * 
     * @return the packingCompLocationFlgLessThan
     */
    public String getPackingCompLocationFlgLessThan() {
        return packingCompLocationFlgLessThan;
    }

    /**
     * packingCompLocationFlgLessThan のセッターメソッドです。
     * 
     * @param packingCompLocationFlgLessThan packingCompLocationFlgLessThan に設定する
     */
    public void setPackingCompLocationFlgLessThan(String packingCompLocationFlgLessThan) {
        this.packingCompLocationFlgLessThan = packingCompLocationFlgLessThan;
    }

    /**
     * packingCompLocationFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the packingCompLocationFlgLessThanEqual
     */
    public String getPackingCompLocationFlgLessThanEqual() {
        return packingCompLocationFlgLessThanEqual;
    }

    /**
     * packingCompLocationFlgLessThanEqual のセッターメソッドです。
     * 
     * @param packingCompLocationFlgLessThanEqual packingCompLocationFlgLessThanEqual に設定する
     */
    public void setPackingCompLocationFlgLessThanEqual(String packingCompLocationFlgLessThanEqual) {
        this.packingCompLocationFlgLessThanEqual = packingCompLocationFlgLessThanEqual;
    }

    /**
     * packingCompLocationFlgLikeFront のゲッターメソッドです。
     * 
     * @return the packingCompLocationFlgLikeFront
     */
    public String getPackingCompLocationFlgLikeFront() {
        return packingCompLocationFlgLikeFront;
    }

    /**
     * packingCompLocationFlgLikeFront のセッターメソッドです。
     * 
     * @param packingCompLocationFlgLikeFront packingCompLocationFlgLikeFront に設定する
     */
    public void setPackingCompLocationFlgLikeFront(String packingCompLocationFlgLikeFront) {
        this.packingCompLocationFlgLikeFront = packingCompLocationFlgLikeFront;
    }

    /**
     * packingCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the packingCompCdGreaterThan
     */
    public String getPackingCompCdGreaterThan() {
        return packingCompCdGreaterThan;
    }

    /**
     * packingCompCdGreaterThan のセッターメソッドです。
     * 
     * @param packingCompCdGreaterThan packingCompCdGreaterThan に設定する
     */
    public void setPackingCompCdGreaterThan(String packingCompCdGreaterThan) {
        this.packingCompCdGreaterThan = packingCompCdGreaterThan;
    }

    /**
     * packingCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the packingCompCdGreaterThanEqual
     */
    public String getPackingCompCdGreaterThanEqual() {
        return packingCompCdGreaterThanEqual;
    }

    /**
     * packingCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param packingCompCdGreaterThanEqual packingCompCdGreaterThanEqual に設定する
     */
    public void setPackingCompCdGreaterThanEqual(String packingCompCdGreaterThanEqual) {
        this.packingCompCdGreaterThanEqual = packingCompCdGreaterThanEqual;
    }

    /**
     * packingCompCdLessThan のゲッターメソッドです。
     * 
     * @return the packingCompCdLessThan
     */
    public String getPackingCompCdLessThan() {
        return packingCompCdLessThan;
    }

    /**
     * packingCompCdLessThan のセッターメソッドです。
     * 
     * @param packingCompCdLessThan packingCompCdLessThan に設定する
     */
    public void setPackingCompCdLessThan(String packingCompCdLessThan) {
        this.packingCompCdLessThan = packingCompCdLessThan;
    }

    /**
     * packingCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the packingCompCdLessThanEqual
     */
    public String getPackingCompCdLessThanEqual() {
        return packingCompCdLessThanEqual;
    }

    /**
     * packingCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param packingCompCdLessThanEqual packingCompCdLessThanEqual に設定する
     */
    public void setPackingCompCdLessThanEqual(String packingCompCdLessThanEqual) {
        this.packingCompCdLessThanEqual = packingCompCdLessThanEqual;
    }

    /**
     * packingCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the packingCompCdLikeFront
     */
    public String getPackingCompCdLikeFront() {
        return packingCompCdLikeFront;
    }

    /**
     * packingCompCdLikeFront のセッターメソッドです。
     * 
     * @param packingCompCdLikeFront packingCompCdLikeFront に設定する
     */
    public void setPackingCompCdLikeFront(String packingCompCdLikeFront) {
        this.packingCompCdLikeFront = packingCompCdLikeFront;
    }

    /**
     * packingCompDeptNmGreaterThan のゲッターメソッドです。
     * 
     * @return the packingCompDeptNmGreaterThan
     */
    public String getPackingCompDeptNmGreaterThan() {
        return packingCompDeptNmGreaterThan;
    }

    /**
     * packingCompDeptNmGreaterThan のセッターメソッドです。
     * 
     * @param packingCompDeptNmGreaterThan packingCompDeptNmGreaterThan に設定する
     */
    public void setPackingCompDeptNmGreaterThan(String packingCompDeptNmGreaterThan) {
        this.packingCompDeptNmGreaterThan = packingCompDeptNmGreaterThan;
    }

    /**
     * packingCompDeptNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the packingCompDeptNmGreaterThanEqual
     */
    public String getPackingCompDeptNmGreaterThanEqual() {
        return packingCompDeptNmGreaterThanEqual;
    }

    /**
     * packingCompDeptNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param packingCompDeptNmGreaterThanEqual packingCompDeptNmGreaterThanEqual に設定する
     */
    public void setPackingCompDeptNmGreaterThanEqual(String packingCompDeptNmGreaterThanEqual) {
        this.packingCompDeptNmGreaterThanEqual = packingCompDeptNmGreaterThanEqual;
    }

    /**
     * packingCompDeptNmLessThan のゲッターメソッドです。
     * 
     * @return the packingCompDeptNmLessThan
     */
    public String getPackingCompDeptNmLessThan() {
        return packingCompDeptNmLessThan;
    }

    /**
     * packingCompDeptNmLessThan のセッターメソッドです。
     * 
     * @param packingCompDeptNmLessThan packingCompDeptNmLessThan に設定する
     */
    public void setPackingCompDeptNmLessThan(String packingCompDeptNmLessThan) {
        this.packingCompDeptNmLessThan = packingCompDeptNmLessThan;
    }

    /**
     * packingCompDeptNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the packingCompDeptNmLessThanEqual
     */
    public String getPackingCompDeptNmLessThanEqual() {
        return packingCompDeptNmLessThanEqual;
    }

    /**
     * packingCompDeptNmLessThanEqual のセッターメソッドです。
     * 
     * @param packingCompDeptNmLessThanEqual packingCompDeptNmLessThanEqual に設定する
     */
    public void setPackingCompDeptNmLessThanEqual(String packingCompDeptNmLessThanEqual) {
        this.packingCompDeptNmLessThanEqual = packingCompDeptNmLessThanEqual;
    }

    /**
     * packingCompDeptNmLikeFront のゲッターメソッドです。
     * 
     * @return the packingCompDeptNmLikeFront
     */
    public String getPackingCompDeptNmLikeFront() {
        return packingCompDeptNmLikeFront;
    }

    /**
     * packingCompDeptNmLikeFront のセッターメソッドです。
     * 
     * @param packingCompDeptNmLikeFront packingCompDeptNmLikeFront に設定する
     */
    public void setPackingCompDeptNmLikeFront(String packingCompDeptNmLikeFront) {
        this.packingCompDeptNmLikeFront = packingCompDeptNmLikeFront;
    }

    /**
     * requestToPackingSecGreaterThan のゲッターメソッドです。
     * 
     * @return the requestToPackingSecGreaterThan
     */
    public String getRequestToPackingSecGreaterThan() {
        return requestToPackingSecGreaterThan;
    }

    /**
     * requestToPackingSecGreaterThan のセッターメソッドです。
     * 
     * @param requestToPackingSecGreaterThan requestToPackingSecGreaterThan に設定する
     */
    public void setRequestToPackingSecGreaterThan(String requestToPackingSecGreaterThan) {
        this.requestToPackingSecGreaterThan = requestToPackingSecGreaterThan;
    }

    /**
     * requestToPackingSecGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the requestToPackingSecGreaterThanEqual
     */
    public String getRequestToPackingSecGreaterThanEqual() {
        return requestToPackingSecGreaterThanEqual;
    }

    /**
     * requestToPackingSecGreaterThanEqual のセッターメソッドです。
     * 
     * @param requestToPackingSecGreaterThanEqual requestToPackingSecGreaterThanEqual に設定する
     */
    public void setRequestToPackingSecGreaterThanEqual(String requestToPackingSecGreaterThanEqual) {
        this.requestToPackingSecGreaterThanEqual = requestToPackingSecGreaterThanEqual;
    }

    /**
     * requestToPackingSecLessThan のゲッターメソッドです。
     * 
     * @return the requestToPackingSecLessThan
     */
    public String getRequestToPackingSecLessThan() {
        return requestToPackingSecLessThan;
    }

    /**
     * requestToPackingSecLessThan のセッターメソッドです。
     * 
     * @param requestToPackingSecLessThan requestToPackingSecLessThan に設定する
     */
    public void setRequestToPackingSecLessThan(String requestToPackingSecLessThan) {
        this.requestToPackingSecLessThan = requestToPackingSecLessThan;
    }

    /**
     * requestToPackingSecLessThanEqual のゲッターメソッドです。
     * 
     * @return the requestToPackingSecLessThanEqual
     */
    public String getRequestToPackingSecLessThanEqual() {
        return requestToPackingSecLessThanEqual;
    }

    /**
     * requestToPackingSecLessThanEqual のセッターメソッドです。
     * 
     * @param requestToPackingSecLessThanEqual requestToPackingSecLessThanEqual に設定する
     */
    public void setRequestToPackingSecLessThanEqual(String requestToPackingSecLessThanEqual) {
        this.requestToPackingSecLessThanEqual = requestToPackingSecLessThanEqual;
    }

    /**
     * requestToPackingSecLikeFront のゲッターメソッドです。
     * 
     * @return the requestToPackingSecLikeFront
     */
    public String getRequestToPackingSecLikeFront() {
        return requestToPackingSecLikeFront;
    }

    /**
     * requestToPackingSecLikeFront のセッターメソッドです。
     * 
     * @param requestToPackingSecLikeFront requestToPackingSecLikeFront に設定する
     */
    public void setRequestToPackingSecLikeFront(String requestToPackingSecLikeFront) {
        this.requestToPackingSecLikeFront = requestToPackingSecLikeFront;
    }

    /**
     * casemarkNotationGreaterThan のゲッターメソッドです。
     * 
     * @return the casemarkNotationGreaterThan
     */
    public String getCasemarkNotationGreaterThan() {
        return casemarkNotationGreaterThan;
    }

    /**
     * casemarkNotationGreaterThan のセッターメソッドです。
     * 
     * @param casemarkNotationGreaterThan casemarkNotationGreaterThan に設定する
     */
    public void setCasemarkNotationGreaterThan(String casemarkNotationGreaterThan) {
        this.casemarkNotationGreaterThan = casemarkNotationGreaterThan;
    }

    /**
     * casemarkNotationGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the casemarkNotationGreaterThanEqual
     */
    public String getCasemarkNotationGreaterThanEqual() {
        return casemarkNotationGreaterThanEqual;
    }

    /**
     * casemarkNotationGreaterThanEqual のセッターメソッドです。
     * 
     * @param casemarkNotationGreaterThanEqual casemarkNotationGreaterThanEqual に設定する
     */
    public void setCasemarkNotationGreaterThanEqual(String casemarkNotationGreaterThanEqual) {
        this.casemarkNotationGreaterThanEqual = casemarkNotationGreaterThanEqual;
    }

    /**
     * casemarkNotationLessThan のゲッターメソッドです。
     * 
     * @return the casemarkNotationLessThan
     */
    public String getCasemarkNotationLessThan() {
        return casemarkNotationLessThan;
    }

    /**
     * casemarkNotationLessThan のセッターメソッドです。
     * 
     * @param casemarkNotationLessThan casemarkNotationLessThan に設定する
     */
    public void setCasemarkNotationLessThan(String casemarkNotationLessThan) {
        this.casemarkNotationLessThan = casemarkNotationLessThan;
    }

    /**
     * casemarkNotationLessThanEqual のゲッターメソッドです。
     * 
     * @return the casemarkNotationLessThanEqual
     */
    public String getCasemarkNotationLessThanEqual() {
        return casemarkNotationLessThanEqual;
    }

    /**
     * casemarkNotationLessThanEqual のセッターメソッドです。
     * 
     * @param casemarkNotationLessThanEqual casemarkNotationLessThanEqual に設定する
     */
    public void setCasemarkNotationLessThanEqual(String casemarkNotationLessThanEqual) {
        this.casemarkNotationLessThanEqual = casemarkNotationLessThanEqual;
    }

    /**
     * casemarkNotationLikeFront のゲッターメソッドです。
     * 
     * @return the casemarkNotationLikeFront
     */
    public String getCasemarkNotationLikeFront() {
        return casemarkNotationLikeFront;
    }

    /**
     * casemarkNotationLikeFront のセッターメソッドです。
     * 
     * @param casemarkNotationLikeFront casemarkNotationLikeFront に設定する
     */
    public void setCasemarkNotationLikeFront(String casemarkNotationLikeFront) {
        this.casemarkNotationLikeFront = casemarkNotationLikeFront;
    }

    /**
     * freightResponsibleCdGreaterThan のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdGreaterThan
     */
    public String getFreightResponsibleCdGreaterThan() {
        return freightResponsibleCdGreaterThan;
    }

    /**
     * freightResponsibleCdGreaterThan のセッターメソッドです。
     * 
     * @param freightResponsibleCdGreaterThan freightResponsibleCdGreaterThan に設定する
     */
    public void setFreightResponsibleCdGreaterThan(String freightResponsibleCdGreaterThan) {
        this.freightResponsibleCdGreaterThan = freightResponsibleCdGreaterThan;
    }

    /**
     * freightResponsibleCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdGreaterThanEqual
     */
    public String getFreightResponsibleCdGreaterThanEqual() {
        return freightResponsibleCdGreaterThanEqual;
    }

    /**
     * freightResponsibleCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param freightResponsibleCdGreaterThanEqual freightResponsibleCdGreaterThanEqual に設定する
     */
    public void setFreightResponsibleCdGreaterThanEqual(String freightResponsibleCdGreaterThanEqual) {
        this.freightResponsibleCdGreaterThanEqual = freightResponsibleCdGreaterThanEqual;
    }

    /**
     * freightResponsibleCdLessThan のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdLessThan
     */
    public String getFreightResponsibleCdLessThan() {
        return freightResponsibleCdLessThan;
    }

    /**
     * freightResponsibleCdLessThan のセッターメソッドです。
     * 
     * @param freightResponsibleCdLessThan freightResponsibleCdLessThan に設定する
     */
    public void setFreightResponsibleCdLessThan(String freightResponsibleCdLessThan) {
        this.freightResponsibleCdLessThan = freightResponsibleCdLessThan;
    }

    /**
     * freightResponsibleCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdLessThanEqual
     */
    public String getFreightResponsibleCdLessThanEqual() {
        return freightResponsibleCdLessThanEqual;
    }

    /**
     * freightResponsibleCdLessThanEqual のセッターメソッドです。
     * 
     * @param freightResponsibleCdLessThanEqual freightResponsibleCdLessThanEqual に設定する
     */
    public void setFreightResponsibleCdLessThanEqual(String freightResponsibleCdLessThanEqual) {
        this.freightResponsibleCdLessThanEqual = freightResponsibleCdLessThanEqual;
    }

    /**
     * freightResponsibleCdLikeFront のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdLikeFront
     */
    public String getFreightResponsibleCdLikeFront() {
        return freightResponsibleCdLikeFront;
    }

    /**
     * freightResponsibleCdLikeFront のセッターメソッドです。
     * 
     * @param freightResponsibleCdLikeFront freightResponsibleCdLikeFront に設定する
     */
    public void setFreightResponsibleCdLikeFront(String freightResponsibleCdLikeFront) {
        this.freightResponsibleCdLikeFront = freightResponsibleCdLikeFront;
    }

    /**
     * ctgryCd1GreaterThan のゲッターメソッドです。
     * 
     * @return the ctgryCd1GreaterThan
     */
    public String getCtgryCd1GreaterThan() {
        return ctgryCd1GreaterThan;
    }

    /**
     * ctgryCd1GreaterThan のセッターメソッドです。
     * 
     * @param ctgryCd1GreaterThan ctgryCd1GreaterThan に設定する
     */
    public void setCtgryCd1GreaterThan(String ctgryCd1GreaterThan) {
        this.ctgryCd1GreaterThan = ctgryCd1GreaterThan;
    }

    /**
     * ctgryCd1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the ctgryCd1GreaterThanEqual
     */
    public String getCtgryCd1GreaterThanEqual() {
        return ctgryCd1GreaterThanEqual;
    }

    /**
     * ctgryCd1GreaterThanEqual のセッターメソッドです。
     * 
     * @param ctgryCd1GreaterThanEqual ctgryCd1GreaterThanEqual に設定する
     */
    public void setCtgryCd1GreaterThanEqual(String ctgryCd1GreaterThanEqual) {
        this.ctgryCd1GreaterThanEqual = ctgryCd1GreaterThanEqual;
    }

    /**
     * ctgryCd1LessThan のゲッターメソッドです。
     * 
     * @return the ctgryCd1LessThan
     */
    public String getCtgryCd1LessThan() {
        return ctgryCd1LessThan;
    }

    /**
     * ctgryCd1LessThan のセッターメソッドです。
     * 
     * @param ctgryCd1LessThan ctgryCd1LessThan に設定する
     */
    public void setCtgryCd1LessThan(String ctgryCd1LessThan) {
        this.ctgryCd1LessThan = ctgryCd1LessThan;
    }

    /**
     * ctgryCd1LessThanEqual のゲッターメソッドです。
     * 
     * @return the ctgryCd1LessThanEqual
     */
    public String getCtgryCd1LessThanEqual() {
        return ctgryCd1LessThanEqual;
    }

    /**
     * ctgryCd1LessThanEqual のセッターメソッドです。
     * 
     * @param ctgryCd1LessThanEqual ctgryCd1LessThanEqual に設定する
     */
    public void setCtgryCd1LessThanEqual(String ctgryCd1LessThanEqual) {
        this.ctgryCd1LessThanEqual = ctgryCd1LessThanEqual;
    }

    /**
     * ctgryCd1LikeFront のゲッターメソッドです。
     * 
     * @return the ctgryCd1LikeFront
     */
    public String getCtgryCd1LikeFront() {
        return ctgryCd1LikeFront;
    }

    /**
     * ctgryCd1LikeFront のセッターメソッドです。
     * 
     * @param ctgryCd1LikeFront ctgryCd1LikeFront に設定する
     */
    public void setCtgryCd1LikeFront(String ctgryCd1LikeFront) {
        this.ctgryCd1LikeFront = ctgryCd1LikeFront;
    }

    /**
     * budgetNo1GreaterThan のゲッターメソッドです。
     * 
     * @return the budgetNo1GreaterThan
     */
    public String getBudgetNo1GreaterThan() {
        return budgetNo1GreaterThan;
    }

    /**
     * budgetNo1GreaterThan のセッターメソッドです。
     * 
     * @param budgetNo1GreaterThan budgetNo1GreaterThan に設定する
     */
    public void setBudgetNo1GreaterThan(String budgetNo1GreaterThan) {
        this.budgetNo1GreaterThan = budgetNo1GreaterThan;
    }

    /**
     * budgetNo1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the budgetNo1GreaterThanEqual
     */
    public String getBudgetNo1GreaterThanEqual() {
        return budgetNo1GreaterThanEqual;
    }

    /**
     * budgetNo1GreaterThanEqual のセッターメソッドです。
     * 
     * @param budgetNo1GreaterThanEqual budgetNo1GreaterThanEqual に設定する
     */
    public void setBudgetNo1GreaterThanEqual(String budgetNo1GreaterThanEqual) {
        this.budgetNo1GreaterThanEqual = budgetNo1GreaterThanEqual;
    }

    /**
     * budgetNo1LessThan のゲッターメソッドです。
     * 
     * @return the budgetNo1LessThan
     */
    public String getBudgetNo1LessThan() {
        return budgetNo1LessThan;
    }

    /**
     * budgetNo1LessThan のセッターメソッドです。
     * 
     * @param budgetNo1LessThan budgetNo1LessThan に設定する
     */
    public void setBudgetNo1LessThan(String budgetNo1LessThan) {
        this.budgetNo1LessThan = budgetNo1LessThan;
    }

    /**
     * budgetNo1LessThanEqual のゲッターメソッドです。
     * 
     * @return the budgetNo1LessThanEqual
     */
    public String getBudgetNo1LessThanEqual() {
        return budgetNo1LessThanEqual;
    }

    /**
     * budgetNo1LessThanEqual のセッターメソッドです。
     * 
     * @param budgetNo1LessThanEqual budgetNo1LessThanEqual に設定する
     */
    public void setBudgetNo1LessThanEqual(String budgetNo1LessThanEqual) {
        this.budgetNo1LessThanEqual = budgetNo1LessThanEqual;
    }

    /**
     * budgetNo1LikeFront のゲッターメソッドです。
     * 
     * @return the budgetNo1LikeFront
     */
    public String getBudgetNo1LikeFront() {
        return budgetNo1LikeFront;
    }

    /**
     * budgetNo1LikeFront のセッターメソッドです。
     * 
     * @param budgetNo1LikeFront budgetNo1LikeFront に設定する
     */
    public void setBudgetNo1LikeFront(String budgetNo1LikeFront) {
        this.budgetNo1LikeFront = budgetNo1LikeFront;
    }

    /**
     * jobNo1GreaterThan のゲッターメソッドです。
     * 
     * @return the jobNo1GreaterThan
     */
    public String getJobNo1GreaterThan() {
        return jobNo1GreaterThan;
    }

    /**
     * jobNo1GreaterThan のセッターメソッドです。
     * 
     * @param jobNo1GreaterThan jobNo1GreaterThan に設定する
     */
    public void setJobNo1GreaterThan(String jobNo1GreaterThan) {
        this.jobNo1GreaterThan = jobNo1GreaterThan;
    }

    /**
     * jobNo1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the jobNo1GreaterThanEqual
     */
    public String getJobNo1GreaterThanEqual() {
        return jobNo1GreaterThanEqual;
    }

    /**
     * jobNo1GreaterThanEqual のセッターメソッドです。
     * 
     * @param jobNo1GreaterThanEqual jobNo1GreaterThanEqual に設定する
     */
    public void setJobNo1GreaterThanEqual(String jobNo1GreaterThanEqual) {
        this.jobNo1GreaterThanEqual = jobNo1GreaterThanEqual;
    }

    /**
     * jobNo1LessThan のゲッターメソッドです。
     * 
     * @return the jobNo1LessThan
     */
    public String getJobNo1LessThan() {
        return jobNo1LessThan;
    }

    /**
     * jobNo1LessThan のセッターメソッドです。
     * 
     * @param jobNo1LessThan jobNo1LessThan に設定する
     */
    public void setJobNo1LessThan(String jobNo1LessThan) {
        this.jobNo1LessThan = jobNo1LessThan;
    }

    /**
     * jobNo1LessThanEqual のゲッターメソッドです。
     * 
     * @return the jobNo1LessThanEqual
     */
    public String getJobNo1LessThanEqual() {
        return jobNo1LessThanEqual;
    }

    /**
     * jobNo1LessThanEqual のセッターメソッドです。
     * 
     * @param jobNo1LessThanEqual jobNo1LessThanEqual に設定する
     */
    public void setJobNo1LessThanEqual(String jobNo1LessThanEqual) {
        this.jobNo1LessThanEqual = jobNo1LessThanEqual;
    }

    /**
     * jobNo1LikeFront のゲッターメソッドです。
     * 
     * @return the jobNo1LikeFront
     */
    public String getJobNo1LikeFront() {
        return jobNo1LikeFront;
    }

    /**
     * jobNo1LikeFront のセッターメソッドです。
     * 
     * @param jobNo1LikeFront jobNo1LikeFront に設定する
     */
    public void setJobNo1LikeFront(String jobNo1LikeFront) {
        this.jobNo1LikeFront = jobNo1LikeFront;
    }

    /**
     * ctgryCd2GreaterThan のゲッターメソッドです。
     * 
     * @return the ctgryCd2GreaterThan
     */
    public String getCtgryCd2GreaterThan() {
        return ctgryCd2GreaterThan;
    }

    /**
     * ctgryCd2GreaterThan のセッターメソッドです。
     * 
     * @param ctgryCd2GreaterThan ctgryCd2GreaterThan に設定する
     */
    public void setCtgryCd2GreaterThan(String ctgryCd2GreaterThan) {
        this.ctgryCd2GreaterThan = ctgryCd2GreaterThan;
    }

    /**
     * ctgryCd2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the ctgryCd2GreaterThanEqual
     */
    public String getCtgryCd2GreaterThanEqual() {
        return ctgryCd2GreaterThanEqual;
    }

    /**
     * ctgryCd2GreaterThanEqual のセッターメソッドです。
     * 
     * @param ctgryCd2GreaterThanEqual ctgryCd2GreaterThanEqual に設定する
     */
    public void setCtgryCd2GreaterThanEqual(String ctgryCd2GreaterThanEqual) {
        this.ctgryCd2GreaterThanEqual = ctgryCd2GreaterThanEqual;
    }

    /**
     * ctgryCd2LessThan のゲッターメソッドです。
     * 
     * @return the ctgryCd2LessThan
     */
    public String getCtgryCd2LessThan() {
        return ctgryCd2LessThan;
    }

    /**
     * ctgryCd2LessThan のセッターメソッドです。
     * 
     * @param ctgryCd2LessThan ctgryCd2LessThan に設定する
     */
    public void setCtgryCd2LessThan(String ctgryCd2LessThan) {
        this.ctgryCd2LessThan = ctgryCd2LessThan;
    }

    /**
     * ctgryCd2LessThanEqual のゲッターメソッドです。
     * 
     * @return the ctgryCd2LessThanEqual
     */
    public String getCtgryCd2LessThanEqual() {
        return ctgryCd2LessThanEqual;
    }

    /**
     * ctgryCd2LessThanEqual のセッターメソッドです。
     * 
     * @param ctgryCd2LessThanEqual ctgryCd2LessThanEqual に設定する
     */
    public void setCtgryCd2LessThanEqual(String ctgryCd2LessThanEqual) {
        this.ctgryCd2LessThanEqual = ctgryCd2LessThanEqual;
    }

    /**
     * ctgryCd2LikeFront のゲッターメソッドです。
     * 
     * @return the ctgryCd2LikeFront
     */
    public String getCtgryCd2LikeFront() {
        return ctgryCd2LikeFront;
    }

    /**
     * ctgryCd2LikeFront のセッターメソッドです。
     * 
     * @param ctgryCd2LikeFront ctgryCd2LikeFront に設定する
     */
    public void setCtgryCd2LikeFront(String ctgryCd2LikeFront) {
        this.ctgryCd2LikeFront = ctgryCd2LikeFront;
    }

    /**
     * budgetNo2GreaterThan のゲッターメソッドです。
     * 
     * @return the budgetNo2GreaterThan
     */
    public String getBudgetNo2GreaterThan() {
        return budgetNo2GreaterThan;
    }

    /**
     * budgetNo2GreaterThan のセッターメソッドです。
     * 
     * @param budgetNo2GreaterThan budgetNo2GreaterThan に設定する
     */
    public void setBudgetNo2GreaterThan(String budgetNo2GreaterThan) {
        this.budgetNo2GreaterThan = budgetNo2GreaterThan;
    }

    /**
     * budgetNo2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the budgetNo2GreaterThanEqual
     */
    public String getBudgetNo2GreaterThanEqual() {
        return budgetNo2GreaterThanEqual;
    }

    /**
     * budgetNo2GreaterThanEqual のセッターメソッドです。
     * 
     * @param budgetNo2GreaterThanEqual budgetNo2GreaterThanEqual に設定する
     */
    public void setBudgetNo2GreaterThanEqual(String budgetNo2GreaterThanEqual) {
        this.budgetNo2GreaterThanEqual = budgetNo2GreaterThanEqual;
    }

    /**
     * budgetNo2LessThan のゲッターメソッドです。
     * 
     * @return the budgetNo2LessThan
     */
    public String getBudgetNo2LessThan() {
        return budgetNo2LessThan;
    }

    /**
     * budgetNo2LessThan のセッターメソッドです。
     * 
     * @param budgetNo2LessThan budgetNo2LessThan に設定する
     */
    public void setBudgetNo2LessThan(String budgetNo2LessThan) {
        this.budgetNo2LessThan = budgetNo2LessThan;
    }

    /**
     * budgetNo2LessThanEqual のゲッターメソッドです。
     * 
     * @return the budgetNo2LessThanEqual
     */
    public String getBudgetNo2LessThanEqual() {
        return budgetNo2LessThanEqual;
    }

    /**
     * budgetNo2LessThanEqual のセッターメソッドです。
     * 
     * @param budgetNo2LessThanEqual budgetNo2LessThanEqual に設定する
     */
    public void setBudgetNo2LessThanEqual(String budgetNo2LessThanEqual) {
        this.budgetNo2LessThanEqual = budgetNo2LessThanEqual;
    }

    /**
     * budgetNo2LikeFront のゲッターメソッドです。
     * 
     * @return the budgetNo2LikeFront
     */
    public String getBudgetNo2LikeFront() {
        return budgetNo2LikeFront;
    }

    /**
     * budgetNo2LikeFront のセッターメソッドです。
     * 
     * @param budgetNo2LikeFront budgetNo2LikeFront に設定する
     */
    public void setBudgetNo2LikeFront(String budgetNo2LikeFront) {
        this.budgetNo2LikeFront = budgetNo2LikeFront;
    }

    /**
     * jobNo2GreaterThan のゲッターメソッドです。
     * 
     * @return the jobNo2GreaterThan
     */
    public String getJobNo2GreaterThan() {
        return jobNo2GreaterThan;
    }

    /**
     * jobNo2GreaterThan のセッターメソッドです。
     * 
     * @param jobNo2GreaterThan jobNo2GreaterThan に設定する
     */
    public void setJobNo2GreaterThan(String jobNo2GreaterThan) {
        this.jobNo2GreaterThan = jobNo2GreaterThan;
    }

    /**
     * jobNo2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the jobNo2GreaterThanEqual
     */
    public String getJobNo2GreaterThanEqual() {
        return jobNo2GreaterThanEqual;
    }

    /**
     * jobNo2GreaterThanEqual のセッターメソッドです。
     * 
     * @param jobNo2GreaterThanEqual jobNo2GreaterThanEqual に設定する
     */
    public void setJobNo2GreaterThanEqual(String jobNo2GreaterThanEqual) {
        this.jobNo2GreaterThanEqual = jobNo2GreaterThanEqual;
    }

    /**
     * jobNo2LessThan のゲッターメソッドです。
     * 
     * @return the jobNo2LessThan
     */
    public String getJobNo2LessThan() {
        return jobNo2LessThan;
    }

    /**
     * jobNo2LessThan のセッターメソッドです。
     * 
     * @param jobNo2LessThan jobNo2LessThan に設定する
     */
    public void setJobNo2LessThan(String jobNo2LessThan) {
        this.jobNo2LessThan = jobNo2LessThan;
    }

    /**
     * jobNo2LessThanEqual のゲッターメソッドです。
     * 
     * @return the jobNo2LessThanEqual
     */
    public String getJobNo2LessThanEqual() {
        return jobNo2LessThanEqual;
    }

    /**
     * jobNo2LessThanEqual のセッターメソッドです。
     * 
     * @param jobNo2LessThanEqual jobNo2LessThanEqual に設定する
     */
    public void setJobNo2LessThanEqual(String jobNo2LessThanEqual) {
        this.jobNo2LessThanEqual = jobNo2LessThanEqual;
    }

    /**
     * jobNo2LikeFront のゲッターメソッドです。
     * 
     * @return the jobNo2LikeFront
     */
    public String getJobNo2LikeFront() {
        return jobNo2LikeFront;
    }

    /**
     * jobNo2LikeFront のセッターメソッドです。
     * 
     * @param jobNo2LikeFront jobNo2LikeFront に設定する
     */
    public void setJobNo2LikeFront(String jobNo2LikeFront) {
        this.jobNo2LikeFront = jobNo2LikeFront;
    }

    /**
     * ctgryCd3GreaterThan のゲッターメソッドです。
     * 
     * @return the ctgryCd3GreaterThan
     */
    public String getCtgryCd3GreaterThan() {
        return ctgryCd3GreaterThan;
    }

    /**
     * ctgryCd3GreaterThan のセッターメソッドです。
     * 
     * @param ctgryCd3GreaterThan ctgryCd3GreaterThan に設定する
     */
    public void setCtgryCd3GreaterThan(String ctgryCd3GreaterThan) {
        this.ctgryCd3GreaterThan = ctgryCd3GreaterThan;
    }

    /**
     * ctgryCd3GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the ctgryCd3GreaterThanEqual
     */
    public String getCtgryCd3GreaterThanEqual() {
        return ctgryCd3GreaterThanEqual;
    }

    /**
     * ctgryCd3GreaterThanEqual のセッターメソッドです。
     * 
     * @param ctgryCd3GreaterThanEqual ctgryCd3GreaterThanEqual に設定する
     */
    public void setCtgryCd3GreaterThanEqual(String ctgryCd3GreaterThanEqual) {
        this.ctgryCd3GreaterThanEqual = ctgryCd3GreaterThanEqual;
    }

    /**
     * ctgryCd3LessThan のゲッターメソッドです。
     * 
     * @return the ctgryCd3LessThan
     */
    public String getCtgryCd3LessThan() {
        return ctgryCd3LessThan;
    }

    /**
     * ctgryCd3LessThan のセッターメソッドです。
     * 
     * @param ctgryCd3LessThan ctgryCd3LessThan に設定する
     */
    public void setCtgryCd3LessThan(String ctgryCd3LessThan) {
        this.ctgryCd3LessThan = ctgryCd3LessThan;
    }

    /**
     * ctgryCd3LessThanEqual のゲッターメソッドです。
     * 
     * @return the ctgryCd3LessThanEqual
     */
    public String getCtgryCd3LessThanEqual() {
        return ctgryCd3LessThanEqual;
    }

    /**
     * ctgryCd3LessThanEqual のセッターメソッドです。
     * 
     * @param ctgryCd3LessThanEqual ctgryCd3LessThanEqual に設定する
     */
    public void setCtgryCd3LessThanEqual(String ctgryCd3LessThanEqual) {
        this.ctgryCd3LessThanEqual = ctgryCd3LessThanEqual;
    }

    /**
     * ctgryCd3LikeFront のゲッターメソッドです。
     * 
     * @return the ctgryCd3LikeFront
     */
    public String getCtgryCd3LikeFront() {
        return ctgryCd3LikeFront;
    }

    /**
     * ctgryCd3LikeFront のセッターメソッドです。
     * 
     * @param ctgryCd3LikeFront ctgryCd3LikeFront に設定する
     */
    public void setCtgryCd3LikeFront(String ctgryCd3LikeFront) {
        this.ctgryCd3LikeFront = ctgryCd3LikeFront;
    }

    /**
     * budgetNo3GreaterThan のゲッターメソッドです。
     * 
     * @return the budgetNo3GreaterThan
     */
    public String getBudgetNo3GreaterThan() {
        return budgetNo3GreaterThan;
    }

    /**
     * budgetNo3GreaterThan のセッターメソッドです。
     * 
     * @param budgetNo3GreaterThan budgetNo3GreaterThan に設定する
     */
    public void setBudgetNo3GreaterThan(String budgetNo3GreaterThan) {
        this.budgetNo3GreaterThan = budgetNo3GreaterThan;
    }

    /**
     * budgetNo3GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the budgetNo3GreaterThanEqual
     */
    public String getBudgetNo3GreaterThanEqual() {
        return budgetNo3GreaterThanEqual;
    }

    /**
     * budgetNo3GreaterThanEqual のセッターメソッドです。
     * 
     * @param budgetNo3GreaterThanEqual budgetNo3GreaterThanEqual に設定する
     */
    public void setBudgetNo3GreaterThanEqual(String budgetNo3GreaterThanEqual) {
        this.budgetNo3GreaterThanEqual = budgetNo3GreaterThanEqual;
    }

    /**
     * budgetNo3LessThan のゲッターメソッドです。
     * 
     * @return the budgetNo3LessThan
     */
    public String getBudgetNo3LessThan() {
        return budgetNo3LessThan;
    }

    /**
     * budgetNo3LessThan のセッターメソッドです。
     * 
     * @param budgetNo3LessThan budgetNo3LessThan に設定する
     */
    public void setBudgetNo3LessThan(String budgetNo3LessThan) {
        this.budgetNo3LessThan = budgetNo3LessThan;
    }

    /**
     * budgetNo3LessThanEqual のゲッターメソッドです。
     * 
     * @return the budgetNo3LessThanEqual
     */
    public String getBudgetNo3LessThanEqual() {
        return budgetNo3LessThanEqual;
    }

    /**
     * budgetNo3LessThanEqual のセッターメソッドです。
     * 
     * @param budgetNo3LessThanEqual budgetNo3LessThanEqual に設定する
     */
    public void setBudgetNo3LessThanEqual(String budgetNo3LessThanEqual) {
        this.budgetNo3LessThanEqual = budgetNo3LessThanEqual;
    }

    /**
     * budgetNo3LikeFront のゲッターメソッドです。
     * 
     * @return the budgetNo3LikeFront
     */
    public String getBudgetNo3LikeFront() {
        return budgetNo3LikeFront;
    }

    /**
     * budgetNo3LikeFront のセッターメソッドです。
     * 
     * @param budgetNo3LikeFront budgetNo3LikeFront に設定する
     */
    public void setBudgetNo3LikeFront(String budgetNo3LikeFront) {
        this.budgetNo3LikeFront = budgetNo3LikeFront;
    }

    /**
     * jobNo3GreaterThan のゲッターメソッドです。
     * 
     * @return the jobNo3GreaterThan
     */
    public String getJobNo3GreaterThan() {
        return jobNo3GreaterThan;
    }

    /**
     * jobNo3GreaterThan のセッターメソッドです。
     * 
     * @param jobNo3GreaterThan jobNo3GreaterThan に設定する
     */
    public void setJobNo3GreaterThan(String jobNo3GreaterThan) {
        this.jobNo3GreaterThan = jobNo3GreaterThan;
    }

    /**
     * jobNo3GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the jobNo3GreaterThanEqual
     */
    public String getJobNo3GreaterThanEqual() {
        return jobNo3GreaterThanEqual;
    }

    /**
     * jobNo3GreaterThanEqual のセッターメソッドです。
     * 
     * @param jobNo3GreaterThanEqual jobNo3GreaterThanEqual に設定する
     */
    public void setJobNo3GreaterThanEqual(String jobNo3GreaterThanEqual) {
        this.jobNo3GreaterThanEqual = jobNo3GreaterThanEqual;
    }

    /**
     * jobNo3LessThan のゲッターメソッドです。
     * 
     * @return the jobNo3LessThan
     */
    public String getJobNo3LessThan() {
        return jobNo3LessThan;
    }

    /**
     * jobNo3LessThan のセッターメソッドです。
     * 
     * @param jobNo3LessThan jobNo3LessThan に設定する
     */
    public void setJobNo3LessThan(String jobNo3LessThan) {
        this.jobNo3LessThan = jobNo3LessThan;
    }

    /**
     * jobNo3LessThanEqual のゲッターメソッドです。
     * 
     * @return the jobNo3LessThanEqual
     */
    public String getJobNo3LessThanEqual() {
        return jobNo3LessThanEqual;
    }

    /**
     * jobNo3LessThanEqual のセッターメソッドです。
     * 
     * @param jobNo3LessThanEqual jobNo3LessThanEqual に設定する
     */
    public void setJobNo3LessThanEqual(String jobNo3LessThanEqual) {
        this.jobNo3LessThanEqual = jobNo3LessThanEqual;
    }

    /**
     * jobNo3LikeFront のゲッターメソッドです。
     * 
     * @return the jobNo3LikeFront
     */
    public String getJobNo3LikeFront() {
        return jobNo3LikeFront;
    }

    /**
     * jobNo3LikeFront のセッターメソッドです。
     * 
     * @param jobNo3LikeFront jobNo3LikeFront に設定する
     */
    public void setJobNo3LikeFront(String jobNo3LikeFront) {
        this.jobNo3LikeFront = jobNo3LikeFront;
    }

    /**
     * prepareExpInvoiceCtgryGreaterThan のゲッターメソッドです。
     * 
     * @return the prepareExpInvoiceCtgryGreaterThan
     */
    public String getPrepareExpInvoiceCtgryGreaterThan() {
        return prepareExpInvoiceCtgryGreaterThan;
    }

    /**
     * prepareExpInvoiceCtgryGreaterThan のセッターメソッドです。
     * 
     * @param prepareExpInvoiceCtgryGreaterThan prepareExpInvoiceCtgryGreaterThan に設定する
     */
    public void setPrepareExpInvoiceCtgryGreaterThan(String prepareExpInvoiceCtgryGreaterThan) {
        this.prepareExpInvoiceCtgryGreaterThan = prepareExpInvoiceCtgryGreaterThan;
    }

    /**
     * prepareExpInvoiceCtgryGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the prepareExpInvoiceCtgryGreaterThanEqual
     */
    public String getPrepareExpInvoiceCtgryGreaterThanEqual() {
        return prepareExpInvoiceCtgryGreaterThanEqual;
    }

    /**
     * prepareExpInvoiceCtgryGreaterThanEqual のセッターメソッドです。
     * 
     * @param prepareExpInvoiceCtgryGreaterThanEqual prepareExpInvoiceCtgryGreaterThanEqual に設定する
     */
    public void setPrepareExpInvoiceCtgryGreaterThanEqual(String prepareExpInvoiceCtgryGreaterThanEqual) {
        this.prepareExpInvoiceCtgryGreaterThanEqual = prepareExpInvoiceCtgryGreaterThanEqual;
    }

    /**
     * prepareExpInvoiceCtgryLessThan のゲッターメソッドです。
     * 
     * @return the prepareExpInvoiceCtgryLessThan
     */
    public String getPrepareExpInvoiceCtgryLessThan() {
        return prepareExpInvoiceCtgryLessThan;
    }

    /**
     * prepareExpInvoiceCtgryLessThan のセッターメソッドです。
     * 
     * @param prepareExpInvoiceCtgryLessThan prepareExpInvoiceCtgryLessThan に設定する
     */
    public void setPrepareExpInvoiceCtgryLessThan(String prepareExpInvoiceCtgryLessThan) {
        this.prepareExpInvoiceCtgryLessThan = prepareExpInvoiceCtgryLessThan;
    }

    /**
     * prepareExpInvoiceCtgryLessThanEqual のゲッターメソッドです。
     * 
     * @return the prepareExpInvoiceCtgryLessThanEqual
     */
    public String getPrepareExpInvoiceCtgryLessThanEqual() {
        return prepareExpInvoiceCtgryLessThanEqual;
    }

    /**
     * prepareExpInvoiceCtgryLessThanEqual のセッターメソッドです。
     * 
     * @param prepareExpInvoiceCtgryLessThanEqual prepareExpInvoiceCtgryLessThanEqual に設定する
     */
    public void setPrepareExpInvoiceCtgryLessThanEqual(String prepareExpInvoiceCtgryLessThanEqual) {
        this.prepareExpInvoiceCtgryLessThanEqual = prepareExpInvoiceCtgryLessThanEqual;
    }

    /**
     * prepareExpInvoiceCtgryLikeFront のゲッターメソッドです。
     * 
     * @return the prepareExpInvoiceCtgryLikeFront
     */
    public String getPrepareExpInvoiceCtgryLikeFront() {
        return prepareExpInvoiceCtgryLikeFront;
    }

    /**
     * prepareExpInvoiceCtgryLikeFront のセッターメソッドです。
     * 
     * @param prepareExpInvoiceCtgryLikeFront prepareExpInvoiceCtgryLikeFront に設定する
     */
    public void setPrepareExpInvoiceCtgryLikeFront(String prepareExpInvoiceCtgryLikeFront) {
        this.prepareExpInvoiceCtgryLikeFront = prepareExpInvoiceCtgryLikeFront;
    }

    /**
     * supplierInvoiceNoGreaterThan のゲッターメソッドです。
     * 
     * @return the supplierInvoiceNoGreaterThan
     */
    public String getSupplierInvoiceNoGreaterThan() {
        return supplierInvoiceNoGreaterThan;
    }

    /**
     * supplierInvoiceNoGreaterThan のセッターメソッドです。
     * 
     * @param supplierInvoiceNoGreaterThan supplierInvoiceNoGreaterThan に設定する
     */
    public void setSupplierInvoiceNoGreaterThan(String supplierInvoiceNoGreaterThan) {
        this.supplierInvoiceNoGreaterThan = supplierInvoiceNoGreaterThan;
    }

    /**
     * supplierInvoiceNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the supplierInvoiceNoGreaterThanEqual
     */
    public String getSupplierInvoiceNoGreaterThanEqual() {
        return supplierInvoiceNoGreaterThanEqual;
    }

    /**
     * supplierInvoiceNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param supplierInvoiceNoGreaterThanEqual supplierInvoiceNoGreaterThanEqual に設定する
     */
    public void setSupplierInvoiceNoGreaterThanEqual(String supplierInvoiceNoGreaterThanEqual) {
        this.supplierInvoiceNoGreaterThanEqual = supplierInvoiceNoGreaterThanEqual;
    }

    /**
     * supplierInvoiceNoLessThan のゲッターメソッドです。
     * 
     * @return the supplierInvoiceNoLessThan
     */
    public String getSupplierInvoiceNoLessThan() {
        return supplierInvoiceNoLessThan;
    }

    /**
     * supplierInvoiceNoLessThan のセッターメソッドです。
     * 
     * @param supplierInvoiceNoLessThan supplierInvoiceNoLessThan に設定する
     */
    public void setSupplierInvoiceNoLessThan(String supplierInvoiceNoLessThan) {
        this.supplierInvoiceNoLessThan = supplierInvoiceNoLessThan;
    }

    /**
     * supplierInvoiceNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the supplierInvoiceNoLessThanEqual
     */
    public String getSupplierInvoiceNoLessThanEqual() {
        return supplierInvoiceNoLessThanEqual;
    }

    /**
     * supplierInvoiceNoLessThanEqual のセッターメソッドです。
     * 
     * @param supplierInvoiceNoLessThanEqual supplierInvoiceNoLessThanEqual に設定する
     */
    public void setSupplierInvoiceNoLessThanEqual(String supplierInvoiceNoLessThanEqual) {
        this.supplierInvoiceNoLessThanEqual = supplierInvoiceNoLessThanEqual;
    }

    /**
     * supplierInvoiceNoLikeFront のゲッターメソッドです。
     * 
     * @return the supplierInvoiceNoLikeFront
     */
    public String getSupplierInvoiceNoLikeFront() {
        return supplierInvoiceNoLikeFront;
    }

    /**
     * supplierInvoiceNoLikeFront のセッターメソッドです。
     * 
     * @param supplierInvoiceNoLikeFront supplierInvoiceNoLikeFront に設定する
     */
    public void setSupplierInvoiceNoLikeFront(String supplierInvoiceNoLikeFront) {
        this.supplierInvoiceNoLikeFront = supplierInvoiceNoLikeFront;
    }

    /**
     * customerCdGreaterThan のゲッターメソッドです。
     * 
     * @return the customerCdGreaterThan
     */
    public String getCustomerCdGreaterThan() {
        return customerCdGreaterThan;
    }

    /**
     * customerCdGreaterThan のセッターメソッドです。
     * 
     * @param customerCdGreaterThan customerCdGreaterThan に設定する
     */
    public void setCustomerCdGreaterThan(String customerCdGreaterThan) {
        this.customerCdGreaterThan = customerCdGreaterThan;
    }

    /**
     * customerCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerCdGreaterThanEqual
     */
    public String getCustomerCdGreaterThanEqual() {
        return customerCdGreaterThanEqual;
    }

    /**
     * customerCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerCdGreaterThanEqual customerCdGreaterThanEqual に設定する
     */
    public void setCustomerCdGreaterThanEqual(String customerCdGreaterThanEqual) {
        this.customerCdGreaterThanEqual = customerCdGreaterThanEqual;
    }

    /**
     * customerCdLessThan のゲッターメソッドです。
     * 
     * @return the customerCdLessThan
     */
    public String getCustomerCdLessThan() {
        return customerCdLessThan;
    }

    /**
     * customerCdLessThan のセッターメソッドです。
     * 
     * @param customerCdLessThan customerCdLessThan に設定する
     */
    public void setCustomerCdLessThan(String customerCdLessThan) {
        this.customerCdLessThan = customerCdLessThan;
    }

    /**
     * customerCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerCdLessThanEqual
     */
    public String getCustomerCdLessThanEqual() {
        return customerCdLessThanEqual;
    }

    /**
     * customerCdLessThanEqual のセッターメソッドです。
     * 
     * @param customerCdLessThanEqual customerCdLessThanEqual に設定する
     */
    public void setCustomerCdLessThanEqual(String customerCdLessThanEqual) {
        this.customerCdLessThanEqual = customerCdLessThanEqual;
    }

    /**
     * customerCdLikeFront のゲッターメソッドです。
     * 
     * @return the customerCdLikeFront
     */
    public String getCustomerCdLikeFront() {
        return customerCdLikeFront;
    }

    /**
     * customerCdLikeFront のセッターメソッドです。
     * 
     * @param customerCdLikeFront customerCdLikeFront に設定する
     */
    public void setCustomerCdLikeFront(String customerCdLikeFront) {
        this.customerCdLikeFront = customerCdLikeFront;
    }

    /**
     * createOriginTypGreaterThan のゲッターメソッドです。
     * 
     * @return the createOriginTypGreaterThan
     */
    public String getCreateOriginTypGreaterThan() {
        return createOriginTypGreaterThan;
    }

    /**
     * createOriginTypGreaterThan のセッターメソッドです。
     * 
     * @param createOriginTypGreaterThan createOriginTypGreaterThan に設定する
     */
    public void setCreateOriginTypGreaterThan(String createOriginTypGreaterThan) {
        this.createOriginTypGreaterThan = createOriginTypGreaterThan;
    }

    /**
     * createOriginTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the createOriginTypGreaterThanEqual
     */
    public String getCreateOriginTypGreaterThanEqual() {
        return createOriginTypGreaterThanEqual;
    }

    /**
     * createOriginTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param createOriginTypGreaterThanEqual createOriginTypGreaterThanEqual に設定する
     */
    public void setCreateOriginTypGreaterThanEqual(String createOriginTypGreaterThanEqual) {
        this.createOriginTypGreaterThanEqual = createOriginTypGreaterThanEqual;
    }

    /**
     * createOriginTypLessThan のゲッターメソッドです。
     * 
     * @return the createOriginTypLessThan
     */
    public String getCreateOriginTypLessThan() {
        return createOriginTypLessThan;
    }

    /**
     * createOriginTypLessThan のセッターメソッドです。
     * 
     * @param createOriginTypLessThan createOriginTypLessThan に設定する
     */
    public void setCreateOriginTypLessThan(String createOriginTypLessThan) {
        this.createOriginTypLessThan = createOriginTypLessThan;
    }

    /**
     * createOriginTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the createOriginTypLessThanEqual
     */
    public String getCreateOriginTypLessThanEqual() {
        return createOriginTypLessThanEqual;
    }

    /**
     * createOriginTypLessThanEqual のセッターメソッドです。
     * 
     * @param createOriginTypLessThanEqual createOriginTypLessThanEqual に設定する
     */
    public void setCreateOriginTypLessThanEqual(String createOriginTypLessThanEqual) {
        this.createOriginTypLessThanEqual = createOriginTypLessThanEqual;
    }

    /**
     * createOriginTypLikeFront のゲッターメソッドです。
     * 
     * @return the createOriginTypLikeFront
     */
    public String getCreateOriginTypLikeFront() {
        return createOriginTypLikeFront;
    }

    /**
     * createOriginTypLikeFront のセッターメソッドです。
     * 
     * @param createOriginTypLikeFront createOriginTypLikeFront に設定する
     */
    public void setCreateOriginTypLikeFront(String createOriginTypLikeFront) {
        this.createOriginTypLikeFront = createOriginTypLikeFront;
    }

    /**
     * requestDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the requestDtGreaterThanEqual
     */
    public Date getRequestDtGreaterThanEqual() {
        return requestDtGreaterThanEqual;
    }

    /**
     * requestDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param requestDtGreaterThanEqual requestDtGreaterThanEqual に設定する
     */
    public void setRequestDtGreaterThanEqual(Date requestDtGreaterThanEqual) {
        this.requestDtGreaterThanEqual = requestDtGreaterThanEqual;
    }

    /**
     * requestDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the requestDtLessThanEqual
     */
    public Date getRequestDtLessThanEqual() {
        return requestDtLessThanEqual;
    }

    /**
     * requestDtLessThanEqual のセッターメソッドです。
     * 
     * @param requestDtLessThanEqual requestDtLessThanEqual に設定する
     */
    public void setRequestDtLessThanEqual(Date requestDtLessThanEqual) {
        this.requestDtLessThanEqual = requestDtLessThanEqual;
    }

    /**
     * requestStatusGreaterThan のゲッターメソッドです。
     * 
     * @return the requestStatusGreaterThan
     */
    public String getRequestStatusGreaterThan() {
        return requestStatusGreaterThan;
    }

    /**
     * requestStatusGreaterThan のセッターメソッドです。
     * 
     * @param requestStatusGreaterThan requestStatusGreaterThan に設定する
     */
    public void setRequestStatusGreaterThan(String requestStatusGreaterThan) {
        this.requestStatusGreaterThan = requestStatusGreaterThan;
    }

    /**
     * requestStatusGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the requestStatusGreaterThanEqual
     */
    public String getRequestStatusGreaterThanEqual() {
        return requestStatusGreaterThanEqual;
    }

    /**
     * requestStatusGreaterThanEqual のセッターメソッドです。
     * 
     * @param requestStatusGreaterThanEqual requestStatusGreaterThanEqual に設定する
     */
    public void setRequestStatusGreaterThanEqual(String requestStatusGreaterThanEqual) {
        this.requestStatusGreaterThanEqual = requestStatusGreaterThanEqual;
    }

    /**
     * requestStatusLessThan のゲッターメソッドです。
     * 
     * @return the requestStatusLessThan
     */
    public String getRequestStatusLessThan() {
        return requestStatusLessThan;
    }

    /**
     * requestStatusLessThan のセッターメソッドです。
     * 
     * @param requestStatusLessThan requestStatusLessThan に設定する
     */
    public void setRequestStatusLessThan(String requestStatusLessThan) {
        this.requestStatusLessThan = requestStatusLessThan;
    }

    /**
     * requestStatusLessThanEqual のゲッターメソッドです。
     * 
     * @return the requestStatusLessThanEqual
     */
    public String getRequestStatusLessThanEqual() {
        return requestStatusLessThanEqual;
    }

    /**
     * requestStatusLessThanEqual のセッターメソッドです。
     * 
     * @param requestStatusLessThanEqual requestStatusLessThanEqual に設定する
     */
    public void setRequestStatusLessThanEqual(String requestStatusLessThanEqual) {
        this.requestStatusLessThanEqual = requestStatusLessThanEqual;
    }

    /**
     * requestStatusLikeFront のゲッターメソッドです。
     * 
     * @return the requestStatusLikeFront
     */
    public String getRequestStatusLikeFront() {
        return requestStatusLikeFront;
    }

    /**
     * requestStatusLikeFront のセッターメソッドです。
     * 
     * @param requestStatusLikeFront requestStatusLikeFront に設定する
     */
    public void setRequestStatusLikeFront(String requestStatusLikeFront) {
        this.requestStatusLikeFront = requestStatusLikeFront;
    }

    /**
     * requestLastUpdateDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the requestLastUpdateDtGreaterThanEqual
     */
    public Date getRequestLastUpdateDtGreaterThanEqual() {
        return requestLastUpdateDtGreaterThanEqual;
    }

    /**
     * requestLastUpdateDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param requestLastUpdateDtGreaterThanEqual requestLastUpdateDtGreaterThanEqual に設定する
     */
    public void setRequestLastUpdateDtGreaterThanEqual(Date requestLastUpdateDtGreaterThanEqual) {
        this.requestLastUpdateDtGreaterThanEqual = requestLastUpdateDtGreaterThanEqual;
    }

    /**
     * requestLastUpdateDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the requestLastUpdateDtLessThanEqual
     */
    public Date getRequestLastUpdateDtLessThanEqual() {
        return requestLastUpdateDtLessThanEqual;
    }

    /**
     * requestLastUpdateDtLessThanEqual のセッターメソッドです。
     * 
     * @param requestLastUpdateDtLessThanEqual requestLastUpdateDtLessThanEqual に設定する
     */
    public void setRequestLastUpdateDtLessThanEqual(Date requestLastUpdateDtLessThanEqual) {
        this.requestLastUpdateDtLessThanEqual = requestLastUpdateDtLessThanEqual;
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

