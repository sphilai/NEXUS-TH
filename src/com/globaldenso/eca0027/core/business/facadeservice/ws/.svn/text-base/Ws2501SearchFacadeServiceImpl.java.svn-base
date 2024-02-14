/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5038;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5064;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS2501;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501CustomerKanbanListItem;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableHdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501KanbanListItem;
import com.globaldenso.eca0027.core.business.domain.Ws2501MainMarkListItem;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixTagListItem;
import com.globaldenso.eca0027.core.business.domain.Ws2501PalletizeInstrHeader;
import com.globaldenso.eca0027.core.business.domain.Ws2501PnListItem;
import com.globaldenso.eca0027.core.business.domain.Ws2501RegisterDataListItem;
import com.globaldenso.eca0027.core.business.domain.Ws2501ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TmCustomerQrPatternHdrByDtlDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemByKanbanDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501UnpackagedItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501UnregisterDataListItem;
import com.globaldenso.eca0027.core.business.domain.WsBhtEisProductDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsBhtEisProductService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * Resource implementation class for the Facade service to ECA0027_WS_2501.
 * <br />ECA0027_WS_2501に対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: Ws2501SearchFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6774 $
 */
public class Ws2501SearchFacadeServiceImpl extends AbstractSearchFacadeService<Ws2501ResultDomain, Ws2501CriteriaDomain>  {
    
