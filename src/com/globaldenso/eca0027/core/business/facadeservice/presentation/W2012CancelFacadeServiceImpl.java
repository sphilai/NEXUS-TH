/*
 * Project  : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2012ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * This is an implement class of the Facade service to Cancel action of a CML Register screen.
 * <br />CML Register画面のCancelアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id : w2012CancelFacadeService
 * </pre>
 *
 * @author $Author : tamaki-f $
 * @version $Revision : 5365 $
 */
public class W2012CancelFacadeServiceImpl extends AbstractTransactFacadeService<List<? extends W2012ListDomain>, W2012CriteriaDomain> {

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
    public W2012CancelFacadeServiceImpl() {
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
     * - No Action
     * 
     * - 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2012CriteriaDomain filterDomain(
        W2012CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No Action
     * 
     * - 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2012CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No Action
     * 
     * - 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2012CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A check among - night batch
     *       It checks by calling {@link W2009CmlService#validateDatabaseCigmaAvailable(boolean, String)}.
     *
     * - The relation of a Palletize is checked.
     *     A MAIN MARK is made into an argument and {@link W2009CmlService#validateDatabaseTtPltzOnRegisterCancel(String)} is called,
     *     The following checks are performed.
     *       - Palletize check
     *       - Palletize-Item check
     *       - Palletize-Item-Receive-Order check
     *       - Palletize-Item-KANBAN check
     *
     * - The relation of a Packaging Instruction (=Pull) is checked.
     *     A Palletize Instr. No. is made into an argument and {@link W2009CmlService#validateDatabaseTtPltzInstrOnRegisterCancel(String)} is called,
     *     The following checks are performed.
     *     - Packaging Instruction (=Pull) check
     *     - Palletize-Instruction-Item-No check
     * 
     * - 夜間バッチ中チェック
     *     {@link W2009CmlService#validateDatabaseCigmaAvailable(boolean, String)}を呼出し、チェックを行う
     * 
     * - パレタイズの関連をチェック
     *   メインマークを引数にして、{@link W2009CmlService#validateDatabaseTtPltzOnRegisterCancel(String)}を呼出し、
     *   以下のチェックを行う。
     *     - パレタイズチェック
     *     - パレタイズ対象品チェック
     *     - パレタイズ対象品受注情報チェック
     *     - パレタイズ対象品かんばん情報チェック
     *
     * - 梱包指示の関連をチェック
     *   梱包指示No を引数にして、{@link W2009CmlService#validateDatabaseTtPltzInstrOnRegisterCancel(String)}を呼出し、
     *   以下のチェックを行う。
     *   - 梱包指示チェック
     *   - 梱包指示品目番号チェック
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2012CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // Acquisition of an input value
        // 入力値の取得
        String shipperCd = criteriaDomain.getShipperCd();
        String mainMark = criteriaDomain.getMainMark();
        String pltzInstrNo = criteriaDomain.getPltzInstrNo();

        // check among a night batch
        // 夜間バッチ中チェック
        if (!w2009CmlService.validateDatabaseCigmaAvailable(true, shipperCd)) {
            errList.add(new MessageDomain("", NXS_E1_0060, null));
        }

        // The relation of Palletize is checked.
        // パレタイズの関連をチェック
        List<String> errMsgIdList = w2009CmlService
            .validateDatabaseTtPltzOnRegisterCancel(mainMark);
        if (errMsgIdList != null && errMsgIdList.size() > 0) {
            for (String errMsgId : errMsgIdList) {
                errList.add(new MessageDomain(null, errMsgId, null));
            }
        }

        // The relation of Packaging Instruction (=Pull) is checked.
        // 梱包指示の関連をチェック
        String errMsgId = w2009CmlService
            .validateDatabaseTtPltzInstrOnRegisterCancel(pltzInstrNo);
        if (!CheckUtil.isBlankOrNull(errMsgId)) {
            errList.add(new MessageDomain(null, errMsgId, null));
        }
        
        if (errList.size() > 0) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create of a Packaging Instruction (=Pull) domain
     *       {@link W2009CmlCriteriaDomain} is created and the following item is set up.
     *         - MAIN MARK
     *         - Packaging Instruction (=Pull) NO
     *       - shipperCd
     *       - lgcyWhCd
     * - Execution of cancellation processing
     *     To an argument, this is a call about {@link W2009CmlService#transactOnRegisterCancel(W2009CmlCriteriaDomain)} in created {@link W2009CmlCriteriaDomain}.
     *     The following processings are performed.
     *
     *     - Cancellation of an ordering alloc
     *         The number of orders received is returned from the ordering data which exists in a Palletize Item Receive Order.
     *         "Ordering .PLTZ_ALLOC_QTY - Palletize-Item-Receive-Order .ALLOC_QTY" is performed.
     *         * [7]   : It carries out, only when Palletize Instr. No. is "."
     *         Palletize Item
     *         Palletize Item Receive Order
     *
     *     - The number of orders received is returned.
     *         Export Receive Order
     *
     *     - Cancellation of a Palletize-Instruction-Item-No ordering alloc
     *         The number of orders received is returned from the ordering data which exists in a Palletize Item Receive Order.
     *         "PACKED_QTY - ALLOC_QTY" is performed.
     *         It carries out, only when *[7]:Palletize Instr. No. is not "."
     *
     *     - A packed up number is returned.
     *         Palletize Instruction Receive Order
     *
     *     - Update of data
     *         Palletize Instruction Receive Order
     *
     *     - Update of a PACKED QUANTITY
     *         Palletize Instruction Item No
     *
     *     Update of - PALLETIZE INSTRUCTION STATUS
     *         Palletize Instruction Item No
     *
     *     Update of - MULTI ITEM NO IN BOX STATUS
     *         Mix Tag
     *
     *     - A Temp Stock is updated.
     *         Temp Stock
     *
     * - Screen change
     * 
     * - 梱包指示ドメインの作成
     *     {@link W2009CmlCriteriaDomain}を作成し、下記項目を設定する
     *       - メインマーク
     *       - 梱包指示NO
     *       - shipperCd
     *       - lgcyWhCd
     * - キャンセル処理の実行
     *   作成した{@link W2009CmlCriteriaDomain}を引数に、{@link W2009CmlService#transactOnRegisterCancel(W2009CmlCriteriaDomain)}を呼出し
     *   以下の処理を行う。
     *   
     *   - 受注引当のキャンセル
     *       パレタイズ対象品受注情報に存在する受注データから受注数を戻す
     *       「受注.PLTZ_ALLOC_QTY - パレタイズ対象品受注情報.ALLOC_QTY」を行う
     *       ※【7】 :Palletize Instr. No.が""の場合のみ実施
     *       パレタイズ対象品
     *       パレタイズ対象品受注情報
     *       
     *   - 受注数を戻す
     *       輸出受注
     *       
     *   - 梱包指示品目番号受注引当のキャンセル
     *       パレタイズ対象品受注情報に存在する受注データから受注数を戻す
     *       「PACKED_QTY - ALLOC_QTY」を行う
     *       ※【7】:Palletize Instr. No.が""でない場合のみ実施
     *       
     *   - 梱包済数を戻す
     *       梱包指示品目番号受注情報
     *       
     *   - データの更新
     *       梱包指示品目番号受注情報
     *       
     *   - 梱包済数量の更新
     *       梱包指示品目番号
     *       
     *   - 梱包指示ステータスの更新
     *       梱包指示品目番号
     *       
     *   - 小箱内多品ステータスの更新
     *       MIXED現品票
     *       
     *   - 仮在庫を更新する
     *       仮在庫
     *     
     * - 画面遷移
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2012ListDomain> callServices(
        W2012CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        // A create of CML domain
        // CMLドメインの作成
        W2009CmlCriteriaDomain criteria = createCmlCriteria(criteriaDomain);

        // Execution of cancellation processing
        // キャンセル処理の実行
        w2009CmlService.transactOnRegisterCancel(criteria);

        return null;

    }

    /**
     * The search-condition domain of BL layer is created.
     * <br />BL層の検索条件ドメインを作成する。
     *
     * @param criteriaDomain The search-condition domain of PL layer<br />PL層の検索条件ドメイン
     * @return The search-condition domain of BL layer<br />BL層の検索条件ドメイン
     */
    private W2009CmlCriteriaDomain createCmlCriteria(
        W2012CriteriaDomain criteriaDomain) {
        W2009CmlCriteriaDomain cmlCriteria = new W2009CmlCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(cmlCriteria, criteriaDomain);

        return cmlCriteria;
    }
}
