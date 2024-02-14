/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BATCH_DSC_ID;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CIGMA_ENV_ACCESSIBILITY_TYP_NA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CIGMA_ENV_ACCESSIBILITY_TYP_NIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CIGMA_ENV_ACCESSIBILITY_TYP_NORMAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_NO_GRP_D;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_NO_GRP_DG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PRECISION_LENGTH_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PRECISION_LOADING_RATIO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PRECISION_VOLUME_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PRECISION_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_LENGTH_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_VOLUME_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0061;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0075;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROUND_PATTERN_ROUND_DOWN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROUND_PATTERN_ROUND_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROUND_PATTERN_ROUND_UP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_CML_NO_DN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_CML_NO_SUP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_CONFIRMATION_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_MIX_TAG_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_PALLETIZE_INSTR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_REQUEST_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_SHIPPING_ACTUALITY_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_STG_ACTUALITY_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_STG_INSTR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_TR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_CML_NO_DN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_CML_NO_SUP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_CONFIRMATION_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_MIX_TAG_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_PALLETIZE_INSTR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_REQUEST_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_SHIPPING_ACTUALITY_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_STG_ACTUALITY_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_STG_INSTR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_TR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_PASSWORD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_USERID;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_PARAM_LIB;
import static java.math.RoundingMode.UP;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.dao.DataIntegrityViolationException;

import com.globaldenso.ai.aijb.library.business.service.ResidentRequestjobFacadeService;
import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.ai.library.timezonemanage.business.domain.TimezoneManageDomain;
import com.globaldenso.ai.library.timezonemanage.business.domain.criteria.TimezoneManageCriteriaDomain;
import com.globaldenso.ai.library.timezonemanage.business.service.TimezoneManageService;
import com.globaldenso.ai.library.timezonemanage.exception.TimezoneManageException;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCntryDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCurrencyDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpRegulateTypDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPortDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmSeqDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvDecDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRegulateTypCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtCompMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmCntryService;
import com.globaldenso.eca0027.core.auto.business.service.TmCurrencyService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpRegulateTypService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TmPortService;
import com.globaldenso.eca0027.core.auto.business.service.TmSeqService;
import com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService;
import com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService;
import com.globaldenso.eca0027.core.auto.business.service.VtCompMeasureUnitService;
import com.globaldenso.eca0027.core.business.service.RequestIdSeqService;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.util.TmCdDomainComparator;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.ResourcesFactory;
import com.globaldenso.gscm.framework.util.StringUtil;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfCopy;
import com.lowagie.text.pdf.PdfImportedPage;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.RandomAccessFileOrArray;

