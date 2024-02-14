/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2004UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W2001PltzInstrService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0012;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;

/**
 * This is an implement class of the Facade service to Cancel action of a Packaging Instruction (=Pull) Register screen.
 * <br />梱包指示Register画面のCancelアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w2004CancelFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2004CancelFacadeServiceImpl extends AbstractTransactFacadeService<Void, W2004UpdateDomain> {

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
    public W2004CancelFacadeServiceImpl() {
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
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2004UpdateDomain filterDomain(W2004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }
    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * A check among - night batch
     *       It checks by calling {@link W2001PltzInstrService#validateDatabaseCigmaAvailable (boolean, String)}.
     *
     * - Packaging Instruction (=Pull)'s existence (Status) check
     *       It checks by calling {@link W2001PltzInstrService#validateDatabaseTtPltzInstrOnRegisterCancel (String)}.
     *
     * - Mix-Tag check
     *       It checks by calling {@link W2001PltzInstrService#validateDatabaseTtMixTagOnRegisterCancel (String)}.
     * 
     * - 夜間バッチ中チェック
     *     {@link W2001PltzInstrService#validateDatabaseCigmaAvailable(boolean, String)}を呼出し、チェックを行う
     * 
     * - 梱包指示の存在(ステータス)チェック
     *     {@link W2001PltzInstrService#validateDatabaseTtPltzInstrOnRegisterCancel(String)}を呼出し、チェックを行う
     *     
     * - MIXED現品票チェック
     *     {@link W2001PltzInstrService#validateDatabaseTtMixTagOnRegisterCancel(String)}を呼出し、チェックを行う
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        // Acquisition of an input value
        // 入力値の取得
        String shipperCd = updateDomain.getCriteriaDomain().getShipperCd();
        String pltzInstrNo = updateDomain.getCriteriaDomain().getPltzInstrNo();
        
        // check among a night batch
        // 夜間バッチ中チェック
        if (!w2001PltzInstrService.validateDatabaseCigmaAvailable(true, shipperCd)) {
            errList.add(new MessageDomain("", NXS_E1_0060, null));
        }
        
        // Packaging Instruction (=Pull)'s existence (Status) check
        // 梱包指示の存在(ステータス)チェック
        String msgId = w2001PltzInstrService.validateDatabaseTtPltzInstrOnRegisterCancel(pltzInstrNo);
        
        if (msgId != null) {
            errList.add(new MessageDomain("", msgId, null));
        }
        
        // Mix-Tag check
        // MIXED現品票チェック
        if (!w2001PltzInstrService.validateDatabaseTtMixTagOnRegisterCancel(pltzInstrNo)) {
            errList.add(new MessageDomain("", NXS_E1_0012, null));
        }
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create of a Packaging Instruction (=Pull) domain
     *       {@link W2001PltzInstrDomain} is created and the following item is set up.
     *         - Packaging Instruction (=Pull) NO
     *         - Shipper CD
     *         - LEGACY WAREHOUSE CODE
     *       {@link W2001PltzInstrItemDomain} is created and the following item is set up.
     *         - ITEM NO
     *         - PACKAGE CODE
     *         - INSTRUCTION QUANTITY
     *       {@link W2001PltzInstrDomain#setPltzInstrItemList (List)} is called and associated.
     *
     * - Execution of cancellation processing
     *       {@link W2001PltzInstrService#transactOnRegisterCancel(W2001PltzInstrDomain)} is called for created {@link W2001PltzInstrDomain} to an argument.
     *       
     * - 梱包指示ドメインの作成
     *     {@link W2001PltzInstrDomain}を作成し、下記項目を設定する
     *       - 梱包指示NO
     *       - 荷主コード
     *       - LEGACY倉庫コード
     *     {@link W2001PltzInstrItemDomain}を作成し、下記項目を設定する
     *       - 品目番号
     *       - 包装区分
     *       - 梱包指示数量
     *     {@link W2001PltzInstrDomain#setPltzInstrItemList(List)}を呼出し、関連付ける
     *       
     * - キャンセル処理の実行
     *     作成した{@link W2001PltzInstrDomain}を引数に、{@link W2001PltzInstrService#transactOnRegisterCancel(W2001PltzInstrDomain)}を呼出す
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2004UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {

        // Create of a Packaging Instruction (=Pull) domain
        // 梱包指示ドメインの作成
        W2001PltzInstrDomain pltzInstr = createPltzInstr(updateDomain);
        
        // Execution of cancellation processing
        // キャンセル処理の実行
        w2001PltzInstrService.transactOnRegisterCancel(pltzInstr);
        
        return null;
    }
    
    /**
     * A Packaging Instruction (=Pull) domain is created.
     * <br />梱包指示ドメインを作成します。
     *
     * @param updateDomain The search-condition domain of a Packaging Instruction (=Pull) Register screen<br />梱包指示Register画面の検索条件ドメイン
     * @return Packaging Instruction (=Pull) domain<br />梱包指示ドメイン
     */
    protected W2001PltzInstrDomain createPltzInstr(W2004UpdateDomain updateDomain) {
        W2001PltzInstrDomain pltzInstr = new W2001PltzInstrDomain();

        // Setting of a Packaging Instruction (=Pull) domain
        // 梱包指示ドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(pltzInstr, updateDomain.getCriteriaDomain(), updateDomain.getScreenDateFormat());
        
        List<W2001PltzInstrItemDomain> pltzInstrItemList = new ArrayList<W2001PltzInstrItemDomain>();
        
        // Create of a Palletize-Instruction-Item-No domain
        // 梱包指示品目番号ドメインの作成
        for (W2004ListDomain listDomain : updateDomain.getListDomainList()) {
            W2001PltzInstrItemDomain pltzInstrItem = new W2001PltzInstrItemDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(pltzInstrItem, listDomain);
            
            pltzInstrItemList.add(pltzInstrItem);
        }
        
        // Setting of a Palletize-Instruction-Item-No domain
        // 梱包指示品目番号ドメインの設定
        pltzInstr.setPltzInstrItemList(pltzInstrItemList);
        
        return pltzInstr;
    }
}
