/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0039;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0040;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0041;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0043;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2008UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W2005MixTagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * The search service facade implementation class of Multiple Item No. in 1Box PKG Register
 * <br />小箱内多品番梱包Register画面のRegisterFacadeサービス実装クラスです。
 * <pre>
 * bean W2008RegisterFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W2008RegisterFacadeServiceImpl 
    extends AbstractTransactFacadeService<List<? extends W2008ListDomain>, W2008UpdateDomain> {
    
    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Multiple-p/n-packaged-in-box service
     * <br />小箱内多品番梱包サービス
     */
    protected W2005MixTagService w2005MixTagService;
    
    /**
     * constructor.
     */
    public W2008RegisterFacadeServiceImpl() {
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
     * Setter method for w2005MixTagService.
     *
     * @param mixTagService Set for w2005MixTagService
     */
    public void setW2005MixTagService(W2005MixTagService mixTagService) {
        w2005MixTagService = mixTagService;
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
    protected W2008UpdateDomain filterDomain(W2008UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Unary eye check implementation
     *
     * - 単項目チェック実施
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Packing-material registration-confirmed check
     *       This is a call about {@link W2005MixTagService#validateConsistencyPkgIp (String)}.
     *
     * - Warning check check
     *       This is a call about {@link W2005MixTagService#validateConsistencyWarningFlgIgnoreWarnings (List, String)}.
     *
     * - The minimum PKG check
     *       This is a call about {@link W2005MixTagService#validateConsistencyPltzTargetRecordActualTagQty (int, BigDecimal)}.
     *
     * - 包装材登録確認チェック
     *     {@link W2005MixTagService#validateConsistencyPkgIp(String)}を呼出
     *     
     * - Warning確認チェック
     *     {@link W2005MixTagService#validateConsistencyWarningFlgIgnoreWarnings(List, String)}を呼出
     *     
     * - 最小梱包チェック
     *     {@link W2005MixTagService#validateConsistencyPltzTargetRecordActualTagQty(int, BigDecimal)}を呼出
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errMessages = new ArrayList<MessageDomain>();
        List<? extends W2008ListDomain> w2008List = updateDomain.getListDomainList();
        
        String pkgIp = updateDomain.getCriteriaDomain().getPkgIp();
        List<String> warningFlgList = new ArrayList<String>();
        String ignoreWarnings = updateDomain.getCriteriaDomain().getIgnoreWarnings();
        for (W2008ListDomain domain : w2008List) {
            warningFlgList.add(domain.getWarningFlg());
        }
        int count = updateDomain.getListDomainList().size();
        
        // Packing-material registration-confirmed check
        // 包装材登録確認チェック
        if (!w2005MixTagService.validateConsistencyPkgIp(pkgIp)) {
            errMessages.add(new MessageDomain(null, NXS_E7_0039, null));
        }
        
        // Warning check check
        // Warning確認チェック
        if (!w2005MixTagService.validateConsistencyWarningFlgIgnoreWarnings(warningFlgList, ignoreWarnings)) {
            errMessages.add(new MessageDomain(null, NXS_E7_0040, null));
        }
        
        // The minimum PKG check
        // 最小梱包チェック
        for (W2008ListDomain domain : w2008List) {
            BigDecimal tagQty = new BigDecimal(domain.getTagQty());
            if (!w2005MixTagService.validateConsistencyPltzTargetRecordActualTagQty(count, tagQty)) {
                errMessages.add(new MessageDomain(null, NXS_E7_0041, null));
            }
        }
        
        if (errMessages.size() > 0) {
            throw new ValidationException(errMessages);
        }
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * Behavior in - CIGMA night batch
     *
     * - combination check 1
     *       Combination check of - Session (W2006.Shipper), Session (W2006.Cust. No.), and Session (W2006.Ship to)
     *       - common-specifications .xls[functional-specification common: Refer to [ Shipper, Customer, and ] Ship to combination check].
     *
     * - combination check 2
     *       Combination check of - Session (W2006.Shipper), Session (W2006.W/H), and Session (W2006.Plant CD)
     *       - common-specifications .xls[functional-specification common: Refer to [ Shipper, W/H, and ] Plant combination check].
     *       It carries out, only when - Session (W2006.Plant CD) is not "."
     *
     * - combination check 3
     *       Combination check of - Session (W2006.W/H Com.) and Session (W2006.NEXUS W/H)
     *       - common-specifications .xls[functional-specification common: Refer to [ W/H Company and ] NEXUS W/H combination check].
     *
     * - Packaging Instruction (=Pull) check
     *       - This is confirmed whether the Packaging Instruction (=Pull) document is canceled.
     *       It carries out, only when - Session (W2006.Palletize Instr. No.) is not "."
     *       - acquired data   Packaging Instruction (=Pull)
     *           This is a call about {@link W2005MixTagService#validateDatabaseTtPltzInstrOnRegister (String)}.
     *
     * - Directions over check
     *       - acquired data   A Mix Tag, MIXED ITEM NO 
     *       This is a call about * {@link W2005MixTagService#validateDatabaseTtMixtagItemNoOnRegister(String, BigDecimal, BigDecimal)}.
     *
     * - CIGMA夜間バッチ中の振る舞い
     * 
     * - 組み合わせチェック1 
     *     - Session(W2006.Shipper)、Session(W2006.Cust. No.)、Session(W2006.Ship to)の組合せチェック
     *     - 共通仕様.xls[機能仕様共通：Shipper、Customer、Ship to　組み合わせチェック]参照
     *     
     * - 組み合わせチェック2
     *     - Session(W2006.Shipper)、Session(W2006.W/H)、Session(W2006.Plant CD)の組合せチェック
     *     - 共通仕様.xls[機能仕様共通：Shipper、W/H、Plant　組み合わせチェック]参照
     *     - Session(W2006.Plant CD)が""でない場合のみ行う
     *     
     * - 組み合わせチェック3
     *     - Session(W2006.W/H Com.)、Session(W2006.NEXUS W/H)の組合せチェック
     *     - 共通仕様.xls[機能仕様共通：W/H Company、NEXUS W/H　組み合わせチェック]参照
     *     
     * - 梱包指示チェック
     *     - 梱包指示書がキャンセルされていないかをチェックする
     *     - Session(W2006.Palletize Instr. No.)が""でない場合のみ行う
     *     - 取得データ 梱包指示
     *         {@link W2005MixTagService#validateDatabaseTtPltzInstrOnRegister(String)}を呼出
     *     
     * - 指示超えチェック
     *     - 取得データ MIXED現品票、MIXED品目番号
     *         {@link W2005MixTagService#validateDatabaseTtMixtagItemNoOnRegister(String, BigDecimal, BigDecimal)}を呼出
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errMessages = new ArrayList<MessageDomain>();
        
        String shipperCd = updateDomain.getCriteriaDomain().getShipperCd();
        String customerCd = updateDomain.getCriteriaDomain().getCustomerCd();
        String lgcyShipToCd = updateDomain.getCriteriaDomain().getLgcyShipTo();
        String lgcyWhCd = updateDomain.getCriteriaDomain().getLgcyWhCd();
        String plntCd = updateDomain.getCriteriaDomain().getPlntCd();
        String compCd = updateDomain.getCriteriaDomain().getWhCompCd();
        String whCd = updateDomain.getCriteriaDomain().getWhCd();
        String pltzInstrNo = updateDomain.getCriteriaDomain().getPltzInstrNo();
        
        Locale locale = updateDomain.getLocale();
        
        List<? extends W2008ListDomain> w2008List = updateDomain.getListDomainList();
        
        // check among a night batch
        // 夜間バッチ中チェック
        if (!w2005MixTagService.validateDatabaseCigmaAvailable(true, shipperCd)) {
            MessageDomain msg = new MessageDomain("", NXS_E1_0060, null);
            errMessages.add(msg);
        }
        
        // Shipper, Customer, a Ship to combination check
        // Shipper、Customer、Ship to 組み合わせチェック
        if (!w2005MixTagService.validateDatabaseShipperCustomerShipTo(shipperCd, customerCd, lgcyShipToCd)) {
            Object[] params = {
                commonService.getResource(locale, "label.shipperCd"),
                commonService.getResource(locale, "label.customerCd"),
                commonService.getResource(locale, "label.lgcyShipTo")
            };
            MessageDomain msgShipperCd = new MessageDomain("w2008CriteriaDomain.shipperCd", GSCM_E0_0030, params);
            MessageDomain msgCustomerCd = new MessageDomain("w2008CriteriaDomain.customerCd", null, null);
            MessageDomain msgLgcyShipTo = new MessageDomain("w2008CriteriaDomain.lgcyShipTo", null, null);
            errMessages.add(msgShipperCd);
            errMessages.add(msgCustomerCd);
            errMessages.add(msgLgcyShipTo);
        }
        
        // Shipper, W/H, a Plant combination check
        // Shipper、W/H、Plant 組み合わせチェック
        if(!CheckUtil.isBlankOrNull(plntCd)){
            if (!w2005MixTagService.validateDatabaseShipperWhPlant(shipperCd, lgcyWhCd, plntCd)) {
                Object[] params = {
                    commonService.getResource(locale, "label.shipperCd"),
                    commonService.getResource(locale, "label.lgcyWhCd"),
                    commonService.getResource(locale, "label.plntCd")
                };
                MessageDomain msgShipperCd = new MessageDomain("w2008CriteriaDomain.shipperCd", GSCM_E0_0030, params);
                MessageDomain msgLgcyWhCd = new MessageDomain("w2008CriteriaDomain.lgcyWhCd", null, null);
                MessageDomain msgplntCd = new MessageDomain("w2008CriteriaDomain.plntCd", null, null);
                errMessages.add(msgShipperCd);
                errMessages.add(msgLgcyWhCd);
                errMessages.add(msgplntCd);
            }
        }
        
        // W/H Company, a NEXUS W/H combination check
        // W/H Company、NEXUS W/H 組み合わせチェック
        if (!w2005MixTagService.validateDatabaseCompWh(compCd, whCd)) {
            Object[] params = {
                commonService.getResource(locale, "label.whCompCd"),
                commonService.getResource(locale, "label.whCd"),
            };
            MessageDomain msgWhCompCd = new MessageDomain("w2008CriteriaDomain.whCompCd", GSCM_E0_0029, params);
            MessageDomain msgWhCd = new MessageDomain("w2008CriteriaDomain.whCd", null, null);
            errMessages.add(msgWhCompCd);
            errMessages.add(msgWhCd);
        }
        
        // Packaging Instruction (=Pull) check
        // 梱包指示チェック
        if(!CheckUtil.isBlankOrNull(pltzInstrNo)){
            if (!w2005MixTagService.validateDatabaseTtPltzInstrOnRegister(pltzInstrNo)) {
                MessageDomain msgpltzInstrNo = new MessageDomain(null, GSCM_E0_0010, null);
                errMessages.add(msgpltzInstrNo);
            }
        }
        
        // Directions over check
        // 指示超えチェック
        if(!CheckUtil.isBlankOrNull(pltzInstrNo)){
            for (W2008ListDomain domain : w2008List) {
                String itemNo = domain.getItemNo();
                String pkgCd = domain.getPkgCd();
                BigDecimal actualPkgQty = new BigDecimal(domain.getQty());
                BigDecimal instrQty = new BigDecimal(domain.getInstrQty());
                if (!w2005MixTagService.validateDatabaseTtMixtagItemNoOnRegister(
                            pltzInstrNo, itemNo, pkgCd, actualPkgQty, instrQty)) {
                    MessageDomain msgpltzInstrNo = new MessageDomain(null, NXS_E7_0043, null);
                    errMessages.add(msgpltzInstrNo);
                }
            }
        }

        if (errMessages.size() > 0) {
            throw new ValidationException(errMessages);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - Mix-Tag domain
     *       {@link W2005MixTagDomain} is created and the contents of {@link W2008CriteriaDomain} are set up.
     *       {@link W2005MixTagItemDomain} is created and the contents of {@link W2008ListDomain} are set up.
     *       {@link W2005MixTagItemDomain} is set to {@link W2005MixTagDomain}.
     *
     * - Execution of registration processing
     *       This is an argument about created {@link W2005MixTagDomain},
     *       {@link W2005MixTagService#transactOnRegister (W2005MixTagDomain)} is called,
     *       The following is carried out.
     *         Firm-order-receipt alloc processing
     *         A Mix Tag is registered.
     *         A MIXED ITEM NO is registered.
     *         A Mix Tag Receive Order is registered.
     *         A Mix Tag Work is deleted.
     *         A Mix Tag RT is registered.
     *         A Mix Tag RT Work is deleted.
     *         A Temp Stock is updated and registered.
     *         Registration of an ordering alloc track record (starting of Web service)
     *         Re retrieval
     *
     * A create of - Update domain
     *       {@link W2008UpdateDomain} is created based on the re retrieval result after registration.
     *
     * A return of - Update domain
     *
     * - MIXED現品票ドメインの作成
     *     {@link W2005MixTagDomain}を作成し、{@link W2008CriteriaDomain}の内容を設定する
     *     {@link W2005MixTagItemDomain}を作成し、{@link W2008ListDomain}の内容を設定する
     *     {@link W2005MixTagDomain}に{@link W2005MixTagItemDomain}を設定
     *     
     * - 登録処理の実行
     *     作成した{@link W2005MixTagDomain}を引数に、
     *     {@link W2005MixTagService#transactOnRegister(W2005MixTagDomain)}を呼出し、
     *     以下を実施
     *       確定受注引当処理
     *       MIXED現品票を登録する
     *       MIXED品目番号を登録する
     *       MIXED品目番号受注情報を登録する
     *       MIXED品目番号ワークを削除する
     *       MIXED用RT材を登録する
     *       MIXED用RT材ワークを削除する
     *       仮在庫を更新・登録する
     *       受注引当実績の登録（Webサービスの起動）
     *       再検索
     *     
     * - Updateドメインの作成
     *     登録後の再検索結果をもとに{@link W2008UpdateDomain}を作成
     *     
     * - Updateドメインの返却
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2008ListDomain> callServices(W2008UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        
        // A create of Mix-Tag domain
        // MIXED現品票ドメインの作成
        W2005MixTagDomain mixTag = createMixTag(updateDomain);
        
        // Execution of registration processing
        // 登録処理の実行
        List<? extends W2005MixTagDomain> mixTagList = w2005MixTagService.transactOnRegister(mixTag);
        
        return convertToListDomain(mixTagList, mixTagList.get(0).getShipperCd());
        
    }

    /**
     *   {@link W2005MixTagDomain} from {@link W2008CriteriaDomain} and {@link W2008ListDomain} and {@link W2005MixTagItemDomain} are created.
     * <br />{@link W2008CriteriaDomain}および{@link W2008ListDomain}から{@link W2005MixTagDomain}、{@link W2005MixTagItemDomain}を作成します。
     *
     * @param updateDomain Update domain<br />Updateドメイン
     * @return mixTagDomain mixTagDomain MIXED-ITEM-NO domain<br />MIXED品目番号ドメイン
     * @throws ApplicationException When a WEIGHT UNIT is not able to be acquired<br />重量単位が取得できなかった場合
     */
    @SuppressWarnings("deprecation")
    protected W2005MixTagDomain createMixTag(W2008UpdateDomain updateDomain) throws ApplicationException {
        
        W2005MixTagDomain mixTagDomain = new W2005MixTagDomain();
        
        // A setting of Mix-Tag domain
        // MIXED現品票ドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(mixTagDomain, updateDomain.getCriteriaDomain());
        mixTagDomain.setDscNm(updateDomain.getCriteriaDomain().getLoginUserNm());
        
        // A setting of the WEIGHT UNIT of Shipper
        // Shipperの重量単位の設定
        String weightUnit = commonService.searchWeightUnit(updateDomain.getCriteriaDomain().getShipperCd());
        mixTagDomain.setWeightUnit(weightUnit);
        
        mixTagDomain.setDateFormat(updateDomain.getCriteriaDomain().getDateFormat());
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        
        //   Create of a MIXED-ITEM-NO domain
        //  MIXED品目番号ドメインの作成
        for (W2008ListDomain listDomain : updateDomain.getListDomainList()) {
            W2005MixTagItemDomain mixTagItemDomain = new W2005MixTagItemDomain(); 
            CommonUtil.copyPropertiesDomainToDomain(mixTagItemDomain, listDomain);
            mixTagItemList.add(mixTagItemDomain);
        }
        
        // A setting of MIXED-ITEM-NO domain
        // MIXED品目番号ドメインの設定
        mixTagDomain.setMixTagItemDomainList(mixTagItemList);
        
        return mixTagDomain;
    }
    
    /**
     * Change search results into a List domain.
     * <br />検索結果をListドメインに変換します。
     *
     * @param searchMixTagList Search results<br />検索結果
     * @param shipperCd Shipper CD<br />荷主コード
     * @return The List domain for screen display<br />画面表示用のListドメイン
     * @throws ApplicationException When a WEIGHT UNIT is not able to be acquired<br />重量単位が取得できなかった場合
     */
    protected List<? extends W2008ListDomain> convertToListDomain(List<? extends W2005MixTagDomain> searchMixTagList, String shipperCd) 
        throws ApplicationException {

        List<W2008ListDomain> listDomainList = new ArrayList<W2008ListDomain>();
        
        W2005MixTagDomain mixTagDomain = searchMixTagList.get(0);
        
        // Acquisition of the WEIGHT UNIT of Shipper
        // Shipperの重量単位の取得
        String shipperWeightUnit = commonService.searchWeightUnit(shipperCd);
        
        if (mixTagDomain != null) {
            
            for (int i = 0; i < mixTagDomain.getMixTagItemDomainList().size(); i++) {
                W2005MixTagItemDomain mixTagItemDomain = mixTagDomain.getMixTagItemDomainList().get(i);
                W2008ListDomain listDomain = new W2008ListDomain();
                
                // Copy of property
                // プロパティのコピー
                
                CommonUtil.copyPropertiesDomainToDomain(listDomain, mixTagDomain);
                CommonUtil.copyPropertiesDomainToDomain(listDomain, mixTagItemDomain);
                
                // resetting of an item overwritten
                // 上書きされる項目の再設定
                listDomain.setShipperCd(mixTagDomain.getShipperCd());
                listDomain.setCustomerCd(mixTagDomain.getCustomerCd());
                listDomain.setLgcyShipTo(mixTagDomain.getLgcyShipTo());
                listDomain.setTrnsCd(mixTagDomain.getTrnsCd());
                listDomain.setPlntCd(mixTagDomain.getPlntCd());
                listDomain.setLgcyWhCd(mixTagDomain.getLgcyWhCd());
                listDomain.setPltzInstrNo(mixTagDomain.getPltzInstrNo());
                listDomain.setWhCompCd(mixTagDomain.getWhCompCd());
                listDomain.setWhCd(mixTagDomain.getWhCd());
                listDomain.setMixTagStatus(mixTagDomain.getMixTagStatus());
                listDomain.setInvoiceKey(mixTagDomain.getInvoiceKey());
                listDomain.setContainerSortingKey(mixTagDomain.getContainerSortingKey());                
                listDomain.setLoadingCd(mixTagDomain.getLoadingCd());
                listDomain.setNetWeight(decimalToString(mixTagDomain.getNetWeight(), FORMAT_WEIGHT));
                listDomain.setGrossWeight(decimalToString(mixTagDomain.getGrossWeight(), FORMAT_WEIGHT));
                listDomain.setBoxNo(mixTagDomain.getBoxNo());
                listDomain.setMixTagNo(mixTagDomain.getMixTagNo());
                listDomain.setWeightUnit(mixTagDomain.getWeightUnit());
                
                // Y fixation (a Mix Tag RT exists)  
                // Y固定(MIXED用RT材が存在する)
                listDomain.setPkgIp("Y");
                
                // The SEQUENCE NO from 1
                // 1からの連番
                listDomain.setNo(i + 1);
                
                // N/W + XXXX 
                if (listDomain.getNetWeight() != null) {
                    // Acquisition of WEIGHT UNIT, and a NET WEIGHT
                    // 重量単位とネット重量の取得
                    String itemWeightUnit = listDomain.getWeightUnit();
                    BigDecimal itemNetWeight = mixTagDomain.getNetWeight();

                    // Converted of a WEIGHT UNIT
                    // 重量単位の変換

                    BigDecimal netWeight = commonService.convertWeightUnit(itemNetWeight, itemWeightUnit, shipperWeightUnit);

                    // An error is made when the digit number of integer part exceeds a maximum.
                    // 整数部の桁数が上限を超えた場合はエラー
                    if (netWeight == null) {
                        Object[] params = {
                            commonService.getResource(mixTagDomain.getLocale(), "label.netWeight")
                        };
                        throw new GscmApplicationException(NXS_E7_0157, params);
                    }

                    listDomain.setNetWeight(decimalToString(netWeight, FORMAT_WEIGHT));

                }
                
                // G/W + XXXX 
                if (listDomain.getGrossWeight() != null) {
                    // Acquisition of WEIGHT UNIT, and a NET WEIGHT
                    // 重量単位とネット重量の取得
                    String itemWeightUnit = listDomain.getWeightUnit();
                    BigDecimal itemGrossWeight = mixTagDomain.getGrossWeight();
                    
                    // Converted of a WEIGHT UNIT
                    // 重量単位の変換                                  

                    BigDecimal grossWeight = commonService.convertWeightUnit(itemGrossWeight, itemWeightUnit, shipperWeightUnit);

                    // An error is made when the digit number of integer part exceeds a maximum.
                    // 整数部の桁数が上限を超えた場合はエラー
                    if (grossWeight == null) {
                        Object[] params = {
                            commonService.getResource(mixTagDomain.getLocale(), "label.grossWeight")
                        };
                        throw new GscmApplicationException(NXS_E7_0157, params);
                    }

                    listDomain.setGrossWeight(decimalToString(grossWeight, FORMAT_WEIGHT));

                }
                
                String authFlg = mixTagItemDomain.getAuth();
                
                // Masking processing
                // マスキング処理
                if(authFlg.compareTo(AUTH_EMPTY_NUMERIC) == 0) {
                    
                    listDomain.setItemNo(mask(mixTagItemDomain.getItemNo()));
                    listDomain.setPkgCd(mask(mixTagItemDomain.getPkgCd()));
                    listDomain.setItemDescription(mask(mixTagItemDomain.getItemDescription()));
                    listDomain.setShippingLot(mask(decimalToString(mixTagItemDomain.getShippingLot(), null)));
                    listDomain.setInstrQty(mask(decimalToString(mixTagItemDomain.getInstrQty(), null)));
                    listDomain.setQty(mask(decimalToString(mixTagItemDomain.getQty(), null)));
                    listDomain.setTagQty(mask(decimalToString(mixTagItemDomain.getTagQty(), null)));
                    
                }
                
                listDomain.setAuthFlg(authFlg);
                
                listDomainList.add(listDomain);
            }
        }
        return listDomainList;
    }
    
    /**
     * Change the VALUE of BigDecimal into a string.
     * <br />BigDecimalの値を文字列に変換する。
     * <pre>
     * - null is returned when an argument is null.
     *     When this is not null, the result of having carried out {@link BigDecimal#toPlainString()} to the argument is returned.
     *
     * - 引数がnullの場合は、null を返す。
     *   nullでない場合は、引数に対して {@link BigDecimal#toPlainString()} を実施した結果を返す。
     * </pre>
     * @param decimalVal The VALUE of BigDecimal<br />BigDecimalの値
     * @param format Formater<br />フォーマッタ
     * @return The VALUE after a converted<br />変換後の値
     */
    protected String decimalToString(BigDecimal decimalVal, String format){
        
        if (decimalVal == null ) {
            return null;
        }
        if (format != null) {
            return NumberUtil.format(decimalVal, format);
        } else {
            return decimalVal.toPlainString();
        }
    }
    
    /**
     * Transpose an input string to *.
     * <br />入力文字列を*に置き換えます。
     *
     * @param s Changing agency string<br />変換元文字列
     * @return Converting destination string<br />変換先文字列
     */
    protected String mask(String s) {
        
        if (s == null){
            return s;
        }
        return s.replaceAll(".", "*");
    }

}
