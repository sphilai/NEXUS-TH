/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W7003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7003UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractCreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;


/**
 * The service for Facade Update action of Shipping Actuality Create screen.
 * <br />船積実績Create画面のUpdateアクションに対するFacadeサービスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11611 $
 */
public class W7003UpdateFacadeServiceImpl extends AbstractCreateFacadeService<Integer, W7003UpdateDomain> {

    /**
     * The shipping service performance<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7003UpdateFacadeServiceImpl() {
        super();
    }

    /**
     * Setter method for w7001ShippingActService.
     *
     * @param shippingActService Set for w7001ShippingActService
     */
    public void setW7001ShippingActService(W7001ShippingActService shippingActService) {
        w7001ShippingActService = shippingActService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Line item selection check .
     * </pre>
     * <pre>
     * ‐明細行選択チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7003UpdateDomain filterDomain(W7003UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        List<W7003ListDomain> newListDomainList = new ArrayList<W7003ListDomain>();
        
        // Extract List the selected domain
        // 選択されたListドメインを抽出
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W7003ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            if (CHECK_ON.equals(listDomain.getSelected())) {
                listDomain.setIndex(i);
                newListDomainList.add(listDomain);
            }
        }
        
        // Line item selection check
        // 明細行選択チェック
        if (newListDomainList.size() == 0) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            
            throw new ValidationException(errList);
        }
        
        // Creation of new domain Update
        // 新しいUpdateドメインの作成
        W7003UpdateDomain newUpdateDomain = new W7003UpdateDomain();
        
        // Copy of the property
        // プロパティのコピー
        CommonUtil.copyPropertiesDomainToDomain(newUpdateDomain, updateDomain);
        
        // Set of domain List extracted
        // 抽出したListドメインの設定
        newUpdateDomain.setListDomainList(newListDomainList);
        
        return newUpdateDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W7003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W7003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Select number of data check .
     *     The number of invoices subject to an error greater than 99.
     *     
     * - CIGMA night batch check.
     * </pre>
     * <pre>
     * ‐選択データ件数チェック
     *     対象のインボイスの件数が99件より大きい場合はエラーとする
     * 
     * ‐CIGMA夜間バッチ中チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Creating an Error List
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        // Number that CK is set to ON in the active.
        // CKが活性でONになっている件数
        int activeCheckedCnt = 0;
        // Sum of PKG QTY of data that CK is set to ON in the active.
        // CKが活性でONになっているデータのPKG QTYの合計
        int activePkgQty = 0;
        // Number calculation
        // 件数計算
        for(W7003ListDomain listDomain : updateDomain.getListDomainList()) {
            if(!FLAG_Y.equals(listDomain.getDisabledFlg())) {
                activeCheckedCnt++;
                activePkgQty += Integer.parseInt(listDomain.getPltzItemQty());
            }
        }

        String dscId = updateDomain.getLoginUserDscId();
        String shipperCd = updateDomain.getCriteriaDomain().getShipperCd();
        String dateFormat = updateDomain.getCriteriaDomain().getScreenDateFormat();
        
        // Error parameters
        // エラー時パラメータ
        String[] params = new String[2];
        // Select number of data check
        // 選択データ件数チェック
        String msgId = w7001ShippingActService.validateDatabaseTwShippingActInvoiceOnCreateUpdate(dscId, activeCheckedCnt, activePkgQty, params);
        if(msgId != null) {
            MessageDomain msg = new MessageDomain("", msgId, params);
            errorList.add(msg);
        }
        
        // CIGMA night batch check
        // CIGMA夜間バッチ中チェック
        for(W7003ListDomain listDomain : updateDomain.getListDomainList()) {
            String invoiceNo = listDomain.getInvoiceNo();
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
            //String invoiceIssueDt = listDomain.getInvoiceIssueDt();
            Date invoiceIssueDt = listDomain.getInvoiceIssueDt();
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
            String errCd = w7001ShippingActService.validateDatabaseCigmaAvailable(false, shipperCd, invoiceNo, invoiceIssueDt, dateFormat);
            if (errCd != null){
                MessageDomain msg = new MessageDomain("", errCd, null);
                errorList.add(msg);
                break;
            }
        }
        
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Register a record shipment target invoice work .
     * - Conditions domain creation of shipment service performance.
     *     Convert to the {@link W7003UpdateDomain}を{@link W7001ShippingActCriteriaDomain}.
     *     
     * - Registration process of checking data .
     *     Call the {@link W7001ShippingActService#createOnCreateUpdate(List)}.
     * </pre>
     * <pre>
     * 船積実績対象インボイスワークを登録
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7003UpdateDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     * 
     * ‐チェックデータの登録処理
     *     {@link W7001ShippingActService#createOnCreateUpdate(List)}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W7003UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        // Conditions domain creation of shipment service performance.
        // 船積実績サービスの条件ドメイン作成
        List<? extends W7001ShippingActInvoiceDomain> shippingActInvoiceList = createShippingActInvoiceList(updateDomain);
        
        // Registration process of checking data
        // チェックデータの登録処理
        return w7001ShippingActService.createOnCreateUpdate(shippingActInvoiceList);
    }
    
    /**
     * 
     * Create the condition of shipment domain service performance.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param updateDomain Mass update of domain shipment performance Create screen<br />
     * 船積実績Create画面の一括更新ドメイン
     * @return List of conditions domain of shipment service performance<br />
     * 船積実績サービスの条件ドメインのリスト
     */
    protected List<? extends W7001ShippingActInvoiceDomain> createShippingActInvoiceList(W7003UpdateDomain updateDomain) {
        List<W7001ShippingActInvoiceDomain> shippingActInvoiceList = new ArrayList<W7001ShippingActInvoiceDomain>();
        
        // Search Results Area
        // 検索結果エリア
        for(W7003ListDomain listDomain : updateDomain.getListDomainList()) {
            W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(shippingActInvoiceDomain, listDomain, updateDomain.getCriteriaDomain().getScreenDateFormat());
            // Login DSC-ID
            // ログインDSC-ID
            shippingActInvoiceDomain.setDscId(updateDomain.getLoginUserDscId());
            // Shipper code
            // 荷主コード
            shippingActInvoiceDomain.setShipperCd(updateDomain.getCriteriaDomain().getShipperCd());
            
            shippingActInvoiceList.add(shippingActInvoiceDomain);
        }
        
        return shippingActInvoiceList;
    }
}
