/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5062;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS2503;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_ERR_REPORT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM_JOB;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableDtlDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableDtlKanbanDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableHdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ProductivityDataInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2503ErrorReportDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2503KanbanListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2503MixTagListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2503PalletizeInstrHeaderDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2503ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtEisProductDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2503CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2503ItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2503PkgItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2503ProductivityDataInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2503XmlRootCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsBhtEisProductService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The implementation class of the Facade service to ECA0027_WS_2503
 * <br />ECA0027_WS_2503に対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: Ws2503CreateFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class Ws2503TransactFacadeServiceImpl extends AbstractTransactFacadeService<Ws2503ResultDomain, Ws2503CriteriaDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    private WsBhtEisProductService wsBhtEisProductService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2503TransactFacadeServiceImpl() {
    }

    /**
     * Setter method for wsBhtEisProductService.
     *
     * @param wsBhtEisProductService Set for wsBhtEisProductService
     */
    public void setWsBhtEisProductService(
        WsBhtEisProductService wsBhtEisProductService) {
        this.wsBhtEisProductService = wsBhtEisProductService;
    }

    /**
     * {@inheritDoc}
     *
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected Ws2503CriteriaDomain filterDomain(Ws2503CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     *
     * <pre>
     * - Common error checking
     *       "A screen item definition" is referred to for details.
     *
     * - 共通エラーチェック
     *     詳細は「画面項目定義」を参照
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected void validateItems(Ws2503CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        criteriaDomain.getXmlRoot().setLocale(criteriaDomain.getLocale());
        Validator<Ws2503XmlRootCriteriaDomain> valid
            = new Validator<Ws2503XmlRootCriteriaDomain>(criteriaDomain.getXmlRoot(), "criteriaDomain");

        // Single Item check
        // 単項目チェック
        String[] properties = {
            "shipperCd",
            "customerCd",
            "lgcyShipTo",
            "trnsCd"
        };

        // required check
        // 必須チェック
        valid.isValidateProperties(properties, WS_ID_WS2503);

        // digit number, an attribute, a form check
        // 桁数、属性、書式チェック
        // No Action
        // 処理なし

        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     *
     * <pre>

     * - W/H combination check
     *      Make nexusWhFlg of criteriaDomain, whCompCd, whCd, plntCd, and lgcyWhCd into an argument.
     *      This is a call about * {@link WsBhtEisProductService#validateConsistencyStock(String, String, String, String, String)}.
     * - ITEM-NO list combination check
     *       Make itemNoCriteriaList of criteriaDomain into an argument.
     *       This is a call about {@link WsBhtEisProductService#validateConsistencyItemListCstmr (java.util.List)}.
     * - Exterior sign setting check
     *       Make outerCd of criteriaDomain, and outerCdFlg into an argument.
     *       This is a call about * {@link WsBhtEisProductService#validateConsistencyOuterNumber(java.lang.String, java.lang.String)}.
     * - PACKAGE-ITEM-NO list combination check
     *       Make pkgItemNoCriteriaList of criteriaDomain into an argument.
     *       This is a call about {@link WsBhtEisProductService#validateConsistencyPkgMtrlItemList (java.util.List)}.
     * - Productivity data collection information setting check
     *       Make businessStartTime of criteriaDomain, businessEndTime, and productivityDataInfoCriteriaList into an argument.
     *       This is a call about * {@link WsBhtEisProductService#validateConsistencyPrdctData(java.lang.String, java.lang.String, java.util.List)}.

     * - 倉庫組み合わせチェック
     *     criteriaDomainのnexusWhFlg、whCompCd、whCd、plntCd、lgcyWhCdを引数にして
     *     {@link WsBhtEisProductService#validateConsistencyStock(String, String, String, String, String)}を呼出
     * - 品目番号リスト組み合わせチェック
     *     criteriaDomainのitemNoCriteriaListを引数にして
     *     {@link WsBhtEisProductService#validateConsistencyItemListCstmr(java.util.List)}を呼出
     * - 外装記号設定チェック
     *     criteriaDomainのouterCd、outerCdFlgを引数にして
     *     {@link WsBhtEisProductService#validateConsistencyOuterNumber(java.lang.String, java.lang.String)}を呼出
     * - 包装材品目番号リスト組み合わせチェック
     *     criteriaDomainのpkgItemNoCriteriaListを引数にして
     *     {@link WsBhtEisProductService#validateConsistencyPkgMtrlItemList(java.util.List)}を呼出
     * - 生産性データ収集情報設定チェック
     *     criteriaDomainのbusinessStartTime、businessEndTime、productivityDataInfoCriteriaListを引数にして
     *     {@link WsBhtEisProductService#validateConsistencyPrdctData(java.lang.String, java.lang.String, java.util.List)}を呼出
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected void validateConsistency(Ws2503CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        // Parameter acquisition
        // パラメータ取得
        String nexusWhFlg = criteriaDomain.getXmlRoot().getNexusWhFlg();
        String whCompCd = criteriaDomain.getXmlRoot().getWhCompCd();
        String whCd = criteriaDomain.getXmlRoot().getWhCd();
        String plntCd = criteriaDomain.getXmlRoot().getPlntCd();
        String lgcyWhCd = criteriaDomain.getXmlRoot().getLgcyWhCd();

        List<? extends Ws2503ItemNoCriteriaDomain> itemNoCriteriaList =  criteriaDomain.getXmlRoot().getItemNoCriteriaList();

        String outerCd = criteriaDomain.getXmlRoot().getOuterCd();
        String outerCdFlg = criteriaDomain.getXmlRoot().getOuterCdFlg();

        List<? extends Ws2503PkgItemNoCriteriaDomain> pkgItemNoCriteriaList = criteriaDomain.getXmlRoot().getPkgItemNoCriteriaList();

        String businessStartTime = criteriaDomain.getXmlRoot().getWorkTimeStrt();
        String businessEndTime = criteriaDomain.getXmlRoot().getWorkTimeEnd();
        List<? extends Ws2503ProductivityDataInfoCriteriaDomain> productivityDataInfoCriteriaList = criteriaDomain.getXmlRoot().getProductivityDataInfoCriteriaList();

        // W/H combination check
        // 倉庫組み合わせチェック
        if (!wsBhtEisProductService.validateConsistencyStock(nexusWhFlg, whCompCd, whCd, plntCd, lgcyWhCd)){
            MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }

        // ITEM-NO list combination check
        // 品目番号リスト組み合わせチェック
        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();
        for (Ws2503ItemNoCriteriaDomain itemNoCriteria : itemNoCriteriaList){
            Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
            CommonUtil.copyPropertiesDomainToDomain(itemNo, itemNoCriteria);
            itemNoList.add(itemNo);
        }
        if (!wsBhtEisProductService.validateConsistencyItemListCstmr(itemNoList)){
            MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }

        // Exterior sign setting check
        // 外装記号設定チェック
        if (!wsBhtEisProductService.validateConsistencyOuterNumber(outerCd, outerCdFlg)){
            MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }

        // PACKAGE-ITEM-NO list combination check
        // 包装材品目番号リスト組み合わせチェック
        List<Ws2501PkgItemNoDomain> pkgItemNoList = new ArrayList<Ws2501PkgItemNoDomain>();
        for (Ws2503PkgItemNoCriteriaDomain pkgItemNoCriteria : pkgItemNoCriteriaList){
            Ws2501PkgItemNoDomain pkgItemNo = new Ws2501PkgItemNoDomain();
            CommonUtil.copyPropertiesDomainToDomain(pkgItemNo, pkgItemNoCriteria);
            pkgItemNoList.add(pkgItemNo);
        }
        if (!wsBhtEisProductService.validateConsistencyPkgMtrlItemList(pkgItemNoList)){
            MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }

        // Productivity data collection information setting check
        // 生産性データ収集情報設定チェック
        List<Ws2501ProductivityDataInfoDomain> productivityDataInfoList = new ArrayList<Ws2501ProductivityDataInfoDomain>();
        for (Ws2503ProductivityDataInfoCriteriaDomain productivityDataInfoCriteria : productivityDataInfoCriteriaList){
            Ws2501ProductivityDataInfoDomain ProductivityDataInfo = new Ws2501ProductivityDataInfoDomain();
            CommonUtil.copyPropertiesDomainToDomain(ProductivityDataInfo, productivityDataInfoCriteria);
            productivityDataInfoList.add(ProductivityDataInfo);
        }
        if (!wsBhtEisProductService.validateConsistencyPrdctData(businessStartTime, businessEndTime, productivityDataInfoList)){
            MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <pre>
     *  A check among - CIGMA night batch
     *       shipperCd of criteriaDomain is made into an argument,
     *       This is a call about {@link WsBhtEisProductService#validateDatabaseCigmaNightBatchRunning(String)}.
     * - Exterior sign existence check
     *       Make null, outerCd of criteriaDomain, shipperCd, and trnsCd into an argument.
     *       This is a call about {@link WsBhtEisProductService#validateDatabaseTmPkgSetDtlOnNonInstrPltz(String, String, String[], String[], TmPkgSetHdrDomain)}.
     * - Dummy Packing-material existence check
     *       Make shipperCd of criteriaDomain, and pkgItemNoCriteriaList into an argument.
     * This is a call about * {@link WsBhtEisProductService#validateDatabaseTmPkgMaterialsOnNonInstrPltz(String[], List, List)}.
     * - Packing specification existence check
     *       Make shipperCd of criteriaDomain, itemNoCriteriaList, and trnsCd into an argument.
     * This is a call about * {@link WsBhtEisProductService#validateDatabaseTmPkgSpecificationDtOnNonInstrPltz(String[], List, String[], Ws2501PkgSpecDomain)}.
     * - A company and W/H combination check
     *     - Shipper, Customer, and Ship to Combination check
     *         Make shipperCd of criteriaDomain, customerCd, and shipToCd into an argument.
     * This is a call about * {@link WsBhtEisProductService#validateDatabaseTmCigmaShipToXrefOnNonInstrPltz(String, String, String, String[])}.
     *     - Consignee existence check
     *         Make shipperCd of criteriaDomain, and customerCd into an argument.
     * This is a call about * {@link WsBhtEisProductService#validateDatabaseTmCigmaCustomerXrefOnNonInstrPltz(String, String, String[])}.
     *     - Shipper, W/H, and Plant Combination check
     *         Make shipperCd of criteriaDomain, lgcyWhCd, and plntCd into an argument.
     * This is a call about * {@link WsBhtEisProductService#validateDatabaseTmCigmaWhXrefOnNonInstrPltz(String, String, String, String[], String[])}.
     *     - W/H Company and NEXUS W/H Combination check
     *         Make whCompCd of criteriaDomain, whCd, and shipperCd into an argument.
     * This is a call about * {@link WsBhtEisProductService#validateDatabaseTmNxsWhOnNonInstrPltz(String, String, String, String[])}.
     *     - Check of a company and a W/H combination checked result
     *       The contents of - CML-Error-Report-Header registration
     *       This is a call about {@link WsBhtEisProductService#validateDatabaseTtCmlErrorHeaderOnNonInstrPltz(String, WsBhtEisProductCriteriaDomain, List)}.
     *
     * - CIGMA夜間バッチ中チェック
     *     criteriaDomainのshipperCdを引数にして、
     *     {@link WsBhtEisProductService#validateDatabaseCigmaNightBatchRunning(String)}を呼出
     * - 外装記号存在チェック
     *     null、criteriaDomainのouterCd、shipperCd、trnsCdを引数にして
     *     {@link WsBhtEisProductService#validateDatabaseTmPkgSetDtlOnNonInstrPltz(String, String, String[], String[], TmPkgSetHdrDomain)}を呼出
     * - ダミー包装材存在チェック
     *     criteriaDomainのshipperCd、pkgItemNoCriteriaListを引数にして
     *     {@link WsBhtEisProductService#validateDatabaseTmPkgMaterialsOnNonInstrPltz(String[], List, List)}を呼出
     * - 包装仕様存在チェック
     *     criteriaDomainのshipperCd、 itemNoCriteriaList、 trnsCdを引数にして
     *     {@link WsBhtEisProductService#validateDatabaseTmPkgSpecificationDtOnNonInstrPltz(String[], List, String[], Ws2501PkgSpecDomain)}を呼出
     * - 会社・倉庫組み合わせチェック
     *   - Shipper、Customer、Ship to　組み合わせチェック
     *       criteriaDomainのshipperCd、 customerCd、 shipToCdを引数にして
     *       {@link WsBhtEisProductService#validateDatabaseTmCigmaShipToXrefOnNonInstrPltz(String, String, String, String[])}を呼出
     *   - 荷受人存在チェック
     *       criteriaDomainのshipperCd、 customerCdを引数にして
     *       {@link WsBhtEisProductService#validateDatabaseTmCigmaCustomerXrefOnNonInstrPltz(String, String, String[])}を呼出
     *   - Shipper、W/H、Plant　組み合わせチェック
     *       criteriaDomainのshipperCd, lgcyWhCd, plntCdを引数にして
     *       {@link WsBhtEisProductService#validateDatabaseTmCigmaWhXrefOnNonInstrPltz(String, String, String, String[], String[])}を呼出
     *   - W/H Company、NEXUS W/H　組み合わせチェック
     *       criteriaDomainのwhCompCd, whCd, shipperCdを引数にして
     *       {@link WsBhtEisProductService#validateDatabaseTmNxsWhOnNonInstrPltz(String, String, String, String[])}を呼出
     *   - 会社・倉庫組み合わせチェック結果の確認
     *     - CMLエラーレポートヘッダ登録内容
     *         {@link WsBhtEisProductService#validateDatabaseTtCmlErrorHeaderOnNonInstrPltz(String, WsBhtEisProductCriteriaDomain, List)}を呼出
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected void validateDatabase(Ws2503CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        // Parameter generation
        // パラメータ生成
        String[] shipperCd = {criteriaDomain.getXmlRoot().getShipperCd()};
        String[] trnsCd  = {criteriaDomain.getXmlRoot().getTrnsCd()};
        
        String customerCd = criteriaDomain.getXmlRoot().getCustomerCd();
        String lgcyShipTo = criteriaDomain.getXmlRoot().getLgcyShipTo();
        String outerCd = criteriaDomain.getXmlRoot().getOuterCd();
        String lgcyWhCd = criteriaDomain.getXmlRoot().getLgcyWhCd();
        String plntCd = criteriaDomain.getXmlRoot().getPlntCd();
        String whCompCd = criteriaDomain.getXmlRoot().getWhCompCd();
        String whCd = criteriaDomain.getXmlRoot().getWhCd();
        String nexusWhFlg = criteriaDomain.getXmlRoot().getNexusWhFlg();
        String palletNo = criteriaDomain.getXmlRoot().getPalletNo();

        TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        String[] shipToCd = new String[1];
        String[] consigneeCompCd = new String[1];
        String[] nexusWhCompCd = new String[1];
        String[] nexusWhCd = new String[1];
        String[] legacyWhCompCd = new String[1];

        List<String> pkgItemNoList = new ArrayList<String>();
        for (Ws2503PkgItemNoCriteriaDomain pkgItemNoCriteria : criteriaDomain.getXmlRoot().getPkgItemNoCriteriaList()){
            String pkgItemNo = new String();
            pkgItemNo = pkgItemNoCriteria.getPkgItemNo();
            pkgItemNoList.add(pkgItemNo);
        }

        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();
        for (Ws2503ItemNoCriteriaDomain itemNoCriteria : criteriaDomain.getXmlRoot().getItemNoCriteriaList()){
            Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
            CommonUtil.copyPropertiesDomainToDomain(itemNo, itemNoCriteria);
            itemNoList.add(itemNo);
        }
        
        // Existing check for user info
        // ユーザ情報存在チェック
        if (!wsBhtEisProductService.validateDatabaseVmUserInfo(criteriaDomain.getLoginUserDscId())) {
            Object[] params = {criteriaDomain.getLoginUserDscId()};
            MessageDomain msg = new MessageDomain("", NXS_E1_5031, params);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }

        // CIGMA night batch running check
        // CIGMA夜間バッチ中チェック
        if (!wsBhtEisProductService.validateDatabaseCigmaNightBatchRunning(shipperCd[0])) {
            MessageDomain msg = new MessageDomain("", NXS_E1_5062, null);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }

        // Exterior sign existence check
        // 外装記号存在チェック
        String errCd = wsBhtEisProductService.validateDatabaseTmPkgSetDtlOnNonInstrPltz(null, outerCd, shipperCd, trnsCd, tmPkgSetHdr);
        if (errCd != null) {
            Object[] params = {
                outerCd
            };
            MessageDomain msg = new MessageDomain("", errCd, params);
            errorList.add(msg);
        }

        // Dummy Packing-material existence check
        // ダミー包装材存在チェック
        List<String> pkgItemNoErrList = new ArrayList<String>();
        if (!wsBhtEisProductService.validateDatabaseTmPkgMaterialsOnNonInstrPltz(shipperCd, pkgItemNoList, pkgItemNoErrList)){
            for (String PkgItemNoErrItem : pkgItemNoErrList){
                Object[] params = {
                    PkgItemNoErrItem
                };
                MessageDomain msg = new MessageDomain("", NXS_E1_5009, params);
                errorList.add(msg);
            }
        }

        // Packing specification existence check
        // 包装仕様存在チェック
        Map<String, List<String>> errMap = new HashMap<String, List<String>>();

        Ws2501PkgSpecDomain singlePkgSpec = new Ws2501PkgSpecDomain();

        errMap = wsBhtEisProductService.validateDatabaseTmPkgSpecificationDtOnNonInstrPltz(shipperCd, itemNoList, trnsCd, singlePkgSpec);
        if (!errMap.isEmpty()){
            for (String errCdKey : errMap.keySet()){
                for (String errItemNo : errMap.get(errCdKey)){
                    Object[] params = {
                        errItemNo
                    };
                    MessageDomain msg = new MessageDomain("", errCdKey, params);
                    errorList.add(msg);
                }
            }
        }
        
        // Pallet/Carton type existence check
        // パレット/カートン区分存在チェック
        // UT420
        String pcErrCd = wsBhtEisProductService.validateDatabasePalletCartonTyp(criteriaDomain.getLocale().getLanguage(), palletNo);
        if (pcErrCd != null) {
            MessageDomain msg = new MessageDomain("", pcErrCd, null);
            errorList.add(msg);
        }

        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }

        // company, and a W/H combination check
        // 会社・倉庫組み合わせチェック
        List<String> errChkList = new ArrayList<String>();

        //   Shipper, Customer, Ship to combination check
        //   Shipper、Customer、Ship to　組み合わせチェック
        if (!wsBhtEisProductService.validateDatabaseTmCigmaShipToXrefOnNonInstrPltz(shipperCd[0].toString(), customerCd, lgcyShipTo, shipToCd)){
            errChkList.add("CHK_RESULT_A");
        }

        //   Consignee existence check
        //   荷受人存在チェック
        if (!wsBhtEisProductService.validateDatabaseTmCigmaCustomerXrefOnNonInstrPltz(shipperCd[0].toString(), customerCd, consigneeCompCd)){
            errChkList.add("CHK_RESULT_B");
        }

        //   Shipper, W/H, and Plant Combination check
        //   Shipper、W/H、Plant　組み合わせチェック
        if (FLAG_N.equals(nexusWhFlg)) {
            if (!wsBhtEisProductService.validateDatabaseTmCigmaWhXrefOnNonInstrPltz(shipperCd[0].toString(), lgcyWhCd, plntCd, nexusWhCompCd, nexusWhCd)){
                errChkList.add("CHK_RESULT_C");
            }
        }

        //    W/H Company, NEXUS W/H combination check
        //    W/H Company、NEXUS W/H　組み合わせチェック
        if (FLAG_Y.equals(nexusWhFlg)) {
            if (!wsBhtEisProductService.validateDatabaseTmNxsWhOnNonInstrPltz(whCompCd, whCd, shipperCd[0].toString(), legacyWhCompCd)){
                errChkList.add("CHK_RESULT_D");
            }
        }

        //  The check of  company, and a W/H combination checked result
        //   会社・倉庫組み合わせチェック結果の確認
        if (!errChkList.isEmpty()){
            // CML-Error-Report-Header registration
            // CMLエラーレポートヘッダ登録
            WsBhtEisProductCriteriaDomain wsBhtEisProductCriteria = new WsBhtEisProductCriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(wsBhtEisProductCriteria, criteriaDomain.getXmlRoot());
            wsBhtEisProductCriteria.setLoginUserDscId(criteriaDomain.getLoginUserDscId());

            Timestamp errCreateTimestamp = wsBhtEisProductService.validateDatabaseTtCmlErrorHeaderOnNonInstrPltz(criteriaDomain.getScreenId(), wsBhtEisProductCriteria, errChkList);
            criteriaDomain.setErrCreateTimestamp(errCreateTimestamp.toString());
        }

        // The delivery item setting to call Service
        // call Serviceへの受け渡し項目設定
        criteriaDomain.setWkShipToCd(shipToCd[0]);
        criteriaDomain.setWkLgcyWhCd(legacyWhCompCd[0]);
        criteriaDomain.setWkWhCompCd(nexusWhCompCd[0]);
        criteriaDomain.setWkWhCd(nexusWhCd[0]);
        criteriaDomain.setWkConsigneeCompCd(consigneeCompCd[0]);

        criteriaDomain.setVolumeUnit(tmPkgSetHdr.getVolumeUnit());
        criteriaDomain.setVolume(tmPkgSetHdr.getVolume());

        criteriaDomain.setLengthUnit(tmPkgSetHdr.getLengthUnit());
        criteriaDomain.setLength(tmPkgSetHdr.getLength());
        criteriaDomain.setWidth(tmPkgSetHdr.getWidth());
        criteriaDomain.setHeight(tmPkgSetHdr.getHeight());

        criteriaDomain.setVolumeUnitPalletize(singlePkgSpec.getVolumeUnit());
        criteriaDomain.setVolumePalletize(singlePkgSpec.getVolumePalletize());

        criteriaDomain.setLengthUnitPalletize(singlePkgSpec.getLengthUnit());
        criteriaDomain.setLengthPalletize(singlePkgSpec.getLengthPalletize());
        criteriaDomain.setWidthPalletize(singlePkgSpec.getWidthPalletize());
        criteriaDomain.setHeightPalletize(singlePkgSpec.getHeightPalletize());
        
    }

    /**
     * {@inheritDoc}
     *
     * <pre>
     *
     * - Setting of an internal variable (header)
     * - Setting of an internal variable (details)
     * - Acquisition of an ITEM-NO information (NEXUS side information)
     * - Acquisition of an ITEM-NO information (CIGMA side information)
     * - Acquisition of  MIXE thing vote information
     * - Setting of an internal variable (MIX ITEM NO)
     * - Acquisition of  Main Mark
     * - Firm-order-receipt alloc processing
     * - Registration of  Palletize Item Receive Order (this is copy registration of an alloc finishing order received to a MIX tag)
     * - Register - Palletize-Item data (ITEM NO).
     * - Register - Palletize-Item data (packing).
     * - Register - Palletize-Item-KANBAN data.
     * - Palletize data is registered.
     * - Mix-Tag information update processing
     * - A Temp Stock is updated and registered.
     * - Registration of an ordering alloc track record (starting of Web service)
     * - Register - BHT productivity data information.
     *
     * - 内部変数（ヘッダ）の設定
     * - 内部変数（明細）の設定
     * - 品目番号情報の取得（NEXUS側情報）
     * - 品目番号情報の取得（CIGMA側情報)
     * - MIXE現品票情報の取得
     * - 内部変数（MIX品目番号）の設定
     * - Main Markの取得
     * - 確定受注引当処理
     * - パレタイズ対象品受注情報の登録(MIXタグに引当済み受注のコピー登録)
     * - パレタイズ対象品データ（品目番号）を登録する
     * - パレタイズ対象品データ（包装）を登録する
     * - パレタイズ対象品かんばん情報データを登録する
     * - パレタイズデータを登録する
     * - MIXED現品票情報更新処理
     * - 仮在庫を更新・登録する
     * - 受注引当実績の登録（Webサービスの起動）
     * - BHT生産性データ情報を登録する。
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected Ws2503ResultDomain callServices(Ws2503CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        if (!CheckUtil.isBlankOrNull(criteriaDomain.getErrCreateTimestamp())) {
            return convertEisToResult(WS_RESULT_ERROR_ERR_REPORT_OUT, null, criteriaDomain.getErrCreateTimestamp());
        }

        // An Eis Product search-condition domain is created from the parameter domain of ECA0027_WS_2503.
        // ECA0027_WS_2503のパラメータドメインよりEis Product検索条件ドメインを作成
        WsBhtEisProductCriteriaDomain criteria = copyCriteriaDomainToCriteria(criteriaDomain);

        // Execution of disposal of business affairs
        // 業務処理の実行
        WsBhtEisProductDomain wsBhtEisProduct = wsBhtEisProductService.transactOnNonInstPltz(criteria);

        // Error judging
        // エラー判定
        String resultCd = wsBhtEisProduct.getResultCd();
        if (WS_RESULT_ERROR.compareTo(resultCd) == 0
            || WS_RESULT_ERROR_ERR_REPORT_OUT.compareTo(resultCd) == 0
            || WS_RESULT_ERROR_SYSTEM_JOB.compareTo(resultCd) == 0) {
            Ws2503ResultDomain result = convertEisToResult(resultCd, wsBhtEisProduct.getErrMap(), wsBhtEisProduct.getErrCreateTimestamp());
            return result;
        }

        // The result of ECA0027_WS_2503 is a domain from a Eis Product domain.
        // Eis ProductドメインよりECA0027_WS_2503の結果ドメイン
        Ws2503ResultDomain result = convertEisToResult(wsBhtEisProduct);
        return result;
    }

    /**
     *
     * Create an Eis Product search-condition domain from the parameter domain of ECA0027_WS_2503.
     * <br />ECA0027_WS_2503のパラメータドメインよりEis Product検索条件ドメインを作成します。
     *
     * @param criteriaDomain The parameter domain of ECA0027_WS_2503<br />ECA0027_WS_2503のパラメータドメイン
     * @return Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     */
    protected WsBhtEisProductCriteriaDomain copyCriteriaDomainToCriteria(Ws2503CriteriaDomain criteriaDomain) {

        // Generation of input parameter domain
        // 入力パラメータドメインの生成
        Ws2503XmlRootCriteriaDomain xmlRootCriteriaDomain = criteriaDomain.getXmlRoot();

        // A setting of a criteria domain
        // criteriaドメインの設定
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain);

        // copy from Ws2503XmlRootCriteriaDomain to WsBhtEisProductCriteriaDomain
        String shipperCd = xmlRootCriteriaDomain.getShipperCd();
        String customerCd = xmlRootCriteriaDomain.getCustomerCd();
        String lgcyShipTo = xmlRootCriteriaDomain.getLgcyShipTo();
        String outerCd = xmlRootCriteriaDomain.getOuterCd();
        String outerCdFlg = xmlRootCriteriaDomain.getOuterCdFlg();
        String lgcyWhCd = xmlRootCriteriaDomain.getLgcyWhCd();
        String plntCd = xmlRootCriteriaDomain.getPlntCd();
        String whCompCd = xmlRootCriteriaDomain.getWhCompCd();
        String whCd = xmlRootCriteriaDomain.getWhCd();
        String trnsCd = xmlRootCriteriaDomain.getTrnsCd();
        String palletNo = xmlRootCriteriaDomain.getPalletNo();
        String nexusWhFlg = xmlRootCriteriaDomain.getNexusWhFlg();
        String workTimeEnd = xmlRootCriteriaDomain.getWorkTimeEnd();
        String workTimeStrt = xmlRootCriteriaDomain.getWorkTimeStrt();

        criteria.setShipperCd(shipperCd);
        criteria.setCustomerCd(customerCd);
        criteria.setLgcyShipTo(lgcyShipTo);
        criteria.setTrnsCd(trnsCd);
        criteria.setPalletNo(palletNo);
        criteria.setOuterCd(outerCd);
        criteria.setNexusWhFlg(nexusWhFlg);
        criteria.setPlntCd(plntCd);
        criteria.setOuterCd(outerCd);
        criteria.setOuterCdFlg(outerCdFlg);
        criteria.setLgcyWhCd(lgcyWhCd);
        criteria.setWhCompCd(whCompCd);
        criteria.setWhCd(whCd);
        criteria.setWhCompCd(whCompCd);
        criteria.setWorkTimeEnd(workTimeEnd);
        criteria.setWorkTimeStrt(workTimeStrt);

        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();
        for (Ws2503ItemNoCriteriaDomain itemNoCriteriaDomain : xmlRootCriteriaDomain.getItemNoCriteriaList()){
            Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
            CommonUtil.copyPropertiesDomainToDomain(itemNo, itemNoCriteriaDomain);
            itemNoList.add(itemNo);
        }
        criteria.setWs2503ItemNoList(itemNoList);

        List<Ws2501PkgItemNoDomain> pkgItemNoList = new ArrayList<Ws2501PkgItemNoDomain>();
        for (Ws2503PkgItemNoCriteriaDomain pkgItemNoCriteriaDomain : xmlRootCriteriaDomain.getPkgItemNoCriteriaList()){
            Ws2501PkgItemNoDomain pkgItemNo = new Ws2501PkgItemNoDomain();
            CommonUtil.copyPropertiesDomainToDomain(pkgItemNo, pkgItemNoCriteriaDomain);
            pkgItemNoList.add(pkgItemNo);
        }
        criteria.setWs2503PkgItemNoList(pkgItemNoList);

        List<Ws2501ProductivityDataInfoDomain> productivityDataInfoList = new ArrayList<Ws2501ProductivityDataInfoDomain>();
        for (Ws2503ProductivityDataInfoCriteriaDomain productivityDataInfoCriteriaDomain
            : xmlRootCriteriaDomain.getProductivityDataInfoCriteriaList()){

            Ws2501ProductivityDataInfoDomain productivityDataInfo = new Ws2501ProductivityDataInfoDomain();
            CommonUtil.copyPropertiesDomainToDomain(productivityDataInfo, productivityDataInfoCriteriaDomain);
            productivityDataInfoList.add(productivityDataInfo);

        }
        criteria.setWs2503ProductivityDataInfoList(productivityDataInfoList);

        // Copy shipToCd, lgcyWhCd, whCompCd, whCd, consigneeCompCd from validateDatabase Check Results.
        criteria.setWkShipToCd(criteriaDomain.getWkShipToCd());
        criteria.setWkLgcyWhCd(criteriaDomain.getWkLgcyWhCd());
        criteria.setWkWhCompCd(criteriaDomain.getWkWhCompCd());
        criteria.setWkWhCd(criteriaDomain.getWkWhCd());
        criteria.setWkConsigneeCompCd(criteriaDomain.getWkConsigneeCompCd());

        // Copy volume, volume unit, lenght, height, width and lenght unit for palletize from validateDatabase Check Results.
        criteria.setVolumeUnit(criteriaDomain.getVolumeUnit());
        criteria.setVolume(criteriaDomain.getVolume());
        criteria.setLengthUnit(criteriaDomain.getLengthUnit());
        criteria.setLength(criteriaDomain.getLength());
        criteria.setWidth(criteriaDomain.getWidth());
        criteria.setHeight(criteriaDomain.getHeight());
        criteria.setVolumeUnitPalletize(criteriaDomain.getVolumeUnitPalletize());
        criteria.setVolumePalletize(criteriaDomain.getVolumePalletize());
        criteria.setLengthUnitPalletize(criteriaDomain.getLengthUnitPalletize());
        criteria.setLengthPalletize(criteriaDomain.getLengthPalletize());
        criteria.setWidthPalletize(criteriaDomain.getWidthPalletize());
        criteria.setHeightPalletize(criteriaDomain.getHeightPalletize());

        return criteria;
    }

    /**
     *
     * The result of ECA0027_WS_2503 creates a domain from an Eis Product domain.
     *(For normal)
     * <br />Eis ProductドメインよりECA0027_WS_2503の結果ドメインを作成します。(正常用)
     *
     * @param wsBhtEisProduct Eis Product domain<br /> Eis Productドメイン
     * @return The result of ECA0027_WS_2503 is a domain<br />ECA0027_WS_2503の結果ドメイン
     */
    protected Ws2503ResultDomain convertEisToResult(WsBhtEisProductDomain wsBhtEisProduct){

        // Internal variable (header) acquisition
        // 内部変数（ヘッダ）取得
        Ws2501InternalVariableHdrDomain internalVariableHdr = wsBhtEisProduct.getWs2503InternalVariableHdrDomain();

        // The KANBAN list item result domain of ECA0027_WS_2503
        // ECA0027_WS_2503のかんばんリスト項目結果ドメイン
        List<Ws2503KanbanListItemDomain> kanbanList = new ArrayList<Ws2503KanbanListItemDomain>();

        // The MIX tag list item result domain of  ECA0027_WS_2503
        // ECA0027_WS_2503のMIXタグリスト項目結果ドメイン
        List<Ws2503MixTagListItemDomain> mixTagList = new ArrayList<Ws2503MixTagListItemDomain>();

        for (Ws2501InternalVariableDtlDomain internalVariableDtl : wsBhtEisProduct.getWs2503InternalVariableDtlDomainList()){
            String mixTagFlg = internalVariableDtl.getMixTagFlg();

            if (FLAG_N.compareTo(mixTagFlg) == 0){
                for (Ws2501InternalVariableDtlKanbanDomain internalVariableDtlKanban : internalVariableDtl.getInternalVariableDtlKanbanDomainList()){

                    // KANBAN list setting
                    // かんばんリスト設定
                    Ws2503KanbanListItemDomain kanbanListItem = new Ws2503KanbanListItemDomain();
                    kanbanListItem.setPltzItemNo(internalVariableDtl.getItemNo());
                    kanbanListItem.setPkgCd(internalVariableDtl.getPkgCd());
                    kanbanListItem.setExpIndusTypCd(internalVariableDtlKanban.getExpIndusTypCd());
                    kanbanListItem.setExpKanbanTyp(internalVariableDtlKanban.getExpKanbanTyp());
                    kanbanListItem.setExpRegulateNo(internalVariableDtlKanban.getTagSeqNo().toString());
                    kanbanList.add(kanbanListItem);
                }
            } else {

                // MixTag list setting
                // MixTagリスト設定
                Ws2503MixTagListItemDomain mixTagListItem = new Ws2503MixTagListItemDomain();
                mixTagListItem.setMixTagNo(internalVariableDtl.getItemNo());
                mixTagList.add(mixTagListItem);
            }
        }

        // The Packaging Instruction (=Pull) header result domain of ECA0027_WS_2503
        // ECA0027_WS_2503の梱包指示ヘッダ結果ドメイン
        Ws2503PalletizeInstrHeaderDomain palletizeInstrHeader = new Ws2503PalletizeInstrHeaderDomain();
        palletizeInstrHeader.setMainMark(wsBhtEisProduct.getMainMark());
        palletizeInstrHeader.setPalletNo(internalVariableHdr.getPalletNo());
        palletizeInstrHeader.setKanbanList(kanbanList);
        palletizeInstrHeader.setMixTagList(mixTagList);
        palletizeInstrHeader.setCmlPrintNum(internalVariableHdr.getCmlPrintNum());

        // Result domain
        // 結果ドメイン
        Ws2503ResultDomain resultDomain = new Ws2503ResultDomain(WS_RESULT_SUCCESS);
        resultDomain.setPalletizeHeader(palletizeInstrHeader);

        return resultDomain;
    }

    /**
     * The result of ECA0027_WS_2503 creates a domain. (For unusual)
     * <br />ECA0027_WS_2503の結果ドメインを作成します。(異常用)
     *
     * @param resultCode Result CD<br />結果コード
     * @param errMap Error map<br />エラーマップ
     * @param errCreateTimestamp Error report time stamp<br />エラーレポートタイムスタンプ
     * @return The result of ECA0027_WS_2503 is a domain.<br />ECA0027_WS_2503の結果ドメイン
     */
    protected Ws2503ResultDomain convertEisToResult(String resultCode, Map<String, Object[]> errMap, String errCreateTimestamp) {

        // Error list
        // エラーリスト
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();

        // A setting of error code, and an error parameter
        // エラーコードとエラーパラメータの設定
        if (errMap != null) {
            for (String errorCode : errMap.keySet()) {

                Object[] params = errMap.get(errorCode);

                List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
                for (Object param : params) {
                    ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                    if (param != null) {
                        errorParamListItem.setParam(param.toString());
                    }
                    errorParamList.add(errorParamListItem);
                }

                ErrorListItemDomain errListItem = new ErrorListItemDomain();
                errListItem.setErrorCode(errorCode);
                errListItem.setErrorParamList(errorParamList);
                errorList.add(errListItem);
            }
        }

        // Setting of an error report
        // エラーレポートの設定
        Ws2503ErrorReportDomain errorReport = new Ws2503ErrorReportDomain();
        errorReport.setErrCreateTimestamp(errCreateTimestamp);

        // Result domain generation
        // 結果ドメイン生成
        Ws2503ResultDomain resultDomain = new Ws2503ResultDomain(resultCode, errorList);
        resultDomain.setErrorReport(errorReport);

        return resultDomain;
    }
}
