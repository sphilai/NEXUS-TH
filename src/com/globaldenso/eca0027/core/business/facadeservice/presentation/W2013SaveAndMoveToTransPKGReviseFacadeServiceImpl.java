/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0068;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0087;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0110;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0149;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0011; // 暫定 Provisional 
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2013;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2013ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2013UpdateDomain;
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
 * This is an implement class of the Facade service to SaveAndMoveToTransPKGRevise action of a CML PKG Info Detail screen.
 * <br />CML PKG Info Detail画面のSaveAndMoveToTransPKGReviseアクションに対する Facadeサービスの実装クラスです。
 * <pre>
 * bean id : w2013SaveAndMoveToTransPKGReviseFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class W2013SaveAndMoveToTransPKGReviseFacadeServiceImpl extends
    AbstractTransactFacadeService<Void, W2013UpdateDomain> {

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
    public W2013SaveAndMoveToTransPKGReviseFacadeServiceImpl() {
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
     * - Zero-affair check
     * - 0件チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2013UpdateDomain filterDomain(W2013UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        // An error is used when one affair does not have effective line, either.
        // In the case only of the null line when all the line cuts are carried out
        // 有効行が1件もない場合エラーにする。
        // 全行削除されている場合または、空行のみの場合。
        boolean hasValidLine  = false;
        if (updateDomain.getListDomainList() == null || updateDomain.getListDomainList().isEmpty()) {
            hasValidLine = false;
        } else {
            for (W2013ListDomain domain : updateDomain.getListDomainList()) {
                if (!CheckUtil.isBlankOrNull(domain.getPkgItemNo()) || !CheckUtil.isBlankOrNull(domain.getQty())) {
                    hasValidLine = true;
                    break;
                }
            }
        }
        // When there is no effective line
        // 有効行がない場合
        // UT110 TRIAL SHIPMENT/号試品対応 MOD if
        if (!hasValidLine && !FLAG_Y.equals(updateDomain.getCriteriaDomain().getManualRegFlg())) {
            String[] params = {commonService.getResource(updateDomain.getLocale(), "label.pkgItemNo") };
            List <MessageDomain> errors = new ArrayList<MessageDomain>();
            errors.add(new MessageDomain(null, GSCM_E0_0011, params));
            throw new ValidationException(errors);
        }
        
        return updateDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Unary eye check
     * - 単項目チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2013UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        // UT110 TRIAL SHIPMENT/号試品対応 ADD
        if (updateDomain.getListDomainList() == null || updateDomain.getListDomainList().isEmpty()) {
            return;
        }
        
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2013ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            Validator<W2013ListDomain> valid
                = new Validator<W2013ListDomain>(listDomain, "listDomainList", i);
    
            // Unary eye check 
            // 単項目チェック
            String[] properties = { 
                "pkgItemNo",
                "qty"
            };
            valid.isValidateProperties(properties, SCREEN_ID_W2013);

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
     * - Item input check
     *     pkgItemNo, qty, and mixTagNo are set to an argument.
     *     {@link W2009CmlService#validateConsistencyDetailPackageItemNoQTY(String, String, String)} is called.
     *
     * - The minimum QUANTITY check
     *     qty and mixTagNo are set to an argument.
     *     {@link W2009CmlService#validateConsistencyDetailQTY(String, String)} is called.
     *
     * - The amount check of maximum numbers
     *     totalQty is set to an argument.
     *     {@link W2009CmlService#validateConsistencyDetailQTYMax(BigDecimal)} is called.
     * - 項目入力チェック
     *   引数に pkgItemNo, qty, mixTagNo を設定し
     *   {@link W2009CmlService#validateConsistencyDetailPackageItemNoQTY(String, String, String)}を呼出す。
     *   
     * - 最少数量チェック
     *   引数に qty, mixTagNo を設定し
     *   {@link W2009CmlService#validateConsistencyDetailQTY(String, String)}を呼出す。
     * 
     * - 最大数量チェック
     *   引数に totalQty を設定し
     *   {@link W2009CmlService#validateConsistencyDetailQTYMax(BigDecimal)}を呼出す。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2013UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        Map<String, BigDecimal> pkgItemNoTotalQty = new HashMap<String, BigDecimal>();
        Map<String, List<Integer>> itemNoIndexMap = new HashMap<String, List<Integer>>();
        
        // UT110 TRIAL SHIPMENT/号試品対応 ADD
        if (updateDomain.getListDomainList() == null || updateDomain.getListDomainList().isEmpty()) {
            return;
        }
        
        int i = 0;
        for (W2013ListDomain w2013ListDomain : updateDomain.getListDomainList()) {
            String pkgItemNo = w2013ListDomain.getPkgItemNo();
            String qty = w2013ListDomain.getQty();
            String mixTagNo = w2013ListDomain.getMixTagNo();
            
            if (!w2009CmlService.validateConsistencyDetailPackageItemNoQTY(pkgItemNo, qty, mixTagNo)) {
                if (CheckUtil.isBlankOrNull(pkgItemNo)) {
                    MessageDomain errMsg = new MessageDomain(String.format("listDomainList[%d].pkgItemNo", i), NXS_E7_0068, null);
                    errorList.add(errMsg);
                } else {
                    MessageDomain errMsg = new MessageDomain(String.format("listDomainList[%d].qty", i), NXS_E7_0068, null);
                    errorList.add(errMsg);
                }
            }
            
            if (!w2009CmlService.validateConsistencyDetailQTY(qty, mixTagNo)) {
                String[] params  = { pkgItemNo };
                MessageDomain errMsg = new MessageDomain(String.format("listDomainList[%d].pkgItemNo", i) , NXS_E7_0087, params);
                errorList.add(errMsg);
            }
            
            if (!CheckUtil.isBlankOrNull(pkgItemNo) && !CheckUtil.isBlankOrNull(qty) && CheckUtil.isNumeric(qty)) {
                BigDecimal decimalQty = new BigDecimal(qty);
                    
                if (pkgItemNoTotalQty.containsKey(pkgItemNo)) {
                    // when there is already data of the same number: Add a totalled value.
                    // 既に同一番号のデータがある場合：合計値を加算する
                    BigDecimal total = pkgItemNoTotalQty.get(pkgItemNo);
                    decimalQty = decimalQty.add(total);
                    itemNoIndexMap.get(pkgItemNo).add(i);
                } else {
                    List<Integer> indexList = new ArrayList<Integer>();
                    indexList.add(i);
                    itemNoIndexMap.put(pkgItemNo, indexList);
                }
                pkgItemNoTotalQty.put(pkgItemNo, decimalQty);
            }
            
            i = i + 1;
        }
        
        // This is confirmed whether the QUANTITY VALUE totalled value for every same 品番 is over the maximum (9999999).
        // 同一品番ごとの数量値合計値が最大値(9999999)を超過していないかチェックする
        if (!pkgItemNoTotalQty.isEmpty()) {
            Set<String> totalQty = pkgItemNoTotalQty.keySet();
            Iterator<String> itr = (Iterator<String>) totalQty.iterator();
            while (itr.hasNext()) {
                String pkgItemNo = (String) itr.next();
                BigDecimal total = (BigDecimal) pkgItemNoTotalQty.get(pkgItemNo);
                
                if (!w2009CmlService.validateConsistencyDetailQTYMax(total)) {
                    List<Integer> errIndexList = itemNoIndexMap.get(pkgItemNo);
                    String[] params  = { pkgItemNo };
                    MessageDomain errMsg = new MessageDomain(null, NXS_E7_0110, params);
                    errorList.add(errMsg);
                    for (Integer idx : errIndexList) {
                        MessageDomain errCell = new MessageDomain(String.format("listDomainList[%d].qty", idx) , null, null);
                        errorList.add(errCell);
                    }
                }
            }
        }
        
        // error output
        // エラー出力
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * Packing-material existence check
     * 包装材存在チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2013UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        String shipperCd = updateDomain.getCriteriaDomain().getShipperCd();
        
        // UT110 TRIAL SHIPMENT/号試品対応 ADD
        if (updateDomain.getListDomainList() == null || updateDomain.getListDomainList().isEmpty()) {
            return;
        }
        
        int i = 0;
        for (W2013ListDomain w2013ListDomain : updateDomain.getListDomainList()) {
            String pkgItemNo = w2013ListDomain.getPkgItemNo();
            if (!CheckUtil.isBlankOrNull(pkgItemNo) && !w2009CmlService.validateDatabaseTmPkgMaterialsOnDetail(shipperCd, pkgItemNo)) {
                String[] params = { pkgItemNo };
                MessageDomain errMsg = new MessageDomain(String.format("listDomainList[%d].pkgItemNo", i) , NXS_E7_0149, params );
                errorList.add(errMsg);
            }
            i = i + 1;
        }
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     *   - Delete process of - Palletize Item Package Work
     *   - Registration of packing specification data
     *   - Registration of an additional Packing material
     *   - パレタイズ対象品PKGワークの削除処理
     *   - 包装仕様データの登録
     *   - 追加包装材の登録
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2013UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, updateDomain.getCriteriaDomain());
        criteria.setLoginUserDscId(updateDomain.getLoginUserDscId());  // DSC_ID
        List<? extends W2013ListDomain> listDomain = updateDomain.getListDomainList();
           
        List<W2009CmlItemDomain> list = new ArrayList<W2009CmlItemDomain>();
        if (listDomain != null) {
            for (W2013ListDomain w2013ListDomain : listDomain) {
                W2009CmlItemDomain itemDomain = new W2009CmlItemDomain();
                CommonUtil.copyPropertiesDomainToDomain(itemDomain, w2013ListDomain);
                list.add(itemDomain);
            }
        }
        // Palletize-Item-Work data is deleted.
        // Registration of packing specification data
        // Registration of an additional Packing material
        // パレタイズ対象品ワークデータを削除
        // 包装仕様データの登録
        // 追加包装材の登録
        w2009CmlService.transactOnDetailSaveMoveTo(criteria, list);
        
        return null;
    }

}