    /**
     * Eis Product service
     * <br />Eis Product サービス
     */
    private WsBhtEisProductService wsBhtEisProductService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2501SearchFacadeServiceImpl() {
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
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected Ws2501CriteriaDomain filterDomain(Ws2501CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // 処理なし
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Common error checking
     *       "A screen item definition" is referred to for details.
     * </pre>
     * <pre>
     * - 共通エラーチェック
     *     詳細は「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected void validateItems(Ws2501CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<Ws2501CriteriaDomain> valid 
            = new Validator<Ws2501CriteriaDomain>(criteriaDomain, "criteriaDomain");
        
        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "pltzInstrNo"
        };
        
        // required check
        // 必須チェック
        valid.isValidateProperties(properties, WS_ID_WS2501);
        
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
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected void validateConsistency(Ws2501CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Acquisition of a Packaging Instruction (=Pull) (an existence check, a PALLETIZE-INSTRUCTION-STATUS check)  
     *     This is an argument about the following items of - criteriaDomain.
     *         - pltzInstrNo / Packaging Instruction (=Pull) NO
     *       Make the following items into an argument as an item for return VALUEs.
     *         - shipperCd / Shipper CD
     *         - collateMethTyp / COLLATE METHOD TYPE
     *       This is a call about {@link WsBhtEisProductService#validateDatabaseTtPltzOnPltzInstr (String, String, String)}.
     * </pre>
     * <pre>
     * - 梱包指示の取得(存在チェック、梱包指示ステータスチェック)
     *   - criteriaDomainの以下の項目を引数に
     *       - pltzInstrNo/梱包指示NO
     *     以下の項目は戻り値用項目として引数にして
     *       - shipperCd/荷主コード
     *       - collateMethTyp/照合方式区分
     *     {@link WsBhtEisProductService#validateDatabaseTtPltzOnPltzInstr(String, String[], String[])}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected void validateDatabase(Ws2501CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Parameter generation
        // パラメータ生成
        String pltzInstrNo = criteriaDomain.getPltzInstrNo();
        TtPltzInstrDomain result = new TtPltzInstrDomain();
        
        // Acquisition of Packaging Instruction (=Pull) (an existence check, a PALLETIZE-INSTRUCTION-STATUS check)  
        // 梱包指示の取得(存在チェック、梱包指示ステータスチェック)
        String errCd = wsBhtEisProductService.validateDatabaseTtPltzOnPltzInstr(pltzInstrNo, result);
        
        if (NXS_E1_5038.equals(errCd)) {
            Object[] params = {
                pltzInstrNo
            };
            MessageDomain msg = new MessageDomain("", NXS_E1_5038, params);
            errorList.add(msg);
        }
        
        if (NXS_E1_5015.equals(errCd)) {
            Object[] params = {
                pltzInstrNo
            };
            MessageDomain msg = new MessageDomain("", NXS_E1_5015, params);
            errorList.add(msg);
        }
        
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
        
        // A setting of the delivered item to a call Services method
        // call Services メソッドへの引き渡し項目の設定
        criteriaDomain.setShipperCd(result.getShipperCd());
        criteriaDomain.setCustomerCd(result.getCustomerCd());
        criteriaDomain.setLgcyShipTo(result.getLgcyShipTo());
        criteriaDomain.setTrnsCd(result.getTrnsCd());
        criteriaDomain.setPlntCd(result.getPlntCd());
        criteriaDomain.setLgcyWhCd(result.getLgcyWhCd());
        criteriaDomain.setCollateMethTyp(result.getCollateMethTyp());
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Acquisition of packed up data, acquisition of unpacked up data, acquisition of a customer KANBAN QR information
     *     - The following items are set to {@link WsBhtEisProductCriteriaDomain} from criteriaDomain.
     *         - pltzInstrNo / Packaging Instruction (=Pull) NO
     *     - This is a call about {@link WsBhtEisProductService#searchOnPltzInstr (WsBhtEisProductCriteriaDomain)}.
     * </pre>
     * <pre>
     * - 梱包済みデータの取得、未梱包データの取得、得意先かんばんQR情報の取得
     *   - {@link WsBhtEisProductCriteriaDomain}にcriteriaDomainより以下の項目を設定
     *       - pltzInstrNo/梱包指示NO
     *   - {@link WsBhtEisProductService#searchOnPltzInstr(WsBhtEisProductCriteriaDomain)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected Ws2501ResultDomain callServices(Ws2501CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // A create of a EisProduct search-condition domain
        // EisProduct検索条件ドメインの作成
        WsBhtEisProductCriteriaDomain wsBhtEisProductCriteria = new WsBhtEisProductCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(wsBhtEisProductCriteria, criteriaDomain);
        wsBhtEisProductCriteria.setCompCd(criteriaDomain.getShipperCd());
        
        // Acquisition of packed up data, acquisition of unpacked up data, acquisition of a customer KANBAN QR information
        // 梱包済みデータの取得、未梱包データの取得、得意先かんばんQR情報の取得
        WsBhtEisProductDomain wsBhtEisProduct =
            wsBhtEisProductService.searchOnPltzInstr(wsBhtEisProductCriteria);

        // Error judging
        // エラー判定
        if (wsBhtEisProduct.getErrMap() != null && wsBhtEisProduct.getErrMap().containsKey(NXS_E1_5064)){
            String shipperCd = criteriaDomain.getShipperCd();
            String collateMethTyp = criteriaDomain.getCollateMethTyp();
            
            // Converted in a result domain
            // 結果ドメインへの変換
            return convertEisToResult(WS_RESULT_ERROR, NXS_E1_5064, shipperCd, collateMethTyp);
        }
        
        // Converted in a result domain
        // 結果ドメインへの変換
        return convertEisToResult(wsBhtEisProduct, criteriaDomain.getCollateMethTyp());
    }

    /**
     * Ws2501 result changes an EisProduct domain into a domain (for normal).
     * <br />EisProductドメインをWs2501結果ドメインに変換します(正常用)。
     * 
     * @param wsBhtEisProduct EisProduct domain<br />EisProductドメイン
     * @param collateMethTyp COLLATE-METHOD-TYPE
     * @return Ws2501 result is a domain.<br />Ws2501結果ドメイン
     * @throws GscmApplicationException
     * @throws ApplicationException
     */
    protected Ws2501ResultDomain convertEisToResult(WsBhtEisProductDomain wsBhtEisProduct, String collateMethTyp) {
        
        // Setting of a MAIN-MARK list item result domain
        // メインマークリスト項目結果ドメインの設定
        List<Ws2501MainMarkListItem> mainMarkList = new ArrayList<Ws2501MainMarkListItem>();
        for (TtPltzDomain ttpltz : wsBhtEisProduct.getWs2501TtPltzList()){
            Ws2501MainMarkListItem mainMarkListItem = new Ws2501MainMarkListItem();
            mainMarkListItem.setMainMark(ttpltz.getMainMark());
            mainMarkListItem.setPalletNo(ttpltz.getPalletNo());
            mainMarkList.add(mainMarkListItem);
        }
        
        // KANBAN list item result domain
        // かんばんリスト項目結果ドメイン
        List<Ws2501KanbanListItem> kanbanList = new ArrayList<Ws2501KanbanListItem>();
        for (Ws2501TtPltzItemByKanbanDomain ttPltzItemByKanban : wsBhtEisProduct.getWs2501TtPltzItemByKanbanList()){
            Ws2501KanbanListItem kanbanListItem = new Ws2501KanbanListItem();
            kanbanListItem.setPltzItemNo(ttPltzItemByKanban.getPltzItemNo());
            kanbanListItem.setPkgCd(ttPltzItemByKanban.getPkgCd());
            kanbanListItem.setCustomerItemNo(ttPltzItemByKanban.getCustomerItemNo());
            kanbanListItem.setExpIndusTypCd(ttPltzItemByKanban.getExpIndusTypCd());
            kanbanListItem.setExpKanbanTyp(ttPltzItemByKanban.getExpKanbanTyp());
            kanbanListItem.setExpRegulateNo(ttPltzItemByKanban.getExpRegulateNo());
            kanbanListItem.setExpCustomerRegulateNo(ttPltzItemByKanban.getExpCustomerRegulateNo());
            kanbanList.add(kanbanListItem);
        }
        
        // Mix tag list item result domain
        // Mixタグリスト項目結果ドメイン
        List<Ws2501MixTagListItem> mixTagList1 = new ArrayList<Ws2501MixTagListItem>();
        for (TtMixtagDomain ttMixtag1 : wsBhtEisProduct.getWs2501TtMixtagList()) {
            Ws2501MixTagListItem mixTagListItem1 = new Ws2501MixTagListItem();
            mixTagListItem1.setMixTagNo(ttMixtag1.getMixTagNo());
            mixTagList1.add(mixTagListItem1);
        }
        
        // Packed up data list item result domain
        // 梱包済みデータリスト項目結果ドメイン
        Ws2501RegisterDataListItem registerDataListItem = new Ws2501RegisterDataListItem();
        registerDataListItem.setMainMarkList(mainMarkList);
        registerDataListItem.setKanbanList(kanbanList);
        registerDataListItem.setMixTagList(mixTagList1);
        
        List<Ws2501RegisterDataListItem> registerDataList = new ArrayList<Ws2501RegisterDataListItem>();
        registerDataList.add(registerDataListItem);
        
        // Unpacked up list item result domain
        // 未梱包リスト項目結果ドメイン
        List<Ws2501PnListItem> pnList = new ArrayList<Ws2501PnListItem>();
        for (Ws2501UnpackagedItemNoDomain unpackagedItemNo : wsBhtEisProduct.getWs2501UnpackagedItemNoList()){
            Ws2501PnListItem pnListItem = new Ws2501PnListItem();
            pnListItem.setItemNo(unpackagedItemNo.getItemNo());
            pnListItem.setPkgCd(unpackagedItemNo.getPkgCd());
            pnListItem.setUnPackedQty(String.valueOf(parseInt(unpackagedItemNo.getInstrQty())
                                                        - parseInt(unpackagedItemNo.getPackedQty())
                                                        - parseInt(unpackagedItemNo.getSumQty())));
            pnList.add(pnListItem);
        }
        
        // Mix tag list item result domain
        // Mixタグリスト項目結果ドメイン
        List<Ws2501MixTagListItem> mixTagList2 = new ArrayList<Ws2501MixTagListItem>();
        for (TtMixtagDomain ttMixtag2 : wsBhtEisProduct.getWs2501TtMixtagByNoPltzInstrList()) {
            Ws2501MixTagListItem mixTagListItem2 = new Ws2501MixTagListItem();
            mixTagListItem2.setMixTagNo(ttMixtag2.getMixTagNo());
            mixTagList2.add(mixTagListItem2);
        }
        
        // Unpacked up data list item result domain
        // 未梱包データリスト項目結果ドメイン
        Ws2501UnregisterDataListItem unregisterDataListItem = new Ws2501UnregisterDataListItem();
        unregisterDataListItem.setPnList(pnList);
        unregisterDataListItem.setMixTagList(mixTagList2);
        
        List<Ws2501UnregisterDataListItem> unregisterDataList = new ArrayList<Ws2501UnregisterDataListItem>();
        unregisterDataList.add(unregisterDataListItem);
        
        Ws2501InternalVariableHdrDomain internalVariableHdrDomain = wsBhtEisProduct.getWs2501InternalVariableHdrDomain();

        // Packaging Instruction (=Pull) header result domain
        // 梱包指示ヘッダー結果ドメイン
        Ws2501PalletizeInstrHeader palletizeInstrHeader = new Ws2501PalletizeInstrHeader();
        palletizeInstrHeader.setShipperCd(internalVariableHdrDomain.getShipperCd());
        palletizeInstrHeader.setCustomerCd(internalVariableHdrDomain.getCustomerCd());
        palletizeInstrHeader.setLgcyShipTo(internalVariableHdrDomain.getLgcyShipTo());
        palletizeInstrHeader.setTrnsCd(internalVariableHdrDomain.getTrnsCd());
        palletizeInstrHeader.setPlntCd(internalVariableHdrDomain.getPlntCd());
        palletizeInstrHeader.setLgcyWhCd(internalVariableHdrDomain.getLgcyWhCd());
        palletizeInstrHeader.setCollateMethTyp(collateMethTyp);
        palletizeInstrHeader.setRegisterDataList(registerDataList);
        palletizeInstrHeader.setUnregisterDataList(unregisterDataList);
        
        // 
        List<Ws2501CustomerKanbanListItem> customerKanbanList = new ArrayList<Ws2501CustomerKanbanListItem>();
        for (Ws2501TmCustomerQrPatternHdrByDtlDomain tmCustomerQrPatternHdrByDtl : wsBhtEisProduct.getWs2501TmCustomerQrPatternHdrByDtlList()) {
            Ws2501CustomerKanbanListItem customerKanbanListItem = new Ws2501CustomerKanbanListItem();
            customerKanbanListItem.setStrtPos(tmCustomerQrPatternHdrByDtl.getStrtPos());
            customerKanbanListItem.setQrItemLength(tmCustomerQrPatternHdrByDtl.getQrItemLength());
            customerKanbanListItem.setQrItemTyp(tmCustomerQrPatternHdrByDtl.getQrItemTyp());
            customerKanbanListItem.setChkValue(tmCustomerQrPatternHdrByDtl.getChkValue());
            customerKanbanListItem.setQrItemId(tmCustomerQrPatternHdrByDtl.getQrItemId());
            customerKanbanListItem.setReqFlg(tmCustomerQrPatternHdrByDtl.getReqFlg());
            customerKanbanListItem.setAttrTyp(tmCustomerQrPatternHdrByDtl.getAttrTyp());
            customerKanbanListItem.setGrpId(tmCustomerQrPatternHdrByDtl.getGrpId());
            customerKanbanList.add(customerKanbanListItem);
        }
        
        // The result of Ws2501 is a domain.
        // Ws2501の結果ドメイン
        Ws2501ResultDomain resultDomain = new Ws2501ResultDomain(WS_RESULT_SUCCESS);
        resultDomain.setPalletizeInstrHeader(palletizeInstrHeader);
        resultDomain.setCustomerKanbanList(customerKanbanList);
        
        return resultDomain;
    }
    

    /**
     * Ws2501 result changes an EisProduct domain into a domain (for unusual).
     * <br />EisProductドメインをWs2501結果ドメインに変換します(異常用)。
     *
     * @param resultCode Result CD<br />結果コード
     * @param errorCode error code <br />エラーコード
     * @param shipperCd SHIPPER CD<br />荷主コード
     * @param collateMethTyp COLLATE_METH_TYP<br />照合方式区分
     * @return Ws2501 result is a domain.<br />Ws2501結果ドメイン
     */
    protected Ws2501ResultDomain convertEisToResult(String resultCode, String errorCode, String shipperCd, String collateMethTyp) {
        
        // Error list
        // エラーリスト
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        
        // A setting of error code, and an error parameter
        // エラーコードとエラーパラメータの設定
        List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();

        ErrorParamListItemDomain paramShipper = new ErrorParamListItemDomain();
        paramShipper.setParam(shipperCd);
        errorParamList.add(paramShipper);

        ErrorParamListItemDomain paramMathType = new ErrorParamListItemDomain();
        paramMathType.setParam(collateMethTyp);
        errorParamList.add(paramMathType);
        
        ErrorListItemDomain errListItem = new ErrorListItemDomain();
        errListItem.setErrorCode(errorCode);
        errListItem.setErrorParamList(errorParamList);
        errorList.add(errListItem);
        
        // Result domain generation
        // 結果ドメイン生成
        Ws2501ResultDomain resultDomain = new Ws2501ResultDomain();
        
        // A result CD and error list setting
        // 結果コードとエラーリスト設定
        resultDomain.setResultCode(resultCode);
        resultDomain.setErrorList(errorList);
        
        return resultDomain;
    }

    /**
     * Parses the string argument as a signed decimal integer.
     * 
     * @param s string
     * @return integer (0 if the string is null or empty)
     */
    protected int parseInt(String s) { 

        if (StringUtils.isEmpty(s)) {
            return 0;
        }

        return Integer.parseInt(s);
    }
}
