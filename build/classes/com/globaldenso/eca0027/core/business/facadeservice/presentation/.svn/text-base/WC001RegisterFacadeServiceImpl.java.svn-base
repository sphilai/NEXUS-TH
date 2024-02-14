/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          : 2013/12/16
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0070;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0074;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0132;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0141;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0149;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WC001;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.business.domain.WC001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WC001ErtDomain;
import com.globaldenso.eca0027.core.business.domain.WC001ErtItemDomain;
import com.globaldenso.eca0027.core.business.domain.WC001ListDomain;
import com.globaldenso.eca0027.core.business.service.WC001ErtService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.Validator;


/**
 * This is an implement class of the Facade service to Register action of return recommendation packing-style create, re printing, and a cancellation screen.
 * <br />返却推奨荷姿作成・再印刷・キャンセル画面のRegisterアクションに対するFacadeサービスの実装クラスです。
 *
 * @version $Revision: 15139 $
 */
public class WC001RegisterFacadeServiceImpl extends AbstractTransactFacadeService<WC001CriteriaDomain, WC001CriteriaDomain> {

    /**
     * Common service
     * <br />Commonサービス
     */
    protected CommonService commonService;
    
    /**
     * E-RT service
     * <br />E-RTサービス
     */
    protected WC001ErtService wc001ErtService;

