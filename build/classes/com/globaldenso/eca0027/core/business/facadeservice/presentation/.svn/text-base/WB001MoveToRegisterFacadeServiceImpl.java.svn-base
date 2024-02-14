/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_NO_GRP_D;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_NO_GRP_DG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0027;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0028;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0032;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0033;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0034;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0035;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0036;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0142;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0143;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.WB001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.WsB001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB001ResultItemDomain;
import com.globaldenso.eca0027.core.business.service.WB001OdrRcvService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;


/**
 * This is an implement class of the Facade service to Init action of ordering registration header screen.
 * <br />受注登録ヘッダー画面のInitアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 14596 $
 */
public class WB001MoveToRegisterFacadeServiceImpl extends AbstractProcessFacadeService<Void, WB001CriteriaDomain> {
    
    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Ordering business services
     * <br />受注業務サービス
     */
    protected WB001OdrRcvService wb001OdrRcvService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB001MoveToRegisterFacadeServiceImpl() {
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
    protected WB001CriteriaDomain filterDomain(WB001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
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
     * Setter method for WB001OdrRcvServic.
     *
     * @param wb001OdrRcvService Set for wb001OdrRcvService
     */
    public void setWb001OdrRcvService(WB001OdrRcvService wb001OdrRcvService) {
        this.wb001OdrRcvService = wb001OdrRcvService;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2001_Palletize Instruction Main Screen.xls "a screen item definition" is referred to for details.
     *       
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2001_Palletize Instruction Main Screen.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(WB001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<WB001CriteriaDomain> valid 
            = new Validator<WB001CriteriaDomain>(criteriaDomain, "wb001CriteriaDomain");
        
        // required check, screen peculiar check (itemNo, customerPoNo)  
        // 必須チェック、画面固有チェック(itemNo、customerPoNo)
        String[] requiredProperties = {
            "rcvOdrCompCd",
            "customerCd",
            "lgcyShipTo",
            "itemNo",
            "pkgCd",
            "trnsCd",
            "etdDueDt",
            "customerPoNo"
        };
        valid.isValidateProperties(requiredProperties, SCREEN_ID_WB001);

        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
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
    protected void validateConsistency(WB001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This is a check during processing in the - CIGMA night.
     *       This is a call about {@link WB001OdrRcvService#validateDatabaseCigmaAvailable(boolean, String)}.
     *
     * - DB consistency check
     *       - Ordering company existence check (NEXUS Company Master)
     *       This is a call about * {@link WB001OdrRcvService#validateDatabaseTmNxsCompOnHeaderMoveToRegister(String, WB001OdrRcvDomain)}.
     *
     *       - SHIP-TO-NAME acquisition   Existence check
     *       This is a call about * {@link WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnHeaderMoveToRegister(String, String, String, WB001OdrRcvDomain)}.
     *
     *       - Non-EDI base check
     *           This is a call about {@link WB001OdrRcvService#validateDatabaseWsB011OnHeaderMoveToRegister (String, String, String)}.
     *
     *       - ITEM-NO existence check for export
     * {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfo(String, String, String, String, String, Date, WB001OdrRcvDomain)}.
     *
     *       - ITEM-NO existence check for export control
     * {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfo(String, String, String, String, String, Date, WB001OdrRcvDomain)}.
     *
     *       - Packing CD related check
     *           This is a call about {@link WB001OdrRcvService#validateConsistencyPkgCd (String, String)}.
     *           
     * The check which needs - CIGMADB access
     * {@link WB001OdrRcvService#validateDatabaseWsB001OnHeaderMoveToRegister(String, String, String, String, String, Date, WsB001ResultDomain)}.
     *
     * - Authority check
     *       This is a call about {@link WB001OdrRcvService#validateConsistencyShipperPlantAuth(String, String)}.
     * 
     * - CIGMA夜間処理中チェック
     *     {@link WB001OdrRcvService#validateDatabaseCigmaAvailable(boolean, String)}を呼出
     *     
     * - DB整合性チェック
     *     - 受注会社存在チェック（NEXUS会社原単位）
     *         {@link WB001OdrRcvService#validateDatabaseTmNxsCompOnHeaderMoveToRegister(String, WB001OdrRcvDomain)}を呼出
     *         
     *     - 送荷先名称取得　存在チェック
     *         {@link WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnHeaderMoveToRegister(String, String, String, WB001OdrRcvDomain)}を呼出
     *         
     *     - 非EDI拠点チェック
     *         {@link WB001OdrRcvService#validateDatabaseWsB011OnHeaderMoveToRegister(String, String, String)}を呼出
     *         
     *     - 輸出対象品目番号存在チェック
     *         {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfo(String, String, String, String, String, Date, WB001OdrRcvDomain)}を呼出
     *         
     *     - 輸出規制対象品目番号存在チェック
     *         {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfo(String, String, String, String, String, Date, WB001OdrRcvDomain)}を呼出
     *         
     *     - 包装コード関連チェック
     *         {@link WB001OdrRcvService#validateConsistencyPkgCd(String, String)}を呼出
     *     
     * - CIGMADBアクセスが必要なチェック
     *     {@link WB001OdrRcvService#validateDatabaseWsB001OnHeaderMoveToRegister(String, String, String, String, String, Date, WsB001ResultDomain)}を呼出
     *         
     * - 権限チェック
     *     {@link WB001OdrRcvService#validateConsistencyShipperPlantAuth(String, String)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WB001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        SimpleDateFormat cigmaDf = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        SimpleDateFormat screenDf = new SimpleDateFormat(criteriaDomain.getScreenDateFormat());
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // The temporary domain for setting up return VALUE
        // 戻り値を設定する為の一時ドメイン
        WB001OdrRcvDomain tmpDomain = new WB001OdrRcvDomain();

        // This is a check during processing in the CIGMA night.
        // CIGMA夜間処理中チェック
        if (!wb001OdrRcvService.validateDatabaseCigmaAvailable(false, criteriaDomain.getRcvOdrCompCd())) {
            // MessageDomain msg = new MessageDomain("wb001CriteriaDomain.rcvOdrCompCd", NXS_E1_0060, null);
            MessageDomain msg = new MessageDomain("", NXS_E1_0060, null);
            
            errorList.add(msg);
            throw new ValidationException(errorList);
        }

        // ordering company existence check (NEXUS Company Master) & COMP_NM acquired in the temporary domain is set up.
        // 受注会社存在チェック（NEXUS会社原単位）& 一時ドメインに取得した COMP_NMを設定
        if (!wb001OdrRcvService.validateDatabaseTmNxsCompOnHeaderMoveToRegister(criteriaDomain.getRcvOdrCompCd(), tmpDomain)) {
            MessageDomain msg = new MessageDomain("wb001CriteriaDomain.rcvOdrCompCd", NXS_E7_0031, null);
            errorList.add(msg);
            throw new ValidationException(errorList);
        } else {
            criteriaDomain.setCompNm(tmpDomain.getCompNm());
            criteriaDomain.setItemNoGrp(tmpDomain.getItemNoGrp());
        }
        
        // SHIP-TO-NAME acquisition   Existence check
        // 送荷先名称取得　存在チェック
        if (!wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnHeaderMoveToRegister(criteriaDomain.getRcvOdrCompCd(), criteriaDomain.getCustomerCd(), criteriaDomain.getLgcyShipTo(), tmpDomain)) {
            MessageDomain msgShipperCd = new MessageDomain("wb001CriteriaDomain.rcvOdrCompCd", NXS_E7_0032, null);
            MessageDomain msgCustomerCd = new MessageDomain("wb001CriteriaDomain.customerCd", null, null);
            MessageDomain msgShipToCd = new MessageDomain("wb001CriteriaDomain.lgcyShipTo", null, null);
            
            errorList.add(msgShipperCd);
            errorList.add(msgCustomerCd);
            errorList.add(msgShipToCd);
        } else {
            criteriaDomain.setShipToNm(tmpDomain.getShipToNm());
        }
        
        // non-EDI base check
        // 非EDI拠点チェック
        if (!StringUtils.isEmpty(criteriaDomain.getShipToNm())) {
            List<String> errors = null;
            try {
                errors = wb001OdrRcvService.validateDatabaseWsB011OnHeaderMoveToRegister(criteriaDomain.getRcvOdrCompCd(), criteriaDomain.getCustomerCd(), criteriaDomain.getLgcyShipTo());
            } catch (GscmApplicationException e) {
                if (NXS_E1_0060.equals(e.getCode())) {
                    errorList.add(new MessageDomain("wb001CriteriaDomain.rcvOdrCompCd", e.getCode(), null));
                    throw new ValidationException(errorList);
                } else {
                    throw e;
                }
            }
            
            boolean ediCheckErrorFlg = false;
            
            if (errors != null && errors.size() > 0) {
                for (Iterator<String> i = errors.iterator(); i.hasNext();) {
                    String errorCd = i.next();
                    if (NXS_E7_0036.equals(errorCd)){
                        MessageDomain msgShipperCd = new MessageDomain("wb001CriteriaDomain.rcvOdrCompCd", NXS_E7_0036, null);
                        MessageDomain msgCustomerCd = new MessageDomain("wb001CriteriaDomain.customerCd", null, null);
                        MessageDomain msgShipToCd = new MessageDomain("wb001CriteriaDomain.lgcyShipTo", null, null);
                        
                        errorList.add(msgShipperCd);
                        errorList.add(msgCustomerCd);
                        errorList.add(msgShipToCd);
                    } else {
                        MessageDomain msg = new MessageDomain(null, errorCd, null);
                        errorList.add(msg);
                    }
                }
                ediCheckErrorFlg = true;
            }
            
            if (ediCheckErrorFlg) {
                throw new ValidationException(errorList);
            }
        }
        
        // ITEM-NO existence check for export
        // 輸出対象品目番号存在チェック
        if (!wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfo(
                criteriaDomain.getRcvOdrCompCd(), criteriaDomain.getItemNo(),
                convertNullToSpace(criteriaDomain.getPkgCd()), criteriaDomain.getCustomerCd(),
                criteriaDomain.getLgcyShipTo(), 
                commonService.searchCigmaAds(criteriaDomain.getRcvOdrCompCd()),
                tmpDomain)) {

            Object[] params = {""};

            MessageDomain msgShipperCd = new MessageDomain("wb001CriteriaDomain.rcvOdrCompCd", NXS_E7_0033, params);
            MessageDomain msgPartNo = new MessageDomain("wb001CriteriaDomain.itemNo", null, null);
            MessageDomain msgPkgCd = new MessageDomain("wb001CriteriaDomain.pkgCd", null, null);
            MessageDomain msgCustomerNo = new MessageDomain( "wb001CriteriaDomain.customerCd", null, null);
            MessageDomain msgShipToCd = new MessageDomain( "wb001CriteriaDomain.lgcyShipTo", null, null);

            errorList.add(msgShipperCd);
            errorList.add(msgPartNo);
            errorList.add(msgPkgCd);
            errorList.add(msgCustomerNo);
            errorList.add(msgShipToCd);
        } else {
            // acquired VALUE is set as a condition domain.
            // 取得した値を条件ドメインに設定
            if (tmpDomain.getShippingLot() != null) {
                criteriaDomain.setShippingLot(tmpDomain.getShippingLot().toPlainString());
            }
            //criteriaDomain.setItemDescription(tmpDomain.getItemDescription());
        }
        
        // ITEM-NO existence check for export control
        // 輸出規制対象品目番号存在チェック
        if (!wb001OdrRcvService.validateDatabaseTmExpFormalitiItemNo(
            criteriaDomain.getRcvOdrCompCd(), criteriaDomain.getItemNo(), 
            commonService.searchCigmaAds(criteriaDomain.getRcvOdrCompCd()), tmpDomain)) {

            Object[] params = {
                ""
            };
            
            MessageDomain msgShipperCd = new MessageDomain("wb001CriteriaDomain.rcvOdrCompCd", NXS_E7_0034, params);
            MessageDomain msgPartNo = new MessageDomain("wb001CriteriaDomain.itemNo", null, null);

            errorList.add(msgShipperCd);
            errorList.add(msgPartNo);
        } else {
            // acquired VALUE is set as a condition domain.
            // 取得した値を条件ドメインに設定
            criteriaDomain.setItemDescription(tmpDomain.getItemDescription());
        }
        
        // Acquisition of a parameter
        // パラメータの取得
        String pkgCd = criteriaDomain.getPkgCd();
        String itemNoGrp = criteriaDomain.getItemNoGrp();
        
        // packing CD related check
        // 包装コード関連チェック
        if (!wb001OdrRcvService.validateConsistencyPkgCd(pkgCd, itemNoGrp)) {
            String msgId = "";
            if (StringUtils.equals(itemNoGrp, ITEM_NO_GRP_DG) && !StringUtils.isBlank(pkgCd)) {
                msgId = NXS_E7_0142;
            } else if (StringUtils.equals(itemNoGrp, ITEM_NO_GRP_D) && StringUtils.isBlank(pkgCd)) {
                msgId = NXS_E7_0143;
            }
            if (!StringUtils.isBlank(msgId)) {
                MessageDomain msgShipperCd = new MessageDomain("wb001CriteriaDomain.pkgCd", msgId, null);
                
                errorList.add(msgShipperCd);
            }
        }
        
        if (!errorList.isEmpty()) {
            throw new ValidationException(errorList);
        }
        
        // The check which needs CIGMADB access
        // CIGMADBアクセスが必要なチェック
        WsB001ResultDomain wsB001ResultDomain = new WsB001ResultDomain();
        
        try {
            if (!wb001OdrRcvService.validateDatabaseWsB001OnHeaderMoveToRegister(criteriaDomain.getRcvOdrCompCd(), criteriaDomain.getCustomerCd(), 
                criteriaDomain.getLgcyShipTo(), criteriaDomain.getItemNo(), criteriaDomain.getPkgCd(),
                DateUtil.parseDate(criteriaDomain.getEtdDueDt(), criteriaDomain.getScreenDateFormat()), wsB001ResultDomain)) {
                
                List<ErrorListItemDomain> errors = wsB001ResultDomain.getErrorList();
                for (Iterator<ErrorListItemDomain> i = errors.iterator(); i.hasNext();) {
                    ErrorListItemDomain error = i.next();
                    
                    String errCode = error.getErrorCode();
                    MessageDomain msgCustomerCd = new MessageDomain("wb001CriteriaDomain.customerCd", null, null);
                    MessageDomain msgLgcyShipTo = new MessageDomain("wb001CriteriaDomain.lgcyShipTo", null, null);
                    MessageDomain msgItemNo = new MessageDomain("wb001CriteriaDomain.itemNo", null, null);
                    Object[] params = {""};
                    
                    if (NXS_E7_0035.equals(errCode)){
                        msgCustomerCd.setKey(errCode);
                        errorList.add(msgCustomerCd);
                        errorList.add(msgLgcyShipTo);
                    } else if (NXS_E7_0028.equals(errCode)){
                        msgCustomerCd.setKey(errCode);
                        errorList.add(msgCustomerCd);
                    } else if (NXS_E7_0027.equals(errCode)){
                        msgCustomerCd.setKey(errCode);
                        errorList.add(msgCustomerCd);
                        errorList.add(msgLgcyShipTo);
                    } else if (NXS_E7_0029.equals(errCode)){
                        msgCustomerCd.setKey(errCode);
                        errorList.add(msgCustomerCd);
                    } else if (NXS_W1_0002.equals(errCode)){
                        msgCustomerCd.setKey(errCode);
                        msgCustomerCd.setParams(params);
                        errorList.add(msgCustomerCd);
                        errorList.add(msgItemNo);
                    } else if (NXS_E7_0030.equals(errCode)){
                        msgItemNo.setKey(errCode);
                        msgItemNo.setParams(params);
                        errorList.add(msgItemNo);
                    } else if (NXS_W1_0003.equals(errCode)){
                        msgItemNo.setKey(errCode);
                        msgItemNo.setParams(params);
                        errorList.add(msgItemNo);
                    } else {
                        // In order to prevent leak when the message of WsB003 is added in the future
                        // 将来的にWsB003のメッセージが追加になった場合の漏れを防止する為
                        MessageDomain msg = new MessageDomain("", errCode, null);
                        errorList.add(msg);
                    }
                }
            }
        } catch (GscmApplicationException e) {
            if (NXS_E1_0060.equals(e.getCode())) {
                errorList.add(new MessageDomain("wb001CriteriaDomain.rcvOdrCompCd", e.getCode(), null));
                throw new ValidationException(errorList);
            } else {
                throw e;
            }
        }
        
        // ST981 ADD START
        //if (wsB001ResultDomain.getDateList() != null) { // IN136 ADD
        //    if (wsB001ResultDomain.getDateList().size() == 0) {
        if (CollectionUtils.isEmpty(wsB001ResultDomain.getDateList())) { // ST990 MOD
            Object[] params = { "CIGMA's Relative Week Calendar Master", criteriaDomain.getEtdDueDt() };
            errorList.add(new MessageDomain(null, NXS_E1_0031, params));
            errorList.add(new MessageDomain("wb001CriteriaDomain.etdDueDt", null, null));
            throw new ValidationException(errorList);
        }
        // ST981 ADD END

        // ST990 ADD START
        // If the Start date release is specified before the date on which the CIGMA calendar exists, it is an error.
        // 開始日-Start Date ReleaseがCIGMAカレンダーが存在する日以前へ指定された場合、エラーとする。
        Date inputStartDateReleaseDate
            = DateUtil.parseDate(criteriaDomain.getEtdDueDt(), criteriaDomain.getScreenDateFormat());
        Date cigmaCalenderStartDate
            = DateUtil.parseDate(wsB001ResultDomain.getDateList().get(0).getDate(), WS_CIGMA_DATE_FORMAT);
        if (inputStartDateReleaseDate.before(cigmaCalenderStartDate)) {
            Object[] params = { "CIGMA's Relative Week Calendar Master", criteriaDomain.getEtdDueDt() };
            errorList.add(new MessageDomain(null, NXS_E1_0031, params));
            errorList.add(new MessageDomain("wb001CriteriaDomain.etdDueDt", null, null));
            throw new ValidationException(errorList);
        }
        // ST990 ADD END

        boolean authCheck = true;
        if (CheckUtil.isBlankOrNull(wsB001ResultDomain.getPlantCodeLegacy())) {
            authCheck = false;
        }
        
        // authority check
        // 権限チェック
        if (authCheck) {
            if (!wb001OdrRcvService.validateConsistencyShipperPlantAuth(criteriaDomain.getRcvOdrCompCd(), wsB001ResultDomain.getPlantCodeLegacy())) {
                MessageDomain msgShipperCd = new MessageDomain("wb001CriteriaDomain.rcvOdrCompCd", GSCM_I0_0009, null);
                
                errorList.add(msgShipperCd);
            }
        }
        
        // checked result judging
        // チェック結果判定
        if (errorList != null && errorList.size() > 0) {
            boolean throwFlg = false;
            if (StringUtils.equals(criteriaDomain.getIgnoreWarnings(), CHECK_ON)) {
                // In warning disregard, only when the message which starts except NXS-W* exists, it throw(s).
                // 警告無視の場合は、NXS-W*以外で始まるメッセージが存在する場合のみ、throwする。
                String warningMsgWord = "NXS-W";
                for (Iterator<MessageDomain> i = errorList.iterator(); i.hasNext();) {
                    MessageDomain msg = i.next();
                    if (msg.getKey() != null && !msg.getKey().startsWith(warningMsgWord)) {
                        throwFlg = true;
                        break;
                    }
                }
            } else {
                throwFlg = true;
            }
            if (throwFlg) {
                throw new ValidationException(errorList);
            }
        }
        
        // Delivery item setting on the following screen
        // 次画面への受渡項目設定
        List<String> dateList = new ArrayList<String>();
        List<String> workDayFlagList = new ArrayList<String>();
        List<String> customerPartNoList = new ArrayList<String>();
        
        if (wsB001ResultDomain != null) {
            for (WsB001ResultItemDomain wsB001ResultItem : wsB001ResultDomain.getDateList()){
                // String date = DateUtil.formatDate(wsB001ResultItem.getDate(), criteriaDomain.getScreenDateFormat());
                String date;
                try {
                    date = screenDf.format(cigmaDf.parse(wsB001ResultItem.getDate()));
                } catch (ParseException e) {
                    throw new ApplicationException("");
                }
                // debug
                // System.out.println(wsB001ResultItem.getDate());
                // end
                // String date = "10/05/2014";
                String workDayFlag = new String();
                if (wsB001ResultItem.isWorkDayFlag()){
                    workDayFlag = FLAG_Y;
                } else {
                    workDayFlag = FLAG_N;
                }
                dateList.add(date);
                workDayFlagList.add(workDayFlag);
                String CustomerPartNo = "";
                if (wsB001ResultItem.getCustomerPartNo() != null) {
                    CustomerPartNo = wsB001ResultItem.getCustomerPartNo();
                }
                customerPartNoList.add(CustomerPartNo);
            }
            criteriaDomain.setDateList(dateList);
            criteriaDomain.setWorkDayFlgList(workDayFlagList);
            criteriaDomain.setCustomerPartNoList(customerPartNoList);
            criteriaDomain.setPartName(wsB001ResultDomain.getPartName());
            criteriaDomain.setPlntCd(convertNullToSpace(wsB001ResultDomain.getPlantCodeLegacy()));
            criteriaDomain.setSupplierCd(wsB001ResultDomain.getSupplierCode());
        }
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(WB001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return null;
    }
    
    /**
     * null is changed into an empty string.
     * <br />nullを空文字に変換します。
     *
     * @param s Changing agency string<br />変換元文字列
     * @return After-converted string<br />変換後文字列
     */
    protected String convertNullTo0Byte(String s){
        if (s == null){
            return "";
        } else {
            return s;
        }
    }
    
    /**
     * null or an empty string is changed into space.
     * <br />nullか空文字をspaceに変換します。
     *
     * @param s Changing agency string<br />変換元文字列
     * @return After-converted string<br />変換後文字列
     */
    protected String convertNullToSpace(String s){
        if (StringUtils.isEmpty(s)){
            return " ";
        } else {
            return s;
        }
    }
}
