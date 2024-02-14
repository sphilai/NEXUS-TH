/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0035;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0087;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0088;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0089;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0090;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0091;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0092;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0154;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TW_MIX_TAG_ITEM_NO_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CURRENCY_CODE;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2007UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W2005MixTagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The update service facade implementation class of Multiple Item No. in 1Box PKG Main Screen
 * <br />小箱内多品番梱包Create画面のUpdateFacadeサービス実装クラスです。
 * <pre>
 * bean id:w2007UpdateFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10704 $
 */
public class W2007UpdateFacadeServiceImpl extends AbstractTransactFacadeService<Void, W2007UpdateDomain> {


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
    public W2007UpdateFacadeServiceImpl() {
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
     * - Detailed line selection check
     *       This is a common-specifications .xls "functional common-specifications" No.12 particulars line selection check for details.   This is referred to.
     *
     * - Extraction of a target domain
     *       The List domain (update of new registration or) selected in the pictures is extracted.
     *
     * A create of - Update domain
     *       A new Update domain is created based on the List domain extracted above.
     *
     *       A change of the Update domain of * argument will also update the Update domain on a session,
     *        In order that influence may come out at the time of a screen redraw
     * - 明細行選択チェック
     *     詳細は共通仕様.xls「機能共通仕様」No.12 明細行選択チェック 参照
     *     
     * - 対象ドメインの抽出
     *     画面で選択されたListドメイン(新規登録 or 更新)を抽出する
     *     
     * - Updateドメインの作成
     *     上記で抽出したListドメインをもとに、新しいUpdateドメインを作成する
     *     
     *     ※引数のUpdateドメインを変更すると、セッション上のUpdateドメインも更新されることになり、
     *     　画面再描画時に影響がでるため
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2007UpdateDomain filterDomain(W2007UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        List<W2007ListDomain> newListDomainList = new ArrayList<W2007ListDomain>();
        
        // selected List domain is extracted.
        // 選択されたListドメインを抽出
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2007ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            if (CHECK_ON.equals(listDomain.getSelected())) {
                listDomain.setIndex(i);
                newListDomainList.add(listDomain);
            }
        }
        
        // Detailed line selection check
        // 明細行選択チェック
        if (newListDomainList.size() == 0) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            
            throw new ValidationException(errList);
        }
        
        // A create of new Update domain
        // 新しいUpdateドメインの作成
        W2007UpdateDomain newUpdateDomain = new W2007UpdateDomain();

        // Copy of property
        // プロパティのコピー
        CommonUtil.copyPropertiesDomainToDomain(newUpdateDomain, updateDomain);
        
        // extracted setting of a List domain
        // 抽出したListドメインの設定
        newUpdateDomain.setListDomainList(newListDomainList);
        
        return newUpdateDomain;
        
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2003_Palletize Instruction Create.xls "a screen item definition" is referred to for details.
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2003_Palletize Instruction Create.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2007ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            Validator<W2007ListDomain> valid
                = new Validator<W2007ListDomain>(listDomain, "listDomainList", listDomain.getIndex());
            
            // Unary eye check
            // 単項目チェック
            String[] properties = {
                "qty",
                "tagQty"
            };
            valid.isValidateProperties(properties, SCREEN_ID_W2007);

