/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.asia.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_BLANK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_RECEIVED_AT_TO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FREIGHT_RESPONSIBLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_LOADING_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PALLET_CARTON_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PRICE_TERMS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_ERT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CONTAINER_LOOSE_TYP_LOOSE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_Z;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INPUT_METH_TYP_AUTO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INPUT_METH_TYP_MANUAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_TYP_PKG_MATERIALS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.IVN_CATEGORY_COMMERCIAL_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_BACK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_DOOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_FREE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIX_TAG_STATUS_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIX_TAG_STATUS_MIXTAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MNF_FLAG_NG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MNF_FLAG_OK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0005_BHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5017;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5018;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5019;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5021;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5025;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5038;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5039;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5040;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5044;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5048;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5059;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5062;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5064;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5068;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5069;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5072;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0005_BHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0075;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0089;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0090;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_5045;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MULTI;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_SINGLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_TYP_DUMMY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_TYP_ERT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_TYP_INNER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_TYP_OUTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_PLTZ;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QTY_UNIT_EA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROW_NUM_1;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.RT_TYP_1WAY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_CML_NO_DN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_MIX_TAG_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_COMPLATE_PACKING;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_INCOMPLATE_PACKING;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.STRING_ZERO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRNS_CD_AIR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WEB_SERVICE_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WORK_TYP_CML_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WORK_TYP_MIX_TAG_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_ERR_REPORT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM_JOB;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.gscm.framework.util.DateUtil.formatDate;
import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.ZERO;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.apache.commons.lang.StringUtils.defaultString;
import static org.apache.commons.lang.StringUtils.isEmpty;

import java.io.File;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.asia.business.domain.Ws2501InternalVariableDtlKanbanAsiaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaCustomerXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevHisDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPrinterDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkErrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkMixTagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixKanbanDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanExtraDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtXpltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmUserInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService;
import com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService;
import com.globaldenso.eca0027.core.auto.business.service.TmPrinterService;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TtXpltzService;
import com.globaldenso.eca0027.core.auto.business.service.VmUserInfoService;
import com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501CntShipperCdDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableDtlDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableDtlKanbanDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableHdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsNonInstDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsNonPltzInstNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsPltzInstNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixedTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixedTagItemNoNwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixedTagRtGwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501NxsPkgSpecificationDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501OuterSumWeightDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgMaterialsDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSetMaterialsNxsCompNmDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecMaterialsNameRevDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecRevHisDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PltzInstrInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PltzNxsShipToDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ProductivityDataInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501SumCmlWeightForUnitDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TmCustomerQrPatternHdrByDtlDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TmExpShipToShippingByKeyDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TmNxsWhByXrefDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemByKanbanDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemDeliveryTimeDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemGwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemNwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501UnpackagedItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2504RegistCmlListItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtEisProductDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501CntShipperCdCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsNonInstCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsNonPltzInstNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsPltzInstNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501MixedTagItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501MixedTagItemNoNwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501MixedTagRtGwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501NxsPkgSpecificationCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501OuterSumWeightCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgMaterialsCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgSpecCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgSpecMaterialsNameRevCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgSpecRevHisCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PltzInstrInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PltzNxsShipToCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501SumCmlWeightForUnitCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TmExpShipToShippingByKeyCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TmNxsWhByXrefCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtMixTagCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemByKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemDeliveryTimeCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemGwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemNwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501UnpackagedItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2504PkgItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.L2002ReportService;
import com.globaldenso.eca0027.core.business.service.L2003ReportService;
import com.globaldenso.eca0027.core.business.service.L2004ReportService;
import com.globaldenso.eca0027.core.business.service.L2005ReportService;
import com.globaldenso.eca0027.core.business.service.LC001ReportService;
import com.globaldenso.eca0027.core.business.service.WsBhtEisProductService;
import com.globaldenso.eca0027.core.business.ws.Ws2004RestService;
import com.globaldenso.eca0027.core.business.ws.Ws2005RestService;
import com.globaldenso.eca0027.core.business.ws.Ws9002RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmUserConfService;
import com.globaldenso.gscm.framework.business.service.TmUserService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * This is an implement class of the Web service of EIS Product.
 * <br />EIS ProductのWebサービスの実装クラスです。
 *
 * @author $Author: 10088DS01595 $
 * @version $Revision: 13582 $
 */
public class WsBhtEisProductAsiaServiceImpl implements WsBhtEisProductService   {

    /**
     * [ws2507] [ws2509] [ws2510] [ws2511] [ws2512] common service
     * <br />[ws2507][ws2509][ws2510][ws2511][ws2512]共通サービス
     */
    protected CommonService commonService;

    /**
     * [ws2509] Mix tag print service
     * <br />[ws2509]Mixタグ印刷サービス
     */
    protected L2002ReportService l2002ReportService;

    /**
     * [ws2507] [ws2509] CML service
     * <br />[ws2507][ws2509]CMLサービス
     */
    protected L2003ReportService l2003ReportService;

    /**
     * [ws2511] X-TAG print service
     * <br />[ws2511]まとめCML印刷サービス
     */
    protected L2004ReportService l2004ReportService;

    /**
     * [ws2507] [ws2509] CML error report service
     * <br />[ws2507][ws2509]CMLエラーレポートサービス
     */
    protected L2005ReportService l2005ReportService;

    /**
     * [ws2512] CML print service
     * <br />[ws2512]CML印刷サービス
     */
    protected LC001ReportService lc001ReportService;

    /**
     * [ws2503] CIGMA-Customer-Cross-Reference-Master service
     * <br />[ws2503]NEXUS荷受人クロスリファレンス原単位サービス
     */
    protected TmCigmaCustomerXrefService tmCigmaCustomerXrefService;

    /**
     * [ws2503] CIGMA-Ship-To-Cross-Reference-Master service
     * <br />[ws2503]NEXUS送荷先クロスリファレンス原単位サービス
     */
    protected TmCigmaShipToXrefService tmCigmaShipToXrefService;

    /**
     * [ws2503] CIGMA-Warehouse-Cross-Reference-Master service
     * <br />[ws2503]倉庫クロスリファレンス原単位サービス
     */
    protected TmCigmaWhXrefService tmCigmaWhXrefService;


    /**
     * [ws2505] [ws2507] [ws2509] [ws2510] NEXUS-Company-Master service
     * <br />[ws2505][ws2507][ws2509][ws2510]NEXUS会社原単位サービス
     */
    protected TmNxsCompService tmNxsCompService;


    /**
     * [ws2502] [ws2510] packing combination master (header) service
     * <br />[ws2502][ws2510]包装組合せ原単位（ヘッダ）サービス
     */
    protected TmPkgSetHdrService tmPkgSetHdrService;

    /**
     * [ws2505] PKG-Specification-MA(Header) service
     * <br />[ws2505]包装仕様原単位(ヘッダ)サービス
     */
    protected TmPkgSpecHdrService tmPkgSpecHdrService;

    /**
     * [ws2505] Package-Specification-Revision-History-Master service
     * <br />[ws2505]包装仕様有効リビジョン履歴原単位サービス
     */
    protected TmPkgSpecRevHisService tmPkgSpecRevHisService;


    /**
     * [ws2505] Package-Specification-Revision-Master service
     * <br />[ws2505]包装仕様有効リビジョン原単位サービス
     */
    protected TmPkgSpecRevService tmPkgSpecRevService;


    /**
     * [ws2507] [ws2509] [ws2511] [ws2512] TM_PRINTER service
     * <br />[ws2507][ws2509][ws2511][ws2512]TM_PRINTERサービス
     */
    protected TmPrinterService tmPrinterService;


    /**
     * [ws2502] [ws2510] user-set master service
     * <br />[ws2502][ws2510]ユーザ設定原単位サービス
     */
    protected TmUserConfService tmUserConfService;

    /**
     * [ws2502] [ws2503] [ws2510] user intensive master service
     * <br />[ws2502][ws2503][ws2510]ユーザ集約原単位サービス
     */
    protected TmUserService tmUserService;

    /**
     * [ws2504] Code-Master service
     * <br />[ws2504]コード原単位サービス
     */
    protected TmCdService tmCdService;

    /**
     * [ws2502] CML-Error-Report-Header service
     * <br />[ws2502]CMLエラーレポートヘッダサービス
     */
    protected TtCmlErrorHeaderService ttCmlErrorHeaderService;


    /**
     * [ws2501] [ws2502] MIX tag service
     * <br />[ws2501][ws2502]MIXタグサービス
     */
    protected TtMixtagService ttMixtagService;


    /**
     * [ws2501] [ws2502] [ws2507] [ws2509] Packaging Instruction (=Pull) service
     * <br />[ws2501][ws2502][ws2507][ws2509]梱包指示サービス
     */
    protected TtPltzInstrService ttPltzInstrService;


    /**
     * [ws2501] [ws2507] [ws2509] Palletize service
     * <br />[ws2501][ws2507][ws2509]パレタイズサービス
     */
    protected TtPltzService ttPltzService;


    /**
     * [ws2510] X-Palletize service
     * <br />[ws2510]まとめパレタイズサービス
     */
    protected TtXpltzService ttXpltzService;


    /**
     * [ws2511] VM_USER_INFO service
     * <br />[ws2511]VM_USER_INFOサービス
     */
    protected VmUserInfoService vmUserInfoService;


    /**
     * [ws2502] [ws2504] Palletize-Item service
     * <br />[ws2502][ws2504]パレタイズ対象品サービス
     */
    protected TtPltzItemService ttPltzItemService;


    /**
     * [ws2504] Export-Ship-To-Shipping-Master service
     * <br />[ws2504]輸出送荷先出荷原単位サービス
     */
    protected TmExpShipToShippingService tmExpShipToShippingService;

    /**
     * [ws2504] NEXUS-Ship-To-Master service
     * <br />[ws2504]NEXUS送荷先原単位サービス
     */
    protected TmNxsShipToService tmNxsShipToService;

    /**
     * [ws2502] [ws2504] PKG-Materials-MA service
     * <br />[ws2502][ws2504]包装材原単位サービス
     */
    protected TmPkgMtrlService tmPkgMtrlService;

    /**
     * [ws2501][ws2502][ws2505][ws2507][ws2508][ws2509][ws2510][ws2512]EisProductDao
     * <br />[ws2501][ws2502][ws2505][ws2507][ws2508][ws2509][ws2510][ws2512]EisProductDao
     */
    protected WsBhtEisProductDao wsBhtEisProductDao;

    /**
     * [ws2502][ws2503] Web service (WS2004)
     * <br />[ws2502][ws2503]Webサービス(WS2004)
     */
    protected Ws2004RestService ws2004RestService;

    /**
     * [ws2502] Measure-Unit-Master service
     * <br />[ws2502]計量単位原単位サービス
     */
    protected TmMeasureUnitService tmMeasureUnitService;

    /**
     * [ws2502] CML-Error-Report-Detail service
     * <br />[ws2502]CMLエラーレポート明細サービス
     */
    protected TtCmlErrorDtlService ttCmlErrorDtlService;

    /**
     * [ws2502] Palletize-Instruction-Receive-Order service
     * <br />[ws2502]梱包指示品目番号受注情報サービス
     */
    protected TtPltzInstrOdrService ttPltzInstrOdrService;

    /**
     * [ws2502] Palletize-Item-Receive-Order service
     * <br />[ws2502]パレタイズ対象品受注情報サービス
     */
    protected TtPltzItemOdrService ttPltzItemOdrService;

    /**
     * [ws2502] Mix-Tag-RT service
     * <br />[ws2502]MIXED用RT材サービス
     */
    protected TtMixtagRtService ttMixtagRtService;

    /**
     * [ws2502] Palletize-Item-KANBAN service
     * <br />[ws2502]パレタイズ対象品かんばん情報サービス
     */
    protected TtPltzKanbanService ttPltzKanbanService;

    /**
     * [ws2502,ws2503]Palletize-Item-KANBAN service (for Asia)
     * <br />パレタイズ対象品かんばん情報サービス(Asia固有機能)
     */
    protected TtPltzKanbanExtraService ttPltzKanbanExtraService;

    /**
     * [ws2502] Mix-Tag-KANBAN service
     * <br />[ws2502]MIX品かんばん情報サービス
     */
    protected TtMixKanbanService ttMixKanbanService;

    /**
     * [ws2502] Palletize-Instruction-Item-No service
     * <br />[ws2502]梱包指示品目番号サービス
     */
    protected TtPltzInstrItemNoService ttPltzInstrItemNoService;

    /**
     * [ws2502] BHT-Work-Time service
     * <br />[ws2502]BHT作業時間サービス
     */
    protected TtBhtWorkTimeService ttBhtWorkTimeService;

    /**
     * [ws2502] BHT-Work-Time-For-Palletize service
     * <br />[ws2502]BHT作業情報テーブル(パレタイズ)サービス
     */
    protected TtBhtWorkPltzService ttBhtWorkPltzService;

    /**
     * [ws2508] BHT-Work-Time-For-Mix-Tag service
     * <br />[ws2508]BHT作業情報テーブル(小箱内多品)サービス
     */
    protected TtBhtWorkMixTagService ttBhtWorkMixTagService;

    /**
     * [ws2502] BHT-Work-Error service
     * <br />[ws2502]BHT作業エラーサービス
     */
    protected TtBhtWorkErrService ttBhtWorkErrService;

    /**
     * [ws2503] Export-Receive-Order service
     * <br />[ws2503] 輸出受注サービス
     */
    protected TtExpRcvOdrService ttExpRcvOdrService;

    /**
     * [ws2508] MIXED-ITEM-NO service
     * <br />[ws2508] MIXED品目番号サービス
     */
    protected TtMixtagItemNoService ttMixtagItemNoService;

    /**
     * [ws2503] and [ws2508] Mix-Tag-Receive-Order service
     * <br />[ws2503][ws2508] MIXED品目番号受注情報サービス
     */
    protected TtMixtagOdrService ttMixtagOdrService;

    /**
     * [ws2503] Temp-Stock service
     * <br />[ws2503] 仮在庫サービス
     */
    protected TtTmpStockService ttTmpStockService;

    /**
     * [ws2503] ECA0027_WS_2005_Create Rcv Odr Alloc service
     * <br />[ws2503] ECA0027_WS_2005_Create Rcv Odr Allocサービス
     */
    protected Ws2005RestService ws2005RestService;

    /**
     * [ws2504] WS9002Rest service
     * <br />[ws2504] WS9002Restサービス
     */
    protected Ws9002RestService ws9002RestService;

    // ------------------- Constructor ---------------------------------------
    // ------------------- コンストラクタ ---------------------------------------
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsBhtEisProductAsiaServiceImpl() {
    }

    // ------------------- Getter /Setter of dependence service and Dao -------------------
    // ------------------- 依存サービス・DaoのGetter / Setter -------------------

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for l2002ReportService.
     *
     * @param reportService Set for l2002ReportService
     */
    public void setL2002ReportService(L2002ReportService reportService) {
        l2002ReportService = reportService;
    }

    /**
     * Setter method for l2003ReportService.
     *
     * @param reportService Set for l2003ReportService
     */
    public void setL2003ReportService(L2003ReportService reportService) {
        l2003ReportService = reportService;
    }

    /**
     * Setter method for l2004ReportService.
     *
     * @param reportService Set for l2004ReportService
     */
    public void setL2004ReportService(L2004ReportService reportService) {
        l2004ReportService = reportService;
    }

    /**
     * Setter method for l2005ReportService.
     *
     * @param reportService Set for l2005ReportService
     */
    public void setL2005ReportService(L2005ReportService reportService) {
        l2005ReportService = reportService;
    }

    /**
     * Setter method for lc001ReportService.
     *
     * @param lc001ReportService Set for lc001ReportService
     */
    public void setLc001ReportService(LC001ReportService lc001ReportService) {
        this.lc001ReportService = lc001ReportService;
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
     * Setter method for tmCigmaShipToXrefService.
     *
     * @param tmCigmaShipToXrefService Set for tmCigmaShipToXrefService
     */
    public void setTmCigmaShipToXrefService(
        TmCigmaShipToXrefService tmCigmaShipToXrefService) {
        this.tmCigmaShipToXrefService = tmCigmaShipToXrefService;
    }

    /**
     * Setter method for tmCigmaWhXrefService.
     *
     * @param tmCigmaWhXrefService Set for tmCigmaWhXrefService
     */
    public void setTmCigmaWhXrefService(TmCigmaWhXrefService tmCigmaWhXrefService) {
        this.tmCigmaWhXrefService = tmCigmaWhXrefService;
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
     * Setter method for tmPkgSetHdrService.
     *
     * @param tmPkgSetHdrService Set for tmPkgSetHdrService
     */
    public void setTmPkgSetHdrService(TmPkgSetHdrService tmPkgSetHdrService) {
        this.tmPkgSetHdrService = tmPkgSetHdrService;
    }

    /**
     * Setter method for tmPkgSpecHdrService.
     *
     * @param tmPkgSpecHdrService Set for tmPkgSpecHdrService
     */
    public void setTmPkgSpecHdrService(
        TmPkgSpecHdrService tmPkgSpecHdrService) {
        this.tmPkgSpecHdrService = tmPkgSpecHdrService;
    }

    /**
     * Setter method for tmPkgSpecRevHisService.
     *
     * @param tmPkgSpecRevHisService Set for tmPkgSpecRevHisService
     */
    public void setTmPkgSpecRevHisService(
        TmPkgSpecRevHisService tmPkgSpecRevHisService) {
        this.tmPkgSpecRevHisService = tmPkgSpecRevHisService;
    }

    /**
     * Setter method for tmPkgSpecRevService.
     *
     * @param tmPkgSpecRevService Set for tmPkgSpecRevService
     */
    public void setTmPkgSpecRevService(TmPkgSpecRevService tmPkgSpecRevService) {
        this.tmPkgSpecRevService = tmPkgSpecRevService;
    }

    /**
     * Setter method for tmPrinterService.
     *
     * @param tmPrinterService Set for tmPrinterService
     */
    public void setTmPrinterService(TmPrinterService tmPrinterService) {
        this.tmPrinterService = tmPrinterService;
    }

    /**
     * Setter method for tmUserConfService.
     *
     * @param tmUserConfService Set for tmUserConfService
     */
    public void setTmUserConfService(TmUserConfService tmUserConfService) {
        this.tmUserConfService = tmUserConfService;
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
     * Setter method for tmCdService.
     *
     * @param tmCdService Set for tmCdService
     */
    public void setTmCdService(TmCdService tmCdService) {
        this.tmCdService = tmCdService;
    }

    /**
     * Setter method for ttCmlErrorHeaderService.
     *
     * @param ttCmlErrorHeaderService Set for ttCmlErrorHeaderService
     */
    public void setTtCmlErrorHeaderService(
        TtCmlErrorHeaderService ttCmlErrorHeaderService) {
        this.ttCmlErrorHeaderService = ttCmlErrorHeaderService;
    }

    /**
     * Setter method for ttMixtagService.
     *
     * @param ttMixtagService Set for ttMixtagService
     */
    public void setTtMixtagService(TtMixtagService ttMixtagService) {
        this.ttMixtagService = ttMixtagService;
    }

    /**
     * Setter method for ttPltzInstrService.
     *
     * @param ttPltzInstrService Set for ttPltzInstrService
     */
    public void setTtPltzInstrService(TtPltzInstrService ttPltzInstrService) {
        this.ttPltzInstrService = ttPltzInstrService;
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
     * Setter method for ttXpltzService.
     *
     * @param ttXpltzService Set for ttXpltzService
     */
    public void setTtXpltzService(TtXpltzService ttXpltzService) {
        this.ttXpltzService = ttXpltzService;
    }

    /**
     * Setter method for vmUserInfoService.
     *
     * @param vmUserInfoService Set for vmUserInfoService
     */
    public void setVmUserInfoService(VmUserInfoService vmUserInfoService) {
        this.vmUserInfoService = vmUserInfoService;
    }

    /**
     * Setter method for ttPltzItemService.
     *
     * @param ttPltzItemService Set for ttPltzItemService
     */
    public void setTtPltzItemService(TtPltzItemService ttPltzItemService) {
        this.ttPltzItemService = ttPltzItemService;
    }

    /**
     * Setter method for tmExpShipToShippingService.
     *
     * @param tmExpShipToShippingService Set for tmExpShipToShippingService
     */
    public void setTmExpShipToShippingService(
        TmExpShipToShippingService tmExpShipToShippingService) {
        this.tmExpShipToShippingService = tmExpShipToShippingService;
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
     * Setter method for tmPkgMtrlService.
     *
     * @param tmPkgMtrlService Set for tmPkgMtrlService
     */
    public void setTmPkgMtrlService(TmPkgMtrlService tmPkgMtrlService) {
        this.tmPkgMtrlService = tmPkgMtrlService;
    }

    /**
     * Setter method for wsBhtEisProductDao.
     *
     * @param wsBhtEisProductDao Set for wsBhtEisProductDao
     */
    public void setWsBhtEisProductDao(WsBhtEisProductDao wsBhtEisProductDao) {
        this.wsBhtEisProductDao = wsBhtEisProductDao;
    }

    /**
     * Setter method for ws2004RestService.
     *
     * @param ws2004RestService Set for ws2004RestService
     */
    public void setWs2004RestService(Ws2004RestService ws2004RestService) {
        this.ws2004RestService = ws2004RestService;
    }

    /**
     * Setter method for tmMeasureUnitService.
     *
     * @param tmMeasureUnitService Set for tmMeasureUnitService
     */
    public void setTmMeasureUnitService(TmMeasureUnitService tmMeasureUnitService) {
        this.tmMeasureUnitService = tmMeasureUnitService;
    }

    /**
     * Setter method for ttCmlErrorDtlService.
     *
     * @param ttCmlErrorDtlService Set for ttCmlErrorDtlService
     */
    public void setTtCmlErrorDtlService(TtCmlErrorDtlService ttCmlErrorDtlService) {
        this.ttCmlErrorDtlService = ttCmlErrorDtlService;
    }

    /**
     * Setter method for ttPltzInstrOdrService.
     *
     * @param ttPltzInstrOdrService Set for ttPltzInstrOdrService
     */
    public void setTtPltzInstrOdrService(TtPltzInstrOdrService ttPltzInstrOdrService) {
        this.ttPltzInstrOdrService = ttPltzInstrOdrService;
    }

    /**
     * Setter method for ttPltzItemOdrService.
     *
     * @param ttPltzItemOdrService Set for ttPltzItemOdrService
     */
    public void setTtPltzItemOdrService(TtPltzItemOdrService ttPltzItemOdrService) {
        this.ttPltzItemOdrService = ttPltzItemOdrService;
    }

    /**
     * Setter method for ttMixtagRtService.
     *
     * @param ttMixtagRtService Set for ttMixtagRtService
     */
    public void setTtMixtagRtService(TtMixtagRtService ttMixtagRtService) {
        this.ttMixtagRtService = ttMixtagRtService;
    }

    /**
     * Setter method for ttPltzKanbanService.
     *
     * @param ttPltzKanbanService Set for ttPltzKanbanService
     */
    public void setTtPltzKanbanService(TtPltzKanbanService ttPltzKanbanService) {
        this.ttPltzKanbanService = ttPltzKanbanService;
    }

    /**
     * Setter method for ttPltzKanbanExtraService.
     *
     * @param ttPltzKanbanExtraService Set forttPltzKanbanExtraService
     */
    public void setTtPltzKanbanExtraService(
        TtPltzKanbanExtraService ttPltzKanbanExtraService) {
        this.ttPltzKanbanExtraService = ttPltzKanbanExtraService;
    }

    /**
     * Setter method for ttMixKanbanService.
     *
     * @param ttMixKanbanService Set for ttMixKanbanService
     */
    public void setTtMixKanbanService(TtMixKanbanService ttMixKanbanService) {
        this.ttMixKanbanService = ttMixKanbanService;
    }

    /**
     * Setter method for ttPltzInstrItemNoService.
     *
     * @param ttPltzInstrItemNoService Set for ttPltzInstrItemNoService
     */
    public void setTtPltzInstrItemNoService(
        TtPltzInstrItemNoService ttPltzInstrItemNoService) {
        this.ttPltzInstrItemNoService = ttPltzInstrItemNoService;
    }

    /**
     * Setter method for ttBhtWorkTimeService.
     *
     * @param ttBhtWorkTimeService Set for ttBhtWorkTimeService
     */
    public void setTtBhtWorkTimeService(TtBhtWorkTimeService ttBhtWorkTimeService) {
        this.ttBhtWorkTimeService = ttBhtWorkTimeService;
    }

    /**
     * Setter method for ttBhtWorkPltzService.
     *
     * @param ttBhtWorkPltzService Set for ttBhtWorkPltzService
     */
    public void setTtBhtWorkPltzService(TtBhtWorkPltzService ttBhtWorkPltzService) {
        this.ttBhtWorkPltzService = ttBhtWorkPltzService;
    }

    /**
     * Setter method for ttBhtWorkMixTagService.
     *
     * @param ttBhtWorkMixTagService Set for ttBhtWorkMixTagService
     */
    public void setTtBhtWorkMixTagService(
        TtBhtWorkMixTagService ttBhtWorkMixTagService) {
        this.ttBhtWorkMixTagService = ttBhtWorkMixTagService;
    }

    /**
     * Setter method for ttBhtWorkErrService.
     *
     * @param ttBhtWorkErrService Set for ttBhtWorkErrService
     */
    public void setTtBhtWorkErrService(TtBhtWorkErrService ttBhtWorkErrService) {
        this.ttBhtWorkErrService = ttBhtWorkErrService;
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
     * Setter method for ttMixtagItemNoService.
     *
     * @param ttMixtagItemNoService Set for ttMixtagItemNoService
     */
    public void setTtMixtagItemNoService(TtMixtagItemNoService ttMixtagItemNoService) {
        this.ttMixtagItemNoService = ttMixtagItemNoService;
    }

    /**
     * Setter method for ttMixtagOdrService.
     *
     * @param ttMixtagOdrService Set for ttMixtagOdrService
     */
    public void setTtMixtagOdrService(TtMixtagOdrService ttMixtagOdrService) {
        this.ttMixtagOdrService = ttMixtagOdrService;
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
     * Setter method for ws2005RestService.
     *
     * @param ws2005RestService Set for ws2005RestService
     */
    public void setWs2005RestService(Ws2005RestService ws2005RestService) {
        this.ws2005RestService = ws2005RestService;
    }

    /**
     * Setter method for ws9002RestService.
     *
     * @param ws9002RestService Set for ws9002RestService
     */
    public void setWs9002RestService(Ws9002RestService ws9002RestService) {
        this.ws9002RestService = ws9002RestService;
    }

    // --------------------------------- ECA0027_WS_2501_Get Palletize Instruction ---------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTtPltzOnPltzInstr(java.lang.String, com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain)
     */
    public String validateDatabaseTtPltzOnPltzInstr(String pltzInstrNo, TtPltzInstrDomain result)
        throws ApplicationException {

        TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
        criteria.setPltzInstrNo(pltzInstrNo);

        // Acquisition of a Packaging Instruction (=Pull)
        // 梱包指示の取得
        TtPltzInstrDomain ttPltzInstr = ttPltzInstrService.searchByKey(criteria);

        // Existence check
        // 存在チェック
        if (ttPltzInstr == null) {
            return NXS_E1_5038;
        }

        // PALLETIZE-INSTRUCTION-STATUS check
        // 梱包指示ステータスチェック
        if (PLTZ_INSTR_STATUS_ALL_CML_CREATE.compareTo(ttPltzInstr.getPltzInstrStatus()) == 0
            || PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT.compareTo(ttPltzInstr.getPltzInstrStatus()) == 0) {
            return NXS_E1_5015;
        }

        // return VALUE setting
        // 戻り値設定
        CommonUtil.copyPropertiesDomainToDomain(result, ttPltzInstr);

        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#searchOnPltzInstr(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)
     */
    public WsBhtEisProductDomain searchOnPltzInstr(
        WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        // A setting of a EisProduct domain
        // EisProductドメインの設定
        WsBhtEisProductDomain wsBhtEisProduct = new WsBhtEisProductDomain();

        // Common use item acquisition
        // 共通使用項目取得
        String pltzInstrNo = criteria.getPltzInstrNo();

        Ws2501InternalVariableHdrDomain internalVariableHdrDomain = new Ws2501InternalVariableHdrDomain();
        internalVariableHdrDomain.setShipperCd(criteria.getShipperCd());
        internalVariableHdrDomain.setCustomerCd(criteria.getCustomerCd());
        internalVariableHdrDomain.setLgcyShipTo(criteria.getLgcyShipTo());
        internalVariableHdrDomain.setTrnsCd(criteria.getTrnsCd());
        internalVariableHdrDomain.setPlntCd(criteria.getPlntCd());
        internalVariableHdrDomain.setLgcyWhCd(criteria.getLgcyWhCd());
        wsBhtEisProduct.setWs2501InternalVariableHdrDomain(internalVariableHdrDomain);

        // Acquisition of packed up data
        // - Acquisition of a MAIN-MARK list
        // 梱包済みデータの取得
        // - メインマークリストの取得
        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
        ttPltzCriteria.setPltzInstrNo(pltzInstrNo);
        ttPltzCriteria.setPreferredOrder("MAIN_MARK desc");

        List<TtPltzDomain> ttPltzList = ttPltzService.searchByCondition(ttPltzCriteria);

        // - Acquisition of a KANBAN list
        // - かんばんリストの取得
        Ws2501TtPltzItemByKanbanCriteriaDomain ttPltzItemByKanbanCriteria = new Ws2501TtPltzItemByKanbanCriteriaDomain();
        ttPltzItemByKanbanCriteria.setPltzInstrNo(pltzInstrNo);
        ttPltzItemByKanbanCriteria.setMixTagNo(null);

        List<? extends Ws2501TtPltzItemByKanbanDomain> ttPltzItemByKanbanList = wsBhtEisProductDao.searchTtPltzItemByKanban(ttPltzItemByKanbanCriteria);

        // - Acquisition of a MIX tag list
        // - MIXタグリストの取得
        List<TtMixtagDomain> ttMixtagList = searchMixTagList(pltzInstrNo, MIX_TAG_STATUS_CML);

        // Acquisition of unpacked up data
        // - Acquisition of a Unpackaged-Item-No list
        // 未梱包データの取得
        // - 未梱包品番リストの取得
        Ws2501UnpackagedItemNoCriteriaDomain unpackagedItemNoCriteria = new Ws2501UnpackagedItemNoCriteriaDomain();
        unpackagedItemNoCriteria.setPltzInstrNo(pltzInstrNo);
        unpackagedItemNoCriteria.setMixTagStatus(MIX_TAG_STATUS_MIXTAG);

        List<? extends Ws2501UnpackagedItemNoDomain> unpackagedItemNoList = wsBhtEisProductDao.searchUnpackagedItemNo(unpackagedItemNoCriteria);

        // - Acquisition of an unpacked up MIX tag list
        // - 未梱包MIXタグリストの取得
        List<TtMixtagDomain> ttMixtagByNoPltzInstrList = searchMixTagList(pltzInstrNo, MIX_TAG_STATUS_MIXTAG);

        // Acquisition of customer KANBAN QR information
        // 得意先かんばんQR情報の取得
        List<? extends Ws2501TmCustomerQrPatternHdrByDtlDomain> tmCustomerQrPatternHdrByDtlList;
        if (criteria.getCollateMethTyp() == null) {
            tmCustomerQrPatternHdrByDtlList = emptyList();
        } else {

            Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain tmCustomerQrPatternHdrByDtlCriteria
                = new Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain();
            tmCustomerQrPatternHdrByDtlCriteria.setCompCd(criteria.getCompCd());
            tmCustomerQrPatternHdrByDtlCriteria.setCollateMethTyp(criteria.getCollateMethTyp());

            tmCustomerQrPatternHdrByDtlList = wsBhtEisProductDao.searchTmCustomerQrPatternHdrByDtl(tmCustomerQrPatternHdrByDtlCriteria);

            if (tmCustomerQrPatternHdrByDtlList.isEmpty()){
                Map<String, Object[]> errMap = new HashMap<String, Object[]>();
                errMap.put(NXS_E1_5064, null);
                wsBhtEisProduct.setErrMap(errMap);
                return wsBhtEisProduct;
            }
        }

        // It sets to a EisProduct domain.
        // EisProductドメインに設定
        wsBhtEisProduct.setWs2501TtPltzList(ttPltzList);
        wsBhtEisProduct.setWs2501TtPltzItemByKanbanList(ttPltzItemByKanbanList);
        wsBhtEisProduct.setWs2501TtMixtagList(ttMixtagList);
        wsBhtEisProduct.setWs2501UnpackagedItemNoList(unpackagedItemNoList);
        wsBhtEisProduct.setWs2501TtMixtagByNoPltzInstrList(ttMixtagByNoPltzInstrList);
        wsBhtEisProduct.setWs2501TmCustomerQrPatternHdrByDtlList(tmCustomerQrPatternHdrByDtlList);

        return wsBhtEisProduct;
    }

    // --------------------------------- ECA0027_WS_2502_Create Inst Palletize -------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateConsistencyItemListCstmr(java.util.List)
     */
    public boolean validateConsistencyItemListCstmr(List<? extends Ws2501ItemNoDomain> itemNoList){
        for (Ws2501ItemNoDomain itemNoItem : itemNoList) {

            String itemNo = itemNoItem.getItemNo();
            String pkgCd = itemNoItem.getPkgCd();
            String mixTagFlg = itemNoItem.getMixTagFlg();
            String indusTypCd = itemNoItem.getIndusTypCd();
            String kanbanTyp = itemNoItem.getKanbanTyp();
            BigDecimal tagSeqNo = itemNoItem.getTagSeqNo();
            BigDecimal kanbanQty = itemNoItem.getKanbanQty();
            String customerItemNo = itemNoItem.getCustomerItemNo();
            String customerTagSeqNo = itemNoItem.getCustomerTagSeqNo();

            // chick
            if (CheckUtil.isBlankOrNull(mixTagFlg)){
                return false;
            }
            if (FLAG_N.equals(mixTagFlg)){
                if (CheckUtil.isBlankOrNull(itemNo) || CheckUtil.isBlankOrNull(pkgCd) || CheckUtil.isBlankOrNull(indusTypCd) || CheckUtil.isBlankOrNull(kanbanTyp) || tagSeqNo == null || kanbanQty == null) {
                    return false;
                }
            }
            if (FLAG_Y.equals(mixTagFlg)){
                if (CheckUtil.isBlankOrNull(itemNo)) {
                    return false;
                }
            }
            if (FLAG_N.equals(mixTagFlg)){
                if (CheckUtil.isBlankOrNull(customerItemNo) && !CheckUtil.isBlankOrNull(customerTagSeqNo)) {
                    return false;
                }
            }
            if (FLAG_Y.equals(mixTagFlg)){
                if (!CheckUtil.isBlankOrNull(customerItemNo) || !CheckUtil.isBlankOrNull(customerTagSeqNo)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateConsistencyOuterNumber(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyOuterNumber(String outerCd, String outerCdFlg) {

        if (CheckUtil.isBlankOrNull(outerCdFlg)){
            return false;
        }
        if (FLAG_Y.equals(outerCdFlg) && CheckUtil.isBlankOrNull(outerCd)){
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateConsistencyPkgMtrlItemList(java.util.List)
     */
    public boolean validateConsistencyPkgMtrlItemList(List<? extends Ws2501PkgItemNoDomain> pkgItemNoList) {

        for (Ws2501PkgItemNoDomain pkgItemNoItem : pkgItemNoList){
            String pkgItemNo = pkgItemNoItem.getPkgItemNo();
            BigDecimal pkgQty = pkgItemNoItem.getPkgQty();

            if ((CheckUtil.isBlankOrNull(pkgItemNo) && pkgQty != null)
                || (!CheckUtil.isBlankOrNull(pkgItemNo) && pkgQty == null)) {
                return false;
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateConsistencyPrdctData(java.lang.String, java.lang.String, java.util.List)
     */
    public boolean validateConsistencyPrdctData(String businessStartTime, String businessEndTime,
        List<? extends Ws2501ProductivityDataInfoDomain> productivityDataInfoList) {

        if (CheckUtil.isBlankOrNull(businessStartTime) || CheckUtil.isBlankOrNull(businessEndTime)) {
            return false;
        }

        for (Ws2501ProductivityDataInfoDomain productivityDataInfoItem : productivityDataInfoList){
            String screenId = productivityDataInfoItem.getScreenId();
            String errMsgId = productivityDataInfoItem.getMsgId();
            String releaseTargetFlg = productivityDataInfoItem.getLockFlg();
            String workStartTime = productivityDataInfoItem.getWorkTimeStrt();
            String workEndTime = productivityDataInfoItem.getWorkTimeEnd();

            if (CheckUtil.isBlankOrNull(screenId) || CheckUtil.isBlankOrNull(errMsgId) || CheckUtil.isBlankOrNull(releaseTargetFlg) || CheckUtil.isBlankOrNull(workStartTime) || CheckUtil.isBlankOrNull(workEndTime)){
                return false;
            }
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmPkgMaterialsOnInstrPltz(java.lang.String[], java.util.List, java.util.List)
     */
    public boolean validateDatabaseTmPkgMaterialsOnInstrPltz(String[] shipperCd, List<String> pkgItemNoList, List<String> pkgItemNoErrList)
        throws ApplicationException {

        return validateDatabaseTmPkgMaterials(shipperCd, pkgItemNoList, pkgItemNoErrList);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmPkgSetDtlOnInstrPltz(java.lang.String, java.lang.String, java.lang.String[], java.lang.String[], com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain)
     */
    public String validateDatabaseTmPkgSetDtlOnInstrPltz(String pltzInstrNo, String outerCd, String[] shipperCd, String[] trnsCd, TmPkgSetHdrDomain tmPkgSetHdr)
        throws ApplicationException {

        return validateDatabaseTmPkgSetDtl(pltzInstrNo, outerCd, shipperCd, trnsCd, tmPkgSetHdr);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmPkgSpecificationDtOnInstrPltz(java.lang.String[], java.util.List, java.lang.String[], com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecDomain)
     */
    public Map<String, List<String>> validateDatabaseTmPkgSpecificationDtOnInstrPltz(String[] shipperCd, List<? extends Ws2501ItemNoDomain> itemNoList, String[] trnsCd, Ws2501PkgSpecDomain singlePkgSpec)
        throws ApplicationException {

        return validateDatabaseTmPkgSpecificationDt(shipperCd, itemNoList, trnsCd, singlePkgSpec);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#transactOnInstPltz(WsBhtEisProductCriteriaDomain)
     */
    public WsBhtEisProductDomain transactOnInstPltz(WsBhtEisProductCriteriaDomain criteria)
        throws ApplicationException {

        WsBhtEisProductDomain wsBhtEisProduct = new WsBhtEisProductDomain();

        Timestamp[] errCreateTimestamp = new Timestamp[1];

        String pltzInstrNo = criteria.getPltzInstrNo();

        // Lock of data
        // データのロック
        ws2502LockByPltzInstrNo(pltzInstrNo);

        // Setting of an internal variable (header)
        // 内部変数（ヘッダ）の設定
        String errCd = searchWs2502HeaderData(criteria);
        if (errCd != null){
            wsBhtEisProduct.setResultCd(WS_RESULT_ERROR);
            Object[] params = {
                pltzInstrNo
            };
            Map<String, Object[]> errMap = new HashMap<String, Object[]>();
            errMap.put(errCd, params);
            wsBhtEisProduct.setErrMap(errMap);
            return wsBhtEisProduct;
        }

        // A company and W/H combination check
        // 会社・倉庫組合せチェック
        if (!chkWs2502CompWh(criteria, errCreateTimestamp)){
            wsBhtEisProduct.setResultCd(WS_RESULT_ERROR_ERR_REPORT_OUT);
            wsBhtEisProduct.setErrCreateTimestamp(errCreateTimestamp[0].toString());
            return wsBhtEisProduct;
        }

        // Setting of an internal variable (details)
        // 内部変数（明細）の設定
        searchWs2502DetailData(criteria);

        // Setting of an internal variable (MIX ITEM NO)
        // 内部変数（MIX品目番号）の設定
        searchWs2502MixItemInfo(criteria);

        // input check
        // 入力チェック
        if (!chkWs2502InputData(criteria, errCreateTimestamp)){
            wsBhtEisProduct.setResultCd(WS_RESULT_ERROR_ERR_REPORT_OUT);
            wsBhtEisProduct.setErrCreateTimestamp(errCreateTimestamp[0].toString());
            return wsBhtEisProduct;
        }

        // Exterior sign check
        // 外装記号チェック
        if (!chkWs2502OuterPkgCd(criteria)){
            wsBhtEisProduct.setResultCd(WS_RESULT_ERROR_SYSTEM_JOB);
            return wsBhtEisProduct;
        }
        
        // Acquisition of a print-copies information
        // 印刷部数情報の取得
        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2502InternalVariableHdrDomain();
        TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteria.setCompCd(internalVariableHdr.getShipperCd());
        TmNxsCompDomain tmNxsComp = this.tmNxsCompService.searchByKey(tmNxsCompCriteria);
        
        if (tmNxsComp == null) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            Object[] params = {internalVariableHdr.getShipperCd()};
            errorList.add(new MessageDomain("", NXS_E1_5007, params));
            throw new ValidationException(errorList);
        }
        criteria.getWs2502InternalVariableHdrDomain().setCmlPrintNum(tmNxsComp.getCmlPrintNum().intValue());

        // Acquisition of Main Mark
        // Main Markの取得
        String mainMark = createMainMark(internalVariableHdr.getShipperCd(), internalVariableHdr.getWhCd(), criteria.getScreenId());

        // Palletize-Instruction-Receive-Order alloc processing (a part for an ITEM NO)
        // 梱包指示品目番号受注情報引当処理（品目番号分）
        criteria.setRtUseFlg(FLAG_N);
        allocWs2502Qty(false, mainMark, criteria);

        // Palletize-Instruction-Receive-Order alloc processing (a part for a MIX ITEM NO)
        // 梱包指示品目番号受注情報引当処理（MIX品目番号分）
        allocWs2502Qty(true, mainMark, criteria);

        // Palletize-Item data (ITEM NO) is registered.
        // パレタイズ対象品データ（品目番号）を登録
        createWs2502PltzItem(mainMark, criteria);

        // Palletize-Item data (packing) is registered.
        // パレタイズ対象品データ（包装）を登録
        createWs2502PltzItemPkg(mainMark, criteria);

        // Palletize-Item-KANBAN data is registered.
        // パレタイズ対象品かんばん情報データを登録
        createKanban(mainMark, criteria);

        /* Add: 7/2/2017 DIAT yamamoto */
        // Palletize-Item-KANBAN data is registered(for Asia)
        createKanbanExtra(mainMark, criteria);

        // Palletize data is registered.
        // パレタイズデータを登録
        createWs2502Pltz(mainMark, criteria);

        // PACKED-QUANTITY update process (a part for an ITEM NO)
        // 梱包済数量更新処理（品目番号分）
        updatePltzItemNoPackedQtyByItemNo(criteria);

        // PACKED-QUANTITY update process (a part for a MIX ITEM NO)
        // 梱包済数量更新処理（MIX品目番号分）
        updatePltzItemNoPackedQtyByMixItemNo(criteria);

        // PACKING-STATUS update process
        // 梱包ステータス更新処理
        updatePltzStatus(criteria);

        // MULTI-ITEM-NO-IN-BOX-STATUS update process
        // 小箱内多品ステータス更新処理
        updateWs2502MixTagStatus(criteria);

        // A BHT productivity data information is registered.
        // BHT生産性データ情報を登録
        createWs2502BhtInfo(mainMark, criteria);

        // Acquisition of packed up data for responses
        // レスポンス用梱包済みデータの取得
        searchPackedList(criteria, wsBhtEisProduct);

        // Acquisition of the unpacked up data for responses
        // レスポンス用未梱包データの取得
        searchUnPackedList(criteria, wsBhtEisProduct);

        // Setting of a returned value
        // 返却値の設定
        wsBhtEisProduct.setResultCd(WS_RESULT_SUCCESS);
        wsBhtEisProduct.setMainMark(mainMark);
        wsBhtEisProduct.setWs2502InternalVariableHdrDomain(criteria.getWs2502InternalVariableHdrDomain());

        return wsBhtEisProduct;
    }

    /**
     * Lock each table by a Palletize Instr. No.
     * <br />各テーブルを梱包指示Noでロックします。
     *
     * @param pltzInstrNo Palletize Instr. No.<br />梱包指示No
     * @throws ApplicationException When it cannot lock<br />ロックできない場合
     */
    protected void ws2502LockByPltzInstrNo(String pltzInstrNo) throws ApplicationException {

        // Lock of a Packaging Instruction (=Pull)
        // 梱包指示のロック
        TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
        ttPltzInstrCriteria.setPltzInstrNo(pltzInstrNo);
        assertNotEmpty(ttPltzInstrService.lockByKeyNoWait(ttPltzInstrCriteria), NXS_E1_5069);

        // Lock of a Palletize Instruction Item No
        // 梱包指示品目番号のロック
        TtPltzInstrItemNoCriteriaDomain ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
        ttPltzInstrItemNoCriteria.setPltzInstrNo(pltzInstrNo);
        assertNotEmpty(wsBhtEisProductDao.lockByKeyNoWaitTtPltzInstrItemNo(ttPltzInstrItemNoCriteria), NXS_E1_5069);

        // Lock of a Palletize Instruction Receive Order
        // 梱包指示品目番号受注情報のロック
        TtPltzInstrOdrCriteriaDomain ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
        ttPltzInstrOdrCriteria.setPltzInstrNo(pltzInstrNo);
        assertNotEmpty(wsBhtEisProductDao.lockByKeyNoWaitTtPltzInstrOdr(ttPltzInstrOdrCriteria), NXS_E1_5069);

        // The lock of Mix Tag
        // MIXED現品票のロック
        // #2159 ロックされるデータが存在しない場合があるので assertNoEmpty でチェックしない
        Ws2501TtMixTagCriteriaDomain ttMixtagCriteriaDomain = new Ws2501TtMixTagCriteriaDomain();
        ttMixtagCriteriaDomain.setPltzInstrNo(pltzInstrNo);
        wsBhtEisProductDao.lockByConditionNoWaitTtMixTag(ttMixtagCriteriaDomain);
    }

    /**
     * Acquire a Packaging Instruction (=Pull) information and set up an internal variable (header).
     * <br />梱包指示情報を取得して、内部変数（ヘッダ）を設定します。
     *
     * @param criteria Eis Product domain<br />Eis Product ドメイン
     * @return Error Code
     * @throws ApplicationException When a Packaging Instruction (=Pull) information is unacquirable<br />梱包指示情報が取得できない場合
     */
    protected String searchWs2502HeaderData(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        String pltzInstrNo = criteria.getPltzInstrNo();

        // Acquisition of Packaging Instruction (=Pull) information (a CIGMA Ship To Cross Reference Master, CIGMA Customer Cross Reference Master)
        //      A Packaging Instruction (=Pull), a CIGMA Warehouse Cross Reference Master, NEXUS Warehouse Master
        // 梱包指示情報の取得（NEXUS送荷先クロスリファレンス原単位、NEXUS荷受人クロスリファレンス原単位、
        //                     梱包指示、倉庫クロスリファレンス原単位、倉庫原単位）
        Ws2501PltzInstrInfoCriteriaDomain pltzInstrInfoCriteria = new Ws2501PltzInstrInfoCriteriaDomain();
        pltzInstrInfoCriteria.setPltzInstrNo(pltzInstrNo);

        Ws2501PltzInstrInfoDomain pltzInstrInfo = wsBhtEisProductDao.searchPltzInstrInfo(pltzInstrInfoCriteria);

        // Existence check
        // 存在チェック
        if (pltzInstrInfo == null){
            return NXS_E1_5038;
        }

        // A check among a CIGMA night batch
        // CIGMA夜間バッチ中チェック
        if (!searchCigmaAvailable(true, pltzInstrInfo.getShipperCd())){
            return NXS_E1_5062;
        }

        // PALLETIZE-INSTRUCTION-STATUS check (an error is made when Statuses are 10, 40, and 50)
        // 梱包指示ステータスチェック(ステータスが10,40,50の場合エラー)
        String status = pltzInstrInfo.getPltzInstrStatus();
        if (PLTZ_INSTR_STATUS_INSTRUCTION_CREATED.compareTo(status) == 0
            || PLTZ_INSTR_STATUS_ALL_CML_CREATE.compareTo(status) == 0
            || PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT.compareTo(status) == 0) {
            return NXS_E1_5015;
        }

        // Setting of an internal variable (header)
        // 内部変数（ヘッダ）の設定
        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        CommonUtil.copyPropertiesDomainToDomain(internalVariableHdr, pltzInstrInfo);
        internalVariableHdr.setPltzInstrNo(criteria.getPltzInstrNo());
        internalVariableHdr.setPalletNo(criteria.getPalletNo());
        internalVariableHdr.setOuterPkgCd(criteria.getOuterCd());
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        return null;
    }

    /**
     * Check a company and W/H combination.
     * <br />会社・倉庫組み合わせをチェックします。
     *
     * @param criteria Eis Product domain<br />Eis Product ドメイン
     * @param errCreateTimestamp Error registration time stamp<br />エラー登録タイムスタンプ
     * @return Checked result<br />チェック結果
     * @throws ApplicationException When a CML Error Report Header cannot be referred to<br />CMLエラーレポートヘッダを参照できない場合
     */
    protected boolean chkWs2502CompWh(WsBhtEisProductCriteriaDomain criteria, Timestamp[] errCreateTimestamp) throws ApplicationException {

        Ws2501InternalVariableHdrDomain internalVariableHdr =
            criteria.getWs2502InternalVariableHdrDomain();

        // error List
        List<String> errList = new ArrayList<String>();

        // check
        if (CheckUtil.isBlankOrNull(internalVariableHdr.getShipToCd())) {
            errList.add("A");
        }
        if (CheckUtil.isBlankOrNull(internalVariableHdr.getConsigneeCompCd())) {
            errList.add("B");
        }
        if (CheckUtil.isBlankOrNull(internalVariableHdr.getPlntCd())) {
            errList.add("C");
        }
        if (CheckUtil.isBlankOrNull(internalVariableHdr.getWhCompCd())) {
            errList.add("D");
        }

        // When error occurs, a CML Error Report Header is registered.
        // エラーが発生した場合、CMLエラーレポートヘッダを登録
        if (!errList.isEmpty()){
            TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

            CommonUtil.copyPropertiesDomainToDomain(ttCmlErrorHeader, internalVariableHdr);

            // DSC-ID
            String dscId = criteria.getLoginUserDscId();
            ttCmlErrorHeader.setDscId(dscId);

            // ERROR CREATE TIMESTAMP
            // エラーレポート作成日時
            errCreateTimestamp[0] = new Timestamp(new Date().getTime());
            ttCmlErrorHeader.setErrCreateTimestamp(errCreateTimestamp[0]);

            // EXPORT PACKING ISSUER NAME
            // 輸出梱包者名
            TmUserCriteriaDomain tmUserCriteria = new TmUserCriteriaDomain();
            tmUserCriteria.setDscId(dscId);
            TmUserDomain tmUser = tmUserService.searchByKey(tmUserCriteria);

            ttCmlErrorHeader.setExpPackingIssuerNm(tmUser.getUsrNmEn());

            // A - a CHECK RESULT D
            // A～Dチェック結果
            for (String err : errList){
                if ("A".equals(err)) {
                    ttCmlErrorHeader.setChkResultA(NG);
                }
                if ("B".equals(err)) {
                    ttCmlErrorHeader.setChkResultB(NG);
                }
                if ("C".equals(err)) {
                    ttCmlErrorHeader.setChkResultC(NG);
                }
                if ("D".equals(err)) {
                    ttCmlErrorHeader.setChkResultD(NG);
                }
            }

            // Common items
            // 共通項目
            setCommonPropertyForRegist(ttCmlErrorHeader, dscId, criteria.getScreenId());

            // CML-Error-Report-Header registration
            // CMLエラーレポートヘッダ登録
            ttCmlErrorHeaderService.create(ttCmlErrorHeader);

            return false;
        }
        return true;
    }

    /**
     * Acquire a Packaging Instruction (=Pull) information and set up an internal variable (detailed).
     * <br />梱包指示情報を取得して、内部変数（明細）を設定します。
     *
     * @param criteria BIS Product domain<br />BIS Product ドメイン
     * @throws ApplicationException When an error turns into an error by generating and calculation of a QUANTITY by the Web service which cannot refer to a database
     *                              <br />データベースが参照できない、Webサービスでエラーが発生、数量の算出でエラーになった場合
     */
    
    protected void searchWs2502DetailData(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        // Initial setting \ of an internal variable (details)
        // 内部変数（明細）の初期設定\
        initWs2502InternalVariableDtl(criteria);

        // Acquisition of an ITEM-NO information (NEXUS side information)
        // 品目番号情報の取得（NEXUS側情報)
        searchWs2502NexusInfo(criteria);

        // Acquisition of an ITEM-NO information (CIGMA side information)
        // 品目番号情報の取得（CIGMA側情報)
        searchWs2502CigmaInfo(criteria);

        // Acquisition of a MIXE thing vote information
        // MIXE現品票情報の取得
        searchWs2502MixInfo(criteria);
    }

    /**
     * Initial setting of an internal variable (details)
     * <br />内部変数（明細）の初期設定
     *
     * @param criteria BIS Product domain<br />BIS Product ドメイン
     */
    protected void initWs2502InternalVariableDtl(WsBhtEisProductCriteriaDomain criteria) {

        List<Ws2501InternalVariableDtlDomain> internalVariableDtlList = new ArrayList<Ws2501InternalVariableDtlDomain>();
        
        BigDecimal maxSeq = initInternalVariableDtl(criteria.getWs2502ItemNoList() , internalVariableDtlList);

        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtlList);
        criteria.setMaxSeq(maxSeq);
    }

    /**
     * Initial setting of an internal variable (details)
     * <br />内部変数（明細）の初期設定
     *
     * @param itemNoList ITEM-NO list<br />品目番号リスト
     * @param internalVariableDtlList The list for storing the generated internal variable (details)<br />生成された内部変数（明細）を格納するためのリスト
     * @return The BRANCH the order number for was assigned at the end<br />最後に採番した枝番
     */
    @SuppressWarnings("unchecked")
    protected BigDecimal initInternalVariableDtl(List<? extends Ws2501ItemNoDomain> itemNoList, List<Ws2501InternalVariableDtlDomain> internalVariableDtlList) {

        if (itemNoList.isEmpty()) {
            return ZERO;
        }

        // ITEM-NO +":"+ packing CD   Map of Ws2501InternalVariableDtlDomain (the order of a BRANCH)
        // 品目番号 + ":" + 包装コード と Ws2501InternalVariableDtlDomain のマップ (枝番順)
        Map<String, Ws2501InternalVariableDtlDomain> internalVariableDtls = new LinkedHashMap<String, Ws2501InternalVariableDtlDomain>();

        // BRANCH
        // 枝番
        int seq = 0;

        StringBuilder keyBuilder = new StringBuilder(32);
        for (Ws2501ItemNoDomain itemNo : (List<Ws2501ItemNoDomain>)itemNoList) {

            keyBuilder.setLength(0);
            String key = keyBuilder.append(itemNo.getItemNo())
                                   .append(":")
                                   .append(itemNo.getPkgCd())
                                   .toString();

            Ws2501InternalVariableDtlDomain internalVariableDtl = internalVariableDtls.get(key);
            if (internalVariableDtl == null) {

                // ============================================================
                //  Details Initialize
                //  明細 初期化
                // ============================================================

                internalVariableDtl = new Ws2501InternalVariableDtlDomain();
                internalVariableDtls.put(key, internalVariableDtl);

                // Only "N" is a BRANCH setting.
                // "N" のみ枝番設定
                if (FLAG_N.equals(itemNo.getMixTagFlg())) {
                    // BRANCH
                    // 枝番
                    internalVariableDtl.setSeq(BigDecimal.valueOf(++seq));
                }

                // ITEM NO
                // 品目番号
                internalVariableDtl.setItemNo(itemNo.getItemNo());
                // Packing CD
                // 包装コード
                internalVariableDtl.setPkgCd(itemNo.getPkgCd());
                // CUSTOMER ITEM NO (* WS 2502)
                // 得意先品目番号 (※ WS2502 のみ)
                internalVariableDtl.setCustomerItemNo(itemNo.getCustomerItemNo());
                // MIX TAG FLAG
                // MIXタグフラグ
                internalVariableDtl.setMixTagFlg(itemNo.getMixTagFlg());
                // QUANTITY
                // 数量
                internalVariableDtl.setQty(ZERO);
                // TAG QUANTITY
                // タグ数
                internalVariableDtl.setTagQty(ZERO);
                // Acquisition flag
                // 取得フラグ
                internalVariableDtl.setDataGetFlg(FLAG_N);

                internalVariableDtl.setInternalVariableDtlKanbanDomainList(new ArrayList<Ws2501InternalVariableDtlKanbanDomain>());
            }

            // ============================================================
            //  Addition of QUANTITY, and a TAG QUANTITY
            //  数量、タグ数の加算
            // ============================================================

            internalVariableDtl.setQty(internalVariableDtl.getQty().add(itemNo.getKanbanQty()));
            internalVariableDtl.setTagQty(internalVariableDtl.getTagQty().add(ONE));

            // ============================================================
            //  KANBAN list setting
            //  かんばんリスト設定
            // ============================================================

            Ws2501InternalVariableDtlKanbanAsiaDomain internalVariableDtlKanban = new Ws2501InternalVariableDtlKanbanAsiaDomain();
            // CD according to industry
            // 産業別コード
            internalVariableDtlKanban.setExpIndusTypCd(itemNo.getIndusTypCd());
            // KANBAN classification
            // かんばん種別
            internalVariableDtlKanban.setExpKanbanTyp(itemNo.getKanbanTyp());
            // Tag SEQ number
            // タグSEQ番号
            internalVariableDtlKanban.setTagSeqNo(itemNo.getTagSeqNo());
            // KANBAN QUANTITY
            // かんばん数量
            internalVariableDtlKanban.setQty(itemNo.getKanbanQty());
            // Customer tag SEQ number (* WS 2502)
            // 得意先タグSEQ番号 (※ WS2502 のみ)
            internalVariableDtlKanban.setCustomerTagSeqNo(itemNo.getCustomerTagSeqNo());
            /* Add: 7/2/2017 DIAT yamamoto from*/
            // PRODUCT DATE
            internalVariableDtlKanban.setProductDate(itemNo.getProductDate());
            // ORDER NO
            internalVariableDtlKanban.setOrderNo(itemNo.getOrderNo());
            /* Add: 7/2/2017 DIAT yamamoto to*/

            @SuppressWarnings("unchecked")
            List<Ws2501InternalVariableDtlKanbanDomain> internalVariableDtlKanbanList =
                (List<Ws2501InternalVariableDtlKanbanDomain>) internalVariableDtl.getInternalVariableDtlKanbanDomainList();
            internalVariableDtlKanbanList.add(internalVariableDtlKanban);
        }

        // BIS Product domain It sets up.
        // BIS Product ドメイン に設定
        internalVariableDtlList.addAll(internalVariableDtls.values());

        return BigDecimal.valueOf(seq);
    }

    /**
     * Acquire an ITEM-NO information (NEXUS side information).
     * <br />品目番号情報を取得（NEXUS側情報)します。
     *
     *@param criteria BIS Product domain<br />BIS Product ドメイン
     *@throws ApplicationException When cannot be referred to a Packaging Instruction (=Pull) table etc.<br />梱包指示テーブル等を参照できない場合
     */
    protected void searchWs2502NexusInfo(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        Ws2501InternalVariableHdrDomain internalVariableHdr =
            criteria.getWs2502InternalVariableHdrDomain();

        List<? extends Ws2501InternalVariableDtlDomain> internalVariableDtlList =
            criteria.getWs2502InternalVariableDtlDomainList();

        // Palletize Instr. No.
        // 梱包指示No
        String pltzInstrNo = internalVariableHdr.getPltzInstrNo();

        // Time zone converted post-date acquisition
        // タイムゾーン変換後日付取得
        String timezoneId = commonService.searchTimezone(internalVariableHdr.getShipperCd());
        Date aplyStrtDt = DateUtil.convertTime(new Date(), timezoneId);

        // Acquisition of an ITEM-NO information (NEXUS side information)
        // 品目番号情報の取得（NEXUS側情報)
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : internalVariableDtlList){

            // MixTag flag
            // MixTagフラグ
            String mixTagFlg = internalVariableDtl.getMixTagFlg();

            // When this is not MixTag
            // MixTagでない場合
            if (FLAG_N.equals(mixTagFlg)){
                Ws2501ItemNoNxsCriteriaDomain itemNoNxsCriteria = new Ws2501ItemNoNxsCriteriaDomain();

                itemNoNxsCriteria.setPltzInstrNo(pltzInstrNo);
                itemNoNxsCriteria.setItemNo(internalVariableDtl.getItemNo());
                itemNoNxsCriteria.setPkgCd(internalVariableDtl.getPkgCd());
                itemNoNxsCriteria.setAplyStrtDt(aplyStrtDt);

                Ws2501ItemNoNxsDomain itemNoNxs =
                    wsBhtEisProductDao.searchItemNoNxs(itemNoNxsCriteria);
                
                internalVariableDtl.setInstrQty(itemNoNxs.getInstrQty());
                internalVariableDtl.setPltzQty(itemNoNxs.getPackedQty().add(itemNoNxs.getSumQty()));
                internalVariableDtl.setContainerSortingKey(itemNoNxs.getContainerSortingKey());
                internalVariableDtl.setLoadingCd(itemNoNxs.getLoadingCd());
                internalVariableDtl.setInvoiceKey(itemNoNxs.getInvoiceKey());
                internalVariableDtl.setStgInstrItemFlg(itemNoNxs.getStgInstrItemFlg());
                internalVariableDtl.setCustomTimingTyp(itemNoNxs.getCustomTimingTyp());
                internalVariableDtl.setContainerLooseTyp(itemNoNxs.getContainerLooseTyp());
                internalVariableDtl.setItemDescription(itemNoNxs.getItemDescription());
                internalVariableDtl.setExpLimitTyp(itemNoNxs.getExpLimitTyp());
                internalVariableDtl.setDngrItemFlg(itemNoNxs.getDngrItemFlg());
                internalVariableDtl.setOriginCntryCd(itemNoNxs.getOriginCntryCd());
                internalVariableDtl.setTmpStockQty(itemNoNxs.getQty());
                internalVariableDtl.setWeightUnit(itemNoNxs.getWeightUnit());
                internalVariableDtl.setItemWeight(itemNoNxs.getNetWeightA());
                internalVariableDtl.setPkgFormTyp(itemNoNxs.getPkgFormTyp());
                internalVariableDtl.setLotSize(itemNoNxs.getLotSize());
                internalVariableDtl.setDataGetFlg(FLAG_Y);
            }
        }
    }
    /**
     * Acquire an ITEM-NO information (CIGMA side information).
     * <br />品目番号情報を取得（CIGMA側情報)します。
     *
     * @param criteria BIS Product domain<br />BIS Product ドメイン
     * @throws ApplicationException When this is subtracted by the calculation of inventory figures which an error can generate and a Measure Unit Master cannot refer to by Web service
     *                              <br />Webサービスでエラーが発生、計量単位原単位が参照できない、在庫数の計算でマイナスになった場合
     */
    protected void searchWs2502CigmaInfo(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        List<Ws2501InternalVariableDtlDomain> internalVariableDtlList = new ArrayList<Ws2501InternalVariableDtlDomain>();

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2502InternalVariableDtlDomainList()) {
            if (FLAG_N.equals(internalVariableDtl.getMixTagFlg())){
                internalVariableDtlList.add(internalVariableDtl);
            }
        }

        // *In a internal variable (details), a MIX TAG FLAG does not carry out, when the data of "N" does not exist.
        // ※内部変数（明細）の中にMIXタグフラグが"N"のデータが存在しない場合は実施しない
        if (internalVariableDtlList.isEmpty()){
            return;
        }

        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2502InternalVariableHdrDomain();

        List<Ws2004ResultItemDomain> resultItems = searchItemNoFromCigma(internalVariableHdr.getShipperCd(),
                                                                         singletonList(internalVariableHdr.getPlntCd()),
                                                                         internalVariableHdr.getLgcyWhCd(),
                                                                         internalVariableDtlList,
                                                                         internalVariableHdr.getCustomerCd());
        populateItemNo(resultItems, internalVariableDtlList);

    }
    /**
     * Acquire a MIXE thing vote information.
     * <br />MIXE現品票情報を取得します。
     *
     * @param criteria BIS Product domain<br />BIS Product ドメイン
     * @throws ApplicationException When a Mix Tag cannot be referred to<br />MIXED現品票が参照できない場合
     */
    protected void searchWs2502MixInfo(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2502InternalVariableDtlDomainList()) {
            String mixTagFlg = internalVariableDtl.getMixTagFlg();

            if (FLAG_Y.equals(mixTagFlg)){
                String mixTagNo = internalVariableDtl.getItemNo();

                TtMixtagCriteriaDomain ttMixtagCriteria = new TtMixtagCriteriaDomain();
                ttMixtagCriteria.setMixTagNo(mixTagNo);

                TtMixtagDomain ttMixtag = ttMixtagService.searchByKey(ttMixtagCriteria);

                internalVariableDtl.setContainerSortingKey(ttMixtag.getContainerSortingKey());
                internalVariableDtl.setLoadingCd(ttMixtag.getLoadingCd());
                internalVariableDtl.setInvoiceKey(ttMixtag.getInvoiceKey());
                internalVariableDtl.setStgInstrItemFlg(FLAG_N);
                internalVariableDtl.setCustomTimingTyp(ttMixtag.getCustomTimingTyp());
                internalVariableDtl.setContainerLooseTyp(ttMixtag.getContainerLooseTyp());
                internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_MULTI);
                internalVariableDtl.setCurrCd(ttMixtag.getCurrCd());
                internalVariableDtl.setMixTagStatus(ttMixtag.getMixTagStatus());
                internalVariableDtl.setDataGetFlg(FLAG_Y);
            }
        }
    }

    /**
     * Set up an internal variable (MIX ITEM NO).
     * <br />内部変数（MIX品目番号）を設定します。
     *
     * @param criteria BIS Product domain<br />BIS Product ドメイン
     * @throws ApplicationException When a Mix Tag and a MIXED ITEM NO cannot be referred to<br />MIXED現品票、MIXED品目番号が参照できない場合
     */
    protected void searchWs2502MixItemInfo(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        BigDecimal seq = criteria.getMaxSeq().add(BigDecimal.ONE);

        List <Ws2501InternalVariableDtlDomain> InternalVariableMixItemNoDomainList = new ArrayList<Ws2501InternalVariableDtlDomain>();

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2502InternalVariableDtlDomainList()){
            String mixTagFlg = internalVariableDtl.getMixTagFlg();

            if (FLAG_Y.equals(mixTagFlg)){
                Ws2501MixedTagItemCriteriaDomain mixedTagItemCriteria = new Ws2501MixedTagItemCriteriaDomain();
                mixedTagItemCriteria.setMixTagNo(internalVariableDtl.getItemNo());

                List<? extends Ws2501MixedTagItemDomain> mixedTagItemList = wsBhtEisProductDao.searchMixedTagItem(mixedTagItemCriteria);

                for (Ws2501MixedTagItemDomain mixedTagItem : mixedTagItemList){

                    Ws2501InternalVariableDtlDomain mixItem = new Ws2501InternalVariableDtlDomain();
                    CommonUtil.copyPropertiesDomainToDomain(mixItem, mixedTagItem);
                    mixItem.setSeq(seq);
                    InternalVariableMixItemNoDomainList.add(mixItem);
                    seq = seq.add(BigDecimal.ONE);
                }
            }
        }
        criteria.setWs2502InternalVariableMixItemNoDomainList(InternalVariableMixItemNoDomainList);
    }

    /**
     * Perform an input check.
     * <br />入力チェックを行います。
     *
     * @param criteria Eis Product domain<br />Eis Productドメイン
     * @param errCreateTimestamp Error registration time stamp<br />エラー登録タイムスタンプ
     * @return Checked result<br />チェック結果
     * @throws ApplicationException When a CML Error Report Header and a CML Error Report Detail cannot be accessed
     *                              <br />CMLエラーレポートヘッダ、CMLエラーレポート明細にアクセスできない場合
     */
    protected boolean chkWs2502InputData(WsBhtEisProductCriteriaDomain criteria, Timestamp[] errCreateTimestamp) throws ApplicationException {

        boolean errFlg = false;
        boolean doorFlg = false;
        boolean backFlg = false;

        // DSC-ID
        String dscId = criteria.getLoginUserDscId();

        // ERROR CREATE TIMESTAMP
        // エラーレポート作成日時
        errCreateTimestamp[0] = new Timestamp(new Date().getTime());

        // CML-Error-Report-Header domain
        // CMLエラーレポートヘッダドメイン
        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();
        ttCmlErrorHeader.setDscId(dscId);
        ttCmlErrorHeader.setErrCreateTimestamp(errCreateTimestamp[0]);

        // The list of CML-Error-Report-Detail domains
        // CMLエラーレポート明細ドメインのリスト
        List<TtCmlErrorDtlDomain> ttCmlErrorDtlList = new ArrayList<TtCmlErrorDtlDomain>();

        // For a backup
        // 退避用
        String tmpPkgFormTyp = null;
        String tmpItemNo = null;
        String tmpInvoiceKey = null;
        String tmpContainerSortingKey = null;
        String tmpCurrCd = null;
        String tmpStgInstrItemFlg = null;
        String tmpContainerLooseTyp = null;
        String tmpCustomTimingTyp = null;

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2502InternalVariableDtlDomainList()) {
            // Initial value setting of ITEM NO CHECK FLAG
            // 品目番号チェックフラグの初期値設定
            StringBuffer itemNoChkFlg = new StringBuffer(MNF_FLAG_OK + MNF_FLAG_OK + MNF_FLAG_OK + MNF_FLAG_OK); // UT298 MOD

            // Setting of an acquisition flag
            // 取得フラグの設定
            String dataGetFlg = internalVariableDtl.getDataGetFlg();

            if (!FLAG_N.equals(dataGetFlg)) {
                String mixTagFlg = internalVariableDtl.getMixTagFlg();
                String pkgFormTyp = internalVariableDtl.getPkgFormTyp();
                String itemNo = internalVariableDtl.getItemNo();
                String invoiceKey = internalVariableDtl.getInvoiceKey();
                String containerSortingKey = internalVariableDtl.getContainerSortingKey();
                String currCd = internalVariableDtl.getCurrCd();
                String loadingCd = internalVariableDtl.getLoadingCd();
                String stgInstrItemFlg = internalVariableDtl.getStgInstrItemFlg();
                String containerLooseTyp = internalVariableDtl.getContainerLooseTyp();
                String customTimingTyp = internalVariableDtl.getCustomTimingTyp();

                tmpPkgFormTyp = defaultString(tmpPkgFormTyp, pkgFormTyp);
                tmpItemNo = defaultString(tmpItemNo, itemNo);
                tmpInvoiceKey = defaultString(tmpInvoiceKey, invoiceKey);
                tmpContainerSortingKey = defaultString(tmpContainerSortingKey, containerSortingKey);
                tmpCurrCd = defaultString(tmpCurrCd, currCd);
                tmpStgInstrItemFlg = defaultString(tmpStgInstrItemFlg, stgInstrItemFlg);
                tmpContainerLooseTyp = defaultString(tmpContainerLooseTyp, containerLooseTyp);
                tmpCustomTimingTyp = defaultString(tmpCustomTimingTyp, customTimingTyp);

                // Correlation check
                // PACKAGE-FORM-TYPE check
                // 相関チェック
                // 梱包形態チェック
                if (!tmpPkgFormTyp.equals(pkgFormTyp)) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultE(NG);
                }

                // Single article ITEM-NO check
                // 単品品目番号チェック
                if (PKG_FORM_TYP_SINGLE.equals(pkgFormTyp)) {
                    if (!tmpItemNo.equals(itemNo)) {
                        errFlg = true;
                        ttCmlErrorHeader.setChkResultE(NG);
                    }
                }

                // Inv. Key check
                // インボイスキーチェック
                if (!StringUtils.equals(tmpInvoiceKey, invoiceKey)) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultF(NG);
                }

                // CONTAINER-SORTING-KEY check
                // コンテナ層別キーチェック
                if (!StringUtils.equals(tmpContainerSortingKey, containerSortingKey)) { 
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultG(NG);
                }

                // Currency check
                // 通貨チェック
                if (!StringUtils.equals(tmpCurrCd, currCd)) { 
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultH(NG);
                }

                // loading position code check
                // 荷積み位置コードチェック
                if (LOADING_CD_DOOR.equals(loadingCd)) {
                    doorFlg = true;
                }
                if (LOADING_CD_BACK.equals(loadingCd)) {
                    backFlg = true;
                }

                if (doorFlg && backFlg) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultI(NG);
                }

                // staging-instruction flag check
                // 荷揃え指示フラグチェック
                if (!StringUtils.equals(tmpStgInstrItemFlg, stgInstrItemFlg)) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultJ(NG);
                }

                // C/L check
                // コンテナルーズチェック
                if (!StringUtils.equals(tmpContainerLooseTyp, containerLooseTyp)) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultK(NG);
                }

                // CUSTOM-TIMING-TYPE check
                // 通関タイミング区分チェック
                if (!StringUtils.equals(tmpCustomTimingTyp, customTimingTyp)) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultL(NG);
                }

                // Each item backup
                // 各項目退避
                tmpPkgFormTyp = pkgFormTyp;
                tmpItemNo = itemNo;
                tmpInvoiceKey = invoiceKey;
                tmpContainerSortingKey = containerSortingKey;
                tmpCurrCd = currCd;
                tmpStgInstrItemFlg = stgInstrItemFlg;
                tmpContainerLooseTyp = containerLooseTyp;
                tmpCustomTimingTyp = customTimingTyp;

                // ITEM-NO check
                // 品目番号チェック
                if (!chkWs2502ItemNo(mixTagFlg, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg)) {
                    errFlg = true;
                }

                // Multiple Item No. in 1Box PKG check
                // 小箱内多品チェック
                if (!chkWs2502MixTag(mixTagFlg, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg)) {
                    errFlg = true;
                }
            }
            // A setting of CML-Error-Report-Detail list
            // CMLエラーレポート明細リストの設定
            addWs2502CmlDtlList(internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, ttCmlErrorDtlList, criteria.getScreenId());
        }
        // When error occurs
        // エラーが発生した場合
        if (errFlg) {
            // CML-Error-Report-Header registration
            // CMLエラーレポートヘッダ登録
            createWs2502CmlHdr(criteria.getWs2502InternalVariableHdrDomain(), ttCmlErrorHeader, criteria.getScreenId());

            // CML-Error-Report-Detail registration
            // CMLエラーレポート明細登録
            for (TtCmlErrorDtlDomain ttCmlErrorDtl : ttCmlErrorDtlList) {
                ttCmlErrorDtlService.create(ttCmlErrorDtl);
            }
            return false;
        }
        return true;

    }
    /**
     * Check an ITEM NO.
     * <br />品目番号をチェックします。
     *
     * @param mixTagFlg Mix Tag Flg<br />Mix Tag Flg
     * @param internalVariableDtl Internal variable (details) domain<br />内部変数（明細）ドメイン
     * @param ttCmlErrorHeader CML-Error-Report-Header domainM<br />CMLエラーレポートヘッダドメイン
     * @param itemNoChkFlg The item for ITEM-NO-CHECK-FLAG registration of a CML Error Report Detail<br />CMLエラーレポート明細の品目番号チェックフラグ登録用項目
     * @return Checked result<br />チェック結果
     */
    protected boolean chkWs2502ItemNo(String mixTagFlg, Ws2501InternalVariableDtlDomain internalVariableDtl, TtCmlErrorHeaderDomain ttCmlErrorHeader, StringBuffer itemNoChkFlg){

        boolean errFlg = false;

        if (FLAG_N.equals(mixTagFlg)){
            String pkgFormTyp = internalVariableDtl.getPkgFormTyp();
            BigDecimal qty = internalVariableDtl.getQty();
            BigDecimal pltzQty = internalVariableDtl.getPltzQty();
            BigDecimal instrQty = internalVariableDtl.getInstrQty();
            BigDecimal tagQty = internalVariableDtl.getTagQty();
            BigDecimal lotSize = internalVariableDtl.getLotSize();
            String currCd = internalVariableDtl.getCurrCd();
            String itemDescription = internalVariableDtl.getItemDescription();
            String dngrItemFlg = internalVariableDtl.getDngrItemFlg();

            // Directions over check
            // 指示越えチェック
            if (qty.add(pltzQty).subtract(instrQty).compareTo(BigDecimal.ZERO) > 0){
                ttCmlErrorHeader.setChkResultN(NG);
                errFlg = true;
            }

            // SHIPPING-LOT over check (multi-article ITEM NO)
            // 出荷ロット超えチェック（多品品目番号）
            if (PKG_FORM_TYP_MULTI.equals(pkgFormTyp)){
                if (qty.divide(tagQty, 1, BigDecimal.ROUND_UP).subtract(lotSize).compareTo(BigDecimal.ZERO) > 0) { // UT374 MOD
                    ttCmlErrorHeader.setChkResultO(NG);
                    errFlg = true;
                }
            }

            // SHIPPING-LOT over check (single article ITEM NO)
            // 出荷ロット超えチェック（単品品目番号）
            if (PKG_FORM_TYP_SINGLE.equals(pkgFormTyp)){
                if (qty.subtract(lotSize).compareTo(BigDecimal.ZERO) > 0){
                    ttCmlErrorHeader.setChkResultO(NG);
                    errFlg = true;
                }
            }

            // CIGMA information acquisition check
            // CIGMA情報取得チェック
            if (CheckUtil.isBlankOrNull(currCd)){
                ttCmlErrorHeader.setChkResultP(NG);
                itemNoChkFlg.replace(0, 1, MNF_FLAG_NG); // UT298 MOD
                errFlg = true;
            }

            // Special-Information number information acquisition check
            // 輸出出荷品目番号情報取得チェック
            if (CheckUtil.isBlankOrNull(itemDescription)){
                ttCmlErrorHeader.setChkResultP(NG);
                itemNoChkFlg.replace(1, 2, MNF_FLAG_NG); // UT298 MOD
                errFlg = true;
            }

            // export-formalities ITEM-NO information acquisition check
            // 輸出手続き品目番号情報取得チェック
            if (CheckUtil.isBlankOrNull(dngrItemFlg)){
                ttCmlErrorHeader.setChkResultP(NG);
                itemNoChkFlg.replace(2, 3, MNF_FLAG_NG); // UT298 MOD
                errFlg = true;
            }
        }

        return !errFlg;
    }
    /**
     * Check a Multiple Item No. in 1Box PKG check.
     * <br />小箱内多品チェックをチェックします。
     *
     * @param mixTagFlg Mix Tag Flg<br />Mix Tag Flg
     * @param internalVariableDtl Internal variable (details) domain<br />内部変数（明細）ドメイン
     * @param ttCmlErrorHeader CML-Error-Report-Header domain<br />CMLエラーレポートヘッダドメイン
     * @param itemNoChkFlg The item for ITEM-NO-CHECK-FLAG registration of a CML Error Report Detail<br />CMLエラーレポート明細の品目番号チェックフラグ登録用項目
     * @return Checked result<br />チェック結果
     */
    protected boolean chkWs2502MixTag(String mixTagFlg, Ws2501InternalVariableDtlDomain internalVariableDtl, TtCmlErrorHeaderDomain ttCmlErrorHeader, StringBuffer itemNoChkFlg){

        boolean errFlg = false;

        if (FLAG_Y.equals(mixTagFlg)){
            String mixTagStatus = internalVariableDtl.getMixTagStatus();
            String dataGetFlg = internalVariableDtl.getDataGetFlg();

            // Multiple Item No. in 1Box PKG information acquisition check
            // 小箱内多品情報取得チェック
            if (CheckUtil.isBlankOrNull(mixTagStatus)){
                ttCmlErrorHeader.setChkResultP(NG);
                itemNoChkFlg.replace(3, 4, FLAG_Y);
                errFlg = true;
            }

            // Multiple Item No. in 1Box PKG status check
            // 小箱内多品状態チェック
            if(FLAG_N.compareTo(dataGetFlg) != 0){
                if(MIX_TAG_STATUS_MIXTAG.compareTo(mixTagStatus) != 0){
                    ttCmlErrorHeader.setChkResultQ(NG);
                    errFlg = true;
                }
            }

        }

        return !errFlg;
    }
    /**
     * Register a CML Error Report Header.
     * <br />CMLエラーレポートヘッダを登録します。
     *
     * @param internalVariableHdr Internal variable (header) domain<br />内部変数（ヘッダ）ドメイン
     * @param ttCmlErrorHeader CML-Error-Report-Header domain<br />CMLエラーレポートヘッダドメイン
     * @param screenId SCREEN ID<br />画面ID
     * @throws ApplicationException When a CML Error Report Header cannot be accessed<br />CMLエラーレポートヘッダにアクセスできない場合
     */
    protected void createWs2502CmlHdr(Ws2501InternalVariableHdrDomain internalVariableHdr, TtCmlErrorHeaderDomain ttCmlErrorHeader, String screenId)
        throws ApplicationException{
        CommonUtil.copyPropertiesDomainToDomain(ttCmlErrorHeader, internalVariableHdr);

        // Setting of an EXPORT PACKING ISSUER NAME
        // 輸出梱包者名の設定
        TmUserCriteriaDomain tmUserCriteria = new TmUserCriteriaDomain();
        String dscId = ttCmlErrorHeader.getDscId();
        tmUserCriteria.setDscId(dscId);
        TmUserDomain tmUser = tmUserService.searchByKey(tmUserCriteria);
        ttCmlErrorHeader.setExpPackingIssuerNm(tmUser.getUsrNmEn());

        // Clearance of a setting unnecessary item
        // 設定不要項目のクリア
        ttCmlErrorHeader.setWhCompCd(null);
        ttCmlErrorHeader.setWhCd(null);

        // Common items
        // 共通項目
        setCommonPropertyForRegist(ttCmlErrorHeader, dscId, screenId);

        // CML-Error-Report-Header registration
        // CMLエラーレポートヘッダ登録
        ttCmlErrorHeaderService.create(ttCmlErrorHeader);
    }
    /**
     * Add a domain to a CML-Error-Report-Detail list.
     * <br />CMLエラーレポート明細リストにドメインを追加します。
     *
     * @param internalVariableDtl Internal variable (details) domain<br />内部変数（明細）ドメイン
     * @param ttCmlErrorHeader CML-Error-Report-Header domain<br />CMLエラーレポートヘッダドメイン
     * @param itemNoChkFlg The item for ITEM-NO-CHECK-FLAG registration of a CML Error Report Detail<br />CMLエラーレポート明細の品目番号チェックフラグ登録用項目
     * @param ttCmlErrorDtlList CML-Error-Report-Detail list<br />CMLエラーレポート明細リスト
     * @param screenId SCREEN ID<br />画面ID
     * @throws ApplicationException When a CML Error Report Header cannot be accessed<br />CMLエラーレポートヘッダにアクセスできない場合
     */
    protected void addWs2502CmlDtlList(Ws2501InternalVariableDtlDomain internalVariableDtl, TtCmlErrorHeaderDomain ttCmlErrorHeader, StringBuffer itemNoChkFlg, List<TtCmlErrorDtlDomain> ttCmlErrorDtlList, String screenId)
        throws ApplicationException{
        // CML-Error-Report-Detail domain
        // CMLエラーレポート明細ドメイン
        TtCmlErrorDtlDomain ttCmlErrorDtl = new TtCmlErrorDtlDomain();

        CommonUtil.copyPropertiesDomainToDomain(ttCmlErrorDtl, internalVariableDtl);

        // DSC-ID
        String dscId = ttCmlErrorHeader.getDscId();
        ttCmlErrorDtl.setDscId(dscId);

        // ERROR CREATE TIMESTAMP
        // エラーレポート作成日時
        Timestamp errCreateTimestamp = ttCmlErrorHeader.getErrCreateTimestamp();
        ttCmlErrorDtl.setErrCreateTimestamp(errCreateTimestamp);

        // PKG CD
        // 包装コード
        if (FLAG_Y.equals(internalVariableDtl.getMixTagFlg())) {
            if (CheckUtil.isBlankOrNull(ttCmlErrorDtl.getPkgCd())) {
                ttCmlErrorDtl.setPkgCd(" ");
            }
        }

        // Setting of each QUANTITY
        // 各数量の設定
        String mixTagFlg = internalVariableDtl.getMixTagFlg();
        if (FLAG_N.compareTo(mixTagFlg) == 0){
            ttCmlErrorDtl.setShippingLot(internalVariableDtl.getLotSize());
            ttCmlErrorDtl.setQty(internalVariableDtl.getQty());
            ttCmlErrorDtl.setScanQty(internalVariableDtl.getTagQty());
            ttCmlErrorDtl.setStkQty(internalVariableDtl.getStkQty());

            BigDecimal leftInstrQty = internalVariableDtl.getInstrQty().subtract(internalVariableDtl.getPltzQty());
            ttCmlErrorDtl.setLeftInstrQty(leftInstrQty);

            BigDecimal overInstrQty = internalVariableDtl.getQty().subtract(internalVariableDtl.getInstrQty()).subtract(internalVariableDtl.getPltzQty());
            if (overInstrQty.compareTo(BigDecimal.ZERO) < 0){
                ttCmlErrorDtl.setOverInstrQty(null);
            } else {
                ttCmlErrorDtl.setOverInstrQty(overInstrQty);
            }
        } else {
            ttCmlErrorDtl.setShippingLot(null);
            ttCmlErrorDtl.setQty(null);
            ttCmlErrorDtl.setScanQty(null);
            ttCmlErrorDtl.setStkQty(null);
            ttCmlErrorDtl.setLeftInstrQty(null);
            ttCmlErrorDtl.setOverInstrQty(null);
        }

        // ITEM NO CHECK FLAG
        // 品目番号チェックフラグ
        ttCmlErrorDtl.setItemNoChkFlg(itemNoChkFlg.toString());

        String mixTagStatus = internalVariableDtl.getMixTagStatus();
        // MIX PALLETIZE COMPLETE FLAG
        // MIXタグパレタイズ完了フラグ
        if (mixTagStatus == null){
            // dead logic (it indicated as design specifications)
            // デッドロジック(設計書どおり記載しておいた)
            ttCmlErrorDtl.setMixPltzCompltFlg(null);
        } else if (MIX_TAG_STATUS_MIXTAG.compareTo(mixTagStatus) == 0){
            ttCmlErrorDtl.setMixPltzCompltFlg(FLAG_Y);
        } else if(MIX_TAG_STATUS_CML.compareTo(mixTagStatus) == 0){
            ttCmlErrorDtl.setMixPltzCompltFlg(FLAG_N);
        } else {
            // Dead logic
            // デッドロジック
        }

        // Common items
        // 共通項目
        setCommonPropertyForRegist(ttCmlErrorDtl, dscId, screenId);

        // It adds to CML-Error-Report-Detail list.
        // CMLエラーレポート明細リストへ追加
        ttCmlErrorDtlList.add(ttCmlErrorDtl);
    }

    /**
     * Confirm whether the exterior sign is set up and require it.
     * <br />外装記号が設定されているかチェックしいます。
     *
     * @param criteria Eis Product domain<br />Eis Productドメイン
     * @return Checked result<br />チェック結果
     */
    protected boolean chkWs2502OuterPkgCd(WsBhtEisProductCriteriaDomain criteria){
        // Exterior sign
        // 外装記号
        String outerPkgCd = criteria.getWs2502InternalVariableHdrDomain().getOuterPkgCd();

        // Type of packing
        // 包装形態
        String pkgFormTyp = criteria.getWs2502InternalVariableDtlDomainList().get(0).getPkgFormTyp();

        // Exterior sign check (single article ITEM NO)
        // 外装記号チェック（単品品目番号）
        if (PKG_FORM_TYP_SINGLE.equals(pkgFormTyp)){

            BigDecimal qty = criteria.getWs2502InternalVariableDtlDomainList().get(0).getQty();
            BigDecimal lotSize = criteria.getWs2502InternalVariableDtlDomainList().get(0).getLotSize();

            if (lotSize.subtract(qty).compareTo(BigDecimal.ZERO) > 0){
                if (CheckUtil.isBlankOrNull(outerPkgCd)){
                    return false;
                }
            }
        }

        // Exterior sign check (multi-article ITEM NO)
        // 外装記号チェック（多品品目番号）
        if (PKG_FORM_TYP_MULTI.equals(pkgFormTyp)){
            if (CheckUtil.isBlankOrNull(outerPkgCd)){
                return false;
            }
        }
        return true;
    }

    /**
     * Acquire Main Mark.
     * <br />Main Markを取得します。
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param whCd W/H CD (between bases)<br />倉庫コード（拠点間）
     * @param screenId SCREEN ID<br />画面ID
     * @return MAIN MARK<br />メインマーク
     * @throws ApplicationException When an error occurs in CommonService<br />CommonServiceでエラーが発生した場合
     */
    protected String createMainMark(String shipperCd, String whCd, String screenId) throws ApplicationException {

        // The time zone converted date of Shipper is acquired.
        // Shipperのタイムゾーン変換日付を取得
        Date sysdate = DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd));

        // Create of an assignment-of-order-numbers key
        // 採番キーの作成
        String mainMarkSeqKey
            = String.format("D%s%s%s", shipperCd, whCd, DateUtil.formatDate(sysdate, "yyMMdd").substring(1));

        // Consecutive acquisition
        // 連番の取得
        String mainMarkSeq = transactSequence(mainMarkSeqKey, SEQ_TYP_CML_NO_DN, 1, screenId).get(0);

        // Return of a MAIN MARK
        // メインマークの返却
        String mainMark = mainMarkSeqKey + mainMarkSeq;

        return mainMark;
    }

    /**
     * Perform Palletize-Instruction-Receive-Order alloc processing.
     * <br />梱包指示品目番号受注情報引当処理を行います。
     *
     * @param mixItemNoFlg Mix ItemNo Flg<br />Mix ItemNo Flg
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product domain<br />Eis Productドメイン
     * @throws ApplicationException When a Palletize Instruction Receive Order and a Palletize Item Receive Order cannot be accessed
     *                              <br />梱包指示品目番号受注情報、パレタイズ対象品受注情報にアクセスできない場合
     */
    protected void allocWs2502Qty(boolean mixItemNoFlg, String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{

        String dscId = criteria.getLoginUserDscId();
        String pltzInstrNo = criteria.getWs2502InternalVariableHdrDomain().getPltzInstrNo();

        List<? extends Ws2501InternalVariableDtlDomain> dtlList;
        if (mixItemNoFlg){
            dtlList = criteria.getWs2502InternalVariableMixItemNoDomainList();
        } else {
            dtlList = criteria.getWs2502InternalVariableDtlDomainList();
        }


        for (Ws2501InternalVariableDtlDomain internalVariableDtl : dtlList){
            // BRANCH acquisition
            // 枝番取得
            BigDecimal brch = internalVariableDtl.getSeq();

            // MixTag flag acquisition
            // MixTagフラグ取得
            String mixTagFlg = internalVariableDtl.getMixTagFlg();

            if (mixItemNoFlg || (!mixItemNoFlg && FLAG_N.equals(mixTagFlg))) {
                // Alloc of a Palletize Instruction Receive Order
                // 梱包指示品目番号受注情報の引当

                // The amount of remaining numbers of the number of PKGs
                // 梱包数の残数量
                BigDecimal qty = internalVariableDtl.getQty();

                // Acquisition of a Palletize Instruction Receive Order
                // 梱包指示品目番号受注情報の取得
                TtPltzInstrOdrCriteriaDomain ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
                ttPltzInstrOdrCriteria.setPltzInstrNo(pltzInstrNo);
                ttPltzInstrOdrCriteria.setItemNo(internalVariableDtl.getItemNo());
                ttPltzInstrOdrCriteria.setPkgCd(internalVariableDtl.getPkgCd());
                ttPltzInstrOdrCriteria.setPackedFlg(FLAG_N);
                ttPltzInstrOdrCriteria.setPreferredOrder("ETD_DUE_DT asc, CUSTOMER_PO_NO asc, ODR_CTRL_NO asc");

                List<TtPltzInstrOdrDomain> ttPltzInstrOdrList = ttPltzInstrOdrService.searchByCondition(ttPltzInstrOdrCriteria);

                // It draws with two or more Palletize Instruction Receive Orders until the internal variable (details) . QUANTITY of object record is set to 0.
                // 対象レコードの内部変数（明細）.数量が0になるまで、複数の梱包指示品目番号受注情報と引当てる
                for (TtPltzInstrOdrDomain ttPltzInstrOdr : ttPltzInstrOdrList){

                    // Since it cannot draw any more if the amount of remaining numbers of the number of PKGs is 0, it ends. ..
                    // 梱包数の残数量が 0 ならこれ以上引き当てられないので終了...
                    if (qty.compareTo(BigDecimal.ZERO) == 0) {
                        break;
                    }

                    BigDecimal allocQty = ttPltzInstrOdr.getAllocQty();
                    BigDecimal packedQty = ttPltzInstrOdr.getPackedQty();
                    BigDecimal unPackedQty = allocQty.subtract(packedQty);

                    // This ALLOC-QUANTITY calculation
                    // 今回の引当数量算出
                    BigDecimal allocQtyThisTime;
                    if(qty.compareTo(unPackedQty) > 0){
                        allocQtyThisTime = unPackedQty;
                    } else {
                        allocQtyThisTime = qty;
                    }

                    // Update of a Palletize Instruction Receive Order
                    // 梱包指示品目番号受注情報の更新
                    TtPltzInstrOdrCriteriaDomain ttPltzInstrOdrCriteriaUpdate = new TtPltzInstrOdrCriteriaDomain();
                    ttPltzInstrOdrCriteriaUpdate.setPltzInstrNo(ttPltzInstrOdr.getPltzInstrNo());
                    ttPltzInstrOdrCriteriaUpdate.setItemNo(ttPltzInstrOdr.getItemNo());
                    ttPltzInstrOdrCriteriaUpdate.setPkgCd(ttPltzInstrOdr.getPkgCd());
                    ttPltzInstrOdrCriteriaUpdate.setRcvOdrCompCd(ttPltzInstrOdr.getRcvOdrCompCd());
                    ttPltzInstrOdrCriteriaUpdate.setCustomerCd(ttPltzInstrOdr.getCustomerCd());
                    ttPltzInstrOdrCriteriaUpdate.setLgcyShipTo(ttPltzInstrOdr.getLgcyShipTo());
                    ttPltzInstrOdrCriteriaUpdate.setTrnsCd(ttPltzInstrOdr.getTrnsCd());
                    ttPltzInstrOdrCriteriaUpdate.setEtdDueDt(ttPltzInstrOdr.getEtdDueDt());
                    ttPltzInstrOdrCriteriaUpdate.setCustomerPoNo(ttPltzInstrOdr.getCustomerPoNo());
                    ttPltzInstrOdrCriteriaUpdate.setCustomerItemNo(ttPltzInstrOdr.getCustomerItemNo());
                    ttPltzInstrOdrCriteriaUpdate.setCustomerItemNoOrg(ttPltzInstrOdr.getCustomerItemNoOrg());
                    ttPltzInstrOdrCriteriaUpdate.setOdrCtrlNo(ttPltzInstrOdr.getOdrCtrlNo());

                    BigDecimal newPackedQty = packedQty.add(allocQtyThisTime);

                    TtPltzInstrOdrDomain ttPltzInstrOdrUpdate = new TtPltzInstrOdrDomain();
                    ttPltzInstrOdrUpdate.setPackedQty(newPackedQty);
                    if (allocQty.compareTo(newPackedQty) == 0) {
                        ttPltzInstrOdrUpdate.setPackedFlg(FLAG_Y);
                    }
                    setCommonPropertyForUpdate(ttPltzInstrOdrUpdate, dscId, criteria.getScreenId());

                    ttPltzInstrOdrService.updateByCondition(ttPltzInstrOdrUpdate, ttPltzInstrOdrCriteriaUpdate);

                    // Registration of Palletize Item Receive Order
                    // パレタイズ対象品受注情報の登録
                    TtPltzItemOdrDomain ttPltzItemOdr = new TtPltzItemOdrDomain();
                    CommonUtil.copyPropertiesDomainToDomain(ttPltzItemOdr, ttPltzInstrOdr);
                    ttPltzItemOdr.setMainMark(mainMark);
                    ttPltzItemOdr.setBrch(brch);
                    ttPltzItemOdr.setAllocQty(allocQtyThisTime);
                    setCommonPropertyForRegist(ttPltzItemOdr, dscId, criteria.getScreenId());

                    ttPltzItemOdrService.create(ttPltzItemOdr);

                    qty = qty.subtract(allocQtyThisTime);
                }
                if (qty.compareTo(BigDecimal.ZERO) != 0) {
                    Object[] param = { internalVariableDtl.getItemNo()};
                    throw new ApplicationException(NXS_E7_0090, param);
                }
            }
        }
    }

    /**
     * Register Palletize-Item data (ITEM NO).
     * <br />パレタイズ対象品データ（品目番号）を登録します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product domain<br />Eis Productドメイン
     * @throws ApplicationException When a Palletize Item cannot be accessed<br />パレタイズ対象品にアクセスできない場合
     */
    protected void createWs2502PltzItem(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();
        for (TtPltzItemDomain ttPltzItemDomain : createTtPltzItemDomains(mainMark, criteria)) {
            setCommonPropertyForRegist(ttPltzItemDomain, dscId, criteria.getScreenId());
            ttPltzItemService.create(ttPltzItemDomain);
        }
    }

    /**
     * Generate and return Palletize-Item data (ITEM NO).
     * <br />パレタイズ対象品データ（品目番号）を生成して返す。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product domain<br />Eis Productドメイン
     * @return Palletize-Item data (ITEM NO)<br />パレタイズ対象品データ（品目番号）
     * @throws ValidationException when net weight is overflow
     */
    protected List<TtPltzItemDomain> createTtPltzItemDomains(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ValidationException {

        List<TtPltzItemDomain> ttPltzItemDomains = new ArrayList<TtPltzItemDomain>();

        Ws2501InternalVariableHdrDomain internalVariableHdrDomain = criteria.getWs2502InternalVariableHdrDomain();

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2502InternalVariableDtlDomainList()){
            if (FLAG_N.equals(internalVariableDtl.getMixTagFlg())) {
                ttPltzItemDomains.add(createTtPltzItemDomainForItemNo(mainMark, internalVariableHdrDomain, internalVariableDtl));
            }
        }

        for (Ws2501InternalVariableDtlDomain internalVariableMixItemNo : criteria.getWs2502InternalVariableMixItemNoDomainList()){
            ttPltzItemDomains.add(createTtPltzItemDomainForMixItemNo(mainMark, internalVariableHdrDomain, internalVariableMixItemNo));
        }

        return ttPltzItemDomains;
    }

    /**
     * Generate Palletize-Item data (ITEM NO) again based on the specified information.
     * <br />指定した情報をもとにパレタイズ対象品データ（品目番号）を生成し返す。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param internalVariableHdr Internal variable (header)<br />内部変数（ヘッダー）
     * @param internalVariableDtl Internal variable (details)<br />内部変数（明細）
     * @return Palletize-Item data (ITEM NO)<br />パレタイズ対象品データ（品目番号）
     * @throws ValidationException when net weight is overflow
     */
    protected TtPltzItemDomain createTtPltzItemDomainForItemNo(String mainMark,
            Ws2501InternalVariableHdrDomain internalVariableHdr,
            Ws2501InternalVariableDtlDomain internalVariableDtl) throws ValidationException {

        TtPltzItemDomain ttPltzItem = new TtPltzItemDomain();

        CommonUtil.copyPropertiesDomainToDomain(ttPltzItem, internalVariableDtl);

        ttPltzItem.setMainMark(mainMark);
        ttPltzItem.setBrch(internalVariableDtl.getSeq());
        ttPltzItem.setPltzItemNo(internalVariableDtl.getItemNo());
        if (PKG_FORM_TYP_SINGLE.equals(internalVariableDtl.getPkgFormTyp())){
            ttPltzItem.setTagQty(null);
        }
        ttPltzItem.setNetWeight(internalVariableDtl.getQty().multiply(internalVariableDtl.getItemWeight()));
        checkWeightOverflow(ttPltzItem.getNetWeight(), new String[] {getResource("label.netWeight")});
        ttPltzItem.setShippingLot(internalVariableDtl.getLotSize());
        ttPltzItem.setRtFlg(FLAG_N);
        ttPltzItem.setKitFlg(FLAG_N);
        ttPltzItem.setPltzInstrNo(internalVariableHdr.getPltzInstrNo());
        ttPltzItem.setParFlg(FLAG_Y);
        ttPltzItem.setMixTagNo(null);
        ttPltzItem.setKitParItemNo(internalVariableDtl.getItemNo());

        return ttPltzItem;
    }

    /**
     * Generate Palletize-Item data (ITEM NO) again based on the specified information.
     * <br />指定した情報をもとにパレタイズ対象品データ（品目番号）を生成し返す。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param internalVariableHdr Internal variable (header)<br />内部変数（ヘッダー）
     * @param internalVariableDtl Internal variable (details)<br />内部変数（明細）
     * @return Palletize-Item data (Mix ITEM NO)<br />パレタイズ対象品データ（Mix品目番号）
     * @throws ValidationException when net weight is overflow
     */
    protected TtPltzItemDomain createTtPltzItemDomainForMixItemNo(String mainMark,
            Ws2501InternalVariableHdrDomain internalVariableHdr,
            Ws2501InternalVariableDtlDomain internalVariableDtl) throws ValidationException {

        TtPltzItemDomain ttPltzItem = new TtPltzItemDomain();

        CommonUtil.copyPropertiesDomainToDomain(ttPltzItem, internalVariableDtl);

        ttPltzItem.setMainMark(mainMark);
        ttPltzItem.setBrch(internalVariableDtl.getSeq());
        ttPltzItem.setPltzItemNo(internalVariableDtl.getItemNo());
        ttPltzItem.setTagQty(null);
        ttPltzItem.setNetWeight(internalVariableDtl.getQty().multiply(internalVariableDtl.getItemWeight()));
        checkWeightOverflow(ttPltzItem.getNetWeight(), new String[] {getResource("label.netWeight")});
        ttPltzItem.setShippingLot(internalVariableDtl.getLotSize());
        ttPltzItem.setRtFlg(FLAG_N);
        ttPltzItem.setKitFlg(FLAG_N);
        ttPltzItem.setPltzInstrNo(internalVariableHdr.getPltzInstrNo());
        ttPltzItem.setParFlg(FLAG_Y);
        ttPltzItem.setKitParItemNo(internalVariableDtl.getItemNo());

        return ttPltzItem;
    }

    /**
     * Register Palletize-Item data (packing).
     * <br />パレタイズ対象品データ（包装）を登録します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a table cannot be accessed<br />テーブルにアクセスできない場合
     */
    protected void createWs2502PltzItemPkg(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        // Registration of Packing material (registration of the data acquired from the packing specification)
        // 包装材の登録（包装仕様から取得したデータの登録）
        createWs2502PltzItemPkgByPkg(mainMark, criteria);
        // Registration of Packing material (registration of the data acquired from the MIX tag)
        // 包装材の登録（MIXタグから取得したデータの登録）
        createWs2502PltzItemPkgByMixTag(mainMark, criteria);
        // Registration of Packing material (registration of the data acquired from exterior cases)
        // 包装材の登録（外装材から取得したデータの登録）
        createWs2502PltzItemPkgByOuterPkg(mainMark, criteria);
        // Registration of Packing material (registration of a dummy Packing material)
        // 包装材の登録（ダミー包装材の登録）
        createWs2502PltzItemPkgByDummyPkg(mainMark, criteria);
    }
    /**
     * Register a Packing material (registration of the data acquired from the packing specification).
     * <br />包装材を登録（包装仕様から取得したデータの登録）します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Palletize Item cannot be referred to<br />パレタイズ対象品を参照できない場合
     */
    protected void createWs2502PltzItemPkgByPkg(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();

        String ownerCompCd = criteria.getWs2502InternalVariableHdrDomain().getShipperCd();
        String trnsCd = criteria.getWs2502InternalVariableHdrDomain().getTrnsCd();
        String outerPkgCd = criteria.getWs2502InternalVariableHdrDomain().getOuterPkgCd();
        String pltzInstrNo = criteria.getWs2502InternalVariableHdrDomain().getPltzInstrNo();

        BigDecimal brch = searchMaxBrchPlusOne(mainMark);

        // 包装材品目番号ごとに包装材使用数を合算
        Map<String, Ws2501PkgSpecMaterialsNameRevDomain> pkgSpecMaterialsNameRevMap = new HashMap<String, Ws2501PkgSpecMaterialsNameRevDomain>();
        
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2502InternalVariableDtlDomainList()) {
            String mixTagFlg = internalVariableDtl.getMixTagFlg();

            if (FLAG_N.compareTo(mixTagFlg) == 0) {
                // Acquisition of a Packing material
                // 包装材の取得
                Ws2501PkgSpecMaterialsNameRevCriteriaDomain pkgSpecMaterialsNameRevCriteria = new Ws2501PkgSpecMaterialsNameRevCriteriaDomain();
                pkgSpecMaterialsNameRevCriteria.setOwnerCompCd(ownerCompCd);
                pkgSpecMaterialsNameRevCriteria.setTrnsCd(trnsCd);
                pkgSpecMaterialsNameRevCriteria.setItemNo(internalVariableDtl.getItemNo());
                pkgSpecMaterialsNameRevCriteria.setPkgCd(internalVariableDtl.getPkgCd());
                if (!CheckUtil.isBlankOrNull(outerPkgCd)) {
                    pkgSpecMaterialsNameRevCriteria.setOuterPkgCd(outerPkgCd);
                }

                List<? extends Ws2501PkgSpecMaterialsNameRevDomain> pkgSpecMaterialsNameRevList
                    = wsBhtEisProductDao.searchPkgSpecMaterialsNameRev(pkgSpecMaterialsNameRevCriteria);

                for (Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev : pkgSpecMaterialsNameRevList) {
                    // Calculation of a Packing-material USE QUANTITY
                    // 包装材使用数の算出
                    BigDecimal pkgUsedQty
                        = internalVariableDtl.getQty().divide(pkgSpecMaterialsNameRev.getLotSize(), BigDecimal.ROUND_UP).multiply(pkgSpecMaterialsNameRev.getQty());
                    pkgSpecMaterialsNameRev.setPkgUsedQty(pkgUsedQty);

                    // Total of a Packing-material USE QUANTITY
                    // 包装材使用数の合算
                    String pkgItemNo = pkgSpecMaterialsNameRev.getPkgItemNo();
                    Ws2501PkgSpecMaterialsNameRevDomain sumPkgSpecMaterialsNameRev = pkgSpecMaterialsNameRevMap.get(pkgItemNo);
                    if (sumPkgSpecMaterialsNameRev == null) {
                        pkgSpecMaterialsNameRev.setPkgUsedSumQty(pkgSpecMaterialsNameRev.getPkgUsedQty());
                        pkgSpecMaterialsNameRevMap.put(pkgItemNo, pkgSpecMaterialsNameRev);
                    } else {
                        sumPkgSpecMaterialsNameRev.setPkgUsedSumQty(
                            sumPkgSpecMaterialsNameRev.getPkgUsedSumQty().add(pkgSpecMaterialsNameRev.getPkgUsedQty()));
                    }
                }
            }
        }
        
        // Registration of Palletize Item
        // パレタイズ対象品の登録
        for (Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev : pkgSpecMaterialsNameRevMap.values()) {
            TtPltzItemDomain ttPltzItem = new TtPltzItemDomain();
            ttPltzItem.setMainMark(mainMark);
            ttPltzItem.setBrch(brch);
            ttPltzItem.setPltzItemNo(pkgSpecMaterialsNameRev.getPkgItemNo());
            ttPltzItem.setPkgCd(" ");
            ttPltzItem.setItemDescription(pkgSpecMaterialsNameRev.getPkgNm());
            ttPltzItem.setQty(pkgSpecMaterialsNameRev.getPkgUsedSumQty());
            ttPltzItem.setQtyUnit(QTY_UNIT_EA);
            ttPltzItem.setItemTyp(ITEM_TYP_PKG_MATERIALS);
            ttPltzItem.setNetWeight(pkgSpecMaterialsNameRev.getPkgUsedSumQty().multiply(pkgSpecMaterialsNameRev.getPkgWeight()));
            checkWeightOverflow(ttPltzItem.getNetWeight(), new String[] {getResource("label.netWeight")});
            ttPltzItem.setItemWeight(pkgSpecMaterialsNameRev.getPkgWeight());
            ttPltzItem.setWeightUnit(pkgSpecMaterialsNameRev.getWeightUnit());
            ttPltzItem.setPkgTyp(pkgSpecMaterialsNameRev.getInnerOuterTyp());
            ttPltzItem.setModelCd(pkgSpecMaterialsNameRev.getModelCd());
            ttPltzItem.setDngrItemFlg(FLAG_N);
            ttPltzItem.setOriginCntryCd(pkgSpecMaterialsNameRev.getOriginCntry());
            ttPltzItem.setCurrCd(pkgSpecMaterialsNameRev.getCurrCd());
            if (RT_TYP_1WAY.compareTo(pkgSpecMaterialsNameRev.getRtTyp()) == 0) {
                ttPltzItem.setRtFlg(FLAG_N);
            } else {
                ttPltzItem.setRtFlg(FLAG_Y);
                criteria.setRtUseFlg(FLAG_Y);
            }
            ttPltzItem.setKitFlg(FLAG_N);
            ttPltzItem.setPltzInstrNo(pltzInstrNo);
            ttPltzItem.setParFlg(FLAG_Y);
            ttPltzItem.setKitParItemNo(pkgSpecMaterialsNameRev.getPkgItemNo());
            ttPltzItem.setInputMethTyp(INPUT_METH_TYP_AUTO);
            setCommonPropertyForRegist(ttPltzItem, dscId, criteria.getScreenId());

            ttPltzItemService.create(ttPltzItem);

            brch = brch.add(BigDecimal.ONE);
        }
    }
    /**
     * Register a Packing material (registration of the data acquired from the MIX tag).
     * <br />包装材を登録（MIXタグから取得したデータの登録）します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Mix Tag RT and a Palletize Item cannot be accessed<br />MIXED用RT材、パレタイズ対象品にアクセスできない場合
     */
    protected void createWs2502PltzItemPkgByMixTag(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();
        String pltzInstrNo = criteria.getWs2502InternalVariableHdrDomain().getPltzInstrNo();
        BigDecimal brch = searchMaxBrchPlusOne(mainMark);

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2502InternalVariableDtlDomainList()){
            String mixTagFlg = internalVariableDtl.getMixTagFlg();

            if(FLAG_Y.compareTo(mixTagFlg) == 0){
                // Acquisition of Mix Tag RT
                // MIXED用RT材の取得
                TtMixtagRtCriteriaDomain ttMixtagRtCriteria = new TtMixtagRtCriteriaDomain();
                ttMixtagRtCriteria.setMixTagNo(internalVariableDtl.getItemNo());

                List<TtMixtagRtDomain> ttMixtagRtList = ttMixtagRtService.searchByCondition(ttMixtagRtCriteria);

                for (TtMixtagRtDomain ttMixtagRt : ttMixtagRtList){
                    // Registration of Palletize Item
                    // パレタイズ対象品の登録
                    TtPltzItemDomain ttPltzItem = new TtPltzItemDomain();
                    ttPltzItem.setMainMark(mainMark);
                    ttPltzItem.setBrch(brch);
                    ttPltzItem.setPltzItemNo(ttMixtagRt.getPkgItemNo());
                    ttPltzItem.setPkgCd(" ");
                    ttPltzItem.setItemDescription(ttMixtagRt.getPkgNm());
                    ttPltzItem.setQty(ttMixtagRt.getQty());
                    ttPltzItem.setQtyUnit(QTY_UNIT_EA);
                    ttPltzItem.setItemTyp(ITEM_TYP_PKG_MATERIALS);
                    ttPltzItem.setNetWeight(ttMixtagRt.getQty().multiply(ttMixtagRt.getPkgWeight()));
                    checkWeightOverflow(ttPltzItem.getNetWeight(), new String[] {getResource("label.netWeight")});
                    ttPltzItem.setItemWeight(ttMixtagRt.getPkgWeight());
                    ttPltzItem.setWeightUnit(ttMixtagRt.getWeightUnit());
                    ttPltzItem.setPkgTyp(PKG_TYP_INNER);
                    ttPltzItem.setModelCd(ttMixtagRt.getModelCd());
                    ttPltzItem.setDngrItemFlg(FLAG_N);
                    ttPltzItem.setOriginCntryCd(ttMixtagRt.getOriginCntryCd());
                    ttPltzItem.setCurrCd(ttMixtagRt.getCurrCd());
                    ttPltzItem.setRtFlg(ttMixtagRt.getRtFlg());
                    ttPltzItem.setKitFlg(FLAG_N);
                    ttPltzItem.setMixTagNo(ttMixtagRt.getMixTagNo());
                    ttPltzItem.setPltzInstrNo(pltzInstrNo);
                    ttPltzItem.setParFlg(FLAG_Y);
                    ttPltzItem.setKitParItemNo(ttMixtagRt.getPkgItemNo());
                    ttPltzItem.setInputMethTyp(INPUT_METH_TYP_AUTO);
                    setCommonPropertyForRegist(ttPltzItem, dscId, criteria.getScreenId());

                    ttPltzItemService.create(ttPltzItem);

                    brch = brch.add(BigDecimal.ONE);

                    if (FLAG_Y.compareTo(ttMixtagRt.getRtFlg()) == 0){
                        criteria.setRtUseFlg(FLAG_Y);
                    }
                }
            }
        }
    }
    /**
     * Register a Packing material (registration of the data acquired from exterior cases).
     * <br />包装材を登録（外装材から取得したデータの登録）します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a packing combination master (details), a PKG Materials MA, a PKG Materials Name MA, a NEXUS Company Master, and a Palletize Item cannot be accessed
     *                              <br />包装組合せ原単位（明細）、包装材原単位、包装材名称原単位、NEXUS会社原単位、パレタイズ対象品にアクセスできない場合
     */
    protected void createWs2502PltzItemPkgByOuterPkg(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();
        String outerPkgCd = criteria.getWs2502InternalVariableHdrDomain().getOuterPkgCd();

        if (!CheckUtil.isBlankOrNull(outerPkgCd)){
            String pltzInstrNo = criteria.getWs2502InternalVariableHdrDomain().getPltzInstrNo();
            BigDecimal brch = searchMaxBrchPlusOne(mainMark);

            // packing combination master (details), a PKG Materials MA, a PKG Materials Name MA, NEXUS-Company-Master acquisition
            // 包装組合せ原単位（明細）、包装材原単位、包装材名称原単位、NEXUS会社原単位取得
            Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain pkgSetMaterialsNxsCompNmCriteria = new Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain();
            pkgSetMaterialsNxsCompNmCriteria.setOwnerComp(criteria.getWs2502InternalVariableHdrDomain().getShipperCd());
            pkgSetMaterialsNxsCompNmCriteria.setOuterCd(criteria.getWs2502InternalVariableHdrDomain().getOuterPkgCd());

            List<? extends Ws2501PkgSetMaterialsNxsCompNmDomain> pkgSetMaterialsNxsCompNmList
                = wsBhtEisProductDao.searchPkgSetMaterialsNxsCompNm(pkgSetMaterialsNxsCompNmCriteria);

            for (Ws2501PkgSetMaterialsNxsCompNmDomain pkgSetMaterialsNxsCompNm : pkgSetMaterialsNxsCompNmList){
                // Registration of Palletize Item
                // パレタイズ対象品の登録
                TtPltzItemDomain ttPltzItem = new TtPltzItemDomain();
                ttPltzItem.setMainMark(mainMark);
                ttPltzItem.setBrch(brch);
                ttPltzItem.setPltzItemNo(pkgSetMaterialsNxsCompNm.getPkgItemNo());
                ttPltzItem.setPkgCd(" ");
                ttPltzItem.setItemDescription(pkgSetMaterialsNxsCompNm.getPkgNm());
                ttPltzItem.setQty(pkgSetMaterialsNxsCompNm.getUseQty());
                ttPltzItem.setQtyUnit(QTY_UNIT_EA);
                ttPltzItem.setItemTyp(ITEM_TYP_PKG_MATERIALS);
                ttPltzItem.setNetWeight(pkgSetMaterialsNxsCompNm.getUseQty().multiply(pkgSetMaterialsNxsCompNm.getPkgWeight()));
                checkWeightOverflow(ttPltzItem.getNetWeight(), new String[] {getResource("label.netWeight")});
                ttPltzItem.setItemWeight(pkgSetMaterialsNxsCompNm.getPkgWeight());
                ttPltzItem.setWeightUnit(pkgSetMaterialsNxsCompNm.getWeightUnit());
                ttPltzItem.setPkgTyp(PKG_TYP_OUTER);
                ttPltzItem.setModelCd(pkgSetMaterialsNxsCompNm.getModelCd());
                ttPltzItem.setDngrItemFlg(FLAG_N);
                ttPltzItem.setOriginCntryCd(pkgSetMaterialsNxsCompNm.getOriginCntry());
                ttPltzItem.setCurrCd(pkgSetMaterialsNxsCompNm.getCurrCd());
                if (RT_TYP_1WAY.compareTo(pkgSetMaterialsNxsCompNm.getRtTyp()) == 0){
                    ttPltzItem.setRtFlg(FLAG_N);
                } else {
                    ttPltzItem.setRtFlg(FLAG_Y);
                    criteria.setRtUseFlg(FLAG_Y);
                }
                ttPltzItem.setKitFlg(FLAG_N);
                ttPltzItem.setPltzInstrNo(pltzInstrNo);
                ttPltzItem.setParFlg(FLAG_Y);
                ttPltzItem.setKitParItemNo(pkgSetMaterialsNxsCompNm.getPkgItemNo());
                ttPltzItem.setInputMethTyp(INPUT_METH_TYP_AUTO);
                setCommonPropertyForRegist(ttPltzItem, dscId, criteria.getScreenId());

                ttPltzItemService.create(ttPltzItem);

                brch = brch.add(BigDecimal.ONE);
            }
        }
    }
    /**
     * Register a Packing material (registration of a dummy Packing material).
     * <br />包装材を登録（ダミー包装材の登録）します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a PKG Materials MA, a PKG Materials Name MA, a NEXUS Company Master, and a Palletize Item cannot be referred to
     *                              <br />包装材原単位、包装材名称原単位、NEXUS会社原単位、パレタイズ対象品を参照できない場合
     */
    protected void createWs2502PltzItemPkgByDummyPkg(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();
        String shipperCd = criteria.getWs2502InternalVariableHdrDomain().getShipperCd();
        String pltzInstrNo = criteria.getWs2502InternalVariableHdrDomain().getPltzInstrNo();

        for (Ws2501PkgItemNoDomain pkgItemNo : criteria.getWs2502PkgItemNoList()){
            // Acquisition of PKG Materials MA, a PKG Materials Name MA, and a NEXUS Company Master
            // 包装材原単位、包装材名称原単位、NEXUS会社原単位の取得
            Ws2501PkgMaterialsCriteriaDomain pkgMaterialsCriteria = new Ws2501PkgMaterialsCriteriaDomain();
            pkgMaterialsCriteria.setOwnerComp(shipperCd);
            pkgMaterialsCriteria.setPkgItemNo(pkgItemNo.getPkgItemNo());

            Ws2501PkgMaterialsDomain pkgMaterials = wsBhtEisProductDao.searchPkgMaterials(pkgMaterialsCriteria);

            // Registration of Palletize Item
            // パレタイズ対象品の登録
            TtPltzItemDomain ttPltzItem = new TtPltzItemDomain();
            ttPltzItem.setMainMark(mainMark);
            ttPltzItem.setBrch(searchMaxBrchPlusOne(mainMark));
            ttPltzItem.setPltzItemNo(pkgMaterials.getPkgItemNo());
            ttPltzItem.setPkgCd(" ");
            ttPltzItem.setItemDescription(pkgMaterials.getPkgNm());
            ttPltzItem.setQty(pkgItemNo.getPkgQty());
            ttPltzItem.setQtyUnit(QTY_UNIT_EA);
            ttPltzItem.setItemTyp(ITEM_TYP_PKG_MATERIALS);
            ttPltzItem.setNetWeight(pkgItemNo.getPkgQty().multiply(pkgMaterials.getPkgWeight()));
            checkWeightOverflow(ttPltzItem.getNetWeight(), new String[] {getResource("label.netWeight")});
            ttPltzItem.setItemWeight(pkgMaterials.getPkgWeight());
            ttPltzItem.setWeightUnit(pkgMaterials.getWeightUnit());
            ttPltzItem.setPkgTyp(PKG_TYP_DUMMY);
            ttPltzItem.setModelCd(pkgMaterials.getModelCd());
            ttPltzItem.setDngrItemFlg(FLAG_N);
            ttPltzItem.setOriginCntryCd(pkgMaterials.getOriginCntry());
            ttPltzItem.setCurrCd(pkgMaterials.getCurrCd());
            if (RT_TYP_1WAY.compareTo(pkgMaterials.getRtTyp()) == 0){
                ttPltzItem.setRtFlg(FLAG_N);
            } else {
                ttPltzItem.setRtFlg(FLAG_Y);
                criteria.setRtUseFlg(FLAG_Y);
            }
            ttPltzItem.setKitFlg(FLAG_N);
            ttPltzItem.setPltzInstrNo(pltzInstrNo);
            ttPltzItem.setParFlg(FLAG_Y);
            ttPltzItem.setKitParItemNo(pkgMaterials.getPkgItemNo());
            ttPltzItem.setInputMethTyp(INPUT_METH_TYP_MANUAL);
            setCommonPropertyForRegist(ttPltzItem, dscId, criteria.getScreenId());

            ttPltzItemService.create(ttPltzItem);
        }
    }

    /**
     * Register Palletize-Item-KANBAN data.
     * <br />パレタイズ対象品かんばん情報データを登録します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a MIX tag cannot be accessed at a link KANBAN information and a Palletize Item KANBAN
     *                              <br />MIXタグに紐づくかんばん情報、パレタイズ対象品かんばん情報にアクセスできない場合
     */
    protected void createKanban(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{

        String dscId = criteria.getLoginUserDscId();

        for (TtPltzKanbanDomain ttPltzKanban : createTtPltzKanbanDomains(mainMark, criteria)) {
            setCommonPropertyForRegist(ttPltzKanban, dscId, criteria.getScreenId());
            ttPltzKanbanService.create(ttPltzKanban);
        }
    }

    /**
     * Generate and return a Palletize Item KANBAN based on the specified argument.
     * <br />指定した引数をもとにパレタイズ対象品かんばん情報を生成して返す。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @return Palletize Item KANBAN<br />パレタイズ対象品かんばん情報
     * @throws ApplicationException When a MIX tag cannot be accessed at a link KANBAN information and a Palletize Item KANBAN
     *                              <br />MIXタグに紐づくかんばん情報、パレタイズ対象品かんばん情報にアクセスできない場合
     */
    protected List<TtPltzKanbanDomain> createTtPltzKanbanDomains(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        List<TtPltzKanbanDomain> ttPltzKanbanDomains = new ArrayList<TtPltzKanbanDomain>();

        // This is registration of a link KANBAN information to ITEM NO.
        // 品目番号に紐づくかんばん情報の登録

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2502InternalVariableDtlDomainList()){
            if (FLAG_Y.equals(internalVariableDtl.getMixTagFlg())) {
                continue;
            }
            BigDecimal cnt = BigDecimal.ONE;
            for (Ws2501InternalVariableDtlKanbanDomain internalVariableDtlKanban : internalVariableDtl.getInternalVariableDtlKanbanDomainList()){
                TtPltzKanbanDomain ttPltzKanban = new TtPltzKanbanDomain();
                ttPltzKanban.setMainMark(mainMark);
                ttPltzKanban.setBrch(internalVariableDtl.getSeq());
                ttPltzKanban.setKanbanSeqNo(cnt);
                ttPltzKanban.setExpIndusTypCd(internalVariableDtlKanban.getExpIndusTypCd());
                ttPltzKanban.setExpKanbanTyp(internalVariableDtlKanban.getExpKanbanTyp());
                ttPltzKanban.setExpRegulateNo(internalVariableDtlKanban.getTagSeqNo());
                ttPltzKanban.setExpCustomerRegulateNo(internalVariableDtlKanban.getCustomerTagSeqNo());
                ttPltzKanban.setQty(internalVariableDtlKanban.getQty());

                ttPltzKanbanDomains.add(ttPltzKanban);

                cnt = cnt.add(BigDecimal.ONE);
            }
        }

        // This is registration of a link KANBAN information to a MIX tag.
        // MIXタグに紐づくかんばん情報の登録
        for (Ws2501InternalVariableDtlDomain internalVariableMixItemNo : criteria.getWs2502InternalVariableMixItemNoDomainList()){
            // Mix-Tag-KANBAN acquisition
            // MIX品かんばん情報取得
            TtMixKanbanCriteriaDomain ttMixKanbanCriteria = new TtMixKanbanCriteriaDomain();
            ttMixKanbanCriteria.setMixTagNo(internalVariableMixItemNo.getMixTagNo());
            ttMixKanbanCriteria.setItemNo(internalVariableMixItemNo.getItemNo());
            ttMixKanbanCriteria.setPkgCd(internalVariableMixItemNo.getPkgCd());

            List<TtMixKanbanDomain> ttMixKanbanList = ttMixKanbanService.searchByCondition(ttMixKanbanCriteria);

            for (TtMixKanbanDomain ttMixKanban : ttMixKanbanList){
                // Palletize-Item-KANBAN registration
                // パレタイズ対象品かんばん情報登録
                TtPltzKanbanDomain ttPltzKanban = new TtPltzKanbanDomain();
                ttPltzKanban.setMainMark(mainMark);
                ttPltzKanban.setBrch(internalVariableMixItemNo.getSeq());
                ttPltzKanban.setKanbanSeqNo(ttMixKanban.getKanbanSeqNo());
                ttPltzKanban.setExpIndusTypCd(ttMixKanban.getExpIndusTypCd());
                ttPltzKanban.setExpKanbanTyp(ttMixKanban.getExpKanbanTyp());
                ttPltzKanban.setExpRegulateNo(ttMixKanban.getExpRegulateNo());
                ttPltzKanban.setExpCustomerRegulateNo(ttMixKanban.getExpCustomerRegulateNo());
                ttPltzKanban.setQty(ttMixKanban.getQty());
                ttPltzKanban.setImpIndusTypCd(ttMixKanban.getImpIndusTypCd());
                ttPltzKanban.setImpKanbanTyp(ttMixKanban.getImpKanbanTyp());
                ttPltzKanban.setImpRegulateNo(ttMixKanban.getImpRegulateNo());
                ttPltzKanban.setImpCustomerRegulateNo(ttMixKanban.getImpCustomerRegulateNo());

                ttPltzKanbanDomains.add(ttPltzKanban);
            }
        }

        return  ttPltzKanbanDomains;
    }

    /* Add: 7/2/2017 DIAT yamamoto */
    /**
     * Register Palletize-Item-KANBAN data for Asia.
     * <br />パレタイズ対象品かんばん情報データを登録します。
     * <br />通常のパレタイズ対象品かんばんの情報に加え、PRODUCT NOとORDER NOが登録値に追加されます。
     * 
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Palletize Item KANBAN cannot be accessed
     *                              <br />パレタイズ対象品かんばん情報にアクセスできない場合
     */
    protected void createKanbanExtra(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();

        for (TtPltzKanbanExtraDomain ttPltzKanbanExtra : createTtPltzKanbanExtraDomains(mainMark, criteria)) {
            setCommonPropertyForRegist(ttPltzKanbanExtra, dscId, criteria.getScreenId());
            ttPltzKanbanExtraService.create(ttPltzKanbanExtra);
        }
    }

    /* Add: 7/2/2017 DIAT yamamoto */
    /**
     * Generate and return a Palletize Item KANBAN based on the specified argument(For Asia).
     * <br />指定した引数をもとにパレタイズ対象品かんばん情報を生成して返す(Asia固有機能)。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @return Palletize Item KANBAN<br />パレタイズ対象品かんばん情報
     * @throws ApplicationException When a Palletize Item KANBAN cannot be accessed 
     *                              <br />MIXタグに紐づくかんばん情報、パレタイズ対象品かんばん情報にアクセスできない場合
     */
    @SuppressWarnings("unchecked")
    protected List<TtPltzKanbanExtraDomain> createTtPltzKanbanExtraDomains(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        List<TtPltzKanbanExtraDomain> ttPltzKanbanExtraDomains = new ArrayList<TtPltzKanbanExtraDomain>();

        // This is registration of a link KANBAN information to ITEM NO.
        // 品目番号に紐づくかんばん情報の登録

        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2502InternalVariableDtlDomainList()){
            if (FLAG_Y.equals(internalVariableDtl.getMixTagFlg())) {
                continue;
            }
            BigDecimal cnt = BigDecimal.ONE;
            for (Ws2501InternalVariableDtlKanbanAsiaDomain internalVariableDtlKanban : (List<Ws2501InternalVariableDtlKanbanAsiaDomain>)internalVariableDtl.getInternalVariableDtlKanbanDomainList()){
                TtPltzKanbanExtraDomain ttPltzKanbanExtra = new TtPltzKanbanExtraDomain();
                ttPltzKanbanExtra.setMainMark(mainMark);
                ttPltzKanbanExtra.setBrch(internalVariableDtl.getSeq());
                ttPltzKanbanExtra.setKanbanSeqNo(cnt);
                ttPltzKanbanExtra.setExpIndusTypCd(internalVariableDtlKanban.getExpIndusTypCd());
                ttPltzKanbanExtra.setExpKanbanTyp(internalVariableDtlKanban.getExpKanbanTyp());
                ttPltzKanbanExtra.setExpRegulateNo(internalVariableDtlKanban.getTagSeqNo());
                ttPltzKanbanExtra.setExpCustomerRegulateNo(internalVariableDtlKanban.getCustomerTagSeqNo());
                ttPltzKanbanExtra.setQty(internalVariableDtlKanban.getQty());
                try{
                    if (internalVariableDtlKanban.getProductDate() != null) {
                        ttPltzKanbanExtra.setProductDate(df
                            .parse(internalVariableDtlKanban.getProductDate()));
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                ttPltzKanbanExtra.setOrderNo(internalVariableDtlKanban.getOrderNo());

                ttPltzKanbanExtraDomains.add(ttPltzKanbanExtra);

                cnt = cnt.add(BigDecimal.ONE);
            }
        }

        return  ttPltzKanbanExtraDomains;
    }

    /**
     * Register Palletize data.
     * <br />パレタイズデータを登録します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When an error cannot occur and update a Palletize by commonService<br />commonServiceでエラーが発生、パレタイズを更新できない場合
     */
    protected void createWs2502Pltz(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        // Acquisition of WEIGHT, a VOLUME, and a LENGTH UNIT
        // 重量・容積・長さ単位の取得
        String shipperWeightUnit = commonService.searchWeightUnit(criteria.getWs2502InternalVariableHdrDomain().getShipperCd());
        String shipperLengthUnit = commonService.searchLengthUnit(criteria.getWs2502InternalVariableHdrDomain().getShipperCd());
        String shipperVolumetUnit = commonService.searchVolumeUnit(criteria.getWs2502InternalVariableHdrDomain().getShipperCd());

        // Acquisition of N/W
        // N/Wの取得
        Ws2501TtPltzItemNwCriteriaDomain ttPltzItemNwCriteria = new Ws2501TtPltzItemNwCriteriaDomain();
        ttPltzItemNwCriteria.setMainMark(mainMark);

        List<? extends Ws2501TtPltzItemNwDomain> ttPltzItemNwList = wsBhtEisProductDao.searchTtPltzItemNw(ttPltzItemNwCriteria);

        String[] nwMsgParams = {getResource("label.netWeight")};
        BigDecimal nw = BigDecimal.ZERO;

        for (Ws2501TtPltzItemNwDomain ttPltzItemNw : ttPltzItemNwList){
            nw = nw.add(convertWeightUnit(ttPltzItemNw.getNetWeight(), ttPltzItemNw.getWeightUnit(), shipperWeightUnit, nwMsgParams));
        }
        checkWeightOverflow(nw, nwMsgParams);

        // Acquisition of G/W
        // G/Wの取得
        Ws2501TtPltzItemGwCriteriaDomain ttPltzItemGwCriteria = new Ws2501TtPltzItemGwCriteriaDomain();
        ttPltzItemGwCriteria.setMainMark(mainMark);

        List<? extends Ws2501TtPltzItemGwDomain> ttPltzItemGwList = wsBhtEisProductDao.searchTtPltzItemGw(ttPltzItemGwCriteria);

        String[] gwMsgParams = {getResource("label.grossWeight")};
        BigDecimal gw = BigDecimal.ZERO;

        for (Ws2501TtPltzItemGwDomain ttPltzItemGw : ttPltzItemGwList){
            gw = gw.add(convertWeightUnit(ttPltzItemGw.getNetWeight(), ttPltzItemGw.getWeightUnit(), shipperWeightUnit, gwMsgParams));
        }
        checkWeightOverflow(gw, gwMsgParams);

        // Acquisition of a DUE DATE
        // 納期の取得
        Ws2501TtPltzItemDeliveryTimeCriteriaDomain ttPltzItemDeliveryTimeCriteria = new Ws2501TtPltzItemDeliveryTimeCriteriaDomain();
        ttPltzItemDeliveryTimeCriteria.setMainMark(mainMark);

        Ws2501TtPltzItemDeliveryTimeDomain ttPltzItemDeliveryTime = wsBhtEisProductDao.searchTtPltzItemDeliveryTime(ttPltzItemDeliveryTimeCriteria);

        // Registration processing (Palletize)
        // 登録処理(パレタイズ)
        String dscId = criteria.getLoginUserDscId();

        TtPltzDomain ttPltzDomain = new TtPltzDomain();

        CommonUtil.copyPropertiesDomainToDomain(ttPltzDomain, criteria.getWs2502InternalVariableHdrDomain());
        CommonUtil.copyPropertiesDomainToDomain(ttPltzDomain, criteria.getWs2502InternalVariableDtlDomainList().get(0));
        String plantCd = getPlantCd(criteria.getWs2502InternalVariableDtlDomainList(), criteria.getWs2502InternalVariableMixItemNoDomainList());
        
        ttPltzDomain.setMainMark(mainMark);
        ttPltzDomain.setPltzInstrNo(criteria.getWs2502InternalVariableHdrDomain().getPltzInstrNo());

        ttPltzDomain.setTrnsCdOrg(criteria.getWs2502InternalVariableHdrDomain().getTrnsCd());
        ttPltzDomain.setReviseFlg(FLAG_N);
        ttPltzDomain.setPlntCd(plantCd);
        ttPltzDomain.setCurLgcyWhCd(criteria.getWs2502InternalVariableHdrDomain().getLgcyWhCd());
        ttPltzDomain.setVariantFlg(FLAG_N);
        ttPltzDomain.setRtUseFlg(criteria.getRtUseFlg());
        ttPltzDomain.setWeightUnit(shipperWeightUnit);
        ttPltzDomain.setNetWeight(nw);
        ttPltzDomain.setGrossWeight(gw);
        ttPltzDomain.setLengthUnit(shipperLengthUnit);
        String[] lengthMsgParams = {getResource("label.length")};
        String[] widthMsgParams = {getResource("label.width")};
        String[] heightMsgParams = {getResource("label.height")};
        if (!CheckUtil.isBlankOrNull(criteria.getOuterCd())) {
            ttPltzDomain.setLength(convertLengthUnit(criteria.getLength(), criteria.getLengthUnit(), shipperLengthUnit, lengthMsgParams));
            ttPltzDomain.setWidth(convertLengthUnit(criteria.getWidth(), criteria.getLengthUnit(), shipperLengthUnit, widthMsgParams));
            ttPltzDomain.setHeight(convertLengthUnit(criteria.getHeight(), criteria.getLengthUnit(), shipperLengthUnit, heightMsgParams));
        } else {
            ttPltzDomain.setLength(convertLengthUnit(criteria.getLengthPalletize(), criteria.getLengthUnitPalletize(), shipperLengthUnit, lengthMsgParams));
            ttPltzDomain.setWidth(convertLengthUnit(criteria.getWidthPalletize(), criteria.getLengthUnitPalletize(), shipperLengthUnit, widthMsgParams));
            ttPltzDomain.setHeight(convertLengthUnit(criteria.getHeightPalletize(), criteria.getLengthUnitPalletize(), shipperLengthUnit, heightMsgParams));
        }
        ttPltzDomain.setVolumeUnit(shipperVolumetUnit);
        String[] volMsgParams = {getResource("label.volume")};
        if (!CheckUtil.isBlankOrNull(criteria.getOuterCd())) {
            ttPltzDomain.setVolume(convertVolumeUnit(criteria.getVolume(), criteria.getVolumeUnit(), shipperVolumetUnit, volMsgParams));
        } else {
            ttPltzDomain.setVolume(convertVolumeUnit(criteria.getVolumePalletize(), criteria.getVolumeUnitPalletize(), shipperVolumetUnit, volMsgParams));
        }
        ttPltzDomain.setCmlTyp(CML_TYPE_CIGMA);

        // Time zone converted post-date acquisition
        // タイムゾーン変換後日付取得
        String timezoneId = commonService.searchTimezone(criteria.getWs2502InternalVariableHdrDomain().getShipperCd());
        Date expPackingDt = DateUtil.convertTime(new Date(), timezoneId);
        expPackingDt = DateUtils.truncate(expPackingDt, Calendar.DAY_OF_MONTH);

        ttPltzDomain.setExpPackingDt(expPackingDt);
        ttPltzDomain.setExpPackingIssuerId(criteria.getLoginUserDscId());

        // Acquisition of a login person name
        // ログイン者名の取得
        TmUserCriteriaDomain tmUserCriteria = new TmUserCriteriaDomain();
        tmUserCriteria.setDscId(dscId);
        TmUserDomain tmUser = tmUserService.searchByKey(tmUserCriteria);

        ttPltzDomain.setExpPackingIssuerNm(tmUser.getUsrNmEn());
        ttPltzDomain.setDueDt(ttPltzItemDeliveryTime.getEtdDueDt());
        ttPltzDomain.setConsigneeCd(criteria.getWs2502InternalVariableHdrDomain().getConsigneeCompCd());
        ttPltzDomain.setCommercialFlg(FLAG_Y);
        ttPltzDomain.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttPltzDomain.setPackingWhCompCd(criteria.getWs2502InternalVariableHdrDomain().getWhCompCd());
        ttPltzDomain.setPackingWhCd(criteria.getWs2502InternalVariableHdrDomain().getWhCd());
        ttPltzDomain.setCurWhCompCd(criteria.getWs2502InternalVariableHdrDomain().getWhCompCd());
        ttPltzDomain.setCurWhCd(criteria.getWs2502InternalVariableHdrDomain().getWhCd());

        String loadingCd = new String(LOADING_CD_FREE);
        String expLimitFlg = new String(FLAG_N);
        String dngrItemFlg = new String(FLAG_N);

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2502InternalVariableDtlDomainList()){
            if (LOADING_CD_BACK.compareTo(internalVariableDtl.getLoadingCd()) == 0){
                loadingCd = LOADING_CD_BACK;
            } else if (LOADING_CD_DOOR.compareTo(internalVariableDtl.getLoadingCd()) == 0){
                loadingCd = LOADING_CD_DOOR;
            }

            if (!CheckUtil.isBlankOrNull(internalVariableDtl.getExpLimitTyp())){
                expLimitFlg = FLAG_Y;
            }
            if (FLAG_Y.equals(internalVariableDtl.getDngrItemFlg())){
                dngrItemFlg = FLAG_Y;
            }
        }
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2502InternalVariableMixItemNoDomainList()){
            if (!CheckUtil.isBlankOrNull(internalVariableDtl.getExpLimitTyp())){
                expLimitFlg = FLAG_Y;
            }
            if (FLAG_Y.equals(internalVariableDtl.getDngrItemFlg())){
                dngrItemFlg = FLAG_Y;
            }
        }
        ttPltzDomain.setLoadingCd(loadingCd);
        ttPltzDomain.setExpLimitFlg(expLimitFlg);
        ttPltzDomain.setDngrItemFlg(dngrItemFlg);
        ttPltzDomain.setLastTrStatus(CARRY_OUT_IN_BLANK);
        ttPltzDomain.setExpRequestAllCmlIssuedFlg(FLAG_N);
        ttPltzDomain.setSplitShippingNgFlg(FLAG_N);
        ttPltzDomain.setInvoiceCtgry(IVN_CATEGORY_COMMERCIAL_VALUE);
        ttPltzDomain.setReExpGoodsFlg(FLAG_N);
        ttPltzDomain.setMigrationFlg(FLAG_N);
        ttPltzDomain.setPalletCartonTyp(criteria.getWs2502InternalVariableHdrDomain().getPalletNo().substring(0, 1));
        setCommonPropertyForRegist(ttPltzDomain, dscId, criteria.getScreenId());

        ttPltzService.create(ttPltzDomain);
    }

    /**
     * Perform a PACKED-QUANTITY update process (a part for an ITEM NO).
     * <br />梱包済数量更新処理（品目番号分）を行います。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Palletize Instruction Item No cannot be accessed<br />梱包指示品目番号にアクセスできない場合
     */
    protected void updatePltzItemNoPackedQtyByItemNo(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        String dscId = criteria.getLoginUserDscId();
        String pltzInstrNo = criteria.getWs2502InternalVariableHdrDomain().getPltzInstrNo();

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2502InternalVariableDtlDomainList()){
            if (FLAG_N.compareTo(internalVariableDtl.getMixTagFlg()) == 0){
                // Palletize-Instruction-Item-No acquisition
                // 梱包指示品目番号取得
                TtPltzInstrItemNoCriteriaDomain ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
                ttPltzInstrItemNoCriteria.setPltzInstrNo(pltzInstrNo);
                ttPltzInstrItemNoCriteria.setItemNo(internalVariableDtl.getItemNo());
                ttPltzInstrItemNoCriteria.setPkgCd(internalVariableDtl.getPkgCd());

                TtPltzInstrItemNoDomain ttPltzInstrItemNo = ttPltzInstrItemNoService.searchByKey(ttPltzInstrItemNoCriteria);

                // Update of a Palletize Instruction Item No
                // 梱包指示品目番号更新
                TtPltzInstrItemNoDomain ttPltzInstrItemNoUpdate = new TtPltzInstrItemNoDomain();
                ttPltzInstrItemNoUpdate.setPackedQty(ttPltzInstrItemNo.getPackedQty().add(internalVariableDtl.getQty()));
                setCommonPropertyForUpdate(ttPltzInstrItemNoUpdate, dscId, criteria.getScreenId());

                ttPltzInstrItemNoService.updateByCondition(ttPltzInstrItemNoUpdate, ttPltzInstrItemNoCriteria);
            }
        }
    }

    /**
     * Perform a PACKED-QUANTITY update process (a part for a MIX ITEM NO).
     * <br />梱包済数量更新処理（MIX品目番号分）を行います。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Palletize Instruction Item No cannot be accessed<br />梱包指示品目番号にアクセスできない場合
     */
    protected void updatePltzItemNoPackedQtyByMixItemNo(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        String dscId = criteria.getLoginUserDscId();

        String pltzInstrNo = criteria.getWs2502InternalVariableHdrDomain().getPltzInstrNo();

        for (Ws2501InternalVariableDtlDomain internalVariableMixItemNo : criteria.getWs2502InternalVariableMixItemNoDomainList()){
            // Palletize-Instruction-Item-No acquisition
            // 梱包指示品目番号取得
            TtPltzInstrItemNoCriteriaDomain ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
            ttPltzInstrItemNoCriteria.setPltzInstrNo(pltzInstrNo);
            ttPltzInstrItemNoCriteria.setItemNo(internalVariableMixItemNo.getItemNo());
            ttPltzInstrItemNoCriteria.setPkgCd(internalVariableMixItemNo.getPkgCd());

            TtPltzInstrItemNoDomain ttPltzInstrItemNo = ttPltzInstrItemNoService.searchByKey(ttPltzInstrItemNoCriteria);

            // Update of a Palletize Instruction Item No
            // 梱包指示品目番号更新
            TtPltzInstrItemNoDomain ttPltzInstrItemNoUpdate = new TtPltzInstrItemNoDomain();
            ttPltzInstrItemNoUpdate.setPackedQty(ttPltzInstrItemNo.getPackedQty().add(internalVariableMixItemNo.getQty()));
            setCommonPropertyForUpdate(ttPltzInstrItemNoUpdate, dscId, criteria.getScreenId());

            ttPltzInstrItemNoService.updateByCondition(ttPltzInstrItemNoUpdate, ttPltzInstrItemNoCriteria);
        }
    }

    /**
     * Perform a PACKING-STATUS update process.
     * <br />梱包ステータス更新処理を行います。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Packaging Instruction (=Pull) and a Palletize Instruction Item No cannot be accessed<br />梱包指示、梱包指示品目番号にアクセスできない場合
     */
    protected void updatePltzStatus(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        // Palletize-Instruction-Item-No acquisition
        // 梱包指示品目番号取得
        TtPltzInstrItemNoCriteriaDomain ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
        ttPltzInstrItemNoCriteria.setPltzInstrNo(criteria.getWs2502InternalVariableHdrDomain().getPltzInstrNo());

        List<TtPltzInstrItemNoDomain> ttPltzInstrItemNoList = ttPltzInstrItemNoService.searchByCondition(ttPltzInstrItemNoCriteria);

        BigDecimal instrQty = BigDecimal.ZERO;
        BigDecimal packedQty = BigDecimal.ZERO;

        for (TtPltzInstrItemNoDomain ttPltzInstrItemNo : ttPltzInstrItemNoList){
            instrQty = instrQty.add(ttPltzInstrItemNo.getInstrQty());
            packedQty = packedQty.add(ttPltzInstrItemNo.getPackedQty());
        }

        // Update of a Packaging Instruction (=Pull)
        // 梱包指示更新
        TtPltzInstrDomain ttPltzInstr = new TtPltzInstrDomain();
        if (instrQty.compareTo(packedQty) == 0){
            ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_CREATE);
        } else {
            ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE);
        }

        TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
        ttPltzInstrCriteria.setPltzInstrNo(criteria.getWs2502InternalVariableHdrDomain().getPltzInstrNo());
        setCommonPropertyForUpdate(ttPltzInstr, criteria.getLoginUserDscId(), criteria.getScreenId());

        ttPltzInstrService.updateByCondition(ttPltzInstr, ttPltzInstrCriteria);
    }

    /**
     * Perform a MULTI-ITEM-NO-IN-BOX-STATUS update process.
     * <br />小箱内多品ステータス更新処理を行います。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Mix Tag cannot be accessed<br />MIXED現品票にアクセスできない場合
     */
    protected void updateWs2502MixTagStatus(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        TtMixtagDomain ttMixtag = new TtMixtagDomain();
        ttMixtag.setMixTagStatus(MIX_TAG_STATUS_CML);
        setCommonPropertyForUpdate(ttMixtag, criteria.getLoginUserDscId(), criteria.getScreenId());

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2502InternalVariableDtlDomainList()){
            if (FLAG_Y.compareTo(internalVariableDtl.getMixTagFlg()) == 0){
                TtMixtagCriteriaDomain ttMixtagCriteria = new TtMixtagCriteriaDomain();
                ttMixtagCriteria.setMixTagNo(internalVariableDtl.getItemNo());
                ttMixtagService.updateByCondition(ttMixtag, ttMixtagCriteria);
            }
        }
    }

    /**
     * Register a BHT productivity data information.
     * <br />BHT生産性データ情報を登録します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a BHT Work Time, a BHT Work Time For Palletize, and a BHT Work Error cannot be accessed
     *                              <br />BHT作業時間、BHT作業情報テーブル(パレタイズ)、BHT作業エラーにアクセスできない場合
     */
    protected void createWs2502BhtInfo(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        String dscId = criteria.getLoginUserDscId();

        // Acquisition of user's information
        // ユーザー情報の取得
        TmUserConfCriteriaDomain tmUserConfCriteria  = new TmUserConfCriteriaDomain();
        tmUserConfCriteria.setDscId(dscId);
        TmUserConfDomain tmUserConf = tmUserConfService.searchByKey(tmUserConfCriteria);

        //  -------------------------------------------------------------------

        // Registration of BHT-Work-Time table
        // BHT作業時間テーブルの登録
        BigDecimal workTimeNo = wsBhtEisProductDao.searchNextWorkTimeNo();
        Date workTimeStrt = parseDate(criteria.getWorkTimeStrt());
        Date workTimeEnd  = parseDate(criteria.getWorkTimeEnd());
        BigDecimal errCnt = new BigDecimal(criteria.getWs2502ProductivityDataInfoList().size());

        TtBhtWorkTimeDomain ttBhtWorkTime = new TtBhtWorkTimeDomain();
        ttBhtWorkTime.setWorkTimeNo(workTimeNo);
        ttBhtWorkTime.setCompCd(tmUserConf.getCompCd());
        ttBhtWorkTime.setDscId(dscId);
        ttBhtWorkTime.setShipperCd(criteria.getWs2502InternalVariableHdrDomain().getShipperCd());
        ttBhtWorkTime.setWhCompCd(criteria.getWs2502InternalVariableHdrDomain().getWhCompCd());
        ttBhtWorkTime.setWhCd(criteria.getWs2502InternalVariableHdrDomain().getWhCd());
        ttBhtWorkTime.setWorkTyp(WORK_TYP_CML_CIGMA);
        ttBhtWorkTime.setWorkTimeStrt(workTimeStrt);
        ttBhtWorkTime.setWorkTimeEnd(workTimeEnd);
        ttBhtWorkTime.setWorkTime(duration(workTimeStrt, workTimeEnd));
        ttBhtWorkTime.setResultKey(mainMark);
        ttBhtWorkTime.setErrCnt(errCnt);
        setCommonPropertyForRegist(ttBhtWorkTime, dscId, criteria.getScreenId());

        ttBhtWorkTimeService.create(ttBhtWorkTime);

        //  -------------------------------------------------------------------

        // Registration of BHT Work Time For Palletize
        // BHT作業情報テーブル(パレタイズ)の登録
        TtBhtWorkPltzDomain ttBhtWorkPltz = new TtBhtWorkPltzDomain();
        ttBhtWorkPltz.setWorkTimeNo(workTimeNo);
        ttBhtWorkPltz.setPkgFormTyp(criteria.getWs2502InternalVariableDtlDomainList().get(0).getPkgFormTyp());
        ttBhtWorkPltz.setPltzTagQty(new BigDecimal(criteria.getWs2502ItemNoList().size()));
        setCommonPropertyForRegist(ttBhtWorkPltz, dscId, criteria.getScreenId());

        ttBhtWorkPltzService.create(ttBhtWorkPltz);

        //  -------------------------------------------------------------------

        // Registration of BHT-Work-Error table
        // BHT作業エラーテーブルの登録
        BigDecimal brch = BigDecimal.ONE;

        for (Ws2501ProductivityDataInfoDomain productivityDataInfo : criteria.getWs2502ProductivityDataInfoList()) {

            workTimeStrt = parseDate(productivityDataInfo.getWorkTimeStrt());
            workTimeEnd  = parseDate(productivityDataInfo.getWorkTimeEnd());

            TtBhtWorkErrDomain ttBhtWorkErr = new TtBhtWorkErrDomain();
            ttBhtWorkErr.setWorkTimeNo(workTimeNo);
            ttBhtWorkErr.setBrch(brch);
            ttBhtWorkErr.setScreenId(productivityDataInfo.getScreenId());
            ttBhtWorkErr.setMsgId(productivityDataInfo.getMsgId());
            ttBhtWorkErr.setLockFlg(productivityDataInfo.getLockFlg());
            ttBhtWorkErr.setWorkTimeStrt(workTimeStrt);
            ttBhtWorkErr.setWorkTimeEnd(workTimeEnd);
            ttBhtWorkErr.setWorkTime(duration(workTimeStrt, workTimeEnd));

            setCommonPropertyForRegist(ttBhtWorkErr, dscId, criteria.getScreenId());

            ttBhtWorkErrService.create(ttBhtWorkErr);
            brch = brch.add(BigDecimal.ONE);
        }
    }

    /**
     * Acquire the packed up data for responses.
     * <br />レスポンス用梱包済みデータを取得します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @param wsBhtEisProduct Eis Product domain  * For return VALUEs<br />Eis Productドメイン ※戻り値用
     * @throws ApplicationException When a Palletize, a Palletize Item, a Palletize Item KANBAN, and a Mix Tag cannot be accessed
     *                              <br />パレタイズ、パレタイズ対象品、パレタイズ対象品かんばん情報、MIXED現品票にアクセスできない場合
     */
    protected void searchPackedList(WsBhtEisProductCriteriaDomain criteria, WsBhtEisProductDomain wsBhtEisProduct)
        throws ApplicationException {

        String pltzInstrNo = criteria.getWs2502InternalVariableHdrDomain().getPltzInstrNo();

        // Acquisition of a MAIN-MARK list
        // メインマークリストの取得
        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
        ttPltzCriteria.setPltzInstrNo(pltzInstrNo);
        ttPltzCriteria.setPreferredOrder("MAIN_MARK desc");

        List<TtPltzDomain> ttPltzList = ttPltzService.searchByCondition(ttPltzCriteria);

        // Acquisition of KANBAN list
        // かんばんリストの取得
        Ws2501TtPltzItemByKanbanCriteriaDomain ttPltzItemByKanbanCriteria = new Ws2501TtPltzItemByKanbanCriteriaDomain();
        ttPltzItemByKanbanCriteria.setPltzInstrNo(pltzInstrNo);

        List<? extends Ws2501TtPltzItemByKanbanDomain> ttPltzItemByKanbanList
            = wsBhtEisProductDao.searchTtPltzItemByKanban(ttPltzItemByKanbanCriteria);

        // Acquisition of a MIX tag list
        // MIXタグリストの取得
        List<String> mixTagList = new ArrayList<String>();
        for (TtMixtagDomain mixTag : searchMixTagList(pltzInstrNo, MIX_TAG_STATUS_CML)){
            mixTagList.add(mixTag.getMixTagNo());
        }

        wsBhtEisProduct.setWs2502TtPltzList(ttPltzList);
        wsBhtEisProduct.setWs2502TtPltzItemByKanbanList(ttPltzItemByKanbanList);
        wsBhtEisProduct.setWs2502MixTagList(mixTagList);

    }

    /**
     * Acquire the unpacked up data for responses.
     * <br />レスポンス用未梱包データを取得します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @param wsBhtEisProduct Eis Product domain<br />Eis Productドメイン
     * @throws ApplicationException When a Palletize Instruction Item No, a Mix Tag, and a MIXED ITEM NO cannot be accessed
     *                              <br />梱包指示品目番号、MIXED現品票、MIXED品目番号にアクセスできない場合
     */
    protected void searchUnPackedList(WsBhtEisProductCriteriaDomain criteria, WsBhtEisProductDomain wsBhtEisProduct)
        throws ApplicationException {

        String pltzInstrNo = criteria.getWs2502InternalVariableHdrDomain().getPltzInstrNo();

        // Acquisition of an unpacked up ITEM-NO list
        // 未梱包品目番号リストの取得
        Ws2501UnpackagedItemNoCriteriaDomain unpackagedItemNoCriteria = new Ws2501UnpackagedItemNoCriteriaDomain();
        unpackagedItemNoCriteria.setPltzInstrNo(pltzInstrNo);

        List<? extends Ws2501UnpackagedItemNoDomain> unpackagedItemNoList = wsBhtEisProductDao.searchUnpackagedItemNo(unpackagedItemNoCriteria);

        // Acquisition of an unpacked up MIX tag list
        // 未梱包MIXタグリストの取得
        List<String> mixTagNoPltzList =  new ArrayList<String>();
        for (TtMixtagDomain mixTag : searchMixTagList(pltzInstrNo, MIX_TAG_STATUS_MIXTAG)){
            mixTagNoPltzList.add(mixTag.getMixTagNo());
        }

        wsBhtEisProduct.setWs2502UnpackagedItemNoList(unpackagedItemNoList);
        wsBhtEisProduct.setWs2502UnpackagedMixTagList(mixTagNoPltzList);
    }

    /**
     * Search a MIX tag list.
     * <br />MIXタグリストを検索する。
     *
     * @param pltzInstrNo Palletize Instr. No.<br />梱包指示No
     * @param mixTagStatus MULTI ITEM NO IN BOX STATUS<br />小箱内多品ステータス
     * @return MIX tag list<br />MIXタグリスト
     * @throws ApplicationException When an error occurs at the time of a search of a MIX tag list<br />MIXタグリストの検索時にエラーが発生した場合
     */
    protected List<TtMixtagDomain> searchMixTagList(String pltzInstrNo, String mixTagStatus) throws ApplicationException {
        TtMixtagCriteriaDomain ttMixtagCriteria = new TtMixtagCriteriaDomain();
        ttMixtagCriteria.setPltzInstrNo(pltzInstrNo);
        ttMixtagCriteria.setMixTagStatus(mixTagStatus);
        ttMixtagCriteria.setPreferredOrder("MIX_TAG_NO asc");
        return ttMixtagService.searchByCondition(ttMixtagCriteria);
    }

    // --------------------------------- ECA0027_WS_2503_Create Non Inst Palletize ---------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateConsistencyItemList(java.util.List)
     */
    public boolean validateConsistencyItemList(List<? extends Ws2501ItemNoDomain> itemNoList) {

        for (Ws2501ItemNoDomain itemNoItem : itemNoList){
            String mixTagFlg = itemNoItem.getMixTagFlg();
            String itemNo = itemNoItem.getItemNo();
            String pkgCd = itemNoItem.getPkgCd();
            String indusTypCd = itemNoItem.getIndusTypCd();
            String kanbanTyp = itemNoItem.getKanbanTyp();
            BigDecimal tagSeqNo = itemNoItem.getTagSeqNo();
            BigDecimal kanbanQty = itemNoItem.getKanbanQty();

            if (CheckUtil.isBlankOrNull(mixTagFlg)){
                return false;
            }

            if (FLAG_N.equals(mixTagFlg)){
                if (CheckUtil.isBlankOrNull(itemNo) || CheckUtil.isBlankOrNull(pkgCd) || CheckUtil.isBlankOrNull(indusTypCd) || CheckUtil.isBlankOrNull(kanbanTyp) || tagSeqNo == null || kanbanQty == null){
                    return false;
                }
            }

            if (FLAG_Y.equals(mixTagFlg)){
                if (CheckUtil.isBlankOrNull(itemNo)){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateConsistencyStock(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyStock(String nexusWhFlg, String whCompCd, String whCd, String plntCd, String lgcyWhCd) {

        if (CheckUtil.isBlankOrNull(nexusWhFlg)){
            return false;
        }

        if (FLAG_Y.equals(nexusWhFlg)){
            if (CheckUtil.isBlankOrNull(whCompCd) || CheckUtil.isBlankOrNull(whCd)){
                return false;
            }
        }
        if (FLAG_N.equals(nexusWhFlg)){
            if (CheckUtil.isBlankOrNull(plntCd) || CheckUtil.isBlankOrNull(lgcyWhCd)){
                return false;
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmPkgMaterialsOnNonInstrPltz(java.lang.String[], java.util.List, java.util.List)
     */
    public boolean validateDatabaseTmPkgMaterialsOnNonInstrPltz(String[] shipperCd, List<String> pkgItemNoList, List<String> pkgItemNoErrList)
        throws ApplicationException {

        return validateDatabaseTmPkgMaterials(shipperCd, pkgItemNoList, pkgItemNoErrList);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmPkgSetDtlOnNonInstrPltz(java.lang.String, java.lang.String, java.lang.String[], java.lang.String[], com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain)
     */
    public String validateDatabaseTmPkgSetDtlOnNonInstrPltz(String pltzInstrNo, String outerCd, String[] shipperCd, String[] trnsCd, TmPkgSetHdrDomain tmPkgSetHdr)
        throws ApplicationException {

        return validateDatabaseTmPkgSetDtl(pltzInstrNo, outerCd, shipperCd, trnsCd, tmPkgSetHdr);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmPkgSpecificationDtOnNonInstrPltz(String[], List, String[], Ws2501PkgSpecDomain)
     */
    public Map<String, List<String>> validateDatabaseTmPkgSpecificationDtOnNonInstrPltz(String[] shipperCd, List<? extends Ws2501ItemNoDomain> itemNoList, String[] trnsCd, Ws2501PkgSpecDomain singlePkgSpec)
        throws ApplicationException {

        return validateDatabaseTmPkgSpecificationDt(shipperCd, itemNoList, trnsCd, singlePkgSpec);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmCigmaCustomerXrefOnNonInstrPltz(java.lang.String, java.lang.String, java.lang.String[])
     */
    public boolean validateDatabaseTmCigmaCustomerXrefOnNonInstrPltz(String lgcyLibCompCd, String customerCd, String[] compCd)
        throws ApplicationException {

        // Acquisition of CIGMA Customer Cross Reference Master
        // NEXUS荷受人クロスリファレンス原単位の取得
        TmCigmaCustomerXrefCriteriaDomain tmCigmaCustomerXrefCriteriaDomain
            = new TmCigmaCustomerXrefCriteriaDomain();
        tmCigmaCustomerXrefCriteriaDomain.setLgcyLibCompCd(lgcyLibCompCd);
        tmCigmaCustomerXrefCriteriaDomain.setCustomerCd(customerCd);
        tmCigmaCustomerXrefCriteriaDomain.setCompCd(compCd[0]);
        TmCigmaCustomerXrefDomain tmCigmaCustomerXrefDomain
            = tmCigmaCustomerXrefService.searchByKey(tmCigmaCustomerXrefCriteriaDomain);

        // In the case of 0 affair
        // 0件の場合
        if (tmCigmaCustomerXrefDomain == null) {
            return false;
        }

        compCd[0] = tmCigmaCustomerXrefDomain.getCompCd();
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmCigmaShipToXrefOnNonInstrPltz(java.lang.String, java.lang.String, java.lang.String, java.lang.String[])
     */
    public boolean validateDatabaseTmCigmaShipToXrefOnNonInstrPltz(String lgcyLibCompCd, String customerCd, String lgcyShipToCd, String[] shipToCd)
        throws ApplicationException {

        // Acquisition of CIGMA Ship To Cross Reference Master
        // NEXUS送荷先クロスリファレンス原単位の取得
        TmCigmaShipToXrefCriteriaDomain tmCigmaShipToXrefCriteriaDomain
            = new TmCigmaShipToXrefCriteriaDomain();
        tmCigmaShipToXrefCriteriaDomain.setLgcyLibCompCd(lgcyLibCompCd);
        tmCigmaShipToXrefCriteriaDomain.setCustomerCd(customerCd);
        tmCigmaShipToXrefCriteriaDomain.setLgcyShipTo(lgcyShipToCd);
        TmCigmaShipToXrefDomain tmCigmaShipToXrefDomain
            = tmCigmaShipToXrefService.searchByKey(tmCigmaShipToXrefCriteriaDomain);

        // In the case of 0 affair
        // 0件の場合
        if (tmCigmaShipToXrefDomain == null) {
            return false;
        }

        shipToCd[0] = tmCigmaShipToXrefDomain.getShipToCd();
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmCigmaWhXrefOnNonInstrPltz(java.lang.String, java.lang.String, java.lang.String, java.lang.String[], java.lang.String[])
     */
    public boolean validateDatabaseTmCigmaWhXrefOnNonInstrPltz(String lgcyLibCompCd, String lgcyWhCd, String plantCd, String[] compCd, String[] whCd)
        throws ApplicationException {

        // Acquisition of CIGMA Warehouse Cross Reference Master
        // 倉庫クロスリファレンス原単位の取得
        TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteriaDomain
            = new TmCigmaWhXrefCriteriaDomain();
        tmCigmaWhXrefCriteriaDomain.setLgcyLibCompCd(lgcyLibCompCd);
        tmCigmaWhXrefCriteriaDomain.setLgcyWhCd(lgcyWhCd);
        tmCigmaWhXrefCriteriaDomain.setPlntCd(plantCd);
        TmCigmaWhXrefDomain tmCigmaWhXrefDomain
            = tmCigmaWhXrefService.searchByKey(tmCigmaWhXrefCriteriaDomain);

        // In the case of 0 affair
        // 0件の場合
        if (tmCigmaWhXrefDomain == null) {
            return false;
        }

        compCd[0] = tmCigmaWhXrefDomain.getCompCd();
        whCd[0] = tmCigmaWhXrefDomain.getWhCd();
        return true;
    }
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmNxsWhOnNonInstrPltz(java.lang.String, java.lang.String, java.lang.String, java.lang.String[])
     */

    public boolean validateDatabaseTmNxsWhOnNonInstrPltz(String compCd, String whCd, String lgcyLibCompCd, String[] lgcyWhCd)
        throws ApplicationException {

        // Acquisition of NEXUS Warehouse Master, and a CIGMA Warehouse Cross Reference Master
        // 倉庫原単位、倉庫クロスリファレンス原単位の取得
        Ws2501TmNxsWhByXrefCriteriaDomain tmNxsWhByXrefCriteriaDomain
            = new Ws2501TmNxsWhByXrefCriteriaDomain();
        tmNxsWhByXrefCriteriaDomain.setCompCd(compCd);
        tmNxsWhByXrefCriteriaDomain.setWhCd(whCd);
        tmNxsWhByXrefCriteriaDomain.setLgcyLibCompCd(lgcyLibCompCd);
        List<? extends Ws2501TmNxsWhByXrefDomain> tmNxsWhByXrefDomainList
            = wsBhtEisProductDao.searchTmNxsWhByXref(tmNxsWhByXrefCriteriaDomain);

        // In the case of 0 affair
        // 0件の場合
        if (tmNxsWhByXrefDomainList.isEmpty()) {
            return false;
        }

        lgcyWhCd[0] = tmNxsWhByXrefDomainList.get(0).getLgcyWhCd();
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTtCmlErrorHeaderOnNonInstrPltz(String, WsBhtEisProductCriteriaDomain, List)
     */
    public Timestamp validateDatabaseTtCmlErrorHeaderOnNonInstrPltz(String screenId, WsBhtEisProductCriteriaDomain wsBhtEisProductCriteria, List<String> errChkList)
        throws ApplicationException {

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        CommonUtil.copyPropertiesDomainToDomain(ttCmlErrorHeader, wsBhtEisProductCriteria);

        // DSC-ID
        String dscId = wsBhtEisProductCriteria.getLoginUserDscId();
        ttCmlErrorHeader.setDscId(dscId);

        // EXPORT PACKING ISSUER NAME
        // 輸出梱包者名
        TmUserCriteriaDomain tmUserCriteria = new TmUserCriteriaDomain();
        tmUserCriteria.setDscId(dscId);
        TmUserDomain tmUser = tmUserService.searchByKey(tmUserCriteria);

        ttCmlErrorHeader.setExpPackingIssuerNm(tmUser.getUsrNmEn());

        // ERROR CREATE TIMESTAMP
        // エラーレポート作成日時
        ttCmlErrorHeader.setErrCreateTimestamp(new Timestamp(new Date().getTime()));

        // A - a CHECK RESULT D
        // A～Dチェック結果

        if (errChkList.contains("CHK_RESULT_A")) {
            ttCmlErrorHeader.setChkResultA(NG);
        }

        if (errChkList.contains("CHK_RESULT_B")) {
            ttCmlErrorHeader.setChkResultB(NG);
        }

        if (errChkList.contains("CHK_RESULT_C")) {
            ttCmlErrorHeader.setChkResultC(NG);
        }

        if (errChkList.contains("CHK_RESULT_D")) {
            ttCmlErrorHeader.setChkResultD(NG);
        }

        // Common items
        // 共通項目
        setCommonPropertyForRegist(ttCmlErrorHeader, dscId, screenId);

        // CML-Error-Report-Header registration
        // CMLエラーレポートヘッダ登録
        ttCmlErrorHeaderService.create(ttCmlErrorHeader);
        
        return ttCmlErrorHeader.getErrCreateTimestamp();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#transactOnNonInstPltz(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)
     */
    public WsBhtEisProductDomain transactOnNonInstPltz(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        WsBhtEisProductDomain wsBhtEisProduct = new WsBhtEisProductDomain();

        Timestamp[] errCreateTimestamp = new Timestamp[1];

        // Setting of an internal variable (header)
        // 内部変数（ヘッダ）の設定
        searchWs2503HeaderData(criteria);

        // Setting of an internal variable (details)
        // 内部変数（明細）の設定
        searchWs2503DetailData(criteria);

        // Setting of an internal variable (MIX ITEM NO)
        // 内部変数（MIX品目番号）の設定
        searchWs2503MixItemInfo(criteria);

        // input check
        // 入力チェック
        if (!chkInputData(criteria, errCreateTimestamp)){
            wsBhtEisProduct.setResultCd(WS_RESULT_ERROR_ERR_REPORT_OUT);
            wsBhtEisProduct.setErrCreateTimestamp(errCreateTimestamp[0].toString());
            return wsBhtEisProduct;
        }

        // Exterior sign check
        // 外装記号チェック
        if (!chkWs2503OuterPkgCd(criteria)){
            wsBhtEisProduct.setResultCd(WS_RESULT_ERROR_SYSTEM_JOB);
            return wsBhtEisProduct;
        }

        // Acquisition of a print-copies information
        // 印刷部数情報の取得
        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2503InternalVariableHdrDomain();
        TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteria.setCompCd(internalVariableHdr.getShipperCd());
        TmNxsCompDomain tmNxsComp = this.tmNxsCompService.searchByKey(tmNxsCompCriteria);
        
        if (tmNxsComp == null) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            Object[] params = {internalVariableHdr.getShipperCd()};
            errorList.add(new MessageDomain("", NXS_E1_5007, params));
            throw new ValidationException(errorList);
        }
        criteria.getWs2503InternalVariableHdrDomain().setCmlPrintNum(tmNxsComp.getCmlPrintNum().intValue());
        
        // Acquisition of Main Mark
        // Main Markの取得
        String mainMark = createMainMark(internalVariableHdr.getShipperCd(), internalVariableHdr.getWhCd(), criteria.getScreenId());

        criteria.setRtUseFlg(FLAG_N);

        // Firm-order-receipt alloc processing
        // 確定受注引当処理
        allocWs2503Qty(mainMark, criteria);

        // Palletize Item Receive Order is registered.
        // パレタイズ対象品受注情報を登録
        createPltzItemOdrByMixTagOdr(mainMark, criteria);

        // Palletize-Item data (ITEM NO) is registered.
        // パレタイズ対象品データ（品目番号）を登録
        createWs2503PltzItem(mainMark, criteria);

        // Palletize-Item data (packing) is registered.
        // パレタイズ対象品データ（包装）を登録
        createWs2503PltzItemPkg(mainMark, criteria);

        // Palletize-Item-KANBAN data is registered.
        // パレタイズ対象品かんばん情報データを登録
        createWs2503Kanban(mainMark, criteria);

        // Palletize-Item-KANBAN data is registered(For Asia).
        // パレタイズ対象品かんばん情報データを登録(For Asia)
        createWs2503KanbanExtra(mainMark, criteria);

        // Palletize data is registered.
        // パレタイズデータを登録
        createWs2503Pltz(mainMark, criteria);

        // Mix-Tag information update processing
        // MIXED現品票情報更新処理
        updateWs2503MixTagStatus(criteria);

        // A Temp Stock is updated and registered.
        // 仮在庫を更新・登録
        transactTmpStk(criteria);

        // Registration of ordering alloc track record (starting of Web service)
        // 受注引当実績の登録（Webサービスの起動）
        createRcvOdrAlloc(criteria);

        // A BHT productivity data information is registered.
        // BHT生産性データ情報を登録
        createWs2503BhtInfo(mainMark, criteria);

        // Setting of a returned value
        // 返却値の設定
        wsBhtEisProduct.setResultCd(WS_RESULT_SUCCESS);
        wsBhtEisProduct.setMainMark(mainMark);
        wsBhtEisProduct.setWs2503InternalVariableHdrDomain(criteria.getWs2503InternalVariableHdrDomain());
        wsBhtEisProduct.setWs2503InternalVariableDtlDomainList(criteria.getWs2503InternalVariableDtlDomainList());

        return wsBhtEisProduct;
    }

    /**
     * Set up an internal variable (header).
     * <br />内部変数（ヘッダ）を設定します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     */
    protected void searchWs2503HeaderData(WsBhtEisProductCriteriaDomain criteria){
        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        internalVariableHdr.setShipperCd(criteria.getShipperCd());
        internalVariableHdr.setCustomerCd(criteria.getCustomerCd());
        internalVariableHdr.setLgcyShipTo(criteria.getLgcyShipTo());
        internalVariableHdr.setTrnsCd(criteria.getTrnsCd());
        internalVariableHdr.setPalletNo(criteria.getPalletNo());
        //internalVariableHdr.setOuterCd(criteria.getOuterCd());
        internalVariableHdr.setOuterPkgCd(criteria.getOuterCd());
        internalVariableHdr.setNexusWhFlg(criteria.getNexusWhFlg());
        internalVariableHdr.setPlntCd(criteria.getPlntCd());

        if (FLAG_Y.equals(criteria.getNexusWhFlg())){
            internalVariableHdr.setLgcyWhCd(criteria.getWkLgcyWhCd());
            internalVariableHdr.setWhCompCd(criteria.getWhCompCd());
            internalVariableHdr.setWhCd(criteria.getWhCd());

        } else {
            internalVariableHdr.setLgcyWhCd(criteria.getLgcyWhCd());
            internalVariableHdr.setWhCompCd(criteria.getWkWhCompCd());
            internalVariableHdr.setWhCd(criteria.getWkWhCd());
        }

        internalVariableHdr.setShipToCd(criteria.getWkShipToCd());
        internalVariableHdr.setConsigneeCompCd(criteria.getWkConsigneeCompCd());

        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
    }

    /**
     * Set up an internal variable (details).
     * <br />内部変数（明細）を設定します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When it becomes an error by the Web service which cannot access a database and which cannot acquire a lock
     *                              <br />データベースにアクセスできない、ロックが取得できない、Webサービスでエラーになった場合
     */
    protected void searchWs2503DetailData(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        // Internal variable (details) initial setting
        // 内部変数（明細）初期設定
        initWs2503InternalVariableDtl(criteria);

        // Lock of data
        // データのロック
        lockData(criteria);

        // Acquisition of an ITEM-NO information (NEXUS side information)
        // 品目番号情報の取得（NEXUS側情報）
        searchWs2503NexusInfo(criteria);

        // Acquisition of an ITEM-NO information (CIGMA side information)
        // 品目番号情報の取得（CIGMA側情報)
        searchWs2503CigmaInfo(criteria);

        // Acquisition of a MIXE thing vote information
        // MIXE現品票情報の取得
        searchWs2503MixInfo(criteria);
    }

    /**
     * Initial setting of an internal variable (details)
     * <br />内部変数（明細）の初期設定
     *
     * @param criteria BIS Product domain<br />BIS Product ドメイン
     */
    protected void initWs2503InternalVariableDtl(WsBhtEisProductCriteriaDomain criteria) {

        List<Ws2501InternalVariableDtlDomain> internalVariableDtlList = new ArrayList<Ws2501InternalVariableDtlDomain>();

        BigDecimal maxSeq = initInternalVariableDtl(criteria.getWs2503ItemNoList() , internalVariableDtlList);

        criteria.setWs2503InternalVariableDtlDomainList(internalVariableDtlList);
        criteria.setMaxSeq(maxSeq);
    }

    /**
     * Lock an ordering information and a Mix Tag.
     * <br />受注情報、MIXED現品票をロックします。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When an ordering information and a Mix Tag cannot be locked<br />受注情報、MIXED現品票をロックできない場合
     */
    protected void lockData(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2503InternalVariableHdrDomain();

        Ws2501TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new Ws2501TtExpRcvOdrCriteriaDomain();
        ttExpRcvOdrCriteria.setRcvOdrCompCd(internalVariableHdr.getShipperCd());
        ttExpRcvOdrCriteria.setCustomerCd(internalVariableHdr.getCustomerCd());
        ttExpRcvOdrCriteria.setLgcyShipTo(internalVariableHdr.getLgcyShipTo());
        ttExpRcvOdrCriteria.setTrnsCd(internalVariableHdr.getTrnsCd());

        List<Ws2501TtExpRcvOdrDomain> ttExpRcvOdrListAdd = new ArrayList<Ws2501TtExpRcvOdrDomain>();
        List<String> errOdrList = new ArrayList<String>();
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()){
            List<Map<String, String>> itemNoPkgCdList = new ArrayList<Map<String, String>>();
            if (FLAG_N.compareTo(internalVariableDtl.getMixTagFlg()) == 0){
                Map<String, String> itemNoPkgCdMap = new HashMap<String, String>();
                itemNoPkgCdMap.put("itemNo", internalVariableDtl.getItemNo());
                itemNoPkgCdMap.put("pkgCd", internalVariableDtl.getPkgCd());
                itemNoPkgCdList.add(itemNoPkgCdMap);
            }
            if (!itemNoPkgCdList.isEmpty()) {
                ttExpRcvOdrCriteria.setItemNoPkgCdList(itemNoPkgCdList);

                List<? extends Ws2501TtExpRcvOdrDomain> ttExpRcvOdrList = wsBhtEisProductDao.lockByKeyNoWaitTtExpRcvOdr(ttExpRcvOdrCriteria);
                if(ttExpRcvOdrList.isEmpty()) {
                    errOdrList.add(internalVariableDtl.getItemNo() + "," + internalVariableDtl.getPkgCd());
                } else {
                    ttExpRcvOdrListAdd.add(ttExpRcvOdrList.get(0));
                }
            }
        }
        criteria.setWs2503TtExpRcvOdrList(ttExpRcvOdrListAdd);
        criteria.setErrOdrList(errOdrList);

        // The lock of Mix Tag
        // MIXED現品票のロック
        TtMixtagCriteriaDomain ttMixTagCriteria = new TtMixtagCriteriaDomain();
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()){

            if (!FLAG_Y.equals(internalVariableDtl.getMixTagFlg())) {
                continue;
            }

            ttMixTagCriteria.setMixTagNo(internalVariableDtl.getItemNo());
            assertNotEmpty(ttMixtagService.lockByKeyNoWait(ttMixTagCriteria), NXS_E1_5069);
        }
    }
    /**
     * Acquire an ITEM-NO information (NEXUS side information).
     * <br />品目番号情報を取得（NEXUS側情報）します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When an Export Receive Order etc. cannot be referred to<br />輸出受注等が参照できない場合
     */
    protected void searchWs2503NexusInfo(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2503InternalVariableHdrDomain();

        String shipperCd = internalVariableHdr.getShipperCd();
        String customerCd = internalVariableHdr.getCustomerCd();
        String lgcyShipTo = internalVariableHdr.getLgcyShipTo();
        String trnsCd = internalVariableHdr.getTrnsCd();
        Date aplyStrtDt = DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd));
        String lgcyWhCd = internalVariableHdr.getLgcyWhCd();
        List<String> errOdrList = criteria.getErrOdrList();

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()){
            if (FLAG_N.compareTo(internalVariableDtl.getMixTagFlg()) == 0){
                // Acquisition of an ITEM-NO information
                // 品目番号情報の取得
                Ws2501ItemNoNxsNonInstCriteriaDomain itemNoNxsNonInstCriteria = new Ws2501ItemNoNxsNonInstCriteriaDomain();
                itemNoNxsNonInstCriteria.setRcvOdrCompCd(shipperCd);
                itemNoNxsNonInstCriteria.setItemNo(internalVariableDtl.getItemNo());
                itemNoNxsNonInstCriteria.setPkgCd(internalVariableDtl.getPkgCd());
                itemNoNxsNonInstCriteria.setCustomerCd(customerCd);
                itemNoNxsNonInstCriteria.setLgcyShipTo(lgcyShipTo);
                itemNoNxsNonInstCriteria.setTrnsCd(trnsCd);
                itemNoNxsNonInstCriteria.setAplyStrtDt(aplyStrtDt);
                itemNoNxsNonInstCriteria.setLgcyWhCd(lgcyWhCd);

                // Order check
                // 受注チェック
                boolean errOdrFlg = false;
                if(!errOdrList.isEmpty()) {
                    for(int i = 0; i < errOdrList.size(); i++) {
                        String errOdr = errOdrList.get(i);
                        String[] errItem = errOdr.split(",");
                        String itemNo = errItem[0];
                        String pkgCd = errItem[1];
                        if(itemNo.equals(internalVariableDtl.getItemNo()) && pkgCd.equals(internalVariableDtl.getPkgCd())) {
                            errOdrFlg = true;
                        }
                    }
                }
                
                Ws2501ItemNoNxsNonInstDomain itemNoNxsNonInst = new Ws2501ItemNoNxsNonInstDomain();
                if(!errOdrFlg) {
                    itemNoNxsNonInst = wsBhtEisProductDao.searchItemNoNxsNonInst(itemNoNxsNonInstCriteria);
                } else {
                    itemNoNxsNonInst = wsBhtEisProductDao.searchItemNoNxsNonInstErrOdr(itemNoNxsNonInstCriteria);
                    itemNoNxsNonInst.setOrderQty(ZERO);
                }
                
                // Setting of an internal variable (details)
                // 内部変数（明細）の設定
                internalVariableDtl.setOdrQty(itemNoNxsNonInst.getOrderQty());
                internalVariableDtl.setContainerSortingKey(itemNoNxsNonInst.getContainerSortingKey());
                internalVariableDtl.setLoadingCd(itemNoNxsNonInst.getLoadingCd());
                internalVariableDtl.setInvoiceKey(itemNoNxsNonInst.getInvoiceKey());
                internalVariableDtl.setStgInstrItemFlg(itemNoNxsNonInst.getStgInstrItemFlg());
                internalVariableDtl.setCustomTimingTyp(itemNoNxsNonInst.getCustomTimingTyp());
                internalVariableDtl.setContainerLooseTyp(itemNoNxsNonInst.getContainerLooseTyp());
                internalVariableDtl.setItemDescription(itemNoNxsNonInst.getItemDescription());
                internalVariableDtl.setExpLimitTyp(itemNoNxsNonInst.getExpLimitTyp());
                internalVariableDtl.setDngrItemFlg(itemNoNxsNonInst.getDngrItemFlg());
                internalVariableDtl.setOriginCntryCd(itemNoNxsNonInst.getOriginCntryCd());
                internalVariableDtl.setTmpStockQty(itemNoNxsNonInst.getTmpStockQty());
                internalVariableDtl.setWeightUnit(itemNoNxsNonInst.getWeightUnit());
                internalVariableDtl.setItemWeight(itemNoNxsNonInst.getNetWeightA());
                internalVariableDtl.setPkgFormTyp(itemNoNxsNonInst.getPkgFormTyp());
                internalVariableDtl.setLotSize(itemNoNxsNonInst.getLotSize());
                internalVariableDtl.setDataGetFlg(FLAG_Y);
            }
        }
    }
    /**
     * Acquire an ITEM-NO information (CIGMA side information).
     * <br />品目番号情報を取得（CIGMA側情報)します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When an error cannot refer to generating, a CIGMA Warehouse Cross Reference Master, and a Measure Unit Master by Web service
     *                              <br />Webサービスでエラーが発生、倉庫クロスリファレンス原単位、計量単位原単位が参照できない場合
     */
    protected void searchWs2503CigmaInfo(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        List<Ws2501InternalVariableDtlDomain> internalVariableDtlList = new ArrayList<Ws2501InternalVariableDtlDomain>();

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()) {
            if (FLAG_N.equals(internalVariableDtl.getMixTagFlg())){
                internalVariableDtlList.add(internalVariableDtl);
            }
        }

        // *In a internal variable (details), a MIX TAG FLAG does not carry out, when the data of "N" does not exist.
        // ※内部変数（明細）の中にMIXタグフラグが"N"のデータが存在しない場合は実施しない
        if (internalVariableDtlList.isEmpty()){
            return;
        }

        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2503InternalVariableHdrDomain();

        // factory code setting
        // 工場コード設定
        List<String> plntCdList;

        if (FLAG_N.equals(internalVariableHdr.getNexusWhFlg())){
            plntCdList = singletonList(internalVariableHdr.getPlntCd());
        } else {
            // This is factory code acquisition from CIGMA Warehouse Cross Reference Master.
            // 倉庫クロスリファレンス原単位より工場コード取得
            TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteria = new TmCigmaWhXrefCriteriaDomain();
            tmCigmaWhXrefCriteria.setCompCd(internalVariableHdr.getWhCompCd());
            tmCigmaWhXrefCriteria.setWhCd(internalVariableHdr.getWhCd());
            List<TmCigmaWhXrefDomain> tmCigmaWhXrefList = tmCigmaWhXrefService.searchByCondition(tmCigmaWhXrefCriteria);

            plntCdList = new ArrayList<String>(tmCigmaWhXrefList.size());
            for (TmCigmaWhXrefDomain tmCigmaWhXref : tmCigmaWhXrefList){
                plntCdList.add(tmCigmaWhXref.getPlntCd());
            }
        }

        List<Ws2004ResultItemDomain> resultItems = searchItemNoFromCigma(internalVariableHdr.getShipperCd(),
                                                                         plntCdList,
                                                                         internalVariableHdr.getLgcyWhCd(),
                                                                         internalVariableDtlList,
                                                                         internalVariableHdr.getCustomerCd());
        populateItemNo(resultItems, internalVariableDtlList);
    }

    /**
     * Acquire a MIXE thing vote information.
     * <br />MIXE現品票情報を取得します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Mix Tag cannot be referred to<br />MIXED現品票が参照できない場合
     */
    protected void searchWs2503MixInfo(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()) {
            String mixTagFlg = internalVariableDtl.getMixTagFlg();

            if (FLAG_Y.compareTo(mixTagFlg) == 0){
                String mixTagNo = internalVariableDtl.getItemNo();

                TtMixtagCriteriaDomain ttMixtagCriteria = new TtMixtagCriteriaDomain();
                ttMixtagCriteria.setMixTagNo(mixTagNo);

                TtMixtagDomain ttMixtag = ttMixtagService.searchByKey(ttMixtagCriteria);

                internalVariableDtl.setContainerSortingKey(ttMixtag.getContainerSortingKey());
                internalVariableDtl.setLoadingCd(ttMixtag.getLoadingCd());
                internalVariableDtl.setInvoiceKey(ttMixtag.getInvoiceKey());
                internalVariableDtl.setStgInstrItemFlg(FLAG_N);
                internalVariableDtl.setCustomTimingTyp(ttMixtag.getCustomTimingTyp());
                internalVariableDtl.setContainerLooseTyp(ttMixtag.getContainerLooseTyp());
                internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_MULTI);
                internalVariableDtl.setCurrCd(ttMixtag.getCurrCd());
                internalVariableDtl.setMixTagStatus(ttMixtag.getMixTagStatus());
                internalVariableDtl.setPltzInstrNo(ttMixtag.getPltzInstrNo());
                internalVariableDtl.setWhCompCd(ttMixtag.getWhCompCd());
                internalVariableDtl.setWhCd(ttMixtag.getWhCd());
                internalVariableDtl.setDataGetFlg(FLAG_Y);
            }
        }
    }

    /**
     * Set up an internal variable (MIX ITEM NO).
     * <br />内部変数（MIX品目番号）を設定します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Mix Tag and a MIXED ITEM NO cannot be referred to<br />MIXED現品票、MIXED品目番号を参照できない場合
     */
    protected void searchWs2503MixItemInfo(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        int seq = criteria.getMaxSeq().intValue();

        List <Ws2501InternalVariableDtlDomain> InternalVariableMixItemNoDomainList = new ArrayList<Ws2501InternalVariableDtlDomain>();

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()){

            if (!FLAG_Y.equals(internalVariableDtl.getMixTagFlg())){
                continue;
            }

            Ws2501MixedTagItemCriteriaDomain mixedTagItemCriteria = new Ws2501MixedTagItemCriteriaDomain();
            mixedTagItemCriteria.setMixTagNo(internalVariableDtl.getItemNo());

            List<? extends Ws2501MixedTagItemDomain> mixedTagItemList = wsBhtEisProductDao.searchMixedTagItem(mixedTagItemCriteria);

            for (Ws2501MixedTagItemDomain mixedTagItem : mixedTagItemList){
                Ws2501InternalVariableDtlDomain mixItem = new Ws2501InternalVariableDtlDomain();
                CommonUtil.copyPropertiesDomainToDomain(mixItem, mixedTagItem);
                mixItem.setSeq(BigDecimal.valueOf(++seq));
                InternalVariableMixItemNoDomainList.add(mixItem);
            }
        }

        criteria.setWs2503InternalVariableMixItemNoDomainList(InternalVariableMixItemNoDomainList);
    }

    /**
     * Perform an input check.
     * <br />入力チェックを行います。
     *
     * @param criteria Eis Product domain<br />Eis Productドメイン
     * @param errCreateTimestamp Error registration time stamp<br />エラー登録タイムスタンプ
     * @return Checked result<br />チェック結果
     * @throws ApplicationException When a CML Error Report Header and a CML Error Report Detail cannot be accessed
     *                              <br />CMLエラーレポートヘッダ、CMLエラーレポート明細にアクセスできない場合
     */
    protected boolean chkInputData(WsBhtEisProductCriteriaDomain criteria, Timestamp[] errCreateTimestamp) throws ApplicationException{

        boolean errFlg = false;
        boolean doorFlg = false;
        boolean backFlg = false;

        // DSC-ID
        String dscId = criteria.getLoginUserDscId();

        // Internal variable (header)
        // 内部変数（ヘッダ）
        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2503InternalVariableHdrDomain();

        // ERROR CREATE TIMESTAMP
        // エラーレポート作成日時
        errCreateTimestamp[0] = new Timestamp(new Date().getTime());

        // CML-Error-Report-Header domain
        // CMLエラーレポートヘッダドメイン
        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();
        ttCmlErrorHeader.setDscId(dscId);
        ttCmlErrorHeader.setErrCreateTimestamp(errCreateTimestamp[0]);

        // The list of CML-Error-Report-Detail domains
        // CMLエラーレポート明細ドメインのリスト
        List<TtCmlErrorDtlDomain> ttCmlErrorDtlList = new ArrayList<TtCmlErrorDtlDomain>();

        // For a backup
        // 退避用
        String tmpPkgFormTyp = null;
        String tmpItemNo = null;
        String tmpInvoiceKey = null;
        String tmpContainerSortingKey = null;
        String tmpCurrCd = null;
        String tmpStgInstrItemFlg = null;
        String tmpContainerLooseTyp = null;
        String tmpCustomTimingTyp = null;

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()) {
            // Initial value setting of ITEM NO CHECK FLAG
            // 品目番号チェックフラグの初期値設定
            StringBuffer itemNoChkFlg = new StringBuffer(MNF_FLAG_OK + MNF_FLAG_OK + MNF_FLAG_OK + MNF_FLAG_OK); // UT298 MOD
            StringBuffer whChkFlg = new StringBuffer("N");

            // Setting of an acquisition flag
            // 取得フラグの設定
            String dataGetFlg = internalVariableDtl.getDataGetFlg();

            if (FLAG_N.compareTo(dataGetFlg) != 0){

                String mixTagFlg = internalVariableDtl.getMixTagFlg();
                String pkgFormTyp = internalVariableDtl.getPkgFormTyp();
                String itemNo = internalVariableDtl.getItemNo();
                String invoiceKey = internalVariableDtl.getInvoiceKey();
                String containerSortingKey = internalVariableDtl.getContainerSortingKey();
                String currCd = internalVariableDtl.getCurrCd();
                String loadingCd = internalVariableDtl.getLoadingCd();
                String stgInstrItemFlg = internalVariableDtl.getStgInstrItemFlg();
                String containerLooseTyp = internalVariableDtl.getContainerLooseTyp();
                String customTimingTyp = internalVariableDtl.getCustomTimingTyp();

                tmpPkgFormTyp = defaultString(tmpPkgFormTyp, pkgFormTyp);
                tmpItemNo = defaultString(tmpItemNo, itemNo);
                tmpInvoiceKey = defaultString(tmpInvoiceKey, invoiceKey);
                tmpContainerSortingKey = defaultString(tmpContainerSortingKey, containerSortingKey);
                tmpCurrCd = defaultString(tmpCurrCd, currCd);
                tmpStgInstrItemFlg = defaultString(tmpStgInstrItemFlg, stgInstrItemFlg);
                tmpContainerLooseTyp = defaultString(tmpContainerLooseTyp, containerLooseTyp);
                tmpCustomTimingTyp = defaultString(tmpCustomTimingTyp, customTimingTyp);

                // Correlation check
                // PACKAGE-FORM-TYPE check
                // 相関チェック
                // 梱包形態チェック
                if (!StringUtils.equals(tmpPkgFormTyp, pkgFormTyp)) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultE(NG);
                }

                // Single article ITEM-NO check
                // 単品品目番号チェック
                if (PKG_FORM_TYP_SINGLE.equals(pkgFormTyp)) {
                    if (!StringUtils.equals(tmpItemNo, itemNo)) {
                        errFlg = true;
                        ttCmlErrorHeader.setChkResultE(NG);
                    }
                }

                // Inv. Key check
                // インボイスキーチェック
                if (!StringUtils.equals(tmpInvoiceKey, invoiceKey)) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultF(NG);
                }

                // CONTAINER-SORTING-KEY check
                // コンテナ層別キーチェック
                if (!StringUtils.equals(tmpContainerSortingKey, containerSortingKey)) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultG(NG);
                }

                // Currency check
                // 通貨チェック
                if (!StringUtils.equals(tmpCurrCd, currCd)) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultH(NG);
                }

                // loading position code check
                // 荷積み位置コードチェック
                if (LOADING_CD_DOOR.equals(loadingCd)) {
                    doorFlg = true;
                }
                if (LOADING_CD_BACK.equals(loadingCd)) {
                    backFlg = true;
                }

                if (doorFlg && backFlg) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultI(NG);
                }

                // staging-instruction flag check
                // 荷揃え指示フラグチェック
                if (!StringUtils.equals(tmpStgInstrItemFlg, stgInstrItemFlg)) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultJ(NG);
                }

                // C/L check
                // コンテナルーズチェック
                if (!StringUtils.equals(tmpContainerLooseTyp, containerLooseTyp)) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultK(NG);
                }

                // CUSTOM-TIMING-TYPE check
                // 通関タイミング区分チェック
                if (!StringUtils.equals(tmpCustomTimingTyp, customTimingTyp)) {
                    errFlg = true;
                    ttCmlErrorHeader.setChkResultL(NG);
                }

                // ITEM-NO check
                // 品目番号チェック
                if (!chkWs2503ItemNo(mixTagFlg, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg)) {
                    errFlg = true;
                }

                // Multiple Item No. in 1Box PKG check
                // 小箱内多品チェック
                if (!chkWs2503MixTag(mixTagFlg, internalVariableHdr, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, whChkFlg)) {
                    errFlg = true;
                }
            }
            // A setting of CML-Error-Report-Detail list
            // CMLエラーレポート明細リストの設定
            addWs2503CmlDtlList(internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, whChkFlg, ttCmlErrorDtlList, criteria.getScreenId());
        }
        // When error occurs
        // エラーが発生した場合
        if(errFlg){
            // CML-Error-Report-Header registration
            // CMLエラーレポートヘッダ登録
            createWs2503CmlHdr(criteria.getWs2503InternalVariableHdrDomain(), ttCmlErrorHeader, criteria.getScreenId());

            // CML-Error-Report-Detail registration
            // CMLエラーレポート明細登録
            for (TtCmlErrorDtlDomain ttCmlErrorDtl : ttCmlErrorDtlList){
                ttCmlErrorDtlService.create(ttCmlErrorDtl);
            }
            return false;
        }
        return true;
    }

    /**
     * Check an ITEM NO.
     * <br />品目番号をチェックします。
     *
     * @param mixTagFlg Mix Tag Flg<br />Mix Tag Flg
     * @param internalVariableDtl Internal variable (details) domain<br />内部変数（明細）ドメイン
     * @param ttCmlErrorHeader CML-Error-Report-Header domain<br />CMLエラーレポートヘッダドメイン
     * @param itemNoChkFlg The item for ITEM-NO-CHECK-FLAG registration of a CML Error Report Detail<br />CMLエラーレポート明細の品目番号チェックフラグ登録用項目
     * @return Checked result<br />チェック結果
     */
    protected boolean chkWs2503ItemNo(String mixTagFlg, Ws2501InternalVariableDtlDomain internalVariableDtl, TtCmlErrorHeaderDomain ttCmlErrorHeader, StringBuffer itemNoChkFlg){

        boolean errFlg = false;

        if (FLAG_N.compareTo(mixTagFlg) == 0){
            String pkgFormTyp = internalVariableDtl.getPkgFormTyp();
            BigDecimal qty = internalVariableDtl.getQty();
            BigDecimal odrQty = internalVariableDtl.getOdrQty();
            BigDecimal tagQty = internalVariableDtl.getTagQty();
            BigDecimal lotSize = internalVariableDtl.getLotSize();
            String currCd = internalVariableDtl.getCurrCd();
            String itemDescription = internalVariableDtl.getItemDescription();
            String dngrItemFlg = internalVariableDtl.getDngrItemFlg();

            // Order over check
            // オーダー越えチェック
            if (qty.compareTo(odrQty) > 0){
                ttCmlErrorHeader.setChkResultM(NG);
                errFlg = true;
            }

            // SHIPPING-LOT over check (multi-article ITEM NO)
            // 出荷ロット超えチェック（多品品目番号）
            if (PKG_FORM_TYP_MULTI.equals(pkgFormTyp)){
                if (qty.divide(tagQty, 1, BigDecimal.ROUND_UP).compareTo(lotSize) > 0) { // UT374 MOD
                    ttCmlErrorHeader.setChkResultO(NG);
                    errFlg = true;
                }
            }

            // SHIPPING-LOT over check (single article ITEM NO)
            // 出荷ロット超えチェック（単品品目番号）
            if (PKG_FORM_TYP_SINGLE.equals(pkgFormTyp)){
                if (qty.compareTo(lotSize) > 0){
                    ttCmlErrorHeader.setChkResultO(NG);
                    errFlg = true;
                }
            }

            // CIGMA information acquisition check
            // CIGMA情報取得チェック
            if (CheckUtil.isBlankOrNull(currCd)){
                ttCmlErrorHeader.setChkResultP(NG);
                itemNoChkFlg.replace(0, 1, MNF_FLAG_NG);
                errFlg = true;
            }

            // Special-Information number information acquisition check
            // 輸出出荷品目番号情報取得チェック
            if (CheckUtil.isBlankOrNull(itemDescription)){
                ttCmlErrorHeader.setChkResultP(NG);
                itemNoChkFlg.replace(1, 2, MNF_FLAG_NG);
                errFlg = true;
            }

            // export-formalities ITEM-NO information acquisition check
            // 輸出手続き品目番号情報取得チェック
            if (CheckUtil.isBlankOrNull(dngrItemFlg)){
                ttCmlErrorHeader.setChkResultP(NG);
                itemNoChkFlg.replace(2, 3, MNF_FLAG_NG);
                errFlg = true;
            }
        }

        return !errFlg;
    }
    /**
     * Check a Multiple Item No. in 1Box PKG check.
     * <br />小箱内多品チェックをチェックします。
     *
     * @param mixTagFlg Mix Tag Flg<br />Mix Tag Flg
     * @param internalVariableHdr Internal variable (header) domain<br />内部変数（ヘッダ）ドメイン
     * @param internalVariableDtl Internal variable (details) domain<br />内部変数（明細）ドメイン
     * @param ttCmlErrorHeader CML-Error-Report-Header domain<br />CMLエラーレポートヘッダドメイン
     * @param itemNoChkFlg The item for ITEM-NO-CHECK-FLAG registration of a CML Error Report Detail<br />CMLエラーレポート明細の品目番号チェックフラグ登録用項目
     * @param whChkFlg The item for ITEM-NO-CHECK-FLAG registration of a CML Error Report Detail<br />CMLエラーレポート明細の品目番号チェックフラグ登録用項目
     * @return Checked result<br />チェック結果
     */
    protected boolean chkWs2503MixTag(String mixTagFlg, Ws2501InternalVariableHdrDomain internalVariableHdr, Ws2501InternalVariableDtlDomain internalVariableDtl,
        TtCmlErrorHeaderDomain ttCmlErrorHeader, StringBuffer itemNoChkFlg, StringBuffer whChkFlg){

        boolean errFlg = false;

        if (FLAG_Y.compareTo(mixTagFlg) == 0){
            String mixTagStatus = internalVariableDtl.getMixTagStatus();
            String dataGetFlg = internalVariableDtl.getDataGetFlg();

            // Multiple Item No. in 1Box PKG information acquisition check
            // 小箱内多品情報取得チェック
            if (CheckUtil.isBlankOrNull(mixTagStatus)){
                ttCmlErrorHeader.setChkResultP(NG);
                itemNoChkFlg.replace(3, 4, FLAG_Y);
                errFlg = true;
            } else {

                // Multiple Item No. in 1Box PKG status check
                // 小箱内多品状態チェック
                if(FLAG_N.compareTo(dataGetFlg) != 0){
                    if(MIX_TAG_STATUS_MIXTAG.compareTo(mixTagStatus) != 0){
                        ttCmlErrorHeader.setChkResultQ(NG);
                        errFlg = true;
                    }
                }
            }

            // A MIX tag W/H Company / W/H check
            // MIXタグ倉庫会社／倉庫チェック
            if(FLAG_N.compareTo(dataGetFlg) != 0){
                if(internalVariableDtl.getWhCompCd().compareTo(internalVariableHdr.getWhCompCd()) != 0
                    || internalVariableDtl.getWhCd().compareTo(internalVariableHdr.getWhCd()) != 0){
                    ttCmlErrorHeader.setChkResultR(NG);
                    whChkFlg.replace(0, 1, FLAG_Y);
                    errFlg = true;
                }
            }
        }

        return !errFlg;
    }
    /**
     * Register a CML Error Report Header.
     * <br />CMLエラーレポートヘッダを登録します。
     *
     * @param internalVariableHdr Internal variable (header) domain<br />内部変数（ヘッダ）ドメイン
     * @param ttCmlErrorHeader CML-Error-Report-Header domain<br />CMLエラーレポートヘッダドメイン
     * @param screenId SCREEN ID<br />画面ID
     * @throws ApplicationException When a CML Error Report Header cannot be accessed<br />CMLエラーレポートヘッダにアクセスできない場合
     */
    protected void createWs2503CmlHdr(Ws2501InternalVariableHdrDomain internalVariableHdr, TtCmlErrorHeaderDomain ttCmlErrorHeader, String screenId)
        throws ApplicationException{
        CommonUtil.copyPropertiesDomainToDomain(ttCmlErrorHeader, internalVariableHdr);

        // NEXUS W/H flag is not 'N'
        // NEXUS倉庫フラグが'N'以外 の場合
        if (!FLAG_N.equals(internalVariableHdr.getNexusWhFlg())) {
            ttCmlErrorHeader.setPlntCd(null);
            ttCmlErrorHeader.setLgcyWhCd(null);
        }
        // NEXUS W/H flag is not 'Y'
        // NEXUS倉庫フラグが'Y'以外 の場合
        if (!FLAG_Y.equals(internalVariableHdr.getNexusWhFlg())) {
            ttCmlErrorHeader.setWhCompCd(null);
            ttCmlErrorHeader.setWhCd(null);
        }

        // Setting of an EXPORT PACKING ISSUER NAME
        // 輸出梱包者名の設定
        TmUserCriteriaDomain tmUserCriteria = new TmUserCriteriaDomain();
        String dscId = ttCmlErrorHeader.getDscId();
        tmUserCriteria.setDscId(dscId);
        TmUserDomain tmUser = tmUserService.searchByKey(tmUserCriteria);
        ttCmlErrorHeader.setExpPackingIssuerNm(tmUser.getUsrNmEn());

        // Common items
        // 共通項目
        setCommonPropertyForRegist(ttCmlErrorHeader, dscId, screenId);

        // CML-Error-Report-Header registration
        // CMLエラーレポートヘッダ登録
        ttCmlErrorHeaderService.create(ttCmlErrorHeader);
    }
    /**
     * Add a domain to a CML-Error-Report-Detail list.
     * <br />CMLエラーレポート明細リストにドメインを追加します。
     *
     * @param internalVariableDtl Internal variable (details) domain<br />内部変数（明細）ドメイン
     * @param ttCmlErrorHeader CML-Error-Report-Header domain<br />CMLエラーレポートヘッダドメイン
     * @param itemNoChkFlg The item for ITEM-NO-CHECK-FLAG registration of a CML Error Report Detail<br />CMLエラーレポート明細の品目番号チェックフラグ登録用項目
     * @param whChkFlg The item for ITEM-NO-CHECK-FLAG registration of a CML Error Report Detail<br />CMLエラーレポート明細の品目番号チェックフラグ登録用項目
     * @param ttCmlErrorDtlList CML-Error-Report-Detail list<br />CMLエラーレポート明細リスト
     * @param screenId SCREEN ID<br />画面ID
     * @throws ApplicationException When a CML Error Report Header cannot be accessed<br />CMLエラーレポートヘッダにアクセスできない場合
     */
    protected void addWs2503CmlDtlList(Ws2501InternalVariableDtlDomain internalVariableDtl, TtCmlErrorHeaderDomain ttCmlErrorHeader,
        StringBuffer itemNoChkFlg, StringBuffer whChkFlg, List<TtCmlErrorDtlDomain> ttCmlErrorDtlList, String screenId)
        throws ApplicationException{

        // CML-Error-Report-Detail domain
        // CMLエラーレポート明細ドメイン
        TtCmlErrorDtlDomain ttCmlErrorDtl = new TtCmlErrorDtlDomain();

        CommonUtil.copyPropertiesDomainToDomain(ttCmlErrorDtl, internalVariableDtl);

        // DSC-ID
        String dscId = ttCmlErrorHeader.getDscId();
        ttCmlErrorDtl.setDscId(dscId);

        // ERROR CREATE TIMESTAMP
        // エラーレポート作成日時
        Timestamp errCreateTimestamp = ttCmlErrorHeader.getErrCreateTimestamp();
        ttCmlErrorDtl.setErrCreateTimestamp(errCreateTimestamp);

        // PKG CD
        // 包装コード
        if (FLAG_Y.equals(internalVariableDtl.getMixTagFlg())) {
            if (CheckUtil.isBlankOrNull(ttCmlErrorDtl.getPkgCd())) {
                ttCmlErrorDtl.setPkgCd(" ");
            }
        }

        // Setting of each QUANTITY
        // 各数量の設定
        String mixTagFlg = internalVariableDtl.getMixTagFlg();
        if (FLAG_N.equals(mixTagFlg)){
            ttCmlErrorDtl.setShippingLot(internalVariableDtl.getLotSize());
            ttCmlErrorDtl.setQty(internalVariableDtl.getQty());
            ttCmlErrorDtl.setScanQty(internalVariableDtl.getTagQty());
            ttCmlErrorDtl.setStkQty(internalVariableDtl.getStkQty());
            ttCmlErrorDtl.setOdrQty(internalVariableDtl.getOdrQty());

            BigDecimal overInstrQty = internalVariableDtl.getQty().subtract(internalVariableDtl.getOdrQty());
            if (overInstrQty.compareTo(BigDecimal.ZERO) < 0){
                ttCmlErrorDtl.setOverInstrQty(null);
            } else {
                ttCmlErrorDtl.setOverInstrQty(overInstrQty);
            }
        } else {
            ttCmlErrorDtl.setShippingLot(null);
            ttCmlErrorDtl.setQty(null);
            ttCmlErrorDtl.setScanQty(null);
            ttCmlErrorDtl.setStkQty(null);
            ttCmlErrorDtl.setOdrQty(null);
            ttCmlErrorDtl.setOverInstrQty(null);
        }

        // ITEM NO CHECK FLAG
        // 品目番号チェックフラグ
        ttCmlErrorDtl.setItemNoChkFlg(itemNoChkFlg.toString());

        String mixTagStatus = internalVariableDtl.getMixTagStatus();
        // MIX PALLETIZE COMPLETE FLAG
        // MIXタグパレタイズ完了フラグ
        if (CheckUtil.isBlankOrNull(mixTagStatus)){
            // dead logic (it indicated as design specifications)
            // デッドロジック(設計書どおり記載しておいた)
            ttCmlErrorDtl.setMixPltzCompltFlg(null);
        } else if (MIX_TAG_STATUS_MIXTAG.equals(mixTagStatus)){
            ttCmlErrorDtl.setMixPltzCompltFlg(FLAG_Y);
        } else if(MIX_TAG_STATUS_CML.equals(mixTagStatus)){
            ttCmlErrorDtl.setMixPltzCompltFlg(FLAG_N);
        } 

        // MIX WAREHOUSE CHECK FLAG
        // MIXタグ倉庫チェックフラグ
        if (FLAG_Y.equals(mixTagFlg)){
            ttCmlErrorDtl.setMixWhChkFlg(whChkFlg.toString());
        }

        // Common items
        // 共通項目
        setCommonPropertyForRegist(ttCmlErrorDtl, dscId, screenId);

        // It adds to CML-Error-Report-Detail list.
        // CMLエラーレポート明細リストへ追加
        ttCmlErrorDtlList.add(ttCmlErrorDtl);
    }

    /**
     * Confirm whether the exterior sign is set up and require it.
     * <br />外装記号が設定されているかチェックしいます。
     *
     * @param criteria Eis Product domain<br />Eis Productドメイン
     * @return Checked result<br />チェック結果
     */
    protected boolean chkWs2503OuterPkgCd(WsBhtEisProductCriteriaDomain criteria){
        // Exterior sign
        // 外装記号
        String outerPkgCd = criteria.getWs2503InternalVariableHdrDomain().getOuterPkgCd();

        // Type of packing
        // 包装形態
        String pkgFormTyp = criteria.getWs2503InternalVariableDtlDomainList().get(0).getPkgFormTyp();

        // Exterior sign check (single article ITEM NO)
        // 外装記号チェック（単品品目番号）
        if (PKG_FORM_TYP_SINGLE.equals(pkgFormTyp)){

            BigDecimal qty = criteria.getWs2503InternalVariableDtlDomainList().get(0).getQty();
            BigDecimal lotSize = criteria.getWs2503InternalVariableDtlDomainList().get(0).getLotSize();

            if (lotSize.subtract(qty).compareTo(BigDecimal.ZERO) > 0){
                if (CheckUtil.isBlankOrNull(outerPkgCd)){
                    return false;
                }
            }
        }

        // Exterior sign check (multi-article ITEM NO)
        // 外装記号チェック（多品品目番号）
        if (PKG_FORM_TYP_MULTI.equals(pkgFormTyp)){
            if (CheckUtil.isBlankOrNull(outerPkgCd)){
                return false;
            }
        }
        return true;
    }

    /**
     * Perform firm-order-receipt alloc processing.
     * <br />確定受注引当処理を行います。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When an Export Receive Order cannot be accessed<br />輸出受注にアクセスできない場合
     */
    protected void allocWs2503Qty(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2503InternalVariableHdrDomain();
        String shipperCd  = internalVariableHdr.getShipperCd();
        String customerCd = internalVariableHdr.getCustomerCd();
        String lgcyShipTo = internalVariableHdr.getLgcyShipTo();
        String trnsCd     = internalVariableHdr.getTrnsCd();

        // post-processing (registration of an ordering alloc track record (starting of Web service)) In order to use it
        // The list which saves Palletize Item Receive Order
        // 後処理 (受注引当実績の登録（Webサービスの起動）) で使用するために
        // パレタイズ対象品受注情報を保存しておくリスト
        List<TtPltzItemOdrDomain> pltzItemOdrList = new ArrayList<TtPltzItemOdrDomain>();

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()){

            String mixTagFlg = internalVariableDtl.getMixTagFlg();
            if (!FLAG_N.equals(mixTagFlg)){
                continue;
            }

            // The amount of remaining numbers of the number of PKGs
            // 梱包数の残数量
            BigDecimal qty = internalVariableDtl.getQty();

            // Acquisition of an Export Receive Order
            // 輸出受注の取得
            TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
            ttExpRcvOdrCriteria.setRcvOdrCompCd(shipperCd);
            ttExpRcvOdrCriteria.setCustomerCd(customerCd);
            ttExpRcvOdrCriteria.setLgcyShipTo(lgcyShipTo);
            ttExpRcvOdrCriteria.setTrnsCd(trnsCd);
            ttExpRcvOdrCriteria.setItemNo(internalVariableDtl.getItemNo());
            ttExpRcvOdrCriteria.setPkgCd(internalVariableDtl.getPkgCd());
            ttExpRcvOdrCriteria.setOdrFirmFlg(FLAG_Y);
            ttExpRcvOdrCriteria.setShippedTyp(SHIPPED_TYP_INCOMPLATE_PACKING);
            ttExpRcvOdrCriteria.setPreferredOrder("ETD_DUE_DT, CUSTOMER_PO_NO, ODR_CTRL_NO");

            List<TtExpRcvOdrDomain> ttExpRcvOdrList =  ttExpRcvOdrService.searchByCondition(ttExpRcvOdrCriteria);

            for (TtExpRcvOdrDomain ttExpRcvOdr : ttExpRcvOdrList){

                // Since it cannot draw any more if the amount of remaining numbers of the number of PKGs is 0, it ends. ..
                // 梱包数の残数量が 0 ならこれ以上引き当てられないので終了...
                if (qty.compareTo(BigDecimal.ZERO) == 0) {
                    break;
                }

                // Alloc of a firm order receipt
                // 確定受注の引当
                BigDecimal odrQty = ttExpRcvOdr.getOdrQty();
                BigDecimal pltzAllocQty = ttExpRcvOdr.getPltzAllocQty();
                // Shipment remaining
                // 出荷残
                BigDecimal unShippedQty = odrQty.subtract(pltzAllocQty);

                // This ALLOC-QUANTITY calculation
                // 今回の引当数量算出
                BigDecimal allocQtyThisTime;
                if(qty.compareTo(unShippedQty) > 0){
                    allocQtyThisTime = unShippedQty;
                } else {
                    allocQtyThisTime = qty;
                }

                // The amount of remaining numbers of the number of PKGs
                // 梱包数の残数量
                qty = qty.subtract(allocQtyThisTime);

                // PLTZ_ALLOC_QTY behind an alloc
                // 引当後の PLTZ_ALLOC_QTY
                BigDecimal newPltzAllocQty = pltzAllocQty.add(allocQtyThisTime);

                // Export Receive Order Update
                // 輸出受注更新
                TtExpRcvOdrDomain ttExpRcvOdrUpdate = new TtExpRcvOdrDomain();
                ttExpRcvOdrUpdate.setPltzAllocQty(newPltzAllocQty);
                if (odrQty.compareTo(newPltzAllocQty) == 0) {
                    ttExpRcvOdrUpdate.setShippedTyp(SHIPPED_TYP_COMPLATE_PACKING);
                }

                setCommonPropertyForUpdate(ttExpRcvOdrUpdate, criteria.getLoginUserDscId(), criteria.getScreenId());

                // Export Receive Order Update
                // 輸出受注更新
                TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteriaUpdate = new TtExpRcvOdrCriteriaDomain();
                ttExpRcvOdrCriteriaUpdate.setRcvOdrCompCd(ttExpRcvOdr.getRcvOdrCompCd());
                ttExpRcvOdrCriteriaUpdate.setCustomerCd(ttExpRcvOdr.getCustomerCd());
                ttExpRcvOdrCriteriaUpdate.setLgcyShipTo(ttExpRcvOdr.getLgcyShipTo());
                ttExpRcvOdrCriteriaUpdate.setItemNo(ttExpRcvOdr.getItemNo());
                ttExpRcvOdrCriteriaUpdate.setPkgCd(ttExpRcvOdr.getPkgCd());
                ttExpRcvOdrCriteriaUpdate.setTrnsCd(ttExpRcvOdr.getTrnsCd());
                ttExpRcvOdrCriteriaUpdate.setEtdDueDt(ttExpRcvOdr.getEtdDueDt());
                ttExpRcvOdrCriteriaUpdate.setCustomerPoNo(ttExpRcvOdr.getCustomerPoNo());
                ttExpRcvOdrCriteriaUpdate.setCustomerItemNo(ttExpRcvOdr.getCustomerItemNo());
                ttExpRcvOdrCriteriaUpdate.setCustomerItemNoOrg(ttExpRcvOdr.getCustomerItemNoOrg());
                ttExpRcvOdrCriteriaUpdate.setOdrCtrlNo(ttExpRcvOdr.getOdrCtrlNo());

                ttExpRcvOdrService.updateByCondition(ttExpRcvOdrUpdate, ttExpRcvOdrCriteriaUpdate);

                // Registration of Palletize Item Receive Order
                // パレタイズ対象品受注情報の登録
                TtPltzItemOdrDomain ttPltzItemOdr = new TtPltzItemOdrDomain();
                ttPltzItemOdr.setMainMark(mainMark);
                ttPltzItemOdr.setBrch(internalVariableDtl.getSeq());
                ttPltzItemOdr.setItemNo(ttExpRcvOdr.getItemNo());
                ttPltzItemOdr.setPkgCd(ttExpRcvOdr.getPkgCd());
                ttPltzItemOdr.setRcvOdrCompCd(ttExpRcvOdr.getRcvOdrCompCd());
                ttPltzItemOdr.setCustomerCd(ttExpRcvOdr.getCustomerCd());
                ttPltzItemOdr.setLgcyShipTo(ttExpRcvOdr.getLgcyShipTo());
                ttPltzItemOdr.setTrnsCd(ttExpRcvOdr.getTrnsCd());
                ttPltzItemOdr.setEtdDueDt(ttExpRcvOdr.getEtdDueDt());
                ttPltzItemOdr.setCustomerPoNo(ttExpRcvOdr.getCustomerPoNo());
                ttPltzItemOdr.setCustomerItemNo(ttExpRcvOdr.getCustomerItemNo());
                ttPltzItemOdr.setCustomerItemNoOrg(ttExpRcvOdr.getCustomerItemNoOrg());
                ttPltzItemOdr.setOdrCtrlNo(ttExpRcvOdr.getOdrCtrlNo());
                ttPltzItemOdr.setAllocQty(allocQtyThisTime);

                setCommonPropertyForRegist(ttPltzItemOdr, criteria.getLoginUserDscId(), criteria.getScreenId());

                ttPltzItemOdrService.create(ttPltzItemOdr);

                // 2015/11/25 update
                ttPltzItemOdr.setAllocQty(newPltzAllocQty);
                
                pltzItemOdrList.add(ttPltzItemOdr);
            }
            if (qty.compareTo(BigDecimal.ZERO) != 0) {
                Object[] params = {internalVariableDtl.getItemNo()};
                throw new ApplicationException(NXS_E7_0089, params);
            }
        }

        criteria.setTtPltzItemOdrList(pltzItemOdrList);
    }

    /**
     * Register a Palletize Item Receive Order.
     * <br />パレタイズ対象品受注情報を登録します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Mix Tag Receive Order and a Palletize Item Receive Order cannot be accessed
     *                              <br />MIXED品目番号受注情報、パレタイズ対象品受注情報にアクセスできない場合
     */
    protected void createPltzItemOdrByMixTagOdr(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        for (Ws2501InternalVariableDtlDomain internalVariableMixItemNo : criteria.getWs2503InternalVariableMixItemNoDomainList()){
            // data acquisition
            // データ取得
            TtMixtagOdrCriteriaDomain ttMixtagOdrCriteria = new TtMixtagOdrCriteriaDomain();
            ttMixtagOdrCriteria.setMixTagNo(internalVariableMixItemNo.getMixTagNo());
            ttMixtagOdrCriteria.setItemNo(internalVariableMixItemNo.getItemNo());
            ttMixtagOdrCriteria.setPkgCd(internalVariableMixItemNo.getPkgCd());

            List<TtMixtagOdrDomain> ttMixtagOdrList = ttMixtagOdrService.searchByCondition(ttMixtagOdrCriteria);

            for (TtMixtagOdrDomain ttMixtagOdr : ttMixtagOdrList){
                // Palletize-Item-Receive-Order registration
                // パレタイズ対象品受注情報登録
                TtPltzItemOdrDomain ttPltzItemOdr = new TtPltzItemOdrDomain();
                CommonUtil.copyPropertiesDomainToDomain(ttPltzItemOdr, ttMixtagOdr);
                ttPltzItemOdr.setMainMark(mainMark);
                ttPltzItemOdr.setBrch(internalVariableMixItemNo.getSeq());
                setCommonPropertyForRegist(ttPltzItemOdr, criteria.getLoginUserDscId(), criteria.getScreenId());

                ttPltzItemOdrService.create(ttPltzItemOdr);
            }
        }
    }

    /**
     * Register Palletize-Item data (ITEM NO).
     * <br />パレタイズ対象品データ（品目番号）を登録します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product domain<br />Eis Productドメイン
     * @throws ApplicationException When a Palletize Item cannot be accessed<br />パレタイズ対象品にアクセスできない場合
     */
    protected void createWs2503PltzItem(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        // Acquisition of DSC-ID
        // DSC IDの取得
        String dscId = criteria.getLoginUserDscId();

        // Palletize-Item (ITEM NO) registration
        // パレタイズ対象品(品目番号)登録
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()){

            // MixTag flag acquisition
            // MixTagフラグ取得
            String mixTagFlg = internalVariableDtl.getMixTagFlg();

            if (FLAG_N.equals(mixTagFlg)) {

                TtPltzItemDomain ttPltzItem = new TtPltzItemDomain();
                CommonUtil.copyPropertiesDomainToDomain(ttPltzItem, internalVariableDtl);
                ttPltzItem.setMainMark(mainMark);
                ttPltzItem.setBrch(internalVariableDtl.getSeq());
                ttPltzItem.setPltzItemNo(internalVariableDtl.getItemNo());
                if (PKG_FORM_TYP_SINGLE.equals(internalVariableDtl.getPkgFormTyp())){
                    ttPltzItem.setTagQty(null);
                }
                ttPltzItem.setNetWeight(internalVariableDtl.getQty().multiply(internalVariableDtl.getItemWeight()));
                checkWeightOverflow(ttPltzItem.getNetWeight(), new String[] {getResource("label.netWeight")});
                ttPltzItem.setShippingLot(internalVariableDtl.getLotSize());
                ttPltzItem.setRtFlg(FLAG_N);
                ttPltzItem.setKitFlg(FLAG_N);
                ttPltzItem.setMixTagNo(null);
                ttPltzItem.setPltzInstrNo(null);
                ttPltzItem.setParFlg(FLAG_Y);
                ttPltzItem.setKitParItemNo(internalVariableDtl.getItemNo());
                ttPltzItem.setCustomerItemNo(null);
                setCommonPropertyForRegist(ttPltzItem, dscId, criteria.getScreenId());

                ttPltzItemService.create(ttPltzItem);
            }
        }

        // Palletize-Item (Mix ITEM NO) registration
        // パレタイズ対象品(Mix品目番号)登録
        for (Ws2501InternalVariableDtlDomain internalVariableMixItemNo : criteria.getWs2503InternalVariableMixItemNoDomainList()){
            TtPltzItemDomain ttPltzItem = new TtPltzItemDomain();
            CommonUtil.copyPropertiesDomainToDomain(ttPltzItem, internalVariableMixItemNo);
            ttPltzItem.setMainMark(mainMark);
            ttPltzItem.setBrch(internalVariableMixItemNo.getSeq());
            ttPltzItem.setPltzItemNo(internalVariableMixItemNo.getItemNo());
            ttPltzItem.setTagQty(null);
            ttPltzItem.setNetWeight(internalVariableMixItemNo.getQty().multiply(internalVariableMixItemNo.getItemWeight()));
            checkWeightOverflow(ttPltzItem.getNetWeight(), new String[] {getResource("label.netWeight")});
            ttPltzItem.setShippingLot(internalVariableMixItemNo.getLotSize());
            ttPltzItem.setRtFlg(FLAG_N);
            ttPltzItem.setKitFlg(FLAG_N);
            ttPltzItem.setMixTagNo(internalVariableMixItemNo.getMixTagNo());
            ttPltzItem.setPltzInstrNo(null);
            ttPltzItem.setParFlg(FLAG_Y);
            ttPltzItem.setKitParItemNo(internalVariableMixItemNo.getItemNo());
            ttPltzItem.setCustomerItemNo(null);
            setCommonPropertyForRegist(ttPltzItem, dscId, criteria.getScreenId());

            ttPltzItemService.create(ttPltzItem);
        }
    }

    /**
     * Register Palletize-Item data (packing).
     * <br />パレタイズ対象品データ（包装）を登録します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a table cannot be accessed<br />テーブルにアクセスできない場合
     */
    protected void createWs2503PltzItemPkg(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        // Registration of Packing material (registration of the data acquired from the packing specification)
        // 包装材の登録（包装仕様から取得したデータの登録）
        createWs2503PltzItemPkgByPkg(mainMark, criteria);
        // Registration of Packing material (registration of the data acquired from the MIX tag)
        // 包装材の登録（MIXタグから取得したデータの登録）
        createWs2503PltzItemPkgByMixTag(mainMark, criteria);
        // Registration of Packing material (registration of the data acquired from exterior cases)
        // 包装材の登録（外装材から取得したデータの登録）
        createWs2503PltzItemPkgByOuterPkg(mainMark, criteria);
        // Registration of Packing material (registration of a dummy Packing material)
        // 包装材の登録（ダミー包装材の登録）
        createWs2503PltzItemPkgByDummyPkg(mainMark, criteria);
    }
    /**
     * Register a Packing material (registration of the data acquired from the packing specification).
     * <br />包装材を登録（包装仕様から取得したデータの登録）します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Palletize Item cannot be referred to<br />パレタイズ対象品を参照できない場合
     */
    protected void createWs2503PltzItemPkgByPkg(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();

        String ownerCompCd = criteria.getWs2503InternalVariableHdrDomain().getShipperCd();
        String trnsCd = criteria.getWs2503InternalVariableHdrDomain().getTrnsCd();
        String outerPkgCd = criteria.getWs2503InternalVariableHdrDomain().getOuterPkgCd();

        BigDecimal brch = searchMaxBrchPlusOne(mainMark);

        // 包装材品目番号ごとに包装材使用数を合算
        Map<String, Ws2501PkgSpecMaterialsNameRevDomain> pkgSpecMaterialsNameRevMap = new HashMap<String, Ws2501PkgSpecMaterialsNameRevDomain>();
        
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()){
            String mixTagFlg = internalVariableDtl.getMixTagFlg();

            if(FLAG_N.equals(mixTagFlg)){
                // Acquisition of a Packing material
                // 包装材の取得
                Ws2501PkgSpecMaterialsNameRevCriteriaDomain pkgSpecMaterialsNameRevCriteria = new Ws2501PkgSpecMaterialsNameRevCriteriaDomain();
                pkgSpecMaterialsNameRevCriteria.setOwnerCompCd(ownerCompCd);
                pkgSpecMaterialsNameRevCriteria.setTrnsCd(trnsCd);
                pkgSpecMaterialsNameRevCriteria.setItemNo(internalVariableDtl.getItemNo());
                pkgSpecMaterialsNameRevCriteria.setPkgCd(internalVariableDtl.getPkgCd());
                pkgSpecMaterialsNameRevCriteria.setOuterPkgCd(outerPkgCd);

                List<? extends Ws2501PkgSpecMaterialsNameRevDomain> pkgSpecMaterialsNameRevList
                    = wsBhtEisProductDao.searchPkgSpecMaterialsNameRev(pkgSpecMaterialsNameRevCriteria);

                for (Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev : pkgSpecMaterialsNameRevList){
                    // Calculation of a Packing-material USE QUANTITY
                    // 包装材使用数の算出
                    BigDecimal pkgUsedQty
                        = internalVariableDtl.getQty().divide(pkgSpecMaterialsNameRev.getLotSize(), BigDecimal.ROUND_UP).multiply(pkgSpecMaterialsNameRev.getQty());
                    pkgSpecMaterialsNameRev.setPkgUsedQty(pkgUsedQty);
                    
                    // Total of a Packing-material USE QUANTITY
                    // 包装材使用数の合算
                    String pkgItemNo = pkgSpecMaterialsNameRev.getPkgItemNo();
                    Ws2501PkgSpecMaterialsNameRevDomain sumPkgSpecMaterialsNameRev = pkgSpecMaterialsNameRevMap.get(pkgItemNo);
                    if (sumPkgSpecMaterialsNameRev == null) {
                        pkgSpecMaterialsNameRev.setPkgUsedSumQty(pkgSpecMaterialsNameRev.getPkgUsedQty());
                        pkgSpecMaterialsNameRevMap.put(pkgItemNo, pkgSpecMaterialsNameRev);
                    } else {
                        sumPkgSpecMaterialsNameRev.setPkgUsedSumQty(
                            sumPkgSpecMaterialsNameRev.getPkgUsedSumQty().add(pkgSpecMaterialsNameRev.getPkgUsedQty()));
                    }
                }
            }
        }


        // Registration of Palletize Item
        // パレタイズ対象品の登録
        for (Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev : pkgSpecMaterialsNameRevMap.values()) {
            TtPltzItemDomain ttPltzItem = new TtPltzItemDomain();
            ttPltzItem.setMainMark(mainMark);
            ttPltzItem.setBrch(brch);
            ttPltzItem.setPltzItemNo(pkgSpecMaterialsNameRev.getPkgItemNo());
            ttPltzItem.setPkgCd(" ");
            ttPltzItem.setItemDescription(pkgSpecMaterialsNameRev.getPkgNm());
            ttPltzItem.setQty(pkgSpecMaterialsNameRev.getPkgUsedSumQty());
            ttPltzItem.setQtyUnit(QTY_UNIT_EA);
            ttPltzItem.setItemTyp(ITEM_TYP_PKG_MATERIALS);
            ttPltzItem.setNetWeight(pkgSpecMaterialsNameRev.getPkgUsedSumQty().multiply(pkgSpecMaterialsNameRev.getPkgWeight()));
            checkWeightOverflow(ttPltzItem.getNetWeight(), new String[] {getResource("label.netWeight")});
            ttPltzItem.setItemWeight(pkgSpecMaterialsNameRev.getPkgWeight());
            ttPltzItem.setWeightUnit(pkgSpecMaterialsNameRev.getWeightUnit());
            ttPltzItem.setPkgTyp(pkgSpecMaterialsNameRev.getInnerOuterTyp());
            ttPltzItem.setModelCd(pkgSpecMaterialsNameRev.getModelCd());
            ttPltzItem.setDngrItemFlg(FLAG_N);
            ttPltzItem.setOriginCntryCd(pkgSpecMaterialsNameRev.getOriginCntry());
            ttPltzItem.setCurrCd(pkgSpecMaterialsNameRev.getCurrCd());
            if (RT_TYP_1WAY.compareTo(pkgSpecMaterialsNameRev.getRtTyp()) == 0){
                ttPltzItem.setRtFlg(FLAG_N);
            } else {
                ttPltzItem.setRtFlg(FLAG_Y);
                criteria.setRtUseFlg(FLAG_Y);
            }
            ttPltzItem.setKitFlg(FLAG_N);
            ttPltzItem.setParFlg(FLAG_Y);
            ttPltzItem.setKitParItemNo(pkgSpecMaterialsNameRev.getPkgItemNo());
            ttPltzItem.setInputMethTyp(INPUT_METH_TYP_AUTO);
            setCommonPropertyForRegist(ttPltzItem, dscId, criteria.getScreenId());

            ttPltzItemService.create(ttPltzItem);

            brch = brch.add(BigDecimal.ONE);
        }
    }
    
    /**
     * Register a Packing material (registration of the data acquired from the MIX tag).
     * <br />包装材を登録（MIXタグから取得したデータの登録）します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Mix Tag RT and a Palletize Item cannot be accessed<br />MIXED用RT材、パレタイズ対象品にアクセスできない場合
     */
    protected void createWs2503PltzItemPkgByMixTag(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();
        BigDecimal brch = searchMaxBrchPlusOne(mainMark);

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()){
            String mixTagFlg = internalVariableDtl.getMixTagFlg();

            if(FLAG_Y.compareTo(mixTagFlg) == 0){
                // Acquisition of Mix Tag RT
                // MIXED用RT材の取得
                TtMixtagRtCriteriaDomain ttMixtagRtCriteria = new TtMixtagRtCriteriaDomain();
                ttMixtagRtCriteria.setMixTagNo(internalVariableDtl.getItemNo());

                List<TtMixtagRtDomain> ttMixtagRtList = ttMixtagRtService.searchByCondition(ttMixtagRtCriteria);

                for (TtMixtagRtDomain ttMixtagRt : ttMixtagRtList){
                    // Registration of Palletize Item
                    // パレタイズ対象品の登録
                    TtPltzItemDomain ttPltzItem = new TtPltzItemDomain();
                    ttPltzItem.setMainMark(mainMark);
                    ttPltzItem.setBrch(brch);
                    ttPltzItem.setPltzItemNo(ttMixtagRt.getPkgItemNo());
                    ttPltzItem.setPkgCd(" ");
                    ttPltzItem.setItemDescription(ttMixtagRt.getPkgNm());
                    ttPltzItem.setQty(ttMixtagRt.getQty());
                    ttPltzItem.setQtyUnit(QTY_UNIT_EA);
                    ttPltzItem.setItemTyp(ITEM_TYP_PKG_MATERIALS);
                    ttPltzItem.setNetWeight(ttMixtagRt.getQty().multiply(ttMixtagRt.getPkgWeight()));
                    checkWeightOverflow(ttPltzItem.getNetWeight(), new String[] {getResource("label.netWeight")});
                    ttPltzItem.setItemWeight(ttMixtagRt.getPkgWeight());
                    ttPltzItem.setWeightUnit(ttMixtagRt.getWeightUnit());
                    ttPltzItem.setPkgTyp(PKG_TYP_INNER);
                    ttPltzItem.setModelCd(ttMixtagRt.getModelCd());
                    ttPltzItem.setDngrItemFlg(FLAG_N);
                    ttPltzItem.setOriginCntryCd(ttMixtagRt.getOriginCntryCd());
                    ttPltzItem.setCurrCd(ttMixtagRt.getCurrCd());
                    ttPltzItem.setRtFlg(ttMixtagRt.getRtFlg());
                    ttPltzItem.setKitFlg(FLAG_N);
                    ttPltzItem.setMixTagNo(ttMixtagRt.getMixTagNo());
                    ttPltzItem.setParFlg(FLAG_Y);
                    ttPltzItem.setInputMethTyp(INPUT_METH_TYP_AUTO);
                    setCommonPropertyForRegist(ttPltzItem, dscId, criteria.getScreenId());

                    ttPltzItemService.create(ttPltzItem);

                    brch = brch.add(BigDecimal.ONE);

                    if (FLAG_Y.compareTo(ttMixtagRt.getRtFlg()) == 0){
                        criteria.setRtUseFlg(FLAG_Y);
                    }
                }
            }
        }
    }
    /**
     * Register a Packing material (registration of the data acquired from exterior cases).
     * <br />包装材を登録（外装材から取得したデータの登録）します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a packing combination master (details), a PKG Materials MA, a PKG Materials Name MA, a NEXUS Company Master, and a Palletize Item cannot be accessed
     *                              <br />包装組合せ原単位（明細）、包装材原単位、包装材名称原単位、NEXUS会社原単位、パレタイズ対象品にアクセスできない場合
     */
    protected void createWs2503PltzItemPkgByOuterPkg(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();
        String outerPkgCd = criteria.getWs2503InternalVariableHdrDomain().getOuterPkgCd();

        if (!CheckUtil.isBlankOrNull(outerPkgCd)){
            BigDecimal brch = searchMaxBrchPlusOne(mainMark);

            // packing combination master (details), a PKG Materials MA, a PKG Materials Name MA, NEXUS-Company-Master acquisition
            // 包装組合せ原単位（明細）、包装材原単位、包装材名称原単位、NEXUS会社原単位取得
            Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain pkgSetMaterialsNxsCompNmCriteria = new Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain();
            pkgSetMaterialsNxsCompNmCriteria.setOwnerComp(criteria.getWs2503InternalVariableHdrDomain().getShipperCd());
            pkgSetMaterialsNxsCompNmCriteria.setOuterCd(criteria.getWs2503InternalVariableHdrDomain().getOuterPkgCd());

            List<? extends Ws2501PkgSetMaterialsNxsCompNmDomain> pkgSetMaterialsNxsCompNmList
                = wsBhtEisProductDao.searchPkgSetMaterialsNxsCompNm(pkgSetMaterialsNxsCompNmCriteria);

            for (Ws2501PkgSetMaterialsNxsCompNmDomain pkgSetMaterialsNxsCompNm : pkgSetMaterialsNxsCompNmList){
                // Registration of Palletize Item
                // パレタイズ対象品の登録
                TtPltzItemDomain ttPltzItem = new TtPltzItemDomain();
                ttPltzItem.setMainMark(mainMark);
                ttPltzItem.setBrch(brch);
                ttPltzItem.setPltzItemNo(pkgSetMaterialsNxsCompNm.getPkgItemNo());
                ttPltzItem.setPkgCd(" ");
                ttPltzItem.setItemDescription(pkgSetMaterialsNxsCompNm.getPkgNm());
                ttPltzItem.setQty(pkgSetMaterialsNxsCompNm.getUseQty());
                ttPltzItem.setQtyUnit(QTY_UNIT_EA);
                ttPltzItem.setItemTyp(ITEM_TYP_PKG_MATERIALS);
                ttPltzItem.setNetWeight(pkgSetMaterialsNxsCompNm.getUseQty().multiply(pkgSetMaterialsNxsCompNm.getPkgWeight()));
                checkWeightOverflow(ttPltzItem.getNetWeight(), new String[] {getResource("label.netWeight")});
                ttPltzItem.setItemWeight(pkgSetMaterialsNxsCompNm.getPkgWeight());
                ttPltzItem.setWeightUnit(pkgSetMaterialsNxsCompNm.getWeightUnit());
                ttPltzItem.setPkgTyp(PKG_TYP_OUTER);
                ttPltzItem.setModelCd(pkgSetMaterialsNxsCompNm.getModelCd());
                ttPltzItem.setDngrItemFlg(FLAG_N);
                ttPltzItem.setOriginCntryCd(pkgSetMaterialsNxsCompNm.getOriginCntry());
                ttPltzItem.setCurrCd(pkgSetMaterialsNxsCompNm.getCurrCd());
                if (RT_TYP_1WAY.compareTo(pkgSetMaterialsNxsCompNm.getRtTyp()) == 0){
                    ttPltzItem.setRtFlg(FLAG_N);
                } else {
                    ttPltzItem.setRtFlg(FLAG_Y);
                    criteria.setRtUseFlg(FLAG_Y);
                }
                ttPltzItem.setKitFlg(FLAG_N);
                ttPltzItem.setParFlg(FLAG_Y);
                ttPltzItem.setKitParItemNo(pkgSetMaterialsNxsCompNm.getPkgItemNo());
                ttPltzItem.setInputMethTyp(INPUT_METH_TYP_AUTO);
                setCommonPropertyForRegist(ttPltzItem, dscId, criteria.getScreenId());

                ttPltzItemService.create(ttPltzItem);

                brch = brch.add(BigDecimal.ONE);
            }
        }
    }
    /**
     * Register a Packing material (registration of a dummy Packing material).
     * <br />包装材を登録（ダミー包装材の登録）します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a PKG Materials MA, a PKG Materials Name MA, a NEXUS Company Master, and a Palletize Item cannot be referred to
     *                              <br />包装材原単位、包装材名称原単位、NEXUS会社原単位、パレタイズ対象品を参照できない場合
     */
    protected void createWs2503PltzItemPkgByDummyPkg(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();
        String shipperCd = criteria.getWs2503InternalVariableHdrDomain().getShipperCd();

        BigDecimal brch = searchMaxBrchPlusOne(mainMark);

        for (Ws2501PkgItemNoDomain pkgItemNoDomain : criteria.getWs2503PkgItemNoList()){
            // Acquisition of PKG Materials MA, a PKG Materials Name MA, and a NEXUS Company Master
            // 包装材原単位、包装材名称原単位、NEXUS会社原単位の取得
            Ws2501PkgMaterialsCriteriaDomain pkgMaterialsCriteria = new Ws2501PkgMaterialsCriteriaDomain();
            pkgMaterialsCriteria.setOwnerComp(shipperCd);
            pkgMaterialsCriteria.setPkgItemNo(pkgItemNoDomain.getPkgItemNo());

            Ws2501PkgMaterialsDomain pkgMaterials = wsBhtEisProductDao.searchPkgMaterials(pkgMaterialsCriteria);

            // Registration of Palletize Item
            // パレタイズ対象品の登録
            TtPltzItemDomain ttPltzItem = new TtPltzItemDomain();
            ttPltzItem.setMainMark(mainMark);
            ttPltzItem.setBrch(brch);
            ttPltzItem.setPltzItemNo(pkgMaterials.getPkgItemNo());
            ttPltzItem.setPkgCd(" ");
            ttPltzItem.setItemDescription(pkgMaterials.getPkgNm());
            ttPltzItem.setQty(pkgItemNoDomain.getPkgQty());
            ttPltzItem.setQtyUnit(QTY_UNIT_EA);
            ttPltzItem.setItemTyp(ITEM_TYP_PKG_MATERIALS);
            ttPltzItem.setNetWeight(pkgItemNoDomain.getPkgQty().multiply(pkgMaterials.getPkgWeight()));
            checkWeightOverflow(ttPltzItem.getNetWeight(), new String[] {getResource("label.netWeight")});
            ttPltzItem.setItemWeight(pkgMaterials.getPkgWeight());
            ttPltzItem.setWeightUnit(pkgMaterials.getWeightUnit());
            ttPltzItem.setPkgTyp(PKG_TYP_DUMMY);
            ttPltzItem.setModelCd(pkgMaterials.getModelCd());
            ttPltzItem.setDngrItemFlg(FLAG_N);
            ttPltzItem.setOriginCntryCd(pkgMaterials.getOriginCntry());
            ttPltzItem.setCurrCd(pkgMaterials.getCurrCd());
            if (RT_TYP_1WAY.compareTo(pkgMaterials.getRtTyp()) == 0){
                ttPltzItem.setRtFlg(FLAG_N);
            } else {
                ttPltzItem.setRtFlg(FLAG_Y);
                criteria.setRtUseFlg(FLAG_Y);
            }
            ttPltzItem.setKitFlg(FLAG_N);
            ttPltzItem.setParFlg(FLAG_Y);
            ttPltzItem.setKitParItemNo(pkgMaterials.getPkgItemNo());
            ttPltzItem.setInputMethTyp(INPUT_METH_TYP_MANUAL);
            setCommonPropertyForRegist(ttPltzItem, dscId, criteria.getScreenId());

            ttPltzItemService.create(ttPltzItem);

            brch = brch.add(BigDecimal.ONE);
        }
    }

    /**
     * Register Palletize-Item-KANBAN data.
     * <br />パレタイズ対象品かんばん情報データを登録します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a MIX tag cannot be accessed at a link KANBAN information and a Palletize Item KANBAN
     *                              <br />MIXタグに紐づくかんばん情報、パレタイズ対象品かんばん情報にアクセスできない場合
     */
    protected void createWs2503Kanban(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();

        // This is registration of a link KANBAN information to ITEM NO.
        // 品目番号に紐づくかんばん情報の登録
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()){
            if (FLAG_Y.equals(internalVariableDtl.getMixTagFlg())) {
                continue;
            }
            int cnt = 0;
            for (Ws2501InternalVariableDtlKanbanDomain internalVariableDtlKanban : internalVariableDtl.getInternalVariableDtlKanbanDomainList()){
                TtPltzKanbanDomain ttPltzKanban = new TtPltzKanbanDomain();
                ttPltzKanban.setMainMark(mainMark);
                ttPltzKanban.setBrch(internalVariableDtl.getSeq());
                ttPltzKanban.setKanbanSeqNo(BigDecimal.valueOf(++cnt));
                ttPltzKanban.setExpIndusTypCd(internalVariableDtlKanban.getExpIndusTypCd());
                ttPltzKanban.setExpKanbanTyp(internalVariableDtlKanban.getExpKanbanTyp());
                ttPltzKanban.setExpRegulateNo(internalVariableDtlKanban.getTagSeqNo());
                ttPltzKanban.setQty(internalVariableDtlKanban.getQty());
                setCommonPropertyForRegist(ttPltzKanban, dscId, criteria.getScreenId());

                ttPltzKanbanService.create(ttPltzKanban);
            }
        }

        // This is registration of a link KANBAN information to a MIX tag.
        // MIXタグに紐づくかんばん情報の登録
        for (Ws2501InternalVariableDtlDomain internalVariableMixItemNo : criteria.getWs2503InternalVariableMixItemNoDomainList()){
            // Mix-Tag-KANBAN acquisition
            // MIX品かんばん情報取得
            TtMixKanbanCriteriaDomain ttMixKanbanCriteria = new TtMixKanbanCriteriaDomain();
            ttMixKanbanCriteria.setMixTagNo(internalVariableMixItemNo.getMixTagNo());
            ttMixKanbanCriteria.setItemNo(internalVariableMixItemNo.getItemNo());
            ttMixKanbanCriteria.setPkgCd(internalVariableMixItemNo.getPkgCd());

            List<TtMixKanbanDomain> ttMixKanbanList = ttMixKanbanService.searchByCondition(ttMixKanbanCriteria);

            BigDecimal seq = internalVariableMixItemNo.getSeq();

            for (TtMixKanbanDomain ttMixKanban : ttMixKanbanList){
                // Palletize-Item-KANBAN registration
                // パレタイズ対象品かんばん情報登録
                TtPltzKanbanDomain ttPltzKanban = new TtPltzKanbanDomain();
                ttPltzKanban.setMainMark(mainMark);
                ttPltzKanban.setBrch(seq);
                ttPltzKanban.setKanbanSeqNo(ttMixKanban.getKanbanSeqNo());
                ttPltzKanban.setExpIndusTypCd(ttMixKanban.getExpIndusTypCd());
                ttPltzKanban.setExpKanbanTyp(ttMixKanban.getExpKanbanTyp());
                ttPltzKanban.setExpRegulateNo(ttMixKanban.getExpRegulateNo());
                ttPltzKanban.setQty(ttMixKanban.getQty());
                ttPltzKanban.setImpIndusTypCd(ttMixKanban.getImpIndusTypCd());
                ttPltzKanban.setImpKanbanTyp(ttMixKanban.getImpKanbanTyp());
                ttPltzKanban.setImpRegulateNo(ttMixKanban.getImpRegulateNo());
                setCommonPropertyForRegist(ttPltzKanban, dscId, criteria.getScreenId());

                ttPltzKanbanService.create(ttPltzKanban);
            }
        }
    }

    /* 7/2/2017 DIAT yamamoto add */
    /**
     * Register Palletize-Item-KANBAN data(For Asia).
     * <br />パレタイズ対象品かんばん情報データを登録します(Asia固有ロジック)。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Palletize Item KANBAN cannot be accessed at a link KANBAN information
     *                              <br />パレタイズ対象品かんばん情報にアクセスできない場合
     */
    @SuppressWarnings("unchecked")
    protected void createWs2503KanbanExtra(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();
        
        // This is registration of a link KANBAN information to ITEM NO.
        // 品目番号に紐づくかんばん情報の登録
        
        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()){
            if (FLAG_Y.equals(internalVariableDtl.getMixTagFlg())) {
                continue;
            }
            int cnt = 0;
            for (Ws2501InternalVariableDtlKanbanAsiaDomain internalVariableDtlKanban : (List<Ws2501InternalVariableDtlKanbanAsiaDomain>)internalVariableDtl.getInternalVariableDtlKanbanDomainList()){
                TtPltzKanbanExtraDomain ttPltzKanbanExtra = new TtPltzKanbanExtraDomain();
                ttPltzKanbanExtra.setMainMark(mainMark);
                ttPltzKanbanExtra.setBrch(internalVariableDtl.getSeq());
                ttPltzKanbanExtra.setKanbanSeqNo(BigDecimal.valueOf(++cnt));
                ttPltzKanbanExtra.setExpIndusTypCd(internalVariableDtlKanban.getExpIndusTypCd());
                ttPltzKanbanExtra.setExpKanbanTyp(internalVariableDtlKanban.getExpKanbanTyp());
                ttPltzKanbanExtra.setExpRegulateNo(internalVariableDtlKanban.getTagSeqNo());
                ttPltzKanbanExtra.setQty(internalVariableDtlKanban.getQty());
                try{
                    if (internalVariableDtlKanban.getProductDate() != null) {
                        ttPltzKanbanExtra.setProductDate(df
                            .parse(internalVariableDtlKanban.getProductDate()));
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                ttPltzKanbanExtra.setOrderNo(internalVariableDtlKanban.getOrderNo());

                setCommonPropertyForRegist(ttPltzKanbanExtra, dscId, criteria.getScreenId());

                ttPltzKanbanExtraService.create(ttPltzKanbanExtra);
            }
        }
    }

    /**
     * Register Palletize data.
     * <br />パレタイズデータを登録します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When an error cannot occur and update a Palletize by commonService<br />commonServiceでエラーが発生、パレタイズを更新できない場合
     */
    protected void createWs2503Pltz(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        // Acquisition of WEIGHT, a VOLUME, and a LENGTH UNIT
        // 重量・容積・長さ単位の取得
        String shipperWeightUnit = commonService.searchWeightUnit(criteria.getWs2503InternalVariableHdrDomain().getShipperCd());
        String shipperLengthUnit = commonService.searchLengthUnit(criteria.getWs2503InternalVariableHdrDomain().getShipperCd());
        String shipperVolumetUnit = commonService.searchVolumeUnit(criteria.getWs2503InternalVariableHdrDomain().getShipperCd());

        // Acquisition of N/W
        // N/Wの取得
        Ws2501TtPltzItemNwCriteriaDomain ttPltzItemNwCriteria = new Ws2501TtPltzItemNwCriteriaDomain();
        ttPltzItemNwCriteria.setMainMark(mainMark);

        List<? extends Ws2501TtPltzItemNwDomain> ttPltzItemNwList = wsBhtEisProductDao.searchTtPltzItemNw(ttPltzItemNwCriteria);

        String[] nwMsgParams = {getResource("label.netWeight")};
        BigDecimal nw = BigDecimal.ZERO;

        for (Ws2501TtPltzItemNwDomain ttPltzItemNw : ttPltzItemNwList){
            nw = nw.add(convertWeightUnit(ttPltzItemNw.getNetWeight(), ttPltzItemNw.getWeightUnit(), shipperWeightUnit, nwMsgParams));
        }
        checkWeightOverflow(nw, nwMsgParams);

        // Acquisition of G/W
        // G/Wの取得
        Ws2501TtPltzItemGwCriteriaDomain ttPltzItemGwCriteria = new Ws2501TtPltzItemGwCriteriaDomain();
        ttPltzItemGwCriteria.setMainMark(mainMark);

        List<? extends Ws2501TtPltzItemGwDomain> ttPltzItemGwList = wsBhtEisProductDao.searchTtPltzItemGw(ttPltzItemGwCriteria);

        String[] gwMsgParams = {getResource("label.grossWeight")};
        BigDecimal gw = BigDecimal.ZERO;

        for (Ws2501TtPltzItemGwDomain ttPltzItemGw : ttPltzItemGwList){
            gw = gw.add(convertWeightUnit(ttPltzItemGw.getNetWeight(), ttPltzItemGw.getWeightUnit(), shipperWeightUnit, gwMsgParams));
        }
        checkWeightOverflow(gw, gwMsgParams);

        // Acquisition of a DUE DATE
        // 納期の取得
        Ws2501TtPltzItemDeliveryTimeCriteriaDomain ttPltzItemDeliveryTimeCriteria = new Ws2501TtPltzItemDeliveryTimeCriteriaDomain();
        ttPltzItemDeliveryTimeCriteria.setMainMark(mainMark);

        Ws2501TtPltzItemDeliveryTimeDomain ttPltzItemDeliveryTime = wsBhtEisProductDao.searchTtPltzItemDeliveryTime(ttPltzItemDeliveryTimeCriteria);

        // Registration processing (Palletize)
        // 登録処理(パレタイズ)
        String dscId = criteria.getLoginUserDscId();

        TtPltzDomain ttPltzDomain = new TtPltzDomain();
        ttPltzDomain.setMainMark(mainMark);

        Ws2501InternalVariableHdrDomain headerDomain = criteria.getWs2503InternalVariableHdrDomain();
        CommonUtil.copyPropertiesDomainToDomain(ttPltzDomain, criteria.getWs2503InternalVariableDtlDomainList().get(0));
        String plantCd = getPlantCd(criteria.getWs2503InternalVariableDtlDomainList(), criteria.getWs2503InternalVariableMixItemNoDomainList());

        ttPltzDomain.setPalletNo(headerDomain.getPalletNo());
        ttPltzDomain.setShipperCd(headerDomain.getShipperCd());
        ttPltzDomain.setShipToCd(headerDomain.getShipToCd());
        ttPltzDomain.setCustomerCd(headerDomain.getCustomerCd());
        ttPltzDomain.setLgcyShipTo(headerDomain.getLgcyShipTo());
        ttPltzDomain.setTrnsCd(headerDomain.getTrnsCd());
        ttPltzDomain.setTrnsCdOrg(headerDomain.getTrnsCd());
        ttPltzDomain.setReviseFlg(FLAG_N);
        ttPltzDomain.setPlntCd(plantCd);
        ttPltzDomain.setLgcyWhCd(headerDomain.getLgcyWhCd());
        ttPltzDomain.setCurLgcyWhCd(headerDomain.getLgcyWhCd());
        ttPltzDomain.setVariantFlg(FLAG_N);
        ttPltzDomain.setRtUseFlg(criteria.getRtUseFlg());
        ttPltzDomain.setWeightUnit(shipperWeightUnit);
        ttPltzDomain.setNetWeight(nw);
        ttPltzDomain.setGrossWeight(gw);
        ttPltzDomain.setLengthUnit(shipperLengthUnit);
        String[] lengthMsgParams = {getResource("label.length")};
        String[] widthMsgParams = {getResource("label.width")};
        String[] heightMsgParams = {getResource("label.height")};
        if (!CheckUtil.isBlankOrNull(criteria.getOuterCd())){
            ttPltzDomain.setLength(convertLengthUnit(criteria.getLength(), criteria.getLengthUnit(), shipperLengthUnit, lengthMsgParams));
            ttPltzDomain.setWidth(convertLengthUnit(criteria.getWidth(), criteria.getLengthUnit(), shipperLengthUnit, widthMsgParams));
            ttPltzDomain.setHeight(convertLengthUnit(criteria.getHeight(), criteria.getLengthUnit(), shipperLengthUnit, heightMsgParams));
        } else {
            ttPltzDomain.setLength(convertLengthUnit(criteria.getLengthPalletize(), criteria.getLengthUnitPalletize(), shipperLengthUnit, lengthMsgParams));
            ttPltzDomain.setWidth(convertLengthUnit(criteria.getWidthPalletize(), criteria.getLengthUnitPalletize(), shipperLengthUnit, widthMsgParams));
            ttPltzDomain.setHeight(convertLengthUnit(criteria.getHeightPalletize(), criteria.getLengthUnitPalletize(), shipperLengthUnit, heightMsgParams));
        }
        ttPltzDomain.setVolumeUnit(shipperVolumetUnit);
        String[] volMsgParams = {getResource("label.volume")};
        if (!CheckUtil.isBlankOrNull(criteria.getOuterCd())){
            ttPltzDomain.setVolume(convertVolumeUnit(criteria.getVolume(), criteria.getVolumeUnit(), shipperVolumetUnit, volMsgParams));
        } else {
            ttPltzDomain.setVolume(convertVolumeUnit(criteria.getVolumePalletize(), criteria.getVolumeUnitPalletize(), shipperVolumetUnit, volMsgParams));
        }
        ttPltzDomain.setCmlTyp(CML_TYPE_CIGMA);
        ttPltzDomain.setOuterPkgCd(headerDomain.getOuterPkgCd());
        
        // Time zone converted post-date acquisition
        // タイムゾーン変換後日付取得
        String timezoneId = commonService.searchTimezone(headerDomain.getShipperCd());
        Date expPackingDt = DateUtil.convertTime(new Date(), timezoneId);
        expPackingDt = DateUtils.truncate(expPackingDt, Calendar.DAY_OF_MONTH);

        ttPltzDomain.setExpPackingDt(expPackingDt);
        ttPltzDomain.setExpPackingIssuerId(criteria.getLoginUserDscId());

        // Acquisition of a login person name
        // ログイン者名の取得
        TmUserCriteriaDomain tmUserCriteria = new TmUserCriteriaDomain();
        tmUserCriteria.setDscId(dscId);
        TmUserDomain tmUser = tmUserService.searchByKey(tmUserCriteria);

        ttPltzDomain.setExpPackingIssuerNm(tmUser.getUsrNmEn());
        ttPltzDomain.setDueDt(ttPltzItemDeliveryTime.getEtdDueDt());
        ttPltzDomain.setConsigneeCd(headerDomain.getConsigneeCompCd());
        ttPltzDomain.setCommercialFlg(FLAG_Y);
        ttPltzDomain.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttPltzDomain.setPackingWhCompCd(headerDomain.getWhCompCd());
        ttPltzDomain.setPackingWhCd(headerDomain.getWhCd());
        ttPltzDomain.setCurWhCompCd(headerDomain.getWhCompCd());
        ttPltzDomain.setCurWhCd(headerDomain.getWhCd());

        String loadingCd = new String(LOADING_CD_FREE);
        String expLimitFlg = new String(FLAG_N);
        String dngrItemFlg = new String(FLAG_N);
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()){
            if (LOADING_CD_BACK.equals(internalVariableDtl.getLoadingCd())){
                loadingCd = LOADING_CD_BACK;
            } else if (LOADING_CD_DOOR.equals(internalVariableDtl.getLoadingCd())){
                loadingCd = LOADING_CD_DOOR;
            }
            if (!CheckUtil.isBlankOrNull(internalVariableDtl.getExpLimitTyp())){
                expLimitFlg = FLAG_Y;
            }
            if (FLAG_Y.equals(internalVariableDtl.getDngrItemFlg())){
                dngrItemFlg = FLAG_Y;
            }
        }
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableMixItemNoDomainList()){
            if (!CheckUtil.isBlankOrNull(internalVariableDtl.getExpLimitTyp())){
                expLimitFlg = FLAG_Y;
            }
            if (FLAG_Y.equals(internalVariableDtl.getDngrItemFlg())){
                dngrItemFlg = FLAG_Y;
            }
        }
        
        ttPltzDomain.setLoadingCd(loadingCd);
        ttPltzDomain.setExpLimitFlg(expLimitFlg);
        ttPltzDomain.setDngrItemFlg(dngrItemFlg);
        ttPltzDomain.setLastTrStatus(CARRY_OUT_IN_BLANK);
        ttPltzDomain.setExpRequestAllCmlIssuedFlg(FLAG_N);
        ttPltzDomain.setSplitShippingNgFlg(FLAG_N);
        ttPltzDomain.setInvoiceCtgry(IVN_CATEGORY_COMMERCIAL_VALUE);
        ttPltzDomain.setReExpGoodsFlg(FLAG_N);
        ttPltzDomain.setMigrationFlg(FLAG_N);
        ttPltzDomain.setPalletCartonTyp(criteria.getWs2503InternalVariableHdrDomain().getPalletNo().substring(0, 1));
        setCommonPropertyForRegist(ttPltzDomain, dscId, criteria.getScreenId());
        ttPltzService.create(ttPltzDomain);
    }

    
    /**
     * Get PLNT CD from Palletize items for Palletize
     * <br />パレタイズ登録用の工場コード取得
     *
     * @param internalVariableDtlDomainList List of Palletize items<br />パレタイズ対象品(品目リスト)
     * @param internalVariableMixItemNoDomainList List of Palletize mix-tag items<br />パレタイズ対象品(MIXTAG品目リスト)
     * @return PLNT CD<br />工場コード
     */
    protected String getPlantCd(
        List<? extends Ws2501InternalVariableDtlDomain> internalVariableDtlDomainList,
        List<? extends Ws2501InternalVariableDtlDomain> internalVariableMixItemNoDomainList) {

        List<String> plntCdList = new ArrayList<String>();
        for (Ws2501InternalVariableDtlDomain domain : internalVariableDtlDomainList) {
            if (FLAG_N.equals(domain.getMixTagFlg())) {
                if (!plntCdList.contains(domain.getPlntCd())) {
                    plntCdList.add(domain.getPlntCd());
                }
            }
        }
        for (Ws2501InternalVariableDtlDomain domain : internalVariableMixItemNoDomainList) {
            if (!plntCdList.contains(domain.getPlntCd())) {
                plntCdList.add(domain.getPlntCd());
            }
        }
        if (plntCdList.size() == 1) {
            return plntCdList.get(0);
        }
        return null;
    }

    /**
     * Perform a MULTI-ITEM-NO-IN-BOX-STATUS update process.
     * <br />小箱内多品ステータス更新処理を行います。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Mix Tag cannot be accessed<br />MIXED現品票にアクセスできない場合
     */
    protected void updateWs2503MixTagStatus(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        TtMixtagDomain ttMixtag = new TtMixtagDomain();
        ttMixtag.setMixTagStatus(MIX_TAG_STATUS_CML);
        setCommonPropertyForUpdate(ttMixtag, criteria.getLoginUserDscId(), criteria.getScreenId());

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()){
            if (FLAG_Y.equals(internalVariableDtl.getMixTagFlg())){
                TtMixtagCriteriaDomain ttMixtagCriteria = new TtMixtagCriteriaDomain();
                ttMixtagCriteria.setMixTagNo(internalVariableDtl.getItemNo());
                ttMixtagService.updateByCondition(ttMixtag, ttMixtagCriteria);
            }
        }
    }

    /**
     * Update and register a Temp Stock.
     * <br />仮在庫を更新・登録します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Temp Stock cannot be accessed<br />仮在庫にアクセスできない場合
     */
    protected void transactTmpStk(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2503InternalVariableHdrDomain();

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2503InternalVariableDtlDomainList()){

            if (!FLAG_N.equals(internalVariableDtl.getMixTagFlg())) {
                continue;
            }

            TtTmpStockCriteriaDomain ttTmpStockCriteriaUpdate = new TtTmpStockCriteriaDomain();
            ttTmpStockCriteriaUpdate.setShipperCd(internalVariableHdr.getShipperCd());
            ttTmpStockCriteriaUpdate.setLgcyWhCd(internalVariableHdr.getLgcyWhCd());
            ttTmpStockCriteriaUpdate.setItemNo(internalVariableDtl.getItemNo());
            ttTmpStockCriteriaUpdate.setPkgCd(internalVariableDtl.getPkgCd());

            TtTmpStockDomain ttTmpStock = ttTmpStockService.lockByKeyNoWait(ttTmpStockCriteriaUpdate);

            if (ttTmpStock != null) {
                TtTmpStockDomain ttTmpStockUpdate = new TtTmpStockDomain();
                ttTmpStockUpdate.setQty(ttTmpStock.getQty().add(internalVariableDtl.getQty()));
                setCommonPropertyForUpdate(ttTmpStockUpdate, criteria.getLoginUserDscId(), criteria.getScreenId());
                ttTmpStockService.updateByCondition(ttTmpStockUpdate, ttTmpStockCriteriaUpdate);
            } else {
                TtTmpStockDomain ttTmpStockCreate = new TtTmpStockDomain();
                CommonUtil.copyPropertiesDomainToDomain(ttTmpStockCreate, ttTmpStockCriteriaUpdate);
                ttTmpStockCreate.setQty(internalVariableDtl.getQty());
                setCommonPropertyForRegist(ttTmpStockCreate, criteria.getLoginUserDscId(), criteria.getScreenId());
                ttTmpStockService.create(ttTmpStockCreate);
            }
        }
    }

    /**
     * Register an ordering alloc track record (starting of Web service).
     * <br />受注引当実績を登録（Webサービスの起動）します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @return Web service processing result<br />Webサービス処理結果
     * @throws ApplicationException When an error unexpected by Web service occurs<br />Webサービスで予期せぬエラーが発生した場合
     */
    protected boolean createRcvOdrAlloc(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        List<Ws2005ParamItemDomain> ws2005ParamItemList = new ArrayList<Ws2005ParamItemDomain>();

        for (TtPltzItemOdrDomain pltzItemOdr : criteria.getTtPltzItemOdrList()) {
            Ws2005ParamItemDomain ws2005ParamItem = new Ws2005ParamItemDomain();
            ws2005ParamItem.setCustomerNo(pltzItemOdr.getCustomerCd());
            ws2005ParamItem.setShipTo(pltzItemOdr.getLgcyShipTo());
            ws2005ParamItem.setPN(pltzItemOdr.getItemNo());
            ws2005ParamItem.setTransWayCd(pltzItemOdr.getTrnsCd());
            ws2005ParamItem.setEtdDueDt(DateUtil.formatDate(pltzItemOdr.getEtdDueDt(), WS_CIGMA_DATE_FORMAT));
            ws2005ParamItem.setCustomerPoNo(pltzItemOdr.getCustomerPoNo());
            ws2005ParamItem.setCustomerPn(pltzItemOdr.getCustomerItemNo());
            ws2005ParamItem.setOdrCtrlNo(String.valueOf(pltzItemOdr.getOdrCtrlNo()));
            ws2005ParamItem.setCustomerPnOrg(pltzItemOdr.getCustomerItemNoOrg());
            ws2005ParamItem.setShipInstrAllocQty(String.valueOf(pltzItemOdr.getAllocQty()));
            ws2005ParamItemList.add(ws2005ParamItem);
        }

        return createRcvOdrAlloc(criteria.getWs2503InternalVariableHdrDomain().getShipperCd(), ws2005ParamItemList);
    }

    /**
     * Register a BHT productivity data information.
     * <br />BHT生産性データ情報を登録します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a BHT Work Time, a BHT Work Time For Palletize, and a BHT Work Error cannot be accessed
     *                              <br />BHT作業時間、BHT作業情報テーブル(パレタイズ)、BHT作業エラーにアクセスできない場合
     */
    protected void createWs2503BhtInfo(String mainMark, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        String dscId = criteria.getLoginUserDscId();

        // Acquisition of user's information
        // ユーザー情報の取得
        TmUserConfCriteriaDomain tmUserConfCriteria  = new TmUserConfCriteriaDomain();
        tmUserConfCriteria.setDscId(dscId);
        TmUserConfDomain tmUserConf = tmUserConfService.searchByKey(tmUserConfCriteria);

        //  -------------------------------------------------------------------

        // Registration of BHT-Work-Time table
        // BHT作業時間テーブルの登録
        BigDecimal workTimeNo = wsBhtEisProductDao.searchNextWorkTimeNo();
        Date workTimeStrt = parseDate(criteria.getWorkTimeStrt());
        Date workTimeEnd  = parseDate(criteria.getWorkTimeEnd());
        BigDecimal errCnt = new BigDecimal(criteria.getWs2503ProductivityDataInfoList().size());

        TtBhtWorkTimeDomain ttBhtWorkTime = new TtBhtWorkTimeDomain();
        ttBhtWorkTime.setWorkTimeNo(workTimeNo);
        ttBhtWorkTime.setCompCd(tmUserConf.getCompCd());
        ttBhtWorkTime.setDscId(dscId);
        ttBhtWorkTime.setShipperCd(criteria.getWs2503InternalVariableHdrDomain().getShipperCd());
        ttBhtWorkTime.setWhCompCd(criteria.getWs2503InternalVariableHdrDomain().getWhCompCd());
        ttBhtWorkTime.setWhCd(criteria.getWs2503InternalVariableHdrDomain().getWhCd());
        ttBhtWorkTime.setWorkTyp(WORK_TYP_CML_CIGMA);
        ttBhtWorkTime.setWorkTimeStrt(workTimeStrt);
        ttBhtWorkTime.setWorkTimeEnd(workTimeEnd);
        ttBhtWorkTime.setWorkTime(duration(workTimeStrt,  workTimeEnd));
        ttBhtWorkTime.setResultKey(mainMark);
        ttBhtWorkTime.setErrCnt(errCnt);

        setCommonPropertyForRegist(ttBhtWorkTime, dscId, criteria.getScreenId());

        ttBhtWorkTimeService.create(ttBhtWorkTime);

        //  -------------------------------------------------------------------

        // Registration of BHT Work Time For Palletize
        // BHT作業情報テーブル(パレタイズ)の登録
        TtBhtWorkPltzDomain ttBhtWorkPltz = new TtBhtWorkPltzDomain();
        ttBhtWorkPltz.setWorkTimeNo(workTimeNo);
        ttBhtWorkPltz.setPkgFormTyp(criteria.getWs2503InternalVariableDtlDomainList().get(0).getPkgFormTyp());
        ttBhtWorkPltz.setPltzTagQty(new BigDecimal(criteria.getWs2503ItemNoList().size()));
        setCommonPropertyForRegist(ttBhtWorkPltz, dscId, criteria.getScreenId());

        ttBhtWorkPltzService.create(ttBhtWorkPltz);

        //  -------------------------------------------------------------------

        // Registration of BHT-Work-Error table
        // BHT作業エラーテーブルの登録
        BigDecimal brch = BigDecimal.ONE;

        for (Ws2501ProductivityDataInfoDomain productivityDataInfo : criteria.getWs2503ProductivityDataInfoList()) {

            workTimeStrt =  parseDate(productivityDataInfo.getWorkTimeStrt());
            workTimeEnd  =  parseDate(productivityDataInfo.getWorkTimeEnd());

            TtBhtWorkErrDomain ttBhtWorkErr = new TtBhtWorkErrDomain();
            ttBhtWorkErr.setWorkTimeNo(workTimeNo);
            ttBhtWorkErr.setBrch(brch);
            ttBhtWorkErr.setScreenId(productivityDataInfo.getScreenId());
            ttBhtWorkErr.setMsgId(productivityDataInfo.getMsgId());
            ttBhtWorkErr.setLockFlg(productivityDataInfo.getLockFlg());
            ttBhtWorkErr.setWorkTimeStrt(workTimeStrt);
            ttBhtWorkErr.setWorkTimeEnd(workTimeEnd);
            ttBhtWorkErr.setWorkTime(duration(workTimeStrt, workTimeEnd));

            setCommonPropertyForRegist(ttBhtWorkErr, dscId, criteria.getScreenId());

            ttBhtWorkErrService.create(ttBhtWorkErr);
            brch = brch.add(BigDecimal.ONE);
        }
    }

    // --------------------------------- ECA0027_WS_2504_Create E-RT Palletize -------------------------------------------
    /**
     * [ws2504] L/D CD's existence check
     * <br />[ws2504]荷積位置コードの存在チェック
     *
     * <pre>
     * - Also when there is an error on the way, all the checks are performed.
     *     All the check sets '1' (abnormal end) to a CD as a result of the internal variable ., when an after-completion error is also one.
     *     An execution result is outputted.
     *
     * - 途中でエラーがあった場合も全てのチェックを行う。
     *   全てのチェックが完了後エラーが1つでもあった場合は内部変数.結果コードに'1'（異常終了）をセットし
     *   実行結果を出力する
     * </pre>
     *
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @param loadingCd L/D CD<br />荷積位置コード
     * @return Checked result<br />チェック結果
     * @throws ApplicationException Application exception<br />アプリケーション例外
     */
    public boolean validateDatabaseLoadPositionCd(String languageCd, String loadingCd) throws ApplicationException {

        // 29 L/D CDs
        // 29 荷積位置コード

        // Setting of a search condition
        // 検索条件の設定
        TmCdCriteriaDomain criteria = new TmCdCriteriaDomain();
        criteria.setLngCd(languageCd);
        criteria.setCdTyp(CD_TYPE_LOADING_CD);
        criteria.setCd(loadingCd);

        // Acquisition of data
        // データの取得
        TmCdDomain result =  tmCdService.searchByKey(criteria);
        if (result == null) {
            return false;
        }
        return true;
    }

    /**
     * [ws2504] TRANSPORT CODE's existence check
     * <br />[ws2504]輸送手段コードの存在チェック
     *
     * <pre>
     * - Also when there is an error on the way, all the checks are performed.
     *     All the check sets '1' (abnormal end) to a CD as a result of the internal variable ., when an after-completion error is also one.
     *     An execution result is outputted.
     *
     * - 途中でエラーがあった場合も全てのチェックを行う。
     *   全てのチェックが完了後エラーが1つでもあった場合は内部変数.結果コードに'1'（異常終了）をセットし
     *   実行結果を出力する
     * </pre>
     *
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @param trnsCd TRANSPORT CODE<br />輸送手段コード
     * @return Checked result<br />チェック結果
     * @throws ApplicationException The exception of application<br />アプリケーションの例外
     */
    public boolean validateDatabaseTransWayCd(String languageCd, String trnsCd) throws ApplicationException {

        // 12 TRANSPORT CODEs
        // 12 輸送手段コード

        // Setting of a search condition
        // 検索条件の設定
        TmCdCriteriaDomain criteria = new TmCdCriteriaDomain();
        criteria.setLngCd(languageCd);
        criteria.setCdTyp(CD_TYPE_TRANS_CD);
        criteria.setCd(trnsCd);

        // Acquisition of data
        // データの取得
        TmCdDomain result =  tmCdService.searchByKey(criteria);
        if (result == null) {
            return false;
        }
        return true;
    }

    /**
     * [ws2504] Freight-Res conditions' existence check
     * <br />[ws2504]運賃支払い条件の存在チェック
     *
     * <pre>
     * - Also when there is an error on the way, all the checks are performed.
     *     All the check sets '1' (abnormal end) to a CD as a result of the internal variable ., when an after-completion error is also one.
     *     An execution result is outputted.
     *
     * - 途中でエラーがあった場合も全てのチェックを行う。
     *   全てのチェックが完了後エラーが1つでもあった場合は内部変数.結果コードに'1'（異常終了）をセットし
     *   実行結果を出力する
     * </pre>
     *
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @param payTerms Freight-Res conditions<br />運賃支払い条件
     * @return Checked result<br />チェック結果
     * @throws ApplicationException The exception of application<br />アプリケーションの例外
     */
    public boolean validateDatabasePayFare(String languageCd, String payTerms) throws ApplicationException {

        // 54 FREIGHT PAYMENT TERMS
        // 54 運賃支払条件

        // Setting of a search condition
        // 検索条件の設定
        TmCdCriteriaDomain criteria = new TmCdCriteriaDomain();
        criteria.setLngCd(languageCd);
        criteria.setCdTyp(CD_TYPE_FREIGHT_RESPONSIBLE);
        criteria.setCd(payTerms);

        // Acquisition of data
        // データの取得
        TmCdDomain result =  tmCdService.searchByKey(criteria);
        if (result == null) {
            return false;
        }
        return true;
    }

    /**
     * [ws2504] PRICE TERMS's existence check
     * <br />[ws2504]建値区分の存在チェック
     *
     * <pre>
     * - Also when there is an error on the way, all the checks are performed.
     *     All the check sets '1' (abnormal end) to a CD as a result of the internal variable ., when an after-completion error is also one.
     *     An execution result is outputted.
     *
     * - 途中でエラーがあった場合も全てのチェックを行う。
     *   全てのチェックが完了後エラーが1つでもあった場合は内部変数.結果コードに'1'（異常終了）をセットし
     *   実行結果を出力する
     * </pre>
     *
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @param priceTerms PRICE TERMS<br />建値区分
     * @return Checked result<br />チェック結果
     * @throws ApplicationException The exception of application<br />アプリケーションの例外
     */
    public boolean validateDatabaseQuotesCd(String languageCd, String priceTerms) throws ApplicationException {

        // 15 PRICE TERMS
        // 15 建値区分

        // Setting of a search condition
        // 検索条件の設定
        TmCdCriteriaDomain criteria = new TmCdCriteriaDomain();
        criteria.setLngCd(languageCd);
        criteria.setCdTyp(CD_TYPE_PRICE_TERMS);
        criteria.setCd(priceTerms);

        // Acquisition of data
        // データの取得
        TmCdDomain result =  tmCdService.searchByKey(criteria);
        if (result == null) {
            return false;
        }
        return true;
    }

    /**
     * [ws2504] Export Ship To Shipping Master's existence check
     * <br />[ws2504]輸出送荷先出荷原単位の存在チェック
     *
     * <pre>
     * - This is confirmed whether the combination of the Shipper CD read into the Export Ship To Shipping Master and a SHIP TO CODE (between bases) exists.
     *
     * - 輸出送荷先出荷原単位に読み込んだ荷主コード、送荷先コード(拠点間)の組合せが存在するかをチェックする
     * </pre>
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param shipToCd SHIP TO CODE (between bases)<br />送荷先コード(拠点間)
     * @return Checked result<br />チェック結果
     * @throws ApplicationException Application exception<br />アプリケーション例外
     */
    public boolean validateDatabaseTmExpShipToShippingOnErtPltz(
        String shipperCd, String shipToCd) throws ApplicationException {

        // Time zone converted post-date acquisition
        // タイムゾーン変換後日付取得
        String timezoneId = commonService.searchTimezone(shipperCd);
        Date aplyStrtDt = DateUtil.convertTime(new Date(), timezoneId);

        TmExpShipToShippingCriteriaDomain criteria = new TmExpShipToShippingCriteriaDomain();
        criteria.setCompCd(shipperCd);
        criteria.setShipToCd(shipToCd);
        criteria.setAplyStrtDtLessThanEqual(aplyStrtDt);
        List<TmExpShipToShippingDomain> list = tmExpShipToShippingService.searchByCondition(criteria);
        if (list == null || list.size() == 0) {
            return false;
        }
        return true;
    }

    /**
     * [ws2504] Ship-to master COMPANY CODE's existence check
     * <br />[ws2504]送荷先原単位会社コードの存在チェック
     *
     * <pre>
     * - A Ship-to master COMPANY CODE's existence check is performed.
     *
     * - 送荷先原単位会社コードの存在チェックを行う
     * </pre>
     *
     * @param shipToCd SHIP TO CODE (between bases)<br />送荷先コード(拠点間)
     * @return Checked result<br />チェック結果
     * @throws ApplicationException Application exception<br />アプリケーション例外
     */
    public boolean validateDatabaseTmNxsShipToOnErtPltz(
        String shipToCd) throws ApplicationException {

        TmNxsShipToCriteriaDomain criteria = new TmNxsShipToCriteriaDomain();
        criteria.setShipToCd(shipToCd);
        TmNxsShipToDomain domain = tmNxsShipToService.searchByKey(criteria);
        if (domain == null) {
            return false;
        }
        return true;
    }

    /**
     * [ws2504] unit's existence check
     * <br />[ws2504]単位の存在チェック
     *
     * <pre>
     *
     * Confirm whether to exist in a Measure Unit Master about the WEIGHT UNIT of a parameter, a LENGTH UNIT, and a Unit of Vol.
     * - W/H Company CD (between bases)
     * - The check of W/H CD (between bases)
     *
     * パラメタの重量単位、長さ単位、容積単位について、計量単位原単位に存在するかそれぞれチェックをする
     * - 倉庫会社コード(拠点間)
     * - 倉庫コード(拠点間)のチェック
     *
     * </pre>
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param weightUnit WEIGHT UNIT<br />重量単位
     * @param lengthUnit LENGTH UNIT<br />長さ単位
     * @param volumeUnit Unit of Vol.<br />容積単位
     * @return Checked result<br />チェック結果
     * @throws ApplicationException Application exception<br />アプリケーション例外
     */
    public int validateDatabaseTmNxsCompOnErtPltz(
        String shipperCd,
        String weightUnit,
        String lengthUnit,
        String volumeUnit) throws ApplicationException {

        // Company master
        // 会社原単位
        TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteria.setCompCd(shipperCd);
        TmNxsCompDomain tmNxsComp = this.tmNxsCompService.searchByKey(tmNxsCompCriteria);
        if (!CheckUtil.isBlankOrNull(weightUnit) && !weightUnit.equals(tmNxsComp.getWeightUnit())) {
            return 1;
        }
        if (!CheckUtil.isBlankOrNull(lengthUnit) && !lengthUnit.equals(tmNxsComp.getLengthUnit())) {
            return 2;
        }
        if (!CheckUtil.isBlankOrNull(volumeUnit) && !volumeUnit.equals(tmNxsComp.getVolumeUnit())) {
            return 3;
        }
        return 0;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmNxsWhOnErtPltz(java.lang.String, java.lang.String)
     */

    public boolean validateDatabaseTmNxsWhOnErtPltz(String compCd, String whCd)
        throws ApplicationException {

        return commonService.validateCompWh(compCd, whCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseShipperWhPlant(String, String, String, List, List)
     */
    public boolean validateDatabaseShipperWhPlant(
        String shipperCd,
        String whCompCd,
        String lgcyWhCd,
        List<? extends Ws2504PkgItemNoCriteriaDomain> pkgItemNoList,
        List<String> resultList) throws ApplicationException {

        TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteria.setCompCd(shipperCd);
        TmNxsCompDomain tmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteria);
        
        if (tmNxsCompDomain == null) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            Object[] params = {shipperCd};
            errorList.add(new MessageDomain("", NXS_E1_5007, params));
            throw new ValidationException(errorList);
        }
        
        TmPkgMtrlCriteriaDomain criteria = new TmPkgMtrlCriteriaDomain();
        
        criteria.setOwnerComp(shipperCd);

        boolean blRet = true;
        String firstCurrCd = "";
        for (int i = 0; i < pkgItemNoList.size(); i++) {

            Ws2504PkgItemNoCriteriaDomain ws2504criteria = pkgItemNoList.get(i);

            // PKG_MATERIAL_PN    This screen [42]:Contents1_PKG_Item_No (*)
            // PKG_MATERIAL_PN  本画面【42】：Contents1_PKG_Item_No（※）
            criteria.setPkgItemNo(ws2504criteria.getPkgItemNo());
            TmPkgMtrlDomain domain = tmPkgMtrlService.searchByKey(criteria);
            if (domain == null) {
                resultList.add("1");
                blRet = false;
                continue;
            }
            // The CURRENCY CODE of the PACKAGE ITEM NO of head is made positive.
            // 先頭の包装材品番の通貨コードを正とする
            if (StringUtils.isEmpty(firstCurrCd)) {
                firstCurrCd = domain.getCurrCd();
            }
            // RT material check
            // RT_TYP of corresponding data = 1 (1WAY)
            // RT材チェック
            // 該当データのRT_TYP = 1 (1WAY)
            if (RT_TYP_1WAY.equals(domain.getRtTyp())) {
                resultList.add("2");
                blRet = false;
                continue;
            }
            // CURRENCY-CODE coincidence check
            // When CURRENCY_CD of corresponding data is not unique
            // 通貨コード一致チェック
            // 該当データのCURRENCY_CDが一意でない場合
            if (!domain.getCurrCd().equals(firstCurrCd)) {
                resultList.add("3");
                blRet = false;
                continue;
            }
            resultList.add("0");

        }
        return blRet;
    }

    /**
     * Registration of a [ws2504] E-RT Palletize
     * <br />[ws2504]E-RTパレタイズの登録
     *
     *
     * <pre>
     * - A calculation of NET WEIGHT
     * - Acquisition of Main Mark
     * - Registration of a Palletize information
     * - Registration of Palletize-Item information
     *
     * - NET重量の算出
     * - Main Markの取得
     * - パレタイズ情報の登録
     * - パレタイズ対象品情報の登録
     * </pre>
     *
     * @param criteriaDomain Registration information domain<br />登録情報ドメイン
     * @return WsBhtEisProductDomainch domain<br />WsBhtEisProductDomainドメイン
     * @throws ApplicationException Application exception<br />アプリケーション例外
     */
    public WsBhtEisProductDomain transactOnErtPltz(WsBhtEisProductCriteriaDomain criteriaDomain) throws ApplicationException {

        // Returned value --------------------------------------------------------------------------------
        // 返却値 --------------------------------------------------------------------------------
        WsBhtEisProductDomain wsBhtEisProduct = new WsBhtEisProductDomain();
        Map<String, Object[]> errMap = new HashMap<String, Object[]>();
        // Palletize Item
        // パレタイズ対象品
        List<TtPltzItemDomain> ttPltzItemList = new ArrayList<TtPltzItemDomain>();
        // The time zone converted date of Shipper is acquired.
        // Shipperのタイムゾーン変換日付を取得
        Date sysdate
            = DateUtil.convertTime(new Date(), commonService.searchTimezone(criteriaDomain.getShipperCd()));

        // This is acquisition of an acquisition -  consignee about a Ship-to information.
        // Ship-to情報を取得 - コンサイニの取得
        TmNxsShipToCriteriaDomain tmNxsShipToCriteria = new TmNxsShipToCriteriaDomain();
        tmNxsShipToCriteria.setShipToCd(criteriaDomain.getShipToCd());
        TmNxsShipToDomain tmNxsShipTo = tmNxsShipToService.searchByKey(tmNxsShipToCriteria);

        // Acquisition of CONTAINER-SORTING-KEY CONTAINER LOOSE TYPE, and a CUSTOM TIMING TYPE
        // コンテナ層別キー・コンテナルーズ区分・通関タイミング区分の取得
        Ws2501TmExpShipToShippingByKeyCriteriaDomain tmExpShipToShippingCriteria = new Ws2501TmExpShipToShippingByKeyCriteriaDomain();
        tmExpShipToShippingCriteria.setCompCd(criteriaDomain.getShipperCd());
        tmExpShipToShippingCriteria.setShipToCd(criteriaDomain.getShipToCd());
        tmExpShipToShippingCriteria.setAplyStrtDt(sysdate);
        Ws2501TmExpShipToShippingByKeyDomain tmExpShipToShipping = wsBhtEisProductDao.searchTmExpShipToShippingByKey(tmExpShipToShippingCriteria);
        // Existence check
        // 存在チェック
        if (tmExpShipToShipping == null || tmExpShipToShipping.getCompCd() == null || tmExpShipToShipping.getCompCd().equals("")) {
            Object[] params = {criteriaDomain.getShipperCd(), criteriaDomain.getShipToCd()};
            errMap.put(NXS_E1_5044, params);
            wsBhtEisProduct.setErrMap(errMap);
            return wsBhtEisProduct;
        }

        // Screen return
        // 画面返却
        criteriaDomain.setContainerSortingKey(tmExpShipToShipping.getContainerSortingKey());
        criteriaDomain.setCustomTimingTyp(tmExpShipToShipping.getCustomTimingTyp());
        criteriaDomain.setContainerLooseTyp(tmExpShipToShipping.getContainerLooseTyp());

        // ST987 DEL START
        //// - CIGMA factory information existence check ----------------------------------------------------------
        //// - CIGMA 工場情報存在チェック ----------------------------------------------------------
        //Ws9002ResultDomain cigmaWsResult = ws9002RestService.validateDatabasePlant(criteriaDomain.getShipperCd(), criteriaDomain.getPlntCd());
        //if (!cigmaWsResult.getResultCode().equals(WS_RESULT_SUCCESS)) {
        //    Object[] params = {criteriaDomain.getPlntCd()};
        //    errMap.put(NXS_E1_5017, params);
        //    wsBhtEisProduct.setErrMap(errMap);
        //    return wsBhtEisProduct;
        //}
        // ST987 DEL END

        // - Assignment of order numbers of Main Mark ----------------------------------------------------------------------
        // - Main Markの採番 ----------------------------------------------------------------------
        TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteria.setCompCd(criteriaDomain.getShipperCd());
        TmNxsCompDomain tmNxsComp = tmNxsCompService.searchByKey(tmNxsCompCriteria);
        
        if (tmNxsComp == null) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            Object[] params = {criteriaDomain.getShipperCd()};
            errorList.add(new MessageDomain("", NXS_E1_5007, params));
            throw new ValidationException(errorList);
        }
        
        criteriaDomain.setLengthUnit(tmNxsComp.getLengthUnit());   // [33]Length UNIT（Length）
        criteriaDomain.setWeightUnit(tmNxsComp.getWeightUnit());   // [36]Volume UNIT
        criteriaDomain.setVolumeUnit(tmNxsComp.getVolumeUnit());   // [37]Weight UNIT(N/W)
        wsBhtEisProduct.setCmlPrintNum(tmNxsComp.getCmlPrintNum().intValue());

        // Create of an assignment-of-order-numbers key
        // Consecutive acquisition
        // 採番キーの作成
        // 連番の取得
        List<String> listMainMark = new ArrayList<String>();
        String seqKey = "";
        String seqChild = "";

        // Year (lower 1 figure)
        // 年(下1桁)
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
        String keyY = sdf1.format(sysdate).substring(3, 4);

        // Days and months
        // 月日
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMdd");
        String keyMmdd = sdf2.format(sysdate);

        int intPalletQty = Integer.valueOf(criteriaDomain.getCmlQty()).intValue();
        for (int i = 0; i < intPalletQty; i++) {
            seqKey = String.format("%s%s%s%s%s", "D", criteriaDomain.getShipperCd(), criteriaDomain.getLgcyWhCd(), keyY, keyMmdd);
            seqChild = transactSequence(seqKey, SEQ_TYP_CML_NO_DN, 1, criteriaDomain.getScreenId()).get(0);
            String strMainMark = seqKey + seqChild;
            listMainMark.add(strMainMark);
        }

        List<? extends Ws2504PkgItemNoCriteriaDomain> pkgItemNoCriteriaList = criteriaDomain.getPkgItemNoCriteriaList();
        // WEIGHT of a Packing-material information ----------------------------------------------
        // 包装材情報のWEIGHT ----------------------------------------------
        List<BigDecimal> pkgNetWeightList = new ArrayList<BigDecimal>();
        Map<String, BigDecimal> weightMap = new HashMap<String, BigDecimal>();
        String[] nwMsgParams = {getResource("label.netWeight")};

        List<TmPkgMtrlDomain> tmPkgMtrlList = new ArrayList<TmPkgMtrlDomain>();
        for (Ws2504PkgItemNoCriteriaDomain ertItem : pkgItemNoCriteriaList) {

            if (StringUtils.isEmpty(ertItem.getPkgItemNo())) {
                continue;
            }

            // Acquisition of a Packing-material information
            // 包装材情報の取得

            // * - Acquisition of a MODEL CODE - *
            // * - 型式コードの取得 -*
            TmPkgMtrlCriteriaDomain tmPkgMtrlCriteria = new TmPkgMtrlCriteriaDomain();
            // OWNER_COMP         This screen [92] : Shipper_h
            // OWNER_COMP       本画面【92】：Shipper_h
            tmPkgMtrlCriteria.setOwnerComp(criteriaDomain.getShipperCd());
            // PKG_MATERIAL_PN    This screen [42]:Contents1_PKG_Item_No (*)
            // PKG_MATERIAL_PN  本画面【42】：Contents1_PKG_Item_No（※）
            tmPkgMtrlCriteria.setPkgItemNo(ertItem.getPkgItemNo());
            TmPkgMtrlDomain tmPkgMtrl = tmPkgMtrlService.searchByKey(tmPkgMtrlCriteria);
            // [42] Contents1_Model CD
            ertItem.setModelCd(tmPkgMtrl.getModelCd());

            // Calculation of a WEIGHT (N/W) ----------------------------------------------
            // NET WEIGHT = inputted Qty applicable to a Packing-material * PACKAGE ITEM NO
            // 重量（N/W）の算出 ----------------------------------------------
            // ネット重量 = 包装材 * 包装材品番に該当する入力されたQty
            if (tmPkgMtrl.getPkgWeight() != null) {
                BigDecimal weight = weightMap.get(tmPkgMtrl.getWeightUnit());
                if (weight == null) {
                    weight = BigDecimal.ZERO;
                }
                
                BigDecimal pkgNetWeight = tmPkgMtrl.getPkgWeight().multiply(new BigDecimal(ertItem.getPkgQty()));
                checkWeightOverflow(pkgNetWeight, nwMsgParams);
                pkgNetWeightList.add(pkgNetWeight);
                
                weight = weight.add(pkgNetWeight);
                weightMap.put(tmPkgMtrl.getWeightUnit(), weight);
            }

            tmPkgMtrlList.add(tmPkgMtrl);

        }

        // Calculation of a WEIGHT (N/W)
        // 重量（N/W）の算出
        BigDecimal netWeight = BigDecimal.ZERO;
        for (Map.Entry<String, BigDecimal> entry : weightMap.entrySet()) {
            String weightUnit = entry.getKey();
            BigDecimal weight = convertWeightUnit(entry.getValue(), weightUnit, tmNxsComp.getWeightUnit(), nwMsgParams);
            if (weight != null) {
                netWeight = netWeight.add(weight);
            }
        }
        checkWeightOverflow(netWeight, nwMsgParams);
        criteriaDomain.setNetWeight(netWeight);

        if (new BigDecimal(criteriaDomain.getGrossWeight()).compareTo(criteriaDomain.getNetWeight()) == -1) {
            // Calculation NET WEIGHT sum total > parameter . GROSS WEIGHT of a NET WEIGHT '1' (abnormal end)
            // NET重量の算出NET重量合計 >パラメタ.グロス重量  '1'(異常終了)
            Object[] params = {};
            errMap.put(NXS_E1_5048, params);
            wsBhtEisProduct.setErrMap(errMap);
            return wsBhtEisProduct;
        }

        // Processing about PalletQty
        // PalletQty についての処理
        for (int y = 0; y < listMainMark.size(); y++) {
            // Registration processing of a Palletize
            // パレタイズの登録処理
            String mainMarkSeq = listMainMark.get(y);
            String pkgTyp = criteriaDomain.getPkgTyp() + String.format("%03d", y + 1);
            TtPltzDomain ttPltz = setTtPltzDomain(criteriaDomain, tmNxsShipTo, tmExpShipToShipping, tmPkgMtrlList.get(0), mainMarkSeq, pkgTyp);
            ttPltzService.create(ttPltz);

            // Registration processing of Palletize Item
            // パレタイズ対象品の登録処理
            int i = 0;
            for (Ws2504PkgItemNoCriteriaDomain ertItem : pkgItemNoCriteriaList) {
                if (StringUtils.isEmpty(ertItem.getPkgItemNo())) {
                    continue;
                }

                TtPltzItemDomain ttPltzItemDomain = setTtPltzItemDomain(
                    i,
                    criteriaDomain,
                    ertItem,
                    tmPkgMtrlList.get(i),
                    pkgNetWeightList.get(i),
                    mainMarkSeq
                );
                ttPltzItemList.add(ttPltzItemDomain);
                i++;
            }
        }

        ttPltzItemService.create(ttPltzItemList);

        // Return setting
        // 返却設定
        wsBhtEisProduct.setErrMap(errMap);
        List<Ws2504RegistCmlListItemDomain> registCmlList = new ArrayList<Ws2504RegistCmlListItemDomain>();
        for (String mainMark : listMainMark) {
            Ws2504RegistCmlListItemDomain domain = new Ws2504RegistCmlListItemDomain();
            domain.setMainMark(mainMark);
            registCmlList.add(domain);
        }
        wsBhtEisProduct.setRegistCmlList(registCmlList);
        return wsBhtEisProduct;
    }


    /**
     * The set of a Palletize information
     * <br />パレタイズ情報のセット
     *
     * @param ert                 WC001ErtDomain
     * @param tmNxsShipTo         TmNxsShipToDomain
     * @param tmExpShipToShipping WC001ErtDomain
     * @param tmPkgMtrl           TmPkgMtrlDomain
     * @param mainMarkSeq         MAIN MARK<br />メインマーク
     * @param pkgTyp              PALLET/CARTON Type<br />パレット/カートン区分
     * @return Result domain<br />結果ドメイン
     * @throws ApplicationException Exception<br />例外
     */
    protected TtPltzDomain setTtPltzDomain(
        WsBhtEisProductCriteriaDomain       ert,
        TmNxsShipToDomain    tmNxsShipTo,
        Ws2501TmExpShipToShippingByKeyDomain       tmExpShipToShipping,
        TmPkgMtrlDomain      tmPkgMtrl,
        String               mainMarkSeq,
        String               pkgTyp
    ) throws ApplicationException {

        TmUserCriteriaDomain tmUserCriteria = new TmUserCriteriaDomain();
        tmUserCriteria.setDscId(ert.getDscId());
        TmUserDomain tmUser = tmUserService.searchByKey(tmUserCriteria);

        TtPltzDomain ttPltz = new TtPltzDomain();
        // MAIN_MARK
        ttPltz.setMainMark(mainMarkSeq);
        // PALLET_NO
        ttPltz.setPalletNo(pkgTyp);
        // SHIPPER_CD
        ttPltz.setShipperCd(ert.getShipperCd());
        // NXS_SHIP_TO_CD
        ttPltz.setShipToCd(ert.getShipToCd());
        // LEGACY_CUSTOMER_NO = " "
        ttPltz.setCustomerCd(" ");
        // LEGACY_SHIP_TO = ""
        ttPltz.setLgcyShipTo("");
        // TRNS_WAY_CD
        ttPltz.setTrnsCd(ert.getTrnsCd());
        // TRNS_WAY_CD_ORG
        ttPltz.setTrnsCdOrg(ert.getTrnsCd());
        // REVISE_FLG = "N"
        ttPltz.setReviseFlg(FLAG_N);
        // LEGACY_PLANT_CD
        ttPltz.setPlntCd(ert.getPlntCd());
        // LEGACY_WH_CD = " "
        ttPltz.setLgcyWhCd(" ");
        // CUR_LEGACY_WH_CD = " "
        ttPltz.setCurLgcyWhCd(" ");
        // PKG_FORM = "S"
        ttPltz.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        // INVOICE_KEY = ""
        ttPltz.setInvoiceKey("");
        // CONTAINER_SORTING_KEY
        ttPltz.setContainerSortingKey(tmExpShipToShipping.getContainerSortingKey());
        // CONTAINER_LOOSE_TYP
        if (ert.getTrnsCd().equals(TRNS_CD_AIR)) {
            // In A (air transportation subject), this is "L."
            // A（航空輸送主体）の場合、"L"
            ttPltz.setContainerLooseTyp(CONTAINER_LOOSE_TYP_LOOSE);
        } else {
            ttPltz.setContainerLooseTyp(ert.getContainerLooseTyp());
        }
        // RETURN_STYLE_CD
        ttPltz.setReturnStyleCd(ert.getReturnStyleCd());
        // VARIANT_FLG = "N"
        ttPltz.setVariantFlg(FLAG_N);
        // RT_USE_FLG = "Y"
        ttPltz.setRtUseFlg(FLAG_Y);
        // WEIGHT_UNIT
        ttPltz.setWeightUnit(ert.getWeightUnit());
        // NET_WEIGHT
        ttPltz.setNetWeight(ert.getNetWeight());
        // GROSS_WEIGHT
        ttPltz.setGrossWeight(new BigDecimal(ert.getGrossWeight()));
        // LENGTH_UNIT
        ttPltz.setLengthUnit(ert.getLengthUnit());
        // LENGTH
        ttPltz.setLength(ert.getLength());
        // WIDTH
        ttPltz.setWidth(ert.getWidth());
        // HEIGHT
        ttPltz.setHeight(ert.getHeight());
        // VOLUME_UNIT
        ttPltz.setVolumeUnit(ert.getVolumeUnit());
        // VOLUME
        ttPltz.setVolume(ert.getVolume());
        // SUPPLIER_MAIN_MARK = ""
        ttPltz.setSupplierMainMark("");
        // CML_TYP = "2"（E-RT）
        ttPltz.setCmlTyp(CML_TYPE_ERT);
        // OUTER_PKG_CD = ""
        ttPltz.setOuterPkgCd("");
        // EXP_PACKING_DT = time zone converted date
        // EXP_PACKING_DT = タイムゾーン変換日付
        Date expPackingDt = getTimeZoneDt(ert.getShipperCd());
        expPackingDt = DateUtils.truncate(expPackingDt, Calendar.DAY_OF_MONTH);
        ttPltz.setExpPackingDt(expPackingDt);
        // EXP_PACKING_ISSUER_ID = login DSC-ID
        // EXP_PACKING_ISSUER_ID = ログインDSC-ID
        ttPltz.setExpPackingIssuerId(ert.getDscId());
        // EXP_PACKING_ISSUER_NM = login person name
        // EXP_PACKING_ISSUER_NM = ログイン者名
        ttPltz.setExpPackingIssuerNm(tmUser.getUsrNmEn());
        // DUE_DT
        ttPltz.setDueDt(ert.getDueDt());
        // INSTR_FLG = N
        if (ert.getTrnsCd().equals(TRNS_CD_AIR)) {
            // In A (air transportation subject), this is "Y."
            // A（航空輸送主体）の場合、"Y"
            ttPltz.setStgInstrItemFlg(FLAG_Y);
        } else {
            ttPltz.setStgInstrItemFlg(FLAG_N);
        }
        // CONSIGNEE_CD
        ttPltz.setConsigneeCd(tmNxsShipTo.getCompCd());
        // COMMERCIAL_FLG = N fixation
        // COMMERCIAL_FLG = N固定
        ttPltz.setCommercialFlg(FLAG_N);
        // TRADE_TERMS = ""
        ttPltz.setTradeTerms("");
        // CURRENCY_CD
        ttPltz.setCurrCd(tmPkgMtrl.getCurrCd());
        // PALLETIZE_STATUS_CD ="10" (Palletize)
        // PALLETIZE_STATUS_CD = "10"（パレタイズ）
        ttPltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        // PACKED_WH_COMP_CD
        ttPltz.setPackingWhCompCd(ert.getWhCompCd());
        // PACKED_WH_CD
        ttPltz.setPackingWhCd(ert.getLgcyWhCd());
        // CUR_WH_COMP_CD
        ttPltz.setCurWhCompCd(ert.getWhCompCd());
        // CUR_WH_CD
        ttPltz.setCurWhCd(ert.getLgcyWhCd());
        // X_MAIN_MARK = ""
        ttPltz.setXmainMark("");
        // INVOICE_NO = ""
        ttPltz.setInvoiceNo("");
        // INVOICE_ISSUE_DT = ""
        ttPltz.setInvoiceIssueDt(null);
        // LOADING_CD
        ttPltz.setLoadingCd(ert.getLoadingCd());
        // SITE_TYP = ""
        ttPltz.setSiteTyp("");
        // EXP_LIMIT_FLG = "N"
        ttPltz.setExpLimitFlg(FLAG_N);
        // DNGR_ITEM_FLG = "N"
        ttPltz.setDngrItemFlg(FLAG_N);
        // STG_INSTR_NO = ""
        ttPltz.setStgInstrNo("");
        // STG_ACT_NO = ""
        ttPltz.setStgActNo("");
        // SHIPPING_CONFIRM_NO = ""
        ttPltz.setShippingFirmNo("");
        // CUSTOM_TIMING_TYP
        if (ert.getTrnsCd().equals(TRNS_CD_AIR)) {
            // The case   of A (air transportation subject), "Z"
            // A（航空輸送主体）の場合 、"Z"
            ttPltz.setCustomTimingTyp(CUSTOM_TIMING_TYPE_Z);
        } else {
            ttPltz.setCustomTimingTyp(ert.getCustomTimingTyp());
        }
        // LAST_TR_STATUS = "10"
        ttPltz.setLastTrStatus(CARRY_OUT_IN_BLANK);
        // LAST_TR_RCV_DT = ""
        ttPltz.setLastTrRcvDt(ert.getLastTrRcvDt());
        // PALLETIZE_INSTR_NO = ""
        ttPltz.setPltzInstrNo("");
        // EXP_REQUEST_NO = ""
        ttPltz.setExpRequestNo("");
        // EXP_REQUEST_ALL_CML_ISSUED_FLG = "N"
        ttPltz.setExpRequestAllCmlIssuedFlg(FLAG_N);
        // SPLIT_SHIPMENT_FLG = "N"
        ttPltz.setSplitShippingNgFlg(FLAG_N);
        // INVOICE_CATEGORY = "N" fixation
        // INVOICE_CATEGORY = "N"固定
        ttPltz.setInvoiceCtgry(FLAG_N);
        // PRICE_TERMS
        ttPltz.setPriceTerms(ert.getPriceTerms());
        // RE_EXP_GOODS_FLG = "N"
        ttPltz.setReExpGoodsFlg(FLAG_N);
        // FREIGHT_RESPONSIBLE_CD
        ttPltz.setFreightResponsibleCd(ert.getPayTerms());
        // MIGRATION_FLG = "N"
        ttPltz.setMigrationFlg(FLAG_N);
        ttPltz.setPalletCartonTyp(pkgTyp.substring(0, 1));
        // A setting of common column
        // 共通カラムの設定
        setCommonPropertyForRegist(ttPltz, ert.getLoginUserDscId(), ert.getScreenId());

        return ttPltz;
    }

    /**
     * The set of a Palletize-Item information
     * <br />パレタイズ対象品情報のセット
     *
     * @param serialNumber   SEQUENCE NO<br />連番
     * @param ert            WC001ErtDomain domain<br />WC001ErtDomainドメイン
     * @param ertItem        WC001ErtItemDomain domain<br />WC001ErtItemDomainドメイン
     * @param tmPkgMtrl      TmPkgMtrlDomain domain<br />TmPkgMtrlDomainドメイン
     * @param bdNetWeight    Net WEIGHT<br />Net重量
     * @param mainMarkSeq    MAIN MARK<br />メインマーク
     * @return Result domain<br />結果ドメイン
     * @throws ApplicationException Exception<br />例外
     */
    protected TtPltzItemDomain setTtPltzItemDomain(
            int serialNumber,
            WsBhtEisProductCriteriaDomain       ert,
            Ws2504PkgItemNoCriteriaDomain   ertItem,
            TmPkgMtrlDomain      tmPkgMtrl,
            BigDecimal           bdNetWeight,
            String               mainMarkSeq
    )
        throws ApplicationException {

        TtPltzItemDomain ttPltzItemDomain = new TtPltzItemDomain();
        // MAIN_MARK
        ttPltzItemDomain.setMainMark(mainMarkSeq);
        // BRCH_NO
        ttPltzItemDomain.setBrch(new BigDecimal(serialNumber));
        // PALLETIZE_PN
        ttPltzItemDomain.setPltzItemNo(tmPkgMtrl.getPkgItemNo());
        // PKG_CD = " "
        ttPltzItemDomain.setPkgCd(" ");
        // ITEM_NM
        ttPltzItemDomain.setItemDescription(tmPkgMtrl.getPkgMtrlNm());
        // QTY
        ttPltzItemDomain.setQty(new BigDecimal(ertItem.getPkgQty()));
        // MEASURE_UNIT
        ttPltzItemDomain.setQtyUnit(QTY_UNIT_EA);
        // TAG_QTY = ""
        ttPltzItemDomain.setTagQty(null);
        // ITEM_TYP ="3" Packing material
        // ITEM_TYP = "3" 包装材
        ttPltzItemDomain.setItemTyp(ITEM_TYP_PKG_MATERIALS);
        // NET_WEIGHT
        ttPltzItemDomain.setNetWeight(bdNetWeight);
        // ITEM_WEIGHT
        ttPltzItemDomain.setItemWeight(tmPkgMtrl.getPkgWeight());
        // WEIGHT_UNIT
        ttPltzItemDomain.setWeightUnit(tmPkgMtrl.getWeightUnit());
        // SHIP_LOT_QTY = ""
        ttPltzItemDomain.setShippingLot(null);
        // PKG_TYP ="4" Recommendation packing style
        // PKG_TYP = "4" 推奨荷姿
        ttPltzItemDomain.setPkgTyp(PKG_TYP_ERT);
        // MODEL_CD
        ttPltzItemDomain.setModelCd(tmPkgMtrl.getModelCd());
        // EXP_LIMIT_TYP = ""
        ttPltzItemDomain.setExpLimitTyp(null);
        // DNGR_ITEM_FLG = "N"
        ttPltzItemDomain.setDngrItemFlg(FLAG_N);
        // ORIGIN_CNTRY_CD
        ttPltzItemDomain.setOriginCntryCd(tmPkgMtrl.getOriginCntryCd());
        // CURRENCY_CD
        ttPltzItemDomain.setCurrCd(tmPkgMtrl.getCurrCd());
        // LEGACY_PLANT_CD
        ttPltzItemDomain.setPlntCd(ert.getPlntCd());
        // RT_TYP
        ttPltzItemDomain.setRtFlg(FLAG_Y);
        // KIT_FLG = "N"
        ttPltzItemDomain.setKitFlg(FLAG_N);
        // EXP_REQUEST_NO = ""
        ttPltzItemDomain.setExpRequestNo(null);
        // LINE_NO = ""
        ttPltzItemDomain.setLineNo(null);
        // KIT_BRCH = ""
        ttPltzItemDomain.setKitBrch(null);
        // MIX_TAG = ""
        ttPltzItemDomain.setMixTagNo(null);
        // PALLETIZE_INSTR_NO = ""
        ttPltzItemDomain.setPltzInstrNo(null);
        // PAR_FLG = "Y"
        ttPltzItemDomain.setParFlg(FLAG_Y);
        // KIT_PAR_ITEM_NO = ""
        ttPltzItemDomain.setKitParItemNo(null);
        // CUSTOMER_PO_NO = ""
        ttPltzItemDomain.setCustomerPoNo(null);
        // CUSTOMER_ITEM_NO = ""
        ttPltzItemDomain.setCustomerItemNo(null);
        // UNIT_PRICE = ""
        ttPltzItemDomain.setUnitPrice(null);
        // HS_CD = ""
        ttPltzItemDomain.setHsCd(null);
        // INPUT_METH_TYP = ""
        ttPltzItemDomain.setInputMethTyp(null);

        // Setting of a common column
        // 共通カラムの設定
        setCommonPropertyForRegist(ttPltzItemDomain, ert.getLoginUserDscId(), ert.getScreenId());
        return ttPltzItemDomain;

    }


    /**
     * Acquire time zone converted time from a MAIN MARK.
     * <br />メインマークからタイムゾーン変換日時を取得します。
     *
     * @param shipperCd SHIPPER CD
     * @return Time zone converted time<br />タイムゾーン変換日時
     * @throws ApplicationException When a time zone converted cannot be carried out<br />タイムゾーン変換できなかった場合
     */
    protected Date getTimeZoneDt(String shipperCd) throws ApplicationException {
        String timezoneId = commonService.searchTimezone(shipperCd);
        Date timezoneDateDt = getTimeZoneDtVal(timezoneId);
        return timezoneDateDt;
    }

    /**
     * Type in the functional overview of the method.
     *
     * @param timezoneId TIMEZONE ID<br />タイムゾーンID
     * @return Time zone converted time<br />タイムゾーン変換日時
     */
    protected Date getTimeZoneDtVal(String timezoneId) {
        return DateUtil.convertTime(new Date(), timezoneId);
    }

    // --------------------------------- ECA0027_WS_2505_Create PKG Spec -------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseCompCd(java.lang.String, java.lang.String[], java.lang.String[])
     */
    public boolean validateDatabaseCompCd(String compCd, String[] itemNoGrp, String[] timeZone) throws ApplicationException {

        TmNxsCompCriteriaDomain criteria = new TmNxsCompCriteriaDomain();
        criteria.setCompCd(compCd);

        TmNxsCompDomain tmNxsComp = tmNxsCompService.searchByKey(criteria);

        if (tmNxsComp == null){
            return false;
        }

        itemNoGrp[0] = tmNxsComp.getItemNoGrp();
        timeZone[0] = tmNxsComp.getTimezoneId();

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmPkgSpecDtlOnPkgSpec(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain)
     */
    public boolean validateDatabaseTmPkgSpecHdrOnPkgSpec(TmPkgSpecHdrCriteriaDomain criteria) throws ApplicationException {

        TmPkgSpecHdrDomain tmPkgSpecHdrDomain = tmPkgSpecHdrService.searchByKey(criteria);

        if (tmPkgSpecHdrDomain == null){
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#transactOnPkgSpec(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)
     */
    public void transactOnPkgSpec(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        // The lock of Package Specification Revision Master
        // 包装仕様有効リビジョン原単位のロック
        TmPkgSpecRevCriteriaDomain tmPkgSpecRevCriteria = new TmPkgSpecRevCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tmPkgSpecRevCriteria, criteria);
        tmPkgSpecRevCriteria.setRev(null);
        TmPkgSpecRevDomain tmPkgSpecRev = tmPkgSpecRevService.lockByKeyNoWait(tmPkgSpecRevCriteria);

        // Time zone converted date
        // タイムゾーン変換日付
        Date date = DateUtil.convertTime(new Date(), criteria.getTimeZone());

        // When the result of the lock of Package Specification Revision Master is able to be acquired
        // 包装仕様有効リビジョン原単位のロックの結果が取得できた場合
        if (tmPkgSpecRev != null){
            
            if (tmPkgSpecRev.getRev().compareTo(criteria.getRev()) == 0) {
                return;
            }
            
            // Acquisition of a BRANCH
            // 枝番の取得
            Ws2501PkgSpecRevHisCriteriaDomain pkgSpecRevHisCriteria = new Ws2501PkgSpecRevHisCriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(pkgSpecRevHisCriteria, criteria);
            Ws2501PkgSpecRevHisDomain pkgSpecRevHis = wsBhtEisProductDao.searchPkgSpecRevHis(pkgSpecRevHisCriteria);

            // Setting of a BRANCH
            // 枝番の設定
            BigDecimal brch = new BigDecimal(1);
            if (pkgSpecRevHis.getBrch() != null ){
                brch = pkgSpecRevHis.getBrch().add(new BigDecimal(1));
            }

            // Registration of Package Specification Revision History Master
            // 包装仕様有効リビジョン履歴原単位の登録
            TmPkgSpecRevHisDomain tmPkgSpecRevHis = new TmPkgSpecRevHisDomain();
            CommonUtil.copyPropertiesDomainToDomain(tmPkgSpecRevHis, tmPkgSpecRev);
            tmPkgSpecRevHis.setBrch(brch);
            setCommonPropertyForRegist(tmPkgSpecRevHis, criteria.getLoginUserDscId(), criteria.getScreenId());
            tmPkgSpecRevHisService.create(tmPkgSpecRevHis);

            // The update of Package Specification Revision Master
            // 包装仕様有効リビジョン原単位の更新
            TmPkgSpecRevDomain tmPkgSpecRevUpdate = new TmPkgSpecRevDomain();
            tmPkgSpecRevUpdate.setRev(criteria.getRev());
            tmPkgSpecRevUpdate.setAplyStrtDt(date);
            setCommonPropertyForUpdate(tmPkgSpecRevUpdate, criteria.getLoginUserDscId(), criteria.getScreenId());

            TmPkgSpecRevCriteriaDomain tmPkgSpecRevCriteriaUpdate = new TmPkgSpecRevCriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(tmPkgSpecRevCriteriaUpdate, criteria);
            tmPkgSpecRevCriteriaUpdate.setRev(null);

            tmPkgSpecRevService.updateByCondition(tmPkgSpecRevUpdate, tmPkgSpecRevCriteriaUpdate);

        } else {
            // Registration of Package Specification Revision Master
            // 包装仕様有効リビジョン原単位の登録
            TmPkgSpecRevDomain tmPkgSpecRevCreate = new TmPkgSpecRevDomain();
            CommonUtil.copyPropertiesDomainToDomain(tmPkgSpecRevCreate, criteria);
            tmPkgSpecRevCreate.setAplyStrtDt(date);
            setCommonPropertyForRegist(tmPkgSpecRevCreate, criteria.getLoginUserDscId(), criteria.getScreenId());
            tmPkgSpecRevService.create(tmPkgSpecRevCreate);
        }
    }

    // --------------------------------- ECA0027_WS_2507_Print Case Mark Label -------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#transactOnPrintCml(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)
     */
    public void transactOnPrintCml(WsBhtEisProductCriteriaDomain criteriaDomain) throws ApplicationException {

        // Acquisition of Date format
        // 日付フォーマットの取得
        String formatDate =  commonService.getResource(criteriaDomain.getLocale(), REPORT_DATE_FORMAT);

        TtPltzInstrDomain ttPltzInstrDomain = null;
        List<TtPltzDomain> ttPltzList = null;
        //int printnum = 0; // UT300 DEL

        // 6.Acquisition of printer information
        // 6.プリンタ情報の取得
        TmPrinterCriteriaDomain tmPrinterCriteria = new TmPrinterCriteriaDomain();
        tmPrinterCriteria.setCompCd(criteriaDomain.getCompCd());
        tmPrinterCriteria.setPrinterId(criteriaDomain.getPrinterId());
        TmPrinterDomain tmPrinterInfo = this.tmPrinterService.searchByKey(tmPrinterCriteria);

        if (tmPrinterInfo == null) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            Object[] params = {criteriaDomain.getCompCd(), criteriaDomain.getPrinterId()};
            errorList.add(new MessageDomain("", NXS_E1_5018, params));
            throw new ValidationException(errorList);
        }

        // A create of CML ===========================================================================
        // CMLの作成 ===========================================================================
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getCmlPrintFlg())
            && criteriaDomain.getCmlPrintFlg().equals(FLAG_Y)) {

            // Instructed(=Pull) Palletizing ------------------------------------------------------------------
            // 指示パレタイズ ------------------------------------------------------------------
            if (!CheckUtil.isBlankOrNull(criteriaDomain.getPltzInstrNo())) {

                // 4.The lock of Packaging Instruction (=Pull) information
                // It locks in order to set up a PALLETIZE INSTRUCTION STATUS and a CML PRINT OUT DATE after printing, only when printing CML by Instructed(=Pull) Palletizing (pattern 5 of table *2).
                // 4.梱包指示情報のロック
                // 指示パレタイズでCMLを印刷する場合(表*2のパターン5)のみ印刷後に梱包指示ステータス、CML出力日を設定するためロックする。
                TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
                ttPltzInstrCriteria.setPltzInstrNo(criteriaDomain.getPltzInstrNo());
                ttPltzInstrDomain = this.ttPltzInstrService.lockByKeyNoWait(ttPltzInstrCriteria);
                assertNotEmpty(ttPltzInstrDomain, NXS_E1_5069);

                int intPltzInstrStatus = Integer.valueOf(ttPltzInstrDomain.getPltzInstrStatus());
                if (intPltzInstrStatus < 40) {
                    List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                    Object[] params = {ttPltzInstrDomain.getPltzInstrNo()};
                    errorList.add(new MessageDomain("", NXS_E1_5040, params));
                    throw new ValidationException(errorList);
                }


                // 5.Acquisition of Palletize information
                // 5.パレタイズ情報の取得
                TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
                ttPltzCriteriaDomain.setPltzInstrNo(criteriaDomain.getPltzInstrNo());
                ttPltzCriteriaDomain.setPreferredOrder("MAIN_MARK desc");
                ttPltzList = this.ttPltzService.searchByCondition(ttPltzCriteriaDomain);
                if (ttPltzList == null || ttPltzList.size() == 0) {
                    List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                    Object[] params = {ttPltzInstrDomain.getPltzInstrNo()};
                    errorList.add(new MessageDomain("", NXS_E1_5040, params));
                    throw new ValidationException(errorList);
                }

                // UT300 DEL START
                //// 7.1. Acquisition of a print-copies information
                //// Refer to BHT common specifications "27. company information acquisition."
                //// 7.1. 印刷部数情報の取得
                //// BHT共通仕様「27.会社情報取得」参照
                //TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
                //tmNxsCompCriteria.setCompCd(ttPltzInstrDomain.getShipperCd());
                //TmNxsCompDomain tmNxsComp = this.tmNxsCompService.searchByKey(tmNxsCompCriteria);
                //
                //if (tmNxsComp == null) {
                //    List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                //    Object[] params = {ttPltzInstrDomain.getShipperCd()};
                //    errorList.add(new MessageDomain("", NXS_E1_5007, params));
                //    throw new ValidationException(errorList);
                //}
                //
                //printnum = tmNxsComp.getCmlPrintNum().intValue();
                // UT300 DEL END

                // 8.The update of Packaging Instruction (=Pull) information
                // 8.梱包指示情報の更新
                TtPltzInstrDomain ttPltzInstrUpdate = new TtPltzInstrDomain();
                ttPltzInstrUpdate.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT);
                // server date is changed using the time zone CD acquired by 7.1.
                // サーバ日付を、7.1で取得したタイムゾーンコードを利用して変換する
                Date timezoneDateDt = DateUtil.convertTime(new Date(), commonService.searchTimezone(criteriaDomain.getCompCd()));
                ttPltzInstrUpdate.setCmlPrintOutDt(timezoneDateDt);
                setCommonPropertyForUpdate(ttPltzInstrUpdate, criteriaDomain.getLoginUserDscId(), criteriaDomain.getScreenId());
                this.ttPltzInstrService.updateByCondition(ttPltzInstrUpdate, ttPltzInstrCriteria);

                // UT300 MOD START
                //// ---> LOOP
                //for (TtPltzDomain ttPltz : ttPltzList) {
                //    // Create of 9.PDF - PDF is created using the MAIN MARK acquired by 5.
                //    // 9.PDFの作成 - 5.で取得したメインマークを使用してPDFを作成
                //    File pdf = this.l2003ReportService.searchCml(null, ttPltz.getMainMark(), formatDate);
                //    // 10. printing
                //    // 10.印刷
                //    this.commonService.printPdf(pdf, printnum, tmPrinterInfo.getPrinterNm());
                //}
                //// <--- LOOP

                // merge print
                // 連結印刷

                List<File> pdfFileList = new ArrayList<File>();
                for (TtPltzDomain ttPltz : ttPltzList) {
                    File pdfFile = l2003ReportService.searchCml(null, ttPltz.getMainMark(), formatDate);
                    pdfFileList.add(pdfFile);
                }
                mergePrintPdf(pdfFileList, criteriaDomain.getCmlPrintNum(), tmPrinterInfo.getPrinterNm());
                // UT300 MOD END

            // Result Palletize -----------------------------------------------------------------------
            // 成行パレタイズ -----------------------------------------------------------------------
            } else {

                // It sorts in ascending order of MainMark.
                // MainMarkの昇順にソート
                Collections.sort(criteriaDomain.getMainMarkList());

                // UT300 MOD START
                //// ---> LOOP
                //for (String mainMark : criteriaDomain.getMainMarkList()) {
                //
                //    // 7.2. Acquisition of a print-copies information
                //    // 7.2. 印刷部数情報の取得
                //    Ws2501CmlPrintNumCriteriaDomain bhtEisProductCriteria = new Ws2501CmlPrintNumCriteriaDomain();
                //    bhtEisProductCriteria.setMainMark(mainMark);
                //    Ws2501CmlPrintNumDomain wsBhtEisProduct = this.wsBhtEisProductDao.searchCmlPrintNum(bhtEisProductCriteria);
                //    if (wsBhtEisProduct == null || CheckUtil.isBlankOrNull(wsBhtEisProduct.getCmlPrintNum())) {
                //        // When printing number of sheets is unacquirable
                //        // 印刷枚数が取得できない場合
                //        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                //        Object[] params = {mainMark};
                //        errorList.add(new MessageDomain("", NXS_E1_5067, params));
                //        throw new ValidationException(errorList);
                //    }
                //    printnum = Integer.valueOf(wsBhtEisProduct.getCmlPrintNum());
                //
                //    // A create of 9.PDF
                //    // 9.PDFの作成
                //    File pdf = this.l2003ReportService.searchCml(null, mainMark, formatDate);
                //    // 10. printing
                //    // 10.印刷
                //    this.commonService.printPdf(pdf, printnum, tmPrinterInfo.getPrinterNm());
                //
                //}
                //// <--- LOOP

                // merge print
                // 連結印刷

                List<File> pdfFileList = new ArrayList<File>();
                for (String mainMark : criteriaDomain.getMainMarkList()) {
                    File pdfFile = l2003ReportService.searchCml(null, mainMark, formatDate);
                    pdfFileList.add(pdfFile);
                }
                mergePrintPdf(pdfFileList, criteriaDomain.getCmlPrintNum(), tmPrinterInfo.getPrinterNm());
                // UT300 MOD END
            }
        }

        // Printing of an error report
        // エラーレポートの印刷
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getErrorReportFlg())
            && criteriaDomain.getErrorReportFlg().equals(FLAG_Y)) {
            // A create of 9. error report
            // 9.エラーレポートの作成
            File pdf = this.l2005ReportService.searchCmlMixTagErrRep(
                criteriaDomain.getDscId(),
                criteriaDomain.getErrorReportTs(),
                formatDate
            );

            // 10. printing
            // 10.印刷
            this.commonService.printPdf(pdf, 1, tmPrinterInfo.getPrinterNm());

        }
    }

    // --------------------------------- ECA0027_WS_2508_Create Mixed Label ----------------------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateConsistencyNxsStockFlg(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)
     */

    public boolean validateConsistencyNxsStockFlg(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        String nxsStockFlg = criteria.getNxsStockFlg();
        String pltzInstrNo = criteria.getPltzInstrNo();
        String shipperCd = criteria.getShipperCd();
        String customerCd = criteria.getCustomerCd();
        String lgcyShipTo = criteria.getLgcyShipTo();
        String trnsCd = criteria.getTrnsCd();
        String plntCd = criteria.getPlntCd();
        String lgcyWhCd = criteria.getLgcyWhCd();
        String whCompCd = criteria.getWhCompCd();
        String whCd = criteria.getWhCd();

        // When a NEXUS W/H flag is NULL
        // NEXUS倉庫フラグがNULLの場合
        if(CheckUtil.isBlankOrNull(nxsStockFlg)){
            // An error is made when PKG support No is NULL(s).
            // 梱包支持NoがNULLの場合エラー
            if(CheckUtil.isBlankOrNull(pltzInstrNo)){
                return false;
            }
        }else{
            // When Shipper CD, a CUSTOMER CODE, a LEGACY SHIP TO, and a TRANSPORT CODE are NULL(s)
            // 荷主コード、得意先コード、LEGACY送荷先、輸送手段コードがNULLの場合
            if(CheckUtil.isBlankOrNull(shipperCd)
                || CheckUtil.isBlankOrNull(customerCd)
                || CheckUtil.isBlankOrNull(lgcyShipTo)
                || CheckUtil.isBlankOrNull(trnsCd)){
                return false;
            }
            // In the case of N:CIGMA
            // N：CIGMAの場合
            if(FLAG_N.equals(nxsStockFlg)){
                // When W/H Company CD (LEGACY), and a W/H CD (LEGACY) are NULL(s)
                // 倉庫会社コード(LEGACY)、倉庫コード(LEGACY)がNULLの場合
                if(CheckUtil.isBlankOrNull(plntCd) || CheckUtil.isBlankOrNull(lgcyWhCd)){
                    return false;
                }
                // In the case of Y:NEXUS
                // Y：NEXUSの場合
            }else{
                // When W/H Company CD (between bases), and a W/H CD (between bases) are NULL(s)
                // 倉庫会社コード(拠点間)、倉庫コード(拠点間)がNULLの場合
                if(CheckUtil.isBlankOrNull(whCompCd) || CheckUtil.isBlankOrNull(whCd)){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTtPltzInstrOnMixTag(String, String[], String[], String[], String[], String[], String[])
     */

    public String validateDatabaseTtPltzInstrOnMixTag(String pltzInstrNo,
        String[] shipperCd, String[] customerCd, String[] lgcyShipTo, String[] trnsCd,
        String[] plntCd, String[] lgcyWhCd) throws ApplicationException {

        TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
        criteria.setPltzInstrNo(pltzInstrNo);

        // Acquisition of a Packaging Instruction (=Pull)
        // 梱包指示の取得
        TtPltzInstrDomain ttPltzInstr = ttPltzInstrService.searchByKey(criteria);
        // Existence check
        // 存在チェック
        if (ttPltzInstr == null) {
            return NXS_E1_5038;
        }
        String status = ttPltzInstr.getPltzInstrStatus();
        // PALLETIZE-INSTRUCTION-STATUS check
        // 梱包指示ステータスチェック
        if (PLTZ_INSTR_STATUS_INSTRUCTION_CREATED.compareTo(status) == 0
            || PLTZ_INSTR_STATUS_ALL_CML_CREATE.compareTo(status) == 0
            || PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT.compareTo(status) == 0) {
            return NXS_E1_5015;
        }
        // acquired data temporary maintenance
        // 取得データ一時保持
        shipperCd[0] = ttPltzInstr.getShipperCd();
        customerCd[0] = ttPltzInstr.getCustomerCd();
        lgcyShipTo[0] = ttPltzInstr.getLgcyShipTo();
        trnsCd[0] = ttPltzInstr.getTrnsCd();
        plntCd[0] = ttPltzInstr.getPlntCd();
        lgcyWhCd[0] = ttPltzInstr.getLgcyWhCd();

        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmPkgMaterialsOnMixTag(java.lang.String, java.util.List, java.util.List)
     */

    public boolean validateDatabaseTmPkgMaterialsOnMixTag(String shipperCd,
        List<? extends Ws2501ItemNoDomain> itemNoList, List<String> resultList)
        throws ApplicationException {

        for (Ws2501ItemNoDomain itemNoDomain : itemNoList){

            String itemNo = itemNoDomain.getItemNo();

            Ws2501PkgMaterialsCriteriaDomain pkgMaterialsCriteria = new Ws2501PkgMaterialsCriteriaDomain();
            // Acquisition of a PKG Materials MA
            // 包装材原単位の取得
            pkgMaterialsCriteria.setOwnerComp(shipperCd);
            pkgMaterialsCriteria.setPkgItemNo(itemNo);

            Ws2501PkgMaterialsDomain tmPkgMaterial = wsBhtEisProductDao.searchPkgMaterials(pkgMaterialsCriteria);

            // Existence check
            // 存在チェック
            if (tmPkgMaterial == null){
                resultList.add(itemNo);
            }
        }
        // Error judging
        // エラー判定
        if(resultList.isEmpty()){
            return true;
        }
        return false;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmPkgSpecificationDtOnMixTag(java.lang.String, java.util.List, java.lang.String, java.util.List)
     */

    public boolean validateDatabaseTmPkgSpecificationDtOnMixTag(
        String shipperCd, List<? extends Ws2501ItemNoDomain> itemNoList,
        String trnsCd, List<String> resultList) throws ApplicationException {

        // A checked ITEM NO and packing CD
        // チェック済み品目番号・包装コード
        Set<String> checkedItemNoAndPkgCds = new HashSet<String>();


        // StringBuilder for generating a key from ITEM NO, and a packing CD
        // 品目番号・包装コードからキーを生成するための StringBuilder
        StringBuilder keyBuilder = new StringBuilder();

        for (Ws2501ItemNoDomain itemNoItem : itemNoList){

            String itemNo = itemNoItem.getItemNo();

            // It skips about ITEM NO which already became an error.
            // In order not to include the same ITEM NO in Plurality resultList ..
            // 既にエラーになった品目番号についてはスキップ
            // 同じ品目番号を複数 resultList に含めないようにするため...
            if (resultList.contains(itemNo)) {
                continue;
            }

            String pkgCd  = itemNoItem.getPkgCd();

            keyBuilder.setLength(0);
            String itemNoAndPkgCd = keyBuilder.append(itemNo)
                                              .append(":")
                                              .append(pkgCd)
                                              .toString();

            // -- already -- a 1-time check -- finishing -- it judges
            // 既に1回チェック済みか判定
            if (!checkedItemNoAndPkgCds.add(itemNoAndPkgCd)) {
                continue;
            }

            // Acquisition of PKG Specification MA(Header), a PKG Specification MA(Detail), and a Package Specification Revision Master
            // 包装仕様原単位（ヘッダ）、包装仕様原単位（明細）、包装仕様有効リビジョン原単位の取得
            Ws2501NxsPkgSpecificationCriteriaDomain pkgSpecCriteria =  new Ws2501NxsPkgSpecificationCriteriaDomain();
            pkgSpecCriteria.setCompCd(shipperCd);
            pkgSpecCriteria.setTrnsCd(trnsCd);
            pkgSpecCriteria.setItemNo(itemNo);
            pkgSpecCriteria.setPkgCd(pkgCd);

            List<? extends Ws2501NxsPkgSpecificationDomain> pkgSpecList = wsBhtEisProductDao.searchNxsPkgSpecification(pkgSpecCriteria);

            // Existence check
            // 存在チェック
            if (pkgSpecList.isEmpty()){
                resultList.add(itemNo);
            }
        }

        return resultList.isEmpty();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmCigmaWhXrefOnMixTag(String, String, String, String[], String[])
     */

    public boolean validateDatabaseTmCigmaWhXrefOnMixTag(String lgcyLibCompCd, String lgcyWhCd, String plntCd, String[] whCompCd, String[] whCd)
        throws ApplicationException {

        // Acquisition of CIGMA Warehouse Cross Reference Master
        // 倉庫クロスリファレンス原単位の取得
        TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteriaDomain
            = new TmCigmaWhXrefCriteriaDomain();
        tmCigmaWhXrefCriteriaDomain.setLgcyLibCompCd(lgcyLibCompCd);
        tmCigmaWhXrefCriteriaDomain.setLgcyWhCd(lgcyWhCd);
        tmCigmaWhXrefCriteriaDomain.setPlntCd(plntCd);
        TmCigmaWhXrefDomain tmCigmaWhXrefDomain
            = tmCigmaWhXrefService.searchByKey(tmCigmaWhXrefCriteriaDomain);

        // In the case of 0 affair
        // 0件の場合
        if (tmCigmaWhXrefDomain == null) {
            return false;
        }

        // acquired data temporary maintenance
        // 取得データ一時保持
        whCompCd[0] = tmCigmaWhXrefDomain.getCompCd();
        whCd[0] = tmCigmaWhXrefDomain.getWhCd();
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmNxsWhOnMixTag(String, String, String, String[])
     */

    public boolean validateDatabaseTmNxsWhOnMixTag(String whCompCd, String whCd, String lgcyLibCompCd, String[] lgcyWhCd)
        throws ApplicationException {

        // Acquisition of NEXUS Warehouse Master, and a CIGMA Warehouse Cross Reference Master
        // 倉庫原単位、倉庫クロスリファレンス原単位の取得
        Ws2501TmNxsWhByXrefCriteriaDomain tmNxsWhByXrefCriteriaDomain
            = new Ws2501TmNxsWhByXrefCriteriaDomain();
        tmNxsWhByXrefCriteriaDomain.setCompCd(whCompCd);
        tmNxsWhByXrefCriteriaDomain.setWhCd(whCd);
        tmNxsWhByXrefCriteriaDomain.setLgcyLibCompCd(lgcyLibCompCd);
        List<? extends Ws2501TmNxsWhByXrefDomain> tmNxsWhByXrefDomainList
            = wsBhtEisProductDao.searchTmNxsWhByXref(tmNxsWhByXrefCriteriaDomain);

        // In the case of 0 affair
        // 0件の場合
        if (tmNxsWhByXrefDomainList.isEmpty()) {
            return false;
        }

        lgcyWhCd[0] = tmNxsWhByXrefDomainList.get(0).getLgcyWhCd();
        return true;

    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#transactOnMixTag(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)
     */

    public WsBhtEisProductDomain transactOnMixTag(
        WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        WsBhtEisProductDomain wsBhtEisProduct = new WsBhtEisProductDomain();
        Timestamp[] errCreateTimestamp = new Timestamp[1];

        String pltzInstrNo = criteria.getPltzInstrNo();

        // Lock of data
        // データのロック
        ws2508LockByPltzInstrNo(pltzInstrNo);

        // Setting of an internal variable (header)
        // 内部変数（ヘッダ）の設定
        searchWs2508HeaderData(criteria);

        // Setting of an internal variable (details)
        // 内部変数（明細）の設定
        searchWs2508DetailData(criteria);

        // input check
        // 入力チェック
        if (!checkInputData(criteria, errCreateTimestamp)){
            wsBhtEisProduct.setResultCd(WS_RESULT_ERROR_ERR_REPORT_OUT);
            wsBhtEisProduct.setErrCreateTimestamp(errCreateTimestamp[0].toString());
            return wsBhtEisProduct;
        }

        // Acquisition of MixTagNo
        // MixTagNoの取得
        String mixTagNo = createMixTagNo(
            criteria.getWs2508InternalVariableHdrDomain().getShipperCd(),
            criteria.getWs2508InternalVariableHdrDomain().getWhCd(),
            criteria.getScreenId());

        // Firm-order-receipt alloc processing
        // 確定受注引当処理
        List<TtMixtagOdrDomain> mixtagOdrList = allocWs2508Qty(mixTagNo, criteria);

        // Mix Tag KANBAN is registered.
        // MIX品かんばん情報を登録
        createWs2508Kanban(mixTagNo, criteria);

        // MIXED ITEM NO is registered.
        // MIXED品目番号を登録
        createWs2508MixTagItemNo(mixTagNo, criteria);

        // Mix Tag RT is registered.
        // MIXED用RT材を登録
        createWs2508MixTagRt(mixTagNo, criteria);

        // Registration of Mix Tag
        // MIXED現品票の登録
        createWs2508TtMixTag(mixTagNo, criteria);

        // A Temp Stock is updated and registered.
        // 仮在庫を更新・登録
        transactTmpStock(criteria);

        // Registration of ordering alloc track record (starting of Web service)
        // 受注引当実績の登録（Webサービスの起動）
        createRcvOdrAllocMixTag(criteria.getWs2508InternalVariableHdrDomain().getShipperCd(), mixtagOdrList);

        // A BHT productivity data information is registered.
        // BHT生産性データ情報を登録
        createWs2508BhtInfo(mixTagNo, criteria);

        // Setting of a returned value
        // 返却値の設定
        wsBhtEisProduct.setResultCd(WS_RESULT_SUCCESS);
        wsBhtEisProduct.setMixTagNo(mixTagNo);
        wsBhtEisProduct.setWs2508InternalVariableHdrDomain(criteria.getWs2508InternalVariableHdrDomain());

        return wsBhtEisProduct;

    }

    /**
     * Lock each table by a Palletize Instr. No.
     * <br />各テーブルを梱包指示Noでロックします。
     *
     * @param pltzInstrNo Palletize Instr. No.<br />梱包指示No
     * @throws ApplicationException When it cannot lock<br />ロックできない場合
     */
    protected void ws2508LockByPltzInstrNo(String pltzInstrNo) throws ApplicationException {

        // Only when Palletize Instr. No. is specified
        // 梱包指示Noが指定されている場合のみ
        if (isEmpty(pltzInstrNo)) {
            return;
        }

        // Lock of a Packaging Instruction (=Pull)
        // 梱包指示のロック
        TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
        ttPltzInstrCriteria.setPltzInstrNo(pltzInstrNo);
        assertNotEmpty(ttPltzInstrService.lockByKeyNoWait(ttPltzInstrCriteria), NXS_E1_5069);

        // Lock of a Palletize Instruction Item No
        // 梱包指示品目番号のロック
        TtPltzInstrItemNoCriteriaDomain ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
        ttPltzInstrItemNoCriteria.setPltzInstrNo(pltzInstrNo);
        assertNotEmpty(wsBhtEisProductDao.lockByKeyNoWaitTtPltzInstrItemNo(ttPltzInstrItemNoCriteria), NXS_E1_5069);

        // Lock of a Palletize Instruction Receive Order
        // 梱包指示品目番号受注情報のロック
        TtPltzInstrOdrCriteriaDomain ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
        ttPltzInstrOdrCriteria.setPltzInstrNo(pltzInstrNo);
        assertNotEmpty(wsBhtEisProductDao.lockByKeyNoWaitTtPltzInstrOdr(ttPltzInstrOdrCriteria), NXS_E1_5069);

        // The lock of Mix Tag
        // MIXED現品票のロック
        // #2159 ロックされるデータは存在しないので assertNoEmpty でチェックしない
        Ws2501TtMixTagCriteriaDomain ttMixtagCriteriaDomain = new Ws2501TtMixTagCriteriaDomain();
        ttMixtagCriteriaDomain.setPltzInstrNo(pltzInstrNo);
        wsBhtEisProductDao.lockByConditionNoWaitTtMixTag(ttMixtagCriteriaDomain);
    }

    /**
     * Acquire a Packaging Instruction (=Pull) information and set up an internal variable (header).
     * <br />梱包指示情報を取得して、内部変数（ヘッダ）を設定します。
     *
     * @param criteria Eis Product Eis Product domain<br />ドメイン
     * @throws ApplicationException When a Packaging Instruction (=Pull) information is unacquirable<br />梱包指示情報が取得できない場合
     */
    protected void searchWs2508HeaderData(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setLoginUserDscId(criteria.getLoginUserDscId());
        internalVariableHdr.setPltzInstrNo(criteria.getPltzInstrNo());
        internalVariableHdr.setShipperCd(criteria.getShipperCd());
        internalVariableHdr.setCustomerCd(criteria.getCustomerCd());
        internalVariableHdr.setLgcyShipTo(criteria.getLgcyShipTo());
        internalVariableHdr.setTrnsCd(criteria.getTrnsCd());
        internalVariableHdr.setPlntCd(criteria.getPlntCd());
        internalVariableHdr.setLgcyWhCd(criteria.getLgcyWhCd());
        internalVariableHdr.setWhCompCd(criteria.getWhCompCd());
        internalVariableHdr.setWhCd(criteria.getWhCd());
        internalVariableHdr.setBoxNo(criteria.getBoxNo());
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
    }

    /**
     * Set up an internal variable (details).
     * <br />内部変数（明細）を設定します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When it becomes an error by the Web service which cannot access a database and which cannot acquire a lock
     *                              <br />データベースにアクセスできない、ロックが取得できない、Webサービスでエラーになった場合
     */
    protected void searchWs2508DetailData(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        // Internal variable (details) initial setting
        // 内部変数（明細）初期設定
        initInternalVariableDtlMixTag(criteria);

        // Lock of data
        // データのロック
        dataLock(criteria);

        // Acquisition of an ITEM-NO information (NEXUS side information)
        // 品目番号情報の取得（NEXUS側情報）
        searchWs2508NexusInfo(criteria);

        // Acquisition of an ITEM-NO information (CIGMA side information)
        // 品目番号情報の取得（CIGMA側情報)
        searchWs2508CigmaInfo(criteria);
    }

    /**
     * Set up the initial value of an internal variable (detailed) domain from an Eis Product search-condition domain.
     * <br />Eis Product検索条件ドメインより内部変数（明細）ドメインの初期値を設定します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     */
    protected void initInternalVariableDtlMixTag(WsBhtEisProductCriteriaDomain criteria){

        // ITEM-NO +":"+ packing CD   Map of internalVariableDtlDomain (the order of a BRANCH)
        // 品目番号 + ":" + 包装コード と internalVariableDtlDomain のマップ (枝番順)
        Map<String, Ws2501InternalVariableDtlDomain> internalVariableDtlDomains = new LinkedHashMap<String, Ws2501InternalVariableDtlDomain>();

        // BRANCH
        // 枝番
        int seq = 0;

        StringBuilder keyBuilder = new StringBuilder(32);

        for (Ws2501ItemNoDomain itemNo : criteria.getWs2508ItemNoList()) {
            keyBuilder.setLength(0);
            String key = keyBuilder.append(itemNo.getItemNo())
                                   .append(":")
                                   .append(itemNo.getPkgCd())
                                   .toString();

            Ws2501InternalVariableDtlDomain internalVariableDtlDomain = internalVariableDtlDomains.get(key);
            if (internalVariableDtlDomain == null) {

                internalVariableDtlDomain = new Ws2501InternalVariableDtlDomain();
                internalVariableDtlDomains.put(key, internalVariableDtlDomain);

                if (FLAG_N.equals(itemNo.getMixTagFlg())) {
                    internalVariableDtlDomain.setSeq(BigDecimal.valueOf(++seq));
                }

                internalVariableDtlDomain.setItemNo(itemNo.getItemNo());
                internalVariableDtlDomain.setPkgCd(itemNo.getPkgCd());
                internalVariableDtlDomain.setCustomerItemNo(itemNo.getCustomerItemNo());
                internalVariableDtlDomain.setQty(ZERO);
                internalVariableDtlDomain.setTagQty(ZERO);
                internalVariableDtlDomain.setInternalVariableDtlKanbanDomainList(new ArrayList<Ws2501InternalVariableDtlKanbanDomain>());
            }

            // ----------------------------------------------------------------

            internalVariableDtlDomain.setQty(internalVariableDtlDomain.getQty().add(itemNo.getKanbanQty()));
            internalVariableDtlDomain.setTagQty(internalVariableDtlDomain.getTagQty().add(ONE));

            // ----------------------------------------------------------------

            @SuppressWarnings("unchecked")
            List<Ws2501InternalVariableDtlKanbanDomain> internalVariableDtlKanbanDomainList =
                (List<Ws2501InternalVariableDtlKanbanDomain>) internalVariableDtlDomain.getInternalVariableDtlKanbanDomainList();

            Ws2501InternalVariableDtlKanbanDomain internalVariableDtlKanbanDomain = new Ws2501InternalVariableDtlKanbanDomain();
            internalVariableDtlKanbanDomain.setExpIndusTypCd(itemNo.getIndusTypCd());
            internalVariableDtlKanbanDomain.setExpKanbanTyp(itemNo.getKanbanTyp());
            internalVariableDtlKanbanDomain.setTagSeqNo(itemNo.getTagSeqNo());
            internalVariableDtlKanbanDomain.setQty(itemNo.getKanbanQty());
            internalVariableDtlKanbanDomain.setCustomerTagSeqNo(itemNo.getCustomerTagSeqNo());
            internalVariableDtlKanbanDomainList.add(internalVariableDtlKanbanDomain);
        }

        criteria.setWs2508InternalVariableDtlDomainList(new ArrayList<Ws2501InternalVariableDtlDomain>(internalVariableDtlDomains.values()));
        criteria.setMaxSeq(BigDecimal.valueOf(seq));
    }

    /**
     * Lock an Export Receive Order.
     * <br />輸出受注をロックします。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When an Export Receive Order cannot be locked<br />輸出受注をロックできない場合
     */
    protected void dataLock(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        // When Palletize Instr. No. is not inputted
        // 梱包指示Noが入力されてない場合
        if(CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())){
            Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2508InternalVariableHdrDomain();

            Ws2501TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new Ws2501TtExpRcvOdrCriteriaDomain();
            ttExpRcvOdrCriteria.setRcvOdrCompCd(internalVariableHdr.getShipperCd());
            ttExpRcvOdrCriteria.setCustomerCd(internalVariableHdr.getCustomerCd());
            ttExpRcvOdrCriteria.setLgcyShipTo(internalVariableHdr.getLgcyShipTo());
            ttExpRcvOdrCriteria.setTrnsCd(internalVariableHdr.getTrnsCd());

            List<Ws2501TtExpRcvOdrDomain> ttExpRcvOdrListAdd = new ArrayList<Ws2501TtExpRcvOdrDomain>();
            List<String> errOdrList = new ArrayList<String>();
            for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2508InternalVariableDtlDomainList()){
                List<Map<String, String>> itemNoPkgCdList = new ArrayList<Map<String, String>>();
                Map<String, String> itemNoPkgCdMap = new HashMap<String, String>();
                itemNoPkgCdMap.put("itemNo", internalVariableDtl.getItemNo());
                itemNoPkgCdMap.put("pkgCd", internalVariableDtl.getPkgCd());
                itemNoPkgCdList.add(itemNoPkgCdMap);
                ttExpRcvOdrCriteria.setItemNoPkgCdList(itemNoPkgCdList);
                List<? extends Ws2501TtExpRcvOdrDomain> ttExpRcvOdrList = wsBhtEisProductDao.lockByKeyNoWaitTtExpRcvOdr(ttExpRcvOdrCriteria);
                if(ttExpRcvOdrList.isEmpty()) {
                    errOdrList.add(internalVariableDtl.getItemNo() + "," + internalVariableDtl.getPkgCd());
                } else {
                    ttExpRcvOdrListAdd.add(ttExpRcvOdrList.get(0));
                }
            }
            criteria.setWs2503TtExpRcvOdrList(ttExpRcvOdrListAdd);
            criteria.setErrOdrList(errOdrList);
        }
    }

    /**
     * Acquire an ITEM-NO information (NEXUS side information).
     * <br />品目番号情報を取得（NEXUS側情報）します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When an Export Receive Order etc. cannot be referred to<br />輸出受注等が参照できない場合
     */
    protected void searchWs2508NexusInfo(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2508InternalVariableHdrDomain();

        String pltzInstrNo = internalVariableHdr.getPltzInstrNo();
        String shipperCd = internalVariableHdr.getShipperCd();
        String customerCd = internalVariableHdr.getCustomerCd();
        String lgcyShipTo = internalVariableHdr.getLgcyShipTo();
        String trnsCd = internalVariableHdr.getTrnsCd();
        Date aplyStrtDt = DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd));
        String lgcyWhCd = internalVariableHdr.getLgcyWhCd();
        List<String> errOdrList = criteria.getErrOdrList();

        // When Palletize Instr. No. is inputted
        // 梱包指示Noが入力されている場合
        if(!CheckUtil.isBlankOrNull(pltzInstrNo)){

            for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2508InternalVariableDtlDomainList()){
                // Acquisition of an ITEM-NO information
                // 品目番号情報の取得
                Ws2501ItemNoNxsPltzInstNoCriteriaDomain itemNoNxsPltzInstNoCriteria = new Ws2501ItemNoNxsPltzInstNoCriteriaDomain();
                itemNoNxsPltzInstNoCriteria.setPltzInstrNo(pltzInstrNo);
                itemNoNxsPltzInstNoCriteria.setItemNo(internalVariableDtl.getItemNo());
                itemNoNxsPltzInstNoCriteria.setPkgCd(internalVariableDtl.getPkgCd());
                itemNoNxsPltzInstNoCriteria.setAplyStrtDt(aplyStrtDt);

                List<? extends Ws2501ItemNoNxsPltzInstNoDomain> itemNoNxsPltzInstNoList = wsBhtEisProductDao.searchItemNoNxsPltzInstNo(
                    itemNoNxsPltzInstNoCriteria);

                Ws2501ItemNoNxsPltzInstNoDomain itemNoNxsPltzInstNoDomain = itemNoNxsPltzInstNoList.get(0);

                // Setting of an internal variable (details)
                // 内部変数（明細）の設定
                internalVariableDtl.setInstrQty(new BigDecimal(itemNoNxsPltzInstNoDomain.getInstrQty()));
                internalVariableDtl.setOdrQty(BigDecimal.ZERO);
                if (itemNoNxsPltzInstNoDomain.getSumQty() == null) {
                    internalVariableDtl.setPltzQty(new BigDecimal(itemNoNxsPltzInstNoDomain.getPackedQty()));
                } else {

                    internalVariableDtl.setPltzQty(new BigDecimal(itemNoNxsPltzInstNoDomain.getPackedQty()).add(
                            new BigDecimal(itemNoNxsPltzInstNoDomain.getSumQty())));
                }
                internalVariableDtl.setContainerSortingKey(itemNoNxsPltzInstNoDomain.getContainerSortingKey());
                internalVariableDtl.setLoadingCd(itemNoNxsPltzInstNoDomain.getLoadingCd());
                internalVariableDtl.setInvoiceKey(itemNoNxsPltzInstNoDomain.getInvoiceKey());
                internalVariableDtl.setStgInstrItemFlg(itemNoNxsPltzInstNoDomain.getStgInstrItemFlg());
                internalVariableDtl.setCustomTimingTyp(itemNoNxsPltzInstNoDomain.getCustomTimingTyp());
                internalVariableDtl.setContainerLooseTyp(itemNoNxsPltzInstNoDomain.getContainerLooseTyp());
                internalVariableDtl.setItemDescription(itemNoNxsPltzInstNoDomain.getItemDescription());
                internalVariableDtl.setExpLimitTyp(itemNoNxsPltzInstNoDomain.getExpLimitTyp());
                internalVariableDtl.setDngrItemFlg(itemNoNxsPltzInstNoDomain.getDngrItemFlg());
                internalVariableDtl.setOriginCntryCd(itemNoNxsPltzInstNoDomain.getOriginCntryCd());
                internalVariableDtl.setTmpStockQty(new BigDecimal(itemNoNxsPltzInstNoDomain.getQty()));
                internalVariableDtl.setWeightUnit(itemNoNxsPltzInstNoDomain.getWeightUnit());
                internalVariableDtl.setItemWeight(new BigDecimal(itemNoNxsPltzInstNoDomain.getNetWeightA()));
                internalVariableDtl.setPkgFormTyp(itemNoNxsPltzInstNoDomain.getPkgFormTyp());
                internalVariableDtl.setMixTagFlg(itemNoNxsPltzInstNoDomain.getMltInBoxArrowFlg());
                internalVariableDtl.setLotSize(new BigDecimal(itemNoNxsPltzInstNoDomain.getLotSize()));
            }
        }else{

            for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2508InternalVariableDtlDomainList()){

                // Acquisition of an ITEM-NO information
                // 品目番号情報の取得
                Ws2501ItemNoNxsNonPltzInstNoCriteriaDomain itemNoNxsNonPltzInstNoCriteria = new Ws2501ItemNoNxsNonPltzInstNoCriteriaDomain();
                itemNoNxsNonPltzInstNoCriteria.setRcvOdrCompCd(shipperCd);
                itemNoNxsNonPltzInstNoCriteria.setItemNo(internalVariableDtl.getItemNo());
                itemNoNxsNonPltzInstNoCriteria.setPkgCd(internalVariableDtl.getPkgCd());
                itemNoNxsNonPltzInstNoCriteria.setCustomerCd(customerCd);
                itemNoNxsNonPltzInstNoCriteria.setLgcyShipTo(lgcyShipTo);
                itemNoNxsNonPltzInstNoCriteria.setTrnsCd(trnsCd);
                itemNoNxsNonPltzInstNoCriteria.setAplyStrtDt(aplyStrtDt);
                itemNoNxsNonPltzInstNoCriteria.setLgcyWhCd(lgcyWhCd);
                itemNoNxsNonPltzInstNoCriteria.setOdrFirmFlg("Y");
                itemNoNxsNonPltzInstNoCriteria.setShippedTyp("1");

                // Order check
                // 受注チェック
                boolean errOdrFlg = false;
                if(!errOdrList.isEmpty()) {
                    for(int i = 0; i < errOdrList.size(); i++) {
                        String errOdr = errOdrList.get(i);
                        String[] errItem = errOdr.split(",");
                        String itemNo = errItem[0];
                        String pkgCd = errItem[1];
                        if(itemNo.equals(internalVariableDtl.getItemNo()) && pkgCd.equals(internalVariableDtl.getPkgCd())) {
                            errOdrFlg = true;
                        }
                    }
                }
                List<? extends Ws2501ItemNoNxsNonPltzInstNoDomain> ItemNoNxsNonPltzInstNoList;
                if(!errOdrFlg) {
                    ItemNoNxsNonPltzInstNoList = wsBhtEisProductDao.searchItemNoNxsNonPltzInstNo(
                        itemNoNxsNonPltzInstNoCriteria);
                } else {
                    ItemNoNxsNonPltzInstNoList = wsBhtEisProductDao.searchItemNoNxsNonPltzInstNoErrOdr(
                        itemNoNxsNonPltzInstNoCriteria);
                    ItemNoNxsNonPltzInstNoList.get(0).setOrderQty(STRING_ZERO);
                }

                Ws2501ItemNoNxsNonPltzInstNoDomain itemNoNxsNonPltzInstNoDomain = ItemNoNxsNonPltzInstNoList.get(0);

                // Setting of an internal variable (details)
                // 内部変数（明細）の設定
                internalVariableDtl.setOdrQty(new BigDecimal(itemNoNxsNonPltzInstNoDomain.getOrderQty()));
                internalVariableDtl.setContainerSortingKey(itemNoNxsNonPltzInstNoDomain.getContainerSortingKey());
                internalVariableDtl.setLoadingCd(itemNoNxsNonPltzInstNoDomain.getLoadingCd());
                internalVariableDtl.setInvoiceKey(itemNoNxsNonPltzInstNoDomain.getInvoiceKey());
                internalVariableDtl.setStgInstrItemFlg(itemNoNxsNonPltzInstNoDomain.getStgInstrItemFlg());
                internalVariableDtl.setCustomTimingTyp(itemNoNxsNonPltzInstNoDomain.getCustomTimingTyp());
                internalVariableDtl.setContainerLooseTyp(itemNoNxsNonPltzInstNoDomain.getContainerLooseTyp());
                internalVariableDtl.setItemDescription(itemNoNxsNonPltzInstNoDomain.getItemDescription());
                internalVariableDtl.setExpLimitTyp(itemNoNxsNonPltzInstNoDomain.getExpLimitTyp());
                internalVariableDtl.setDngrItemFlg(itemNoNxsNonPltzInstNoDomain.getDngrItemFlg());
                internalVariableDtl.setOriginCntryCd(itemNoNxsNonPltzInstNoDomain.getOriginCntryCd());
                internalVariableDtl.setTmpStockQty(new BigDecimal(itemNoNxsNonPltzInstNoDomain.getQty()));
                internalVariableDtl.setWeightUnit(itemNoNxsNonPltzInstNoDomain.getWeightUnit());
                internalVariableDtl.setItemWeight(new BigDecimal(itemNoNxsNonPltzInstNoDomain.getNetWeightA()));
                internalVariableDtl.setPkgFormTyp(itemNoNxsNonPltzInstNoDomain.getPkgFormTyp());
                internalVariableDtl.setMixTagFlg(itemNoNxsNonPltzInstNoDomain.getMltInBoxArrowFlg());
                internalVariableDtl.setLotSize(new BigDecimal(itemNoNxsNonPltzInstNoDomain.getLotSize()));
            }
        }
    }

    /**
     * Acquire an ITEM-NO information (CIGMA side information).
     * <br />品目番号情報を取得（CIGMA側情報)します。
     *
     * @param criteria BIS Product domain<br />BIS Product ドメイン
     * @throws ApplicationException When this is subtracted by the calculation of inventory figures which an error can generate and a Measure Unit Master cannot refer to by Web service
     *                              <br />Webサービスでエラーが発生、計量単位原単位が参照できない、在庫数の計算でマイナスになった場合
     */
    protected void searchWs2508CigmaInfo(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2508InternalVariableHdrDomain();
        String shipperCd = internalVariableHdr.getShipperCd();

        // factory code setting
        // 工場コード設定
        List<String> plntCdList;

        // When Palletize Instr. No. is not inputted but a NEXUS W/H flag is 'Y'
        // 梱包指示Noが入力されておらず、NEXUS倉庫フラグが'Y'の場合
        if (CheckUtil.isBlankOrNull(criteria.getPltzInstrNo()) && (FLAG_Y.equals(criteria.getNxsStockFlg()))){

            // Acquisition of NEXUS Warehouse Master, and a CIGMA Warehouse Cross Reference Master
            // 倉庫原単位、倉庫クロスリファレンス原単位の取得
            Ws2501TmNxsWhByXrefCriteriaDomain tmNxsWhByXrefCriteriaDomain = new Ws2501TmNxsWhByXrefCriteriaDomain();
            tmNxsWhByXrefCriteriaDomain.setCompCd(internalVariableHdr.getWhCompCd());
            tmNxsWhByXrefCriteriaDomain.setWhCd(internalVariableHdr.getWhCd());
            tmNxsWhByXrefCriteriaDomain.setLgcyLibCompCd(shipperCd);

            plntCdList = new ArrayList<String>();
            for (Ws2501TmNxsWhByXrefDomain tmNxsWhByXref : wsBhtEisProductDao.searchTmNxsWhByXref(tmNxsWhByXrefCriteriaDomain)){
                plntCdList.add(tmNxsWhByXref.getPlntCd());
            }
        } else {
            plntCdList = singletonList(internalVariableHdr.getPlntCd());
        }

        List<? extends Ws2501InternalVariableDtlDomain> internalVariableDtlList = criteria.getWs2508InternalVariableDtlDomainList();

        List<Ws2004ResultItemDomain> itemList = searchItemNoFromCigma(shipperCd,
                                                                      plntCdList,
                                                                      internalVariableHdr.getLgcyWhCd(),
                                                                      internalVariableDtlList,
                                                                      internalVariableHdr.getCustomerCd());

        populateItemNo(itemList, internalVariableDtlList);
    }

    /**
     * Acquire an ITEM-NO information (CIGMA side information).
     * <br />品目番号情報（CIGMA側情報）を取得する。
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param plntCdList Factory code list<br />工場コードリスト
     * @param lgcyWhCd W/H CD (LEGACY)<br />倉庫コード（LEGACY)
     * @param internalVariableDtlList Internal variable (details)<br />内部変数（明細）
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @return Result Item Domain of W2004
     * @throws ApplicationException If an item information can not be obtained
     */
    @SuppressWarnings("unchecked")
    protected List<Ws2004ResultItemDomain> searchItemNoFromCigma(
            String shipperCd,
            List<String> plntCdList,
            String lgcyWhCd,
            List<? extends Ws2501InternalVariableDtlDomain> internalVariableDtlList,
            String customerCd) throws ApplicationException {
        List<String> itemNoList = new ArrayList<String>(internalVariableDtlList.size());
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : internalVariableDtlList){
            itemNoList.add(internalVariableDtl.getItemNo());
        }

        return (List<Ws2004ResultItemDomain>) ws2004RestService.searchItemInfoForCml(
                    shipperCd, plntCdList, lgcyWhCd, itemNoList, customerCd).getItemList();
    }

    /**
     * An ITEM-NO information (CIGMA side information) is reflected in an internal variable (detailed) from {@link Ws2004ResultDomain}.
     * <br />{@link Ws2004ResultDomain} から品目番号情報（CIGMA側情報）を内部変数（明細）に反映する。
     *
     * @param resultItemList Result Domain of W2004
     * @param internalVariableDtlList Internal variable (details)<br />内部変数（明細）
     * @throws ApplicationException If an item information can not be obtained
     */
    protected void populateItemNo(
            List<Ws2004ResultItemDomain> resultItemList,
            List<? extends Ws2501InternalVariableDtlDomain> internalVariableDtlList)
        throws ApplicationException {

        if (resultItemList == null || resultItemList.isEmpty()) {
            return;
        }

        // The map of ITEM NO, and Ws2004ResultItemDomain
        // 品目番号と Ws2004ResultItemDomain のマップ
        Map<String, Ws2004ResultItemDomain> resultItems = new HashMap<String, Ws2004ResultItemDomain>();

        // QUANTITY-UNIT conversion map (this is used in order not to carry out the multiple-times search of the same QUANTITY UNIT)
        // 数量単位変換マップ （同じ数量単位を複数回検索しないようにするために使用）
        Map<String, String> unitCdMap = new HashMap<String, String>();

        for (Ws2004ResultItemDomain resultItem : resultItemList){

            resultItems.put(resultItem.getItnbr(), resultItem);

            String unitCd = unitCdMap.get(resultItem.getUnmsr());
            if (unitCd == null) {

                TmMeasureUnitCriteriaDomain tmMeasureUnitCriteria = new TmMeasureUnitCriteriaDomain();
                tmMeasureUnitCriteria.setLgcyUnitCd(resultItem.getUnmsr());
                tmMeasureUnitCriteria.setRowNumFrom(ROW_NUM_1);
                tmMeasureUnitCriteria.setRowNumTo(ROW_NUM_1);

                List<TmMeasureUnitDomain> tmMeasureUnitList = tmMeasureUnitService.searchByConditionForPaging(tmMeasureUnitCriteria);
                assertTrue(!tmMeasureUnitList.isEmpty());

                unitCdMap.put(resultItem.getUnmsr(), tmMeasureUnitList.get(0).getUnitCd());
            }
        }

        // An internal variable (details) is set up.
        // 内部変数（明細）を設定
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : internalVariableDtlList) {

            Ws2004ResultItemDomain resultItem = resultItems.get(internalVariableDtl.getItemNo());
            if (resultItem == null) {
                continue;
            }

            internalVariableDtl.setStkQty(new BigDecimal(resultItem.getMohtq()).subtract(internalVariableDtl.getTmpStockQty()));
            internalVariableDtl.setPlntCd(resultItem.getPackc());
            internalVariableDtl.setCurrCd(resultItem.getCurr3());
            internalVariableDtl.setQtyUnit(unitCdMap.get(resultItem.getUnmsr()));
        }
    }


    /**
     * Perform an input check.
     * <br />入力チェックを行います。
     *
     * @param criteria Eis Product domain<br />Eis Productドメイン
     * @param errCreateTimestamp Error registration time stamp<br />エラー登録タイムスタンプ
     * @return Checked result<br />チェック結果
     * @throws ApplicationException When a CML Error Report Header and a CML Error Report Detail cannot be accessed
     *                              <br />CMLエラーレポートヘッダ、CMLエラーレポート明細にアクセスできない場合
     */
    protected boolean checkInputData(WsBhtEisProductCriteriaDomain criteria, Timestamp[] errCreateTimestamp) throws ApplicationException{

        boolean errFlg = false;
        boolean doorFlg = false;
        boolean backFlg = false;

        // DSC-ID
        String dscId = criteria.getLoginUserDscId();
        // PALLETIZE INSTRUCTION NO
        String pltzInstrNo = criteria.getWs2508InternalVariableHdrDomain().getPltzInstrNo();

        // ERROR CREATE TIMESTAMP
        // エラーレポート作成日時
        errCreateTimestamp[0] = new Timestamp(new Date().getTime());

        // CML-Error-Report-Header domain
        // CMLエラーレポートヘッダドメイン
        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();
        ttCmlErrorHeader.setDscId(dscId);
        ttCmlErrorHeader.setErrCreateTimestamp(errCreateTimestamp[0]);

        // The list of CML-Error-Report-Detail domains
        // CMLエラーレポート明細ドメインのリスト
        List<TtCmlErrorDtlDomain> ttCmlErrorDtlList = new ArrayList<TtCmlErrorDtlDomain>();

        // For a backup
        // 退避用
        String tmpInvoiceKey = null;
        String tmpContainerSortingKey = null;
        String tmpCurrCd = null;
        String tmpContainerLooseTyp = null;
        String tmpCustomTimingTyp = null;

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2508InternalVariableDtlDomainList()) {
            // Initial value setting of ITEM NO CHECK FLAG
            // 品目番号チェックフラグの初期値設定
            StringBuffer itemNoChkFlg = new StringBuffer(MNF_FLAG_OK + MNF_FLAG_OK + MNF_FLAG_OK + MNF_FLAG_OK); // UT298 MOD

            String mixTagFlg = internalVariableDtl.getMixTagFlg();
            String pkgFormTyp = internalVariableDtl.getPkgFormTyp();
            String invoiceKey = internalVariableDtl.getInvoiceKey();
            String containerSortingKey = internalVariableDtl.getContainerSortingKey();
            String currCd = internalVariableDtl.getCurrCd();
            String loadingCd = internalVariableDtl.getLoadingCd();
            String stgInstrItemFlg = internalVariableDtl.getStgInstrItemFlg();
            String containerLooseTyp = internalVariableDtl.getContainerLooseTyp();
            String customTimingTyp = internalVariableDtl.getCustomTimingTyp();

            tmpInvoiceKey = defaultString(tmpInvoiceKey, invoiceKey);
            tmpContainerSortingKey = defaultString(tmpContainerSortingKey, containerSortingKey);
            tmpCurrCd = defaultString(tmpCurrCd, currCd);
            tmpContainerLooseTyp = defaultString(tmpContainerLooseTyp, containerLooseTyp);
            tmpCustomTimingTyp = defaultString(tmpCustomTimingTyp, customTimingTyp);

            // Correlation check
            // PACKAGE-FORM-TYPE check
            // 相関チェック
            // 梱包形態チェック
            if (PKG_FORM_TYP_SINGLE.equals(pkgFormTyp)) {
                errFlg = true;
                ttCmlErrorHeader.setChkResultE(NG);
            }

            // Inv. Key check
            // インボイスキーチェック
            if (!StringUtils.equals(tmpInvoiceKey, invoiceKey)) {
                errFlg = true;
                ttCmlErrorHeader.setChkResultF(NG);
            }

            // CONTAINER-SORTING-KEY check
            // コンテナ層別キーチェック
            if (!StringUtils.equals(tmpContainerSortingKey, containerSortingKey)) {
                errFlg = true;
                ttCmlErrorHeader.setChkResultG(NG);
            }

            // Currency check
            // 通貨チェック
            if (!StringUtils.equals(tmpCurrCd, currCd)) {
                errFlg = true;
                ttCmlErrorHeader.setChkResultH(NG);
            }

            // loading position code check
            // 荷積み位置コードチェック
            if (LOADING_CD_DOOR.equals(loadingCd)) {
                doorFlg = true;
            }
            if (LOADING_CD_BACK.equals(loadingCd)) {
                backFlg = true;
            }

            if (doorFlg && backFlg) {
                errFlg = true;
                ttCmlErrorHeader.setChkResultI(NG);
            }

            // staging-instruction flag check
            // 荷揃え指示フラグチェック
            if (FLAG_Y.equals(stgInstrItemFlg)) {
                errFlg = true;
                ttCmlErrorHeader.setChkResultJ(NG);
            }

            // /C/L check
            // コンテナルーズチェック
            if (!StringUtils.equals(tmpContainerLooseTyp, containerLooseTyp)) {
                errFlg = true;
                ttCmlErrorHeader.setChkResultK(NG);
            }

            // CUSTOM-TIMING-TYPE check
            // 通関タイミング区分チェック
            if (!StringUtils.equals(tmpCustomTimingTyp, customTimingTyp)) {
                errFlg = true;
                ttCmlErrorHeader.setChkResultL(NG);
            }

            // MULTI-ITEM-NO-IN-BOX-ALLOW-FLAG check
            // 小箱内多品許可フラグチェック
            if (FLAG_N.equals(mixTagFlg)) {
                errFlg = true;
                ttCmlErrorHeader.setChkResultS(NG);
            }

            // Each item backup
            // 各項目退避
            tmpInvoiceKey = invoiceKey;
            tmpContainerSortingKey = containerSortingKey;
            tmpCurrCd = currCd;
            tmpContainerLooseTyp = containerLooseTyp;
            tmpCustomTimingTyp = customTimingTyp;

            // ITEM-NO check
            // 品目番号チェック
            if (!chkWs2508ItemNo(internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, pltzInstrNo)) {
                errFlg = true;
            }

            // A setting of CML-Error-Report-Detail list
            // CMLエラーレポート明細リストの設定
            addWs2508CmlDtlList(internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, pltzInstrNo, ttCmlErrorDtlList, criteria.getScreenId());
        }
        // When error occurs
        // エラーが発生した場合
        if(errFlg){
            // CML-Error-Report-Header registration
            // CMLエラーレポートヘッダ登録
            createWs2508CmlHdr(criteria.getWs2508InternalVariableHdrDomain(), ttCmlErrorHeader, criteria.getNxsStockFlg(), criteria.getScreenId());

            // CML-Error-Report-Detail registration
            // CMLエラーレポート明細登録
            for (TtCmlErrorDtlDomain ttCmlErrorDtl : ttCmlErrorDtlList){
                ttCmlErrorDtlService.create(ttCmlErrorDtl);
            }
            return false;
        }
        return true;
    }

    /**
     * Check an ITEM NO.
     * <br />品目番号をチェックします。
     *
     * @param internalVariableDtl Internal variable (details) domain<br />内部変数（明細）ドメイン
     * @param ttCmlErrorHeader CML-Error-Report-Header domain<br />CMLエラーレポートヘッダドメイン
     * @param itemNoChkFlg The item for ITEM-NO-CHECK-FLAG registration of a CML Error Report Detail<br />CMLエラーレポート明細の品目番号チェックフラグ登録用項目
     * @param pltzInstrNo PALLETIZE INSTRUCTION NO<br />梱包指示NO
     * @return Checked result<br />チェック結果
     */
    protected boolean chkWs2508ItemNo(Ws2501InternalVariableDtlDomain internalVariableDtl, TtCmlErrorHeaderDomain ttCmlErrorHeader, StringBuffer itemNoChkFlg, String pltzInstrNo){

        boolean errFlg = false;

        BigDecimal qty = internalVariableDtl.getQty();
        BigDecimal pltzQty = internalVariableDtl.getPltzQty();
        BigDecimal odrQty = internalVariableDtl.getOdrQty();
        BigDecimal instrQty = internalVariableDtl.getInstrQty();
        BigDecimal lotSize = internalVariableDtl.getLotSize();
        String currCd = internalVariableDtl.getCurrCd();
        String plntCd = internalVariableDtl.getPlntCd();
        String qtyUnit = internalVariableDtl.getQtyUnit();
        String itemDescription = internalVariableDtl.getItemDescription();
        String dngrItemFlg = internalVariableDtl.getDngrItemFlg();
//        String originCntryCd = internalVariableDtl.getOriginCntryCd();
//        String expLimitTyp = internalVariableDtl.getExpLimitTyp();

        // When there is not Palletize Instr. No.
        // 梱包指示Noがない場合
        if(CheckUtil.isBlankOrNull(pltzInstrNo)){
            // Order over check
            // オーダー越えチェック
            if (qty.subtract(odrQty).compareTo(BigDecimal.ZERO) > 0 || odrQty.equals(BigDecimal.ZERO)){
                ttCmlErrorHeader.setChkResultM(NG);
                errFlg = true;
            }
        }

        // When there is a Palletize Instr. No.
        // 梱包指示Noがある場合
        if(!CheckUtil.isBlankOrNull(pltzInstrNo)){
            // Directions over check
            // 指示越えチェック
            if (qty.add(pltzQty).subtract(instrQty).compareTo(BigDecimal.ZERO) > 0){
                ttCmlErrorHeader.setChkResultN(NG);
                errFlg = true;
            }
        }

        // SHIPPING-LOT over check
        // 出荷ロット超えチェック
        if (qty.subtract(lotSize).compareTo(BigDecimal.ZERO) > 0){
            ttCmlErrorHeader.setChkResultO(NG);
            errFlg = true;
        }

        // CIGMA information acquisition check
        // CIGMA情報取得チェック
        if (CheckUtil.isBlankOrNull(currCd) || CheckUtil.isBlankOrNull(plntCd) || CheckUtil.isBlankOrNull(qtyUnit)){
            ttCmlErrorHeader.setChkResultP(NG);
            itemNoChkFlg.replace(0, 1, MNF_FLAG_NG); // UT298 MOD
            errFlg = true;
        }

        // Special-Information number information acquisition check
        // 輸出出荷品目番号情報取得チェック
        if (CheckUtil.isBlankOrNull(itemDescription)){
            ttCmlErrorHeader.setChkResultP(NG);
            itemNoChkFlg.replace(1, 2, MNF_FLAG_NG); // UT298 MOD
            errFlg = true;
        }

        // export-formalities ITEM-NO information acquisition check
        // 輸出手続き品目番号情報取得チェック
        if (CheckUtil.isBlankOrNull(dngrItemFlg)){
            ttCmlErrorHeader.setChkResultP(NG);
            itemNoChkFlg.replace(2, 3, MNF_FLAG_NG); // UT298 MOD
            errFlg = true;
        }

        return !errFlg;
    }

    /**
     * Add a domain to a CML-Error-Report-Detail list.
     * <br />CMLエラーレポート明細リストにドメインを追加します。
     *
     * @param internalVariableDtl Internal variable (details) domain<br />内部変数（明細）ドメイン
     * @param ttCmlErrorHeader CML-Error-Report-Header domain<br />CMLエラーレポートヘッダドメイン
     * @param itemNoChkFlg The item for ITEM-NO-CHECK-FLAG registration of a CML Error Report Detail<br />CMLエラーレポート明細の品目番号チェックフラグ登録用項目
     * @param pltzInstrNo PALLETIZE INSTRUCTION NO<br />梱包指示NO
     * @param ttCmlErrorDtlList CML-Error-Report-Detail list<br />CMLエラーレポート明細リスト
     * @param screenId SCREEN ID<br />画面ID
     * @throws ApplicationException When a CML Error Report Header cannot be accessed<br />CMLエラーレポートヘッダにアクセスできない場合
     */
    protected void addWs2508CmlDtlList(Ws2501InternalVariableDtlDomain internalVariableDtl, TtCmlErrorHeaderDomain ttCmlErrorHeader,
        StringBuffer itemNoChkFlg, String pltzInstrNo, List<TtCmlErrorDtlDomain> ttCmlErrorDtlList, String screenId)
        throws ApplicationException{

        // CML-Error-Report-Detail domain
        // CMLエラーレポート明細ドメイン
        TtCmlErrorDtlDomain ttCmlErrorDtl = new TtCmlErrorDtlDomain();

        CommonUtil.copyPropertiesDomainToDomain(ttCmlErrorDtl, internalVariableDtl);

        // DSC-ID
        String dscId = ttCmlErrorHeader.getDscId();
        ttCmlErrorDtl.setDscId(dscId);

        // ERROR CREATE TIMESTAMP
        // エラーレポート作成日時
        Timestamp errCreateTimestamp = ttCmlErrorHeader.getErrCreateTimestamp();
        ttCmlErrorDtl.setErrCreateTimestamp(errCreateTimestamp);

        ttCmlErrorDtl.setMixTagFlg(FLAG_N);
        ttCmlErrorDtl.setMixPltzCompltFlg("");
        ttCmlErrorDtl.setMltInBoxAllowFlg("");
        ttCmlErrorDtl.setShippingLot(internalVariableDtl.getLotSize());
        ttCmlErrorDtl.setScanQty(internalVariableDtl.getTagQty());

        // Setting of each QUANTITY
        // 各数量の設定
        // When Palletize Instr. No. is not inputted
        // 梱包指示Noが入力されてない場合
        if (CheckUtil.isBlankOrNull(pltzInstrNo)){
            ttCmlErrorDtl.setOdrQty(internalVariableDtl.getOdrQty());
            
            BigDecimal overInstrQty = internalVariableDtl.getQty().subtract(internalVariableDtl.getOdrQty());
            if (overInstrQty.compareTo(BigDecimal.ZERO) < 0){
                ttCmlErrorDtl.setOverInstrQty(null);
            } else {
                ttCmlErrorDtl.setOverInstrQty(overInstrQty);
            }
        } else {
            ttCmlErrorDtl.setOdrQty(null);

            BigDecimal leftInstrQty = internalVariableDtl.getInstrQty().subtract(internalVariableDtl.getPltzQty());
            ttCmlErrorDtl.setLeftInstrQty(leftInstrQty);

            BigDecimal overInstrQty = internalVariableDtl.getQty().subtract(leftInstrQty);
            if (internalVariableDtl.getQty().compareTo(overInstrQty) < 0){
                ttCmlErrorDtl.setOverInstrQty(null);
            } else {
                ttCmlErrorDtl.setOverInstrQty(overInstrQty);
            }
        }

        // ITEM NO CHECK FLAG
        // 品目番号チェックフラグ
        ttCmlErrorDtl.setItemNoChkFlg(itemNoChkFlg.toString());
        
        // Common items
        // 共通項目
        setCommonPropertyForRegist(ttCmlErrorDtl, dscId, screenId);

        // It adds to CML-Error-Report-Detail list.
        // CMLエラーレポート明細リストへ追加
        ttCmlErrorDtlList.add(ttCmlErrorDtl);
    }

    /**
     * Register a CML Error Report Header.
     * <br />CMLエラーレポートヘッダを登録します。
     *
     * @param internalVariableHdr Internal variable (header) domain<br />内部変数（ヘッダ）ドメイン
     * @param ttCmlErrorHeader CML-Error-Report-Header domain<br />CMLエラーレポートヘッダドメイン
     * @param nexusWhFlg NEXUS W/H Flg<br />NEXUS倉庫フラグ
     * @param screenId SCREEN ID<br />画面ID
     * @throws ApplicationException When a CML Error Report Header cannot be accessed<br />CMLエラーレポートヘッダにアクセスできない場合
     */
    protected void createWs2508CmlHdr(Ws2501InternalVariableHdrDomain internalVariableHdr, TtCmlErrorHeaderDomain ttCmlErrorHeader, String nexusWhFlg, String screenId)
        throws ApplicationException{
        CommonUtil.copyPropertiesDomainToDomain(ttCmlErrorHeader, internalVariableHdr);

        // PALLET NO
        // パレットNo
        ttCmlErrorHeader.setPalletNo(internalVariableHdr.getBoxNo());

        // NEXUS W/H flag is 'Y'
        // NEXUS倉庫フラグが'Y' の場合
        if (FLAG_Y.equals(nexusWhFlg)) {
            ttCmlErrorHeader.setPlntCd(null);
            ttCmlErrorHeader.setLgcyWhCd(null);
        }
        // Palletize Instruction NO is not null or NEXUS W/H flag is 'N'
        // 梱包支持Noが入力されている場合  または  NEXUS倉庫フラグが'N'
        if (!CheckUtil.isBlankOrNull(internalVariableHdr.getPltzInstrNo())
            || FLAG_N.equals(nexusWhFlg)) {
            ttCmlErrorHeader.setWhCompCd(null);
            ttCmlErrorHeader.setWhCd(null);
        }

        // Setting of an EXPORT PACKING ISSUER NAME
        // 輸出梱包者名の設定
        TmUserCriteriaDomain tmUserCriteria = new TmUserCriteriaDomain();
        String dscId = ttCmlErrorHeader.getDscId();
        tmUserCriteria.setDscId(dscId);
        TmUserDomain tmUser = tmUserService.searchByKey(tmUserCriteria);
        ttCmlErrorHeader.setExpPackingIssuerNm(tmUser.getUsrNmEn());

        // Common items
        // 共通項目
        setCommonPropertyForRegist(ttCmlErrorHeader, dscId, screenId);

        // CML-Error-Report-Header registration
        // CMLエラーレポートヘッダ登録
        ttCmlErrorHeaderService.create(ttCmlErrorHeader);
    }

    /**
     * Acquire Mix Tag No.
     * <br />Mix Tag Noを取得します。
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param whCd W/H CD<br />倉庫コード
     * @param screenId SCREEN ID<br />画面ID
     * @return Mix Tag No
     * @throws ApplicationException When an error occurs in CommonService<br />CommonServiceでエラーが発生した場合
     */
    protected String createMixTagNo(String shipperCd, String whCd, String screenId) throws ApplicationException {
        // The time zone converted date of Shipper is acquired.
        // Shipperのタイムゾーン変換日付を取得
        Date sysdate
            = DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd));

        SimpleDateFormat format = new SimpleDateFormat("yyMMdd");

        // Create of an assignment-of-order-numbers key
        // 採番キーの作成
        String mixTagNoSeqKey
            = String.format("%s%s%s%s", "M", shipperCd, whCd, format.format(sysdate).substring(1, 6));

        // Consecutive acquisition
        // 連番の取得
        String mixTagNoSeq
            = transactSequence(mixTagNoSeqKey, SEQ_TYP_MIX_TAG_NO, 1, screenId).get(0);

        String mixTagNo = mixTagNoSeqKey + mixTagNoSeq;

        // A return of Mix Tag No
        // Mix Tag Noの返却
        return mixTagNo;
    }

    /**
     * Perform firm-order-receipt alloc processing.(It carries out, only when Palletize Instr. No. . is not set up)
     * <br />確定受注引当処理を行います。(梱包指示No.が設定されていない場合のみ実施)
     *
     * @param mixTagNo MIX_TAG_NO
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @return The registered Mix Tag Receive Order<br />登録されたMIXED品目番号受注情報
     * @throws ApplicationException When an Export Receive Order cannot be accessed<br />輸出受注にアクセスできない場合
     */
    protected List<TtMixtagOdrDomain> allocWs2508Qty(String mixTagNo, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        if (!StringUtils.isEmpty(criteria.getPltzInstrNo())) {
            return emptyList();
        }

        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2508InternalVariableHdrDomain();
        String shipperCd = internalVariableHdr.getShipperCd();
        String customerCd = internalVariableHdr.getCustomerCd();
        String lgcyShipTo = internalVariableHdr.getLgcyShipTo();
        String trnsCd = internalVariableHdr.getTrnsCd();
        String dscId = criteria.getLoginUserDscId();

        // Mix-Tag-Receive-Order list create
        // MIXED品目番号受注情報リスト作成
        List<TtMixtagOdrDomain> mixTagOdrList = new ArrayList<TtMixtagOdrDomain>();

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2508InternalVariableDtlDomainList()){

            // The amount of remaining numbers of the number of PKGs
            // 梱包数の残数量
            BigDecimal qty = internalVariableDtl.getQty();

            // Acquisition of an Export Receive Order
            // 輸出受注の取得
            TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
            ttExpRcvOdrCriteria.setRcvOdrCompCd(shipperCd);
            ttExpRcvOdrCriteria.setCustomerCd(customerCd);
            ttExpRcvOdrCriteria.setLgcyShipTo(lgcyShipTo);
            ttExpRcvOdrCriteria.setTrnsCd(trnsCd);
            ttExpRcvOdrCriteria.setItemNo(internalVariableDtl.getItemNo());
            ttExpRcvOdrCriteria.setPkgCd(internalVariableDtl.getPkgCd());
            ttExpRcvOdrCriteria.setOdrFirmFlg(FLAG_Y);
            ttExpRcvOdrCriteria.setShippedTyp(SHIPPED_TYP_INCOMPLATE_PACKING);

            List<TtExpRcvOdrDomain> ttExpRcvOdrList =  ttExpRcvOdrService.searchByCondition(ttExpRcvOdrCriteria);

            for (TtExpRcvOdrDomain ttExpRcvOdr : ttExpRcvOdrList){

                // Since it cannot draw any more if the amount of remaining numbers of PACKAGE LOT SIZE is 0, it ends. ..
                // 収容数の残数量が 0 ならこれ以上引き当てられないので終了...
                if (qty.compareTo(BigDecimal.ZERO) == 0) {
                    break;
                }

                // Alloc of a firm order receipt
                // 確定受注の引当
                BigDecimal odrQty = ttExpRcvOdr.getOdrQty();
                BigDecimal pltzAllocQty = ttExpRcvOdr.getPltzAllocQty();
                BigDecimal unShippedQty = odrQty.subtract(pltzAllocQty);

                // This ALLOC-QUANTITY calculation
                // 今回の引当数量算出
                BigDecimal allocQtyThisTime;
                if(qty.compareTo(unShippedQty) > 0){
                    allocQtyThisTime = unShippedQty;
                } else {
                    allocQtyThisTime = qty;
                }

                BigDecimal newPltzAllocQty = pltzAllocQty.add(allocQtyThisTime);

                // Export Receive Order Update
                // 輸出受注更新
                TtExpRcvOdrDomain ttExpRcvOdrUpdate = new TtExpRcvOdrDomain();
                ttExpRcvOdrUpdate.setPltzAllocQty(newPltzAllocQty);
                if (odrQty.compareTo(newPltzAllocQty) == 0) {
                    ttExpRcvOdrUpdate.setShippedTyp(SHIPPED_TYP_COMPLATE_PACKING);
                }
                setCommonPropertyForUpdate(ttExpRcvOdrUpdate, dscId, criteria.getScreenId());

                // Export Receive Order Update
                // 輸出受注更新
                TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteriaUpdate = new TtExpRcvOdrCriteriaDomain();
                ttExpRcvOdrCriteriaUpdate.setRcvOdrCompCd(shipperCd);
                ttExpRcvOdrCriteriaUpdate.setCustomerCd(customerCd);
                ttExpRcvOdrCriteriaUpdate.setLgcyShipTo(lgcyShipTo);
                ttExpRcvOdrCriteriaUpdate.setItemNo(internalVariableDtl.getItemNo());
                ttExpRcvOdrCriteriaUpdate.setPkgCd(internalVariableDtl.getPkgCd());
                ttExpRcvOdrCriteriaUpdate.setTrnsCd(trnsCd);
                ttExpRcvOdrCriteriaUpdate.setEtdDueDt(ttExpRcvOdr.getEtdDueDt());
                ttExpRcvOdrCriteriaUpdate.setCustomerPoNo(ttExpRcvOdr.getCustomerPoNo());
                ttExpRcvOdrCriteriaUpdate.setCustomerItemNo(ttExpRcvOdr.getCustomerItemNo());
                ttExpRcvOdrCriteriaUpdate.setCustomerItemNoOrg(ttExpRcvOdr.getCustomerItemNoOrg());
                ttExpRcvOdrCriteriaUpdate.setOdrCtrlNo(ttExpRcvOdr.getOdrCtrlNo());
                ttExpRcvOdrService.updateByCondition(ttExpRcvOdrUpdate, ttExpRcvOdrCriteriaUpdate);

                // An export information is set to Mix-Tag-Receive-Order domain.
                // MIXED品目番号受注情報ドメインに輸出情報をセット
                TtMixtagOdrDomain ttMixtagOdr = new TtMixtagOdrDomain();
                CommonUtil.copyPropertiesDomainToDomain(ttMixtagOdr, ttExpRcvOdr);

                // Setting of an ALLOC QUANTITY
                // 引当数量の設定
                // 2015/11/25 update
                ttMixtagOdr.setAllocQty(newPltzAllocQty);

                // It sets to Mix-Tag-Receive-Order list.
                // MIXED品目番号受注情報リストにセット
                mixTagOdrList.add(ttMixtagOdr);

                qty = qty.subtract(allocQtyThisTime);
            }

            if (qty.compareTo(BigDecimal.ZERO) != 0) {
                Object[] params = {internalVariableDtl.getItemNo()};
                throw new ApplicationException(NXS_E7_0089, params);
            }
        }

        // Registration processing of Mix Tag Receive Order
        // MIXED品目番号受注情報の登録処理
        for (TtMixtagOdrDomain mixTagOdr : mixTagOdrList) {

            // Setting of a registration condition
            // 登録条件の設定
            mixTagOdr.setMixTagNo(mixTagNo);

            // Setting of a common column
            // 共通カラムの設定
            setCommonPropertyForRegist(mixTagOdr, dscId, criteria.getScreenId());

            // Registration of Mix Tag Receive Order
            // MIXED品目番号受注情報の登録
            ttMixtagOdrService.create(mixTagOdr);
        }

        return mixTagOdrList;
    }

    /**
     * Register Mix-Tag-KANBAN data.
     * <br />MIX品かんばん情報データを登録します。
     *
     * @param mixTagNo mixTagNo
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Mix Tag KANBAN cannot be accessed<br />MIX品かんばん情報にアクセスできない場合
     */
    protected void createWs2508Kanban(String mixTagNo, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();

        // Registration of Mix Tag KANBAN
        // MIX品かんばん情報の登録
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2508InternalVariableDtlDomainList()){
            BigDecimal cnt = BigDecimal.ONE;
            for (Ws2501InternalVariableDtlKanbanDomain internalVariableDtlKanban : internalVariableDtl.getInternalVariableDtlKanbanDomainList()){
                TtMixKanbanDomain ttMixKanban = new TtMixKanbanDomain();
                ttMixKanban.setMixTagNo(mixTagNo);
                ttMixKanban.setItemNo(internalVariableDtl.getItemNo());
                ttMixKanban.setPkgCd(internalVariableDtl.getPkgCd());
                ttMixKanban.setKanbanSeqNo(cnt);
                ttMixKanban.setExpIndusTypCd(internalVariableDtlKanban.getExpIndusTypCd());
                ttMixKanban.setExpKanbanTyp(internalVariableDtlKanban.getExpKanbanTyp());
                ttMixKanban.setExpRegulateNo(internalVariableDtlKanban.getTagSeqNo());
                ttMixKanban.setQty(internalVariableDtlKanban.getQty());
                setCommonPropertyForRegist(ttMixKanban, dscId, criteria.getScreenId());

                ttMixKanbanService.create(ttMixKanban);

                cnt = cnt.add(BigDecimal.ONE);
            }
        }
    }

    /**
     * Register a MIXED ITEM NO.
     * <br />MIXED品目番号を登録します。
     *
     * @param mixTagNo mixTagNo
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a MIXED ITEM NO cannot be accessed<br />MIXED品目番号にアクセスできない場合
     */
    protected void createWs2508MixTagItemNo(String mixTagNo, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();

        // Registration of MIXED ITEM NO
        // MIXED品目番号の登録
        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2508InternalVariableDtlDomainList()){
            TtMixtagItemNoDomain ttMixTtagItemNo = new TtMixtagItemNoDomain();
            ttMixTtagItemNo.setMixTagNo(mixTagNo);
            ttMixTtagItemNo.setItemNo(internalVariableDtl.getItemNo());
            ttMixTtagItemNo.setPkgCd(internalVariableDtl.getPkgCd());
            ttMixTtagItemNo.setShippingLot(internalVariableDtl.getLotSize());
            ttMixTtagItemNo.setItemDescription(internalVariableDtl.getItemDescription());
            ttMixTtagItemNo.setTagQty(internalVariableDtl.getTagQty());
            ttMixTtagItemNo.setInstrQty(internalVariableDtl.getInstrQty());
            ttMixTtagItemNo.setQty(internalVariableDtl.getQty());
            ttMixTtagItemNo.setItemWeight(internalVariableDtl.getItemWeight());
            ttMixTtagItemNo.setWeightUnit(internalVariableDtl.getWeightUnit());
            ttMixTtagItemNo.setQtyUnit(internalVariableDtl.getQtyUnit());
            ttMixTtagItemNo.setItemTyp(null);
            ttMixTtagItemNo.setExpLimitTyp(internalVariableDtl.getExpLimitTyp());
            ttMixTtagItemNo.setDngrItemFlg(internalVariableDtl.getDngrItemFlg());
            ttMixTtagItemNo.setOriginCntryCd(internalVariableDtl.getOriginCntryCd());
            ttMixTtagItemNo.setPlntCd(internalVariableDtl.getPlntCd());
            ttMixTtagItemNo.setCustomerItemNo(internalVariableDtl.getCustomerItemNo());

            setCommonPropertyForRegist(ttMixTtagItemNo, dscId, criteria.getScreenId());

            ttMixtagItemNoService.create(ttMixTtagItemNo);
        }
    }

    /**
     * Register a Mix Tag RT.
     * <br />MIXED用RT材を登録します。
     *
     * @param mixTagNo mixTagNo
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Mix Tag RT cannot be accessed<br />MIXED用RT材にアクセスできない場合
     */
    protected void createWs2508MixTagRt(String mixTagNo, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();

        boolean boxFlg = true;

        // Registration of Mix Tag RT
        // MIXED用RT材の登録
        for (Ws2501PkgItemNoDomain pkgItemNoDomain : criteria.getWs2508PkgItemNoList()){

            String pkgItemNo = pkgItemNoDomain.getPkgItemNo();
            BigDecimal pkgQty = pkgItemNoDomain.getPkgQty();

            Ws2501PkgMaterialsCriteriaDomain pkgMaterialsCriteria = new Ws2501PkgMaterialsCriteriaDomain();
            // Acquisition of a PKG Materials MA
            // 包装材原単位の取得
            pkgMaterialsCriteria.setOwnerComp(criteria.getShipperCd());
            pkgMaterialsCriteria.setPkgItemNo(pkgItemNo);

            Ws2501PkgMaterialsDomain pkgMaterialsDomain = wsBhtEisProductDao.searchPkgMaterials(pkgMaterialsCriteria);

            TtMixtagRtDomain ttMixtagRt = new TtMixtagRtDomain();
            ttMixtagRt.setMixTagNo(mixTagNo);
            ttMixtagRt.setPkgItemNo(pkgItemNo);
            ttMixtagRt.setQty(pkgQty);
            // leading record is set as 'Y', and except [ its ] is set as 'N'.
            // 先頭レコードを'Y'、それ以外を'N'に設定する
            if(boxFlg){
                ttMixtagRt.setBoxFlg(FLAG_Y);
            }else{
                ttMixtagRt.setBoxFlg(FLAG_N);
            }
            boxFlg = false;
            ttMixtagRt.setModelCd(pkgMaterialsDomain.getModelCd());
            
            if (RT_TYP_1WAY.compareTo(pkgMaterialsDomain.getRtTyp()) == 0){
                ttMixtagRt.setRtFlg(FLAG_N);
            } else {
                ttMixtagRt.setRtFlg(FLAG_Y);
            }
            
            ttMixtagRt.setWeightUnit(pkgMaterialsDomain.getWeightUnit());
            ttMixtagRt.setPkgWeight(pkgMaterialsDomain.getPkgWeight());
            ttMixtagRt.setPkgNm(pkgMaterialsDomain.getPkgNm());
            ttMixtagRt.setOriginCntryCd(pkgMaterialsDomain.getOriginCntry());
            ttMixtagRt.setCurrCd(pkgMaterialsDomain.getCurrCd());
            setCommonPropertyForRegist(ttMixtagRt, dscId, criteria.getScreenId());

            ttMixtagRtService.create(ttMixtagRt);

        }
    }

    /**
     * Register a Mix Tag.
     * <br />MIXED現品票を登録します。
     *
     * @param mixTagNo mixTagNo
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Mix Tag cannot be accessed<br />MIXED現品票にアクセスできない場合
     */
    protected void createWs2508TtMixTag(String mixTagNo, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException{
        String dscId = criteria.getLoginUserDscId();

        // Acquisition of the WEIGHT UNIT of Shipper
        // Shipperの重量単位の取得
        String shipperWeightUnit = commonService.searchWeightUnit(criteria.getShipperCd());

        // Acquisition of N/W
        // N/W の取得
        Ws2501MixedTagItemNoNwCriteriaDomain mixedTagItemNoNwCriteriaDomain = new Ws2501MixedTagItemNoNwCriteriaDomain();
        mixedTagItemNoNwCriteriaDomain.setMixTagNo(mixTagNo);
        List<? extends Ws2501MixedTagItemNoNwDomain> mixTagItemNoNwList = wsBhtEisProductDao.searchMixedTagItemNoNw(mixedTagItemNoNwCriteriaDomain);

        String[] nwMsgParams = {getResource("label.netWeight")};
        BigDecimal nw = BigDecimal.ZERO;
        for (Ws2501MixedTagItemNoNwDomain mixTagItemNoNw : mixTagItemNoNwList){
            BigDecimal netWeight = new BigDecimal(mixTagItemNoNw.getSumItemWeight());
            nw = nw.add(convertWeightUnit(netWeight, mixTagItemNoNw.getWeightUnit(), shipperWeightUnit, nwMsgParams));
        }
        checkWeightOverflow(nw, nwMsgParams);

        // Acquisition of G/W
        // G/W の取得
        Ws2501MixedTagRtGwCriteriaDomain mixedTagRtGwCriteriaDomain = new Ws2501MixedTagRtGwCriteriaDomain();
        mixedTagRtGwCriteriaDomain.setMixTagNo(mixTagNo);
        List<? extends Ws2501MixedTagRtGwDomain> mixTagRtGwList = wsBhtEisProductDao.searchMixedTagRtGw(mixedTagRtGwCriteriaDomain);

        String[] gwMsgParams = {getResource("label.grossWeight")};
        BigDecimal gw = BigDecimal.ZERO;
        for (Ws2501MixedTagRtGwDomain mixTagRtGw : mixTagRtGwList){
            BigDecimal netWeight = new BigDecimal(mixTagRtGw.getSumPkgWeight());
            gw = gw.add(convertWeightUnit(netWeight, mixTagRtGw.getWeightUnit(), shipperWeightUnit, gwMsgParams));
        }
        checkWeightOverflow(gw, gwMsgParams);

        BigDecimal grossWeight = nw.add(gw);

        // Registration of Mix Tag
        // MIXED現品票の登録
        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2508InternalVariableHdrDomain();
        String shipperCd = internalVariableHdr.getShipperCd();
        String customerCd = internalVariableHdr.getCustomerCd();
        String lgcyShipTo = internalVariableHdr.getLgcyShipTo();
        String trnsCd = internalVariableHdr.getTrnsCd();
        String plntCd = internalVariableHdr.getPlntCd();
        String lgcyWhCd = internalVariableHdr.getLgcyWhCd();
        String compCd = internalVariableHdr.getWhCompCd();
        String whCd = internalVariableHdr.getWhCd();
        String pltzInstrNo = internalVariableHdr.getPltzInstrNo();
        String boxNo = internalVariableHdr.getBoxNo();

        Ws2501InternalVariableDtlDomain internalVariableDtl = criteria.getWs2508InternalVariableDtlDomainList().get(0);

        String containerSortingKey = internalVariableDtl.getContainerSortingKey();
        String invoiceKey = internalVariableDtl.getInvoiceKey();
        String customTimingTyp = internalVariableDtl.getCustomTimingTyp();
        String containerLooseTyp = internalVariableDtl.getContainerLooseTyp();
        String currCd = internalVariableDtl.getCurrCd();

        List<? extends Ws2501InternalVariableDtlDomain> internalVariableDtlList = criteria.getWs2508InternalVariableDtlDomainList();

        // A setting of loading position code
        // 荷積み位置コードの設定
        String loadingCd = new String();
        boolean doorFlg = false;
        boolean backFlg = false;
        for (Ws2501InternalVariableDtlDomain internalVariableDtlDomain : internalVariableDtlList){
            if(LOADING_CD_DOOR.compareTo(internalVariableDtlDomain.getLoadingCd()) == 0){
                doorFlg = true;
            }
            if(LOADING_CD_BACK.compareTo(internalVariableDtlDomain.getLoadingCd()) == 0){
                backFlg = true;
            }
        }
        if(doorFlg){
            loadingCd = LOADING_CD_DOOR;
        }else if(backFlg){
            loadingCd = LOADING_CD_BACK;
        }else if(!doorFlg && !backFlg){
            loadingCd = LOADING_CD_FREE;
        }

        TtMixtagDomain ttMixtag = new TtMixtagDomain();

        ttMixtag.setMixTagNo(mixTagNo);
        ttMixtag.setCustomerCd(customerCd);
        ttMixtag.setLgcyShipTo(lgcyShipTo);
        ttMixtag.setTrnsCd(trnsCd);
        ttMixtag.setPlntCd(convertBlankOrNullToSpace(plntCd));
        ttMixtag.setLgcyWhCd(lgcyWhCd);
        ttMixtag.setWhCompCd(compCd);
        ttMixtag.setWhCd(whCd);
        ttMixtag.setMixTagStatus(MIX_TAG_STATUS_MIXTAG);
        ttMixtag.setMixTagIssuerId(dscId);
        // Acquisition of a login person name
        // ログイン者名の取得
        TmUserCriteriaDomain tmUserCriteria = new TmUserCriteriaDomain();
        tmUserCriteria.setDscId(dscId);
        TmUserDomain tmUser = tmUserService.searchByKey(tmUserCriteria);
        ttMixtag.setMixTagIssuer(tmUser.getUsrNmEn());
        // Time zone converted post-date acquisition
        // タイムゾーン変換後日付取得
        String timezoneId = commonService.searchTimezone(shipperCd);
        Date expPackingDt = DateUtil.convertTime(new Date(), timezoneId);
        ttMixtag.setMixTagIssueDt(expPackingDt);
        ttMixtag.setPltzInstrNo(pltzInstrNo);
        ttMixtag.setNetWeight(nw);
        ttMixtag.setGrossWeight(grossWeight);
        ttMixtag.setWeightUnit(shipperWeightUnit);
        ttMixtag.setContainerSortingKey(containerSortingKey);
        ttMixtag.setLoadingCd(loadingCd);
        ttMixtag.setInvoiceKey(invoiceKey);
        ttMixtag.setCustomTimingTyp(customTimingTyp);
        ttMixtag.setShipperCd(shipperCd);
        ttMixtag.setContainerLooseTyp(containerLooseTyp);
        ttMixtag.setBoxNo(boxNo);
        ttMixtag.setCurrCd(currCd);

        setCommonPropertyForRegist(ttMixtag, dscId, criteria.getScreenId());
        ttMixtagService.create(ttMixtag);
    }

    /**
     * Update and register a Temp Stock.
     * <br />仮在庫を更新・登録します。
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a Temp Stock cannot be accessed<br />仮在庫にアクセスできない場合
     */
    protected void transactTmpStock(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        Ws2501InternalVariableHdrDomain internalVariableHdr = criteria.getWs2508InternalVariableHdrDomain();
        String shipperCd = internalVariableHdr.getShipperCd();
        String lgcyWhCd = internalVariableHdr.getLgcyWhCd();

        if (!CheckUtil.isBlankOrNull(internalVariableHdr.getPltzInstrNo())) {
            return;
        }

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : criteria.getWs2508InternalVariableDtlDomainList()){

            String itemNo = internalVariableDtl.getItemNo();
            String pkgCd = internalVariableDtl.getPkgCd();

            TtTmpStockCriteriaDomain ttTmpStockCriteriaUpdate = new TtTmpStockCriteriaDomain();
            ttTmpStockCriteriaUpdate.setShipperCd(shipperCd);
            ttTmpStockCriteriaUpdate.setLgcyWhCd(lgcyWhCd);
            ttTmpStockCriteriaUpdate.setItemNo(itemNo);
            ttTmpStockCriteriaUpdate.setPkgCd(pkgCd);

            TtTmpStockDomain ttTmpStock = ttTmpStockService.lockByKeyNoWait(ttTmpStockCriteriaUpdate);

            if (ttTmpStock != null) {
                TtTmpStockDomain ttTmpStockUpdate = new TtTmpStockDomain();
                ttTmpStockUpdate.setQty(ttTmpStock.getQty().add(internalVariableDtl.getQty()));
                setCommonPropertyForUpdate(ttTmpStockUpdate, criteria.getLoginUserDscId(), criteria.getScreenId());
                ttTmpStockService.updateByCondition(ttTmpStockUpdate, ttTmpStockCriteriaUpdate);
            } else {
                TtTmpStockDomain ttTmpStockCreate = new TtTmpStockDomain();
                CommonUtil.copyPropertiesDomainToDomain(ttTmpStockCreate, ttTmpStockCriteriaUpdate);
                ttTmpStockCreate.setQty(internalVariableDtl.getQty());
                setCommonPropertyForRegist(ttTmpStockCreate, criteria.getLoginUserDscId(), criteria.getScreenId());
                ttTmpStockService.create(ttTmpStockCreate);
            }
        }
    }

    /**
     * Register an ordering alloc track record (starting of Web service).
     * <br />受注引当実績を登録（Webサービスの起動）します。
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param mixtagOdrList Mix Tag Receive Order<br />MIXED品目番号受注情報
     * @return Web service processing result<br />Webサービス処理結果
     * @throws ApplicationException When an error unexpected by Web service occurs<br />Webサービスで予期せぬエラーが発生した場合
     */
    protected boolean createRcvOdrAllocMixTag(String shipperCd, List<TtMixtagOdrDomain> mixtagOdrList) throws ApplicationException {

        List<Ws2005ParamItemDomain> ws2005ParamItemList = new ArrayList<Ws2005ParamItemDomain>(mixtagOdrList.size());

        for (TtMixtagOdrDomain mixtagOdr : mixtagOdrList){
            Ws2005ParamItemDomain ws2005ParamItem = new Ws2005ParamItemDomain();
            ws2005ParamItem.setCustomerNo(mixtagOdr.getCustomerCd());
            ws2005ParamItem.setShipTo(mixtagOdr.getLgcyShipTo());
            ws2005ParamItem.setPN(mixtagOdr.getItemNo());
            ws2005ParamItem.setTransWayCd(mixtagOdr.getTrnsCd());
            ws2005ParamItem.setEtdDueDt(formatDate(mixtagOdr.getEtdDueDt(), WS_CIGMA_DATE_FORMAT));
            ws2005ParamItem.setCustomerPoNo(mixtagOdr.getCustomerPoNo());
            ws2005ParamItem.setCustomerPn(mixtagOdr.getCustomerItemNo());
            ws2005ParamItem.setOdrCtrlNo(String.valueOf(mixtagOdr.getOdrCtrlNo()));
            ws2005ParamItem.setCustomerPnOrg(mixtagOdr.getCustomerItemNoOrg());
            ws2005ParamItem.setShipInstrAllocQty(String.valueOf(mixtagOdr.getAllocQty()));
            ws2005ParamItemList.add(ws2005ParamItem);
        }

        return createRcvOdrAlloc(shipperCd, ws2005ParamItemList);
    }

    /**
     * Register a BHT productivity data information.
     * <br />BHT生産性データ情報を登録します。
     *
     * @param mixTagNo MixTag
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @throws ApplicationException When a BHT Work Time, a BHT Work Time For Palletize, and a BHT Work Error cannot be accessed
     *                              <br />BHT作業時間、BHT作業情報テーブル(パレタイズ)、BHT作業エラーにアクセスできない場合
     */
    protected void createWs2508BhtInfo(String mixTagNo, WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {
        String dscId = criteria.getLoginUserDscId();

        // Acquisition of user's information
        // ユーザー情報の取得
        TmUserConfCriteriaDomain tmUserConfCriteria  = new TmUserConfCriteriaDomain();
        tmUserConfCriteria.setDscId(dscId);
        TmUserConfDomain tmUserConf = tmUserConfService.searchByKey(tmUserConfCriteria);

        Ws2501InternalVariableHdrDomain internalVariableHdrDomain = criteria.getWs2508InternalVariableHdrDomain();

        //  -------------------------------------------------------------------

        // Registration of BHT-Work-Time table
        // BHT作業時間テーブルの登録
        BigDecimal workTimeNo = wsBhtEisProductDao.searchNextWorkTimeNo();
        Date workTimeStrt = parseDate(criteria.getWorkTimeStrt());
        Date workTimeEnd  = parseDate(criteria.getWorkTimeEnd());
        BigDecimal errCnt = new BigDecimal(criteria.getWs2508ProductivityDataInfoList().size());

        TtBhtWorkTimeDomain ttBhtWorkTime = new TtBhtWorkTimeDomain();
        ttBhtWorkTime.setWorkTimeNo(workTimeNo);
        ttBhtWorkTime.setCompCd(tmUserConf.getCompCd());
        ttBhtWorkTime.setDscId(dscId);
        ttBhtWorkTime.setShipperCd(internalVariableHdrDomain.getShipperCd());
        ttBhtWorkTime.setWhCompCd(internalVariableHdrDomain.getWhCompCd());
        ttBhtWorkTime.setWhCd(internalVariableHdrDomain.getWhCd());
        ttBhtWorkTime.setWorkTyp(WORK_TYP_MIX_TAG_CIGMA);
        ttBhtWorkTime.setWorkTimeStrt(workTimeStrt);
        ttBhtWorkTime.setWorkTimeEnd(workTimeEnd);
        ttBhtWorkTime.setWorkTime(duration(workTimeStrt, workTimeEnd));
        ttBhtWorkTime.setResultKey(mixTagNo);
        ttBhtWorkTime.setErrCnt(errCnt);

        setCommonPropertyForRegist(ttBhtWorkTime, dscId, criteria.getScreenId());

        ttBhtWorkTimeService.create(ttBhtWorkTime);

        //  -------------------------------------------------------------------

        // Registration of BHT Work Time For Mix Tag
        // BHT作業情報テーブル(小箱内多品)の登録
        TtBhtWorkMixTagDomain ttBhtWorkMixTag = new TtBhtWorkMixTagDomain();
        ttBhtWorkMixTag.setWorkTimeNo(workTimeNo);
        ttBhtWorkMixTag.setMixTagQty(new BigDecimal(criteria.getWs2508ItemNoList().size()));
        setCommonPropertyForRegist(ttBhtWorkMixTag, dscId, criteria.getScreenId());

        ttBhtWorkMixTagService.create(ttBhtWorkMixTag);

        //  -------------------------------------------------------------------

        // Registration of BHT-Work-Error table
        // BHT作業エラーテーブルの登録
        BigDecimal brch = BigDecimal.ONE;

        for (Ws2501ProductivityDataInfoDomain productivityDataInfo : criteria.getWs2508ProductivityDataInfoList()) {

            workTimeStrt = parseDate(productivityDataInfo.getWorkTimeStrt());
            workTimeEnd  = parseDate(productivityDataInfo.getWorkTimeEnd());

            TtBhtWorkErrDomain ttBhtWorkErr = new TtBhtWorkErrDomain();
            ttBhtWorkErr.setWorkTimeNo(workTimeNo);
            ttBhtWorkErr.setBrch(brch);
            ttBhtWorkErr.setScreenId(productivityDataInfo.getScreenId());
            ttBhtWorkErr.setMsgId(productivityDataInfo.getMsgId());
            ttBhtWorkErr.setLockFlg(productivityDataInfo.getLockFlg());
            ttBhtWorkErr.setWorkTimeStrt(workTimeStrt);
            ttBhtWorkErr.setWorkTimeEnd(workTimeEnd);
            ttBhtWorkErr.setWorkTime(duration(workTimeStrt, workTimeEnd));

            setCommonPropertyForRegist(ttBhtWorkErr, dscId, criteria.getScreenId());

            ttBhtWorkErrService.create(ttBhtWorkErr);
            brch = brch.add(BigDecimal.ONE);
        }
    }

    // --------------------------------- ECA0027_WS_2509_Print Mixed Label -----------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#searchOnPrintMixTag(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)
     */
    public void searchOnPrintMixTag(WsBhtEisProductCriteriaDomain criteriaDomain)
        throws ApplicationException {

        // Acquisition of Date format
        // 日付フォーマットの取得
        String formatDate =  commonService.getResource(criteriaDomain.getLocale(), REPORT_DATE_FORMAT);

        // Acquisition of 4. printer information
        // 4.プリンタ情報の取得
        TmPrinterCriteriaDomain tmPrinterCriteria = new TmPrinterCriteriaDomain();
        tmPrinterCriteria.setCompCd(criteriaDomain.getCompCd());
        tmPrinterCriteria.setPrinterId(criteriaDomain.getPrinterId());
        TmPrinterDomain tmPrinterInfo = this.tmPrinterService.searchByKey(tmPrinterCriteria);

        if (tmPrinterInfo == null) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            Object[] params = {criteriaDomain.getCompCd(), criteriaDomain.getPrinterId()};
            errorList.add(new MessageDomain("", NXS_E1_5018, params));
            throw new ValidationException(errorList);
        }

        // A create of 6.PDF
        // 6.PDFの作成
        File pdf = null;
        if (criteriaDomain.getPrintMixTagFlg().equals("Y")) {

            // A Mix tag is created when parameter .MIX tag has a setting.
            // パラメタ.MIXタグに設定がある場合、Mixタグを作成する。
            pdf = this.l2002ReportService.searchMixTag(
                    criteriaDomain.getMixTag(),
                    formatDate
            );

        } else if (criteriaDomain.getErrorReportFlg().equals("Y")) {

            // When parameter . error report output flag is 'Y', a Mix tag error report is created.
            // パラメタ.エラーレポート出力フラグが'Y'の場合、Mixタグエラーレポートを作成する。
            pdf = this.l2005ReportService.searchCmlMixTagErrRep(
                      criteriaDomain.getLoginUserDscId(),
                      criteriaDomain.getErrorReportTs(),
                      formatDate
            );

        } else {
            // It cannot be.
            // ありえない
            throw new ApplicationException(NXS_E1_5016);
        }

        // 7. printing (one copy is accepted and it always prints)
        // 7.印刷(常に1部のみ印刷する)
        this.commonService.printPdf(pdf, 1, tmPrinterInfo.getPrinterNm());

    }

    // --------------------------------- ECA0027_WS_2510_Create X CML ----------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmPkgSetDtlOnXtag(java.lang.String, java.lang.String, java.util.Map)
     */
    public boolean validateDatabaseTmPkgSetDtlOnXtag(String outerPkgComCd, String outerPkgCd, Map<String, BigDecimal> weightMap) throws ApplicationException {

        // Acquisition of PKG Set MA(Header), a PKG Set MA(Detail), and a PKG Materials MA
        // 包装組み合わせ原単位(ヘッダ)、包装組み合わせ原単位(明細)、包装材原単位の取得
        Ws2501OuterSumWeightCriteriaDomain outerSumWeightCriteria = new Ws2501OuterSumWeightCriteriaDomain();
        outerSumWeightCriteria.setOwnerComp(outerPkgComCd);
        outerSumWeightCriteria.setOuterCd(outerPkgCd);

        List<? extends Ws2501OuterSumWeightDomain> outerSumWeightList = wsBhtEisProductDao.searchOuterSumWeight(outerSumWeightCriteria);

        if (outerSumWeightList.isEmpty()){
            return false;
        }

        for (Ws2501OuterSumWeightDomain outerSumWeight : outerSumWeightList){
            weightMap.put(outerSumWeight.getWeightUnit(), outerSumWeight.getSumWeight());
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTmPkgSetHdrOnXtag(java.lang.String, java.lang.String, java.util.Map)
     */
    public boolean validateDatabaseTmPkgSetHdrOnXtag(String outerPkgComCd, String outerPkgCd, Map<String, BigDecimal> volumeMap) throws ApplicationException {

        // Acquisition of PKG Set MA (header)
        // 装組み合わせ原単位(ヘッダ)の取得
        TmPkgSetHdrCriteriaDomain tmPkgSetHdrCriteria = new TmPkgSetHdrCriteriaDomain();
        tmPkgSetHdrCriteria.setOwnerComp(outerPkgComCd);
        tmPkgSetHdrCriteria.setOuterPkgCd(outerPkgCd);

        TmPkgSetHdrDomain tmPkgSetHdr = tmPkgSetHdrService.searchByKey(tmPkgSetHdrCriteria);

        if (tmPkgSetHdr == null){
            return false;
        }

        volumeMap.put(tmPkgSetHdr.getVolumeUnit(), tmPkgSetHdr.getVolume());
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseTtPltzOnXtag(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)
     */
    public Map<String, String> validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain criteria,
        String[] curWhCompCd, String[] curWhCd) throws ApplicationException {

        Map<String, String> errMap = new HashMap<String, String>();

        for (String mainMark : criteria.getMainMarkList()) {

            Ws2501PltzNxsShipToCriteriaDomain pltzNxsShipToCriteria = new Ws2501PltzNxsShipToCriteriaDomain();
            pltzNxsShipToCriteria.setMainMark(mainMark);

            Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();

            try {
                // A Palletize information is locked based on parameter . MAIN MARK.
                // パラメタ.メインマークを元にパレタイズ情報をロック
                pltzNxsShipTo = wsBhtEisProductDao.lockByKeyNoWaitPltzNxsShipTo(pltzNxsShipToCriteria);
            } catch (Exception e) {
                // When lock is unacquirable
                // ロックが取得できない場合
                errMap.put(mainMark, NXS_E1_5004);
                continue;
            }

            // Existence check
            // 存在チェック
            if (pltzNxsShipTo == null){
                errMap.put(mainMark, NXS_E1_5001);
                continue;
            }

            // Item check of a Palletize information
            // パレタイズ情報の項目チェック
            if (criteria.getContainerSortingKey().compareTo(pltzNxsShipTo.getContainerSortingKey()) != 0           // CONTAINER-SORTING-KEY check    コンテナ層別キーチェック
                || criteria.getTrnsCd().compareTo(pltzNxsShipTo.getTrnsCd()) != 0                                  // Transport code check           輸送手段コードチェック
                || criteria.getShipToCompCd().compareTo(pltzNxsShipTo.getCompCd()) != 0                            // Ship-To-Comp code check        送荷先会社コードチェック
                || ((LOADING_CD_FREE.compareTo(criteria.getLoadingCd()) == 0                                       // Loading position code check    荷積位置コードチェック
                        && LOADING_CD_FREE.compareTo(pltzNxsShipTo.getLoadingCd()) != 0)
                    || (LOADING_CD_DOOR.compareTo(criteria.getLoadingCd()) == 0
                        && (LOADING_CD_DOOR.compareTo(pltzNxsShipTo.getLoadingCd()) != 0
                            && LOADING_CD_FREE.compareTo(pltzNxsShipTo.getLoadingCd()) != 0))
                    || (LOADING_CD_BACK.compareTo(criteria.getLoadingCd()) == 0
                        && (LOADING_CD_BACK.compareTo(pltzNxsShipTo.getLoadingCd()) != 0
                            && LOADING_CD_FREE.compareTo(pltzNxsShipTo.getLoadingCd()) != 0)))
                || criteria.getCustomTimingTyp().compareTo(pltzNxsShipTo.getCustomTimingTyp()) != 0                // CUSTOM-TIMING-TYPE check       通関タイミング区分チェック
                || CML_TYPE_CIGMA.compareTo(pltzNxsShipTo.getCmlTyp()) != 0                                        // CML-TYPE check                 ケースマーク区分チェック
                || (pltzNxsShipTo.getStgInstrItemFlg() != null && FLAG_N.compareTo(pltzNxsShipTo.getStgInstrItemFlg()) != 0) // staging-instruction flag check 荷揃え指示フラグチェック
                ) {

                errMap.put(mainMark, NXS_E1_5021);
            }

            // W/H-Company code check
            // 倉庫会社コードチェック
            if (criteria.getCurWhCompCd() != null && criteria.getCurWhCompCd().compareTo(pltzNxsShipTo.getCurWhCompCd()) != 0){
                errMap.put(mainMark, NXS_E1_5019);
            } else if (criteria.getCurWhCompCd() == null){
                // Initial setting of W/H Company CD
                // 倉庫会社コードの初期設定
                criteria.setCurWhCompCd(pltzNxsShipTo.getCurWhCompCd());
            }

            // W/H code check
            // 倉庫コードチェック
            if (criteria.getCurWhCd() != null && criteria.getCurWhCd().compareTo(pltzNxsShipTo.getCurWhCd()) != 0){
                errMap.put(mainMark, NXS_E1_5020);
            } else if (criteria.getCurWhCd() == null){
                // Initial setting of W/H CD
                // 倉庫コードの初期設定
                criteria.setCurWhCd(pltzNxsShipTo.getCurWhCd());
            }

            // Palletize Status check
            // パレタイズステータスチェック
            if (PLTZ_STATUS_PLTZ.compareTo(pltzNxsShipTo.getPltzStatus()) != 0) {
                errMap.put(mainMark, NXS_E1_5006);
            }

            // LAST-TR-STATUS check
            // 最終搬出入ステータスチェック
            if (CARRY_OUT_IN_BLANK.compareTo(pltzNxsShipTo.getLastTrStatus()) != 0
                && CARRY_OUT_IN_RECEIVED_AT_TO.compareTo(pltzNxsShipTo.getLastTrStatus()) != 0) {
                errMap.put(mainMark, NXS_E1_5025);
            }

            // X-Palletize check
            // まとめパレタイズチェック
            if (pltzNxsShipTo.getXmainMark() != null){
                errMap.put(mainMark, NXS_E1_5039);
            }

            // MIGRATION-FLAG check
            // 移行フラグチェック
            if (FLAG_N.compareTo(pltzNxsShipTo.getMigrationFlg()) != 0){
                errMap.put(mainMark, NXS_E1_5059);
            }

            // Setting to an internal variable
            // 内部変数への設定
            if (errMap.isEmpty()){
                // DENGER ITEM FLAG
                // 危険品フラグ
                if (FLAG_Y.compareTo(pltzNxsShipTo.getDngrItemFlg()) == 0){
                    criteria.setDngrItemFlg(FLAG_Y);
                }
                // L/D CD
                // 荷積位置コード
                if (criteria.getLoadingCd() == null || LOADING_CD_FREE.compareTo(criteria.getLoadingCd()) == 0){
                    criteria.setLoadingCd(pltzNxsShipTo.getLoadingCd());
                }
            }
        }
        // 取得データ一時保持
        curWhCompCd[0] = criteria.getCurWhCompCd();
        curWhCd[0] = criteria.getCurWhCd();
        
        return errMap;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#transactOnXtag(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)
     */
    public WsBhtEisProductDomain transactOnXtag(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException {

        // Acquisition of User Information
        //   usrNmEn / name (alphabet character) acquisition
        // ユーザ情報の取得
        //   usrNmEn/氏名(英字)取得
        TmUserCriteriaDomain tmUserCriteria = new TmUserCriteriaDomain();
        tmUserCriteria.setDscId(criteria.getLoginUserDscId());
        TmUserDomain tmUser = tmUserService.searchByKey(tmUserCriteria);

        //   ownerComp acquisition
        //   ownerComp取得
        TmUserConfCriteriaDomain tmUserConfCriteria = new TmUserConfCriteriaDomain();
        tmUserConfCriteria.setDscId(criteria.getLoginUserDscId());
        TmUserConfDomain tmUserConf = tmUserConfService.searchByKey(tmUserConfCriteria);

        //   weightUnit, volumeUnit acquisition
        //   weightUnit、volumeUnit取得
        TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteria.setCompCd(tmUserConf.getCompCd());
        TmNxsCompDomain tmNxsComp = tmNxsCompService.searchByKey(tmNxsCompCriteria);

        String weightUnitByDscId = tmNxsComp.getWeightUnit();
        String volumeUnitByDscId = tmNxsComp.getVolumeUnit();

        // Acquisition of the Shipper-CD number
        // 荷主コード件数の取得
        Ws2501CntShipperCdCriteriaDomain cntShipperCdCriteria = new Ws2501CntShipperCdCriteriaDomain();
        cntShipperCdCriteria.setMainMarkList(criteria.getMainMarkList());
        Ws2501CntShipperCdDomain cntShipperCd = wsBhtEisProductDao.searchCntShipperCd(cntShipperCdCriteria);

        // Calculation of a WEIGHT
        //   WEIGHT acquisition
        // 重量の算出
        //   重量取得
        Ws2501SumCmlWeightForUnitCriteriaDomain sumCmlWeightForUnitCriteria = new Ws2501SumCmlWeightForUnitCriteriaDomain();
        sumCmlWeightForUnitCriteria.setMainMarkList(criteria.getMainMarkList());
        List<? extends Ws2501SumCmlWeightForUnitDomain> sumCmlWeightForUnitList = wsBhtEisProductDao.searchSumCmlWeightForUnit(sumCmlWeightForUnitCriteria);

        //   WEIGHT calculation
        //     Gross Weight calculation
        //   重量算出
        //     Gross Weight算出
        String[] gwMsgParams = {getResource("label.grossWeight")};
        BigDecimal outerGrossWeight = BigDecimal.ZERO;
        for (String weightUnit : criteria.getGrossWeightMap().keySet()){
            outerGrossWeight =
                outerGrossWeight.add(convertWeightUnit(criteria.getGrossWeightMap().get(weightUnit), weightUnit, weightUnitByDscId, gwMsgParams));
        }
        BigDecimal pltzGrossWeight = BigDecimal.ZERO;
        //      Net Weight calculation
        //     Net Weight算出
        String[] nwMsgParams = {getResource("label.netWeight")};
        BigDecimal netWeight = BigDecimal.ZERO;
        for (Ws2501SumCmlWeightForUnitDomain sumCmlWeightForUnit : sumCmlWeightForUnitList){
            pltzGrossWeight =
                pltzGrossWeight.add(convertWeightUnit(sumCmlWeightForUnit.getSumGrossWeight(), sumCmlWeightForUnit.getWeightUnit(), weightUnitByDscId, gwMsgParams));
            netWeight =
                netWeight.add(convertWeightUnit(sumCmlWeightForUnit.getSumNetWeight(), sumCmlWeightForUnit.getWeightUnit(), weightUnitByDscId, nwMsgParams));
        }
        BigDecimal grossWeight = outerGrossWeight.add(pltzGrossWeight);
        checkWeightOverflow(grossWeight, gwMsgParams);
        checkWeightOverflow(netWeight, nwMsgParams);

        // Calculation of a VOLUME
        // 容積の算出
        String[] volMsgParams = {getResource("label.volume")};
        BigDecimal volume = convertVolumeUnit(criteria.getVolume(), criteria.getVolumeUnit(), volumeUnitByDscId, volMsgParams);

        // Registration of X-Palletize information
        //   Acquisition of X-TAG
        // まとめパレタイズ情報の登録
        //   まとめメインマークの取得
        Date date = DateUtil.convertTime(new Date(), commonService.searchTimezone(criteria.getCompCd()));
        String seqKey = String.format("%s%s%s%s", "X", criteria.getCurWhCompCd(), criteria.getCurWhCd(), new SimpleDateFormat("yyMMdd").format(date).substring(1, 6));
        date = DateUtils.truncate(date, Calendar.DAY_OF_MONTH);
        List<String> xmainMarkList = transactSequence(seqKey, SEQ_TYP_CML_NO_DN, 1, criteria.getScreenId());
        String xmainMark = seqKey + xmainMarkList.get(0);

        //   Registration of X-Palletize information
        //   まとめパレタイズ情報の登録
        TtXpltzDomain ttXpltz = new TtXpltzDomain();
        CommonUtil.copyPropertiesDomainToDomain(ttXpltz, criteria);
        ttXpltz.setXmainMark(xmainMark);
        ttXpltz.setNetWeight(netWeight);
        ttXpltz.setWeightUnit(weightUnitByDscId);
        ttXpltz.setVolumeUnit(volumeUnitByDscId);
        ttXpltz.setGrossWeight(grossWeight);
        ttXpltz.setVolume(volume);
        ttXpltz.setXtagPackingIssuerId(criteria.getLoginUserDscId());
        ttXpltz.setXtagPackingIssuerNm(tmUser.getUsrNmEn());
        ttXpltz.setXtagPackingDt(date);
        ttXpltz.setTotalShipper(cntShipperCd.getCntShipperCd());
        setCommonPropertyForRegist(ttXpltz, criteria.getLoginUserDscId(), criteria.getScreenId());
        ttXpltzService.create(ttXpltz);

        // Update of a Palletize information
        // パレタイズ情報の更新
        wsBhtEisProductDao.updateTtPltzByXmainMark(ttXpltz.getXmainMark(), criteria.getMainMarkList());

        WsBhtEisProductDomain result = new WsBhtEisProductDomain();
        result.setXmainMark(xmainMark);
        result.setPalletNo(criteria.getPalletNo());

        return result;
    }

    // --------------------------------- ECA0027_WS_2511_Print X CML -----------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#searchOnPrintXtag(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)
     */
    public void searchOnPrintXtag(WsBhtEisProductCriteriaDomain criteriaDomain) throws ApplicationException {
        // Acquisition of Date format
        // 日付フォーマットの取得
        String formatDate =  commonService.getResource(criteriaDomain.getLocale(), REPORT_DATE_FORMAT);

        // 4.Acquisition of User Information
        // 4.ユーザ情報の取得
        VmUserInfoCriteriaDomain vmUserInfoCriteria = new VmUserInfoCriteriaDomain();
        vmUserInfoCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        List<VmUserInfoDomain> vmUserInfoList = this.vmUserInfoService.searchByCondition(vmUserInfoCriteria);

        // 5.Acquisition of printer information
        // 5.プリンタ情報の取得
        TmPrinterCriteriaDomain tmPrinterCriteria = new TmPrinterCriteriaDomain();
        tmPrinterCriteria.setCompCd(criteriaDomain.getCompCd());
        tmPrinterCriteria.setPrinterId(criteriaDomain.getPrinterId());
        TmPrinterDomain tmPrinterInfo = this.tmPrinterService.searchByKey(tmPrinterCriteria);

        if (tmPrinterInfo == null) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            Object[] params = {criteriaDomain.getCompCd(), criteriaDomain.getPrinterId()};
            errorList.add(new MessageDomain("", NXS_E1_5018, params));
            throw new ValidationException(errorList);
        }

        // 6.A create of PDF
        // 6.PDFの作成
        File pdf = this.l2004ReportService.searchXtag(
            criteriaDomain.getXmainMark(),
            vmUserInfoList.get(0).getCompCd(),
            formatDate);

        // 7. printing (two copies are accepted and it always prints)
        // 7.印刷(常に2部のみ印刷する)
        this.commonService.printPdf(pdf, 2, tmPrinterInfo.getPrinterNm());

    }

    // --------------------------------- ECA0027_WS_2512_Print Case Mark Label(E-RT) -------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#searchOnPrintErt(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)
     */
    public void searchOnPrintErt(WsBhtEisProductCriteriaDomain criteriaDomain) throws ApplicationException {

        // Acquisition of Date format
        // 日付フォーマットの取得
        String formatDate =  commonService.getResource(criteriaDomain.getLocale(), REPORT_DATE_FORMAT);

        // 4.Acquisition of printer information
        // 4.プリンタ情報の取得
        TmPrinterCriteriaDomain tmPrinterCriteria = new TmPrinterCriteriaDomain();
        tmPrinterCriteria.setCompCd(criteriaDomain.getCompCd());
        tmPrinterCriteria.setPrinterId(criteriaDomain.getPrinterId());
        TmPrinterDomain tmPrinterInfo = this.tmPrinterService.searchByKey(tmPrinterCriteria);

        if (tmPrinterInfo == null) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            Object[] params = {criteriaDomain.getCompCd(), criteriaDomain.getPrinterId()};
            errorList.add(new MessageDomain("", NXS_E1_5018, params));
            throw new ValidationException(errorList);
        }

        // UT300 MOD START
        //// 5.Acquisition of print-copies information
        //// 5.印刷部数情報の取得
        //Ws2501CmlPrintNumCriteriaDomain bhtEisProductCriteria = new Ws2501CmlPrintNumCriteriaDomain();
        //if (criteriaDomain.getMainMarkList() == null || criteriaDomain.getMainMarkList().size() == 0) {
        //    // When printing number of sheets is unacquirable
        //    // 印刷枚数が取得できない場合
        //    Object[] params = {""};
        //    List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        //    errorList.add(new MessageDomain("", NXS_E1_5067, params));
        //    throw new ValidationException(errorList);
        //}
        //bhtEisProductCriteria.setMainMark(criteriaDomain.getMainMarkList().get(0));
        //Ws2501CmlPrintNumDomain wsBhtEisProduct = this.wsBhtEisProductDao.searchCmlPrintNum(bhtEisProductCriteria);
        //if (wsBhtEisProduct == null || CheckUtil.isBlankOrNull(wsBhtEisProduct.getCmlPrintNum())) {
        //    // When printing number of sheets is unacquirable
        //    // 印刷枚数が取得できない場合
        //    List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        //    Object[] params = {criteriaDomain.getMainMarkList().get(0)};
        //    errorList.add(new MessageDomain("", NXS_E1_5067, params));
        //    throw new ValidationException(errorList);
        //}
        //int printnum = Integer.valueOf(wsBhtEisProduct.getCmlPrintNum());
        //
        //for (String mainMark : criteriaDomain.getMainMarkList()) {
        //    // 6.A create of PDF
        //    // 6.PDFの作成
        //    File pdf = this.lc001ReportService.searchErt(mainMark, null, formatDate);
        //
        //    // 7. printing
        //    // 7.印刷
        //    this.commonService.printPdf(pdf, printnum, tmPrinterInfo.getPrinterNm());
        //}

        // merge print
        // 連結印刷

        List<File> pdfFileList = new ArrayList<File>();
        for (String mainMark : criteriaDomain.getMainMarkList()) {
            File pdfFile = lc001ReportService.searchErt(mainMark, null, formatDate);
            pdfFileList.add(pdfFile);
        }
        mergePrintPdf(pdfFileList, criteriaDomain.getCmlPrintNum(), tmPrinterInfo.getPrinterNm());
        // UT300 MOD END
    }
    
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsBhtEisProductService#validateDatabaseVmUserInfo(java.lang.String)
     */
    public boolean validateDatabaseVmUserInfo(String dscId) throws ApplicationException {
        
        if (CheckUtil.isBlankOrNull(dscId)) {
            return false;
        }
        
        VmUserInfoCriteriaDomain criteria = new VmUserInfoCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setSearchCountCheckFlg(false);
        
        if (vmUserInfoService.searchCount(criteria) > 0) {
            return true;
        }
        
        return false;
    }

    // --------------------------------Common-----------------------------------------------------------------------------
    // -------------------------------- 共通 -----------------------------------------------------------------------------
    /**
     * Set up the common property of a domain.(For registration)
     * <br />ドメインの共通プロパティを設定します。(登録用)
     *
     * @param domain The domain to register<br />登録するドメイン
     * @param userId DSC-ID
     * @param funcId Function ID<br />機能ID
     */
    protected void setCommonPropertyForRegist(AbstractDomain domain, String userId, String funcId) {
        
        // At the time of add function ID, a registrant, and a REGISTER DATE
        // 登録機能ID、登録者、登録日時
        domain.setComCreateFuncId(funcId);
        domain.setComCreateUserId(userId);

        // update function ID, regenerator, an update date
        // 更新機能ID、更新者、更新日時
        domain.setComUpdateFuncId(funcId);
        domain.setComUpdateUserId(userId);
    }

    /**
     * Set up the common property of a domain.(For an update)
     * <br />ドメインの共通プロパティを設定します。(更新用)
     *
     * @param domain The domain to update<br />更新するドメイン
     * @param userId DSC-ID
     * @param funcId Function ID<br />機能ID
     */
    protected void setCommonPropertyForUpdate(AbstractDomain domain, String userId, String funcId) {

        // update function ID, regenerator, an update date
        // 更新機能ID、更新者、更新日時
        domain.setComUpdateFuncId(funcId);
        domain.setComUpdateUserId(userId);
    }

    /**
     * [ws2502] [ws2503] exterior sign existence check
     * <br />[ws2502][ws2503]外装記号存在チェック
     *
     * @param pltzInstrNo Packaging Instruction (=Pull) NO<br />梱包指示NO
     * @param outerCd Exterior sign<br />外装記号
     * @param shipperCd Shipper-CD  * For return VALUEs<br />荷主コード ※戻り値用
     * @param trnsCd TRANSPORT-CODE  * For return VALUEs<br />輸送手段コード ※戻り値用
     * @param argTmPkgSetHdr Packing combination master (header) domain  * For return VALUEs<br />包装組合せ原単位（ヘッダ）ドメイン ※戻り値用
     * @return Error code<br />エラーコード
     * @throws ApplicationException When a packing combination master (header) cannot be referred to<br />包装組合せ原単位（ヘッダ）を参照できない場合
     */
    protected String validateDatabaseTmPkgSetDtl(String pltzInstrNo, String outerCd, String[] shipperCd, String[] trnsCd, TmPkgSetHdrDomain argTmPkgSetHdr)
        throws ApplicationException {

        // Acquisition of Shipper CD, and a TRANSPORT CODE
        // 荷主コード、輸送手段コードの取得
        if (!CheckUtil.isBlankOrNull(pltzInstrNo)){
            TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
            ttPltzInstrCriteria.setPltzInstrNo(pltzInstrNo);
            TtPltzInstrDomain ttPltzInstr = ttPltzInstrService.searchByKey(ttPltzInstrCriteria);

            if (ttPltzInstr != null) {
                shipperCd[0] = ttPltzInstr.getShipperCd();
                trnsCd[0] = ttPltzInstr.getTrnsCd();
            }
        }

        // It carries out, only when the exterior sign of argument is set up.
        // 引数の外装記号が設定されている場合のみ行う
        if (!CheckUtil.isBlankOrNull(outerCd)) {
            // Acquisition of packing combination master (header)
            // 包装組合せ原単位（ヘッダ）の取得
            TmPkgSetHdrCriteriaDomain tmPkgSetHdrCriteria = new TmPkgSetHdrCriteriaDomain();
            tmPkgSetHdrCriteria.setOwnerComp(shipperCd[0]);
            tmPkgSetHdrCriteria.setOuterPkgCd(outerCd);

            TmPkgSetHdrDomain tmPkgSetHdr = tmPkgSetHdrService.searchByKey(tmPkgSetHdrCriteria);

            // Existence check
            // 存在チェック
            if (tmPkgSetHdr == null){
                return NXS_E1_5008;
            }

            String volumeUnit = tmPkgSetHdr.getVolumeUnit();
            BigDecimal volume = tmPkgSetHdr.getVolume();
            String lengthUnit = tmPkgSetHdr.getLengthUnit();
            BigDecimal length = tmPkgSetHdr.getLength();
            BigDecimal width = tmPkgSetHdr.getWidth();
            BigDecimal height = tmPkgSetHdr.getHeight();

            // VOLUME information registration check
            // 容積情報登録チェック
            if (volumeUnit == null || volume == null || lengthUnit == null || length == null || width == null || height == null){
                return NXS_E1_5017;
            }

            // call -- it returns to a basis
            // 呼出もとに返す
            argTmPkgSetHdr.setVolumeUnit(volumeUnit);
            argTmPkgSetHdr.setVolume(volume);
            argTmPkgSetHdr.setLengthUnit(lengthUnit);
            argTmPkgSetHdr.setLength(length);
            argTmPkgSetHdr.setWidth(width);
            argTmPkgSetHdr.setHeight(height);

        }
        return null;
    }

    /**
     * [ws2502] [ws2503] dummy Packing-material existence check
     * <br />[ws2502][ws2503]ダミー包装材存在チェック
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param pkgItemNoList PACKAGE-ITEM-NO list<br />包装材品目番号リスト
     * @param pkgItemNoErrList PACKAGE-ITEM-NO error list  * For return VALUEs<br />包装材品目番号エラーリスト ※戻り値用
     * @return Checked result<br />チェック結果
     * @throws ApplicationException When a PKG Materials MA cannot be referred to<br />包装材原単位を参照できない場合
     */
    public boolean validateDatabaseTmPkgMaterials(String[] shipperCd, List<String> pkgItemNoList, List<String> pkgItemNoErrList)
        throws ApplicationException {

        for (String pkgItemNoItem : pkgItemNoList){
            if (CheckUtil.isBlankOrNull(pkgItemNoItem)) {
                continue;
            }

            TmPkgMtrlCriteriaDomain tmPkgMtrlCriteria = new TmPkgMtrlCriteriaDomain();
            // Acquisition of a PKG Materials MA
            // 包装材原単位の取得
            tmPkgMtrlCriteria.setOwnerComp(shipperCd[0]);
            tmPkgMtrlCriteria.setPkgItemNo(pkgItemNoItem);

            TmPkgMtrlDomain tmPkgMtrl = tmPkgMtrlService.searchByKey(tmPkgMtrlCriteria);

            // Existence check
            // 存在チェック
            if (tmPkgMtrl == null){
                pkgItemNoErrList.add(pkgItemNoItem);
            }
        }

        if (!pkgItemNoErrList.isEmpty()){
            return false;
        }

        return true;
    }

    /**
     * [ws2502] [ws2503] packing specification existence check
     * <br />[ws2502][ws2503]包装仕様存在チェック
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param itemNoList The list of ITEM-NO domains<br />品目番号ドメインのリスト
     * @param trnsCd TRANSPORT CODE<br />輸送手段コード
     * @param singlePkgSpec Packing specification<br />包装仕様
     * @return ITEM-NO error MAP<br />品目番号エラーMAP
     * @throws ApplicationException When a PKG Specification MA(Header), a PKG Specification MA(Detail), and a Package Specification Revision Master cannot be referred to
     *                              <br />包装仕様原単位（ヘッダ）、包装仕様原単位（明細）、包装仕様有効リビジョン原単位を参照できない場合
     */
    public Map<String, List<String>> validateDatabaseTmPkgSpecificationDt(String[] shipperCd, List<? extends Ws2501ItemNoDomain> itemNoList, String[] trnsCd,
        Ws2501PkgSpecDomain singlePkgSpec) throws ApplicationException {

        // Work for an error setting
        // エラー設定用ワーク
        List<String> itemNoEmpty = new ArrayList<String>();
        List<String> itemNoWeightEmpty = new ArrayList<String>();

        // A checked ITEM NO and packing CD
        // チェック済み品目番号・包装コード
        Set<String> checkedItemNoAndPkgCds = new HashSet<String>();

        // StringBuilder for generating a key from ITEM NO, and a packing CD
        // 品目番号・包装コードからキーを生成するための StringBuilder
        StringBuilder keyBuilder = new StringBuilder();

        Ws2501PkgSpecCriteriaDomain pkgSpecCriteria =  new Ws2501PkgSpecCriteriaDomain();
        pkgSpecCriteria.setCompCd(shipperCd[0]);
        pkgSpecCriteria.setTrnsCd(trnsCd[0]);

        for (Ws2501ItemNoDomain itemNoItem : itemNoList){

            // MIX TAG FLAG performs the following processings to all the data of "N."
            // MIXタグフラグが"N"のデータ全てに対して以下の処理を行う
            if (FLAG_Y.equals(itemNoItem.getMixTagFlg())){
                continue;
            }

            String itemNo = itemNoItem.getItemNo();
            String pkgCd = itemNoItem.getPkgCd();

            keyBuilder.setLength(0);
            String itemNoAndPkgCd = keyBuilder.append(itemNo)
                                              .append(":")
                                              .append(pkgCd)
                                              .toString();

            // -- already -- a 1-time check -- finishing -- it judges
            // 既に1回チェック済みか判定
            if (!checkedItemNoAndPkgCds.add(itemNoAndPkgCd)) {
                continue;
            }

            // Acquisition of PKG Specification MA(Header), a PKG Specification MA(Detail), and a Package Specification Revision Master
            // 包装仕様原単位（ヘッダ）、包装仕様原単位（明細）、包装仕様有効リビジョン原単位の取得
            pkgSpecCriteria.setItemNo(itemNo);
            pkgSpecCriteria.setPkgCd(pkgCd);

            List<? extends Ws2501PkgSpecDomain> pkgSpecList = wsBhtEisProductDao.searchPkgSpec(pkgSpecCriteria);

            // Existence check
            // 存在チェック
            if (pkgSpecList.isEmpty()){
                itemNoEmpty.add(itemNo);
                continue;
            }

            // Survey WEIGHT registration check
            // 実測重量登録チェック
            for (Ws2501PkgSpecDomain pkgSpec : pkgSpecList){
                if (pkgSpec.getNetWeightA() == null){
                    itemNoWeightEmpty.add(itemNo);
                    break;
                }

                singlePkgSpec.setVolumeUnit(pkgSpec.getVolumeUnit());
                singlePkgSpec.setVolumePalletize(pkgSpec.getVolumePalletize());
                singlePkgSpec.setLengthUnit(pkgSpec.getLengthUnit());
                singlePkgSpec.setLengthPalletize(pkgSpec.getLengthPalletize());
                singlePkgSpec.setWidthPalletize(pkgSpec.getWidthPalletize());
                singlePkgSpec.setHeightPalletize(pkgSpec.getHeightPalletize());
            }
        }

        // Error judging
        // エラー判定
        Map<String, List<String>> errMap = new HashMap<String, List<String>>();

        if (!itemNoEmpty.isEmpty()){
            errMap.put(NXS_E1_5010, itemNoEmpty);
        }
        if (!itemNoWeightEmpty.isEmpty()){
            errMap.put(NXS_E1_5068, itemNoWeightEmpty);
        }
        return errMap;
    }

    /**
     * Acquire maximum BRANCH+1 of a Palletize Item.
     * <br />パレタイズ対象品の最大枝番＋1を取得します。
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @return Maximum BRANCH+1<br />最大枝番＋1
     * @throws ApplicationException When a Palletize Item cannot be referred to<br />パレタイズ対象品を参照できない場合
     */
    protected BigDecimal searchMaxBrchPlusOne(String mainMark) throws ApplicationException{

        TtPltzItemCriteriaDomain criteria = new TtPltzItemCriteriaDomain();
        criteria.setMainMark(mainMark);
        criteria.setPreferredOrder("BRCH desc");
        criteria.setRowNumFrom(1);
        criteria.setRowNumTo(1);
        List<TtPltzItemDomain> ttPltzItemList = ttPltzItemService.searchByConditionForPaging(criteria);

        if (ttPltzItemList.isEmpty()) {
            return BigDecimal.ONE;
        }
        
        BigDecimal maxBrch = ttPltzItemList.get(0).getBrch();

        if (maxBrch == null){
            return BigDecimal.ONE;
        } else {
            return maxBrch.add(BigDecimal.ONE);
        }
    }

    /**
     *
     * <pre>
     * Get the Orders Allowance Information using the (WS2005) Web Services
     *
     * Webサービス(WS2005)を使用して、受注引当の情報を登録します。
     * </pre>
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param paramItemList Parameter item<br />パラメータ項目
     * @return This is true when this is able to register normally.<br />正常に登録できた場合 true
     * @throws ApplicationException When an error occurs in Web service<br />Webサービスでエラーが発生した場合
     * @see CommonService#searchCigmaNightFlg(String)
     * @see Ws2005RestService#createRcvOdrAlloc(String, String, Ws2005ParamDomain)
     */
    protected boolean createRcvOdrAlloc(String shipperCd, List<Ws2005ParamItemDomain> paramItemList) throws ApplicationException {

        Ws2005ParamDomain ws2005Param = new Ws2005ParamDomain();
        ws2005Param.setDetailList(paramItemList);

        String nightFlg = commonService.searchCigmaNightFlg(shipperCd);
        ResultDomain ws2005Result = ws2005RestService.createRcvOdrAlloc(shipperCd, nightFlg, ws2005Param);

        return WS_RESULT_SUCCESS.equals(ws2005Result.getResultCode());
    }

    /**
     *    [Common] CIGMA night-batch check
     * <br />[共通]CIGMA夜間バッチチェック
     *
     * <pre>
     * Functional specification common : behavior in a CIGMA night batch
     *
     * 機能仕様共通：CIGMA夜間バッチ中の振る舞い
     * </pre>
     *
     * @param shipperCd shipperCd<br />荷主コード
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public boolean validateDatabaseCigmaNightBatchRunning(String shipperCd)
        throws ApplicationException {
        return searchCigmaAvailable(true, shipperCd);
    }

    /**
     * The string of a {@link Eca0027Constants#WEB_SERVICE_DATE_FORMAT} format is changed into {@link Date}, and is returned.
     * <br />{@link Eca0027Constants#WEB_SERVICE_DATE_FORMAT} 形式の文字列を {@link Date} に変換して返す。
     *
     * @param date The string of a {@link Eca0027Constants#WEB_SERVICE_DATE_FORMAT} format<br />{@link Eca0027Constants#WEB_SERVICE_DATE_FORMAT} 形式の文字列
     * @return Date Date object<br />オブジェクト
     */
    protected static Date parseDate(String date) {
        return DateUtil.parseDate(date, WEB_SERVICE_DATE_FORMAT);
    }

    /**
     * Return the specified period of two time for the numerical value (upper 2 figure: at the time lower double figure : minute) of 4 figures.
     * <br />指定された2つの日時の期間を4桁の数値(上2桁：時, 下2桁：分)で返す。
     *
     * @param startDateTime At the time of an opening day<br />開始日時
     * @param endDateTime At the time of an end date<br />終了日時
     * @return The numerical value showing a period of 4 figures (upper 2 figure: at the time lower double figure : minute)<br />期間を表す4桁の数値(上2桁：時, 下2桁：分)
     * @throws ApplicationException Application Exception
     */
    protected static BigDecimal duration(Date startDateTime, Date endDateTime) throws ApplicationException {

        long duration = (endDateTime.getTime() - startDateTime.getTime()) / (60 * 1000);

        long hours = duration / 60;
        // 2 figure
        // 2桁以下
        assertTrue(hours < 100);

        long minutes = duration % 60;

        return new BigDecimal(hours * 100 + minutes);
    }

    /**
     * Asserts that a condition is true.
     * If it isn't, it throws an SystemException with the message is defined as 'NXS-91-0001'
     *
     * @param condition condition to be checked
     * @throws ApplicationException Application Exception
     */
    protected static void assertTrue(boolean condition) throws ApplicationException {
        if (!condition) {
            throw new ApplicationException("NXS-91-0001");
        }
    }
    
    /**
     * Replace blank and null to white space
     * <br />Blank又はNullをSpaceに置き換えます。
     *
     * @param v original value<br />変換元
     * @return new value<br />変換先
     */
    protected String convertBlankOrNullToSpace(String v){
        if (CheckUtil.isBlankOrNull(v)){
            return " ";
        } else {
            return v;
        }
    }
    
    /**
     * convert unit (for weight)
     * <br />単位変換を行う。(重量単位用)
     *
     * @param weight - value to convert (not null)
     * @param fromUnitCd - Unit before conversion
     * @param toUnitCd - Unit after conversion
     * @param msgParams Message parameters
     * @return value that converted (set null if the integer portion is overflow) 
     * @throws ApplicationException - if Unit Of Measure Conversion Item Master (for decimal) can not be queried
     */
    protected BigDecimal convertWeightUnit(BigDecimal weight, String fromUnitCd, String toUnitCd, Object[] msgParams) throws ApplicationException {
        BigDecimal convertedValue = commonService.convertWeightUnit(weight, fromUnitCd, toUnitCd);
        if (convertedValue == null) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            errorList.add(new MessageDomain("", NXS_E1_5071, msgParams));
            throw new ValidationException(errorList);
        }
        
        return convertedValue;
    }
    
    /**
     * convert unit (for volume)
     * <br />単位変換を行う。(容積単位用)
     *
     * @param volume - value to convert (not null)
     * @param fromUnitCd - Unit before conversion
     * @param toUnitCd - Unit after conversion
     * @param msgParams Message parameters
     * @return value that converted (set null if the integer portion is overflow) 
     * @throws ApplicationException - if Unit Of Measure Conversion Item Master (for decimal) can not be queried
     */
    protected BigDecimal convertVolumeUnit(BigDecimal volume, String fromUnitCd, String toUnitCd, Object[] msgParams) throws ApplicationException {
        BigDecimal convertedValue = commonService.convertVolumeUnit(volume, fromUnitCd, toUnitCd);
        if (convertedValue == null) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            errorList.add(new MessageDomain("", NXS_E1_5071, msgParams));
            throw new ValidationException(errorList);
        }
        
        return convertedValue;
    }
    
    /**
     * convert unit (for length)
     * <br />単位変換を行う。(長さ単位用)
     *
     * @param length - value to convert (not null)
     * @param fromUnitCd - Unit before conversion
     * @param toUnitCd - Unit after conversion
     * @param msgParams Message parameters
     * @return value that converted (set null if the integer portion is overflow) 
     * @throws ApplicationException - if Unit Of Measure Conversion Item Master (for decimal) can not be queried
     */
    protected BigDecimal convertLengthUnit(BigDecimal length, String fromUnitCd, String toUnitCd, Object[] msgParams) throws ApplicationException {
        BigDecimal convertedValue = commonService.convertLengthUnit(length, fromUnitCd, toUnitCd);
        if (convertedValue == null) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            errorList.add(new MessageDomain("", NXS_E1_5071, msgParams));
            throw new ValidationException(errorList);
        }
        
        return convertedValue;
    }
    
    /**
     * overflow check (For weight)
     * <br />桁溢れチェックを行う。(重量用)
     *
     * @param weight WEIGHT<br />重量
     * @param msgParams Message parameters
     * @throws ValidationException When overflow is being carried out.<br />桁溢れしている場合
     */
    protected void checkWeightOverflow(BigDecimal weight, Object[] msgParams) throws ValidationException {
        if (weight == null) {
            return;
        }
        if (commonService.isWeightOverflow(weight)) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            errorList.add(new MessageDomain("", NXS_E1_5071, msgParams));
            throw new ValidationException(errorList);
        }
    }
    
    /**
     * Get resource that corresponding to the specified key.
     * <br />指定されたキーに対応するリソースを取得します。
     *
     * @param key - key of the resource
     * @return value of the resource
     */
    protected String getResource(String key) {
        return commonService.getResource(null, key);
    }
    
    /**
     * Get a value of sequentially numbered in accordance with a key from the Sequence Master
     * <br />採番原単位からキーに応じた連番付きの値を取得します。
     *
     * @param seqKey - Numbering key
     * @param seqTyp - Numbering type
     * @param num - The number of serial number to get
     * @param funcId - function ID
     * @return - Serial number that is filled 0
     * @throws ApplicationException - If the serial number can not be obtained from the Sequence Master
     */
    protected List<String> transactSequence(String seqKey, String seqTyp, int num, String funcId) throws ApplicationException {
        
        try {
            return commonService.transactSequence(seqKey, seqTyp, num, funcId);
            
        } catch (GscmApplicationException e) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            if (NXS_E1_0005.equals(e.getCode())) {
                errorList.add(new MessageDomain("", NXS_E1_0005_BHT, null));
                throw new ValidationException(errorList);
                
            } else if (NXS_E7_0005.equals(e.getCode())) {
                errorList.add(new MessageDomain("", NXS_E7_0005_BHT, null));
                throw new ValidationException(errorList);
                
            } else {
                throw e;
            }
        }
    }
    
    /**
     * Get the availability of CIGMA
     * <br />CIGMAの利用可否を取得します。
     *
     * @param isShipping24hFunc - '24H shipping corresponding function'=true / '24H shipping non'-function=false
     * @param compCd - COMPANY CODE
     * @return true if CIGAM nightly batch is running, otherwise false
     * @throws ApplicationException - If an error occurred during the search of CIGMA Environment Master
     */
    protected boolean searchCigmaAvailable(boolean isShipping24hFunc, String compCd) throws ApplicationException {
        
        try {
            return commonService.searchCigmaAvailable(isShipping24hFunc, compCd);
            
        } catch (GscmApplicationException e) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            if (NXS_E7_0075.equals(e.getCode())) {
                errorList.add(new MessageDomain("", NXS_E7_5045, null));
                throw new ValidationException(errorList);
                
            } else {
                throw e;
            }
        }
    }

    /**
     * Assert that the object is not empty.
     * 
     * @param o object
     * @param msgId message id
     * @throws ValidationException if the object is null or empty
     */
    protected void assertNotEmpty(Object o, String msgId) throws ValidationException {

        if (o == null) {
            throw new ValidationException(singletonList(new MessageDomain("", msgId, new String[0])));
        }

        if (o instanceof Collection) {
            if (((Collection<?>) o).isEmpty()) {
                throw new ValidationException(singletonList(new MessageDomain("", msgId, new String[0])));
            }

        }
    }

    /**
     * merge print PDF file<br />
     * PDFファイル連結印刷。
     *
     * UT300 ADD
     *
     * @param pdfFileList PDF files for merge print/連結して印刷するPDFファイル
     * @param printNum print num/印刷枚数
     * @param printerName outmput printer name/出力プリンタ名
     * @throws ApplicationException business exception/業務例外
     */
    protected void mergePrintPdf(List<File> pdfFileList, int printNum, String printerName) throws ApplicationException {

        if (pdfFileList.size() == 0) {
            return;
        }

        // UT304 MULTI LABEL MOD START
        //List<InputStream> pdfInputStreamList = new ArrayList<InputStream>();
        List<File> copyPdfFileList = new ArrayList<File>();
        // UT304 MULTI LABEL MOD END
        try {
            // While summarizing the number of copies to be printed the same file and prepare input stream. 
            // 印刷部数分同じファイルをまとめながら入力ストリームを用意する。
            for (File pdfFile : pdfFileList) {
                for (int i = 0; i < printNum; i++) {
                    try {
                        // UT304 MULTI LABEL MOD START
                        //pdfInputStreamList.add(new FileInputStream(pdfFile));
                        copyPdfFileList.add(pdfFile);
                        // UT304 MULTI LABEL MOD END
                    } catch (Exception e) {
                        throw new SystemException(NXS_91_0001, e);
                    }
                }
            }
            // Print by connecting the file in the order which summarizes
            // まとめた順にファイルを連結して印刷する。
            // UT304 MULTI LABEL MOD START
            //File mergedPdfFile
            //    = commonService.mergePdf("PDFTEMP", (InputStream[])pdfInputStreamList.toArray(new InputStream[0]));
            File mergedPdfFile
                = commonService.mergePdf("PDFTEMP", (File[])copyPdfFileList.toArray(new File[0]));
            // UT304 MULTI LABEL MOD END
            commonService.printPdf(mergedPdfFile, 1, printerName);

        } finally {
            // UT304 MULTI LABEL DEL START
            //for (InputStream pdfInputStream : pdfInputStreamList) {
            //    try {
            //        pdfInputStream.close();
            //    } catch (Exception e) {}
            //}
            // UT304 MULTI LABEL DEL END
        }
    }
    
    /**
     * [ws2502] [ws2503] Pallet/Carton type existence check
     * <br />[ws2502][ws2503]パレット/カートン区分存在チェック
     * 
     * UT420 ADD
     *
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @param palletNo Pallet No.<br />パレットNo
     * @return Error code<br />エラーコード
     * @throws ApplicationException Application Excepiton<br />アプリケーション例外
     */
    public String validateDatabasePalletCartonTyp(String languageCd, String palletNo)
        throws ApplicationException {
        
        // Acquisition of packing combination master (header)
        // 包装組合せ原単位（ヘッダ）の取得
        TmCdCriteriaDomain tmCdCriteria = new TmCdCriteriaDomain();
        tmCdCriteria.setCdTyp(CD_TYPE_PALLET_CARTON_TYP);
        tmCdCriteria.setLngCd(languageCd);
        tmCdCriteria.setCd(palletNo.substring(0, 1));

        TmCdDomain tmCd = tmCdService.searchByKey(tmCdCriteria);

        // Existence check
        // 存在チェック
        if (tmCd == null){
            return NXS_E1_5072;
        }
            
        return null;
    }
}