/**
 * The service implementation class of common
 * <br />共通 のService実装クラスです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public class CommonServiceImpl implements CommonService {

    /**
     * the Log4j Logger
     * <br />ロガー
     */
    private static Logger logger = Logger.getLogger(CommonService.class);
    
    /**
     * Map that holds the correspondence of numbering type and numbering maximum value <br />
     * 採番区分と採番最大値の対応を保持するマップ
     */
    private static Map<String, Integer> seqMaxMap;
    
    static {
        // A correspond of the assignment-of-order-numbers maximum is set to assignment-of-order-numbers classification.
        // 採番区分と採番最大値の対応を設定
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put(SEQ_TYP_REQUEST_NO, SEQ_MAX_REQUEST_NO);
        map.put(SEQ_TYP_PALLETIZE_INSTR_NO, SEQ_MAX_PALLETIZE_INSTR_NO);
        map.put(SEQ_TYP_CML_NO_DN, SEQ_MAX_CML_NO_DN);
        map.put(SEQ_TYP_CML_NO_SUP, SEQ_MAX_CML_NO_SUP);
        map.put(SEQ_TYP_MIX_TAG_NO, SEQ_MAX_MIX_TAG_NO);
        map.put(SEQ_TYP_TR_NO, SEQ_MAX_TR_NO);
        map.put(SEQ_TYP_STG_INSTR_NO, SEQ_MAX_STG_INSTR_NO);
        map.put(SEQ_TYP_STG_ACTUALITY_NO, SEQ_MAX_STG_ACTUALITY_NO);
        map.put(SEQ_TYP_CONFIRMATION_NO, SEQ_MAX_CONFIRMATION_NO);
        map.put(SEQ_TYP_SHIPPING_ACTUALITY_NO, SEQ_MAX_SHIPPING_ACTUALITY_NO);
        seqMaxMap = Collections.unmodifiableMap(map);
    }
    
    /**
     * service of Code Master <br />
     * コード原単位サービス
     */
    protected TmCdService tmCdService;

    /**
     * service of Timezone Manage <br />
     * タイムゾーン管理サービス
     */
    protected TimezoneManageService timezoneManageService;

    /**
     * service of Currency Master <br />
     * 通貨原単位サービス
     */
    protected TmCurrencyService tmCurrencyService;

    /**
     * service of Invoice Template Master <br />
     * 船積書類テンプレート原単位サービス
     */
    protected TmInvTplService tmInvTplService;

    /**
     * service of Export Regulate Type <br />
     * 輸出規制区分原単位サービス
     */
    protected TmExpRegulateTypService tmExpRegulateTypService;

    /**
     * service of NEXUS Company Master <br />
     * NEXUS会社原単位サービス
     */
    protected TmNxsCompService tmNxsCompService;

    /**
     * service of Measure Unit Master <br />
     * 計量単位原単位サービス
     */
    protected TmMeasureUnitService tmMeasureUnitService;

    /**
     * service of Transportation Type Master <br />
     * 輸送手段種別原単位サービス
     */
    protected TmTrnsTypService tmTrnsTypService;

    /**
     * Sequence Master <br />
     * 採番原単位サービス
     */
    protected TmSeqService tmSeqService;

    /**
     * service of CIGMA Ship To Cross Reference Master <br />
     * NEXUS送荷先クロスリファレンス原単位サービス
     */
    protected TmCigmaShipToXrefService tmCigmaShipToXrefService;

    /**
     * service of CIGMA Warehouse Cross Reference Master <br />
     * 倉庫クロスリファレンス原単位サービス
     */
    protected TmCigmaWhXrefService tmCigmaWhXrefService;

    /**
     * service of NEXUS Warehouse Master <br />
     * 倉庫原単位サービス
     */
    protected TmNxsWhService tmNxsWhService;

    /**
     * service of NEXUS Ship To Master <br />
     * NEXUS送荷先原単位サービス
     */
    protected TmNxsShipToService tmNxsShipToService;

    /**
     * service of Packing Pattern Master <br />
     * 包装組合せ原単位（ヘッダ）サービス
     */
    protected TmPkgSetHdrService tmPkgSetHdrService;

    /**
     * service of Country Master <br />
     * 国原単位サービス
     */
    protected TmCntryService tmCntryService;

    /**
     * service of Port Master <br />
     * 港原単位サービス
     */
    protected TmPortService tmPortService;

    /**
     * service of CIGMA Environment Master <br />
     * CIGMA環境原単位サービス
     */
    protected TmCigmaEnvService tmCigmaEnvService;

    /**
     * service of the Of Measure Conversion Master <br />
     * 計量単位換算原単位(小数用)サービス
     */
    protected TmUomCnvDecService tmUomCnvDecService;

    /**
     * service of Measure Unit Master <br />
     * 計量単位サービス 
     */
    protected VtCompMeasureUnitService vtCompMeasureUnitService;

    /**
     * File Manager<br />
     * ファイルマネージャ
     */
    protected FileManagementService fileManagerServiceForStream;
    
    /**
     * RequestjobFacadeService.
     */
    protected ResidentRequestjobFacadeService residentRequestjobFacadeService;

    /**
     * RequestIdSeqServiceImpl.
     * L005 Add
     */
    protected RequestIdSeqService requestIdSeqService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public CommonServiceImpl() {
    }

    /**
     * Getter method for seqMaxMap.
     *
     * @return seqMaxMap
     */
    protected static Map<String, Integer> getSeqMaxMap() {
        return seqMaxMap;
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
     * Setter method for timezoneManageService.
     *
     * @param timezoneManageService Set for timezoneManageService
     */
    public void setTimezoneManageService(TimezoneManageService timezoneManageService) {
        this.timezoneManageService = timezoneManageService;
    }

    /**
     * Setter method for tmCurrencyService.
     *
     * @param tmCurrencyService Set for tmCurrencyService
     */
    public void setTmCurrencyService(TmCurrencyService tmCurrencyService) {
        this.tmCurrencyService = tmCurrencyService;
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
     * Setter method for tmExpRegulateTypService.
     *
     * @param tmExpRegulateTypService Set for tmExpRegulateTypService
     */
    public void setTmExpRegulateTypService(
        TmExpRegulateTypService tmExpRegulateTypService) {
        this.tmExpRegulateTypService = tmExpRegulateTypService;
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
     * Setter method for tmMeasureUnitService.
     *
     * @param tmMeasureUnitService Set for tmMeasureUnitService
     */
    public void setTmMeasureUnitService(TmMeasureUnitService tmMeasureUnitService) {
        this.tmMeasureUnitService = tmMeasureUnitService;
    }

    /**
     * Setter method for tmTrnsTypService.
     *
     * @param tmTrnsTypService Set for tmTrnsTypService
     */
    public void setTmTrnsTypService(TmTrnsTypService tmTrnsTypService) {
        this.tmTrnsTypService = tmTrnsTypService;
    }

    /**
     * Setter method for tmSeqService.
     *
     * @param tmSeqService Set for tmSeqService
     */
    public void setTmSeqService(TmSeqService tmSeqService) {
        this.tmSeqService = tmSeqService;
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
     * Setter method for tmNxsWhService.
     *
     * @param tmNxsWhService Set for tmNxsWhService
     */
    public void setTmNxsWhService(TmNxsWhService tmNxsWhService) {
        this.tmNxsWhService = tmNxsWhService;
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
     * Setter method for tmPkgSetHdrService.
     *
     * @param tmPkgSetHdrService Set for tmPkgSetHdrService
     */
    public void setTmPkgSetHdrService(TmPkgSetHdrService tmPkgSetHdrService) {
        this.tmPkgSetHdrService = tmPkgSetHdrService;
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
     * Setter method for tmPortService.
     *
     * @param tmPortService Set for tmPortService
     */
    public void setTmPortService(TmPortService tmPortService) {
        this.tmPortService = tmPortService;
    }

    /**
     * Setter method for tmCigmaEnvService.
     *
     * @param tmCigmaEnvService Set for tmCigmaEnvService
     */
    public void setTmCigmaEnvService(TmCigmaEnvService tmCigmaEnvService) {
        this.tmCigmaEnvService = tmCigmaEnvService;
    }

    /**
     * Setter method for tmUomCnvDecService.
     *
     * @param tmUomCnvDecService Set for tmUomCnvDecService
     */
    public void setTmUomCnvDecService(TmUomCnvDecService tmUomCnvDecService) {
        this.tmUomCnvDecService = tmUomCnvDecService;
    }

    /**
     * Setter method for vtCompMenCompMeasureUnitService.
     *
     * @param vtCompMeasureUnitService Set for vtCompMeasureUnitService
     */
    public void setVtCompMeasureUnitService(VtCompMeasureUnitService vtCompMeasureUnitService) {
        this.vtCompMeasureUnitService = vtCompMeasureUnitService;
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
     * <p>residentRequestjobFacadeService のセッターメソッドです。</p>
     *
     * @param residentRequestjobFacadeService residentRequestjobFacadeService に設定する
     */
    public void setResidentRequestjobFacadeService(
        ResidentRequestjobFacadeService residentRequestjobFacadeService) {
        this.residentRequestjobFacadeService = residentRequestjobFacadeService;
    }

    /**
     * Setter method for requestIdSeqService.
     *
     * @param requestIdSeqService Set for requestIdSeqService
     */
    public void setRequestIdSeqService(RequestIdSeqService requestIdSeqService) {
        this.requestIdSeqService = requestIdSeqService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#getResource(java.util.Locale, java.lang.String)
     */
    public String getResource(Locale locale, String key) {
        return ResourcesFactory.getResources().getMessage(locale, key);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchPullDownList(String, String, int, boolean)
     */
    public List<? extends SelectListItemDomain> searchPullDownList(
        String cdType, String langCd, int dispType, boolean addBlank)
        throws ApplicationException {

        // When display type is not any of "1" - "3", either
        // 表示タイプが「1」～「3」のいずれでもない場合
        if (dispType != PULLDOWN_DISP_TYPE_CODE
            && dispType != PULLDOWN_DISP_TYPE_VALUE
            && dispType != PULLDOWN_DISP_TYPE_CODE_VALUE) {
            throw new SystemException(NXS_91_0001);
        }

        // Acquisition of a CD master
        // コードマスタの取得
        TmCdCriteriaDomain tmCdCriteriaDomain = new TmCdCriteriaDomain();
        tmCdCriteriaDomain.setCdTyp(cdType);
        tmCdCriteriaDomain.setLngCd(langCd);
        List<TmCdDomain> searchList = tmCdService.searchByCondition(tmCdCriteriaDomain);

        // when it cannot acquire, it refers to default languages.
        // 取得できない場合はデフォルト言語で検索
        if (searchList.isEmpty() && !LANGUAGE_CD_ENGLISH.equals(langCd)) {
            tmCdCriteriaDomain.setLngCd(LANGUAGE_CD_ENGLISH);
            searchList = tmCdService.searchByCondition(tmCdCriteriaDomain);
        }
        
        // Rearrangement of list
        // リストの並び替え
        Collections.sort(searchList, new TmCdDomainComparator());

        // Create of a pulldown list
        // プルダウンリストの作成
        List<SelectListItemDomain> list = new ArrayList<SelectListItemDomain>();
        SelectListItemDomain bean = null;
        if (addBlank){
            bean = new SelectListItemDomain();
            bean.setId("");
            bean.setName("");
            list.add(bean);
        }
        for (TmCdDomain domain : searchList) {
            bean = new SelectListItemDomain();
            bean.setId(domain.getCd());
            if (dispType == PULLDOWN_DISP_TYPE_CODE_VALUE) {
                bean.setName(domain.getCd() + ":" + domain.getValue());
            } else if (dispType == PULLDOWN_DISP_TYPE_VALUE) {
                bean.setName(domain.getValue());
            } else if (dispType == PULLDOWN_DISP_TYPE_CODE) {
                bean.setName(domain.getCd());
            }
            list.add(bean);
        }

        return list;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#convertWeightUnit(BigDecimal, String, String)
     */
    public BigDecimal convertWeightUnit(BigDecimal value, String fromUnitCd, String toUnitCd)
        throws ApplicationException {

        return convertUnit(value, fromUnitCd, toUnitCd, MAX_PRECISION_WEIGHT_UNIT, MAX_SCALE_WEIGHT_UNIT);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#convertVolumeUnit(BigDecimal, String, String)
     */
    public BigDecimal convertVolumeUnit(BigDecimal value, String fromUnitCd, String toUnitCd)
        throws ApplicationException {

        return convertUnit(value, fromUnitCd, toUnitCd, MAX_PRECISION_VOLUME_UNIT, MAX_SCALE_VOLUME_UNIT);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#convertLengthUnit(BigDecimal, String, String)
     */
    public BigDecimal convertLengthUnit(BigDecimal value, String fromUnitCd, String toUnitCd)
        throws ApplicationException {

        return convertUnit(value, fromUnitCd, toUnitCd, MAX_PRECISION_LENGTH_UNIT, MAX_SCALE_LENGTH_UNIT);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#isLengthOverflow(java.math.BigDecimal)
     */
    public boolean isLengthOverflow(BigDecimal length) {
        return isOverflow(length, MAX_PRECISION_LENGTH_UNIT);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#isVolumeOverflow(java.math.BigDecimal)
     */
    public boolean isVolumeOverflow(BigDecimal volume) {
        return isOverflow(volume, MAX_PRECISION_VOLUME_UNIT);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#isWeightOverflow(java.math.BigDecimal)
     */
    public boolean isWeightOverflow(BigDecimal weight) {
        return isOverflow(weight, MAX_PRECISION_WEIGHT_UNIT);
    }
    

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#isLoadingRatioOverflow(java.math.BigDecimal)
     */
    public boolean isLoadingRatioOverflow(BigDecimal loadingRatio) {
        return isOverflow(loadingRatio, MAX_PRECISION_LOADING_RATIO);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchCigmaAds(java.lang.String)
     */
    public Date searchCigmaAds(String compCd) throws ApplicationException {

        // Acquisition of CIGMA Environment Master
        // CIGMA環境原単位の取得
        TmCigmaEnvCriteriaDomain tmCigmaEnvCriteriaDomain = new TmCigmaEnvCriteriaDomain();
        tmCigmaEnvCriteriaDomain.setCompCd(compCd);
        TmCigmaEnvDomain tmCigmaEnvDomain
            = tmCigmaEnvService.searchByKey(tmCigmaEnvCriteriaDomain);

        // When CIGMA Environment Master is unacquirable
        // CIGMA環境原単位を取得できない場合
        if (tmCigmaEnvDomain == null) {
            return null;
        }

        return tmCigmaEnvDomain.getCigmaAds();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchCigmaAvailable(boolean, java.lang.String)
     */
    public boolean searchCigmaAvailable(boolean isShipping24hFunc, String compCd)
        throws ApplicationException {

        // Acquisition of CIGMA Environment Master
        // CIGMA環境原単位の取得
        TmCigmaEnvCriteriaDomain tmCigmaEnvCriteriaDomain = new TmCigmaEnvCriteriaDomain();
        tmCigmaEnvCriteriaDomain.setCompCd(compCd);
        TmCigmaEnvDomain tmCigmaEnvDomain
            = tmCigmaEnvService.searchByKey(tmCigmaEnvCriteriaDomain);

        // CIGMA Environment Master is unacquirable.
        // CIGMA環境原単位を取得できない
        if (tmCigmaEnvDomain == null) {
            throw new GscmApplicationException(NXS_E7_0075);
        }

        // In the case of the functional function corresponding to 24H shipment
        // 24H出荷対応機能機能の場合
        if (isShipping24hFunc) {

            // case where ACCESSIBILITY TYPE is "usually working"   Or
            // In the case of the base corresponding to 24H shipment, ACCESSIBILITY TYPE is "in a night batch."
            // 利用可能区分が「通常稼働」の場合 または
            // 利用可能区分が「夜間バッチ中」で 24H出荷対応拠点の場合
            if (CIGMA_ENV_ACCESSIBILITY_TYP_NORMAL.equals(tmCigmaEnvDomain.getAccessibilityTyp())
                || (CIGMA_ENV_ACCESSIBILITY_TYP_NIGHT.equals(tmCigmaEnvDomain.getAccessibilityTyp())
                    && FLAG_Y.equals(tmCigmaEnvDomain.getShipping24hFlg()))) {
                return true;
            }

            // Case of the function corresponding to un-[ 24H shipment ]
            // 24H出荷非対応機能の場合
        } else {

            // When ACCESSIBILITY TYPE is "usually working"
            // 利用可能区分が「通常稼働」の場合
            if (CIGMA_ENV_ACCESSIBILITY_TYP_NORMAL.equals(tmCigmaEnvDomain.getAccessibilityTyp())) {
                return true;
            }
        }

        return false;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchCigmaNightFlg(java.lang.String)
     */
    public String searchCigmaNightFlg(String compCd) throws ApplicationException {
        // Acquisition of CIGMA Environment Master
        // CIGMA環境原単位の取得
        TmCigmaEnvCriteriaDomain tmCigmaEnvCriteriaDomain = new TmCigmaEnvCriteriaDomain();
        tmCigmaEnvCriteriaDomain.setCompCd(compCd);
        TmCigmaEnvDomain tmCigmaEnvDomain = tmCigmaEnvService.searchByKey(tmCigmaEnvCriteriaDomain);
        
        if (tmCigmaEnvDomain == null) {
            throw new SystemException(GSCM_E0_0001);
        }
        
        // ACCESSIBILITY TYPE
        // 利用可能区分
        String accessibilityTyp = tmCigmaEnvDomain.getAccessibilityTyp();
        
        if (CIGMA_ENV_ACCESSIBILITY_TYP_NORMAL.equals(accessibilityTyp)) {
            return FLAG_N;
        } else if (CIGMA_ENV_ACCESSIBILITY_TYP_NIGHT.equals(accessibilityTyp)) {
            return FLAG_Y;
        } else {
            throw new SystemException(NXS_91_0001);
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchCigmaWebServiceCallerRestDomain(java.lang.String, java.lang.String)
     */
    public WebServiceCallerRestDomain searchCigmaWebServiceCallerRestDomain(String compCd,
        String webServicePath) throws ApplicationException {

        // Acquisition of CIGMA Environment Master
        // CIGMA環境原単位の取得
        TmCigmaEnvCriteriaDomain tmCigmaEnvCriteriaDomain = new TmCigmaEnvCriteriaDomain();
        tmCigmaEnvCriteriaDomain.setCompCd(compCd);
        TmCigmaEnvDomain tmCigmaEnvDomain
            = tmCigmaEnvService.searchByKey(tmCigmaEnvCriteriaDomain);

        // When CIGMA Environment Master is unacquirable
        // CIGMA環境原単位を取得できない場合
        if (tmCigmaEnvDomain == null) {
            throw new SystemException(GSCM_E0_0001);
        }
        
        boolean isInBatch = BATCH_DSC_ID.equals(DensoContext.get().getDscId());

        // When ACCESSIBILITY TYPE is "impossible [ use ]"
        // 利用可能区分が「利用不可」の場合
        if (!isInBatch && CIGMA_ENV_ACCESSIBILITY_TYP_NA.equals(tmCigmaEnvDomain.getAccessibilityTyp())) {
            throw new GscmApplicationException(NXS_E1_0061);
        }

        // URL of Web service
        // WebサービスのURL
        StringBuffer webServiceUrl = new StringBuffer(tmCigmaEnvDomain.getUrl());
        if (!webServiceUrl.toString().endsWith("/")) {
            webServiceUrl.append("/");
        }
        webServiceUrl.append(webServicePath);

        // library name
        // ライブラリ名
        String library = null;

        if (isInBatch) {
            // In the batch process, use NORMAL library
            // バッチ処理は通常ライブラリ固定
            library = tmCigmaEnvDomain.getLibNormal();
        } else {
            if (CIGMA_ENV_ACCESSIBILITY_TYP_NORMAL.equals(
                // When ACCESSIBILITY TYPE is "usual"
                // 利用可能区分が「通常」の場合
                tmCigmaEnvDomain.getAccessibilityTyp())) {
                library = tmCigmaEnvDomain.getLibNormal();

            } else if (CIGMA_ENV_ACCESSIBILITY_TYP_NIGHT.equals(
                // When an ACCESSIBILITY TYPE is "among a night batch"
                // 利用可能区分が「夜間バッチ中」の場合
                tmCigmaEnvDomain.getAccessibilityTyp())) {
                library = tmCigmaEnvDomain.getLibNight();

            } else {
                throw new SystemException(NXS_91_0001);
            }
        }

        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setAddDensoContext(true);
        // URL
        wsCallerRestDomain.setUrl(webServiceUrl.toString());
        // user name
        // ユーザ名
        wsCallerRestDomain.setUserName(getResource(null, WS_CIGMA_USERID + "." + compCd));
        // Password
        // パスワード
        wsCallerRestDomain.setPassword(getResource(null, WS_CIGMA_PASSWORD + "." + compCd));
        // library name
        // ライブラリ名
        if (!CheckUtil.isBlankOrNull(library)) {
            wsCallerRestDomain.setParamMap(WS_PARAM_LIB, library);
        }

        return wsCallerRestDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchCurrencyPullDownList(boolean, boolean)
     */
    public List<? extends SelectListItemDomain> searchCurrencyPullDownList(
        boolean dispCode, boolean addBlank) throws ApplicationException {

        // Acquisition of a Currency Master
        // 通貨原単位の取得
        TmCurrencyCriteriaDomain tmCurrencyCriteriaDomain = new TmCurrencyCriteriaDomain();
        List<TmCurrencyDomain> searchList
            = tmCurrencyService.searchByCondition(tmCurrencyCriteriaDomain);

        // Create of a pulldown list
        // プルダウンリストの作成
        List<SelectListItemDomain> list = new ArrayList<SelectListItemDomain>();
        SelectListItemDomain bean = null;
        if (addBlank){
            bean = new SelectListItemDomain();
            bean.setId("");
            bean.setName("");
            list.add(bean);
        }
        for (TmCurrencyDomain domain : searchList) {
            bean = new SelectListItemDomain();
            bean.setId(domain.getCurrCd());
            if (dispCode) {
                bean.setName(domain.getCurrCd() + ":" + domain.getCurrDescription());
            } else {
                bean.setName(domain.getCurrDescription());
            }
            list.add(bean);
        }

        return list;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchExpRegulationTypePullDownList(java.lang.String, boolean, boolean)
     */
    public List<? extends SelectListItemDomain> searchExpRegulationTypePullDownList(
        String nxsCompCd, boolean dispCode, boolean addBlank)
        throws ApplicationException {

        // COUNTRY CODE
        // 国コード
        String cntryCd = null;

        // When COMPANY CODE is set up
        // 会社コードが設定されている場合
        if (!CheckUtil.isBlankOrNull(nxsCompCd)) {
            // Acquisition of NEXUS Company Master
            // NEXUS会社原単位の取得
            TmNxsCompDomain tmNxsCompDomain = searchNxsComp(nxsCompCd);

            // When record cannot be acquired or a COUNTRY CODE has not been set up
            // レコードを取得できない、または、国コードが未設定の場合
            if (tmNxsCompDomain == null
                || CheckUtil.isBlankOrNull(tmNxsCompDomain.getCntryCd().trim())) {
                return new ArrayList<SelectListItemDomain>();
            }

            cntryCd = tmNxsCompDomain.getCntryCd();
        }

        // Acquisition of an Export Regulate Type
        // 輸出規制区分原単位の取得
        TmExpRegulateTypCriteriaDomain tmExpRegulateTypCriteriaDomain
            = new TmExpRegulateTypCriteriaDomain();
        tmExpRegulateTypCriteriaDomain.setCntryCd(cntryCd);
        List<TmExpRegulateTypDomain> searchList
            = tmExpRegulateTypService.searchByCondition(tmExpRegulateTypCriteriaDomain);

        // Create of a pulldown list
        // プルダウンリストの作成
        List<SelectListItemDomain> list = new ArrayList<SelectListItemDomain>();
        SelectListItemDomain bean = null;
        if (addBlank){
            bean = new SelectListItemDomain();
            bean.setId("");
            bean.setName("");
            list.add(bean);
        }
        for (TmExpRegulateTypDomain domain : searchList) {
            bean = new SelectListItemDomain();
            bean.setId(domain.getExpLimitTyp());
            if (dispCode) {
                bean.setName(domain.getExpLimitTyp() + ":" + domain.getExpLimitNm());
            } else {
                bean.setName(domain.getExpLimitNm());
            }
            list.add(bean);
        }

        return list;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchInvTemplatePullDownList(java.lang.String, boolean)
     */
    public List<? extends SelectListItemDomain> searchInvTemplatePullDownList(
        String nxsCompCd, boolean addBlank) throws ApplicationException {

        // Acquisition of Invoice Template Master
        // 船積書類テンプレート原単位の取得
        TmInvTplCriteriaDomain tmInvTplCriteriaDomain = new TmInvTplCriteriaDomain();
        tmInvTplCriteriaDomain.setCompCd(nxsCompCd);
        List<TmInvTplDomain> searchList
            = tmInvTplService.searchByCondition(tmInvTplCriteriaDomain);

        // Create of a pulldown list
        // プルダウンリストの作成
        List<SelectListItemDomain> list = new ArrayList<SelectListItemDomain>();
        SelectListItemDomain bean = null;
        if (addBlank){
            bean = new SelectListItemDomain();
            bean.setId("");
            bean.setName("");
            list.add(bean);
        }
        for (TmInvTplDomain domain : searchList) {
            bean = new SelectListItemDomain();
            bean.setId(domain.getDocNo());
            bean.setName(domain.getDocNo());
            list.add(bean);
        }

        return list;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchTimezonePullDownList(boolean)
     */
    public List<? extends SelectListItemDomain> searchTimezonePullDownList(
        boolean addBlank) throws ApplicationException {

        // Acquisition of time zone management
        // タイムゾーン管理の取得
        TimezoneManageCriteriaDomain timezoneManageCriteriaDomain
            = new TimezoneManageCriteriaDomain();
        List<TimezoneManageDomain> searchList = null;
        try {
            searchList = timezoneManageService.searchByCondition(timezoneManageCriteriaDomain);
        } catch (TimezoneManageException e) {
            throw new GscmApplicationException(e);
        }

        // Create of a pulldown list
        // プルダウンリストの作成
        List<SelectListItemDomain> list = new ArrayList<SelectListItemDomain>();
        SelectListItemDomain bean = null;
        if (addBlank){
            bean = new SelectListItemDomain();
            bean.setId("");
            bean.setName("");
            list.add(bean);
        }
        for (TimezoneManageDomain domain : searchList) {
            bean = new SelectListItemDomain();
            bean.setId(domain.getTimezoneId());
            bean.setName(domain.getTimezoneName());
            list.add(bean);
        }

        return list;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchTransTypePullDownList(boolean)
     */
    public List<? extends SelectListItemDomain> searchTransTypePullDownList(
        boolean addBlank) throws ApplicationException {

        // Acquisition of a Transportation Type Master
        // 輸送手段種別原単位の取得
        TmTrnsTypCriteriaDomain tmTrnsTypCriteriaDomain = new TmTrnsTypCriteriaDomain();
        List<TmTrnsTypDomain> searchList
            = tmTrnsTypService.searchByCondition(tmTrnsTypCriteriaDomain);

        // Create of a pulldown list
        // プルダウンリストの作成
        List<SelectListItemDomain> list = new ArrayList<SelectListItemDomain>();
        SelectListItemDomain bean = null;
        if (addBlank){
            bean = new SelectListItemDomain();
            bean.setId("");
            bean.setName("");
            list.add(bean);
        }
        for (TmTrnsTypDomain domain : searchList) {
            bean = new SelectListItemDomain();
            bean.setId(domain.getTrnsTypCd());
            bean.setName(domain.getTrnsTypNm());
            list.add(bean);
        }

        return list;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchUnitOfVolumePullDownList(boolean, boolean)
     */
    public List<? extends SelectListItemDomain> searchUnitOfVolumePullDownList(
        boolean dispCode, boolean addBlank) throws ApplicationException {

        // Acquisition of a Measure Unit Master
        // 計量単位原単位の取得
        TmMeasureUnitCriteriaDomain tmMeasureUnitCriteriaDomain
            = new TmMeasureUnitCriteriaDomain();
        List<TmMeasureUnitDomain> searchList
            = tmMeasureUnitService.searchByCondition(tmMeasureUnitCriteriaDomain);

        // Create of a pulldown list
        // プルダウンリストの作成
        List<SelectListItemDomain> list = new ArrayList<SelectListItemDomain>();
        SelectListItemDomain bean = null;
        if (addBlank){
            bean = new SelectListItemDomain();
            bean.setId("");
            bean.setName("");
            list.add(bean);
        }
        for (TmMeasureUnitDomain domain : searchList) {
            bean = new SelectListItemDomain();
            bean.setId(domain.getUnitCd());
            if (dispCode) {
                bean.setName(domain.getUnitCd() + ":" + domain.getUnitDisp());
            } else {
                bean.setName(domain.getUnitDisp());
            }
            list.add(bean);
        }

        return list;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchUnitOfWeightPullDownList(boolean, boolean)
     */
    public List<? extends SelectListItemDomain> searchUnitOfWeightPullDownList(
        boolean dispCode, boolean addBlank) throws ApplicationException {

        // A Unit of Vol. and a WEIGHT UNIT are not distinguished in this time.
        // 現時点では、容積単位と重量単位を区別しない
        return searchUnitOfVolumePullDownList(dispCode, addBlank);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#setCommonPropertyForRegist(com.globaldenso.gscm.framework.business.domain.AbstractDomain, java.lang.String)
     */
    public void setCommonPropertyForRegist(AbstractDomain domain, String funcId) {

        String userId = DensoContext.get().getDscId();

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
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#setCommonPropertyForUpdate(com.globaldenso.gscm.framework.business.domain.AbstractDomain, java.lang.String)
     */
    public void setCommonPropertyForUpdate(AbstractDomain domain, String funcId) {

        String userId = DensoContext.get().getDscId();

        // update function ID, regenerator, an update date
        // 更新機能ID、更新者、更新日時
        domain.setComUpdateFuncId(funcId);
        domain.setComUpdateUserId(userId);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#transactSequence(java.lang.String, java.lang.String, int, java.lang.String)
     */
    public List<String> transactSequence(String seqKey, String seqTyp, int num, String funcId)
        throws ApplicationException {

        // Assignment-of-order-numbers maximum
        // 採番最大値
        Integer seqMax = seqMaxMap.get(seqTyp);

        // In the case of strange assignment-of-order-numbers classification
        // 未知の採番区分の場合
        if (seqMax == null) {
            throw new SystemException(NXS_91_0001);
        }

        // Digit number
        // 桁数
        int seqDigit = seqMax.toString().length();

        // Acquisition of a Sequence Master
        // 採番原単位の取得
        TmSeqCriteriaDomain tmSeqCriteriaDomain = new TmSeqCriteriaDomain();
        tmSeqCriteriaDomain.setSeqKey(seqKey);
        tmSeqCriteriaDomain.setSeqTyp(seqTyp);
        TmSeqDomain tmSeqDomain = tmSeqService.lockByKeyNoWait(tmSeqCriteriaDomain);

        // Consecutive START NUMBER
        // 連番の開始番号
        int startSeqNo = 0;
        // Consecutive END NUMBER
        // 連番の終了番号
        int endSeqNo = 0;

        // When this is not able to acquire
        // 取得できなかった場合
        if (tmSeqDomain == null) {
            startSeqNo = 1;
            endSeqNo = num;

            // Registration of a number
            // 番号の登録
            tmSeqDomain = new TmSeqDomain();
            tmSeqDomain.setSeqKey(seqKey);
            tmSeqDomain.setSeqTyp(seqTyp);
            tmSeqDomain.setSeqNo(new BigDecimal(endSeqNo));
            setCommonPropertyForRegist(tmSeqDomain, funcId);

            try {
                tmSeqService.create(tmSeqDomain);
            } catch (IntegrationLayerException e) {
                // In the case of unique constraint violation
                // 一意制約違反の場合
                if (e.getCause() instanceof DataIntegrityViolationException) {
                    throw new GscmApplicationException(NXS_E7_0005);
                }
            }

        // When this is able to acquire
        // 取得できた場合
        } else {
            int currentSeqNo = tmSeqDomain.getSeqNo().intValue();
            startSeqNo = currentSeqNo + 1;
            endSeqNo = currentSeqNo + num;

            // When the range SEQUENCE NO was decided to be is exceeded
            // 連番が決められた範囲を超える場合
            if (endSeqNo > seqMax) {
                throw new GscmApplicationException(NXS_E1_0005);
            }

            // Update of a number
            // 番号の更新
            tmSeqDomain.setSeqNo(new BigDecimal(endSeqNo));
            setCommonPropertyForUpdate(tmSeqDomain, funcId);

            tmSeqService.update(tmSeqDomain);
        }

        // Generation of a number
        // 番号の生成
        List<String> resultList = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            String value = Integer.toString(startSeqNo + i);
            resultList.add(StringUtil.lPad(value, seqDigit, '0'));
        }

        return resultList;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateAfterDate(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateAfterDate(String date, String dateFormat, String timezoneId) {
        DateFormat df = new SimpleDateFormat(dateFormat);
        Date targetDate = null;
        Date systemDate = null;

        // string is analyzed and changed.
        // 文字列を解析して変換
        try {
            targetDate = df.parse(date);
            
            // The system date changed into specified time zone
            // 指定されたタイムゾーンに変換したシステム日付
            Date d = DateUtil.convertTime(new Date(), timezoneId);
            // It changes into the date suitable for Date format.
            // 日付フォーマットに合った日付に変換
            systemDate = df.parse(df.format(d));
        } catch (Exception e) {
            return false;
        }

        // designated date < Date of record   In the case
        // 指定日 < 基準日 の場合
        if (targetDate.before(systemDate)) {
            return false;
        }

        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateAfterDateComp(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateAfterDateComp(String date, String dateFormat, String compCd) throws ApplicationException {
        // Acquisition of NEXUS Company Master
        // NEXUS会社原単位の取得
        TmNxsCompDomain tmNxsCompDomain = searchNxsComp(compCd);

        // In the case of 0 affair
        // 0件の場合
        if (tmNxsCompDomain == null) {
            return false;
        }

        String timezoneId = tmNxsCompDomain.getTimezoneId().trim();

        return validateAfterDate(date, dateFormat, timezoneId);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateCarrier(java.lang.String)
     */
    public boolean validateCarrier(String compCd) throws ApplicationException {

        // Acquisition of NEXUS Company Master
        // NEXUS会社原単位の取得
        TmNxsCompDomain tmNxsCompDomain = searchNxsComp(compCd);

        // 0 affair -- or --   Case where a Carrier Comp Flg is except "Y"
        // 0件 または 運送会社フラグが「Y」以外の場合
        if (tmNxsCompDomain == null
            || !FLAG_Y.equals(tmNxsCompDomain.getCarrierCompFlg())) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateCompCd(java.lang.String)
     */
    public boolean validateCompCd(String compCd) throws ApplicationException {

        // Acquisition of NEXUS Company Master
        // NEXUS会社原単位の取得
        TmNxsCompDomain tmNxsCompDomain = searchNxsComp(compCd);

        // In the case of 0 affair
        // 0件の場合
        if (tmNxsCompDomain == null) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateCompWh(java.lang.String, java.lang.String)
     */
    public boolean validateCompWh(String compCd, String whCd) throws ApplicationException {

        // Acquisition of a NEXUS Warehouse Master
        // 倉庫原単位の取得
        TmNxsWhCriteriaDomain tmNxsWhCriteriaDomain = new TmNxsWhCriteriaDomain();
        tmNxsWhCriteriaDomain.setCompCd(compCd);
        tmNxsWhCriteriaDomain.setWhCd(whCd);
        TmNxsWhDomain tmNxsWhDomain = tmNxsWhService.searchByKey(tmNxsWhCriteriaDomain);

        // In the case of 0 affair
        // 0件の場合
        if (tmNxsWhDomain == null) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateConsignee(java.lang.String)
     */
    public boolean validateConsignee(String compCd) throws ApplicationException {

        // Acquisition of NEXUS Company Master
        // NEXUS会社原単位の取得
        TmNxsCompDomain tmNxsCompDomain = searchNxsComp(compCd);

        // In the case of 0 affair
        // 0件の場合
        if (tmNxsCompDomain == null) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateCountry(java.lang.String)
     */
    public boolean validateCountry(String cntryCd) throws ApplicationException {

        // Acquisition of a Country Master
        // 国原単位の取得
        TmCntryCriteriaDomain tmCntryCriteriaDomain = new TmCntryCriteriaDomain();
        tmCntryCriteriaDomain.setCntryCd(cntryCd);
        TmCntryDomain tmCntryDomain = tmCntryService.searchByKey(tmCntryCriteriaDomain);

        // In the case of 0 affair
        // 0件の場合
        if (tmCntryDomain == null) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateCustomsBroker(java.lang.String)
     */
    public boolean validateCustomsBroker(String compCd) throws ApplicationException {

        // Acquisition of NEXUS Company Master
        // NEXUS会社原単位の取得
        TmNxsCompDomain tmNxsCompDomain = searchNxsComp(compCd);

        // 0 affair -- or --   Case where a CUSTOMS BROKER FLAG is except "Y"
        // 0件 または 通関代理店フラグが「Y」以外の場合
        if (tmNxsCompDomain == null
            || !FLAG_Y.equals(tmNxsCompDomain.getCustomsBrokerFlg())) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateFromToDate(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateFromToDate(String dateFormat, String fromDate, String toDate) {

        if (StringUtils.isEmpty(fromDate) || StringUtils.isEmpty(toDate)) {
            return false;
        }
        
        DateFormat df = new SimpleDateFormat(dateFormat);

        Date fromDateDate = null;
        Date toDateDate = null;

        // string is analyzed and changed.
        // 文字列を解析して変換
        try {
            fromDateDate = df.parse(fromDate);
            toDateDate = df.parse(toDate);
        } catch (Exception e) {
            return false;
        }

        // beginning date > End date   In the case
        // 開始日付 > 終了日付 の場合
        if (fromDateDate.after(toDateDate)) {
            return false;
        }

        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateFromToDate(java.lang.String, java.lang.String, java.util.Locale, java.lang.String)
     */
    public boolean validateFromToDate(String fromDate, String toDate, Locale locale,
        String formatKey) {
        
        // Acquisition of Resources Master
        // リソース原単位の取得
        String dateFormat = getResource(locale, formatKey);
        // When Resources Master is unacquirable
        // リソース原単位を取得できない場合
        if (CheckUtil.isBlankOrNull(dateFormat)) {
            throw new SystemException(NXS_E1_0002, formatKey);
        }

        return validateFromToDate(dateFormat, fromDate, toDate);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateNumber(java.lang.String, int, int)
     */
    public boolean validateNumber(String value, int precision, int scale) {

        BigDecimal num = null;
        try {
            num = new BigDecimal(value);
        } catch (Exception e) {
            return false;
        }

        // Digit number of integer part
        // 整数部の桁数
        int numPrecision = num.precision() - num.scale();
        if (numPrecision < 0) {
            numPrecision = 0;
        }
        // place after the decimal point
        // 小数点以下の桁数
        int numScale = num.scale();
        if (numScale < 0) {
            numScale = 0;
        }

        // When integer part, or a place after the decimal point does not correspond to conditions
        // 整数部または小数点以下の桁数が条件に該当しない場合
        if (numPrecision > precision || numScale > scale) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateOuterCd(java.lang.String, java.lang.String)
     */
    public boolean validateOuterCd(String ownerComp, String outerCd) throws ApplicationException {

        // Acquisition of packing combination master (header)
        // 包装組合せ原単位（ヘッダ）の取得
        TmPkgSetHdrCriteriaDomain tmPkgSetHdrCriteriaDomain = new TmPkgSetHdrCriteriaDomain();
        tmPkgSetHdrCriteriaDomain.setOwnerComp(ownerComp);
        tmPkgSetHdrCriteriaDomain.setOuterPkgCd(outerCd);
        TmPkgSetHdrDomain tmPkgSetHdrDomain
            = tmPkgSetHdrService.searchByKey(tmPkgSetHdrCriteriaDomain);

        // In the case of 0 affair
        // 0件の場合
        if (tmPkgSetHdrDomain == null) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validatePkgCd(java.lang.String, java.lang.String)
     */
    public boolean validatePkgCd(String pkgCd, String itemNoGrp) {

        // ITEM NO GROUP = Denso group
        // 品目番号グループ = デンソーグループ
        if (ITEM_NO_GRP_DG.equals(itemNoGrp)) {
            
            // In the cases of other than a blank
            // ブランク以外の場合
            if (!CheckUtil.isBlankOrNull(pkgCd)) {
                return false;
            }
            
        // ITEM NO GROUP = Denso
        // 品目番号グループ = デンソー
        } else if (ITEM_NO_GRP_D.equals(itemNoGrp)) {
            
            // When blank
            // ブランクの場合
            if (CheckUtil.isBlankOrNull(pkgCd)) {
                return false;
            }
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validatePort(java.lang.String, java.lang.String)
     */
    public boolean validatePort(String portCd, String cntryCd)
        throws ApplicationException {

        // Acquisition of a Port Master
        // 港原単位の取得
        TmPortCriteriaDomain tmPortCriteriaDomain = new TmPortCriteriaDomain();
        tmPortCriteriaDomain.setPortCd(portCd);
        tmPortCriteriaDomain.setCntryCd(cntryCd);
        TmPortDomain tmPortDomain = tmPortService.searchByKey(tmPortCriteriaDomain);

        // In the case of 0 affair
        // 0件の場合
        if (tmPortDomain == null) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateShipTo(java.lang.String)
     */
    public boolean validateShipTo(String shipTo) throws ApplicationException {

        // Acquisition of NEXUS Ship To Master
        // NEXUS送荷先原単位の取得
        TmNxsShipToCriteriaDomain tmNxsShipToCriteriaDomain = new TmNxsShipToCriteriaDomain();
        tmNxsShipToCriteriaDomain.setShipToCd(shipTo);
        TmNxsShipToDomain tmNxsShipToDomain
            = tmNxsShipToService.searchByKey(tmNxsShipToCriteriaDomain);

        // In the case of 0 affair
        // 0件の場合
        if (tmNxsShipToDomain == null) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateShipper(java.lang.String)
     */
    public boolean validateShipper(String compCd) throws ApplicationException {

        // Acquisition of NEXUS Company Master
        // NEXUS会社原単位の取得
        TmNxsCompDomain tmNxsCompDomain = searchNxsComp(compCd);

        // 0 affair -- or --   Case where a Shipper Flg is except "Y"
        // 0件 または 荷主フラグが「Y」以外の場合
        if (tmNxsCompDomain == null
            || !FLAG_Y.equals(tmNxsCompDomain.getShipperFlg())) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateShipperCustomerShipTo(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateShipperCustomerShipTo(String lgcyLibCompCd,
        String customerCd, String lgcyShipToCd) throws ApplicationException {

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

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#validateShipperWhPlant(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateShipperWhPlant(String lgcyLibCompCd,
        String lgcyWhCd, String plantCd) throws ApplicationException {

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

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchTimezone(java.lang.String)
     */
    public String searchTimezone(String compCd) throws ApplicationException {

        // Acquisition of NEXUS Company Master
        // NEXUS会社原単位の取得
        TmNxsCompDomain tmNxsCompDomain = searchNxsComp(compCd);

        // In the case of 0 affair
        // 0件の場合
        if (tmNxsCompDomain == null) {
            throw new SystemException(GSCM_E0_0001);
        }

        return tmNxsCompDomain.getTimezoneId();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchWeightUnit(java.lang.String)
     */
    public String searchWeightUnit(String compCd) throws ApplicationException {

        // Acquisition of NEXUS Company Master
        // NEXUS会社原単位の取得
        TmNxsCompDomain tmNxsCompDomain = searchNxsComp(compCd);

        // In the case of 0 affair
        // 0件の場合
        if (tmNxsCompDomain == null) {
            throw new SystemException(GSCM_E0_0001);
        }

        return tmNxsCompDomain.getWeightUnit();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchLengthUnit(java.lang.String)
     */
    public String searchLengthUnit(String compCd) throws ApplicationException {

        // Acquisition of NEXUS Company Master
        // NEXUS会社原単位の取得
        TmNxsCompDomain tmNxsCompDomain = searchNxsComp(compCd);

        // In the case of 0 affair
        // 0件の場合
        if (tmNxsCompDomain == null) {
            throw new SystemException(GSCM_E0_0001);
        }

        return tmNxsCompDomain.getLengthUnit();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchVolumeUnit(java.lang.String)
     */
    public String searchVolumeUnit(String compCd) throws ApplicationException {

        // Acquisition of NEXUS Company Master
        // NEXUS会社原単位の取得
        TmNxsCompDomain tmNxsCompDomain = searchNxsComp(compCd);

        // In the case of 0 affair
        // 0件の場合
        if (tmNxsCompDomain == null) {
            throw new SystemException(GSCM_E0_0001);
        }

        return tmNxsCompDomain.getVolumeUnit();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchMeasureUnit(java.lang.String)
     */
    public VtCompMeasureUnitDomain searchMeasureUnit(String compCd) throws ApplicationException {
        // Create of a search condition
        // 検索条件の作成
        VtCompMeasureUnitCriteriaDomain criteria = new VtCompMeasureUnitCriteriaDomain();
        criteria.setCompCd(compCd);
        
        // Acquisition of a measurement unit
        // 計量単位の取得
        List<VtCompMeasureUnitDomain> measureUnitList = vtCompMeasureUnitService.searchByCondition(criteria);
        
        // In the case of 0 affair
        // 0件の場合
        if (CollectionUtils.isEmpty(measureUnitList)) {
            throw new SystemException(GSCM_E0_0001);
        }
        
        return measureUnitList.get(0);
    }
    
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchMeasureUnitDisp(java.lang.String)
     */
    public String searchMeasureUnitDisp(String unitCd) throws ApplicationException {
        TmMeasureUnitCriteriaDomain criteria = new TmMeasureUnitCriteriaDomain();
        criteria.setUnitCd(unitCd);
        
        TmMeasureUnitDomain tmMeasureUnit =  tmMeasureUnitService.searchByKey(criteria);
        
        if (tmMeasureUnit == null) {
            throw new SystemException(GSCM_E0_0001);
        }
        
        return tmMeasureUnit.getUnitDisp();
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#printPdf(java.io.File, int, java.lang.String)
     */
    public void printPdf(File pdf, int copy, String printer) throws ApplicationException {
        // Get the script path to print a PDF file
        // 印刷コマンドの取得
        String printCmd = getResource(null, "print.cmd");
        
        if (printCmd == null) {
            throw new SystemException(NXS_91_0001);
        }
        
        InputStream stdout = null;
        BufferedReader br = null;
        try {
            // Build the print command
            // 印刷コマンドの作成
            ProcessBuilder pb = new ProcessBuilder(printCmd, pdf.getAbsolutePath(), copy + "", printer);
            pb.redirectErrorStream(true);
            
            // Start the print command
            // 印刷コマンドの実行
            Process process = pb.start();
            
            // Get the STDOUT
            // 標準出力の取得
            stdout = process.getInputStream();
            br = new BufferedReader(new InputStreamReader(stdout));
            
            // Write the STDOUT output to Logger
            // 標準出力の内容をログ出力
            String line = null;
            while ((line = br.readLine()) != null) {
                logger.debug(line);
            }
            
            // Wait for the print command
            // 印刷コマンドの終了待機
            process.waitFor();
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001, e);
        } catch (InterruptedException e) {
            throw new SystemException(NXS_91_0001, e);
        } finally {
            if (stdout != null) {
                try {
                    stdout.close();
                } catch (IOException e1) {
                    // No Action
                    // 処理なし
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e2) {
                    // No Action
                    // 処理なし
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#mergePdf(java.lang.String, java.io.File[])
     *
     * By opening and closing is that the processing of the file is in charge, there is no need to pass to open all the files in the consolidated.
     * File number of open upper limit of linux will require a minimum of open for the default 1024.
     * ファイルのオープン・クローズは本処理が担当することにより、連結対象のファイルを全てオープンして渡す必要はない。
     * linuxのファイルオープン数上限はデフォルト1024のため必要最小限のオープンとする。
     */
    //public File mergePdf(String name, InputStream... srcDocumentList) {
    public File mergePdf(String name, File... pdfFileList) { // UT304 MULTI LABEL MOD
        // output file
        // 出力ファイル
        File outputFile = null;
        FileOutputStream out = null;
        
        // Output destination change PDF document
        // 出力先PDFドキュメント
        Document document = null;
        PdfCopy copy = null;
         
        try {
            //for (InputStream srcDocument : srcDocumentList) {
            for (File pdfFile : pdfFileList) { // UT304 MULTI LABEL MOD
                if (pdfFile == null) { // NL023 ADD if
                    continue;
                }

                InputStream srcDocument = new FileInputStream(pdfFile);
                // PDF list of a together joining agency
                // 結合元のPDF帳票
                PdfReader reader = new PdfReader(new RandomAccessFileOrArray(srcDocument), null);
                reader.consolidateNamedDestinations();

                // A create of output file, and an output destination change PDF document
                // 出力ファイル、出力先PDFドキュメントの作成
                if (document == null) {
                    // A create of output file
                    // 出力ファイルの作成
                    outputFile = File.createTempFile(name, ".pdf");
                    out = new FileOutputStream(outputFile);

                    // A create of PDF document
                    // PDFドキュメントの作成
                    document = new Document(reader.getPageSizeWithRotation(1));
                    copy = new PdfCopy(document, out);
                    document.open();
                }

                // It copies to an output destination change PDF document.
                // 出力先PDFドキュメントにコピー
                int numberOfPages = reader.getNumberOfPages();
                for (int i = 1; i <= numberOfPages; i++ ) {
                    PdfImportedPage page = copy.getImportedPage(reader, i);
                    copy.addPage(page);
                }

                reader.close();
                srcDocument.close(); // UT304 MULTI LABEL ADD
            }
        } catch (IOException e) {
            throw new SystemException("AI-90-0000", e, e.getMessage() + "(" + name + ")");

        } catch (DocumentException e) {
            throw new SystemException("AI-90-0000", e, e.getMessage() + "(" + name + ")");

        } finally {
            if (document != null) {
                document.close();
            }
            if (copy != null) {
                copy.close();
            }
        }
        
        return outputFile;
    }

    // UT186 ZIP DOWNLOAD ADD
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchFileManagerReturnByZip(java.util.List)
     */
    public File searchFileManagerReturnByZip(List<String > fileIdList) {

        //
        // - data flow -
        // (LB_FILE_MANAGER > fileManagerOutputStream > zipInputStream)*N > zipOutputStream > zipFileOutputStream > temporaryZipFile
        //

        ByteArrayOutputStream fileManagerOutputStream = null;
        ByteArrayInputStream zipInputStream = null;
        ZipOutputStream zipOutputStream = null;

        try {
            File temporaryZipFile = File.createTempFile("ZIPTEMP", ".zip");
            OutputStream zipFileOutputStream = new FileOutputStream(temporaryZipFile);
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(zipFileOutputStream));

            for (String fileId : fileIdList) {
                fileManagerOutputStream = new ByteArrayOutputStream();
                FileManagementDomain fileManagementDomain
                    = fileManagerServiceForStream.searchFileDownload(fileId, true, fileManagerOutputStream);
                fileManagerOutputStream.flush();
                fileManagerOutputStream.close();

                ZipEntry zipEntry = new ZipEntry(fileManagementDomain.getFileName());
                zipOutputStream.putNextEntry(zipEntry);

                zipInputStream = new ByteArrayInputStream(fileManagerOutputStream.toByteArray());
                int length;
                byte[] buffer = new byte[1024];
                while ((length = zipInputStream.read(buffer)) != -1) {
                    zipOutputStream.write(buffer, 0, length);
                }
                zipInputStream.close();

                zipOutputStream.closeEntry();
            }
            zipOutputStream.flush();
            zipOutputStream.close();

            return temporaryZipFile;

        } catch (IOException e) {
            throw new SystemException("AI-90-0000", e, e.toString(), e.getMessage());

        } finally {
            if (fileManagerOutputStream != null) {
                try {
                    fileManagerOutputStream.close();
                } catch (Exception e) {}
            }
            if (zipInputStream != null) {
                try {
                    zipInputStream.close();
                } catch (Exception e) {}
            }
            if (zipOutputStream != null) {
                try {
                    zipOutputStream.close();
                } catch (Exception e) {}
            }
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchEffectivePrice(java.lang.String, java.lang.String, java.math.BigDecimal)
     */
    public BigDecimal searchEffectivePrice(String compCd, String currCd, BigDecimal price) 
        throws ApplicationException {

        // Acquisition of a NEXUS company former unit
        // NEXUS会社元単位の取得
        TmNxsCompDomain nxsComp = searchNxsComp(compCd);
        // Acquisition of a Currency Master
        // 通貨原単位の取得
        TmCurrencyDomain currency = searchCurrency(currCd);
        
        // Acquisition of operation pattern, and an EFFECTIVE DIGIT
        // 演算パターン、有効桁数の取得
        String roundPattern = nxsComp.getRoundPattern();
        int effectiveDigit = currency.getEffectiveDigit().intValue();
       
        // Calculation of an effective Amount
        // 有効金額の計算
        if (ROUND_PATTERN_ROUND_UP.equals(roundPattern)) {
            return price.setScale(effectiveDigit, BigDecimal.ROUND_UP);
        } else if (ROUND_PATTERN_ROUND_DOWN.equals(roundPattern)) {
            BigDecimal effectivePrice =  price.setScale(effectiveDigit, BigDecimal.ROUND_DOWN);
            if (BigDecimal.ZERO.setScale(effectiveDigit).equals(effectivePrice)) {
                effectivePrice = price.setScale(effectiveDigit, BigDecimal.ROUND_UP);
            }
            return effectivePrice;
        } else if (ROUND_PATTERN_ROUND_OFF.equals(roundPattern)) {
            BigDecimal effectivePrice =   price.setScale(effectiveDigit, BigDecimal.ROUND_HALF_UP);
            if (BigDecimal.ZERO.setScale(effectiveDigit).equals(effectivePrice)) {
                effectivePrice = price.setScale(effectiveDigit, BigDecimal.ROUND_UP);
            }
            return effectivePrice;
        } else {
            throw new SystemException(NXS_91_0001);
        }
    }

    /**
     * Get the NEXUS Company Master 
     * <br />NEXUS会社原単位を取得します。
     *
     * @param compCd - COMPANY CODE
     * @return NEXUS Company Master
     * @throws ApplicationException - If an error occurred during searching NEXUS Company Master
     */
    protected TmNxsCompDomain searchNxsComp(String compCd) throws ApplicationException {

        // Acquisition of NEXUS Company Master
        // NEXUS会社原単位の取得
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain.setCompCd(compCd);
        TmNxsCompDomain tmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);

        return tmNxsCompDomain;
    }

    /**
     * Convert unit (Common processing for WEIGHT UNIT, VOLUME UNIT and LENGTH UNIT)
     * <br />単位変換を行う。(重量単位、容積単位、長さ単位の共通処理)
     *
     * @param value - value to convert
     * @param fromUnitCd - Unit before conversion
     * @param toUnitCd - Unit after conversion
     * @param maxPrecision - The maximum number of digits of the integer part
     * @param maxScale - The maximum number of digits in the fractional part
     * @return - value after unit conversion (set null if value is null)
     * 
     * @throws ApplicationException - If Unit Of Measure Conversion Item Master can not be referenced
     */
    protected BigDecimal convertUnit(BigDecimal value, String fromUnitCd, String toUnitCd,
        Integer maxPrecision, Integer maxScale) throws ApplicationException {

        if (value == null) {
            throw new SystemException(NXS_91_0001);
        }

        BigDecimal convertedValue = null;
        
        if (fromUnitCd.equals(toUnitCd)) {
            convertedValue = value;
        } else {
            // Acquisition of a measurement unit conversion master (for decimals)
            // 計量単位換算原単位(小数用)の取得
            TmUomCnvDecCriteriaDomain tmUomCnvDecCriteriaDomain = new TmUomCnvDecCriteriaDomain();
            tmUomCnvDecCriteriaDomain.setUomCdConvSrc(fromUnitCd);
            tmUomCnvDecCriteriaDomain.setUomCdConvTrgt(toUnitCd);
            TmUomCnvDecDomain tmUomCnvDecDomain
                = tmUomCnvDecService.searchByKey(tmUomCnvDecCriteriaDomain);

            // When measurement unit conversion master (for decimals) is unacquirable
            // 計量単位換算原単位(小数用)を取得できない場合
            if (tmUomCnvDecDomain == null) {
                throw new SystemException(GSCM_E0_0001);
            }

            // A VALUE is changed applying conversion factor.
            // 換算係数をかけて値を変換
            convertedValue = value.multiply(tmUomCnvDecDomain.getUomCdConvFactor());
        }
        // place after the decimal point
        // 小数点以下の桁数
        int scale = convertedValue.scale();
        if (scale < 0) {
            scale = 0;
        }

        // This is upvaluation when fraction length is over the decimal fraction maximum digit number.
        // 小数部桁数が小数部最大桁数を超えている場合、切り上げ
        if (scale > maxScale) {
            convertedValue = convertedValue.setScale(maxScale, UP);
        }

        // Digit number of integer part
        // 整数部の桁数
        int precision = convertedValue.precision() - convertedValue.scale();
        if (precision < 0) {
            precision = 0;
        }

        // This is null when integer part digit number is over the integer part maximum digit number.
        // 整数部桁数が整数部最大桁数を超えている場合、null
        if (maxPrecision != null) { // ST959 UNIT CONVERSION ADD if
            if (precision > maxPrecision) {
                return null;
            }
        }

        return convertedValue;
    }

    /**
     * Return whether this is over the digit number as which integer part was specified.
     * <br />整数部が指定された桁数を超えているか返します。
     *
     * @param value VALUE<br />値
     * @param precision The maximum digit number of integer part<br />整数部の最大桁数
     * @return When integer part is carrying out overflow, this is true, and this is false except it.<br />整数部が桁溢れしている場合はtrue、それ以外はfalse
     */
    protected boolean isOverflow(BigDecimal value, int precision) {
        return value != null && precision < value.precision() - value.scale();
    }
    
    /**
     * Get the Currency Master from CURRENCY CODE specified 
     * <br />指定された通貨コードから通貨原単位を取得します。
     *
     * @param currCd - CURRENCY CODE
     * @return Currency Master
     * @throws ApplicationException - If the Currency Master can not be obtained
     */
    protected TmCurrencyDomain searchCurrency(String currCd) throws ApplicationException {
        TmCurrencyCriteriaDomain criteria = new TmCurrencyCriteriaDomain();
        criteria.setCurrCd(currCd);
        
        return tmCurrencyService.searchByKey(criteria);
    }

    // ST959 UNIT CONVERSION ADD START
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#convertWeightUnitNoOverflowCheck(java.math.BigDecimal, java.lang.String, java.lang.String)
     */
    public BigDecimal convertWeightUnitNoOverflowCheck(BigDecimal value,
        String fromUnitCd, String toUnitCd) throws ApplicationException {

        return convertUnit(value, fromUnitCd, toUnitCd, null, MAX_SCALE_WEIGHT_UNIT);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#convertVolumeUnitNoOverflowCheck(java.math.BigDecimal, java.lang.String, java.lang.String)
     */
    public BigDecimal convertVolumeUnitNoOverflowCheck(BigDecimal value,
        String fromUnitCd, String toUnitCd) throws ApplicationException {

        return convertUnit(value, fromUnitCd, toUnitCd, null, MAX_SCALE_VOLUME_UNIT);
    }
    // ST959 UNIT CONVERSION ADD END

    /**
     * {@inheritDoc}
     * 
     * L005 CHG
     * 
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#createRequestJobOverflowCheck(java.lang.String)
     */
    public String createRequestJob(String screenId) throws ApplicationException {
        return requestIdSeqService.getNextValue();
    }
}
