/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0037;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB006;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.WB006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB006ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB006UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WB001OdrRcvService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * This is an implement class of the Facade service to Search action of the Last Digit Change Main Screen.
 * <br />品番末尾変更メイン画面のSearchアクションに対するFacadeサービスの実装クラスです。
 *
 * @version $Revision: 10295 $
 */
public class WB006SearchFacadeServiceImpl extends AbstractSearchFacadeService<WB006UpdateDomain, WB006CriteriaDomain> {
    
    /**
     * common service
     * <br />commonサービス
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
    public WB006SearchFacadeServiceImpl() {
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
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WB006CriteriaDomain filterDomain(WB006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
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
    protected void validateItems(WB006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<WB006CriteriaDomain> valid 
            = new Validator<WB006CriteriaDomain>(criteriaDomain, "wb006CriteriaDomain");
        
        String[] properties = {
            "rcvOdrCompCd",
            "customerCd",
            "lgcyShipTo",
            "trnsCd",
            "shippingDt",
            "itemNoOrg",
            "pkgCd"
        };
        valid.isValidateProperties(properties, SCREEN_ID_WB006);
        
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
    protected void validateConsistency(WB006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - common specifications : this is a check during processing in the CIGMA night.   (behavior in a CIGMA night batch)  
     *       This is a call about {@link WB001OdrRcvService#validateDatabaseCigmaAvailable (boolean, String)}.
     *
     * - Ordering company existence check (NEXUS Company Master)
     *       This is a call about {@link WB001OdrRcvService#validateDatabaseTmNxsComp(String, WB001OdrRcvDomain)}.
     *
     * - SHIP-TO-NAME acquisition   Existence check
     *       This is a call about * {@link WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnLstDgtChgMainSearch(String, String, String, WB001OdrRcvDomain)}.
     *
     * - Non-EDI base check
     *       This is a call about {@link WB001OdrRcvService#validateDatabaseWsB011OnLstDgtChgMainSearch (String, String, String)}.
     *
     * - Item existence check
     *       This is a call about * {@link WB001OdrRcvService#validateDatabaseTmExFormaltiItemNoOnLstDgtChgMainSearch(String, String, Date, String[])}.
     * 
     * - 共通仕様：CIGMA夜間処理中チェック　（CIGMA夜間バッチ中の振る舞い）
     *     {@link WB001OdrRcvService#validateDatabaseCigmaAvailable(boolean, String)}を呼出
     *     
     * - 受注会社存在チェック（NEXUS会社原単位）
     *     {@link WB001OdrRcvService#validateDatabaseTmNxsComp(String, WB001OdrRcvDomain)}を呼出
     *     
     * - 送荷先名称取得　存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnLstDgtChgMainSearch(String, String, String, WB001OdrRcvDomain)}を呼出
     *     
     * - 非EDI拠点チェック
     *     {@link WB001OdrRcvService#validateDatabaseWsB011OnLstDgtChgMainSearch(String, String, String)}を呼出
     *     
     * - 品目存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmExFormaltiItemNoOnLstDgtChgMainSearch(String, String, Date, String[])}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WB006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // CIGMA use propriety check
        // チェック項目の取得
        String rcvOdrCompCd = criteriaDomain.getRcvOdrCompCd();
        String customerCd = criteriaDomain.getCustomerCd();
        String lgcyShipTo = criteriaDomain.getLgcyShipTo();
        String itemNoOrg = criteriaDomain.getItemNoOrg();
        
        // The domain for setting up return VALUE
        // 戻り値を設定する為のドメイン
        WB001OdrRcvDomain tmpDomain = new WB001OdrRcvDomain();
        
        // CIGMA use propriety check
        // CIGMA利用可否チェック
        if (!wb001OdrRcvService.validateDatabaseCigmaAvailable(false, rcvOdrCompCd)) {
            MessageDomain msg = new MessageDomain("", NXS_E1_0060, null);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }
        
        // Ordering company existence check (NEXUS Company Master)  
        // 受注会社存在チェック（NEXUS会社原単位）
        if (!wb001OdrRcvService.validateDatabaseTmNxsComp(rcvOdrCompCd, tmpDomain)) {
            MessageDomain msg = new MessageDomain("wb006CriteriaDomain.rcvOdrCompCd", NXS_E7_0031, null);
            errorList.add(msg);
            throw new ValidationException(errorList);
        } else {
            criteriaDomain.setCompNm(tmpDomain.getCompNm());
            criteriaDomain.setCompNmHidden(tmpDomain.getCompNm());
        }
        
        // SHIP-TO-NAME acquisition   Existence check
        // 送荷先名称取得 存在チェック
        boolean existsShipToFlg = 
            wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnLstDgtChgMainSearch(rcvOdrCompCd, customerCd, lgcyShipTo, tmpDomain);
        criteriaDomain.setShipToNm(tmpDomain.getShipToNm());
        criteriaDomain.setShipToNmHidden(tmpDomain.getShipToNm());
        
        // Non-EDI base check
        // 非EDI拠点チェック
        if (existsShipToFlg) {
            List<String> wsErrorList = null;
            try {
                wsErrorList = 
                    wb001OdrRcvService.validateDatabaseWsB011OnLstDgtChgMainSearch(rcvOdrCompCd, customerCd, lgcyShipTo);
            } catch (GscmApplicationException e) {
                if (NXS_E1_0060.equals(e.getCode())) {
                    errorList.add(new MessageDomain("wb006CriteriaDomain.rcvOdrCompCd", e.getCode(), null));
                    throw new ValidationException(errorList);
                } else {
                    throw e;
                }
            }
            
            if (wsErrorList != null && wsErrorList.size() > 0) {
                for (Iterator<String> i = wsErrorList.iterator(); i.hasNext();) {
                    String errorCd = i.next();
                    if (NXS_E7_0037.equals(errorCd)){
                        errorList.add(new MessageDomain("wb006CriteriaDomain.rcvOdrCompCd", errorCd, null));
                        errorList.add(new MessageDomain("wb006CriteriaDomain.customerCd", null, null));
                        errorList.add(new MessageDomain("wb006CriteriaDomain.lgcyShipTo", null, null));
                    } else {
                        errorList.add(new MessageDomain(null, errorCd, null));
                    }
                }
                throw new ValidationException(errorList);
            }
        }
        
        // Item existence check
        // 品目存在チェック
        Date today = commonService.searchCigmaAds(rcvOdrCompCd);
        if (wb001OdrRcvService.validateDatabaseTmExpFormalitiItemNo(rcvOdrCompCd, itemNoOrg, today, tmpDomain)) {
            criteriaDomain.setItemDescription(tmpDomain.getItemDescription());
            criteriaDomain.setItemDescriptionHidden(tmpDomain.getItemDescription());
        }
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - Customer Order Receiving search-condition domain
     *       {@link WB001OdrRcvCriteriaDomain} is created and the contents of {@link WB006CriteriaDomain} are set up.
     *
     * - Export-Receive-Order information retrieval
     *       This is an argument about created {@link WB001OdrRcvCriteriaDomain},
     *       This is a call about {@link WB001OdrRcvService#searchForPagingOnLstDgtChgMainSearch (WB001OdrRcvCriteriaDomain)}.
     *
     * A create of - Update domain
     *       {@link WB006UpdateDomain} is created based on search results.
     *
     * A return of - Update domain
     * 
     * - Customer Order Receiving検索条件ドメインの作成
     *     {@link WB001OdrRcvCriteriaDomain}を作成し、{@link WB006CriteriaDomain}の内容を設定
     *     
     * - 輸出受注情報検索
     *     作成した{@link WB001OdrRcvCriteriaDomain}を引数に、
     *     {@link WB001OdrRcvService#searchForPagingOnLstDgtChgMainSearch(WB001OdrRcvCriteriaDomain)}を呼出
     *     
     * - Updateドメインの作成
     *     検索結果をもとに{@link WB006UpdateDomain}を作成する
     *     
     * - Updateドメインの返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WB006UpdateDomain callServices(WB006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        // A create of a Customer Order Receiving search-condition domain
        // Customer Order Receiving検索条件ドメインの作成
        WB001OdrRcvCriteriaDomain odrRcvCriteria = new WB001OdrRcvCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(odrRcvCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        odrRcvCriteria.setPageInfoCreator(criteriaDomain.getPageInfoCreator());
        
        // Export-Receive-Order information retrieval
        // 輸出受注情報検索
        List<? extends WB001OdrRcvDomain> odrRcvList = wb001OdrRcvService.searchForPagingOnLstDgtChgMainSearch(odrRcvCriteria);
        
        // A create of a Update domain
        // Updateドメインの作成
        List<WB006ListDomain> listDomainList = new ArrayList<WB006ListDomain>();
        for (Iterator<? extends WB001OdrRcvDomain> i = odrRcvList.iterator(); i.hasNext();) {
            WB001OdrRcvDomain odrRcv = i.next();
            
            WB006ListDomain listDomain = new WB006ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(listDomain, odrRcv);
            listDomain.setSelected(null);
            if (StringUtils.isEmpty(odrRcv.getPkgCd())) {
                listDomain.setPkgCd("");
            }
            listDomain.setPkgCdHidden(odrRcv.getPkgCd());
            listDomain.setCustomerPoNoHidden(odrRcv.getCustomerPoNo());
            listDomain.setOdrQtyHidden(odrRcv.getOdrQty().toString());
            listDomain.setOdrCtrlNo(odrRcv.getOdrCtrlNo().toString());
            listDomainList.add(listDomain);
        }
        
        WB006UpdateDomain updateDomain = new WB006UpdateDomain();
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(listDomainList);
        
        // A return of a Update domain
        // Updateドメインの返却
        return updateDomain;
    }
}
