/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS2505;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2505ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2505CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsBhtEisProductService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * This is an implement class of the Facade service to ECA0027_WS_2505.
 * <br />ECA0027_WS_2505に対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: Ws2505CreateFacadeService
 * </pre>
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 10489 $
 */
public class Ws2505TransactFacadeServiceImpl extends AbstractTransactFacadeService<Ws2505ResultDomain, Ws2505CriteriaDomain> {
    
    /**
     * Eis Product service
     * <br />Eis Product サービス
     */
    private WsBhtEisProductService wsBhtEisProductService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2505TransactFacadeServiceImpl() {
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
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Ws2505CriteriaDomain filterDomain(Ws2505CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Common error checking
     *       "A screen item definition" is referred to for details.
     * 
     * - 共通エラーチェック
     *     詳細は「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Ws2505CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<Ws2505CriteriaDomain> valid 
            = new Validator<Ws2505CriteriaDomain>(criteriaDomain, "criteriaDomain");
        
        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "compCd",
            "itemNo",
            "pkgCd",
            "trnsCd",
            "rev",
            "NProc"
        };
        
        // required check
        // 必須チェック
        valid.isValidateProperties(properties, WS_ID_WS2505);
        
        // digit number, an attribute, a form check
        // No Action
        // 桁数、属性、書式チェック
        // 処理なし
        
        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
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
    protected void validateConsistency(Ws2505CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * 
     * - NEXUS-Company-Master existence check
     *     ownerCompCd of - criteriaDomain is made into the first argument,
     *       This is a call about {@link WsBhtEisProductService#validateDatabaseCompCd(String, String[], String[])}.
     *
     * - Set the following items of a NEXUS-Company-Master existence checked result to criteriaDomain.
     *       - itemNoGrp / ITEM NO GROUP
     *       - timeZone / time zone
     *
     * - PKG-Specification-MA(Detail) existence check
     *     - The following items are set to {@link TmPkgSpecDtlCriteriaDomain} from criteriaDomain.
     *         - ownerComp / OWNER COMPANY
     *         - itemNo / ITEM NO
     *         - pkgCd / PACKAGE CODE
     *         - trnsCd / TRANSPORT CODE
     *         - nProc / NEXT PROCESS
     *         - rev / REVISION
     *     - This is a call about {@link WsBhtEisProductService#validateDatabaseTmPkgSpecificatinDtlOnPkgSpec(TmPkgSpecDtlCriteriaDomain)}.
     * 
     * - NEXUS会社原単位存在チェック
     *   - criteriaDomainのownerCompCdを第一引数にして、
     *     {@link WsBhtEisProductService#validateDatabaseCompCd(String, String[], String[])}を呼出
     *     
     * - criteriaDomainにNEXUS会社原単位存在チェック結果の以下の項目を設定
     *     - itemNoGrp/品目番号グループ
     *     - timeZone/タイムゾーン
     * 
     * - 包装仕様原単位(明細)存在チェック
     *   - {@link TmPkgSpecDtlCriteriaDomain}にcriteriaDomainより以下の項目を設定
     *       - ownerComp/責任会社
     *       - itemNo/品目番号
     *       - pkgCd/包装区分
     *       - trnsCd/輸送手段コード
     *       - nProc/次区
     *       - rev/リビジョン
     *   - {@link WsBhtEisProductService#validateDatabaseTmPkgSpecificatinDtlOnPkgSpec(TmPkgSpecDtlCriteriaDomain)}を呼出
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(Ws2505CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Parameter generation
        // パラメータ生成
        String compCd = criteriaDomain.getCompCd();
        String[] itemNoGrp = new String[1];
        String[] timeZone = new String[1];
        
        // NEXUS-Company-Master existence check
        // NEXUS会社原単位存在チェック
        if (!wsBhtEisProductService.validateDatabaseCompCd(compCd, itemNoGrp, timeZone)){
            Object[] params = {
                compCd
            };
            MessageDomain msg = new MessageDomain("", NXS_E1_5007, params);
            errorList.add(msg);
        } else {
            // the following processing, and a setting of the delivered item to a call Services method
            // 下記処理、及び、call Services メソッドへの引き渡し項目の設定
            criteriaDomain.setTimeZone(timeZone[0].toString());
        }
        
        // PKG-Specification-MA(Detail) existence check
        // 包装仕様原単位(ヘッダ)存在チェック
        TmPkgSpecHdrCriteriaDomain tmPkgSpecHdrCriteria = new TmPkgSpecHdrCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tmPkgSpecHdrCriteria, criteriaDomain);
        tmPkgSpecHdrCriteria.setOwnerComp(criteriaDomain.getCompCd());
        
        if (!wsBhtEisProductService.validateDatabaseTmPkgSpecHdrOnPkgSpec(tmPkgSpecHdrCriteria)){
            
            MessageDomain msg = new MessageDomain("", NXS_E1_5060, null);
            errorList.add(msg);
        }
        
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * 
     * The lock of - Package Specification Revision Master, table registration, an update
     *     - The following items are set to {@link WsBhtEisProductCriteriaDomain} from criteriaDomain.
     *         - ownerComp / OWNER COMPANY
     *         - itemNo / ITEM NO
     *         - pkgCd / PACKAGE CODE
     *         - trnsCd / TRANSPORT CODE
     *         - nProc / NEXT PROCESS
     *         - rev / REVISION
     *         - timeZone / time zone
     *     - This is a call about {@link WsBhtEisProductService#transactOnPkgSpec (WsBhtEisProductCriteriaDomain)}.
     * 
     * - 包装仕様有効リビジョン原単位のロック、テーブル登録、更新
     *   - {@link WsBhtEisProductCriteriaDomain}にcriteriaDomainより以下の項目を設定
     *       - ownerComp/責任会社
     *       - itemNo/品目番号
     *       - pkgCd/包装区分
     *       - trnsCd/輸送手段コード
     *       - nProc/次区
     *       - rev/リビジョン
     *       - timeZone/タイムゾーン
     *   - {@link WsBhtEisProductService#transactOnPkgSpec(WsBhtEisProductCriteriaDomain)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Ws2505ResultDomain callServices(Ws2505CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        // A create of a EisProduct search-condition domain
        // EisProduct検索条件ドメインの作成
        WsBhtEisProductCriteriaDomain wsBhtEisProductCriteria = new WsBhtEisProductCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(wsBhtEisProductCriteria, criteriaDomain);
        
        // Acquisition of packed up data, acquisition of unpacked up data, acquisition of a customer KANBAN QR information
        // 梱包済みデータの取得、未梱包データの取得、得意先かんばんQR情報の取得
        wsBhtEisProductService.transactOnPkgSpec(wsBhtEisProductCriteria);
        
        // Converted in a result domain
        // 結果ドメインへの変換
        Ws2505ResultDomain resultDomain = new Ws2505ResultDomain(WS_RESULT_SUCCESS);
        
        return resultDomain;
    }
}
