/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0051;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0072;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0073;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0087;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0088;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0089;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0090;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0091;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0092;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0093;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0094;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0095;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0096;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0097;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0098;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0099;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0100;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0154;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MULTI;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_SINGLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2011;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.omg.CORBA.UserException;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2011ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2011UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * This is a Update service implement class of a CML Create screen.
 * <br />CML Create画面のUpdateサービス実装クラスです。
 * <pre>
 * bean id:w2011UpdateFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class W2011UpdateFacadeServiceImpl extends AbstractTransactFacadeService<Void, W2011UpdateDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * CML service
     * <br />CMLサービス
     */
    protected W2009CmlService w2009CmlService;
    
    /**
     * constructor.
     */
    public W2011UpdateFacadeServiceImpl() {
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
     * Setter method for w2009CmlService.
     *
     * @param cmlService Set for w2009CmlService
     */
    public void setW2009CmlService(W2009CmlService cmlService) {
        w2009CmlService = cmlService;
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
     * 
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
    protected W2011UpdateDomain filterDomain(W2011UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        List<W2011ListDomain> newListDomainList = new ArrayList<W2011ListDomain>();
        
        // selected List domain is extracted.
        // 選択されたListドメインを抽出
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2011ListDomain listDomain = (W2011ListDomain)updateDomain.getListDomainList().get(i);
            
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
        W2011UpdateDomain newUpdateDomain = new W2011UpdateDomain();
    
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
     *       Screen definition document_ECA0027_W2011_CML Create.xls "a screen item definition" is referred to for details.
     * 
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2011_CML Create.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2011UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {

            W2011ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            if (CHECK_ON.equals(listDomain.getSelected())) {
                
                if (FLAG_N.equals(listDomain.getMixTagFlg())) {

                    if (!FLAG_Y.equals(updateDomain.getCriteriaDomain().getManualRegFlg())) {
                        
                        if (PKG_FORM_TYP_MULTI.equals(listDomain.getPkgFormTyp())) {
                            if (CheckUtil.isBlankOrNull(listDomain.getQty())) {
                                String[] params = new String[] { commonService.getResource(updateDomain.getLocale(), "label.actualPkgQty")};
                                errList.add(new MessageDomain(String.format("listDomainList[%d].qty", listDomain.getIndex()), GSCM_E0_0011, params));
                            }
                            if (CheckUtil.isBlankOrNull(listDomain.getTagQty())) {
                                String[] params = new String[] { commonService.getResource(updateDomain.getLocale(), "label.tagQty")};
                                errList.add(new MessageDomain(String.format("listDomainList[%d].tagQty", listDomain.getIndex()), GSCM_E0_0011, params));
                            }
                        }
                        
                        if (PKG_FORM_TYP_SINGLE.equals(listDomain.getPkgFormTyp())) {
                            if (CheckUtil.isBlankOrNull(listDomain.getQty())) {
                                String[] params = new String[] { commonService.getResource(updateDomain.getLocale(), "label.actualPkgQty")};
                                errList.add(new MessageDomain(String.format("listDomainList[%d].qty", listDomain.getIndex()), GSCM_E0_0011, params));
                            }
                        }
                    // UT110 TRIAL SHIPMENT/号試品対応 ADD
                    } else {
                        if (CheckUtil.isBlankOrNull(listDomain.getQty())) {
                            String[] params = new String[] { commonService.getResource(updateDomain.getLocale(), "label.actualPkgQty")};
                            errList.add(new MessageDomain(String.format("listDomainList[%d].qty", listDomain.getIndex()), GSCM_E0_0011, params));
                        }
                    }
                }
                
                Validator<W2011ListDomain> valid = new Validator<W2011ListDomain>(listDomain, "listDomainList", listDomain.getIndex());
                
                // Unary eye check
                // 単項目チェック
                String[] properties = { 
                    "qty",
                    "tagQty"
                };
                valid.isValidateProperties(properties, SCREEN_ID_W2011);
    
                // Error check
                // エラー確認
                if (0 < valid.getErrList().size()) {
                    errList.addAll(valid.getErrList());
                }
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
     * - This is following 1-10 in selected data. It checks. [ data / of MixTagFlg ="N" ]
     *     - 1. QUANTITY check
     *     {@link W2009CmlService#validateConsistencyActualQty(java.lang.String)}
     *
     *     - 2. TAG-QUANTITY check
     *       Only in - pkgFormTyp ="M", the following checks are performed.
     *     {@link W2009CmlService#validateConsistencyActualQty(java.lang.String)}
     *
     *     - 3. order over check
     *       Only in - pltzInstrNo ="", the following checks are performed.
     *     {@link W2009CmlService#validateConsistencyOver(java.math.BigDecimal, java.math.BigDecimal)}
     *
     *     - 4. directions over check
     *       Only in - pltzInstrNo !="", the following checks are performed.
     * {@link W2009CmlService#validateConsistencyOverInstr(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal)}
     *
     *     - 5. SHIPPING-LOT over check (multi-article ITEM NO)  
     *       Only in - pkgFormTyp ="M", the following checks are performed.
     * {@link W2009CmlService#validateConsistencyOverShipLotMultiple(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal)}
     *
     *     - 6. SHIPPING-LOT over check (single article ITEM NO)  
     *       Only in - pkgFormTyp ="S", the following checks are performed.
     *     {@link W2009CmlService#validateConsistencyOver(BigDecimal, BigDecimal)}
     *
     *     - 7.CIGMA information acquisition check
     *     {@link W2009CmlService#validateConsistencyGetCigmaInfo(String, String, String)}
     *
     *     - 8. Special-Information number information acquisition check
     *     {@link W2009CmlService#validateConsistencyBlankOrNull(String)}
     *
     *     - 9. export-formalities ITEM-NO information acquisition check
     *     {@link W2009CmlService#validateConsistencyBlankOrNull(String)}
     *
     *     - 10. survey WEIGHT check
     *     {@link W2009CmlService#validateConsistencyBlankOrNull(String)}
     *
     * - Correlation check
     *     Following 1-9 are checked about all the selected data.
     *     - 1. CONTAINER-SORTING-KEY check
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *
     *     - 2. loading position code check
     *     {@link W2009CmlService#validateConsistencyStagingCd(List)}
     *
     *     - 3. Inv. Key check
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *
     *     - 4. staging-instruction flag check
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *
     *     - 5. CUSTOM-TIMING-TYPE check
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *
     *     - 6. C/L check
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *
     *     - 7. PACKAGE-FORM-TYPE check
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *
     *     - 8. currency check
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *
     *     - 9. single article ITEM-NO check
     *     {@link W2009CmlService#validateConsistencySingleItemNo(List)}
     * 
     * - 選択されたデータの中でMixTagFlg = "N" のデータについてのみ以下の 1～10 チェックを行う。
     *   - 1.数量チェック
     *     {@link W2009CmlService#validateConsistencyActualQty(java.lang.String)}
     *  
     *   - 2.タグ数チェック
     *     - pkgFormTyp = "M" の場合のみ以下のチェックを行う。
     *     {@link W2009CmlService#validateConsistencyActualQty(java.lang.String)}
     *  
     *   - 3.オーダー超えチェック
     *     - pltzInstrNo = "" の場合のみ以下のチェックを行う。
     *     {@link W2009CmlService#validateConsistencyOver(java.math.BigDecimal, java.math.BigDecimal)}
     *  
     *   - 4.指示超えチェック
     *     - pltzInstrNo ≠ "" の場合のみ以下のチェックを行う。
     *     {@link W2009CmlService#validateConsistencyOverInstr(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal)}
     *  
     *   - 5.出荷ロット超えチェック（多品品目番号）
     *     - pkgFormTyp = "M" の場合のみ以下のチェックを行う。
     *     {@link W2009CmlService#validateConsistencyOverShipLotMultiple(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal)}
     *  
     *   - 6.出荷ロット超えチェック（単品品目番号）
     *     - pkgFormTyp = "S" の場合のみ以下のチェックを行う。
     *     {@link W2009CmlService#validateConsistencyOver(BigDecimal, BigDecimal)}
     *  
     *   - 7.CIGMA情報取得チェック
     *     {@link W2009CmlService#validateConsistencyGetCigmaInfo(String, String, String)}
     *  
     *   - 8.輸出出荷品目番号情報取得チェック
     *     {@link W2009CmlService#validateConsistencyBlankOrNull(String)}
     *  
     *   - 9.輸出手続き品目番号情報取得チェック
     *     {@link W2009CmlService#validateConsistencyBlankOrNull(String)}
     *  
     *   - 10.実測重量チェック
     *     {@link W2009CmlService#validateConsistencyBlankOrNull(String)}
     *
     * - 相関チェック
     *   選択された全データについて、以下の1～9のチェックを行う。
     *   - 1.コンテナ層別キーチェック
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *  
     *   - 2.荷積み位置コードチェック
     *     {@link W2009CmlService#validateConsistencyStagingCd(List)}
     *  
     *   - 3.インボイスキーチェック
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *  
     *   - 4.荷揃え指示フラグチェック
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *  
     *   - 5.通関タイミング区分チェック
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *  
     *   - 6.コンテナルーズチェック
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *  
     *   - 7.梱包形態チェック
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *  
     *   - 8.通貨チェック
     *     {@link W2009CmlService#validateConsistencyAllSame(List)}
     *  
     *   - 9.単品品目番号チェック
     *     {@link W2009CmlService#validateConsistencySingleItemNo(List)}
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2011UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        W2011CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        List<? extends W2011ListDomain> domainList = updateDomain.getListDomainList();
        
        // List for a correlation check
        // 相関チェック用リスト
        List<String> countSortKeyList = new ArrayList<String>();
        List<String> loadingCdList = new ArrayList<String>();
        List<String> invoiceKeyList = new ArrayList<String>();
        List<String> stgInstrItemFlgList = new ArrayList<String>();
        List<String> ccTypeList = new ArrayList<String>();
        List<String> clList = new ArrayList<String>();
        List<String> pkgFormTypList = new ArrayList<String>();
        List<String> currCdList = new ArrayList<String>();
        List<String> pltzItemNoList = new ArrayList<String>();
        
        for (int i = 0; i < domainList.size(); i++) {
            W2011ListDomain listDomain = updateDomain.getListDomainList().get(i);            
            
            boolean isErrStyleToMixTagNo = false;
            
            // Let only selected data of a line be checked objects.
            // 選択された行のデータのみをチェック対象とする
            if (CHECK_ON.equals(listDomain.getSelected())) {

                // The VALUE for a check is set as a variable.
                // チェック用の値を変数に設定
                int index = listDomain.getIndex();
                BigDecimal qty = stringToBicDecimal(listDomain.getQty());
                String pltzItemno = listDomain.getPltzItemNo();
                BigDecimal tagQty = stringToBicDecimal(listDomain.getTagQty());
                BigDecimal orderQty = stringToBicDecimal(listDomain.getOrderQty());
                BigDecimal instrQty = stringToBicDecimal(listDomain.getInstrQty());
                BigDecimal instrPkgedQty = stringToBicDecimal(listDomain.getInstrPkgedQty());
                BigDecimal shipperLot = stringToBicDecimal(listDomain.getShippingLot());
                String currCd = listDomain.getCurrCd();
                String qtyUnit = listDomain.getQtyUnit();
                String plntCd = listDomain.getPlntCd();
                String itemDescription = listDomain.getItemDescription();
                String dngrItemFlg = listDomain.getDngrItemFlg();
                String itemWeight = listDomain.getItemWeight();
                
                // A VALUE is set to the list for a correlation check.
                // 相関チェック用のリストに値を設定
                if (FLAG_N.equals(listDomain.getDisableFlg())) {
                    // UT110 TRIAL SHIPMENT/号試品対応 ADD if
                    // Mix tags can not be selected in the trial shipment.
                    // 号試品でMixタグは選べない。
                    if (FLAG_Y.equals(updateDomain.getCriteriaDomain().getManualRegFlg()) && FLAG_Y.equals(listDomain.getMixTagFlg())) {
                        Object[] params = { listDomain.getMixTagNo() };
                        errList.add(new MessageDomain(null, NXS_E7_0008, params));
                    } else {
                        countSortKeyList.add(listDomain.getContainerSortingKey());
                        loadingCdList.add(listDomain.getLoadingCd());
                        invoiceKeyList.add(listDomain.getInvoiceKey());
                        stgInstrItemFlgList.add(listDomain.getStgInstrItemFlg());
                        ccTypeList.add(listDomain.getCustomTimingTyp());
                        clList.add(listDomain.getContainerLooseTyp());
                        pkgFormTypList.add(listDomain.getPkgFormTyp());
                        currCdList.add(listDomain.getCurrCd());
                        pltzItemNoList.add(listDomain.getPltzItemNo());
                    }
                }
                
                if (FLAG_N.equals(listDomain.getMixTagFlg())) {
                    // 1. QUANTITY check
                    // 1.数量チェック
                    if (!w2009CmlService.validateConsistencyActualQty(listDomain.getQty())) {
                        Object[] params = {pltzItemno};
                        errList.add(new MessageDomain(String.format("listDomainList[%d].qty", index), NXS_E7_0087, params));
                    }
                    
                    // 2. TAG-QUANTITY check
                    // 2.タグ数チェック
                    if (PKG_FORM_TYP_MULTI.equals(listDomain.getPkgFormTyp())) {
                        if (!w2009CmlService.validateConsistencyActualQty(listDomain.getTagQty())) {
                            Object[] params = {pltzItemno};
                            errList.add(new MessageDomain(String.format("listDomainList[%d].tagQty", index), NXS_E7_0088, params));
                        }
                    }
                    
                    // 3. order over check
                    // 3.オーダー超えチェック
                    if (CheckUtil.isBlankOrNull(criteriaDomain.getPltzInstrNo())) {
                        // Only in - pltzInstrNo ="", the following checks are performed.
                        // - pltzInstrNo = "" の場合のみ以下のチェックを行う。
                        if (!w2009CmlService.validateConsistencyOver(qty, orderQty)) {
                            Object[] params = {pltzItemno};
                            errList.add(new MessageDomain(String.format("listDomainList[%d].qty", index), NXS_E7_0089, params));
                        }
                    }
                    
                    // 4. directions over check
                    // 4.指示超えチェック
                    if (!CheckUtil.isBlankOrNull(criteriaDomain.getPltzInstrNo())) {
                        // Only in - pltzInstrNo !="", the following checks are performed.
                        // - pltzInstrNo ≠ "" の場合のみ以下のチェックを行う。
                        if (!w2009CmlService.validateConsistencyOverInstr(qty, instrQty, instrPkgedQty)) {
                            Object[] params = {pltzItemno};
                            errList.add(new MessageDomain(String.format("listDomainList[%d].qty", index), NXS_E7_0090, params));
                        }
                    }
                    
                    // 5. SHIPPING-LOT over check (multi-article ITEM NO)  
                    // 5.出荷ロット超えチェック（多品品目番号）
                    if (PKG_FORM_TYP_MULTI.equals(listDomain.getPkgFormTyp())) {
                        // Only in - pkgFormTyp ="M", the following checks are performed.
                        // - pkgFormTyp = "M" の場合のみ以下のチェックを行う。
                        if (!w2009CmlService.validateConsistencyOverShipLotMultiple(qty, tagQty, shipperLot)) {
                            Object[] params = {pltzItemno};
                            errList.add(new MessageDomain(String.format("listDomainList[%d].qty", index), NXS_E7_0091, params));
                            errList.add(new MessageDomain(String.format("listDomainList[%d].tagQty", index), null, null));
                        }
                    }
                    
                    // 6. SHIPPING-LOT over check (single article ITEM NO)  
                    // 6.出荷ロット超えチェック（単品品目番号）
                    if (PKG_FORM_TYP_SINGLE.equals(listDomain.getPkgFormTyp())) {
                        // Only in - pkgFormTyp ="S", the following checks are performed.
                        // - pkgFormTyp = "S" の場合のみ以下のチェックを行う。
                        if (!w2009CmlService.validateConsistencyOver(qty, shipperLot)) {
                            Object[] params = {pltzItemno};
                            errList.add(new MessageDomain(String.format("listDomainList[%d].qty", index), NXS_E7_0091, params));
                        }
                    }
                    
                    // 7.CIGMA information acquisition check
                    // 7.CIGMA情報取得チェック
                    if (!w2009CmlService.validateConsistencyGetCigmaInfo(currCd, qtyUnit, plntCd)) {
                        Object[] params = {pltzItemno};
                        isErrStyleToMixTagNo = true;
                        errList.add(new MessageDomain(null, NXS_E7_0092, params));
                    }
                    
                    // 8. Special-Information number information acquisition check
                    // 8.輸出出荷品目番号情報取得チェック
                    if (!w2009CmlService.validateConsistencyBlankOrNull(itemDescription)) {
                        Object[] params = {pltzItemno};
                        isErrStyleToMixTagNo = true;
                        errList.add(new MessageDomain(null, NXS_E7_0072, params));
                    }
                    
                    // 9. export-formalities ITEM-NO information acquisition check
                    // 9.輸出手続き品目番号情報取得チェック
                    if (!w2009CmlService.validateConsistencyBlankOrNull(dngrItemFlg)) {
                        Object[] params = {pltzItemno};
                        isErrStyleToMixTagNo = true;
                        errList.add(new MessageDomain(null, NXS_E7_0073, params));
                    }
                    
                    // 10. survey WEIGHT check
                    // 10.実測重量チェック
                    if (!w2009CmlService.validateConsistencyBlankOrNull(itemWeight)) {
                        Object[] params = {pltzItemno};
                        isErrStyleToMixTagNo = true;
                        errList.add(new MessageDomain(null, NXS_E7_0154, params));
                    }
                } 
            }
            if (isErrStyleToMixTagNo) {
                listDomain.setMixTagNoErrStyleFlg("1");
            } else {
                listDomain.setMixTagNoErrStyleFlg(null);
            }
        }

        // - Correlation check
        //   - 1. CONTAINER-SORTING-KEY check
        // - 相関チェック
        //   - 1.コンテナ層別キーチェック
        if (!w2009CmlService.validateConsistencyAllSame(countSortKeyList)) {
            errList.add(new MessageDomain(null, NXS_E7_0093, null));
        }
        
        //   - 2. loading position code check
        //   - 2.荷積み位置コードチェック
        if (!w2009CmlService.validateConsistencyStagingCd(loadingCdList)) {
            errList.add(new MessageDomain(null, NXS_E7_0094, null));
        }
        
        //   - 3. Inv. Key check
        //   - 3.インボイスキーチェック
        //     {@link W2009CmlService#validateConsistencyInvSetKey(List)}
        if (!w2009CmlService.validateConsistencyAllSame(invoiceKeyList)) {
            errList.add(new MessageDomain(null, NXS_E7_0095, null));
        }
        
        //   - 4. staging-instruction flag check
        //   - 4.荷揃え指示フラグチェック
        //     {@link W2009CmlService#validateConsistencyAllSame(List)}
        if (!w2009CmlService.validateConsistencyAllSame(stgInstrItemFlgList)) {
            errList.add(new MessageDomain(null, NXS_E7_0096, null));
        }
        
        //   - 5. CUSTOM-TIMING-TYPE check
        //   - 5.通関タイミング区分チェック
        if (!w2009CmlService.validateConsistencyAllSame(ccTypeList)) {
            errList.add(new MessageDomain(null, NXS_E7_0097, null));
        }
        
        //   - 6. C/L check
        //   - 6.コンテナルーズチェック
        //     {@link W2009CmlService#validateConsistencyAllSame(List)}
        if (!w2009CmlService.validateConsistencyAllSame(clList)) {
            errList.add(new MessageDomain(null, NXS_E7_0098, null));
        }
        
        //   - 7. PACKAGE-FORM-TYPE check
        //   - 7.梱包形態チェック
        //     {@link W2009CmlService#validateConsistencyAllSame(List)}
        if (!w2009CmlService.validateConsistencyAllSame(pkgFormTypList)) {
            errList.add(new MessageDomain(null, NXS_E7_0099, null));
        }
        
        //   - 8. currency check
        //   - 8.通貨チェック
        //     {@link W2009CmlService#validateConsistencyAllSame(List)}
        if (!w2009CmlService.validateConsistencyAllSame(currCdList)) {
            errList.add(new MessageDomain(null, NXS_E7_0100, null));
        }
        
        //   - 9. single article ITEM-NO check
        //   - 9.単品品目番号チェック
        //     {@link W2009CmlService#validateConsistencySingleItemNo(List)}
        if (!w2009CmlService.validateConsistencySingleItemNo(pkgFormTypList)) {
            errList.add(new MessageDomain(null, NXS_E7_0051, null));
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
     * - The information on search-condition area is copied to {@link W2009CmlCriteriaDomain}.
     *     The information on each line of a search-results list is copied to {@link W2009CmlItemDomain}, and this is made a list.
     * Make the     above into an argument, and this is  {@link W2009CmlService#validateDatabaseTwPltzItemItemNoOnCreateUpdate(W2009CmlCriteriaDomain, List)}.
     *     It calls and performs the following checks.
     *     - The same Palletize condition check
     *       - CONTAINER-SORTING-KEY check
     *       - Inv. Key check
     *       - staging-instruction flag check
     *       - CUSTOM-TIMING-TYPE check
     *       - C/L check
     *       - PACKAGE-FORM-TYPE check
     *       - Currency check
     *       - loading position code check
     *       - Single article ITEM-NO check
     *     - The registration number check
     * 
     * - {@link W2009CmlCriteriaDomain} に検索条件エリアの情報をコピー
     *   {@link W2009CmlItemDomain} に、 検索結果一覧の各行の情報をコピーしてリストにする
     *   上記を引数にして {@link W2009CmlService#validateDatabaseTwPltzItemItemNoOnCreateUpdate(W2009CmlCriteriaDomain, List)}
     *   を呼出し、以下のチェックを行う。
     *   - 同一パレタイズ条件チェック
     *     - コンテナ層別キーチェック
     *     - インボイスキーチェック
     *     - 荷揃え指示フラグチェック
     *     - 通関タイミング区分チェック
     *     - コンテナルーズチェック
     *     - 梱包形態チェック
     *     - 通貨チェック
     *     - 荷積み位置コードチェック
     *     - 単品品目番号チェック
     *   - 登録件数チェック
     *    
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2011UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // The information on search-condition area is copied.
        // 検索条件エリアの情報をコピー
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        W2011CriteriaDomain w2011Criteria = updateDomain.getCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, w2011Criteria);
        
        // The information on each line of search-results list is copied, and this is made a list.
        // 検索結果一覧の各行の情報をコピーしてリストにする
        List<W2009CmlItemDomain> itemDomainList = new ArrayList<W2009CmlItemDomain>();
        List<? extends W2011ListDomain> w2011List = updateDomain.getListDomainList();
        
        List<MessageDomain> errMsgDomainList = new ArrayList<MessageDomain>();
        
        boolean hasAuthErr = false;
        for (W2011ListDomain w2011item : w2011List) {
            W2009CmlItemDomain domain = new W2009CmlItemDomain();
            CommonUtil.copyPropertiesDomainToDomain(domain, w2011item);
            
            // Authority check
            // 権限チェック
            boolean result = checkAuth(domain, w2011Criteria);
            if (!result) {

                w2011item.setMixTagNoErrStyleFlg("1");
                hasAuthErr = true;
            } else {
                w2011item.setMixTagNoErrStyleFlg(null);
            }
            
            itemDomainList.add(domain);
            
        }
        // Error existence judging
        // エラー有無判定
        if (hasAuthErr) {
            errMsgDomainList.add(new MessageDomain(null, GSCM_I0_0009, null));
            throw new ValidationException(errMsgDomainList);
        }
        

        // A check is performed.
        // チェックを実行
        List<String> errMsgList = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateUpdate(criteria, itemDomainList);
        
        // Error existence judging
        // エラー有無判定

        if (errMsgList == null || errMsgList.size() == 0) {
            // When errorless
            // エラーがない場合
            return;
        } else {
            // When there is an error
            // エラーがある場合
            for (String msgId : errMsgList) {
                errMsgDomainList.add(new MessageDomain(null, msgId, null));
            }
            throw new ValidationException(errMsgDomainList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @SuppressWarnings("unchecked")
    @Override
    protected Void callServices(W2011UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        List<W2009CmlItemDomain> itemDomainList = new ArrayList<W2009CmlItemDomain>();
        List<W2011ListDomain> w2011List = (List<W2011ListDomain>)updateDomain.getListDomainList();
        for (W2011ListDomain w2011item : w2011List) {
            W2009CmlItemDomain domain = new W2009CmlItemDomain();
            CommonUtil.copyPropertiesDomainToDomain(domain, w2011item);
            itemDomainList.add(domain);
        }
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        W2011CriteriaDomain w2011Criteria = updateDomain.getCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, w2011Criteria);
        
        // Registration and update process
        // 登録・更新処理
        w2009CmlService.transactOnCreateUpdate(criteria, itemDomainList);
        
        return null;
    }
    
    /**
     * The authority check to MixTagNo is performed.
     * <br />MixTagNo に対する権限チェックを行います
     * <pre>
     * In the case of a user with the authority of - REGIST ALL
     *       Since this is check needlessness, true is returned.
     *
     * In -, the case of others
     *       In the case of - MixTagFlg = N
     *         Since this is check needlessness, true is returned.
     *
     *       In -, the case of others
     *         List of MixTagNo and update authority {@link UserException}   Use an argument.
     *         {@link W2009CmlService#validateDatabaseTtMixedtagAuthOnCreateUpdate(String, List)} was called.
     *         A result is returned.
     * 
     * - REGIST ALL の権限を持つユーザの場合
     *     チェック不要なのでtrueを返す
     * 
     * - その他の場合
     *     - MixTagFlg = N の場合
     *       チェック不要なのでtrueを返す
     *     
     *     - その他の場合
     *       MixTagNo と 更新権限{@link UserException}のリスト を引数にして
     *       {@link W2009CmlService#validateDatabaseTtMixedtagAuthOnCreateUpdate(String, List)} を呼出した
     *       結果を返す。
     * </pre>
     * @param domain CMLItem domain<br />CMLItem ドメイン
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return This is not MixTagNo or, in with update authority, is true at MixTagNo.<br />MixTagNoでないまたは、MixTagNoで更新権限ありの場合 true
     *         This is false when you have MixTagNo and no update authority.<br />MixTagNoかつ更新権限なしの場合 false
     * @throws ApplicationException When an error occurs during DB processing<br />DB処理中にエラーが発生した場合
     */
    private boolean checkAuth(W2009CmlItemDomain domain, W2011CriteriaDomain criteria) throws ApplicationException {
        if (AUTH_REGISTER_NUMERIC.equals(criteria.getBaseAuthFlg())) {
            return true;
        } else if (FLAG_N.equals(domain.getMixTagFlg())){
            return true;
        } else {
            return w2009CmlService.validateDatabaseTtMixedtagAuthOnCreateUpdate(domain.getMixTagNo(), criteria.getUserAuthList());
        }
    }
    
    /**
     * A string is changed into BigDecimal and returned.
     * <br />文字列をBigDecimalに変換して返す。
     *
     * @param bigDecimaStr The string of BigDecimal<br />BigDecimalの文字列
     * @return The VALUE changed into BigDecimal<br />BigDecimalに変換した値
     *         It null(s) and blank   A case returns null.<br />null、ブランク の場合はnullを返す。
     */
    protected BigDecimal stringToBicDecimal(String bigDecimaStr) {
        BigDecimal retVal = null;
        if (CheckUtil.isBlankOrNull(bigDecimaStr)) {
            return retVal;
        } else {
            // The check of type is carried out by validateItems.
            // 型のチェックはvalidateItemsで実施されている
            return new BigDecimal(bigDecimaStr);
        }
        
    }
}
