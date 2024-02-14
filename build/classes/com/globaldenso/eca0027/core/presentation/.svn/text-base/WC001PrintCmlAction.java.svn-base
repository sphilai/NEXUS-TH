/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WC001;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.WC001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WC001UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Print CML action class of a return recommendation packing-style create, re printing, and a cancellation screen
 * <br />返却推奨荷姿作成・再印刷・キャンセル画面のPrint CMLアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":WC001.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
public class WC001PrintCmlAction extends WC001AbstractAction {

    /**
     * PrintCmlFacade service
     * <br />PrintCmlFacadeサービス
     */
    protected SearchFacadeService<File, WC001UpdateDomain> wc001PrintCmlFacadeService;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public WC001PrintCmlAction() {
        super();
    }

    /**
     * Setter method for wc001PrintCmlFacadeService.
     *
     * @param transactFacadeService Set for wc001PrintCmlFacadeService
     */
    public void setWc001PrintCmlFacadeService(
        SearchFacadeService<File, WC001UpdateDomain> transactFacadeService) {
        wc001PrintCmlFacadeService = transactFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        WC001ActionForm wc001Form = (WC001ActionForm) form;

        if (!wc001Form.isDownloadCml()) {
            // Setting of a search-condition domain
            // 検索条件ドメインの設定
            WC001UpdateDomain updateDomain = prepareCriteriaDomain(wc001Form);
            
            // create of PDF list
            // PDF帳票の作成
            File report = wc001PrintCmlFacadeService.search(updateDomain);
            
            // Preservation of PDF list
            // PDF帳票の保存
            saveReport(wc001Form, report);
            
            // Setting of a download flag
            // ダウンロードフラグの設定
            wc001Form.setDownloadCml(true);
            
            return FORWARD_SUCCESS;
            
        } else {
            // Acquisition of PDF list
            // PDF帳票の取得
            File report = getReport(wc001Form);
            
            // Download of PDF list
            // PDF帳票のダウンロード
            String fileName = wc001Form.getCriteriaDomain().getFromMainMark() + EXT_PDF;
            ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(report)), fileName, response);
            
            return null;
        }
    }

    /**
     *    {@link WC001UpdateDomain} is set up.
     * <br />{@link WC001UpdateDomain}を設定します。
     *
     * @param wc001Form Action form of an Empty RT materials screen<br />Empty RT materials画面のアクションフォーム
     * @return Created {@link WC001UpdateDomain}<br />作成した{@link WC001UpdateDomain}
     */
    protected WC001UpdateDomain prepareCriteriaDomain(WC001ActionForm wc001Form) {
        
        WC001UpdateDomain updateDomain = new WC001UpdateDomain();
        
        // Setting of LANGUAGE CODE, and a DSC-ID (required for an input check, and registration and an update process)  
        // 言語コード・DSC-IDの設定 (入力チェックおよび登録・更新処理に必要)
        WC001CriteriaDomain criteriaDomain = wc001Form.getCriteriaDomain();
        updateDomain.setLanguageCd(wc001Form.getLanguageCd());
        updateDomain.setLoginUserDscId(criteriaDomain.getLoginUserDscId());
        updateDomain.setServerId(criteriaDomain.getServerId());
        
        // Acquisition of a last update date
        // 最終更新日の取得
        Timestamp comUpdateTimestamp = criteriaDomain.getComUpdateTimestamp();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, wc001Form.getWindowId(), wc001Form.getScreenId());

        // Setting of conditions
        // 条件の設定
        updateDomain.setFromMainMark(criteriaDomain.getFromMainMark());
        updateDomain.setToMainMark(criteriaDomain.getToMainMark());
        updateDomain.setShipperCd(criteriaDomain.getShipperCdHidden());
        updateDomain.setPlntCd(criteriaDomain.getPlntCd());

        // setting of a List domain
        // Listドメインの設定
        updateDomain.setListDomainList(wc001Form.getListDomainList());
        
        // Resetting of last update date (since this is cleared at the time of a setting of a screen common information)  
        // 最終更新日の再設定 (画面共通情報の設定時にクリアされるため)
        updateDomain.setComUpdateTimestamp(comUpdateTimestamp);
        
        return updateDomain;
    }
    
    /**
     *    The specified PDF list is saved in the general-purpose area of a screen information domain.
     * <br />指定されたPDF帳票を画面情報ドメインの汎用エリアに保存します。
     *
     * @param form Action form<br />アクションフォーム
     * @param report PDF list<br />PDF帳票
     */
    protected void saveReport(WC001ActionForm form, File report) {
        // Acquisition of a screen information domain
        // 画面情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_WC001);
        
        // Preservation of PDF list
        // PDF帳票の保存
        screenInfo.setGeneralArea("report", report);
    }
    
    /**
     *    The PDF list saved in the general-purpose area of the screen information domain is acquired.
     * <br />画面情報ドメインの汎用エリアに保存されているPDF帳票を取得します。
     *
     * @param form Action form<br />アクションフォーム
     * @return PDF list<br />PDF帳票
     */
    protected File getReport(WC001ActionForm form) {
        // Acquisition of a screen information domain
        // 画面情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_WC001);

        // Acquisition of PDF list
        // PDF帳票の取得
        File report = screenInfo.getGeneralArea("report");
        
        // Clearance of area in general
        // 汎用エリアのクリア
        screenInfo.setGeneralArea("report", null);
        
        return report;
    }
}
