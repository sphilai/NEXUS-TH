/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS2502;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_ERR_REPORT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM_JOB;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableHdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ProductivityDataInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemByKanbanDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501UnpackagedItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2502ErrorReportDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2502KanbanListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2502MainMarkListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2502MixTagListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2502PalletizeInstrHeaderDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2502PnListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2502RegisterDataListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2502ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2502UnregisterDataListItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtEisProductDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2502CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2502ItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2502PkgItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2502ProductivityDataInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2502XmlRootCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsBhtEisProductService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * Implement class for Facade Service to ECA0027_WS_2502
 * <br />ECA0027_WS_2502に対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: Ws2502CreateFacadeService
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class Ws2502TransactFacadeServiceImpl extends AbstractTransactFacadeService<Ws2502ResultDomain, Ws2502CriteriaDomain> {
    
    /**
     * Eis Product service
     * <br />Eis Productサービス
     */
    private WsBhtEisProductService wsBhtEisProductService;
    
    /**
     * constructor
     * <br />指示パレタイズ実績情報登録デフォルトコンストラクタです。
     */
    public Ws2502TransactFacadeServiceImpl() {
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
    protected Ws2502CriteriaDomain filterDomain(Ws2502CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Common error check
     *     Refer for details to "Screen Item Defenition Sheet"
     * - 共通エラーチェック
     *     詳細は「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected void validateItems(Ws2502CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        criteriaDomain.getXmlRoot().setLocale(criteriaDomain.getLocale());
        
        Validator<Ws2502XmlRootCriteriaDomain> valid 
            = new Validator<Ws2502XmlRootCriteriaDomain>(criteriaDomain.getXmlRoot(), "criteriaDomain");
        
        // Individual item check
        // 単項目チェック
        String[] properties = {
            "pltzInstrNo",
            "palletNo"
        };
        
        
        // Required check
        // 必須チェック
        valid.isValidateProperties(properties, WS_ID_WS2502);
        
        // number of digit, attribute, form check
        // 桁数、属性、書式チェック
        // No Action
        // 処理なし
        
        // check errors
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - combination check for ITEM-NO list
     *     argument: itemNoCriteriaList of criteriaDomain
     *     call: {@link WsBhtEisProductService#validateConsistencyItemListCstmr(java.util.List)}
     * - check for exterior sign setting
     *     argument: outerCd, outerCdFlg of criteriaDomain
     *     call: {@link WsBhtEisProductService#validateConsistencyOuterNumber(java.lang.String, java.lang.String)}
     * - combination check for PACKAGE-ITEM-NO
     *      argument: pkgItemNoCriteriaList of criteriaDomain
     *      call: {@link WsBhtEisProductService#validateConsistencyPkgMtrlItemList(java.util.List)}
     * - check for Productivity data collection information setting
     *      argument: businessStartTime, businessEndTime, productivityDataInfoCriteriaList of criteriaDomain
     *      call: {@link WsBhtEisProductService#validateConsistencyPrdctData(java.lang.String, java.lang.String, java.util.List)}
     * 
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
    protected void validateConsistency(Ws2502CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // create error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // generate parameters
        // パラメータ生成
        List<? extends Ws2502ItemNoCriteriaDomain> itemNoCriteriaList =  criteriaDomain.getXmlRoot().getItemNoCriteriaList();
        String outerCd = criteriaDomain.getXmlRoot().getOuterCd();
        String outerCdFlg = criteriaDomain.getXmlRoot().getOuterCdFlg();
        List<? extends Ws2502PkgItemNoCriteriaDomain> pkgItemNoCriteriaList = criteriaDomain.getXmlRoot().getPkgItemNoCriteriaList();
        String businessStartTime = criteriaDomain.getXmlRoot().getWorkTimeStrt();
        String businessEndTime = criteriaDomain.getXmlRoot().getWorkTimeEnd();
        List<? extends Ws2502ProductivityDataInfoCriteriaDomain> productivityDataInfoCriteriaList = criteriaDomain.getXmlRoot().getProductivityDataInfoCriteriaList();
        
        // combination check for ITEM-NO list
        // 品目番号リスト組み合わせチェック
        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();
        for (Ws2502ItemNoCriteriaDomain itemNoCriteria : itemNoCriteriaList){
            Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
            CommonUtil.copyPropertiesDomainToDomain(itemNo, itemNoCriteria);
            itemNoList.add(itemNo);
        }
        if (!wsBhtEisProductService.validateConsistencyItemListCstmr(itemNoList)){
            MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }
        
        // check for exterior sign setting
        // 外装記号設定チェック
        if (!wsBhtEisProductService.validateConsistencyOuterNumber(outerCd, outerCdFlg)){
            MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }
        
        // combination check for PACKAGE-ITEM-NO
        // 包装材品目番号リスト組み合わせチェック
        List<Ws2501PkgItemNoDomain> pkgItemNoList = new ArrayList<Ws2501PkgItemNoDomain>();
        for (Ws2502PkgItemNoCriteriaDomain pkgItemNoCriteria : pkgItemNoCriteriaList){
            Ws2501PkgItemNoDomain pkgItemNo = new Ws2501PkgItemNoDomain();
            CommonUtil.copyPropertiesDomainToDomain(pkgItemNo, pkgItemNoCriteria);
            pkgItemNoList.add(pkgItemNo);
        }
        if (!wsBhtEisProductService.validateConsistencyPkgMtrlItemList(pkgItemNoList)){
            MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }
        
        // check for Productivity data collection information setting
        // 生産性データ収集情報設定チェック
        List<Ws2501ProductivityDataInfoDomain> productivityDataInfoList = new ArrayList<Ws2501ProductivityDataInfoDomain>();
        for (Ws2502ProductivityDataInfoCriteriaDomain productivityDataInfoCriteria : productivityDataInfoCriteriaList){
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
     * - Existing check for exterior sing
     *     argument: pltzInstrNo, outerCd of criteriaDomain
     *     call: {@link WsBhtEisProductService#validateDatabaseTmPkgSetDtlOnInstrPltz(String, String, String[], String[], TmPkgSetHdrDomain)}
     * - Existing check for dummy packing-material 
     *     argument: shipperCd, pkgItemNoCriteriaList of the result of Existing check for exterior sing 
     *     call: {@link WsBhtEisProductService#validateDatabaseTmPkgMaterialsOnInstrPltz(String[], List, List)}
     * - Existing check for packing specification
     *     argument: shipperCd, trnsCd of the result of Existing check for exterior sing, itemNoCriteriaList of criteriaDomain
     *     call: {@link WsBhtEisProductService#validateDatabaseTmPkgSpecificationDtOnInstrPltz(String[], List, String[], Ws2501PkgSpecDomain)}
     *     
     * - 外装記号存在チェック
     *     criteriaDomainのpltzInstrNo、outerCdを引数にして
     *     {@link WsBhtEisProductService#validateDatabaseTmPkgSetDtlOnInstrPltz(String, String, String[], String[], TmPkgSetHdrDomain)}を呼出
     * - ダミー包装材存在チェック
     *     外装記号存在チェック結果のshipperCd、pkgItemNoCriteriaListを引数にして
     *     {@link WsBhtEisProductService#validateDatabaseTmPkgMaterialsOnInstrPltz(String[], List, List)}を呼出
     * - 包装仕様存在チェック
     *     外装記号存在チェック結果のshipperCd、trnsCd、criteriaDomainのitemNoCriteriaListを引数にして
     *     {@link WsBhtEisProductService#validateDatabaseTmPkgSpecificationDtOnInstrPltz(String[], List, String[], Ws2501PkgSpecDomain)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected void validateDatabase(Ws2502CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // create error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // generate parameters
        // パラメータ生成
        String pltzInstrNo = criteriaDomain.getXmlRoot().getPltzInstrNo();
        String outerCd = criteriaDomain.getXmlRoot().getOuterCd();
        String palletNo = criteriaDomain.getXmlRoot().getPalletNo();
        
        String[] shipperCd = new String[1];
        String[] trnsCd = new String[1];
        TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        
        List<String> pkgItemNoList = new ArrayList<String>();
        for (Ws2502PkgItemNoCriteriaDomain pkgItemNoCriteria : criteriaDomain.getXmlRoot().getPkgItemNoCriteriaList()){
            String pkgItemNo = new String();
            pkgItemNo = pkgItemNoCriteria.getPkgItemNo();
            pkgItemNoList.add(pkgItemNo);
        }
        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();
        for (Ws2502ItemNoCriteriaDomain itemNoCriteria : criteriaDomain.getXmlRoot().getItemNoCriteriaList()){
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
        
        // Existing check for exterior sing
        // 外装記号存在チェック
        String errCd = wsBhtEisProductService.validateDatabaseTmPkgSetDtlOnInstrPltz(pltzInstrNo, outerCd, shipperCd, trnsCd, tmPkgSetHdr);
        if (errCd != null) {
            Object[] params = {
                outerCd
            };
            MessageDomain msg = new MessageDomain("", errCd, params);
            errorList.add(msg);
        }
        
        // Existing check for dummy packing-material
        // ダミー包装材存在チェック
        List<String> pkgItemNoErrList = new ArrayList<String>();
        if (!wsBhtEisProductService.validateDatabaseTmPkgMaterialsOnInstrPltz(shipperCd, pkgItemNoList, pkgItemNoErrList)){
            for (String PkgItemNoErrItem : pkgItemNoErrList){
                Object[] params = {
                    PkgItemNoErrItem
                };
                MessageDomain msg = new MessageDomain("", NXS_E1_5009, params);
                errorList.add(msg);
            }
        }
        
        // Existing check for packing specification
        // 包装仕様存在チェック
        Map<String, List<String>> errMap = new HashMap<String, List<String>>();
        
        Ws2501PkgSpecDomain singlePkgSpec = new Ws2501PkgSpecDomain();
        
        errMap = wsBhtEisProductService.validateDatabaseTmPkgSpecificationDtOnInstrPltz(shipperCd, itemNoList, trnsCd, singlePkgSpec);
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
        
        // check errors
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
        
        // set parameters for call service
        // call Serviceへの引き渡し項目の設定
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
     * - set for {@link WsBhtEisProductCriteriaDomain}
     * - set for {@link WsBhtEisProductService#transactOnInstPltz(WsBhtEisProductCriteriaDomain)}
     * - set for {@link Ws2502ResultDomain}
     * 
     * - {@link WsBhtEisProductCriteriaDomain}の設定
     * - {@link WsBhtEisProductService#transactOnInstPltz(WsBhtEisProductCriteriaDomain)}の呼出
     * - {@link Ws2502ResultDomain}の設定
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected Ws2502ResultDomain callServices(Ws2502CriteriaDomain criteriaDomain) throws GscmApplicationException, ApplicationException {
        
        // create Eis Product search-condition domain from parameter domain of ECA0027_WS_2502
        // ECA0027_WS_2502のパラメータドメインよりEis Product検索条件ドメインを作成
        WsBhtEisProductCriteriaDomain criteria = copyCriteriaDomainToCriteria(criteriaDomain);
        
        // invoke the business service
        // 業務処理の実行
        WsBhtEisProductDomain wsBhtEisProduct = wsBhtEisProductService.transactOnInstPltz(criteria);
        
        // judge error
        // エラー判定
        String resultCd = wsBhtEisProduct.getResultCd();
        if (WS_RESULT_ERROR.compareTo(resultCd) == 0
            || WS_RESULT_ERROR_ERR_REPORT_OUT.compareTo(resultCd) == 0 
            || WS_RESULT_ERROR_SYSTEM_JOB.compareTo(resultCd) == 0) {
            Ws2502ResultDomain result = convertEisToResult(resultCd, wsBhtEisProduct.getErrMap(), wsBhtEisProduct.getErrCreateTimestamp());
            return result;
        }
        
        // result domain of ECA0027_WS_2502 from Eis Product domain
        // Eis ProductドメインよりECA0027_WS_2502の結果ドメイン
        Ws2502ResultDomain result = convertEisToResult(wsBhtEisProduct);
        return result;
    }
    
    /**
     * Create Eis Product search-condition domain from parameter domain of ECA0027_WS_2502
     * <br />ECA0027_WS_2502のパラメータドメインよりEis Product検索条件ドメインを作成します。
     *
     * @param criteriaDomain parameter domain of ECA0027_WS_2502<br />ECA0027_WS_2502のパラメータドメイン
     * @return Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     */
    protected WsBhtEisProductCriteriaDomain copyCriteriaDomainToCriteria(Ws2502CriteriaDomain criteriaDomain) {
        // generate input prameter domain
        // 入力パラメータドメインの生成
        Ws2502XmlRootCriteriaDomain xmlRootCriteriaDomain = criteriaDomain.getXmlRoot();
        
        // set criteria domain
        // criteriaドメインの設定
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        
        criteria.setLoginUserDscId(criteriaDomain.getLoginUserDscId());
        criteria.setScreenId(criteriaDomain.getScreenId());
        
        criteria.setPltzInstrNo(xmlRootCriteriaDomain.getPltzInstrNo());
        criteria.setPalletNo(xmlRootCriteriaDomain.getPalletNo());
        
        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();
        for (Ws2502ItemNoCriteriaDomain itemNoCriteriaDomain : xmlRootCriteriaDomain.getItemNoCriteriaList()){
            Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
            CommonUtil.copyPropertiesDomainToDomain(itemNo, itemNoCriteriaDomain);
            itemNoList.add(itemNo);
        }
        criteria.setWs2502ItemNoList(itemNoList);
        
        criteria.setOuterCd(xmlRootCriteriaDomain.getOuterCd());
        criteria.setOuterCdFlg(xmlRootCriteriaDomain.getOuterCdFlg());
        
        List<Ws2501PkgItemNoDomain> pkgItemNoList = new ArrayList<Ws2501PkgItemNoDomain>();
        for (Ws2502PkgItemNoCriteriaDomain pkgItemNoCriteriaDomain : xmlRootCriteriaDomain.getPkgItemNoCriteriaList()){
            Ws2501PkgItemNoDomain pkgItemNo = new Ws2501PkgItemNoDomain();
            CommonUtil.copyPropertiesDomainToDomain(pkgItemNo, pkgItemNoCriteriaDomain);
            pkgItemNoList.add(pkgItemNo);
        }
        criteria.setWs2502pkgItemNoList(pkgItemNoList);
        
        criteria.setWorkTimeStrt(xmlRootCriteriaDomain.getWorkTimeStrt());
        criteria.setWorkTimeEnd(xmlRootCriteriaDomain.getWorkTimeEnd());
        
        List<Ws2501ProductivityDataInfoDomain> productivityDataInfoList = new ArrayList<Ws2501ProductivityDataInfoDomain>();
        for (Ws2502ProductivityDataInfoCriteriaDomain productivityDataInfoCriteriaDomain
            : xmlRootCriteriaDomain.getProductivityDataInfoCriteriaList()){
            
            Ws2501ProductivityDataInfoDomain productivityDataInfo = new Ws2501ProductivityDataInfoDomain();
            CommonUtil.copyPropertiesDomainToDomain(productivityDataInfo, productivityDataInfoCriteriaDomain);
            productivityDataInfoList.add(productivityDataInfo);
            
        }
        criteria.setWs2502ProductivityDataInfoList(productivityDataInfoList);
        
        
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
     * Create result domain of ECA0027_WS_2502 from Eis Product domain (normal case)
     * <br />Eis ProductドメインよりECA0027_WS_2502の結果ドメインを作成します。(正常用)
     *
     * @param wsBhtEisProduct Eis Product domain<br />Eis Productドメイン
     * @return result domain of ECA0027_WS_2502<br />ECA0027_WS_2502の結果ドメイン
     */
    protected Ws2502ResultDomain convertEisToResult(WsBhtEisProductDomain wsBhtEisProduct){
        
        // get internal variable (header)
        // 内部変数（ヘッダ）取得
        Ws2501InternalVariableHdrDomain internalVariableHdr = wsBhtEisProduct.getWs2502InternalVariableHdrDomain();
        
        // error report result domain of ECA0027_WS_2502
        // ECA0027_WS_2502のエラーレポート結果ドメイン
        Ws2502ErrorReportDomain errorReport = new Ws2502ErrorReportDomain();
        errorReport.setErrCreateTimestamp(null);
        
        // MAIN MARK list item result domain of ECA0027_WS_2502
        // ECA0027_WS_2502のMAIN MARKリスト項目結果ドメイン
        Ws2502MainMarkListItemDomain createData = new Ws2502MainMarkListItemDomain();
        createData.setMainMark(wsBhtEisProduct.getMainMark());
        createData.setPalletNo(internalVariableHdr.getPalletNo());
        
        // MAIN MARK list item result domain of ECA0027_WS_2502
        // ECA0027_WS_2502のMAIN MARKリスト項目結果ドメイン
        List<Ws2502MainMarkListItemDomain> mainMarkList = new ArrayList<Ws2502MainMarkListItemDomain>();
        
        for (TtPltzDomain ttPltz : wsBhtEisProduct.getWs2502TtPltzList()){
            Ws2502MainMarkListItemDomain mainMark = new Ws2502MainMarkListItemDomain();
            mainMark.setMainMark(ttPltz.getMainMark());
            mainMark.setPalletNo(ttPltz.getPalletNo());
            mainMarkList.add(mainMark);
        }
        
        // KANBAN list item result domain of ECA0027_WS_2502
        // ECA0027_WS_2502のかんばんリスト項目結果ドメイン
        List<Ws2502KanbanListItemDomain> kanbanList = new ArrayList<Ws2502KanbanListItemDomain>();
        
        for (Ws2501TtPltzItemByKanbanDomain ttPltzItemByKanban : wsBhtEisProduct.getWs2502TtPltzItemByKanbanList()){
            kanbanList.add(getWs2502KanbanListItemDomain(ttPltzItemByKanban));
        }
        
        // Mix Tag list item result domain of ECA0027_WS_2502
        // ECA0027_WS_2502のMIXタグリスト項目結果ドメイン
        List<Ws2502MixTagListItemDomain> mixTagList = new ArrayList<Ws2502MixTagListItemDomain>();
        
        for (String mixTagNo : wsBhtEisProduct.getWs2502MixTagList()){
            Ws2502MixTagListItemDomain mixTag = new Ws2502MixTagListItemDomain();
            mixTag.setMixTagNo(mixTagNo);
            mixTagList.add(mixTag);
        }
        
        // Registered data list item result domain of ECA0027_WS_2502
        // ECA0027_WS_2502の登録データリスト項目結果ドメイン
        Ws2502RegisterDataListItemDomain registerDataListItem = new Ws2502RegisterDataListItemDomain();
        registerDataListItem.setMainMarkList(mainMarkList);
        registerDataListItem.setKanbanList(kanbanList);
        registerDataListItem.setMixTagList(mixTagList);
        
        List<Ws2502RegisterDataListItemDomain> registerDataList = new ArrayList<Ws2502RegisterDataListItemDomain>();
        registerDataList.add(registerDataListItem);
        
        // UnPalletized list item result domain of ECA0027_WS_2502
        // ECA0027_WS_2502の未パレタイズリスト項目結果ドメイン
        List<Ws2502PnListItemDomain> pnList = new ArrayList<Ws2502PnListItemDomain>();
        
        for (Ws2501UnpackagedItemNoDomain unpackagedItemNo : wsBhtEisProduct.getWs2502UnpackagedItemNoList()){
            Ws2502PnListItemDomain ws2502PnListItemDomain = new Ws2502PnListItemDomain();
            ws2502PnListItemDomain.setItemNo(unpackagedItemNo.getItemNo());
            ws2502PnListItemDomain.setPkgCd(unpackagedItemNo.getPkgCd());
            int unPackedQty = parseInt(unpackagedItemNo.getInstrQty())
                                - parseInt(unpackagedItemNo.getPackedQty())
                                - parseInt(unpackagedItemNo.getSumQty());
            ws2502PnListItemDomain.setUnPackedQty(String.valueOf(unPackedQty));
            pnList.add(ws2502PnListItemDomain);
        }
        
        // Mix Tag list item result domain of ECA0027_WS_2502
        // ECA0027_WS_2502のMIXタグリスト項目結果ドメイン
        List<Ws2502MixTagListItemDomain> unpackedMixTagList = new ArrayList<Ws2502MixTagListItemDomain>();
        
        for (String mixTagNo : wsBhtEisProduct.getWs2502UnpackagedMixTagList()){
            Ws2502MixTagListItemDomain unpackedMixTag = new Ws2502MixTagListItemDomain();
            unpackedMixTag.setMixTagNo(mixTagNo);
            unpackedMixTagList.add(unpackedMixTag);
        }
        
        // Unregistered data list item result domain of ECA0027_WS_2502
        // ECA0027_WS_2502の未登録データリスト項目結果ドメイン
        Ws2502UnregisterDataListItemDomain unregisterDataListItem = new Ws2502UnregisterDataListItemDomain();
        unregisterDataListItem.setPnList(pnList);
        unregisterDataListItem.setMixTagList(unpackedMixTagList);
        
        List<Ws2502UnregisterDataListItemDomain> unregisterDataList = new ArrayList<Ws2502UnregisterDataListItemDomain>();
        unregisterDataList.add(unregisterDataListItem);
        
        // Packing Instruction header result domain of ECA0027_WS_2502
        // ECA0027_WS_2502の梱包指示ヘッダ結果ドメイン
        Ws2502PalletizeInstrHeaderDomain palletizeInstrHeader = new Ws2502PalletizeInstrHeaderDomain();
        palletizeInstrHeader.setCustomerCd(internalVariableHdr.getCustomerCd());
        palletizeInstrHeader.setLgcyShipTo(internalVariableHdr.getLgcyShipTo());
        palletizeInstrHeader.setLgcyWhCd(internalVariableHdr.getLgcyWhCd());
        palletizeInstrHeader.setPlntCd(internalVariableHdr.getPlntCd());
        palletizeInstrHeader.setShipperCd(internalVariableHdr.getShipperCd());
        palletizeInstrHeader.setTrnsCd(internalVariableHdr.getTrnsCd());
        palletizeInstrHeader.setRegisterDataList(registerDataList);
        palletizeInstrHeader.setUnregisterDataList(unregisterDataList);
        palletizeInstrHeader.setCmlPrintNum(internalVariableHdr.getCmlPrintNum());

        // Result domain
        // 結果ドメイン
        Ws2502ResultDomain resultDomain = new Ws2502ResultDomain(WS_RESULT_SUCCESS);
        resultDomain.setCreateData(createData);
        resultDomain.setPalletizeInstrHeader(palletizeInstrHeader);
        
        return resultDomain;
    }

    /**
     * Create result domain of ECA0027_WS_2502 (error case)
     * <br />ECA0027_WS_2502の結果ドメインを作成します。(異常用)
     *
     * @param resultCode result code<br />結果コード
     * @param errMap error map<br />エラーマップ
     * @param errCreateTimestamp error report time stamp<br />エラーレポートタイムスタンプ
     * @return result domain of ECA0027_WS_2502<br />ECA0027_WS_2502の結果ドメイン
     */
    protected Ws2502ResultDomain convertEisToResult(String resultCode, Map<String, Object[]> errMap, String errCreateTimestamp) {
        
        // error list
        // エラーリスト
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        
        // set error code and error parameter
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
        
        // set error report
        // エラーレポートの設定
        Ws2502ErrorReportDomain errorReport = new Ws2502ErrorReportDomain();
        errorReport.setErrCreateTimestamp(errCreateTimestamp);
        
        // generate error domain
        // 結果ドメイン生成
        Ws2502ResultDomain resultDomain = new Ws2502ResultDomain(resultCode, errorList);
        resultDomain.setErrorReport(errorReport);
        
        return resultDomain;
    }
    
    /**
     * Copy KanbanDomain for resultDomain
     * <br />結果返却用のドメインにかんばん情報をコピーする。
     * 
     * @param ttPltzItemByKanban Kanban Domain<br />かんばんドメイン
     * @return kanban Domain for Result Domain<br />結果返却用のかんばんドメイン
     */
    protected Ws2502KanbanListItemDomain getWs2502KanbanListItemDomain(Ws2501TtPltzItemByKanbanDomain ttPltzItemByKanban) {
        
        Ws2502KanbanListItemDomain ws2502KanbanListItemDomain = new Ws2502KanbanListItemDomain();
        ws2502KanbanListItemDomain.setPltzItemNo(ttPltzItemByKanban.getPltzItemNo());
        ws2502KanbanListItemDomain.setPkgCd(ttPltzItemByKanban.getPkgCd());
        ws2502KanbanListItemDomain.setCustomerItemNo(ttPltzItemByKanban.getCustomerItemNo());
        ws2502KanbanListItemDomain.setExpIndusTypCd(ttPltzItemByKanban.getExpIndusTypCd());
        ws2502KanbanListItemDomain.setExpKanbanTyp(ttPltzItemByKanban.getExpKanbanTyp());
        ws2502KanbanListItemDomain.setExpRegulateNo(ttPltzItemByKanban.getExpRegulateNo());
        ws2502KanbanListItemDomain.setExpCustomerRegulateNo(ttPltzItemByKanban.getExpCustomerRegulateNo());
        return ws2502KanbanListItemDomain;
    }

    /**
     * Parses the string argument as a signed decimal integer.
     * 
     * @param s string
     * @return integer (0 if the string is null or empty)
     */
    protected int parseInt(String s) { 

        if (StringUtils.isEmpty(s)) {
            return 0;
        }

        return Integer.parseInt(s);
    }
}