            // Error check
            // エラー確認
            if (0 < valid.getErrList().size()) {
                errList.addAll(valid.getErrList());
            }
        }
        
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - QUANTITY check
     *       call about {@link W2005MixTagService#validateConsistencyQty (BigDecimal)}.
     *
     * - TAG-QUANTITY check
     *       call about {@link W2005MixTagService#validateConsistencyQty (BigDecimal)}.
     *
     * - Order over check
     *       call about {@link W2005MixTagService#validateConsistencyOrderQtyOver (BigDecimal, BigDecimal)}.
     *
     * - Directions over check
     * call about {@link W2005MixTagService#validateConsistencyInstrQtyInstrPKGedQtyOver(String, BigDecimal, BigDecimal, BigDecimal)}.
     *
     * - SHIPPING-LOT over check
     *       call about {@link W2005MixTagService#validateConsistencyShipLotOver (BigDecimal, BigDecimal, BigDecimal)}.
     *
     * - CIGMA information acquisition check
     *       call about {@link W2005MixTagService#validateConsistencyCurrencyCdQtyUnitPlantCd (String, String, String)}.
     *
     * - Special-Information number information acquisition check
     *       call about {@link W2005MixTagService#validateConsistencyBlankOrNull (String)}.
     *
     * - export-formalities ITEM-NO information acquisition check
     *       call about {@link W2005MixTagService#validateConsistencyBlankOrNull (String)}.
     *
     * - Survey WEIGHT check
     *       call about {@link W2005MixTagService#validateConsistencyBlankOrNull (String)}.
     *
     * - CONTAINER-SORTING-KEY check
     *       call about {@link W2005MixTagService#validateConsistencyAllSame (List)}.
     *
     * - loading position code check
     *       call about {@link W2005MixTagService#validateConsistencyLdCd (List)}.
     *
     * - C/L check
     *       call about {@link W2005MixTagService#validateConsistencyAllSame (List)}.
     *     
     * - Inv. Key check
     *       call about {@link W2005MixTagService#validateConsistencyAllSame (List)}.
     *
     * - CUSTOM-TIMING-TYPE check
     *       call about {@link W2005MixTagService#validateConsistencyAllSame (List)}.
     *
     * - Currency check
     *       call about {@link W2005MixTagService#validateConsistencyAllSame (List)}.
     *
     * - 数量チェック
     *     {@link W2005MixTagService#validateConsistencyQty(BigDecimal)}を呼出
     *     
     * - タグ数チェック
     *     {@link W2005MixTagService#validateConsistencyQty(BigDecimal)}を呼出
     *     
     * - オーダー超えチェック
     *     {@link W2005MixTagService#validateConsistencyOrderQtyOver(BigDecimal, BigDecimal)}を呼出
     *     
     * - 指示超えチェック
     *     {@link W2005MixTagService#validateConsistencyInstrQtyInstrPKGedQtyOver(String, BigDecimal, BigDecimal, BigDecimal)}を呼出
     *     
     * - 出荷ロット超えチェック
     *     {@link W2005MixTagService#validateConsistencyShipLotOver(BigDecimal, BigDecimal, BigDecimal)}を呼出
     *     
     * - CIGMA情報取得チェック
     *     {@link W2005MixTagService#validateConsistencyCurrencyCdQtyUnitPlantCd(String, String, String)}を呼出
     *     
     * - 輸出出荷品目番号情報取得チェック
     *     {@link W2005MixTagService#validateConsistencyBlankOrNull(String)}を呼出
     *     
     * - 輸出手続き品目番号情報取得チェック
     *     {@link W2005MixTagService#validateConsistencyBlankOrNull(String)}を呼出
     *     
     * - 実測重量チェック
     *     {@link W2005MixTagService#validateConsistencyBlankOrNull(String)}を呼出
     *     
     * - コンテナ層別キーチェック
     *     {@link W2005MixTagService#validateConsistencyAllSame(List)}を呼出
     *     
     * - 荷積み位置コードチェック
     *     {@link W2005MixTagService#validateConsistencyLdCd(List)}を呼出
     *     
     * - コンテナルーズチェック
     *     {@link W2005MixTagService#validateConsistencyAllSame(List)}を呼出
     *     
     * - インボイスキーチェック
     *     {@link W2005MixTagService#validateConsistencyAllSame(List)}を呼出
     *     
     * - 通関タイミング区分チェック
     *     {@link W2005MixTagService#validateConsistencyAllSame(List)}を呼出
     *     
     * - 通貨チェック
     *     {@link W2005MixTagService#validateConsistencyAllSame(List)}を呼出
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Error list
        // エラーリスト
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        Locale locale = updateDomain.getLocale();
        
        // PKG support NO
        // 梱包支持NO
        String pltzInstrNo = updateDomain.getCriteriaDomain().getPltzInstrNo();
        
        // List for a correlation check
        // 相関チェック用リスト
        List<String> contSortKeyList = new ArrayList<String>();
        List<String> ldCdList = new ArrayList<String>();
        List<String> clList = new ArrayList<String>();
        List<String> invSetKeyList = new ArrayList<String>();
        List<String> ccTypeList = new ArrayList<String>();
        List<String> currencycdList = new ArrayList<String>();
        
        
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2007ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            // Acquisition of an object item
            // 対象項目の取得
            String itemNo = listDomain.getItemNo();
            BigDecimal qty = new BigDecimal(listDomain.getQty());
            BigDecimal tagQty = new BigDecimal(listDomain.getTagQty());
            BigDecimal orderQty = new BigDecimal(listDomain.getOrderQty());
            BigDecimal shippingLot = new BigDecimal(listDomain.getShippingLot());
            String currCd = listDomain.getCurrCd();
            String qtyUnit = listDomain.getQtyUnit();
            String hiddenPlntCd = listDomain.getHiddenPlntCd();
            String containerLooseTyp = listDomain.getContainerLooseTyp();
            String containerSortingKey = listDomain.getContainerSortingKey();
            String loadingCd = listDomain.getLoadingCd();
            String invoiceKey = listDomain.getInvoiceKey();
            String customTimingTyp = listDomain.getCustomTimingTyp();
            String netWeightA = new String();
            
            String itemNoProperty = String.format("listDomainList[%d].itemNo", listDomain.getIndex());
            String pkgQtyProperty = String.format("listDomainList[%d].qty", listDomain.getIndex());
            String tagQtyProperty = String.format("listDomainList[%d].tagQty", listDomain.getIndex());
            
            if(listDomain.getNetWeightA() != null){
                netWeightA = listDomain.getNetWeightA().toString();
            }
            
            // QUANTITY check
            // 数量チェック
            if (!w2005MixTagService.validateConsistencyQty(qty)) {
                Object[] params = {
                    itemNo
                };
                errList.add(new MessageDomain(pkgQtyProperty, NXS_E7_0087, params));
            }
            
            // TAG-QUANTITY check
            // タグ数チェック
            if (!w2005MixTagService.validateConsistencyQty(tagQty)) {
                Object[] params = {
                    itemNo
                };
                errList.add(new MessageDomain(tagQtyProperty, NXS_E7_0088, params));
            }
            
            // When Packaging Instruction (=Pull) NO is not inputted (when result)  
            // 梱包指示NOが入力されていない場合(成行の場合)
            if (CheckUtil.isBlankOrNull(pltzInstrNo)) {
                // Order over check
                // オーダー超えチェック
                if (!w2005MixTagService.validateConsistencyOrderQtyOver(qty, orderQty)) {
                    Object[] params = {
                        itemNo
                    };
                    errList.add(new MessageDomain(pkgQtyProperty, NXS_E7_0089, params));
                }
            }
            
            // When Packaging Instruction (=Pull) NO is inputted (when Packaging Instruction (=Pull))  
            // 梱包指示NOが入力されてた場合(梱包指示の場合)
            if (!CheckUtil.isBlankOrNull(pltzInstrNo)) {
                BigDecimal instrQty = new BigDecimal(listDomain.getInstrQty());
                BigDecimal instrPkgedQty = new BigDecimal(listDomain.getInstrPkgedQty());
                // Support over check
                // 支持超えチェック
                if (!w2005MixTagService.validateConsistencyInstrQtyInstrPKGedQtyOver(pltzInstrNo, qty, instrQty, instrPkgedQty)) {
                    Object[] params = {
                        itemNo
                    };
                    errList.add(new MessageDomain(pkgQtyProperty, NXS_E7_0090, params));
                }  
            }
            
            // SHIPPING-LOT over check
            // 出荷ロット超えチェック
            if (!w2005MixTagService.validateConsistencyShipLotOver(qty, tagQty, shippingLot)) {
                Object[] params = {
                    itemNo
                };
                errList.add(new MessageDomain(pkgQtyProperty, NXS_E7_0091, params));
                errList.add(new MessageDomain(tagQtyProperty, null, null));
            }
            
            // CIGMA information acquisition check
            // CIGMA情報取得チェック
            if (!w2005MixTagService.validateConsistencyCurrencyCdQtyUnitPlantCd(currCd, qtyUnit, hiddenPlntCd)) {
                Object[] params = {
                    itemNo
                };
                errList.add(new MessageDomain(itemNoProperty, NXS_E7_0092, params));
            }
            
            // Survey WEIGHT check
            // 実測重量チェック
            if (!w2005MixTagService.validateConsistencyBlankOrNull(netWeightA)) {
                Object[] params = {
                    itemNo
                };
                errList.add(new MessageDomain(itemNoProperty, NXS_E7_0154, params));
            }
            
            // List create for a correlation check
            // 相関チェック用のリスト作成
            if(FLAG_N.equals(listDomain.getDisabledFlg())){
                contSortKeyList.add(containerSortingKey);
                ldCdList.add(loadingCd);
                clList.add(containerLooseTyp);
                invSetKeyList.add(invoiceKey);
                ccTypeList.add(customTimingTyp);
                currencycdList.add(currCd);
            }
        }
        
        // Correlation check
        // 相関チェック
        
        // CONTAINER-SORTING-KEY check
        // コンテナ層別キーチェック
        if (!w2005MixTagService.validateConsistencyAllSame(contSortKeyList)) {
            Object[] params = {
                commonService.getResource(locale, "label.containerSortingKey")
            };
            errList.add(new MessageDomain("", NXS_E7_0015, params));
        }
        
        // loading position code check
        // 荷積み位置コードチェック
        if (!w2005MixTagService.validateConsistencyLdCd(ldCdList)) {
            Object[] params = {
                commonService.getResource(locale, "label.loadingCd")
            };
            errList.add(new MessageDomain("", NXS_E7_0015, params));
        }
        
        // C/L check
        // コンテナルーズチェック
        if (!w2005MixTagService.validateConsistencyAllSame(clList)) {
            Object[] params = {
                commonService.getResource(locale, "label.containerLooseTyp")
            };
            errList.add(new MessageDomain("", NXS_E7_0015, params));
        }
        
        // Inv. Key check
        // インボイスキーチェック
        if (!w2005MixTagService.validateConsistencyAllSame(invSetKeyList)) {
            Object[] params = {
                commonService.getResource(locale, "label.invoiceKey")
            };
            errList.add(new MessageDomain("", NXS_E7_0015, params));
        }
        
        
        // CUSTOM-TIMING-TYPE check
        // 通関タイミング区分チェック
        if (!w2005MixTagService.validateConsistencyAllSame(ccTypeList)) {
            Object[] params = {
                commonService.getResource(locale, "label.customTimingTyp")
            };
            errList.add(new MessageDomain("", NXS_E7_0015, params));
        }
        
        // Currency check
        // 通貨チェック
        if (!w2005MixTagService.validateConsistencyAllSame(currencycdList)) {
            Object[] params = {
// 2015.1.15 Change so as to hold in Constants by DNITS instructions
//                commonService.getResource(locale, "label.currencyCd")
                CURRENCY_CODE
            };
            errList.add(new MessageDomain("", NXS_E7_0015, params));
        }
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Multiple Item No. in 1Box PKG number of the same condition check
     *       Condition check of - Mix-Tag-Item-No work
     *           call about {@link W2005MixTagService#validateDatabaseTwMixtagOnCreateUpdateByCondition (String, List, List)}.
     *
     * - The registration number check
     *       The registration number check of - Mix Tag Work
     *           call about {@link W2005MixTagService#validateDatabaseTwMixtagOnCreateUpdateByCount (String, int)}.
     *
     * - 同一小箱内多品番条件チェック
     *     - MIXED品番ワークの条件チェック
     *         {@link W2005MixTagService#validateDatabaseTwMixtagOnCreateUpdateByCondition(String, List, List)}を呼出
     *     
     * - 登録件数チェック
     *     - MIXED品目番号ワークの登録件数チェック
     *         {@link W2005MixTagService#validateDatabaseTwMixtagOnCreateUpdateByCount(String, int)}を呼出
     *         
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        List<String> paramsList = new ArrayList<String>();
        Locale locale = updateDomain.getLocale();
        String dscId = updateDomain.getLoginUserDscId();
        
        List<W2005MixTagItemDomain> domainList = new ArrayList<W2005MixTagItemDomain>();
        List<? extends W2007ListDomain> w2007List = updateDomain.getListDomainList();
        int registerCount = getRegisterCount(w2007List);
        
        for (W2007ListDomain w2007item : w2007List) {
            W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
            if(FLAG_N.equals(w2007item.getDisabledFlg())){
                CommonUtil.copyPropertiesDomainToDomain(mixTagItem, w2007item);
                domainList.add(mixTagItem);
            }
        }
        
        // Multiple Item No. in 1Box PKG number of the same condition check
        // 同一小箱内多品番条件チェック
        if (!w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCondition(dscId, domainList, paramsList)) {
//            for (String paramsMessage : paramsList) {
//                Object[] params = {
//                    commonService.getResource(locale, paramsMessage)
//                };
//                errList.add(new MessageDomain("", NXS_E7_0016, params));
//            }
            for (String paramsMessage : paramsList){
                Object[] params = null;
                if (CURRENCY_CODE.equals(paramsMessage)){
                    params = new String[]{CURRENCY_CODE};
                }else{
                    params = new String[]{commonService.getResource(locale, paramsMessage)};
                }
                errList.add(new MessageDomain("", NXS_E7_0016, params));
            }
        }
        
        // The registration number check
        // 登録件数チェック
        if (!w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCount(dscId, registerCount)) {
            Object[] params = {
                TW_MIX_TAG_ITEM_NO_MAX_COUNT
            };
            errList.add(new MessageDomain("", GSCM_E0_0035, params));
        }
        
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create of the domain for an update
     *       {@link W2007ListDomain} is changed into {@link W2005MixTagItemDomain}.
     *
     * - Update of data
     *       {@link W2005MixTagService#transactOnCreateUpdate (List)} is called,
     *       The following is carried out.
     *         Judgment of registration and an update process
     *         Update process   A Mix-Tag-Item-No work is updated.
     *         Registration processing   A Mix-Tag-Item-No work is registered.
     *
     * - 更新用ドメインの作成
     *     {@link W2007ListDomain}を{@link W2005MixTagItemDomain}に変換
     *     
     * - データの更新
     *     {@link W2005MixTagService#transactOnCreateUpdate(List)}を呼出し、
     *     以下を実施
     *       登録・更新処理の判定
     *       更新処理 MIXED品番ワークを更新
     *       登録処理 MIXED品番ワークを登録
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2007UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // A create of Mix Tag Work
        // MIXED品目番号ワークの作成
        List<? extends W2005MixTagItemDomain> mixTagItemList = createMixTagItem(updateDomain.getListDomainList());
        
        // The registration and the update of Mix Tag Work
        // MIXED品目番号ワークの登録・更新
        w2005MixTagService.transactOnCreateUpdate(mixTagItemList);
        
        return null;
    }
    
    /**
     * The record count which carries out new registration is acquired.
     * <br />新規登録するレコード数を取得します。
     *
     * @param listDomainList List domain<br />Listドメイン
     * @return Record count which carries out new registration<br />新規登録するレコード数
     */
    protected int getRegisterCount(List<? extends W2007ListDomain> listDomainList) {
        int registerCount = 0;
        
        for (W2007ListDomain listDomain : listDomainList) {
            String selected = listDomain.getSelected();
            String disabledFlg = listDomain.getDisabledFlg();
            
            if (CHECK_ON.equals(selected) && FLAG_N.equals(disabledFlg)) {
                registerCount++;
            }
        }
        
        return registerCount;
    }
   
    /**
     * {@link W2007ListDomain} is changed into {@link W2005MixTagItemDomain}.
     * <br />{@link W2007ListDomain}を{@link W2005MixTagItemDomain}に変換します。
     *
     * @param listDomainList List domain<br />Listドメイン
     * @return {@link W2005MixTagItemDomain}
     */
    protected List<? extends W2005MixTagItemDomain> createMixTagItem(List<? extends W2007ListDomain> listDomainList) {
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();

        // A create of Mix Tag Work
        // MIXED品目番号ワークの作成
        for (W2007ListDomain listDomain : listDomainList) {
            W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(mixTagItem, listDomain);
            
            mixTagItemList.add(mixTagItem);
        }
        
        return mixTagItemList;
    }

}
