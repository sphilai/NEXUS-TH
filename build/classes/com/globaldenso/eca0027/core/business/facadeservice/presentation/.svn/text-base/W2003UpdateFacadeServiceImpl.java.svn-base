/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2003UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W2001PltzInstrService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0035;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0072;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0040;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0034;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0042;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TW_PLTZ_INSTR_ITEM_NO_MAX_COUNT;;


/**
 * This is an implement class of the Facade service to Update action of a Packaging Instruction (=Pull) Create screen.
 * <br />梱包指示Create画面のUpdateアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w2003UpdateFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public class W2003UpdateFacadeServiceImpl extends AbstractTransactFacadeService<Void, W2003UpdateDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Packaging Instruction (=Pull) service
     * <br />梱包指示サービス
     */
    protected W2001PltzInstrService w2001PltzInstrService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2003UpdateFacadeServiceImpl() {
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
     * Setter method for w2001PltzInstrService.
     *
     * @param pltzInstrService Set for w2001PltzInstrService
     */
    public void setW2001PltzInstrService(W2001PltzInstrService pltzInstrService) {
        w2001PltzInstrService = pltzInstrService;
    }

    /**
     * {@inheritDoc}
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
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2003UpdateDomain filterDomain(W2003UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        List<W2003ListDomain> newListDomainList = new ArrayList<W2003ListDomain>();
        
        // selected List domain is extracted.
        // 選択されたListドメインを抽出
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2003ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
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
        W2003UpdateDomain newUpdateDomain = new W2003UpdateDomain();
    
        // Copy of property
        // プロパティのコピー
        CommonUtil.copyPropertiesDomainToDomain(newUpdateDomain, updateDomain);
        
        // extracted setting of a List domain
        // 抽出したListドメインの設定
        newUpdateDomain.setListDomainList(newListDomainList);
        
        return newUpdateDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * 
     * - Common error checking
     *       Screen definition document_ECA0027_W2003_Palletize Instruction Create.xls "a screen item definition" is referred to for details.
     *  
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2003_Palletize Instruction Create.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2003ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            Validator<W2003ListDomain> valid
                = new Validator<W2003ListDomain>(listDomain, "listDomainList", listDomain.getIndex());
    
            // Unary eye check
            // 単項目チェック
            String[] properties = { 
                "instrQty",
            };
            valid.isValidateProperties(properties, SCREEN_ID_W2003);

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
     * {@inheritDoc}
     * <pre>
     * - QUANTITY check
     *       It checks by calling {@link W2001PltzInstrService#validateConsistencyInstrActQty(int)}.
     *
     * - Order over check
     *       It checks by calling {@link W2001PltzInstrService#validateConsistencyInstrActQtyOver(int, int)}.
     *
     * - Export-Shipping-Item-No information acquisition check
     *       It checks by calling {@link W2001PltzInstrService#validateConsistencyItemNm(String)}.
     *
     * - Package-Specification-Revision-Master registration check
     *       It checks by calling {@link W2001PltzInstrService#validateConsistencyShipLot(String)}.
     *
     * - Item MA registration check
     *       It checks by calling {@link W2001PltzInstrService#validateConsistencyLotSize(String)}.
     * 
     * - 数量チェック
     *     {@link W2001PltzInstrService#validateConsistencyInstrActQty(int)}を呼出し、チェックを行う
     *     
     * - オーダー超えチェック
     *     {@link W2001PltzInstrService#validateConsistencyInstrActQtyOver(int, int)}を呼出し、チェックを行う
     *     
     * - 輸出出荷品番情報取得チェック
     *     {@link W2001PltzInstrService#validateConsistencyItemNm(String)}を呼出し、チェックを行う
     *     
     * - 包装仕様有効リビジョン原単位登録チェック
     *     {@link W2001PltzInstrService#validateConsistencyShipLot(String)}を呼出し、チェックを行う
     *     
     * - Item MA登録チェック
     *     {@link W2001PltzInstrService#validateConsistencyLotSize(String)}を呼出し、チェックを行う
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        Locale locale = updateDomain.getLocale();
        
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2003ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            // Acquisition of an object item
            // 対象項目の取得
            String shippingLot = listDomain.getShippingLot();
            int instrQty = Integer.parseInt(listDomain.getInstrQty());
            int sumQty = Integer.parseInt(listDomain.getSummaryOrder());
            String itemDescription = listDomain.getItemDescription();
            String boxLotQty = listDomain.getBoxLotQty();
            int onHandQty = Integer.parseInt(listDomain.getOnHandQty());
            String ignoreWarnings = updateDomain.getIgnoreWarnings();
            
            String instrQtyProperty = String.format("listDomainList[%d].instrQty", listDomain.getIndex());
            String itemNoProperty = String.format("listDomainList[%d].itemNo", listDomain.getIndex());
            
            // QUANTITY check
            // 数量チェック
            if (!w2001PltzInstrService.validateConsistencyInstrActQty(instrQty)) {
                Object[] params = {
                    commonService.getResource(locale, "label.instrQty"),
                    listDomain.getItemNo()
                };
                
                errList.add(new MessageDomain(instrQtyProperty, NXS_E7_0006, params));
            }
            
            // Order over check
            // オーダー超えチェック
            if (!w2001PltzInstrService.validateConsistencyInstrActQtyOver(instrQty, sumQty)) {
                Object[] params = {
                    listDomain.getItemNo()
                };
                errList.add(new MessageDomain(instrQtyProperty, NXS_E7_0007, params));
            }
            
            // Export-Shipping-Item-No information acquisition check
            // 輸出出荷品番情報取得チェック
            if (!w2001PltzInstrService.validateConsistencyItemNm(itemDescription)) {
                Object[] params = {
                    listDomain.getItemNo()
                };
                errList.add(new MessageDomain(itemNoProperty, NXS_E7_0072, params));
            }
            
            // Package-Specification-Revision-Master registration check
            // 包装仕様有効リビジョン原単位登録チェック
            if (!w2001PltzInstrService.validateConsistencyShipLot(shippingLot)) {
                Object[] params = {
                    listDomain.getItemNo()
                };
                errList.add(new MessageDomain(itemNoProperty, NXS_E1_0040, params));
            }
            
            // Item MA registration check
            // Item MA登録チェック
            if (!w2001PltzInstrService.validateConsistencyLotSize(boxLotQty)) {
                Object[] params = {
                    listDomain.getItemNo()
                };
                errList.add(new MessageDomain(itemNoProperty, NXS_E1_0034, params));
            }
            
            // Warning check
            // Warningチェック
            if (!w2001PltzInstrService.validateConsistencyWarningIgnoreWarnings(ignoreWarnings, instrQty, onHandQty)) {
                Object[] params = {
                    commonService.getResource(locale, "label.instrQty")
                };
                errList.add(new MessageDomain(instrQtyProperty, NXS_E1_0042, params));
            }
        }
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - The registration number check
     *       It checks by calling {@link W2001PltzInstrService#validateDatabaseTwPltzInstrItemNoOnCreateUpdate(String, int)}.
     * 
     * - 登録件数チェック
     *     {@link W2001PltzInstrService#validateDatabaseTwPltzInstrItemNoOnCreateUpdate(String, int)}を呼出し、チェックを行う
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        String dscId = updateDomain.getLoginUserDscId();
        int registerCount = getRegisterCount(updateDomain.getListDomainList());
        
        // The registration number check
        // 登録件数チェック
        if (!w2001PltzInstrService.validateDatabaseTwPltzInstrItemNoOnCreateUpdate(dscId, registerCount)) {
            Object[] params = {
                TW_PLTZ_INSTR_ITEM_NO_MAX_COUNT
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
     * {@inheritDoc}
     * <pre>
     * A create of - Palletize Instruction Item No Work
     *       {@link W2003ListDomain} is changed into {@link W2001PltzInstrItemDomain}.
     *
     * The registration and the update of - Palletize Instruction Item No Work
     *       {@link W2001PltzInstrService#transactOnCreateUpdate(List)} is called.
     * 
     * - 梱包指示品目番号ワークの作成
     *     {@link W2003ListDomain}を{@link W2001PltzInstrItemDomain}に変換する
     * 
     * - 梱包指示品目番号ワークの登録・更新
     *     {@link W2001PltzInstrService#transactOnCreateUpdate(List)}を呼出す
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2003UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {

        // A create of Palletize Instruction Item No Work
        // 梱包指示品目番号ワークの作成
        List<? extends W2001PltzInstrItemDomain> pltzInstrItemList = createPltzInstrItem(updateDomain.getListDomainList());
        
        // The registration and the update of Palletize Instruction Item No Work
        // 梱包指示品目番号ワークの登録・更新
        w2001PltzInstrService.transactOnCreateUpdate(updateDomain.getShipperCd(), pltzInstrItemList);
        
        return null;
    }
    
    /**
     * The record count which carries out new registration is acquired.
     * <br />新規登録するレコード数を取得します。
     *
     * @param listDomainList List domain<br />Listドメイン
     * @return Record count which carries out new registration<br />新規登録するレコード数
     */
    protected int getRegisterCount(List<? extends W2003ListDomain> listDomainList) {
        int registerCount = 0;
        
        for (W2003ListDomain listDomain : listDomainList) {
            String selected = listDomain.getSelected();
            String disabledFlg = listDomain.getDisabledFlg();
            
            if (CHECK_ON.equals(selected) && FLAG_N.equals(disabledFlg)) {
                registerCount++;
            }
        }
        
        return registerCount;
    }
    
    /**
     * {@link W2003ListDomain} is changed into {@link W2001PltzInstrItemDomain}.
     * <br />{@link W2003ListDomain}を{@link W2001PltzInstrItemDomain}に変換します。
     *
     * @param listDomainList List domain<br />Listドメイン
     * @return {@link W2001PltzInstrItemDomain}
     */
    protected List<? extends W2001PltzInstrItemDomain> createPltzInstrItem(List<? extends W2003ListDomain> listDomainList) {
        List<W2001PltzInstrItemDomain> pltzInstrItemList = new ArrayList<W2001PltzInstrItemDomain>();

        // A create of Palletize Instruction Item No Work
        // 梱包指示品目番号ワークの作成
        for (W2003ListDomain listDomain : listDomainList) {
            W2001PltzInstrItemDomain pltzInstrItem = new W2001PltzInstrItemDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(pltzInstrItem, listDomain);
            
            pltzInstrItemList.add(pltzInstrItem);
        }
        
        return pltzInstrItemList;
    }
}
