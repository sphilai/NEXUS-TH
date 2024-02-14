/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          : 2013/12/16
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0038;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0129;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0130;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0131;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WC001;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WC001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WC001UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WC001ErtCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WC001ErtService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.Validator;


/**
 * This is an implement class of the Facade service to PrintCml action of a return recommendation packing-style create, re printing, and a cancellation screen.
 * <br />返却推奨荷姿作成・再印刷・キャンセル画面のPrintCmlアクションに対するFacadeサービスの実装クラスです。
 *
 * @version $Revision: 6774 $
 */
public class WC001PrintCmlFacadeServiceImpl extends AbstractSearchFacadeService<File, WC001UpdateDomain> {

    /**
     * Common service
     * <br />Commonサービス
     */
    protected CommonService commonService;

    /**
     * E-RT service
     * <br />E-RTサービス
     */
    protected WC001ErtService wc001ErtService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WC001PrintCmlFacadeServiceImpl() {
    }
    

    /**
     * Setter method for wC001ErtService.
     *
     * @param ertService Set for wC001ErtService
     */
    public void setWc001ErtService(WC001ErtService ertService) {
        wc001ErtService = ertService;
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
    protected WC001UpdateDomain filterDomain(WC001UpdateDomain criteriaDomain)
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
    protected void validateItems(WC001UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        Validator<WC001UpdateDomain> valid = new Validator<WC001UpdateDomain>(criteriaDomain, "criteriaDomain");

        // Unary eye check
        // 単項目チェック
        String[] properties = { 
            "fromMainMark",
            "toMainMark",
        };
        valid.isValidateProperties(properties, SCREEN_ID_WC001);

        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            errList.addAll(valid.getErrList());
        }
        if (0 < errList.size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - FROM-TO correlation check
     *       This is a call about {@link WC001ErtService#validateConsistencyCmlNoFromCmlNoTo (String, String)}.
     * - FROM-TO input check
     *       This is a call about {@link WC001ErtService#validateConsistencyCmlNoFromCmlNoToInput (String, String)}.
     * 
     * - FROM-TO相関チェック
     *     {@link WC001ErtService#validateConsistencyCmlNoFromCmlNoTo(String, String)}を呼出
     * - FROM-TO入力チェック
     *     {@link WC001ErtService#validateConsistencyCmlNoFromCmlNoToInput(String, String)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(WC001UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // FROM-TO correlation check
        // FROM-TO相関チェック
        if (!wc001ErtService.validateConsistencyCmlNoFromCmlNoTo(updateDomain.getFromMainMark(), updateDomain.getToMainMark())) {
            Object[] params = {commonService.getResource(updateDomain.getLocale(), "label.mainMark")};
            errList.add(new MessageDomain("criteriaDomain.fromMainMark", GSCM_E0_0031, params));
            errList.add(new MessageDomain("criteriaDomain.toMainMark", null, null));
        }

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Authority check (at least one is to CML applicable to the range of (From) CML No.   - CML No. (To))
     *                  If CML without update authority exists, it will be considered as an error.
     *     This is a call about {@link WC001ErtService#validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(WC001ErtCriteriaDomain)}.
     * 
     * - 権限チェック(CML No. (From)  ～ CML No. (To)の範囲に該当するCMLに1つでも、
     *                更新権限がないCMLが存在すればエラーとする)
     *     {@link WC001ErtService#validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(WC001ErtCriteriaDomain)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WC001UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        WC001ErtCriteriaDomain wc001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
        wc001ErtCriteriaDomain.setShipperCd(updateDomain.getShipperCd());
        wc001ErtCriteriaDomain.setPlntCd(updateDomain.getPlntCd());
        wc001ErtCriteriaDomain.setFromMainMark(updateDomain.getFromMainMark());
        wc001ErtCriteriaDomain.setToMainMark(updateDomain.getToMainMark());
        wc001ErtCriteriaDomain.setServerId(updateDomain.getServerId());
        
        if (CheckUtil.isBlankOrNull(wc001ErtCriteriaDomain.getToMainMark())) {
            wc001ErtCriteriaDomain.setToMainMark(updateDomain.getFromMainMark());
        }
        
        // Authority check
        // (at least one is to CML applicable to the range of (From) CML No.   - CML No. (To))
        //        If CML without update authority exists, it will be considered as an error.
        // 権限チェック
        // (CML No. (From)  ～ CML No. (To)の範囲に該当するCMLに1つでも、
        //        更新権限がないCMLが存在すればエラーとする)
        String[] retAuth = wc001ErtService.validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(wc001ErtCriteriaDomain);
        if (retAuth[0].equals(GSCM_I0_0009)) {
            Object[] params = {""};
            errList.add(new MessageDomain("criteriaDomain.fromMainMark", retAuth[0], params));
            errList.add(new MessageDomain("criteriaDomain.toMainMark", null, null));
        } else if (retAuth[0].equals(NXS_E7_0129)) {
            Object[] params = {retAuth[1]};
            errList.add(new MessageDomain("criteriaDomain.fromMainMark", NXS_E7_0129, params));
            errList.add(new MessageDomain("criteriaDomain.toMainMark", null, null));
        } else if (retAuth[0].equals(GSCM_E0_0038)) {
            Object[] params = {retAuth[1], 100};
            errList.add(new MessageDomain("criteriaDomain.fromMainMark", GSCM_E0_0038, params));
            errList.add(new MessageDomain("criteriaDomain.toMainMark", null, null));
        } else if (retAuth[0].equals(NXS_E7_0130)) {
            Object[] params = {retAuth[1]};
            errList.add(new MessageDomain("criteriaDomain.fromMainMark", NXS_E7_0130, params));
            errList.add(new MessageDomain("criteriaDomain.toMainMark", null, null));
        } else if (retAuth[0].equals(NXS_E7_0131)) {
            Object[] params = {retAuth[1]};
            errList.add(new MessageDomain("criteriaDomain.fromMainMark", NXS_E7_0131, params));
            errList.add(new MessageDomain("criteriaDomain.toMainMark", null, null));
        }

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - A create of ERT search-condition domain
     *       {@link WC001ErtCriteriaDomain} is created and the contents of {@link WC001CriteriaDomain} are set up.
     *
     * - Execution of cancellation processing
     *       This is an argument about created {@link WC001ErtCriteriaDomain},
     *       This is a call about {@link WC001ErtService#printErt (WC001ErtCriteriaDomain)}.
     * 
     * - ERT検索条件ドメインの作成
     *     {@link WC001ErtCriteriaDomain}を作成し、{@link WC001CriteriaDomain}の内容を設定
     *     
     * - キャンセル処理の実行
     *     作成した{@link WC001ErtCriteriaDomain}を引数に、
     *     {@link WC001ErtService#printErt(WC001ErtCriteriaDomain)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(WC001UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        return wc001ErtService.printErt(this.createDomain(updateDomain));
    }

    /**
     * {@link WC001ErtCriteriaDomain} is created.
     * <br />{@link WC001ErtCriteriaDomain}を作成します。
     *
     * @param updateDomain Search-condition domain {@link WC001UpdateDomain}<br />検索条件ドメイン{@link WC001UpdateDomain}
     * @return Created {@link WC001ErtCriteriaDomain}<br />作成した{@link WC001ErtCriteriaDomain}
     */
    protected WC001ErtCriteriaDomain createDomain(WC001UpdateDomain updateDomain) {
        WC001ErtCriteriaDomain wC001ErtDomain = new WC001ErtCriteriaDomain();
        
        wC001ErtDomain.setFromMainMark(updateDomain.getFromMainMark());
        wC001ErtDomain.setToMainMark(updateDomain.getToMainMark());
        
        if (CheckUtil.isBlankOrNull(wC001ErtDomain.getToMainMark())) {
            wC001ErtDomain.setToMainMark(updateDomain.getFromMainMark());
        }
        
        return wC001ErtDomain;
    }
}
