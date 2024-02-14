/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5062;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS2508;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_ERR_REPORT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM_JOB;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableHdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ProductivityDataInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2508ErrorReportDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2508MixTagInstrHeaderDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2508ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtEisProductDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2508CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2508ItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2508MixTagRootCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2508PkgItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2508ProductivityDataInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsBhtEisProductService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * Implement class for Facade Service to ECA0027_WS_2508
 * <br />ECA0027_WS_2508に対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: Ws2508CreateFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7244 $
 */
public class Ws2508CreateFacadeServiceImpl extends AbstractTransactFacadeService<Ws2508ResultDomain, Ws2508CriteriaDomain> {

    /**
     * Eis Product service
     * <br />Eis Product サービス
     */
    private WsBhtEisProductService wsBhtEisProductService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2508CreateFacadeServiceImpl() {
    }

    /**
     * Setter method for wsBhtEisProductService.
     *
     * @param wsBhtEisProductService Set for wsBhtEisProductService
     */
    public void setWsBhtEisProductService(
        WsBhtEisProductService wsBhtEisProductService) {
        this.wsBhtEisProductService = wsBhtEisProductService;
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Ws2508CriteriaDomain filterDomain(Ws2508CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     *
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Ws2508CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        Validator<Ws2508MixTagRootCriteriaDomain> validCriteria
            = new Validator<Ws2508MixTagRootCriteriaDomain>(criteriaDomain.getMixTagRoot(), "criteriaDomain" );

        // Individual Item Check
        // 単項目チェック
        String[] properties = {
            "boxNo",
            "businessStartTime",
            "businessEndTime"
        };
        validCriteria.isValidateProperties(properties, WS_ID_WS2508);

        // Check Errors
        // エラー確認
        if (0 < validCriteria.getErrList().size()) {
            errList.addAll(validCriteria.getErrList());
        }

        // Check for KANBAN information list
        // かんばん情報リストのチェック
        List<? extends Ws2508ItemNoCriteriaDomain> itemNoCriteriaList = criteriaDomain.getMixTagRoot().getItemNoCriteriaList();
        if(itemNoCriteriaList == null){
            MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
            errList.add(msg);
        }else{
            for (int i = 0; i < itemNoCriteriaList.size(); i++) {
                Ws2508ItemNoCriteriaDomain listDomain = itemNoCriteriaList.get(i);

                if(CheckUtil.isBlankOrNull(listDomain.getItemNo())){
                    MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
                    errList.add(msg);
                }

                if(CheckUtil.isBlankOrNull(listDomain.getPkgCd())){
                    MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
                    errList.add(msg);
                }

                if(CheckUtil.isBlankOrNull(listDomain.getIndusTypCd())){
                    MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
                    errList.add(msg);
                }

                if(CheckUtil.isBlankOrNull(listDomain.getKanbanTyp())){
                    MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
                    errList.add(msg);
                }

                if(CheckUtil.isBlankOrNull(listDomain.getTagSeqNo())){
                    MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
                    errList.add(msg);
                }

                if(CheckUtil.isBlankOrNull(listDomain.getKanbanQty())){
                    MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
                    errList.add(msg);
                }
            }
        }

        // check for interior material list
        // 内装材リストのチェック
        List<? extends Ws2508PkgItemNoCriteriaDomain> pkgItemNoCriteriaList = criteriaDomain.getMixTagRoot().getPkgItemNoCriteriaList();
        if(pkgItemNoCriteriaList == null){
            MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
            errList.add(msg);
        }else{
            for (int i = 0; i < pkgItemNoCriteriaList.size(); i++) {
                Ws2508PkgItemNoCriteriaDomain listDomain = pkgItemNoCriteriaList.get(i);

                if(CheckUtil.isBlankOrNull(listDomain.getPkgItemNo())){
                    MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
                    errList.add(msg);
                }

                if(CheckUtil.isBlankOrNull(listDomain.getPkgQty())){
                    MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
                    errList.add(msg);
                }
            }
        }

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <pre>
     * - related check
     * - other check<br />
     * - 相関チェック
     * - その他チェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(Ws2508CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        String businessStartTime = criteriaDomain.getMixTagRoot().getBusinessStartTime();
        String businessEndTime = criteriaDomain.getMixTagRoot().getBusinessEndTime();

        // Productivity data collection information information error list
        // 生産性データエラー情報リスト
        List<? extends Ws2508ProductivityDataInfoCriteriaDomain> productivityDataInfoCriteriaList =
            criteriaDomain.getMixTagRoot().getProductivityDataInfoCriteriaList();

        // required check for every NEXUS W/H flag
        // NEXUS倉庫フラグ毎の必須項目のチェック
        WsBhtEisProductCriteriaDomain wsBhtEisProductCriteria = new WsBhtEisProductCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(wsBhtEisProductCriteria, criteriaDomain.getMixTagRoot());

        if(!wsBhtEisProductService.validateConsistencyNxsStockFlg(wsBhtEisProductCriteria)){
            MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
            errList.add(msg);
            throw new ValidationException(errList);
        }

        // check for Productivity data collection information setting
        // 生産性データ収集情報設定チェック
        List<Ws2501ProductivityDataInfoDomain> productivityDataInfoList = new ArrayList<Ws2501ProductivityDataInfoDomain>();
        // One or more exist "" in SCREEN ID, erro message ID, release flag, WORK START TIME, WORK END TIME
        // 画面ID、エラーメッセージID、解除対象フラグ、作業開始時間、作業終了時間のいずれかに""が存在
        for (Ws2508ProductivityDataInfoCriteriaDomain productivityDataInfoCriteria : productivityDataInfoCriteriaList) {
            Ws2501ProductivityDataInfoDomain productivityDataInfo = new Ws2501ProductivityDataInfoDomain();
            CommonUtil.copyPropertiesDomainToDomain(productivityDataInfo, productivityDataInfoCriteria);
            productivityDataInfoList.add(productivityDataInfo);
        }
        if (!wsBhtEisProductService.validateConsistencyPrdctData(businessStartTime, businessEndTime, productivityDataInfoList)){
            MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
            errList.add(msg);
            throw new ValidationException(errList);
        }

    }

    /**
     * {@inheritDoc}
     *
     * <pre>
     * - CIGMA night batch running check
     * - existing check for packing specification
     * - combination check for Company and W/H<br />
     * - CIGMA夜間バッチ中チェック
     * - 包装仕様存在チェック
     * - 会社・倉庫組み合わせチェック
     * </pre>
     *
     * @param criteriaDomain 検索条件ドメイン
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(Ws2508CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // create error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        Ws2508MixTagRootCriteriaDomain mixTagRoot = criteriaDomain.getMixTagRoot();

        // generate parameters
        // パラメータ生成
        String pltzInstrNo = mixTagRoot.getPltzInstrNo();
        String shipperCd = mixTagRoot.getShipperCd();
        String customerCd = mixTagRoot.getCustomerCd();
        String lgcyShipTo = mixTagRoot.getLgcyShipTo();
        String trnsCd = mixTagRoot.getTrnsCd();
        String plntCd = mixTagRoot.getPlntCd();
        String lgcyWhCd = mixTagRoot.getLgcyWhCd();
        String whCompCd = mixTagRoot.getWhCompCd();
        String whCd = mixTagRoot.getWhCd();
        
        // Existing check for user info
        // ユーザ情報存在チェック
        if (!wsBhtEisProductService.validateDatabaseVmUserInfo(criteriaDomain.getLoginUserDscId())) {
            Object[] params = {criteriaDomain.getLoginUserDscId()};
            MessageDomain msg = new MessageDomain("", NXS_E1_5031, params);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }

        // Palletize Instruction NO is not null
        // 梱包支持Noが入力されている場合
        if(!CheckUtil.isBlankOrNull(pltzInstrNo)){

            String[] returnShipperCd = new String[1];
            String[] returnCustomerCd = new String[1];
            String[] returnLgcyShipTo = new String[1];
            String[] returnTrnsCd = new String[1];
            String[] returnPlntCd = new String[1];
            String[] returnLgcyWhCd = new String[1];

            // get palletize instruction (existing check, palletize instruction status check)
            // 梱包指示の取得(存在チェック、梱包指示ステータスチェック)
            String errCd = wsBhtEisProductService.validateDatabaseTtPltzInstrOnMixTag(
                pltzInstrNo, returnShipperCd, returnCustomerCd, returnLgcyShipTo, returnTrnsCd, returnPlntCd, returnLgcyWhCd);
            if (errCd != null) {
                errorList.add(newMessage("", errCd, pltzInstrNo));
                throw new ValidationException(errorList);
            }

            shipperCd = returnShipperCd[0];
            customerCd = returnCustomerCd[0];
            lgcyShipTo = returnLgcyShipTo[0];
            trnsCd = returnTrnsCd[0];
            plntCd = returnPlntCd[0];
            lgcyWhCd = returnLgcyWhCd[0];
        }

        // --------------------------------------------------------------------

        // existing check for interior material
        // 内装材存在チェック
        List<Ws2501ItemNoDomain> pkgItemNoList = new ArrayList<Ws2501ItemNoDomain>();
        for (Ws2508PkgItemNoCriteriaDomain pkgItemNoCriteria : mixTagRoot.getPkgItemNoCriteriaList()) {
            Ws2501ItemNoDomain pkgItemNo = new Ws2501ItemNoDomain();
            pkgItemNo.setItemNo(pkgItemNoCriteria.getPkgItemNo());
            pkgItemNoList.add(pkgItemNo);
        }

        List<String> pkgItemNoResultList = new ArrayList<String>();
        if(!wsBhtEisProductService.validateDatabaseTmPkgMaterialsOnMixTag(shipperCd, pkgItemNoList, pkgItemNoResultList)){
            for (int i = 0; i < pkgItemNoResultList.size(); i++) {
                errorList.add(newMessage("", NXS_E1_5009, pkgItemNoResultList.get(i)));
            }
        }

        // --------------------------------------------------------------------

        // existing check for packing specification
        // 包装仕様存在チェック
        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();
        for (Ws2508ItemNoCriteriaDomain itemNoCriteria : mixTagRoot.getItemNoCriteriaList()) {
            Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
            CommonUtil.copyPropertiesDomainToDomain(itemNo, itemNoCriteria);
            itemNoList.add(itemNo);
        }

        List<String> itemNoResultList = new ArrayList<String>();
        if(!wsBhtEisProductService.validateDatabaseTmPkgSpecificationDtOnMixTag(shipperCd, itemNoList, trnsCd, itemNoResultList)){
            for (int i = 0; i < itemNoResultList.size(); i++) {
                errorList.add(newMessage("", NXS_E1_5010, itemNoResultList.get(i)));
            }
        }

        // CIGMA night batch running check
        // CIGMA夜間バッチ中チェック
        if (!wsBhtEisProductService.validateDatabaseCigmaNightBatchRunning(shipperCd)) {
            errorList.add(newMessage("", NXS_E1_5062));
        }

        if (!errorList.isEmpty()) {
            throw new ValidationException(errorList);
        }

        // --------------------------------------------------------------------

        // combination check for Company and W/H
        // 会社・倉庫組み合わせチェック
        List<String> errChkList = new ArrayList<String>();

        //   combination check for Shipper, Customer and Ship To
        //   Shipper、Customer、Ship to　組み合わせチェック
        if (!wsBhtEisProductService.validateDatabaseTmCigmaShipToXrefOnNonInstrPltz(shipperCd, customerCd, lgcyShipTo, new String[1])){
            errChkList.add("CHK_RESULT_A");
        }

        // when Palletize instruction NO is not null or NEXUS W/H flag is 'n'
        // 梱包指示Noが入力されている場合　または　NEXUS倉庫フラグが'N'
        if(!CheckUtil.isBlankOrNull(pltzInstrNo) || (FLAG_N.equals(mixTagRoot.getNxsStockFlg()))){


            String[] returnWhCompCd = new String[1];
            String[] returnWhCd = new String[1];

            // combination check for Shipper, W/H and Plant
            // Shipper、W/H、Plant　組み合わせチェック
            if (!wsBhtEisProductService.validateDatabaseTmCigmaWhXrefOnMixTag(shipperCd, lgcyWhCd, plntCd, returnWhCompCd, returnWhCd)){
                errChkList.add("CHK_RESULT_C");
            }

            // 7.2.4
            whCompCd = returnWhCompCd[0];
            whCd = returnWhCd[0];
        }

        // when Palletize instruction NO is not null or NEXUS W/H flag is 'y'
        // 梱包指示Noが入力されている場合　または　NEXUS倉庫フラグが'Y'
        if(!CheckUtil.isBlankOrNull(pltzInstrNo) || (FLAG_Y.equals(mixTagRoot.getNxsStockFlg()))){

            String[] returnLgcyWhCd = new String[1];

        //    combination check for W/H Company and NEXUS W/H
        //    W/H Company、NEXUS W/H　組み合わせチェック
            if (!wsBhtEisProductService.validateDatabaseTmNxsWhOnMixTag(whCompCd, whCd, shipperCd, returnLgcyWhCd)){
                errChkList.add("CHK_RESULT_D");
            }

            // 7.3.4
            if (CheckUtil.isBlankOrNull(pltzInstrNo)) {
                lgcyWhCd = returnLgcyWhCd[0];
            }
        }

        mixTagRoot.setPltzInstrNo(pltzInstrNo);
        mixTagRoot.setShipperCd(shipperCd);
        mixTagRoot.setCustomerCd(customerCd);
        mixTagRoot.setLgcyShipTo(lgcyShipTo);
        mixTagRoot.setTrnsCd(trnsCd);
        mixTagRoot.setPlntCd(plntCd);
        mixTagRoot.setLgcyWhCd(lgcyWhCd);
        mixTagRoot.setWhCompCd(whCompCd);
        mixTagRoot.setWhCd(whCd);

        //   check result for the result of combination check for Company and W/H
        //   会社・倉庫組み合わせチェック結果の確認
        if (!errChkList.isEmpty()){

            WsBhtEisProductCriteriaDomain wsBhtEisProductCriteria = new WsBhtEisProductCriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(wsBhtEisProductCriteria, mixTagRoot);
            wsBhtEisProductCriteria.setLoginUserDscId(criteriaDomain.getLoginUserDscId());
            wsBhtEisProductCriteria.setPalletNo(mixTagRoot.getBoxNo());
            
            // NEXUS W/H flag is 'Y'
            // NEXUS倉庫フラグが'Y' の場合
            if (FLAG_Y.equals(mixTagRoot.getNxsStockFlg())) {
                wsBhtEisProductCriteria.setPlntCd(null);
                wsBhtEisProductCriteria.setLgcyWhCd(null);
            }
            // Palletize Instruction NO is not null or NEXUS W/H flag is 'N'
            // 梱包支持Noが入力されている場合  または  NEXUS倉庫フラグが'N'
            if (!CheckUtil.isBlankOrNull(pltzInstrNo)
                || FLAG_N.equals(mixTagRoot.getNxsStockFlg())) {
                wsBhtEisProductCriteria.setWhCompCd(null);
                wsBhtEisProductCriteria.setWhCd(null);
            }
            
            // register CML error report header
            // CMLエラーレポートヘッダ登録
            Timestamp errCreateTimestamp = wsBhtEisProductService.validateDatabaseTtCmlErrorHeaderOnNonInstrPltz(criteriaDomain.getScreenId(), wsBhtEisProductCriteria, errChkList);
            criteriaDomain.setErrCreateTimestamp(errCreateTimestamp.toString());
        }
    }

    /**
     * {@inheritDoc}
     *
     * <pre>
     * - lock data
     * - lock palletize instruction
     * - lock palletize instruction item NO
     * - lock palletize instruction receive order
     * - lick MIX Tag
     * - set internal variable (header)
     * - set internal variable (details)
     * - get MIX Tag No
     * - Firm-order-receipt alloc processing (execute only when Palletize Instruction NO is null)
     * - register MIX Tag KANBAN
     * - register MIXED ITEM NO
     * - register MIX Tag RT
     * - register MIX Tag
     * - update temp stock
     * - register ordering alloc track record (invoke web service)
     * - register BHT productivity data
     *
     * - データのロック
     * - 梱包指示のロック
     * - 梱包指示品目番号のロック
     * - 梱包指示品目番号受注情報のロック
     * - MIXED現品票のロック
     * - 内部変数の設定（ヘッダ）
     * - 内部変数（明細）の設定
     * - Mix Tag No.の取得
     * - 確定受注引当処理(梱包指示Noが設定されていない場合のみ実施)
     * - MIX品かんばん情報を登録する
     * - MIXED品目番号を登録する
     * - MIXED用RT材を登録する
     * - MIXED現品票を登録する
     * - 仮在庫を更新・登録する
     * - 受注引当実績の登録（Webサービスの起動）
     * - BHT生産性データ情報を登録する。
     * </pre>
     *
     *
     *
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Ws2508ResultDomain callServices(Ws2508CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        if (!CheckUtil.isBlankOrNull(criteriaDomain.getErrCreateTimestamp())) {
            return convertEisToResult(WS_RESULT_ERROR_ERR_REPORT_OUT, null, criteriaDomain.getErrCreateTimestamp());
        }

        // create Eis Product search-condition domain from parameter domain of ECA0027_WS_2508
        // ECA0027_WS_2508のパラメータドメインよりEis Product検索条件ドメインを作成
        WsBhtEisProductCriteriaDomain criteria = copyCriteriaDomainToCriteria(criteriaDomain);

        // invoke the business service
        // 業務処理の実行
        WsBhtEisProductDomain wsBhtEisProduct = wsBhtEisProductService.transactOnMixTag(criteria);

        // judge errors
        // エラー判定
        String resultCd = wsBhtEisProduct.getResultCd();
        if (WS_RESULT_ERROR.compareTo(resultCd) == 0
            || WS_RESULT_ERROR_ERR_REPORT_OUT.compareTo(resultCd) == 0
            || WS_RESULT_ERROR_SYSTEM_JOB.compareTo(resultCd) == 0) {
            return convertEisToResult(resultCd, wsBhtEisProduct.getErrMap(), wsBhtEisProduct.getErrCreateTimestamp());
        }

        // result domain of ECA0027_WS_2508 from Eis Product domain
        // Eis ProductドメインよりECA0027_WS_2508の結果ドメイン
        return convertEisToResult(wsBhtEisProduct);
    }

    /**
     * create Eis Product search-condition domain from parameter domain of ECA0027_WS_2508
     * <br />ECA0027_WS_2508のパラメータドメインよりEis Product検索条件ドメインを作成します。
     *
     * @param criteriaDomain parameter domain of ECA0027_WS_2508<br />ECA0027_WS_2508のパラメータドメイン
     * @return Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     */
    protected WsBhtEisProductCriteriaDomain copyCriteriaDomainToCriteria(Ws2508CriteriaDomain criteriaDomain) {
        // generate input parameter domain
        // 入力パラメータドメインの生成
        Ws2508MixTagRootCriteriaDomain mixTagRootCriteriaDomain = criteriaDomain.getMixTagRoot();

        // set criteria domain
        // criteriaドメインの設定
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        criteria.setLoginUserDscId(mixTagRootCriteriaDomain.getLoginUserDscId());
        criteria.setScreenId(criteriaDomain.getScreenId());

        criteria.setPltzInstrNo(mixTagRootCriteriaDomain.getPltzInstrNo());
        criteria.setShipperCd(mixTagRootCriteriaDomain.getShipperCd());
        criteria.setCustomerCd(mixTagRootCriteriaDomain.getCustomerCd());
        criteria.setLgcyShipTo(mixTagRootCriteriaDomain.getLgcyShipTo());
        criteria.setTrnsCd(mixTagRootCriteriaDomain.getTrnsCd());
        criteria.setPlntCd(mixTagRootCriteriaDomain.getPlntCd());
        criteria.setLgcyWhCd(mixTagRootCriteriaDomain.getLgcyWhCd());
        criteria.setWhCd(mixTagRootCriteriaDomain.getWhCd());
        criteria.setWhCompCd(mixTagRootCriteriaDomain.getWhCompCd());
        criteria.setNxsStockFlg(mixTagRootCriteriaDomain.getNxsStockFlg());
        criteria.setBoxNo(mixTagRootCriteriaDomain.getBoxNo());

        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();
        for (Ws2508ItemNoCriteriaDomain itemNoCriteriaDomain : mixTagRootCriteriaDomain.getItemNoCriteriaList()){
            Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
            CommonUtil.copyPropertiesDomainToDomain(itemNo, itemNoCriteriaDomain);
            itemNoList.add(itemNo);
        }
        criteria.setWs2508ItemNoList(itemNoList);

        List<Ws2501PkgItemNoDomain> pkgItemNoList = new ArrayList<Ws2501PkgItemNoDomain>();
        for (Ws2508PkgItemNoCriteriaDomain pkgItemNoCriteriaDomain : mixTagRootCriteriaDomain.getPkgItemNoCriteriaList()){
            Ws2501PkgItemNoDomain pkgItemNo = new Ws2501PkgItemNoDomain();
            CommonUtil.copyPropertiesDomainToDomain(pkgItemNo, pkgItemNoCriteriaDomain);
            pkgItemNoList.add(pkgItemNo);
        }
        criteria.setWs2508PkgItemNoList(pkgItemNoList);

        criteria.setWorkTimeStrt(mixTagRootCriteriaDomain.getBusinessStartTime());
        criteria.setWorkTimeEnd(mixTagRootCriteriaDomain.getBusinessEndTime());

        List<Ws2501ProductivityDataInfoDomain> productivityDataInfoList = new ArrayList<Ws2501ProductivityDataInfoDomain>();
        for (Ws2508ProductivityDataInfoCriteriaDomain productivityDataInfoCriteriaDomain
            : mixTagRootCriteriaDomain.getProductivityDataInfoCriteriaList()){

            Ws2501ProductivityDataInfoDomain productivityDataInfo = new Ws2501ProductivityDataInfoDomain();
            CommonUtil.copyPropertiesDomainToDomain(productivityDataInfo, productivityDataInfoCriteriaDomain);
            productivityDataInfoList.add(productivityDataInfo);

        }
        criteria.setWs2508ProductivityDataInfoList(productivityDataInfoList);

        return criteria;
    }

    /**
     * create result domain of ECA0027_WS_2508 from Eis Product domain (normal case)
     * <br />Eis ProductドメインよりECA0027_WS_2508の結果ドメインを作成します。(正常用)
     *
     * @param wsBhtEisProduct Eis Product domain <br />Eis Productドメイン
     * @return result domain of ECA0027_WS_2508<br />ECA0027_WS_2508の結果ドメイン
     */
    protected Ws2508ResultDomain convertEisToResult(WsBhtEisProductDomain wsBhtEisProduct){

        // get internal variable (header)
        // 内部変数（ヘッダ）取得
        Ws2501InternalVariableHdrDomain internalVariableHdr = wsBhtEisProduct.getWs2508InternalVariableHdrDomain();

        // Mix Tag header result domain of ECA0027_WS_2508
        // ECA0027_WS_2508のMixTagヘッダ結果ドメイン
        Ws2508MixTagInstrHeaderDomain mixTagInstrHeaderDomain = new Ws2508MixTagInstrHeaderDomain();
        mixTagInstrHeaderDomain.setMixTagNo(wsBhtEisProduct.getMixTagNo());
        mixTagInstrHeaderDomain.setBoxNo(internalVariableHdr.getBoxNo());

        // result domain
        // 結果ドメイン
        Ws2508ResultDomain resultDomain = new Ws2508ResultDomain(WS_RESULT_SUCCESS);
        resultDomain.setMixedTagHeader(mixTagInstrHeaderDomain);

        return resultDomain;
    }

    /**
     * create result domain of ECA0027_WS_2508 from Eis Product domain (error case)
     * <br />ECA0027_WS_2508の結果ドメインを作成します。(異常用)
     *
     * @param resultCode result code<br />結果コード
     * @param errMap error map<br />エラーマップ
     * @param errCreateTimestamp error report time stamp<br />エラーレポートタイムスタンプ
     * @return result domain of ECA0027_WS_2508<br />ECA0027_WS_2508の結果ドメイン
     */
    protected Ws2508ResultDomain convertEisToResult(String resultCode, Map<String, Object[]> errMap, String errCreateTimestamp) {

        // error list
        // エラーリスト
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();

        // set error code and error parameter
        // エラーコードとエラーパラメータの設定
        if (errMap != null) {
            for (String errorCode : errMap.keySet()) {

                Object[] params = errMap.get(errorCode);

                List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
                for (Object param : params) {
                    ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                    if (param != null) {
                        errorParamListItem.setParam(param.toString());
                    }
                    errorParamList.add(errorParamListItem);
                }

                ErrorListItemDomain errListItem = new ErrorListItemDomain();
                errListItem.setErrorCode(errorCode);
                errListItem.setErrorParamList(errorParamList);
                errorList.add(errListItem);
            }
        }

        // set error report
        // エラーレポートの設定
        Ws2508ErrorReportDomain errorReport = new Ws2508ErrorReportDomain();
        errorReport.setErrCreateTimestamp(errCreateTimestamp);

        // create result domain
        // 結果ドメイン生成
        Ws2508ResultDomain resultDomain = new Ws2508ResultDomain(resultCode, errorList);
        resultDomain.setErrorReport(errorReport);

        return resultDomain;
    }

    /**
     * Instantiates a {@link MessageDomain} object with the specified arguments.
     *
     * @param property property
     * @param key message key
     * @return {@link MessageDomain} object
     */
    protected MessageDomain newMessage(String property, String key) {
        return new MessageDomain(property, key, null);
    }

    /**
     * Instantiates a {@link MessageDomain} object with the specified arguments.
     *
     * @param property property
     * @param key message key
     * @param params the array of objects
     * @return {@link MessageDomain} object
     */
    protected MessageDomain newMessage(String property, String key, Object... params) {
        return new MessageDomain(property, key, params);
    }

}