    /**
     * TmCigmaWhXref Service
     * <br />TmCigmaWhXrefサービス
     * ST987 ADD
     */
    protected TmCigmaWhXrefService tmCigmaWhXrefService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WC001RegisterFacadeServiceImpl() {
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
     * Setter method for wC001ErtService.
     *
     * @param ertService Set for wC001ErtService
     */
    public void setWc001ErtService(WC001ErtService ertService) {
        wc001ErtService = ertService;
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
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WC001CriteriaDomain filterDomain(WC001CriteriaDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2001_Palletize Instruction Main Screen.xls "a screen item definition" is referred to for details.
     *       
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2001_Palletize Instruction Main Screen.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(WC001CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        Validator<WC001CriteriaDomain> valid = new Validator<WC001CriteriaDomain>(criteria, "criteriaDomain");

        // Unary eye check
        // 単項目チェック
        String[] properties = { 
            "shipperCd",
            "shipToCd",
            "trnsCd",
            "freightResponsibleCd",
            "dueDt",
            "packingWhCompCd",
            "packingWhCd",
            "plntCd",
            "loadingCd",
            "priceTerms",
            "returnStyleCd",
            "palletQty",
            "length",
            "width",
            "height",
            "volume",
            "grossWeight",
        };
        valid.isValidateProperties(properties, SCREEN_ID_WC001);

        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            errList.addAll(valid.getErrList());
        }

        for (int i = 0; i < criteria.getListDomainList().size(); i++) {

            WC001ListDomain listDomain = criteria.getListDomainList().get(i);
            Validator<WC001ListDomain> valid2 = new Validator<WC001ListDomain>(listDomain, "listDomainList", i);
            String[] prop2 = {
                "pltzItemNo",
                "qty",
            };
            valid2.isValidateProperties(prop2, SCREEN_ID_WC001);
        
            if (0 < valid2.getErrList().size()) {
                errList.addAll(valid2.getErrList());
            }
        }
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Authority check
     *       This is a call about {@link WC001ErtService#validateConsistencyShipperPlantAuth (String, String)}.
     *
     * - past day check
     *       This is a call about {@link WC001ErtService#validateConsistencyAfterDate (String, String, String)}.
     *
     * - PACKAGE-ITEM-NO input check
     *       This is a call about {@link WC001ErtService#validateConsistencyContents (List, List, List)}.
     *
     * - A PACKAGE ITEM NO and QUANTITY related check
     *       This is a call about {@link WC001ErtService#validateConsistencyPkgItemNoQty(String, String)}.
     *
     * - QUANTITY check   Palette QUANTITY check
     *       This is a call about {@link WC001ErtService#validateConsistencyPalletQty (String)}.
     *
     * - QUANTITY check   Packing-material QUANTITY check
     *       This is a call about {@link WC001ErtService#validateConsistencyContentsQty (String)}.
     *
     * - length check
     *       This is a call about * {@link WC001ErtService#validateConsistencyLengthWidthHeight(String)}.
     *
     * - WEIGHT check
     *       This is a call about {@link WC001ErtService#validateConsistencyGw (String)}.
     * 
     * - 権限チェック
     *     {@link WC001ErtService#validateConsistencyShipperPlantAuth(String, String)}を呼出
     *     
     * - 過去日チェック
     *     {@link WC001ErtService#validateConsistencyAfterDate(String, String, String)}を呼出
     *     
     * - 包装材品番入力チェック
     *     {@link WC001ErtService#validateConsistencyContents(List, List, List)}を呼出
     *     
     * - 包装材品番・数量関連チェック
     *     {@link WC001ErtService#validateConsistencyPkgItemNoQty(String, String)}を呼出
     *     
     * - 数量チェック パレット数量チェック
     *     {@link WC001ErtService#validateConsistencyPalletQty(String)}を呼出
     *     
     * - 数量チェック 包装材数量チェック
     *     {@link WC001ErtService#validateConsistencyContentsQty(String)}を呼出
     *     
     * - 長さチェック
     *     {@link WC001ErtService#validateConsistencyLengthWidthHeight(String)}を呼出
     *     
     * - 重量チェック
     *     {@link WC001ErtService#validateConsistencyGw(String)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(WC001CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        List<? extends WC001ListDomain> listDomainList = criteria.getListDomainList();
        List<String> modelCdList = new ArrayList<String>();
        List<String> itemNoList = new ArrayList<String>();
        List<String> qtyList = new ArrayList<String>();

        for (WC001ListDomain listDomain : listDomainList) {
            modelCdList.add(listDomain.getModelCd());
            itemNoList.add(listDomain.getPltzItemNo());
            qtyList.add(listDomain.getQty());
        }
        
        // * - Authority check
        // * - 権限チェック
        if (!wc001ErtService.validateConsistencyShipperPlantAuth(
            criteria.getShipperCd(), criteria.getPlntCd())) {
            errList.add(new MessageDomain("listDomain.plntCd", GSCM_I0_0009, null));
        }

        // * - past day check
        // * - 過去日チェック
        if (!wc001ErtService.validateConsistencyAfterDate(
            criteria.getDueDt(), criteria.getScreenDateFormat(), criteria.getTimeZone())) {
            Object[] params = {commonService.getResource(criteria.getLocale(), "label.dueDt")};
            errList.add(new MessageDomain("criteriaDomain.dueDt", NXS_E7_0070, params));
        }
        
        // * - PACKAGE-ITEM-NO input check
        // * - 包装材品番入力チェック
        if (!wc001ErtService.validateConsistencyContents(itemNoList, modelCdList, qtyList)) {
            errList.add(new MessageDomain("listDomainList[0].pltzItemNo", NXS_E7_0132, null));
            errList.add(new MessageDomain("listDomainList[0].qty", null, null));
        }
        
        // * - A PACKAGE ITEM NO and QUANTITY related check
        // * - 包装材品番・数量関連チェック
        for (int i = 0; i < itemNoList.size(); i++) {
            Object[] params = {
// 2015.1.15 Change so as to hold in Constants by DNITS instructions
//                commonService.getResource(criteria.getLocale(), "label.WC001.pltzItemNo"),
                ITEM_NO,
                commonService.getResource(criteria.getLocale(), "label.qty")
            };
            if (!wc001ErtService.validateConsistencyPkgItemNoQty(itemNoList.get(i), qtyList.get(i))) {
                errList.add(new MessageDomain("listDomainList[" + i + "].pltzItemNo", NXS_E7_0002, params));
                errList.add(new MessageDomain("listDomainList[" + i + "].qty", null, null));
            }
        }
        
        // * - QUANTITY check   Palette QUANTITY check
        // * - 数量チェック パレット数量チェック
        if (!wc001ErtService.validateConsistencyPalletQty(criteria.getPalletQty())) {
            Object[] params = {commonService.getResource(criteria.getLocale(), "label.palletQty")};
            errList.add(new MessageDomain("criteriaDomain.palletQty", NXS_E7_0141, params));
        }

        // * - QUANTITY check   Packing-material QUANTITY check
        // * - 数量チェック 包装材数量チェック
        for (int i = 0; i < itemNoList.size(); i++) {
            Object[] params = {commonService.getResource(criteria.getLocale(), "label.qty")};
            if (!wc001ErtService.validateConsistencyContentsQty(qtyList.get(i))) {
                errList.add(new MessageDomain("listDomainList[" + i + "].qty", NXS_E7_0141, params));
            }
        }

        // * - length check
        // * - 長さチェック
        if (!wc001ErtService.validateConsistencyLengthWidthHeight(criteria.getLength())) {
            Object[] params = {
                commonService.getResource(criteria.getLocale(), "label.length")
                , criteria.getLength()
            };
            errList.add(new MessageDomain("criteriaDomain.length", NXS_E7_0141, params));
        }
        if (!wc001ErtService.validateConsistencyLengthWidthHeight(criteria.getWidth())) {
            Object[] params = {
                commonService.getResource(criteria.getLocale(), "label.width")
                , criteria.getWidth()
            };
            errList.add(new MessageDomain("criteriaDomain.width", NXS_E7_0141, params));
        }
        if (!wc001ErtService.validateConsistencyLengthWidthHeight(criteria.getHeight())) {
            Object[] params = {
                commonService.getResource(criteria.getLocale(), "label.height")
                , criteria.getHeight()
            };
            errList.add(new MessageDomain("criteriaDomain.height", NXS_E7_0141, params));
        }

        // * - WEIGHT check
        // * - 重量チェック
        if (!wc001ErtService.validateConsistencyGw(criteria.getGrossWeight())) {
            Object[] params = {
                commonService.getResource(criteria.getLocale(), "label.grossWeight")
                , criteria.getGrossWeight()
            };
            errList.add(new MessageDomain("criteriaDomain.grossWeight", NXS_E7_0141, params));
        }

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Shipper existence check
     *       This is a call about {@link WC001ErtService#validateDatabaseShipper (String)}.
     *
     * - NEXUS Ship To existence check
     *       This is a call about {@link WC001ErtService#validateDatabaseShipTo (String)}.
     *
     * - W/H Company and NEXUS W/H Combination check
     *       This is a call about {@link WC001ErtService#validateDatabaseCompWh (String, String)}.
     *
     * - WS (Get Plant Info) check
     *       This is a call about {@link WC001ErtService#validateDatabaseWs9002OnContensOfABoxRegister (String, String)}.
     *
     * - Packing-material check
     *       This is a call about {@link WC001ErtService#validateDatabaseTmPkgMaterialsOnContensOfABoxRegister (String, List, List)}.
     * 
     * - Shipper存在チェック
     *     {@link WC001ErtService#validateDatabaseShipper(String)}を呼出
     *     
     * - NEXUS Ship To存在チェック
     *     {@link WC001ErtService#validateDatabaseShipTo(String)}を呼出
     *     
     * - W/H Company、NEXUS W/H　組み合わせチェック
     *     {@link WC001ErtService#validateDatabaseCompWh(String, String)}を呼出
     *     
     * - WS(Get Plant Info)チェック
     *     {@link WC001ErtService#validateDatabaseWs9002OnContensOfABoxRegister(String, String)}を呼出
     *     
     * - 包装材チェック
     *     {@link WC001ErtService#validateDatabaseTmPkgMaterialsOnContensOfABoxRegister(String, List, List)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WC001CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        List<? extends WC001ListDomain> listDomainList = criteria.getListDomainList();
        List<String> modelCdList = new ArrayList<String>();
        List<String> itemNoList = new ArrayList<String>();
        List<String> qtyList = new ArrayList<String>();

        for (WC001ListDomain listDomain : listDomainList) {
            modelCdList.add(listDomain.getModelCd());
            itemNoList.add(listDomain.getPltzItemNo());
            qtyList.add(listDomain.getQty());
        }
        
        
        // * - Shipper existence check
        // * - Shipper存在チェック
        if (!wc001ErtService.validateDatabaseShipper(criteria.getShipperCdHidden())) {
            errList.add(new MessageDomain("criteriaDomain.shipperCd", NXS_E7_0111, null));
        }

        // * - NEXUS Ship To existence check
        // * - NEXUS Ship To存在チェック
        if (!wc001ErtService.validateDatabaseShipTo(criteria.getShipToCd())) {
            errList.add(new MessageDomain("criteriaDomain.shipToCd", NXS_E7_0074, null));
        }

        // * - W/H Company, a NEXUS W/H combination check
        // * - W/H Company、NEXUS W/H　組み合わせチェック
        if (!wc001ErtService.validateDatabaseCompWh(criteria.getPackingWhCompCd(), criteria.getPackingWhCd())) {
            Object[] params = {
                commonService.getResource(criteria.getLocale(), "label.packingWhCompCd")
                , commonService.getResource(criteria.getLocale(), "label.packingWhCd")
            };
            errList.add(new MessageDomain("criteriaDomain.packingWhCompCd", GSCM_E0_0029, params));
            errList.add(new MessageDomain("criteriaDomain.packingWhCd", null, null));
        }

        // * - WS (Get Plant Info) check
        // * - WS(Get Plant Info)チェック
        //try {
        //    if (!wc001ErtService.validateDatabaseWs9002OnContensOfABoxRegister(criteria.getShipperCd(), criteria.getPlntCd())) {
        //        errList.add(new MessageDomain("criteriaDomain.plntCd", NXS_E7_0153, null));
        //    }
        //} catch (GscmApplicationException e) {
        //    if (NXS_E1_0060.equals(e.getCode())) {
        //        errList.add(new MessageDomain("criteriaDomain.shipperCd", e.getCode(), null));
        //        throw new ValidationException(errList);
        //    } else {
        //        throw e;
        //    }
        //}
        // Search CIGMA Warehouse Cross Reference Master
        // 倉庫クロスリファレンス原単位の検索
        TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteriaDomain = new TmCigmaWhXrefCriteriaDomain();
        tmCigmaWhXrefCriteriaDomain.setLgcyLibCompCd(criteria.getShipperCd());
        tmCigmaWhXrefCriteriaDomain.setPlntCd(criteria.getPlntCd());
        tmCigmaWhXrefCriteriaDomain.setSearchCountCheckFlg(false);
        int resultCount = tmCigmaWhXrefService.searchCount(tmCigmaWhXrefCriteriaDomain);
        if (resultCount == 0) {
            Object[] params = {
                commonService.getResource(criteria.getLocale(), "label.shipperCd")
                , commonService.getResource(criteria.getLocale(), "label.plntCd")
            };
            errList.add(new MessageDomain("criteriaDomain.shipperCd", GSCM_E0_0029, params));
            errList.add(new MessageDomain("criteriaDomain.plntCd", null, null));
        }

        // * - Packing-material check
        // * - 包装材チェック
        List<Integer> resultPartList = new ArrayList<Integer>();
        List<String> resultList = wc001ErtService.validateDatabaseTmPkgMaterialsOnContensOfABoxRegister(
            criteria.getShipperCdHidden(), itemNoList, resultPartList, criteria.getLanguageCd());

        for (int i = 0; i < resultList.size(); i++) {
            String msg = resultList.get(i);
            Object[] params = null;
            if (NXS_E7_0149.equals(msg)) {
                params = new Object[] {itemNoList.get(resultPartList.get(i))};
            }
            errList.add(new MessageDomain("listDomainList[" + resultPartList.get(i) + "].pltzItemNo", msg, params));
        }

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
        
        
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - ERT search-condition domain
     *       {@link WC001ErtDomain} is created and the contents of {@link WC001CriteriaDomain} are set up.
     *       {@link WC001ErtItemDomain} is created and the contents of {@link WC001ListDomain} are set up.
     *       The contents of {@link WC001ErtItemDomain} are set to {@link WC001ErtDomain}.
     *
     * - Execution of cancellation processing
     *       This is an argument about created {@link WC001ErtDomain},
     *       This is a call about {@link WC001ErtService#createOnContensOfABoxRegister (WC001ErtDomain)}.
     *
     * A create of - WC001CriteriaDomain
     *       {@link WC001CriteriaDomain} is created based on a registration result.
     *
     * A return of - WC001CriteriaDomain
     * 
     * - ERT検索条件ドメインの作成
     *     {@link WC001ErtDomain}を作成し、{@link WC001CriteriaDomain}の内容を設定
     *     {@link WC001ErtItemDomain}を作成し、{@link WC001ListDomain}の内容を設定
     *     {@link WC001ErtDomain}に{@link WC001ErtItemDomain}の内容を設定
     *     
     * - キャンセル処理の実行
     *     作成した{@link WC001ErtDomain}を引数に、
     *     {@link WC001ErtService#createOnContensOfABoxRegister(WC001ErtDomain)}を呼出
     *     
     * - WC001CriteriaDomainドメインの作成
     *     登録結果をもとに{@link WC001CriteriaDomain}を作成する
     *     
     * - WC001CriteriaDomainドメインの返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WC001CriteriaDomain callServices(WC001CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {
        
        WC001ErtDomain wC001ErtDomain = convertToErtDomain(criteria);
        List<? extends WC001ErtDomain> ertList = wc001ErtService.createOnContensOfABoxRegister(wC001ErtDomain);
        // Converted in a list domain
        // リストドメインへの変換
        criteria = this.convertToListDomain(ertList.get(0), criteria);
        
        // Overflow
        // 桁あふれ
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        if (criteria.isVolumeOverflow()) {
            Object[] params = { commonService.getResource(criteria.getLocale(), "label.volume") };
            errList.add(new MessageDomain("criteriaDomain.volume", NXS_E7_0157, params));
        }
        if (criteria.isNetWeightOverflow()) {
            Object[] params = { commonService.getResource(criteria.getLocale(), "label.netWeight") };
            errList.add(new MessageDomain("criteriaDomain.netWeight", NXS_E7_0157, params));
        }
        if (!errList.isEmpty()) {
            throw new ValidationException(errList);
        }
        
        return criteria;
    }
    
    

    /**
     * A list domain is changed into an E-RT domain.
     * <br />リストドメインをE-RTドメインに変換します。
     *
     * @param criteria E-RT domain<br />E-RTドメイン
     * @return Conversion result<br />変換結果
     */
    protected WC001ErtDomain convertToErtDomain(WC001CriteriaDomain criteria) {

        WC001ErtDomain wC001ErtDomain = new WC001ErtDomain();
        
        wC001ErtDomain.setLanguageCd(criteria.getLanguageCd());
        wC001ErtDomain.setLoginUserDscId(criteria.getLoginUserDscId());
        
        //DateFormat df = new SimpleDateFormat("dd/MM/yy"); NL021 DEL
        
        // 【10】：Ship to
        wC001ErtDomain.setShipToCd(criteria.getShipToCd());
        // 【13】：Trans
        wC001ErtDomain.setTrnsCd(criteria.getTrnsCd());
        // 【14】：Freight Res
        wC001ErtDomain.setFreightResponsibleCd(criteria.getFreightResponsibleCd());
        // 【15】：Requested ship date
        // NL021 MOD START
        //ParsePosition pos = new ParsePosition(0);
        //Date wlDueDt = df.parse(criteria.getDueDt(), pos);
        Date wlDueDt = DateUtil.parseDate(criteria.getDueDt(), criteria.getScreenDateFormat());
        // NL021 MOD END
        wC001ErtDomain.setDueDt(wlDueDt);
        // 【17】：W/H Com
        wC001ErtDomain.setPackingWhCompCd(criteria.getPackingWhCompCd());
        // 【18】：W/H 
        wC001ErtDomain.setPackingWhCd(criteria.getPackingWhCd());
        // 【19】：Plant CD
        wC001ErtDomain.setPlntCd(criteria.getPlntCd());
        // 【20】：Cont. Sort Key
        wC001ErtDomain.setContainerSortingKey(criteria.getContainerSortingKey());
        // 【21】：LD CD
        wC001ErtDomain.setLoadingCd(criteria.getLoadingCd());
        // 【22】：Inv. Category
        wC001ErtDomain.setInvoiceCtgry(criteria.getInvoiceCtgry());
        // 【23】：C/C TYPE
        wC001ErtDomain.setCmlTyp(criteria.getCustomTimingTyp());
        // 【24】：Price Terms
        wC001ErtDomain.setPriceTerms(criteria.getPriceTerms());
        // 【25】：Return style CD
        wC001ErtDomain.setReturnStyleCd(criteria.getReturnStyleCd());
        // 【26】：Pallet Q'ty
        if (!StringUtils.isEmpty(criteria.getPalletQty())) {
            wC001ErtDomain.setPalletQty(new BigDecimal(criteria.getPalletQty()));
        } else {
            wC001ErtDomain.setPalletQty(new BigDecimal(0));
        }
        // 【27】：Length
        if (!StringUtils.isEmpty(criteria.getLength())) {
            wC001ErtDomain.setLength(new BigDecimal(criteria.getLength()));
        } else {
            wC001ErtDomain.setLength(new BigDecimal(0));
        }
        // 【28】：Width
        if (!StringUtils.isEmpty(criteria.getWidth())) {
            wC001ErtDomain.setWidth(new BigDecimal(criteria.getWidth()));
        } else {
            wC001ErtDomain.setWidth(new BigDecimal(0));
        }
        // 【29】：Height
        if (!StringUtils.isEmpty(criteria.getHeight())) {
            wC001ErtDomain.setHeight(new BigDecimal(criteria.getHeight()));
        } else {
            wC001ErtDomain.setHeight(new BigDecimal(0));
        }
        // 【30】：Volume
        if (!StringUtils.isEmpty(criteria.getVolume())) {
            wC001ErtDomain.setVolume(new BigDecimal(criteria.getVolume()));
        } else {
            wC001ErtDomain.setVolume(new BigDecimal(0));
        }
        
        // 【31】：N/W
        if (!StringUtils.isEmpty(criteria.getNetWeight())) {
            wC001ErtDomain.setNetWeight(new BigDecimal(criteria.getNetWeight()));
        } else {
            wC001ErtDomain.setNetWeight(new BigDecimal(0));
        }
        // 【32】：G/W
        if (!StringUtils.isEmpty(criteria.getGrossWeight())) {
            wC001ErtDomain.setGrossWeight(new BigDecimal(criteria.getGrossWeight()));
        } else {
            wC001ErtDomain.setGrossWeight(new BigDecimal(0));
        }
        
        // 【33】：Length UNIT（Length）
        // 【34】：Length UNIT（Width）
        // 【35】：Length UNIT（Height）
        wC001ErtDomain.setLengthUnit(criteria.getLengthUnitHidden());
        // 【36】：Volume UNIT
        wC001ErtDomain.setVolumeUnit(criteria.getVolumeUnitHidden());
        // 【37】：Weight UNIT(N/W)
        // 【38】：Weight UNIT(G/W)
        wC001ErtDomain.setWeightUnit(criteria.getWeightUnitHidden());
        
        // 【92】：Shipper_h
        wC001ErtDomain.setShipperCd(criteria.getShipperCdHidden());
        
        // Pallet/Carton Type UT420 ADD
        wC001ErtDomain.setPalletCartonTyp(criteria.getPalletCartonTyp());
        
        List<WC001ErtItemDomain> wC001ErtItemList = new ArrayList<WC001ErtItemDomain>();
        for (WC001ListDomain listDomain : criteria.getListDomainList()) {

            WC001ErtItemDomain domain = new WC001ErtItemDomain();
            // 【42】：Contents1_PKG_Item_No
            domain.setPltzItemNo(listDomain.getPltzItemNo());
            // 【43】：Contents1_Model CD
            domain.setModelCd(listDomain.getModelCd());
            // 【44】：Contents1_Qty（※）
            if (!StringUtils.isEmpty(listDomain.getQty()) && CheckUtil.isNumericalNumber(listDomain.getQty())) {
                domain.setQty(new BigDecimal(listDomain.getQty()));
            } else {
                domain.setQty(new BigDecimal(0));
            }
            wC001ErtItemList.add(domain);
        }

        wC001ErtDomain.setErtItemDomainList(wC001ErtItemList);
        
        return wC001ErtDomain;
    }

    /**
     * An E-RT domain is changed into a list domain.
     * <br />E-RTドメインをリストドメインに変換します。
     *
     * @param wC001ErtDomain E-RT domain<br />E-RTドメイン
     * @param criteria List domain<br />リストドメイン
     * @return Conversion result<br />変換結果
     */
    protected WC001CriteriaDomain convertToListDomain(WC001ErtDomain wC001ErtDomain, WC001CriteriaDomain criteria) {

        // [5] : CML No. (From)       4.1. MAIN MARK (head)  
        // [6] :CML No. (To)         4.1. MAIN MARK (end)  
        // 【5】：CML No. (From)     4.1.メインマーク（頭）
        // 【6】：CML No. (To)       4.1.メインマーク（末）
        criteria.setFromMainMark(wC001ErtDomain.getFromMainMark());
        criteria.setToMainMark(wC001ErtDomain.getToMainMark());
        // 【12】：Ship to Name
        criteria.setShipToNm(wC001ErtDomain.getShipToNmDisp());
        // 【20】：Cont. Sort Key    2.1CONTAINER_SORTING_KEY
        criteria.setContainerSortingKey(wC001ErtDomain.getContainerSortingKey());
        // 【23】：C/C TYPE 2.1CUSTOM_TIMING_TYP
        criteria.setCustomTimingTyp(wC001ErtDomain.getCustomTimingTyp());
        // 【30】：Volume   3パレタイズ容積（VOLUME）
        if (!wC001ErtDomain.isVolumeOverflow() && wC001ErtDomain.getVolume() != null) {
            criteria.setVolume(wC001ErtDomain.getVolume().toString());
        } else {
            criteria.setVolume("");
        }
        criteria.setVolumeOverflow(wC001ErtDomain.isVolumeOverflow());
        // 【31】：N/W   4.重量（N/W）
        if (!wC001ErtDomain.isNetWeightOverflow() && wC001ErtDomain.getNetWeight() != null) {
            criteria.setNetWeight(NumberUtil.format(wC001ErtDomain.getNetWeight(), FORMAT_WEIGHT));
        } else {
            criteria.setNetWeight("");
        }
        criteria.setNetWeightOverflow(wC001ErtDomain.isNetWeightOverflow());
        
        List<WC001ErtItemDomain> ertItemList = wC001ErtDomain.getErtItemDomainList();
        
        String lengthUnitDisp = addBlackets(wC001ErtDomain.getLengthUnitDisp());
        String volumeUnitDisp = addBlackets(wC001ErtDomain.getVolumeUnitDisp());
        String weightUnitDisp = addBlackets(wC001ErtDomain.getWeightUnitDisp());
        criteria.setLengthUnitLength(lengthUnitDisp);
        criteria.setLengthUnitWidth(lengthUnitDisp);
        criteria.setLengthUnitHeight(lengthUnitDisp);
        criteria.setLengthUnitHidden(wC001ErtDomain.getLengthUnit());
        criteria.setVolumeUnit(volumeUnitDisp);
        criteria.setVolumeUnitHidden(wC001ErtDomain.getVolumeUnit());
        criteria.setWeightUnitNw(weightUnitDisp);
        criteria.setWeightUnitGw(weightUnitDisp);
        criteria.setWeightUnitHidden(wC001ErtDomain.getWeightUnit());
        
        int i = 0;
        for (WC001ListDomain listDomain : criteria.getListDomainList()) {
            listDomain.setModelCd(ertItemList.get(i).getModelCd());
            i++;
        }
        
        return criteria;
    }
    
    /**
     * Add blackets to unit disp.
     * <br />単位表記の前後に括弧を追加する。
     *
     * @param unitDisp UNIT DISP<br />単位表記
     * @return blackets added unit disp<br />括弧を追加した単位表記
     */
    protected String addBlackets(String unitDisp) {
        
        if (!CheckUtil.isBlankOrNull(unitDisp)) {
            return "(" + unitDisp + ")";
        }
        
        return "";
    }
}
