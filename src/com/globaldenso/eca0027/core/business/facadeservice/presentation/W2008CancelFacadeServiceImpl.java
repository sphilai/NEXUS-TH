/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2008UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W2005MixTagService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The search service facade implementation class of Multiple Item No. in 1Box PKG Register
 * <br />小箱内多品番梱包Register画面のCancelFacadeサービス実装クラスです。
 * <pre>
 * bean W2008CancelFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2008CancelFacadeServiceImpl extends AbstractTransactFacadeService<Void, W2008UpdateDomain> {

    
    /**
     * Multiple-p/n-packaged-in-box service
     * <br />小箱内多品番梱包サービス
     */
    protected W2005MixTagService w2005MixTagService;
    
    /**
     * constructor.
     */
    public W2008CancelFacadeServiceImpl() {
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
     * - Common error checking
     *       Screen definition document_ECA0027_W2008_Multiple Item No. in 1Box PKG Register.xls "screen item definition" is referred to for details.
     * 
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2008_Multiple Item No. in 1Box PKG Register.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * 
     * - A check among night batch
     *     - Behavior in CIGMA night batch
     *           This is a call about {@link W2005MixTagService#validateDatabaseCigmaAvailable (boolean, String)}.
     *
     * - Existence check
     *     - They are an existence check and a Status check about Mix Tag.
     *           This is a call about {@link W2005MixTagService#validateDatabaseTtMixtagOnRegisterCancel (String)}.
     * 
     * - 夜間バッチ中チェック
     *     - CIGMA夜間バッチ中の振る舞い
     *         {@link W2005MixTagService#validateDatabaseCigmaAvailable(boolean, String)}を呼出
     * 
     * - 存在チェック
     *     - MIXED現品票を存在チェック、ステータスチェック
     *         {@link W2005MixTagService#validateDatabaseTtMixtagOnRegisterCancel(String)}を呼出
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        String shipperCd = updateDomain.getCriteriaDomain().getShipperCd();
        String mixTagNo = updateDomain.getCriteriaDomain().getMixTagNo();
        
        // check among a night batch
        // 夜間バッチ中チェック
        if (!w2005MixTagService.validateDatabaseCigmaAvailable(true, shipperCd)) {
            MessageDomain msg = new MessageDomain("", NXS_E1_0060, null);
            errList.add(msg);
        }
        
        // Existence (Status) check
        // 存在(ステータス)チェック
        String msgId = w2005MixTagService.validateDatabaseTtMixtagOnRegisterCancel(mixTagNo);
        
        if (msgId != null) {
            errList.add(new MessageDomain("", msgId, null));
        }
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * 
     * - Create of a Packaging Instruction (=Pull) domain
     *       {@link W2005MixTagDomain} is created and the following item is set up.
     *         - mixTagNo / MIX TAG NO
     *         - shipperCd / Shipper CD
     *         - lgcyWhCd / LEGACY WAREHOUSE CODE
     *       {@link W2005MixTagItemDomain} is created and the following item is set up.
     *         - itemNo / ITEM NO
     *         - pkgCd / PACKAGE CODE
     *         - qty / PKG QTY
     *       {@link W2005MixTagDomain#setMixTagItemDomainList (List)} is called and associated.
     *
     * - Execution of cancellation processing
     *       {@link W2005MixTagService#transactOnRegisterCancel (W2005MixTagDomain)} is called,
     *       The following is carried out.
     *         Cancellation of an ordering alloc
     *         Delete of data
     *         A Temp Stock is updated.
     *         Registration of an ordering alloc track record (starting of Web service)
     *
     * - Screen change
     *       It carries out by Action.
     * 
     * - 梱包指示ドメインの作成
     *     {@link W2005MixTagDomain}を作成し、下記項目を設定する
     *       - mixTagNo/MIXタグNO
     *       - shipperCd/荷主コード
     *       - lgcyWhCd/LEGACY倉庫コード
     *     {@link W2005MixTagItemDomain}を作成し、下記項目を設定する
     *       - itemNo/品目番号
     *       - pkgCd/包装区分
     *       - qty/梱包数量
     *     {@link W2005MixTagDomain#setMixTagItemDomainList(List)}を呼出し、関連付ける
     *     
     * - キャンセル処理の実行
     *     {@link W2005MixTagService#transactOnRegisterCancel(W2005MixTagDomain)}を呼出し、
     *     以下を実施
     *       受注引当のキャンセル
     *       データの削除
     *       仮在庫を更新する
     *       受注引当実績の登録（Webサービスの起動）
     *     
     * - 画面遷移
     *     Actionで実施
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2008UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // Create of a Packaging Instruction (=Pull) domain
        // 梱包指示ドメインの作成
        W2005MixTagDomain mixTag = createMixTag(updateDomain);
        
        // Execution of cancellation processing
        // キャンセル処理の実行
        w2005MixTagService.transactOnRegisterCancel(mixTag);
        
        return null;
    }

    /**
     * Create a MixTag domain.
     * <br />MixTagドメインを作成します。
     *
     * @param updateDomain Search-condition domain<br />検索条件ドメイン
     * @return MixTag domain<br />MixTagドメイン
     */
    protected W2005MixTagDomain createMixTag(W2008UpdateDomain updateDomain) {
        
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        // A setting of a MixTag domain
        // MixTagドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(mixTag, updateDomain.getCriteriaDomain());
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        
        // A create of a MixTag ITEM-NO domain
        // MixTag品目番号ドメインの作成
        for (W2008ListDomain listDomain : updateDomain.getListDomainList()) {
            W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(mixTagItem, listDomain);
            
            mixTagItemList.add(mixTagItem);
        }
        
        // A setting of a MixTag ITEM-NO domain
        // MixTag品目番号ドメインの設定
        mixTag.setMixTagItemDomainList(mixTagItemList);
        
        return mixTag;
    }
}
