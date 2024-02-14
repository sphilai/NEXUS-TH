/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0031;
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0034;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB004;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.WB004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB004ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB004UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WB001OdrRcvService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
//import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;


/**
 * This is an implement class of the Facade service to Search action of ordering search main screen.
 * <br />受注検索メイン画面のSearchアクションに対するFacadeサービスの実装クラスです。
 *
 * @version $Revision: 10296 $
 */
public class WB004SearchFacadeServiceImpl extends AbstractSearchFacadeService<WB004UpdateDomain, WB004CriteriaDomain> {
    
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
    public WB004SearchFacadeServiceImpl() {
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
    protected WB004CriteriaDomain filterDomain(WB004CriteriaDomain criteriaDomain)
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
    protected void validateItems(WB004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<WB004CriteriaDomain> valid 
            = new Validator<WB004CriteriaDomain>(criteriaDomain, "wb004CriteriaDomain");
        
        String[] properties = {
            "rcvOdrCompCd",
            "itemNo",
            "pkgCd"
        };
        
        valid.isValidateProperties(properties, SCREEN_ID_WB004);
        
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
    protected void validateConsistency(WB004CriteriaDomain criteriaDomain)
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
     * - Item existence check
     *       This is a call about * {@link WB001OdrRcvService#validateDatabaseTmExFormaltiItemNoOnLstDgtChgMainSearch(String, String, Date, String[])}.
     * 
     * - 共通仕様：CIGMA夜間処理中チェック　（CIGMA夜間バッチ中の振る舞い）
     *     {@link WB001OdrRcvService#validateDatabaseCigmaAvailable(boolean, String)}を呼出
     *     
     * - 受注会社存在チェック（NEXUS会社原単位）
     *     {@link WB001OdrRcvService#validateDatabaseTmNxsComp(String, WB001OdrRcvDomain)}を呼出
     *     
     * - 品目存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmExFormaltiItemNoOnLstDgtChgMainSearch(String, String, Date, String[])}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WB004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // CIGMA use propriety check
        // チェック項目の取得
        String rcvOdrCompCd = criteriaDomain.getRcvOdrCompCd();
        String itemNo = criteriaDomain.getItemNo();
        
        // The domain for setting up return VALUE
        // 戻り値を設定する為のドメイン
        WB001OdrRcvDomain tmpDomain = new WB001OdrRcvDomain();
        
        // Ordering company existence check (NEXUS Company Master)  
        // 受注会社存在チェック（NEXUS会社原単位）
        if (!wb001OdrRcvService.validateDatabaseTmNxsComp(rcvOdrCompCd, tmpDomain)) {
            criteriaDomain.setItemDescription("");
            criteriaDomain.setItemDescriptionHidden("");
        } else {
            criteriaDomain.setCompNm(tmpDomain.getCompNm());
            criteriaDomain.setCompNmHidden(tmpDomain.getCompNm());
            // Item existence check
            // 品目存在チェック
            Date today = commonService.searchCigmaAds(rcvOdrCompCd);
            if (!wb001OdrRcvService.validateDatabaseTmExpFormalitiItemNo(rcvOdrCompCd, itemNo, today, tmpDomain)) {
                criteriaDomain.setItemDescription("");
                criteriaDomain.setItemDescriptionHidden("");
            } else {
                // acquired VALUE is set as a condition domain.
                // 取得した値を条件ドメインに設定
                criteriaDomain.setItemDescription(tmpDomain.getItemDescription());
                criteriaDomain.setItemDescriptionHidden(tmpDomain.getItemDescription());
            }
        }
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - Customer Order Receiving search-condition domain
     *       {@link WB001OdrRcvCriteriaDomain} is created and the contents of {@link WB004CriteriaDomain} are set up.
     *
     * - Export-Receive-Order information retrieval
     *       This is an argument about created {@link WB001OdrRcvCriteriaDomain},
     *       This is a call about {@link WB001OdrRcvService#searchForPagingOnMainSearch (WB001OdrRcvCriteriaDomain)}.
     *
     * A create of - Update domain
     *       {@link WB004UpdateDomain} is created based on search results.
     *
     * A return of - Update domain
     * 
     * - Customer Order Receiving検索条件ドメインの作成
     *     {@link WB001OdrRcvCriteriaDomain}を作成し、{@link WB004CriteriaDomain}の内容を設定
     *     
     * - 輸出受注情報検索
     *     作成した{@link WB001OdrRcvCriteriaDomain}を引数に、
     *     {@link WB001OdrRcvService#searchForPagingOnMainSearch(WB001OdrRcvCriteriaDomain)}を呼出
     *     
     * - Updateドメインの作成
     *     検索結果をもとに{@link WB004UpdateDomain}を作成する
     *     
     * - Updateドメインの返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WB004UpdateDomain callServices(WB004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        // BL domain -- repacking
        // BLドメインへの詰め替え
        WB001OdrRcvCriteriaDomain wB001OdrRcvCriteriaDomain = new WB001OdrRcvCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(wB001OdrRcvCriteriaDomain, criteriaDomain);
        wB001OdrRcvCriteriaDomain.setPageInfoCreator(criteriaDomain.getPageInfoCreator());

        // Retrieval processing
        // 検索処理
        List<? extends WB001OdrRcvDomain> resultList = wb001OdrRcvService
            .searchForPagingOnMainSearch(wB001OdrRcvCriteriaDomain);

        // Search results
        // 検索結果
        List<WB004ListDomain> listDomainList = new ArrayList<WB004ListDomain>();

        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        criteriaDomain.setCompNm(wB001OdrRcvCriteriaDomain.getRcvOdrCompNm());
        criteriaDomain.setItemDescription(wB001OdrRcvCriteriaDomain.getItemNm());
        criteriaDomain.setRcvOdrCompCdHidden(criteriaDomain.getRcvOdrCompCd());
        criteriaDomain.setCompNmHidden(wB001OdrRcvCriteriaDomain.getRcvOdrCompNm());
        criteriaDomain.setItemNoHidden(criteriaDomain.getItemNo());
        criteriaDomain.setItemDescriptionHidden(wB001OdrRcvCriteriaDomain.getItemNm());
        
        // Setting of a detailed domain
        // 明細ドメインの設定
        for (Iterator<? extends WB001OdrRcvDomain> i = resultList.iterator(); i
            .hasNext();) {
            WB001OdrRcvDomain odrRcvDomain = i.next();
            WB004ListDomain listDomain = new WB004ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(listDomain, odrRcvDomain);

            // Registration of the data to non-display item
            // 非表示項目へのデータの登録
            listDomain.setCustomerCdHidden(listDomain.getCustomerCd());
            listDomain.setLgcyShipToHidden(listDomain.getLgcyShipTo());
            listDomain.setShipToNmHidden(listDomain.getShipToNm());
            listDomain.setTrnsCdHidden(listDomain.getTrnsCd());
            listDomain.setPkgCdHidden(listDomain.getPkgCd());

            // Correction of PKG CD
            // PKG CD の修正
            if (StringUtils.equals(listDomain.getPkgCd(), " ")) {
                listDomain.setPkgCd("");
            }

            listDomainList.add(listDomain);
        }
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        WB004UpdateDomain updateDomain = new WB004UpdateDomain();
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(listDomainList);

        return updateDomain;
    }
}
