/*
 * PROJECT：eca0027
 * 
 * TwInv の検索条件Domainクラス
 * テーブル概要：TW_INV
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.sql.Timestamp;

/**
 * TwInv の検索条件Domainクラスです。<BR>
 * テーブル概要：TW_INV<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class TwInvCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC_ID
     */
    private String dscId;

    /**
     * SHIPPER_CD
     */
    private String shipperCd;

    /**
     * CONSIGNEE_CD
     */
    private String consigneeCd;

    /**
     * SHIP_TO_CD
     */
    private String shipToCd;

    /**
     * SHIP_TO_COMP_CD
     */
    private String shipToCompCd;

    /**
     * CUSTOMER_CD
     */
    private String customerCd;

    /**
     * LGCY_SHIP_TO
     */
    private String lgcyShipTo;

    /**
     * PRICE_TERMS
     */
    private String priceTerms;

    /**
     * TRADE_TERMS
     */
    private String tradeTerms;

    /**
     * TERMS_POINT
     */
    private String termsPoint;

    /**
     * FREIGHT_RESPONSIBLE_CD
     */
    private String freightResponsibleCd;

    /**
     * PAY_TERMS
     */
    private String payTerms;

    /**
     * PAY_METH
     */
    private String payMeth;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * TRNS_CD_ORG
     */
    private String trnsCdOrg;

    /**
     * INVOICE_KEY
     */
    private String invoiceKey;

    /**
     * INVOICE_CTGRY
     */
    private String invoiceCtgry;

    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;

    /**
     * CONTAINER_LOOSE_TYP
     */
    private String containerLooseTyp;

    /**
     * CUSTOM_TIMING_TYP
     */
    private String customTimingTyp;

    /**
     * CML_TYP
     */
    private String cmlTyp;

    /**
     * CURR_CD
     */
    private String currCd;

    /**
     * RE_EXP_GOODS_FLG
     */
    private String reExpGoodsFlg;

    /**
     * SHIPPED_DT
     */
    private Date shippedDt;

    /**
     * SUPPLIER_INVOICE_NO
     */
    private String supplierInvoiceNo;

    /**
     * IMP_INVOICE_NO_1
     */
    private String impInvoiceNo1;

    /**
     * IMP_INVOICE_NO_2
     */
    private String impInvoiceNo2;

    /**
     * MIGRATION_FLG
     */
    private String migrationFlg;

    /**
     * GRP_NO_1
     */
    private String grpNo1;

    /**
     * GRP_NO_2
     */
    private String grpNo2;

    /**
     * DECISION_FLG
     */
    private String decisionFlg;

    /**
     * TEMP_INVOICE_NO
     */
    private String tempInvoiceNo;

    /**
     * INVOICE_NO
     */
    private String invoiceNo;

    /**
     * RE_INVOICE_FLG
     */
    private String reInvoiceFlg;

    /**
     * RE_INVOICE_SHIPPER_CD
     */
    private String reInvoiceShipperCd;

    /**
     * SALES_CONTRACT_FLG
     */
    private String salesContractFlg;

    /**
     * COM_UPDATE_FUNC_ID
     */
    private String comUpdateFuncId;

    /**
     * COM_UPDATE_USER_ID
     */
    private String comUpdateUserId;

    /**
     * COM_UPDATE_TIMESTAMP
     */
    private Timestamp comUpdateTimestamp;

    /**
     * COM_CREATE_FUNC_ID
     */
    private String comCreateFuncId;

    /**
     * COM_CREATE_USER_ID
     */
    private String comCreateUserId;

    /**
     * COM_CREATE_TIMESTAMP
     */
    private Timestamp comCreateTimestamp;

    /**
     * DSC_ID（大なり）
     */
    private String dscIdGreaterThan;

    /**
     * DSC_ID（大なりイコール）
     */
    private String dscIdGreaterThanEqual;

    /**
     * DSC_ID（小なり）
     */
    private String dscIdLessThan;

    /**
     * DSC_ID（小なりイコール）
     */
    private String dscIdLessThanEqual;

    /**
     * DSC_ID（前方一致）
     */
    private String dscIdLikeFront;

    /**
     * SHIPPER_CD（大なり）
     */
    private String shipperCdGreaterThan;

    /**
     * SHIPPER_CD（大なりイコール）
     */
    private String shipperCdGreaterThanEqual;

    /**
     * SHIPPER_CD（小なり）
     */
    private String shipperCdLessThan;

    /**
     * SHIPPER_CD（小なりイコール）
     */
    private String shipperCdLessThanEqual;

    /**
     * SHIPPER_CD（前方一致）
     */
    private String shipperCdLikeFront;

    /**
     * CONSIGNEE_CD（大なり）
     */
    private String consigneeCdGreaterThan;

    /**
     * CONSIGNEE_CD（大なりイコール）
     */
    private String consigneeCdGreaterThanEqual;

    /**
     * CONSIGNEE_CD（小なり）
     */
    private String consigneeCdLessThan;

    /**
     * CONSIGNEE_CD（小なりイコール）
     */
    private String consigneeCdLessThanEqual;

    /**
     * CONSIGNEE_CD（前方一致）
     */
    private String consigneeCdLikeFront;

    /**
     * SHIP_TO_CD（大なり）
     */
    private String shipToCdGreaterThan;

    /**
     * SHIP_TO_CD（大なりイコール）
     */
    private String shipToCdGreaterThanEqual;

    /**
     * SHIP_TO_CD（小なり）
     */
    private String shipToCdLessThan;

    /**
     * SHIP_TO_CD（小なりイコール）
     */
    private String shipToCdLessThanEqual;

    /**
     * SHIP_TO_CD（前方一致）
     */
    private String shipToCdLikeFront;

    /**
     * SHIP_TO_COMP_CD（大なり）
     */
    private String shipToCompCdGreaterThan;

    /**
     * SHIP_TO_COMP_CD（大なりイコール）
     */
    private String shipToCompCdGreaterThanEqual;

    /**
     * SHIP_TO_COMP_CD（小なり）
     */
    private String shipToCompCdLessThan;

    /**
     * SHIP_TO_COMP_CD（小なりイコール）
     */
    private String shipToCompCdLessThanEqual;

    /**
     * SHIP_TO_COMP_CD（前方一致）
     */
    private String shipToCompCdLikeFront;

    /**
     * CUSTOMER_CD（大なり）
     */
    private String customerCdGreaterThan;

    /**
     * CUSTOMER_CD（大なりイコール）
     */
    private String customerCdGreaterThanEqual;

    /**
     * CUSTOMER_CD（小なり）
     */
    private String customerCdLessThan;

    /**
     * CUSTOMER_CD（小なりイコール）
     */
    private String customerCdLessThanEqual;

    /**
     * CUSTOMER_CD（前方一致）
     */
    private String customerCdLikeFront;

    /**
     * LGCY_SHIP_TO（大なり）
     */
    private String lgcyShipToGreaterThan;

    /**
     * LGCY_SHIP_TO（大なりイコール）
     */
    private String lgcyShipToGreaterThanEqual;

    /**
     * LGCY_SHIP_TO（小なり）
     */
    private String lgcyShipToLessThan;

    /**
     * LGCY_SHIP_TO（小なりイコール）
     */
    private String lgcyShipToLessThanEqual;

    /**
     * LGCY_SHIP_TO（前方一致）
     */
    private String lgcyShipToLikeFront;

    /**
     * PRICE_TERMS（大なり）
     */
    private String priceTermsGreaterThan;

    /**
     * PRICE_TERMS（大なりイコール）
     */
    private String priceTermsGreaterThanEqual;

    /**
     * PRICE_TERMS（小なり）
     */
    private String priceTermsLessThan;

    /**
     * PRICE_TERMS（小なりイコール）
     */
    private String priceTermsLessThanEqual;

    /**
     * PRICE_TERMS（前方一致）
     */
    private String priceTermsLikeFront;

    /**
     * TRADE_TERMS（大なり）
     */
    private String tradeTermsGreaterThan;

    /**
     * TRADE_TERMS（大なりイコール）
     */
    private String tradeTermsGreaterThanEqual;

    /**
     * TRADE_TERMS（小なり）
     */
    private String tradeTermsLessThan;

    /**
     * TRADE_TERMS（小なりイコール）
     */
    private String tradeTermsLessThanEqual;

    /**
     * TRADE_TERMS（前方一致）
     */
    private String tradeTermsLikeFront;

    /**
     * TERMS_POINT（大なり）
     */
    private String termsPointGreaterThan;

    /**
     * TERMS_POINT（大なりイコール）
     */
    private String termsPointGreaterThanEqual;

    /**
     * TERMS_POINT（小なり）
     */
    private String termsPointLessThan;

    /**
     * TERMS_POINT（小なりイコール）
     */
    private String termsPointLessThanEqual;

    /**
     * TERMS_POINT（前方一致）
     */
    private String termsPointLikeFront;

    /**
     * FREIGHT_RESPONSIBLE_CD（大なり）
     */
    private String freightResponsibleCdGreaterThan;

    /**
     * FREIGHT_RESPONSIBLE_CD（大なりイコール）
     */
    private String freightResponsibleCdGreaterThanEqual;

    /**
     * FREIGHT_RESPONSIBLE_CD（小なり）
     */
    private String freightResponsibleCdLessThan;

    /**
     * FREIGHT_RESPONSIBLE_CD（小なりイコール）
     */
    private String freightResponsibleCdLessThanEqual;

    /**
     * FREIGHT_RESPONSIBLE_CD（前方一致）
     */
    private String freightResponsibleCdLikeFront;

    /**
     * PAY_TERMS（大なり）
     */
    private String payTermsGreaterThan;

    /**
     * PAY_TERMS（大なりイコール）
     */
    private String payTermsGreaterThanEqual;

    /**
     * PAY_TERMS（小なり）
     */
    private String payTermsLessThan;

    /**
     * PAY_TERMS（小なりイコール）
     */
    private String payTermsLessThanEqual;

    /**
     * PAY_TERMS（前方一致）
     */
    private String payTermsLikeFront;

    /**
     * PAY_METH（大なり）
     */
    private String payMethGreaterThan;

    /**
     * PAY_METH（大なりイコール）
     */
    private String payMethGreaterThanEqual;

    /**
     * PAY_METH（小なり）
     */
    private String payMethLessThan;

    /**
     * PAY_METH（小なりイコール）
     */
    private String payMethLessThanEqual;

    /**
     * PAY_METH（前方一致）
     */
    private String payMethLikeFront;

    /**
     * TRNS_CD（大なり）
     */
    private String trnsCdGreaterThan;

    /**
     * TRNS_CD（大なりイコール）
     */
    private String trnsCdGreaterThanEqual;

    /**
     * TRNS_CD（小なり）
     */
    private String trnsCdLessThan;

    /**
     * TRNS_CD（小なりイコール）
     */
    private String trnsCdLessThanEqual;

    /**
     * TRNS_CD（前方一致）
     */
    private String trnsCdLikeFront;

    /**
     * TRNS_CD_ORG（大なり）
     */
    private String trnsCdOrgGreaterThan;

    /**
     * TRNS_CD_ORG（大なりイコール）
     */
    private String trnsCdOrgGreaterThanEqual;

    /**
     * TRNS_CD_ORG（小なり）
     */
    private String trnsCdOrgLessThan;

    /**
     * TRNS_CD_ORG（小なりイコール）
     */
    private String trnsCdOrgLessThanEqual;

    /**
     * TRNS_CD_ORG（前方一致）
     */
    private String trnsCdOrgLikeFront;

    /**
     * INVOICE_KEY（大なり）
     */
    private String invoiceKeyGreaterThan;

    /**
     * INVOICE_KEY（大なりイコール）
     */
    private String invoiceKeyGreaterThanEqual;

    /**
     * INVOICE_KEY（小なり）
     */
    private String invoiceKeyLessThan;

    /**
     * INVOICE_KEY（小なりイコール）
     */
    private String invoiceKeyLessThanEqual;

    /**
     * INVOICE_KEY（前方一致）
     */
    private String invoiceKeyLikeFront;

    /**
     * INVOICE_CTGRY（大なり）
     */
    private String invoiceCtgryGreaterThan;

    /**
     * INVOICE_CTGRY（大なりイコール）
     */
    private String invoiceCtgryGreaterThanEqual;

    /**
     * INVOICE_CTGRY（小なり）
     */
    private String invoiceCtgryLessThan;

    /**
     * INVOICE_CTGRY（小なりイコール）
     */
    private String invoiceCtgryLessThanEqual;

    /**
     * INVOICE_CTGRY（前方一致）
     */
    private String invoiceCtgryLikeFront;

    /**
     * CONTAINER_SORTING_KEY（大なり）
     */
    private String containerSortingKeyGreaterThan;

    /**
     * CONTAINER_SORTING_KEY（大なりイコール）
     */
    private String containerSortingKeyGreaterThanEqual;

    /**
     * CONTAINER_SORTING_KEY（小なり）
     */
    private String containerSortingKeyLessThan;

    /**
     * CONTAINER_SORTING_KEY（小なりイコール）
     */
    private String containerSortingKeyLessThanEqual;

    /**
     * CONTAINER_SORTING_KEY（前方一致）
     */
    private String containerSortingKeyLikeFront;

    /**
     * CONTAINER_LOOSE_TYP（大なり）
     */
    private String containerLooseTypGreaterThan;

    /**
     * CONTAINER_LOOSE_TYP（大なりイコール）
     */
    private String containerLooseTypGreaterThanEqual;

    /**
     * CONTAINER_LOOSE_TYP（小なり）
     */
    private String containerLooseTypLessThan;

    /**
     * CONTAINER_LOOSE_TYP（小なりイコール）
     */
    private String containerLooseTypLessThanEqual;

    /**
     * CONTAINER_LOOSE_TYP（前方一致）
     */
    private String containerLooseTypLikeFront;

    /**
     * CUSTOM_TIMING_TYP（大なり）
     */
    private String customTimingTypGreaterThan;

    /**
     * CUSTOM_TIMING_TYP（大なりイコール）
     */
    private String customTimingTypGreaterThanEqual;

    /**
     * CUSTOM_TIMING_TYP（小なり）
     */
    private String customTimingTypLessThan;

    /**
     * CUSTOM_TIMING_TYP（小なりイコール）
     */
    private String customTimingTypLessThanEqual;

    /**
     * CUSTOM_TIMING_TYP（前方一致）
     */
    private String customTimingTypLikeFront;

    /**
     * CML_TYP（大なり）
     */
    private String cmlTypGreaterThan;

    /**
     * CML_TYP（大なりイコール）
     */
    private String cmlTypGreaterThanEqual;

    /**
     * CML_TYP（小なり）
     */
    private String cmlTypLessThan;

    /**
     * CML_TYP（小なりイコール）
     */
    private String cmlTypLessThanEqual;

    /**
     * CML_TYP（前方一致）
     */
    private String cmlTypLikeFront;

    /**
     * CURR_CD（大なり）
     */
    private String currCdGreaterThan;

    /**
     * CURR_CD（大なりイコール）
     */
    private String currCdGreaterThanEqual;

    /**
     * CURR_CD（小なり）
     */
    private String currCdLessThan;

    /**
     * CURR_CD（小なりイコール）
     */
    private String currCdLessThanEqual;

    /**
     * CURR_CD（前方一致）
     */
    private String currCdLikeFront;

    /**
     * RE_EXP_GOODS_FLG（大なり）
     */
    private String reExpGoodsFlgGreaterThan;

    /**
     * RE_EXP_GOODS_FLG（大なりイコール）
     */
    private String reExpGoodsFlgGreaterThanEqual;

    /**
     * RE_EXP_GOODS_FLG（小なり）
     */
    private String reExpGoodsFlgLessThan;

    /**
     * RE_EXP_GOODS_FLG（小なりイコール）
     */
    private String reExpGoodsFlgLessThanEqual;

    /**
     * RE_EXP_GOODS_FLG（前方一致）
     */
    private String reExpGoodsFlgLikeFront;

    /**
     * SHIPPED_DT（大なりイコール）
     */
    private Date shippedDtGreaterThanEqual;

    /**
     * SHIPPED_DT（小なりイコール）
     */
    private Date shippedDtLessThanEqual;

    /**
     * SUPPLIER_INVOICE_NO（大なり）
     */
    private String supplierInvoiceNoGreaterThan;

    /**
     * SUPPLIER_INVOICE_NO（大なりイコール）
     */
    private String supplierInvoiceNoGreaterThanEqual;

    /**
     * SUPPLIER_INVOICE_NO（小なり）
     */
    private String supplierInvoiceNoLessThan;

    /**
     * SUPPLIER_INVOICE_NO（小なりイコール）
     */
    private String supplierInvoiceNoLessThanEqual;

    /**
     * SUPPLIER_INVOICE_NO（前方一致）
     */
    private String supplierInvoiceNoLikeFront;

    /**
     * IMP_INVOICE_NO_1（大なり）
     */
    private String impInvoiceNo1GreaterThan;

    /**
     * IMP_INVOICE_NO_1（大なりイコール）
     */
    private String impInvoiceNo1GreaterThanEqual;

    /**
     * IMP_INVOICE_NO_1（小なり）
     */
    private String impInvoiceNo1LessThan;

    /**
     * IMP_INVOICE_NO_1（小なりイコール）
     */
    private String impInvoiceNo1LessThanEqual;

    /**
     * IMP_INVOICE_NO_1（前方一致）
     */
    private String impInvoiceNo1LikeFront;

    /**
     * IMP_INVOICE_NO_2（大なり）
     */
    private String impInvoiceNo2GreaterThan;

    /**
     * IMP_INVOICE_NO_2（大なりイコール）
     */
    private String impInvoiceNo2GreaterThanEqual;

    /**
     * IMP_INVOICE_NO_2（小なり）
     */
    private String impInvoiceNo2LessThan;

    /**
     * IMP_INVOICE_NO_2（小なりイコール）
     */
    private String impInvoiceNo2LessThanEqual;

    /**
     * IMP_INVOICE_NO_2（前方一致）
     */
    private String impInvoiceNo2LikeFront;

    /**
     * MIGRATION_FLG（大なり）
     */
    private String migrationFlgGreaterThan;

    /**
     * MIGRATION_FLG（大なりイコール）
     */
    private String migrationFlgGreaterThanEqual;

    /**
     * MIGRATION_FLG（小なり）
     */
    private String migrationFlgLessThan;

    /**
     * MIGRATION_FLG（小なりイコール）
     */
    private String migrationFlgLessThanEqual;

    /**
     * MIGRATION_FLG（前方一致）
     */
    private String migrationFlgLikeFront;

    /**
     * GRP_NO_1（大なり）
     */
    private String grpNo1GreaterThan;

    /**
     * GRP_NO_1（大なりイコール）
     */
    private String grpNo1GreaterThanEqual;

    /**
     * GRP_NO_1（小なり）
     */
    private String grpNo1LessThan;

    /**
     * GRP_NO_1（小なりイコール）
     */
    private String grpNo1LessThanEqual;

    /**
     * GRP_NO_1（前方一致）
     */
    private String grpNo1LikeFront;

    /**
     * GRP_NO_2（大なり）
     */
    private String grpNo2GreaterThan;

    /**
     * GRP_NO_2（大なりイコール）
     */
    private String grpNo2GreaterThanEqual;

    /**
     * GRP_NO_2（小なり）
     */
    private String grpNo2LessThan;

    /**
     * GRP_NO_2（小なりイコール）
     */
    private String grpNo2LessThanEqual;

    /**
     * GRP_NO_2（前方一致）
     */
    private String grpNo2LikeFront;

    /**
     * DECISION_FLG（大なり）
     */
    private String decisionFlgGreaterThan;

    /**
     * DECISION_FLG（大なりイコール）
     */
    private String decisionFlgGreaterThanEqual;

    /**
     * DECISION_FLG（小なり）
     */
    private String decisionFlgLessThan;

    /**
     * DECISION_FLG（小なりイコール）
     */
    private String decisionFlgLessThanEqual;

    /**
     * DECISION_FLG（前方一致）
     */
    private String decisionFlgLikeFront;

    /**
     * TEMP_INVOICE_NO（大なり）
     */
    private String tempInvoiceNoGreaterThan;

    /**
     * TEMP_INVOICE_NO（大なりイコール）
     */
    private String tempInvoiceNoGreaterThanEqual;

    /**
     * TEMP_INVOICE_NO（小なり）
     */
    private String tempInvoiceNoLessThan;

    /**
     * TEMP_INVOICE_NO（小なりイコール）
     */
    private String tempInvoiceNoLessThanEqual;

    /**
     * TEMP_INVOICE_NO（前方一致）
     */
    private String tempInvoiceNoLikeFront;

    /**
     * INVOICE_NO（大なり）
     */
    private String invoiceNoGreaterThan;

    /**
     * INVOICE_NO（大なりイコール）
     */
    private String invoiceNoGreaterThanEqual;

    /**
     * INVOICE_NO（小なり）
     */
    private String invoiceNoLessThan;

    /**
     * INVOICE_NO（小なりイコール）
     */
    private String invoiceNoLessThanEqual;

    /**
     * INVOICE_NO（前方一致）
     */
    private String invoiceNoLikeFront;

    /**
     * RE_INVOICE_FLG（大なり）
     */
    private String reInvoiceFlgGreaterThan;

    /**
     * RE_INVOICE_FLG（大なりイコール）
     */
    private String reInvoiceFlgGreaterThanEqual;

    /**
     * RE_INVOICE_FLG（小なり）
     */
    private String reInvoiceFlgLessThan;

    /**
     * RE_INVOICE_FLG（小なりイコール）
     */
    private String reInvoiceFlgLessThanEqual;

    /**
     * RE_INVOICE_FLG（前方一致）
     */
    private String reInvoiceFlgLikeFront;

    /**
     * RE_INVOICE_SHIPPER_CD（大なり）
     */
    private String reInvoiceShipperCdGreaterThan;

    /**
     * RE_INVOICE_SHIPPER_CD（大なりイコール）
     */
    private String reInvoiceShipperCdGreaterThanEqual;

    /**
     * RE_INVOICE_SHIPPER_CD（小なり）
     */
    private String reInvoiceShipperCdLessThan;

    /**
     * RE_INVOICE_SHIPPER_CD（小なりイコール）
     */
    private String reInvoiceShipperCdLessThanEqual;

    /**
     * RE_INVOICE_SHIPPER_CD（前方一致）
     */
    private String reInvoiceShipperCdLikeFront;

    /**
     * SALES_CONTRACT_FLG（大なり）
     */
    private String salesContractFlgGreaterThan;

    /**
     * SALES_CONTRACT_FLG（大なりイコール）
     */
    private String salesContractFlgGreaterThanEqual;

    /**
     * SALES_CONTRACT_FLG（小なり）
     */
    private String salesContractFlgLessThan;

    /**
     * SALES_CONTRACT_FLG（小なりイコール）
     */
    private String salesContractFlgLessThanEqual;

    /**
     * SALES_CONTRACT_FLG（前方一致）
     */
    private String salesContractFlgLikeFront;

    /**
     * COM_UPDATE_FUNC_ID（大なり）
     */
    private String comUpdateFuncIdGreaterThan;

    /**
     * COM_UPDATE_FUNC_ID（大なりイコール）
     */
    private String comUpdateFuncIdGreaterThanEqual;

    /**
     * COM_UPDATE_FUNC_ID（小なり）
     */
    private String comUpdateFuncIdLessThan;

    /**
     * COM_UPDATE_FUNC_ID（小なりイコール）
     */
    private String comUpdateFuncIdLessThanEqual;

    /**
     * COM_UPDATE_FUNC_ID（前方一致）
     */
    private String comUpdateFuncIdLikeFront;

    /**
     * COM_UPDATE_USER_ID（大なり）
     */
    private String comUpdateUserIdGreaterThan;

    /**
     * COM_UPDATE_USER_ID（大なりイコール）
     */
    private String comUpdateUserIdGreaterThanEqual;

    /**
     * COM_UPDATE_USER_ID（小なり）
     */
    private String comUpdateUserIdLessThan;

    /**
     * COM_UPDATE_USER_ID（小なりイコール）
     */
    private String comUpdateUserIdLessThanEqual;

    /**
     * COM_UPDATE_USER_ID（前方一致）
     */
    private String comUpdateUserIdLikeFront;

    /**
     * COM_CREATE_FUNC_ID（大なり）
     */
    private String comCreateFuncIdGreaterThan;

    /**
     * COM_CREATE_FUNC_ID（大なりイコール）
     */
    private String comCreateFuncIdGreaterThanEqual;

    /**
     * COM_CREATE_FUNC_ID（小なり）
     */
    private String comCreateFuncIdLessThan;

    /**
     * COM_CREATE_FUNC_ID（小なりイコール）
     */
    private String comCreateFuncIdLessThanEqual;

    /**
     * COM_CREATE_FUNC_ID（前方一致）
     */
    private String comCreateFuncIdLikeFront;

    /**
     * COM_CREATE_USER_ID（大なり）
     */
    private String comCreateUserIdGreaterThan;

    /**
     * COM_CREATE_USER_ID（大なりイコール）
     */
    private String comCreateUserIdGreaterThanEqual;

    /**
     * COM_CREATE_USER_ID（小なり）
     */
    private String comCreateUserIdLessThan;

    /**
     * COM_CREATE_USER_ID（小なりイコール）
     */
    private String comCreateUserIdLessThanEqual;

    /**
     * COM_CREATE_USER_ID（前方一致）
     */
    private String comCreateUserIdLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public TwInvCriteriaDomain() {
    }

    /**
     * dscId のゲッターメソッドです。
     * 
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * dscId のセッターメソッドです。
     * 
     * @param dscId dscId に設定する
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
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
     * shipToCompCd のゲッターメソッドです。
     * 
     * @return the shipToCompCd
     */
    public String getShipToCompCd() {
        return shipToCompCd;
    }

    /**
     * shipToCompCd のセッターメソッドです。
     * 
     * @param shipToCompCd shipToCompCd に設定する
     */
    public void setShipToCompCd(String shipToCompCd) {
        this.shipToCompCd = shipToCompCd;
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
     * lgcyShipTo のゲッターメソッドです。
     * 
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * lgcyShipTo のセッターメソッドです。
     * 
     * @param lgcyShipTo lgcyShipTo に設定する
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
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
     * tradeTerms のゲッターメソッドです。
     * 
     * @return the tradeTerms
     */
    public String getTradeTerms() {
        return tradeTerms;
    }

    /**
     * tradeTerms のセッターメソッドです。
     * 
     * @param tradeTerms tradeTerms に設定する
     */
    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    /**
     * termsPoint のゲッターメソッドです。
     * 
     * @return the termsPoint
     */
    public String getTermsPoint() {
        return termsPoint;
    }

    /**
     * termsPoint のセッターメソッドです。
     * 
     * @param termsPoint termsPoint に設定する
     */
    public void setTermsPoint(String termsPoint) {
        this.termsPoint = termsPoint;
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
     * trnsCd のゲッターメソッドです。
     * 
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * trnsCd のセッターメソッドです。
     * 
     * @param trnsCd trnsCd に設定する
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * trnsCdOrg のゲッターメソッドです。
     * 
     * @return the trnsCdOrg
     */
    public String getTrnsCdOrg() {
        return trnsCdOrg;
    }

    /**
     * trnsCdOrg のセッターメソッドです。
     * 
     * @param trnsCdOrg trnsCdOrg に設定する
     */
    public void setTrnsCdOrg(String trnsCdOrg) {
        this.trnsCdOrg = trnsCdOrg;
    }

    /**
     * invoiceKey のゲッターメソッドです。
     * 
     * @return the invoiceKey
     */
    public String getInvoiceKey() {
        return invoiceKey;
    }

    /**
     * invoiceKey のセッターメソッドです。
     * 
     * @param invoiceKey invoiceKey に設定する
     */
    public void setInvoiceKey(String invoiceKey) {
        this.invoiceKey = invoiceKey;
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
     * containerLooseTyp のゲッターメソッドです。
     * 
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * containerLooseTyp のセッターメソッドです。
     * 
     * @param containerLooseTyp containerLooseTyp に設定する
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * customTimingTyp のゲッターメソッドです。
     * 
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * customTimingTyp のセッターメソッドです。
     * 
     * @param customTimingTyp customTimingTyp に設定する
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
    }

    /**
     * cmlTyp のゲッターメソッドです。
     * 
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * cmlTyp のセッターメソッドです。
     * 
     * @param cmlTyp cmlTyp に設定する
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
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
     * shippedDt のゲッターメソッドです。
     * 
     * @return the shippedDt
     */
    public Date getShippedDt() {
        return shippedDt;
    }

    /**
     * shippedDt のセッターメソッドです。
     * 
     * @param shippedDt shippedDt に設定する
     */
    public void setShippedDt(Date shippedDt) {
        this.shippedDt = shippedDt;
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
     * migrationFlg のゲッターメソッドです。
     * 
     * @return the migrationFlg
     */
    public String getMigrationFlg() {
        return migrationFlg;
    }

    /**
     * migrationFlg のセッターメソッドです。
     * 
     * @param migrationFlg migrationFlg に設定する
     */
    public void setMigrationFlg(String migrationFlg) {
        this.migrationFlg = migrationFlg;
    }

    /**
     * grpNo1 のゲッターメソッドです。
     * 
     * @return the grpNo1
     */
    public String getGrpNo1() {
        return grpNo1;
    }

    /**
     * grpNo1 のセッターメソッドです。
     * 
     * @param grpNo1 grpNo1 に設定する
     */
    public void setGrpNo1(String grpNo1) {
        this.grpNo1 = grpNo1;
    }

    /**
     * grpNo2 のゲッターメソッドです。
     * 
     * @return the grpNo2
     */
    public String getGrpNo2() {
        return grpNo2;
    }

    /**
     * grpNo2 のセッターメソッドです。
     * 
     * @param grpNo2 grpNo2 に設定する
     */
    public void setGrpNo2(String grpNo2) {
        this.grpNo2 = grpNo2;
    }

    /**
     * decisionFlg のゲッターメソッドです。
     * 
     * @return the decisionFlg
     */
    public String getDecisionFlg() {
        return decisionFlg;
    }

    /**
     * decisionFlg のセッターメソッドです。
     * 
     * @param decisionFlg decisionFlg に設定する
     */
    public void setDecisionFlg(String decisionFlg) {
        this.decisionFlg = decisionFlg;
    }

    /**
     * tempInvoiceNo のゲッターメソッドです。
     * 
     * @return the tempInvoiceNo
     */
    public String getTempInvoiceNo() {
        return tempInvoiceNo;
    }

    /**
     * tempInvoiceNo のセッターメソッドです。
     * 
     * @param tempInvoiceNo tempInvoiceNo に設定する
     */
    public void setTempInvoiceNo(String tempInvoiceNo) {
        this.tempInvoiceNo = tempInvoiceNo;
    }

    /**
     * invoiceNo のゲッターメソッドです。
     * 
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * invoiceNo のセッターメソッドです。
     * 
     * @param invoiceNo invoiceNo に設定する
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * reInvoiceFlg のゲッターメソッドです。
     * 
     * @return the reInvoiceFlg
     */
    public String getReInvoiceFlg() {
        return reInvoiceFlg;
    }

    /**
     * reInvoiceFlg のセッターメソッドです。
     * 
     * @param reInvoiceFlg reInvoiceFlg に設定する
     */
    public void setReInvoiceFlg(String reInvoiceFlg) {
        this.reInvoiceFlg = reInvoiceFlg;
    }

    /**
     * reInvoiceShipperCd のゲッターメソッドです。
     * 
     * @return the reInvoiceShipperCd
     */
    public String getReInvoiceShipperCd() {
        return reInvoiceShipperCd;
    }

    /**
     * reInvoiceShipperCd のセッターメソッドです。
     * 
     * @param reInvoiceShipperCd reInvoiceShipperCd に設定する
     */
    public void setReInvoiceShipperCd(String reInvoiceShipperCd) {
        this.reInvoiceShipperCd = reInvoiceShipperCd;
    }

    /**
     * salesContractFlg のゲッターメソッドです。
     * 
     * @return the salesContractFlg
     */
    public String getSalesContractFlg() {
        return salesContractFlg;
    }

    /**
     * salesContractFlg のセッターメソッドです。
     * 
     * @param salesContractFlg salesContractFlg に設定する
     */
    public void setSalesContractFlg(String salesContractFlg) {
        this.salesContractFlg = salesContractFlg;
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
     * dscIdGreaterThan のゲッターメソッドです。
     * 
     * @return the dscIdGreaterThan
     */
    public String getDscIdGreaterThan() {
        return dscIdGreaterThan;
    }

    /**
     * dscIdGreaterThan のセッターメソッドです。
     * 
     * @param dscIdGreaterThan dscIdGreaterThan に設定する
     */
    public void setDscIdGreaterThan(String dscIdGreaterThan) {
        this.dscIdGreaterThan = dscIdGreaterThan;
    }

    /**
     * dscIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dscIdGreaterThanEqual
     */
    public String getDscIdGreaterThanEqual() {
        return dscIdGreaterThanEqual;
    }

    /**
     * dscIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param dscIdGreaterThanEqual dscIdGreaterThanEqual に設定する
     */
    public void setDscIdGreaterThanEqual(String dscIdGreaterThanEqual) {
        this.dscIdGreaterThanEqual = dscIdGreaterThanEqual;
    }

    /**
     * dscIdLessThan のゲッターメソッドです。
     * 
     * @return the dscIdLessThan
     */
    public String getDscIdLessThan() {
        return dscIdLessThan;
    }

    /**
     * dscIdLessThan のセッターメソッドです。
     * 
     * @param dscIdLessThan dscIdLessThan に設定する
     */
    public void setDscIdLessThan(String dscIdLessThan) {
        this.dscIdLessThan = dscIdLessThan;
    }

    /**
     * dscIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the dscIdLessThanEqual
     */
    public String getDscIdLessThanEqual() {
        return dscIdLessThanEqual;
    }

    /**
     * dscIdLessThanEqual のセッターメソッドです。
     * 
     * @param dscIdLessThanEqual dscIdLessThanEqual に設定する
     */
    public void setDscIdLessThanEqual(String dscIdLessThanEqual) {
        this.dscIdLessThanEqual = dscIdLessThanEqual;
    }

    /**
     * dscIdLikeFront のゲッターメソッドです。
     * 
     * @return the dscIdLikeFront
     */
    public String getDscIdLikeFront() {
        return dscIdLikeFront;
    }

    /**
     * dscIdLikeFront のセッターメソッドです。
     * 
     * @param dscIdLikeFront dscIdLikeFront に設定する
     */
    public void setDscIdLikeFront(String dscIdLikeFront) {
        this.dscIdLikeFront = dscIdLikeFront;
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
     * shipToCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCompCdGreaterThan
     */
    public String getShipToCompCdGreaterThan() {
        return shipToCompCdGreaterThan;
    }

    /**
     * shipToCompCdGreaterThan のセッターメソッドです。
     * 
     * @param shipToCompCdGreaterThan shipToCompCdGreaterThan に設定する
     */
    public void setShipToCompCdGreaterThan(String shipToCompCdGreaterThan) {
        this.shipToCompCdGreaterThan = shipToCompCdGreaterThan;
    }

    /**
     * shipToCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompCdGreaterThanEqual
     */
    public String getShipToCompCdGreaterThanEqual() {
        return shipToCompCdGreaterThanEqual;
    }

    /**
     * shipToCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCompCdGreaterThanEqual shipToCompCdGreaterThanEqual に設定する
     */
    public void setShipToCompCdGreaterThanEqual(String shipToCompCdGreaterThanEqual) {
        this.shipToCompCdGreaterThanEqual = shipToCompCdGreaterThanEqual;
    }

    /**
     * shipToCompCdLessThan のゲッターメソッドです。
     * 
     * @return the shipToCompCdLessThan
     */
    public String getShipToCompCdLessThan() {
        return shipToCompCdLessThan;
    }

    /**
     * shipToCompCdLessThan のセッターメソッドです。
     * 
     * @param shipToCompCdLessThan shipToCompCdLessThan に設定する
     */
    public void setShipToCompCdLessThan(String shipToCompCdLessThan) {
        this.shipToCompCdLessThan = shipToCompCdLessThan;
    }

    /**
     * shipToCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompCdLessThanEqual
     */
    public String getShipToCompCdLessThanEqual() {
        return shipToCompCdLessThanEqual;
    }

    /**
     * shipToCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCompCdLessThanEqual shipToCompCdLessThanEqual に設定する
     */
    public void setShipToCompCdLessThanEqual(String shipToCompCdLessThanEqual) {
        this.shipToCompCdLessThanEqual = shipToCompCdLessThanEqual;
    }

    /**
     * shipToCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCompCdLikeFront
     */
    public String getShipToCompCdLikeFront() {
        return shipToCompCdLikeFront;
    }

    /**
     * shipToCompCdLikeFront のセッターメソッドです。
     * 
     * @param shipToCompCdLikeFront shipToCompCdLikeFront に設定する
     */
    public void setShipToCompCdLikeFront(String shipToCompCdLikeFront) {
        this.shipToCompCdLikeFront = shipToCompCdLikeFront;
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
     * lgcyShipToGreaterThan のゲッターメソッドです。
     * 
     * @return the lgcyShipToGreaterThan
     */
    public String getLgcyShipToGreaterThan() {
        return lgcyShipToGreaterThan;
    }

    /**
     * lgcyShipToGreaterThan のセッターメソッドです。
     * 
     * @param lgcyShipToGreaterThan lgcyShipToGreaterThan に設定する
     */
    public void setLgcyShipToGreaterThan(String lgcyShipToGreaterThan) {
        this.lgcyShipToGreaterThan = lgcyShipToGreaterThan;
    }

    /**
     * lgcyShipToGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyShipToGreaterThanEqual
     */
    public String getLgcyShipToGreaterThanEqual() {
        return lgcyShipToGreaterThanEqual;
    }

    /**
     * lgcyShipToGreaterThanEqual のセッターメソッドです。
     * 
     * @param lgcyShipToGreaterThanEqual lgcyShipToGreaterThanEqual に設定する
     */
    public void setLgcyShipToGreaterThanEqual(String lgcyShipToGreaterThanEqual) {
        this.lgcyShipToGreaterThanEqual = lgcyShipToGreaterThanEqual;
    }

    /**
     * lgcyShipToLessThan のゲッターメソッドです。
     * 
     * @return the lgcyShipToLessThan
     */
    public String getLgcyShipToLessThan() {
        return lgcyShipToLessThan;
    }

    /**
     * lgcyShipToLessThan のセッターメソッドです。
     * 
     * @param lgcyShipToLessThan lgcyShipToLessThan に設定する
     */
    public void setLgcyShipToLessThan(String lgcyShipToLessThan) {
        this.lgcyShipToLessThan = lgcyShipToLessThan;
    }

    /**
     * lgcyShipToLessThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyShipToLessThanEqual
     */
    public String getLgcyShipToLessThanEqual() {
        return lgcyShipToLessThanEqual;
    }

    /**
     * lgcyShipToLessThanEqual のセッターメソッドです。
     * 
     * @param lgcyShipToLessThanEqual lgcyShipToLessThanEqual に設定する
     */
    public void setLgcyShipToLessThanEqual(String lgcyShipToLessThanEqual) {
        this.lgcyShipToLessThanEqual = lgcyShipToLessThanEqual;
    }

    /**
     * lgcyShipToLikeFront のゲッターメソッドです。
     * 
     * @return the lgcyShipToLikeFront
     */
    public String getLgcyShipToLikeFront() {
        return lgcyShipToLikeFront;
    }

    /**
     * lgcyShipToLikeFront のセッターメソッドです。
     * 
     * @param lgcyShipToLikeFront lgcyShipToLikeFront に設定する
     */
    public void setLgcyShipToLikeFront(String lgcyShipToLikeFront) {
        this.lgcyShipToLikeFront = lgcyShipToLikeFront;
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
     * tradeTermsGreaterThan のゲッターメソッドです。
     * 
     * @return the tradeTermsGreaterThan
     */
    public String getTradeTermsGreaterThan() {
        return tradeTermsGreaterThan;
    }

    /**
     * tradeTermsGreaterThan のセッターメソッドです。
     * 
     * @param tradeTermsGreaterThan tradeTermsGreaterThan に設定する
     */
    public void setTradeTermsGreaterThan(String tradeTermsGreaterThan) {
        this.tradeTermsGreaterThan = tradeTermsGreaterThan;
    }

    /**
     * tradeTermsGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the tradeTermsGreaterThanEqual
     */
    public String getTradeTermsGreaterThanEqual() {
        return tradeTermsGreaterThanEqual;
    }

    /**
     * tradeTermsGreaterThanEqual のセッターメソッドです。
     * 
     * @param tradeTermsGreaterThanEqual tradeTermsGreaterThanEqual に設定する
     */
    public void setTradeTermsGreaterThanEqual(String tradeTermsGreaterThanEqual) {
        this.tradeTermsGreaterThanEqual = tradeTermsGreaterThanEqual;
    }

    /**
     * tradeTermsLessThan のゲッターメソッドです。
     * 
     * @return the tradeTermsLessThan
     */
    public String getTradeTermsLessThan() {
        return tradeTermsLessThan;
    }

    /**
     * tradeTermsLessThan のセッターメソッドです。
     * 
     * @param tradeTermsLessThan tradeTermsLessThan に設定する
     */
    public void setTradeTermsLessThan(String tradeTermsLessThan) {
        this.tradeTermsLessThan = tradeTermsLessThan;
    }

    /**
     * tradeTermsLessThanEqual のゲッターメソッドです。
     * 
     * @return the tradeTermsLessThanEqual
     */
    public String getTradeTermsLessThanEqual() {
        return tradeTermsLessThanEqual;
    }

    /**
     * tradeTermsLessThanEqual のセッターメソッドです。
     * 
     * @param tradeTermsLessThanEqual tradeTermsLessThanEqual に設定する
     */
    public void setTradeTermsLessThanEqual(String tradeTermsLessThanEqual) {
        this.tradeTermsLessThanEqual = tradeTermsLessThanEqual;
    }

    /**
     * tradeTermsLikeFront のゲッターメソッドです。
     * 
     * @return the tradeTermsLikeFront
     */
    public String getTradeTermsLikeFront() {
        return tradeTermsLikeFront;
    }

    /**
     * tradeTermsLikeFront のセッターメソッドです。
     * 
     * @param tradeTermsLikeFront tradeTermsLikeFront に設定する
     */
    public void setTradeTermsLikeFront(String tradeTermsLikeFront) {
        this.tradeTermsLikeFront = tradeTermsLikeFront;
    }

    /**
     * termsPointGreaterThan のゲッターメソッドです。
     * 
     * @return the termsPointGreaterThan
     */
    public String getTermsPointGreaterThan() {
        return termsPointGreaterThan;
    }

    /**
     * termsPointGreaterThan のセッターメソッドです。
     * 
     * @param termsPointGreaterThan termsPointGreaterThan に設定する
     */
    public void setTermsPointGreaterThan(String termsPointGreaterThan) {
        this.termsPointGreaterThan = termsPointGreaterThan;
    }

    /**
     * termsPointGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the termsPointGreaterThanEqual
     */
    public String getTermsPointGreaterThanEqual() {
        return termsPointGreaterThanEqual;
    }

    /**
     * termsPointGreaterThanEqual のセッターメソッドです。
     * 
     * @param termsPointGreaterThanEqual termsPointGreaterThanEqual に設定する
     */
    public void setTermsPointGreaterThanEqual(String termsPointGreaterThanEqual) {
        this.termsPointGreaterThanEqual = termsPointGreaterThanEqual;
    }

    /**
     * termsPointLessThan のゲッターメソッドです。
     * 
     * @return the termsPointLessThan
     */
    public String getTermsPointLessThan() {
        return termsPointLessThan;
    }

    /**
     * termsPointLessThan のセッターメソッドです。
     * 
     * @param termsPointLessThan termsPointLessThan に設定する
     */
    public void setTermsPointLessThan(String termsPointLessThan) {
        this.termsPointLessThan = termsPointLessThan;
    }

    /**
     * termsPointLessThanEqual のゲッターメソッドです。
     * 
     * @return the termsPointLessThanEqual
     */
    public String getTermsPointLessThanEqual() {
        return termsPointLessThanEqual;
    }

    /**
     * termsPointLessThanEqual のセッターメソッドです。
     * 
     * @param termsPointLessThanEqual termsPointLessThanEqual に設定する
     */
    public void setTermsPointLessThanEqual(String termsPointLessThanEqual) {
        this.termsPointLessThanEqual = termsPointLessThanEqual;
    }

    /**
     * termsPointLikeFront のゲッターメソッドです。
     * 
     * @return the termsPointLikeFront
     */
    public String getTermsPointLikeFront() {
        return termsPointLikeFront;
    }

    /**
     * termsPointLikeFront のセッターメソッドです。
     * 
     * @param termsPointLikeFront termsPointLikeFront に設定する
     */
    public void setTermsPointLikeFront(String termsPointLikeFront) {
        this.termsPointLikeFront = termsPointLikeFront;
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
     * trnsCdGreaterThan のゲッターメソッドです。
     * 
     * @return the trnsCdGreaterThan
     */
    public String getTrnsCdGreaterThan() {
        return trnsCdGreaterThan;
    }

    /**
     * trnsCdGreaterThan のセッターメソッドです。
     * 
     * @param trnsCdGreaterThan trnsCdGreaterThan に設定する
     */
    public void setTrnsCdGreaterThan(String trnsCdGreaterThan) {
        this.trnsCdGreaterThan = trnsCdGreaterThan;
    }

    /**
     * trnsCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdGreaterThanEqual
     */
    public String getTrnsCdGreaterThanEqual() {
        return trnsCdGreaterThanEqual;
    }

    /**
     * trnsCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param trnsCdGreaterThanEqual trnsCdGreaterThanEqual に設定する
     */
    public void setTrnsCdGreaterThanEqual(String trnsCdGreaterThanEqual) {
        this.trnsCdGreaterThanEqual = trnsCdGreaterThanEqual;
    }

    /**
     * trnsCdLessThan のゲッターメソッドです。
     * 
     * @return the trnsCdLessThan
     */
    public String getTrnsCdLessThan() {
        return trnsCdLessThan;
    }

    /**
     * trnsCdLessThan のセッターメソッドです。
     * 
     * @param trnsCdLessThan trnsCdLessThan に設定する
     */
    public void setTrnsCdLessThan(String trnsCdLessThan) {
        this.trnsCdLessThan = trnsCdLessThan;
    }

    /**
     * trnsCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdLessThanEqual
     */
    public String getTrnsCdLessThanEqual() {
        return trnsCdLessThanEqual;
    }

    /**
     * trnsCdLessThanEqual のセッターメソッドです。
     * 
     * @param trnsCdLessThanEqual trnsCdLessThanEqual に設定する
     */
    public void setTrnsCdLessThanEqual(String trnsCdLessThanEqual) {
        this.trnsCdLessThanEqual = trnsCdLessThanEqual;
    }

    /**
     * trnsCdLikeFront のゲッターメソッドです。
     * 
     * @return the trnsCdLikeFront
     */
    public String getTrnsCdLikeFront() {
        return trnsCdLikeFront;
    }

    /**
     * trnsCdLikeFront のセッターメソッドです。
     * 
     * @param trnsCdLikeFront trnsCdLikeFront に設定する
     */
    public void setTrnsCdLikeFront(String trnsCdLikeFront) {
        this.trnsCdLikeFront = trnsCdLikeFront;
    }

    /**
     * trnsCdOrgGreaterThan のゲッターメソッドです。
     * 
     * @return the trnsCdOrgGreaterThan
     */
    public String getTrnsCdOrgGreaterThan() {
        return trnsCdOrgGreaterThan;
    }

    /**
     * trnsCdOrgGreaterThan のセッターメソッドです。
     * 
     * @param trnsCdOrgGreaterThan trnsCdOrgGreaterThan に設定する
     */
    public void setTrnsCdOrgGreaterThan(String trnsCdOrgGreaterThan) {
        this.trnsCdOrgGreaterThan = trnsCdOrgGreaterThan;
    }

    /**
     * trnsCdOrgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdOrgGreaterThanEqual
     */
    public String getTrnsCdOrgGreaterThanEqual() {
        return trnsCdOrgGreaterThanEqual;
    }

    /**
     * trnsCdOrgGreaterThanEqual のセッターメソッドです。
     * 
     * @param trnsCdOrgGreaterThanEqual trnsCdOrgGreaterThanEqual に設定する
     */
    public void setTrnsCdOrgGreaterThanEqual(String trnsCdOrgGreaterThanEqual) {
        this.trnsCdOrgGreaterThanEqual = trnsCdOrgGreaterThanEqual;
    }

    /**
     * trnsCdOrgLessThan のゲッターメソッドです。
     * 
     * @return the trnsCdOrgLessThan
     */
    public String getTrnsCdOrgLessThan() {
        return trnsCdOrgLessThan;
    }

    /**
     * trnsCdOrgLessThan のセッターメソッドです。
     * 
     * @param trnsCdOrgLessThan trnsCdOrgLessThan に設定する
     */
    public void setTrnsCdOrgLessThan(String trnsCdOrgLessThan) {
        this.trnsCdOrgLessThan = trnsCdOrgLessThan;
    }

    /**
     * trnsCdOrgLessThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdOrgLessThanEqual
     */
    public String getTrnsCdOrgLessThanEqual() {
        return trnsCdOrgLessThanEqual;
    }

    /**
     * trnsCdOrgLessThanEqual のセッターメソッドです。
     * 
     * @param trnsCdOrgLessThanEqual trnsCdOrgLessThanEqual に設定する
     */
    public void setTrnsCdOrgLessThanEqual(String trnsCdOrgLessThanEqual) {
        this.trnsCdOrgLessThanEqual = trnsCdOrgLessThanEqual;
    }

    /**
     * trnsCdOrgLikeFront のゲッターメソッドです。
     * 
     * @return the trnsCdOrgLikeFront
     */
    public String getTrnsCdOrgLikeFront() {
        return trnsCdOrgLikeFront;
    }

    /**
     * trnsCdOrgLikeFront のセッターメソッドです。
     * 
     * @param trnsCdOrgLikeFront trnsCdOrgLikeFront に設定する
     */
    public void setTrnsCdOrgLikeFront(String trnsCdOrgLikeFront) {
        this.trnsCdOrgLikeFront = trnsCdOrgLikeFront;
    }

    /**
     * invoiceKeyGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceKeyGreaterThan
     */
    public String getInvoiceKeyGreaterThan() {
        return invoiceKeyGreaterThan;
    }

    /**
     * invoiceKeyGreaterThan のセッターメソッドです。
     * 
     * @param invoiceKeyGreaterThan invoiceKeyGreaterThan に設定する
     */
    public void setInvoiceKeyGreaterThan(String invoiceKeyGreaterThan) {
        this.invoiceKeyGreaterThan = invoiceKeyGreaterThan;
    }

    /**
     * invoiceKeyGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceKeyGreaterThanEqual
     */
    public String getInvoiceKeyGreaterThanEqual() {
        return invoiceKeyGreaterThanEqual;
    }

    /**
     * invoiceKeyGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceKeyGreaterThanEqual invoiceKeyGreaterThanEqual に設定する
     */
    public void setInvoiceKeyGreaterThanEqual(String invoiceKeyGreaterThanEqual) {
        this.invoiceKeyGreaterThanEqual = invoiceKeyGreaterThanEqual;
    }

    /**
     * invoiceKeyLessThan のゲッターメソッドです。
     * 
     * @return the invoiceKeyLessThan
     */
    public String getInvoiceKeyLessThan() {
        return invoiceKeyLessThan;
    }

    /**
     * invoiceKeyLessThan のセッターメソッドです。
     * 
     * @param invoiceKeyLessThan invoiceKeyLessThan に設定する
     */
    public void setInvoiceKeyLessThan(String invoiceKeyLessThan) {
        this.invoiceKeyLessThan = invoiceKeyLessThan;
    }

    /**
     * invoiceKeyLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceKeyLessThanEqual
     */
    public String getInvoiceKeyLessThanEqual() {
        return invoiceKeyLessThanEqual;
    }

    /**
     * invoiceKeyLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceKeyLessThanEqual invoiceKeyLessThanEqual に設定する
     */
    public void setInvoiceKeyLessThanEqual(String invoiceKeyLessThanEqual) {
        this.invoiceKeyLessThanEqual = invoiceKeyLessThanEqual;
    }

    /**
     * invoiceKeyLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceKeyLikeFront
     */
    public String getInvoiceKeyLikeFront() {
        return invoiceKeyLikeFront;
    }

    /**
     * invoiceKeyLikeFront のセッターメソッドです。
     * 
     * @param invoiceKeyLikeFront invoiceKeyLikeFront に設定する
     */
    public void setInvoiceKeyLikeFront(String invoiceKeyLikeFront) {
        this.invoiceKeyLikeFront = invoiceKeyLikeFront;
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
     * containerLooseTypGreaterThan のゲッターメソッドです。
     * 
     * @return the containerLooseTypGreaterThan
     */
    public String getContainerLooseTypGreaterThan() {
        return containerLooseTypGreaterThan;
    }

    /**
     * containerLooseTypGreaterThan のセッターメソッドです。
     * 
     * @param containerLooseTypGreaterThan containerLooseTypGreaterThan に設定する
     */
    public void setContainerLooseTypGreaterThan(String containerLooseTypGreaterThan) {
        this.containerLooseTypGreaterThan = containerLooseTypGreaterThan;
    }

    /**
     * containerLooseTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerLooseTypGreaterThanEqual
     */
    public String getContainerLooseTypGreaterThanEqual() {
        return containerLooseTypGreaterThanEqual;
    }

    /**
     * containerLooseTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param containerLooseTypGreaterThanEqual containerLooseTypGreaterThanEqual に設定する
     */
    public void setContainerLooseTypGreaterThanEqual(String containerLooseTypGreaterThanEqual) {
        this.containerLooseTypGreaterThanEqual = containerLooseTypGreaterThanEqual;
    }

    /**
     * containerLooseTypLessThan のゲッターメソッドです。
     * 
     * @return the containerLooseTypLessThan
     */
    public String getContainerLooseTypLessThan() {
        return containerLooseTypLessThan;
    }

    /**
     * containerLooseTypLessThan のセッターメソッドです。
     * 
     * @param containerLooseTypLessThan containerLooseTypLessThan に設定する
     */
    public void setContainerLooseTypLessThan(String containerLooseTypLessThan) {
        this.containerLooseTypLessThan = containerLooseTypLessThan;
    }

    /**
     * containerLooseTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the containerLooseTypLessThanEqual
     */
    public String getContainerLooseTypLessThanEqual() {
        return containerLooseTypLessThanEqual;
    }

    /**
     * containerLooseTypLessThanEqual のセッターメソッドです。
     * 
     * @param containerLooseTypLessThanEqual containerLooseTypLessThanEqual に設定する
     */
    public void setContainerLooseTypLessThanEqual(String containerLooseTypLessThanEqual) {
        this.containerLooseTypLessThanEqual = containerLooseTypLessThanEqual;
    }

    /**
     * containerLooseTypLikeFront のゲッターメソッドです。
     * 
     * @return the containerLooseTypLikeFront
     */
    public String getContainerLooseTypLikeFront() {
        return containerLooseTypLikeFront;
    }

    /**
     * containerLooseTypLikeFront のセッターメソッドです。
     * 
     * @param containerLooseTypLikeFront containerLooseTypLikeFront に設定する
     */
    public void setContainerLooseTypLikeFront(String containerLooseTypLikeFront) {
        this.containerLooseTypLikeFront = containerLooseTypLikeFront;
    }

    /**
     * customTimingTypGreaterThan のゲッターメソッドです。
     * 
     * @return the customTimingTypGreaterThan
     */
    public String getCustomTimingTypGreaterThan() {
        return customTimingTypGreaterThan;
    }

    /**
     * customTimingTypGreaterThan のセッターメソッドです。
     * 
     * @param customTimingTypGreaterThan customTimingTypGreaterThan に設定する
     */
    public void setCustomTimingTypGreaterThan(String customTimingTypGreaterThan) {
        this.customTimingTypGreaterThan = customTimingTypGreaterThan;
    }

    /**
     * customTimingTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customTimingTypGreaterThanEqual
     */
    public String getCustomTimingTypGreaterThanEqual() {
        return customTimingTypGreaterThanEqual;
    }

    /**
     * customTimingTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param customTimingTypGreaterThanEqual customTimingTypGreaterThanEqual に設定する
     */
    public void setCustomTimingTypGreaterThanEqual(String customTimingTypGreaterThanEqual) {
        this.customTimingTypGreaterThanEqual = customTimingTypGreaterThanEqual;
    }

    /**
     * customTimingTypLessThan のゲッターメソッドです。
     * 
     * @return the customTimingTypLessThan
     */
    public String getCustomTimingTypLessThan() {
        return customTimingTypLessThan;
    }

    /**
     * customTimingTypLessThan のセッターメソッドです。
     * 
     * @param customTimingTypLessThan customTimingTypLessThan に設定する
     */
    public void setCustomTimingTypLessThan(String customTimingTypLessThan) {
        this.customTimingTypLessThan = customTimingTypLessThan;
    }

    /**
     * customTimingTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the customTimingTypLessThanEqual
     */
    public String getCustomTimingTypLessThanEqual() {
        return customTimingTypLessThanEqual;
    }

    /**
     * customTimingTypLessThanEqual のセッターメソッドです。
     * 
     * @param customTimingTypLessThanEqual customTimingTypLessThanEqual に設定する
     */
    public void setCustomTimingTypLessThanEqual(String customTimingTypLessThanEqual) {
        this.customTimingTypLessThanEqual = customTimingTypLessThanEqual;
    }

    /**
     * customTimingTypLikeFront のゲッターメソッドです。
     * 
     * @return the customTimingTypLikeFront
     */
    public String getCustomTimingTypLikeFront() {
        return customTimingTypLikeFront;
    }

    /**
     * customTimingTypLikeFront のセッターメソッドです。
     * 
     * @param customTimingTypLikeFront customTimingTypLikeFront に設定する
     */
    public void setCustomTimingTypLikeFront(String customTimingTypLikeFront) {
        this.customTimingTypLikeFront = customTimingTypLikeFront;
    }

    /**
     * cmlTypGreaterThan のゲッターメソッドです。
     * 
     * @return the cmlTypGreaterThan
     */
    public String getCmlTypGreaterThan() {
        return cmlTypGreaterThan;
    }

    /**
     * cmlTypGreaterThan のセッターメソッドです。
     * 
     * @param cmlTypGreaterThan cmlTypGreaterThan に設定する
     */
    public void setCmlTypGreaterThan(String cmlTypGreaterThan) {
        this.cmlTypGreaterThan = cmlTypGreaterThan;
    }

    /**
     * cmlTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the cmlTypGreaterThanEqual
     */
    public String getCmlTypGreaterThanEqual() {
        return cmlTypGreaterThanEqual;
    }

    /**
     * cmlTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param cmlTypGreaterThanEqual cmlTypGreaterThanEqual に設定する
     */
    public void setCmlTypGreaterThanEqual(String cmlTypGreaterThanEqual) {
        this.cmlTypGreaterThanEqual = cmlTypGreaterThanEqual;
    }

    /**
     * cmlTypLessThan のゲッターメソッドです。
     * 
     * @return the cmlTypLessThan
     */
    public String getCmlTypLessThan() {
        return cmlTypLessThan;
    }

    /**
     * cmlTypLessThan のセッターメソッドです。
     * 
     * @param cmlTypLessThan cmlTypLessThan に設定する
     */
    public void setCmlTypLessThan(String cmlTypLessThan) {
        this.cmlTypLessThan = cmlTypLessThan;
    }

    /**
     * cmlTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the cmlTypLessThanEqual
     */
    public String getCmlTypLessThanEqual() {
        return cmlTypLessThanEqual;
    }

    /**
     * cmlTypLessThanEqual のセッターメソッドです。
     * 
     * @param cmlTypLessThanEqual cmlTypLessThanEqual に設定する
     */
    public void setCmlTypLessThanEqual(String cmlTypLessThanEqual) {
        this.cmlTypLessThanEqual = cmlTypLessThanEqual;
    }

    /**
     * cmlTypLikeFront のゲッターメソッドです。
     * 
     * @return the cmlTypLikeFront
     */
    public String getCmlTypLikeFront() {
        return cmlTypLikeFront;
    }

    /**
     * cmlTypLikeFront のセッターメソッドです。
     * 
     * @param cmlTypLikeFront cmlTypLikeFront に設定する
     */
    public void setCmlTypLikeFront(String cmlTypLikeFront) {
        this.cmlTypLikeFront = cmlTypLikeFront;
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
     * shippedDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shippedDtGreaterThanEqual
     */
    public Date getShippedDtGreaterThanEqual() {
        return shippedDtGreaterThanEqual;
    }

    /**
     * shippedDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param shippedDtGreaterThanEqual shippedDtGreaterThanEqual に設定する
     */
    public void setShippedDtGreaterThanEqual(Date shippedDtGreaterThanEqual) {
        this.shippedDtGreaterThanEqual = shippedDtGreaterThanEqual;
    }

    /**
     * shippedDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the shippedDtLessThanEqual
     */
    public Date getShippedDtLessThanEqual() {
        return shippedDtLessThanEqual;
    }

    /**
     * shippedDtLessThanEqual のセッターメソッドです。
     * 
     * @param shippedDtLessThanEqual shippedDtLessThanEqual に設定する
     */
    public void setShippedDtLessThanEqual(Date shippedDtLessThanEqual) {
        this.shippedDtLessThanEqual = shippedDtLessThanEqual;
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
     * migrationFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the migrationFlgGreaterThan
     */
    public String getMigrationFlgGreaterThan() {
        return migrationFlgGreaterThan;
    }

    /**
     * migrationFlgGreaterThan のセッターメソッドです。
     * 
     * @param migrationFlgGreaterThan migrationFlgGreaterThan に設定する
     */
    public void setMigrationFlgGreaterThan(String migrationFlgGreaterThan) {
        this.migrationFlgGreaterThan = migrationFlgGreaterThan;
    }

    /**
     * migrationFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the migrationFlgGreaterThanEqual
     */
    public String getMigrationFlgGreaterThanEqual() {
        return migrationFlgGreaterThanEqual;
    }

    /**
     * migrationFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param migrationFlgGreaterThanEqual migrationFlgGreaterThanEqual に設定する
     */
    public void setMigrationFlgGreaterThanEqual(String migrationFlgGreaterThanEqual) {
        this.migrationFlgGreaterThanEqual = migrationFlgGreaterThanEqual;
    }

    /**
     * migrationFlgLessThan のゲッターメソッドです。
     * 
     * @return the migrationFlgLessThan
     */
    public String getMigrationFlgLessThan() {
        return migrationFlgLessThan;
    }

    /**
     * migrationFlgLessThan のセッターメソッドです。
     * 
     * @param migrationFlgLessThan migrationFlgLessThan に設定する
     */
    public void setMigrationFlgLessThan(String migrationFlgLessThan) {
        this.migrationFlgLessThan = migrationFlgLessThan;
    }

    /**
     * migrationFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the migrationFlgLessThanEqual
     */
    public String getMigrationFlgLessThanEqual() {
        return migrationFlgLessThanEqual;
    }

    /**
     * migrationFlgLessThanEqual のセッターメソッドです。
     * 
     * @param migrationFlgLessThanEqual migrationFlgLessThanEqual に設定する
     */
    public void setMigrationFlgLessThanEqual(String migrationFlgLessThanEqual) {
        this.migrationFlgLessThanEqual = migrationFlgLessThanEqual;
    }

    /**
     * migrationFlgLikeFront のゲッターメソッドです。
     * 
     * @return the migrationFlgLikeFront
     */
    public String getMigrationFlgLikeFront() {
        return migrationFlgLikeFront;
    }

    /**
     * migrationFlgLikeFront のセッターメソッドです。
     * 
     * @param migrationFlgLikeFront migrationFlgLikeFront に設定する
     */
    public void setMigrationFlgLikeFront(String migrationFlgLikeFront) {
        this.migrationFlgLikeFront = migrationFlgLikeFront;
    }

    /**
     * grpNo1GreaterThan のゲッターメソッドです。
     * 
     * @return the grpNo1GreaterThan
     */
    public String getGrpNo1GreaterThan() {
        return grpNo1GreaterThan;
    }

    /**
     * grpNo1GreaterThan のセッターメソッドです。
     * 
     * @param grpNo1GreaterThan grpNo1GreaterThan に設定する
     */
    public void setGrpNo1GreaterThan(String grpNo1GreaterThan) {
        this.grpNo1GreaterThan = grpNo1GreaterThan;
    }

    /**
     * grpNo1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the grpNo1GreaterThanEqual
     */
    public String getGrpNo1GreaterThanEqual() {
        return grpNo1GreaterThanEqual;
    }

    /**
     * grpNo1GreaterThanEqual のセッターメソッドです。
     * 
     * @param grpNo1GreaterThanEqual grpNo1GreaterThanEqual に設定する
     */
    public void setGrpNo1GreaterThanEqual(String grpNo1GreaterThanEqual) {
        this.grpNo1GreaterThanEqual = grpNo1GreaterThanEqual;
    }

    /**
     * grpNo1LessThan のゲッターメソッドです。
     * 
     * @return the grpNo1LessThan
     */
    public String getGrpNo1LessThan() {
        return grpNo1LessThan;
    }

    /**
     * grpNo1LessThan のセッターメソッドです。
     * 
     * @param grpNo1LessThan grpNo1LessThan に設定する
     */
    public void setGrpNo1LessThan(String grpNo1LessThan) {
        this.grpNo1LessThan = grpNo1LessThan;
    }

    /**
     * grpNo1LessThanEqual のゲッターメソッドです。
     * 
     * @return the grpNo1LessThanEqual
     */
    public String getGrpNo1LessThanEqual() {
        return grpNo1LessThanEqual;
    }

    /**
     * grpNo1LessThanEqual のセッターメソッドです。
     * 
     * @param grpNo1LessThanEqual grpNo1LessThanEqual に設定する
     */
    public void setGrpNo1LessThanEqual(String grpNo1LessThanEqual) {
        this.grpNo1LessThanEqual = grpNo1LessThanEqual;
    }

    /**
     * grpNo1LikeFront のゲッターメソッドです。
     * 
     * @return the grpNo1LikeFront
     */
    public String getGrpNo1LikeFront() {
        return grpNo1LikeFront;
    }

    /**
     * grpNo1LikeFront のセッターメソッドです。
     * 
     * @param grpNo1LikeFront grpNo1LikeFront に設定する
     */
    public void setGrpNo1LikeFront(String grpNo1LikeFront) {
        this.grpNo1LikeFront = grpNo1LikeFront;
    }

    /**
     * grpNo2GreaterThan のゲッターメソッドです。
     * 
     * @return the grpNo2GreaterThan
     */
    public String getGrpNo2GreaterThan() {
        return grpNo2GreaterThan;
    }

    /**
     * grpNo2GreaterThan のセッターメソッドです。
     * 
     * @param grpNo2GreaterThan grpNo2GreaterThan に設定する
     */
    public void setGrpNo2GreaterThan(String grpNo2GreaterThan) {
        this.grpNo2GreaterThan = grpNo2GreaterThan;
    }

    /**
     * grpNo2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the grpNo2GreaterThanEqual
     */
    public String getGrpNo2GreaterThanEqual() {
        return grpNo2GreaterThanEqual;
    }

    /**
     * grpNo2GreaterThanEqual のセッターメソッドです。
     * 
     * @param grpNo2GreaterThanEqual grpNo2GreaterThanEqual に設定する
     */
    public void setGrpNo2GreaterThanEqual(String grpNo2GreaterThanEqual) {
        this.grpNo2GreaterThanEqual = grpNo2GreaterThanEqual;
    }

    /**
     * grpNo2LessThan のゲッターメソッドです。
     * 
     * @return the grpNo2LessThan
     */
    public String getGrpNo2LessThan() {
        return grpNo2LessThan;
    }

    /**
     * grpNo2LessThan のセッターメソッドです。
     * 
     * @param grpNo2LessThan grpNo2LessThan に設定する
     */
    public void setGrpNo2LessThan(String grpNo2LessThan) {
        this.grpNo2LessThan = grpNo2LessThan;
    }

    /**
     * grpNo2LessThanEqual のゲッターメソッドです。
     * 
     * @return the grpNo2LessThanEqual
     */
    public String getGrpNo2LessThanEqual() {
        return grpNo2LessThanEqual;
    }

    /**
     * grpNo2LessThanEqual のセッターメソッドです。
     * 
     * @param grpNo2LessThanEqual grpNo2LessThanEqual に設定する
     */
    public void setGrpNo2LessThanEqual(String grpNo2LessThanEqual) {
        this.grpNo2LessThanEqual = grpNo2LessThanEqual;
    }

    /**
     * grpNo2LikeFront のゲッターメソッドです。
     * 
     * @return the grpNo2LikeFront
     */
    public String getGrpNo2LikeFront() {
        return grpNo2LikeFront;
    }

    /**
     * grpNo2LikeFront のセッターメソッドです。
     * 
     * @param grpNo2LikeFront grpNo2LikeFront に設定する
     */
    public void setGrpNo2LikeFront(String grpNo2LikeFront) {
        this.grpNo2LikeFront = grpNo2LikeFront;
    }

    /**
     * decisionFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the decisionFlgGreaterThan
     */
    public String getDecisionFlgGreaterThan() {
        return decisionFlgGreaterThan;
    }

    /**
     * decisionFlgGreaterThan のセッターメソッドです。
     * 
     * @param decisionFlgGreaterThan decisionFlgGreaterThan に設定する
     */
    public void setDecisionFlgGreaterThan(String decisionFlgGreaterThan) {
        this.decisionFlgGreaterThan = decisionFlgGreaterThan;
    }

    /**
     * decisionFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the decisionFlgGreaterThanEqual
     */
    public String getDecisionFlgGreaterThanEqual() {
        return decisionFlgGreaterThanEqual;
    }

    /**
     * decisionFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param decisionFlgGreaterThanEqual decisionFlgGreaterThanEqual に設定する
     */
    public void setDecisionFlgGreaterThanEqual(String decisionFlgGreaterThanEqual) {
        this.decisionFlgGreaterThanEqual = decisionFlgGreaterThanEqual;
    }

    /**
     * decisionFlgLessThan のゲッターメソッドです。
     * 
     * @return the decisionFlgLessThan
     */
    public String getDecisionFlgLessThan() {
        return decisionFlgLessThan;
    }

    /**
     * decisionFlgLessThan のセッターメソッドです。
     * 
     * @param decisionFlgLessThan decisionFlgLessThan に設定する
     */
    public void setDecisionFlgLessThan(String decisionFlgLessThan) {
        this.decisionFlgLessThan = decisionFlgLessThan;
    }

    /**
     * decisionFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the decisionFlgLessThanEqual
     */
    public String getDecisionFlgLessThanEqual() {
        return decisionFlgLessThanEqual;
    }

    /**
     * decisionFlgLessThanEqual のセッターメソッドです。
     * 
     * @param decisionFlgLessThanEqual decisionFlgLessThanEqual に設定する
     */
    public void setDecisionFlgLessThanEqual(String decisionFlgLessThanEqual) {
        this.decisionFlgLessThanEqual = decisionFlgLessThanEqual;
    }

    /**
     * decisionFlgLikeFront のゲッターメソッドです。
     * 
     * @return the decisionFlgLikeFront
     */
    public String getDecisionFlgLikeFront() {
        return decisionFlgLikeFront;
    }

    /**
     * decisionFlgLikeFront のセッターメソッドです。
     * 
     * @param decisionFlgLikeFront decisionFlgLikeFront に設定する
     */
    public void setDecisionFlgLikeFront(String decisionFlgLikeFront) {
        this.decisionFlgLikeFront = decisionFlgLikeFront;
    }

    /**
     * tempInvoiceNoGreaterThan のゲッターメソッドです。
     * 
     * @return the tempInvoiceNoGreaterThan
     */
    public String getTempInvoiceNoGreaterThan() {
        return tempInvoiceNoGreaterThan;
    }

    /**
     * tempInvoiceNoGreaterThan のセッターメソッドです。
     * 
     * @param tempInvoiceNoGreaterThan tempInvoiceNoGreaterThan に設定する
     */
    public void setTempInvoiceNoGreaterThan(String tempInvoiceNoGreaterThan) {
        this.tempInvoiceNoGreaterThan = tempInvoiceNoGreaterThan;
    }

    /**
     * tempInvoiceNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the tempInvoiceNoGreaterThanEqual
     */
    public String getTempInvoiceNoGreaterThanEqual() {
        return tempInvoiceNoGreaterThanEqual;
    }

    /**
     * tempInvoiceNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param tempInvoiceNoGreaterThanEqual tempInvoiceNoGreaterThanEqual に設定する
     */
    public void setTempInvoiceNoGreaterThanEqual(String tempInvoiceNoGreaterThanEqual) {
        this.tempInvoiceNoGreaterThanEqual = tempInvoiceNoGreaterThanEqual;
    }

    /**
     * tempInvoiceNoLessThan のゲッターメソッドです。
     * 
     * @return the tempInvoiceNoLessThan
     */
    public String getTempInvoiceNoLessThan() {
        return tempInvoiceNoLessThan;
    }

    /**
     * tempInvoiceNoLessThan のセッターメソッドです。
     * 
     * @param tempInvoiceNoLessThan tempInvoiceNoLessThan に設定する
     */
    public void setTempInvoiceNoLessThan(String tempInvoiceNoLessThan) {
        this.tempInvoiceNoLessThan = tempInvoiceNoLessThan;
    }

    /**
     * tempInvoiceNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the tempInvoiceNoLessThanEqual
     */
    public String getTempInvoiceNoLessThanEqual() {
        return tempInvoiceNoLessThanEqual;
    }

    /**
     * tempInvoiceNoLessThanEqual のセッターメソッドです。
     * 
     * @param tempInvoiceNoLessThanEqual tempInvoiceNoLessThanEqual に設定する
     */
    public void setTempInvoiceNoLessThanEqual(String tempInvoiceNoLessThanEqual) {
        this.tempInvoiceNoLessThanEqual = tempInvoiceNoLessThanEqual;
    }

    /**
     * tempInvoiceNoLikeFront のゲッターメソッドです。
     * 
     * @return the tempInvoiceNoLikeFront
     */
    public String getTempInvoiceNoLikeFront() {
        return tempInvoiceNoLikeFront;
    }

    /**
     * tempInvoiceNoLikeFront のセッターメソッドです。
     * 
     * @param tempInvoiceNoLikeFront tempInvoiceNoLikeFront に設定する
     */
    public void setTempInvoiceNoLikeFront(String tempInvoiceNoLikeFront) {
        this.tempInvoiceNoLikeFront = tempInvoiceNoLikeFront;
    }

    /**
     * invoiceNoGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceNoGreaterThan
     */
    public String getInvoiceNoGreaterThan() {
        return invoiceNoGreaterThan;
    }

    /**
     * invoiceNoGreaterThan のセッターメソッドです。
     * 
     * @param invoiceNoGreaterThan invoiceNoGreaterThan に設定する
     */
    public void setInvoiceNoGreaterThan(String invoiceNoGreaterThan) {
        this.invoiceNoGreaterThan = invoiceNoGreaterThan;
    }

    /**
     * invoiceNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceNoGreaterThanEqual
     */
    public String getInvoiceNoGreaterThanEqual() {
        return invoiceNoGreaterThanEqual;
    }

    /**
     * invoiceNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceNoGreaterThanEqual invoiceNoGreaterThanEqual に設定する
     */
    public void setInvoiceNoGreaterThanEqual(String invoiceNoGreaterThanEqual) {
        this.invoiceNoGreaterThanEqual = invoiceNoGreaterThanEqual;
    }

    /**
     * invoiceNoLessThan のゲッターメソッドです。
     * 
     * @return the invoiceNoLessThan
     */
    public String getInvoiceNoLessThan() {
        return invoiceNoLessThan;
    }

    /**
     * invoiceNoLessThan のセッターメソッドです。
     * 
     * @param invoiceNoLessThan invoiceNoLessThan に設定する
     */
    public void setInvoiceNoLessThan(String invoiceNoLessThan) {
        this.invoiceNoLessThan = invoiceNoLessThan;
    }

    /**
     * invoiceNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceNoLessThanEqual
     */
    public String getInvoiceNoLessThanEqual() {
        return invoiceNoLessThanEqual;
    }

    /**
     * invoiceNoLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceNoLessThanEqual invoiceNoLessThanEqual に設定する
     */
    public void setInvoiceNoLessThanEqual(String invoiceNoLessThanEqual) {
        this.invoiceNoLessThanEqual = invoiceNoLessThanEqual;
    }

    /**
     * invoiceNoLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceNoLikeFront
     */
    public String getInvoiceNoLikeFront() {
        return invoiceNoLikeFront;
    }

    /**
     * invoiceNoLikeFront のセッターメソッドです。
     * 
     * @param invoiceNoLikeFront invoiceNoLikeFront に設定する
     */
    public void setInvoiceNoLikeFront(String invoiceNoLikeFront) {
        this.invoiceNoLikeFront = invoiceNoLikeFront;
    }

    /**
     * reInvoiceFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the reInvoiceFlgGreaterThan
     */
    public String getReInvoiceFlgGreaterThan() {
        return reInvoiceFlgGreaterThan;
    }

    /**
     * reInvoiceFlgGreaterThan のセッターメソッドです。
     * 
     * @param reInvoiceFlgGreaterThan reInvoiceFlgGreaterThan に設定する
     */
    public void setReInvoiceFlgGreaterThan(String reInvoiceFlgGreaterThan) {
        this.reInvoiceFlgGreaterThan = reInvoiceFlgGreaterThan;
    }

    /**
     * reInvoiceFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the reInvoiceFlgGreaterThanEqual
     */
    public String getReInvoiceFlgGreaterThanEqual() {
        return reInvoiceFlgGreaterThanEqual;
    }

    /**
     * reInvoiceFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param reInvoiceFlgGreaterThanEqual reInvoiceFlgGreaterThanEqual に設定する
     */
    public void setReInvoiceFlgGreaterThanEqual(String reInvoiceFlgGreaterThanEqual) {
        this.reInvoiceFlgGreaterThanEqual = reInvoiceFlgGreaterThanEqual;
    }

    /**
     * reInvoiceFlgLessThan のゲッターメソッドです。
     * 
     * @return the reInvoiceFlgLessThan
     */
    public String getReInvoiceFlgLessThan() {
        return reInvoiceFlgLessThan;
    }

    /**
     * reInvoiceFlgLessThan のセッターメソッドです。
     * 
     * @param reInvoiceFlgLessThan reInvoiceFlgLessThan に設定する
     */
    public void setReInvoiceFlgLessThan(String reInvoiceFlgLessThan) {
        this.reInvoiceFlgLessThan = reInvoiceFlgLessThan;
    }

    /**
     * reInvoiceFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the reInvoiceFlgLessThanEqual
     */
    public String getReInvoiceFlgLessThanEqual() {
        return reInvoiceFlgLessThanEqual;
    }

    /**
     * reInvoiceFlgLessThanEqual のセッターメソッドです。
     * 
     * @param reInvoiceFlgLessThanEqual reInvoiceFlgLessThanEqual に設定する
     */
    public void setReInvoiceFlgLessThanEqual(String reInvoiceFlgLessThanEqual) {
        this.reInvoiceFlgLessThanEqual = reInvoiceFlgLessThanEqual;
    }

    /**
     * reInvoiceFlgLikeFront のゲッターメソッドです。
     * 
     * @return the reInvoiceFlgLikeFront
     */
    public String getReInvoiceFlgLikeFront() {
        return reInvoiceFlgLikeFront;
    }

    /**
     * reInvoiceFlgLikeFront のセッターメソッドです。
     * 
     * @param reInvoiceFlgLikeFront reInvoiceFlgLikeFront に設定する
     */
    public void setReInvoiceFlgLikeFront(String reInvoiceFlgLikeFront) {
        this.reInvoiceFlgLikeFront = reInvoiceFlgLikeFront;
    }

    /**
     * reInvoiceShipperCdGreaterThan のゲッターメソッドです。
     * 
     * @return the reInvoiceShipperCdGreaterThan
     */
    public String getReInvoiceShipperCdGreaterThan() {
        return reInvoiceShipperCdGreaterThan;
    }

    /**
     * reInvoiceShipperCdGreaterThan のセッターメソッドです。
     * 
     * @param reInvoiceShipperCdGreaterThan reInvoiceShipperCdGreaterThan に設定する
     */
    public void setReInvoiceShipperCdGreaterThan(String reInvoiceShipperCdGreaterThan) {
        this.reInvoiceShipperCdGreaterThan = reInvoiceShipperCdGreaterThan;
    }

    /**
     * reInvoiceShipperCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the reInvoiceShipperCdGreaterThanEqual
     */
    public String getReInvoiceShipperCdGreaterThanEqual() {
        return reInvoiceShipperCdGreaterThanEqual;
    }

    /**
     * reInvoiceShipperCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param reInvoiceShipperCdGreaterThanEqual reInvoiceShipperCdGreaterThanEqual に設定する
     */
    public void setReInvoiceShipperCdGreaterThanEqual(String reInvoiceShipperCdGreaterThanEqual) {
        this.reInvoiceShipperCdGreaterThanEqual = reInvoiceShipperCdGreaterThanEqual;
    }

    /**
     * reInvoiceShipperCdLessThan のゲッターメソッドです。
     * 
     * @return the reInvoiceShipperCdLessThan
     */
    public String getReInvoiceShipperCdLessThan() {
        return reInvoiceShipperCdLessThan;
    }

    /**
     * reInvoiceShipperCdLessThan のセッターメソッドです。
     * 
     * @param reInvoiceShipperCdLessThan reInvoiceShipperCdLessThan に設定する
     */
    public void setReInvoiceShipperCdLessThan(String reInvoiceShipperCdLessThan) {
        this.reInvoiceShipperCdLessThan = reInvoiceShipperCdLessThan;
    }

    /**
     * reInvoiceShipperCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the reInvoiceShipperCdLessThanEqual
     */
    public String getReInvoiceShipperCdLessThanEqual() {
        return reInvoiceShipperCdLessThanEqual;
    }

    /**
     * reInvoiceShipperCdLessThanEqual のセッターメソッドです。
     * 
     * @param reInvoiceShipperCdLessThanEqual reInvoiceShipperCdLessThanEqual に設定する
     */
    public void setReInvoiceShipperCdLessThanEqual(String reInvoiceShipperCdLessThanEqual) {
        this.reInvoiceShipperCdLessThanEqual = reInvoiceShipperCdLessThanEqual;
    }

    /**
     * reInvoiceShipperCdLikeFront のゲッターメソッドです。
     * 
     * @return the reInvoiceShipperCdLikeFront
     */
    public String getReInvoiceShipperCdLikeFront() {
        return reInvoiceShipperCdLikeFront;
    }

    /**
     * reInvoiceShipperCdLikeFront のセッターメソッドです。
     * 
     * @param reInvoiceShipperCdLikeFront reInvoiceShipperCdLikeFront に設定する
     */
    public void setReInvoiceShipperCdLikeFront(String reInvoiceShipperCdLikeFront) {
        this.reInvoiceShipperCdLikeFront = reInvoiceShipperCdLikeFront;
    }

    /**
     * salesContractFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the salesContractFlgGreaterThan
     */
    public String getSalesContractFlgGreaterThan() {
        return salesContractFlgGreaterThan;
    }

    /**
     * salesContractFlgGreaterThan のセッターメソッドです。
     * 
     * @param salesContractFlgGreaterThan salesContractFlgGreaterThan に設定する
     */
    public void setSalesContractFlgGreaterThan(String salesContractFlgGreaterThan) {
        this.salesContractFlgGreaterThan = salesContractFlgGreaterThan;
    }

    /**
     * salesContractFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the salesContractFlgGreaterThanEqual
     */
    public String getSalesContractFlgGreaterThanEqual() {
        return salesContractFlgGreaterThanEqual;
    }

    /**
     * salesContractFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param salesContractFlgGreaterThanEqual salesContractFlgGreaterThanEqual に設定する
     */
    public void setSalesContractFlgGreaterThanEqual(String salesContractFlgGreaterThanEqual) {
        this.salesContractFlgGreaterThanEqual = salesContractFlgGreaterThanEqual;
    }

    /**
     * salesContractFlgLessThan のゲッターメソッドです。
     * 
     * @return the salesContractFlgLessThan
     */
    public String getSalesContractFlgLessThan() {
        return salesContractFlgLessThan;
    }

    /**
     * salesContractFlgLessThan のセッターメソッドです。
     * 
     * @param salesContractFlgLessThan salesContractFlgLessThan に設定する
     */
    public void setSalesContractFlgLessThan(String salesContractFlgLessThan) {
        this.salesContractFlgLessThan = salesContractFlgLessThan;
    }

    /**
     * salesContractFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the salesContractFlgLessThanEqual
     */
    public String getSalesContractFlgLessThanEqual() {
        return salesContractFlgLessThanEqual;
    }

    /**
     * salesContractFlgLessThanEqual のセッターメソッドです。
     * 
     * @param salesContractFlgLessThanEqual salesContractFlgLessThanEqual に設定する
     */
    public void setSalesContractFlgLessThanEqual(String salesContractFlgLessThanEqual) {
        this.salesContractFlgLessThanEqual = salesContractFlgLessThanEqual;
    }

    /**
     * salesContractFlgLikeFront のゲッターメソッドです。
     * 
     * @return the salesContractFlgLikeFront
     */
    public String getSalesContractFlgLikeFront() {
        return salesContractFlgLikeFront;
    }

    /**
     * salesContractFlgLikeFront のセッターメソッドです。
     * 
     * @param salesContractFlgLikeFront salesContractFlgLikeFront に設定する
     */
    public void setSalesContractFlgLikeFront(String salesContractFlgLikeFront) {
        this.salesContractFlgLikeFront = salesContractFlgLikeFront;
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

