/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

// 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FREE_1_DISP_FLG;
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FREE_2_DISP_FLG;
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FREE_3_DISP_FLG;
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FREE_4_DISP_FLG;
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_INV_TPL_NO;
//2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL_INVOICE_NO_SUPPLIER_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL_INVOICE_NO_SUPPLIER_FORMAT_FRT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL_TYP_CANCEL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL_TYP_NORMAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FREIGHT_RESPONSIBLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_INV_CTGRY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PAY_METH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CIGMA_FREIGHT_RESPONSIBLE_CD_COLLECT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CIGMA_FREIGHT_RESPONSIBLE_CD_PREPAID;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_ERT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_MISCELLANEOUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_A;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_Z;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.DOC_TYP_CML_ATCH_CSV;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FILE_SIZE_MAX;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FREIGHT_RESPONSIBLE_CD_COLLECT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FREIGHT_RESPONSIBLE_CD_PREPAID;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FRIGHT_ERR_0;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FRIGHT_ERR_1;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GRP_NO2_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0034;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.HS_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_E_RT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_FULL_RT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_C;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_I;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.KEY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LINE_SEPARATOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MANUAL_TYP_DNG_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MANUAL_TYP_NON_DNG_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MANUAL_TYP_RE_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0037;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0054;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0055;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0057;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0062;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0063;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0064;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0075;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0077;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0118;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0120;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0121;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W6001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_CUSTOMS_CLEARANCE_A;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_CUSTOMS_CLEARANCE_B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_CUSTOMS_CLEARANCE_Z;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_SHIPPING_COMFIRMATION_ACTUAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_STG_ACT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_STG_INSTR_WORKED_DONE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PROCESS_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REM_LC_TYP_LC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REM_LC_TYP_REM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_KEY_CANCEL_INVOICE_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_KEY_INVOICE_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_KEY_RE_INVOICE_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_COMPLETE_PACKING;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_COMPLETE_SHIPPING;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TMP_INVOICE_NO_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TMP_RE_INVOICE_NO_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_PROC_TYP_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_REQ_REC_STATUS_NOT_YET;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.UNIT_CD_CR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_1;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_2;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_3;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_4;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_5;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_PARAM_DELIM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.gscm.framework.constants.Constants.ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.csvlistconvert.CsvListConversion;
import com.globaldenso.ai.library.filemanagerstream.business.FileManagementException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TmCancelInvSeqTypDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaCustomerXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCntryDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvAmountChkDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvFreeItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvSeqDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPortDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceAttachedDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackAtchItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackingAttachedCmlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackingHeadDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtScAttachedDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtScHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingDocumentDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService;
import com.globaldenso.eca0027.core.auto.business.service.TmCntryService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService;
import com.globaldenso.eca0027.core.auto.business.service.TmPortService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService;
import com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService;
import com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService;
import com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService;
import com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TwInvItemService;
import com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TwInvService;
import com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService;
import com.globaldenso.eca0027.core.business.dao.W6001DocDao;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.F6051CmlAtchFileDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzItemOdrDomain;
import com.globaldenso.eca0027.core.business.domain.W6008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6001ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6001ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6003ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6003ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6004ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6004ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6005ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6005ParamEDT45PRDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6005ParamEDT47PRDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6011ItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6011ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6011ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws6001RestService;
import com.globaldenso.eca0027.core.business.ws.Ws6002RestService;
import com.globaldenso.eca0027.core.business.ws.Ws6003RestService;
import com.globaldenso.eca0027.core.business.ws.Ws6004RestService;
import com.globaldenso.eca0027.core.business.ws.Ws6005RestService;
import com.globaldenso.eca0027.core.business.ws.Ws6006RestService;
import com.globaldenso.eca0027.core.business.ws.Ws6011RestService;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmUserService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Service implementation class of Documentation.
 * <br />Documentationのサービス実装クラスです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public class W6001DocServiceImpl implements W6001DocService {

    // -- 呼出しサービス・DAO ----------------------------------------------------------------------
    /**
     * Documentation Dao
     */
    protected W6001DocDao w6001DocDao;
    
    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Invoice Item No Work Service<br />
     * インボイス作成対象品目番号ワーク サービス
     */
    protected TwInvItemService twInvItemService;
    
    /**
     * Invoide Palletize Work Service<br />
     * インボイス作成対象パレタイズワーク サービス
     */
    protected TwInvPltzService twInvPltzService;
    
    /**
     * Invoice Group Work Service<br />
     * インボイスグループワーク サービス
     */
    protected TwInvService twInvService;
    
    /**
     * Invoice Work Service<br />
     * インボイスワーク サービス
     */
    protected TwInvoiceService twInvoiceService;
    
    /**
     * Invoice Service<br />
     * インボイス サービス
     */
    protected TtInvoiceService ttInvoiceService;
    
    /**
     * Invoice Header sitting service<br />
     * インボイスヘッダー サービス
     */
    protected TtInvoiceHeaderService ttInvoiceHeaderService;
    
    /**
     * TtPackingHead Service<br />
     * TtPackingHead サービス
     */
    protected TtPackingHeadService ttPackingHeadService;
    
    /**
     * TtInvoiceAttached Service<br />
     * TtInvoiceAttached サービス
     */
    protected TtInvoiceAttachedService ttInvoiceAttachedService;
    
    /**
     * TtPackingAttachedCml Service<br />
     * TtPackingAttachedCml サービス
     */
    protected TtPackingAttachedCmlService ttPackingAttachedCmlService;
    
    /**
     * TtPackAtchItemNo Service<br />
     * TtPackAtchItemNo サービス
     */
    protected TtPackAtchItemNoService ttPackAtchItemNoService;
    
    /**
     * TtPltz Service<br />
     * TtPltz サービス
     */
    protected TtPltzService ttPltzService;
    
    /**
     * TtTmpStock Service<br />
     * TtTmpStock サービス
     */
    protected TtTmpStockService ttTmpStockService;
    
    /**
     * TtExpRcvOdr Service<br />
     * TtExpRcvOdr サービス
     */
    protected TtExpRcvOdrService ttExpRcvOdrService;
    
    /**
     * TmCigmaCustomerXref Service<br />
     * TmCigmaCustomerXref サービス
     */
    protected TmCigmaCustomerXrefService tmCigmaCustomerXrefService;
    
    /**
     * TmInvFreeItem Service<br />
     * TmInvFreeItem サービス
     */
    protected TmInvFreeItemService tmInvFreeItemService;
    
    /**
     * TmInvTpl Service<br />
     * TmInvTpl サービス
     */
    protected TmInvTplService tmInvTplService;
    
    /**
     * tmNxsShipTo Service<br />
     * tmNxsShipTo サービス
     */
    protected TmNxsShipToService tmNxsShipToService;
    
    /**
     * tmCntry Service<br />
     * tmCntry サービス
     */
    protected TmCntryService tmCntryService;
    
    /**
     * ttScAttached Service<br />
     * ttScAttached サービス
     */
    protected TtScAttachedService ttScAttachedService;
    
    /**
     * ttScHeader Service<br />
     * ttScHeader サービス
     */
    protected TtScHeaderService ttScHeaderService;
    
    /**
     * NEXUS Company Master Service<br />
     * NEXUS会社原単位 サービス
     */
    protected TmNxsCompService tmNxsCompService;
    
    /**
     * Port Master Service<br />
     * 港原単位 サービス
     */
    protected TmPortService tmPortService;
    
    /**
     * Code Master Service<br />
     * コード原単位 サービス
     */
    protected TmCdService tmCdService;
    
    /**
     * TmUserService
     */
    protected TmUserService tmUserService;
    
    /**
     * Invoice Calculate (Amount) error check per unit of service<br />
     * インボイス金額エラーチェック原単位 サービス
     */
    protected TmInvAmountChkService tmInvAmountChkService;
    
    /**
     * Invoice Sequence Master Service<br />
     * インボイス採番原単位サービス
     */
    protected TmInvSeqService tmInvSeqService;
    
    /**
     * Cancel Invoice numbering classification per unit service<br />
     * キャンセルインボイス採番区分原単位 サービス
     */
    protected TmCancelInvSeqTypService tmCancelInvSeqTypService;
    
    // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 START >>>>>
    /**
     * service of CIGMA Environment Master <br />
     * CIGMA環境原単位サービス
     */
    protected TmCigmaEnvService tmCigmaEnvService;
    // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 END <<<<<

    /**
     * Service Form L6001<br />
     * 帳票サービス L6001
     */
    protected L6001ReportService l6001ReportService;
    
    /**
     * Service Form L6002<br />
     * 帳票サービス L6002
     */
    protected L6002ReportService l6002ReportService;
    
    /**
     * Service Form L6003<br />
     * 帳票サービス L6003
     */
    protected L6003ReportService l6003ReportService;
    
    /**
     * Service Form L6004<br />
     * 帳票サービス L6004
     */
    protected L6004ReportService l6004ReportService;
    
    /**
     * Service Form L6005<br />
     * 帳票サービス L6005
     */
    protected L6005ReportService l6005ReportService;
    
    /**
     * Service Form L6006<br />
     * 帳票サービス L6006
     */
    protected L6006ReportService l6006ReportService;
    
    /**
     * Service Form L6007<br />
     * 帳票サービス L6007
     */
    protected L6007ReportService l6007ReportService;
    
    /**
     * Service Form L6008<br />
     * 帳票サービス L6008
     */
    protected L6008ReportService l6008ReportService;
    
    /**
     * Service Form L6009<br />
     * 帳票サービス L6009
     */
    protected L6009ReportService l6009ReportService;
    
    /**
     * Service Form L6010<br />
     * 帳票サービス L6010
     */
    protected L6010ReportService l6010ReportService;
    
    /**
     * Service Form L6011<br />
     * 帳票サービス L6011
     */
    protected L6011ReportService l6011ReportService;
    
    /**
     * Service Form L6012<br />
     * 帳票サービス L6012
     */
    protected L6012ReportService l6012ReportService;
    
    /**
     * Service Form L6013<br />
     * 帳票サービス L6013
     */
    protected L6013ReportService l6013ReportService;
    
    /**
     * Service Form L6014<br />
     * 帳票サービス L6014
     */
    protected L6014ReportService l6014ReportService;
    
    /**
     * Service Form L6015<br />
     * 帳票サービス L6015
     */
    protected L6015ReportService l6015ReportService;
    
    /**
     * Service Form L6016<br />
     * 帳票サービス L6016
     */
    protected L6016ReportService l6016ReportService;
    
    /**
     * File Manager<br />
     * ファイルマネージャ
     */
    protected FileManagementService fileManagerServiceForStream;
    
    /**
     * UserAuth
     */
    protected UserAuthService userAuthService;
    
    /**
     * Web service client (Ws6001)<br />
     * Webサービスクライアント(Ws6001)
     */
    protected Ws6001RestService ws6001RestService;
    
    /**
     * Web service client (Ws6002)<br />
     * Webサービスクライアント(Ws6002)
     */
    protected Ws6002RestService ws6002RestService;

    /**
     * Web service client (Ws6003)<br />
     * Webサービスクライアント(Ws6003)
     */
    protected Ws6003RestService ws6003RestService;
    
    /**
     * Web service client (Ws6004)<br />
     * Ws6004RestService
     */
    protected Ws6004RestService ws6004RestService;

    // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 START >>>>>
    /**
     * Web service client (Ws6005)<br />
     * Ws6005RestService
     */
    protected Ws6005RestService ws6005RestService;

    /**
     * Web service client (Ws6006)<br />
     * Ws6006RestService
     */
    protected Ws6006RestService ws6006RestService;
    // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 END <<<<<

    /**
     * Shipping Document Service<br />
     * 船積書類 サービス。
     * UT205 CML ATTACH CSV ADD
     */
    protected TtShippingDocumentService ttShippingDocumentService;

    /**
     * Web service client (Ws6011)<br />
     * Ws6011RestService
     * UT436 ADD
     */
    protected Ws6011RestService ws6011RestService;
    
    /**
     * TtOnlineReqJobParam Service<br />
     * TtOnlineReqJobParam サービス
     */
    protected TtOnlineReqJobParamService ttOnlineReqJobParamService;

    // --- Documentation用定義値 -------------------------------------------------------------------
    /**
     * PLTZ STATUS 30
     */
    protected String PLTZ_STATUS_30 = "30";

    /**
     * PLTZ STATUS 40
     */
    protected String PLTZ_STATUS_40 = "40";

    /**
     * PLTZ STATUS 50
     */
    protected String PLTZ_STATUS_50 = "50";

    /**
     * PLTZ STATUS 60
     */
    protected String PLTZ_STATUS_60 = "60";

    /**
     * PLTZ STATUS 80
     */
    protected String PLTZ_STATUS_80 = "80";

    /**
     * PLTZ STATUS 90
     */
    protected String PLTZ_STATUS_90 = "90";

    /**
     * NUMBER -1
     */
    protected String NUMBER_MINUS = "-1";

    /**
     * NUMBER 0
     */
    protected String NUMBER_0 = "0";

    /**
     * CANCEL TYPE C
     */
    protected String CANCEL_TYPE_C = "C";

    /**
     * Null character<br />
     * 空文字
     */
    protected String NULL_STR = "";
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001DocServiceImpl() {
        super();
    }

    // --- Setter ----------------------------------------------------------------------------------
   
    /**
     * Setter method for w6001DocDao.
     *
     * @param docDao Set for w6001DocDao
     */
    public void setW6001DocDao(W6001DocDao docDao) {
        w6001DocDao = docDao;
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for twInvItemService.
     *
     * @param twInvItemService Set for twInvItemService
     */
    public void setTwInvItemService(TwInvItemService twInvItemService) {
        this.twInvItemService = twInvItemService;
    }

    /**
     * Setter method for twInvPltzService.
     *
     * @param twInvPltzService Set for twInvPltzService
     */
    public void setTwInvPltzService(TwInvPltzService twInvPltzService) {
        this.twInvPltzService = twInvPltzService;
    }

    /**
     * Setter method for twInvService.
     *
     * @param twInvService Set for twInvService
     */
    public void setTwInvService(TwInvService twInvService) {
        this.twInvService = twInvService;
    }

    /**
     * Setter method for twInvoiceService.
     *
     * @param twInvoiceService Set for twInvoiceService
     */
    public void setTwInvoiceService(TwInvoiceService twInvoiceService) {
        this.twInvoiceService = twInvoiceService;
    }

    /**
     * Setter method for ttInvoiceService.
     *
     * @param ttInvoiceService Set for ttInvoiceService
     */
    public void setTtInvoiceService(TtInvoiceService ttInvoiceService) {
        this.ttInvoiceService = ttInvoiceService;
    }

    /**
     * Setter method for ttInvoiceHeaderService.
     *
     * @param ttInvoiceHeaderService Set for ttInvoiceHeaderService
     */
    public void setTtInvoiceHeaderService(
        TtInvoiceHeaderService ttInvoiceHeaderService) {
        this.ttInvoiceHeaderService = ttInvoiceHeaderService;
    }

    /**
     * Setter method for ttPackingHeadService.
     *
     * @param ttPackingHeadService Set for ttPackingHeadService
     */
    public void setTtPackingHeadService(TtPackingHeadService ttPackingHeadService) {
        this.ttPackingHeadService = ttPackingHeadService;
    }

    /**
     * Setter method for ttInvoiceAttachedService.
     *
     * @param ttInvoiceAttachedService Set for ttInvoiceAttachedService
     */
    public void setTtInvoiceAttachedService(
        TtInvoiceAttachedService ttInvoiceAttachedService) {
        this.ttInvoiceAttachedService = ttInvoiceAttachedService;
    }

    /**
     * Setter method for ttPackingAttachedCmlService.
     *
     * @param ttPackingAttachedCmlService Set for ttPackingAttachedCmlService
     */
    public void setTtPackingAttachedCmlService(
        TtPackingAttachedCmlService ttPackingAttachedCmlService) {
        this.ttPackingAttachedCmlService = ttPackingAttachedCmlService;
    }

    /**
     * Setter method for ttPackAtchItemNoService.
     *
     * @param ttPackAtchItemNoService Set for ttPackAtchItemNoService
     */
    public void setTtPackAtchItemNoService(
        TtPackAtchItemNoService ttPackAtchItemNoService) {
        this.ttPackAtchItemNoService = ttPackAtchItemNoService;
    }

    /**
     * Setter method for ttPltzService.
     *
     * @param ttPltzService Set for ttPltzService
     */
    public void setTtPltzService(TtPltzService ttPltzService) {
        this.ttPltzService = ttPltzService;
    }

    /**
     * Setter method for ttTmpStockService.
     *
     * @param ttTmpStockService Set for ttTmpStockService
     */
    public void setTtTmpStockService(TtTmpStockService ttTmpStockService) {
        this.ttTmpStockService = ttTmpStockService;
    }

    /**
     * Setter method for ttExpRcvOdrService.
     *
     * @param ttExpRcvOdrService Set for ttExpRcvOdrService
     */
    public void setTtExpRcvOdrService(TtExpRcvOdrService ttExpRcvOdrService) {
        this.ttExpRcvOdrService = ttExpRcvOdrService;
    }

    /**
     * Setter method for tmCigmaCustomerXrefService.
     *
     * @param tmCigmaCustomerXrefService Set for tmCigmaCustomerXrefService
     */
    public void setTmCigmaCustomerXrefService(
        TmCigmaCustomerXrefService tmCigmaCustomerXrefService) {
        this.tmCigmaCustomerXrefService = tmCigmaCustomerXrefService;
    }

    /**
     * Setter method for tmInvFreeItemService.
     *
     * @param tmInvFreeItemService Set for tmInvFreeItemService
     */
    public void setTmInvFreeItemService(TmInvFreeItemService tmInvFreeItemService) {
        this.tmInvFreeItemService = tmInvFreeItemService;
    }

    /**
     * Setter method for tmInvTplService.
     *
     * @param tmInvTplService Set for tmInvTplService
     */
    public void setTmInvTplService(TmInvTplService tmInvTplService) {
        this.tmInvTplService = tmInvTplService;
    }

    /**
     * Setter method for tmNxsShipToService.
     *
     * @param tmNxsShipToService Set for tmNxsShipToService
     */
    public void setTmNxsShipToService(TmNxsShipToService tmNxsShipToService) {
        this.tmNxsShipToService = tmNxsShipToService;
    }

    /**
     * Setter method for tmCntryService.
     *
     * @param tmCntryService Set for tmCntryService
     */
    public void setTmCntryService(TmCntryService tmCntryService) {
        this.tmCntryService = tmCntryService;
    }

    /**
     * Setter method for ttScAttachedService.
     *
     * @param ttScAttachedService Set for ttScAttachedService
     */
    public void setTtScAttachedService(TtScAttachedService ttScAttachedService) {
        this.ttScAttachedService = ttScAttachedService;
    }

    /**
     * Setter method for ttScHeaderService.
     *
     * @param ttScHeaderService Set for ttScHeaderService
     */
    public void setTtScHeaderService(TtScHeaderService ttScHeaderService) {
        this.ttScHeaderService = ttScHeaderService;
    }

    /**
     * Setter method for tmNxsCompService.
     *
     * @param tmNxsCompService Set for tmNxsCompService
     */
    public void setTmNxsCompService(TmNxsCompService tmNxsCompService) {
        this.tmNxsCompService = tmNxsCompService;
    }

    /**
     * Setter method for tmPortService.
     *
     * @param tmPortService Set for tmPortService
     */
    public void setTmPortService(TmPortService tmPortService) {
        this.tmPortService = tmPortService;
    }

    /**
     * Setter method for tmCdService.
     *
     * @param tmCdService Set for tmCdService
     */
    public void setTmCdService(TmCdService tmCdService) {
        this.tmCdService = tmCdService;
    }
    
    /**
     * Setter method for tmInvAmountChkService.
     *
     * @param tmInvAmountChkService Set for tmInvAmountChkService
     */
    public void setTmInvAmountChkService(TmInvAmountChkService tmInvAmountChkService) {
        this.tmInvAmountChkService = tmInvAmountChkService;
    }

    /**
     * Setter method for tmUserService.
     *
     * @param tmUserService Set for tmUserService
     */
    public void setTmUserService(TmUserService tmUserService) {
        this.tmUserService = tmUserService;
    }

    /**
     * Setter method for l6001ReportService.
     *
     * @param reportService Set for l6001ReportService
     */
    public void setL6001ReportService(L6001ReportService reportService) {
        l6001ReportService = reportService;
    }

    /**
     * Setter method for l6002ReportService.
     *
     * @param reportService Set for l6002ReportService
     */
    public void setL6002ReportService(L6002ReportService reportService) {
        l6002ReportService = reportService;
    }

    /**
     * Setter method for l6003ReportService.
     *
     * @param reportService Set for l6003ReportService
     */
    public void setL6003ReportService(L6003ReportService reportService) {
        l6003ReportService = reportService;
    }

    /**
     * Setter method for l6004ReportService.
     *
     * @param reportService Set for l6004ReportService
     */
    public void setL6004ReportService(L6004ReportService reportService) {
        l6004ReportService = reportService;
    }

    /**
     * Setter method for l6005ReportService.
     *
     * @param reportService Set for l6005ReportService
     */
    public void setL6005ReportService(L6005ReportService reportService) {
        l6005ReportService = reportService;
    }

    /**
     * Setter method for l6006ReportService.
     *
     * @param reportService Set for l6006ReportService
     */
    public void setL6006ReportService(L6006ReportService reportService) {
        l6006ReportService = reportService;
    }

    /**
     * Setter method for l6007ReportService.
     *
     * @param reportService Set for l6007ReportService
     */
    public void setL6007ReportService(L6007ReportService reportService) {
        l6007ReportService = reportService;
    }

    /**
     * Setter method for l6008ReportService.
     *
     * @param reportService Set for l6008ReportService
     */
    public void setL6008ReportService(L6008ReportService reportService) {
        l6008ReportService = reportService;
    }

    /**
     * Setter method for l6009ReportService.
     *
     * @param reportService Set for l6009ReportService
     */
    public void setL6009ReportService(L6009ReportService reportService) {
        l6009ReportService = reportService;
    }

    /**
     * Setter method for l6010ReportService.
     *
     * @param reportService Set for l6010ReportService
     */
    public void setL6010ReportService(L6010ReportService reportService) {
        l6010ReportService = reportService;
    }

    /**
     * Setter method for l6011ReportService.
     *
     * @param reportService Set for l6011ReportService
     */
    public void setL6011ReportService(L6011ReportService reportService) {
        l6011ReportService = reportService;
    }

    /**
     * Setter method for l6012ReportService.
     *
     * @param reportService Set for l6012ReportService
     */
    public void setL6012ReportService(L6012ReportService reportService) {
        l6012ReportService = reportService;
    }

    /**
     * Setter method for l6013ReportService.
     *
     * @param reportService Set for l6013ReportService
     */
    public void setL6013ReportService(L6013ReportService reportService) {
        l6013ReportService = reportService;
    }

    /**
     * Setter method for l6014ReportService.
     *
     * @param reportService Set for l6014ReportService
     */
    public void setL6014ReportService(L6014ReportService reportService) {
        l6014ReportService = reportService;
    }

    /**
     * Setter method for l6015ReportService.
     *
     * @param reportService Set for l6015ReportService
     */
    public void setL6015ReportService(L6015ReportService reportService) {
        l6015ReportService = reportService;
    }

    /**
     * Setter method for l6016ReportService.
     *
     * @param reportService Set for l6016ReportService
     */
    public void setL6016ReportService(L6016ReportService reportService) {
        l6016ReportService = reportService;
    }

    /**
     * Setter method for fileManagerServiceForStream.
     *
     * @param fileManagerServiceForStream Set for fileManagerServiceForStream
     */
    public void setFileManagerServiceForStream(
        FileManagementService fileManagerServiceForStream) {
        this.fileManagerServiceForStream = fileManagerServiceForStream;
    }

    /**
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * Setter method for ws6001RestService.
     *
     * @param ws6001RestService Set for ws6001RestService
     */
    public void setWs6001RestService(Ws6001RestService ws6001RestService) {
        this.ws6001RestService = ws6001RestService;
    }

    /**
     * Setter method for ws6002RestService.
     *
     * @param ws6002RestService Set for ws6002RestService
     */
    public void setWs6002RestService(Ws6002RestService ws6002RestService) {
        this.ws6002RestService = ws6002RestService;
    }

    /**
     * Setter method for ws6003RestService.
     *
     * @param ws6003RestService Set for ws6003RestService
     */
    public void setWs6003RestService(Ws6003RestService ws6003RestService) {
        this.ws6003RestService = ws6003RestService;
    }

    /**
     * Setter method for ws6004RestService.
     *
     * @param ws6004RestService Set for ws6004RestService
     */
    public void setWs6004RestService(Ws6004RestService ws6004RestService) {
        this.ws6004RestService = ws6004RestService;
    }

    /**
     * Setter method for tmInvSeqService.
     *
     * @param tmInvSeqService Set for tmInvSeqService
     */
    public void setTmInvSeqService(TmInvSeqService tmInvSeqService) {
        this.tmInvSeqService = tmInvSeqService;
    }

    /**
     * Setter method for tmCancelInvSeqTypService.
     *
     * @param tmCancelInvSeqTypService Set for tmCancelInvSeqTypService
     */
    public void setTmCancelInvSeqTypService(TmCancelInvSeqTypService tmCancelInvSeqTypService) {
        this.tmCancelInvSeqTypService = tmCancelInvSeqTypService;
    }
    
    // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 START >>>>>
    /**
     * <p>Setter method for tmCigmaEnvService.</p>
     *
     * @param tmCigmaEnvService Set for tmCigmaEnvService
     */
    public void setTmCigmaEnvService(TmCigmaEnvService tmCigmaEnvService) {
        this.tmCigmaEnvService = tmCigmaEnvService;
    }

    /**
     * <p>Setter method for ws6005RestService.</p>
     *
     * @param ws6005RestService Set for ws6005RestService
     */
    public void setWs6005RestService(Ws6005RestService ws6005RestService) {
        this.ws6005RestService = ws6005RestService;
    }

    /**
     * <p>Setter method for ws6006RestService.</p>
     *
     * @param ws6006RestService Set for ws6006RestService
     */
    public void setWs6006RestService(Ws6006RestService ws6006RestService) {
        this.ws6006RestService = ws6006RestService;
    }
    // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 END <<<<<

    /**
     * Setter method for ttShippingDocumentService.
     *
     * @param ttShippingDocumentService Set for ttShippingDocumentService
     */
    public void setTtShippingDocumentService(
        TtShippingDocumentService ttShippingDocumentService) {
        this.ttShippingDocumentService = ttShippingDocumentService;
    }

    /**
     * Setter method for ws6011RestService.
     *
     * @param ws6011RestService Set for ws6011RestService
     */
    public void setWs6011RestService(Ws6011RestService ws6011RestService) {
        this.ws6011RestService = ws6011RestService;
    }

    /**
     * Setter method for ttOnlineReqJobParamService
     *
     * @param ttOnlineReqJobParamService Set for ttOnlineReqJobParamService
     */
    public void setTtOnlineReqJobParamService(
        TtOnlineReqJobParamService ttOnlineReqJobParamService) {
        this.ttOnlineReqJobParamService = ttOnlineReqJobParamService;
    }

    // --- validateConsistency ---------------------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateCorrelationDate(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateCorrelationDate(String fmDate, String toDate, String dateFormat)
        throws ApplicationException {

        if (!CheckUtil.isBlankOrNull(fmDate)
            && !CheckUtil.isBlankOrNull(toDate)) {
            return commonService.validateFromToDate(dateFormat, fmDate, toDate);
        } else {
            return true;
        }
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyFrtShipper(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyFrtShipper(String frtShipperCd, String grpNo2)
        throws ApplicationException {
        // Determine if it is equal to FRT
        // FRTの場合チェックする
        if (!GRP_NO2_MAIN.equals(grpNo2)) {
            if (StringUtils.isEmpty(frtShipperCd)) {
                return false;
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyRemittance(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyRemittance(String remVal, String remLcTyp) 
        throws ApplicationException {
     // Determine if Remittance or L/C  are equal to Remittance.
        // Remittance or L/C が「Remittance」の場合チェックする
        if (REM_LC_TYP_REM.equals(remLcTyp)) {
            if (StringUtils.isEmpty(remVal)) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyRemittance(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyLc(String lcVal, String remLcTyp) 
        throws ApplicationException {
     // Determine if Remittance or L/C  are equal to L/C.
        // Remittance or L/C が「L/C」の場合チェックする
        if (REM_LC_TYP_LC.equals(remLcTyp)) {
            if (StringUtils.isEmpty(lcVal)) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyAmountMaximum(java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateConsistencyAmountMaximum (BigDecimal amount, BigDecimal maxVal)
        throws ApplicationException {
        // Compare with integer part.
        // 整数部の桁数比較
        if (amount.precision() > maxVal.precision()) {
            return false;
        }
        // Compare with decimal part.
        // 小数部の桁数比較
        if (amount.scale() > maxVal.scale()) {
            return false;
        }
        return true;
    }
    
    // --- validateDataBase ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTtInvoiceOnMainUploadFrtInv(java.lang.String, java.lang.String, java.util.Date)
     */
    public String validateDatabaseTtInvoiceOnMainUploadFrtInv(String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {

        // Set search key of invoice.
        // インボイス 検索条件ドメインの設定
        TtInvoiceCriteriaDomain criteria = new TtInvoiceCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        criteria.setDeleteFlg(FLAG_N);

        // Get invoice list.
        // インボイスからデータを取得
        List<? extends TtInvoiceDomain> invoiceList = ttInvoiceService
            .searchByCondition(criteria);

        TtInvoiceDomain invoiceDomain = invoiceList.get(0);

        // Sieve the manual uploaded data.
        // マニュアル アップロード対象チェック
        if (!(FLAG_N.equals(invoiceDomain.getCancelTyp())
            && FLAG_Y.equals(invoiceDomain.getManualFlg())
            && MANUAL_TYP_DNG_INVOICE.equals(invoiceDomain.getManualTyp()) && INVOICE_CLASS_MAIN
            .equals(invoiceDomain.getInvoiceClass()))) {
            return NXS_E1_0037;
        }

        // Sieve the canceled data.
        // キャンセル済みチェック
        if (FLAG_Y.equals(invoiceDomain.getCancelFlg())) {
            return NXS_E7_0062;
        }
        
        // Sieve the shipping act no.
        // 船積実績登録済チェック
        if (StringUtils.isNotEmpty(invoiceDomain.getShippingActNo())) {
            return NXS_E7_0063;
        }

        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTtInvoiceOnMainUploadNonDnGInvOrReInv(String, String, Date, String[])
     */
    public String validateDatabaseTtInvoiceOnMainUploadNonDnGInvOrReInv(String shipperCd, String invoiceNo, Date invoiceIssueDt, String[] manualTyp) 
        throws ApplicationException {

        // Set search key.
        // 検索条件ドメインの設定
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);

        // Get data
        // データの取得
        W6001DocInvoiceDomain result = w6001DocDao
            .searchTtInvoiceByNonDnGInvOrReInv(criteria);

        boolean flg = false;
        if (FLAG_N.equals(result.getCancelTyp())) {
            if (FLAG_Y.equals(result.getManualFlg())) {
                //if (MANUAL_TYP_RE_INVOICE.equals(result.getManualTyp())
                //    || MANUAL_TYP_NON_DNG_INVOICE.equals(result.getManualTyp())) {
                if (MANUAL_TYP_NON_DNG_INVOICE.equals(result.getManualTyp())) {
                    flg = true;
                }
            }
            if (FLAG_N.equals(result.getManualFlg()) && FLAG_N.equals(result.getDnBaseFlg())) {
                flg = true;
            }
            //if (FLAG_N.equals(result.getManualFlg()) && MANUAL_TYP_RE_INVOICE.equals(result.getManualTyp())) {
            //    flg = true;
            //}
        }
        if (!flg) {
            return NXS_E1_0037;
        }

        if (FLAG_Y.equals(result.getCancelFlg())) {
            return NXS_E7_0062;
        }

        if (StringUtils.isNotEmpty(result.getShippingActNo())) {
            return NXS_E7_0063;
        }

        manualTyp[0] = result.getManualTyp();

        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTtInvoiceOnMainCancelInv(com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain)
     */
    public String validateDatabaseTtInvoiceOnMainCancelInv(W6001DocInvoiceDomain invoiceDomain) 
        throws ApplicationException {

        // Set search key.
        // 検索条件の設定
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(docCriteria, invoiceDomain);

        // Get data.
        // データの取得
        List<? extends W6001DocInvoiceDomain> resultList = w6001DocDao.searchTtInvoiceByCancelInv(docCriteria);
        if (resultList == null) {
            return GSCM_E0_0001;
        }
        
        // ST992 複数ステータスチェック
        if(resultList.size() > 1) {
            return NXS_E7_0077;
        }
        
        W6001DocInvoiceDomain result = resultList.get(0);

        // Sieve the manual uploaded data.
        // マニュアルアップロード対象チェック
        //if (!FLAG_N.equals(result.getCancelTyp())) {
        if (!CANCEL_TYP_NORMAL.equals(result.getCancelTyp())) { // ST946 MANUAL SCREEN TRANSITION MOD
            return NXS_E1_0037;
        }

        // Sieve the canceled data.
        // キャンセル済みチェック
        if (FLAG_Y.equals(result.getCancelFlg())) {
            return NXS_E7_0062;
        }

        // Sieve the shipping act no.
        // 船積実績登録済みチェック
        if (StringUtils.isNotEmpty(result.getShippingActNo())) {
            return NXS_E7_0063;
        }

        if (!result.getDocPltzList().isEmpty()) {
            W6001DocPltzDomain pltzDomain = result.getDocPltzList().get(0);
    
            if (FLAG_N.equals(result.getManualFlg())
                || (FLAG_Y.equals(result.getManualFlg()) && MANUAL_TYP_NON_DNG_INVOICE
                    .equals(result.getManualTyp()))) {
    
                boolean checkFlg = false;
    
                // Loading container before customs.
                // バン詰後通関
                if (CUSTOM_TIMING_TYPE_A.equals(result.getCustomTimingTyp())) {
                    if ((PLTZ_STATUS_CUSTOMS_CLEARANCE_A.equals(pltzDomain
                        .getPltzStatus()) && pltzDomain.getCountMainMark() > 0)
                        || (!PLTZ_STATUS_CUSTOMS_CLEARANCE_A.equals(pltzDomain
                            .getPltzStatus()) && pltzDomain.getCountMainMark() == 0)) {
                        checkFlg = true;
                    }
                }
                // Loading container after customs.
                // 通関後バン詰
                if (CUSTOM_TIMING_TYPE_B.equals(result.getCustomTimingTyp())) {
                    if ((PLTZ_STATUS_CUSTOMS_CLEARANCE_B.equals(pltzDomain
                        .getPltzStatus()) && pltzDomain.getCountMainMark() > 0)
                        || (!PLTZ_STATUS_CUSTOMS_CLEARANCE_B.equals(pltzDomain
                            .getPltzStatus()) && pltzDomain.getCountMainMark() == 0)) {
                        checkFlg = true;
                    }
                }
                // Mixed.
                // 混在
                if (CUSTOM_TIMING_TYPE_Z.equals(result.getCustomTimingTyp())) {
                    if ((PLTZ_STATUS_CUSTOMS_CLEARANCE_Z.equals(pltzDomain
                        .getPltzStatus()) && pltzDomain.getCountMainMark() > 0)
                        || (!PLTZ_STATUS_CUSTOMS_CLEARANCE_Z.equals(pltzDomain
                            .getPltzStatus()) && pltzDomain.getCountMainMark() == 0)) {
                        checkFlg = true;
                    }
                }
                if (!checkFlg) {
                    return NXS_E7_0077;
                }
            }
        }
        return null;
    }

    // --- callService -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public List<? extends W6001DocInvoiceDomain> searchForPagingOnMainSearch(W6001DocCriteriaDomain criteria)
        throws ApplicationException {

        if (StringUtils.isNotEmpty(criteria.getStgInstrNo())
            || StringUtils.isNotEmpty(criteria.getStgActNo())
            || StringUtils.isNotEmpty(criteria.getShippingFirmNo())) {
            criteria.setTtPltzEnableFlg(FLAG_Y);
        }

        Integer count = w6001DocDao.searchCountTtInvoice(criteria);

        // Get page data.
        // ページ情報の取得
        PageInfoData pageInfoData = criteria.getPageInfoCreator()
            .createPageInfoData(count, null, null, criteria.getLocale());
        // Set  row numbers as a range of searching.
        // 検索範囲の設定
        criteria.setRowNumFrom(pageInfoData.getFromCount());
        criteria.setRowNumTo(pageInfoData.getToCount());

        // Get target data.
        // 検索データの取得
        return w6001DocDao.searchForPagingTtInvoice(criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchOnMainPrintDocument(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public File searchOnMainPrintDocument(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        // Get documentation data.
        return searchDocumentationData(criteria.getShipperCd(), criteria.getInvoiceNo(), criteria.getInvoiceIssueDt());
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#calculateAmount(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public W6001DocInvoiceDomain calculateAmount (W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        
        BigDecimal ratio = new BigDecimal("0.01");
        BigDecimal netAmount = criteria.getNetAmount();
        BigDecimal handlingCharge = criteria.getHandlingCharge();
        BigDecimal freeAdditional = criteria.getAdditionalCharge();
        BigDecimal vatRatio = criteria.getVatRatio();
        BigDecimal freight = criteria.getFreight();
        BigDecimal insurance = criteria.getInsurance();
        
        // Get VAT before calculate.
        // Vat（有効金額の計算処理前）を算出
        // 2014/11/25 DNJP.Kawamura ST181対応 START >>>>>
//        BigDecimal vatBefore = netAmount.add(handlingCharge.add(freeAdditional)).multiply(vatRatio.multiply(ratio));
        BigDecimal vatBefore = netAmount.add(handlingCharge.add(freeAdditional.add(freight.add(insurance)))).multiply(vatRatio.multiply(ratio));
        // 2014/11/25 DNJP.Kawamura ST181対応 END <<<<<
        
        // Get effective amount of money from currency code and Company code specified.
        // 有効金額の算出
        BigDecimal vatAfter = commonService.searchEffectivePrice(criteria.getShipperCd(), criteria.getCurrCd(), vatBefore);
        
        BigDecimal subTotal = netAmount.add(freight).add(insurance);
        BigDecimal totalAmount = subTotal.add(vatAfter);
        
        W6001DocInvoiceDomain invoiceDomain = new W6001DocInvoiceDomain();
        invoiceDomain.setVat(vatAfter);
        invoiceDomain.setSubTotal(subTotal);
        invoiceDomain.setTotalInvoiceAmount(totalAmount);
        
        return invoiceDomain;
    }
    // ---------------------------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchOnUploadInit(W6001DocCriteriaDomain
     *      criteria)
     */
    public W6001DocInvoiceDomain searchOnUploadInit(W6001DocCriteriaDomain criteria) 
        throws ApplicationException {

        // Get invoice domain.
        W6001DocInvoiceDomain invoiceDomain = new W6001DocInvoiceDomain();
        if (criteria.getInvoiceNo() != null && criteria.getInvoiceNo().length() > 0) {
            invoiceDomain = w6001DocDao.searchTtInvoiceByUploadInit(criteria);
            if (invoiceDomain == null) {
                throw new GscmApplicationException(GSCM_E0_0010);
            }
        }

        // Set invoice data.
        // 親インボイスのキャンセルフラグを取得
        TtInvoiceCriteriaDomain ttInvoiceCriteriaDomain = new TtInvoiceCriteriaDomain();
        // ST946 MANUAL SCREEN TRANSITION MOD START
        //ttInvoiceCriteriaDomain.setInvoiceNo(criteria.getParInvoiceNo());
        //ttInvoiceCriteriaDomain.setSearchCountCheckFlg(false);
        ttInvoiceCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttInvoiceCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttInvoiceCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END
        TtInvoiceDomain ttInvoiceDomain = ttInvoiceService.searchByKey(ttInvoiceCriteriaDomain);
        if (ttInvoiceDomain != null) {
            // Set cancel flag.
            // 親キャンセルフラグのセット
            invoiceDomain.setCancelFlg(ttInvoiceDomain.getCancelFlg());
        }

       
        // Set invoice data.
        // - ログイン者に紐付く国コードの取得
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain.setCompCd(criteria.getCompCd());
        tmNxsCompCriteriaDomain.setSearchCountCheckFlg(false);
        if (0 < tmNxsCompService.searchCount(tmNxsCompCriteriaDomain)) {
            TmNxsCompDomain compDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
            if (compDomain != null) {
                // Set country code.
                // 取得した国コードを戻り値に設定
                invoiceDomain.setCntryCd(compDomain.getCntryCd());
            }
        }
        return invoiceDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyFileExists(int)
     */
    public boolean validateConsistencyFileExists(int fileSize)
        throws ApplicationException {
        if (fileSize == 0) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyFileSize(int)
     */
    public boolean validateConsistencyFileSize(int fileSize)
        throws ApplicationException {

        if (FILE_SIZE_MAX < fileSize) {
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyFileName(String)
     */
    public boolean validateConsistencyFileName(String fileName)
        throws ApplicationException {
        try {
            if (fileName.getBytes("UTF-8").length == fileName.length()) {
                return true;
            }
        } catch (Exception e) {
            throw new SystemException(NXS_91_0001, e);
        }
        return false;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseCarrier(String
     *      compCd)
     */
    public boolean validateDatabaseCarrier(String compCd)
        throws ApplicationException {
        return commonService.validateCarrier(compCd);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseCompCd(String
     *      compCd)
     */
    public boolean validateDatabaseCompCd(String compCd)
        throws ApplicationException {
        return commonService.validateCompCd(compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabasePort(java.lang.String, java.lang.String)
     */
    public boolean validateDatabasePort(String portCd, String cntryCd)
        throws ApplicationException {
        return commonService.validatePort(portCd, cntryCd);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyCancelInvoiceNo(String
     *      invNo, String orgInvNo)
     */
    public boolean validateConsistencyCancelInvoiceNo(String invNo, String orgInvNo) throws ApplicationException {
        return !invNo.equals(orgInvNo);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyReferenceInvNoReferenceInvShipper(String
     *      referenceInvNo, String referenceInvShipper, String invoiceNo, String
     *      shipper)
     */
    public boolean validateConsistencyReferenceInvNoReferenceInvShipper(String referenceInvNo
        , String referenceInvShipper, String invoiceNo, String shipper) 
        throws ApplicationException {
        return !referenceInvNo.concat(referenceInvShipper).equals(invoiceNo.concat(shipper));
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyCompulsory(String
     *      value)
     */
    public boolean validateConsistencyCompulsory(String value)
        throws ApplicationException {
        return !(value == null || value.length() == 0);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyFunctionNoClassOfInv(String
     *      clsOfInv)
     */
    public boolean validateConsistencyFunctionNoClassOfInv(String clsOfInv)
        throws ApplicationException {
        return !INVOICE_CLASS_FULL_RT.equals(clsOfInv);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTtInvoiceOnUploadRegisterByCancel(java.lang.String, java.lang.String, java.util.Date, java.lang.String)
     */
    public boolean validateDatabaseTtInvoiceOnUploadRegisterByCancel(
        String shipperCd, String invoiceNo, Date invoiceIssueDt,
        String functionNo) throws ApplicationException {
        
        // Get main invoice data.
        // Main Invoice情報の検索
        TtInvoiceCriteriaDomain ttInvoiceCriteriaDomain = new TtInvoiceCriteriaDomain();
        ttInvoiceCriteriaDomain.setShipperCd(shipperCd);
        // ST946 MANUAL SCREEN TRANSITION MOD START
        //if (W6002_FUNCTION_NO_2.equals(functionNo)
        //    || W6002_FUNCTION_NO_5.equals(functionNo)) {
        //    ttInvoiceCriteriaDomain.setCancelInvoiceNo(pInvoiceNo);
        //} else if (W6002_FUNCTION_NO_3.equals(functionNo)
        //    || W6002_FUNCTION_NO_4.equals(functionNo)) {
        //    ttInvoiceCriteriaDomain.setCancelInvoiceNo(invoiceNo);
        //}
        ttInvoiceCriteriaDomain.setCancelInvoiceNo(invoiceNo);
        // ST946 MANUAL SCREEN TRANSITION MOD END
        ttInvoiceCriteriaDomain.setCancelInvoiceIssueDt(invoiceIssueDt);
        ttInvoiceCriteriaDomain.setCancelTyp(CANCEL_TYPE_C);
        ttInvoiceCriteriaDomain.setDeleteFlg(FLAG_N);
        List<? extends TtInvoiceDomain> ttIncoiceList = ttInvoiceService
            .searchByCondition(ttInvoiceCriteriaDomain);

        // return false if the invoice numbers greater than one as a cancel data.
        // 取得した件数=1以上の場合、既に他者によってキャンセルされているため、エラーとする。
        return !(ttIncoiceList.size() > 0);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTtInvoiceOnUploadRegisterByDuplication(String
     *      shipperCd, String invoiceNo, Date invoiceIssueDt)
     */
    public boolean validateDatabaseTtInvoiceOnUploadRegisterByDuplication(
        String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {
        TtInvoiceCriteriaDomain ttInvoiceCriteriaDomain = new TtInvoiceCriteriaDomain();
        ttInvoiceCriteriaDomain.setShipperCd(shipperCd);
        ttInvoiceCriteriaDomain.setInvoiceNo(invoiceNo);
        ttInvoiceCriteriaDomain.setInvoiceIssueDt(invoiceIssueDt);
        ttInvoiceCriteriaDomain.setDeleteFlg(FLAG_N);
        List<? extends TtInvoiceDomain> ttInvoiceList = ttInvoiceService
            .searchByCondition(ttInvoiceCriteriaDomain);
        // return false if invoice numbers greater than one as a duplication error.
        // 取得した件数 > 0の場合、重複エラーとする。
        return !(ttInvoiceList.size() > 0);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTtInvoiceOnUploadRegisterByExistence(String
     *      shipperCd, String invoiceNo, Date invoiceIssueDt)
     */
    public boolean validateDatabaseTtInvoiceOnUploadRegisterByExistence(
        String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {
        TtInvoiceCriteriaDomain ttInvoiceCriteriaDomain = new TtInvoiceCriteriaDomain();
        ttInvoiceCriteriaDomain.setShipperCd(shipperCd);
        ttInvoiceCriteriaDomain.setInvoiceNo(invoiceNo);
        ttInvoiceCriteriaDomain.setInvoiceIssueDt(invoiceIssueDt);
        ttInvoiceCriteriaDomain.setDeleteFlg(FLAG_N);
        List<? extends TtInvoiceDomain> ttInvoiceList = ttInvoiceService
            .searchByCondition(ttInvoiceCriteriaDomain);
        // 取得した件数 = 0の場合、紐付けエラーとする。
        return !(ttInvoiceList.size() == 0);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTtInvoiceOnUploadRegisterByStatus(String
     *      shipperCd, String invoiceNo, Date invoiceIssueDt)
     */
    public boolean validateDatabaseTtInvoiceOnUploadRegisterByStatus(String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {

        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        W6001DocInvoiceDomain result = w6001DocDao.searchTtInvoiceByUploadRegister(criteria);

        if (MANUAL_TYP_NON_DNG_INVOICE.equals(result.getManualTyp())) {
            String pltzStatus = "";
            if (CUSTOM_TIMING_TYPE_A.equals(result.getCustomTimingTyp())) {
                pltzStatus = PLTZ_STATUS_90;
            } else if (CUSTOM_TIMING_TYPE_B.equals(result.getCustomTimingTyp())) {
                pltzStatus = PLTZ_STATUS_60;
            } else if (CUSTOM_TIMING_TYPE_Z.equals(result.getCustomTimingTyp())) {
                pltzStatus = PLTZ_STATUS_40;
            }
            
            if (result.getDocPltzList().isEmpty()) {
                return true;
            }
            for (W6001DocPltzDomain pltzDomain : result.getDocPltzList()) {
                if (pltzStatus.equals(pltzDomain.getPltzStatus())) {
                    if (pltzDomain.getCountMainMark() > 0) {
                        return true;
                    }
                } else {
                    if (pltzDomain.getCountMainMark() == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseUniqueFileNameOnUploadRegister(java.lang.String, java.lang.String, java.util.Date, java.lang.String, java.lang.String, java.util.Date, java.lang.String)
     */
    public boolean validateDatabaseUniqueFileNameOnUploadRegister(
        String mainInvoiceShipperCd, String mainInvoiceNo, Date mainInvoiceIssueDt,
        String updateInvoiceShipperCd, String updateInvoiceNo, Date updateInvoiceIssueDt,
        String fileName)
        throws ApplicationException {

        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setTakeOverParInvoiceShipperCd(mainInvoiceShipperCd);
        criteria.setTakeOverParInvoiceNo(mainInvoiceNo);
        criteria.setTakeOverParInvoiceIssueDt(mainInvoiceIssueDt);
        criteria.setShipperCd(updateInvoiceShipperCd);
        criteria.setInvoiceNo(updateInvoiceNo);
        criteria.setInvoiceIssueDt(updateInvoiceIssueDt);
        criteria.setUploadFileName(fileName);
        int count = w6001DocDao.searchUploadedCountByFileName(criteria);

        return count == 0;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyShipperPlantAuth(String
     *      permitFuncId, String compCd, String plntCd)
     */
    public boolean validateConsistencyShipperPlantAuth(String permitFuncId,
        String compCd, String plntCd) throws ApplicationException {
        boolean rightFlg = userAuthService.hasUserAuthForComp(permitFuncId,
            compCd);
        if (!rightFlg) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#transactOnUploadRegister(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public W6001DocCriteriaDomain transactOnUploadRegister(W6001DocCriteriaDomain criteria) 
        throws ApplicationException {
        
        String timezoneId = commonService.searchTimezone(criteria.getShipperCd());
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //Date systemDt = DateUtils.truncate(DateUtil.convertTime(new Date(), timezoneId), Calendar.DAY_OF_MONTH);
        Date systemDt = DateUtils.truncate(DateUtil.convertTime(new Date(), timezoneId), Calendar.SECOND);
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END

        // ST946 MANUAL SCREEN TRANSITION ADD START
        // Duplicate registration check
        // 重複登録チェック
        if (W6002_FUNCTION_NO_2.equals(criteria.getFunctionNo()) 
            || (W6002_FUNCTION_NO_3.equals(criteria.getFunctionNo()) && !criteria.getTakeOverInvoiceNo().equals(criteria.getInvoiceNo()))
            || W6002_FUNCTION_NO_4.equals(criteria.getFunctionNo())
        )
        {
            if (!this.validateDatabaseTtInvoiceOnUploadRegisterByDuplication(criteria.getShipperCd(), criteria.getInvoiceNo(), systemDt)) {
                List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                errorList.add(new MessageDomain("w6002CriteriaDomain.invoiceNo", GSCM_E0_0020, null));
                throw new ValidationException(errorList);
            }
        }
        // ST946 MANUAL SCREEN TRANSITION ADD END
            // Since the issue time can not duplicate check and not decided, it moved from W6002RegisterFacadeServiceImpl.
            // 発行時刻が決まらないと重複チェックできないため、W6002RegisterFacadeServiceImplから移動。

        W6001DocCriteriaDomain result = new W6001DocCriteriaDomain();

        // 2.1 Get shipper data.
        // - Shipper情報の取得
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain21 = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain21.setCompCd(criteria.getShipperCd());
        TmNxsCompDomain tmNxsComp21 = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain21);
        if (tmNxsComp21 == null) {
            tmNxsComp21 = new TmNxsCompDomain();
        }
        
        // 2.2 Get consignee data.
        // - Consignee情報の取得
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain22 = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain22.setCompCd(criteria.getConsigneeCd());
        TmNxsCompDomain tmNxsComp22 = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain22);
        if (tmNxsComp22 == null) {
            tmNxsComp22 = new TmNxsCompDomain();
        }

        // 2.3 Get ship to data.
        // - ShipTo情報の取得

        W6001DocCriteriaDomain shipToCriteria = new W6001DocCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(shipToCriteria, criteria);
        shipToCriteria.setAplyStrtDt(DateUtils.truncate(DateUtil.convertTime(new Date()
            , commonService.searchTimezone(criteria.getShipperCd())), Calendar.DAY_OF_MONTH));
        W6001DocPltzItemDomain pltzItem23 = w6001DocDao.searchTmExpShipToShipping(shipToCriteria);
        if (pltzItem23 == null) {
            pltzItem23 = new W6001DocPltzItemDomain();
        }

        // 2.4 Get invoice category data.
        // - Inv. Category情報の取得
        TmCdCriteriaDomain tmCdCriteriaDomain24 = new TmCdCriteriaDomain();
        tmCdCriteriaDomain24.setCdTyp(CD_TYPE_INV_CTGRY);
        tmCdCriteriaDomain24.setLngCd(criteria.getLanguageCd());
        tmCdCriteriaDomain24.setCd(criteria.getInvoiceCtgry());
        TmCdDomain tmCd24 = tmCdService.searchByKey(tmCdCriteriaDomain24);
        if (tmCd24 == null) {
            tmCd24 = new TmCdDomain();
        }

        // 2.5 Get trans_way data.
        // - Trans_Way情報の取得
        TmCdCriteriaDomain tmCdCriteriaDomain25 = new TmCdCriteriaDomain();
        tmCdCriteriaDomain25.setCdTyp(CD_TYPE_TRANS_CD);
        tmCdCriteriaDomain25.setLngCd(criteria.getLanguageCd());
        tmCdCriteriaDomain25.setCd(criteria.getTrnsCd());
        TmCdDomain tmCd25 = tmCdService.searchByKey(tmCdCriteriaDomain25);
        if (tmCd25 == null) {
            tmCd25 = new TmCdDomain();
        }
        
        // 2.8 Get carrier data.
        // - Carrier情報の取得
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain28 = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain28.setCompCd(criteria.getCarrierCompCd());
        TmNxsCompDomain tmNxsComp28 = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain28);
        if (tmNxsComp28 == null) {
            tmNxsComp28 = new TmNxsCompDomain();
        }

        // 2.9 Get login user data.
        // - ログイン者情報の取得
        TmUserCriteriaDomain tmUserCriteriaDomain29 = new TmUserCriteriaDomain();
        tmUserCriteriaDomain29.setDscId(criteria.getDscId());
        TmUserDomain tmUser29 = tmUserService.searchByKey(tmUserCriteriaDomain29);
        if (tmUser29 == null) {
            tmUser29 = new TmUserDomain();
        }
        
        // 2.10 Get freight res. data.
        // - Freight Res.情報の取得
        TmCdCriteriaDomain tmCdCriteriaDomain210 = new TmCdCriteriaDomain();
        tmCdCriteriaDomain210.setCdTyp(CD_TYPE_FREIGHT_RESPONSIBLE);
        tmCdCriteriaDomain210.setLngCd(criteria.getLanguageCd());
        tmCdCriteriaDomain210.setCd(criteria.getFreightResponsibleCd());
        TmCdDomain tmCd210 = tmCdService.searchByKey(tmCdCriteriaDomain210);
        if (tmCd210 == null) {
            tmCd210 = new TmCdDomain();
        }
        
        // 2.11 Get payment method data.
        // - Payment Method情報の取得
        TmCdCriteriaDomain tmCdCriteriaDomain211 = new TmCdCriteriaDomain();
        tmCdCriteriaDomain211.setCdTyp(CD_TYPE_PAY_METH);
        tmCdCriteriaDomain211.setLngCd(criteria.getLanguageCd());
        tmCdCriteriaDomain211.setCd(criteria.getPayMeth());
        TmCdDomain tmCd211 = tmCdService.searchByKey(tmCdCriteriaDomain211);
        if (tmCd211 == null) {
            tmCd211 = new TmCdDomain();
        }
        
        // 3.1 Get invoice attached data.
        // - Invoice/Invoice Attach(ファイル管理の登録)
        String fileIdUploadInvoice = StringUtils.EMPTY;
        if (StringUtils.isNotEmpty(criteria.getInvoiceFileNm())) {
            fileIdUploadInvoice = createFileUpload(criteria.getInvoiceFileData(), criteria.getInvoiceFileNm(), criteria.getDscId());
        }
        // 3.2 Get packing list attached data.
        // - Packing List/Packing List Attach(ファイル管理の登録)
        String fileIdUploadPacking = StringUtils.EMPTY;
        if (StringUtils.isNotEmpty(criteria.getPackinglistFileNm())) {
            fileIdUploadPacking = createFileUpload(criteria.getPackinglistFileData(), criteria.getPackinglistFileNm(), criteria.getDscId());
        }

        // 4.1 Set Normal Invoice data.
        // FunctionNo=1,2,3,5の場合
        // 金額算出処理
        BigDecimal subTotal1 = BigDecimal.ZERO;
        if (criteria.getNetAmount() != null) {
            subTotal1 = subTotal1.add(criteria.getNetAmount());
        }
        if (criteria.getFreight() != null) {
            subTotal1 = subTotal1.add(criteria.getFreight());
        }
        if (criteria.getInsurance() != null) {
            subTotal1 = subTotal1.add(criteria.getInsurance());
        }
        criteria.setSubTotal(subTotal1);
        BigDecimal totalAmount1 = BigDecimal.ZERO;
        totalAmount1 = totalAmount1.add(subTotal1);
        // 2015/3/31 DNJP.Kawamura UT211対応 START >>>>>
//        if (criteria.getVatAfter() != null) {
//            totalAmount1 = totalAmount1.add(criteria.getVatAfter());
        if (criteria.getVat() != null) {
            totalAmount1 = totalAmount1.add(criteria.getVat());
        // 2015/3/31 DNJP.Kawamura UT211対応 END <<<<<
        }
        if (criteria.getHandlingCharge() != null) {
            totalAmount1 = totalAmount1.add(criteria.getHandlingCharge());
        }
        if (criteria.getAdditionalCharge() != null) {
            totalAmount1 = totalAmount1.add(criteria.getAdditionalCharge());
        }
        
        criteria.setTotalInvoiceAmount(totalAmount1);
        
        if (W6002_FUNCTION_NO_1.equals(criteria.getFunctionNo())
            || W6002_FUNCTION_NO_2.equals(criteria.getFunctionNo())
            || W6002_FUNCTION_NO_3.equals(criteria.getFunctionNo())
            || W6002_FUNCTION_NO_5.equals(criteria.getFunctionNo())) {

            if (W6002_FUNCTION_NO_5.equals(criteria.getFunctionNo())) {
                // 4.1.1.2
                // ST948 MOD START
                //int updateCount = updateTtInvoice2_411(criteria, tmCd24.getValue(), tmCd210.getValue(), tmCd210.getValue(), tmUser29.getUsrNmEn());
                int updateCount = updateTtInvoice2_411(criteria, tmCd24.getValue(), tmCd210.getValue(), tmCd211.getValue(), tmUser29.getUsrNmEn());
                result.setUpdateCount(updateCount);
                // ST948 MOD END
                
                // 4.1.1.4
                // ST948 MOD START
                //updateTtInvoiceHeader2_411(criteria, tmCd24.getValue(), tmCd210.getValue(), tmCd210.getValue(), fileIdUploadInvoice);
                updateTtInvoiceHeader2_411(criteria, tmCd24.getValue(), tmCd210.getValue(), tmCd211.getValue(), fileIdUploadInvoice);
                // ST948 MOD END
            }

            //if ((W6002_FUNCTION_NO_3.equals(criteria.getFunctionNo()))
            //    && !(criteria.getTakeOverInvoiceNo().equals(criteria.getInvoiceNo()))) {

            //    deletePdfFile2_412(criteria);
            //    // 4.1.2.3
            //    int updateCount = updateTtInvoice2_4123(criteria);
            //    result.setUpdateCount(updateCount);
                
                // 4.1.2.4
            //    updateTtInvoiceHeader2_4124(criteria, fileIdUploadInvoice);

            //    // 4.1.2.5
            //    updateTtInvoiceAttached2_4125(criteria);
                
                // 4.1.2.6
            //    updateTtPackingHead2_4126(criteria, fileIdUploadPacking);

                // 4.1.2.7
            //    updateTtPackingAttachedCml2_4127(criteria);

                // 4.1.2.8
            //    updateTtPackAtchItemNo2_4128(criteria);

                // 4.1.2.9
            //    if (INVOICE_CLASS_MAIN.equals(criteria.getClassOfInv())) {
            //        updateTtInvoice2_4129(criteria);
            //    }
                // 4.1.2.10
            //    updateTtPltz2_4120(criteria);
            //}
            
            if (W6002_FUNCTION_NO_3.equals(criteria.getFunctionNo())) {
                // 4.1.3.2 Set non DN-G Invoice data.
                // Non DN-G Invoiceの登録
                int updateCount = updateTtInvoice2_4132(criteria, tmUser29.getUsrNmEn());
                result.setUpdateCount(updateCount);
                
                // 4.1.3.4
                updateTtInvoiceHeader2_4134(criteria, fileIdUploadInvoice);

                // 4.1.3.6
                updateTtPackingHead2_4136(criteria, fileIdUploadPacking);
            }
            // 4.1.4 Set  manual Invoice data.
            // 4.1.4 Manual Invoiceの登録
            if (W6002_FUNCTION_NO_1.equals(criteria.getFunctionNo())
                || W6002_FUNCTION_NO_2.equals(criteria.getFunctionNo())) {

                String portNm_From = searchTmPortGetPortName(criteria.getLoadingPortCd());
                
                String portNm_To = searchTmPortGetPortName(criteria.getDischargePortCd());

                // 4.1.4.2
                int createCount = createTtInvoice2_4142(criteria, systemDt, tmNxsComp21, tmNxsComp22, pltzItem23
                    , tmCd24.getValue(), tmCd25.getValue(), tmNxsComp28.getCompNmAbb(), tmCd210.getValue(), tmCd211.getValue()
                    , tmUser29.getUsrNmEn(), portNm_From, portNm_To);
                result.setCreateCount(createCount);
                
                // 4.1.4.3
                createTtInvoiceHeader2_4143(criteria, systemDt, tmNxsComp21, tmNxsComp22, pltzItem23, tmCd24.getValue()
                    , tmCd25.getValue(), tmNxsComp28.getCompNmAbb(), tmCd210.getValue(), tmCd211.getValue(), tmUser29.getUsrNmEn()
                    , portNm_From, portNm_To, fileIdUploadInvoice );

                // 4.1.4.4
                createTtPackingHead2_4144(criteria, systemDt, tmNxsComp21, tmNxsComp22, pltzItem23, tmCd24.getValue()
                    , tmCd25.getValue(), tmNxsComp28.getCompNmAbb(), tmCd210.getValue(), tmCd211.getValue()
                    , tmUser29.getUsrNmEn(), portNm_From, portNm_To, fileIdUploadPacking);
            }

        } else if (W6002_FUNCTION_NO_4.equals(criteria.getFunctionNo())) {
            
            // 4.2.1
            int createCount = createTtInvoice2_421(systemDt, criteria);
            result.setCreateCount(createCount);
            
            // 4.2.2
            createTtInvoiceHeader2_422(systemDt, criteria, fileIdUploadInvoice);

            // 4.2.3
            createTtInvoiceAttached2_423(systemDt, criteria);
            
            // 4.2.4
            createTtPackingHead2_424(systemDt, criteria, fileIdUploadPacking);
            
            // 4.2.5
            createTtPackingAttachedCml2_425(systemDt, criteria, fileIdUploadInvoice);
            
            // 4.2.6
            createTtPackAtchItemNo2_426(systemDt, criteria, fileIdUploadInvoice);

            // 4.2.7
            updateTtInvoice2_427(criteria);
            // Sieve the non DN-G invoice and main invoice data.
            // Non DN-G Invoice かつ メインインボイスの場合
            // ST946 MANUAL SCREEN TRANSITION MOD START
            //if (MANUAL_TYP_NON_DNG_INVOICE.equals(criteria.getTypeOfInv()) 
            //    && INVOICE_CLASS_MAIN.equals(criteria.getClassOfInv())) {
            // The consideration of the auto-generated invoice of non-DN group. because MANUAL_TYP is NULL.
            // 非DN拠点の自動生成インボイスを考慮。MANUAL_TYPがNULLのため。
            if ((MANUAL_TYP_NON_DNG_INVOICE.equals(criteria.getTypeOfInv()) || criteria.getTypeOfInv() == null)
                && INVOICE_CLASS_MAIN.equals(criteria.getClassOfInv())) {
            // ST946 MANUAL SCREEN TRANSITION MOD END
            
                // 4.2.7
                updateTtPltz2_427(criteria);
            }
        }

        // AI-JB キュー登録
        String requestId = commonService.createRequestJob(SCREEN_ID_W6002);
        List<TtOnlineReqJobParamDomain> reqJobList
            = new ArrayList<TtOnlineReqJobParamDomain>();
        TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
            = new TtOnlineReqJobParamDomain();
        // 1件目
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
        ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
        ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_INVOICE);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W6002);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        // 2件目
        ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(2));
        ttOnlineReqJobParamcriteria.setParamNm(KEY);
        ttOnlineReqJobParamcriteria.setParamValue01(criteria.getShipperCd());
        ttOnlineReqJobParamcriteria.setParamValue02(criteria.getInvoiceNo());
        String formatDate;
        if(W6002_FUNCTION_NO_3.equals(criteria.getFunctionNo())) {
            formatDate = new SimpleDateFormat("yyyyMMddHHmmss").format(criteria.getTakeOverInvoiceIssueDt());
        } else {
            formatDate = new SimpleDateFormat("yyyyMMddHHmmss").format(systemDt);
        }
        ttOnlineReqJobParamcriteria.setParamValue03(formatDate);
        ttOnlineReqJobParamcriteria.setParamValue04(FLAG_N);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W6002);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        ttOnlineReqJobParamService.create(reqJobList);
        
        if (W6002_FUNCTION_NO_1.equals(criteria.getFunctionNo())
            || W6002_FUNCTION_NO_5.equals(criteria.getFunctionNo())) {
            return result;
        }
        if (W6002_FUNCTION_NO_2.equals(criteria.getFunctionNo())) {
            result.setFunctionNo(criteria.getFunctionNo());
            //result.setParInvoiceNo(criteria.getTakeOverParInvoiceNo()); // ST946 MANUAL SCREEN TRANSITION DEL
            result.setShipperCd(criteria.getTakeOverShipperCd()); // ST946 MANUAL SCREEN TRANSITION ADD
            result.setInvoiceNo(criteria.getTakeOverInvoiceNo());
            result.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt()); // ST946 MANUAL SCREEN TRANSITION ADD
            return result;
        }

        // 5.3.2
        if (W6002_FUNCTION_NO_3.equals(criteria.getFunctionNo())
            || W6002_FUNCTION_NO_4.equals(criteria.getFunctionNo())) {
            if (FLAG_N.equals(criteria.getTakeOverFrtContainFlg())) {
                return result;
            }

            // ST946 MANUAL SCREEN TRANSITION MOD START
//            TtInvoiceCriteriaDomain ttInvoiceCriteriaDomain = new TtInvoiceCriteriaDomain();
//            ttInvoiceCriteriaDomain.setShipperCd(criteria.getShipperCd());
//            ttInvoiceCriteriaDomain.setParInvoiceNo(criteria.getTakeOverParInvoiceNo());
//            ttInvoiceCriteriaDomain.setInvoiceClass(INVOICE_CLASS_FULL_RT);
//            ttInvoiceCriteriaDomain.setDeleteFlg(FLAG_N);
//            ttInvoiceCriteriaDomain.setPreferredOrder("INVOICE_NO");
//            List<? extends TtInvoiceDomain> ttInvoiceList = ttInvoiceService.searchByCondition(ttInvoiceCriteriaDomain);
//            if (ttInvoiceList.size() == 0) {
//                return result;
//            }
//
//            result.setFunctionNo(criteria.getFunctionNo());
//            if (W6002_FUNCTION_NO_4.equals(criteria.getFunctionNo())) {
//                result.setParInvoiceNo(criteria.getTakeOverParInvoiceNo());
//            } else if (W6002_FUNCTION_NO_3.equals(criteria.getFunctionNo())) {
//                result.setParInvoiceNo(criteria.getParInvoiceNo());
//            }
//            result.setInvoiceNo(ttInvoiceList.get(0).getInvoiceNo());
//            return result;


            // Get an invoice of the keys will be displayed next.
            // 次に表示するインボイスのキーを取得。

            W6001DocCriteriaDomain nextInvoiceCriteriaDomain = new W6001DocCriteriaDomain();
            // If the invoice No. of main invoice is changed.
            // There is a need to PAR_INVOICE_NO = invoice No. after the change.
            // メインインボイスのインボイスNo.が変更された場合
            // PAR_INVOICE_NO = 変更後のインボイスNo.とする必要がある。
            //if (
            //    W6002_FUNCTION_NO_3.equals(criteria.getFunctionNo())
            //        && INVOICE_CLASS_MAIN.equals(criteria.getClassOfInv())
            //        && !criteria.getInvoiceNo().equals(criteria.getTakeOverInvoiceNo())
            //)
            //{
                // main invoice
            //    nextInvoiceCriteriaDomain.setTakeOverParInvoiceShipperCd(criteria.getTakeOverParInvoiceShipperCd());
            //    nextInvoiceCriteriaDomain.setTakeOverParInvoiceNo(criteria.getInvoiceNo());
            //    nextInvoiceCriteriaDomain.setTakeOverParInvoiceIssueDt(criteria.getTakeOverParInvoiceIssueDt());
                // current invoice
            //    nextInvoiceCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
            //    nextInvoiceCriteriaDomain.setInvoiceNo(criteria.getInvoiceNo());
            //    nextInvoiceCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());

                // For update the mainInvoiceNo of screen information stack at W6002Init.
                // W6002Initで画面情報スタックのmainInvoiceNoを更新するため。
            //    result.setParInvoiceNo(criteria.getInvoiceNo());

            // If the invoice No. of main invoice is not changed.
            // メインインボイスのインボイスNo.が変更されていない場合
            //} else {
            // main invoice
            nextInvoiceCriteriaDomain.setTakeOverParInvoiceShipperCd(criteria.getTakeOverParInvoiceShipperCd());
            nextInvoiceCriteriaDomain.setTakeOverParInvoiceNo(criteria.getTakeOverParInvoiceNo());
            nextInvoiceCriteriaDomain.setTakeOverParInvoiceIssueDt(criteria.getTakeOverParInvoiceIssueDt());
            // current invoice
            nextInvoiceCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
            nextInvoiceCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
            nextInvoiceCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
            //}
            W6001DocInvoiceDomain nextInvoiceResultDomain
                = w6001DocDao.searchNextInvoiceBySameParent(nextInvoiceCriteriaDomain);
            if (nextInvoiceResultDomain == null) {
                return result;
            }

            result.setFunctionNo(criteria.getFunctionNo());
            result.setShipperCd(nextInvoiceResultDomain.getShipperCd());
            result.setInvoiceNo(nextInvoiceResultDomain.getInvoiceNo());
            result.setInvoiceIssueDt(nextInvoiceResultDomain.getInvoiceIssueDt());

            return result;

            // ST946 MANUAL SCREEN TRANSITION MOD END
        }
        return result;
    }
    
// ST946 MANUAL SCREEN TRANSITION DEL START
//    /**
//     * {@inheritDoc}
//     * 
//     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchOnUpdateSkip(W6001DocCriteriaDomain
//     *      criteria)
//     */
//    public List<? extends TtInvoiceDomain> searchOnUpdateSkip(
//        W6001DocCriteriaDomain criteria) throws ApplicationException {
//        // Get invoice data.
//        // - インボイスデータの取得
//        // {@link TtInvoiceCriteriaDomain}に項目を設定し、{@link
//        // TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼出し、検索データを取得する
//        TtInvoiceCriteriaDomain ttInvoiceCriteriaDomain = new TtInvoiceCriteriaDomain();
//        ttInvoiceCriteriaDomain.setShipperCd(criteria.getShipperCd());
//        ttInvoiceCriteriaDomain.setParInvoiceNo(criteria.getParInvoiceNo());
//        ttInvoiceCriteriaDomain.setInvoiceClass(INVOICE_CLASS_FULL_RT);
//        ttInvoiceCriteriaDomain.setDeleteFlg(FLAG_N);
//        ttInvoiceCriteriaDomain.setPreferredOrder("INVOICE_NO");
//        return ttInvoiceService.searchByCondition(ttInvoiceCriteriaDomain);
//    }
// ST946 MANUAL SCREEN TRANSITION DEL END

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchNextInvoiceBySameParent(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public W6001DocInvoiceDomain searchNextInvoiceBySameParent(W6001DocCriteriaDomain criteria)
        throws ApplicationException {

        return w6001DocDao.searchNextInvoiceBySameParent(criteria);
    }

    // ==========================================================================
    // W6003
    // ==========================================================================

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#deleteOnHeaderInit(W6001DocCriteriaDomain
     *      criteria)
     */
    public void deleteOnHeaderInit(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        // Delete palletize work data.
        // - インボイス作成対象パレタイズワークの削除
        // {@link TwInvPltzCriteriaDomain}に項目を設定し、{@link
        // TwInvPltzService#deleteByCondition(TwInvPltzCriteriaDomain)}を呼出す
        TwInvPltzCriteriaDomain twInvPltzCriteriaDomain = new TwInvPltzCriteriaDomain();
        twInvPltzCriteriaDomain.setDscId(criteria.getDscId());
        twInvPltzCriteriaDomain.setSearchCountCheckFlg(false);
        //     {@link TwInvPltzCriteriaDomain}縺ｫ鬆・岼繧定ｨｭ螳壹＠縲＋@link TwInvPltzService#deleteByCondition(TwInvPltzCriteriaDomain)}繧貞他蜃ｺ縺・
        if (0 < twInvPltzService.searchCount(twInvPltzCriteriaDomain)) {
            twInvPltzService.deleteByCondition(twInvPltzCriteriaDomain);
        }
        // Delete item work data.
        // - インボイス作成対象品番ワークの削除
        // {@link TwInvItemCriteriaDomain}に項目を設定し、{@link
        // TwInvItemService#deleteByCondition(TwInvItemCriteriaDomain)}を呼出す
        TwInvItemCriteriaDomain twInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
        twInvItemCriteriaDomain.setDscId(criteria.getDscId());
        twInvItemCriteriaDomain.setSearchCountCheckFlg(false);
        //     {@link TwInvItemCriteriaDomain}縺ｫ鬆・岼繧定ｨｭ螳壹＠縲＋@link TwInvItemService#deleteByCondition(TwInvItemCriteriaDomain)}繧貞他蜃ｺ縺・
        if (0 < twInvItemService.searchCount(twInvItemCriteriaDomain)) {
            twInvItemService.deleteByCondition(twInvItemCriteriaDomain);
        }
        // Delete invoice group work data.
        // - インボイスグループワークの削除
        // {@link TwInvCriteriaDomain}に項目を設定し、{@link
        // TwInvService#deleteByCondition(TwInvCriteriaDomain)}を呼出す
        TwInvCriteriaDomain twInvCriteriaDomain = new TwInvCriteriaDomain();
        twInvCriteriaDomain.setDscId(criteria.getDscId());
        twInvCriteriaDomain.setSearchCountCheckFlg(false);
        //     {@link TwInvCriteriaDomain}縺ｫ鬆・岼繧定ｨｭ螳壹＠縲＋@link TwInvService#deleteByCondition(TwInvCriteriaDomain)}繧貞他蜃ｺ縺・
        if (0 < twInvService.searchCount(twInvCriteriaDomain)) {
            twInvService.deleteByCondition(twInvCriteriaDomain);
        }
        // Delete invoice work data.
        // - インボイスワークの削除
        // {@link TwInvoiceCriteriaDomain}に項目を設定し、{@link
        // TwInvoiceService#deleteByCondition(TwInvoiceCriteriaDomain)}を呼出す
        TwInvoiceCriteriaDomain twInvoiceCriteriaDomain = new TwInvoiceCriteriaDomain();
        twInvoiceCriteriaDomain.setDscId(criteria.getDscId());
        twInvoiceCriteriaDomain.setSearchCountCheckFlg(false);
        //     {@link TwInvoiceCriteriaDomain}縺ｫ鬆・岼繧定ｨｭ螳壹＠縲＋@link TwInvoiceService#deleteByCondition(TwInvoiceCriteriaDomain)}繧貞他蜃ｺ縺・
        if (0 < twInvoiceService.searchCount(twInvoiceCriteriaDomain)) {
            twInvoiceService.deleteByCondition(twInvoiceCriteriaDomain);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseCompWh(String
     *      compCd, String whCd)
     */
    public boolean validateDatabaseCompWh(String compCd, String whCd)
        throws ApplicationException {
        return commonService.validateCompWh(compCd, whCd);
    }

    // ==========================================================================
    // W6004
    // ==========================================================================

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#deleteOnCreateInit(W6001DocCriteriaDomain
     *      criteria)
     */
    public void deleteOnCreateInit(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        TwInvPltzCriteriaDomain twInvPltzCriteriaDomain = new TwInvPltzCriteriaDomain();
        TwInvItemCriteriaDomain twInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
        TwInvCriteriaDomain twInvCriteriaDomain = new TwInvCriteriaDomain();
        TwInvoiceCriteriaDomain twInvoiceCriteriaDomain = new TwInvoiceCriteriaDomain();

        // Set target invoice key data.
        // 条件の設定
        twInvPltzCriteriaDomain.setDscId(criteria.getDscId());
        twInvItemCriteriaDomain.setDscId(criteria.getDscId());
        twInvCriteriaDomain.setDscId(criteria.getDscId());
        twInvoiceCriteriaDomain.setDscId(criteria.getDscId());
        twInvPltzCriteriaDomain.setSearchCountCheckFlg(false);
        twInvItemCriteriaDomain.setSearchCountCheckFlg(false);
        twInvCriteriaDomain.setSearchCountCheckFlg(false);
        twInvoiceCriteriaDomain.setSearchCountCheckFlg(false);

        // Delete palletize work data.
        // - インボイス作成対象パレタイズワークの削除
        // {@link TwInvPltzCriteriaDomain}に項目を設定し、{@link
        // TwInvPltzService#deleteByCondition(TwInvPltzCriteriaDomain)}を呼出す
        if (0 < twInvPltzService.searchCount(twInvPltzCriteriaDomain)) {
            twInvPltzService.deleteByCondition(twInvPltzCriteriaDomain);
        }
        // Delete item work data.
        // - インボイス作成対象品番ワークの削除
        // {@link TwInvItemCriteriaDomain}に項目を設定し、{@link
        // TwInvItemService#deleteByCondition(TwInvItemCriteriaDomain)}を呼出す
        if (0 < twInvItemService.searchCount(twInvItemCriteriaDomain)) {
            twInvItemService.deleteByCondition(twInvItemCriteriaDomain);
        }
        // Delete invoice work group data.
        // - インボイスグループワークの削除
        // {@link TwInvCriteriaDomain}に項目を設定し、{@link
        // TwInvService#deleteByCondition(TwInvCriteriaDomain)}を呼出す
        if (0 < twInvService.searchCount(twInvCriteriaDomain)) {
            twInvService.deleteByCondition(twInvCriteriaDomain);
        }
        // Delete invoice work data.
        // - インボイスワークの削除
        // {@link TwInvoiceCriteriaDomain}に項目を設定し、{@link
        // TwInvoiceService#deleteByCondition(TwInvoiceCriteriaDomain)}を呼出す
        if (0 < twInvoiceService.searchCount(twInvoiceCriteriaDomain)) {
            twInvoiceService.deleteByCondition(twInvoiceCriteriaDomain);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchForPagingOnCreateSearch(W6001DocCriteriaDomain
     *      criteria)
     */
    public List<? extends W6001DocPltzDomain> searchForPagingOnCreateSearch(
        W6001DocCriteriaDomain criteria) throws ApplicationException {
        W6001DocCriteriaDomain newCriteria = new W6001DocCriteriaDomain();

        int count = 0;
        List<? extends W6001DocPltzDomain> resultList = new ArrayList<W6001DocPltzDomain>();

        newCriteria = criteria;
        // Get user authorization data.
        // - 権限情報の取得
        // {@link UserAuthDomain}に項目を設定し、{@link
        // UserAuthService#getUserAuthCompList(UserAuthDomain)}を呼出し、検索データを取得する
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            newCriteria.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W6001R };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            newCriteria.setUserAuthList(userAuthList);
        }
        
        newCriteria.setDscId(criteria.getLoginUserDscId());
        
        String timezoneId = commonService.searchTimezone(criteria.getOwnerCompCd());
        newCriteria.setWorkedDt(DateUtils.truncate(DateUtil.convertTime(new Date(), timezoneId), Calendar.DAY_OF_MONTH));
        
        if (CUSTOM_TIMING_TYPE_A.equals(criteria.getCustomTimingTyp())) {
            // Get data when container loading before customs.
            // タイプ="A"、「バン詰め後通関」の場合
            // - 検索データ件数の取得
            // criteriaDomainを引数にして、{@link
            // W6001DocDao#searchCountTtPltzByTypA(W6001DocCriteriaDomain)}を呼出し、

            count = w6001DocDao.searchCountTtPltzByTypA(newCriteria);

            PageInfoData pageInfoData = criteria.getPageInfoCreator()
                .createPageInfoData(count, null, null, criteria.getLocale());

            newCriteria.setRowNumFrom(pageInfoData.getFromCount());
            newCriteria.setRowNumTo(pageInfoData.getToCount());
            // Get the search data corresponding to the search criteria. (If type = "A", the "container loading after customs clearance")
            // - 検索データの取得
            // criteriaDomainを引数にして、{@link
            // W6001DocDao#searchForPagingTtPltzByTypA(W6001DocCriteriaDomain)}を呼出し、
            // 検索データを取得する
            resultList = w6001DocDao.searchForPagingTtPltzByTypA(newCriteria);
        } else if (CUSTOM_TIMING_TYPE_B.equals(criteria.getCustomTimingTyp())) {
            // Get data when container loading after customs.
            // タイプ="B"、「通関後バン詰め」の場合
            // - 検索データ件数の取得
            // criteriaDomainを引数にして、{@link
            // W6001DocDao#searchCountTtPltzByTypB(W6001DocCriteriaDomain)}を呼出し、

            count = w6001DocDao.searchCountTtPltzByTypB(newCriteria);

            PageInfoData pageInfoData = criteria.getPageInfoCreator()
                .createPageInfoData(count, null, null, criteria.getLocale());

            newCriteria.setRowNumFrom(pageInfoData.getFromCount());
            newCriteria.setRowNumTo(pageInfoData.getToCount());
            // Get the search data corresponding to the search criteria. (If type = "B", and "after customs clearance container loading")
            // - 検索データの取得
            // criteriaDomainを引数にして、{@link
            // W6001DocDao#searchForPagingTtPltzByTypB(W6001DocCriteriaDomain)}を呼出し、
            // 検索データを取得する
            resultList = w6001DocDao.searchForPagingTtPltzByTypB(newCriteria);
        } else if (CUSTOM_TIMING_TYPE_Z.equals(criteria.getCustomTimingTyp())) {
            // Get data when type is Z.
            // タイプ="Z"の場合
            // - 検索データ件数の取得
            // criteriaDomainを引数にして、{@link
            // W6001DocDao#searchCountTtPltzByTypZ(W6001DocCriteriaDomain)}を呼出し、

            count = w6001DocDao.searchCountTtPltzByTypZ(newCriteria);

            PageInfoData pageInfoData = criteria.getPageInfoCreator()
                .createPageInfoData(count, null, null, criteria.getLocale());

            newCriteria.setRowNumFrom(pageInfoData.getFromCount());
            newCriteria.setRowNumTo(pageInfoData.getToCount());
            // Get the search data corresponding to the search criteria. (In the case of type = "Z")
            // - 検索データの取得
            // criteriaDomainを引数にして、{@link
            // W6001DocDao#searchForPagingTtPltzByTypZ(W6001DocCriteriaDomain)}を呼出し、
            // 検索データを取得する
            resultList = w6001DocDao.searchForPagingTtPltzByTypZ(newCriteria);
        }
        return resultList;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#createOnCreateUpdate(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public int createOnCreateUpdate(W6001DocCriteriaDomain criteria)
        throws ApplicationException {

        List<W6001DocPltzDomain> pltzList = w6001DocDao.searchTtPltzByCreate(criteria);

        if (null == pltzList || pltzList.size() == 0) {
            return 0;
        }
        
        for (int i = 0; i < pltzList.size(); i++) {
            W6001DocPltzDomain pltzDomain = pltzList.get(i);
            TwInvPltzDomain newDomein = new TwInvPltzDomain();
            
            newDomein.setDscId(criteria.getDscId());
            newDomein.setMainMark(pltzDomain.getMainMark());
            newDomein.setShipperCd(pltzDomain.getShipperCd());
            newDomein.setShipperCompNmAbb(pltzDomain.getShipperCompNmAbb());
            newDomein.setShipperCompNm1(pltzDomain.getShipperCompNm1());
            newDomein.setShipperCompNm2(pltzDomain.getShipperCompNm2());
            newDomein.setShipperCompAddr1(pltzDomain.getShipperCompAddr1());
            newDomein.setShipperCompAddr2(pltzDomain.getShipperCompAddr2());
            newDomein.setShipperCompAddr3(pltzDomain.getShipperCompAddr3());
            newDomein.setShipperCompAddr4(pltzDomain.getShipperCompAddr4());
            newDomein.setShipperCompTel(pltzDomain.getShipperCompTel());
            newDomein.setShipperCompFax(pltzDomain.getShipperCompFax());
            newDomein.setShipperTaxIdNo(NULL_STR);
            newDomein.setConsigneeCd(pltzDomain.getConsigneeCd());
            newDomein.setConsigneeCompNm1(pltzDomain.getConsigneeCompNm1());
            newDomein.setConsigneeCompNm2(pltzDomain.getConsigneeCompNm2());
            newDomein.setConsigneeCompAddr1(pltzDomain.getConsigneeCompAddr1());
            newDomein.setConsigneeCompAddr2(pltzDomain.getConsigneeCompAddr2());
            newDomein.setConsigneeCompAddr3(pltzDomain.getConsigneeCompAddr3());
            newDomein.setConsigneeCompAddr4(pltzDomain.getConsigneeCompAddr4());
            newDomein.setConsigneeCompTel(pltzDomain.getConsigneeCompTel());
            newDomein.setConsigneeCompFax(pltzDomain.getConsigneeCompFax());
            newDomein.setConsigneeTaxIdNo(NULL_STR);
            newDomein.setConsigneeAttn(pltzDomain.getConsigneeAttn());
            newDomein.setShipToCd(pltzDomain.getShipToCd());
            newDomein.setShipToNm1(pltzDomain.getShipToNm1());
            newDomein.setShipToNm2(pltzDomain.getShipToNm2());
            newDomein.setShipToAddr1(pltzDomain.getShipToAddr1());
            newDomein.setShipToAddr2(pltzDomain.getShipToAddr2());
            newDomein.setShipToAddr3(pltzDomain.getShipToAddr3());
            newDomein.setShipToAddr4(pltzDomain.getShipToAddr4());
            newDomein.setShipToTel(pltzDomain.getShipToTel());
            newDomein.setShipToCompCd(pltzDomain.getCompCd());
            newDomein.setCustomerCd(pltzDomain.getCustomerCd());
            newDomein.setLgcyShipTo(pltzDomain.getLgcyShipTo());
            newDomein.setPriceTerms(pltzDomain.getPriceTerms());
            newDomein.setTradeTerms(pltzDomain.getTradeTerms());
            newDomein.setTermsPoint(pltzDomain.getTermsPoint());
            newDomein.setDlivPoint(NULL_STR);
            newDomein.setFreightResponsibleCd(pltzDomain.getFreightResponsibleCd());
            newDomein.setPayTerms(pltzDomain.getPayTerms());
            newDomein.setPayMeth(pltzDomain.getPayMeth());
            newDomein.setRemBankNm(NULL_STR);
            newDomein.setRemBankAddr1(NULL_STR);
            newDomein.setRemBankAddr2(NULL_STR);
            newDomein.setRemBankAddr3(NULL_STR);
            newDomein.setRemBankAccountNo(NULL_STR);
            newDomein.setVatRatio(null);
            newDomein.setCurrCd(pltzDomain.getCurrCd());
            newDomein.setTrnsCd(pltzDomain.getTrnsCd());
            newDomein.setTrnsCdOrg(pltzDomain.getTrnsCdOrg());
            newDomein.setInvoiceKey(pltzDomain.getInvoiceKey());
            newDomein.setInvoiceCtgry(pltzDomain.getInvoiceCtgry());
            newDomein.setContainerSortingKey(pltzDomain.getContainerSortingKey());
            newDomein.setContainerLooseTyp(pltzDomain.getContainerLooseTyp());
            // 2015/3/31 DNJP.Kawamura UT206対応 START >>>>>
            newDomein.setReturnStyleCd(pltzDomain.getReturnStyleCd());
            // 2015/3/31 DNJP.Kawamura UT206対応 END <<<<<
            newDomein.setCustomTimingTyp(pltzDomain.getCustomTimingTyp());
            newDomein.setCmlTyp(pltzDomain.getCmlTyp());
            newDomein.setDngrItemFlg(pltzDomain.getDngrItemFlg());
            newDomein.setExpLimitFlg(pltzDomain.getExpLimitFlg());
            newDomein.setReExpGoodsFlg(pltzDomain.getReExpGoodsFlg());
            newDomein.setRtUseFlg(pltzDomain.getRtUseFlg());
            newDomein.setWeightUnit(pltzDomain.getWeightUnit());
            newDomein.setNetWeight(pltzDomain.getNetWeight());
            newDomein.setGrossWeight(pltzDomain.getGrossWeight());
            newDomein.setVolumeUnit(pltzDomain.getVolumeUnit());
            newDomein.setVolume(pltzDomain.getVolume());
            newDomein.setCurWhCompCd(pltzDomain.getCurWhCompCd());
            newDomein.setCurWhCd(pltzDomain.getCurWhCd());
            newDomein.setStgInstrNo(pltzDomain.getStgInstrNo());
            newDomein.setStgActNo(pltzDomain.getStgActNo());
            newDomein.setShippingFirmNo(pltzDomain.getShippingFirmNo());
            newDomein.setSupplierInvoiceNo(pltzDomain.getSupplierInvoiceNo());
            newDomein.setImpInvoiceNo1(pltzDomain.getImpInvoiceNo1());
            newDomein.setImpInvoiceNo2(pltzDomain.getImpInvoiceNo2());
            newDomein.setPltzStatus(pltzDomain.getPltzStatus());
            newDomein.setSplitShippingNgFlg(pltzDomain.getSplitShippingNgFlg());
            newDomein.setMigrationFlg(pltzDomain.getMigrationFlg());
            newDomein.setContainerNo(pltzDomain.getContainerNo());
            newDomein.setCarrierCompCd(NULL_STR);
            newDomein.setCarrierCompNmAbb(NULL_STR);
            newDomein.setForwarderCompCd(NULL_STR);
            newDomein.setLoadingPortCd(NULL_STR);
            newDomein.setLoadingPortNm(NULL_STR);
            newDomein.setDischargePortCd(NULL_STR);
            newDomein.setDischargePortNm(NULL_STR);
            newDomein.setVessel(NULL_STR);
            newDomein.setEtd(null);
            newDomein.setEta(null);
            newDomein.setArrivalTime(NULL_STR);
            newDomein.setGrpNo1(NULL_STR);
            newDomein.setRemoveFlg(FLAG_N);
            newDomein.setDecisionFlg(FLAG_N);
            newDomein.setComUpdateFuncId(criteria.getScreenId());
            newDomein.setComUpdateUserId(criteria.getDscId());
            newDomein.setComCreateFuncId(criteria.getScreenId());
            newDomein.setComCreateUserId(criteria.getDscId());
            
            try {
                twInvPltzService.create(newDomein);
            } catch (IntegrationLayerException e) {
                if (ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX == e.getSqlErrorCode()) {
                    throw new GscmApplicationException(GSCM_E0_0020);
                }
                throw e;
            }
        }
        return pltzList.size();
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTwInvPltzOnCreateUpdateByCk(String
     *      dscId)
     */
    public boolean validateDatabaseTwInvPltzOnCreateUpdateByCk(String dscId)
        throws ApplicationException {
        TwInvPltzCriteriaDomain twInvPltzCriteriaDomain = new TwInvPltzCriteriaDomain();
        twInvPltzCriteriaDomain.setDscId(dscId);
        twInvPltzCriteriaDomain.setSearchCountCheckFlg(false);
        int count = twInvPltzService.searchCount(twInvPltzCriteriaDomain);
        if (count != 0) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTwInvPltzOnCreateUpdateByMaxMainMark(String
     *      dscId, int countMainMark)
     */
    public boolean validateDatabaseTwInvPltzOnCreateUpdateByMaxMainMark(
        String dscId, int countMainMark) throws ApplicationException {
        TwInvPltzCriteriaDomain twInvPltzCriteriaDomain = new TwInvPltzCriteriaDomain();
        twInvPltzCriteriaDomain.setDscId(dscId);
        twInvPltzCriteriaDomain.setSearchCountCheckFlg(false);
        int count = twInvPltzService.searchCount(twInvPltzCriteriaDomain);
        if (count + countMainMark > 9999) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTwInvPltzOnCreateUpdateByContSortKey(String
     *      dscId, String containerSortingKey)
     */
    public boolean validateDatabaseTwInvPltzOnCreateUpdateByContSortKey(
        String dscId, String containerSortingKey) throws ApplicationException {
        TwInvPltzCriteriaDomain twInvPltzCriteriaDomain = new TwInvPltzCriteriaDomain();
        twInvPltzCriteriaDomain.setDscId(dscId);
        List<TwInvPltzDomain> resultList = twInvPltzService
            .searchByCondition(twInvPltzCriteriaDomain);
        for (TwInvPltzDomain invPltzDomain : resultList) {
            if (!containerSortingKey.equals(invPltzDomain.getContainerSortingKey())) {
                return false;
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTwInvPltzOnCreateUpdateByExistence(String
     *      dscId)
     */
    public boolean validateDatabaseTwInvPltzOnCreateUpdateByExistence(
        String dscId) throws ApplicationException {
        TwInvPltzCriteriaDomain twInvPltzCriteriaDomain = new TwInvPltzCriteriaDomain();
        twInvPltzCriteriaDomain.setDscId(dscId);
        twInvPltzCriteriaDomain.setSearchCountCheckFlg(false);
        int count = twInvPltzService.searchCount(twInvPltzCriteriaDomain);
        if (count == 0) {
            return false;
        }
        return true;
    }

    // ==========================================================================
    // W6005
    // ==========================================================================
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyEtdAfterDate(String, String, String)
     */
    public boolean validateConsistencyEtdAfterDate(String date, String dateFormat, String timeZoneId) 
        throws ApplicationException {
        return commonService.validateAfterDate(date, dateFormat, timeZoneId);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyEtdEda(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyEtdEda(String etd, String eta, String dateFormat) throws ApplicationException {
        return commonService.validateFromToDate(dateFormat, DateUtil.addDate(etd, dateFormat, -1), eta);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#updateOnShippingInfoInpMoveToInvoiceGrouping(W6001DocCriteriaDomain
     *      criteria)
     */
    public void updateOnShippingInfoInpMoveToInvoiceGrouping(W6001DocCriteriaDomain criteria) 
        throws ApplicationException {
        String carrierCompNmAbb = NULL_STR;
        String portNm_From = NULL_STR;
        String portNm_To = NULL_STR;

        // Get carrier name.
        // - Carrier名称（略称）の取得
        // {@link TmNxsCompCriteriaDomain}に項目を設定し、{@link
        // TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}を呼出し、データを取得する
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain.setCompCd(criteria.getCarrierCompCd());
        List<TmNxsCompDomain> tmNxsCompList = tmNxsCompService
            .searchByCondition(tmNxsCompCriteriaDomain);
        for (TmNxsCompDomain tmpDomain : tmNxsCompList) {
            carrierCompNmAbb = tmpDomain.getCompNmAbb();
        }
        // Get the departing port name.
        // - 港名の取得(From)
        TmPortCriteriaDomain tmPortCriteriaDomain_From = new TmPortCriteriaDomain();
        tmPortCriteriaDomain_From.setPortCd(criteria.getLoadingPortCd());
        tmPortCriteriaDomain_From.setCntryCd(criteria.getFmCntryCd());
        TmPortDomain tmPortDomain_From = tmPortService.searchByKey(tmPortCriteriaDomain_From);
        portNm_From = tmPortDomain_From.getPortNm();
        
        // Get the arriving port name.
        // - 港名の取得(To)
        TmPortCriteriaDomain tmPortCriteriaDomain_To = new TmPortCriteriaDomain();
        tmPortCriteriaDomain_To.setPortCd(criteria.getDischargePortCd());
        tmPortCriteriaDomain_To.setCntryCd(criteria.getToCntryCd());
        TmPortDomain tmPortDomain_To = tmPortService.searchByKey(tmPortCriteriaDomain_To);
        portNm_To = tmPortDomain_To.getPortNm();
        
        // Set palletize work data.
        // - インボイス作成対象パレタイズワークを更新
        // {@link TwInvPltzCriteriaDomain}に項目を設定し、{@link
        // TwInvPltzService#updateByCondition(TwInvPltzCriteriaDomain)}を呼出し、データを更新する
        TwInvPltzCriteriaDomain twInvPltzCriteriaDomain = new TwInvPltzCriteriaDomain();
        twInvPltzCriteriaDomain.setDscId(criteria.getDscId());
        String arrivalTime = criteria.getArrivalTime().replaceAll(":", "");

        TwInvPltzDomain twInvPltzDomain = new TwInvPltzDomain();
        twInvPltzDomain.setCarrierCompCd(criteria.getCarrierCompCd());
        twInvPltzDomain.setCarrierCompNmAbb(carrierCompNmAbb);
        twInvPltzDomain.setForwarderCompCd(criteria.getForwarderCompCd());
        twInvPltzDomain.setLPortCntryCd(criteria.getFmCntryCd());
        twInvPltzDomain.setLoadingPortCd(criteria.getLoadingPortCd());
        twInvPltzDomain.setLoadingPortNm(portNm_From);
        twInvPltzDomain.setDPortCntryCd(criteria.getToCntryCd());
        twInvPltzDomain.setDischargePortCd(criteria.getDischargePortCd());
        twInvPltzDomain.setDischargePortNm(portNm_To);
        twInvPltzDomain.setVessel(criteria.getVessel());
        twInvPltzDomain.setEtd(criteria.getEtd());
        twInvPltzDomain.setEta(criteria.getEta());
        twInvPltzDomain.setArrivalTime(arrivalTime);
        
        commonService.setCommonPropertyForUpdate(twInvPltzDomain, SCREEN_ID_W6005);
        twInvPltzService.updateByCondition(twInvPltzDomain, twInvPltzCriteriaDomain);
    }

    // ==========================================================================
    // W6006
    // ==========================================================================

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchOnInvGroupInit(W6001DocCriteriaDomain
     *      criteria)
     */
    public W6001DocInvoiceDomain searchOnInvGroupInit(
        W6001DocCriteriaDomain criteria) throws ApplicationException {
        W6001DocInvoiceDomain result = new W6001DocInvoiceDomain();
        List<? extends W6001DocPltzDomain> pltzDomain1 = new ArrayList<W6001DocPltzDomain>();
        if (CUSTOM_TIMING_TYPE_A.equals(criteria.getCustomTimingTyp())) {
            // Get data when container loading before customs.
            // - （パターン1） Session(W6003.C/C TYPE) = "A" の場合 （「バン詰め後通関」の場合）
            // 検索データの取得
            // criteriaDomainを引数にして、{@link
            // W6001DocDao#searchTwInvPltzByOperationNoTypA(W6001DocCriteriaDomain)}を呼出し、
            // 検索データを取得する
            pltzDomain1 = w6001DocDao
                .searchTwInvPltzByOperationNoTypA(criteria);
        } else if (CUSTOM_TIMING_TYPE_B.equals(criteria.getCustomTimingTyp())) {
            // Get data when container loading after customs.
            // - （パターン2） Session(W6003.C/C TYPE) = "B" の場合 （「通関後バン詰め」の場合）
            // 検索データの取得
            // criteriaDomainを引数にして、{@link
            // W6001DocDao#searchTwInvPltzByOperationNoTypB(W6001DocCriteriaDomain)}を呼出し、
            // 検索データを取得する
            pltzDomain1 = w6001DocDao
                .searchTwInvPltzByOperationNoTypB(criteria);
        } else if (CUSTOM_TIMING_TYPE_Z.equals(criteria.getCustomTimingTyp())) {
            // Get data when custom timing type is Z.
            // - （パターン3） Session(W6003.C/C TYPE) = "Z" の場合
            // 検索データの取得
            // criteriaDomainを引数にして、{@link
            // W6001DocDao#searchTwInvPltzByOperationNoTypZ(W6001DocCriteriaDomain)}を呼出し、
            // 検索データを取得する
            pltzDomain1 = w6001DocDao
                .searchTwInvPltzByOperationNoTypZ(criteria);
        }

        // Get the shipper data.
        // - Shipperの取得
        // criteriaDomainを引数にして、{@link
        // W6001DocDao#searchTwInvPltzByShipperCd(W6001DocCriteriaDomain)}を呼出し、
        // Shipper情報を取得する
        List<? extends W6001DocPltzDomain> pltzDomain2 = w6001DocDao
            .searchTwInvPltzByShipperCd(criteria);

        List<W6001DocPltzDomain> pltzList1 = new ArrayList<W6001DocPltzDomain>();
        List<W6001DocPltzDomain> pltzList2 = new ArrayList<W6001DocPltzDomain>();
        for (W6001DocPltzDomain ptlzList : pltzDomain1) {
            pltzList1.add(ptlzList);
        }
        for (W6001DocPltzDomain ptlzList : pltzDomain2) {
            pltzList2.add(ptlzList);
        }
        result.setDocPltzList(pltzList1);
        result.setPltzList2(pltzList2);

        return result;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTwInvItemOnInvGroupSearch(java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseTwInvItemOnInvGroupSearch(String dscId, String shipperCd) 
        throws ApplicationException {
        
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        docCriteria.setDscId(dscId);
        docCriteria.setShipperCd(shipperCd);
        //Get carried necessity determination of processing corresponding to the search criteria.
        // インボイス作成対象品番ワーク検索
        int cnt = w6001DocDao.searchTwInvItemByNecessityEnforcement(docCriteria);
        
        if (cnt == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#transactOnInvGroupSearch(W6001DocCriteriaDomain
     *      criteria)
     */
    public List<? extends TwInvDomain> transactOnInvGroupSearch(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        // Invoice Grouping
        createInvoiceGroupingInformation(criteria);
        
        // Search Invoice No grouped.
        TwInvCriteriaDomain twInvCriteria = new TwInvCriteriaDomain();
        twInvCriteria.setDscId(criteria.getDscId());
        twInvCriteria.setShipperCd(criteria.getShipperCd());
        twInvCriteria.setPreferredOrder("GRP_NO_1, GRP_NO_2");
        
        return twInvService.searchByCondition(twInvCriteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseCigmaAds(String compCd, Date dateShipped)
     */
    public boolean validateDatabaseCigmaAds(String compCd, Date dateShipped)
        throws ApplicationException {
        // Get CIGMA ADS.
        // CIGMA ADS取得
        Date cigmaAds = commonService.searchCigmaAds(compCd);
        
        if (null == cigmaAds) {
            return true;
        }
        
        // Checked shipped date 
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(cigmaAds);
        cal1.add(Calendar.MONTH, - 1);
        Date date1 = cal1.getTime();
        if (date1.compareTo(dateShipped) > 0) {
            // Return false when the shipped date was earlier than one month.
            // dateShipped が cigmaAds 1月前より過去の場合
            return false;
        }
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(cigmaAds);
        cal2.add(Calendar.MONTH, 2);
        Date date2 = cal2.getTime();
        if (date2.compareTo(dateShipped) < 0) {
            // Return false when the shipped date is more than two months away.
            // dateShipped が cigmaAds 2月後より未来の場合
            return false;
        }
        return true;
    }
    

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#deleteOnInvGroupBackToMainScreen(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public void deleteOnInvGroupBackToMainScreen(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        String dscId = criteria.getDscId();
        // Delete palletize work data.
        // インボイス作成対象パレタイズワークの削除
        TwInvPltzCriteriaDomain twInvPltzCriteriaDomain = new TwInvPltzCriteriaDomain();
        twInvPltzCriteriaDomain.setDscId(dscId);
        twInvPltzCriteriaDomain.setSearchCountCheckFlg(false);
        if (twInvPltzService.searchCount(twInvPltzCriteriaDomain) > 0) {
            twInvPltzService.deleteByCondition(twInvPltzCriteriaDomain);
        }
        // Delete item work data.
        // インボイス作成対象品番ワークの削除
        TwInvItemCriteriaDomain twInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
        twInvItemCriteriaDomain.setDscId(dscId);
        twInvItemCriteriaDomain.setSearchCountCheckFlg(false);
        if (twInvItemService.searchCount(twInvItemCriteriaDomain) > 0) {
            twInvItemService.deleteByCondition(twInvItemCriteriaDomain);
        }
        // Delete invoice work group data.
        // インボイスグループワークの削除
        TwInvCriteriaDomain twInvCriteriaDomain = new TwInvCriteriaDomain();
        twInvCriteriaDomain.setDscId(dscId);
        twInvCriteriaDomain.setSearchCountCheckFlg(false);
        if (twInvService.searchCount(twInvCriteriaDomain) > 0) {
            twInvService.deleteByCondition(twInvCriteriaDomain);
        }
        
        // Delete invoice work data.
        // インボイスワークの削除
        TwInvoiceCriteriaDomain twInvoiceCriteriaDomain = new TwInvoiceCriteriaDomain();
        twInvoiceCriteriaDomain.setDscId(dscId);
        twInvoiceCriteriaDomain.setSearchCountCheckFlg(false);
        if (twInvoiceService.searchCount(twInvoiceCriteriaDomain) > 0) {
            twInvoiceService.deleteByCondition(twInvoiceCriteriaDomain);
        }
    }

    // ==========================================================================
    // W6007
    // ==========================================================================

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchOnDetailInit(W6001DocCriteriaDomain
     *      criteria)
     */
    public W6001DocInvoiceDomain searchOnDetailInit(
        W6001DocCriteriaDomain criteria) throws ApplicationException {
        
        // Avoid exception when the counter was zero.
        // 件数検索でゼロ件の場合のException送出を抑止
        criteria.setSearchCountCheckFlg(false);
        
        // Get invoice group work data.
        // - インボイスグループワークデータ取得
        // {@link TwInvCriteriaDomain}に項目を設定し、{@link
        // TwInvService#searchByCondition(TwInvCriteriaDomain)}を呼出し、データを取得する
        TwInvCriteriaDomain twInvCriteriaDomain = new TwInvCriteriaDomain();
        twInvCriteriaDomain.setDscId(criteria.getDscId());
        twInvCriteriaDomain.setShipperCd(criteria.getShipperCd());
        twInvCriteriaDomain.setGrpNo1(criteria.getGrpNo1());
        twInvCriteriaDomain.setGrpNo2(criteria.getGrpNo2());
        List<? extends TwInvDomain> result1 = twInvService
            .searchByCondition(twInvCriteriaDomain);
        if (result1 == null || result1.isEmpty()) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // Get palletize work data.
        // - インボイス作成対象パレタイズワークデータ取得
        // criteriaDomainを引数にして、{@link
        // W6001DocDao#searchTwInvPltzByDetail(W6001DocCriteriaDomain)}を呼出し、データを取得する
        List<? extends W6001DocPltzDomain> pltzList = w6001DocDao
            .searchTwInvPltzByDetail(criteria);
        
        if (CML_TYPE_CIGMA.equals(result1.get(0).getCmlTyp())
            || CML_TYPE_ERT.equals(result1.get(0).getCmlTyp())) {
            searchOnDetailInit_3300(criteria);
        }

        if (CML_TYPE_CIGMA.equals(result1.get(0).getCmlTyp())) {
            searchOnDetailInit_3400(criteria);
            updateTwInvItemItemDescription(criteria); // UT436 ADD
        }

        // 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
        // Update the items in the Invoice from PKG Materials MA. 
        // 包装材原単位から通貨・単価を取得・更新
        updateTwInvPltzOnInvoiceDetailBySearchForRt(criteria);
        // 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<
        
        // ST959 UNIT CONVERSION ADD START
        // Search Shipper unit.
        // シッパー単位系の検索
        VtCompMeasureUnitDomain vtCompMeasureUnitDomain
            = commonService.searchMeasureUnit(criteria.getShipperCd());
        // ST959 UNIT CONVERSION ADD END
        
        int multCurFlgOnCnt = 0;
        BigDecimal totalGrossWeight = new BigDecimal(0);
        BigDecimal totalVolume = new BigDecimal(0);

        List<W6001DocPltzDomain> result2 = new ArrayList<W6001DocPltzDomain>();
        for (W6001DocPltzDomain ptlzDomain : pltzList) {
            
            // ST959 UNIT CONVERSION ADD START
            // Conversion to the unit of Shipper
            // シッパーの単位系へ変換
            ptlzDomain.setGrossWeight(
                commonService.convertWeightUnitNoOverflowCheck(ptlzDomain.getGrossWeight(),
                    ptlzDomain.getWeightUnit(), vtCompMeasureUnitDomain.getWeightUnit())
            );
            ptlzDomain.setWeightUnit(vtCompMeasureUnitDomain.getWeightUnit());
            ptlzDomain.setWeightUnitDisp(vtCompMeasureUnitDomain.getWeightUnitDisp());
            ptlzDomain.setVolume(
                commonService.convertVolumeUnitNoOverflowCheck(ptlzDomain.getVolume(),
                    ptlzDomain.getVolumeUnit(), vtCompMeasureUnitDomain.getVolumeUnit())
            );
            ptlzDomain.setVolumeUnit(vtCompMeasureUnitDomain.getVolumeUnit());
            ptlzDomain.setVolumeUnitDisp(vtCompMeasureUnitDomain.getVolumeUnitDisp());
            // ST959 UNIT CONVERSION ADD END
            
            totalGrossWeight = totalGrossWeight.add(ptlzDomain.getGrossWeight());
            totalVolume = totalVolume.add(ptlzDomain.getVolume());
            
            criteria.setMainMark(ptlzDomain.getMainMark());
            // Check multiple currency
            // - 複数通貨が含まれているかをチェック
            // criteriaDomainを引数にして、{@link
            // W6001DocDao#searchCountTwInvItemByCurrencyCheck(W6001DocCriteriaDomain)}を呼出し、データを取得する
            int count = w6001DocDao.searchCountTwInvItemByCurrencyCheck(criteria);
            
            //【63】:Multi-Cur. Flg
            if (count == 1) {
                ptlzDomain.setMultiCurFlg(FLAG_N);
            } else {
                ptlzDomain.setMultiCurFlg(FLAG_Y);
                multCurFlgOnCnt++ ;
            }
            result2.add(ptlzDomain);
        }
        
        // 2014/11/25 DNJP.Kawamura ST180対応 START >>>>>
        // Check multiple currency(Invoice Unit)
        // - 複数通貨(Invoice単位)が含まれているかをチェック(結果が1件の場合、問題なし。2件以上の場合エラー。)
        int multCurInvoiceCnt = w6001DocDao.searchCountTwInvItemByCurrencyCheckInvoice(criteria);
        // 2014/11/25 DNJP.Kawamura ST180対応 END <<<<<
        
        W6001DocInvoiceDomain result = new W6001DocInvoiceDomain();

        // Init value.
        result.setUnitPriceError(FLAG_N);
        result.setHsCodeWarning(FLAG_N);
        
        // Check unit price error.
        // - 単価なしエラーの判定
        // criteriaDomainを引数にして、{@link
        // W6001DocDao#searchCountTwInvItemByUnitPrice2(W6001DocCriteriaDomain)}を呼出し、データを取得する
        int count = w6001DocDao.searchCountTwInvItemByUnitPrice(criteria);
        
        //【53】:Unit Price Error
        // 2014/11/25 DNJP.Kawamura ST180対応 START >>>>>
//        if (count >= 1) {
//            result.setUnitPriceError(FLAG_Y);
//        } else {
//            if (multCurFlgOnCnt > 0) {
//                result.setUnitPriceError(FLAG_Y);
//            } else {
//                result.setUnitPriceError(FLAG_N);
//            }
//        }
        if (count == 0 && multCurFlgOnCnt == 0 && multCurInvoiceCnt == 1){
            result.setUnitPriceError(FLAG_N);
        } else {
            result.setUnitPriceError(FLAG_Y);
        }
        // 2014/11/25 DNJP.Kawamura ST180対応 END <<<<<
        
        if (CML_TYPE_CIGMA.equals(result1.get(0).getCmlTyp())
            || CML_TYPE_ERT.equals(result1.get(0).getCmlTyp())) {
            //  Get number of HS CODE Warning.
            // CIGMA, ERTの場合、HS CODE警告対象データの件数を取得
            int countHsCdWarn = w6001DocDao.searchCountTwInvItemBySortNo(criteria);

            //【54】:HS CODE Warning
            if (countHsCdWarn >= 1) {
                result.setHsCodeWarning(FLAG_Y);
            } else {
                result.setHsCodeWarning(FLAG_N);
            }
        }
        
        //【1】:Shipper
        // (遷移元画面からの引継値参照）
        //【2】:Consignee
        result.setConsigneeCd(result1.get(0).getConsigneeCd());
        //【3】:NEXUS Ship to
        result.setShipToCd(result1.get(0).getShipToCd());
        //【4】:CML TYPE
        result.setCmlTyp(result1.get(0).getCmlTyp());
        //【5】:Inv. Set Key
        result.setInvoiceKey(result1.get(0).getInvoiceKey());
        //【6】:Re-Ex. Flg
        result.setReExpGoodsFlg(result1.get(0).getReExpGoodsFlg());
        //【7】:Inv. Category
        result.setInvoiceCtgry(result1.get(0).getInvoiceCtgry());
        //【8】:Freight Res.
        result.setFreightResponsibleCd(result1.get(0).getFreightResponsibleCd());
        //【9】:Price Terms
        result.setPriceTerms(result1.get(0).getPriceTerms());
        //【10】:Trade Terms
        result.setTradeTerms(result1.get(0).getTradeTerms());
        //【14】:CML Cur.
        result.setCurrCd(result1.get(0).getCurrCd());
        //【16】:Date Shipped
        // (遷移元画面からの引継値参照）
        
        //【12】:Total G/W
        result.setTotalGrossWeight(totalGrossWeight);
        // ST959 UNIT CONVERSION ADD START
        // if the sum of G/W is overflow
        // G/Wの合計がオーバーフローしている場合
        if (CML_TYPE_CIGMA.equals(result1.get(0).getCmlTyp())) {
            // Integer part digits of weight in CIGMA of 6 digits for 6 digit exceeded NG.
            // CIGMAでは重量の整数部桁数は6桁であるため6桁の超過はNG。
            if (6 < totalGrossWeight.precision() - totalGrossWeight.scale()) {
                result.setTotalGrossWeightOverflowFlg(FLAG_Y);
            }
        } else {
            if (commonService.isWeightOverflow(totalGrossWeight)) {
                result.setTotalGrossWeightOverflowFlg(FLAG_Y);
            }
        }
        // ST959 UNIT CONVERSION ADD END
        //【13】:Total Vol.
        result.setTotalVolume(totalVolume);
        // ST959 UNIT CONVERSION ADD START
        // if the sum of volume is overflow
        // 容積の合計がオーバーフローしている場合
        if (commonService.isVolumeOverflow(totalVolume)) {
            result.setTotalVolumeOverflowFlg(FLAG_Y);
        }
        // ST959 UNIT CONVERSION ADD END
        
        //【55】:Remove
        //【56】:CML
        //【57】:G/W(XXXX)
        //【58】:Vol.(XXXX)
        //【59】:Full RT Flg
        //【60】:DG Flg
        //【61】:Exp-Reg. Flg
        //【62】:Split Prohibit Flg
        result.setDocPltzList(result2);
        
        if (!pltzList.isEmpty()) {
            result.setWeightUnit(pltzList.get(0).getWeightUnitDisp());
            result.setVolumeUnit(pltzList.get(0).getVolumeUnitDisp());
        }
        
        return result;
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchOnDetailRefresh(W6001DocCriteriaDomain
     *      criteria)
     */
    public W6001DocInvoiceDomain searchOnDetailRefresh(
        W6001DocCriteriaDomain criteria) throws ApplicationException {
        return this.searchOnDetailInit(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#updateOnDetailRemove(W6001DocCriteriaDomain
     *      criteria)
     */
    public W6001DocInvoiceDomain updateOnDetailRemove(
        W6001DocCriteriaDomain criteria) throws ApplicationException {
        
        int updateCount = 0;
        
        List<? extends W6001DocPltzDomain> docPltzList = criteria.getDocPltzList();
        for (W6001DocPltzDomain docPltz : docPltzList) {
            // Set palletize work data.
            // - インボイス作成対象パレタイズワークの更新
            TwInvPltzCriteriaDomain twInvPltzCriteriaDomain = new TwInvPltzCriteriaDomain();
            twInvPltzCriteriaDomain.setDscId(criteria.getDscId());
            twInvPltzCriteriaDomain.setShipperCd(docPltz.getShipperCd());
            twInvPltzCriteriaDomain.setMainMark(docPltz.getMainMark());
            twInvPltzCriteriaDomain.setGrpNo1(docPltz.getGrpNo1());

            TwInvPltzDomain twInvPltzDomain = new TwInvPltzDomain();
            twInvPltzDomain.setRemoveFlg(FLAG_Y);
            updateCount += twInvPltzService.updateByCondition(twInvPltzDomain, twInvPltzCriteriaDomain);
            // Set item no work data.
            // - インボイス作成対象品目番号ワークを更新
            // TwInvItemCriteriaDomainを引数にして、{@link
            // TwInvItemService#updateByCondition(TwInvItemCriteriaDomain)}を呼出し、データを更新する。
            TwInvItemCriteriaDomain twInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
            twInvItemCriteriaDomain.setDscId(criteria.getDscId());
            twInvItemCriteriaDomain.setShipperCd(docPltz.getShipperCd());
            twInvItemCriteriaDomain.setMainMark(docPltz.getMainMark());
            twInvItemCriteriaDomain.setGrpNo1(docPltz.getGrpNo1());

            TwInvItemDomain twInvItemDomain = new TwInvItemDomain();
            twInvItemDomain.setRemoveFlg(FLAG_Y);
            twInvItemService.updateByCondition(twInvItemDomain, twInvItemCriteriaDomain);

            // Delete target data from invoice group work.
            // Remove対象のFRT品をインボイスグループワークから削除
            deleteTwInvOnDetailByGrpNo2ForFrt(criteria.getDscId(), docPltz.getShipperCd(), docPltz.getGrpNo1());
        }

        W6001DocInvoiceDomain docInvoiceDomain = this.searchOnDetailInit(criteria);
        docInvoiceDomain.setUpdateCount(updateCount);
        
        return docInvoiceDomain;
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyHsCodeWarningIgnoreWarnings(String
     *      hsCdWarnig, String ignoreWarning)
     */
    public boolean validateConsistencyHsCodeWarningIgnoreWarnings(
        String hsCdWarnig, String ignoreWarning) throws ApplicationException {
        if (FLAG_Y.equals(hsCdWarnig)) {
            if (!CHECK_ON.equals(ignoreWarning)) {
                return false;
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyRefreshed(Date, Date, boolean)
     */
    public boolean validateConsistencyRefreshed(Date dateSkipped,
        Date hiddenDateSkipped, boolean refreshFlg) throws ApplicationException {
        if (refreshFlg) {
            if (dateSkipped.compareTo(hiddenDateSkipped) != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyUnitPriceError(String
     *      unitPriceErr)
     */
    public boolean validateConsistencyUnitPriceError(String unitPriceErr)
        throws ApplicationException {
        if (FLAG_Y.equals(unitPriceErr)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#updateOnDetailMoveToRegister(W6001DocCriteriaDomain
     *      criteria)
     */
    public void updateOnDetailMoveToRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        
        // Set shipper date to the invoice group work table.
        // - 売上日のインボイスグループワークへの登録
        // TwInvCriteriaDomainを引数にして、{@link
        // TwInvService#updateByCondition(TwInvCriteriaDomain)}を呼出し、データを更新する。
        TwInvCriteriaDomain twInvCriteriaDomain1 = new TwInvCriteriaDomain();
        twInvCriteriaDomain1.setDscId(criteria.getDscId());
        twInvCriteriaDomain1.setShipperCd(criteria.getShipperCd());
        twInvCriteriaDomain1.setGrpNo1(criteria.getGrpNo1());
        
        Date cnvDateDt    = DateUtil.parseDate(criteria.getDateShipped(), criteria.getScreenDateFormat());
        
        TwInvDomain twInvDomain1 = new TwInvDomain();
        twInvDomain1.setShippedDt(cnvDateDt);
        twInvService.updateByCondition(twInvDomain1, twInvCriteriaDomain1);
        // Set currency code to the invoice group work table.
        // - 通貨コードのインボイスグループワークへの登録
        TwInvItemCriteriaDomain twInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
        twInvItemCriteriaDomain.setDscId(criteria.getDscId());
        twInvItemCriteriaDomain.setShipperCd(criteria.getShipperCd());
        twInvItemCriteriaDomain.setGrpNo1(criteria.getGrpNo1());
        twInvItemCriteriaDomain.setGrpNo2(criteria.getGrpNo2());
        twInvItemCriteriaDomain.setRemoveFlg(FLAG_N);
        List<? extends TwInvItemDomain> twInvItemList = twInvItemService
            .searchByCondition(twInvItemCriteriaDomain);
        if (twInvItemList != null && !twInvItemList.isEmpty()) {
            
            TwInvCriteriaDomain twInvCriteriaDomain2 = new TwInvCriteriaDomain();
            twInvCriteriaDomain2.setDscId(criteria.getDscId());
            twInvCriteriaDomain2.setShipperCd(criteria.getShipperCd());
            twInvCriteriaDomain2.setGrpNo1(criteria.getGrpNo1());
            twInvCriteriaDomain2.setGrpNo2(criteria.getGrpNo2());
            
            TwInvDomain twInvDomain2 = new TwInvDomain();
            twInvDomain2.setCurrCd(twInvItemList.get(0).getCurrCd());
            twInvService.updateByCondition(twInvDomain2, twInvCriteriaDomain2);
        }
    }

    // ==========================================================================
    // W6008
    // ==========================================================================

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchOnDetaiFrtlInit(W6001DocCriteriaDomain
     *      criteria)
     */
    public W6001DocInvoiceDomain searchOnDetaiFrtlInit(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        
        W6001DocInvoiceDomain result = new W6001DocInvoiceDomain();
        
        result.setHsCodeWarning(FLAG_N);
        
        // Get invoice group work data.
        // - インボイスグループワークデータを取得
        // {@link TwInvCriteriaDomain}に項目を設定し、{@link
        // TwInvService#searchByCondition(TwInvCriteriaDomain)}を呼出し、データを取得する
        TwInvCriteriaDomain twInvCriteriaDomain = new TwInvCriteriaDomain();
        twInvCriteriaDomain.setDscId(criteria.getDscId());
        twInvCriteriaDomain.setShipperCd(criteria.getShipperCd());
        twInvCriteriaDomain.setGrpNo1(criteria.getGrpNo1());
        twInvCriteriaDomain.setGrpNo2(criteria.getGrpNo2());
        List<? extends TwInvDomain> twInvList = twInvService
            .searchByCondition(twInvCriteriaDomain);
        if (twInvList == null || twInvList.isEmpty()) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
        // Update the items in the Invoice from PKG Materials MA. 
        // 包装材原単位から通貨・単価を取得・更新
        updateTwInvPltzOnInvoiceDetailBySearchForRt(criteria);
        // 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<
        
        // ST959 UNIT CONVERSION ADD START
        // Search Shipper unit.
        // シッパー単位系の検索
        VtCompMeasureUnitDomain vtCompMeasureUnitDomain
            = commonService.searchMeasureUnit(criteria.getShipperCd());
        
        // Processing for calculating the Total N/W.
        // Because it is not rounded in each record of TW_INV_ITEM it will not match the invoice out error.
        // Total N/Wを計算するための処理。
        // TW_INV_ITEMの粒度で丸めないと誤差が出てインボイスと合わなくなるため。
        TwInvItemCriteriaDomain twInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
        twInvItemCriteriaDomain.setDscId(criteria.getDscId());
        twInvItemCriteriaDomain.setShipperCd(criteria.getShipperCd());
        twInvItemCriteriaDomain.setGrpNo1(criteria.getGrpNo1());
        twInvItemCriteriaDomain.setGrpNo2(criteria.getGrpNo2());
        twInvItemCriteriaDomain.setRemoveFlg(FLAG_N);
        List<TwInvItemDomain> twInvItemDomainResultList = twInvItemService.searchByCondition(twInvItemCriteriaDomain);
        BigDecimal totalNetWeight = new BigDecimal(0);
        for (TwInvItemDomain twInvItemDomain : twInvItemDomainResultList) {
            BigDecimal convertedNetWeight
                = commonService.convertWeightUnitNoOverflowCheck(twInvItemDomain.getItemWeight().multiply(twInvItemDomain.getQty()),
                    twInvItemDomain.getWeightUnit(), vtCompMeasureUnitDomain.getWeightUnit());
            totalNetWeight = totalNetWeight.add(convertedNetWeight);
        }
        // ST959 UNIT CONVERSION ADD END        
        
        // Get item work data.
        // - インボイス作成対象品目番号ワークのデータ取得
        // criteriaDomainを引数にして、{@link
        // W6001DocDao#searchTwInvItemByDetailFull(W6001DocCriteriaDomain)}を呼出し、データを取得する
        List<? extends W6001DocPltzItemDomain> pltzItemList = w6001DocDao.searchTwInvItemByDetailFull(criteria);
        
        // Count up the total QTY and net weight.
        // SUM(QTY), SUM(NET_WEIGHT) 集計
        BigDecimal totalQty = new BigDecimal(0);
        //BigDecimal totalNetWeight = new BigDecimal(0); // ST959 UNIT CONVERSION DEL
        if (pltzItemList != null && !pltzItemList.isEmpty()) {
            for (W6001DocPltzItemDomain pltzItem : pltzItemList) {
                totalQty = totalQty.add(pltzItem.getSumQty());
                //totalNetWeight = totalNetWeight.add(pltzItem.getNetWeight()); // ST959 UNIT CONVERSION DEL
            }
        }
        // Clear item no work table.
        // - インボイス作成対象品目番号ワークをクリア
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(docCriteria, criteria);
        commonService.setCommonPropertyForUpdate(docCriteria, SCREEN_ID_W6007);
        w6001DocDao.updateTwInvItemOnInvoiceDetailForClear(docCriteria);
        // Get free item name list.
        // Free項目名称の取得
        TmInvFreeItemCriteriaDomain invFreeItemCriteriaDomain = new TmInvFreeItemCriteriaDomain();
        invFreeItemCriteriaDomain.setCompCd(criteria.getShipperCd());
        List<TmInvFreeItemDomain> invFreeItemList = tmInvFreeItemService.searchByCondition(invFreeItemCriteriaDomain);
        // Get item no data from the export formality item no master table.
        // - 輸出手続品番原単位から品番情報を取得
        // criteriaDomainを引数にして、{@link
        // W6001DocDao#searchTmExpFormalitiItemNo(W6001DocCriteriaDomain)}を呼出し、データを取得する
        String timezoneId = commonService.searchTimezone(criteria.getShipperCd());
        Date nowDt = DateUtils.truncate(DateUtil.convertTime(new Date(), timezoneId), Calendar.DAY_OF_MONTH);

        criteria.setAplyStrtDt(nowDt);
        List<? extends W6001DocPltzItemDomain> ptlzItemList
            = w6001DocDao.searchTmExpFormalitiItemNo(criteria);
        
        if (ptlzItemList != null) {
            // Set item information from the export formality item no master table.
            // - 輸出手続品番原単位から品番情報を登録
            // {@link TwInvItemCriteriaDomain}に項目を設定し、{@link
            // TwInvItemService#updateByCondition(TwInvItemCriteriaDomain)}を呼出し、データを更新する
            for (W6001DocPltzItemDomain ptlzItem : ptlzItemList) {
                TwInvItemCriteriaDomain updTwInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
                updTwInvItemCriteriaDomain.setDscId(criteria.getDscId());
                updTwInvItemCriteriaDomain.setMainMark(ptlzItem.getMainMark());
                updTwInvItemCriteriaDomain.setBrch(ptlzItem.getBrch());
                updTwInvItemCriteriaDomain.setSortOdr(ptlzItem.getSortOdr());
                
                TwInvItemDomain updTwInvItem = new TwInvItemDomain();
                updTwInvItem.setHsCd(ptlzItem.getHsCd());
                updTwInvItem.setFree1RegFlg(ptlzItem.getFree1RegFlg());
                updTwInvItem.setFree1Dtl(ptlzItem.getFree1Dtl());
                updTwInvItem.setFree1OriginCntryFlg(ptlzItem.getFree1OriginCntryFlg());
                updTwInvItem.setFree2RegFlg(ptlzItem.getFree2RegFlg());
                updTwInvItem.setFree2Dtl(ptlzItem.getFree2Dtl());
                updTwInvItem.setFree2OriginCntryFlg(ptlzItem.getFree2OriginCntryFlg());
                updTwInvItem.setFree3RegFlg(ptlzItem.getFree3RegFlg());
                updTwInvItem.setFree3Dtl(ptlzItem.getFree3Dtl());
                updTwInvItem.setFree3OriginCntryFlg(ptlzItem.getFree3OriginCntryFlg());
                // Set invoice free item data.
                // trac#333 TM_INV_FREE_ITEM（インボイスフリー項目原単位）から取得して設定
                if (invFreeItemList != null) {
                    for (TmInvFreeItemDomain invFreeItem : invFreeItemList) {
                        if ("1".equals(invFreeItem.getFreeColNo().toString())) {
                            updTwInvItem.setFree1Nm(invFreeItem.getFreeColNm());
                        } else if ("2".equals(invFreeItem.getFreeColNo().toString())) {
                            updTwInvItem.setFree2Nm(invFreeItem.getFreeColNm());
                        } else if ("3".equals(invFreeItem.getFreeColNo().toString())) {
                            updTwInvItem.setFree3Nm(invFreeItem.getFreeColNm());
                        }
                    }
                }
                
                twInvItemService
                    .updateByCondition(updTwInvItem, updTwInvItemCriteriaDomain);
            }
        }
        
        criteria.setSearchCountCheckFlg(false);
        // 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
        // Check multiple currency
        // - 複数通貨が含まれているかをチェック(結果が1件の場合、問題なし。2件以上の場合エラー。)
        int multCurInvoiceCnt = w6001DocDao.searchCountTwInvItemByCurrencyCheckInvoice(criteria);

        // Get unit price error information.
        // - 単価エラー情報を取得(結果が0件の場合、問題なし。1件以上の場合エラー。)
//        int count = w6001DocDao.searchCountTwInvItemByUnitPrice(criteria);
        int unitPriceCnt = w6001DocDao.searchCountTwInvItemByUnitPrice(criteria);

        // Set multiple currency error and unit price error information.
        // - 通貨・単価エラー情報をセット
//        if (count > 0) {
//            result.setUnitPriceError(FLAG_Y);
//        } else {
//            result.setUnitPriceError(FLAG_N);
//        }
        if (multCurInvoiceCnt == 1 && unitPriceCnt == 0) {
            result.setUnitPriceError(FLAG_N);
        } else {
            result.setUnitPriceError(FLAG_Y);
        }
        // 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<

        // Get HS CODE.
        // - HS CODE 警告情報を取得
        int countHsCdWarn = w6001DocDao.searchCountTwInvItemBySortNo(criteria);
        if (countHsCdWarn >= 1) {
            result.setHsCodeWarning(FLAG_Y);
        } else {
            result.setHsCodeWarning(FLAG_N);
        }
        
        //【1】:Shipper
        result.setShipperCd(criteria.getShipperCd());
        //【2】:Consignee
        result.setConsigneeCd(twInvList.get(0).getConsigneeCd());
        //【3】:NEXUS Ship to
        result.setShipToCd(twInvList.get(0).getShipToCd());
        //【4】:Total QTY
        result.setPltzItemQty(totalQty);
        //【5】:Total N/W + 重量用計量単位
        result.setTotalNetWeight(totalNetWeight);
        // ST959 UNIT CONVERSION ADD START
        // if the sum of N/W is overflow
        // N/Wの合計がオーバーフローしている場合
        if (commonService.isWeightOverflow(totalNetWeight)) {
            result.setTotalNetWeightOverflowFlg(FLAG_Y);
        }
        // ST959 UNIT CONVERSION ADD END
        result.setWeightUnit(pltzItemList.get(0).getWeightUnit());
        //【6】:CML Cur.
        result.setCurrCd(twInvList.get(0).getCurrCd());
        // hidden.CML TYP
        result.setCmlTyp(twInvList.get(0).getCmlTyp());
        
        W6001DocPltzDomain docPltzDomain = new W6001DocPltzDomain();
        docPltzDomain.setDocPltzItemList(pltzItemList);

        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        docPltzList.add(docPltzDomain);
        
        result.setDocPltzList(docPltzList);
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#deleteOnDetailFrtRemove(W6001DocCriteriaDomain
     *      criteria)
     */
    public W6001DocInvoiceDomain deleteOnDetailFrtRemove(
        W6001DocCriteriaDomain criteria) throws ApplicationException {

        int updateCount = 0;
        
        List<? extends W6001DocPltzDomain> docPltzList = criteria.getDocPltzList();
        for (W6001DocPltzDomain docPltz : docPltzList) {
            // Set item no work data.
            // - インボイス作成対象品目番号ワークを更新
            // {@link TwInvItemDomain}に項目を設定し、{@link
            // TwInvItemService#updateByCondition(TwInvItemDomain)}を呼出す
            TwInvItemCriteriaDomain twInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
            twInvItemCriteriaDomain.setDscId(criteria.getDscId());
            twInvItemCriteriaDomain.setShipperCd(criteria.getShipperCd());
            twInvItemCriteriaDomain.setGrpNo1(criteria.getGrpNo1());
            twInvItemCriteriaDomain.setGrpNo2(criteria.getGrpNo2());
            twInvItemCriteriaDomain.setItemNo(docPltz.getItemNo());
            twInvItemCriteriaDomain.setItemDescription(docPltz.getItemDescription());
            twInvItemCriteriaDomain.setModelCd(docPltz.getModelCd());
            twInvItemCriteriaDomain.setCurrCd(docPltz.getCurrCd());
            twInvItemCriteriaDomain.setUnitPrice(docPltz.getUnitPrice());

            TwInvItemDomain twInvItemDomain = new TwInvItemDomain();
            twInvItemDomain.setRemoveFlg(FLAG_Y);
            updateCount += twInvItemService.updateByCondition(twInvItemDomain, twInvItemCriteriaDomain);
        }

        W6001DocInvoiceDomain docInvoiceDomain = this.searchOnDetaiFrtlInit(criteria);
        docInvoiceDomain.setUpdateCount(updateCount);
        
        return docInvoiceDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTwInvOnDetailFrtMoveToRegister(String
     *      dscId, String shipperCd, String grpNo1)
     */
    public boolean validateDatabaseTwInvOnDetailFrtMoveToRegister(
        W6008CriteriaDomain criteriaDomain) throws ApplicationException {
        TwInvCriteriaDomain twInvCriteriaDomain = new TwInvCriteriaDomain();
        twInvCriteriaDomain.setDscId(criteriaDomain.getLoginUserDscId());
        twInvCriteriaDomain.setShipperCd(criteriaDomain.getShipperCd());
        twInvCriteriaDomain.setGrpNo1(criteriaDomain.getGrpNo1());
        twInvCriteriaDomain.setGrpNo2(NUMBER_0);
        List<? extends TwInvDomain> twInvlist = twInvService
            .searchByCondition(twInvCriteriaDomain);

        for (TwInvDomain twinvDomain : twInvlist) {
            if (FLAG_N.equals(twinvDomain.getDecisionFlg())) {
                return false;
            }
            criteriaDomain.setShippedDt(twinvDomain.getShippedDt());
        }
        return true;
    }

    // 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#updateOnDetailFrtMoveToRegister(W6001DocCriteriaDomain
     *      criteria)
     */
    public void updateOnDetailFrtMoveToRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        
        // Set currency code & shipped date to the invoice group work table.
        // - 通貨コードと売上日のインボイスグループワークへの登録
        TwInvItemCriteriaDomain twInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
        twInvItemCriteriaDomain.setDscId(criteria.getDscId());
        twInvItemCriteriaDomain.setShipperCd(criteria.getShipperCd());
        twInvItemCriteriaDomain.setGrpNo1(criteria.getGrpNo1());
        twInvItemCriteriaDomain.setGrpNo2(criteria.getGrpNo2());
        twInvItemCriteriaDomain.setRemoveFlg(FLAG_N);
        List<? extends TwInvItemDomain> twInvItemList = twInvItemService
            .searchByCondition(twInvItemCriteriaDomain);
        if (twInvItemList != null && !twInvItemList.isEmpty()) {
            
            TwInvCriteriaDomain twInvCriteriaDomain2 = new TwInvCriteriaDomain();
            twInvCriteriaDomain2.setDscId(criteria.getDscId());
            twInvCriteriaDomain2.setShipperCd(criteria.getShipperCd());
            twInvCriteriaDomain2.setGrpNo1(criteria.getGrpNo1());
            twInvCriteriaDomain2.setGrpNo2(criteria.getGrpNo2());
            
            TwInvDomain twInvDomain2 = new TwInvDomain();
            twInvDomain2.setCurrCd(twInvItemList.get(0).getCurrCd());
            twInvDomain2.setShippedDt(criteria.getShippedDt());
            twInvService.updateByCondition(twInvDomain2, twInvCriteriaDomain2);
        }
    }
    // 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<
    
    // ==========================================================================
    // W6009
    // ==========================================================================

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyRelation(BigDecimal, int)
     */
    public boolean validateConsistencyRelation(BigDecimal value, int digit)
        throws ApplicationException {
        return !(value.scale() > digit);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyFreeAdditionalFreeAdditionalNameOver(BigDecimal
     *      freeAdd, String freeAddNm)
     */
    public boolean validateConsistencyFreeAdditionalFreeAdditionalNameOver(
        BigDecimal freeAdd, String freeAddNm) throws ApplicationException {
        if (freeAdd.compareTo(BigDecimal.ZERO) > 0) {
            if (StringUtils.isEmpty(freeAddNm)) {
                return false;
            }
        }
        return true;
    }

    /** 
     * {@inheritDoc}
     *  
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyFreeAdditionalFreeAdditionalNameZero(BigDecimal
     *      freeAdd, String freeAddNm)
     */ 
    public boolean validateConsistencyFreeAdditionalFreeAdditionalNameZero(
        BigDecimal freeAdd, String freeAddNm) throws ApplicationException {
        if (freeAdd.compareTo(BigDecimal.ZERO) == 0) {
            if (!StringUtils.isEmpty(freeAddNm)) {
                return false;
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyDigit(java.math.BigDecimal, int)
     */
    public boolean validateConsistencyDigit(BigDecimal curr, int digit)
        throws ApplicationException {
        return !(curr.scale() > digit);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(W6001DocCriteriaDomain, String[])
     */
    public String validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(W6001DocCriteriaDomain criteria, String[] property)
        throws ApplicationException {
        
        String subTradeTerms = criteria.getTradeTerms();
        if (subTradeTerms.length() > 3) {
            subTradeTerms = subTradeTerms.substring(0, 3);
        }
        
        // Set search key data.
        // 検索条件ドメインの設定
        TmInvAmountChkCriteriaDomain chkCriteria = new TmInvAmountChkCriteriaDomain();
        chkCriteria.setCompCd(criteria.getShipperCd());
        chkCriteria.setPriceTerms(criteria.getPriceTerms());
        chkCriteria.setTradeTerms(subTradeTerms);
        chkCriteria.setFreightResponsibleCd(criteria.getFreightResponsibleCd());
        
        // Get data from the Invoice Calculate (Amount) error check per unit of service.
        // インボイス金額エラーチェック原単位を検索
        TmInvAmountChkDomain chkDomain;
        try {
            chkDomain = tmInvAmountChkService.searchByKey(chkCriteria);
        } catch (ApplicationException e) {
            // データの取得ができなかった場合、チェック不要
            return null;
        }
        if (chkDomain == null) {
            return null;
        }
        
        BigDecimal decZero = new BigDecimal("0");
        BigDecimal decFreight = criteria.getFreight();
        BigDecimal decInsurance = criteria.getInsurance();
        // Check error type.
        // エラー判定
        if (FRIGHT_ERR_0.equals(chkDomain.getFreightErr())) {
            if (decFreight.compareTo(decZero) == 0) {
                property[0] = "freight";
                return GSCM_E0_0034;
            }
        } else if (FRIGHT_ERR_1.equals(chkDomain.getFreightErr())) {
            if (decFreight.compareTo(decZero) != 0) {
                property[0] = "freight";
                return NXS_E7_0118;
            }
        }
        // Check insurance error.
        if (FRIGHT_ERR_0.equals(chkDomain.getInsuranceErr())) {
            if (decInsurance.compareTo(decZero) == 0) {
                property[0] = "insurance";
                return GSCM_E0_0034;
            }
        } else if (FRIGHT_ERR_1.equals(chkDomain.getInsuranceErr())) {
            if (decInsurance.compareTo(decZero) != 0) {
                property[0] = "insurance";
                return NXS_E7_0118;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchOnRegisterPrintDocument(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public File searchOnRegisterPrintDocument(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        // Get documentation data.
        return searchDocumentationData(criteria.getShipperCd(), criteria.getInvoiceNo(), criteria.getInvoiceIssueDt());
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchOnRegisterChangeFrtShipper(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public W6001DocInvoiceDomain searchOnRegisterChangeFrtShipper(W6001DocCriteriaDomain criteria)
        throws ApplicationException {

        String shipperCd = null;
        if (StringUtils.isNotEmpty(criteria.getFrtShipperCd())) {
            shipperCd = criteria.getFrtShipperCd();
        } else {
            shipperCd = criteria.getShipperCd();
        }
        
        String weightUnit = commonService.searchWeightUnit(shipperCd);

//ST959 UNIT CONVERSION DEL START
//BigDecimal totalNw = commonService.convertVolumeUnit(criteria.getTotalNetWeight(), criteria.getWeightUnit(), weightUnit);
//if (totalNw == null) {
//  Object[] params = { 
//      commonService.getResource(criteria.getLocale(), "label.totalNw") 
//  };
//  throw new GscmApplicationException(NXS_E7_0157, params); 
//}
//
//W6001DocInvoiceDomain docInvDomain = new W6001DocInvoiceDomain();
//docInvDomain.setWeightUnit(weightUnit);
//docInvDomain.setTotalNetWeight(totalNw);
//
//if (GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {
//
//  String volumeUnit = commonService.searchVolumeUnit(shipperCd);
//  BigDecimal totalVol = commonService.convertVolumeUnit(criteria.getTotalVolume(), criteria.getVolumeUnit(), volumeUnit);
//  if (totalVol == null) {
//      Object[] params = { 
//          commonService.getResource(criteria.getLocale(), "label.totalVol") 
//      };
//      throw new GscmApplicationException(NXS_E7_0157, params); 
//  }
//  docInvDomain.setVolumeUnit(volumeUnit);
//  docInvDomain.setTotalVolume(totalVol);
//  
//  // TOTAL G/W
//  BigDecimal totalGw = commonService.convertVolumeUnit(criteria.getTotalGrossWeight(), criteria.getWeightUnit(), weightUnit);
//  if (totalGw == null) {
//      Object[] params = { 
//          commonService.getResource(criteria.getLocale(), "label.totalGw") 
//      };
//      throw new GscmApplicationException(NXS_E7_0157, params); 
//  }
//  docInvDomain.setTotalGrossWeight(totalGw);
//}
//
//return docInvDomain;
// ST959 UNIT CONVERSION DEL END


        // ST959 UNIT CONVERSION ADD START
        W6001DocInvoiceDomain docInvDomain = new W6001DocInvoiceDomain();

        TwInvItemCriteriaDomain twInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
        twInvItemCriteriaDomain.setDscId(criteria.getDscId());
        twInvItemCriteriaDomain.setShipperCd(criteria.getShipperCd());
        twInvItemCriteriaDomain.setGrpNo1(criteria.getGrpNo1());
        twInvItemCriteriaDomain.setGrpNo2(criteria.getGrpNo2());
        twInvItemCriteriaDomain.setRemoveFlg(FLAG_N);
        List<TwInvItemDomain> twInvItemDomainResultList = twInvItemService.searchByCondition(twInvItemCriteriaDomain);
        BigDecimal totalNetWeight = new BigDecimal(0);
        for (TwInvItemDomain twInvItemDomain : twInvItemDomainResultList) {
            BigDecimal convertedNetWeight
                = commonService.convertWeightUnitNoOverflowCheck(twInvItemDomain.getItemWeight().multiply(twInvItemDomain.getQty()),
                    twInvItemDomain.getWeightUnit(), weightUnit);
            totalNetWeight = totalNetWeight.add(convertedNetWeight);
        }
        if (commonService.isWeightOverflow(totalNetWeight)) {
            docInvDomain.setTotalNetWeightOverflowFlg(FLAG_Y);
        }
        docInvDomain.setTotalNetWeight(totalNetWeight);
        docInvDomain.setWeightUnit(weightUnit);

        return docInvDomain;
        // ST959 UNIT CONVERSION ADD END
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchTwInvPltzOnRegisterByFrtShipper(java.lang.String, boolean)
     */
    public List<? extends SelectListItemDomain> searchTwInvPltzOnRegisterByFrtShipper(String dscId, boolean addBlank)
        throws ApplicationException {
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setDscId(dscId);
        // Get FRT shipper data.
        // FRT Shipperの取得
        List<? extends W6001DocPltzDomain> pltzList = w6001DocDao.searchTwInvPltzByShipper(criteria);
        // Set data to the  pull down list.
        // プルダウンリストに格納
        List<SelectListItemDomain> pulldownList = new ArrayList<SelectListItemDomain>();
        if (addBlank){
            SelectListItemDomain bean = new SelectListItemDomain();
            bean.setId(StringUtils.EMPTY);
            bean.setName(StringUtils.EMPTY);
            pulldownList.add(bean);
        }
        for (W6001DocPltzDomain pltzDomain : pltzList) {
            SelectListItemDomain bean = new SelectListItemDomain();
            
            bean.setId(pltzDomain.getShipperCd());
            bean.setName(pltzDomain.getShipperCd());
            
            pulldownList.add(bean);
        }
        return pulldownList;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchTwInvPltzOnRegisterByFrtConsignee(String, String, boolean)
     */
    public List<? extends SelectListItemDomain> searchTwInvPltzOnRegisterByFrtConsignee(String dscId, String grpNo1, boolean addBlank)
        throws ApplicationException {
       
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setGrpNo1(grpNo1);
        
        // Get FRT Consignee data.
        // FRT Consigneeの取得
        List<? extends W6001DocPltzDomain> pltzList = w6001DocDao.searchTwInvPltzByConsignee(criteria);
        // Set data to the pull down list.
        // プルダウンリストに格納
        List<SelectListItemDomain> pulldownList = new ArrayList<SelectListItemDomain>();
        if (addBlank){
            SelectListItemDomain bean = new SelectListItemDomain();
            bean.setId(StringUtils.EMPTY);
            bean.setName(StringUtils.EMPTY);
            pulldownList.add(bean);
        }
        // Consignee
        for (W6001DocPltzDomain pltzDomain : pltzList) {
            if (StringUtils.isNotEmpty(pltzDomain.getConsigneeCd())) {
                SelectListItemDomain bean = new SelectListItemDomain();
                bean.setId(pltzDomain.getConsigneeCd());
                bean.setName(pltzDomain.getConsigneeCd());
                
                pulldownList.add(bean);
            }
        }
        String[] chkList = new String[pulldownList.size()];
        for (int i = 0; i < pulldownList.size(); i++) {
            chkList[i] = pulldownList.get(i).getId();
        }
        // ship to comp
        for (W6001DocPltzDomain pltzDomain : pltzList) {
            if (StringUtils.isNotEmpty(pltzDomain.getShipToCompCd())) {
                if (!Arrays.asList(chkList).contains(pltzDomain.getShipToCompCd())) {
                    SelectListItemDomain bean = new SelectListItemDomain();
                    bean.setId(pltzDomain.getShipToCompCd());
                    bean.setName(pltzDomain.getShipToCompCd());
                    
                    pulldownList.add(bean);
                }
            }
        }
        return pulldownList;
    }
    
    // 2015/1/19 DNJP.Kawamura UT038対応 START >>>>>
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchTwInvPltzOnRegisterByFrtConsignee(String, String, boolean)
     */
    public String searchTwInvPltzOnRegisterByFrtConsigneeForDefault(String dscId, String grpNo1)
        throws ApplicationException {
       
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setGrpNo1(grpNo1);
        
        // Get FRT Consignee data.
        // FRT Consigneeの取得
        List<? extends W6001DocPltzDomain> pltzList = w6001DocDao.searchTwInvPltzByConsignee(criteria);

        // ship to comp
        String frtConsignee = null;
        for (W6001DocPltzDomain pltzDomain : pltzList) {
            if (StringUtils.isNotEmpty(pltzDomain.getShipToCompCd())) {
                frtConsignee = pltzDomain.getShipToCompCd();
            }
        }
        return frtConsignee;
    }
    // 2015/1/19 DNJP.Kawamura UT038対応 END <<<<<
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchTwInvOnRegisterByInvTmpNo(String, String, String, boolean, String)
     */
    // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) START >>>>>
//    public List<? extends SelectListItemDomain> searchTwInvOnRegisterByInvTmpNo(String dscId, String compCd, String grpNo2, boolean addBlank, String attr)
//        throws ApplicationException {
    public List<? extends SelectListItemDomain> searchTwInvOnRegisterByInvTmpNo(String dscId, String compCd, String shipperCd, String invoiceCtgry, String grpNo2, boolean addBlank, String attr)
        throws ApplicationException {
    // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) END <<<<<
        
        List<SelectListItemDomain> pulldownList = new ArrayList<SelectListItemDomain>();
        
        if (!GRP_NO2_MAIN.equals(grpNo2)) {
            SelectListItemDomain bean = new SelectListItemDomain();
            bean.setId(StringUtils.EMPTY);
            bean.setName(StringUtils.EMPTY);
            pulldownList.add(bean);
            
            return pulldownList;
        }
        
        Date aplyStrtDt = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(compCd)), Calendar.DAY_OF_MONTH);
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setAplyStrtDt(aplyStrtDt);
        criteria.setDscId(dscId);
        // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) START >>>>>
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceCtgry(invoiceCtgry);
        // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) END <<<<<

        // Get invoice template no data.
        // Inv. Template No.の取得
        List<? extends W6001DocDomain> docList = w6001DocDao.searchTmInvTplShipTo(criteria);
        // Set data to the pull down list.
        // プルダウンリストに格納
        if (addBlank){
            SelectListItemDomain bean = new SelectListItemDomain();
            bean.setId(StringUtils.EMPTY);
            bean.setName(StringUtils.EMPTY);
            pulldownList.add(bean);
        }
        for (W6001DocDomain docDomain : docList) {
            
            // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//            if (ATTR_INV_TPL_NO.equals(attr)) {
            // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
            SelectListItemDomain bean = new SelectListItemDomain();
            bean.setId(docDomain.getDocNo());
            bean.setName(docDomain.getDocNo());
            pulldownList.add(bean);
            // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//            } else if (ATTR_FREE_1_DISP_FLG.equals(attr)) {
//                SelectListItemDomain bean = new SelectListItemDomain();
//                bean.setId(docDomain.getFree1DispFlg());
//                bean.setName(docDomain.getFree1DispFlg());
//                pulldownList.add(bean);
//            } else if (ATTR_FREE_2_DISP_FLG.equals(attr)) {
//                SelectListItemDomain bean = new SelectListItemDomain();
//                bean.setId(docDomain.getFree2DispFlg());
//                bean.setName(docDomain.getFree2DispFlg());
//                pulldownList.add(bean);
//            } else if (ATTR_FREE_3_DISP_FLG.equals(attr)) {
//                SelectListItemDomain bean = new SelectListItemDomain();
//                bean.setId(docDomain.getFree3DispFlg());
//                bean.setName(docDomain.getFree3DispFlg());
//                pulldownList.add(bean);
//            } else if (ATTR_FREE_4_DISP_FLG.equals(attr)) {
//                SelectListItemDomain bean = new SelectListItemDomain();
//                bean.setId(docDomain.getHsCdDispFlg());
//                bean.setName(docDomain.getHsCdDispFlg());
//                pulldownList.add(bean);
//            }
            // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
        }
        return pulldownList;
    }
    
    // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchTwInvOnRegisterByInvTmpNo(String, String, String, boolean, String)
     */
    public W6001DocDomain searchTwInvOnRegisterByInvTmpNoForDefault(String dscId, String compCd, String shipperCd, String invoiceCtgry, String shipToCd, String cmlTyp)
        throws ApplicationException {

        Date aplyStrtDt = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(compCd)), Calendar.DAY_OF_MONTH);
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setAplyStrtDt(aplyStrtDt);
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceCtgry(invoiceCtgry);
        criteria.setShipToCd(shipToCd);
        criteria.setCmlTyp(cmlTyp);
        // Get Inv. Template No. Corresponding to the search criteria.
        // Inv. Template No.の取得
        return w6001DocDao.searchTmInvTplShipToForDefault(criteria);
    }    
    // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchTwInvOnRegisterByInvTmpNo(String, String, String, boolean, String)
     */
    // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//    public List<? extends SelectListItemDomain> searchTwInvOnRegisterByInvTmpNo(String dscId, String compCd, String frtShipperCd, String shipToCd, String cmlTyp, boolean addBlank, String attr)
//        throws ApplicationException {
    public List<? extends SelectListItemDomain> searchTwInvOnRegisterByInvTmpNoForFrt(String dscId, String compCd, String frtShipperCd, boolean addBlank, String attr)
        throws ApplicationException {
    // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<

        Date aplyStrtDt = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(compCd)), Calendar.DAY_OF_MONTH);
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setAplyStrtDt(aplyStrtDt);
        criteria.setFrtShipperCd(frtShipperCd);
        // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//        criteria.setShipToCd(shipToCd);
//        criteria.setCmlTyp(cmlTyp);
        // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
        // Get Inv. Template No. Corresponding to the search criteria.
        // Inv. Template No.の取得
        List<? extends W6001DocDomain> docList = w6001DocDao.searchTmInvTplShipToReacquisition(criteria);
        // Set data to the pull down list.
        // プルダウンリストに格納
        List<SelectListItemDomain> pulldownList = new ArrayList<SelectListItemDomain>();
        if (addBlank){
            SelectListItemDomain bean = new SelectListItemDomain();
            bean.setId(StringUtils.EMPTY);
            bean.setName(StringUtils.EMPTY);
            pulldownList.add(bean);
        }
        for (W6001DocDomain docDomain : docList) {
            // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//            if (ATTR_INV_TPL_NO.equals(attr)) {
            // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
            SelectListItemDomain bean = new SelectListItemDomain();
            bean.setId(docDomain.getDocNo());
            bean.setName(docDomain.getDocNo());
            pulldownList.add(bean);
            // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//            } else if (ATTR_FREE_1_DISP_FLG.equals(attr)) {
//                SelectListItemDomain bean = new SelectListItemDomain();
//                bean.setId(docDomain.getFree1DispFlg());
//                bean.setName(docDomain.getFree1DispFlg());
//                pulldownList.add(bean);
//            } else if (ATTR_FREE_2_DISP_FLG.equals(attr)) {
//                SelectListItemDomain bean = new SelectListItemDomain();
//                bean.setId(docDomain.getFree2DispFlg());
//                bean.setName(docDomain.getFree2DispFlg());
//                pulldownList.add(bean);
//            } else if (ATTR_FREE_3_DISP_FLG.equals(attr)) {
//                SelectListItemDomain bean = new SelectListItemDomain();
//                bean.setId(docDomain.getFree3DispFlg());
//                bean.setName(docDomain.getFree3DispFlg());
//                pulldownList.add(bean);
//            } else if (ATTR_FREE_4_DISP_FLG.equals(attr)) {
//                SelectListItemDomain bean = new SelectListItemDomain();
//                bean.setId(docDomain.getHsCdDispFlg());
//                bean.setName(docDomain.getHsCdDispFlg());
//                pulldownList.add(bean);
//            }
            // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
        }
        return pulldownList;
    }
    
    // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
    // 引数のdscIdは使わないので、削除する
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchTwInvOnRegisterByInvTmpNo(String, String, String, boolean, String)
     */
    public W6001DocDomain searchTwInvOnRegisterByInvTmpNoForFrtForDefault(String dscId, String compCd, String frtShipperCd, String shipToCd, String cmlTyp)
        throws ApplicationException {

        Date aplyStrtDt = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(compCd)), Calendar.DAY_OF_MONTH);
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setAplyStrtDt(aplyStrtDt);
        criteria.setFrtShipperCd(frtShipperCd);
        criteria.setShipToCd(shipToCd);
        criteria.setCmlTyp(cmlTyp);
        
        // Get Inv. Template No. Corresponding to the search criteria.
        // Inv. Template No.の取得
        return w6001DocDao.searchTmInvTplShipToReacquisitionForDefault(criteria);
    }
    // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchTwInvPltzByShipperCd(String, boolean)
     */
    public List<? extends SelectListItemDomain> searchTwInvPltzByShipperCd(String dscId, boolean addBlank)
        throws ApplicationException {
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setDscId(dscId);
        // Get the Shipper information corresponding to the search condition.
        // Shipper取得
        List<? extends W6001DocPltzDomain> docPltzList = w6001DocDao.searchTwInvPltzByShipperCd(criteria);
        // Set data to the pull down list.
        // プルダウンリストに格納
        List<SelectListItemDomain> pulldownList = new ArrayList<SelectListItemDomain>();
        if (addBlank){
            SelectListItemDomain bean = new SelectListItemDomain();
            bean.setId(StringUtils.EMPTY);
            bean.setName(StringUtils.EMPTY);
            pulldownList.add(bean);
        }
        for (W6001DocPltzDomain docPltzDomain : docPltzList) {
            SelectListItemDomain bean = new SelectListItemDomain();
            
            bean.setId(docPltzDomain.getShipperCd());
            bean.setName(docPltzDomain.getShipperCd());
            
            pulldownList.add(bean);
        }
        return pulldownList;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchToolTipOnInvoiceGrouping(java.lang.String, java.lang.String)
     */
    public List<String> searchToolTipOnInvoiceGrouping (String dscId, String customTimingTyp) 
        throws ApplicationException {

        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setCustomTimingTyp(customTimingTyp);
        // Get operation no.
        // Operation No検索
        List<? extends W6001DocPltzDomain> docPltzList = w6001DocDao.searchTwInvPltzByOperationNo(criteria);
        
        List<String> operationNoList = new ArrayList<String>();
        for (W6001DocPltzDomain docPltzDomain : docPltzList) {
            operationNoList.add(docPltzDomain.getOperationNo());
        }
        return operationNoList;
    }
    
    /**
     * {@inheritDoc}
     * 
     * <pre>
     * Conversion and the addition from work at the time of the W6009 initial display.
     * Unit conversion and adding only on memory.
     * W6009Register時の単位変換前のワーク検索。
     * メモリ上でのみ単位変換および足しあげを行う。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchOnRegisterInitByFromDetail(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public List<? extends W6001DocInvoiceDomain> searchOnRegisterInitByFromDetail(W6001DocCriteriaDomain criteria)
        throws ApplicationException {

        // ST959 UNIT CONVERSION MOD START
        //return w6001DocDao.searchTwInvByRegisterInit(criteria);

        List<? extends W6001DocInvoiceDomain> result = w6001DocDao.searchTwInvByRegisterInit(criteria);
        if (result.size() != 1) {
            return result;
        }
        W6001DocInvoiceDomain invoiceDomain = result.get(0);

        // Search Shipper unit.
        // シッパー単位系の検索
        VtCompMeasureUnitDomain vtCompMeasureUnitDomain
            = commonService.searchMeasureUnit(criteria.getShipperCd());

        // Conversion unit of Shipper
        // シッパーの単位系へ変換

        BigDecimal totalVolume = new BigDecimal(0);
        BigDecimal totalGrossWeight = new BigDecimal(0);
        BigDecimal totalNetWeight = new BigDecimal(0);
        for (W6001DocPltzDomain pltzDomain : invoiceDomain.getDocPltzList()) {

            // Volume
            BigDecimal convertedVolume
                = commonService.convertWeightUnitNoOverflowCheck(
                    pltzDomain.getVolume(), pltzDomain.getVolumeUnit(), vtCompMeasureUnitDomain.getVolumeUnit()
                );
            pltzDomain.setVolume(convertedVolume);
            pltzDomain.setVolumeUnit(vtCompMeasureUnitDomain.getVolumeUnit());
            totalVolume = totalVolume.add(convertedVolume);
            // G/W
            BigDecimal convertedGrossWeight
                = commonService.convertWeightUnitNoOverflowCheck(
                    pltzDomain.getGrossWeight(), pltzDomain.getWeightUnit(), vtCompMeasureUnitDomain.getWeightUnit()
                );
            pltzDomain.setGrossWeight(convertedGrossWeight);
            totalGrossWeight = totalGrossWeight.add(convertedGrossWeight);

            // N/W
            // In the case of the main invoice, and priority to the response, convert the N/W of palletizing.
            // メインインボイスの場合、レスポンスを重視し、パレタイズのN/Wを足しあげる。
            if (GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {
                BigDecimal convertedNetWeight
                    = commonService.convertWeightUnitNoOverflowCheck(
                        pltzDomain.getNetWeight(), pltzDomain.getWeightUnit(), vtCompMeasureUnitDomain.getWeightUnit()
                    );
                pltzDomain.setNetWeight(convertedNetWeight);
                pltzDomain.setWeightUnit(vtCompMeasureUnitDomain.getWeightUnit());
                totalNetWeight = totalNetWeight.add(convertedNetWeight);

            // In the case of FRT invoice, convert N/W of the part number.
            // FRTインボイスの場合、品番のN/Wを足しあげる。
            } else {
                for (W6001DocPltzItemDomain itemDomain : pltzDomain.getDocPltzItemList()) {
                    BigDecimal itemNetWeight = itemDomain.getItemWeight().multiply(itemDomain.getQty());
                    BigDecimal convertedItemNetWeight
                        = commonService.convertWeightUnitNoOverflowCheck(
                            itemNetWeight, itemDomain.getWeightUnit(), vtCompMeasureUnitDomain.getWeightUnit()
                        );
                    itemDomain.setNetWeight(convertedItemNetWeight);
                    itemDomain.setWeightUnit(vtCompMeasureUnitDomain.getWeightUnit());
                    totalNetWeight = totalNetWeight.add(convertedItemNetWeight);
                }
            }

            pltzDomain.setWeightUnit(vtCompMeasureUnitDomain.getWeightUnit());
        }
        // In order to display even if the overflow exception is not thrown.
        // オーバーフローしても表示するため、例外はスローしない。
        if (commonService.isVolumeOverflow(totalVolume)) {
            invoiceDomain.setTotalVolumeOverflowFlg(FLAG_Y);
        }
        invoiceDomain.setTotalVolume(totalVolume);
        invoiceDomain.setVolumeUnit(vtCompMeasureUnitDomain.getVolumeUnit());
        if (commonService.isWeightOverflow(totalGrossWeight)) {
            invoiceDomain.setTotalGrossWeightOverflowFlg(FLAG_Y);
        }
        invoiceDomain.setTotalGrossWeight(totalGrossWeight);
        if (commonService.isWeightOverflow(totalNetWeight)) {
            invoiceDomain.setTotalNetWeightOverflowFlg(FLAG_Y);
        }
        invoiceDomain.setTotalNetWeight(totalNetWeight);
        invoiceDomain.setWeightUnit(vtCompMeasureUnitDomain.getWeightUnit());

        return result;
        // ST959 UNIT CONVERSION MOD END
    }

    /**
     * Search from work after unit conversion reflect at the time of W6009Register.<br />
     * 
     * <pre>
     * Search from work after unit conversion reflect at the time of W6009Register.
     * Due to the search for work after unit conversion reflects, and obtains a simple sum total of the Volume, N/W, G/W.
     * W6009Register時の単位変換反映後のワーク検索。
     * 単位変換反映後のワークを検索しているため、Volume、N/W、G/Wを単純加算し合計を求める。
     * </pre>
     * 
     * ST959 UNIT CONVERSION ADD
     * 
     * @param criteria search condition
     * @return search result
     * @throws ApplicationException business exception
     */
    protected List<? extends W6001DocInvoiceDomain> searchOnRegisterByFromDetail(W6001DocCriteriaDomain criteria)
        throws ApplicationException {

        List<? extends W6001DocInvoiceDomain> result = w6001DocDao.searchTwInvByRegisterInit(criteria);
        if (result.size() != 1) {
            return result;
        }
        W6001DocInvoiceDomain invoiceDomain = result.get(0);

        BigDecimal totalVolume = new BigDecimal(0);
        BigDecimal totalGrossWeight = new BigDecimal(0);
        BigDecimal totalNetWeight = new BigDecimal(0);
        String volumeUnit = null;
        String weightUnit = null;
        for (W6001DocPltzDomain pltzDomain : invoiceDomain.getDocPltzList()) {
            if (GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {
                // Vol., G/W Setting of the case of the main invoice only.
                // Vol.、G/Wの設定はメインインボイスの場合のみ
                totalVolume = totalVolume.add(pltzDomain.getVolume());
                totalGrossWeight = totalGrossWeight.add(pltzDomain.getGrossWeight());
                if (volumeUnit == null) {
                    volumeUnit = pltzDomain.getVolumeUnit();
                    weightUnit = pltzDomain.getWeightUnit();
                }
            }
            for (W6001DocPltzItemDomain itemDomain : pltzDomain.getDocPltzItemList()) {
                totalNetWeight = totalNetWeight.add(itemDomain.getNetWeight());
                if (weightUnit == null) {
                    weightUnit = itemDomain.getWeightUnit();
                }
            }
        }
        if (GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {
            // Vol., G/W Setting of the case of the main invoice only.
            // Vol.、G/Wの設定はメインインボイスの場合のみ
            if (commonService.isVolumeOverflow(totalVolume)) {
                Object[] params = { commonService.getResource(criteria.getLocale(), "label.totalVolume") };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
            invoiceDomain.setTotalVolume(totalVolume);
            invoiceDomain.setVolumeUnit(volumeUnit);
            if (commonService.isWeightOverflow(totalGrossWeight)) {
                Object[] params = { commonService.getResource(criteria.getLocale(), "label.totalGrossWeight") };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
            invoiceDomain.setTotalGrossWeight(totalGrossWeight);
        }
        if (commonService.isWeightOverflow(totalNetWeight)) {
            Object[] params = { commonService.getResource(criteria.getLocale(), "label.totalNetWeight") };
            throw new GscmApplicationException(NXS_E7_0157, params);
        }
        invoiceDomain.setTotalNetWeight(totalNetWeight);
        invoiceDomain.setWeightUnit(weightUnit);

        return result;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#searchOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public W6001DocInvoiceDomain searchOnRegisterInitByFromMain(
        W6001DocCriteriaDomain criteria) throws ApplicationException {

        return w6001DocDao.searchTtInvoiceByRegister(criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseCigmaAvailable(java.lang.String, java.lang.String)
     */
    public String validateDatabaseCigmaAvailable(String compCd, String CmlType) throws ApplicationException {
        if (CML_TYPE_CIGMA.equals(CmlType)) {
            try {
                commonService.searchCigmaNightFlg(compCd);
                if (!commonService.searchCigmaAvailable(false, compCd)) {
                    return NXS_E1_0060;
                }
            } catch (SystemException e) {
                if (e.getCode().equals(GSCM_E0_0001)) {
                    return NXS_E7_0075;
                } else {
                    if (e.getCode().equals(NXS_91_0001)) {
                        return NXS_E1_0060;
                    }
                }
                throw e;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseCigmaAvailable(String, String, Void)
     */
    public String validateDatabaseCigmaAvailable(String dscId, String shipperCd, Void obj)
        throws ApplicationException {

        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        docCriteria.setDscId(dscId);
        docCriteria.setShipperCd(shipperCd);
        // Get the check CIGMA products corresponding to the search criteria if they were included.
        // インボイス作成対象パレタイズワーク検索
        int cnt = w6001DocDao.searchTwInvPltzByCigmaCheck(docCriteria);

        if (cnt > 0) {
            return validateDatabaseCigmaAvailable(shipperCd, CML_TYPE_CIGMA);
        }
        return null;
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyNotifyPartyNameNotifyPartyAddress(String
     *      notifyPatyNm, String notifyPatyAdd)
     */
    public boolean validateConsistencyNotifyPartyNameNotifyPartyAddress(String notifyPatyNm, String notifyPatyAdd, boolean selectFlg) 
        throws ApplicationException {
        if(selectFlg) {
            if (StringUtils.isNotEmpty(notifyPatyNm) && StringUtils.isNotEmpty(notifyPatyAdd)) {
                return true;
            }
        } else {
            if (StringUtils.isEmpty(notifyPatyNm) && StringUtils.isEmpty(notifyPatyAdd) 
                || StringUtils.isNotEmpty(notifyPatyNm) && StringUtils.isNotEmpty(notifyPatyAdd)) {
                return true;
            }
        }
        return false;

    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencyNotifyPartySelect(String
     *      notifyPatyCompCd, String notifyPatyCompNmAbb, String notifyPatyNm, String notifyPatyAdd)
     */
    public boolean validateConsistencyNotifyPartySelect(String notifyPatyCompCd, String notifyPatyCompNmAbb, String notifyPatyNm, String notifyPatyAdd) 
        throws ApplicationException {
        if (StringUtils.isEmpty(notifyPatyNm) && StringUtils.isEmpty(notifyPatyAdd)) {
            return true;
        }
        return false;

    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateConsistencySpecialInformation(java.lang.String, java.lang.Integer, java.lang.Integer)
     */
    public boolean validateConsistencySpecialInformation(String spInfo, Integer lineMax, Integer rowMax)
        throws ApplicationException {
        
        String[] spInfoArr = spInfo.split(LINE_SEPARATOR, -1);
        
        if (spInfoArr.length > rowMax) {
            return false;
        }
        
        for(String str : spInfoArr) {
            if (str.length() > lineMax) {
                return false;
            }
        }
        
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#transactOnRegister(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public W6001DocInvoiceDomain transactOnRegister(W6001DocCriteriaDomain criteria) 
        throws ApplicationException {
        
        W6001DocInvoiceDomain invoiceDomainForCalcAmount = calculateAmount(criteria);
        // 2015/3/11 DNJP.Kawamura VATがセットされない不具合対応 START >>>>>
        criteria.setVat(invoiceDomainForCalcAmount.getVat());
        // 2015/3/11 DNJP.Kawamura VATがセットされない不具合対応 END <<<<<
        criteria.setSubTotal(invoiceDomainForCalcAmount.getSubTotal());
        criteria.setTotalInvoiceAmount(invoiceDomainForCalcAmount.getTotalInvoiceAmount());
        
        // Create a temporary Invoice data (= officially registered before).
        // 仮（＝正式登録前）のインボイスデータを作成する。
        W6001DocInvoiceDomain docInvoiceDomain = transactOnRegisterByRegistTwInvoice(criteria);

        if (null != docInvoiceDomain) {
            if (!GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {
                docInvoiceDomain.setDispInvoiceIssueDt(null);
            }
            return docInvoiceDomain;
        }
        // Register a regular Invoice No.
        // 正規インボイスNo登録
        return transactOnRegisterByRegistTtInvoice(criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#transactOnRegisterCancel(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public W6001DocInvoiceDomain transactOnRegisterCancel(W6001DocCriteriaDomain criteria) 
        throws ApplicationException {
        // Get acquisition of Invoice No cancellation numbering object data.
        // キャンセルインボイスNo採番対象データの取得
        List<? extends TtInvoiceDomain> ttInvoiceList =  searchTtInvoiceOnRegisterByCancel(criteria.getShipperCd()
            , criteria.getInvoiceNo(), criteria.getInvoiceIssueDt());
        // Numbered cancel invoice no. 
        // キャンセルインボイスNoの採番
        List<String> cancelInvNoList = transactSequenceCancelInvNo(criteria, ttInvoiceList);
        // Registered in the table, the data were numbered Cancel Invoice No.
        // キャンセルデータの登録
        List<? extends TtInvoiceDomain> createinvoiceList = createCancelInvoiceNoOnRegister(ttInvoiceList, cancelInvNoList, criteria);
        
        // 2017/12/20 MOD START FindBugs対応。searchByConditionの結果なのでnullはあり得ない。
        //if (ttInvoiceList != null && !ttInvoiceList.isEmpty()) {
        if (!ttInvoiceList.isEmpty()) {
        // 2017/12/20 MOD END
            //  Add to the temporary stock.
            // 仮在庫の加算
            updateTtTmpStockOnRegisterByQtyAdd(ttInvoiceList.get(0), criteria);
            // Subtraction SHIPPED QUANTITY, the number of times the shipping instruction.
            // 出荷数量、出荷指示回数の減算
            updateTtExpRcvOdrOnRegisterSubtract(ttInvoiceList.get(0), criteria);
            // Set Invoice No. Palletize of the table, a change of Palletize STATUS.
            // パレタイズのインボイスNo、パレタイズステータス更新
            updateTtPltzOnRegisterbyCancel(ttInvoiceList.get(0), criteria);
        }

        // UT453 ADD START
        // If CIGMA part exists.
        // CIGMA品がある場合のみ。
        boolean containsCigmaParts = false;
        for (TtInvoiceDomain ttInvDomain : ttInvoiceList) {
            if (CML_TYPE_CIGMA.equals(ttInvDomain.getCmlTyp())) {
                containsCigmaParts = true;
                break;
            }
        }
        if (containsCigmaParts) {
        // UT453 ADD END

            // Cancel the CIGMA, perform the sales and orders and stock data.
            // Webサービス呼出し(売上・受注・在庫のキャンセル)
            callWebService6002(criteria.getShipperCd(), createinvoiceList);
            
            // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 START >>>>>
            // Judgment of InvoiceDB processing. 
            // CIGMA環境原単位の取得（InvoicdDB用処理要否判断）
            TmCigmaEnvCriteriaDomain tmCigmaEnvCriteriaDomain = new TmCigmaEnvCriteriaDomain();
            tmCigmaEnvCriteriaDomain.setCompCd(criteria.getShipperCd());
            TmCigmaEnvDomain tmCigmaEnvDomain
                = tmCigmaEnvService.searchByKey(tmCigmaEnvCriteriaDomain);
    
            // call 6006 WebService 
            // 処理要の場合のみ6006のWebserviceを呼ぶ
            if (FLAG_Y.equals(tmCigmaEnvDomain.getInvDbFlg())) {
                // get OGC code
                // NEXUS会社原単位の取得（OGC code）
                TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
                tmNxsCompCriteriaDomain.setCompCd(criteria.getShipperCd());
                TmNxsCompDomain tmNxsComp = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
    
                // Set data to CIGMA(InvoiceDB).
                // CIGMA(InvoiceDB)への書き込み
                // ST144対応
                // callWebService6006(criteria.getOwnerCompCd(), createinvoiceList, tmCigmaEnvDomain, tmNxsComp);
                callWebService6006(criteria.getShipperCd(), createinvoiceList, tmCigmaEnvDomain, tmNxsComp);
    
            }
            // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 END <<<<<
        }

        // 2014/12/22 DNJP.Kawamura UT029対応 START >>>>>
        criteria.setInvoiceNo(createinvoiceList.get(0).getInvoiceNo());
        criteria.setInvoiceIssueDt(createinvoiceList.get(0).getInvoiceIssueDt());
        // 2014/12/22 DNJP.Kawamura UT029対応 END <<<<<
        
        // AI-JB キュー登録
        String requestId = commonService.createRequestJob(SCREEN_ID_W6009);
        List<TtOnlineReqJobParamDomain> reqJobList
            = new ArrayList<TtOnlineReqJobParamDomain>();
        TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
            = new TtOnlineReqJobParamDomain();
        // 1件目
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
        ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
        ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_INVOICE);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W6009);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        // 2件目
        BigDecimal brch = new BigDecimal(2);
        for (TtInvoiceDomain domain : createinvoiceList) {
            ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
            ttOnlineReqJobParamcriteria.setRequestId(requestId);
            ttOnlineReqJobParamcriteria.setBrch(brch);
            ttOnlineReqJobParamcriteria.setParamNm(KEY);
            ttOnlineReqJobParamcriteria.setParamValue01(domain.getShipperCd());
            ttOnlineReqJobParamcriteria.setParamValue02(domain.getInvoiceNo());
            String formatDate = new SimpleDateFormat("yyyyMMddHHmmss").format(domain.getInvoiceIssueDt());
            ttOnlineReqJobParamcriteria.setParamValue03(formatDate);
            ttOnlineReqJobParamcriteria.setParamValue04(FLAG_N);
            ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
            commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W6009);
            reqJobList.add(ttOnlineReqJobParamcriteria);
            brch = brch.add(new BigDecimal(1));
        }
        ttOnlineReqJobParamService.create(reqJobList);

        return  searchOnRegisterInitByFromMain(criteria);

    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#validateDatabaseTtInvoiceOnRegisterCancel(String
     *      shipperCd, String invoiceNo, Date invoiceIssueDt)
     */
    public String validateDatabaseTtInvoiceOnRegisterCancel(String shipperCd, String invoiceNo, Date invoiceIssueDt) 
        throws ApplicationException {

        TtInvoiceCriteriaDomain criteria = new TtInvoiceCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
       // Get invoice data.
        // インボイス検索
        TtInvoiceDomain ttInvoiceDomain = ttInvoiceService.lockByKeyNoWait(criteria);
        if (FLAG_Y.equals(ttInvoiceDomain.getCancelFlg())) {
            return NXS_E7_0062;
        }

        if (StringUtils.isNotEmpty(ttInvoiceDomain.getShippingActNo())) {
            return NXS_E7_0063;
        }
        return null;
    }

    /**
     * Get the Invoice created for part number work.
     * <br />インボイス作成対象品番ワークを取得します。
     * <pre>
     * - Invoice created for work Part Search TwInvItemCriteriaDomain Set the following items,
     *   Call TwInvItemService.SearchByCondition (TwInvItemCriteriaDomain).
     *     - Login DSC-ID
     *     - SHIPPER CODE
     *     - Group No.first
     *     - Group No.sec
     *     - REMOVEFLG: N
     * </pre>
     * <pre>
     * ‐インボイス作成対象品番ワーク検索
     *     {@link TwInvItemCriteriaDomain}に以下の項目を設定し、
     *     {@link TwInvItemService#searchByCondition(TwInvItemCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     *       ‐荷主コード
     *       ‐Group No.first
     *       ‐Group No.sec
     *       ‐REMOVEFLG：N
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param grpNo1 Group No.first
     * @param grpNo2 Group No.sec
     * @param mainMark CML No.
     * @return Invoice created for work Part list obtained<br />
     * 取得したインボイス作成対象品番ワークリスト
     * @throws ApplicationException Acquisition of the Invoice Number created for work can not be<br />
     * インボイス作成対象品番ワークの取得ができない場合
     */
    public List<? extends TwInvItemDomain> searchTwInvItemOnRegister(String dscId, String shipperCd
        , String grpNo1, String grpNo2, String mainMark) 
        throws ApplicationException {
        
        TwInvItemCriteriaDomain twInvItemCriteria = new TwInvItemCriteriaDomain();
        twInvItemCriteria.setDscId(dscId);
        twInvItemCriteria.setShipperCd(shipperCd);
        twInvItemCriteria.setGrpNo1(grpNo1);
        twInvItemCriteria.setGrpNo2(grpNo2);
        twInvItemCriteria.setMainMark(mainMark);
        twInvItemCriteria.setRemoveFlg(FLAG_N);
        
        return twInvItemService.searchByCondition(twInvItemCriteria);
    }
    
    // --- Inner methods ---
    // UT186 ZIP DOWNLOAD DEL
    /**
     * 
     * Get Documentation data.
     * 
     * @param shipperCd shipper code
     * @param invoiceNo invoice no
     * @param invoiceIssueDt invoice issue date
     * @return get documentation data(File)
     * @throws ApplicationException ApplicationException
     */
//    protected File searchFileDataOnMainByPrintDocument(String shipperCd, String invoiceNo, Date invoiceIssueDt)
//        throws ApplicationException {
//        // Get file id.
//        W6001DocInvoiceDomain domain = searchTtInvoiceOnRegisterByFileId(shipperCd, invoiceNo, invoiceIssueDt);
//        
//        if (domain == null
//            || (StringUtils.isEmpty(domain.getInvoiceHeaderFileId())
//                && StringUtils.isEmpty(domain.getPackingHeadFileId())
//                && StringUtils.isEmpty(domain.getScHeaderFileId()))) {
//            throw new GscmApplicationException(NXS_E7_0064);
//        }
//
//        List<InputStream> fileStreamList = new ArrayList<InputStream>();
//        // Get invoice header data.
//        // インボイスヘッダ
//        if (StringUtils.isNotEmpty(domain.getInvoiceHeaderFileId())) {
//            InputStream fileStream = getFileDataStream(domain.getInvoiceHeaderFileId());
//            if (fileStream != null) {
//                fileStreamList.add(fileStream);
//            }
//        }
//        // Get packing header data.
//        // パッキングヘッダ
//        if (StringUtils.isNotEmpty(domain.getPackingHeadFileId())) {
//            InputStream fileStream = getFileDataStream(domain.getPackingHeadFileId());
//            if (fileStream != null) {
//                fileStreamList.add(fileStream);
//            }
//        }
//        // Get sales contract header data.
//        // セールスコントラクトヘッダ
//        if (StringUtils.isNotEmpty(domain.getScHeaderFileId())) {
//            InputStream fileStream = getFileDataStream(domain.getScHeaderFileId());
//            if (fileStream != null) {
//                fileStreamList.add(fileStream);
//            }
//        }
//        // Merge PDF file data.
//        if (!fileStreamList.isEmpty()) {
//            return  commonService.mergePdf(invoiceNo + EXT_PDF, fileStreamList.toArray(new InputStream[0]));
//        } else {
//            throw new GscmApplicationException(NXS_E7_0064);
//        }
//    }
    
    /**
     * Registration of W6002 4.1.1 Re-Invoice (Invoice update)
     * <br />W6002 4.1.1 Re-Invoiceの登録(インボイス更新)
     * <pre>
     * With the name of the TtInvoiceCriteriaDomain,
     *   Call TtInvoiceService # UpdateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * TtInvoiceCriteriaDomainを引数にして、{@link
     *      TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param invoiceCtgryNm Invoice Category Name 
     * @param freightResponsibleNm Freight Responsible Name
     * @param payMethNm Payment Methods Name
     * @param invoiceIssuerNm Invoice Issuer Name
     * @return update count
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected int updateTtInvoice2_411(W6001DocCriteriaDomain criteria, String invoiceCtgryNm, String freightResponsibleNm
        , String payMethNm, String invoiceIssuerNm) 
        throws ApplicationException {

        W6001DocCriteriaDomain updateCriteria = new W6001DocCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(updateCriteria, criteria);
        // It sets to zero instead of NULL in numeric fields no input.
        // 入力のない数値項目にはNULLでなくゼロを設定する。
        nullToZeroNumericPropertiesForHeader(updateCriteria); // ST948 ADD

        // ST946 MANUAL SCREEN TRANSITION MOD START
        //updateCriteria.setKeyShipperCd(criteria.getShipperCd());
        //updateCriteria.setKeyInvoiceNo(criteria.getInvoiceNo());
        //updateCriteria.setKeyInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        updateCriteria.setKeyShipperCd(criteria.getTakeOverShipperCd());
        updateCriteria.setKeyInvoiceNo(criteria.getTakeOverInvoiceNo());
        updateCriteria.setKeyInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END
        
        updateCriteria.setKeyDeleteFlg(FLAG_N);

        updateCriteria.setManualFlg(FLAG_Y);
        updateCriteria.setCancelInvoiceNo(StringUtils.EMPTY);
        //updateCriteria.setParInvoiceNo(criteria.getTakeOverParInvoiceNo()); // ST946 MANUAL SCREEN TRANSITION DEL
        updateCriteria.setInvoiceCtgryNm(invoiceCtgryNm);
        updateCriteria.setFreightResponsibleNm(freightResponsibleNm);
        //updateCriteria.setPayMethNm(payMethNm);
        updateCriteria.setPayMethNm(StringUtil.getEmptyToBlank(payMethNm)); // ST948 MOD
        updateCriteria.setInvoiceIssuerNm(invoiceIssuerNm);
        updateCriteria.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
        int cnt = w6001DocDao.updateTtInvoiceByKey(updateCriteria);
        if (cnt == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        return cnt;
    }
    /**
     * Registration of W6002 4.1.1 Re-Invoice (Invoice Header Updated)
     * <br />W6002 4.1.1 Re-Invoiceの登録(インボイスヘッダ更新)
     * <pre>
     * With the name of the TtInvoiceHeaderDomain,
     *   Call TtInvoiceHeaderService # UpdateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * TtInvoiceHeaderDomainを引数にして、{@link
     *      TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param invoiceCtgryNm nvoice Category Name 
     * @param freightResponsibleNm Freight Responsible Name
     * @param payMethNm Payment Methods Name
     * @param fileId_UploadInvoiceFile File ID of Upload Invoice File<br />
     * Upload Invoice File のFile ID
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void updateTtInvoiceHeader2_411(W6001DocCriteriaDomain criteria, 
                                    String invoiceCtgryNm, 
                                    String freightResponsibleNm, 
                                    String payMethNm,
                                    String fileId_UploadInvoiceFile) throws ApplicationException {

        W6001DocCriteriaDomain updateCriteria = new W6001DocCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(updateCriteria, criteria);
        // It sets to zero instead of NULL in numeric fields no input.
        // 入力のない数値項目にはNULLでなくゼロを設定する。
        nullToZeroNumericPropertiesForHeader(updateCriteria); // ST948 ADD

        // ST946 MANUAL SCREEN TRANSITION MOD START
        //updateCriteria.setKeyShipperCd(criteria.getShipperCd());
        //updateCriteria.setKeyInvoiceNo(criteria.getInvoiceNo());
        //updateCriteria.setKeyInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        updateCriteria.setKeyShipperCd(criteria.getTakeOverShipperCd());
        updateCriteria.setKeyInvoiceNo(criteria.getTakeOverInvoiceNo());
        updateCriteria.setKeyInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END
        
        updateCriteria.setKeyDeleteFlg(FLAG_N);

        updateCriteria.setManualFlg(FLAG_Y);
        updateCriteria.setCancelInvoiceNo(StringUtils.EMPTY);
        updateCriteria.setInvoiceCtgryNm(invoiceCtgryNm);
        updateCriteria.setFreightResponsibleNm(freightResponsibleNm);
        //updateCriteria.setPayMethNm(payMethNm);
        updateCriteria.setPayMethNm(StringUtil.getEmptyToBlank(payMethNm)); // ST948 MOD
        updateCriteria.setRemLcTyp(criteria.getRemLcTyp());
        updateCriteria.setFileId(fileId_UploadInvoiceFile);

        w6001DocDao.updateTtInvoiceHeaderByKey(updateCriteria);
    }
    /**
     * Logical delete of W6002 4.1.2 FILE DATA
     * <br />W6002 4.1.2 ファイルデータの論理削除
     * 
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void deletePdfFile2_412(W6001DocCriteriaDomain criteria) 
        throws ApplicationException {
        // Set non DN-G invoice data.
        // Non DN-G Invoice (Invoice No.変更あり)の登録
        // - インボイスのファイル削除(FILE_IDを取得)
        TtInvoiceHeaderCriteriaDomain ttInvoiceHeaderCriteriaDomain = new TtInvoiceHeaderCriteriaDomain();
        ttInvoiceHeaderCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttInvoiceHeaderCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttInvoiceHeaderCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttInvoiceHeaderCriteriaDomain.setDeleteFlg(FLAG_N);
        List<? extends TtInvoiceHeaderDomain> ttInvoiceHeaderList = ttInvoiceHeaderService
            .searchByCondition(ttInvoiceHeaderCriteriaDomain);
        if (ttInvoiceHeaderList != null && ttInvoiceHeaderList.size() > 0) {
            TtInvoiceHeaderDomain ttInvoiceHeader = ttInvoiceHeaderList.get(0);
            
            String fileId = ttInvoiceHeader.getFileId();
            if (StringUtils.isNotEmpty(fileId)) {
                
                try {
                    FileManagementDomain fileInfo = fileManagerServiceForStream.searchFileDownload(fileId, false, null);

                    fileManagerServiceForStream.deleteFile(fileId, fileInfo.getLastUpdateDate(), criteria.getDscId());
                } catch (FileManagementException e) {
                    throw new GscmApplicationException(e.getErrorCode());
                } catch (IOException e) {
                    throw new SystemException(NXS_91_0001);
                }
            }
        }
        
        // Delete packing file.
        // - パッキングのファイル削除(FILE_IDを取得)
        TtPackingHeadCriteriaDomain ttPackingHeadCriteriaDomain = new TtPackingHeadCriteriaDomain();
        ttPackingHeadCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttPackingHeadCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttPackingHeadCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttPackingHeadCriteriaDomain.setDeleteFlg(FLAG_N);
        List<? extends TtPackingHeadDomain> ttPackingHeadList = ttPackingHeadService.searchByCondition(ttPackingHeadCriteriaDomain);
        
        if (ttPackingHeadList != null && ttPackingHeadList.size() > 0) {
            TtPackingHeadDomain ttPackingHead = ttPackingHeadList.get(0);

            String fileId = ttPackingHead.getFileId();
            if (StringUtils.isNotEmpty(fileId)) {
                
                try {
                    FileManagementDomain fileInfo = fileManagerServiceForStream.searchFileDownload(fileId, false, null);
                    
                    fileManagerServiceForStream.deleteFile(fileId, fileInfo.getLastUpdateDate(), criteria.getDscId());
                } catch (FileManagementException e) {
                    throw new GscmApplicationException(e.getErrorCode());
                } catch (IOException e) {
                    throw new SystemException(NXS_91_0001);
                }
            }
        }
    }

    /**
     * Invoice registration in Invoice No. W6002 4.1.2.3 of updated (update)
     * <br />W6002 4.1.2.3 更新後のInvoice No.でのインボイス登録(更新)
     * <pre>
     * With the name of the TtInvoiceCriteriaDomain,
     *   Call TtInvoiceService # UpdateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * TtInvoiceCriteriaDomainを引数にして、{@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @return updateCount
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected int updateTtInvoice2_4123(W6001DocCriteriaDomain criteria) throws ApplicationException {

        W6001DocCriteriaDomain updateCriteria = new W6001DocCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(updateCriteria, criteria);
        // It sets to zero instead of NULL in numeric fields no input.
        // 入力のない数値項目にはNULLでなくゼロを設定する。
        nullToZeroNumericPropertiesForHeader(updateCriteria); // ST948 ADD
        
        updateCriteria.setKeyShipperCd(criteria.getTakeOverShipperCd());
        updateCriteria.setKeyInvoiceNo(criteria.getTakeOverInvoiceNo());
        updateCriteria.setKeyInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        updateCriteria.setKeyDeleteFlg(FLAG_N);
        updateCriteria.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
        
        updateCriteria.setManualFlg(FLAG_Y);
        updateCriteria.setTypeOfInv(MANUAL_TYP_NON_DNG_INVOICE); // ST946 MANUAL SCREEN TRANSITION ADD
        if (!INVOICE_CLASS_FULL_RT.equals(criteria.getClassOfInv())) {
            updateCriteria.setParInvoiceNo(criteria.getInvoiceNo());
        } else {
            updateCriteria.setParInvoiceNo(criteria.getTakeOverParInvoiceNo());
        }
        updateCriteria.setCancelFlg(FLAG_N);
        updateCriteria.setDeleteFlg(FLAG_N);
        
        return w6001DocDao.updateTtInvoiceByKey(updateCriteria);
    }
    /**
     * Invoice Header registration in Invoice No. W6002 4.1.2.4 of the post-update (update)
     * <br />W6002 4.1.2.4 更新後のInvoice No.でのインボイスヘッダ登録(更新)
     * <pre>
     * With the name of the TtInvoiceHeaderDomain,
     *  Call TtInvoiceHeaderService # UpdateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * TtInvoiceHeaderDomainを引数にして、{@link
     *      TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param fileId_UploadInvoiceFile File ID of Upload Invoice File<br />
     * Upload Invoice File のFile ID
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void updateTtInvoiceHeader2_4124(W6001DocCriteriaDomain criteria, String fileId_UploadInvoiceFile) 
        throws ApplicationException {

        W6001DocCriteriaDomain updateCriteria = new W6001DocCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(updateCriteria, criteria);
        // It sets to zero instead of NULL in numeric fields no input.
        // 入力のない数値項目にはNULLでなくゼロを設定する。
        nullToZeroNumericPropertiesForHeader(updateCriteria); // ST948 ADD

        updateCriteria.setKeyShipperCd(criteria.getTakeOverShipperCd());
        updateCriteria.setKeyInvoiceNo(criteria.getTakeOverInvoiceNo());
        updateCriteria.setKeyInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        updateCriteria.setKeyDeleteFlg(FLAG_N);

        updateCriteria.setManualFlg(FLAG_Y);
        updateCriteria.setTypeOfInv(MANUAL_TYP_NON_DNG_INVOICE); // ST946 MANUAL SCREEN TRANSITION ADD
        updateCriteria.setNetAmountCurrCd(criteria.getCurrCd());
        updateCriteria.setFreightCurrCd(criteria.getCurrCd());
        updateCriteria.setInsuranceCurrCd(criteria.getCurrCd());
        updateCriteria.setSubTotalCurrCd(criteria.getCurrCd());
        updateCriteria.setVatCurrCd(criteria.getCurrCd());
        updateCriteria.setHandlingChargeCurrCd(criteria.getCurrCd());
        updateCriteria.setAdditionalChargeCurrCd(criteria.getCurrCd());
        updateCriteria.setTotalInvoiceAmountCurrCd(criteria.getCurrCd());
        updateCriteria.setFileId(fileId_UploadInvoiceFile);
        updateCriteria.setDeleteFlg(FLAG_N);

        w6001DocDao.updateTtInvoiceHeaderByKey(updateCriteria);
    }

    /**
     * Invoice Attached registration in Invoice No. W6002 4.1.2.5 of the post-update (update)
     * <br />W6002 4.1.2.5 更新後のInvoice No.でのインボイスアタッチ登録(更新)
     * <pre>
     * With the name of the TitiaienubuioiceAttachedCriteriaDomain,
     *  Call TtInvoiceAttachedService # UpdateByCondition(TtInvoiceAttachedDomain, TtInvoiceAttachedCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * TtInvoiceAttachedCriteriaDomainを引数にして、{@link
     *      TtInvoiceAttachedService#updateByCondition(TtInvoiceAttachedDomain, TtInvoiceAttachedCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void updateTtInvoiceAttached2_4125(W6001DocCriteriaDomain criteria) throws ApplicationException {

        TtInvoiceAttachedCriteriaDomain ttInvoiceAttachedCriteriaDomain = new TtInvoiceAttachedCriteriaDomain();
        ttInvoiceAttachedCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttInvoiceAttachedCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttInvoiceAttachedCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttInvoiceAttachedCriteriaDomain.setDeleteFlg(FLAG_N);
        ttInvoiceAttachedCriteriaDomain.setSearchCountCheckFlg(false);
        
        TtInvoiceAttachedDomain ttInvoiceAttachedDomain = new TtInvoiceAttachedDomain();
        ttInvoiceAttachedDomain.setInvoiceNo(criteria.getInvoiceNo());
        ttInvoiceAttachedDomain.setDeleteFlg(FLAG_N);

        commonService.setCommonPropertyForUpdate(ttInvoiceAttachedDomain, criteria.getScreenId());
        
        if (ttInvoiceAttachedService.searchCount(ttInvoiceAttachedCriteriaDomain) > 0) {
            ttInvoiceAttachedService.updateByCondition(ttInvoiceAttachedDomain, ttInvoiceAttachedCriteriaDomain);
        }
    }
    
    /**
     * Packing Header registration in Invoice No. W6002 4.1.2.6 of the post-update (update)
     * <br />W6002 4.1.2.6 更新後のInvoice No.でのパッキングヘッダ登録(更新)
     * <pre>
     * With the name of the TitiPackingHeadCriteriaDomain,
     *  Call TtPackingHeadService # UpdateByCondition(TtPackingHeadDomain, TtPackingHeadCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * TtPackingHeadCriteriaDomainを引数にして、{@link
     *      TtPackingHeadService#updateByCondition(TtPackingHeadDomain, TtPackingHeadCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param fileId_UploadPackinglistFile File ID of packing List File<br />
     * packing List File のFile ID
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void updateTtPackingHead2_4126(W6001DocCriteriaDomain criteria, String fileId_UploadPackinglistFile)
        throws ApplicationException {

        TtPackingHeadCriteriaDomain ttPackingHeadCriteriaDomain2 = new TtPackingHeadCriteriaDomain();
        ttPackingHeadCriteriaDomain2.setShipperCd(criteria.getTakeOverShipperCd());
        ttPackingHeadCriteriaDomain2.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttPackingHeadCriteriaDomain2.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttPackingHeadCriteriaDomain2.setDeleteFlg(FLAG_N);
        
        TtPackingHeadDomain ttPackingHeadDomain = new TtPackingHeadDomain();
        ttPackingHeadDomain.setInvoiceNo(criteria.getInvoiceNo());
        ttPackingHeadDomain.setManualFlg(FLAG_Y);
        ttPackingHeadDomain.setManualTyp(MANUAL_TYP_NON_DNG_INVOICE); // ST946 MANUAL SCREEN TRANSITION ADD
        ttPackingHeadDomain.setFileId(fileId_UploadPackinglistFile);
        ttPackingHeadDomain.setDeleteFlg(FLAG_N);

        commonService.setCommonPropertyForUpdate(ttPackingHeadDomain, criteria.getScreenId());
        
        ttPackingHeadService.updateByCondition(ttPackingHeadDomain, ttPackingHeadCriteriaDomain2);

    }

    /**
     * Packing Attached CML registration in Invoice No. W6002 4.1.2.7 of the post-update (update)
     * <br />W6002 4.1.2.7 更新後のInvoice No.でのパッキングアタッチ_CML登録(更新)
     * <pre>
     * With the name of the TitiPieishikeiInguAttachedCmlCriteriaDomain,
     *  Call TtPackingAttachedCmlCriteriaDomain # UpdateByCondition(TtPackingAttachedCmlDomain, TtPackingAttachedCmlCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * TtPackingAttachedCmlCriteriaDomainを引数にして、{@link
     *      TtPackingAttachedCmlService#updateByCondition(TtPackingAttachedCmlDomain, TtPackingAttachedCmlCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void updateTtPackingAttachedCml2_4127(W6001DocCriteriaDomain criteria) throws ApplicationException {
        
        TtPackingAttachedCmlCriteriaDomain ttPackingAttachedCmlCriteriaDomain = new TtPackingAttachedCmlCriteriaDomain();
        ttPackingAttachedCmlCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttPackingAttachedCmlCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttPackingAttachedCmlCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttPackingAttachedCmlCriteriaDomain.setDeleteFlg(FLAG_N);
        ttPackingAttachedCmlCriteriaDomain.setSearchCountCheckFlg(false);
        
        TtPackingAttachedCmlDomain ttPackingAttachedCmlDomain = new TtPackingAttachedCmlDomain();
        ttPackingAttachedCmlDomain.setInvoiceNo(criteria.getInvoiceNo());
        ttPackingAttachedCmlDomain.setDeleteFlg(FLAG_N);
        
        commonService.setCommonPropertyForUpdate(ttPackingAttachedCmlDomain, criteria.getScreenId());
        if (ttPackingAttachedCmlService.searchCount(ttPackingAttachedCmlCriteriaDomain) > 0) {
            ttPackingAttachedCmlService.updateByCondition(ttPackingAttachedCmlDomain, ttPackingAttachedCmlCriteriaDomain);
        }
    }
    /**
     * Packing Attached Item No registration in Invoice No. W6002 4.1.2.8 of the post-update (update)
     * <br />W6002 4.1.2.8 更新後のInvoice No.でのパッキングアタッチ_品目番号登録(更新)
     * <pre>
     * With the name of the TitiPieishikAtchItemNoCriteriaDomain,
     *  Call TtPackAtchItemNoDomain # UpdateByCondition(TtPackAtchItemNoDomain, TtPackAtchItemNoCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * TtPackAtchItemNoDomainを引数にして、{@link
     *    TtPackAtchItemNoService#updateByCondition(TtPackAtchItemNoDomain, TtPackAtchItemNoCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void updateTtPackAtchItemNo2_4128(W6001DocCriteriaDomain criteria) throws ApplicationException {
        TtPackAtchItemNoCriteriaDomain ttPackAtchItemNoCriteriaDomain = new TtPackAtchItemNoCriteriaDomain();
        ttPackAtchItemNoCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttPackAtchItemNoCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttPackAtchItemNoCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttPackAtchItemNoCriteriaDomain.setDeleteFlg(FLAG_N);
        ttPackAtchItemNoCriteriaDomain.setSearchCountCheckFlg(false);
        
        TtPackAtchItemNoDomain ttPackAtchItemNoDomain = new TtPackAtchItemNoDomain();
        ttPackAtchItemNoDomain.setInvoiceNo(criteria.getInvoiceNo());
        ttPackAtchItemNoDomain.setDeleteFlg(FLAG_N);

        commonService.setCommonPropertyForUpdate(ttPackAtchItemNoDomain, criteria.getScreenId());
        if (ttPackAtchItemNoService.searchCount(ttPackAtchItemNoCriteriaDomain) > 0) {
            ttPackAtchItemNoService.updateByCondition(ttPackAtchItemNoDomain, ttPackAtchItemNoCriteriaDomain);
        }
        
    }
    /**
     * The. Invoice No change during the W6002 4.1.2.9 main Incoive, change (update) the parent Invoice No. Of FRT Invoice associated with this mapping
     * <br />W6002 4.1.2.9 main Incoiveのinvoice No.変更時に、紐付くFRT Invoice の親Invoice No.を変更（更新)
     * <pre>
     * With the name of the TtInvoiceCriteriaDomain,
     *  Call TtInvoiceService # UpdateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>              
     * TtInvoiceCriteriaDomainを引数にして、{@link
     *     TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void updateTtInvoice2_4129(W6001DocCriteriaDomain criteria) throws ApplicationException {
        TtInvoiceCriteriaDomain ttInvoiceCriteriaDomain = new TtInvoiceCriteriaDomain();
        // ST946 MANUAL SCREEN TRANSITION MOD START
        //ttInvoiceCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        //ttInvoiceCriteriaDomain.setParInvoiceNo(criteria.getTakeOverParInvoiceNo());
        //ttInvoiceCriteriaDomain.setParInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttInvoiceCriteriaDomain.setParInvoiceShipperCd(criteria.getTakeOverParInvoiceShipperCd());
        ttInvoiceCriteriaDomain.setParInvoiceNo(criteria.getTakeOverParInvoiceNo());
        ttInvoiceCriteriaDomain.setParInvoiceIssueDt(criteria.getTakeOverParInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END
        ttInvoiceCriteriaDomain.setDeleteFlg(FLAG_N);
        ttInvoiceCriteriaDomain.setSearchCountCheckFlg(false);
        TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();
        ttInvoiceDomain.setParInvoiceNo(criteria.getInvoiceNo());
        
        commonService.setCommonPropertyForUpdate(ttInvoiceDomain, criteria.getScreenId());
        if (ttInvoiceService.searchCount(ttInvoiceCriteriaDomain) > 0) {
            ttInvoiceService.updateByCondition(ttInvoiceDomain, ttInvoiceCriteriaDomain);
        }
    }
    /**
     * Updated (Updated) Invoice No of W6002 4.1.2.10 Palletize table
     * <br />W6002 4.1.2.10 パレタイズテーブルのInvoice No.更新（更新)
     * <pre>
     * With the name of the TtPltzDomain,
     *  Call TtPltzService # UpdateByCondition(TtPltzDomain, TtPltzCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * TtPltzDomainを引数にして、{@link
     *   TtPltzService#updateByCondition(TtPltzDomain, TtPltzCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void updateTtPltz2_4120(W6001DocCriteriaDomain criteria) throws ApplicationException {

        TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
        //ttPltzCriteriaDomain.setShipperCd(criteria.getShipperCd());
        ttPltzCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd()); // ST946 MANUAL SCREEN TRANSITION MOD
        ttPltzCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttPltzCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttPltzCriteriaDomain.setSearchCountCheckFlg(false);
        TtPltzDomain ttPltzDomain = new TtPltzDomain();
        ttPltzDomain.setInvoiceNo(criteria.getInvoiceNo());

        commonService.setCommonPropertyForUpdate(ttPltzDomain, criteria.getScreenId());
        if (ttPltzService.searchCount(ttPltzCriteriaDomain) > 0) {
            ttPltzService.updateByCondition(ttPltzDomain, ttPltzCriteriaDomain);
        }
    }

    /**
     * Invoice registration in Invoice No. W6002 4.1.3.2 of updated (update)
     * <br />W6002 4.1.3.2 更新後のInvoice No.でのインボイス登録(更新)
     * <pre>
     * With the name of the TtInvoiceCriteriaDomain,
     *  Call TtInvoiceService # UpdateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * TtInvoiceCriteriaDomainを引数にして、{@link
     *      TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param invoiceIssuerNm Invoice Issuer Name
     * @return update count
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected int updateTtInvoice2_4132(W6001DocCriteriaDomain criteria, String invoiceIssuerNm)
        throws ApplicationException {
        W6001DocCriteriaDomain updateCriteria = new W6001DocCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(updateCriteria, criteria);
        // It sets to zero instead of NULL in numeric fields no input.
        // 入力のない数値項目にはNULLでなくゼロを設定する。
        nullToZeroNumericPropertiesForHeader(updateCriteria); // ST948 ADD
        
        // ST946 MANUAL SCREEN TRANSITION MOD START
        //updateCriteria.setKeyShipperCd(criteria.getShipperCd());
        //updateCriteria.setKeyInvoiceNo(criteria.getInvoiceNo());
        //updateCriteria.setKeyInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        updateCriteria.setKeyShipperCd(criteria.getTakeOverShipperCd());
        updateCriteria.setKeyInvoiceNo(criteria.getTakeOverInvoiceNo());
        updateCriteria.setKeyInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END

        updateCriteria.setKeyDeleteFlg(FLAG_N);
        updateCriteria.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
  
        updateCriteria.setManualFlg(FLAG_Y);
        updateCriteria.setTypeOfInv(MANUAL_TYP_NON_DNG_INVOICE); // ST946 MANUAL SCREEN TRANSITION ADD
        updateCriteria.setInvoiceIssuerNm(invoiceIssuerNm);
                
        int cnt = w6001DocDao.updateTtInvoiceByKey(updateCriteria);
        if (cnt == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        return cnt;
    }
    /**
     * Invoice Header registration in Invoice No. W6002 4.1.3.4 of the post-update (update)
     * <br />W6002 4.1.3.4 更新後のInvoice No.でのインボイスヘッダ登録(更新)
     * <pre>
     * With the name of the TitiaienuvoiceHeaderCriteriaDomain,
     *  Call TtInvoiceHeaderService # UpdateByCondition(TitiaienuvoiceHeaderCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * TtInvoiceHeaderCriteriaDomainを引数にして、{@link
     *      TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param fileId_UploadInvoiceFile File ID of Upload Invoice File<br />
     * Upload Invoice File のFile ID
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void updateTtInvoiceHeader2_4134(W6001DocCriteriaDomain criteria, String fileId_UploadInvoiceFile)
        throws ApplicationException {

        W6001DocCriteriaDomain updateCriteria = new W6001DocCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(updateCriteria, criteria);
        // It sets to zero instead of NULL in numeric fields no input.
        // 入力のない数値項目にはNULLでなくゼロを設定する。
        nullToZeroNumericPropertiesForHeader(updateCriteria); // ST948 ADD

        // ST946 MANUAL SCREEN TRANSITION MOD START
        //updateCriteria.setKeyShipperCd(criteria.getShipperCd());
        //updateCriteria.setKeyInvoiceNo(criteria.getInvoiceNo());
        //updateCriteria.setKeyInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        updateCriteria.setKeyShipperCd(criteria.getTakeOverShipperCd());
        updateCriteria.setKeyInvoiceNo(criteria.getTakeOverInvoiceNo());
        updateCriteria.setKeyInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        updateCriteria.setKeyDeleteFlg(FLAG_N);
        // ST946 MANUAL SCREEN TRANSITION MOD END

        updateCriteria.setManualFlg(FLAG_Y);
        updateCriteria.setTypeOfInv(MANUAL_TYP_NON_DNG_INVOICE); // ST946 MANUAL SCREEN TRANSITION ADD
        updateCriteria.setFileId(fileId_UploadInvoiceFile);

        w6001DocDao.updateTtInvoiceHeaderByKey(updateCriteria);
    }
    /**
     * Update of W6002 4.1.3.6 Packing Header
     * <br />W6002 4.1.3.6 パッキングヘッダの更新
     * <pre>
     * With the name of the TtPackingHeadDomain,
     *  Call TtPackingHeadService # UpdateByCondition(TtPackingHeadDomain, TtPackingHeadCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * TtPackingHeadDomainを引数にして、{@link
     *      TtPackingHeadService#updateByCondition(TtPackingHeadDomain, TtPackingHeadCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param fileId_UploadPackinglistFile File ID of packing List File<br />
     * packing List File のFile ID
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void updateTtPackingHead2_4136(W6001DocCriteriaDomain criteria, String fileId_UploadPackinglistFile) 
        throws ApplicationException {
        
        TtPackingHeadCriteriaDomain ttPackingHeadCriteriaDomain = new TtPackingHeadCriteriaDomain();
        // ST946 MANUAL SCREEN TRANSITION MOD START
        //ttPackingHeadCriteriaDomain.setShipperCd(criteria.getShipperCd());
        //ttPackingHeadCriteriaDomain.setInvoiceNo(criteria.getInvoiceNo());
        //ttPackingHeadCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttPackingHeadCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttPackingHeadCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttPackingHeadCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END

        ttPackingHeadCriteriaDomain.setDeleteFlg(FLAG_N);
        
        TtPackingHeadDomain ttPackingHeadDomain = new TtPackingHeadDomain();
        ttPackingHeadDomain.setManualFlg(FLAG_Y);
        ttPackingHeadDomain.setManualTyp(MANUAL_TYP_NON_DNG_INVOICE); // ST946 MANUAL SCREEN TRANSITION ADD
        ttPackingHeadDomain.setFileId(fileId_UploadPackinglistFile);

        commonService.setCommonPropertyForUpdate(ttPackingHeadDomain, criteria.getScreenId());
        
        ttPackingHeadService.updateByCondition(ttPackingHeadDomain, ttPackingHeadCriteriaDomain);

    }

    /**
     * Acquisition of W6002 port SERVER NAME
     * <br />W6002 ポート名称の取得
     * 
     * @param portCd Port CD<br />
     * ポートコード
     * @return portName port SERVER NAME<br />
     * portName ポート名称
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected String searchTmPortGetPortName(String portCd) throws ApplicationException {
        
        TmPortCriteriaDomain tmPortCriteriaDomain = new TmPortCriteriaDomain();
        tmPortCriteriaDomain.setPortCd(portCd);
        List<TmPortDomain> tmPortList = tmPortService.searchByCondition(tmPortCriteriaDomain);
        TmPortDomain tmPortDomain = tmPortList.get(0);
        return tmPortDomain.getPortNm();
    }

    /**
     * W6002 4.1.4.2 Invoice registration
     * <br />W6002 4.1.4.2 インボイス登録
     * <pre>
     * With the name of the TtInvoiceDomain, Call TtInvoiceService.Create(TtInvoiceDomain), and to register the data.
     * </pre>
     * <pre>
     *TtInvoiceDomainを引数にして、{@link
     *      TtInvoiceService#create(TtInvoiceDomain)}を呼出し、データを登録する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param systemDt Time zone date<br />
     * タイムゾーン日付
     * @param tmNxsComp21 Shipper information<br />
     * Shipper情報
     * @param tmNxsComp22 Consignee information<br />
     * Consignee情報
     * @param pltzItem23 ShipTo information<br />
     * ShipTo情報
     * @param invoiceCtgryNm Invoice Category Name
     * @param trnsNm Trans Name
     * @param carrierCompNmAbb Carrier name
     * @param freightResponsibleNm Freight Responsible Name
     * @param payMethNm Payment Methods Name
     * @param invoiceIssuerNm Invoice Issuer Name
     * @param portNm_From Acquisition of PORT NAME (From)<br /> 
     * 港名の取得(From)
     * @param portNm_To Acquisition of PORT NAME (To)<br />
     * 港名の取得(To)
     * @return create count
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected int createTtInvoice2_4142(W6001DocCriteriaDomain criteria, Date systemDt, TmNxsCompDomain tmNxsComp21
        , TmNxsCompDomain tmNxsComp22, W6001DocPltzItemDomain pltzItem23, String invoiceCtgryNm, String trnsNm
        , String carrierCompNmAbb, String freightResponsibleNm, String payMethNm, String invoiceIssuerNm, String portNm_From, String portNm_To) 
        throws ApplicationException {

        BigDecimal zero = BigDecimal.ZERO;
        
        TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();

        CommonUtil.copyPropertiesDomainToDomain(ttInvoiceDomain, criteria);   
        
        ttInvoiceDomain.setInvoiceIssueDt(systemDt);
        ttInvoiceDomain.setManualFlg(FLAG_Y);
        ttInvoiceDomain.setManualTyp(criteria.getTypeOfInv());
        ttInvoiceDomain.setInvoiceClass(criteria.getClassOfInv());
        ttInvoiceDomain.setCancelTyp(FLAG_N);
        ttInvoiceDomain.setCancelInvoiceNo(null);
        ttInvoiceDomain.setCancelInvoiceIssueDt(null);
        if (W6002_FUNCTION_NO_1.equals(criteria.getFunctionNo())) {
            ttInvoiceDomain.setParInvoiceNo(criteria.getInvoiceNo());
            ttInvoiceDomain.setParInvoiceShipperCd(criteria.getShipperCd());
            ttInvoiceDomain.setParInvoiceIssueDt(systemDt);

            //ttInvoiceDomain.setRelateInvoiceIssueDt(systemDt); // ST184 INVOICE ISSUE DATE/インボイス発行日 DEL
        } else if (W6002_FUNCTION_NO_2.equals(criteria.getFunctionNo())) {
            // ST946 MANUAL SCREEN TRANSITION MOD START
            //ttInvoiceDomain.setParInvoiceNo(criteria.getTakeOverParInvoiceNo());
            //ttInvoiceDomain.setParInvoiceShipperCd(criteria.getTakeOverShipperCd());
            //ttInvoiceDomain.setParInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
            ttInvoiceDomain.setParInvoiceNo(criteria.getTakeOverParInvoiceNo());
            ttInvoiceDomain.setParInvoiceShipperCd(criteria.getTakeOverParInvoiceShipperCd());
            ttInvoiceDomain.setParInvoiceIssueDt(criteria.getTakeOverParInvoiceIssueDt());
            // ST946 MANUAL SCREEN TRANSITION MOD END
        }
        //ttInvoiceDomain.setRelateInvoiceIssueDt(systemDt); // ST184 INVOICE ISSUE DATE/インボイス発行日 DEL

        if (W6002_FUNCTION_NO_1.equals(criteria.getFunctionNo())) {
            ttInvoiceDomain.setFrtShipperCd(null);
            ttInvoiceDomain.setFrtConsigneeCd(null);
        } else if (W6002_FUNCTION_NO_2.equals(criteria.getFunctionNo())) {
            ttInvoiceDomain.setFrtShipperCd(criteria.getShipperCd());
            ttInvoiceDomain.setFrtConsigneeCd(criteria.getConsigneeCd());
        }
        ttInvoiceDomain.setShipToCompCd(pltzItem23.getCompCd());
        ttInvoiceDomain.setCustomerCd(null);
        ttInvoiceDomain.setLgcyShipTo(null);
        ttInvoiceDomain.setInvoiceCtgryNm(invoiceCtgryNm);
        ttInvoiceDomain.setShippedDt(null);
        ttInvoiceDomain.setTrnsNm(trnsNm);
        ttInvoiceDomain.setTrnsCdOrg(criteria.getTrnsCd());
        ttInvoiceDomain.setLPortCntryCd(criteria.getFmCntryCd());
        ttInvoiceDomain.setLoadingPortNm(portNm_From);
        ttInvoiceDomain.setDPortCntryCd(criteria.getToCntryCd());
        ttInvoiceDomain.setDischargePortNm(portNm_To);
        // 2015/3/31 DNJP.Kawamura UT212対応 START >>>>>
//        ttInvoiceDomain.setDlivPoint(null);
        ttInvoiceDomain.setDlivPoint(criteria.getDlivPoint());
        // 2015/3/31 DNJP.Kawamura UT212対応 END <<<<<
        ttInvoiceDomain.setCarrierCompNmAbb(carrierCompNmAbb);
        ttInvoiceDomain.setFreightResponsibleCd(criteria.getFreightResponsibleCd());
        ttInvoiceDomain.setFreightResponsibleNm(freightResponsibleNm);
        ttInvoiceDomain.setPayMethNm(payMethNm);

        if (W6002_FUNCTION_NO_1.equals(criteria.getFunctionNo())) {
            ttInvoiceDomain.setRemLcTyp(criteria.getRemLcTyp());
            if (REM_LC_TYP_REM.equals(criteria.getRemLcTyp())) {
                ttInvoiceDomain.setLcNo(null);
                ttInvoiceDomain.setLcDt(null);
                ttInvoiceDomain.setLcBankNm1(null);
                ttInvoiceDomain.setLcBankNm2(null);
            } else {
                ttInvoiceDomain.setRemBankNm(null);
                ttInvoiceDomain.setRemBankAddress1(null);
                ttInvoiceDomain.setRemBankAddress2(null);
                ttInvoiceDomain.setRemBankAddress3(null);
                ttInvoiceDomain.setRemBankAccountNo(null);
                ttInvoiceDomain.setLcBankNm1(criteria.getLcBank1());
                ttInvoiceDomain.setLcBankNm2(criteria.getLcBank2());
            }
        }
        // Support ver.1.0
        //ver.1.0.5対応
        if (W6002_FUNCTION_NO_2.equals(criteria.getFunctionNo())) {
            ttInvoiceDomain.setRelateInvoiceNo(null);
            ttInvoiceDomain.setRelateInvoiceShipperCd(null);
            ttInvoiceDomain.setRelateInvoiceIssueDt(null);
            ttInvoiceDomain.setFreightResponsibleCd(null);
            ttInvoiceDomain.setFreightResponsibleNm(null);
            ttInvoiceDomain.setTradeTerms(null);
            ttInvoiceDomain.setTermsPoint(null);
            ttInvoiceDomain.setPayTerms(null);
            ttInvoiceDomain.setPayMeth(null);
            ttInvoiceDomain.setPayMethNm(null);
            ttInvoiceDomain.setRemLcTyp(null);
            ttInvoiceDomain.setRemBankNm(null);
            ttInvoiceDomain.setRemBankAddress1(null);
            ttInvoiceDomain.setRemBankAddress2(null);
            ttInvoiceDomain.setRemBankAddress3(null);
            ttInvoiceDomain.setRemBankAccountNo(null);
            ttInvoiceDomain.setLcNo(null);
            ttInvoiceDomain.setLcDt(null);
            ttInvoiceDomain.setLcBankNm1(null);
            ttInvoiceDomain.setLcBankNm2(null);
            ttInvoiceDomain.setFreight(zero);
            ttInvoiceDomain.setInsurance(zero);
            ttInvoiceDomain.setVatRatio(zero);
            ttInvoiceDomain.setVat(zero);
            ttInvoiceDomain.setHandlingCharge(zero);
            // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
            ttInvoiceDomain.setAdditionalChargeCd(null);
            // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
            ttInvoiceDomain.setAdditionalChargeNm(null);
            ttInvoiceDomain.setAdditionalCharge(zero);
        }
        
        // ST184 INVOICE ISSUE DATE/インボイス発行日 ADD START
        // Only sets the re-invoice issue date if re-invoice No. is set.
        // リインボイスNo.が設定されている場合のみリインボイス発行日を設定する。
        ttInvoiceDomain.setRelateInvoiceIssueDt(null);
        if (StringUtils.isNotEmpty(ttInvoiceDomain.getRelateInvoiceNo())) {
            ttInvoiceDomain.setRelateInvoiceIssueDt(systemDt);
        }
        // It sets to zero instead of NULL in numeric fields no input.
        // 入力のない数値項目にはNULLでなくゼロを設定する。
        nullToZeroNumericPropertiesForHeader(ttInvoiceDomain); // ST948 ADD

        ttInvoiceDomain.setNoCharge(zero);
        ttInvoiceDomain.setInvTplNo(null);
        ttInvoiceDomain.setFree1ColNm(null);
        ttInvoiceDomain.setFree1DispFlg(FLAG_N);              //NOT NULL
        ttInvoiceDomain.setFree2ColNm(null); 
        ttInvoiceDomain.setFree2DispFlg(FLAG_N);              //NOT NULL
        ttInvoiceDomain.setFree3ColNm(null);
        ttInvoiceDomain.setFree3DispFlg(FLAG_N);              //NOT NULL
        ttInvoiceDomain.setFree4ColNm(null);
        ttInvoiceDomain.setFree4DispFlg(FLAG_N);              //NOT NULL
        ttInvoiceDomain.setSpInfo(null);
        ttInvoiceDomain.setApprovalPosition(null);
        ttInvoiceDomain.setApprovalNm(null);
        ttInvoiceDomain.setContainerLooseTyp(pltzItem23.getContainerLooseTyp());
        ttInvoiceDomain.setContainerSortingKey(pltzItem23.getContainerSortingKey());
        ttInvoiceDomain.setCustomTimingTyp(pltzItem23.getCustomTimingTyp());
        ttInvoiceDomain.setCmlTyp(null);
        ttInvoiceDomain.setInvoiceKey(null);
        ttInvoiceDomain.setNotifyParty1Nm(null);
        ttInvoiceDomain.setNotifyParty1Addr(null);
        ttInvoiceDomain.setNotifyParty2Nm(null);
        ttInvoiceDomain.setNotifyParty2Addr(null);
        ttInvoiceDomain.setNotifyParty3Nm(null);
        ttInvoiceDomain.setNotifyParty3Addr(null);
        ttInvoiceDomain.setNotifyParty4Nm(null);
        ttInvoiceDomain.setNotifyParty4Addr(null);
        ttInvoiceDomain.setShippingActNo(null);
        ttInvoiceDomain.setShippingActStatus(null);
        ttInvoiceDomain.setSupplierInvoiceNo(null);
        ttInvoiceDomain.setImpInvoiceNo1(null);
        ttInvoiceDomain.setImpInvoiceNo2(null);
        ttInvoiceDomain.setShipperCompNmAbb(tmNxsComp21.getCompNmAbb());
        ttInvoiceDomain.setShipperCompNm1(tmNxsComp21.getPrintCompNm1());
        ttInvoiceDomain.setShipperCompNm2(tmNxsComp21.getPrintCompNm2());
        ttInvoiceDomain.setShipperCompAddr1(tmNxsComp21.getPrintCompAddr1());
        ttInvoiceDomain.setShipperCompAddr2(tmNxsComp21.getPrintCompAddr2());
        ttInvoiceDomain.setShipperCompAddr3(tmNxsComp21.getPrintCompAddr3());
        ttInvoiceDomain.setShipperCompAddr4(tmNxsComp21.getPrintCompAddr4());
        ttInvoiceDomain.setShipperCompTel(tmNxsComp21.getCompTel());
        ttInvoiceDomain.setShipperCompFax(tmNxsComp21.getCompFax());
        ttInvoiceDomain.setShipperTaxIdNo(null);
        ttInvoiceDomain.setConsigneeCompNm1(tmNxsComp22.getPrintCompNm1());
        ttInvoiceDomain.setConsigneeCompNm2(tmNxsComp22.getPrintCompNm2());
        ttInvoiceDomain.setConsigneeCompAddr1(tmNxsComp22.getPrintCompAddr1());
        ttInvoiceDomain.setConsigneeCompAddr2(tmNxsComp22.getPrintCompAddr2());
        ttInvoiceDomain.setConsigneeCompAddr3(tmNxsComp22.getPrintCompAddr3());
        ttInvoiceDomain.setConsigneeCompAddr4(tmNxsComp22.getPrintCompAddr4());
        ttInvoiceDomain.setConsigneeCompTel(tmNxsComp22.getCompTel());
        ttInvoiceDomain.setConsigneeCompFax(tmNxsComp22.getCompFax());
        ttInvoiceDomain.setConsigneeTaxIdNo(null);
        ttInvoiceDomain.setConsigneeAttn(null);
        ttInvoiceDomain.setShipToNm1(pltzItem23.getPrintShipToNm1());
        ttInvoiceDomain.setShipToNm2(pltzItem23.getPrintShipToNm2());
        ttInvoiceDomain.setShipToAddr1(pltzItem23.getPrintShipToAddr1());
        ttInvoiceDomain.setShipToAddr2(pltzItem23.getPrintShipToAddr2());
        ttInvoiceDomain.setShipToAddr3(pltzItem23.getPrintShipToAddr3());
        ttInvoiceDomain.setShipToAddr4(pltzItem23.getPrintShipToAddr4());
        ttInvoiceDomain.setShipToTel(pltzItem23.getShipToTel());
        ttInvoiceDomain.setContainerNo1(null);
        ttInvoiceDomain.setContainerNo2(null);
        ttInvoiceDomain.setContainerNo3(null);
        ttInvoiceDomain.setInvoiceIssuerNm(invoiceIssuerNm);
        ttInvoiceDomain.setCancelFlg(FLAG_N);
        ttInvoiceDomain.setDeleteFlg(FLAG_N);
        ttInvoiceDomain.setInvoiceIssuerId(criteria.getDscId());

        commonService.setCommonPropertyForRegist(ttInvoiceDomain, criteria.getScreenId());
        
        try {
            ttInvoiceService.create(ttInvoiceDomain);
        } catch (IntegrationLayerException e) {
            if (ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX == e.getSqlErrorCode()) {
                throw new GscmApplicationException(GSCM_E0_0020);
            }
            throw e;
        }
        return 1;

    }
    /**
     * W6002 4.1.4.3 Invoice Header registration
     * <br />W6002 4.1.4.3 インボイスヘッダ登録
     * <pre>
     * With the name of the TtInvoiceHeaderDomain,
     *  Call TtInvoiceHeaderService.Create(TtInvoiceHeaderDomain), and to register the data.
     * </pre>
     * <pre>
     * TtInvoiceHeaderDomainを引数にして、{@link
     *      TtInvoiceHeaderService#create(TtInvoiceHeaderDomain)}を呼出し、データを登録する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param systemDt Time zone date<br />
     * タイムゾーン日付
     * @param tmNxsComp21 Shipper information<br />
     * Shipper情報
     * @param tmNxsComp22 Consignee information<br />
     * Consignee情報
     * @param pltzItem23 ShipTo information<br />
     * ShipTo情報
     * @param invoiceCtgryNm Invoice Category Name
     * @param trnsNm Trans Name
     * @param carrierCompNmAbb Carrier name
     * @param freightResponsibleNm Freight Responsible Name
     * @param payMethNm Payment Methods Name
     * @param invoiceIssuerNm Invoice Issuer Name
     * @param portNm_From Acquisition of PORT NAME (From)<br />
     * 港名の取得(From)
     * @param portNm_To Acquisition of PORT NAME (To)<br />
     * 港名の取得(To)
     * @param fileId_UploadInvoiceFile File ID of Upload Invoice File<br />
     * Upload Invoice File のFile ID
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void createTtInvoiceHeader2_4143(W6001DocCriteriaDomain criteria, Date systemDt, TmNxsCompDomain tmNxsComp21
        , TmNxsCompDomain tmNxsComp22, W6001DocPltzItemDomain pltzItem23, String invoiceCtgryNm, String trnsNm
        , String carrierCompNmAbb, String freightResponsibleNm, String payMethNm, String invoiceIssuerNm
        , String portNm_From, String portNm_To, String fileId_UploadInvoiceFile) 
        throws ApplicationException {

        //W6001DocCriteriaDomain updateCriteria = new W6001DocCriteriaDomain(); // ST948 DEL
        //CommonUtil.copyPropertiesDomainToDomain(updateCriteria, criteria); // ST948 DEL

        BigDecimal zero = BigDecimal.ZERO;
        TtInvoiceHeaderDomain ttInvoiceHeaderDomain = new TtInvoiceHeaderDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(ttInvoiceHeaderDomain, criteria);   
        
        ttInvoiceHeaderDomain.setInvoiceIssueDt(systemDt);
        ttInvoiceHeaderDomain.setManualFlg(FLAG_Y);
        ttInvoiceHeaderDomain.setManualTyp(criteria.getTypeOfInv());
        ttInvoiceHeaderDomain.setInvoiceClass(criteria.getClassOfInv());
        ttInvoiceHeaderDomain.setCancelTyp(FLAG_N);
        ttInvoiceHeaderDomain.setCancelInvoiceNo(null);
        ttInvoiceHeaderDomain.setCancelInvoiceIssueDt(null);
        ttInvoiceHeaderDomain.setShipperCompNm1(tmNxsComp21.getPrintCompNm1());
        ttInvoiceHeaderDomain.setShipperCompNm2(tmNxsComp21.getPrintCompNm2());
        ttInvoiceHeaderDomain.setShipperCompAddr1(tmNxsComp21.getPrintCompAddr1());
        ttInvoiceHeaderDomain.setShipperCompAddr2(tmNxsComp21.getPrintCompAddr2());
        ttInvoiceHeaderDomain.setShipperCompAddr3(tmNxsComp21.getPrintCompAddr3());
        ttInvoiceHeaderDomain.setShipperCompAddr4(tmNxsComp21.getPrintCompAddr4());
        ttInvoiceHeaderDomain.setShipperCompTel(tmNxsComp21.getCompTel());
        ttInvoiceHeaderDomain.setShipperCompFax(tmNxsComp21.getCompFax());
        ttInvoiceHeaderDomain.setShipperTaxIdNo(null);
        ttInvoiceHeaderDomain.setConsigneeCompNm1(tmNxsComp22.getPrintCompNm1());
        ttInvoiceHeaderDomain.setConsigneeCompNm2(tmNxsComp22.getPrintCompNm2());
        ttInvoiceHeaderDomain.setConsigneeCompAddr1(tmNxsComp22.getPrintCompAddr1());
        ttInvoiceHeaderDomain.setConsigneeCompAddr2(tmNxsComp22.getPrintCompAddr2());
        ttInvoiceHeaderDomain.setConsigneeCompAddr3(tmNxsComp22.getPrintCompAddr3());
        ttInvoiceHeaderDomain.setConsigneeCompAddr4(tmNxsComp22.getPrintCompAddr4());
        ttInvoiceHeaderDomain.setConsigneeCompTel(tmNxsComp22.getCompTel());
        ttInvoiceHeaderDomain.setConsigneeCompFax(tmNxsComp22.getCompFax());
        ttInvoiceHeaderDomain.setConsigneeTaxIdNo(null);
        ttInvoiceHeaderDomain.setConsigneeAttn(null);
        ttInvoiceHeaderDomain.setShipToNm1(pltzItem23.getPrintShipToNm1());
        ttInvoiceHeaderDomain.setShipToNm2(pltzItem23.getPrintShipToNm2());
        ttInvoiceHeaderDomain.setShipToAddr1(pltzItem23.getPrintShipToAddr1());
        ttInvoiceHeaderDomain.setShipToAddr2(pltzItem23.getPrintShipToAddr2());
        ttInvoiceHeaderDomain.setShipToAddr3(pltzItem23.getPrintShipToAddr3());
        ttInvoiceHeaderDomain.setShipToAddr4(pltzItem23.getPrintShipToAddr4());

        ttInvoiceHeaderDomain.setShipperCompNmAbb(tmNxsComp21.getCompNmAbb());
        ttInvoiceHeaderDomain.setInvoiceCtgryNm(invoiceCtgryNm);
        ttInvoiceHeaderDomain.setShippedDt(null);
        ttInvoiceHeaderDomain.setTrnsNm(trnsNm);
        ttInvoiceHeaderDomain.setLPortCntryCd(criteria.getFmCntryCd());
        ttInvoiceHeaderDomain.setLoadingPortNm(portNm_From);
        ttInvoiceHeaderDomain.setDPortCntryCd(criteria.getToCntryCd());
        ttInvoiceHeaderDomain.setDischargePortNm(portNm_To);
        // 2015/3/31 DNJP.Kawamura UT212対応 START >>>>>
//        ttInvoiceHeaderDomain.setDlivPoint(null);
        ttInvoiceHeaderDomain.setDlivPoint(criteria.getDlivPoint());
        // 2015/3/31 DNJP.Kawamura UT212対応 END <<<<<
        ttInvoiceHeaderDomain.setCarrierCompNmAbb(carrierCompNmAbb);
        ttInvoiceHeaderDomain.setContainerNo1(null);
        ttInvoiceHeaderDomain.setContainerNo2(null);
        ttInvoiceHeaderDomain.setContainerNo3(null);
        ttInvoiceHeaderDomain.setTotalNetWeightUnit(criteria.getWeightUnit());
        ttInvoiceHeaderDomain.setTotalGrossWeightUnit(criteria.getWeightUnit());
        ttInvoiceHeaderDomain.setTotalVolumeUnit(criteria.getVolumeUnit());
        ttInvoiceHeaderDomain.setFreightResponsibleCd(criteria.getFreightResponsibleCd());
        ttInvoiceHeaderDomain.setFreightResponsibleNm(freightResponsibleNm);
        ttInvoiceHeaderDomain.setPayMethNm(payMethNm);
        if (W6002_FUNCTION_NO_1.equals(criteria.getFunctionNo())) {
            ttInvoiceHeaderDomain.setRemLcTyp(criteria.getRemLcTyp());
            if (REM_LC_TYP_REM.equals(criteria.getRemLcTyp())) {
                ttInvoiceHeaderDomain.setLcNo(null);
                ttInvoiceHeaderDomain.setLcDt(null);
                ttInvoiceHeaderDomain.setLcBankNm1(null);
                ttInvoiceHeaderDomain.setLcBankNm2(null);
            } else {
                ttInvoiceHeaderDomain.setRemBankNm(null);
                ttInvoiceHeaderDomain.setRemBankAddress1(null);
                ttInvoiceHeaderDomain.setRemBankAddress2(null);
                ttInvoiceHeaderDomain.setRemBankAddress3(null);
                ttInvoiceHeaderDomain.setRemBankAccountNo(null);
                ttInvoiceHeaderDomain.setLcBankNm1(criteria.getLcBank1());
                ttInvoiceHeaderDomain.setLcBankNm2(criteria.getLcBank2());
            }
        } else if (W6002_FUNCTION_NO_2.equals(criteria.getFunctionNo())) {
            ttInvoiceHeaderDomain.setRemBankNm(null);
            ttInvoiceHeaderDomain.setRemBankAddress1(null);
            ttInvoiceHeaderDomain.setRemBankAddress2(null);
            ttInvoiceHeaderDomain.setRemBankAddress3(null);
            ttInvoiceHeaderDomain.setRemBankAccountNo(null);
            ttInvoiceHeaderDomain.setLcNo(null);
            ttInvoiceHeaderDomain.setLcDt(null);
            ttInvoiceHeaderDomain.setLcBankNm1(null);
            ttInvoiceHeaderDomain.setLcBankNm2(null);
        }
        // Support ver. 1.0.5
        //ver.1.0.5対応
        if (W6002_FUNCTION_NO_2.equals(criteria.getFunctionNo())) {
            ttInvoiceHeaderDomain.setFreightResponsibleCd(null);
            ttInvoiceHeaderDomain.setFreightResponsibleNm(null);
            ttInvoiceHeaderDomain.setTradeTerms(null);
            ttInvoiceHeaderDomain.setTermsPoint(null);
            ttInvoiceHeaderDomain.setPayTerms(null);
            ttInvoiceHeaderDomain.setPayMeth(null);
            ttInvoiceHeaderDomain.setPayMethNm(null);
            ttInvoiceHeaderDomain.setRemLcTyp(null);
            ttInvoiceHeaderDomain.setRemBankNm(null);
            ttInvoiceHeaderDomain.setRemBankAddress1(null);
            ttInvoiceHeaderDomain.setRemBankAddress2(null);
            ttInvoiceHeaderDomain.setRemBankAddress3(null);
            ttInvoiceHeaderDomain.setRemBankAccountNo(null);
            ttInvoiceHeaderDomain.setLcNo(null);
            ttInvoiceHeaderDomain.setLcDt(null);
            ttInvoiceHeaderDomain.setLcBankNm1(null);
            ttInvoiceHeaderDomain.setLcBankNm2(null);
            ttInvoiceHeaderDomain.setFreight(zero);
            ttInvoiceHeaderDomain.setInsurance(zero);
            ttInvoiceHeaderDomain.setVatRatio(zero);
            ttInvoiceHeaderDomain.setVat(zero);
            ttInvoiceHeaderDomain.setHandlingCharge(zero);
            // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
            ttInvoiceHeaderDomain.setAdditionalChargeCd(null);
            // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
            ttInvoiceHeaderDomain.setAdditionalChargeNm(null);
            ttInvoiceHeaderDomain.setAdditionalCharge(zero);
        }
        ttInvoiceHeaderDomain.setSpInfo(null);
        ttInvoiceHeaderDomain.setNetAmountCurrCd(criteria.getCurrCd());
        ttInvoiceHeaderDomain.setFreightCurrCd(criteria.getCurrCd());
        ttInvoiceHeaderDomain.setInsuranceCurrCd(criteria.getCurrCd());
        ttInvoiceHeaderDomain.setSubTotalCurrCd(criteria.getCurrCd());
        ttInvoiceHeaderDomain.setVatCurrCd(criteria.getCurrCd());
        ttInvoiceHeaderDomain.setHandlingChargeCurrCd(criteria.getCurrCd());
        ttInvoiceHeaderDomain.setAdditionalChargeCurrCd(criteria.getCurrCd());
        ttInvoiceHeaderDomain.setTotalInvoiceAmountCurrCd(criteria.getCurrCd());
        ttInvoiceHeaderDomain.setNoCharge(zero);
        ttInvoiceHeaderDomain.setNoChargeCurrCd(null);
        ttInvoiceHeaderDomain.setFree1ColNm(null);
        ttInvoiceHeaderDomain.setFree2ColNm(null);
        ttInvoiceHeaderDomain.setFree3ColNm(null);
        ttInvoiceHeaderDomain.setFree4ColNm(null);
        ttInvoiceHeaderDomain.setFileId(fileId_UploadInvoiceFile);
        ttInvoiceHeaderDomain.setDeleteFlg(FLAG_N);
        // It sets to zero instead of NULL in numeric fields no input.
        // 入力のない数値項目にはNULLでなくゼロを設定する。
        nullToZeroNumericPropertiesForHeader(ttInvoiceHeaderDomain); // ST948 ADD
        
        commonService.setCommonPropertyForRegist(ttInvoiceHeaderDomain, criteria.getScreenId());
        
        ttInvoiceHeaderService.create(ttInvoiceHeaderDomain);

    }
    /**
     * W6002 4.1.4.4 Packing Header registration
     * <br />W6002 4.1.4.4 パッキングヘッダ登録
     * <pre>
     * With the name of the TtPackingHeadDomain,
     *  Call TtPackingHeadService.Create(TtPackingHeadDomain), and to register the data.
     * </pre>
     * <pre>
     * TtPackingHeadDomainを引数にして、{@link
     *      TtPackingHeadService#create(TtPackingHeadDomain)}を呼出し、データを登録する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param systemDt Time zone date<br />
     * タイムゾーン日付
     * @param tmNxsComp21 Shipper information<br />
     * Shipper情報
     * @param tmNxsComp22 Consignee information<br />
     * Consignee情報
     * @param pltzItem23 ShipTo information<br />
     * ShipTo情報
     * @param invoiceCtgryNm Invoice Category Name
     * @param trnsNm Trans Name
     * @param carrierCompNmAbb Carrier name
     * @param freightResponsibleNm  Freight Responsible Name
     * @param payMethNm Payment Methods Name
     * @param invoiceIssuerNm Invoice Issuer Name
     * @param portNm_From Acquisition of PORT NAME (From)<br />
     * 港名の取得(From)
     * @param portNm_To Acquisition of PORT NAME (To)<br />
     * 港名の取得(To)
     * @param fileId_UploadPackinglistFile File ID of packing List File<br />
     * packing List File のFile ID
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void createTtPackingHead2_4144(W6001DocCriteriaDomain criteria, Date systemDt, TmNxsCompDomain tmNxsComp21
        , TmNxsCompDomain tmNxsComp22, W6001DocPltzItemDomain pltzItem23, String invoiceCtgryNm, String trnsNm
        , String carrierCompNmAbb, String freightResponsibleNm, String payMethNm, String invoiceIssuerNm
        , String portNm_From, String portNm_To, String fileId_UploadPackinglistFile)
        throws ApplicationException {

        TtPackingHeadDomain ttPackingHeadDomain = new TtPackingHeadDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(ttPackingHeadDomain, criteria);  
        
        ttPackingHeadDomain.setInvoiceIssueDt(systemDt);
        ttPackingHeadDomain.setManualFlg(FLAG_Y);
        ttPackingHeadDomain.setManualTyp(criteria.getTypeOfInv());
        ttPackingHeadDomain.setInvoiceClass(criteria.getClassOfInv());
        ttPackingHeadDomain.setCancelTyp(FLAG_N);
        ttPackingHeadDomain.setCancelInvoiceNo(null);
        ttPackingHeadDomain.setCancelInvoiceIssueDt(null);
        ttPackingHeadDomain.setShipperCompNm1(tmNxsComp21.getPrintCompNm1());
        ttPackingHeadDomain.setShipperCompNm2(tmNxsComp21.getPrintCompNm2());
        ttPackingHeadDomain.setShipperCompAddr1(tmNxsComp21.getPrintCompAddr1());
        ttPackingHeadDomain.setShipperCompAddr2(tmNxsComp21.getPrintCompAddr2());
        ttPackingHeadDomain.setShipperCompAddr3(tmNxsComp21.getPrintCompAddr3());
        ttPackingHeadDomain.setShipperCompAddr4(tmNxsComp21.getPrintCompAddr4());
        ttPackingHeadDomain.setShipperCompTel(tmNxsComp21.getCompTel());
        ttPackingHeadDomain.setShipperCompFax(tmNxsComp21.getCompFax());
        ttPackingHeadDomain.setShipperTaxIdNo(null);
        ttPackingHeadDomain.setConsigneeCompNm1(tmNxsComp22.getPrintCompNm1());
        ttPackingHeadDomain.setConsigneeCompNm2(tmNxsComp22.getPrintCompNm2());
        ttPackingHeadDomain.setConsigneeCompAddr1(tmNxsComp22.getPrintCompAddr1());
        ttPackingHeadDomain.setConsigneeCompAddr2(tmNxsComp22.getPrintCompAddr2());
        ttPackingHeadDomain.setConsigneeCompAddr3(tmNxsComp22.getPrintCompAddr3());
        ttPackingHeadDomain.setConsigneeCompAddr4(tmNxsComp22.getPrintCompAddr4());
        ttPackingHeadDomain.setConsigneeCompTel(tmNxsComp22.getCompTel());
        ttPackingHeadDomain.setConsigneeCompFax(tmNxsComp22.getCompFax());
        ttPackingHeadDomain.setConsigneeTaxIdNo(null);
        ttPackingHeadDomain.setConsigneeAttn(null);
        ttPackingHeadDomain.setShipToNm1(pltzItem23.getPrintShipToNm1());
        ttPackingHeadDomain.setShipToNm2(pltzItem23.getPrintShipToNm2());
        ttPackingHeadDomain.setShipToAddr1(pltzItem23.getPrintShipToAddr1());
        ttPackingHeadDomain.setShipToAddr2(pltzItem23.getPrintShipToAddr2());
        ttPackingHeadDomain.setShipToAddr3(pltzItem23.getPrintShipToAddr3());
        ttPackingHeadDomain.setShipToAddr4(pltzItem23.getPrintShipToAddr4());

        ttPackingHeadDomain.setShipperCompNmAbb(tmNxsComp21.getCompNmAbb());
        ttPackingHeadDomain.setInvoiceCtgryNm(invoiceCtgryNm);
        ttPackingHeadDomain.setShippedDt(null);
        ttPackingHeadDomain.setTrnsNm(trnsNm);
        ttPackingHeadDomain.setLPortCntryCd(criteria.getFmCntryCd());
        ttPackingHeadDomain.setLoadingPortNm(portNm_From);
        ttPackingHeadDomain.setDPortCntryCd(criteria.getToCntryCd());
        ttPackingHeadDomain.setDischargePortNm(portNm_To);
        // 2015/3/31 DNJP.Kawamura UT212対応UT212 START >>>>>
//        ttPackingHeadDomain.setDlivPoint(null);
        ttPackingHeadDomain.setDlivPoint(criteria.getDlivPoint());
        // 2015/3/31 DNJP.Kawamura UT212対応 END <<<<<
        ttPackingHeadDomain.setCarrierCompNmAbb(carrierCompNmAbb);
        ttPackingHeadDomain.setContainerNo1(null);
        ttPackingHeadDomain.setContainerNo2(null);
        ttPackingHeadDomain.setContainerNo3(null);
        ttPackingHeadDomain.setTotalNetWeightUnit(criteria.getWeightUnit());
        ttPackingHeadDomain.setTotalGrossWeightUnit(criteria.getWeightUnit());
        ttPackingHeadDomain.setTotalVolumeUnit(criteria.getVolumeUnit());
        ttPackingHeadDomain.setFileId(fileId_UploadPackinglistFile);
        ttPackingHeadDomain.setDeleteFlg(FLAG_N);
        // It sets to zero instead of NULL in numeric fields no input.
        // 入力のない数値項目にはNULLでなくゼロを設定する。
        nullToZeroNumericPropertiesForAttach(ttPackingHeadDomain); // ST948 ADD

        commonService.setCommonPropertyForRegist(ttPackingHeadDomain, criteria.getScreenId());
        
        ttPackingHeadService.create(ttPackingHeadDomain);

    }
    /**
     * W6002 4.2.1 Cancel Invoice registration
     * <br />W6002 4.2.1 キャンセルインボイス登録
     * <pre>
     * With the name of the TtInvoiceDomain,
     *  Call TtInvoiceService.Create(TtInvoiceDomain), and to register the data.
     * </pre>
     * <pre>
     * TtInvoiceDomainを引数にして、{@link
     *      TtInvoiceService#create(TtInvoiceDomain)}を呼出し、データを登録する。
     * </pre>
     * @param systemDt Time zone date<br />
     * タイムゾーン日付
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @return create count
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected int createTtInvoice2_421(Date systemDt, W6001DocCriteriaDomain criteria) 
        throws ApplicationException {
        BigDecimal minus = new BigDecimal(NUMBER_MINUS);
        // Get additional invoice data.
        //追加元インボイスデータの取得
        TtInvoiceCriteriaDomain ttInvoiceCriteriaDomain = new TtInvoiceCriteriaDomain();
        // ST946 MANUAL SCREEN TRANSITION MOD START
        //ttInvoiceCriteriaDomain.setShipperCd(criteria.getShipperCd());
        //ttInvoiceCriteriaDomain.setInvoiceNo(criteria.getOrgInvoiceNo());
        //ttInvoiceCriteriaDomain.setInvoiceIssueDt(criteria.getInvoiceIssueDt());
        ttInvoiceCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttInvoiceCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttInvoiceCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END
        ttInvoiceCriteriaDomain.setDeleteFlg(FLAG_N);
        List<? extends TtInvoiceDomain> ttInvoiceList = ttInvoiceService.searchByCondition(ttInvoiceCriteriaDomain);
        if (ttInvoiceList != null && ttInvoiceList.size() > 0) {
            TtInvoiceDomain ttInvoiceBase = ttInvoiceList.get(0);
            // Set canceled invoice data.
            //キャンセルインボイス情報設定
            TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();
    
            CommonUtil.copyPropertiesDomainToDomain(ttInvoiceDomain, ttInvoiceBase); 
            
            ttInvoiceDomain.setShipperCd(criteria.getShipperCd());
            ttInvoiceDomain.setInvoiceNo(criteria.getInvoiceNo());
            ttInvoiceDomain.setInvoiceIssueDt(systemDt);
            ttInvoiceDomain.setCancelTyp(CANCEL_TYPE_C);
            ttInvoiceDomain.setCancelInvoiceNo(criteria.getTakeOverInvoiceNo());
            ttInvoiceDomain.setCancelInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
            
            // ST946 MANUAL SCREEN TRANSITION MOD START
            //if (INVOICE_CLASS_FULL_RT.equals(criteria.getClassOfInv())) {
            //    ttInvoiceDomain.setParInvoiceNo(ttInvoiceBase.getParInvoiceNo());
            //} else {
            //    ttInvoiceDomain.setParInvoiceNo(criteria.getInvoiceNo());
            //}
            //ttInvoiceDomain.setParInvoiceShipperCd(criteria.getTakeOverShipperCd());
            //ttInvoiceDomain.setParInvoiceIssueDt(systemDt);

            // Parent of cancel FRT invoice is the normal main invoice (cancel target).
            // FRTインボイスのキャンセルインボイスの親はノーマル（キャンセル対象）のメインインボイスとする。
            if (INVOICE_CLASS_FULL_RT.equals(criteria.getClassOfInv())) {
                ttInvoiceDomain.setParInvoiceShipperCd(criteria.getTakeOverParInvoiceShipperCd());
                ttInvoiceDomain.setParInvoiceNo(criteria.getTakeOverParInvoiceNo());
                ttInvoiceDomain.setParInvoiceIssueDt(criteria.getTakeOverParInvoiceIssueDt());
            // Other myself.
            // その他は自分自身。
            } else {
                ttInvoiceDomain.setParInvoiceShipperCd(ttInvoiceDomain.getShipperCd());
                ttInvoiceDomain.setParInvoiceNo(ttInvoiceDomain.getInvoiceNo());
                ttInvoiceDomain.setParInvoiceIssueDt(ttInvoiceDomain.getInvoiceIssueDt());
            }
            // ST946 MANUAL SCREEN TRANSITION MOD END
            
            ttInvoiceDomain.setRelateInvoiceNo(criteria.getRelateInvoiceNo());
            ttInvoiceDomain.setRelateInvoiceShipperCd(criteria.getRelateInvoiceShipperCd());
            if (ttInvoiceBase.getNetAmount() != null) {
                ttInvoiceDomain.setNetAmount(ttInvoiceBase.getNetAmount().multiply(minus));
            }
            if (ttInvoiceBase.getFreight() != null) {
                ttInvoiceDomain.setFreight(ttInvoiceBase.getFreight().multiply(minus));
            }
            if (ttInvoiceBase.getInsurance() != null) {
                ttInvoiceDomain.setInsurance(ttInvoiceBase.getInsurance().multiply(minus));
            }
            if (ttInvoiceBase.getSubTotal() != null) {
                ttInvoiceDomain.setSubTotal(ttInvoiceBase.getSubTotal().multiply(minus));
            }
            ttInvoiceDomain.setVatRatio(ttInvoiceBase.getVatRatio());
            if (ttInvoiceBase.getVat() != null) {
                ttInvoiceDomain.setVat(ttInvoiceBase.getVat().multiply(minus));
            }
            if (ttInvoiceBase.getHandlingCharge() != null) {
                ttInvoiceDomain.setHandlingCharge(ttInvoiceBase.getHandlingCharge().multiply(minus));
            }
            // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
            ttInvoiceDomain.setAdditionalChargeCd(ttInvoiceBase.getAdditionalChargeCd());
            // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
            ttInvoiceDomain.setAdditionalChargeNm(ttInvoiceBase.getAdditionalChargeNm());
            if (ttInvoiceBase.getAdditionalCharge() != null) {
                ttInvoiceDomain.setAdditionalCharge(ttInvoiceBase.getAdditionalCharge().multiply(minus));
            }
            if (ttInvoiceBase.getTotalInvoiceAmount() != null) {
                ttInvoiceDomain.setTotalInvoiceAmount(ttInvoiceBase.getTotalInvoiceAmount().multiply(minus));
            }
            if (ttInvoiceBase.getNoCharge() != null) {
                ttInvoiceDomain.setNoCharge(ttInvoiceBase.getNoCharge().multiply(minus));
            }
            // ST948 DEL START
            //if (ttInvoiceBase.getPltzItemQty() != null) {
            //    ttInvoiceDomain.setPltzItemQty(ttInvoiceBase.getPltzItemQty().multiply(minus));
            //}
            // ST948 DEL END
            ttInvoiceDomain.setLPortCntryCd(criteria.getFmCntryCd());
            ttInvoiceDomain.setDPortCntryCd(criteria.getToCntryCd());
            
            commonService.setCommonPropertyForRegist(ttInvoiceDomain, criteria.getScreenId());
            
            try {
                ttInvoiceService.create(ttInvoiceDomain);
            } catch (IntegrationLayerException e) {
                if (ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX == e.getSqlErrorCode()) {
                    throw new GscmApplicationException(GSCM_E0_0020);
                }
                throw e;
            }
            return 1;
        }
        return 0;
    }
    /**
     * W6002 4.2.2 Cancel Invoice Header over registration
     * <br />W6002 4.2.2 キャンセルインボイスヘッダー登録
     * <pre>
     * With the name of the TtInvoiceHeaderDomain,
     *  Call TtInvoiceHeaderService.Create(TtInvoiceHeaderDomain), and to register the data.
     * </pre>
     * <pre>
     * TtInvoiceHeaderDomainを引数にして、{@link
     *      TtInvoiceHeaderService#create(TtInvoiceHeaderDomain)}を呼出し、データを登録する。
     * </pre>
     * @param systemDt Time zone date<br />
     * タイムゾーン日付
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param fileId_UploadInvoiceFile File ID of Upload Invoice File<br />
     * Upload Invoice File のFile ID
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void createTtInvoiceHeader2_422(Date systemDt, W6001DocCriteriaDomain criteria, String fileId_UploadInvoiceFile)
        throws ApplicationException {
        W6001DocCriteriaDomain updateCriteria = new W6001DocCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(updateCriteria, criteria);

        BigDecimal minus = new BigDecimal(NUMBER_MINUS);

        // Get additional invoice header data.
        //追加元インボイスヘッダーデータの取得
        TtInvoiceHeaderCriteriaDomain ttInvoiceHeaderCriteriaDomain = new TtInvoiceHeaderCriteriaDomain();
        // ST946 MANUAL SCREEN TRANSITION MOD START
        //ttInvoiceHeaderCriteriaDomain.setShipperCd(criteria.getShipperCd());
        //ttInvoiceHeaderCriteriaDomain.setInvoiceNo(criteria.getOrgInvoiceNo());
        //ttInvoiceHeaderCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttInvoiceHeaderCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttInvoiceHeaderCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttInvoiceHeaderCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END
        ttInvoiceHeaderCriteriaDomain.setDeleteFlg(FLAG_N);
        List<? extends TtInvoiceHeaderDomain> ttInvoiceHeaderList = ttInvoiceHeaderService.searchByCondition(ttInvoiceHeaderCriteriaDomain);

        if (ttInvoiceHeaderList != null && ttInvoiceHeaderList.size() > 0) {
            TtInvoiceHeaderDomain ttInvoiceHeaderBase = ttInvoiceHeaderList.get(0);
            // Set canceled invoice header data.
            //キャンセルインボイスヘッダー情報設定
            TtInvoiceHeaderDomain ttInvoiceHeaderDomain = new TtInvoiceHeaderDomain();
    
            CommonUtil.copyPropertiesDomainToDomain(ttInvoiceHeaderDomain, ttInvoiceHeaderBase); 
            
            ttInvoiceHeaderDomain.setShipperCd(criteria.getShipperCd());
            ttInvoiceHeaderDomain.setInvoiceNo(criteria.getInvoiceNo());
            ttInvoiceHeaderDomain.setInvoiceIssueDt(systemDt);
            ttInvoiceHeaderDomain.setCancelTyp(CANCEL_TYPE_C);
            ttInvoiceHeaderDomain.setCancelInvoiceNo(criteria.getTakeOverInvoiceNo());
            ttInvoiceHeaderDomain.setCancelInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());

            if (ttInvoiceHeaderDomain.getNetAmount() != null) {
                ttInvoiceHeaderDomain.setNetAmount(ttInvoiceHeaderBase.getNetAmount().multiply(minus));
            }
            if (ttInvoiceHeaderDomain.getFreight() != null) {
                ttInvoiceHeaderDomain.setFreight(ttInvoiceHeaderBase.getFreight().multiply(minus));
            }
            if (ttInvoiceHeaderDomain.getInsurance() != null) {
                ttInvoiceHeaderDomain.setInsurance(ttInvoiceHeaderBase.getInsurance().multiply(minus));
            }
            if (ttInvoiceHeaderDomain.getSubTotal() != null) {
                ttInvoiceHeaderDomain.setSubTotal(ttInvoiceHeaderBase.getSubTotal().multiply(minus));
            }
            if (ttInvoiceHeaderDomain.getVat() != null) {
                ttInvoiceHeaderDomain.setVat(ttInvoiceHeaderBase.getVat().multiply(minus));
            }
            if (ttInvoiceHeaderDomain.getHandlingCharge() != null) {
                ttInvoiceHeaderDomain.setHandlingCharge(ttInvoiceHeaderBase.getHandlingCharge().multiply(minus));
            }
            if (ttInvoiceHeaderDomain.getAdditionalCharge() != null) {
                ttInvoiceHeaderDomain.setAdditionalCharge(ttInvoiceHeaderBase.getAdditionalCharge().multiply(minus));
            }
            if (ttInvoiceHeaderDomain.getTotalInvoiceAmount() != null) {
                ttInvoiceHeaderDomain.setTotalInvoiceAmount(ttInvoiceHeaderBase.getTotalInvoiceAmount().multiply(minus));
            }
            ttInvoiceHeaderDomain.setTotalInvoiceAmountCurrCd(criteria.getCurrCd());
            // ST948 ADD START
            //ttInvoiceHeaderDomain.setNoCharge(null);
            ttInvoiceHeaderDomain.setNoCharge(BigDecimal.ZERO);
            // ST948 ADD END
            ttInvoiceHeaderDomain.setFileId(fileId_UploadInvoiceFile);
    
            commonService.setCommonPropertyForRegist(ttInvoiceHeaderDomain, criteria.getScreenId());
            
            ttInvoiceHeaderService.create(ttInvoiceHeaderDomain);
        }
    }
    /**
     * W6002 4.2.3 Cancel Invoice Attached registration
     * <br />W6002 4.2.3 キャンセルインボイスアタッチ登録
     * <pre>
     * With the name of the TitiaienubuioiceAttachedCriteriaDomain,
     *  Call TtInvoiceAttachedService # create(TtInvoiceAttachedDomain), to register the data.
     * </pre>
     * <pre>
     * TtInvoiceAttachedCriteriaDomainを引数にして、{@link
     *      TtInvoiceAttachedService#create(TtInvoiceAttachedDomain)}を呼出し、データを登録する。
     * </pre>
     * @param systemDt Time zone date<br />
     * タイムゾーン日付
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void createTtInvoiceAttached2_423(Date systemDt, W6001DocCriteriaDomain criteria) 
        throws ApplicationException {
        BigDecimal minus = new BigDecimal(NUMBER_MINUS);

        // Get additional invoice attached data.
        //追加元インボイスアタッチデータの取得
        TtInvoiceAttachedCriteriaDomain ttInvoiceAttachedCriteriaDomain = new TtInvoiceAttachedCriteriaDomain();
        // ST946 MANUAL SCREEN TRANSITION MOD START
        //ttInvoiceAttachedCriteriaDomain.setShipperCd(criteria.getShipperCd());
        //ttInvoiceAttachedCriteriaDomain.setInvoiceNo(criteria.getOrgInvoiceNo());
        //ttInvoiceAttachedCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttInvoiceAttachedCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttInvoiceAttachedCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttInvoiceAttachedCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END
        ttInvoiceAttachedCriteriaDomain.setDeleteFlg(FLAG_N);
        List<? extends TtInvoiceAttachedDomain> ttInvoiceAttachedList = ttInvoiceAttachedService.searchByCondition(ttInvoiceAttachedCriteriaDomain);
        
        // ST949 MOD START
        //if (ttInvoiceAttachedList != null && ttInvoiceAttachedList.size() > 0) {
        //    TtInvoiceAttachedDomain ttInvoiceAttachedBase = ttInvoiceAttachedList.get(0);
        for (TtInvoiceAttachedDomain ttInvoiceAttachedBase : ttInvoiceAttachedList) {
        // ST949 MOD END

            // Set canceled invoice attached data.
            //キャンセルインボイスアタッチの登録
            TtInvoiceAttachedDomain ttInvoiceAttachedDomain = new TtInvoiceAttachedDomain();
    
            CommonUtil.copyPropertiesDomainToDomain(ttInvoiceAttachedDomain, ttInvoiceAttachedBase); 
            
            ttInvoiceAttachedDomain.setShipperCd(criteria.getShipperCd());
            ttInvoiceAttachedDomain.setInvoiceNo(criteria.getInvoiceNo());
            ttInvoiceAttachedDomain.setInvoiceIssueDt(systemDt);
            ttInvoiceAttachedDomain.setInvoiceClass(criteria.getClassOfInv());
            ttInvoiceAttachedDomain.setCancelTyp(CANCEL_TYPE_C);
            if (ttInvoiceAttachedBase.getQty() != null) {
                ttInvoiceAttachedDomain.setQty(ttInvoiceAttachedBase.getQty().multiply(minus));
            }
            if (ttInvoiceAttachedBase.getAmount() != null) {
                ttInvoiceAttachedDomain.setAmount(ttInvoiceAttachedBase.getAmount().multiply(minus));
            }
            
            commonService.setCommonPropertyForRegist(ttInvoiceAttachedDomain, criteria.getScreenId());
            
            ttInvoiceAttachedService.create(ttInvoiceAttachedDomain);
        }
    }
    /**
     * W6002 4.2.4 cancellation Packing Header over registration
     * <br />W6002 4.2.4 キャンセルパッキングヘッダー登録
     * <pre>
     * With the name of the TtPackingHeadDomain,
     *  Call TtPackingHeadService # create(TtPackingHeadDomain), to register the data.
     * </pre>
     * <pre>
     * TtPackingHeadDomainを引数にして、{@link
     *      TtPackingHeadService#create(TtPackingHeadDomain)}を呼出し、データを登録する。
     * </pre>
     * @param systemDt Time zone date<br />
     * タイムゾーン日付
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param fileId_UploadInvoiceFile File ID of Upload Invoice File<br />
     * Upload Invoice File のFile ID
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void createTtPackingHead2_424(Date systemDt, W6001DocCriteriaDomain criteria, String fileId_UploadInvoiceFile) 
        throws ApplicationException {
        // Get additional packing header data.
        //追加元パッキングヘッダデータの取得
        TtPackingHeadCriteriaDomain ttPackingHeadCriteriaDomain = new TtPackingHeadCriteriaDomain();
        // ST946 MANUAL SCREEN TRANSITION MOD START
        //ttPackingHeadCriteriaDomain.setShipperCd(criteria.getShipperCd());
        //ttPackingHeadCriteriaDomain.setInvoiceNo(criteria.getOrgInvoiceNo());
        //ttPackingHeadCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttPackingHeadCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttPackingHeadCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttPackingHeadCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END
        ttPackingHeadCriteriaDomain.setDeleteFlg(FLAG_N);
        List<? extends TtPackingHeadDomain> ttPackingHeadList = ttPackingHeadService.searchByCondition(ttPackingHeadCriteriaDomain);
        if (ttPackingHeadList != null && ttPackingHeadList.size() > 0) {
            TtPackingHeadDomain ttPackingHeadBase = ttPackingHeadList.get(0);
            // Set canceled packing header data.
            //キャンセルパッキングヘッダーの登録
            TtPackingHeadDomain ttPackingHeadDomain = new TtPackingHeadDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(ttPackingHeadDomain, ttPackingHeadBase); 
            
            ttPackingHeadDomain.setShipperCd(criteria.getShipperCd());
            ttPackingHeadDomain.setInvoiceNo(criteria.getInvoiceNo());
            ttPackingHeadDomain.setInvoiceIssueDt(systemDt);
            ttPackingHeadDomain.setCancelTyp(CANCEL_TYPE_C);
            ttPackingHeadDomain.setCancelInvoiceNo(criteria.getTakeOverInvoiceNo());
            ttPackingHeadDomain.setCancelInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
            ttPackingHeadDomain.setFileId(fileId_UploadInvoiceFile);
            
            commonService.setCommonPropertyForRegist(ttPackingHeadDomain, criteria.getScreenId());
            
            ttPackingHeadService.create(ttPackingHeadDomain);
        }
    }
    /**
     * W6002 4.2.5 cancellation Packing Attached CML registration
     * <br />W6002 4.2.5 キャンセルパッキングアタッチ_CML登録
     * <pre>
     * With the name of the TtPackingAttachedCmlCriteriaDomain,
     *  Call TitiPackingAttachedCmlService # create(TtPackingAttachedCmlDomain), to register the data. 
     * </pre>
     * <pre>
     * TtPackingAttachedCmlCriteriaDomainを引数にして、{@link
     *      TtPackingAttachedCmlService#create(TtPackingAttachedCmlDomain)}を呼出し、データを登録する。
     * </pre>
     * @param systemDt Time zone date<br />
     * タイムゾーン日付
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param fileId_UploadInvoiceFile File ID of Upload Invoice File<br />
     * Upload Invoice File のFile ID
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void createTtPackingAttachedCml2_425(Date systemDt, W6001DocCriteriaDomain criteria, String fileId_UploadInvoiceFile)
        throws ApplicationException {
        // Get additional canceled packing attached CML data.
        //追加元キャンセルパッキングアタッチ_CMLデータの取得
        TtPackingAttachedCmlCriteriaDomain ttPackingAttachedCmlCriteriaDomain = new TtPackingAttachedCmlCriteriaDomain();
        // ST946 MANUAL SCREEN TRANSITION MOD START
        //ttPackingAttachedCmlCriteriaDomain.setShipperCd(criteria.getShipperCd());
        //ttPackingAttachedCmlCriteriaDomain.setInvoiceNo(criteria.getOrgInvoiceNo());
        //ttPackingAttachedCmlCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttPackingAttachedCmlCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttPackingAttachedCmlCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttPackingAttachedCmlCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END
        ttPackingAttachedCmlCriteriaDomain.setDeleteFlg(FLAG_N);
        List<? extends TtPackingAttachedCmlDomain> ttPackingAttachedCmlList = ttPackingAttachedCmlService
            .searchByCondition(ttPackingAttachedCmlCriteriaDomain);
        
        // ST949 MOD START
        //if (ttPackingAttachedCmlList != null && ttPackingAttachedCmlList.size() > 0) {
        //    TtPackingAttachedCmlDomain ttPackingAttachedCmlBase = ttPackingAttachedCmlList.get(0);
        for (TtPackingAttachedCmlDomain ttPackingAttachedCmlBase : ttPackingAttachedCmlList) {
        // ST949 MOD END

            // Set canceled packing attached CML data.
            //キャンセルパッキングアタッチ_CMLの登録
            TtPackingAttachedCmlDomain ttPackingAttachedCmlDomain = new TtPackingAttachedCmlDomain();
    
            CommonUtil.copyPropertiesDomainToDomain(ttPackingAttachedCmlDomain, ttPackingAttachedCmlBase); 
            
            ttPackingAttachedCmlDomain.setShipperCd(criteria.getShipperCd());
            ttPackingAttachedCmlDomain.setInvoiceNo(criteria.getInvoiceNo());
            ttPackingAttachedCmlDomain.setInvoiceIssueDt(systemDt);
            ttPackingAttachedCmlDomain.setCancelTyp(CANCEL_TYPE_C);
            
            commonService.setCommonPropertyForRegist(ttPackingAttachedCmlDomain, criteria.getScreenId());
            
            ttPackingAttachedCmlService.create(ttPackingAttachedCmlDomain);
        }    
    }
    /**
     * W6002 4.2.6 cancellation Packing Attached Item No registration
     * <br />W6002 4.2.6 キャンセルパッキングアタッチ_品目番号登録
     * <pre>
     * With the name of the TtPackAtchItemNoDomain,
     *  Call TtPackAtchItemNoService # create(TtPackAtchItemNoDomain), to register the data.
     * </pre>
     * <pre>
     * TtPackAtchItemNoDomainを引数にして、{@link
     *      TtPackAtchItemNoService#create(TtPackAtchItemNoDomain)}を呼出し、データを登録する。
     * </pre>
     * @param systemDt Time zone date<br />
     * タイムゾーン日付
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @param fileId_UploadInvoiceFile File ID of Upload Invoice File<br />
     * Upload Invoice File のFile ID
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void createTtPackAtchItemNo2_426(Date systemDt, W6001DocCriteriaDomain criteria, String fileId_UploadInvoiceFile)
        throws ApplicationException {
        // Get canceled packing attached item no data.
        //追加元キャンセルパッキングアタッチ_品目番号データの取得
        TtPackAtchItemNoCriteriaDomain ttPackAtchItemNoCriteriaDomain = new TtPackAtchItemNoCriteriaDomain();
        // ST946 MANUAL SCREEN TRANSITION MOD START
        //ttPackAtchItemNoCriteriaDomain.setShipperCd(criteria.getShipperCd());
        //ttPackAtchItemNoCriteriaDomain.setInvoiceNo(criteria.getOrgInvoiceNo());
        //ttPackAtchItemNoCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttPackAtchItemNoCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttPackAtchItemNoCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttPackAtchItemNoCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END
        ttPackAtchItemNoCriteriaDomain.setDeleteFlg(FLAG_N);
        List<? extends TtPackAtchItemNoDomain> ttPackAtchItemNoList = ttPackAtchItemNoService.searchByCondition(ttPackAtchItemNoCriteriaDomain);

        // ST949 MOD START
        //if (ttPackAtchItemNoList != null && ttPackAtchItemNoList.size() > 0) {
        //    TtPackAtchItemNoDomain ttPackAtchItemNoBase = ttPackAtchItemNoList.get(0);
        for (TtPackAtchItemNoDomain ttPackAtchItemNoBase : ttPackAtchItemNoList) {
        // ST949 MOD END

            // Set canceled packing attached item no data.
            //キャンセルパッキングアタッチ_品目番号の登録
            TtPackAtchItemNoDomain ttPackAtchItemNoDomain = new TtPackAtchItemNoDomain();
    
            CommonUtil.copyPropertiesDomainToDomain(ttPackAtchItemNoDomain, ttPackAtchItemNoBase); 
            
            ttPackAtchItemNoDomain.setShipperCd(criteria.getShipperCd());
            ttPackAtchItemNoDomain.setInvoiceNo(criteria.getInvoiceNo());
            ttPackAtchItemNoDomain.setInvoiceIssueDt(systemDt);
            ttPackAtchItemNoDomain.setCancelTyp(CANCEL_TYPE_C);
    
            commonService.setCommonPropertyForRegist(ttPackAtchItemNoDomain, criteria.getScreenId());
            
            ttPackAtchItemNoService.create(ttPackAtchItemNoDomain);
        }
    }
    /**
     * W6002 4.2.7 Update of Invoice data before cancellation
     * <br />W6002 4.2.7 キャンセル前インボイスデータの更新
     * <pre>
     * With the name of the TtInvoiceDomain,
     *  Call TtInvoiceService # UpdateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * TtInvoiceDomainを引数にして、{@link
     *      TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * @param criteria update condition domain<br />
     * 更新条件ドメイン
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void updateTtInvoice2_427(W6001DocCriteriaDomain criteria) throws ApplicationException {

        TtInvoiceCriteriaDomain ttInvoiceCriteriaDomain = new TtInvoiceCriteriaDomain();
        // ST946 MANUAL SCREEN TRANSITION ADD START
        //ttInvoiceCriteriaDomain.setShipperCd(criteria.getShipperCd());
        //ttInvoiceCriteriaDomain.setInvoiceNo(criteria.getOrgInvoiceNo());
        //ttInvoiceCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        ttInvoiceCriteriaDomain.setShipperCd(criteria.getTakeOverShipperCd());
        ttInvoiceCriteriaDomain.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        ttInvoiceCriteriaDomain.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION ADD END
        ttInvoiceCriteriaDomain.setDeleteFlg(FLAG_N);
        
        TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();
        ttInvoiceDomain.setCancelFlg(FLAG_Y);
        
        commonService.setCommonPropertyForUpdate(ttInvoiceDomain, criteria.getScreenId());

        ttInvoiceService.updateByCondition(ttInvoiceDomain, ttInvoiceCriteriaDomain);
    }
    /**
     * Update of W6002 4.2.7 Palletize table
     * <br />W6002 4.2.7 パレタイズテーブルの更新
     * <pre>
     * Canceling of Non DN-G Invoice, updated clear, the STATUS of Invoice No. Palletize of table
     * Non DN-G Invoiceのキャンセル時、パレタイズテーブルのInvoice No.をクリア、ステータスの更新
     * </pre>
     * @param criteria update condition domain<br />
     * 
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void updateTtPltz2_427(W6001DocCriteriaDomain criteria) throws ApplicationException {

        // 4.2.7 Set canceled non DN-G invoice data.
        // 4.2.7 Non DN-G Invoiceのキャンセル時
        W6001DocCriteriaDomain newCriteria = new W6001DocCriteriaDomain();
        // ST946 MANUAL SCREEN TRANSITION MOD START
        //newCriteria.setShipperCd(criteria.getShipperCd());
        //newCriteria.setInvoiceNo(criteria.getOrgInvoiceNo());
        //newCriteria.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        newCriteria.setShipperCd(criteria.getTakeOverShipperCd());
        newCriteria.setInvoiceNo(criteria.getTakeOverInvoiceNo());
        newCriteria.setInvoiceIssueDt(criteria.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END
        
        // 4.2.7.1.1 Get Palletize STATUS clear and Invoice No. Palletize the table.
        // - パレタイズテーブルのInvoice No.のクリアとパレタイズステータスの変更(ロック)
        // CriteriaDomainを引数にして、{@link
        // W6001DocDao#lockByNoWaitTtPltz(W6001DocCriteriaDomain)}を呼出し、データを更新する。
        
        // ST944 MOD START
        // W6001DocPltzDomain pltzDomain =  w6001DocDao.lockByNoWaitTtPltz(newCriteria);
        //if(null == pltzDomain) {
        //    throw new ValidationException(Arrays.asList(new MessageDomain("", NXS_E1_0010, null)));
        //}
        // Considering the manual invoice palletizing does not exist, and exits the process when 0 palletizing.
        // パレタイズが紐付かないマニュアルインボイスを考慮し、パレタイズ0件の場合処理を抜ける。
        List<W6001DocPltzDomain> w6001DocPltzDomainList =  w6001DocDao.lockByNoWaitTtPltz(newCriteria);
        if (w6001DocPltzDomainList.size() == 0) {
            return;
        }
        // ST944 MOD END
        
        // 4.2.7.1.2 Get Palletize STATUS clear and Invoice No. Palletize the table.
        // - パレタイズテーブルのInvoice No.のクリアとパレタイズステータスの変更(カウント取得)
        // CriteriaDomainを引数にして、{@link
        // W6001DocDao#searchTtPltz(W6001DocCriteriaDomain)}を呼出し、データを取得する。
        
        // ST944 MOD START
        // W6001DocInvoiceDomain w6001DocInvoiceDomain = w6001DocDao.searchTtPltz(newCriteria);
        List<W6001DocInvoiceDomain> w6001DocInvoiceDomainList = w6001DocDao.searchTtPltz(newCriteria);
        if (w6001DocInvoiceDomainList.size() != 1) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", NXS_E1_0010, null)));
        }
        W6001DocInvoiceDomain w6001DocInvoiceDomain = w6001DocInvoiceDomainList.get(0);
        //ST944 MOD END

        // 4.2.7.1.3 Exclusion check.
        // 排他チェック
        if (w6001DocInvoiceDomain.getCountMainMark() == 0) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", NXS_E1_0010, null)));
        } else {
            if (CUSTOM_TIMING_TYPE_A.equals(w6001DocInvoiceDomain.getCustomTimingTyp())) {
                if (PLTZ_STATUS_90.equals(w6001DocInvoiceDomain.getPltzStatus())) {
                    throw new ValidationException(Arrays.asList(new MessageDomain("", NXS_E7_0077, null)));
                }
            } else if (CUSTOM_TIMING_TYPE_B.equals(w6001DocInvoiceDomain.getCustomTimingTyp())) {
                if (PLTZ_STATUS_90.equals(w6001DocInvoiceDomain.getPltzStatus())) {
                    throw new ValidationException(Arrays.asList(new MessageDomain("", NXS_E7_0077, null)));
                }

            } else if (CUSTOM_TIMING_TYPE_Z.equals(w6001DocInvoiceDomain.getCustomTimingTyp())) {
                if (PLTZ_STATUS_90.equals(w6001DocInvoiceDomain.getPltzStatus())) {
                    throw new ValidationException(Arrays.asList(new MessageDomain("", NXS_E7_0077, null)));
                }
            }
        }
        // 4.2.7.2 Set palletize status data.
        // - パレタイズのInvoice No.のクリアとパレタイズステータスの変更(更新)
        // TtPltzCriteriaDomainを引数にして、{@link
        // TtPltzService#updateByCondition(TtPltzCriteriaDomain)}を呼出し、データを更新する。
        if (CUSTOM_TIMING_TYPE_A.equals(w6001DocInvoiceDomain
            .getCustomTimingTyp())) {
            newCriteria.setPltzStatus(PLTZ_STATUS_80);
        } else if (CUSTOM_TIMING_TYPE_B.equals(w6001DocInvoiceDomain
            .getCustomTimingTyp())) {
            newCriteria.setPltzStatus(PLTZ_STATUS_50);

        } else if (CUSTOM_TIMING_TYPE_Z.equals(w6001DocInvoiceDomain
            .getCustomTimingTyp())) {
            newCriteria.setPltzStatus(PLTZ_STATUS_30);
        }
        w6001DocDao.updateTtPltzByPltzStatus(newCriteria);

    }

    /**
     * Upload the FILE DATA
     * <br />ファイルデータをアップロードします。
     * <pre>
     * - Register to File Manage the FILE DATA.
     *   Call FileManagementService.createFileUpload(InputStream, String, Number, String).
     * </pre>
     * <pre>
     * ‐ファイルデータをファイル管理に登録。
     *     {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}を呼出します。
     * </pre>
     * 
     * @param fileData FILE DATA<br />
     * ファイルデータ
     * @param fileName FILE NAME<br />
     * ファイル名
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @return FILE ID<br />
     * ファイルID
     * @throws ApplicationException Unable to upload FILE DATA<br />
     * ファイルデータのアップロードができない場合
     */
    protected String createFileUpload(InputStream fileData, String fileName, String dscId)
        throws ApplicationException {
        
        String fileId;
        try {
            fileId = fileManagerServiceForStream.createFileUpload(fileData, fileName, DateUtil.getSaveLimitTerm(DateUtil.PERMANENT, null), dscId);
        } catch (FileManagementException e) {
            throw new GscmApplicationException(e.getErrorCode());
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        }
        return fileId;
    }

    /**
     * W6007 3.3 Get the information from Part export procedures Part basic unit, Updated Invoice created for Part Number work
     * <br />W6007 3.3 輸出手続品番原単位から品番情報を取得し、インボイス作成対象品番ワークを更新
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void searchOnDetailInit_3300(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(docCriteria, criteria);
        commonService.setCommonPropertyForUpdate(docCriteria, SCREEN_ID_W6007);
        // Clear invoice item no work data.
        // - 輸出手続品番原単位から取得する情報を、ワークから一度クリア
        w6001DocDao.updateTwInvItemOnInvoiceDetailForClear(docCriteria);

        // Get free item name.
        // Free項目名称の取得
        TmInvFreeItemCriteriaDomain invFreeItemCriteriaDomain = new TmInvFreeItemCriteriaDomain();
        invFreeItemCriteriaDomain.setCompCd(docCriteria.getShipperCd());
        invFreeItemCriteriaDomain.setPreferredOrder("FREE_COL_NO");
        List<TmInvFreeItemDomain> invFreeItemList = tmInvFreeItemService.searchByCondition(invFreeItemCriteriaDomain);
        
        // Get the part number information from export procedures Part intensity corresponding to the search criteria..
        // - 輸出手続品番原単位から品番情報を取得
        // criteriaDomainを引数にして、{@link
        // W6001DocDao#searchTmExpFormalitiItemNo(W6001DocCriteriaDomain)}を呼出し、データを取得する
        String timezoneId = commonService.searchTimezone(docCriteria.getShipperCd());
        Date nowDt = DateUtils.truncate(DateUtil.convertTime(new Date(), timezoneId), Calendar.DAY_OF_MONTH);

        docCriteria.setAplyStrtDt(nowDt);
        List<? extends W6001DocPltzItemDomain> ptlzItemList = w6001DocDao.searchTmExpFormalitiItemNo(docCriteria);
        
        if (ptlzItemList != null) {
            // Get item data from the export formality item no master table.
            // - 輸出手続品番原単位から品番情報を登録
            // {@link TwInvCriteriaDomain}に項目を設定し、{@link
            // TwInvItemService#searchByCondition(TwInvCriteriaDomain)}を呼出し、データを取得する
            for (W6001DocPltzItemDomain ptlzItem : ptlzItemList) {
                TwInvItemCriteriaDomain updTwInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
                updTwInvItemCriteriaDomain.setDscId(criteria.getDscId());
                updTwInvItemCriteriaDomain.setMainMark(ptlzItem.getMainMark());
                updTwInvItemCriteriaDomain.setBrch(ptlzItem.getBrch());
                updTwInvItemCriteriaDomain.setSortOdr(ptlzItem.getSortOdr());
                
                TwInvItemDomain updTwInvItem = new TwInvItemDomain();
                updTwInvItem.setHsCd(ptlzItem.getHsCd());
                updTwInvItem.setFree1RegFlg(ptlzItem.getFree1RegFlg());
                updTwInvItem.setFree1Dtl(ptlzItem.getFree1Dtl());
                updTwInvItem.setFree1OriginCntryFlg(ptlzItem.getFree1OriginCntryFlg());
                updTwInvItem.setFree2RegFlg(ptlzItem.getFree2RegFlg());
                updTwInvItem.setFree2Dtl(ptlzItem.getFree2Dtl());
                updTwInvItem.setFree2OriginCntryFlg(ptlzItem.getFree2OriginCntryFlg());
                updTwInvItem.setFree3RegFlg(ptlzItem.getFree3RegFlg());
                updTwInvItem.setFree3Dtl(ptlzItem.getFree3Dtl());
                updTwInvItem.setFree3OriginCntryFlg(ptlzItem.getFree3OriginCntryFlg());
                // Set invoice free item data.
                // TM_INV_FREE_ITEM（インボイスフリー項目原単位）から取得して設定
                if (invFreeItemList != null) {
                    for (TmInvFreeItemDomain invFreeItem : invFreeItemList) {
                        if ("1".equals(invFreeItem.getFreeColNo().toPlainString())) {
                            updTwInvItem.setFree1Nm(invFreeItem.getFreeColNm());
                        } else if ("2".equals(invFreeItem.getFreeColNo().toPlainString())) {
                            updTwInvItem.setFree2Nm(invFreeItem.getFreeColNm());
                        } else if ("3".equals(invFreeItem.getFreeColNo().toPlainString())) {
                            updTwInvItem.setFree3Nm(invFreeItem.getFreeColNm());
                        }
                    }
                }
                commonService.setCommonPropertyForUpdate(updTwInvItem, SCREEN_ID_W6007);
                twInvItemService.updateByCondition(updTwInvItem, updTwInvItemCriteriaDomain);
            }
        }
    }

    /**
     * W6007 3.4 Get currency, the UNIT PRICE information from CIGMA, Updated Invoice Number created for work
     * <br />W6007 3.4 CIGMAから通貨、単価情報を取得し、インボイス作成対象品番ワークを更新
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void searchOnDetailInit_3400(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        // Clear CURRENCY CODE / CURRENCY CODE of Invoice Item No Work, the UNIT PRICE / UNIT PRICE.
        // - CIGMAから取得する情報を、ワークから一度クリアする
        w6001DocDao.updateClearPriceByTwInvItem(criteria);

        // Get invoice item work data.
        // - Webサービスに渡す情報の取得
        TwInvItemCriteriaDomain twInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
        twInvItemCriteriaDomain.setDscId(criteria.getDscId());
        twInvItemCriteriaDomain.setShipperCd(criteria.getShipperCd());
        twInvItemCriteriaDomain.setGrpNo1(criteria.getGrpNo1());
        twInvItemCriteriaDomain.setGrpNo2(criteria.getGrpNo2());
        twInvItemCriteriaDomain.setRemoveFlg(FLAG_N);
        List<? extends TwInvItemDomain> twInvItemList = twInvItemService
            .searchByCondition(twInvItemCriteriaDomain);
        
        if (twInvItemList != null && !twInvItemList.isEmpty()) {
            // Get the Unit price information MA by using the (WS6004) Web Services.
            // Ws処理
            // - CIGMAから品番情報を取得 Webサービス「ECA0027_WS_6004：Get Sales Prince
            // Info(Sales Price MA 情報検索)」のコール
            Ws6004ParamDomain ws6004ParamDomain = new Ws6004ParamDomain();
            ws6004ParamDomain.setCustomerNoLegacy(StringUtil.getEmptyToBlank(criteria.getCustomerCd()));
            ws6004ParamDomain.setDateShipped(DateUtil.formatDate(criteria.getDateShipped(), criteria.getScreenDateFormat(), WS_CIGMA_DATE_FORMAT));
            List<String> partNoList = new ArrayList<String>();
            for (TwInvItemDomain twInvItem : twInvItemList) {
                if (StringUtils.isNotEmpty(twInvItem.getItemNo())) {
                    partNoList.add(twInvItem.getItemNo());
                }
            }
            ws6004ParamDomain.setPartNoList(partNoList);
            Ws6004ResultDomain ws6004ResultDomain = ws6004RestService
                .getSalesPriceInfo(criteria.getShipperCd(), ws6004ParamDomain);
            if (!WS_RESULT_SUCCESS.equals(ws6004ResultDomain.getResultCode())) {
                if (ws6004ResultDomain.getErrorList().isEmpty()) {
                    throw new SystemException(NXS_91_0001);
                } else {
                    throw new GscmApplicationException(ws6004ResultDomain.getErrorList().get(0).getErrorCode());
                }
            }
            // Set item information (currency and unit price).
            // - CIGMAから品番情報（通貨、単価）を登録
            List<? extends Ws6004ResultItemDomain> salesPriceList = ws6004ResultDomain.getSalesPriceList();
            if (WS_RESULT_SUCCESS.equals(ws6004ResultDomain.getResultCode())
                && salesPriceList != null) {
                
                for (TwInvItemDomain twInvItem : twInvItemList) {
                    
                    String currCd = null;
                    String unitPrice = null;
                    for (Ws6004ResultItemDomain salesPrice : salesPriceList) {
                        if (twInvItem.getItemNo().equals(StringUtils.trim(salesPrice.getPrtno()))) {
                            currCd = salesPrice.getCurr3();
                            unitPrice = salesPrice.getPrice();
                            break;
                        }
                    }
                    
                    if (currCd != null || unitPrice != null) {
                        
                        TwInvItemDomain updTwInvItemDomain = new TwInvItemDomain();
                        if (currCd != null) {
                            updTwInvItemDomain.setCurrCd(currCd);
                        }
                        if (unitPrice != null) {
                            updTwInvItemDomain.setUnitPrice(new BigDecimal(unitPrice));
                        }
                        
                        TwInvItemCriteriaDomain updTwInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
                        updTwInvItemCriteriaDomain.setDscId(twInvItem.getDscId());
                        updTwInvItemCriteriaDomain.setShipperCd(twInvItem.getShipperCd());
                        updTwInvItemCriteriaDomain.setBrch(twInvItem.getBrch());
                        updTwInvItemCriteriaDomain.setSortOdr(twInvItem.getSortOdr());
                        
                        twInvItemService.updateByCondition(updTwInvItemDomain,
                            updTwInvItemCriteriaDomain);
                    }
                }
            }
        }
    }

    /**
     * Get customer item information from CIGMA, update invoice item work
     * <br />CIGMAから得意先品番情報を取得し、インボイス作成対象品番ワークへ更新
     * 
     * UT436 ADD
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException case of abnormality<br />
     * 異常の場合
     */
    protected void updateTwInvItemItemDescription(W6001DocCriteriaDomain criteria) throws ApplicationException {

        // Extraction of the customer part number to complete the name.
        // 名称を補完したい得意先品番の抽出。
        TwInvItemCriteriaDomain twInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
        twInvItemCriteriaDomain.setDscId(criteria.getDscId());
        twInvItemCriteriaDomain.setShipperCd(criteria.getShipperCd());
        twInvItemCriteriaDomain.setGrpNo1(criteria.getGrpNo1());
        twInvItemCriteriaDomain.setGrpNo2(criteria.getGrpNo2());
        twInvItemCriteriaDomain.setRemoveFlg(FLAG_N);
        List<TwInvItemDomain> twInvItemResultDomainList
            = twInvItemService.searchByCondition(twInvItemCriteriaDomain);
        if (twInvItemResultDomainList.isEmpty()) {
            return;
        }
        List<String> customerItemNoList = new ArrayList<String>();
        for (TwInvItemDomain twInvItemResultDomain : twInvItemResultDomainList) {
            customerItemNoList.add(twInvItemResultDomain.getCustomerItemNo());
        }

        // Call web service Ws6011-Get Part No. Cross Reference.
        // And Make customer item No. - item description map from the result.
        // WebサービスWs6011-Get Part No. Cross Referenceをコールし、戻り値から得意先品番 - 名称のマップを作成。
        Ws6011ParamDomain ws6011ParamDomain = new Ws6011ParamDomain();
        ws6011ParamDomain.setCusno(criteria.getCustomerCd());
        ws6011ParamDomain.setRefDt(DateUtil.formatDate(criteria.getDateShipped(),
            criteria.getScreenDateFormat(), WS_CIGMA_DATE_FORMAT));
        ws6011ParamDomain.setCustomerItemNoList(customerItemNoList);
        Ws6011ResultDomain ws6011ResultDomain
            = ws6011RestService.getCustomerItemInfo(criteria.getShipperCd(), ws6011ParamDomain);
        Map<String, String> customerItemMap = new HashMap<String, String>();
        for (Ws6011ItemDomain ws6011ItemResultDomain : ws6011ResultDomain.getItemInfoList()) {
            if (!customerItemMap.containsKey(ws6011ItemResultDomain.getCprtn())) {
                customerItemMap.put(ws6011ItemResultDomain.getCprtn(), ws6011ItemResultDomain.getCpdsc());
            }
        }

        // Update item description to Invoice Item No Work.
        // 名称をインボイス作成対象品目番号ワークに更新する。
        for (TwInvItemDomain twInvItemResultDomain : twInvItemResultDomainList) {
            String itemDescription = customerItemMap.get(twInvItemResultDomain.getCustomerItemNo());
            if (StringUtils.isNotEmpty(itemDescription)) {
                twInvItemResultDomain.setItemDescription(itemDescription);
            }
        }
        twInvItemService.update(twInvItemResultDomainList);
    }

    /**
     * Remove対象のFRT品をインボイスグループから削除します。
     *
     * @param dscId DSC-ID
     * @param shipperCd Shipper code
     * @param grpNo1 Group No.first
     * @return Number of delete count.
     * @throws ApplicationException error occur
     */
    protected int deleteTwInvOnDetailByGrpNo2ForFrt (String dscId, String shipperCd, String grpNo1) 
        throws ApplicationException {

        int deleteCnt = 0;
        
        // Get target key data from invoice item work table.
        // RemoveしたFRT品のGRP_NO_2をインボイス品番ワークから取得
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setShipperCd(shipperCd);
        criteria.setGrpNo1(grpNo1);
        List<? extends W6001DocPltzItemDomain> twInvItemList = w6001DocDao.searchTwInvItemByRemoveGrpNo2(criteria);
        for (W6001DocPltzItemDomain twInvItemDomain : twInvItemList) {
            TwInvCriteriaDomain twInvCriteria = new TwInvCriteriaDomain();
            twInvCriteria.setDscId(dscId);
            twInvCriteria.setShipperCd(shipperCd);
            twInvCriteria.setGrpNo1(grpNo1);
            twInvCriteria.setGrpNo2(twInvItemDomain.getGrpNo2());
            twInvCriteria.setSearchCountCheckFlg(false);
            if (twInvService.searchCount(twInvCriteria) > 0) {
                deleteCnt += twInvService.deleteByCondition(twInvCriteria);
            }
        }
        return deleteCnt;
    }
    
    /**
     * Get file stream data from File Manager by file id.
     * <br />ファイル管理からデータを取得します。
     *
     * @param fileId File id
     * @return file stream.
     */
    protected InputStream getFileDataStream(String fileId) {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        try {
            fileManagerServiceForStream.searchFileDownload(fileId, true, outStream);
        } catch (FileManagementException e) {
            return null;
        } catch (UnsupportedEncodingException e) {
            return null;
        } catch (IOException e) {
            return null;
        }
        return new ByteArrayInputStream(outStream.toByteArray());
    }
    
    /**
     * 
     * search Documentation Data for selected Invoice No.
     * <br />選択したインボイスNoに紐づく帳票データを取得します。
     * 
     * @param shipperCd Shipper Code
     * @param invoiceNo Invoice No
     * @param invoiceIssueDt Invoice Issue Date
     * @return Documentation Data
     * @throws ApplicationException ApplicationException
     */
    protected File searchDocumentationData (String shipperCd, String invoiceNo, Date invoiceIssueDt) 
        throws ApplicationException {
        
        // UT186 ZIP DOWNLOAD MOD START
//        List<InputStream> docDataList = new ArrayList<InputStream>();
//        
//        // Get the Parent invoice no.
//        String parInvoiceNo = searchTtInvoiceOnRegisterByPrintDoc(shipperCd, invoiceNo, invoiceIssueDt);
//        if (parInvoiceNo == null) {
//            throw new GscmApplicationException(NXS_E7_0064);
//        }
//        
//        // Get documentation data for Main invoice no.
//        File mainFile = searchFileDataOnMainByPrintDocument(shipperCd, parInvoiceNo, invoiceIssueDt);
//        try {
//            docDataList.add(new FileInputStream(mainFile));
//        } catch (FileNotFoundException e) {
//            throw new SystemException(NXS_91_0001);
//        }
//
//        // Get FRT-Invoice no.
//        TtInvoiceCriteriaDomain invoiceCriteria = new TtInvoiceCriteriaDomain();
//        invoiceCriteria.setShipperCd(shipperCd);
//        invoiceCriteria.setParInvoiceNo(parInvoiceNo);
//        invoiceCriteria.setInvoiceIssueDt(invoiceIssueDt);
//        invoiceCriteria.setInvoiceClass(INVOICE_CLASS_FULL_RT);
//        invoiceCriteria.setPreferredOrder("INVOICE_NO");
//        List<? extends TtInvoiceDomain> invoiceDomainList = ttInvoiceService.searchByCondition(invoiceCriteria);
//
//        // Get documentation data for FRT invoice no.
//        for (TtInvoiceDomain invoiceDomain : invoiceDomainList) {
//            File frtFile = searchFileDataOnMainByPrintDocument(shipperCd, invoiceDomain.getInvoiceNo(), invoiceIssueDt);
//            try {
//                docDataList.add(new FileInputStream(frtFile));
//            } catch (FileNotFoundException e) {
//                throw new SystemException(NXS_91_0001);
//            }
//        }
//        // Merge documentation data for Main invoice no and FRT invoice no.
//        return commonService.mergePdf(parInvoiceNo + EXT_PDF, docDataList.toArray(new InputStream[0]));


        // Search documentation data by selected Invoice No., And archive to zip file.
        // 選択したインボイスNoに紐づく帳票データを取得しzipファイルにまとめる。
        W6001DocCriteriaDomain fileIdCriteriaDomain = new W6001DocCriteriaDomain();
        fileIdCriteriaDomain.setTakeOverParInvoiceShipperCd(shipperCd);
        fileIdCriteriaDomain.setTakeOverParInvoiceNo(invoiceNo);
        fileIdCriteriaDomain.setTakeOverParInvoiceIssueDt(invoiceIssueDt);
        List<W6001DocInvoiceDomain> fileIdResultDomainList
            = w6001DocDao.searchFileIdByParentInvoiceKey(fileIdCriteriaDomain);
        List<String> fileIdList = new ArrayList<String>();
        for (W6001DocInvoiceDomain fileIdResultDomain : fileIdResultDomainList) {
            if (StringUtils.isNotEmpty(fileIdResultDomain.getInvoiceHeaderFileId())) {
                fileIdList.add(fileIdResultDomain.getInvoiceHeaderFileId());
            } else {
                // Invoice header file attachments required if the normal invoice.
                // ノーマルインボイスであればインボイスヘッダファイル添付は必須。
                if (CANCEL_TYP_NORMAL.equals(fileIdResultDomain.getCancelTyp())) {
                    throw new GscmApplicationException(NXS_E7_0064);
                }
            }
            if (StringUtils.isNotEmpty(fileIdResultDomain.getPackingHeadFileId())) {
                fileIdList.add(fileIdResultDomain.getPackingHeadFileId());
            }
            if (StringUtils.isNotEmpty(fileIdResultDomain.getScHeaderFileId())) {
                fileIdList.add(fileIdResultDomain.getScHeaderFileId());
            }
            // UT205 CML ATTACH CSV ADD START
            if (StringUtils.isNotEmpty(fileIdResultDomain.getCmlAtchCsvFileId())) {
                fileIdList.add(fileIdResultDomain.getCmlAtchCsvFileId());
            }
            // UT205 CML ATTACH CSV ADD END
        }
        if (fileIdList.size() == 0) {
            throw new GscmApplicationException(NXS_E7_0064);
        }

        File temporaryZipFile = commonService.searchFileManagerReturnByZip(fileIdList);
        return temporaryZipFile;
        // UT186 ZIP DOWNLOAD MOD END
    }

// UT186 ZIP DOWNLOAD DEL
//    /**
//     * Get the PDF output target data.
//     * <br />PDF出力対象データを取得します。
//     * <pre>
//     * - Invoice search TtInvoiceCriteriaDomain Set the following items,
//     *   Call TtInvoiceService.SearchByKey (TtInvoiceCriteriaDomain).
//     *     - SHIPPER CODE
//     *     - Invoice No
//     *     - INVOICE ISSUE DATE
//     * </pre>
//     * <pre>
//     * ‐インボイス検索
//     *     {@link TtInvoiceCriteriaDomain}に以下の項目を設定し、
//     *     {@link TtInvoiceService#searchByKey(TtInvoiceCriteriaDomain)}を呼び出します。
//     *       ‐荷主コード
//     *       ‐インボイスNo
//     *       ‐インボイス発行日
//     * </pre>
//     * 
//     * @param shipperCd SHIPPER CODE<br />
//     * 荷主コード
//     * @param invoiceNo Invoice No<br />
//     * インボイスNo
//     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
//     * インボイス発行日
//     * @return Parent Invoice No Invoice of information obtained<br />
//     * 取得したインボイス情報の親インボイスNo
//     * @throws ApplicationException Can not get the PDF output target data<br />
//     * PDF出力対象データの取得ができない場合
//     */
//    protected String searchTtInvoiceOnRegisterByPrintDoc(String shipperCd, String invoiceNo, Date invoiceIssueDt) 
//        throws ApplicationException {
//
//        TtInvoiceCriteriaDomain criteria = new TtInvoiceCriteriaDomain();
//        criteria.setShipperCd(shipperCd);
//        criteria.setInvoiceNo(invoiceNo);
//        criteria.setInvoiceIssueDt(invoiceIssueDt);
//        
//        TtInvoiceDomain domain = ttInvoiceService.searchByKey(criteria);
//        if (domain == null || StringUtils.isEmpty(domain.getParInvoiceNo())) {
//            return null;
//        }
//        return domain.getParInvoiceNo();
//    }
//    
//    /**
//     * Get FILE ID to extract.
//     * <br />抽出するファイルIDを取得します。
//     * <pre>
//     * - Search Invoice, Invoice Header, Packing Header, of Services Contract Header W6001DocCriteriaDomain Set the following items,
//     *   Call W6001DocDao.EsuieirchTtInvoiceByFileManager (W6001DocCriteriaDomain).
//     *     - SHIPPER CODE
//     *     - Invoice No
//     *     - INVOICE ISSUE DATE
//     * </pre>
//     * <pre>
//     * ‐インボイス、インボイスヘッダ、パッキングヘッダ、セールスコントラクトヘッダの検索
//     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
//     *     {@link W6001DocDao#searchTtInvoiceByFileManager(W6001DocCriteriaDomain)}を呼び出します。
//     *       ‐荷主コード
//     *       ‐インボイスNo
//     *       ‐インボイス発行日
//     * </pre>
//     * 
//     * @param shipperCd SHIPPER CODE<br />
//     * 荷主コード
//     * @param invoiceNo Invoice No<br />
//     * インボイスNo
//     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
//     * インボイス発行日
//     * @return 取得したインボイス情報ドメイン
//     * @throws ApplicationException Can not get the FILE ID<br />
//     * ファイルIDの取得ができない場合
//     */
//    protected W6001DocInvoiceDomain searchTtInvoiceOnRegisterByFileId(String shipperCd, String invoiceNo, Date invoiceIssueDt) 
//        throws ApplicationException {
//        
//        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
//        criteria.setShipperCd(shipperCd);
//        criteria.setInvoiceNo(invoiceNo);
//        criteria.setInvoiceIssueDt(invoiceIssueDt);
//        
//        return w6001DocDao.searchTtInvoiceByFileManager(criteria);
//    }
// UT186 ZIP DOWNLOAD DEL END
    
    /**
     * Register with the File Manage.
     * <br />ファイル管理への登録します。
     * <pre>
     * - Registered with the File Manage.
     *   Call FileManagementService.createFileUpload(InputStream, String, Number, String).
     * </pre>
     * <pre>
     * ‐ファイル管理に登録します。
     *     {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}を呼び出します。
     * </pre>
     * 
     * @param file Registry file<br />
     * 登録ファイル
     * @param fileName file name
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @return FileID that have been registered<br />
     * 登録したFileID
     * @throws ApplicationException Registration to the File Manage can not be<br />
     * ファイル管理への登録ができない場合
     */
    protected String createFileUpload(File file, String fileName, String dscId) throws ApplicationException {

        String fileId = null;
        InputStream fileStream = null;
        try {
            fileStream = new FileInputStream(file);
            // UT186 ZIP DOWNLOAD MOD START
            //fileId = fileManagerServiceForStream
            //    .createFileUpload(fileStream, file.getName(), DateUtil.getSaveLimitTerm(DateUtil.PERMANENT, null), dscId);
            fileId = fileManagerServiceForStream
                .createFileUpload(fileStream, fileName, DateUtil.getSaveLimitTerm(DateUtil.PERMANENT, null), dscId);
            // UT186 ZIP DOWNLOAD MOD END
            
        } catch (FileNotFoundException e) {
            throw new SystemException(NXS_91_0001);
        } catch (FileManagementException e) {
            throw new GscmApplicationException(e.getErrorCode());
        } catch (UnsupportedEncodingException e) {
            throw new SystemException(NXS_91_0001);
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        } finally {
            if (fileStream != null) {
                try {
                    fileStream.close();
                } catch (IOException e) {
                    throw new SystemException(NXS_91_0001);
                }
            }
        }
        return fileId;
    }
    
    // --- W6009 Registerアクション関連処理 --------------------------------------------------------
    /**
     * Create a temporary Invoice data (= officially registered before).
     * <br />仮（＝正式登録前）のインボイスデータを作成します。
     * <pre>
     * - Extraction of container No.
     *   Call W6001DocDao.searchTwInvPltzByContainerNo(W6001DocCriteriaDomain).
     * 
     * [ In the case of (FRT non ) Group No. Sec. = 0]
     *   - The NEXUS Company Master information acquisition as a key SHIPPER CODE
     *     Call searchTmNxsComp (String) in the argument of SHIPPER CODE screen .
     * 
     *   - NEXUS Company Master from information obtained , if DENSO sites (DN_BASE_FLG = 'Y')
     *     Get the sales contract .
     *     Call searchTmNxsComp (String) in the argument CONSIGNEE CODE.
     * 
     * [For Group No. Sec. = "0" CML TYP = "1" and (FRT except ) of (CIGMA product) ]
     *    - Re-Invoice presence determination
     *      Call searchTmCigmaCusXref(String, String).
     * 
     *    - Invoice No provisional numbering
     *      Argument in the following items , Call getTempInvoiceNo(String, String, String, String).
     *        - SHIPPER CODE
     *        - Group No. First
     *        - Group No. Sec
     *    
     *    - FREE item SERVER NAME acquisition
     *      Argument in the following items , Call searchTwInvOnRegisterByFree (String).
     *        - SHIPPER CODE
     *  
     *    - Shipping Document template information acquisition
     *      Argument in the following items , Call searchTmInvTplByKey(String, String).
     *        - SHIPPER CODE
     *        - Inv Template No
     *  
     *   - Registration of Invoice Number created for work
     *     Argument in the following items , Call updateTwInvItemOnRegisterForTempInvoiceNo(String, String, String, String).
     *       - SHIPPER CODE
     *       - Login DSC-ID
     *       - Group No. First
     *       - Group No. Sec
     *  
     *   - Registration of Invoice Group Work
     *     Argument in the following items , Call updateIwInvOnRegisterForTempInvoiceNo(String, String, String, String, String, String, String).
     *       - Provisional Invoice No have numbered
     *       - Re-Invoice flag acquired
     *       - Consignee
     *       - Sales contract that has been acquired
     *       - Login DSC-ID
     *       - Group No. First
     *       - Group No. Sec
     *  
     *   - Registration of Invoice Work
     *     Call {@link #createTwInvoiceOnRegister(W6001DocCriteriaDomain, String, String[], W6001DocDomain, TmInvTplDomain, String[])} with Argument information acquired so far
     *  
     *   - Registration judgment regular Invoice No.
     *     Call checkCreateInvoiceNoOnRegister(String, String, String) the argument to the following items .
     *       - Login DSC-ID
     *       - SHIPPER CODE
     *       - Group No.first
     *   
     * [Regular Invoice No registration determination is the case of false]
     *   - Get the screen re- display information
     *     Call W6001DocDao.searchTwInvoiceByRegister(W6001DocCriteriaDomain).
     * </pre>
     * <pre>
     * ‐コンテナNo.の抽出
     *     {@link W6001DocDao#searchTwInvPltzByContainerNo(W6001DocCriteriaDomain)}を呼び出します。
     * 
     * [Group No. sec. = 0(FRT以外)の場合]
     *   ‐荷主コードをキーにNEXUS会社原単位情報取得
     *       画面の荷主コードを引数に{@link #searchTmNxsComp(String)}を呼出します。
     *   
     *   ‐取得したNEXUS会社原単位情報から、デンソー拠点(DN_BASE_FLG = 'Y')の場合
     *     セールスコントラクトを取得します。
     *        荷受人コードを引数に{@link #searchTmNxsComp(String)}を呼出します。
     * 
     * [Group No. sec. = "0"(FRT以外) かつ CML TYP= "1"(CIGMA品)の場合]
     *   ‐リインボイス有無判定
     *       {@link #searchTmCigmaCusXref(String, String)}を呼出します。
     * 
     * ‐仮インボイスNo採番
     *     以下の項目を引数に、{@link #getTempInvoiceNo(String, String, String, String)}を呼出します。
     *       ‐荷主コード
     *       ‐Group No. first
     *       ‐Group No. sec
     * 
     * ‐FREE項目名称取得
     *     以下の項目を引数に、{@link #searchTwInvOnRegisterByFree(String)}を呼出します。
     *       ‐荷主コード
     * 
     * ‐船積書類テンプレート情報取得
     *     以下の項目を引数に、{@link #searchTmInvTplByKey(String, String)}を呼出します。
     *       ‐荷主コード
     *       ‐Inv Template No
     * 
     * ‐インボイス作成対象品番ワークの登録
     *     以下の項目を引数に、{@link #updateTwInvItemOnRegisterForTempInvoiceNo(String, String, String, String, String)}を呼出します。
     *       ‐荷主コード
     *       ‐ログインDSC-ID
     *       ‐Group No. first
     *       ‐Group No. sec
     *       ‐ShipperCd
     * 
     * ‐インボイスグループワークの登録
     *     以下の項目を引数に、{@link #updateIwInvOnRegisterForTempInvoiceNo(String, String, String, String, String, String, String, String)}を呼出します。
     *       ‐採番した仮インボイスNo
     *       ‐取得したリインボイスフラグ
     *       ‐荷受人
     *       ‐取得したセールスコントラクト
     *       ‐ログインDSC-ID
     *       ‐Group No. first
     *       ‐Group No. sec
     *       ‐ShipperCd
     * 
     * ‐インボイスワークの登録
     *     ここまでに取得した情報を引数に{@link #createTwInvoiceOnRegister(W6001DocCriteriaDomain, String, String[], W6001DocDomain, TmInvTplDomain, String[])}を呼び出します。
     * 
     * ‐正規インボイスNo.登録判定
     *     下記の項目を引数に{@link #checkCreateInvoiceNoOnRegister(String, String, String)}を呼出します。
     *       ‐ログインDSC-ID
     *       ‐荷主コード
     *       ‐Group No.first
     *       
     * [正規インボイスNo登録判定がfalseの場合]
     *   ‐画面再表示情報を取得
     *       {@link  W6001DocDao#searchTwInvoiceByRegister(W6001DocCriteriaDomain)}を呼出します。
     *   
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Returns the screen redisplay acquisition result if null, it does not register if register a regular Invoice No..<br />
     * 正規インボイスNo.を登録する場合はnull、登録しない場合は画面再表示取得結果を返します。
     * @throws ApplicationException If the creation of provisional Invoice data can not be<br />
     * 仮インボイスデータの作成ができない場合
     */
    protected W6001DocInvoiceDomain transactOnRegisterByRegistTwInvoice(W6001DocCriteriaDomain criteria) 
        throws ApplicationException {
        // Get container no.
        // コンテナNo.の抽出
        List<? extends W6001DocPltzDomain> pltzListForContainer = w6001DocDao.searchTwInvPltzByContainerNo(criteria);
        String[] containerNoArr = new String[3];
        for (int i = 0; i < pltzListForContainer.size(); i++) {
            containerNoArr[i] = pltzListForContainer.get(i).getContainerNo();
        }
        // Get sales contract flag.
        // セールスコントラクト有無判定
        String salesContractFlg = null;
        if (GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {
            TmNxsCompDomain tmNxsCompDomainShipper = searchTmNxsComp(criteria.getShipperCd());
            if (FLAG_Y.equals(tmNxsCompDomainShipper.getDnBaseFlg())) {
                TmNxsCompDomain tmNxsCompDomainConsignee = searchTmNxsComp(criteria.getConsigneeCd());
                salesContractFlg = tmNxsCompDomainConsignee.getSalesContractFlg();
            }
        }
        // Get ReInvoice flag.
        // リインボイス必要有無
        String reInvoiceFlg = FLAG_N;
        if (GRP_NO2_MAIN.equals(criteria.getGrpNo2()) && CML_TYPE_CIGMA.equals(criteria.getCmlTyp())) {
            TmCigmaCustomerXrefDomain tmCigmaCusXrefDomain = searchTmCigmaCusXref(criteria.getShipperCd(), criteria.getCustomerCd());
            reInvoiceFlg = tmCigmaCusXrefDomain.getReInvoiceFlg();
        }
        // Numbered the provisional invoice no.
        // 仮インボイスNo採番
        String[] tmpInvoiceNoArr = getTempInvoiceNo(reInvoiceFlg, criteria.getShipperCd(), criteria.getGrpNo1(), criteria.getGrpNo2());
        
        // Get the free item service no.
        // FREE項目名称取得
        W6001DocDomain docDomainForFreeCol = searchTwInvOnRegisterByFree(criteria.getShipperCd());
        
        // Get the Shipping Document template information.
        // 船積書類テンプレート情報取得
        TmInvTplDomain tmInvTplDomain = searchTmInvTplByKey(criteria.getShipperCd(), criteria.getInvTplNo());
        
        // ST959 UNIT CONVERSION ADD START
        // Search unit of shipper.
        // In the case of FRT invoice, search unit of FRT shipper(required).
        // シッパー単位系の検索
        // FRTインボイスの場合はFRTシッパー（必須）の単位系を検索
        String shipperCd = criteria.getShipperCd();
        if (StringUtils.isNotEmpty(criteria.getFrtShipperCd())) {
            shipperCd = criteria.getFrtShipperCd();
        }
        VtCompMeasureUnitDomain vtCompMeasureUnitDomain = commonService.searchMeasureUnit(shipperCd);
        // ST959 UNIT CONVERSION ADD END        
        
        // Register the provisional Invoice No Invoice created for the part number work. 
        // インボイス作成対象品番ワークの登録
        // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） START >>>>>
//        // ST959 UNIT CONVERSION MOD START
//        //updateTwInvItemOnRegisterForTempInvoiceNo(tmpInvoiceNoArr[0], criteria.getDscId(), criteria.getGrpNo1(), criteria.getGrpNo2());
//        updateTwInvItemOnRegisterForTempInvoiceNo(tmpInvoiceNoArr[0], criteria.getDscId(), criteria.getGrpNo1(), criteria.getGrpNo2(),
//            vtCompMeasureUnitDomain.getWeightUnit(), criteria.getLocale());
//        // ST959 UNIT CONVERSION MOD END
        updateTwInvItemOnRegisterForTempInvoiceNo(tmpInvoiceNoArr[0], criteria.getDscId(), criteria.getGrpNo1(), criteria.getGrpNo2(),
            vtCompMeasureUnitDomain.getWeightUnit(), criteria.getLocale(), criteria.getShipperCd());
        // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） END <<<<<
        
        // Register The Decition flag to The Invoice work for Palletize Table. 
        // インボイス作成対象パレタイズワークの登録
        // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） START >>>>>
        // ST959 UNIT CONVERSION MOD START
        //updateTwInvPltzOnRegisterForDecitionFlg(criteria.getDscId(), criteria.getGrpNo1());
//        if (GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {
//            updateTwInvPltzOnRegisterForDecitionFlg(criteria.getDscId(), criteria.getGrpNo1(),
//                vtCompMeasureUnitDomain.getVolumeUnit(), vtCompMeasureUnitDomain.getWeightUnit(), criteria.getLocale());
//        }
        // ST959 UNIT CONVERSION MOD END
        if (GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {
            updateTwInvPltzOnRegisterForDecitionFlg(criteria.getDscId(), criteria.getGrpNo1(),
                vtCompMeasureUnitDomain.getVolumeUnit(), vtCompMeasureUnitDomain.getWeightUnit(), criteria.getLocale(), criteria.getShipperCd());
        }
        // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） END <<<<<
        
        // Register necessity provisional Invoice No., Of Re-Invoice, whether or not it is necessary to contract sales in the "Invoice Group Work." .
        // インボイスグループワークの登録
        // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） START >>>>>
//        updateIwInvOnRegisterForTempInvoiceNo(tmpInvoiceNoArr[0], reInvoiceFlg, criteria.getConsigneeCd()
//            , salesContractFlg, criteria.getDscId(), criteria.getGrpNo1(), criteria.getGrpNo2());
        updateIwInvOnRegisterForTempInvoiceNo(tmpInvoiceNoArr[0], reInvoiceFlg, criteria.getConsigneeCd()
            , salesContractFlg, criteria.getDscId(), criteria.getGrpNo1(), criteria.getGrpNo2(), criteria.getShipperCd());
        // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） END <<<<<
        
        // Registered in the Invoice Work. 
        // インボイスワークの登録
        createTwInvoiceOnRegister(criteria, reInvoiceFlg, tmpInvoiceNoArr, docDomainForFreeCol, tmInvTplDomain, containerNoArr);
        // Check the regular Invoice No registration.
        // 正規インボイスNo.登録判定
        if (checkCreateInvoiceNoOnRegister(criteria.getDscId(), criteria.getShipperCd(), criteria.getGrpNo1())) {
            // Registered.
            // 正規インボイスNo.登録
            return null;
        } else {
            // Set tempInvoiceNo. 
            // 検索条件ドメインの設定
            criteria.setTempInvoiceNo(tmpInvoiceNoArr[0]);
            // Get the FREE item SERVER NAME. 
            // 画面再表示情報の取得
            return w6001DocDao.searchTwInvoiceByRegister(criteria);
        } 
    }
    
    /**
     * Get a NEXUS Company Master information.
     * <br />NEXUS会社原単位情報を取得します。
     * <pre>
     * - Search NEXUS Company Master TmNxsCompCriteriaDomain Set the following items,
     *   Call TmNxsCompService.SearchByKey (TmNxsCompCriteriaDomain).
     *     - COMP_CD (PK)
     * </pre>
     * <pre>
     * ‐NEXUS会社原単位の検索
     *     {@link TmNxsCompCriteriaDomain}に以下の項目を設定し、
     *     {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼出します。
     *       ‐COMP_CD(PK)
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @return NEXUS Company Master information obtained<br />
     * 取得したNEXUS会社原単位情報
     * @throws ApplicationException Did not get the NEXUS Company Master information<br />
     * NEXUS会社原単位情報を取得出来なかった場合
     */
    protected TmNxsCompDomain searchTmNxsComp(String compCd) throws ApplicationException {

        TmNxsCompCriteriaDomain criteria = new TmNxsCompCriteriaDomain();
        criteria.setCompCd(compCd);
  
        return tmNxsCompService.searchByKey(criteria);
    }
    
    /**
     * CIGMA Customer Cross Reference Master information acquisition
     * <br />NEXUS荷受人クロスリファレンス原単位情報取得
     * <pre>
     * - Search CIGMA Customer Cross Reference Master TiemushiaijiemueishiustomerXrefCriteriaDomain Set the following items,
     *   Call TimCigmaCustomerXrefService.SearchByKey (TiemushiaijiemueishiustomerXrefCriteriaDomain). }
     *    - NEXUS COMPANY CODE
     *    - CIGMA CUSTOMER CODE
     * </pre>
     * <pre>
     * ‐NEXUS荷受人クロスリファレンス原単位の検索
     *     {@link TmCigmaCustomerXrefCriteriaDomain}に以下の項目を設定し、
     *     {@link TmCigmaCustomerXrefService#searchByKey(TmCigmaCustomerXrefCriteriaDomain)}を呼出します。}
     *       ‐NEXUS会社コード
     *       ‐CIGMA得意先コード
     * </pre>
     * 
     * @param lgcyLibCompCd NEXUS COMPANY CODE<br />
     * NEXUS会社コード
     * @param customerCd CIGMA CUSTOMER CODE<br />
     * CIGMA得意先コード
     * @return CIGMA Customer Cross Reference Master information obtained<br />
     * 取得したNEXUS荷受人クロスリファレンス原単位情報
     * @throws ApplicationException Can not get CIGMA Customer Cross Reference Master information
     * NEXUS荷受人クロスリファレンス原単位情報を取得できない場合
     */
    protected TmCigmaCustomerXrefDomain searchTmCigmaCusXref(String lgcyLibCompCd, String customerCd) 
        throws ApplicationException {
        TmCigmaCustomerXrefCriteriaDomain criteria = new TmCigmaCustomerXrefCriteriaDomain();
        criteria.setLgcyLibCompCd(lgcyLibCompCd);
        criteria.setCustomerCd(customerCd);
        
        return tmCigmaCustomerXrefService.searchByKey(criteria);
    }
    
    /**
     * Numbered the provisional Invoice No.
     * <br />仮インボイスNoを採番します。
     * 
     * @param reInvoiceFlg RE INVOICE FLAG<br />
     * リインボイス要否フラグ
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param grpNo1 Group No. first
     * @param grpNo2 Group No. sec
     * @return Provisional Invoice No<br />
     * 採番した仮インボイスNo
     */
    protected String[] getTempInvoiceNo(String reInvoiceFlg, String shipperCd, String grpNo1, String grpNo2) {
        String[] tempInvoiceNoArr = new String[3];
        // Check reInvoiceFlg.
        // リインボイスの場合
        if (FLAG_Y.equals(reInvoiceFlg)) {
            tempInvoiceNoArr[0] = String.format(TMP_INVOICE_NO_FORMAT, shipperCd, grpNo1, grpNo2);
            tempInvoiceNoArr[1] = String.format(TMP_RE_INVOICE_NO_FORMAT, shipperCd, grpNo1, grpNo2);
            tempInvoiceNoArr[2] = String.format(TMP_INVOICE_NO_FORMAT, shipperCd, grpNo1, GRP_NO2_MAIN);
        } else {
            tempInvoiceNoArr[0] = String.format(TMP_INVOICE_NO_FORMAT, shipperCd, grpNo1, grpNo2);
            tempInvoiceNoArr[1] = null;
            tempInvoiceNoArr[2] = String.format(TMP_INVOICE_NO_FORMAT, shipperCd, grpNo1, GRP_NO2_MAIN);
        }
        return tempInvoiceNoArr;
        
    }
    
    /**
     * Get the FREE item SERVER NAME.
     * <br />FREE項目名称を取得します。
     * <pre>
     * - Invoice Group Work Search W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.SearchTwInvByFree (W6001DocCriteriaDomain).
     * </pre>
     * <pre>
     * ‐インボイスグループワーク検索
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTwInvByFree(W6001DocCriteriaDomain)}を呼出します。
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @return Invoice Group Work domain that has been acquired<br />
     * 取得したインボイスグループワークドメイン
     * @throws ApplicationException Can not get the item FREE SERVER NAME<br />
     * FREE項目名称が取得できない場合
     */
    protected W6001DocDomain searchTwInvOnRegisterByFree (String shipperCd) throws ApplicationException {
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setCompCd(shipperCd);
        
        return w6001DocDao.searchTwInvByFree(criteria);
    }
    
    /**
     * Get the Shipping Document template information.
     * <br />船積書類テンプレート情報を取得します。
     * <pre>
     * - Invoice Template Master Search TmInvTplCriteriaDomain Set the following items,
     *   Call TmInvTplService.SearchByKey (TmInvTplCriteriaDomain).
     *     - COMP_CD: SHIPPER CODE
     *     - DOC_NO:. Inv Template No.
     * </pre>
     * <pre>
     * ‐船積書類テンプレート原単位検索
     *     {@link TmInvTplCriteriaDomain}に以下の項目を設定し、
     *     {@link TmInvTplService#searchByKey(TmInvTplCriteriaDomain)}を呼出します。
     *       ‐COMP_CD：荷主コード
     *       ‐DOC_NO：Inv. Template No.
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invTempNo Inv. Template No.
     * @return Shipping Document template information obtained<br />
     * 取得した船積書類テンプレート情報
     * @throws ApplicationException Not possible to acquire the Shipping Document template information.<br />
     * 船積書類テンプレート情報の取得ができなかった場合。
     */
    protected TmInvTplDomain searchTmInvTplByKey(String shipperCd, String invTempNo) throws ApplicationException {
        TmInvTplCriteriaDomain criteria = new TmInvTplCriteriaDomain();
        criteria.setCompCd(shipperCd);
        criteria.setDocNo(invTempNo);
        
        return tmInvTplService.searchByKey(criteria);
    }
    
    /**
     * Register the provisional Invoice No Invoice created for the part number work.
     * <br />インボイス作成対象品番ワークに仮インボイスNoを登録します。
     * <pre>
     * - Invoice created for Part work update
     *   Set the narrowing-down condition updates to TwInvItemDomain, to TwInvItemCriteriaDomain
     *   Call TwInvItemService.updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain).
     *     Updated content
     *       - Provisional Invoice No
     *       - Invoice Decition Flag: 'Y'
     *     Narrowing conditions
     *       - Login DSC-ID
     *       - Group No. First
     *       - Group No. Sec
     *       - ShipperCd
     * </pre>
     * <pre>
     * ‐インボイス作成対象品番ワーク更新
     *     {@link TwInvItemDomain}に更新内容、{@link TwInvItemCriteriaDomain}に絞込条件を設定し
     *     {@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}を呼出します。
     *       更新内容
     *         ‐仮インボイスNo
     *         ‐インボイス確定フラグ: 'Y'
     *       絞込条件
     *         ‐ログインDSC-ID
     *         ‐Group No. first
     *         ‐Group No. sec
     *         -ShipperCd
     * </pre>
     * 
     * @param tempInvoiceNo Provisional Invoice No<br />
     * 仮インボイスNo
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param grpNo1 Group No. first
     * @param grpNo2 Group No. sec
     * @param shipperWeightUnit weight unit of shpper
     * @param locale locale
     * @param shipperCd ShipperCd
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException If a dummy Invoice No can not register to create Invoice object Number work<br />
     * インボイス作成対象品番ワークに仮インボイスNoが登録できない場合
     */
    // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） START >>>>>
//    protected int updateTwInvItemOnRegisterForTempInvoiceNo (String tempInvoiceNo, String dscId, String grpNo1, String grpNo2, String shipperWeightUnit, Locale locale)
//        throws ApplicationException {
    protected int updateTwInvItemOnRegisterForTempInvoiceNo (String tempInvoiceNo, String dscId, String grpNo1, String grpNo2, String shipperWeightUnit, Locale locale, String shipperCd)
        throws ApplicationException {        
    // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） END <<<<<
        // ST959 UNIT CONVERSION MOD START
//        TwInvItemDomain twInvItemDomain = new TwInvItemDomain();
//        twInvItemDomain.setTempInvoiceNo(tempInvoiceNo);
//        twInvItemDomain.setDecisionFlg(FLAG_Y);
//        
//        commonService.setCommonPropertyForUpdate(twInvItemDomain, SCREEN_ID_W6009);
//        
//        TwInvItemCriteriaDomain twInvItemCriteria = new TwInvItemCriteriaDomain();
//        twInvItemCriteria.setDscId(dscId);
//        twInvItemCriteria.setGrpNo1(grpNo1);
//        twInvItemCriteria.setGrpNo2(grpNo2);
//        // 2014/12/10 DNJP.Kawamura ST185対応 START >>>>>
//        twInvItemCriteria.setRemoveFlg(FLAG_N);
//        // 2014/12/10 DNJP.Kawamura ST185対応 END <<<<<
//        
//        return twInvItemService.updateByCondition(twInvItemDomain, twInvItemCriteria);


        // Search TW_INV_ITEM to be updated
        // 更新対象の品番ワークを検索
        TwInvItemCriteriaDomain twInvItemCriteriaDomain = new TwInvItemCriteriaDomain();
        twInvItemCriteriaDomain.setDscId(dscId);
        twInvItemCriteriaDomain.setGrpNo1(grpNo1);
        twInvItemCriteriaDomain.setGrpNo2(grpNo2);
        twInvItemCriteriaDomain.setRemoveFlg(FLAG_N);
        // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） START >>>>>
        twInvItemCriteriaDomain.setShipperCd(shipperCd);
        // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） END <<<<<
        List<TwInvItemDomain> twInvItemDomainResultList
            = twInvItemService.searchByCondition(twInvItemCriteriaDomain);

        // Update temporary invoice No., invoice decision flag.
        // Convert and update the item weight,N/W to fit the unit of Shipper
        // 仮インボイスNo.、インボイス確定フラグ更新。
        // シッパーの単位系へ合わせて製品重量、N/Wを変換して更新。
        List<TwInvItemDomain> twInvItemUpdateDomainList = new ArrayList<TwInvItemDomain>();
        List<TwInvItemCriteriaDomain> twInvItemCriteriaDomainList = new ArrayList<TwInvItemCriteriaDomain>();
        for (TwInvItemDomain twInvItemResultDomain : twInvItemDomainResultList) {

            TwInvItemDomain twInvItemUpdateDomain = new TwInvItemDomain();
            twInvItemUpdateDomain.setTempInvoiceNo(tempInvoiceNo);
            twInvItemUpdateDomain.setDecisionFlg(FLAG_Y);
            // item weight
            BigDecimal convertedItemWeight
                = commonService.convertWeightUnitNoOverflowCheck(
                    twInvItemResultDomain.getItemWeight(), twInvItemResultDomain.getWeightUnit(), shipperWeightUnit
                );
            if (commonService.isWeightOverflow(convertedItemWeight)) {
                Object[] params = { commonService.getResource(locale, "label.totalNetWeight") };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
            twInvItemUpdateDomain.setItemWeight(convertedItemWeight);
            // N/W
            BigDecimal convertedNetWeight
                = commonService.convertWeightUnitNoOverflowCheck(
                    twInvItemResultDomain.getItemWeight().multiply(twInvItemResultDomain.getQty()),
                        twInvItemResultDomain.getWeightUnit(), shipperWeightUnit
                );
            if (commonService.isWeightOverflow(convertedNetWeight)) {
                Object[] params = { commonService.getResource(locale, "label.totalNetWeight") };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
            twInvItemUpdateDomain.setNetWeight(convertedNetWeight);
            twInvItemUpdateDomain.setWeightUnit(shipperWeightUnit);
            commonService.setCommonPropertyForUpdate(twInvItemUpdateDomain, SCREEN_ID_W6009);
            twInvItemUpdateDomainList.add(twInvItemUpdateDomain);

            TwInvItemCriteriaDomain twInvItemUpdateCriteriaDomain = new TwInvItemCriteriaDomain();
            twInvItemUpdateCriteriaDomain.setDscId(twInvItemResultDomain.getDscId());
            twInvItemUpdateCriteriaDomain.setMainMark(twInvItemResultDomain.getMainMark());
            twInvItemUpdateCriteriaDomain.setBrch(twInvItemResultDomain.getBrch());
            twInvItemUpdateCriteriaDomain.setSortOdr(twInvItemResultDomain.getSortOdr());
            twInvItemCriteriaDomainList.add(twInvItemUpdateCriteriaDomain);
        }
        int updateCount
            = twInvItemService.updateByCondition(twInvItemUpdateDomainList, twInvItemCriteriaDomainList);
        
        return updateCount;
        // ST959 UNIT CONVERSION MOD END
    }
    
    /**
     * Register The Decition flag to The Invoice work for Palletize Table
     * <br />インボイス作成対象パレタイズワークにインボイス確定フラグを登録します。
     * <pre>
     * - Registration of The Invoice work for Palletize Table
     *     Set following item to {@link TwInvPltzDomain}
     *       - INVOICE DECISION FLAG: 'Y'
     *     Set following item to {@link TwInvPltzCriteriaDomain}
     *       - DSC-ID
     *       - Group No.1
     *       - ShipperCd
     *     then call {@link TwInvPltzService#updateByCondition(TwInvPltzDomain, TwInvPltzCriteriaDomain)}
     *     
     * - インボイス作成対象パレタイズワークを更新
     * </pre>
     * 
     * @param dscId DSC-ID
     * @param grpNo1 Group No.1
     * @param shipperVolumeUnit volume unit of shpper
     * @param shipperWeightUnit weight unit of shpper
     * @param locale locale
     * @param shipperCd ShipperCd
     * @return The number of record update.
     * @throws ApplicationException if cannot update The Invoice work for Palletize Table
     */
    // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） START >>>>>
//    protected int updateTwInvPltzOnRegisterForDecitionFlg (String dscId, String grpNo1, String shipperVolumeUnit, String shipperWeightUnit, Locale locale) 
//        throws ApplicationException {
    protected int updateTwInvPltzOnRegisterForDecitionFlg (String dscId, String grpNo1, String shipperVolumeUnit, String shipperWeightUnit, Locale locale, String shipperCd) 
        throws ApplicationException {
    // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） END <<<<<
        
        // ST959 UNIT CONVERSION MOD START
//        TwInvPltzDomain domain = new TwInvPltzDomain();
//        domain.setDecisionFlg(FLAG_Y);
//
//        commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6009);
//
//        TwInvPltzCriteriaDomain criteria = new TwInvPltzCriteriaDomain();
//        criteria.setDscId(dscId);
//        criteria.setGrpNo1(grpNo1);
//        // 2014/12/10 DNJP.Kawamura ST185対応 START >>>>>
//        criteria.setRemoveFlg(FLAG_N);
//        // 2014/12/10 DNJP.Kawamura ST185対応 END <<<<<
//
//        return twInvPltzService.updateByCondition(domain, criteria);


        W6001DocCriteriaDomain docCriteriaDomain = new W6001DocCriteriaDomain();
        docCriteriaDomain.setDscId(dscId);
        docCriteriaDomain.setGrpNo1(grpNo1);
        // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） START >>>>>
        docCriteriaDomain.setShipperCd(shipperCd);
        // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） END <<<<<
        List<? extends W6001DocPltzDomain> docPltzResultDomainList
            = w6001DocDao.searchTwInvPltzOnRegisterByWorkPhase(docCriteriaDomain);

        // Update invoice decision flag.
        // Convert and update the G/W, volume fit the unit of Shipper
        // インボイス確定フラグ更新。
        // シッパーの単位系へ合わせてG/W、 Volumeを変換して更新。
        List<TwInvPltzDomain> twInvPltzUpdateDomainList = new ArrayList<TwInvPltzDomain>();
        List<TwInvPltzCriteriaDomain> twInvPltzCriteriaDomainList = new ArrayList<TwInvPltzCriteriaDomain>();
        for (W6001DocPltzDomain docPltzResultDomain : docPltzResultDomainList) {

            TwInvPltzDomain twInvPltzUpdateDomain = new TwInvPltzDomain();
            twInvPltzUpdateDomain.setDecisionFlg(FLAG_Y);
            // volume
            BigDecimal convertedVolume
                = commonService.convertVolumeUnitNoOverflowCheck(
                    docPltzResultDomain.getVolume(), docPltzResultDomain.getVolumeUnit(), shipperVolumeUnit
                );
            if (commonService.isVolumeOverflow(convertedVolume)) {
                Object[] params = { commonService.getResource(locale, "label.totalVolume") };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
            twInvPltzUpdateDomain.setVolume(convertedVolume);
            twInvPltzUpdateDomain.setVolumeUnit(shipperVolumeUnit);
            // G/W
            BigDecimal convertedGrossWeight
                = commonService.convertWeightUnitNoOverflowCheck(
                    docPltzResultDomain.getGrossWeight(), docPltzResultDomain.getWeightUnit(), shipperWeightUnit
                );
            if (commonService.isWeightOverflow(convertedGrossWeight)) {
                Object[] params = { commonService.getResource(locale, "label.totalGrossWeight") };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
            twInvPltzUpdateDomain.setGrossWeight(convertedGrossWeight);
            // N/W
            if (commonService.isWeightOverflow(docPltzResultDomain.getNetWeight())) {
                Object[] params = { commonService.getResource(locale, "label.totalNetWeight") };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
            twInvPltzUpdateDomain.setNetWeight(docPltzResultDomain.getNetWeight());
            twInvPltzUpdateDomain.setWeightUnit(shipperWeightUnit);
            commonService.setCommonPropertyForUpdate(twInvPltzUpdateDomain, SCREEN_ID_W6009);
            twInvPltzUpdateDomainList.add(twInvPltzUpdateDomain);

            TwInvPltzCriteriaDomain twInvPltzUpdateCriteriaDomain = new TwInvPltzCriteriaDomain();
            twInvPltzUpdateCriteriaDomain.setDscId(docPltzResultDomain.getDscId());
            twInvPltzUpdateCriteriaDomain.setMainMark(docPltzResultDomain.getMainMark());
            twInvPltzCriteriaDomainList.add(twInvPltzUpdateCriteriaDomain);
        }
        int updateCount
            = twInvPltzService.updateByCondition(twInvPltzUpdateDomainList, twInvPltzCriteriaDomainList);

        return updateCount;
        // ST959 UNIT CONVERSION MOD END
    }
    
    /**
     * Register a regular Invoice No Invoice created for the part number work.
     * <br />インボイス作成対象品番ワークに正規インボイスNoを登録します。
     * <pre>
     * - Invoice created for Part work update
     *   Set the narrowing-down condition updates to TwInvItemDomain, to TwInvItemCriteriaDomain
     *   Call TwInvItemService.updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain).
     *     Updated content
     *       - Invoice No
     *     Narrowing conditions
     *       - Login DSC-ID
     *       - Provisional Invoice No
     * </pre>
     * <pre>
     * ‐インボイス作成対象品番ワーク更新
     *     {@link TwInvItemDomain}に更新内容、{@link TwInvItemCriteriaDomain}に絞込条件を設定し
     *     {@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}を呼出します。
     *       更新内容
     *         ‐インボイスNo
     *       絞込条件
     *         ‐ログインDSC-ID
     *         ‐仮インボイスNo
     * </pre>
     * 
     * @param invoiceNo Regular Invoice No to register<br />
     * 登録する正規インボイスNo
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param tempInvoiceNo Provisional Invoice No<br />
     * 仮インボイスNo
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException If can not register on the Invoice created for Part Number work<br />
     * インボイス作成対象品番ワークに登録できない場合
     */
    protected int updateTwInvItemOnRegisterForNormInvoiceNo(String invoiceNo, String dscId, String tempInvoiceNo) 
        throws ApplicationException {

        TwInvItemDomain twInvItemDomain = new TwInvItemDomain();
        twInvItemDomain.setInvoiceNo(invoiceNo);

        commonService.setCommonPropertyForUpdate(twInvItemDomain, SCREEN_ID_W6009);

        TwInvItemCriteriaDomain twInvItemCriteria = new TwInvItemCriteriaDomain();
        twInvItemCriteria.setDscId(dscId);
        twInvItemCriteria.setTempInvoiceNo(tempInvoiceNo);

        return twInvItemService.updateByCondition(twInvItemDomain, twInvItemCriteria);
    }
    
    /**
     * Register necessity provisional Invoice No., Of Re-Invoice, whether or not it is necessary to contract sales in the "Invoice Group Work."
     * <br />「インボイスグループワーク」に仮インボイスNo.、リインボイスの要否、セールスコントラクトの要否を登録します。
     * <pre>
     * - Invoice Group Work update TwInvDomain updates to, TwInvCriteriaDomain set the conditions to narrow-down,
     *   Call TwInvService.UpdateByCondition(TwInvDomain, TwInvCriteriaDomain).
     *     Updates
     *       - provisional Invoice No
     *       - Re-Invoice flag
     *       - RE INVOICE SHIPPER CODE
     *       - Sales contract
     *       - Invoice Decition Flag: 'Y'
     *      narrowing conditions
     *       - login DSC-ID
     *       - Group No. First
     *       - Group No. Sec
     *       - ShipperCd
     * </pre>
     * <pre>
     * ‐インボイスグループワーク更新
     *     {@link TwInvDomain}に更新内容、{@link TwInvCriteriaDomain}に絞込条件を設定し、
     *     {@link TwInvService#updateByCondition(TwInvDomain, TwInvCriteriaDomain)}を呼出します。
     *       更新内容
     *         ‐仮インボイスNo
     *         ‐リインボイスフラグ
     *         ‐リインボイス荷主コード
     *         ‐セールスコントラクト
     *         ‐インボイス確定フラグ
     *       絞込条件
     *         ‐ログインDSC-ID
     *         ‐Group No. first
     *         ‐Group No. sec
     *         -ShipperCd
     * </pre>
     * 
     * @param tempInvoiceNo Provisional Invoice No<br />
     * 仮インボイスNo
     * @param reInvoiceFlg Re-Invoice flag<br />
     * リインボイスフラグ
     * @param consigneeCd Consignee<br />
     * 荷受人
     * @param salesContractFlg Sales contract<br />
     * セールスコントラクト
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param grpNo1 Group No. first
     * @param grpNo2 Group No. sec
     * @param shipperCd ShipperCd
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Fail to update the Invoice Group Work<br />
     * インボイスグループワークへの更新ができなかった場合
     */
    // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） START >>>>>
//    protected int updateIwInvOnRegisterForTempInvoiceNo (String tempInvoiceNo, String reInvoiceFlg, String consigneeCd
//        , String salesContractFlg, String dscId, String grpNo1, String grpNo2) 
//        throws ApplicationException {
    protected int updateIwInvOnRegisterForTempInvoiceNo (String tempInvoiceNo, String reInvoiceFlg, String consigneeCd
        , String salesContractFlg, String dscId, String grpNo1, String grpNo2, String shipperCd) 
        throws ApplicationException {
    // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） END <<<<<
        TwInvDomain twInvDomain = new TwInvDomain();
        twInvDomain.setTempInvoiceNo(tempInvoiceNo);
        twInvDomain.setDecisionFlg(FLAG_Y);
        if (GRP_NO2_MAIN.equals(grpNo2)) {
            twInvDomain.setReInvoiceFlg(reInvoiceFlg);
            if (FLAG_Y.equals(reInvoiceFlg)) {
                twInvDomain.setReInvoiceShipperCd(consigneeCd);
            } else {
                twInvDomain.setReInvoiceShipperCd(StringUtils.EMPTY);
            }
            twInvDomain.setSalesContractFlg(salesContractFlg);    
        } else {
            twInvDomain.setReInvoiceFlg(FLAG_N);
            twInvDomain.setReInvoiceShipperCd(StringUtils.EMPTY);
            twInvDomain.setSalesContractFlg(FLAG_N);
        }
        
        commonService.setCommonPropertyForUpdate(twInvDomain, SCREEN_ID_W6009);

        TwInvCriteriaDomain twInvCriteria = new TwInvCriteriaDomain();
        twInvCriteria.setDscId(dscId);
        twInvCriteria.setGrpNo1(grpNo1);
        twInvCriteria.setGrpNo2(grpNo2);
        // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） START >>>>>
        twInvCriteria.setShipperCd(shipperCd);
        // 2015/10/08 DNJP.Kawamura ST978対応（仮インボイスNo登録条件からShipperCdが抜けているため修正） END <<<<<

        return twInvService.updateByCondition(twInvDomain, twInvCriteria);
    }
    
    /**
     * Register a regular Invoice No in Invoice Group Work.
     * <br />インボイスグループワークに正規インボイスNoを登録します。
     * <pre>
     * - Invoice created for Part work update
     *   Set the narrowing-down condition updates to TwInvDomain, to TwInvCriteriaDomain
     *   Call the TwInvService.updateByCondition(TwInvDomain, TwInvCriteriaDomain).
     *     Updated content
     *       - Invoice No
     *     Narrowing conditions
     *       - Login DSC-ID
     *       - Provisional Invoice No
     * </pre>
     * <pre>
     * ‐インボイス作成対象品番ワーク更新
     *     {@link TwInvDomain}に更新内容、{@link TwInvCriteriaDomain}に絞込条件を設定し
     *     {@link TwInvService#updateByCondition(TwInvDomain, TwInvCriteriaDomain)}を呼出します。
     *       更新内容
     *         ‐インボイスNo
     *       絞込条件
     *         ‐ログインDSC-ID
     *         ‐仮インボイスNo
     * </pre>
     * 
     * @param invoiceNo Regular Invoice No to register<br />
     * 登録する正規インボイスNo
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param tempInvoiceNo Provisional Invoice No<br />
     * 仮インボイスNo
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Can not register on the Invoice Group Work<br />
     * インボイスグループワークに登録できない場合
     */
    protected int updateTwInvOnRegisterForNormInvoiceNo(String invoiceNo, String dscId, String tempInvoiceNo) 
        throws ApplicationException {

        TwInvDomain twInvDomain = new TwInvDomain();
        twInvDomain.setInvoiceNo(invoiceNo);

        commonService.setCommonPropertyForUpdate(twInvDomain, SCREEN_ID_W6009);
        
        TwInvCriteriaDomain twInvCriteria = new TwInvCriteriaDomain();
        twInvCriteria.setDscId(dscId);
        twInvCriteria.setTempInvoiceNo(tempInvoiceNo);
        
        return twInvService.updateByCondition(twInvDomain, twInvCriteria);
    }
    
    /**
     * Register a regular Invoice No in Invoice Work.
     * <br />インボイスワークに正規インボイスNoを登録します。
     * <pre>
     * - Set Invoice Work work updating data
     *   Can set the following items: a narrowing condition updates to TwInvDomain, to TwInvCriteriaDomain.
     *     Update data of the following three
     *       [INVOICE_NO update]
     *          Updated content
     *            - Invoice No: regular Invoice No
     *          Narrowing conditions
     *            - Login DSC-ID
     *            - Provisional Invoice No: provisional Invoice No
     *       [PAR_INVOICE_NO update]
     *          Updated content
     *            - PAR Invoice No: regular Invoice No
     *          Narrowing conditions
     *            - Login DSC-ID
     *            - PAR provisional Invoice No: provisional Invoice No
     *       [RELATE_INVOICE_NO update]
     *          Updated content
     *            - RELATE Invoice No: regular Invoice No
     *          Narrowing conditions
     *            - Login DSC-ID
     *            - RELATE provisional Invoice No: provisional Invoice No
     * 
     * - Invoice Work update
     *   Call (List, List) the TwInvoiceService.updateByCondition.
     * </pre>
     * <pre>
     * ‐インボイスワークワーク更新用データの設定
     *     {@link TwInvDomain}に更新内容、{@link TwInvCriteriaDomain}に絞込条件を以下の項目を設定します。
     *       更新データは下記の3種類
     *         [INVOICE_NO更新用]
     *           更新内容
     *             ‐インボイスNo：正規インボイスNo
     *           絞込条件
     *             ‐ログインDSC-ID
     *             ‐仮インボイスNo：仮インボイスNo
     *         
     *         [PAR_INVOICE_NO更新用]
     *           更新内容
     *             ‐PARインボイスNo：正規インボイスNo
     *           絞込条件
     *             ‐ログインDSC-ID
     *             ‐PAR仮インボイスNo：仮インボイスNo
     *         
     *         [RELATE_INVOICE_NO更新用]
     *           更新内容
     *             ‐RELATEインボイスNo：正規インボイスNo
     *           絞込条件
     *             ‐ログインDSC-ID
     *             ‐RELATE仮インボイスNo：仮インボイスNo
     * 
     * ‐インボイスワーク更新
     *     {@link TwInvoiceService#updateByCondition(List, List)}を呼出します。
     * </pre>
     * 
     * @param invoiceNo Regular Invoice No to register<br />
     * 登録する正規インボイスNo
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param tempInvoiceNo Provisional Invoice No<br />
     * 仮インボイスNo
     * @param updateParInv True Update the PAR_INVOICE_NO <br />
     * PAR_INVOICE_NOを更新する場合true
     * @param updateReInv True Update the RELATE_INVOICE_NO<br />
     * RELATE_INVOICE_NOを更新する場合true
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Can not register on the Invoice Group Work<br />
     * インボイスグループワークに登録できない場合
     */
    protected int updateTwInvoiceOnRegisterForNormInvoiceNo(String invoiceNo, String dscId, String tempInvoiceNo, boolean updateParInv, boolean updateReInv) 
        throws ApplicationException {
        
        List<TwInvoiceDomain> updateList = new ArrayList<TwInvoiceDomain>();
        List<TwInvoiceCriteriaDomain> criteriaList = new ArrayList<TwInvoiceCriteriaDomain>();
        
        TwInvoiceDomain invDomain = new TwInvoiceDomain();
        invDomain.setInvoiceNo(invoiceNo);
        commonService.setCommonPropertyForUpdate(invDomain, SCREEN_ID_W6009);
        updateList.add(invDomain);
        
        TwInvoiceCriteriaDomain invCriteria = new TwInvoiceCriteriaDomain();
        invCriteria.setDscId(dscId);
        invCriteria.setTempInvoiceNo(tempInvoiceNo);
        criteriaList.add(invCriteria);
        
        if (updateParInv) {
            TwInvoiceCriteriaDomain parInvCriteria = new TwInvoiceCriteriaDomain();
            parInvCriteria.setDscId(dscId);
            parInvCriteria.setParTempInvoiceNo(tempInvoiceNo);
            parInvCriteria.setSearchCountCheckFlg(false);
            
            if (twInvoiceService.searchCount(parInvCriteria) > 0) {
                TwInvoiceDomain parInvDomain = new TwInvoiceDomain();
                parInvDomain.setParInvoiceNo(invoiceNo);
                commonService.setCommonPropertyForUpdate(parInvDomain, SCREEN_ID_W6009);
                
                updateList.add(parInvDomain);
                criteriaList.add(parInvCriteria);
            }
        }
        if (updateReInv) {
            TwInvoiceCriteriaDomain relateInvCriteria = new TwInvoiceCriteriaDomain();
            relateInvCriteria.setDscId(dscId);
            relateInvCriteria.setRelateTempInvoiceNo(tempInvoiceNo);
            relateInvCriteria.setSearchCountCheckFlg(false);
            
            if (twInvoiceService.searchCount(relateInvCriteria) > 0) {
                TwInvoiceDomain relateInvDomain = new TwInvoiceDomain();
                relateInvDomain.setRelateInvoiceNo(invoiceNo);
                commonService.setCommonPropertyForUpdate(relateInvDomain, SCREEN_ID_W6009);
                
                updateList.add(relateInvDomain);
                criteriaList.add(relateInvCriteria);
            }
        }
        
        return twInvoiceService.updateByCondition(updateList, criteriaList);
    }
    
    /**
     * Registered in the Invoice Work.
     * <br />インボイスワークに登録します。
     * <pre>
     * - Invoice Work registration
     *   Set the registration data to TwInvoiceDomain,
     *   Call TwInvoiceService.create(List).
     * </pre>
     * <pre>
     * ‐インボイスワーク登録
     *    {@link TwInvoiceDomain}に登録データを設定し、
     *    {@link TwInvoiceService#create(List)}を呼び出します。
     * </pre>
     * 
     * @param criteria Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @param reInvFlg Re-Invoice need permission<br />
     * リインボイス必要可否
     * @param tempInvoiceNoArr Provisional Invoice No<br />
     * 仮インボイスNo
     * @param freeColDomain FREE item name information<br />
     * FREE項目名情報
     * @param tmInvTplDomain Shipping Actuality template information domain<br />
     * 船積実績テンプレート情報ドメイン
     * @param containerLst Container No (Size: 3)<br />
     * コンテナNo(Size:3)
     * @throws ApplicationException Registration of the Invoice Work can not be<br />
     * インボイスワークへの登録ができない場合
     */
    protected void createTwInvoiceOnRegister (W6001DocCriteriaDomain criteria, String reInvFlg, String[] tempInvoiceNoArr
        , W6001DocDomain freeColDomain, TmInvTplDomain tmInvTplDomain, String[] containerLst) 
        throws ApplicationException {
        
        // ST959 UNIT CONVERSION MOD START
        //W6001DocInvoiceDomain twInvDomain = searchOnRegisterInitByFromDetail(criteria).get(0);
        W6001DocInvoiceDomain twInvDomain = searchOnRegisterByFromDetail(criteria).get(0);
        // ST959 UNIT CONVERSION MOD END
        W6001DocPltzDomain twInvPltzDomain = twInvDomain.getDocPltzList().get(0);
        
        List<TwInvoiceDomain> twInvoiceList = new ArrayList<TwInvoiceDomain>();

        // Set Invoice Data
        TwInvoiceDomain twInvoceDomain = new TwInvoiceDomain();
        prepareTwInvoiceDomainOnRegisterByCommon(twInvoceDomain, criteria, twInvDomain, twInvPltzDomain, tempInvoiceNoArr[0], freeColDomain, tmInvTplDomain, containerLst);
        // Set the registration data when registering to own base. 
        // 自拠点に登録するデータを設定
        prepareTwInvoiceDomainOnRegisterForDBase(twInvoceDomain, criteria, twInvDomain, tempInvoiceNoArr, reInvFlg);
        commonService.setCommonPropertyForRegist(twInvoceDomain, SCREEN_ID_W6009);
        
        twInvoiceList.add(twInvoceDomain);
        
        if (FLAG_Y.equals(reInvFlg)) {
            // Set Re-Invoice Data.
            TwInvoiceDomain twInvDomainReInv = new TwInvoiceDomain();
            prepareTwInvoiceDomainOnRegisterByCommon(twInvDomainReInv, criteria, twInvDomain, twInvPltzDomain, tempInvoiceNoArr[1], freeColDomain, tmInvTplDomain, containerLst);
            // Set the registration data when registering the Re-Invoice. 
            // リインボイスのデータを設定
            prepareTwInvoiceDomainOnRegisterForReInvoice(twInvDomainReInv, criteria, twInvDomain, tempInvoiceNoArr);
            commonService.setCommonPropertyForRegist(twInvDomainReInv, SCREEN_ID_W6009);
            
            twInvoiceList.add(twInvDomainReInv);
        }
        if (!twInvoiceList.isEmpty()) {
            twInvoiceService.create(twInvoiceList);
        }
    }
    
    /**
     * Among the data to be registered in the Invoice Work table, set the items that registered information is changed by CmlTyp · GroupNo.first.
     * <br />インボイスワークテーブルに登録するデータのうち、
     * CmlTyp・GroupNo.firstによって登録内容が変わる項目を設定します。
     * 
     * @param twInvoiceDomain Domain to be registered<br />
     * 登録するドメイン
     * @param criteria Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @param docInvDomain Invoice Work group information domain that has been acquired <br />
     * 取得したインボイスワークグループ情報ドメイン
     * @param docPltzDomain Invoice object Palletize work domain information that has been acquired<br />
     * 取得したインボイス対象パレタイズワーク情報ドメイン
     * @throws ApplicationException Unable to set the data to be registered in the Invoice Work table<br />
     * インボイスワークテーブルに登録するデータの設定ができない場合
     */
    protected void prepareTwInvoiceDomainOnRegisterByCmlTyp (TwInvoiceDomain twInvoiceDomain
        , W6001DocCriteriaDomain criteria, W6001DocInvoiceDomain docInvDomain, W6001DocPltzDomain docPltzDomain)
        throws ApplicationException {
        
        String grpNo2 = criteria.getGrpNo2();
        String cmlTyp = criteria.getCmlTyp();
        
        if (GRP_NO2_MAIN.equals(grpNo2)) {
            // Except FRT.
            // FRT以外
            twInvoiceDomain.setFrtShipperCd(null);
            twInvoiceDomain.setFrtConsigneeCd(null);
            twInvoiceDomain.setFreightResponsibleNm(docInvDomain.getC5());
            twInvoiceDomain.setTradeTerms(docInvDomain.getTradeTerms());
            twInvoiceDomain.setTermsPoint(docInvDomain.getTermsPoint());
            twInvoiceDomain.setPayTerms(docInvDomain.getPayTerms());
            twInvoiceDomain.setPayMethNm(docInvDomain.getC6());
            // 2015/3/11 DNJP.Kawamura インタンジブル品対応 START >>>>>
//            if (INVOICE_CTGRY_C.equals(criteria.getInvoiceCtgry())) {
            if (!INVOICE_CTGRY_N.equals(criteria.getInvoiceCtgry())) {
            // 2015/3/11 DNJP.Kawamura インタンジブル品対応 END <<<<<
                twInvoiceDomain.setRemLcTyp(criteria.getRemLcTyp());
            } else {
                twInvoiceDomain.setRemLcTyp(null);
            }
            
            if (CML_TYPE_MISCELLANEOUS.equals(cmlTyp)) {
                // The case of export request items.
                // 輸出依頼品の場合(cmlTyp=3)
                twInvoiceDomain.setInvoiceClass(INVOICE_CLASS_MAIN);
                
                twInvoiceDomain.setShipperCompNmAbb(docPltzDomain.getShipperCompNmAbb());
                twInvoiceDomain.setShipperCompNm1(docPltzDomain.getShipperCompNm1());
                twInvoiceDomain.setShipperCompNm2(docPltzDomain.getShipperCompNm2());
                twInvoiceDomain.setShipperCompAddr1(docPltzDomain.getShipperCompAddr1());
                twInvoiceDomain.setShipperCompAddr2(docPltzDomain.getShipperCompAddr2());
                twInvoiceDomain.setShipperCompAddr3(docPltzDomain.getShipperCompAddr3());
                twInvoiceDomain.setShipperCompAddr4(docPltzDomain.getShipperCompAddr4());
                twInvoiceDomain.setShipperCompTel(docPltzDomain.getShipperCompTel());
                twInvoiceDomain.setShipperCompFax(docPltzDomain.getShipperCompFax());
                
                twInvoiceDomain.setConsigneeCompNm1(docPltzDomain.getConsigneeCompNm1());
                twInvoiceDomain.setConsigneeCompNm2(docPltzDomain.getConsigneeCompNm2());
                twInvoiceDomain.setConsigneeCompAddr1(docPltzDomain.getConsigneeCompAddr1());
                twInvoiceDomain.setConsigneeCompAddr2(docPltzDomain.getConsigneeCompAddr2());
                twInvoiceDomain.setConsigneeCompAddr3(docPltzDomain.getConsigneeCompAddr3());
                twInvoiceDomain.setConsigneeCompAddr4(docPltzDomain.getConsigneeCompAddr4());
                twInvoiceDomain.setConsigneeCompTel(docPltzDomain.getConsigneeCompTel());
                twInvoiceDomain.setConsigneeCompFax(docPltzDomain.getConsigneeCompFax());
                twInvoiceDomain.setConsigneeAttn(docPltzDomain.getConsigneeAttn());
                
            } else {
                // Get company data linked the shipper data.
                // Shipperに紐付く会社情報取得
                TmNxsCompDomain tmNxsShipeer = searchTmNxsComp(criteria.getShipperCd());
                twInvoiceDomain.setShipperCompNmAbb(tmNxsShipeer.getCompNmAbb()); 
                twInvoiceDomain.setShipperCompNm1(tmNxsShipeer.getPrintCompNm1());
                twInvoiceDomain.setShipperCompNm2(tmNxsShipeer.getPrintCompNm2());
                twInvoiceDomain.setShipperCompAddr1(tmNxsShipeer.getPrintCompAddr1());
                twInvoiceDomain.setShipperCompAddr2(tmNxsShipeer.getPrintCompAddr2());
                twInvoiceDomain.setShipperCompAddr3(tmNxsShipeer.getPrintCompAddr3());
                twInvoiceDomain.setShipperCompAddr4(tmNxsShipeer.getPrintCompAddr4());
                twInvoiceDomain.setShipperCompTel(tmNxsShipeer.getCompTel());
                twInvoiceDomain.setShipperCompFax(tmNxsShipeer.getCompFax());
                
                // Get company data linked the consignee data.
                // Consigneeに紐付く会社情報取得
                TmNxsCompDomain tmNxsConsignee = searchTmNxsComp(criteria.getConsigneeCd());
                twInvoiceDomain.setConsigneeCompNm1(tmNxsConsignee.getPrintCompNm1());
                twInvoiceDomain.setConsigneeCompNm2(tmNxsConsignee.getPrintCompNm2());
                twInvoiceDomain.setConsigneeCompAddr1(tmNxsConsignee.getPrintCompAddr1());
                twInvoiceDomain.setConsigneeCompAddr2(tmNxsConsignee.getPrintCompAddr2());
                twInvoiceDomain.setConsigneeCompAddr3(tmNxsConsignee.getPrintCompAddr3());
                twInvoiceDomain.setConsigneeCompAddr4(tmNxsConsignee.getPrintCompAddr4());
                twInvoiceDomain.setConsigneeCompTel(tmNxsConsignee.getCompTel());
                twInvoiceDomain.setConsigneeCompFax(tmNxsConsignee.getCompTel());
                 
                if (CML_TYPE_CIGMA.equals(cmlTyp)) {
                    twInvoiceDomain.setInvoiceClass(INVOICE_CLASS_MAIN);
                } else if (CML_TYPE_ERT.equals(cmlTyp)) {    
                    twInvoiceDomain.setInvoiceClass(INVOICE_CLASS_E_RT);
                }
            }
            
        } else {
            // FRT
            twInvoiceDomain.setInvoiceClass(INVOICE_CLASS_FULL_RT);
            twInvoiceDomain.setFrtShipperCd(criteria.getFrtShipperCd());
            twInvoiceDomain.setFrtConsigneeCd(criteria.getFrtConsigneeCd());
            twInvoiceDomain.setFreightResponsibleNm(null);
            twInvoiceDomain.setTradeTerms(null);
            twInvoiceDomain.setTermsPoint(null);
            twInvoiceDomain.setPayTerms(null);
            twInvoiceDomain.setPayMethNm(null);
            twInvoiceDomain.setRemLcTyp(null);
            // Get company data linked the frt shipper data.
            // Frt Shipperに紐付く会社情報取得
            TmNxsCompDomain tmNxsShipeer = searchTmNxsComp(criteria.getFrtShipperCd());
            twInvoiceDomain.setShipperCompNmAbb(tmNxsShipeer.getCompNmAbb()); 
            twInvoiceDomain.setShipperCompNm1(tmNxsShipeer.getPrintCompNm1());
            twInvoiceDomain.setShipperCompNm2(tmNxsShipeer.getPrintCompNm2());
            twInvoiceDomain.setShipperCompAddr1(tmNxsShipeer.getPrintCompAddr1());
            twInvoiceDomain.setShipperCompAddr2(tmNxsShipeer.getPrintCompAddr2());
            twInvoiceDomain.setShipperCompAddr3(tmNxsShipeer.getPrintCompAddr3());
            twInvoiceDomain.setShipperCompAddr4(tmNxsShipeer.getPrintCompAddr4());
            twInvoiceDomain.setShipperCompTel(tmNxsShipeer.getCompTel());
            twInvoiceDomain.setShipperCompFax(tmNxsShipeer.getCompFax());
            
            // Get company data linked the frt consignee data.
            // Frt Consigneeに紐付く会社情報取得
            TmNxsCompDomain tmNxsConsignee = searchTmNxsComp(criteria.getFrtConsigneeCd());
            twInvoiceDomain.setConsigneeCompNm1(tmNxsConsignee.getPrintCompNm1());
            twInvoiceDomain.setConsigneeCompNm2(tmNxsConsignee.getPrintCompNm2());
            twInvoiceDomain.setConsigneeCompAddr1(tmNxsConsignee.getPrintCompAddr1());
            twInvoiceDomain.setConsigneeCompAddr2(tmNxsConsignee.getPrintCompAddr2());
            twInvoiceDomain.setConsigneeCompAddr3(tmNxsConsignee.getPrintCompAddr3());
            twInvoiceDomain.setConsigneeCompAddr4(tmNxsConsignee.getPrintCompAddr4());
            twInvoiceDomain.setConsigneeCompTel(tmNxsConsignee.getCompTel());
            twInvoiceDomain.setConsigneeCompFax(tmNxsConsignee.getCompTel());
        }
        // Get the ship to data.
        // Ship to関連
        // 2016/3/08 DNJP.Kawamura 設計書とのアンマッチ対応 START >>>>>
//        if (GRP_NO2_MAIN.equals(grpNo2) && CML_TYPE_MISCELLANEOUS.equals(cmlTyp)) {
        // CMY_TYP = 3 or not
        if (CML_TYPE_MISCELLANEOUS.equals(cmlTyp)) {
        // 2016/3/08 DNJP.Kawamura 設計書とのアンマッチ対応 END <<<<<
            twInvoiceDomain.setShipToNm1(docPltzDomain.getShipToNm1());
            twInvoiceDomain.setShipToNm2(docPltzDomain.getShipToNm2());
            twInvoiceDomain.setShipToAddr1(docPltzDomain.getShipToAddr1());
            twInvoiceDomain.setShipToAddr2(docPltzDomain.getShipToAddr2());
            twInvoiceDomain.setShipToAddr3(docPltzDomain.getShipToAddr3());
            twInvoiceDomain.setShipToAddr4(docPltzDomain.getShipToAddr4());
            twInvoiceDomain.setShipToTel(docPltzDomain.getShipToTel());
        } else {
            twInvoiceDomain.setShipToNm1(docInvDomain.getPrintShipToNm1());
            twInvoiceDomain.setShipToNm2(docInvDomain.getPrintShipToNm2());
            twInvoiceDomain.setShipToAddr1(docInvDomain.getPrintShipToAddr1());
            twInvoiceDomain.setShipToAddr2(docInvDomain.getPrintShipToAddr2());
            twInvoiceDomain.setShipToAddr3(docInvDomain.getPrintShipToAddr3());
            twInvoiceDomain.setShipToAddr4(docInvDomain.getPrintShipToAddr4());
            twInvoiceDomain.setShipToTel(docInvDomain.getShipToTel());
        }
    }
    
    /**
     * Among the data to be registered in the Invoice Work table, set the item to be registered in common.
     * <br />インボイスワークテーブルに登録するデータのうち、共通して登録する項目を設定します。
     * 
     * @param twInvoiceDomain Domain to be registered<br />
     * 登録するドメイン
     * @param criteria Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @param docInvDomain Invoice Work group information domain that has been acquired <br />
     * 取得したインボイスワークグループ情報ドメイン
     * @param docPltzDomain Invoice object Palletize work domain information that has been acquired<br />
     * 取得したインボイス対象パレタイズワーク情報ドメイン
     * @param tempInvoiceNo Provisional Invoice No have numbered<br />
     * 採番した仮インボイスNo
     * @param freeColDomain FREE item name obtained<br />
     * 取得したFREE項目名
     * @param tmInvTplDomain Invoice Template Master domain information that has been acquired<br />
     * 取得した船積書類テンプレート原単位情報ドメイン
     * @param containerLst No container that has been acquired<br />
     * 取得したコンテナNo
     * @throws ApplicationException Can not set the registration data<br />
     * 登録データの設定ができない場合
     */
    protected void prepareTwInvoiceDomainOnRegisterByCommon (TwInvoiceDomain twInvoiceDomain
        , W6001DocCriteriaDomain criteria, W6001DocInvoiceDomain docInvDomain, W6001DocPltzDomain docPltzDomain
        , String tempInvoiceNo, W6001DocDomain freeColDomain, TmInvTplDomain tmInvTplDomain, String[] containerLst)
        throws ApplicationException {
        // Copy property data.
        // 画面からの項目をコピー
        CommonUtil.copyPropertiesDomainToDomain(twInvoiceDomain, criteria);
        
        twInvoiceDomain.setTempInvoiceNo(tempInvoiceNo);
        
        // Get invoice work data from the invoice group work data.
        // インボイスグループワークから
        twInvoiceDomain.setShipToCd(docInvDomain.getShipToCd());
        twInvoiceDomain.setShipToCompCd(docInvDomain.getShipToCompCd());
        twInvoiceDomain.setCustomerCd(docInvDomain.getCustomerCd());
        twInvoiceDomain.setLgcyShipTo(docInvDomain.getLgcyShipTo());
        twInvoiceDomain.setInvoiceCtgryNm(docInvDomain.getC4());
        twInvoiceDomain.setShippedDt(docInvDomain.getShippedDt());
        twInvoiceDomain.setTrnsCd(docInvDomain.getTrnsCd());
        twInvoiceDomain.setTrnsNm(docInvDomain.getC1());
        twInvoiceDomain.setTrnsCdOrg(docInvDomain.getTrnsCdOrg());
        if (GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {
            twInvoiceDomain.setPriceTerms(docInvDomain.getPriceTerms());
        }
        twInvoiceDomain.setContainerLooseTyp(docInvDomain.getContainerLooseTyp());
        twInvoiceDomain.setContainerSortingKey(docInvDomain.getContainerSortingKey());
        twInvoiceDomain.setCustomTimingTyp(docInvDomain.getCustomTimingTyp());
        twInvoiceDomain.setInvoiceKey(docInvDomain.getInvoiceKey());
        twInvoiceDomain.setSupplierInvoiceNo(docInvDomain.getSupplierInvoiceNo());
        twInvoiceDomain.setImpInvoiceNo1(docInvDomain.getImpInvoiceNo1());
        twInvoiceDomain.setImpInvoiceNo2(docInvDomain.getImpInvoiceNo2());
        // ST959 UNIT CONVERSION ADD START
        // Rather than the screen display value, palletizing work/part number work to set what was recalculated from.
        // Total Vol., Total G/W is the same as the screen display value.
        // Screen for Total N / W is something that has been piled up palletizing work at a speed priority,
        // Registering may change the screen display values for setting those stacked from Part workpiece accuracy priority.
        // 画面表示値でなく、パレタイズワーク、品番ワークから再計算したものを設定する。
        // Total Vol.、Total G/Wは画面表示値と変わらない。
        // Total N/Wについては画面は速度優先でパレタイズワークを積み上げたものだが、
        // 登録では精度優先で品番ワークから積み上げたものを設定するため画面表示値と変わる可能性がある。
        if (GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {
            // G/W, Vol. Setting of the case of the main invoice only.
            // G/W, Vol.の設定はメインインボイスの場合のみ
            twInvoiceDomain.setTotalVolume(docInvDomain.getTotalVolume());
            twInvoiceDomain.setVolumeUnit(docInvDomain.getVolumeUnit());
            twInvoiceDomain.setTotalGrossWeight(docInvDomain.getTotalGrossWeight());
        }
        twInvoiceDomain.setTotalNetWeight(docInvDomain.getTotalNetWeight());
        twInvoiceDomain.setWeightUnit(docInvDomain.getWeightUnit());
        // ST959 UNIT CONVERSION ADD END
        
        // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
        twInvoiceDomain.setAdditionalChargeNm(docInvDomain.getC8());
        // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
        
        // Get invoice work data from the palletize work data.
        // インボイス対象パレタイズワークから
        twInvoiceDomain.setEtd(docPltzDomain.getEtd());
        twInvoiceDomain.setEta(docPltzDomain.getEta());
        twInvoiceDomain.setArrivalTime(docPltzDomain.getArrivalTime());
        twInvoiceDomain.setLPortCntryCd(docPltzDomain.getLPortCntryCd());
        twInvoiceDomain.setLoadingPortCd(docPltzDomain.getLoadingPortCd());
        twInvoiceDomain.setLoadingPortNm(docPltzDomain.getLoadingPortNm());
        twInvoiceDomain.setDPortCntryCd(docPltzDomain.getDPortCntryCd());
        twInvoiceDomain.setDischargePortCd(docPltzDomain.getDischargePortCd());
        twInvoiceDomain.setDischargePortNm(docPltzDomain.getDischargePortNm());
        twInvoiceDomain.setDlivPoint(docPltzDomain.getDlivPoint());
        twInvoiceDomain.setCarrierCompCd(docPltzDomain.getCarrierCompCd());
        twInvoiceDomain.setCarrierCompNmAbb(docPltzDomain.getCarrierCompNmAbb());
        twInvoiceDomain.setForwarderCompCd(docPltzDomain.getForwarderCompCd());
        twInvoiceDomain.setVessel(docPltzDomain.getVessel());
        
        // Remittance or L/C
        if (!REM_LC_TYP_REM.equals(criteria.getRemLcTyp())) {
            twInvoiceDomain.setRemLcTyp(null);
            twInvoiceDomain.setRemBankNm(null);
            twInvoiceDomain.setRemBankAddress1(null);
            twInvoiceDomain.setRemBankAddress2(null);
            twInvoiceDomain.setRemBankAddress3(null);
            twInvoiceDomain.setRemBankAccountNo(null);
        } 
        if (!REM_LC_TYP_LC.equals(criteria.getRemLcTyp())) {
            twInvoiceDomain.setLcNo(null);
            twInvoiceDomain.setLcDt(null);
            twInvoiceDomain.setLcBankNm1(null);
            twInvoiceDomain.setLcBankNm2(null);
        }
        // Get free item name.
        // 取得したFREE項目名
        // UT258 MOD START
        //twInvoiceDomain.setFree1ColNm(freeColDomain.getFreeColNm1());
        //twInvoiceDomain.setFree2ColNm(freeColDomain.getFreeColNm2());
        //twInvoiceDomain.setFree3ColNm(freeColDomain.getFreeColNm3());
        //twInvoiceDomain.setFree4ColNm(HS_CODE);
        twInvoiceDomain.setFree1ColNm(null);
        if (FLAG_Y.equals(criteria.getFree1DispFlg())) {
            twInvoiceDomain.setFree1ColNm(freeColDomain.getFreeColNm1());
        }
        twInvoiceDomain.setFree2ColNm(null);
        if (FLAG_Y.equals(criteria.getFree2DispFlg())) {
            twInvoiceDomain.setFree2ColNm(freeColDomain.getFreeColNm2());
        }
        twInvoiceDomain.setFree3ColNm(null);
        if (FLAG_Y.equals(criteria.getFree3DispFlg())) {
            twInvoiceDomain.setFree3ColNm(freeColDomain.getFreeColNm3());
        }
        twInvoiceDomain.setFree4ColNm(null);
        if (FLAG_Y.equals(criteria.getFree4DispFlg())) {
            twInvoiceDomain.setFree4ColNm(HS_CODE);
        }
        // UT258 MOD END
        
        if (null != tmInvTplDomain) {
            twInvoiceDomain.setApprovalPosition(tmInvTplDomain.getMaster8());
            twInvoiceDomain.setApprovalNm(tmInvTplDomain.getMaster7());
        }
        // Get container no.
        // 取得したコンテナNo
        twInvoiceDomain.setContainerNo1(containerLst[0]);
        twInvoiceDomain.setContainerNo2(containerLst[1]);
        twInvoiceDomain.setContainerNo3(containerLst[2]);
        
        twInvoiceDomain.setInvoiceNo("-");
        if (GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {
            twInvoiceDomain.setManualInvoiceIssueDt(criteria.getDispInvoiceIssueDt());
            twInvoiceDomain.setInvoiceIssueDt(criteria.getInvoiceIssueDt());
        } else {
            Date issueDt = DateUtils.truncate(new Date(), Calendar.DAY_OF_MONTH);
            twInvoiceDomain.setManualInvoiceIssueDt(issueDt);
            twInvoiceDomain.setInvoiceIssueDt(issueDt);
        }
        
        twInvoiceDomain.setManualFlg(FLAG_N);
        twInvoiceDomain.setCancelTyp(FLAG_N);
        twInvoiceDomain.setCancelInvoiceNo(null);
        twInvoiceDomain.setParInvoiceNo(null);
        twInvoiceDomain.setParInvoiceIssueDt(null);
        twInvoiceDomain.setRelateInvoiceNo(null);
        twInvoiceDomain.setRelateInvoiceIssueDt(null);
        twInvoiceDomain.setConsigneeTaxIdNo(null);

        // set SHIPPER_TAX_ID_NO to TAX_ID_NO got from NEXUS company master by Shipper code.
        // SHIPPER_TAX_ID_NOにNEXUS会社原単位から取得した、ShipperCd(FRT品の場合はFRTShipperCd)に紐づくTAX_ID_NOをセットする。
        String taxIdNo = searchTaxIdNoByCompCd(criteria.getShipperCd());
        if (GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {
            taxIdNo = searchTaxIdNoByCompCd(criteria.getShipperCd());
        } else {
            taxIdNo = searchTaxIdNoByCompCd(criteria.getFrtShipperCd());
        }
        twInvoiceDomain.setShipperTaxIdNo(taxIdNo);
        
        // Among the data to be registered in the Invoice Work table, set the items that registered information is changed by CmlTyp · GroupNo.first. 
        // CML_TYP、Group No.firstによって異なるパラメータの設定
        prepareTwInvoiceDomainOnRegisterByCmlTyp(twInvoiceDomain, criteria, docInvDomain, docPltzDomain);
    }
    
    /**
     * Set the registration data when registering to own base.
     * <br />自拠点に登録するときの登録データを設定します。
     * 
     * @param twInvoiceDomain Domain to be registered<br />
     * 登録するドメイン
     * @param criteria Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @param docInvDomain Invoice Work group information domain that has been acquired <br />
     * 取得したインボイスワークグループ情報ドメイン
     * @param tempInvoiceNoArr Provisional Invoice No have numbered<br />
     * 採番した仮インボイスNo
     * @param reInvFlg true is that need Relate Invoice No, other false.
     */
    protected void prepareTwInvoiceDomainOnRegisterForDBase (TwInvoiceDomain twInvoiceDomain
        , W6001DocCriteriaDomain criteria, W6001DocInvoiceDomain docInvDomain, String[] tempInvoiceNoArr, String reInvFlg) {
        
        twInvoiceDomain.setTotalInvoiceAmount(criteria.getSubTotal().add(criteria.getVat())
            .add(criteria.getHandlingCharge().add(criteria.getAdditionalCharge())));
        
        twInvoiceDomain.setShipperCd(docInvDomain.getShipperCd());
        twInvoiceDomain.setParInvoiceShipperCd(docInvDomain.getShipperCd());
        twInvoiceDomain.setConsigneeCd(docInvDomain.getConsigneeCd());
        twInvoiceDomain.setCurrCd(docInvDomain.getCurrCd());

        twInvoiceDomain.setManualTyp(null);
        
        if (GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {

            twInvoiceDomain.setParTempInvoiceNo(tempInvoiceNoArr[0]);
            
            if(FLAG_Y.equals(reInvFlg)) {
                twInvoiceDomain.setRelateTempInvoiceNo(tempInvoiceNoArr[1]);
                twInvoiceDomain.setRelateInvoiceShipperCd(docInvDomain.getConsigneeCd());
            }
            
            twInvoiceDomain.setFreight(criteria.getFreight());
            twInvoiceDomain.setInsurance(criteria.getInsurance());
            twInvoiceDomain.setVatRatio(criteria.getVatRatio());
            twInvoiceDomain.setVat(criteria.getVat());
        } else {

            twInvoiceDomain.setParTempInvoiceNo(tempInvoiceNoArr[2]);
            
            twInvoiceDomain.setRelateTempInvoiceNo(null);
            twInvoiceDomain.setRelateInvoiceShipperCd(null);
            
            twInvoiceDomain.setFreight(BigDecimal.ZERO);
            twInvoiceDomain.setInsurance(BigDecimal.ZERO);
            twInvoiceDomain.setVatRatio(BigDecimal.ZERO);
            twInvoiceDomain.setVat(BigDecimal.ZERO);
        }
        
        if (!CML_TYPE_MISCELLANEOUS.equals(criteria.getCmlTyp())) {
            twInvoiceDomain.setHandlingCharge(BigDecimal.ZERO);
            // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
            twInvoiceDomain.setAdditionalChargeCd(null);
            // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
            twInvoiceDomain.setAdditionalChargeNm(null);
            twInvoiceDomain.setAdditionalCharge(BigDecimal.ZERO);
        }
    }
    
    /**
     * Set the registration data when registering the Re-Invoice.
     * <br />リインボイスを登録するときの登録データを設定します。
     * 
     * @param twInvoiceDomain Domain to be registered<br />
     * 登録するドメイン
     * @param criteria Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @param docInvDomain Invoice Work group information domain that has been acquired <br />
     * 取得したインボイスワークグループ情報ドメイン
     * @param tempInvoiceNoArr Provisional Invoice No have numbered<br />
     * 採番した仮インボイスNo
     */
    protected void prepareTwInvoiceDomainOnRegisterForReInvoice (TwInvoiceDomain twInvoiceDomain
        , W6001DocCriteriaDomain criteria, W6001DocInvoiceDomain docInvDomain, String[] tempInvoiceNoArr) {
        
        twInvoiceDomain.setTotalInvoiceAmount(criteria.getSubTotal().add(criteria.getVat())
            .add(criteria.getHandlingCharge().add(criteria.getAdditionalCharge())));
        
        twInvoiceDomain.setShipperCd(docInvDomain.getConsigneeCd());
        twInvoiceDomain.setConsigneeCd(docInvDomain.getShipToCompCd());
        
        twInvoiceDomain.setManualTyp(MANUAL_TYP_RE_INVOICE);
        //twInvoiceDomain.setParInvoiceShipperCd(null); // ST946 MANUAL SCREEN TRANSITION DEL
        twInvoiceDomain.setCurrCd(null);
        twInvoiceDomain.setNetAmount(null);
        twInvoiceDomain.setFreight(null);
        twInvoiceDomain.setInsurance(null);
        twInvoiceDomain.setSubTotal(null);
        twInvoiceDomain.setVatRatio(null);
        twInvoiceDomain.setVat(null);
        twInvoiceDomain.setHandlingCharge(null);
        twInvoiceDomain.setAdditionalCharge(null);
        // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
        twInvoiceDomain.setAdditionalChargeCd(null);
        // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
        twInvoiceDomain.setAdditionalChargeNm(null);
        twInvoiceDomain.setTotalInvoiceAmount(null);
        twInvoiceDomain.setNoCharge(null);
        
        if (GRP_NO2_MAIN.equals(criteria.getGrpNo2())) {
            twInvoiceDomain.setParInvoiceShipperCd(twInvoiceDomain.getShipperCd()); // ST946 MANUAL SCREEN TRANSITION ADD
            // ST946 MANUAL SCREEN TRANSITION MOD START
            //twInvoiceDomain.setParTempInvoiceNo(null);
            twInvoiceDomain.setParTempInvoiceNo(tempInvoiceNoArr[1]);
            // ST946 MANUAL SCREEN TRANSITION MOD END
            twInvoiceDomain.setRelateTempInvoiceNo(tempInvoiceNoArr[0]);
            twInvoiceDomain.setRelateInvoiceShipperCd(docInvDomain.getShipperCd());
        } else {
            twInvoiceDomain.setParTempInvoiceNo(tempInvoiceNoArr[0]);
            twInvoiceDomain.setRelateTempInvoiceNo(null);
            twInvoiceDomain.setRelateInvoiceShipperCd(null);
        }
    }
    
    /**
     * Regular Invoice No registration determination processing.
     * <br />正規インボイスNo登録判定処理をします。
     * <pre>
     * - Get Invoice number of the same group No
     *   Set the following items TwInvCriteriaDomain
     *   Call  TwInvService.searchByCondition(TwInvCriteriaDomain).
     *     - Login DSC-ID
     *     - SHIPPER CODE
     *     - Group No.first
     * 
     * - Get the number of provisional Invoice No are numbered
     *   Set the following items W6001DocCriteriaDomain
     *   Call W6001DocDao.searchCountTwInvByTempInvoiceNo(W6001DocCriteriaDomain).
     *     - Login DSC-ID
     *     - SHIPPER CODE
     *     - Group No.first
     * </pre>
     * <pre>
     * ‐同じグループNoのインボイス件数を取得
     *     {@link TwInvCriteriaDomain}に以下の項目を設定し
     *     {@link TwInvService#searchByCondition(TwInvCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     *       ‐荷主コード
     *       ‐Group No.first
     * 
     * ‐仮インボイスNoが採番されている件数を取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し
     *     {@link W6001DocDao#searchCountTwInvByTempInvoiceNo(W6001DocCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     *       ‐荷主コード
     *       ‐Group No.first
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param grpNo1 Group No.first
     * @return True, false otherwise get if the number is equal to<br />
     * 取得件数が等しい場合true、それ以外false
     * @throws ApplicationException Regular Invoice No registration determination processing can not be<br />
     * 正規インボイスNo登録判定処理ができない場合
     */
    protected boolean checkCreateInvoiceNoOnRegister (String dscId, String shipperCd, String grpNo1) 
        throws ApplicationException {
        
        TwInvCriteriaDomain twInvCriteria = new TwInvCriteriaDomain();
        twInvCriteria.setDscId(dscId);
        twInvCriteria.setShipperCd(shipperCd);
        twInvCriteria.setGrpNo1(grpNo1);
        twInvCriteria.setSearchCountCheckFlg(false);
        
        // 2015/10/08 DNJP.Kawamura ST977対応（正規インボイスNo登録判定条件が間違っているため修正） START >>>>>
//        int groupNo1Count = twInvService.searchCount(twInvCriteria);
        // 2015/10/08 DNJP.Kawamura ST977対応（正規インボイスNo登録判定条件が間違っているため修正） END <<<<<

        
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(docCriteria, twInvCriteria);
        // Get the number of provisional Invoice No are numbered. 
        // 仮インボイスNoが採番されている件数を取得
        int tempCount = w6001DocDao.searchCountTwInvByTempInvoiceNo(docCriteria);

        // 2015/10/08 DNJP.Kawamura ST977対応（正規インボイスNo登録判定条件が間違っているため修正） START >>>>>
//        return groupNo1Count == tempCount;
        return tempCount == 0;
        // 2015/10/08 DNJP.Kawamura ST977対応（正規インボイスNo登録判定条件が間違っているため修正） END <<<<<
    }
    
    /**
     * Register a regular Invoice No.
     * <br />正規インボイスNoを登録します。
     * <pre>
     * - Get regular Invoice No numbering object data
     *   Call searchTwInvOnRegisterForNormInv(String, String, String) the argument to the following items .
     * 
     * - Invoice No regular numbering
     *   # sequenceNormalInvoiceNo (List, String, String)
     * 
     * - Re-Invoice No numbering
     *   # Call sequenceReInvoiceNo(List, String, String).
     * 
     * - INVOICE ISSUE DATE acquisition
     * 
     * - PDF registration form creation to the regular table
     *   Call createNormalInvoiceNoOnRegister(List, W6001DocCriteriaDomain, List, Date).
     * 
     * - Registration of Invoice No. to Palletize table , change of Palletize STATUS
     *   Call updateTtPltzOnRegisterForMainInvoice(List, List, W6001DocCriteriaDomain, Date).
     * 
     * - Subtraction of Temp Stock
     *   Call updateTtTmpStockOnRegisterByQty(List).
     * 
     * - Adding SHIPPED QUANTITY, the number of times the shipping instruction
     *   Call updateTtExpRcvOdrOnRegister(List).
     * 
     * -CIGMA write to
     *   Call callWebService6001(String, List).
     * 
     * -  Screen refresh ( Initial display processing at the transition from the Main screen )
     *   Call searchOnRegisterInitByFromMain(W6001DocCriteriaDomain).
     * </pre>
     * <pre>
     * ‐正規インボイスNo採番対象データを取得
     *     以下の項目を引数に{@link #searchTwInvOnRegisterForNormInv(String, String, String)}を呼出します。
     * 
     * ‐正規インボイスNo採番
     *     {@link #sequenceNormalInvoiceNo(List, String, String)}
     * 
     * ‐リインボイスNo採番
     *     {@link #sequenceReInvoiceNo(List, String, String)}を呼び出します。
     *     
     * ‐インボイス発行日取得
     *     
     * ‐正規テーブルへの登録・PDF帳票作成
     *     {@link #createNormalInvoiceNoOnRegister(List, W6001DocCriteriaDomain, List, Date)}を呼出します。
     * 
     * ‐パレタイズテーブルへのインボイスNo.の登録、パレタイズステータスの変更
     *     {@link #updateTtPltzOnRegisterForMainInvoice(List, List, W6001DocCriteriaDomain, Date)}を呼出します。
     * 
     * ‐仮在庫の減算
     *     {@link #updateTtTmpStockOnRegisterByQty(List)}を呼出します。
     * 
     * ‐出荷数量、出荷指示回数の加算
     *     {@link #updateTtExpRcvOdrOnRegister(List)}を呼出します。
     * 
     * ‐CIGMAへの書き込み
     *     {@link #callWebService6001(String, List)}を呼出します。
     * 
     * ‐画面の再表示(Main画面から遷移時の初期表示処理)
     *     {@link #searchOnRegisterInitByFromMain(W6001DocCriteriaDomain)}を呼出します。
     * </pr>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Screen display information<br />
     * 画面表示情報
     * @throws ApplicationException Registration of authorized Invoice No can not be<br />
     * 正規インボイスNoの登録ができなかった場合
     */
    protected W6001DocInvoiceDomain transactOnRegisterByRegistTtInvoice(W6001DocCriteriaDomain criteria) throws ApplicationException {
        // Get regular Invoice No numbering target data. 
        // 正規インボイスNo採番対象データの取得
        List<? extends TwInvDomain> twInvList = searchTwInvOnRegisterForNormInv(criteria.getDscId(), criteria.getShipperCd(), criteria.getGrpNo1());
        // Numbered the regular Invoice No. 
        // 正規インボイスNo採番
        List<String> normInvNoList = sequenceNormalInvoiceNo(twInvList, criteria.getShipperCd(), criteria.getDscId());
        // Numbered the Re-Invoice No. 
        // リインボイスNo採番
        sequenceReInvoiceNo(twInvList, criteria.getShipperCd(), criteria.getDscId());

        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //Date invIssueDt = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(criteria.getShipperCd())), Calendar.DAY_OF_MONTH);
        Date invIssueDt = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(criteria.getShipperCd())), Calendar.SECOND);
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
        Date mnInvIssueDt = DateUtils.truncate(new Date(), Calendar.SECOND);
        for (int i = 0; i < twInvList.size(); i++) {
            TwInvDomain twInvDomain = twInvList.get(i);
            String invoiceNo = normInvNoList.get(i);
            if (GRP_NO2_MAIN.equals(twInvDomain.getGrpNo2())) {
                // Get Invoice work.
                TwInvoiceDomain twInvoiceDomain = searchTwInvoiceDomainOnRegisterForCreate(criteria.getDscId()
                    , invoiceNo, criteria.getShipperCd(), true);
                mnInvIssueDt = twInvoiceDomain.getManualInvoiceIssueDt();
            }
        }
        
        // Get Invoice Work from the registration data.
        // 正規テーブルへの登録・PDF帳票作成
        List<? extends TtInvoiceDomain> ttInvoiceList = createNormalInvoiceNoOnRegister(twInvList, criteria, normInvNoList, invIssueDt, mnInvIssueDt);
        // Registration of Invoice No. Palletize to the table, change of Palletize STATUS 
        // パレタイズテーブルへのインボイスNo.の登録、パレタイズステータスの変更
        updateTtPltzOnRegisterForMainInvoice(twInvList, normInvNoList, criteria, invIssueDt);
        // Subtraction of Temp Stock .
        // 仮在庫の減算
        updateTtTmpStockOnRegisterByQty(ttInvoiceList);
        // Add SHIPPED QUANTITY, the number of times the shipping instruction. 
        // 出荷数量、出荷指示回数の加算
        updateTtExpRcvOdrOnRegister(ttInvoiceList);
        
        // UT205 CML ATTACH CSV ADD START
        // Create a CML attach CSV file, registe it to the file manager.
        // CMLアタッチCSVファイルを作成し、ファイルマネージャーに登録
        createCmlAttachCsvFile(criteria, normInvNoList.get(0), invIssueDt);
        // UT205 CML ATTACH CSV ADD END

        // AI-JB キュー登録
        String requestId = commonService.createRequestJob(SCREEN_ID_W6009);
        List<TtOnlineReqJobParamDomain> reqJobList
            = new ArrayList<TtOnlineReqJobParamDomain>();
        TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
            = new TtOnlineReqJobParamDomain();
        // 1件目
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
        ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
        ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_INVOICE);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W6009);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        // 2件目以降
        TtInvoiceCriteriaDomain ttInvoiceCriteria = new TtInvoiceCriteriaDomain();
        ttInvoiceCriteria.setParInvoiceShipperCd(criteria.getShipperCd());
        ttInvoiceCriteria.setParInvoiceNo(normInvNoList.get(0));
        ttInvoiceCriteria.setParInvoiceIssueDt(invIssueDt);
        List<TtInvoiceDomain> resultList = ttInvoiceService.searchByCondition(ttInvoiceCriteria);
        BigDecimal brch = new BigDecimal(2);
        for(TtInvoiceDomain domain : resultList) {
            ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
            ttOnlineReqJobParamcriteria.setRequestId(requestId);
            ttOnlineReqJobParamcriteria.setBrch(brch);
            ttOnlineReqJobParamcriteria.setParamNm(KEY);
            ttOnlineReqJobParamcriteria.setParamValue01(domain.getShipperCd());
            ttOnlineReqJobParamcriteria.setParamValue02(domain.getInvoiceNo());
            String formatDate = new SimpleDateFormat("yyyyMMddHHmmss").format(domain.getInvoiceIssueDt());
            ttOnlineReqJobParamcriteria.setParamValue03(formatDate);
            ttOnlineReqJobParamcriteria.setParamValue04(FLAG_N);
            ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
            commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W6009);
            reqJobList.add(ttOnlineReqJobParamcriteria);
            brch = brch.add(new BigDecimal(1));
        }
        ttOnlineReqJobParamService.create(reqJobList);
        
        // If CIGMA part exists.
        // CIGMA品がある場合のみ。
        if (0 < ttInvoiceList.size()) { // UT453 ADD if
            // Set data to CIGMA.
            // CIGMAへの書き込み
            callWebService6001(criteria.getShipperCd(), ttInvoiceList);
    
            // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 START >>>>>
            // Judgment of InvoiceDB processing. 
            // CIGMA環境原単位の取得（InvoicdDB用処理要否判断）
            TmCigmaEnvCriteriaDomain tmCigmaEnvCriteriaDomain = new TmCigmaEnvCriteriaDomain();
            tmCigmaEnvCriteriaDomain.setCompCd(criteria.getShipperCd());
            TmCigmaEnvDomain tmCigmaEnvDomain
                = tmCigmaEnvService.searchByKey(tmCigmaEnvCriteriaDomain);
    
            // call 6005 Webservice
            // 処理要の場合のみ6005のWebserviceを呼ぶ
            if (FLAG_Y.equals(tmCigmaEnvDomain.getInvDbFlg())) {
                // get OGC code
                // NEXUS会社原単位の取得（OGC code）
                TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
                tmNxsCompCriteriaDomain.setCompCd(criteria.getShipperCd());
                TmNxsCompDomain tmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
    
                // Set data to CIGMA(InvoiceDB).
                // CIGMA(InvoiceDB)への書き込み
                // ST144対応
                // callWebService6005(criteria.getOwnerCompCd(), ttInvoiceList, tmCigmaEnvDomain, tmNxsCompDomain);
                callWebService6005(criteria.getShipperCd(), ttInvoiceList, tmCigmaEnvDomain, tmNxsCompDomain);
            }
            // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 END <<<<<
        }

        criteria.setInvoiceNo(normInvNoList.get(0));
        criteria.setInvoiceIssueDt(invIssueDt);
        
        return  searchOnRegisterInitByFromMain(criteria); 
    }
    
    /**
     * Numbered the regular Invoice No.
     * <br />正規インボイスNoを採番します。
     * <pre>
     * - Numbering regular Invoice No
     *   In the case of (. GroupNo2List = "0" internal variable) main Invoice
     *     The [If there is a vendor Invoice No to target data acquired] 
     *       Suppose regular Invoice No vendor Invoice No.
     * 
     *     The [If there is no vendor Invoice No to target data acquired]
     *       Numbered the regular Invoice No.
     *       Call transactSequenceNormalInv(String, String) arguments CmlTyp and SHIPPER CODE.
     * 
     *   If FRT Invoice (internal variable. GroupNo2List ≠ "0")
     *     The [If there is a vendor Invoice No to target data acquired]
     *       Suppose the regular Invoice No "supplier Invoice No + SEQUENCE NO".
     * 
     *     The [If there is no vendor Invoice No to target data acquired]
     *       Numbered the regular Invoice No.
     *       Call transactSequenceNormalInv(String, String) arguments CmlTyp and SHIPPER CODE.
     * 
     * - Register the regular Invoice No to the work table
     *   To the following table, perform the update process.
     *   However, in the case of FRT Invoice, Register only "INVOICE_NO" is to Invoice Work.
     *     - Invoice Number created for work
     *       updateTwInvItemOnRegisterForNormInvoiceNo (String, String, String)
     *     - Invoice Group Work
     *       updateTwInvOnRegisterForNormInvoiceNo (String, String, String)
     *     - Invoice Work
     * </pre>
     * <pre>
     * ‐正規インボイスNoの採番
     *     メインインボイス（内部変数.groupNo2List = "0"）の場合
     *       [取得した対象データに仕入先インボイスNoがある場合]
     *           仕入先インボイスNoを正規インボイスNoとします。
     *       
     *       [取得した対象データに仕入先インボイスNoがない場合]
     *           正規インボイスNoを採番します。
     *           荷主コードとCmlTypを引数に{@link #transactSequenceNormalInv(String, String)}を呼出します。
     * 
     *     FRTインボイス（内部変数.groupNo2List ≠ "0"）の場合
     *       [取得した対象データに仕入先インボイスNoがある場合]
     *           「仕入先インボイスNo + 連番」を正規インボイスNoとします。
     *       
     *       [取得した対象データに仕入先インボイスNoがない場合]
     *           正規インボイスNoを採番します。
     *           荷主コードとCmlTypを引数に{@link #transactSequenceNormalInv(String, String)}を呼出します。
     * 
     * ‐ワークテーブルへの正規インボイスNoを登録
     *     以下のテーブルに対して、更新処理を行います。
     *     ただし、FRTインボイスの場合は、インボイスワークへは「INVOICE_NO」のみを登録します。
     *       ‐インボイス作成対象品番ワーク
     *           {@link #updateTwInvItemOnRegisterForNormInvoiceNo(String, String, String)}
     *       ‐インボイスグループワーク
     *           {@link #updateTwInvOnRegisterForNormInvoiceNo(String, String, String)}
     *       ‐インボイスワーク
     * </pre>
     * 
     * @param twInvList Invoice No regular numbering object data<br />
     * 正規インボイスNo採番対象データ
     * @param shipperCd SHIPPER CODE screen<br />
     * 画面の荷主コード
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @return Invoice No regular list<br />
     * 正規インボイスNoリスト
     * @throws ApplicationException Could not numbering regular Invoice No<br />
     * 正規インボイスNoの採番が出来なかった場合
     */
    protected List<String> sequenceNormalInvoiceNo (List<? extends TwInvDomain> twInvList, String shipperCd, String dscId)
        throws ApplicationException {
        List<String> normInvoiceNoList = new ArrayList<String>();
        
        int cntFrtSupInv = 0;
        for (TwInvDomain twInvDomain : twInvList) {
            String normalInvNo;
            boolean updateParInv = false;
            boolean updateReInv = false;
            if (GRP_NO2_MAIN.equals(twInvDomain.getGrpNo2())) {
                // Case of main invoice.
                // メインインボイス（内部変数.groupNo2List = "0"）の場合
                
                if (StringUtils.isNotEmpty(twInvDomain.getSupplierInvoiceNo())) {
                    normalInvNo = twInvDomain.getSupplierInvoiceNo();
                } else {
                    // Numbered the regular Invoice No. 
                    // 正規インボイスNoの採番
                    normalInvNo = transactSequenceNormalInv(shipperCd, twInvDomain.getCmlTyp());
                }
                updateParInv = true;
                updateReInv = true;
                
            } else {
                // Case of FRT invoice.
                // FRTインボイス（内部変数.groupNo2List ≠ "0"）の場合
                
                if (StringUtils.isNotEmpty(twInvDomain.getSupplierInvoiceNo())) {
                    normalInvNo = twInvDomain.getSupplierInvoiceNo() + Integer.toString(cntFrtSupInv);
                    cntFrtSupInv++;
                } else {
                    // Numbered the regular Invoice No. 
                    // 正規インボイスNoの採番

                    // 2016/04/04 MOD START
                    //normalInvNo = transactSequenceNormalInv(shipperCd, INVOICE_CLASS_FULL_RT);

                    // To consideration of the case where FRT shipper has been changed,
                    // and the dscId and temporary invoice No. of twInvDomain the key, to get the FRT sipper from invoice work.
                    // FRTシッパーが変更されている場合を考慮し、dscIdとtwInvDomainの仮インボイスNo.をキーに
                    // インボイスワークからFRTシッパーを取得して、shipperCdの代わりとする。
                    TwInvoiceCriteriaDomain twInvoiceCriteriaDomain = new TwInvoiceCriteriaDomain();
                    twInvoiceCriteriaDomain.setDscId(dscId);
                    twInvoiceCriteriaDomain.setTempInvoiceNo(twInvDomain.getTempInvoiceNo());
                    List<TwInvoiceDomain> resultTwInvoiceDomainList
                        = twInvoiceService.searchByCondition(twInvoiceCriteriaDomain);
                    String frtShipperCd = shipperCd;
                    if (0 < resultTwInvoiceDomainList.size()) {
                        frtShipperCd = resultTwInvoiceDomainList.get(0).getFrtShipperCd();
                    }
                    normalInvNo = transactSequenceNormalInv(frtShipperCd, INVOICE_CLASS_FULL_RT);
                    // 2016/04/04 MOD END
                }
            }
            // Register a regular Invoice No Invoice created for the part number work. 
            // インボイス作成対象品番ワーク登録
            updateTwInvItemOnRegisterForNormInvoiceNo(normalInvNo, dscId, twInvDomain.getTempInvoiceNo());
            // Register a regular Invoice No in Invoice Group Work. 
            // インボイスグループワーク登録
            updateTwInvOnRegisterForNormInvoiceNo(normalInvNo, dscId, twInvDomain.getTempInvoiceNo());
            // Register a regular Invoice No in Invoice Work. 
            // インボイスワーク登録
            updateTwInvoiceOnRegisterForNormInvoiceNo(normalInvNo, dscId, twInvDomain.getTempInvoiceNo(), updateParInv, updateReInv);
            
            normInvoiceNoList.add(normalInvNo);
        }
        return normInvoiceNoList;
    }
    
    /**
     * Numbered the Re-Invoice No.
     * <br />リインボイスNoを採番します。
     * <pre>
     * [For Re-Invoice is required]
     *   - Generate Invoice numbering key
     *     "System ID (ECA0027)" + "_" + Re-Invoice Shipper
     * 
     *   - The numbering regular Invoice No
     *     An argument SHIPPER CODE and numbering key generated, Call searchTmInvSeqOnRegister(String, String).
     * 
     *   - Invoice Work registration
     *     Do the registration INVOICE_NO, of RELATE_INVOICE_NO.
     *     Call updateTwInvoiceOnRegisterForNormInvoiceNo(String, String, String, boolean, boolean).
     *    
     * [Re-Invoice is not required if]
     *   No action
     * </pre>
     * <pre>
     * [リインボイスが必要な場合]
     *   ‐インボイス採番キーを生成
     *       "システムID（ECA0027）" + "_" + リインボイスシッパー
     * 
     *   ‐正規インボイスNoを採番
     *       生成した採番キーと荷主コードを引数に、{@link #searchTmInvSeqOnRegister(String, String)}を呼出します。
     * 
     *   ‐インボイスワーク登録
     *       INVOICE_NO、RELATE_INVOICE_NOの登録を行います。
     *       {@link #updateTwInvoiceOnRegisterForNormInvoiceNo(String, String, String, boolean, boolean)}を呼び出します。
     * 
     * [リインボイスが不要な場合]
     *    処理なし
     * </pre>
     * 
     * @param twInvList Invoice No regular numbering object data<br />
     * 正規インボイスNo採番対象データ
     * @param shipperCd SHIPPER CODE screen<br />
     * 画面の荷主コード
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @throws ApplicationException Can not numbering the Re-Invoice No<br />
     * リインボイスNoを採番できない場合
     */
    protected void sequenceReInvoiceNo (List<? extends TwInvDomain> twInvList, String shipperCd, String dscId) 
        throws ApplicationException {
        
        for (TwInvDomain twInvDomain : twInvList) {
            if (FLAG_Y.equals(twInvDomain.getReInvoiceFlg())) {
                String seqKey = String.format(SEQ_KEY_RE_INVOICE_NO, twInvDomain.getReInvoiceShipperCd());
                // Numbered the Invoice No new from Invoice Sequence Master. 
                // リインボイスNoを採番
                String reInvoiceNo;
                try {
                    reInvoiceNo = searchTmInvSeqOnRegister(seqKey, shipperCd);
                } catch (GscmApplicationException e) {
                    throw new GscmApplicationException(NXS_E7_0121);
                }
                // Register a regular Invoice No in Invoice Work. 
                // インボイスワーク登録
                // ST946 MANUAL SCREEN TRANSITION MOD START
                //updateTwInvoiceOnRegisterForNormInvoiceNo(reInvoiceNo, dscId, twInvDomain.getTempInvoiceNo() + "_R", false, true);
                updateTwInvoiceOnRegisterForNormInvoiceNo(reInvoiceNo, dscId, twInvDomain.getTempInvoiceNo() + "_R", true, true);
                // ST946 MANUAL SCREEN TRANSITION MOD END
            }
        }
    }
    
    /**
     * Get regular Invoice No numbering target data.
     * <br />正規インボイスNo採番対象データを取得します。
     * <pre>
     * - Invoice Group Work Search TwInvCriteriaDomain Set the following items,
     *   TwInvService.SearchByCondition (TwInvCriteriaDomain) Calls.
     *     - Login DSC-ID
     *     - SHIPPER CODE
     *     - Group No.first
     * </pre>
     * <pre>
     * ‐インボイスグループワーク検索
     *     {@link TwInvCriteriaDomain}に以下の項目を設定し、
     *     {@link TwInvService#searchByCondition(TwInvCriteriaDomain)}を呼出します。
     *       ‐ログインDSC-ID
     *       ‐荷主コード
     *       ‐Group No.first
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param grpNo1 Group No.first
     * @return Invoice No regular numbering target data obtained<br />
     * 取得した正規インボイスNo採番対象データ
     * @throws ApplicationException Can not get regular Invoice No numbering object data<br />
     * 正規インボイスNo採番対象データの取得が出来ない場合
     */
    protected List<? extends TwInvDomain> searchTwInvOnRegisterForNormInv (String dscId, String shipperCd, String grpNo1) 
        throws ApplicationException {

        TwInvCriteriaDomain criteria = new TwInvCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setShipperCd(shipperCd);
        criteria.setGrpNo1(grpNo1);
        // 2014/12/10 DNJP.Kawamura ソート指定対応 START >>>>>
        criteria.setPreferredOrder("GRP_NO_2 asc");
        // 2014/12/10 DNJP.Kawamura ソート指定対応 END <<<<<
        
        return twInvService.searchByCondition(criteria);
    }
    
    /**
     * Numbered the regular Invoice No.
     * <br />正規インボイスNoを採番します。
     * <pre>
     * - Generate Invoice numbering key
     *   "System ID (ECA0027)" + "_" + Number type (※) + "_" + "S" 
     *   ※ Part Type: VALUE of CML TYP
     * 
     * - The numbering regular Invoice No
     *   An argument SHIPPER CODE and numbering key generated, Call searchTmInvSeqOnRegister(String, String).
     * </pre>
     * <pre>
     * ‐インボイス採番キーを生成
     *     "システムID（ECA0027）" + "_" + 品番種類（※） + "_" + "S"
     *       ※品番種類：CML TYPの値
     * 
     * ‐正規インボイスNoを採番
     *     生成した採番キーと荷主コードを引数に、{@link #searchTmInvSeqOnRegister(String, String)}を呼出します。
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param cmlTyp Cml Type
     * @return Regular Invoice No have numbered<br />
     * 採番した正規インボイスNo
     * @throws ApplicationException Numbering of regular Invoice No can not be<br />
     * 正規インボイスNoの採番が出来ない場合
     */
    protected String transactSequenceNormalInv (String shipperCd, String cmlTyp) throws ApplicationException {

        String seqKey = String.format(SEQ_KEY_INVOICE_NO, cmlTyp);
        // Numbered the Invoice No new from Invoice Sequence Master. 
        // 正規インボイスNoを採番
        return searchTmInvSeqOnRegister(seqKey, shipperCd);
    }
    
    /**
     * Numbered the Invoice No new from Invoice Sequence Master.
     * <br />インボイス採番原単位から新たにインボイスNoを採番します。
     * <pre>
     * - Invoice Sequence Master Lock
     *   Set the following items TmInvSeqCriteriaDomain,
     *    Call TmInvSeqService.lockByKeyNoWait(TmInvSeqCriteriaDomain).
     *     - COMPANY CODE: SHIPPER CODE
     *     - Numbering key generated
     * 
     * - Invoice No regular numbering
     *   Case 1. "NOW_SEQ" + 1 <= of "MAX_SEQ", Referred to as "regular Invoice No." And "NOW_SEQ" + 1.
     *   Case 2. "NOW_SEQ" + 1> of "MAX_SEQ", Referred to as "regular Invoice No." And "MIN_SEQ". 
     *   Unsuccessful 3. "NOW_SEQ" is an error.
     * 
     * - Invoice Sequence Master update
     *   The regular Invoice No is updated to the locked table. 
     *   TmInvSeqService.updateByCondition (TmInvSeqDomain, TmInvSeqCriteriaDomain)
     * </pre>
     * <pre>
     * ‐インボイス採番原単位ロック
     *     {@link TmInvSeqCriteriaDomain}に以下の項目を設定し、
     *     {@link TmInvSeqService#lockByKeyNoWait(TmInvSeqCriteriaDomain)}を呼出します。
     *       ‐会社コード：荷主コード
     *       ‐生成した採番キー
     * 
     * ‐正規インボイスNo採番
     *     1.「NOW_SEQ」 + 1 <= 「MAX_SEQ」の場合、「NOW_SEQ」 + 1を「正規インボイスNo.」とする。
     *     2.「NOW_SEQ」 + 1 > 「MAX_SEQ」の場合、「MIN_SEQ」を「正規インボイスNo.」とする。
     *     3.「NOW_SEQ」が取得できなかった場合、エラーとする。
     * 
     * ‐インボイス採番原単位更新
     *     ロックしたテーブルに対して正規インボイスNoを更新します。
     *     {@link TmInvSeqService#updateByCondition(TmInvSeqDomain, TmInvSeqCriteriaDomain)}
     * </pre>
     * 
     * @param seqKey Numbering key<br />
     * 採番キー
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @return Current number numbered<br />
     * 採番した現在番号
     * @throws ApplicationException Can not numbered<br />
     * 採番できなかった場合
     */
    protected String searchTmInvSeqOnRegister(String seqKey, String compCd) throws ApplicationException {

        TmInvSeqCriteriaDomain tmInvSeqCriteria = new TmInvSeqCriteriaDomain();
        tmInvSeqCriteria.setCompCd(compCd);
        tmInvSeqCriteria.setInvNumberingKey(seqKey);
        tmInvSeqCriteria.setSearchCountCheckFlg(false);
        

        TmInvSeqDomain tmInvSeqDomain = null;
        try {
            tmInvSeqDomain = tmInvSeqService.lockByKeyNoWait(tmInvSeqCriteria);
        } catch (ApplicationException e) {
            throw new GscmApplicationException(NXS_E7_0120);
        }
        if (null == tmInvSeqDomain || StringUtils.isEmpty(tmInvSeqDomain.getNowNo())) {
            throw new GscmApplicationException(NXS_E7_0120);
        }
        BigDecimal nowNo = new BigDecimal(tmInvSeqDomain.getNowNo());
        BigDecimal minNo = new BigDecimal(tmInvSeqDomain.getStarNo());
        BigDecimal maxNo = new BigDecimal(tmInvSeqDomain.getEndNo());
        
        BigDecimal newNo = null;
        if (nowNo.add(BigDecimal.ONE).compareTo(maxNo) > 0) {
            newNo = minNo;
        } else if (nowNo.compareTo(minNo) >= 0) {
            newNo = nowNo.add(BigDecimal.ONE);
        } else {
            throw new GscmApplicationException(NXS_E7_0120);
        }
        
        TmInvSeqDomain tmInvSeqUpdate = new TmInvSeqDomain();
        tmInvSeqUpdate.setNowNo(newNo.toPlainString());
        commonService.setCommonPropertyForUpdate(tmInvSeqUpdate, SCREEN_ID_W6009);
        tmInvSeqService.updateByCondition(tmInvSeqUpdate, tmInvSeqCriteria);
        
        return newNo.toPlainString();
    }
    
    /**
     * Registration process to the regular table
     * <br />正規テーブルへの登録処理
     * <pre>
     * Get Invoice Work from the registration data
     *   # Call searchTwInvoiceDomainOnRegisterForCreate(String, String, String, String, boolean).
     * 
     * Make the registration process to regular table below .
     *   - Invoice
     *     createTtInvoiceOnRegister (List, String, String, String, Date)
     * 
     *   - Invoice Header
     *     createTtInvoiceHeaderOnRegister (List, String, String, String, Date)
     *  
     *   [ In the case of own site (not in the Re-Invoice data) ]
     *     - Invoice Attached
     *       # createTtInvoiceAttachedOnRegister (List, W6001DocCriteriaDomain, String, Date)
     *   
     *     - Sales Contract Header ( sales contract required)
     *       createTtScHeaderOnRegister (List)
     *   
     *     - Sales Contract Attached ( sales contract required)
     *       createTtScAttachedOnRegister (List)
     *    
     *     - Packing Header
     *    
     *     - Packing attach (CML) (FRT other than )
     *       createTtPackingAttachedCmlOnRegister(List, String, Date, List)
     *    
     *     - Packing attach (No. ) (FRT other than )
     *       createTtPackAtchItemNoOnRegister (List, List, List, String, Date)
     *    
     *     - PDF file creation
     *       # Call createPdfFileOnRegister(String, String, Date, String, String, String, String, String, String, String, boolean).
     * </pre>
     * <pre>
     * 登録データをインボイスワークから取得
     *     {@link #searchTwInvoiceDomainOnRegisterForCreate(String, String, String, String, boolean)}を呼び出します。
     * 
     * 下記の正規テーブルに登録処理を行います。
     *   ‐インボイス
     *       {@link #createTtInvoiceOnRegister(List, String, String, String, Date)}
     *   
     *   ‐インボイスヘッダ
     *       {@link #createTtInvoiceHeaderOnRegister(List, String, String, String, Date)}
     *   
     *   [自拠点の場合(リインボイスデータではない)]
     *     ‐インボイスアタッチ
     *         {@link #createTtInvoiceAttachedOnRegister(List, String, Date, List)}
     *     
     *     ‐セールスコントラクトヘッダ(セールスコントラクト要)
     *         {@link #createTtScHeaderOnRegister(List)}
     *         
     *     ‐セールスコントラクトアタッチ(セールスコントラクト要)
     *         {@link #createTtScAttachedOnRegister(List)}
     *         
     *     ‐パッキングヘッダ
     *     
     *     ‐パッキングアタッチ(CML)(FRT以外)
     *         {@link #createTtPackingAttachedCmlOnRegister(List, List, String, Date)}
     *     
     *     ‐パッキングアタッチ(品番)(FRT以外)
     *         {@link #createTtPackAtchItemNoOnRegister(List, List, List, String, Date)}
     *     
     *     ‐PDFファイルの作成
     *         {@link #createPdfFileOnRegister(String, String, Date, String, String, String, String, String, String, String, boolean)}を呼び出します。
     * </pre>
     * 
     * @param twInvList Invoice Group Work List<br />
     * インボイスグループワークリスト
     * @param criteria Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @param normInvNoList List of regular Invoice No<br />
     * 正規インボイスNoのリスト
     * @param invIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param mnInvIssueDt MANUAL INVOICE ISSUE DATE<br />
     * マニュアルインボイス発行日
     * @return List of data registered in the Invoice of goods and CIGMA main Invoice<br />
     * メインインボイスかつCIGMA品のインボイスに登録したデータのリスト
     * @throws ApplicationException Registration of the regular table can not be.<br />
     * 正規テーブルへの登録ができない場合。
     */
    protected List<? extends TtInvoiceDomain> createNormalInvoiceNoOnRegister(List<? extends TwInvDomain> twInvList
        , W6001DocCriteriaDomain criteria, List<String> normInvNoList, Date invIssueDt, Date mnInvIssueDt) 
        throws ApplicationException {
        // Get the user name. 
        // ログインユーザ名取得
        String dscNm = getDscName(criteria.getDscId());
        
        List<TtInvoiceDomain> ttInvoiceAllList = new ArrayList<TtInvoiceDomain>();

        for (int i = 0; i < twInvList.size(); i++) {
            TwInvDomain twInvDomain = twInvList.get(i);
            String invoiceNo = normInvNoList.get(i);
            
            // Get Invoice work.
            TwInvoiceDomain twInvoiceDomain = searchTwInvoiceDomainOnRegisterForCreate(criteria.getDscId()
                , invoiceNo, criteria.getShipperCd(), true);
            // other table data.
            List<? extends W6001DocInvoiceDomain> docInvoiceList = searchTwInvOnRegisterForTtInvoiceCreate(criteria.getDscId()
                , criteria.getShipperCd(), invoiceNo, twInvDomain.getCmlTyp(), twInvDomain.getGrpNo2(), criteria.getLanguageCd());
            
            // Register the Invoice.
            // インボイス
            TtInvoiceDomain ttInvoiceDomain = createTtInvoiceOnRegister(twInvoiceDomain, criteria.getDscId(), dscNm, twInvDomain.getGrpNo2(), invIssueDt, mnInvIssueDt);
            if (GRP_NO2_MAIN.equals(twInvDomain.getGrpNo2()) && CML_TYPE_CIGMA.equals(twInvDomain.getCmlTyp())) {
                ttInvoiceAllList.add(ttInvoiceDomain);
            }

            // Register the Invoice head.
            // インボイスヘッダ
            TtInvoiceHeaderDomain ttInvoiceHeaderDomain = createTtInvoiceHeaderOnRegister(twInvoiceDomain
                , criteria.getDscId(), dscNm, twInvDomain.getGrpNo2(), invIssueDt);

            // Register the Packing Header. 
            // パッキングヘッダ
            createTtPackingHeadOnRegister(twInvoiceDomain, twInvDomain.getGrpNo2(), invIssueDt);

            // Register the contents of the work table in Invoice Attached. 
            // インボイスアタッチ
            List<? extends TtInvoiceAttachedDomain> ttInvliceAttachedList 
                = createTtInvoiceAttachedOnRegister(twInvoiceDomain, twInvDomain.getGrpNo2(), invIssueDt);
            
            if (GRP_NO2_MAIN.equals(twInvDomain.getGrpNo2())) {
                // Register the contents of the work table attached to the packing (CML). 
                // パッキングアタッチ(CML)
                createTtPackingAttachedCmlOnRegister(twInvoiceDomain, docInvoiceList, twInvDomain.getGrpNo2(), invIssueDt);
                // Register the contents of the work table attached to the packing (number). 
                // パッキングアタッチ(品番)
                createTtPackAtchItemNoOnRegister(twInvoiceDomain, docInvoiceList, twInvDomain.getGrpNo2(), invIssueDt);
            }
            
            if (FLAG_Y.equals(twInvDomain.getSalesContractFlg())) {
                // Register the contents of the work table in the Sales Contract Header. 
                // セールスコントラクトヘッダ
                createTtScHeaderOnRegister(ttInvoiceHeaderDomain);
                
                // Register the contents of the work table in the Sales Contract Attached. 
                // セールスコントラクトアタッチ
                // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
                if (ttInvliceAttachedList.size() != 0){
                // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
                    createTtScAttachedOnRegister(ttInvliceAttachedList);
                // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
                }
                // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
            }
            
            // Create PDF Document
            // PDFファイルの作成
            createPdfFileOnRegister(ttInvoiceDomain.getShipperCd(), ttInvoiceDomain.getInvoiceNo()
                , ttInvoiceDomain.getInvoiceIssueDt(), ttInvoiceDomain.getInvTplNo(), criteria.getDscId()
                , ttInvoiceDomain.getCmlTyp(), ttInvoiceDomain.getInvoiceCtgry(), ttInvoiceDomain.getInvoiceClass()
                , criteria.getReportDateFormat(), criteria.getCharCd(), FLAG_Y.equals(twInvDomain.getSalesContractFlg()));
            
            if (FLAG_Y.equals(twInvDomain.getReInvoiceFlg())) {
                // Get Invoice Work table data to be registered. 
                // 登録データ取得(リインボイス)
                TwInvoiceDomain twInvoiceReInvDomain 
                    = searchTwInvoiceDomainOnRegisterForCreate(criteria.getDscId(), normInvNoList.get(i), criteria.getShipperCd(), false);
                // Register the contents of the work table in Invoice. 
                // インボイス
                createTtInvoiceOnRegister(twInvoiceReInvDomain, criteria.getDscId(), dscNm, twInvDomain.getGrpNo2(), invIssueDt, mnInvIssueDt);
                // Register the contents of the work table in Invoice Header. 
                // インボイスヘッダ
                createTtInvoiceHeaderOnRegister(twInvoiceReInvDomain, criteria.getDscId(), dscNm, twInvDomain.getGrpNo2(), invIssueDt);
            }
        }
        return ttInvoiceAllList;
    }
    
    /**
     * Get the user name.
     * <br />ユーザー名を取得します。
     * <pre>
     * - User Group Master Search
     *   Set the following items TmUserCriteriaDomain
     *   Call TmUserService.searchByKey(TmUserCriteriaDomain).
     *     - Login DSC-ID
     * </pre>
     * <pre>
     * ‐ユーザ集約原単位検索
     *     {@link TmUserCriteriaDomain}に以下の項目を設定し
     *     {@link TmUserService#searchByKey(TmUserCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @return Username<br />
     * ユーザ名
     * @throws ApplicationException Not able to obtain the user name<br />
     * ユーザ名の取得ができなかった場合
     */
    protected String getDscName(String dscId) throws ApplicationException {
        TmUserCriteriaDomain criteria = new TmUserCriteriaDomain();
        criteria.setDscId(dscId);
        
        return tmUserService.searchByKey(criteria).getUsrNmEn();
    }
    
    /**
     * Get Invoice Work table data to be registered.
     * <br />登録対象のインボイスワークテーブルデータを取得します。
     * <pre>
     * - Invoice Work Search TwInvoiceCriteriaDomain Set the following items,
     *   Call TwInvoiceService.SearchByCondition (TwInvoiceCriteriaDomain).
     *     - Login DSC-ID
     *     - Provisional Invoice No
     * </pre>
     * <pre>
     * ‐インボイスワーク検索
     *     {@link TwInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TwInvoiceService#searchByCondition(TwInvoiceCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     *       ‐仮インボイスNo
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param normInv What's more, can search and regular Invoice No case of rue, can search and if Re-Invoice of false<br />
     * trueの場合正規インボイスNoを検索、falseの場合リインボイスを検索
     * @return Invoice Work domain list obtained<br />
     * 取得したインボイスワークドメイン
     * @throws ApplicationException Acquisition of Invoice Work table can not be.<br />
     * インボイスワークテーブルの取得ができない場合。
     */
    protected TwInvoiceDomain searchTwInvoiceDomainOnRegisterForCreate (String dscId, String invoiceNo, String shipperCd, boolean normInv) 
        throws ApplicationException {

        TwInvoiceCriteriaDomain criteria = new TwInvoiceCriteriaDomain();
        criteria.setDscId(dscId);
        if (normInv) {
            criteria.setInvoiceNo(invoiceNo);
            criteria.setShipperCd(shipperCd);
        } else {
            criteria.setRelateInvoiceNo(invoiceNo);
            criteria.setRelateInvoiceShipperCd(shipperCd);
        }
        
        List<? extends TwInvoiceDomain> twInvoiceList = twInvoiceService.searchByCondition(criteria);
        if (twInvoiceList == null || twInvoiceList.isEmpty()) {
            throw new GscmApplicationException(NXS_E1_0010);
        }
        
        return twInvoiceList.get(0);
    }
    
    /**
     * 
     * Get Invoice Detail data for Register screen.
     * 
     * @param dscId DSC-ID
     * @param shipperCd Shipper code
     * @param invoiceNo Invoice No
     * @param cmlTyp CML TYP
     * @param grpNo2 Group no.sec
     * @param languageCd Language code
     * @return get Invoice Detail data
     * @throws ApplicationException ApplicationException
     */
    protected List<? extends W6001DocInvoiceDomain> searchTwInvOnRegisterForTtInvoiceCreate(String dscId
        , String shipperCd, String invoiceNo, String cmlTyp, String grpNo2, String languageCd) 
        throws ApplicationException {
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setCmlTyp(cmlTyp);
        criteria.setGrpNo2(grpNo2);
        criteria.setLanguageCd(languageCd);
        
        // ST959 UNIT CONVERSION MOD START
        //return this.searchOnRegisterInitByFromDetail(criteria);
        return this.searchOnRegisterByFromDetail(criteria);
        // ST959 UNIT CONVERSION MOD END
    }
    
    /**
     * Get Invoide Palletize Work.
     * <br />インボイス作成対象パレタイズワークを取得します。
     * <pre>
     * - Invoide Palletize Work Search TwInvPltzCriteriaDomain Set the following items,
     *   Call TwInvPltzService.SearchByCondition (TwInvPltzCriteriaDomain).
     *     - Login DSC-ID
     *     - SHIPPER CODE
     *     - Group No.first
     *     - REMOVEFLG: N
     * </pre>
     * <pre>
     * ‐インボイス作成対象パレタイズワーク検索
     *     {@link TwInvPltzCriteriaDomain}に以下の項目を設定し、
     *     {@link TwInvPltzService#searchByCondition(TwInvPltzCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     *       ‐荷主コード
     *       ‐Group No.first
     *       ‐REMOVEFLG：N
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param grpNo1 Group No.first
     * @return Invoide Palletize Work list obtained<br />
     * 取得したインボイス作成対象パレタイズワークリスト
     * @throws ApplicationException Can not get the Invoide Palletize Work<br />
     * インボイス作成対象パレタイズワークの取得ができない場合
     */
    protected List<? extends TwInvPltzDomain> searchTwInvPltzOnRegister(String dscId, String shipperCd, String grpNo1) 
        throws ApplicationException {
        
        TwInvPltzCriteriaDomain twInvPltzCriteria = new TwInvPltzCriteriaDomain();
        twInvPltzCriteria.setDscId(dscId);
        twInvPltzCriteria.setShipperCd(shipperCd);
        twInvPltzCriteria.setGrpNo1(grpNo1);
        twInvPltzCriteria.setRemoveFlg(FLAG_N);
        twInvPltzCriteria.setPreferredOrder("MAIN_MARK");

        return  twInvPltzService.searchByCondition(twInvPltzCriteria);
    }
    
    /**
     * Register the contents of the work table in Invoice.
     * <br />インボイスにワークテーブルの内容を登録します。
     * <pre>
     * - Invoice registration
     *   Set the registration data to TtInvoiceDomain,
     *   Call TtInvoiceService.create(List).
     * </pre>
     * <pre>
     * ‐インボイス登録
     *     {@link TtInvoiceDomain}に登録データを設定し、
     *     {@link TtInvoiceService#create(List)}を呼出します。
     * </pre>
     * 
     * @param twInvoiceDomain Invoice work domain
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param dscNm Login Name<br />
     * ログイン者名
     * @param grpNo2 Group No.sec
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param mnInvoiceIssueDt MANUAL INVOICE ISSUE DATE<br />
     * マニュアルインボイス発行日
     * @return INVOICE ISSUE DATE<br />
     * インボイス登録データ
     * @throws ApplicationException Registration to the paddle such Invoice is possible<br />
     * インボイスへの登録ができない場合
     */
    protected TtInvoiceDomain createTtInvoiceOnRegister (TwInvoiceDomain twInvoiceDomain
        , String dscId , String dscNm, String grpNo2, Date invoiceIssueDt, Date mnInvoiceIssueDt) 
        throws ApplicationException {

        TtInvoiceDomain domain = new TtInvoiceDomain();
        CommonUtil.copyPropertiesDomainToDomain(domain, twInvoiceDomain);
        
        domain.setInvoiceIssueDt(invoiceIssueDt);
        domain.setManualInvoiceIssueDt(mnInvoiceIssueDt);
        domain.setParInvoiceIssueDt(invoiceIssueDt);
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        // Only to set the re-invoice issue date if re-invoice No. is numbered.
        // リインボイスNo.が採番されている場合のみリインボイス発行日を設定する。
        domain.setRelateInvoiceIssueDt(null);
        if (StringUtils.isNotEmpty(domain.getRelateInvoiceNo())) {
            domain.setRelateInvoiceIssueDt(invoiceIssueDt);
        }
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
        
        domain.setInvoiceIssuerId(dscId);
        domain.setInvoiceIssuerNm(dscNm);
        
        domain.setCancelFlg(FLAG_N);
        domain.setDeleteFlg(FLAG_N);
        //  Check the grpNo2 as a FRT item.
        // FRT品の場合
        if (!GRP_NO2_MAIN.equals(grpNo2)) {
            domain.setShipperCd(twInvoiceDomain.getFrtShipperCd());
            domain.setConsigneeCd(twInvoiceDomain.getFrtConsigneeCd());
        }
        commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);
        
        ttInvoiceService.create(domain);
        return domain;
    }
    
    /**
     * Register the contents of the work table in Invoice Header.
     * <br />インボイスヘッダにワークテーブルの内容を登録します。
     * <pre>
     * - Invoice Header registration
     *   Set the registration data to TtInvoiceHeaderDomain,
     *   Call TtInvoiceHeaderService.create(List).
     * </pre>
     * <pre>
     * ‐インボイスヘッダ登録
     *     {@link TtInvoiceHeaderDomain}に登録データを設定し、
     *     {@link TtInvoiceHeaderService#create(List)}を呼出します。
     * </pre>
     * 
     * @param twInvoiceDomain Be registered Invoice Work domain list<br />
     * 登録対象インボイスワークドメインリスト
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param dscNm Login Name<br />
     * ログイン者名
     * @param grpNo2 Group No.sec
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return Registration data<br />
     * 登録データ
     * @throws ApplicationException Registration to the paddle such Invoice is possible<br />
     * インボイスへの登録ができなかい場合
     */
    protected TtInvoiceHeaderDomain createTtInvoiceHeaderOnRegister (TwInvoiceDomain twInvoiceDomain
        , String dscId, String dscNm, String grpNo2, Date invoiceIssueDt) 
        throws ApplicationException {
        
        TtInvoiceHeaderDomain domain = new TtInvoiceHeaderDomain();
        CommonUtil.copyPropertiesDomainToDomain(domain, twInvoiceDomain);
        
        domain.setInvoiceIssueDt(invoiceIssueDt);
        domain.setCancelInvoiceIssueDt(null);
        
        domain.setTotalNetWeightUnit(twInvoiceDomain.getWeightUnit());
        domain.setTotalGrossWeightUnit(twInvoiceDomain.getWeightUnit());
        domain.setTotalVolumeUnit(twInvoiceDomain.getVolumeUnit());
        domain.setNetAmountCurrCd(twInvoiceDomain.getCurrCd());
        domain.setFreightCurrCd(twInvoiceDomain.getCurrCd());
        domain.setInsuranceCurrCd(twInvoiceDomain.getCurrCd());
        domain.setSubTotalCurrCd(twInvoiceDomain.getCurrCd());
        domain.setVatCurrCd(twInvoiceDomain.getCurrCd());
        domain.setHandlingChargeCurrCd(twInvoiceDomain.getCurrCd());
        domain.setAdditionalChargeCurrCd(twInvoiceDomain.getCurrCd());
        domain.setTotalInvoiceAmountCurrCd(twInvoiceDomain.getCurrCd());
        domain.setNoChargeCurrCd(twInvoiceDomain.getCurrCd());
        
        domain.setFileId(null);
        domain.setDeleteFlg(FLAG_N);
        //  Check the grpNo2 as a FRT item.
        // FRT品の場合
        if (!GRP_NO2_MAIN.equals(grpNo2)) {
            domain.setShipperCd(twInvoiceDomain.getFrtShipperCd());
            domain.setConsigneeCd(twInvoiceDomain.getFrtConsigneeCd());
        }
        commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);
        
        ttInvoiceHeaderService.create(domain);
        return domain;
    }
    
    /**
     * Register the contents of the work table in Invoice Attached.
     * <br />インボイスアタッチにワークテーブルの内容を登録します。
     * <pre>
     * - Invoice Attached registration
     *   Set the registration data to TtInvoiceAttachedDomain,
     *   Call TtInvoiceAttachedService.create(List).
     * </pre>
     * <pre>
     * ‐インボイスアタッチ登録
     *     {@link TtInvoiceAttachedDomain}に登録データを設定し、
     *     {@link TtInvoiceAttachedService#create(List)}を呼出します。
     * </pre>
     * 
     * @param twInvoiceDomain Be registered Invoice Work domain <br />
     * 登録対象インボイスワークドメイン
     * @param grpNo2 Group No.sec
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return Registration data<br />
     * 登録データ
     * @throws ApplicationException Registration to the paddle such Invoice is possible<br />
     * インボイスへの登録ができなかい場合
     */
    protected List<? extends TtInvoiceAttachedDomain> createTtInvoiceAttachedOnRegister (TwInvoiceDomain twInvoiceDomain
        , String grpNo2, Date invoiceIssueDt) 
        throws ApplicationException {
        
        List<TtInvoiceAttachedDomain> domainList = new ArrayList<TtInvoiceAttachedDomain>();
        BigDecimal recordNo = BigDecimal.ZERO;
        
        // Get Invoice Item No Work for Invoice Attached.
        W6001DocCriteriaDomain twInvItemCriteria = new W6001DocCriteriaDomain();
        twInvItemCriteria.setShipperCd(twInvoiceDomain.getShipperCd());
        twInvItemCriteria.setInvoiceNo(twInvoiceDomain.getInvoiceNo());
        twInvItemCriteria.setDscId(twInvoiceDomain.getDscId());
        List<? extends W6001DocPltzItemDomain> twInvItemList = w6001DocDao.searchTwInvItemByInvoiceAttached(twInvItemCriteria);
        
        //2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
        if (twInvItemList.size() != 0) {
        //2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
            for (W6001DocPltzItemDomain twInvItemDomain : twInvItemList) {
                TtInvoiceAttachedDomain domain = new TtInvoiceAttachedDomain();
                
                CommonUtil.copyPropertiesDomainToDomain(domain, twInvItemDomain);
                // SHIPPER_CD
                if (GRP_NO2_MAIN.equals(grpNo2)) {
                    domain.setShipperCd(twInvoiceDomain.getShipperCd());
                } else {
                    domain.setShipperCd(twInvoiceDomain.getFrtShipperCd());
                }
                domain.setInvoiceNo(twInvoiceDomain.getInvoiceNo());
                domain.setInvoiceIssueDt(invoiceIssueDt);
                domain.setRecordNo(recordNo);
                domain.setInvoiceClass(twInvoiceDomain.getInvoiceClass());
                domain.setCancelTyp(twInvoiceDomain.getCancelTyp());
                
                domain.setCustomerPoNo(twInvItemDomain.getCustomerPoNo());
                domain.setCustomerItemNo(twInvItemDomain.getCustomerItemNo());
                domain.setItemNo(twInvItemDomain.getItemNo());
                domain.setPkgCd(twInvItemDomain.getPkgCd());
                domain.setItemDescription(twInvItemDomain.getItemDescription());
                domain.setModelCd(twInvItemDomain.getModelCd());
                domain.setKitFlg(twInvItemDomain.getKitFlg());
                domain.setExpRequestNo(twInvItemDomain.getExpRequestNo());
                domain.setLineNo(StringUtil.parseBigDecimal(twInvItemDomain.getLineNo()));
                domain.setKitBrch(StringUtil.parseBigDecimal(twInvItemDomain.getKitBrch()));
                domain.setParFlg(twInvItemDomain.getParFlg());
                domain.setKitParItemNo(twInvItemDomain.getKitParItemNo());
                domain.setOriginCntryCd(twInvItemDomain.getOriginCntryCd());
                domain.setOriginCntryNm(getOriginCntryNm(twInvoiceDomain, twInvItemDomain));
                // 2014/11/18 DNJP.Kawamura UT136対応 START >>>>>
//                if (FLAG_OFF.equals(twInvoiceDomain.getFree1DispFlg())) {
//                    domain.setFree1Dtl(null);
//                }
//                if (FLAG_OFF.equals(twInvoiceDomain.getFree2DispFlg())) {
//                    domain.setFree2Dtl(null);
//                }
//                if (FLAG_OFF.equals(twInvoiceDomain.getFree3DispFlg())) {
//                    domain.setFree3Dtl(null);
//                }
//                if (FLAG_OFF.equals(twInvoiceDomain.getFree4DispFlg())) {
//                    domain.setHsCd(null);
//                } else {
//                    domain.setHsCd(HS_CODE);
//                }
                if (FLAG_N.equals(twInvoiceDomain.getFree1DispFlg())) {
                    domain.setFree1Dtl(null);
                }
                if (FLAG_N.equals(twInvoiceDomain.getFree2DispFlg())) {
                    domain.setFree2Dtl(null);
                }
                if (FLAG_N.equals(twInvoiceDomain.getFree3DispFlg())) {
                    domain.setFree3Dtl(null);
                }
                if (FLAG_N.equals(twInvoiceDomain.getFree4DispFlg())) {
                    domain.setHsCd(null);
                } else {
                    domain.setHsCd(twInvItemDomain.getHsCd());
                }
                // 2014/11/18 DNJP.Kawamura UT136対応 END <<<<<
                domain.setUnitPrice(twInvItemDomain.getUnitPrice());
                domain.setUnitPriceCurrCd(twInvItemDomain.getCurrCd());
                domain.setQty(twInvItemDomain.getSumQty());
                domain.setQtyUnit(twInvItemDomain.getQtyUnit());
                domain.setAmount(twInvItemDomain.getUnitPrice().multiply(twInvItemDomain.getSumQty()));
                domain.setAmountCurrCd(twInvItemDomain.getCurrCd());
                domain.setNetWeight(twInvItemDomain.getItemWeight());
                domain.setNetWeightUnit(twInvItemDomain.getWeightUnit());
                // Overflow Check
                // ST959 UNIT CONVERSION MOD START
                //BigDecimal totalNetWeight = twInvItemDomain.getItemWeight().multiply(twInvItemDomain.getSumQty());
                BigDecimal totalNetWeight = twInvItemDomain.getSumNetWeight();
                // ST959 UNIT CONVERSION MOD END
                if (commonService.isWeightOverflow(totalNetWeight)) {
                    Object[] params = { commonService.getResource(twInvItemDomain.getLocale(), "label.totalNetWeight") };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
                domain.setTotalNetWeight(totalNetWeight);
                domain.setTotalNetWeightUnit(twInvItemDomain.getWeightUnit());
                // UT287 ADD START
                domain.setLengthUnit(twInvItemDomain.getLengthUnit());
                domain.setLength(twInvItemDomain.getLength());
                domain.setWidth(twInvItemDomain.getWidth());
                domain.setHeight(twInvItemDomain.getHeight());
                // UT287 ADD END
                domain.setDeleteFlg(FLAG_N);
                commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);
                
                domainList.add(domain);
                recordNo = recordNo.add(BigDecimal.ONE);
            }
            
            // インボイスアタッチ登録
            if (!domainList.isEmpty()) {
                ttInvoiceAttachedService.create(domainList);
            }
        //2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
        }
        //2015/3/11 DNJP.Kawamura UT202対応 END <<<<<

        return domainList;
    }
    
    /**
     * Get the ORIGIN COUNTRY NAME.
     * <br />原産国名を取得をします。
     * <pre>
     * [And-if present ORIGIN COUNTRY Display]
     *   - Get the ORIGIN COUNTRY NAME
     *     Set the following items TmCntryCriteriaDomain,
     *     Call TmCntryService.searchByKey(TmCntryCriteriaDomain).
     *       - COUNTRY CODE: ORIGIN COUNTRY CODE of Invoice Number created for work
     * </pre>
     * <pre>
     * [原産国表示する場合]
     *   ‐原産国名を取得する
     *       {@link TmCntryCriteriaDomain}に以下の項目を設定し、
     *       {@link TmCntryService#searchByKey(TmCntryCriteriaDomain)}を呼び出します。
     *         ‐国コード：インボイス作成対象品番ワークの原産国コード
     * </pre>
     * 
     * @param twInvoiceDomain Invoice Work<br />
     * インボイスワーク
     * @param twInvItemDomain Invoice created for product version Work<br />
     * インボイス作成対象品版ワーク
     * @return ORIGIN COUNTRY NAME, Display the ORIGIN COUNTRY ,NuLL other<br />
     * 原産国表示をする場合原産国名、それ以外null
     * @throws ApplicationException Can not get the ORIGIN COUNTRY NAME<br />
     * 原産国名を取得できない場合
     */
    protected String getOriginCntryNm(TwInvoiceDomain twInvoiceDomain, W6001DocPltzItemDomain twInvItemDomain)
        throws ApplicationException {
        // Set FREE_._DISP_FLG of the invoice work data.
        // インボイスワークのFREE_._DISP_FLG
        // 2014/11/18 DNJP.Kawamura UT136対応 START >>>>>
//        boolean free1DispFlg = FLAG_ON.equals(twInvoiceDomain.getFree1DispFlg());
//        boolean free2DispFlg = FLAG_ON.equals(twInvoiceDomain.getFree2DispFlg());
//        boolean free3DispFlg = FLAG_ON.equals(twInvoiceDomain.getFree3DispFlg());
        boolean free1DispFlg = FLAG_Y.equals(twInvoiceDomain.getFree1DispFlg());
        boolean free2DispFlg = FLAG_Y.equals(twInvoiceDomain.getFree2DispFlg());
        boolean free3DispFlg = FLAG_Y.equals(twInvoiceDomain.getFree3DispFlg());
        // 2014/11/18 DNJP.Kawamura UT136対応 END <<<<<
        // Set FREE_._CNTRY_FLG of the item no work data.
        // インボイス作成対象品番ワーク
        boolean free1CntryFlg = FLAG_N.equals(twInvItemDomain.getFree1OriginCntryFlg());
        boolean free2CntryFlg = FLAG_N.equals(twInvItemDomain.getFree2OriginCntryFlg());
        boolean free3CntryFlg = FLAG_N.equals(twInvItemDomain.getFree3OriginCntryFlg());
        
        boolean dispOrginCntry = false;
        if (free1DispFlg && free2DispFlg && free3DispFlg && free1CntryFlg && free2CntryFlg && free3CntryFlg) {
            dispOrginCntry = true;
            
        } else if (free1DispFlg && free2DispFlg && !free3DispFlg && free1CntryFlg && free2CntryFlg) {
            dispOrginCntry = true;
            
        } else if (free1DispFlg && !free2DispFlg && free3DispFlg && free1CntryFlg && free3CntryFlg) {
            dispOrginCntry = true;
            
        } else if(free1DispFlg && !free2DispFlg && !free3DispFlg && free1CntryFlg ) {
            dispOrginCntry = true;
            
        } else if (!free1DispFlg && free2DispFlg && free3DispFlg && free2CntryFlg && free3CntryFlg) {
            dispOrginCntry = true;
            
        } else if (!free1DispFlg && free2DispFlg && !free3DispFlg && free2CntryFlg) {
            dispOrginCntry = true;
            
        } else if (!free1DispFlg && !free2DispFlg && free3DispFlg && free3CntryFlg) {
            dispOrginCntry = true;
            
        } else if (!free1DispFlg && !free2DispFlg && !free3DispFlg) {
            dispOrginCntry = true;         
        }
        
        if (dispOrginCntry) {
            TmCntryCriteriaDomain criteria = new TmCntryCriteriaDomain();
            criteria.setCntryCd(twInvItemDomain.getOriginCntryCd());

            TmCntryDomain domain = tmCntryService.searchByKey(criteria);
            return domain.getCntryNm();
        }
        return null;
    }
    
    /**
     * Register the contents of the work table in Packing Header.
     * <br />パッキングヘッダにワークテーブルの内容を登録します。
     * <pre>
     * - Packing attach (CML) registration
     *   Set the registration data to TtPackingHeadDomain,
     *   Call TtPackingHeadService.create(List).
     * </pre>
     * <pre>
     * ‐パッキングアタッチ(CML)登録
     *     {@link TtPackingHeadDomain}に登録データを設定し、
     *     {@link TtPackingHeadService#create(List)}を呼出します。
     * </pre>
     * 
     * @param twInvoiceDomain Be registered Invoice Work domain list<br />
     * 登録対象インボイスワークドメインリスト
     * @param grpNo2 Group No.sec
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @throws ApplicationException Registration to the paddle Packing Header is such can<br />
     * パッキングヘッダへの登録ができなかい場合
     */
    protected void createTtPackingHeadOnRegister(TwInvoiceDomain twInvoiceDomain, String grpNo2, Date invoiceIssueDt) 
        throws ApplicationException {
        
        TtPackingHeadDomain domain = new TtPackingHeadDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(domain, twInvoiceDomain);
        
        domain.setInvoiceIssueDt(invoiceIssueDt);
        
        domain.setCancelInvoiceIssueDt(null);
        domain.setFileId(null);
        domain.setDeleteFlg(FLAG_N);
        
        domain.setTotalNetWeightUnit(twInvoiceDomain.getWeightUnit());
        domain.setTotalGrossWeightUnit(twInvoiceDomain.getWeightUnit());
        domain.setTotalVolumeUnit(twInvoiceDomain.getVolumeUnit());
        //  Check the grpNo2 as a FRT item.
        // FRT品の場合
        if (!GRP_NO2_MAIN.equals(grpNo2)) {
            domain.setShipperCd(twInvoiceDomain.getFrtShipperCd());
            domain.setConsigneeCd(twInvoiceDomain.getFrtConsigneeCd());
        } 
        ttPackingHeadService.create(domain);
    }
    
    /**
     * Register the contents of the work table attached to the packing (CML).
     * <br />パッキングアタッチ(CML)にワークテーブルの内容を登録します。
     * <pre>
     * - Packing attach (CML) registration
     *  TtPackingAttachedCmlDomain Set the registration data to,
     *  Call TitiPackingAttachedCmlService.Create (List).
     * </pre>
     * <pre>
     * ‐パッキングアタッチ(CML)登録
     *     {@link TtPackingAttachedCmlDomain}に登録データを設定し、
     *     {@link TtPackingAttachedCmlService#create(List)}を呼出します。
     * </pre>
     * 
     * @param twInvoiceDomain Be registered Invoice Work domain<br />
     * 登録対象インボイスワークドメイン
     * @param twInvDomainList Invoide Palletize Work<br />
     * インボイス作成対象パレタイズワーク
     * @param grpNo2 Group No.sec
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @throws ApplicationException Registration packing attach to (CML) is such paddle can<br />
     * パッキングアタッチ(CML)への登録ができなかい場合
     */
    protected void createTtPackingAttachedCmlOnRegister (TwInvoiceDomain twInvoiceDomain
        , List<? extends W6001DocInvoiceDomain> twInvDomainList, String grpNo2, Date invoiceIssueDt) 
        throws ApplicationException {
        
        List<TtPackingAttachedCmlDomain> domainList = new ArrayList<TtPackingAttachedCmlDomain>();
        for (W6001DocInvoiceDomain twInvDomain : twInvDomainList) {
            for (W6001DocPltzDomain twInvPltzDomain : twInvDomain.getDocPltzList()) {
                TtPackingAttachedCmlDomain domain = new TtPackingAttachedCmlDomain();
                
                if (GRP_NO2_MAIN.equals(grpNo2)) {
                    domain.setShipperCd(twInvoiceDomain.getShipperCd());
                } else {
                    domain.setShipperCd(twInvoiceDomain.getFrtShipperCd());
                }
                domain.setInvoiceNo(twInvoiceDomain.getInvoiceNo());
                domain.setInvoiceIssueDt(invoiceIssueDt);
                domain.setMainMark(twInvPltzDomain.getMainMark());
                domain.setInvoiceClass(twInvoiceDomain.getInvoiceClass());
                domain.setCancelTyp(twInvoiceDomain.getCancelTyp());
                // 2015/3/31 DNJP.Kawamura UT206対応 START >>>>>
                domain.setReturnStyleCd(twInvPltzDomain.getReturnStyleCd());
                // 2015/3/31 DNJP.Kawamura UT206対応 END <<<<<
                domain.setNetWeight(twInvPltzDomain.getNetWeight());
                domain.setNetWeightUnit(twInvPltzDomain.getWeightUnit());
                domain.setGrossWeight(twInvPltzDomain.getGrossWeight());
                domain.setGrossWeightUnit(twInvPltzDomain.getWeightUnit());
                domain.setVolume(twInvPltzDomain.getVolume());
                domain.setVolumeUnit(twInvPltzDomain.getVolumeUnit());
                domain.setDeleteFlg(FLAG_N);
                commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);   
                
                domainList.add(domain);
            }
        }
        if (!domainList.isEmpty()) {
            ttPackingAttachedCmlService.create(domainList);
        }
    }
    
    /**
     * Register the contents of the work table attached to the packing (number).
     * <br />パッキングアタッチ(品番)にワークテーブルの内容を登録します。
     * <pre>
     * - Attach packing (number) registration
     *   TtPackAtchItemNoDomain Set the registration data to,
     *   Call TtPackAtchItemNoService.Create (List).
     * </pre>
     * <pre>
     * ‐パッキングアタッチ(品番)登録
     *     {@link TtPackAtchItemNoDomain}に登録データを設定し、
     *     {@link TtPackAtchItemNoService#create(List)}を呼出します。
     * </pre>
     * 
     * @param twInvoiceDomain Be registered Invoice Work domain<br />
     * 登録対象インボイスワークドメインリスト
     * @param twInvDomainList Invoice created for Part worklist<br />
     * インボイス作成対象品番ワークリスト
     * @param grpNo2 Group No.sec
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @throws ApplicationException Registration packing attach to (CML) is such paddle can<br />
     * パッキングアタッチ(CML)への登録ができなかい場合
     */
    protected void createTtPackAtchItemNoOnRegister (TwInvoiceDomain twInvoiceDomain
        , List<? extends W6001DocInvoiceDomain> twInvDomainList, String grpNo2, Date invoiceIssueDt) 
        throws ApplicationException {
    
        List<TtPackAtchItemNoDomain> domainList = new ArrayList<TtPackAtchItemNoDomain>();
        
        String oldShipperCd = StringUtils.EMPTY;
        String oldInvoiceNo = StringUtils.EMPTY;
        String oldMainMark = StringUtils.EMPTY;
        
        BigDecimal recordNo = BigDecimal.ZERO;
        for (W6001DocInvoiceDomain twInvDomain : twInvDomainList) {
            for (W6001DocPltzDomain twInvPltzDomain : twInvDomain.getDocPltzList()) {
                // Get Invoice Item No Work for Packing Attached Item No
                W6001DocCriteriaDomain twInvItemCriteria = new W6001DocCriteriaDomain();
                twInvItemCriteria.setDscId(twInvoiceDomain.getDscId());
                twInvItemCriteria.setShipperCd(twInvoiceDomain.getShipperCd());
                twInvItemCriteria.setInvoiceNo(twInvoiceDomain.getInvoiceNo());
                twInvItemCriteria.setMainMark(twInvPltzDomain.getMainMark());
                List<? extends W6001DocPltzItemDomain> twInvItemList = w6001DocDao.searchTwInvItemByPackingAttachedItem(twInvItemCriteria);
                
                for (W6001DocPltzItemDomain twInvItemDomain : twInvItemList) {
                    TtPackAtchItemNoDomain domain = new TtPackAtchItemNoDomain();
                    // SHIPPER_CD
                    if (GRP_NO2_MAIN.equals(grpNo2)) {
                        domain.setShipperCd(twInvoiceDomain.getShipperCd());
                    } else {
                        domain.setShipperCd(twInvoiceDomain.getFrtShipperCd());
                    }
                    domain.setInvoiceNo(twInvoiceDomain.getInvoiceNo());
                    domain.setInvoiceIssueDt(invoiceIssueDt);
                    domain.setMainMark(twInvPltzDomain.getMainMark());
                    // RECORD_NO
                    if (!(oldShipperCd.equals(domain.getShipperCd())
                        && oldMainMark.equals(domain.getMainMark())
                        && oldInvoiceNo.equals(domain.getInvoiceNo()))) {
                        
                        recordNo = BigDecimal.ZERO;
                        
                        oldShipperCd = domain.getShipperCd();
                        oldMainMark = domain.getMainMark();
                        oldInvoiceNo = domain.getInvoiceNo();
                    }
                    domain.setRecordNo(recordNo);
                    domain.setInvoiceClass(twInvoiceDomain.getInvoiceClass());
                    domain.setCancelTyp(twInvoiceDomain.getCancelTyp());
        
                    domain.setCustomerPoNo(twInvItemDomain.getCustomerPoNo());
                    domain.setCustomerItemNo(twInvItemDomain.getCustomerItemNo());
                    domain.setItemNo(twInvItemDomain.getItemNo());
                    domain.setPkgCd(twInvItemDomain.getPkgCd());
                    domain.setItemDescription(twInvItemDomain.getItemDescription());
                    domain.setModelCd(twInvItemDomain.getModelCd());
                    domain.setKitFlg(twInvItemDomain.getKitFlg());
                    domain.setExpRequestNo(twInvItemDomain.getExpRequestNo());
                    domain.setLineNo(StringUtil.parseBigDecimal(twInvItemDomain.getLineNo()));
                    domain.setKitBrch(StringUtil.parseBigDecimal(twInvItemDomain.getKitBrch()));
                    domain.setParFlg(twInvItemDomain.getParFlg());
                    domain.setKitParItemNo(twInvItemDomain.getKitParItemNo());
                    domain.setQty(twInvItemDomain.getSumQty());
                    domain.setQtyUnit(twInvItemDomain.getQtyUnit());
                    domain.setNetWeight(twInvItemDomain.getItemWeight());
                    domain.setNetWeightUnit(twInvItemDomain.getWeightUnit());
                    // Overflow Check
                    // ST959 UNIT CONVERSION MOD START
                    //BigDecimal totalNetWeight = twInvItemDomain.getItemWeight().multiply(twInvItemDomain.getSumQty());
                    BigDecimal totalNetWeight = twInvItemDomain.getSumNetWeight();
                    // ST959 UNIT CONVERSION MOD END
                    if (commonService.isWeightOverflow(totalNetWeight)) {
                        Object[] params = { commonService.getResource(twInvItemDomain.getLocale(), "label.totalNetWeight") };
                        throw new GscmApplicationException(NXS_E7_0157, params);
                    }
                    domain.setTotalNetWeight(totalNetWeight);
                    domain.setTotalNetWeightUnit(twInvItemDomain.getWeightUnit());
                    domain.setDeleteFlg(FLAG_N);
                    commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);
                    
                    domainList.add(domain);
                    recordNo = recordNo.add(BigDecimal.ONE);
                }
            }
        }
        if (!domainList.isEmpty()) {
            ttPackAtchItemNoService.create(domainList);
        }
    }
    
    /**
     * Register the contents of the work table in the Sales Contract Header.
     * <br />セールスコントラクトヘッダにワークテーブルの内容を登録します。
     * <pre>
     * - Sales Contract Header registration
     *   TtScHeaderDomain set the registration data to,
     *   Call TtScHeaderService.Create (List).
     * </pre>
     * <pre>
     * ‐セールスコントラクトヘッダ登録
     *     {@link TtScHeaderDomain}に登録データを設定し、
     *     {@link TtScHeaderService#create(List)}を呼出します。
     * </pre>
     * 
     * @param ttInvoiceHeaderDomain domain that registered Invoice header<br />
     * インボイスヘッダで登録したデータ
     * @throws ApplicationException Registration of the Sales Contract Header can not be<br />
     * セールスコントラクトヘッダの登録ができない場合
     */
    protected void createTtScHeaderOnRegister (TtInvoiceHeaderDomain ttInvoiceHeaderDomain) 
        throws ApplicationException {
        
        TtScHeaderDomain domain = new TtScHeaderDomain();
        CommonUtil.copyPropertiesDomainToDomain(domain, ttInvoiceHeaderDomain);
        commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);
        
        ttScHeaderService.create(domain);
    }
    
    /**
     * Register the contents of the work table in the Sales Contract Attached.
     * <br />セールスコントラクトアタッチにワークテーブルの内容を登録します。
     * <pre>
     * - Sales Contract Attached registration
     *   TtScAttachedDomain set the registration data to,
     *   Call TtScAttachedService.Create (List).
     * </pre>
     * <pre>
     * ‐セールスコントラクトアタッチ登録
     *     {@link TtScAttachedDomain}に登録データを設定し、
     *     {@link TtScAttachedService#create(List)}を呼出します。
     * </pre>
     * 
     * @param ttInvoiceAttachedList List of data that was registered in the Invoice Attached<br />
     * インボイスアタッチで登録したデータのリスト
     * @throws ApplicationException Registration of the Sales Contract Attached is unable to<br />
     * セールスコントラクトアタッチの登録ができない場合
     */
    protected void createTtScAttachedOnRegister (List<? extends TtInvoiceAttachedDomain> ttInvoiceAttachedList) 
        throws ApplicationException {
        
        List<TtScAttachedDomain> domainList = new ArrayList<TtScAttachedDomain>();
        
        for (TtInvoiceAttachedDomain ttInvoiceAttachedDomain : ttInvoiceAttachedList) {
            TtScAttachedDomain domain = new TtScAttachedDomain();
            CommonUtil.copyPropertiesDomainToDomain(domain, ttInvoiceAttachedDomain);
            commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);
            domainList.add(domain);
        }
        if (!domainList.isEmpty()) {
            ttScAttachedService.create(domainList);
        }
    }
    
    /**
     * Create a document PDF, can register on the File Manage.
     * <br />帳票PDFを作成し、ファイル管理に登録します。
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param invTplNo Invoice Template No<br />
     * インボイステンプレートNo
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param cmlTyp CML TYPE<br />
     * ケースマーク区分
     * @param invCtgry Invoice category<br />
     * インボイスカテゴリ
     * @param invClass Invoice Class
     * @param dateFormat Document for date format<br />
     * 帳票用日付フォーマット
     * @param charCd CHAR CODE<br />
     * 文字コード
     * @param reportSc Create a form Sales Contract Header when TRUE, then the Sales Contract Attached<br />
     * TRUEの時セールスコントラクトヘッダ、セールスコントラクトアタッチの帳票を作成する
     * @throws ApplicationException Creation of a form PDF, registration can not be<br />
     * 帳票PDFの作成、登録ができない場合
     */
    protected void createPdfFileOnRegister(String shipperCd, String invoiceNo, Date invoiceIssueDt, String invTplNo
        , String dscId, String cmlTyp, String invCtgry, String invClass, String dateFormat, String charCd, boolean reportSc) 
        throws ApplicationException {
        // Set initial data to PDF creation flag.
        // PDF作成有無
        boolean l600301 = false;
        boolean l600302 = false;
        boolean l600303 = false;
        boolean l600304 = false;
        boolean l600305 = false;
        boolean l600306 = false;
        boolean l600307 = false;
        boolean l600308 = false;
        boolean l600309 = false;
        boolean l600310 = false;
        boolean l600311 = false;
        boolean l600312 = false;
        boolean l600313 = false;
        boolean l600314 = false;
        boolean l600315 = false;
        boolean l600316 = false; // NL023 ADD
        
        if (CML_TYPE_CIGMA.equals(cmlTyp)) {
            // product
            // 製部品
            if (!INVOICE_CLASS_FULL_RT.equals(invClass)) {
                // except FRT
                // FRT以外
                if (INVOICE_CTGRY_C.equals(invCtgry)) {
                    // charged
                    // 有償
                    l600301 = true;
                    l600304 = true;
                    l600306 = true;
                    l600308 = true;
                    l600311 = true;
                    l600314 = true;
                    l600316 = true; // NL023 ADD
                }
            } else {
                // FRT
                l600303 = true;
                l600305 = true;
                l600307 = true;
                l600309 = true;
                l600313 = true;
                l600315 = true;
            }
            
        } else if (CML_TYPE_ERT.equals(cmlTyp)) {
            // ERT
            if (INVOICE_CTGRY_N.equals(invCtgry)) {
                // free
                // 無償
                l600302 = true;
                l600305 = true;
                l600306 = true;
                l600310 = true;
                l600312 = true;
                l600315 = true;
            }
            
        } else if (CML_TYPE_MISCELLANEOUS.equals(cmlTyp)) {
            // miscellaneous goods
            // 非製部品
            if (!INVOICE_CLASS_FULL_RT.equals(invClass)) {
                // except FRT
                // FRT以外
                if (INVOICE_CTGRY_C.equals(invCtgry) || INVOICE_CTGRY_I.equals(invCtgry)) {
                    // charged
                    // 有償, Intangible
                    l600301 = true;
                    l600304 = true;
                    l600306 = true;
                    l600308 = true;
                    l600311 = true;
                    l600314 = true;
                } else if (INVOICE_CTGRY_N.equals(invCtgry)) {
                    // free
                    // 無償
                    l600302 = true;
                    l600304 = true;
                    l600306 = true;
                    l600308 = true;
                    l600312 = true;
                    l600314 = true;
                }
            } else {
                // FRT
                l600303 = true;
                l600305 = true;
                l600307 = true;
                l600309 = true;
                l600313 = true;
                l600315 = true;
            }
        }
        if (!reportSc) {
            l600311 = false;
            l600312 = false;
            l600313 = false;
            l600314 = false;
            l600315 = false;
        }
        // Set invoice header file data.
        // インボイスヘッダファイル
        File invoiceHeadFile = null;
        if (l600301) {
            invoiceHeadFile = l6001ReportService.searchInvHdrForCmrclIntang(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        } else if (l600302) {
            invoiceHeadFile = l6002ReportService.searchInvHdrForNonCmrcl(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        } else if (l600303) {
            invoiceHeadFile = l6003ReportService.searchIvnHdrForFrt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        }
        // Set invoice attache file data.
        // インボイスアタッチ
        File invoiceAttachFile = null;
        if (l600304) {
            invoiceAttachFile = l6004ReportService.searchInvAtchedForMain(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, charCd);
        } else if (l600305) {
            invoiceAttachFile = l6005ReportService.searchInvAtchedForRt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, charCd);
        }

        // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
//        if (invoiceHeadFile != null && invoiceAttachFile != null) {
//            // InvoiceHeader + Invoice Attach
//            File file = meargeReport(invoiceHeadFile, invoiceAttachFile);
        if (invoiceHeadFile != null) {
            File file = null;
            if (invoiceAttachFile != null) {
                // InvoiceHeader + Invoice Attach
                file = meargeReport(invoiceHeadFile, invoiceAttachFile);
            } else {
                file = invoiceHeadFile;
            }
        // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
            // Register with the File Manage. 
            // ファイル管理に登録
            String fileName = makeDocumentationFileNameOnAuto(shipperCd, invoiceNo, invoiceIssueDt, "INV", "pdf"); // UT186 ZIP DOWNLOAD ADD
            String fileId = createFileUpload(file, fileName, dscId);
            // Update the FILE ID of Invoice Header. 
            // インボイスヘッダに登録
            updateTtInvoiceHeaderByFileId(fileId, shipperCd, invoiceNo, invoiceIssueDt, SCREEN_ID_W6009);
        }
        
        // Set packing header file data.
        // パッキングヘッダ
        File packHeadFile = null;
        if (l600306) {
            packHeadFile = l6006ReportService.searchPackHdrForMain(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat);
        } else if (l600307) {
            packHeadFile = l6007ReportService.searchPackHdrForFrt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat);
        }
        // Set packing attach file data.
        // パッキングアタッチ
        File packAttachFile = null;
        if (l600308) {
            packAttachFile = l6008ReportService.searchPackAtchedForMain(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        } else if (l600309) {
            packAttachFile = l6009ReportService.searchPackAtchedForFrt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo);
        } else if (l600310) {
            packAttachFile = l6010ReportService.searchPackAtchedForErt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat);
        }
        // NL023 ADD START
        // Set packing summary file data.
        // パッキングサマリ
        File packSummaryFile = null;
        if (l600316) {
            // Add the Packing Summary Attach Flag to the Judgment on necessity./Packing Summary Attach Flagを要否判断に加える。
            // Serch TT_INVOICE to get Ship to Code.
            TtInvoiceCriteriaDomain criteriaTtInvoiceServiceSearchByKeyDomain = new TtInvoiceCriteriaDomain();
            criteriaTtInvoiceServiceSearchByKeyDomain.setShipperCd(shipperCd);
            criteriaTtInvoiceServiceSearchByKeyDomain.setInvoiceNo(invoiceNo);
            criteriaTtInvoiceServiceSearchByKeyDomain.setInvoiceIssueDt(invoiceIssueDt);
            TtInvoiceDomain resultTtInvoiceServiceSearchByKeyDomain = ttInvoiceService.searchByKey(criteriaTtInvoiceServiceSearchByKeyDomain);
            // Serch TM_EXP_SHIP_TO_SHIPPING.
            W6001DocCriteriaDomain criteriaSerchPackingSummaryAtchFlgDomain = new W6001DocCriteriaDomain();
            criteriaSerchPackingSummaryAtchFlgDomain.setShipperCd(resultTtInvoiceServiceSearchByKeyDomain.getShipperCd());
            criteriaSerchPackingSummaryAtchFlgDomain.setShipToCd(resultTtInvoiceServiceSearchByKeyDomain.getShipToCd());
            Date localDate = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd)), Calendar.DAY_OF_MONTH);
            criteriaSerchPackingSummaryAtchFlgDomain.setAplyStrtDt(localDate);
            String packingSummaryAtchFlg = w6001DocDao.serchPackingSummaryAtchFlg(criteriaSerchPackingSummaryAtchFlgDomain);
            if (packingSummaryAtchFlg == null) {
                Object[] params = {
                    "Export Ship To Shipping Master",
                    resultTtInvoiceServiceSearchByKeyDomain.getShipperCd() + "," + resultTtInvoiceServiceSearchByKeyDomain.getShipToCd()
                };
                throw new GscmApplicationException(NXS_E1_0031, params);
            }
            if (FLAG_Y.equals(packingSummaryAtchFlg)) {
                packSummaryFile = l6016ReportService.searchPackingSummary(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat);
            }
        }
        // NL023 ADD END

        if (packHeadFile != null && packAttachFile != null) {
            // NL023 MOD START
            // Packing Summary File + Packing Header File + Packing Attach file
            //File file = meargeReport(packHeadFile, packAttachFile);
            File mergedFile = commonService.mergePdf(packHeadFile.getName(), packSummaryFile, packHeadFile, packAttachFile);
            // NL023 MOD END
            // Register with the File Manage. 
            // ファイル管理に登録
            String fileName = makeDocumentationFileNameOnAuto(shipperCd, invoiceNo, invoiceIssueDt, "PL", "pdf"); // UT186 ZIP DOWNLOAD ADD
            String fileId = createFileUpload(mergedFile, fileName, dscId);
            // Update the FILE ID of Packing Header. 
            // パッキングヘッダに登録
            updateTtPackingHeadByFileId(fileId, shipperCd, invoiceNo, invoiceIssueDt, SCREEN_ID_W6009);
        }
        
        // Set sales contract header file data.
        // セールスコントラクトヘッダ
        File scHeadFile = null;
        if (l600311) {
            scHeadFile = l6011ReportService.searchSalesCntrctHdrForCmrclIntang(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        } else if (l600312) {
            scHeadFile = l6012ReportService.searchSalesCntrctHdrForNonCmrcl(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        } else if (l600313) {
            scHeadFile = l6013ReportService.searchSalesCntrctHdrForFrt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        }
        // Set sales contract attach file data.
        // セールスコントラクトアタッチ
        File scAttachFile = null;
        if (l600314) {
            scAttachFile = l6014ReportService.searchSalesCntrctAtchedForMain(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, charCd, dateFormat);
        } else if (l600315) {
            scAttachFile = l6015ReportService.searchSalesCntrctAtchedForRt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, charCd, dateFormat);
        }

        // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
//        if (scHeadFile != null && scAttachFile != null) {
//            // SC Header File + SC Attach file
//            File file = meargeReport(scHeadFile, scAttachFile);
        if (scHeadFile != null) {
            File file = null;
            if (scAttachFile != null) {
                // SC Header File + SC Attach file
                file = meargeReport(scHeadFile, scAttachFile);
            } else {
                file = scHeadFile;
            }
        // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
            // Register with the File Manage. 
            // ファイル管理に登録
            String fileName = makeDocumentationFileNameOnAuto(shipperCd, invoiceNo, invoiceIssueDt, "SC", "pdf"); // UT186 ZIP DOWNLOAD ADD
            String fileId = createFileUpload(file, fileName, dscId);
            // Update the FILE ID of the sales contract. 
            // セールスコントラクトヘッダに登録
            updateTtScHeaderByFileId(fileId, shipperCd, invoiceNo, invoiceIssueDt, SCREEN_ID_W6009);
        }
    }
    
    // UT186 ZIP DOWNLOAD ADD
    /**
     * Decide the form name to be registered in the file manager automatically create invoices<br />
     * 自動作成インボイスのファイルマネージャーに登録する帳票名を決めます。
     * 
     * at the time of zip download it will zip in the entry under this name.
     * zipダウンロード時にはこの名前でzip内エントリされることになります。
     *
     * @param shipperCd invoice shipper
     * @param invoiceNo invoice No.
     * @param invoiceIssueDt invoice issue date
     * @param prefix file name prefix
     * @param extension extension
     * @return file name
     */
    protected String makeDocumentationFileNameOnAuto(String shipperCd, String invoiceNo, Date invoiceIssueDt, String prefix, String extension) {
        String result =
            String.format(
                "%s_%s_%s_%s." + extension,
                prefix,
                shipperCd,
                invoiceNo,
                new SimpleDateFormat("yyyyMMddHHmmss").format(invoiceIssueDt)
            )
        ;
        return result;
    }
    
    /**
     * Mearge Header file and Attach file.
     *
     * @param headerFile Header Report File
     * @param attachFile Attach Report File
     * @return Mearge file
     */
    protected File meargeReport(File headerFile, File attachFile) {
        // UT304 MULTI LABEL MOD START
        //File file;
        //InputStream headStream = null;
        //InputStream attachStream = null;
        //try {
        //    headStream = new FileInputStream(headerFile);
        //    attachStream = new FileInputStream(attachFile);
        //    file = commonService.mergePdf(headerFile.getName(), headStream, attachStream);
        //} catch (FileNotFoundException e) {
        //    throw new SystemException(NXS_91_0001);
        //} finally {
        //    try {
        //        if (headStream != null) {
        //            headStream.close();
        //        }
        //        if (attachStream != null) {
        //            attachStream.close();
        //        }
        //    } catch (IOException e) {
        //        throw new SystemException(NXS_91_0001);
        //    }
        //}

        File file = commonService.mergePdf(headerFile.getName(), headerFile, attachFile);
        // UT304 MULTI LABEL MOD END

        return file;
    }
    
    /**
     * Update the FILE ID of Invoice Header.
     * <br />インボイスヘッダのファイルIDを更新します。
     * <pre>
     * - Invoice Header update
     *   TtInvoiceHeaderDomain updates to, TitiaienuvoiceHeaderCriteriaDomain set the conditions to narrow-down,
     *   Call TtInvoiceHeaderService.UpdateByCondition(TtInvoiceHeaderDomain, TitiaienuvoiceHeaderCriteriaDomain).
     *     Updates
     *       - FILE ID
     *     Narrowing conditions
     *       - SHIPPER CODE
     *       - Invoice No
     *       - INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * ‐インボイスヘッダ更新
     *     {@link TtInvoiceHeaderDomain}に更新内容、{@link TtInvoiceHeaderCriteriaDomain}に絞込条件を設定し、
     *     {@link TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}を呼び出します。
     *       更新内容
     *         ‐ファイルID
     *       絞込条件
     *         ‐荷主コード
     *         ‐インボイスNo
     *         ‐インボイス発行日
     * </pre>
     * 
     * @param fileId FILE ID<br />
     * ファイルID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param screenId SCREEN ID<br />
     * 画面ID
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Can not register a FILE ID to Invoice Header<br />
     * インボイスヘッダにファイルIDを登録できない場合
     */
    protected int updateTtInvoiceHeaderByFileId(String fileId, String shipperCd, String invoiceNo
        , Date invoiceIssueDt, String screenId) 
        throws ApplicationException {
        
        TtInvoiceHeaderDomain domain = new TtInvoiceHeaderDomain();
        domain.setFileId(fileId);

        commonService.setCommonPropertyForUpdate(domain, screenId);

        TtInvoiceHeaderCriteriaDomain criteria = new TtInvoiceHeaderCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        
        return ttInvoiceHeaderService.updateByCondition(domain, criteria);
    }
    
    /**
     * Update the FILE ID of Packing Header.
     * <br />パッキングヘッダのファイルIDを更新します。
     * <pre>
     * - Packing Header update
     *   TtPackingHeadDomain updates to, TitiPackingHeadCriteriaDomain set the conditions to narrow-down,
     *   Call TtPackingHeadService.UpdateByCondition(TtPackingHeadDomain, TitiPackingHeadCriteriaDomain).
     *      Updates
     *        - FILE ID
     *      Narrowing conditions
     *        - SHIPPER CODE
     *        - Invoice No
     *        - INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * ‐パッキングヘッダ更新
     *     {@link TtPackingHeadDomain}に更新内容、{@link TtPackingHeadCriteriaDomain}に絞込条件を設定し、
     *     {@link TtPackingHeadService#updateByCondition(TtPackingHeadDomain, TtPackingHeadCriteriaDomain)}を呼び出します。
     *       更新内容
     *         ‐ファイルID
     *       絞込条件
     *         ‐荷主コード
     *         ‐インボイスNo
     *         ‐インボイス発行日
     * </pre>
     * 
     * @param fileId FILE ID<br />
     * ファイルID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param screenId SCREEN ID<br />
     * 画面ID
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Can not register a FILE ID to Invoice Header<br />
     * インボイスヘッダにファイルIDを登録できない場合
     */
    protected int updateTtPackingHeadByFileId(String fileId, String shipperCd, String invoiceNo, Date invoiceIssueDt, String screenId) 
        throws ApplicationException {
        
        TtPackingHeadDomain domain = new TtPackingHeadDomain();
        domain.setFileId(fileId);

        commonService.setCommonPropertyForUpdate(domain, screenId);

        TtPackingHeadCriteriaDomain criteria = new TtPackingHeadCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        
        return ttPackingHeadService.updateByCondition(domain, criteria);
    }
    
    /**
     * Update the FILE ID of the sales contract.
     * <br />セールスコントラクトのファイルIDを更新します。
     * <pre>
     * - Sales contract update
     *   TtScHeaderDomain updates to, TtScHeaderCriteriaDomain set the narrowing-down conditions to,
     *   Call TtScHeaderService.UpdateByCondition(TtScHeaderDomain, TtScHeaderCriteriaDomain).
     *     Updates
     *       - FILE ID
     *     Narrowing conditions
     *       - SHIPPER CODE
     *       - Invoice No
     *       - INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * ‐セールスコントラクト更新
     *     {@link TtScHeaderDomain}に更新内容、{@link TtScHeaderCriteriaDomain}に絞込条件を設定し、
     *     {@link TtScHeaderService#updateByCondition(TtScHeaderDomain, TtScHeaderCriteriaDomain)}を呼び出します。
     *       更新内容
     *         ‐ファイルID
     *       絞込条件
     *         ‐荷主コード
     *         ‐インボイスNo
     *         ‐インボイス発行日
     * </pre>
     * 
     * @param fileId FILE ID<br />
     * ファイルID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param screenId SCREEN ID<br />
     * 画面ID
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Can not register a FILE ID to Sales Contract Header<br />
     * セールスコントラクトヘッダにファイルIDを登録できない場合
     */
    protected int updateTtScHeaderByFileId(String fileId, String shipperCd, String invoiceNo, Date invoiceIssueDt, String screenId) 
        throws ApplicationException {
        
        TtScHeaderDomain domain = new TtScHeaderDomain();
        domain.setFileId(fileId);

        commonService.setCommonPropertyForUpdate(domain, screenId);

        TtScHeaderCriteriaDomain criteria = new TtScHeaderCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        
        return ttScHeaderService.updateByCondition(domain, criteria);
    }
    
    /**
     * Registration of Invoice No. Palletize to the table, change of Palletize STATUS
     * <br />パレタイズテーブルへのインボイスNo.の登録、パレタイズステータスの変更
     * <pre>
     * Make the update process only if the main Invoice.
     * 
     * - Get Invoide Palletize Work
     *   Call searchTwInvPltzOnRegister(String, String, String) , with the following arguments:
     *     - Login DSC-ID
     *     - SHIPPER CODE of Invoice Group Work
     *     - Group No.first of Invoice Group Work
     * 
     * - Acquisition and lock the data to be updated
     *   Set the following items TtPltzCriteriaDomain,
     *   Call TtPltzService.lockByKeyNoWait(TtPltzCriteriaDomain).
     *     - MainMark of Invoide Palletize Work
     *   
     *   [ When the updated data has been deleted ]
     *     - No data is retrieved , the end MESSAGE ID in the "NXS-E1-0010" .
     *   [ If the data to be updated has been updated ]
     *     - Palletize STATUS and C / C TYPE does not match the combination of the following , in the end MESSAGE ID "GSCM-E0-0010"
     *       C / C TYPE: A ( after customs clearance van packed ) & Palletize STATUS: 80 ( shipments )
     *       C / C TYPE: B ( van packed after customs clearance ) & Palletize STATUS: 50 (Staging Actuality)
     *       C / C TYPE: Z ( mixed ) & Palletize STATUS: 30 (staging result)
     *   
     * - Palletize table update
     *   Set the narrowing-down condition updates to TtPltzDomain, in TtPltzCriteriaDomain,
     *   Call TtPltzService.updateByCondition(List, List).
     *     Updated content
     *       - Palletize STATUS: C / C TYPE: if A ( van packed after customs clearance ) , "90" ( customs )
     *                           C / C TYPE: if B ( after customs clearance van packed ) , "60" ( customs )
     *                           C / C TYPE: if Z ( mixed ) , "40" ( customs )
     *       - Regular Invoice No
     *       - INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * メインインボイスの場合のみ更新処理を行います。
     * 
     * ‐インボイス作成対象パレタイズワークの取得
     *     {@link #searchTwInvPltzOnRegister(String, String, String)}を以下の引数で呼出します。
     *       ‐ログインDSC-ID
     *       ‐インボイスグループワークの荷主コード
     *       ‐インボイスグループワークのGroup No.first
     * 
     * ‐更新対象データの取得＆ロック
     *     {@link TtPltzCriteriaDomain}に以下の項目を設定し、
     *     {@link TtPltzService#lockByKeyNoWait(TtPltzCriteriaDomain)}を呼出します。
     *       ‐インボイス作成対象パレタイズワークのMainMark
     *     
     *     [更新対象データが削除されていた場合]
     *       ‐取得データがなしの場合、メッセージID「NXS-E1-0010」で終了。
     *     [更新対象データが更新されていた場合]
     *       ‐通関タイプとパレタイズステータスが下記の組み合わせに合致しない場合、メッセージID「GSCM-E0-0010」で終了
     *           通関タイプ：A(通関後バン詰) & パレタイズステータス：80(出荷実績)
     *           通関タイプ：B(バン詰後通関) & パレタイズステータス：50(山作り実績)
     *           通関タイプ：Z(混在) & パレタイズステータス：30(荷揃え実績)
     *     
     * ‐パレタイズテーブル更新
     *     {@link TtPltzDomain}に更新内容、{@link TtPltzCriteriaDomain}に絞込条件を設定し、
     *     {@link TtPltzService#updateByCondition(List, List)}を呼出します。
     *       更新内容
     *         ‐パレタイズステータス：通関タイプ：A（バン詰後通関）の場合、"90"（通関）
     *                                 通関タイプ：B（通関後バン詰）の場合、"60"（通関）
     *                                 通関タイプ：Z（混在）の場合、"40"（通関）
     *         ‐正規インボイスNo
     *         ‐インボイス発行日
     * </pre>
     * 
     * @param twInvList Invoice Group Work List<br />
     * インボイスグループワークリスト
     * @param normInvNoList List of regular Invoice No<br />
     * 正規インボイスNoのリスト
     * @param criteria Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Can not register the Invoice No. Palletize to the table, and change the Palletize STATUS<br />
     * パレタイズテーブルへのインボイスNo.の登録、パレタイズステータスの変更が出来ない場合
     */
    protected int updateTtPltzOnRegisterForMainInvoice (List<? extends TwInvDomain> twInvList, List<String> normInvNoList, W6001DocCriteriaDomain criteria, Date invoiceIssueDt) throws ApplicationException {
        
        List<TtPltzCriteriaDomain> criteriaList = new ArrayList<TtPltzCriteriaDomain>();
        List<TtPltzDomain> domainList = new ArrayList<TtPltzDomain>();
        
        for (int i = 0; i < twInvList.size(); i++) {
            TwInvDomain twInvDomain = twInvList.get(i);
            // Check grpNo2 as a main invoice.
            // メインインボイスの場合のみパレタイズに登録を行います。
            if (GRP_NO2_MAIN.equals(twInvDomain.getGrpNo2())) {
                // Get Invoide Palletize Work. 
                // インボイス作成対象パレタイズワークを取得
                List<? extends TwInvPltzDomain> twInvPltzList = searchTwInvPltzOnRegister(criteria.getDscId(), twInvDomain.getShipperCd(), twInvDomain.getGrpNo1());
                
                for (TwInvPltzDomain twInvPltzDomain : twInvPltzList) {

                    TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
                    ttPltzCriteria.setMainMark(twInvPltzDomain.getMainMark()); 
                    TtPltzDomain ttPltzDomain = new TtPltzDomain();
                    try {
                        ttPltzDomain = ttPltzService.lockByKeyNoWait(ttPltzCriteria);
                    } catch (ApplicationException e) {
                        throw new GscmApplicationException(NXS_E1_0010);
                    }
                    if (null == ttPltzDomain) {
                        throw new GscmApplicationException(NXS_E1_0010);
                    }
                    TtPltzDomain domain = new TtPltzDomain();
                    
                    // Check error.
                    // 更新対象データが更新されていた場合エラー
                    if (CUSTOM_TIMING_TYPE_A.equals(ttPltzDomain.getCustomTimingTyp())) {
                        if (!PLTZ_STATUS_SHIPPING_COMFIRMATION_ACTUAL.equals(ttPltzDomain.getPltzStatus())) {
                            throw new GscmApplicationException(GSCM_E0_0010);
                        }
                        domain.setPltzStatus(PLTZ_STATUS_CUSTOMS_CLEARANCE_A);
                    } else if (CUSTOM_TIMING_TYPE_B.equals(ttPltzDomain.getCustomTimingTyp())) {
                        if (!PLTZ_STATUS_STG_ACT.equals(ttPltzDomain.getPltzStatus())) {
                            throw new GscmApplicationException(GSCM_E0_0010);
                        }
                        domain.setPltzStatus(PLTZ_STATUS_CUSTOMS_CLEARANCE_B);
                    } else if (CUSTOM_TIMING_TYPE_Z.equals(ttPltzDomain.getCustomTimingTyp())) {
                        if (!PLTZ_STATUS_STG_INSTR_WORKED_DONE.equals(ttPltzDomain.getPltzStatus())) {
                            throw new GscmApplicationException(GSCM_E0_0010);
                        }
                        domain.setPltzStatus(PLTZ_STATUS_CUSTOMS_CLEARANCE_Z);
                    }
                    
                    domain.setInvoiceNo(normInvNoList.get(i));
                    domain.setInvoiceIssueDt(invoiceIssueDt);
                    
                    commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6009);
                    
                    criteriaList.add(ttPltzCriteria);
                    domainList.add(domain);
                }
            }
        }
        return ttPltzService.updateByCondition(domainList, criteriaList);
    }
    
    /**
     * Subtraction of Temp Stock
     * <br />仮在庫の減算
     * <pre>
     * Part number that created the customs documents, Subtract the Temp Stock.
     * - Get the update-source information
     *   Call searchTtPltzOnRegisterForTtTmpStock(String, String, Date).
     * 
     * - Lock Temp Stock
     *   Set the following items in the update-source information obtained in TtTmpStockCriteriaDomain,
     *   Call TtTmpStockService.lockByKeyNoWait(TtTmpStockCriteriaDomain).
     *     - LEGACY_WH_CD
     *     - SHIPPER_CD
     *     - ITEM_NO
     *     - PKG_CD
     *
     * - Temp Stock update
     *   For the data it is locked, set the updates to TtTmpStockDomain,
     *   Call TtTmpStockService.updateByCondition(List, List).
     *     Updated content
     *       -The QTY:. (. Temp Stock QTY) - SUM update based on information obtained (QTY)
     * </pre>
     * <pre>
     * 通関書類を作成した品番について、仮在庫を減算します。
     * ‐更新元情報の取得
     *     {@link #searchTtPltzOnRegisterForTtTmpStock(String, String, Date)}を呼出します。
     * 
     * ‐仮在庫をロック
     *     {@link TtTmpStockCriteriaDomain}に取得した更新元情報の以下の項目を設定し、
     *     {@link TtTmpStockService#lockByKeyNoWait(TtTmpStockCriteriaDomain)}を呼出します。
     *       ‐LEGACY_WH_CD
     *       ‐SHIPPER_CD
     *       ‐ITEM_NO
     *       ‐PKG_CD
     * 
     * ‐仮在庫更新
     *     ロックしたデータに対し、{@link TtTmpStockDomain}に更新内容を設定し、
     *     {@link TtTmpStockService#updateByCondition(List, List)}を呼出します。
     *       更新内容
     *         ‐QTY：(仮在庫.QTY) - 取得した更新元情報.SUM(QTY)
     * </pre>
     * 
     * @param ttInvoiceList Invoice registration data of CIGMA goods and main Invoice<br />
     * メインインボイス かつ CIGMA品のインボイス登録データ
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Unable to update the Temp Stock<br />
     * 仮在庫の更新ができない場合
     */
    protected int updateTtTmpStockOnRegisterByQty(List<? extends TtInvoiceDomain> ttInvoiceList) 
        throws ApplicationException {
        
        List<TtTmpStockCriteriaDomain> criteriaList = new ArrayList<TtTmpStockCriteriaDomain>();
        List<TtTmpStockDomain> domainList = new ArrayList<TtTmpStockDomain>();
        
        for (TtInvoiceDomain ttInvoiceDomain : ttInvoiceList) {
            // Get the update data to be registered in the Temp Stock. 
            // 更新元情報の取得
            List<? extends W6001DocPltzDomain> docPltzList = searchTtPltzOnRegisterForTtTmpStock(ttInvoiceDomain.getShipperCd()
                , ttInvoiceDomain.getInvoiceNo(), ttInvoiceDomain.getInvoiceIssueDt());
            
            for (W6001DocPltzDomain docPltzDomain : docPltzList) {
                for (W6001DocPltzItemDomain pltzItemDomain : docPltzDomain.getDocPltzItemList()) {

                    TtTmpStockCriteriaDomain criteria = new TtTmpStockCriteriaDomain();
                    criteria.setLgcyWhCd(docPltzDomain.getCurLgcyWhCd());
                    criteria.setShipperCd(docPltzDomain.getShipperCd());
                    criteria.setItemNo(pltzItemDomain.getPltzItemNo());
                    criteria.setPkgCd(pltzItemDomain.getPkgCd());
                    TtTmpStockDomain ttTmpStockDomain = new TtTmpStockDomain();
                    try {
                        ttTmpStockDomain = ttTmpStockService.lockByKeyNoWait(criteria);
                    } catch (ApplicationException e) {
                        throw new GscmApplicationException(GSCM_E0_0010);
                    }
                    if (null == ttTmpStockDomain) {
                        throw new GscmApplicationException(GSCM_E0_0010);
                    }
                    
                    TtTmpStockDomain domain = new TtTmpStockDomain();
                    domain.setQty(ttTmpStockDomain.getQty().subtract(pltzItemDomain.getSumQty()));
                    commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6009);
                    
                    criteriaList.add(criteria);
                    domainList.add(domain);
                }
            }
        }

        return ttTmpStockService.updateByCondition(domainList, criteriaList);
    }
    
    /**
     * Get the update data to be registered in the Temp Stock.
     * <br />仮在庫に登録する更新データを取得します。
     * <pre>
     * - Data acquisition W6001DocCriteriaDomain Set the following items,
     *   W6001DocDao.SearchTtPltzByRegister (W6001DocCriteriaDomain) Calls.
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE 
     * </pre>
     * <pre>
     * ‐データ取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTtPltzByRegister(W6001DocCriteriaDomain)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return Update original data acquired<br />
     * 得した更新元データ
     * @throws ApplicationException Can not get the update data to be registered in the Temp Stock<br />
     * 仮在庫に登録する更新データを取得できない場合
     */
    protected List<? extends W6001DocPltzDomain> searchTtPltzOnRegisterForTtTmpStock (String shipperCd, String invoiceNo, Date invoiceIssueDt) 
        throws ApplicationException {

        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        
        return w6001DocDao.searchTtPltzByRegister(criteria);
    }
    
    /**
     * Allows to add SHIPPED QUANTITY, the number of times the shipping instruction.
     * <br />出荷数量、出荷指示回数の加算をします。
     * <pre>
     * - Get the update-source information
     *   Call searchTtPltzOnRegisterForTtExpRcvOdr(String, String, Date) to the argument the following items .
     *     - SHIPPER CODE that registered with the Invoice
     *     - Invoice No have registered to Invoice
     *     - INVOICE ISSUE DATE that registered with the Invoice
     * 
     * - Rock of data to be updated (Export Receive Order)
     *   Set the following items that obtained in the update-source information to TtExpRcvOdrCriteriaDomain,
     *   Call TtExpRcvOdrService.lockByKeyNoWait(TtExpRcvOdrCriteriaDomain).
     *     - RCV_ODR_COMP_CD
     *     - CUSTOMER_CD
     *     - LGCY_SHIP_TO
     *     - ITEM_NO
     *     - PKG_CD
     *     - TRNS_CD
     *     - ETD_DUT_DT
     *     - CUSTOMER_PO_NO
     *     - CUSTOMER_ITEM_NO
     *     - CUSTOMER_ITEM_NO_ORG
     *     - ODR_CTRL_NO
     * 
     * - Update of Export Receive Order table
     *   For the data to set the updates to TtExpRcvOdrDomain, it is locked Calls .
     *     - SHIPPED_QTY: Export Receive Order.SHIPPED_QTY + update source information.SUM (ALLOC_QTY)
     *     - PARTIAL_DELIV_CNT: 1 is added to
     *     - SHIPPED_TYP: Export Receive Order.ODR_QTY = Export Receive Order.SHIPPED_QTY is "3" (shipped)
     * </pre>
     * <pre>
     * ‐更新元情報の取得
     *     以下の項目を引数に{@link #searchTtPltzOnRegisterForTtExpRcvOdr(String, String, Date)}を呼出します。
     *       ‐インボイスに登録した荷主コード
     *       ‐インボイスに登録したインボイスNo
     *       ‐インボイスに登録したインボイス発行日
     *     
     * ‐更新対象データのロック（輸出受注）
     *     {@link TtExpRcvOdrCriteriaDomain}に更新元情報で取得した以下の項目を設定し、
     *     {@link TtExpRcvOdrService#lockByKeyNoWait(TtExpRcvOdrCriteriaDomain)}を呼出します。
     *       ‐RCV_ODR_COMP_CD
     *       ‐CUSTOMER_CD
     *       ‐LGCY_SHIP_TO
     *       ‐ITEM_NO
     *       ‐PKG_CD
     *       ‐TRNS_CD
     *       ‐ETD_DUT_DT
     *       ‐CUSTOMER_PO_NO
     *       ‐CUSTOMER_ITEM_NO
     *       ‐CUSTOMER_ITEM_NO_ORG
     *       ‐ODR_CTRL_NO
     * 
     * ‐輸出受注テーブルの更新
     *     {@link TtExpRcvOdrDomain}に更新内容を設定し、ロックしたデータに対して
     *     {@link TtExpRcvOdrService#updateByCondition(List, List)}を呼出します。
     *       ‐SHIPPED_QTY：輸出受注.SHIPPED_QTY + 更新元情報.SUM(ALLOC_QTY)
     *       ‐PARTIAL_DELIV_CNT：1を加算
     *       ‐SHIPPED_TYP：輸出受注.ODR_QTY = 輸出受注.SHIPPED_QTY の場合 "3"（出荷済み） 
     * </pre>
     * 
     * @param ttInvoiceList Invoice registration data of CIGMA goods and main Invoice<br />
     * メインインボイス かつ CIGMA品のインボイス登録データ
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Unable to add a SHIPPED QUANTITY, the number of shipping instructions<br />
     * 出荷数量、出荷指示回数の加算を出来ない場合
     */
    protected int updateTtExpRcvOdrOnRegister (List<? extends TtInvoiceDomain> ttInvoiceList) 
        throws ApplicationException {
        
        List<TtExpRcvOdrCriteriaDomain> criteriaList = new ArrayList<TtExpRcvOdrCriteriaDomain>();
        List<TtExpRcvOdrDomain> domainList = new ArrayList<TtExpRcvOdrDomain>();

        for (TtInvoiceDomain ttInvoiceDomain : ttInvoiceList) {
            // Get the update source information SHIPPED QUANTITY, the number of times the shipping instruction. 
            // 更新元情報取得
            List<? extends W6001DocPltzItemOdrDomain> pltzOdrList = searchTtPltzOnRegisterForTtExpRcvOdr(ttInvoiceDomain.getShipperCd()
                , ttInvoiceDomain.getInvoiceNo(), ttInvoiceDomain.getInvoiceIssueDt());
            
            for (W6001DocPltzItemOdrDomain pltzOdrDomain : pltzOdrList) {

                TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
                criteria.setRcvOdrCompCd(pltzOdrDomain.getRcvOdrCompCd());
                criteria.setCustomerCd(pltzOdrDomain.getCustomerCd());
                criteria.setLgcyShipTo(pltzOdrDomain.getLgcyShipTo());
                criteria.setItemNo(pltzOdrDomain.getItemNo());
                criteria.setPkgCd(pltzOdrDomain.getPkgCd());
                criteria.setTrnsCd(pltzOdrDomain.getTrnsCd());
                criteria.setEtdDueDt(pltzOdrDomain.getEtdDueDt());
                criteria.setCustomerPoNo(pltzOdrDomain.getCustomerPoNo());
                criteria.setCustomerItemNo(pltzOdrDomain.getCustomerItemNo());
                criteria.setCustomerItemNoOrg(pltzOdrDomain.getCustomerItemNoOrg());
                criteria.setOdrCtrlNo(pltzOdrDomain.getOdrCtrlNo());
                TtExpRcvOdrDomain ttExpRcvOdrDomain = new TtExpRcvOdrDomain();
                try {
                    ttExpRcvOdrDomain = ttExpRcvOdrService.lockByKeyNoWait(criteria);
                } catch (ApplicationException e) {
                    throw new GscmApplicationException(NXS_E1_0010);
                }
                if (null == ttExpRcvOdrDomain) {
                    throw new GscmApplicationException(NXS_E1_0010);
                }
                if (SHIPPED_TYP_COMPLETE_SHIPPING.equals(ttExpRcvOdrDomain.getShippedTyp())) {
                    throw new GscmApplicationException(NXS_E1_0054);
                }
                // Set data to the export receive order table.
                // 輸出受注テーブルの更新内容設定
                TtExpRcvOdrDomain domain = new TtExpRcvOdrDomain();
                domain.setShippedQty(ttExpRcvOdrDomain.getShippedQty().add(pltzOdrDomain.getSumAllocQty()));
                domain.setPartialDelivCnt(ttExpRcvOdrDomain.getPartialDelivCnt().add(BigDecimal.ONE));
                if (ttExpRcvOdrDomain.getOdrQty().compareTo(domain.getShippedQty()) == 0) {
                    domain.setShippedTyp(SHIPPED_TYP_COMPLETE_SHIPPING);
                }

                commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6009);
                
                if (ttExpRcvOdrDomain.getOdrQty().compareTo(domain.getShippedQty()) < 0) {
                    throw new GscmApplicationException(NXS_E1_0055);
                }
                
                criteriaList.add(criteria);
                domainList.add(domain);
            }
        }

        return ttExpRcvOdrService.updateByCondition(domainList, criteriaList);
    }
    
    /**
     * Get the update source information SHIPPED QUANTITY, the number of times the shipping instruction.
     * <br />出荷数量、出荷指示回数の更新元情報を取得します。
     * <pre>
     * - Update-source information retrieval W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.SearchTtPltzItemOdr (W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * ‐更新元情報検索
     *    {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *    {@link W6001DocDao#searchTtPltzItemOdr(W6001DocCriteriaDomain)}を呼出します。
     *      ‐荷主コード
     *      ‐インボイスNo
     *      ‐インボイス発行日
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return Update-source information acquired<br />
     * 取得した更新元情報
     * @throws ApplicationException Ccan not get the update source information<br />
     * 更新元情報の取得が出来ない場合
     */
    protected List<? extends W6001DocPltzItemOdrDomain> searchTtPltzOnRegisterForTtExpRcvOdr(String shipperCd, String invoiceNo, Date invoiceIssueDt) 
        throws ApplicationException {
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        
        return w6001DocDao.searchTtPltzItemOdr(criteria);
    }
    
    /**
     * For CIGMA, perform the sales and orders and stock registration.
     * <br />CIGMAに対し、売上・受注・在庫登録を行います。
     * <pre>
     * - Web to get the data to pass to the service, will create a delivery parameters.
     *   Argument in the following items that have been registered to Invoice
     *   Call (String, String, Date) the prepareWs6001ParamDomain.
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     * 
     * - Web service call
     *   Argument in the following items:
     *   Call Ws6001RestService.registSalesOdrInvntry(String, Ws6001ParamDomain).
     *     - COMPANY CODE
     *     - Delivery parameters that created
     * </pre>
     * <pre>
     * ‐Webサービスに渡すデータを取得し、引き渡しパラメータを作成します。
     *     インボイスに登録した以下の項目を引数に
     *     {@link #prepareWs6001ParamDomain(String, String, Date)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     * 
     * - Webサービス呼出し
     *     以下の項目を引数に
     *     {@link Ws6001RestService#registSalesOdrInvntry(String, Ws6001ParamDomain)}を呼出します。
     *       ‐会社コード
     *       ‐作成した引き渡しパラメータ
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @param ttInvoiceList Invoice registration data of CIGMA goods and main Invoice<br />
     * メインインボイス かつ CIGMA品のインボイス登録データ
     * @throws ApplicationException For CIGMA, Not possible to sales, orders and stock registration<br />
     * CIGMAに対し、売上・受注・在庫登録が出来ない場合
     */
    protected void callWebService6001(String compCd, List<? extends TtInvoiceDomain> ttInvoiceList)
        throws ApplicationException {
        
        for (TtInvoiceDomain ttInvDomain : ttInvoiceList) {
            // Create a Web service parameters of "sales and orders and stock registration". 
            // Webサービスに渡すデータ取得
            Ws6001ParamDomain paramDomain = prepareWs6001ParamDomain(ttInvDomain.getShipperCd()
                , ttInvDomain.getInvoiceNo(), ttInvDomain.getInvoiceIssueDt());
            // Update the sales, orders and stock of CIGMA by using the (WS6001) Web Services 
            // Webサービス呼出し
            ResultDomain resultDomain = ws6001RestService.registSalesOdrInvntry(compCd, paramDomain);
            if (WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
                // 処理なし
            } else if(WS_RESULT_ERROR_SYSTEM.equals(resultDomain.getResultCode())) {
                throw new GscmApplicationException(NXS_E1_0058);
            } else {
                ErrorListItemDomain errorListItem = resultDomain.getErrorList().get(0);
                
                if (!CollectionUtils.isEmpty(errorListItem.getErrorParamList())) {
                    List<Object> params = new ArrayList<Object>();
                    for (ErrorParamListItemDomain param : errorListItem.getErrorParamList()) {
                        params.add(param.getParam());
                    }
                    throw new GscmApplicationException(errorListItem.getErrorCode(), params.toArray());
                } else {
                    throw new GscmApplicationException(errorListItem.getErrorCode());
                }
            }
        }
    }
    
    /**
     * Create a Web service parameters of "sales and orders and stock registration".
     * <br />Webサービス「売上・受注・在庫登録」のパラメータを作成します。
     * <pre>
     * - Data acquisition of the header information
     *   W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.EsuieiarushietchiTtInvoiceByHeaderRegister (W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE 
     *
     * - Data acquisition of specification information
     *   W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.SearchTtInvoiceAttached (W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * ‐ヘッダ情報のデータ取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTtInvoiceByHeaderRegister(W6001DocCriteriaDomain)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     * 
     * ‐明細情報のデータ取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTtInvoiceAttached(W6001DocCriteriaDomain)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return Call parameters domain of Web services<br />
     * Webサービスの呼出しパラメータドメイン
     * @throws ApplicationException If the parameter Creating Web Services "in sales and orders and stock registration" can not be<br />
     * Webサービス「売上・受注・在庫登録」のパラメータ作成ができない場合
     */
    protected Ws6001ParamDomain prepareWs6001ParamDomain (String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {
        
        Ws6001ParamDomain paramDomain = new Ws6001ParamDomain();
        List<Ws6001ParamItemDomain> itemDomainList = new ArrayList<Ws6001ParamItemDomain>();
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        // Get information to pass to the Web service corresponding to the search condition (header part). 
        // データ取得(ヘッダ情報)
        W6001DocInvoiceDomain headDomain = w6001DocDao.searchTtInvoiceByHeaderRegister(criteria);

        paramDomain.setInvoiceNo(StringUtils.defaultString(headDomain.getInvoiceNo()));
        paramDomain.setCustomerCd(StringUtils.defaultString(headDomain.getCustomerCd()));
        paramDomain.setShipToNo(StringUtils.defaultString(headDomain.getLgcyShipTo()));
        paramDomain.setDateOfIssuedDocument(StringUtils.defaultString(DateUtil.formatDate(
            headDomain.getInvoiceIssueDt(), WS_CIGMA_DATE_FORMAT)));
        paramDomain.setDDNo(StringUtils.defaultString(headDomain.getRelateInvoiceNo()));
        paramDomain.setShippedDate(StringUtils.defaultString(DateUtil.formatDate(
            headDomain.getShippedDt(), WS_CIGMA_DATE_FORMAT)));
        paramDomain.setTypeOfShipment(StringUtils.left(StringUtils.defaultString(headDomain.getTrnsNm()), 10)); // UT369 ADD
        paramDomain.setEstimatedArrivalDate(StringUtils.defaultString(DateUtil.formatDate(
            headDomain.getEta(), WS_CIGMA_DATE_FORMAT)));
        paramDomain.setEstimatedArrivalTime(StringUtils.defaultString(headDomain.getArrivalTime()));
        paramDomain.setShipToName(StringUtils.defaultString(headDomain.getShipToNm1()));
        paramDomain.setShipToAddress1(StringUtils.defaultString(headDomain.getShipToAddr1()));
        paramDomain.setShipToAddress2(StringUtils.defaultString(headDomain.getShipToAddr2()));
        paramDomain.setShipToAddress3(StringUtils.defaultString(headDomain.getShipToAddr3()));
        paramDomain.setShipToCountryCode(StringUtils.defaultString(headDomain.getCntryCdShipTo()));
        paramDomain.setNoOfCartons("0");
        // UT395 MOD START
        //paramDomain.setTotalGrossWeight(headDomain.getTotalGrossWeight().toPlainString());
        //paramDomain.setTotalNetWeight(headDomain.getTotalNetWeight().toPlainString());

        // If overflow CIGMA integer digit number 6, to set the 999999.999.
        // CIGMAの桁数6を超えている場合、999999.999を設定する。
        BigDecimal totalGrossWeightWork = headDomain.getTotalGrossWeight();
        if (6 < totalGrossWeightWork.precision() - totalGrossWeightWork.scale()) {
            totalGrossWeightWork = new BigDecimal("999999.999");
        }
        paramDomain.setTotalGrossWeight(totalGrossWeightWork.toPlainString());
        // If overflow CIGMA integer digit number 6, to set the 999999.999.
        // CIGMAの桁数6を超えている場合、999999.999を設定する。
        BigDecimal totalNetWeightWork = headDomain.getTotalNetWeight();
        if (6 < totalNetWeightWork.precision() - totalNetWeightWork.scale()) {
            totalNetWeightWork = new BigDecimal("999999.999");
        }
        paramDomain.setTotalNetWeight(totalNetWeightWork.toPlainString());
        // UT395 MOD END

        paramDomain.setWeightUnit(StringUtils.defaultString(headDomain.getLgcyUnitCd()));
        paramDomain.setWeightUnitonDoc(StringUtils.defaultString(headDomain.getTotalNetWeightUnit()));

        // UT395 MOD START
        //BigDecimal totalVol = commonService.convertVolumeUnit(headDomain.getTotalVolume(), headDomain.getVolumeUnit(), UNIT_CD_CR);
        //if (totalVol == null) {
        //    Object[] params = { 
        //        commonService.getResource(headDomain.getLocale(), "label.totalVol") 
        //    };
        //    throw new GscmApplicationException(NXS_E7_0157, params); 
        //}
        //paramDomain.setTotalVolume(totalVol.setScale(0, BigDecimal.ROUND_UP).toPlainString());

        // It converted to m3 for volume.
        // If overflow CIGMA integer digit number 7, to set the 9999999.
        // 容積についてはm3に変換する。
        // CIGMAの桁数7を超えている場合、9999999を設定する。
        BigDecimal totaVolumeWork
            = commonService.convertVolumeUnitNoOverflowCheck(headDomain.getTotalVolume(),
                headDomain.getVolumeUnit(), UNIT_CD_CR).setScale(0, BigDecimal.ROUND_UP);
        if (7 < totaVolumeWork.precision() - totaVolumeWork.scale()) {
            totaVolumeWork = new BigDecimal("9999999");
        }
        paramDomain.setTotalVolume(totaVolumeWork.toPlainString());
        // UT395 MOD END

        paramDomain.setCarrierName(StringUtils.defaultString(headDomain.getCarrierCompNmAbb()));
        paramDomain.setCarrierAddress1(StringUtils.defaultString(headDomain.getPrintCompAddr1()));
        paramDomain.setCarrierAddress2(StringUtils.defaultString(headDomain.getPrintCompAddr2()));
        paramDomain.setCarrierAddress3(StringUtils.defaultString(headDomain.getPrintCompAddr3()));
        paramDomain.setCarrierCountryCode(StringUtils.defaultString(headDomain.getCntryCdCarrier()));
        // UT321 MOD START
        //paramDomain.setSpecialInfomation(StringUtils.left(StringUtils.defaultString(headDomain.getSpInfo()), 30));
        String spInfoWork = "";
        String[] spInfoLines = StringUtils.defaultString(headDomain.getSpInfo()).split("\n");
        for (String spInfoLine : spInfoLines) {
            spInfoWork += StringUtils.rightPad(spInfoLine, 30, ' ');
        }
        paramDomain.setSpecialInfomation(StringUtils.mid(spInfoWork, 0, 30));
        // UT321 MOD END
        paramDomain.setSenderName(StringUtils.defaultString(headDomain.getShipperCompNm1()));
        paramDomain.setSenderAddress1(StringUtils.defaultString(headDomain.getShipperCompAddr1()));
        paramDomain.setSenderAddress2(StringUtils.defaultString(headDomain.getShipperCompAddr2()));
        paramDomain.setSenderAddress3(StringUtils.defaultString(headDomain.getShipperCompAddr3()));
        paramDomain.setSenderCountryCode(StringUtils.defaultString(headDomain.getCntryCdShipper()));
        paramDomain.setBilingCompanyVatNo(StringUtils.defaultString(headDomain.getShipperTaxIdNo()));
        // UT317 START >>>>>
//        paramDomain.setBillingTelNo(URLEncoder.encode(StringUtils.defaultString(headDomain.getShipperCompTel())));
//        paramDomain.setBillingFaxNo(URLEncoder.encode(StringUtils.defaultString(headDomain.getShipperCompFax())));
        paramDomain.setBillingTelNo(StringUtils.defaultString(headDomain.getShipperCompTel()));
        paramDomain.setBillingFaxNo(StringUtils.defaultString(headDomain.getShipperCompFax()));
        // UT317 END <<<<<
        paramDomain.setAccounteeNo("");
        paramDomain.setAccounteeName("");
        paramDomain.setAccounteeAddress1("");
        paramDomain.setAccounteeAddress2("");
        paramDomain.setAccounteeAddress3("");
        paramDomain.setAccounteeCountryCode("");
        paramDomain.setPaymentTerms(StringUtils.defaultString(headDomain.getPayTerms()));
        paramDomain.setTradeTerms(StringUtils.defaultString(headDomain.getTradeTerms()));
        paramDomain.setDeliveryPoint(StringUtils.defaultString(headDomain.getDlivPoint()));
        paramDomain.setPriceTerms(StringUtils.defaultString(headDomain.getPriceTerms()));
        paramDomain.setInvoiceAuthorizedName(StringUtils.left(StringUtils.defaultString(headDomain.getApprovalNm()), 20));
        paramDomain.setInvoiceAuthorizedPosition(StringUtils.left(StringUtils.defaultString(headDomain.getApprovalPosition()), 20));
        paramDomain.setInvoiceAmount(headDomain.getTotalInvoiceAmount().toPlainString());
        paramDomain.setInvoiceAmountCurCd3Digit(StringUtils.defaultString(headDomain.getTotalInvoiceAmountCurrCd()));
        paramDomain.setTax(headDomain.getVat().toPlainString());
        paramDomain.setTaxpc(headDomain.getVatRatio().toPlainString());
        paramDomain.setInsurance(headDomain.getInsurance().toPlainString());
        paramDomain.setFreight(headDomain.getFreight().toPlainString());
        
        paramDomain.setLibPgm(StringUtils.defaultString(headDomain.getLibPgm()));
        paramDomain.setJobHost(StringUtils.defaultString(headDomain.getJobHost()));
        paramDomain.setJobUser(StringUtils.defaultString(headDomain.getJobUser()));
        paramDomain.setJobPassword(StringUtils.defaultString(headDomain.getJobPassword()));
        paramDomain.setJobDescription(StringUtils.defaultString(headDomain.getJobDescription()));
        
        // Freight Status
        if (FREIGHT_RESPONSIBLE_CD_PREPAID.equals(headDomain.getFreightResponsibleCd())) {
            paramDomain.setFreightStatus(CIGMA_FREIGHT_RESPONSIBLE_CD_PREPAID); // UT285 MOD
        } else {
            paramDomain.setFreightStatus(CIGMA_FREIGHT_RESPONSIBLE_CD_COLLECT); // UT285 MOD
        }
        // REM LC TYP:REM
        if (REM_LC_TYP_REM.equals(headDomain.getRemLcTyp())) {
            paramDomain.setBankName(StringUtils.defaultString(headDomain.getRemBankNm()));
            paramDomain.setBankAddress1(StringUtils.defaultString(headDomain.getRemBankAddress1()));
            paramDomain.setBankAddress2(StringUtils.defaultString(headDomain.getRemBankAddress2()));
            paramDomain.setBankAddress3(StringUtils.defaultString(headDomain.getRemBankAddress3()));
            paramDomain.setBankAccountNo(StringUtils.defaultString(headDomain.getRemBankAccountNo()));
        }
        // REM LC TYP:LC
        if (REM_LC_TYP_LC.equals(headDomain.getRemLcTyp())) {
            paramDomain.setBankName(StringUtils.defaultString(headDomain.getLcBank1()));
            paramDomain.setBankAddress1("");
            paramDomain.setBankAddress2("");
            paramDomain.setBankAddress3("");
            paramDomain.setBankAccountNo("");
        }
        
        if (25 < paramDomain.getShipToAddress1().length()) {
            paramDomain.setShipToAddress1(paramDomain.getShipToAddress1().substring(0, 25));
        }
        if (25 < paramDomain.getShipToAddress2().length()) {
            paramDomain.setShipToAddress2(paramDomain.getShipToAddress2().substring(0, 25));
        }
        if (25 < paramDomain.getShipToAddress3().length()) {
            paramDomain.setShipToAddress3(paramDomain.getShipToAddress3().substring(0, 25));
        }
        if (25 < paramDomain.getCarrierAddress1().length()) {
            paramDomain.setCarrierAddress1(paramDomain.getCarrierAddress1().substring(0, 25));
        }
        if (25 < paramDomain.getCarrierAddress2().length()) {
            paramDomain.setCarrierAddress2(paramDomain.getCarrierAddress2().substring(0, 25));
        }
        if (25 < paramDomain.getCarrierAddress3().length()) {
            paramDomain.setCarrierAddress3(paramDomain.getCarrierAddress3().substring(0, 25));
        }
        if (25 < paramDomain.getSenderAddress1().length()) {
            paramDomain.setSenderAddress1(paramDomain.getSenderAddress1().substring(0, 25));
        }
        if (25 < paramDomain.getSenderAddress2().length()) {
            paramDomain.setSenderAddress2(paramDomain.getSenderAddress2().substring(0, 25));
        }
        if (25 < paramDomain.getSenderAddress3().length()) {
            paramDomain.setSenderAddress3(paramDomain.getSenderAddress3().substring(0, 25));
        }
        // Get the information to be passed to the Web service corresponding to the search criteria. 
        // データ取得(明細情報)
        List<? extends W6001DocInvoiceDomain> dtlDomainList = w6001DocDao.searchTtInvoiceAttached(criteria);
        
        for (W6001DocInvoiceDomain dtlDomain : dtlDomainList) {
            for (W6001DocPltzDomain pltzDomain : dtlDomain.getDocPltzList()) {
                for (W6001DocPltzItemDomain pltzItemDomain : pltzDomain.getDocPltzItemList()) {
                    Ws6001ParamItemDomain itemDomain = new Ws6001ParamItemDomain();
                    
                    itemDomain.setPartNo(StringUtils.defaultString(dtlDomain.getItemNo()));
                    itemDomain.setEtdDueDate(DateUtil.formatDate(pltzItemDomain.getEtdDueDt(), WS_CIGMA_DATE_FORMAT));
                    itemDomain.setCustomerPoNo(StringUtils.defaultString(dtlDomain.getCustomerPoNo()));
                    itemDomain.setCustomerPartNo(StringUtils.defaultString(dtlDomain.getCustomerItemNo()));
                    itemDomain.setInstructedShippingQty(pltzItemDomain.getAllocQty().toPlainString());
                    itemDomain.setShippedQty(pltzItemDomain.getAllocQty().toPlainString());
                    itemDomain.setSalesCompanyPoNo(StringUtils.defaultString(pltzItemDomain.getSalesCompPoNo()));
                    itemDomain.setUnitOfMeasure(StringUtils.defaultString(dtlDomain.getLgcyUnitCd()));
                    itemDomain.setUnitOfMeasureOnDocument(StringUtils.defaultString(dtlDomain.getQtyUnit()));
                    itemDomain.setSalesUnitPrice(StringUtils.defaultString(dtlDomain.getUnitPrice()));
                    itemDomain.setSalesUnitPriceCurCd3Digit(StringUtils.defaultString(dtlDomain.getUnitPriceCurrCd()));
                    itemDomain.setCurrentWarehouse(StringUtils.defaultString(pltzDomain.getCurLgcyWhCd()));
                    // UT413-3 ADD START
                    if (pltzItemDomain.getShippingLot() != null) {
                        itemDomain.setShippingLot(pltzItemDomain.getShippingLot().toPlainString());
                    }
                    // UT413-3 ADD END
                    // UT436 ADD START
                    itemDomain.setItemDescription(
                        StringUtils.defaultString(StringUtils.left(pltzItemDomain.getItemDescription(), 25))
                    );
                    // UT436 ADD END
                    
                    itemDomainList.add(itemDomain);
                }
            }
        }
        paramDomain.setSalesDetailList(itemDomainList);
        return paramDomain;
    }
    
    /**
     * Get information to be passed to the Web service (header part).
     * <br />Webサービスに渡す情報(ヘッダ部分）を取得します。
     * <pre>
     * - Invoice, Invoice Header search
     *   W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.EsuieiarushietchiTtInvoiceByHeaderRegister (W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * ‐インボイス、インボイスヘッダ検索
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTtInvoiceByHeaderRegister(W6001DocCriteriaDomain)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return Information to be passed to the Web service that is acquired (header part)<br />
     * 取得したWebサービスに渡す情報(ヘッダ部分)
     * @throws ApplicationException Can not obtain information to be passed to Web Service (header portion)<br />
     * Webサービスに渡す情報(ヘッダ部分)の取得ができない場合
     */
    protected W6001DocInvoiceDomain searchTtInvoiceByHeaderRegister(String shipperCd, String invoiceNo, Date invoiceIssueDt) 
        throws ApplicationException {
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        // Get information to pass to the Web service corresponding to the search condition (header part). 
        // データ取得
        return w6001DocDao.searchTtInvoiceByHeaderRegister(criteria);
    }
    
    // --- Register画面 Cancel処理 -----------------------------------------------------------------
    
    /**
     * Numbered Cancel Invoice No.
     * <br />キャンセルインボイスNoを採番します。
     * <pre>
     * [If the vendor Invoice No is Numbering
     *   Numbered the Cancel Invoice No from the vendor Invoice No.
     * 
     *   [For the main Invoice] 
     *     Vendor Invoice No. + "C" 
     *   [For FRT Invoice]
     *     Vendor Invoice No. + "C" + SEQUENCE NO 
     * 
     * [If the vendor Invoice No are not numbered]
     *   - Get the Cancel Invoice numbering classification
     *     Call the searchTmCancelInvSeqTyp (String) in the argument SHIPPER CODE.
     * 
     *   - Create Invoice numbering key
     *     "System ID (ECA0027)" + "_" + Number type (※) + "_" + Cancel Invoice numbering classification
     *   
     *   - Cancel Invoice No acquisition
     *     Numbering key that just created, call searchTmInvSeqOnRegister(String, String) with argument SHIPPER CODE.
     * </pre>
     * <pre>
     * [仕入先インボイスNoが採番されている場合]
     *   仕入先インボイスNoからキャンセルインボイスNoを採番します。
     *   
     *   [メインインボイスの場合]
     *         仕入先インボイスNo. + "C"
     *   
     *   [FRTインボイスの場合]
     *         仕入先インボイスNo. + "C" + 連番
     * 
     * [仕入先インボイスNoが採番されていない場合]
     *   ‐キャンセルインボイス採番区分を取得
     *       荷主コードを引数に{@link #searchTmCancelInvSeqTyp(String)}を呼出します。
     * 
     *   ‐インボイス採番キーの作成
     *       "システムID（ECA0027）" + "_" + 品番種類（※） + "_" + キャンセルインボイス採番区分
     *   
     *   ‐キャンセルインボイスNo取得
     *       作成した採番キー、荷主コードを引数に{@link #searchTmInvSeqOnRegister(String, String)}を呼出します。
     * </pre>
     * 
     * @param criteria Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @param ttInvoiceList Cancel Invoice No numbering target data list<br />
     * キャンセルインボイスNo採番対象データリスト
     * @return List of Invoice No cancellation was numbered<br />
     * 採番したキャンセルインボイスNoのリスト
     * @throws ApplicationException Numbering of cancellation Invoice No can not be.<br />
     * キャンセルインボイスNoの採番が出来ない場合。
     */
    protected List<String> transactSequenceCancelInvNo (W6001DocCriteriaDomain criteria, List<? extends TtInvoiceDomain> ttInvoiceList) 
        throws ApplicationException {
   
        List<String> cancelInvoiceNoList = new ArrayList<String>();
        
        int frtCnt = 0;
        for (TtInvoiceDomain ttInvoiceDomain : ttInvoiceList) {
            String cancelInvoiceNo = null;
            
            if (StringUtils.isNotEmpty(ttInvoiceDomain.getSupplierInvoiceNo())) {

                if (!INVOICE_CLASS_FULL_RT.equals(ttInvoiceDomain.getInvoiceClass())) {
         
                    cancelInvoiceNo = String.format(CANCEL_INVOICE_NO_SUPPLIER_FORMAT, ttInvoiceDomain.getSupplierInvoiceNo());
                } else {

                    cancelInvoiceNo = String.format(CANCEL_INVOICE_NO_SUPPLIER_FORMAT_FRT, ttInvoiceDomain.getSupplierInvoiceNo(), frtCnt);
                    frtCnt++;
                }
                
            } else {
                // Get the Cancel Invoice numbering classification. 
                // キャンセルインボイス採番区分取得
                TmCancelInvSeqTypDomain tmCancelinvSeqTypDomain = searchTmCancelInvSeqTyp(ttInvoiceDomain.getShipperCd());
                if (null == tmCancelinvSeqTypDomain) {
                    throw new GscmApplicationException(NXS_E7_0120);
                }
                
                // 2015/11/17 DNJP.Kawamura START >>>>>
//                String seqKey = String.format(SEQ_KEY_CANCEL_INVOICE_NO
//                    , ttInvoiceDomain.getCmlTyp(), tmCancelinvSeqTypDomain.getCancelInvSeqTyp());
                String seqKey = null;
                if (!INVOICE_CLASS_FULL_RT.equals(ttInvoiceDomain.getInvoiceClass())) {
                    seqKey = String.format(SEQ_KEY_CANCEL_INVOICE_NO
                        , ttInvoiceDomain.getCmlTyp(), tmCancelinvSeqTypDomain.getCancelInvSeqTyp());
                } else {
                    seqKey = String.format(SEQ_KEY_CANCEL_INVOICE_NO
                        , INVOICE_CLASS_FULL_RT, tmCancelinvSeqTypDomain.getCancelInvSeqTyp());                    
                }
                // 2015/11/17 DNJP.Kawamura END <<<<<
                
                // Numbered the Invoice No new from Invoice Sequence Master. 
                // キャンセルインボイスNoの採番
                // 2016/04/04 MOD START
                //cancelInvoiceNo = searchTmInvSeqOnRegister(seqKey, criteria.getShipperCd());
                cancelInvoiceNo = searchTmInvSeqOnRegister(seqKey, ttInvoiceDomain.getShipperCd());
                // 2016/04/04 MOD END
            }
            cancelInvoiceNoList.add(cancelInvoiceNo);
        }
        return cancelInvoiceNoList;
    }
    
    /**
     * Acquisition of Invoice No cancellation numbering object data
     * <br />キャンセルインボイスNo採番対象データの取得
     * <pre>
     * - Invoice search
     *   TtInvoiceDomain Set the following items,
     *   TtInvoiceService.SearchByCondition (TtInvoiceCriteriaDomain) Calls.
     *     - Parent Invoice No: Invoice No
     *     - SHIPPER CODE parent of Invoice: SHIPPER CODE
     *     - Parent INVOICE ISSUE DATE: INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * ‐インボイス検索
     *     {@link TtInvoiceDomain}に以下の項目を設定し、
     *     {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼出します。
     *       ‐親インボイスNo：インボイスNo
     *       ‐親インボイスの荷主コード：荷主コード
     *       ‐親インボイス発行日：インボイス発行日
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return List of canceled Invoice No numbering target data obtained<br />
     * 取得したキャンセルインボイスNo採番対象データのリスト
     * @throws ApplicationException Unable to obtain cancellation of Invoice No numbering object data<br />
     * キャンセルインボイスNo採番対象データの取得ができない場合
     */
    protected List<? extends TtInvoiceDomain> searchTtInvoiceOnRegisterByCancel (String shipperCd, String invoiceNo, Date invoiceIssueDt) 
        throws ApplicationException {
        
        TtInvoiceCriteriaDomain criteria = new TtInvoiceCriteriaDomain();
        criteria.setParInvoiceNo(invoiceNo);
        criteria.setParInvoiceShipperCd(shipperCd);
        criteria.setParInvoiceIssueDt(invoiceIssueDt);

        criteria.setPreferredOrder("INVOICE_CLASS desc, INVOICE_NO");
        
        return ttInvoiceService.searchByCondition(criteria);
    }
    
    /**
     * Get the Cancel Invoice numbering classification.
     * <br />キャンセルインボイス採番区分を取得します。
     * <pre>
     * - Cancel Invoice numbering classification per unit Search
     *   Set the following items TmCancelInvSeqTypCriteriaDomain,
     *   Call TmCancelInvSeqTypService.searchByKey(TmCancelInvSeqTypCriteriaDomain).
     *     - COMPANY CODE: SHIPPER CODE
     * </pre>
     * <pre>
     * ‐キャンセルインボイス採番区分原単位検索
     *     {@link TmCancelInvSeqTypCriteriaDomain}に以下の項目を設定し、
     *     {@link TmCancelInvSeqTypService#searchByKey(TmCancelInvSeqTypCriteriaDomain)}を呼出します。
     *       ‐会社コード：荷主コード
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @return Cancel Invoice numbering classification original credits earned<br />
     * 取得したキャンセルインボイス採番区分原単位
     * @throws ApplicationException Can not obtain a cancellation Invoice numbering classification.<br />
     * キャンセルインボイス採番区分を取得できない場合。
     */
    protected TmCancelInvSeqTypDomain searchTmCancelInvSeqTyp (String shipperCd) throws ApplicationException {

        TmCancelInvSeqTypCriteriaDomain criteria = new TmCancelInvSeqTypCriteriaDomain();
        criteria.setCompCd(shipperCd);
        
        return tmCancelInvSeqTypService.searchByKey(criteria);
    }
    
    /**
     * Registered in the table, the data were numbered Cancel Invoice No.
     * <br />キャンセルインボイスNoを採番したデータを、テーブルに登録します。
     * <pre>
     * - Get INVOICE ISSUE DATE.  Call CommonService.searchTimezone(String).
     *
     * - Login user name acquisition getDscName(String)
     * 
     * - Registered in the target table data to be canceled.
     *   - Invoice
     *     Call createTtInvoiceOnRegisterByCancel(List, List, Date, String, String).
     *   
     *   - Invoice Header
     *     Call createTtInvoiceHeaderOnRegisterByCancel(List, List, List, Date).
     *     
     *   - Invoice Attached
     *     Call createTtInvoiceAttachedOnRegisterByCancel(List, List, List, Date).
     *     
     *   - Packing Header
     *     Call createTtPackingHeadOnRegisterByCancel(List, List, List, Date).
     *   
     *   - (No registration FRT products) Packing Attached CML
     *     Call createTtPackingAttachedCmlOnRegisterByCancel(List, List, List, Date).
     *   
     *   - (No registration FRT product) packing attach _ Part
     *     Call createTtPackAtchItemNoOnRegisterByCancel(List, List, List, Date).
     *   
     *   - PDF file creation
     *     Call createPdfFileOnRegister(String, String, Date, String, String, String, String, String, String, String, boolean).
     *    
     *   - Invoice data update before cancellation
     *     Call updateTtInvoiceOnRegisterbyCancel(List).
     * </pre>
     * <pre>
     * ‐インボイス発行日取得
     *     {@link CommonService#searchTimezone(String)}を呼出します。
     * 
     * ‐ログインユーザ氏名取得
     *     {@link #getDscName(String)}
     * 
     * ‐キャンセル対象データを対象テーブルに登録します。
     *     ‐インボイス
     *         {@link #createTtInvoiceOnRegisterByCancel(List, List, Date, String, String)}を呼出します。
     *     
     *     ‐インボイスヘッダ
     *         {@link #createTtInvoiceHeaderOnRegisterByCancel(List, List, List, Date)}を呼出します。
     *     
     *     ‐インボイスアタッチ
     *         {@link #createTtInvoiceAttachedOnRegisterByCancel(List, List, List, Date)}を呼出します。
     *     
     *     ‐パッキングヘッダ
     *         {@link #createTtPackingHeadOnRegisterByCancel(List, List, List, Date)}を呼出します。
     *     
     *     ‐パッキングアタッチ_CML（FRT品は登録なし）
     *         {@link #createTtPackingAttachedCmlOnRegisterByCancel(List, List, List, Date)}を呼出します。
     *     
     *     ‐パッキングアタッチ_品番（FRT品は登録なし）
     *         {@link #createTtPackAtchItemNoOnRegisterByCancel(List, List, List, Date)}を呼出します。
     * 
     * ‐PDFファイルの作成
     *     {@link #createPdfFileOnRegister(String, String, Date, String, String, String, String, String, String, String, boolean)}を呼出します。
     * 
     * ‐キャンセル前インボイスデータ更新
     *     {@link #updateTtInvoiceOnRegisterbyCancel(List)}を呼出します。
     * 
     * </pre>
     * 
     * @param cancelList Be canceled Invoice No<br />
     * キャンセル対象インボイスNo
     * @param cancelInvNoList Cancel Invoice No have numbered<br />
     * 採番したキャンセルインボイスNo
     * @param criteria Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @return Data registered in the Invoice<br />
     * インボイスに登録したデータ
     * @throws ApplicationException Registration processing of the data can not be<br />
     * データの登録処理ができない場合
     */
    protected List<? extends TtInvoiceDomain> createCancelInvoiceNoOnRegister (List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, W6001DocCriteriaDomain criteria)
        throws ApplicationException {

        String shipperCd = criteria.getShipperCd();
        String dscId = criteria.getDscId();
        
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //Date invIssueDt = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd)), Calendar.DAY_OF_MONTH);
        Date invIssueDt = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd)), Calendar.SECOND);
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
        // Get the user name. 
        // ログインユーザ名取得
        String dscNm = getDscName(dscId);
        // Registered in the Invoice Cancel Invoice No. 
        // インボイス登録
        List<? extends TtInvoiceDomain> invoiceList = createTtInvoiceOnRegisterByCancel(cancelList, cancelInvNoList, invIssueDt, dscId, dscNm);
        // Registered in the Invoice Header Cancel Invoice No. 
        // インボイスヘッダ登録
        createTtInvoiceHeaderOnRegisterByCancel(cancelList, cancelInvNoList, invoiceList, invIssueDt);
        // Registered in Packing Header Cancel Invoice No. 
        // パッキングヘッダ登録
        createTtPackingHeadOnRegisterByCancel(cancelList, cancelInvNoList, invoiceList, invIssueDt);
        // Registered in the Invoice Attached Cancel Invoice No. 
        // インボイスアタッチ登録
        createTtInvoiceAttachedOnRegisterByCancel(cancelList, cancelInvNoList, invoiceList, invIssueDt);
        // Registered in the Invoice Attached Cancel Invoice No. 
        // パッキングアタッチCML登録
        createTtPackingAttachedCmlOnRegisterByCancel(cancelList, cancelInvNoList, invoiceList, invIssueDt);
        // Registered in the packing attach Part Cancel Invoice No. 
        // パッキングアタッチ品番登録
        createTtPackAtchItemNoOnRegisterByCancel(cancelList, cancelInvNoList, invoiceList, invIssueDt);
        // Create a document PDF, can register on the File Manage. 
        // PDFファイルの作成
        for (int i = 0; i < invoiceList.size(); i++) {
            TtInvoiceDomain ttInvDomain = cancelList.get(i);
            createPdfFileOnRegister(ttInvDomain.getShipperCd(), cancelInvNoList.get(i)
                , invIssueDt, ttInvDomain.getInvTplNo(), dscId
                , ttInvDomain.getCmlTyp(), ttInvDomain.getInvoiceCtgry(), ttInvDomain.getInvoiceClass()
                , criteria.getReportDateFormat(), criteria.getCharCd(), false);
        }
        // Update the Invoice data before cancellation. 
        // キャンセル前インボイスデータ更新
        updateTtInvoiceOnRegisterbyCancel(cancelList);
        
        return invoiceList;
    }
    
    /**
     * Registered in the Invoice Cancel Invoice No.
     * <br />キャンセルインボイスNoをインボイスに登録します。
     * <pre>
     * - Get Invoice information before cancellation
     *   Set the following items TtInvoiceCriteriaDomain,
     *   Call (TtInvoiceCriteriaDomain) TtInvoiceService.searchByKey.
     * 
     * - Register to Invoice
     *   Set the following items TtInvoiceDomain, 
     *   Call TtInvoiceService.create(List).
     * </pre>
     * <pre>
     * ‐キャンセル前のインボイス情報を取得
     *     {@link TtInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TtInvoiceService#searchByKey(TtInvoiceCriteriaDomain)}を呼出します。
     * 
     * ‐インボイスに登録
     *     {@link TtInvoiceDomain}に以下の項目を設定し、
     *     {@link TtInvoiceService#create(List)}を呼出します。
     * </pre>
     * 
     * @param cancelList List of data be canceled<br />
     * キャンセル対象データのリスト
     * @param cancelInvNoList List of Invoice No cancellation was numbered<br />
     * 採番したキャンセルインボイスNoのリスト
     * @param invIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param dscId DSC-ID of the login's<br />
     * ログイン者のDSC-ID
     * @param dscNm Login name of person<br />
     * ログイン者の氏名
     * @return Registration data list of Invoice<br />
     * インボイスの登録データリスト
     * @throws ApplicationException Can not register on the Cancel Invoice Invoice No<br />
     * キャンセルインボイスNoをインボイスに登録出来ない場合
     */
    protected List<? extends TtInvoiceDomain> createTtInvoiceOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, Date invIssueDt, String dscId, String dscNm) 
        throws ApplicationException {
        
        List<TtInvoiceDomain> domainList = new ArrayList<TtInvoiceDomain>();
        for (int i = 0; i < cancelList.size(); i++) {
            TtInvoiceDomain cancelDomain = cancelList.get(i);
            
            TtInvoiceCriteriaDomain criteria = new TtInvoiceCriteriaDomain();
            criteria.setShipperCd(cancelDomain.getShipperCd());
            criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
            criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());

            TtInvoiceDomain orgDomain = ttInvoiceService.searchByKey(criteria);
            
            String parCancelInvNo = cancelInvNoList.get(i);
            if (INVOICE_CLASS_FULL_RT.equals(cancelDomain.getInvoiceClass())) {
                parCancelInvNo = cancelInvNoList.get(0);
            }
            
            TtInvoiceDomain domain = new TtInvoiceDomain();
            CommonUtil.copyPropertiesDomainToDomain(domain, orgDomain);
            
            domain.setInvoiceNo(cancelInvNoList.get(i));
            domain.setInvoiceIssueDt(invIssueDt);
            domain.setManualInvoiceIssueDt(invIssueDt);
            domain.setCancelTyp(CANCEL_TYP_CANCEL);
            domain.setCancelInvoiceNo(cancelDomain.getInvoiceNo());
            domain.setCancelInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
            domain.setParInvoiceNo(parCancelInvNo);
            domain.setParInvoiceIssueDt(invIssueDt);
            domain.setNetAmount(orgDomain.getNetAmount().negate());
            domain.setFreight(orgDomain.getFreight().negate());
            domain.setInsurance(orgDomain.getInsurance().negate());
            domain.setSubTotal(orgDomain.getSubTotal().negate());
            domain.setVat(orgDomain.getVat().negate());
            domain.setHandlingCharge(orgDomain.getHandlingCharge().negate());
            domain.setAdditionalCharge(orgDomain.getAdditionalCharge().negate());
            domain.setTotalInvoiceAmount(orgDomain.getTotalInvoiceAmount().negate());
            domain.setNoCharge(orgDomain.getNoCharge().negate());
            domain.setInvoiceIssuerId(dscId);
            domain.setInvoiceIssuerNm(dscNm);
            
            commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);
            
            domainList.add(domain);
        }

        ttInvoiceService.create(domainList);
        
        return domainList;
    }
    
    /**
     * Registered in the Invoice Header Cancel Invoice No.
     * <br />キャンセルインボイスNoをインボイスヘッダに登録します。
     * <pre>
     * - Get Invoice Header information before cancellation
     *   Set the following items TtInvoiceHeaderCriteriaDomain,
     *   Call (TtInvoiceHeaderCriteriaDomain) TtInvoiceHeaderService.searchByKey.
     * 
     * - Register to Invoice Header
     *   Set the following items TtInvoiceHeaderDomain,
     *   Call TtInvoiceHeaderService.create(List).
     * </pre>
     * <pre>
     * ‐キャンセル前のインボイスヘッダ情報を取得
     *     {@link TtInvoiceHeaderCriteriaDomain}に以下の項目を設定し、
     *     {@link TtInvoiceHeaderService#searchByKey(TtInvoiceHeaderCriteriaDomain)}を呼出します。
     * 
     * ‐インボイスヘッダに登録
     *     {@link TtInvoiceHeaderDomain}に以下の項目を設定し、
     *     {@link TtInvoiceHeaderService#create(List)}を呼出します。
     * </pre>
     * 
     * @param cancelList List of data be canceled<br />
     * キャンセル対象データのリスト
     * @param cancelInvNoList List of Invoice No cancellation was numbered<br />
     * 採番したキャンセルインボイスNoのリスト
     * @param createInvoiceList Data registered in the Invoice<br />
     * インボイスに登録したデータ
     * @param invIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @throws ApplicationException Can not register on the Invoice Header Cancel Invoice No<br />
     * キャンセルインボイスNoをインボイスヘッダに登録出来ない場合
     */
    protected void createTtInvoiceHeaderOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) 
        throws ApplicationException {
        
        List<TtInvoiceHeaderDomain> domainList = new ArrayList<TtInvoiceHeaderDomain>();
        for (int i = 0; i < cancelList.size(); i++) {
            TtInvoiceDomain cancelDomain = cancelList.get(i);
            
            TtInvoiceHeaderCriteriaDomain criteria = new TtInvoiceHeaderCriteriaDomain();
            criteria.setShipperCd(cancelDomain.getShipperCd());
            criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
            criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
            
            TtInvoiceHeaderDomain orgDomain = ttInvoiceHeaderService.searchByKey(criteria);
            
            TtInvoiceHeaderDomain domain = new TtInvoiceHeaderDomain();
            CommonUtil.copyPropertiesDomainToDomain(domain, orgDomain);
            
            domain.setInvoiceNo(cancelInvNoList.get(i));
            domain.setInvoiceIssueDt(invIssueDt);
            domain.setCancelTyp(CANCEL_TYP_CANCEL);
            domain.setCancelInvoiceNo(cancelDomain.getInvoiceNo());
            domain.setCancelInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
            domain.setNetAmount(orgDomain.getNetAmount().negate());
            domain.setFreight(orgDomain.getFreight().negate());
            domain.setInsurance(orgDomain.getInsurance().negate());
            domain.setSubTotal(orgDomain.getSubTotal().negate());
            domain.setVat(orgDomain.getVat().negate());
            domain.setHandlingCharge(orgDomain.getHandlingCharge().negate());
            domain.setAdditionalCharge(orgDomain.getAdditionalCharge().negate());
            domain.setTotalInvoiceAmount(orgDomain.getTotalInvoiceAmount().negate());
            domain.setNoCharge(orgDomain.getNoCharge().negate());
            domain.setFileId(null);
            domain.setDeleteFlg(createInvoiceList.get(i).getDeleteFlg());
            
            commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);
            
            domainList.add(domain);
        }

        ttInvoiceHeaderService.create(domainList);
    }
    
    /**
     * Registered in Packing Header Cancel Invoice No.
     * <br />キャンセルインボイスNoをパッキングヘッダに登録します。
     * <pre>
     * - Get Packing Header information before cancellation
     *   Set the following items TtPackingHeadCriteriaDomain,
     *   Call TtPackingHeadService.searchByKey(TtPackingHeadCriteriaDomain).
     * 
     * - Register to Packing Header
     *   Set the following items TtPackingHeadDomain,
     *   Call TtPackingHeadService.create(List).
     * </pre>
     * <pre>
     * ‐キャンセル前のパッキングヘッダ情報を取得
     *     {@link TtPackingHeadCriteriaDomain}に以下の項目を設定し、
     *     {@link TtPackingHeadService#searchByKey(TtPackingHeadCriteriaDomain)}を呼出します。
     * 
     * ‐パッキングヘッダに登録
     *     {@link TtPackingHeadDomain}に以下の項目を設定し、
     *     {@link TtPackingHeadService#create(List)}を呼出します。
     * </pre>
     * 
     * @param cancelList List of data be canceled<br />
     * キャンセル対象データのリスト
     * @param cancelInvNoList List of Invoice No cancellation was numbered<br />
     * 採番したキャンセルインボイスNoのリスト
     * @param createInvoiceList List of data registered in the Invoice<br />
     * インボイスに登録したデータのリスト
     * @param invIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @throws ApplicationException Can not register on the Packing Header Cancel Invoice No<br />
     * キャンセルインボイスNoをパッキングヘッダに登録出来ない場合
     */
    protected void createTtPackingHeadOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) 
        throws ApplicationException {
    
        List<TtPackingHeadDomain> domainList = new ArrayList<TtPackingHeadDomain>();
        for (int i = 0; i < cancelList.size(); i++) {
            TtInvoiceDomain cancelDomain = cancelList.get(i);
            
            TtPackingHeadCriteriaDomain criteria = new TtPackingHeadCriteriaDomain();
            criteria.setShipperCd(cancelDomain.getShipperCd());
            criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
            criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
            
            TtPackingHeadDomain orgDomain = ttPackingHeadService.searchByKey(criteria);
            
            TtPackingHeadDomain domain = new TtPackingHeadDomain();
            CommonUtil.copyPropertiesDomainToDomain(domain, orgDomain);
            
            domain.setInvoiceNo(cancelInvNoList.get(i));
            domain.setInvoiceIssueDt(invIssueDt);
            domain.setCancelTyp(CANCEL_TYP_CANCEL);
            domain.setCancelInvoiceNo(cancelDomain.getInvoiceNo());
            domain.setCancelInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
            domain.setFileId(null);
            domain.setDeleteFlg(createInvoiceList.get(i).getDeleteFlg());
            
            commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);
            
            domainList.add(domain);
        }

        ttPackingHeadService.create(domainList);
    }
    
    /**
     * Registered in the Invoice Attached Cancel Invoice No.
     * <br />キャンセルインボイスNoをインボイスアタッチに登録します。
     * <pre>
     * - Get Invoice Attached information before cancellation
     *   Set the following items TtInvoiceAttachedCriteriaDomain,
     *   Call TtInvoiceAttachedService.searchByKey(TtInvoiceAttachedCriteriaDomain).
     * 
     * - Register to Invoice Attached
     *   Set the following items TtInvoiceAttachedDomain,
     *   Call TtInvoiceAttachedService.create(List).
     * </pre>
     * <pre>
     * ‐キャンセル前のインボイスアタッチ情報を取得
     *     {@link TtInvoiceAttachedCriteriaDomain}に以下の項目を設定し、
     *     {@link TtInvoiceAttachedService#searchByKey(TtInvoiceAttachedCriteriaDomain)}を呼出します。
     * 
     * ‐インボイスアタッチに登録
     *     {@link TtInvoiceAttachedDomain}に以下の項目を設定し、
     *     {@link TtInvoiceAttachedService#create(List)}を呼出します。
     * </pre>
     * 
     * @param cancelList List of data be canceled<br />
     * キャンセル対象データのリスト
     * @param cancelInvNoList List of Invoice No cancellation was numbered<br />
     * 採番したキャンセルインボイスNoのリスト
     * @param createInvoiceList List of data registered in the Invoice<br />
     * インボイスに登録したデータのリスト
     * @param invIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @throws ApplicationException Can not register on the Invoice Attached Cancel Invoice No<br />
     * キャンセルインボイスNoをインボイスアタッチに登録出来ない場合
     */
    protected void createTtInvoiceAttachedOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) 
        throws ApplicationException {
    
        List<TtInvoiceAttachedDomain> domainList = new ArrayList<TtInvoiceAttachedDomain>();
        for (int i = 0; i < cancelList.size(); i++) {
            TtInvoiceDomain cancelDomain = cancelList.get(i);
            
            TtInvoiceAttachedCriteriaDomain criteria = new TtInvoiceAttachedCriteriaDomain();
            criteria.setShipperCd(cancelDomain.getShipperCd());
            criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
            criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
            
            List<? extends TtInvoiceAttachedDomain> orgList = ttInvoiceAttachedService.searchByCondition(criteria);
            
            // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
            if (orgList.size() != 0) {
            // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
                for (TtInvoiceAttachedDomain orgDomain : orgList) {
                    TtInvoiceAttachedDomain domain = new TtInvoiceAttachedDomain();
                    CommonUtil.copyPropertiesDomainToDomain(domain, orgDomain);
                    
                    domain.setInvoiceNo(cancelInvNoList.get(i));
                    domain.setInvoiceIssueDt(invIssueDt);
                    domain.setCancelTyp(CANCEL_TYP_CANCEL);
                    domain.setQty(orgDomain.getQty().negate());
                    domain.setAmount(orgDomain.getAmount().negate());
                    domain.setDeleteFlg(createInvoiceList.get(i).getDeleteFlg());
                    
                    commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);
                    
                    domainList.add(domain);
                }
            // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
            }
            // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
        }
        
        // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
        if (domainList.size() != 0) {
        // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
            ttInvoiceAttachedService.create(domainList);
        // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
        }
        // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
    }
    
    /**
     * Registered in the Invoice Attached Cancel Invoice No.
     * <br />キャンセルインボイスNoをインボイスアタッチに登録します。
     * <pre>
     * Following only the main Invoice.
     * - Get packing attach CML information before cancellation
     *   Set the following items TtPackingAttachedCmlCriteriaDomain,
     *   Call TtPackingAttachedCmlService.searchByKey(TtPackingAttachedCmlCriteriaDomain).
     * 
     * - Register to attach packing CML
     *   Set the following items TtPackingAttachedCmlDomain,
     *   Call TtPackingAttachedCmlService.create(List).
     * </pre>
     * <pre>
     * メインインボイスのみ下記の処理を行います。
     * ‐キャンセル前のパッキングアタッチCML情報を取得
     *     {@link TtPackingAttachedCmlCriteriaDomain}に以下の項目を設定し、
     *     {@link TtPackingAttachedCmlService#searchByKey(TtPackingAttachedCmlCriteriaDomain)}を呼出します。
     * 
     * ‐パッキングアタッチCMLに登録
     *     {@link TtPackingAttachedCmlDomain}に以下の項目を設定し、
     *     {@link TtPackingAttachedCmlService#create(List)}を呼出します。
     * </pre>
     * 
     * @param cancelList List of data be canceled<br />
     * キャンセル対象データのリスト
     * @param cancelInvNoList List of Invoice No cancellation was numbered<br />
     * 採番したキャンセルインボイスNoのリスト
     * @param createInvoiceList List of data registered in the Invoice<br />
     * インボイスに登録したデータのリスト
     * @param invIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @throws ApplicationException Can not register on the packing attach CML Cancel Invoice No<br />
     * キャンセルインボイスNoをパッキングアタッチCMLに登録出来ない場合
     */
    protected void createTtPackingAttachedCmlOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) 
        throws ApplicationException {
    
        List<TtPackingAttachedCmlDomain> domainList = new ArrayList<TtPackingAttachedCmlDomain>();
        for (int i = 0; i < cancelList.size(); i++) {
            TtInvoiceDomain cancelDomain = cancelList.get(i);
            // Check the invoice class as a main invoice class.
            // メインインボイスのみ
            if (!INVOICE_CLASS_FULL_RT.equals(cancelDomain.getInvoiceClass())) {
            
                // 検索条件ドメインの設定
                TtPackingAttachedCmlCriteriaDomain criteria = new TtPackingAttachedCmlCriteriaDomain();
                criteria.setShipperCd(cancelDomain.getShipperCd());
                criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
                criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
                
                List<? extends TtPackingAttachedCmlDomain> orgList = ttPackingAttachedCmlService.searchByCondition(criteria);
                
                for (TtPackingAttachedCmlDomain orgDomain : orgList) {
                    TtPackingAttachedCmlDomain domain = new TtPackingAttachedCmlDomain();
                    CommonUtil.copyPropertiesDomainToDomain(domain, orgDomain);
                    
                    domain.setInvoiceNo(cancelInvNoList.get(i));
                    domain.setInvoiceIssueDt(invIssueDt);
                    domain.setCancelTyp(CANCEL_TYP_CANCEL);
                    domain.setDeleteFlg(createInvoiceList.get(i).getDeleteFlg());
                    
                    commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);
                    
                    domainList.add(domain);
                }
            }
        }

        ttPackingAttachedCmlService.create(domainList);
    }
    
    /**
     * Registered in the packing attach Part Cancel Invoice No.
     * <br />キャンセルインボイスNoをパッキングアタッチ品番に登録します。
     * <pre>
     * Following only the main Invoice.
     * - Get packing attach part number information before cancellation
     *   Set the following items TtPackAtchItemNoCriteriaDomain,
     *   Call TtPackAtchItemNoService.searchByKey(TtPackAtchItemNoCriteriaDomain).
     * 
     * - Register to attach packing Part
     *   Set the following items TtPackAtchItemNoDomain,
     *   Call TtPackAtchItemNoService.create (List).
     * </pre>
     * <pre>
     * メインインボイスのみ下記の処理を行います。
     * ‐キャンセル前のパッキングアタッチ品番情報を取得
     *     {@link TtPackAtchItemNoCriteriaDomain}に以下の項目を設定し、
     *     {@link TtPackAtchItemNoService#searchByKey(TtPackAtchItemNoCriteriaDomain)}を呼出します。
     * 
     * ‐パッキングアタッチ品番に登録
     *     {@link TtPackAtchItemNoDomain}に以下の項目を設定し、
     *     {@link TtPackAtchItemNoService#create(List)}を呼出します。
     * </pre>
     * 
     * @param cancelList List of data be canceled<br />
     * キャンセル対象データのリスト
     * @param cancelInvNoList List of Invoice No cancellation was numbered<br />
     * 採番したキャンセルインボイスNoのリスト
     * @param createInvoiceList List of data registered in the Invoice<br />
     * インボイスに登録したデータのリスト
     * @param invIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @throws ApplicationException Can not register on the packing attach Part Cancel Invoice No<br />
     * キャンセルインボイスNoをパッキングアタッチ品番に登録出来ない場合
     */
    protected void createTtPackAtchItemNoOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) 
        throws ApplicationException {
    
        List<TtPackAtchItemNoDomain> domainList = new ArrayList<TtPackAtchItemNoDomain>();
        for (int i = 0; i < cancelList.size(); i++) {
            TtInvoiceDomain cancelDomain = cancelList.get(i);
            // Check the invoice class as a main invoice class.
            // メインインボイスのみ
            if (!INVOICE_CLASS_FULL_RT.equals(cancelDomain.getInvoiceClass())) {
            
                TtPackAtchItemNoCriteriaDomain criteria = new TtPackAtchItemNoCriteriaDomain();
                criteria.setShipperCd(cancelDomain.getShipperCd());
                criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
                criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
                
                List<? extends TtPackAtchItemNoDomain> orgList = ttPackAtchItemNoService.searchByCondition(criteria);
                
                for (TtPackAtchItemNoDomain orgDomain : orgList) {

                    TtPackAtchItemNoDomain domain = new TtPackAtchItemNoDomain();
                    CommonUtil.copyPropertiesDomainToDomain(domain, orgDomain);
                    
                    domain.setInvoiceNo(cancelInvNoList.get(i));
                    domain.setInvoiceIssueDt(invIssueDt);
                    domain.setCancelTyp(CANCEL_TYP_CANCEL);
                    domain.setQty(orgDomain.getQty().negate());
                    domain.setDeleteFlg(createInvoiceList.get(i).getDeleteFlg());
                    
                    commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);
                    
                    domainList.add(domain);
                }
            }
        }

        ttPackAtchItemNoService.create(domainList);
    }
    
    /**
     * Update the Invoice data before cancellation.
     * <br />キャンセル前インボイスデータを更新します。
     * <pre>
     * Make a CANCEL FLAG of Invoice table
     * - Invoice update
     *   Set the narrowing-down condition updates to TtInvoiceDomain, to TtInvoiceCriteriaDomain
     *   Call TtInvoiceService.updateByCondition(List, List).
     *     Updated content
     *       - CANCEL FLAG: 'Y'
     *     Narrowing conditions
     *       - SHIPPER CODE
     *       - Invoice No
     *       - INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * インボイステーブルのキャンセルフラグを立てる
     * ‐インボイス更新
     *     {@link TtInvoiceDomain}に更新内容、{@link TtInvoiceCriteriaDomain}に絞込条件を設定し
     *     {@link TtInvoiceService#updateByCondition(List, List)}を呼出します。
     *       更新内容
     *         ‐キャンセルフラグ：'Y'
     *       絞込条件
     *         ‐荷主コード
     *         ‐インボイスNo
     *         ‐インボイス発行日
     * </pre>
     * 
     * @param cancelList List of target cancellation Invoice data<br />
     * キャンセル対象インボイスデータのリスト
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Can not update the Invoice data.<br />
     * インボイスデータの更新ができない場合。
     */
    protected int updateTtInvoiceOnRegisterbyCancel (List<? extends TtInvoiceDomain> cancelList) 
        throws ApplicationException {
        
        List<TtInvoiceDomain> domainList = new ArrayList<TtInvoiceDomain>();
        List<TtInvoiceCriteriaDomain> criteriaList = new ArrayList<TtInvoiceCriteriaDomain>();
        
        for (TtInvoiceDomain cancelDomain : cancelList) {
            TtInvoiceDomain domain = new TtInvoiceDomain();
            domain.setCancelFlg(FLAG_Y);

            commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6009);
            
            TtInvoiceCriteriaDomain criteria = new TtInvoiceCriteriaDomain();
            criteria.setShipperCd(cancelDomain.getShipperCd());
            criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
            criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
            
            commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6009);
            
            domainList.add(domain);
            criteriaList.add(criteria);
        }
        
        return ttInvoiceService.updateByCondition(domainList, criteriaList);
    }
    
    /**
     * Do update of Invoice No. Palletize of the table, a change of Palletize STATUS.
     * <br />パレタイズテーブルのインボイスNo.の更新、パレタイズステータスの変更を行います。
     * <pre>
     * Do if the update process of the main Invoice. 
     * - Acquisition and lock the data to be updated
     *   Set the search criteria argument domain of the screen,
     *   Call W6001DocDao.lockByNoWaitTtPltzByPltzStatus(W6001DocCriteriaDomain).
     * 
     * - Palletize update
     *   Set the following items W6001DocCriteriaDomain,
     *   Call W6001DocDao.updateTtPltzByPltzStatus(W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - Palletize STATUS
     * </pre>
     * <pre>
     * メインインボイスの場合更新処理を行います。
     * ‐更新対象データの取得&ロック
     *     画面の検索条件ドメインを引数に設定し、
     *     {@link W6001DocDao#lockByNoWaitTtPltzByPltzStatus(W6001DocCriteriaDomain)}を呼出します。
     * 
     * ‐パレタイズ更新
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定して、
     *     {@link W6001DocDao#updateTtPltzByPltzStatus(W6001DocCriteriaDomain)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *       ‐パレタイズステータス
     * </pre>
     * 
     * @param ttInvoiceDomain Invoice domain <br />
     * インボイスドメイン
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Not possible to update the table Palletize.<br />
     * パレタイズテーブルの更新ができない場合。
     */
    protected int updateTtPltzOnRegisterbyCancel(TtInvoiceDomain ttInvoiceDomain, W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        // Check the invoice class as a main invoice class.
        // FRTインボイスの場合、何もしない
        if (INVOICE_CLASS_FULL_RT.equals(ttInvoiceDomain.getInvoiceClass())) {
            return 0;
        }
        List<? extends W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        try {
            docPltzList = w6001DocDao.lockByNoWaitTtPltzByPltzStatus(criteria);
        } catch (ApplicationException e) {
            throw new GscmApplicationException(NXS_E1_0010);
        }
        if (null == docPltzList || docPltzList.isEmpty()) {
            throw new GscmApplicationException(NXS_E1_0010);
        }
        
        for (W6001DocPltzDomain docPltzDomain : docPltzList) {
            // Check errors.
            // 更新対象CMLのステータスが進んでいる場合エラー
            if (CUSTOM_TIMING_TYPE_A.equals(ttInvoiceDomain.getCustomTimingTyp())
                && !PLTZ_STATUS_CUSTOMS_CLEARANCE_A.equals(docPltzDomain.getPltzStatus())) {
                throw new GscmApplicationException(NXS_E7_0077);
                
            } else if (CUSTOM_TIMING_TYPE_B.equals(ttInvoiceDomain.getCustomTimingTyp())
                && !PLTZ_STATUS_CUSTOMS_CLEARANCE_B.equals(docPltzDomain.getPltzStatus())) {
                throw new GscmApplicationException(NXS_E7_0077);
                
            } else if (CUSTOM_TIMING_TYPE_Z.equals(ttInvoiceDomain.getCustomTimingTyp())
                && !PLTZ_STATUS_CUSTOMS_CLEARANCE_Z.equals(docPltzDomain.getPltzStatus())) {
                throw new GscmApplicationException(NXS_E7_0077);
                
            }
        }

        W6001DocCriteriaDomain updateDomain = new W6001DocCriteriaDomain();
        updateDomain.setShipperCd(criteria.getShipperCd());
        updateDomain.setInvoiceNo(criteria.getInvoiceNo());
        updateDomain.setInvoiceIssueDt(criteria.getInvoiceIssueDt());

        if (CUSTOM_TIMING_TYPE_A.equals(ttInvoiceDomain.getCustomTimingTyp())) {
            updateDomain.setPltzStatus(PLTZ_STATUS_SHIPPING_COMFIRMATION_ACTUAL);
        } else if (CUSTOM_TIMING_TYPE_B.equals(ttInvoiceDomain.getCustomTimingTyp())) {
            updateDomain.setPltzStatus(PLTZ_STATUS_STG_ACT);
        } else if (CUSTOM_TIMING_TYPE_Z.equals(ttInvoiceDomain.getCustomTimingTyp())) {
            updateDomain.setPltzStatus(PLTZ_STATUS_STG_INSTR_WORKED_DONE);
        }

        commonService.setCommonPropertyForUpdate(updateDomain, SCREEN_ID_W6009);
        
        return w6001DocDao.updateTtPltzByPltzStatus(updateDomain);
    }
    
    /**
     * Do the addition of Temp Stock.
     * <br />仮在庫の加算を行います。
     * <pre>
     * Part number that created the customs documents, Subtract the Temp Stock.
     * - Get the update-source information
     *   Call searchTtPltzOnRegisterForTtTmpStock(String, String, Date).
     * 
     * - Lock Temp Stock
     *   Set the following items in the update-source information obtained in TtTmpStockCriteriaDomain,
     *   Call TtTmpStockService.lockByKeyNoWait (TtTmpStockCriteriaDomain).
     *     - LEGACY_WH_CD
     *     - SHIPPER_CD
     *     - ITEM_NO
     *     - PKG_CD
     * 
     * - Temp Stock update
     *   For the data it is locked, set the updates to TtTmpStockDomain,
     *   Call TtTmpStockService.updateByCondition(List, List).
     *     Updated content
     *       - The QTY: (Temp Stock.QTY) + Update-source information acquired.SUM(QTY)
     * </pre>
     * <pre>
     * 通関書類を作成した品番について、仮在庫を減算します。
     * ‐更新元情報の取得
     *     {@link #searchTtPltzOnRegisterForTtTmpStock(String, String, Date)}を呼出します。
     * 
     * ‐仮在庫をロック
     *     {@link TtTmpStockCriteriaDomain}に取得した更新元情報の以下の項目を設定し、
     *     {@link TtTmpStockService#lockByKeyNoWait(TtTmpStockCriteriaDomain)}を呼出します。
     *       ‐LEGACY_WH_CD
     *       ‐SHIPPER_CD
     *       ‐ITEM_NO
     *       ‐PKG_CD
     * 
     * ‐仮在庫更新
     *     ロックしたデータに対し、{@link TtTmpStockDomain}に更新内容を設定し、
     *     {@link TtTmpStockService#updateByCondition(List, List)}を呼出します。
     *       更新内容
     *         ‐QTY：(仮在庫.QTY) + 取得した更新元情報.SUM(QTY)
     * </pre>
     * 
     * @param ttInvoiceDomain Invoice domain <br />
     * インボイスドメイン
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Addition of Temp Stock can not be<br />
     * 仮在庫の加算ができない場合
     */
    protected int updateTtTmpStockOnRegisterByQtyAdd(TtInvoiceDomain ttInvoiceDomain, W6001DocCriteriaDomain criteria) 
        throws ApplicationException {
        
        if (!(INVOICE_CLASS_MAIN.equals(ttInvoiceDomain.getInvoiceClass()) && CML_TYPE_CIGMA.equals(ttInvoiceDomain.getCmlTyp()))) {
            return 0;
        }
        
        List<TtTmpStockCriteriaDomain> criteriaList = new ArrayList<TtTmpStockCriteriaDomain>();
        List<TtTmpStockDomain> domainList = new ArrayList<TtTmpStockDomain>();
        // Get the update data to be registered in the Temp Stock. 
        // 更新元情報の取得
        List<? extends W6001DocPltzDomain> docPltzList = searchTtPltzOnRegisterForTtTmpStock(criteria.getShipperCd()
            , criteria.getInvoiceNo(), criteria.getInvoiceIssueDt());
        if (docPltzList == null || docPltzList.isEmpty()) {
            return 0;
        }
        
        for (W6001DocPltzDomain docPltzDomain : docPltzList) {
            for (W6001DocPltzItemDomain pltzItemDomain : docPltzDomain.getDocPltzItemList()) {

                TtTmpStockCriteriaDomain ttTmpStockCriteria = new TtTmpStockCriteriaDomain();
                ttTmpStockCriteria.setLgcyWhCd(docPltzDomain.getCurLgcyWhCd());
                ttTmpStockCriteria.setShipperCd(docPltzDomain.getShipperCd());
                ttTmpStockCriteria.setItemNo(pltzItemDomain.getPltzItemNo());
                ttTmpStockCriteria.setPkgCd(pltzItemDomain.getPkgCd());
                TtTmpStockDomain ttTmpStockDomain = new TtTmpStockDomain();
                try {
                    ttTmpStockDomain = ttTmpStockService.lockByKeyNoWait(ttTmpStockCriteria);
                } catch (ApplicationException e) {
                    throw new GscmApplicationException(NXS_E1_0010);
                }
                if (null == ttTmpStockDomain) {
                    throw new GscmApplicationException(NXS_E1_0010);
                }
                
                TtTmpStockDomain domain = new TtTmpStockDomain();
                domain.setQty(ttTmpStockDomain.getQty().add(pltzItemDomain.getSumQty()));

                commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6009);
                
                criteriaList.add(ttTmpStockCriteria);
                domainList.add(domain);
            }
        }

        return ttTmpStockService.updateByCondition(domainList, criteriaList);
    }
    
    /**
     * Subtraction SHIPPED QUANTITY, the number of times the shipping instruction.
     * <br />出荷数量、出荷指示回数の減算をします。
     * <pre>
     * - Get the update-source information
     *   Call searchTtPltzOnRegisterForTtExpRcvOdr(String, String, Date) to the argument the following items .
     *     - SHIPPER CODE screen
     *     - Invoice No of screen
     *     - INVOICE ISSUE DATE of the screen
     * 
     * - Rock of data to be updated (Export Receive Order)
     *   Set the following items that obtained in the update-source information to TtExpRcvOdrCriteriaDomain,
     *   Call TtExpRcvOdrService.lockByKeyNoWait(TtExpRcvOdrCriteriaDomain).
     *     - RCV_ODR_COMP_CD
     *     - CUSTOMER_CD
     *     - LGCY_SHIP_TO
     *     - ITEM_NO
     *     - PKG_CD
     *     - TRNS_CD
     *     - ETD_DUT_DT
     *     - CUSTOMER_PO_NO
     *     - CUSTOMER_ITEM_NO
     *     - CUSTOMER_ITEM_NO_ORG
     *     - ODR_CTRL_NO
     * 
     * - Update of Export Receive Order table
     *   Call for the data to set the updates to TtExpRcvOdrDomain, it is locked.
     *      -SHIPPED_QTY:. Export Receive Order SHIPPED_QTY
     *      -. SUM update source information (ALLOC_QTY)
     *      - PARTIAL_DELIV_CNT: Subtract 1
     *      - SHIPPED_TYP: If "3" (shipped ), SHIPPED_TYP update "2" (PKG already )
     * </pre>
     * <pre>
     * ‐更新元情報の取得
     *     以下の項目を引数に{@link #searchTtPltzOnRegisterForTtExpRcvOdr(String, String, Date)}を呼出します。
     *       ‐画面の荷主コード
     *       ‐画面のインボイスNo
     *       ‐画面のインボイス発行日
     *     
     * ‐更新対象データのロック（輸出受注）
     *     {@link TtExpRcvOdrCriteriaDomain}に更新元情報で取得した以下の項目を設定し、
     *     {@link TtExpRcvOdrService#lockByKeyNoWait(TtExpRcvOdrCriteriaDomain)}を呼出します。
     *       ‐RCV_ODR_COMP_CD
     *       ‐CUSTOMER_CD
     *       ‐LGCY_SHIP_TO
     *       ‐ITEM_NO
     *       ‐PKG_CD
     *       ‐TRNS_CD
     *       ‐ETD_DUT_DT
     *       ‐CUSTOMER_PO_NO
     *       ‐CUSTOMER_ITEM_NO
     *       ‐CUSTOMER_ITEM_NO_ORG
     *       ‐ODR_CTRL_NO
     * 
     * ‐輸出受注テーブルの更新
     *     {@link TtExpRcvOdrDomain}に更新内容を設定し、ロックしたデータに対して
     *     {@link TtExpRcvOdrService#updateByCondition(List, List)}を呼出します。
     *       ‐SHIPPED_QTY：輸出受注.SHIPPED_QTY - 更新元情報.SUM(ALLOC_QTY)
     *       ‐PARTIAL_DELIV_CNT：1を減算
     *       ‐SHIPPED_TYP：SHIPPED_TYPが"3"（出荷済み）の場合、"2"（梱包済み）に更新
     * </pre>
     * 
     * @param ttInvoiceDomain Be canceled Invoice domain<br />
     * キャンセル対象インボイスドメイン
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Can not update SHIPPED QUANTITY, of the number of shipping instructions<br />
     * 出荷数量、出荷指示回数の更新ができない場合
     */
    protected int updateTtExpRcvOdrOnRegisterSubtract (TtInvoiceDomain ttInvoiceDomain, W6001DocCriteriaDomain criteria) 
        throws ApplicationException {
        
        if (!(INVOICE_CLASS_MAIN.equals(ttInvoiceDomain.getInvoiceClass()) && CML_TYPE_CIGMA.equals(ttInvoiceDomain.getCmlTyp()))) {
            return 0;
        }
        
        List<TtExpRcvOdrCriteriaDomain> criteriaList = new ArrayList<TtExpRcvOdrCriteriaDomain>();
        List<TtExpRcvOdrDomain> domainList = new ArrayList<TtExpRcvOdrDomain>();
        // Get the update source information SHIPPED QUANTITY, the number of times the shipping instruction. 
        // 更新元情報取得
        List<? extends W6001DocPltzItemOdrDomain> pltzOdrList = searchTtPltzOnRegisterForTtExpRcvOdr(criteria.getShipperCd()
            , criteria.getInvoiceNo(), criteria.getInvoiceIssueDt());
        
        for (W6001DocPltzItemOdrDomain pltzOdrDomain : pltzOdrList) {

            TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
            ttExpRcvOdrCriteria.setRcvOdrCompCd(pltzOdrDomain.getRcvOdrCompCd());
            ttExpRcvOdrCriteria.setCustomerCd(pltzOdrDomain.getCustomerCd());
            ttExpRcvOdrCriteria.setLgcyShipTo(pltzOdrDomain.getLgcyShipTo());
            ttExpRcvOdrCriteria.setItemNo(pltzOdrDomain.getItemNo());
            ttExpRcvOdrCriteria.setPkgCd(pltzOdrDomain.getPkgCd());
            ttExpRcvOdrCriteria.setTrnsCd(pltzOdrDomain.getTrnsCd());
            ttExpRcvOdrCriteria.setEtdDueDt(pltzOdrDomain.getEtdDueDt());
            ttExpRcvOdrCriteria.setCustomerPoNo(pltzOdrDomain.getCustomerPoNo());
            ttExpRcvOdrCriteria.setCustomerItemNo(pltzOdrDomain.getCustomerItemNo());
            ttExpRcvOdrCriteria.setCustomerItemNoOrg(pltzOdrDomain.getCustomerItemNoOrg());
            ttExpRcvOdrCriteria.setOdrCtrlNo(pltzOdrDomain.getOdrCtrlNo());
            TtExpRcvOdrDomain ttExpRcvOdrDomain = new TtExpRcvOdrDomain();
            try {
                ttExpRcvOdrDomain = ttExpRcvOdrService.lockByKeyNoWait(ttExpRcvOdrCriteria);
            } catch (ApplicationException e) {
                throw new GscmApplicationException(NXS_E1_0010);
            }
            if (null == ttExpRcvOdrDomain) {
                throw new GscmApplicationException(NXS_E1_0010);
            }
            
            if (ttExpRcvOdrDomain.getPartialDelivCnt().compareTo(BigDecimal.ZERO) <= 0) {
                throw new GscmApplicationException(NXS_E1_0057);
            }
            
            TtExpRcvOdrDomain domain = new TtExpRcvOdrDomain();
            domain.setShippedQty(ttExpRcvOdrDomain.getShippedQty().subtract(pltzOdrDomain.getSumAllocQty()));
            domain.setPartialDelivCnt(ttExpRcvOdrDomain.getPartialDelivCnt().subtract(BigDecimal.ONE));
            if (SHIPPED_TYP_COMPLETE_SHIPPING.equals(ttExpRcvOdrDomain.getShippedTyp())) {
                domain.setShippedTyp(SHIPPED_TYP_COMPLETE_PACKING);
            }

            commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6009);
            
            if (domain.getShippedQty().compareTo(BigDecimal.ZERO) < 0) {
                throw new GscmApplicationException(NXS_E1_0055);
            }
            
            criteriaList.add(ttExpRcvOdrCriteria);
            domainList.add(domain);
        }

        return ttExpRcvOdrService.updateByCondition(domainList, criteriaList);
    }
    
    /**
     * For CIGMA, perform the sales and orders and stock cancellation.
     * <br />CIGMAに対し、売上・受注・在庫キャンセルを行います。
     * <pre>
     * -Web to get the data to pass to the service, create a delivery parameters.
     *  Argument in the following items that have been registered to Invoice
     *  Call searchTtInvoiceOnRegisterByCancelForWs(String, String, Date).
     *    - SHIPPER CODE
     *    - Invoice No
     *    - INVOICE ISSUE DATE
     * 
     * - Web service call
     *   Argument in the following items:
     *   Call Ws6002RestService.cancelSalesOdrInvntry(String, String, String, String, String).
     *     - COMPANY CODE
     *     - Created Delivery parameters
     * </pre>
     * <pre>
     * ‐Webサービスに渡すデータを取得し、引き渡しパラメータを作成します。
     *     インボイスに登録した以下の項目を引数に
     *     {@link #searchTtInvoiceOnRegisterByCancelForWs(String, String, Date)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     * 
     * Webサービス呼出し
     *     以下の項目を引数に
     *     {@link Ws6002RestService#cancelSalesOdrInvntry(String, String, String, String, String)}を呼出します。
     *       ‐会社コード
     *       ‐作成した引き渡しパラメータ
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @param ttInvoiceList Invoice registration data list<br />
     * インボイス登録データリスト
     * @throws ApplicationException For CIGMA, Not possible to sales, orders and stock registration<br />
     * CIGMAに対し、売上・受注・在庫登録が出来ない場合
     */
    protected void callWebService6002(String compCd, List<? extends TtInvoiceDomain> ttInvoiceList)
        throws ApplicationException {
        for (TtInvoiceDomain ttInvDomain : ttInvoiceList) {
            if (!(CML_TYPE_CIGMA.equals(ttInvDomain.getCmlTyp()) && INVOICE_CLASS_MAIN.equals(ttInvDomain.getInvoiceClass()))) {
                continue;
            }
            // Get the information to be passed to the Web service. 
            // Webサービスに渡すデータ取得
            W6001DocInvoiceDomain docInvDomain = searchTtInvoiceOnRegisterByCancelForWs(ttInvDomain.getShipperCd()
                , ttInvDomain.getInvoiceNo(), ttInvDomain.getInvoiceIssueDt());
            // Get the information of shipping documents MA by using the (WS6002) Web Services. 
            // Webサービス呼出し
            ResultDomain resultDomain = ws6002RestService.cancelSalesOdrInvntry(compCd
                , StringUtil.getEmptyToBlank(docInvDomain.getCancelInvoiceNo())
                , StringUtil.getEmptyToBlank(docInvDomain.getInvoiceNo())
                // 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
                , docInvDomain.getInvoiceIssueDt()
                // 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<
                , StringUtil.getEmptyToBlank(docInvDomain.getLibPgm())
                , StringUtil.getEmptyToBlank(docInvDomain.getJobHost())
                , StringUtil.getEmptyToBlank(docInvDomain.getJobUser())
                , StringUtil.getEmptyToBlank(docInvDomain.getJobPassword())
                , StringUtil.getEmptyToBlank(docInvDomain.getJobDescription()));
            if (WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
                // 処理なし
            } else if(WS_RESULT_ERROR_SYSTEM.equals(resultDomain.getResultCode())) {
                throw new GscmApplicationException(NXS_E1_0058);
            } else {
                ErrorListItemDomain errorListItem = resultDomain.getErrorList().get(0);
                
                if (!CollectionUtils.isEmpty(errorListItem.getErrorParamList())) {
                    List<Object> params = new ArrayList<Object>();
                    for (ErrorParamListItemDomain param : errorListItem.getErrorParamList()) {
                        params.add(param.getParam());
                    }
                    throw new GscmApplicationException(errorListItem.getErrorCode(), params.toArray());
                } else {
                    throw new GscmApplicationException(errorListItem.getErrorCode());
                }
            }
        }
    }
    
    /**
     * Get the information to be passed to the Web service.
     * <br />Webサービスに渡す情報を取得します。
     * <pre>
     * - Invoice, CIGMA Environment Master Search
     *   W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.EsuieiaruchTtInvoiceByHeaderCancel (W6001DocCriteriaDomain).
     *      - SHIPPER CODE
     *      - Invoice No
     *      - INVOICE ISSUE DATE 
     * </pre>
     * <pre>
     * ‐インボイス、CIGMA環境原単位検索
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTtInvoiceByHeaderCancel(W6001DocCriteriaDomain)}を呼び出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return Web services delivery information obtained<br />
     * 取得したWebサービス引渡し情報
     * @throws ApplicationException Can not obtain a Web service delivery information<br />
     * Webサービス引渡し情報を取得できない場合
     */
    protected W6001DocInvoiceDomain searchTtInvoiceOnRegisterByCancelForWs(String shipperCd, String invoiceNo, Date invoiceIssueDt) 
        throws ApplicationException {
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        
        return w6001DocDao.searchTtInvoiceByHeaderCancel(criteria);
    }
    
    // --- W6006関連--------------------------------------------------------------------------------
    /**
     * Grouping information creation of Invoice
     * <br />インボイスのグルーピング情報作成
     * <pre>
     * - Registration of Invoice Number created for work
     *   Call createTwInvItemOnInvoiceGroupingBySearch(String, String, String).
     * 
     * - Get the items in the Invoice for grouping from CIGMA
     *   Call updateTwInvPltzOnInvoiceGroupingBySearchForCigma(String, String, String, List).
     * 
     * - Item Acquisition of Invoice for grouping from PKG Materials MA
     *   Call updateTwInvPltzOnInvoiceGroupingBySearchForRt(String, String, String).
     * 
     * - The numbering of the group No.1 Invoide Palletize Work
     * 
     * - Numbering the group No.1 of Part Invoice created for work(Unity of the main Invoice)
     * 
     * - Numbering the group No.2 of Invoice created for Part Number work(Group of Full-RT Invoice)
     * 
     * - Registration of Invoice Group Work
     * </pre>
     * <pre>
     * - インボイス作成対象品番ワークの登録
     *     {@link #createTwInvItemOnInvoiceGroupingBySearch(String, String, String)}を呼び出します。
     * 
     * - CIGMAからインボイスグルーピング用の項目を取得
     *     {@link #updateTwInvPltzOnInvoiceGroupingBySearchForCigma(String, String, String, List)}を呼び出します。
     * 
     * - 包装材原単位からインボイスグルーピング用の項目取得
     *     {@link #updateTwInvPltzOnInvoiceGroupingBySearchForRt(String, String, String)}を呼び出します。
     * 
     * - インボイス作成対象パレタイズワークのグループNo.1を採番
     * 
     * - インボイス作成対象品番ワークのグループNo.1を採番(メインインボイスのまとまり)
     * 
     * - インボイス作成対象品番ワークのグループNo.2を採番(Full-RTインボイスのまとまり)
     * 
     * - インボイスグループワークの登録
     * </pre>
     * 
     * @param criteria Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @throws ApplicationException If the grouping of information created nvoice can not be<br />
     * インボイスのグルーピング情報作成ができない場合
     */
    protected void createInvoiceGroupingInformation (W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        
        String firstTimeFlg = criteria.getFirstTimeFlg();
        String dscId = criteria.getDscId();
        String shipperCd = criteria.getShipperCd();
        // Register the Invoice created for part number work. 
        // インボイス作成対象品番ワークの登録
        List<? extends W6001DocPltzDomain> docInvPltzList = createTwInvItemOnInvoiceGroupingBySearch(firstTimeFlg, dscId, shipperCd);
        // Get and set the items in the Invoice for grouping from CIGMA (only CIGMA product). 
        // CIGMAからインボイスグルーピング用の項目を取得
        updateTwInvPltzOnInvoiceGroupingBySearchForCigma(firstTimeFlg, dscId, shipperCd, docInvPltzList);
        // UT284 ADD START
        // Revice the price terms and trade terms.
        // 建値条件・契約条件の上書き
        updateTwInvItemBySearchForTradeTermsRevice(firstTimeFlg, dscId, shipperCd);
        // UT284 ADD END
        // Update the items in the Invoice for grouping from PKG Materials MA. 
        // 包装材原単位からインボイスグルーピング用の項目取得
        updateTwInvPltzOnInvoiceGroupingBySearchForRt(firstTimeFlg, dscId, shipperCd);
        // Numbered the group No.1 of Invoide Palletize Work. 
        // インボイス作成対象パレタイズワークのグループNo.1を採番
        updateTwInvPltzOnInvoiceGroupingBySearchForGrpNo1(firstTimeFlg, dscId, shipperCd);
        // Numbered the (main group of Invoice) group No.1 of Part Invoice created for work. 
        // インボイス作成対象品番ワークのグループNo.1を採番(メインインボイスのまとまり)
        updateTwInvItemOnInvoiceGroupingBySearchForGrpNo1(firstTimeFlg, dscId, shipperCd);
        // Numbered the (group of Full-RT Invoice) group No.2 of Part Invoice created for work. 
        // インボイス作成対象品番ワークのグループNo.2を採番(Full-RTインボイスのまとまり)
        updateTwInvItemOnInvoiceGroupingBySearchForGrpNo2(firstTimeFlg, dscId, shipperCd);
        // Register the Invoice Group Work. 
        // インボイスグループワークの登録
        createTwInvOnInvoiceGroupingBySearch(firstTimeFlg, dscId, shipperCd);

        updateTwInvPltzOnInvoiceGroupingByRemoveFlg(dscId, shipperCd);
    }
    
    /**
     * Register the Invoice created for part number work.
     * <br />インボイス作成対象品番ワークの登録をします。
     * <pre>
     * ["N" is the first execution flag]
     *   (Does not perform subsequent processing), not the registration process
     * 
     * [Yes Invoice Number created for work get the results]
     *   (Does not perform subsequent processing), not the registration process
     * 
     * - Registration data acquisition
     *   Set the following items W6001DocCriteriaDomain,
     *   Call W6001DocDao.searchTwInvPltzByGropingInfo(W6001DocCriteriaDomain).
     * 
     * - Invoice Number work created for registration
     *   Is set to TwInvItemDomain registration data acquired,
     *   Call TwInvItemService.create(List).
     * </pre>
     * <pre>
     * [初回実行フラグが"N"]
     *   登録処理をしない(以降の処理を行わない)
     * 
     * [インボイス作成対象品番ワーク取得結果あり]
     *    登録処理をしない(以降の処理を行わない)
     * 
     * - 登録データ取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTwInvPltzByGropingInfo(W6001DocCriteriaDomain)}を呼出します。
     * 
     * - インボイス作成対象品番ワーク登録
     *     取得した登録データを{@link TwInvItemDomain}に設定し、
     *     {@link TwInvItemService#create(List)}を呼出します。
     * </pre>
     * 
     * @param firstTimeFlg First run flag<br />
     * 初回実行フラグ
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @return List of Invoide Palletize Work<br />
     * インボイス作成対象パレタイズワークのリスト
     * @throws ApplicationException Can not register the Invoice created for part number work.<br />
     * インボイス作成対象品番ワークを登録できない場合。
     */
    protected List<? extends W6001DocPltzDomain> createTwInvItemOnInvoiceGroupingBySearch (String firstTimeFlg, String dscId, String shipperCd) 
        throws ApplicationException {
        // Check the first time processing flag.
        // 処理の実施要否
        if (FLAG_N.equals(firstTimeFlg)) {
            return null;
        }
        
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        docCriteria.setDscId(dscId);
        docCriteria.setShipperCd(shipperCd);
        List<? extends W6001DocPltzDomain> docPltzList = w6001DocDao.searchTwInvPltzByGropingInfo(docCriteria);
        
        BigDecimal sortNo = BigDecimal.ZERO;
        List<TwInvItemDomain> twInvItemList = new ArrayList<TwInvItemDomain>();
        for (W6001DocPltzDomain docPltzDomain : docPltzList) {
            for (W6001DocPltzItemDomain docPltzItemDomain : docPltzDomain.getDocPltzItemList()) {
                TwInvItemDomain twInvItemDomain = new TwInvItemDomain();
                    
                CommonUtil.copyPropertiesDomainToDomain(twInvItemDomain, docPltzItemDomain);
                twInvItemDomain.setItemNo(docPltzItemDomain.getPltzItemNo());
                twInvItemDomain.setQty(docPltzItemDomain.getSumQty());
                BigDecimal netWeight = commonService.convertWeightUnit(docPltzItemDomain.getItemWeight().multiply(docPltzItemDomain.getSumQty())
                    , docPltzItemDomain.getWeightUnit(), docPltzItemDomain.getWeightUnit());
                if (null == netWeight) {
                    Object[] params = { 
                        commonService.getResource(null, "label.netWeight") 
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
                twInvItemDomain.setNetWeight(netWeight);
                twInvItemDomain.setShipperCd(docPltzDomain.getShipperCd());
                twInvItemDomain.setCmlTyp(docPltzDomain.getCmlTyp());
                twInvItemDomain.setDscId(dscId);
                twInvItemDomain.setSortOdr(sortNo);
                sortNo = sortNo.add(BigDecimal.ONE); 
                twInvItemDomain.setFree1RegFlg(FLAG_Y);
                twInvItemDomain.setFree1OriginCntryFlg(FLAG_N);
                twInvItemDomain.setFree2RegFlg(FLAG_Y);
                twInvItemDomain.setFree2OriginCntryFlg(FLAG_N);
                twInvItemDomain.setFree3RegFlg(FLAG_Y);
                twInvItemDomain.setFree3OriginCntryFlg(FLAG_N);
                twInvItemDomain.setGrpNo1("0");
                twInvItemDomain.setGrpNo2("0");
                twInvItemDomain.setRemoveFlg(FLAG_N);
                twInvItemDomain.setDecisionFlg(FLAG_N);
                
                commonService.setCommonPropertyForRegist(twInvItemDomain, SCREEN_ID_W6006);
                
                twInvItemList.add(twInvItemDomain);
            }
        }

        twInvItemService.create(twInvItemList);
        
        return docPltzList;
    }
    
    /**
     * Get and set the items in the Invoice for grouping from CIGMA (only CIGMA product).
     * <br />CIGMAからインボイスグルーピング用の項目を取得・設定します(CIGMA品のみ)。
     * <pre>
     * ["N" is the first execution flag]
     *   (Does not perform subsequent processing), not the registration process
     * 
     * - Web service call (Ws6003)
     *   Call callWebService6003(String, List).
     * 
     * - Invoide Palletize Work update
     *   Set the narrowing-down condition updates to TwInvPltzDomain, in TwInvPltzCriteriaDomain,
     *   Call TwInvPltzService.updateByCondition(List, List).
     *     Updated content
     *       - Data from Web Service
     *     Narrowing conditions
     *       - Login DSC-ID
     *       - SHIPPER CODE
     *       - CUSTOMER_CD: CustomerNo that was acquired in Web services
     * </pre>
     * <pre>
     * [初回実行フラグが"N"]
     *   登録処理をしない(以降の処理を行わない)
     * 
     * - Webサービス呼出(Ws6003)
     *     {@link #callWebService6003(String, List)}を呼び出します。
     * 
     * - インボイス作成対象パレタイズワーク更新
     *     {@link TwInvPltzDomain}に更新内容、{@link TwInvPltzCriteriaDomain}に絞込条件を設定し、
     *     {@link TwInvPltzService#updateByCondition(List, List)}を呼び出します。
     *       更新内容
     *         - Webサービスから取得したデータ
     *       絞込条件
     *         - ログインDSC-ID
     *         - 荷主コード
     *         - CUSTOMER_CD：Webサービスで取得したCustomerNo
     * </pre>
     * 
     * @param firstTimeFlg First run flag<br />
     * 初回実行フラグ
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param docInvPltzList List of Invoide Palletize Work<br />
     * インボイス作成対象パレタイズワークのリスト
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException If Invoide Palletize Work can not update<br />
     * インボイス作成対象パレタイズワークが更新できない場合 
     */
    protected int updateTwInvPltzOnInvoiceGroupingBySearchForCigma(String firstTimeFlg, String dscId, String shipperCd, List<? extends W6001DocPltzDomain> docInvPltzList) 
        throws ApplicationException {
        // Check the first time processing flag.
        // 処理の実施要否
        if (FLAG_N.equals(firstTimeFlg)) {
            return 0;
        }
        // Web service call (W6003) 
        // Webサービス呼出し
        Ws6003ResultDomain resultDomain = callWebService6003(shipperCd, docInvPltzList);
        if (!WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
            if (resultDomain.getErrorList().isEmpty()) {
                throw new SystemException(NXS_91_0001);
            } else {
                throw new GscmApplicationException(resultDomain.getErrorList().get(0).getErrorCode());
            }
        }
        
        List<TwInvPltzDomain> domainList = new ArrayList<TwInvPltzDomain>();
        List<TwInvPltzCriteriaDomain> criteriaList = new ArrayList<TwInvPltzCriteriaDomain>();
        
        if (resultDomain.getShipDocList() != null && !resultDomain.getShipDocList().isEmpty()) {
            for (Ws6003ResultItemDomain resultItemDomain : resultDomain.getShipDocList()) {
                TwInvPltzCriteriaDomain criteria = new TwInvPltzCriteriaDomain();
                criteria.setDscId(dscId);
                criteria.setShipperCd(shipperCd);
                criteria.setCustomerCd(resultItemDomain.getCustomerCd());
                criteria.setCmlTyp(CML_TYPE_CIGMA);
                
                TwInvPltzDomain domain = new TwInvPltzDomain();
                CommonUtil.copyProperties(domain, resultItemDomain, null);
                
                domain.setCustomerCd(null);
                
                // FREIGHT_RESPONSIBLE_CD
                if (CIGMA_FREIGHT_RESPONSIBLE_CD_PREPAID.equals(resultItemDomain.getFreight())) {
                    domain.setFreightResponsibleCd(FREIGHT_RESPONSIBLE_CD_PREPAID);
                } else {
                    domain.setFreightResponsibleCd(FREIGHT_RESPONSIBLE_CD_COLLECT);
                }
                domain.setTradeTerms(resultItemDomain.getTradeTerms());
                
                commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6006);
                
                domainList.add(domain);
                criteriaList.add(criteria);
            }
        }

        return twInvPltzService.updateByCondition(domainList, criteriaList);
    }
    
    /**
     * Web service call (W6003)
     * <br />Webサービス呼出し(W6003)
     * <pre>
     * - Delivery parameter creation
     *   The CUSTOMER_CD of CIGMA products from Invoide Palletize Work
     *   Converted to a string of comma filler.
     * 
     * - Web service call (W6003)
     *   Call Ws6003RestService.getShippingDocInfo(String, String).
     * </pre>
     * <pre>
     * - 引き渡しパラメータ作成
     *     インボイス作成対象パレタイズワークからCIGMA品のCUSTOMER_CDを
     *     カンマ繋ぎの文字列に変換します。
     * 
     * - Webサービス呼出し（W6003）
     *     {@link Ws6003RestService#getShippingDocInfo(String, String)}を呼び出します。
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param docPltzList List of Invoide Palletize Work<br />
     * インボイス作成対象パレタイズワークのリスト
     * @return Web service call result<br />
     * Webサービス呼出し結果
     * @throws ApplicationException Call to the Web service can not be<br />
     * Webサービスの呼び出しができない場合
     */
    protected Ws6003ResultDomain callWebService6003 (String shipperCd, List<? extends W6001DocPltzDomain> docPltzList) 
        throws ApplicationException {
        
        StringBuffer customerCdLegacy = new StringBuffer();
        for (W6001DocPltzDomain pltzDomain : docPltzList) {
            // Check the CML_TYPE as a CIGMA.
            // CIGMA品のみ
            if (CML_TYPE_CIGMA.equals(pltzDomain.getCmlTyp())) {
                if (customerCdLegacy.length() > 0) {
                    customerCdLegacy.append(WS_PARAM_DELIM);
                }
                customerCdLegacy.append(pltzDomain.getCustomerCd());
            }
        }
        // CIGMA対象品なし
        if (customerCdLegacy.length() == 0) {
            return new Ws6003ResultDomain(WS_RESULT_SUCCESS);
        }
        return ws6003RestService.getShippingDocInfo(shipperCd, customerCdLegacy.toString());
    }

    /**
     * Override price terms and trade terms
     * <br />建値条件・契約条件の上書き。
     *
     * UT284 ADD
     *
     * <pre>
     * Depending on the import base, because there is a thing that should be set a value
     * different from the value obtained a price terms and trade terms from CIGMA,
     * check the original unit in the NEXUS, to override
     * </pre>
     * <pre>
     * 輸入拠点によっては、建値条件・契約条件をCIGMAから取得した値とは異なる値をセットすべきものがあるため、NEXUS内の原単位をチェックし、上書きする。
     * </pre>
     *
     * @param firstTimeFlg First run flag<br />
     * 初回実行フラグ
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @throws ApplicationException If Invoide Palletize Work can not update<br />
     * インボイス作成対象パレタイズワークが更新できない場合
     */
    protected void updateTwInvItemBySearchForTradeTermsRevice(String firstTimeFlg, String dscId, String shipperCd)
        throws ApplicationException {

        if (!FLAG_Y.equals(firstTimeFlg)) {
            return;
        }

        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setShipperCd(shipperCd);
        commonService.setCommonPropertyForUpdate(criteria, SCREEN_ID_W6007);
        w6001DocDao.updateTwInvItemBySearchForTradeTermsRevice(criteria);
    }

    /**
     * Update the items in the Invoice for grouping from PKG Materials MA.
     * <br />包装材原単位からインボイスグルーピング用の項目を更新します。
     * <pre>
     * ["N" is the first execution flag]
     *   (Does not perform subsequent processing), not the registration process
     * 
     * - Registration data acquisition
     *   Set the following items W6001DocCriteriaDomain,
     *   Call W6001DocDao.searchTmPkgMtrl(W6001DocCriteriaDomain).
     *     - Login DSC-ID
     *     - SHIPPER CODE
     * 
     * - Updated Invoice Number created for work
     *   Set the narrowing-down condition updates to TwInvItemDomain, in TwInvItemCriteriaDomain,
     *   Call TwInvItemService.updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain).
     *     Updated content
     *       - CURR_CD:. CURR_CD registration data acquisition
     *       - UNIT_PRICE:. CUSTOMS_VALUATION registration data acquisition
     *     Narrowing conditions
     *       - Login DSC-ID
     *       - SHIPPER CODE
     *       - RT_FLG: "Y"
     * </pre>
     * <pre>
     * [初回実行フラグが"N"]
     *   登録処理をしない(以降の処理を行わない)
     * 
     * - 登録データ取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTmPkgMtrl(W6001DocCriteriaDomain)}を呼び出します。
     *       - ログインDSC-ID
     *       - 荷主コード
     * 
     * - インボイス作成対象品番ワークを更新
     *     {@link TwInvItemDomain}に更新内容、{@link TwInvItemCriteriaDomain}に絞込条件を設定し、
     *     {@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}を呼び出します。
     *       更新内容
     *         - CURR_CD:登録データ取得.CURR_CD
     *         - UNIT_PRICE:登録データ取得.CUSTOMS_VALUATION
     *       絞込条件
     *         - ログインDSC-ID
     *         - 荷主コード
     *         - RT_FLG:"Y"
     * </pre>
     * 
     * @param firstTimeFlg First run flag<br />
     * 初回実行フラグ
     * @param dscId DSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Can not update the items in the Invoice for grouping.<br />
     * インボイスグルーピング用の項目を更新できない場合。
     */
    protected int updateTwInvPltzOnInvoiceGroupingBySearchForRt (String firstTimeFlg, String dscId, String shipperCd)
        throws ApplicationException {
        // Check the first time processing flag.
        // 処理の実施要否
        if (FLAG_N.equals(firstTimeFlg)) {
            return 0;
        }
        
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        docCriteria.setDscId(dscId);
        docCriteria.setShipperCd(shipperCd);
        // Get the items in the Invoice for grouping from the RT material PKG Materials MA. 
        // 登録データ取得
        List<? extends W6001DocPltzItemDomain> pltzItemList = w6001DocDao.searchTmPkgMtrl(docCriteria);
        
        List<TwInvItemDomain> domainList = new ArrayList<TwInvItemDomain>();
        List<TwInvItemCriteriaDomain> criteriaList = new ArrayList<TwInvItemCriteriaDomain>();
        if (pltzItemList != null && !pltzItemList.isEmpty()) {
            for (W6001DocPltzItemDomain docPltzDomain : pltzItemList) {
                TwInvItemDomain domain = new TwInvItemDomain();
                
                // 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
//                domain.setCurrCd(docPltzDomain.getCurrCd());
                domain.setCurrCd(StringUtil.getEmptyToBlank(docPltzDomain.getCurrCd()));
                // 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<
                domain.setUnitPrice(docPltzDomain.getCustomsValuation());

                commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6006);            
                
                TwInvItemCriteriaDomain criteria = new TwInvItemCriteriaDomain();
                criteria.setDscId(dscId);
                criteria.setShipperCd(shipperCd);
                criteria.setRtFlg(FLAG_Y);
                criteria.setMainMark(docPltzDomain.getMainMark());
                criteria.setBrch(docPltzDomain.getBrch());
                criteria.setSortOdr(docPltzDomain.getSortOdr());
                
                domainList.add(domain);
                criteriaList.add(criteria);
            }
        }
        
        return twInvItemService.updateByCondition(domainList, criteriaList);
    }
    
    /**
     * Numbered the group No.1 of Invoide Palletize Work.
     * <br />インボイス作成対象パレタイズワークのグループNo.1を採番します。
     * <pre>
     * - Data obtained by Invoice Summary item
     *   Set the following items W6001DocCriteriaDomain,
     *   Call W6001DocDao.searchTwInvPltzByGroup (W6001DocCriteriaDomain).
     *     - Login DSC-ID
     *     - SHIPPER CODE
     *     - First run flag
     * 
     * - Numbering already Invoice No acquisition
     *   Set the following items TwInvPltzCriteriaDomain,
     *   Call TwInvPltzService.searchByCondition(TwInvPltzCriteriaDomain).
     *     - Login DSC-ID
     *     - SHIPPER CODE
     *     - DISPLAY ORDER: descending Group No.first
     * 
     * - Determine the Group No.first to register
     *   Can get a pre- numbering Invoice No, and then numbered from the maximum of VALUE +1 GRP_NO_1 acquired .
     *   Could not be obtained , and then numbered from 0 .
     * 
     * - Invoide Palletize Work update
     *   Set the narrowing-down condition updates to TwInvPltzDomain, in TwInvPltzCriteriaDomain,
     *   Call TwInvPltzService.updateByCondition(List, List).
     *     Updated content
     *       - GRP_NO_1
     *     Narrowing conditions
     *       - Data obtained in the Invoice Summary item
     * </pre>
     * <pre>
     * - インボイスまとめ項目でデータ取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTwInvPltzByGroup(W6001DocCriteriaDomain)}を呼び出します。
     *       - ログインDSC-ID
     *       - 荷主コード
     *       - 初回実行フラグ
     * 
     * - 採番済みインボイスNo取得
     *     {@link TwInvPltzCriteriaDomain}に以下の項目を設定し、
     *     {@link TwInvPltzService#searchByCondition(TwInvPltzCriteriaDomain)}を呼び出します。
     *       - ログインDSC-ID
     *       - 荷主コード
     *       - 表示順：Group No.firstの降順
     * 
     * - 登録するGroup No.firstを決定する
     *   採番済みインボイスNoを取得できた場合、取得したGRP_NO_1の最大値+1から採番します。
     *   取得できなかった場合は、0から採番します。
     * 
     * 
     * - インボイス作成対象パレタイズワーク更新
     *     {@link TwInvPltzDomain}に更新内容、{@link TwInvPltzCriteriaDomain}に絞込条件を設定し、
     *     {@link TwInvPltzService#updateByCondition(List, List)}を呼び出します。
     *       更新内容
     *         - GRP_NO_1
     *       絞込条件
     *         - インボイスまとめ項目で取得したデータ
     * </pre>
     * 
     * @param firstTimeFlg First run flag<br />
     * 初回実行フラグ
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Can not numbering the Group no.first in groups Main Invoice<br />
     * MainインボイスのまとまりでGroup no.firstを採番できない場合
     */
    protected int updateTwInvPltzOnInvoiceGroupingBySearchForGrpNo1 (String firstTimeFlg, String dscId, String shipperCd)
        throws ApplicationException {
        
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        docCriteria.setDscId(dscId);
        docCriteria.setShipperCd(shipperCd);
        docCriteria.setFirstTimeFlg(firstTimeFlg);
        // Get the Invoice summary item. 
        // インボイスまとめ項目取得
        List<? extends W6001DocPltzDomain> docPltzList = w6001DocDao.searchTwInvPltzByGroup(docCriteria);
        
        TwInvPltzCriteriaDomain twInvPltzCriteria = new TwInvPltzCriteriaDomain();
        twInvPltzCriteria.setDscId(dscId);
        twInvPltzCriteria.setShipperCd(shipperCd);
        twInvPltzCriteria.setGrpNo1GreaterThanEqual("0");
        twInvPltzCriteria.setPreferredOrder("GRP_NO_1 desc");
        List<? extends TwInvPltzDomain> twInvPltzList = twInvPltzService.searchByCondition(twInvPltzCriteria);
        
        int grpNo1 = 0;
        if (twInvPltzList != null && !twInvPltzList.isEmpty()) {
            // Numbered grpNo1.
            // 採番済み
            grpNo1 = Integer.parseInt(twInvPltzList.get(0).getGrpNo1()) + 1;
        }
        
        List<TwInvPltzCriteriaDomain> criteriaList = new ArrayList<TwInvPltzCriteriaDomain>();
        List<TwInvPltzDomain> domainList = new ArrayList<TwInvPltzDomain>();
        for (W6001DocPltzDomain docPltzDomain : docPltzList) {
            TwInvPltzCriteriaDomain criteria = new TwInvPltzCriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(criteria, docPltzDomain);
            if(FLAG_N.equals(firstTimeFlg)) {
                criteria.setRemoveFlg(FLAG_Y);
            }
            
            TwInvPltzDomain domain = new TwInvPltzDomain();
            domain.setGrpNo1(Integer.toString(grpNo1));
            
            commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6006);
            
            domainList.add(domain);
            criteriaList.add(criteria);
            
            grpNo1++;
        }

        return twInvPltzService.updateByCondition(domainList, criteriaList);
    }
    
    /**
     * Numbered the (main group of Invoice) group No.1 of Part Invoice created for work.
     * <br />インボイス作成対象品番ワークのグループNo.1（メインインボイスのまとまり）を採番します。
     * <pre>
     * - Get the update-source data
     *   Set the following items W6001DocCriteriaDomain,
     *   Call W6001DocDao.searchTwInvPltzByGroupNo1 (W6001DocCriteriaDomain).
     *     - Login DSC-ID
     *     - SHIPPER CODE
     *     - First run flag
     * 
     * - Invoice created for Part work update
     *   Set the narrowing-down condition updates to TwInvItemDomain, to TwInvItemCriteriaDomain
     *   Call TwInvItemService.updateByCondition(List, List).
     *     Updated content
     *       - GRP_NO_1: GRP_NO_1 update of the original data
     *     Narrowing conditions
     *       - DSC-ID, SHIPPER_CD, MAIN_MARK which has been acquired in the update-source data
     * </pre>
     * <pre>
     * - 更新元データの取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTwInvPltzByGroupNo1(W6001DocCriteriaDomain)}を呼び出します。
     *       - ログインDSC-ID
     *       - 荷主コード
     *       - 初回実行フラグ
     * 
     * - インボイス作成対象品番ワーク更新
     *     {@link TwInvItemDomain}に更新内容、{@link TwInvItemCriteriaDomain}に絞込条件を設定し
     *     {@link TwInvItemService#updateByCondition(List, List)}を呼び出します。
     *       更新内容
     *         - GRP_NO_1: 更新元データのGRP_NO_1
     *       絞込条件
     *         - 更新元データで取得したDSC-ID, SHIPPER_CD, MAIN_MARK
     * </pre>
     * 
     * @param firstTimeFlg First run flag<br />
     * 初回実行フラグ
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Unable to numbering of the group No.1 of Part Invoice created for work.<br />
     * インボイス作成対象品番ワークのグループNo.1の採番ができない場合。
     */
    protected int updateTwInvItemOnInvoiceGroupingBySearchForGrpNo1 (String firstTimeFlg, String dscId, String shipperCd)
        throws ApplicationException {
        
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        docCriteria.setDscId(dscId);
        docCriteria.setShipperCd(shipperCd);
        docCriteria.setFirstTimeFlg(firstTimeFlg);
        // Get the registration data of Invoice Group Work. 
        // 更新元データ取得
        List<? extends W6001DocPltzDomain> docPltzList = w6001DocDao.searchTwInvPltzByGroupNo1(docCriteria);

        List<TwInvItemDomain> domainList = new ArrayList<TwInvItemDomain>();
        List<TwInvItemCriteriaDomain> criteriaList = new ArrayList<TwInvItemCriteriaDomain>();
        for (W6001DocPltzDomain docPltzDomain : docPltzList) {
            TwInvItemCriteriaDomain criteria = new TwInvItemCriteriaDomain();
            criteria.setDscId(docPltzDomain.getDscId());
            criteria.setShipperCd(docPltzDomain.getShipperCd());
            criteria.setMainMark(docPltzDomain.getMainMark());
            if(FLAG_N.equals(firstTimeFlg)) {
                criteria.setRemoveFlg(FLAG_Y);
            }
            
            TwInvItemDomain domain = new TwInvItemDomain();
            domain.setGrpNo1(docPltzDomain.getGrpNo1());
            domain.setGrpNo2("0");

            commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6006);
            
            criteriaList.add(criteria);
            domainList.add(domain);
        }

        return twInvItemService.updateByCondition(domainList, criteriaList);
    }
    
    /**
     * Numbered the (group of Full-RT Invoice) group No.2 of Part Invoice created for work.
     * <br />インボイス作成対象品番ワークのグループNo.2（Full-RTインボイスのまとまり）を採番します。
     * <pre>
     * - Get the FRT for Invoice Summary item
     *   Set the following items W6001DocCriteriaDomain,
     *   Call W6001DocDao.searchTwInvItemByGroupNo2 (W6001DocCriteriaDomain).
     *     - Login DSC-ID
     *     - SHIPPER CODE
     *     - First run flag
     * 
     * - The numbering from the Group No.sec created for Invoice Number work
     *   Argument to a summary items acquired
     *   Call searchTwInvItemOnInvoiceGroupingForMaxGrpNo2(String, String, String, String).
     * 
     * - Invoice Number work update
     *   Set to the narrowing condition updates to TwInvItemDomain, to TwInvItemCriteriaDomain
     *   Call the TwInvItemService.updateByCondition (List, List).
     *     Updated content
     *       - Group No.sec have numbered
     *     Narrowing conditions
     *       - DSC-ID
     *       - MAIN_MARK
     *       - CURR_CD
     *       - GRP_NO_1
     * </pre>
     * <pre>
     * - FRT用インボイスまとめ項目を取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTwInvItemByGroupNo2(W6001DocCriteriaDomain)}を呼び出します。
     *       - ログインDSC-ID
     *       - 荷主コード
     *       - 初回実行フラグ
     * 
     * - インボイス作成対象品番ワークからGroup No.secを採番
     *     取得したまとめ項目を引数に
     *     {@link #searchTwInvItemOnInvoiceGroupingForMaxGrpNo2(String, String, String, String)}を呼び出します。
     * 
     * - インボイス品番ワーク更新
     *     {@link TwInvItemDomain}に更新内容、{@link TwInvItemCriteriaDomain}に絞込条件に設定し
     *     {@link TwInvItemService#updateByCondition(List, List)}を呼び出します。
     *       更新内容
     *         - 採番したGroup No.sec
     *       絞込条件
     *         - DSC-ID
     *         - MAIN_MARK
     *         - CURR_CD
     *         - GRP_NO_1
     * </pre>
     * 
     * @param firstTimeFlg First run flag<br />
     * 初回実行フラグ
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Can not numbering the group No.2 of Part Invoice created for work<br />
     * インボイス作成対象品番ワークのグループNo.2を採番できない場合
     */
    protected int updateTwInvItemOnInvoiceGroupingBySearchForGrpNo2 (String firstTimeFlg, String dscId, String shipperCd)
        throws ApplicationException {
        
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        docCriteria.setDscId(dscId);
        docCriteria.setShipperCd(shipperCd);
        docCriteria.setFirstTimeFlg(firstTimeFlg);
        // Get the Invoice created for part number work. 
        // FRT用インボイスまとめ項目取得
        List<? extends W6001DocPltzItemDomain> docPltzItemList = w6001DocDao.searchTwInvItemByGroupNo2(docCriteria);
        
        String grpNo1 = StringUtils.EMPTY;
        int grpNo2 = 1;
        List<TwInvItemDomain> domainList = new ArrayList<TwInvItemDomain>();
        List<TwInvItemCriteriaDomain> criteriaList = new ArrayList<TwInvItemCriteriaDomain>();
        for (W6001DocPltzItemDomain itemDomain : docPltzItemList) {
            if (!grpNo1.equals(itemDomain.getGrpNo1())) {
                grpNo1 = itemDomain.getGrpNo1();
                // Numbered the Group No.sec from Invoice Number created for work. 
                // GRP_NO_1の範囲内で連番のため、初期化
                // 2015/10/08 DNJP.Kawamura UT334対応（Shipperの条件が抜けているため追加） START >>>>>
//                grpNo2 = searchTwInvItemOnInvoiceGroupingForMaxGrpNo2(itemDomain.getDscId()
//                    , itemDomain.getCurrCd(), itemDomain.getGrpNo1());
                grpNo2 = searchTwInvItemOnInvoiceGroupingForMaxGrpNo2(itemDomain.getDscId()
                    , itemDomain.getCurrCd(), itemDomain.getGrpNo1(), shipperCd);
                // 2015/10/08 DNJP.Kawamura UT334対応（Shipperの条件が抜けているため追加） END <<<<<
            }
            
            TwInvItemDomain domain = new TwInvItemDomain();
            domain.setGrpNo2(Integer.toString(grpNo2));

            commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6006);
            
            TwInvItemCriteriaDomain criteria = new TwInvItemCriteriaDomain();
            criteria.setDscId(itemDomain.getDscId());
            criteria.setShipperCd(shipperCd);
            criteria.setCurrCd(itemDomain.getCurrCd());
            criteria.setRtFlg(FLAG_Y);
            criteria.setGrpNo1(grpNo1);
            if(FLAG_N.equals(firstTimeFlg)) {
                criteria.setRemoveFlg(FLAG_Y);
            }
            domainList.add(domain);
            criteriaList.add(criteria);
            grpNo2++;
        }
        return twInvItemService.updateByCondition(domainList, criteriaList);
    }
    
    /**
     * Numbered the Group No.sec from Invoice Number created for work.
     * <br />インボイス作成対象品番ワークからGroup No.secを採番します。
     * <pre>
     * - Invoice created for work Part Number Search
     *   Set the following items TwInvCriteriaDomain,
     *   Call TwInvService.searchByCondition(TwInvCriteriaDomain).
     *     - DSC-ID
     *     - MAIN_MARK
     *     - CURR_CD
     *     - GRP_NO_1
     *     - Set DISPLAY ORDER: GRP_NO_2 descending order
     * </pre>
     * <pre>
     * - インボイス作成対象品番ワーク検索
     *     {@link TwInvCriteriaDomain}に以下の項目を設定し、
     *     {@link TwInvService#searchByCondition(TwInvCriteriaDomain)}を呼び出します。
     *       - DSC-ID
     *       - MAIN_MARK
     *       - CURR_CD
     *       - GRP_NO_1
     *       - 表示順の設定: GRP_NO_2 降順
     * </pre>
     * 
     * @param dscId DSC-ID
     * @param currCd CURR_CD
     * @param grpNo1 GRP_NO_1
     * @param shipperCd Shipper code
     * @return VALUE of Group No.sec who numbered<br />
     * 採番したGroup No.secの値
     * @throws ApplicationException Can not be numbered. Sec Group No<br />
     * Group No. Secが採番できない場合
     */
    // 2015/10/08 DNJP.Kawamura UT334対応（Shipperの条件が抜けているため追加） START >>>>>
//    protected int searchTwInvItemOnInvoiceGroupingForMaxGrpNo2 (String dscId, String currCd, String grpNo1)
//        throws ApplicationException {
    protected int searchTwInvItemOnInvoiceGroupingForMaxGrpNo2 (String dscId, String currCd, String grpNo1, String shipperCd)
        throws ApplicationException {        
    // 2015/10/08 DNJP.Kawamura UT334対応（Shipperの条件が抜けているため追加） END <<<<<
        
        TwInvItemCriteriaDomain criteria = new TwInvItemCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setGrpNo1(grpNo1);
        criteria.setGrpNo2GreaterThan("0");
        criteria.setPreferredOrder("GRP_NO_2 desc");
        // 2015/10/08 DNJP.Kawamura Shipperの条件が抜けているため、追加 START >>>>>
        criteria.setShipperCd(shipperCd);
        // 2015/10/08 DNJP.Kawamura Shipperの条件が抜けているため、追加 END <<<<<

        List<TwInvItemDomain> domainList = twInvItemService.searchByCondition(criteria);
        
        if (domainList == null || domainList.isEmpty()) {
            return 1;
        }
        return Integer.parseInt(domainList.get(0).getGrpNo2()) + 1;
    }
    
    /**
     * Register the Invoice Group Work.
     * <br />インボイスグループワークの登録をします。
     * <pre>
     * - Registration data acquisition
     *   Set the following items W6001DocCriteriaDomain,
     *   Call (W6001DocCriteriaDomain) W6001DocDao.searchTwInvPltzBySearchInvoice.
     *     - Login DSC-ID
     *     - SHIPPER CODE
     *     - First run flag
     * 
     * - Invoice Group Work registration
     *   Set the data that were acquired on TwInvDomain,
     *   Call TwInvService.create(List).
     * </pre>
     * <pre>
     * - 登録データ取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTwInvPltzBySearchInvoice(W6001DocCriteriaDomain)}を呼び出します。
     *       - ログインDSC-ID
     *       - 荷主コード
     *       - 初回実行フラグ
     *       
     * - インボイスグループワーク登録
     *     {@link TwInvDomain}に取得したデータを設定し、
     *     {@link TwInvService#create(List)}を呼び出します。
     * </pre>
     * 
     * @param firstTimeFlg First run flag<br />
     * 初回実行フラグ
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @throws ApplicationException Registration of the Invoice Group Work can not be<br />
     * インボイスグループワークの登録ができない場合
     */
    protected void createTwInvOnInvoiceGroupingBySearch (String firstTimeFlg, String dscId, String shipperCd)
        throws ApplicationException {
        
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        docCriteria.setDscId(dscId);
        docCriteria.setShipperCd(shipperCd);
        docCriteria.setFirstTimeFlg(firstTimeFlg);
        
        // Get the (main group of Invoice) group No.1 of Invoice created for part number work. 
        List<? extends W6001DocPltzDomain> docPltzList = w6001DocDao.searchTwInvPltzBySearchInvoice(docCriteria);
        List<TwInvDomain> domainList = new ArrayList<TwInvDomain>();
        for (W6001DocPltzDomain docPltzDomain : docPltzList) {
            for (W6001DocPltzItemDomain docItemDomain : docPltzDomain.getDocPltzItemList()) {
                TwInvDomain domain = new TwInvDomain();
                CommonUtil.copyPropertiesDomainToDomain(domain, docPltzDomain);
                
                domain.setDscId(dscId);
                
                domain.setGrpNo1(docItemDomain.getGrpNo1());
                domain.setGrpNo2(docItemDomain.getGrpNo2());
                
                domain.setShippedDt(null);
                domain.setDecisionFlg(FLAG_N);
                domain.setReInvoiceFlg(FLAG_N);
                domain.setTempInvoiceNo(null);
                domain.setInvoiceNo(null);
                domain.setReInvoiceShipperCd(null);
                domain.setSalesContractFlg(FLAG_N);
                
                commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6006);
                
                domainList.add(domain);
            }
        }
        twInvService.create(domainList);
    }
    
    /**
     * REMOVEフラグを'N'に更新します。
     *
     * @param dscId DSC-ID
     * @param shipperCd Shipper code
     * @throws ApplicationException REMOVEフラグを更新できない場合
     */
    protected void updateTwInvPltzOnInvoiceGroupingByRemoveFlg(String dscId, String shipperCd)
        throws ApplicationException {
        
        TwInvPltzCriteriaDomain twInvPltzCriteria = new TwInvPltzCriteriaDomain();
        twInvPltzCriteria.setDscId(dscId);
        twInvPltzCriteria.setShipperCd(shipperCd);
        twInvPltzCriteria.setRemoveFlg(FLAG_Y);
        twInvPltzCriteria.setSearchCountCheckFlg(false);
        
        if (twInvPltzService.searchCount(twInvPltzCriteria) > 0) {
            TwInvPltzDomain twInvPltzDomain = new TwInvPltzDomain();
            twInvPltzDomain.setRemoveFlg(FLAG_N);
            commonService.setCommonPropertyForUpdate(twInvPltzDomain, SCREEN_ID_W6006);
            twInvPltzService.updateByCondition(twInvPltzDomain, twInvPltzCriteria);
        }
        
        TwInvItemCriteriaDomain twInvItemCriteria = new TwInvItemCriteriaDomain();
        twInvItemCriteria.setDscId(dscId);
        twInvItemCriteria.setShipperCd(shipperCd);
        twInvItemCriteria.setRemoveFlg(FLAG_Y);
        twInvItemCriteria.setSearchCountCheckFlg(false);
        
        if (twInvItemService.searchCount(twInvItemCriteria) > 0) {
            TwInvItemDomain twInvItemDomain = new TwInvItemDomain();
            twInvItemDomain.setRemoveFlg(FLAG_N);
            commonService.setCommonPropertyForUpdate(twInvItemDomain, SCREEN_ID_W6006);
            twInvItemService.updateByCondition(twInvItemDomain, twInvItemCriteria);
        }
    }
    
    // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 START >>>>>
    /**
     * For CIGMA, perform the InvoiceDB registration.
     * <br />CIGMAに対し、InvoiceDB連携用データの登録を行います。
     * <pre>
     * - Web to get the data to pass to the service, will create a delivery parameters.
     *   Argument in the following items that have been registered to Invoice
     *   Call (String, String, Date) the prepareWs6005ParamDomain.
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - LIB(INVOICE_DB)
     *     - NEW LINC SUBSIDIARY CODE
     * 
     * - Web service call
     *   Argument in the following items:
     *   Call Ws6001RestService.registSalesOdrInvntry(String, Ws6001ParamDomain).
     *     - COMPANY CODE
     *     - Delivery parameters that created
     * </pre>
     * <pre>
     * ‐Webサービスに渡すデータを取得し、引き渡しパラメータを作成します。
     *     インボイスに登録した以下の項目を引数に
     *     {@link #prepareWs6005ParamDomain(String, String, Date)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *       ‐ライブラリ(InvoiceDB共通)
     *       ‐拠点コード(CIGMA)
     * 
     * - Webサービス呼出し
     *     以下の項目を引数に
     *     {@link Ws6001RestService#registSalesOdrInvntry(String, Ws6001ParamDomain)}を呼出します。
     *       ‐会社コード
     *       ‐作成した引き渡しパラメータ
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @param tmCigmaEnvDomain cigma
     * @param tmNxsCompDomain nexus
     * @param ttInvoiceList Invoice registration data of CIGMA goods and main Invoice<br />
     * メインインボイス かつ CIGMA品のインボイス登録データ
     * @throws ApplicationException For CIGMA, Not possible to InvoiceDB registration<br />
     * CIGMAに対し、InvoiceDB用データが登録出来ない場合
     */
    protected void callWebService6005(String compCd
        , List<? extends TtInvoiceDomain> ttInvoiceList
        , TmCigmaEnvDomain tmCigmaEnvDomain
        , TmNxsCompDomain tmNxsCompDomain)
        throws ApplicationException {
        
        for (TtInvoiceDomain ttInvDomain : ttInvoiceList) {
            // Create a Web service parameters of "invoiceDB registration". 
            // Webサービスに渡すデータ取得
            Ws6005ParamDomain paramDomain = prepareWs6005ParamDomain(
                ttInvDomain.getShipperCd()
                , ttInvDomain.getInvoiceNo()
                , ttInvDomain.getInvoiceIssueDt()
                , tmCigmaEnvDomain.getLibInvDb()
                , tmNxsCompDomain.getNewLincSubsidiaryCd());
            // Update invoiceDB of CIGMA by using the (WS6005) Web Services 
            // Webサービス呼出し
            ResultDomain resultDomain = ws6005RestService.registInvoiceDb(compCd, paramDomain);
            if (WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
                // 処理なし
            } else if(WS_RESULT_ERROR_SYSTEM.equals(resultDomain.getResultCode())) {
                throw new GscmApplicationException(NXS_E1_0058);
            } else {
                ErrorListItemDomain errorListItem = resultDomain.getErrorList().get(0);
                
                if (!CollectionUtils.isEmpty(errorListItem.getErrorParamList())) {
                    List<Object> params = new ArrayList<Object>();
                    for (ErrorParamListItemDomain param : errorListItem.getErrorParamList()) {
                        params.add(param.getParam());
                    }
                    throw new GscmApplicationException(errorListItem.getErrorCode(), params.toArray());
                } else {
                    throw new GscmApplicationException(errorListItem.getErrorCode());
                }
            }
        }
    }
    
    /**
     * Create a Web service parameters of "InvoiceDB registration".
     * <br />Webサービス「InvoiceDB連携」のパラメータを作成します。
     * <pre>
     * - Data acquisition of the EDT46PR information
     *   W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.searchTtInvoiceByEDT46PRRegister (W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE 
     *
     * - Data acquisition of the EDT47PR information
     *   W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.searchTtInvoiceAttachedByEDT47PRRegister (W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *
     * - Data acquisition of the EDT45PR information
     *   W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.searchTtInvoiceAttachedByEDT45PRRegister (W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * ‐EDT46PRのデータ取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTtInvoiceByEDT46PRRegister(W6001DocCriteriaDomain)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     * 
     * ‐EDT47PRのデータ取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTtInvoiceAttachedByEDT47PRRegister(W6001DocCriteriaDomain)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *
     * ‐EDT45PRのデータ取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTtInvoiceAttachedByEDT45PRRegister(W6001DocCriteriaDomain)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param libInvDb LIB(INVOICE_DB)<br />
     * ライブラリ(InvoiceDB共通)
     * @param newLincSubsidiaryCd NEW LINC SUBSIDIARY CODE<br />
     * 拠点コード(CIGMA)
     * @return Call parameters domain of Web services<br />
     * Webサービスの呼出しパラメータドメイン
     * @throws ApplicationException If the parameter Creating Web Services "InvoiceDB registration" can not be<br />
     * Webサービス「InvoiceDB連携」のパラメータ作成ができない場合
     */
    protected Ws6005ParamDomain prepareWs6005ParamDomain (String shipperCd
        , String invoiceNo
        , Date invoiceIssueDt
        , String libInvDb
        , String newLincSubsidiaryCd)
        throws ApplicationException {
        
        Ws6005ParamDomain paramDomain = new Ws6005ParamDomain();
        List<Ws6005ParamEDT47PRDomain> itemDomainList = new ArrayList<Ws6005ParamEDT47PRDomain>();
        List<Ws6005ParamEDT45PRDomain> itemDomain2List = new ArrayList<Ws6005ParamEDT45PRDomain>();

        // IN162 ADD START
        // Search Shipper unit.
        // シッパー単位系の検索
        VtCompMeasureUnitDomain vtCompMeasureUnitDomain = commonService.searchMeasureUnit(shipperCd);
        // IN162 ADD END

        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        // Get information to pass to the Web service corresponding to the search condition (EDT46PR). 
        // データ取得(EDT46PR情報)
        W6001DocInvoiceDomain headDomain = w6001DocDao.searchTtInvoiceByEDT46PRRegister(criteria);

        paramDomain.setInvoiceNo(StringUtils.defaultString(headDomain.getInvoiceNo()));
        paramDomain.setCustomerCd(StringUtils.defaultString(headDomain.getCustomerCd()));
        paramDomain.setShipToNo(StringUtils.defaultString(headDomain.getLgcyShipTo()));
        paramDomain.setDateOfIssuedDocument(StringUtils.defaultString(DateUtil.formatDate(
            headDomain.getInvoiceIssueDt(), WS_CIGMA_DATE_FORMAT)));
        // 2014/11/18 DNJP.Kawamura ST074対応 START >>>>>
        paramDomain.setDDNo(StringUtils.defaultString(headDomain.getRelateInvoiceNo()));
        // 2014/11/18 DNJP.Kawamura ST074対応 END <<<<<
        paramDomain.setShippedDate(StringUtils.defaultString(DateUtil.formatDate(
            headDomain.getShippedDt(), WS_CIGMA_DATE_FORMAT)));
        paramDomain.setTypeOfShipment(StringUtils.left(StringUtils.defaultString(headDomain.getTrnsNm()), 10)); // UT369 ADD
        paramDomain.setEstimatedArrivalDate(StringUtils.defaultString(DateUtil.formatDate(
            headDomain.getEta(), WS_CIGMA_DATE_FORMAT)));
        paramDomain.setEstimatedArrivalTime(StringUtils.defaultString(headDomain.getArrivalTime()));
        paramDomain.setShipToName(StringUtils.defaultString(headDomain.getShipToNm1()));
        paramDomain.setShipToAddress1(StringUtils.defaultString(headDomain.getShipToAddr1()));
        paramDomain.setShipToAddress2(StringUtils.defaultString(headDomain.getShipToAddr2()));
        paramDomain.setShipToAddress3(StringUtils.defaultString(headDomain.getShipToAddr3()));
        paramDomain.setShipToCountryCode(StringUtils.defaultString(headDomain.getCntryCdShipTo()));
        paramDomain.setNoOfCartons("0");
        // UT395 MOD START
        //paramDomain.setTotalGrossWeight(headDomain.getTotalGrossWeight().toPlainString());
        //paramDomain.setTotalNetWeight(headDomain.getTotalNetWeight().toPlainString());

        // If overflow CIGMA integer digit number 6, to set the 999999.999.
        // CIGMAの桁数6を超えている場合、999999.999を設定する。
        BigDecimal totalGrossWeightWork = headDomain.getTotalGrossWeight();
        if (6 < totalGrossWeightWork.precision() - totalGrossWeightWork.scale()) {
            totalGrossWeightWork = new BigDecimal("999999.999");
        }
        paramDomain.setTotalGrossWeight(totalGrossWeightWork.toPlainString());
        // If overflow CIGMA integer digit number 6, to set the 999999.999.
        // CIGMAの桁数6を超えている場合、999999.999を設定する。
        BigDecimal totalNetWeightWork = headDomain.getTotalNetWeight();
        if (6 < totalNetWeightWork.precision() - totalNetWeightWork.scale()) {
            totalNetWeightWork = new BigDecimal("999999.999");
        }
        paramDomain.setTotalNetWeight(totalNetWeightWork.toPlainString());
        // UT395 MOD END

        paramDomain.setWeightUnit(StringUtils.defaultString(headDomain.getLgcyUnitCd()));
        paramDomain.setWeightUnitonDoc(StringUtils.defaultString(headDomain.getTotalNetWeightUnit()));

        // UT395 MOD START
        //BigDecimal totalVol = commonService.convertVolumeUnit(headDomain.getTotalVolume(), headDomain.getVolumeUnit(), UNIT_CD_CR);
        //if (totalVol == null) {
        //    Object[] params = { 
        //        commonService.getResource(headDomain.getLocale(), "label.totalVol") 
        //    };
        //    throw new GscmApplicationException(NXS_E7_0157, params); 
        //}
        //paramDomain.setTotalVolume(totalVol.setScale(0, BigDecimal.ROUND_UP).toPlainString());

        // It converted to m3 for volume.
        // 容積についてはm3に変換する。
        BigDecimal totaVolumeConverted
            = commonService.convertVolumeUnitNoOverflowCheck(headDomain.getTotalVolume(),
                headDomain.getVolumeUnit(), UNIT_CD_CR);
        // If overflow CIGMA integer digit number 7, to set the 9999999.
        // CIGMAの桁数7を超えている場合、9999999を設定する。
        BigDecimal totaVolumeWork = totaVolumeConverted.setScale(0, BigDecimal.ROUND_UP);
        if (7 < totaVolumeWork.precision() - totaVolumeWork.scale()) {
            totaVolumeWork = new BigDecimal("9999999");
        }
        paramDomain.setTotalVolume(totaVolumeWork.toPlainString());
        // If overflow CIGMA integer digit number 9, to set the 999999999.999 .
        // CIGMAの桁数9を超えている場合、999999999.999を設定する。
        totaVolumeWork = totaVolumeConverted;
        if (9 < totaVolumeWork.precision() - totaVolumeWork.scale()) {
            totaVolumeWork = new BigDecimal("999999999.999");
        }
        paramDomain.setTotalVolume2(totaVolumeWork.toPlainString());
        // UT395 MOD END
        
        paramDomain.setCarrierName(StringUtils.defaultString(headDomain.getCarrierCompNmAbb()));
        paramDomain.setCarrierAddress1(StringUtils.defaultString(headDomain.getPrintCompAddr1()));
        paramDomain.setCarrierAddress2(StringUtils.defaultString(headDomain.getPrintCompAddr2()));
        paramDomain.setCarrierAddress3(StringUtils.defaultString(headDomain.getPrintCompAddr3()));
        paramDomain.setCarrierCountryCode(StringUtils.defaultString(headDomain.getCntryCdCarrier()));
        // UT321 MOD START
        //paramDomain.setSpecialInfomation(StringUtils.left(StringUtils.defaultString(headDomain.getSpInfo()), 30));
        //paramDomain.setSpecialInfomation1(StringUtils.mid(StringUtils.defaultString(headDomain.getSpInfo()), 0, 60));
        //paramDomain.setSpecialInfomation2(StringUtils.mid(StringUtils.defaultString(headDomain.getSpInfo()), 61, 120));
        String spInfoWork = "";
        String[] spInfoLines = StringUtils.defaultString(headDomain.getSpInfo()).split("\n");
        for (String spInfoLine : spInfoLines) {
            spInfoWork += StringUtils.rightPad(spInfoLine, 30, ' ');
        }
        paramDomain.setSpecialInfomation(StringUtils.mid(spInfoWork, 0, 30));
        paramDomain.setSpecialInfomation1(StringUtils.mid(spInfoWork, 30, 60));
        paramDomain.setSpecialInfomation2(StringUtils.mid(spInfoWork, 90, 60));
        // UT321 MOD END
        paramDomain.setSenderName(StringUtils.defaultString(headDomain.getShipperCompNm1()));
        paramDomain.setSenderAddress1(StringUtils.defaultString(headDomain.getShipperCompAddr1()));
        paramDomain.setSenderAddress2(StringUtils.defaultString(headDomain.getShipperCompAddr2()));
        paramDomain.setSenderAddress3(StringUtils.defaultString(headDomain.getShipperCompAddr3()));
        paramDomain.setSenderCountryCode(StringUtils.defaultString(headDomain.getCntryCdShipper()));
        paramDomain.setBilingCompanyVatNo(StringUtils.defaultString(headDomain.getShipperTaxIdNo()));
        // UT317 START >>>>>
        // 2014/11/18 DNJP.Kawamura ST162対応 START >>>>>
//        paramDomain.setBillingTelNo(URLEncoder.encode(StringUtils.defaultString(headDomain.getShipperCompTel())));
//        paramDomain.setBillingFaxNo(URLEncoder.encode(StringUtils.defaultString(headDomain.getShipperCompFax())));
        paramDomain.setBillingTelNo(StringUtils.defaultString(headDomain.getShipperCompTel()));
        paramDomain.setBillingFaxNo(StringUtils.defaultString(headDomain.getShipperCompFax()));
        // 2014/11/18 DNJP.Kawamura ST162対応 END <<<<<
        // UT317 END <<<<<
        paramDomain.setAccounteeNo("");
        paramDomain.setAccounteeName("");
        paramDomain.setAccounteeAddress1("");
        paramDomain.setAccounteeAddress2("");
        paramDomain.setAccounteeAddress3("");
        paramDomain.setAccounteeCountryCode("");
        paramDomain.setPaymentTerms(StringUtils.defaultString(headDomain.getPayTerms()));
        paramDomain.setTradeTerms(StringUtils.defaultString(headDomain.getTradeTerms()));
        paramDomain.setDeliveryPoint(StringUtils.defaultString(headDomain.getDlivPoint()));
        paramDomain.setPriceTerms(StringUtils.defaultString(headDomain.getPriceTerms()));
        paramDomain.setInvoiceAuthorizedName(StringUtils.left(StringUtils.defaultString(headDomain.getApprovalNm()), 20));
        paramDomain.setInvoiceAuthorizedPosition(StringUtils.left(StringUtils.defaultString(headDomain.getApprovalPosition()), 20));
        paramDomain.setInvoiceAmount(headDomain.getTotalInvoiceAmount().toPlainString());
        paramDomain.setInvoiceAmountCurCd3Digit(StringUtils.defaultString(headDomain.getTotalInvoiceAmountCurrCd()));
        paramDomain.setTax(headDomain.getVat().toPlainString());
        paramDomain.setTaxpc(headDomain.getVatRatio().toPlainString());
        paramDomain.setInsurance(headDomain.getInsurance().toPlainString());
        paramDomain.setFreight(headDomain.getFreight().toPlainString());
        paramDomain.setLibInvDb(libInvDb);
        paramDomain.setOgccd(newLincSubsidiaryCd);
        
        // Freight Status
        if (FREIGHT_RESPONSIBLE_CD_PREPAID.equals(headDomain.getFreightResponsibleCd())) {
            paramDomain.setFreightStatus(CIGMA_FREIGHT_RESPONSIBLE_CD_PREPAID); // UT285 MOD
        } else {
            paramDomain.setFreightStatus(CIGMA_FREIGHT_RESPONSIBLE_CD_COLLECT); // UT285 MOD
        }
        // REM LC TYP:REM
        if (REM_LC_TYP_REM.equals(headDomain.getRemLcTyp())) {
            paramDomain.setBankName(StringUtils.defaultString(headDomain.getRemBankNm()));
            paramDomain.setBankAddress1(StringUtils.defaultString(headDomain.getRemBankAddress1()));
            paramDomain.setBankAddress2(StringUtils.defaultString(headDomain.getRemBankAddress2()));
            paramDomain.setBankAddress3(StringUtils.defaultString(headDomain.getRemBankAddress3()));
            paramDomain.setBankAccountNo(StringUtils.defaultString(headDomain.getRemBankAccountNo()));
        }
        // REM LC TYP:LC
        if (REM_LC_TYP_LC.equals(headDomain.getRemLcTyp())) {
            paramDomain.setBankName(StringUtils.defaultString(headDomain.getLcBank1()));
            paramDomain.setBankAddress1("");
            paramDomain.setBankAddress2("");
            paramDomain.setBankAddress3("");
            paramDomain.setBankAccountNo("");
        }
        
        if (25 < paramDomain.getShipToAddress1().length()) {
            paramDomain.setShipToAddress1(paramDomain.getShipToAddress1().substring(0, 25));
        }
        if (25 < paramDomain.getShipToAddress2().length()) {
            paramDomain.setShipToAddress2(paramDomain.getShipToAddress2().substring(0, 25));
        }
        if (25 < paramDomain.getShipToAddress3().length()) {
            paramDomain.setShipToAddress3(paramDomain.getShipToAddress3().substring(0, 25));
        }
        if (25 < paramDomain.getCarrierAddress1().length()) {
            paramDomain.setCarrierAddress1(paramDomain.getCarrierAddress1().substring(0, 25));
        }
        if (25 < paramDomain.getCarrierAddress2().length()) {
            paramDomain.setCarrierAddress2(paramDomain.getCarrierAddress2().substring(0, 25));
        }
        if (25 < paramDomain.getCarrierAddress3().length()) {
            paramDomain.setCarrierAddress3(paramDomain.getCarrierAddress3().substring(0, 25));
        }
        if (25 < paramDomain.getSenderAddress1().length()) {
            paramDomain.setSenderAddress1(paramDomain.getSenderAddress1().substring(0, 25));
        }
        if (25 < paramDomain.getSenderAddress2().length()) {
            paramDomain.setSenderAddress2(paramDomain.getSenderAddress2().substring(0, 25));
        }
        if (25 < paramDomain.getSenderAddress3().length()) {
            paramDomain.setSenderAddress3(paramDomain.getSenderAddress3().substring(0, 25));
        }
                
        // Get the information to be passed to the Web service corresponding to the search criteria(EDT47PR). 
        // データ取得(EDT47PR)
        List<? extends W6001DocInvoiceDomain> dtlDomainList = w6001DocDao.searchTtInvoiceAttachedByEDT47PRRegister(criteria);
        
        for (W6001DocInvoiceDomain dtlDomain : dtlDomainList) {
            for (W6001DocPltzDomain pltzDomain : dtlDomain.getDocPltzList()) {
                for (W6001DocPltzItemDomain pltzItemDomain : pltzDomain.getDocPltzItemList()) {
                    Ws6005ParamEDT47PRDomain itemDomain = new Ws6005ParamEDT47PRDomain();
                    
                    itemDomain.setPartNo(StringUtils.defaultString(dtlDomain.getItemNo()));
                    itemDomain.setEtdDueDate(DateUtil.formatDate(pltzItemDomain.getEtdDueDt(), WS_CIGMA_DATE_FORMAT));
                    itemDomain.setCustomerPoNo(StringUtils.defaultString(dtlDomain.getCustomerPoNo()));
                    itemDomain.setCustomerPartNo(StringUtils.defaultString(dtlDomain.getCustomerItemNo()));
                    itemDomain.setInstructedShippingQty(pltzItemDomain.getAllocQty().toPlainString());
                    itemDomain.setShippedQty(pltzItemDomain.getAllocQty().toPlainString());
                    itemDomain.setSalesCompanyPoNo(StringUtils.defaultString(pltzItemDomain.getSalesCompPoNo()));
                    itemDomain.setUnitOfMeasure(StringUtils.defaultString(dtlDomain.getLgcyUnitCd()));
                    itemDomain.setUnitOfMeasureOnDocument(StringUtils.defaultString(dtlDomain.getQtyUnit()));
                    itemDomain.setSalesUnitPrice(StringUtils.defaultString(dtlDomain.getUnitPrice()));
                    itemDomain.setSalesUnitPriceCurCd3Digit(StringUtils.defaultString(dtlDomain.getUnitPriceCurrCd()));
                    itemDomain.setCurrentWarehouse(StringUtils.defaultString(pltzDomain.getCurLgcyWhCd()));
                    itemDomain.setCountryOfOrigin(StringUtils.defaultString(pltzItemDomain.getOriginCntryCd()));
                    // UT413-3 ADD START
                    if (pltzItemDomain.getShippingLot() != null) {
                        itemDomain.setShippingLot(pltzItemDomain.getShippingLot().toPlainString());
                    }
                    // UT413-3 ADD END
                    // UT436 ADD START
                    itemDomain.setItemDescription(
                        StringUtils.defaultString(StringUtils.left(pltzItemDomain.getItemDescription(), 25))
                    );
                    // UT436 ADD END
                    
                    itemDomainList.add(itemDomain);
                }
            }
        }        
        paramDomain.setEDT47PRList(itemDomainList);

        // Get the information to be passed to the Web service corresponding to the search criteria(EDT45PR).
        // データ取得(EDT45PR情報)
        List<? extends W6001DocInvoiceDomain> dtlDomain2List = w6001DocDao.searchTtInvoiceAttachedByEDT45PRRegister(criteria);
        
        for (W6001DocInvoiceDomain dtlDomain2 : dtlDomain2List) {
            for (W6001DocPltzDomain pltzDomain2 : dtlDomain2.getDocPltzList()) {
                for (W6001DocPltzItemDomain pltzItemDomain2 : pltzDomain2.getDocPltzItemList()) {
                    Ws6005ParamEDT45PRDomain itemDomain2 = new Ws6005ParamEDT45PRDomain();

                    itemDomain2.setFreight(dtlDomain2.getFreight().toPlainString());
                    itemDomain2.setInsurance(dtlDomain2.getInsurance().toPlainString());
                    itemDomain2.setInvoiceAmount(dtlDomain2.getTotalInvoiceAmount().toPlainString());
                    itemDomain2.setCustomerPoNo(StringUtils.defaultString(dtlDomain2.getCustomerPoNo()));
                    itemDomain2.setCustomerPartNo(StringUtils.defaultString(dtlDomain2.getCustomerItemNo()));
                    itemDomain2.setPartNo(StringUtils.defaultString(dtlDomain2.getItemNo()));                    
                    itemDomain2.setSalesUnitPrice(StringUtils.defaultString(dtlDomain2.getUnitPrice()));
                    itemDomain2.setSalesUnitPriceCurCd3Digit(StringUtils.defaultString(dtlDomain2.getUnitPriceCurrCd()));
                    itemDomain2.setNetAmount(dtlDomain2.getNetAmount().toPlainString());
                    // IN162 MOD START
                    // Convert N/W shipper unit.
                    // If overflow CIGMA integer digit number 11, to set the 99999999999.999.
                    // N/Wをシッパーの単位へ変換。
                    // CIGMAの桁数11を超えている場合、99999999999.999を設定する。
                    BigDecimal convertedNetWeight
                        = commonService.convertWeightUnitNoOverflowCheck(dtlDomain2.getTotalNetWeight(),
                            pltzItemDomain2.getWeightUnit(), vtCompMeasureUnitDomain.getWeightUnit());
                    if (11 < convertedNetWeight.precision() - convertedNetWeight.scale()) {
                        convertedNetWeight = new BigDecimal("99999999999.999");
                    }
                    itemDomain2.setNetWeight(convertedNetWeight.toPlainString());
                    // IN162 MOD END
                    // 2014/12/10 DNJP.Kawamura ST183対応 START >>>>>
//                    itemDomain2.setUnitOfMeasureOnDocument(StringUtils.defaultString(dtlDomain2.getLgcyUnitCd()));
                    itemDomain2.setUnitOfMeasureOnDocument(StringUtils.defaultString(dtlDomain2.getQtyUnit()));
                    // 2014/12/10 DNJP.Kawamura ST183対応 END <<<<<
                    itemDomain2.setCml(StringUtils.defaultString(pltzDomain2.getMainMark()));
                    itemDomain2.setGrossWeight(pltzDomain2.getGrossWeight().toPlainString());
                    itemDomain2.setItemWeight(pltzItemDomain2.getItemWeight().toPlainString());
                    itemDomain2.setShippedQty(pltzItemDomain2.getAllocQty().toPlainString());
                    // UT432 ADD START
                    itemDomain2.setItemDescription(
                        StringUtils.defaultString(StringUtils.left(pltzItemDomain2.getItemDescription(), 25))
                    );
                    // UT432 ADD END
                    
                    itemDomain2List.add(itemDomain2);
                }
            }
        }
        
        paramDomain.setEDT45PRList(itemDomain2List);
        return paramDomain;
    }
    
    /**
     * For CIGMA, perform the InvoiceDB cancellation.
     * <br />CIGMAに対し、InvoiceDB連携用キャンセルを行います。
     * <pre>
     * -Web to get the data to pass to the service, create a delivery parameters.
     *  Argument in the following items that have been registered to Invoice
     *  Call searchTtInvoiceOnRegisterByCancelForWs(String, String, Date).
     *    - SHIPPER CODE
     *    - Invoice No
     *    - INVOICE ISSUE DATE
     * 
     * - Web service call
     *   Argument in the following items:
     *   Call ws6006RestService.cancelInvDb(String, String, String, String, String).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - LIB(INVOICE_DB)
     *     - NEW LINC SUBSIDIARY CODE
     * </pre>
     * <pre>
     * ‐Webサービスに渡すデータを取得し、引き渡しパラメータを作成します。
     *     インボイスに登録した以下の項目を引数に
     *     {@link #searchTtInvoiceOnRegisterByCancelForWs(String, String, Date)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     * 
     * Webサービス呼出し
     *     以下の項目を引数に
     *     {@link ws6006RestService.cancelInvDb(String, String, String, String, String)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *       ‐ライブラリ(InvoiceDB共通)
     *       ‐拠点コード(CIGMA)
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @param ttInvoiceList Invoice registration data list<br />
     * @param tmCigmaEnvDomain cigma
     * @param tmNxsCompDomain nexus
     * インボイス登録データリスト
     * @throws ApplicationException For CIGMA, Not possible to InvoiceDB registration<br />
     * CIGMAに対し、InvoiceDB用データが登録が出来ない場合
     */
    protected void callWebService6006(String compCd
        , List<? extends TtInvoiceDomain> ttInvoiceList
        , TmCigmaEnvDomain tmCigmaEnvDomain
        , TmNxsCompDomain tmNxsCompDomain)
        throws ApplicationException {
        
        for (TtInvoiceDomain ttInvDomain : ttInvoiceList) {
            if (!(CML_TYPE_CIGMA.equals(ttInvDomain.getCmlTyp()) && INVOICE_CLASS_MAIN.equals(ttInvDomain.getInvoiceClass()))) {
                continue;
            }
            // Get the information to be passed to the Web service. 
            // Webサービスに渡すデータ取得
            W6001DocInvoiceDomain docInvDomain = searchTtInvoiceOnRegisterByCancelForWs(ttInvDomain.getShipperCd()
                , ttInvDomain.getInvoiceNo(), ttInvDomain.getInvoiceIssueDt());
            // Get the information of shipping documents MA by using the (WS6002) Web Services. 
            // Webサービス呼出し
            ResultDomain resultDomain = ws6006RestService.cancelInvDb(
                compCd
                , StringUtil.getEmptyToBlank(docInvDomain.getCancelInvoiceNo())
                , StringUtil.getEmptyToBlank(docInvDomain.getInvoiceNo())
                // 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
                , docInvDomain.getInvoiceIssueDt()
                // 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<
                , StringUtil.getEmptyToBlank(tmCigmaEnvDomain.getLibInvDb())
                , StringUtil.getEmptyToBlank(tmNxsCompDomain.getNewLincSubsidiaryCd()));
            if (WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
                // 処理なし
            } else if(WS_RESULT_ERROR_SYSTEM.equals(resultDomain.getResultCode())) {
                throw new GscmApplicationException(NXS_E1_0058);
            } else {
                ErrorListItemDomain errorListItem = resultDomain.getErrorList().get(0);
                
                if (!CollectionUtils.isEmpty(errorListItem.getErrorParamList())) {
                    List<Object> params = new ArrayList<Object>();
                    for (ErrorParamListItemDomain param : errorListItem.getErrorParamList()) {
                        params.add(param.getParam());
                    }
                    throw new GscmApplicationException(errorListItem.getErrorCode(), params.toArray());
                } else {
                    throw new GscmApplicationException(errorListItem.getErrorCode());
                }
            }
        }
    }
    // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 END <<<<<

    /**
     * 
     * Get TAX ID NO from NEXUS Company Master by company code.
     * </br >会社コードに紐づく「TAX ID NO/納税者番号」をNEXUS会社原単位から取得します。
     *
     * @param shipperCd 会社コード
     * @return TAX ID NO/納税者番号
     * @throws ApplicationException error happend.
     */
    protected String searchTaxIdNoByCompCd(String shipperCd) throws ApplicationException {
        // Set criteria.
        TmNxsCompCriteriaDomain criteria = new TmNxsCompCriteriaDomain();
        criteria.setCompCd(shipperCd);
        
        // Search tax id no from NEXUS Company Master by company cd.
        TmNxsCompDomain domain = tmNxsCompService.searchByKey(criteria);
        
        if (domain == null) {
            return null;
        } else {
            return domain.getTaxIdNo();
        }
    }
    
    // 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
    /**
     * Search the items from PKG Materials MA and Update TW_INV_ITEM.
     * <br />包装材原単位から通貨・単価を取得し、TW_INV_ITEMを更新します。
     * <pre>
     * - Registration data acquisition
     *   Set the following items W6001DocCriteriaDomain,
     *   Call W6001DocDao.searchTmPkgMtrl(W6001DocCriteriaDomain).
     *     - Login DSC-ID
     *     - SHIPPER CODE
     *     - Group No.first
     *     - Group No.second
     * 
     * - Updated TW_INV_ITEM
     *   Set the narrowing-down condition updates to TwInvItemDomain, in TwInvItemCriteriaDomain,
     *   Call TwInvItemService.updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain).
     *     Updated content
     *       - CURR_CD:. CURR_CD registration data acquisition
     *       - UNIT_PRICE:. CUSTOMS_VALUATION registration data acquisition
     *     Narrowing conditions
     *       - Login DSC-ID
     *       - SHIPPER CODE
     *       - RT_FLG: "Y"
     * </pre>
     * <pre>
     * - 登録データ取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTmPkgMtrl(W6001DocCriteriaDomain)}を呼び出します。
     *       - ログインDSC-ID
     *       - 荷主コード
     *       - Group No.first
     *       - Group No.second
     * 
     * - インボイス作成対象品番ワークを更新
     *     {@link TwInvItemDomain}に更新内容、{@link TwInvItemCriteriaDomain}に絞込条件を設定し、
     *     {@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}を呼び出します。
     *       更新内容
     *         - CURR_CD:登録データ取得.CURR_CD
     *         - UNIT_PRICE:登録データ取得.CUSTOMS_VALUATION
     *       絞込条件
     *         - ログインDSC-ID
     *         - 荷主コード
     *         - RT_FLG:"Y"
     * </pre>
     * 
     * @param paramCriteria <br />
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException Can not update the items.<br />
     * 項目を更新できない場合。
     */
    protected int updateTwInvPltzOnInvoiceDetailBySearchForRt (W6001DocCriteriaDomain paramCriteria)
        throws ApplicationException {
        
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        docCriteria.setDscId(paramCriteria.getDscId());
        docCriteria.setShipperCd(paramCriteria.getShipperCd());
        docCriteria.setGrpNo1(paramCriteria.getGrpNo1());
        docCriteria.setGrpNo2(paramCriteria.getGrpNo2());
        
        // Get the items from the RT material PKG Materials MA. 
        // 登録データ取得
        List<? extends W6001DocPltzItemDomain> pltzItemList = w6001DocDao.searchTmPkgMtrl(docCriteria);
        
        List<TwInvItemDomain> domainList = new ArrayList<TwInvItemDomain>();
        List<TwInvItemCriteriaDomain> criteriaList = new ArrayList<TwInvItemCriteriaDomain>();
        if (pltzItemList != null && !pltzItemList.isEmpty()) {
            for (W6001DocPltzItemDomain docPltzDomain : pltzItemList) {
                TwInvItemDomain domain = new TwInvItemDomain();
                domain.setCurrCd(StringUtil.getEmptyToBlank(docPltzDomain.getCurrCd()));
                domain.setUnitPrice(docPltzDomain.getCustomsValuation());
                // UT287 ADD START
                domain.setLengthUnit(docPltzDomain.getLengthUnit());
                domain.setLength(docPltzDomain.getLength());
                domain.setWidth(docPltzDomain.getWidth());
                domain.setHeight(docPltzDomain.getHeight());
                // UT287 ADD END
                commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6007);
                
                TwInvItemCriteriaDomain criteria = new TwInvItemCriteriaDomain();
                criteria.setDscId(paramCriteria.getDscId());
                criteria.setShipperCd(paramCriteria.getShipperCd());
                criteria.setRtFlg(FLAG_Y);
                criteria.setMainMark(docPltzDomain.getMainMark());
                criteria.setBrch(docPltzDomain.getBrch());
                criteria.setSortOdr(docPltzDomain.getSortOdr());
                
                domainList.add(domain);
                criteriaList.add(criteria);
            }
        }
        
        return twInvItemService.updateByCondition(domainList, criteriaList);
    }
    // 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<

    // ST946 MANUAL SCREEN TRANSITION ADD START
    /**
     * For invoice infomation, the properties of numerical value replace null to zero<br />
     * nullのインボイス情報数値項目をゼロに置換する。
     * 
     * @param <T> domain class type
     * @param domain target domain
     */
    protected <T> void nullToZeroNumericPropertiesForHeader(T domain) {
        String[] numericProperties = {
            "netAmount", "freight", "insurance", "vatRatio", "vat", "handlingCharge", "additionalCharge", "noCharge",
            "pltzItemQty", "totalNetWeight", "totalGrossWeight", "totalVolume"
        };
        try {
            for (String numericProperty : numericProperties) {
                if (PropertyUtils.getProperty(domain, numericProperty) == null) {
                    PropertyUtils.setProperty(domain, numericProperty, BigDecimal.ZERO);
                }
            }
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }

    /**
     * For packaging infomation, the domain properties of numerical value replace null to zero<br />
     * nullの梱包情報数値項目をゼロに置換する。
     * 
     * @param <T> domain class type
     * @param domain target domain
     */
    protected <T> void nullToZeroNumericPropertiesForAttach(T domain) {
        String[] numericProperties = {
            "pltzItemQty", "totalNetWeight", "totalGrossWeight", "totalVolume"
        };
        try {
            for (String numericProperty : numericProperties) {
                if (PropertyUtils.getProperty(domain, numericProperty) == null) {
                    PropertyUtils.setProperty(domain, numericProperty, BigDecimal.ZERO);
                }
            }
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
    // ST946 MANUAL SCREEN TRANSITION ADD END

    /**
     * Create a CML attach CSV file, registe it to the file manager<br />
     * CMLアタッチCSVファイルを作成し、ファイルマネージャーに登録する。
     *
     * <pre>
     * UT205 CML ATTACH CSV ADD
     * </pre>
     * 
     * @param criteria criteria domain/条件ドメイン
     * @param invoiceNo main invoice No./メインインボイスNo.
     * @param invoiceIssueDt invoice issue date/インボイス発行日
     * @throws ApplicationException business exception/業務例外
     */
    protected void createCmlAttachCsvFile(W6001DocCriteriaDomain criteria, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException
    {
        List<List<String>> csvRecordList = new ArrayList<List<String>>();
        String csvFileId = null;

        // title record
        // タイトルレコード
        List<String> csvFieldTitleList = new ArrayList<String>();
        csvFieldTitleList.add("ShipperName");
        csvFieldTitleList.add("ConsigneeName");
        csvFieldTitleList.add("ShipToName");
        csvFieldTitleList.add("InvoiceNo");
        csvFieldTitleList.add("ContainerNo");
        csvFieldTitleList.add("CMLNo");
        csvFieldTitleList.add("ItemTypeName");
        csvFieldTitleList.add("ModelCode"); // UT416 ADD
        csvFieldTitleList.add("DNItemNo");
        csvFieldTitleList.add("CustomerItemNo");
        csvFieldTitleList.add("ItemDescription");
        csvFieldTitleList.add("ShippedQTY");
        csvFieldTitleList.add("CMLVolume"); // UT324 MOD
        csvFieldTitleList.add("UnitOfCMLVolume"); // UT324 MOD
        csvFieldTitleList.add("ItemNetWeight");
        csvFieldTitleList.add("UnitOfItemNetWeight");
        csvFieldTitleList.add("ItemTotalNetWeight"); // UT324 MOD
        csvFieldTitleList.add("UnitOfItemTotalNetWeight"); // UT324 MOD
        csvFieldTitleList.add("CMLGrossWeight"); // UT324 MOD
        csvFieldTitleList.add("UnitOfCMLGrossWeight"); // UT324 MOD
        csvFieldTitleList.add("PackageType"); // UT420 ADD
        csvRecordList.add(csvFieldTitleList);
        // data record
        // データレコード
        W6001DocCriteriaDomain searchCriteriaDomain = new W6001DocCriteriaDomain();
        searchCriteriaDomain.setShipperCd(criteria.getShipperCd());
        searchCriteriaDomain.setInvoiceNo(invoiceNo);
        searchCriteriaDomain.setInvoiceIssueDt(invoiceIssueDt);
        searchCriteriaDomain.setCmlTyp(criteria.getCmlTyp()); // MGT559 ADD
        List<F6051CmlAtchFileDomain> resultDomainList
            = w6001DocDao.searchForCreateCmlAttachCsvFile(searchCriteriaDomain);
        for (F6051CmlAtchFileDomain resultDomain : resultDomainList) {
            List<String> csvFieldList = new ArrayList<String>();
            csvFieldList.add(resultDomain.getShipperNmAbb());
            csvFieldList.add(resultDomain.getConsigneeNmAbb());
            csvFieldList.add(resultDomain.getShipToNmAbb());
            csvFieldList.add(resultDomain.getInvoiceNo());
            csvFieldList.add(resultDomain.getContainerNo());
            csvFieldList.add(resultDomain.getMainMark());
            csvFieldList.add(resultDomain.getItemTypName());
            csvFieldList.add(resultDomain.getModelCd()); // UT416 ADD
            csvFieldList.add(resultDomain.getItemNo());
            csvFieldList.add(resultDomain.getCustomerItemNo());
            csvFieldList.add(resultDomain.getItemDescription());
            csvFieldList.add(resultDomain.getQty());
            csvFieldList.add(resultDomain.getVolume());
            csvFieldList.add(resultDomain.getVolumeUnitDisp());
            csvFieldList.add(resultDomain.getItemWeight());
            csvFieldList.add(resultDomain.getItemWeightUnitDisp());
            // IN174 MOD START
            // Convert N/W shipper unit.
            // N/Wをシッパーの単位へ変換。
            BigDecimal convertedNetWeight
                = commonService.convertWeightUnitNoOverflowCheck(
                    resultDomain.getItemWeightVal().multiply(resultDomain.getQtyVal()),
                        resultDomain.getItemWeightUnit(), resultDomain.getNetWeightUnit()
                );
            csvFieldList.add(convertedNetWeight.toPlainString());
            // IN174 MOD END
            csvFieldList.add(resultDomain.getNetWeightUnitDisp());
            csvFieldList.add(resultDomain.getGrossWeight());
            csvFieldList.add(resultDomain.getGrossWeightUnitDisp());
            csvFieldList.add(resultDomain.getPalletCartonTyp()); // UT420 ADD
            csvRecordList.add(csvFieldList);
        }

        // Convert to CSV and register to file manager.
        // CSVに変換してファイルマネージャーに登録する。
        String csvString = CsvListConversion.getCsv(csvRecordList);
        String csvFileName
            = makeDocumentationFileNameOnAuto(
                criteria.getShipperCd(), invoiceNo, invoiceIssueDt, "CMLAtch", "csv"
            );
        try {
            csvFileId = createFileUpload(new ByteArrayInputStream(csvString.getBytes("UTF-8")),
                csvFileName, criteria.getDscId());
        } catch (Exception e) {
            throw new SystemException(NXS_91_0001, e);
        }

        // Register the file ID to TT_SHIPPING_DOCUMENT.
        // ファイルIDを船積み書類に登録する。
        TtShippingDocumentDomain ttShippingDocumentDomain = new TtShippingDocumentDomain();
        ttShippingDocumentDomain.setShipperCd(criteria.getShipperCd());
        ttShippingDocumentDomain.setInvoiceNo(invoiceNo);
        ttShippingDocumentDomain.setInvoiceIssueDt(invoiceIssueDt);
        ttShippingDocumentDomain.setDocTyp(DOC_TYP_CML_ATCH_CSV);
        ttShippingDocumentDomain.setBrch(BigDecimal.ONE);
        ttShippingDocumentDomain.setFileId(csvFileId);
        ttShippingDocumentDomain.setDeleteFlg(FLAG_N);
        commonService.setCommonPropertyForRegist(ttShippingDocumentDomain, criteria.getScreenId());
        ttShippingDocumentService.create(ttShippingDocumentDomain);
    }
}
