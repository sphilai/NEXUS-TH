/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6001;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W8002CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * Class action Init of Documentation Manual Invoice Upload screen.
 * <br />通関書類作成業務 Manual Invoice Upload画面のInitアクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11676 $
 */
public class W6002InitAction extends W6002AbstractAction {
    /**
     * Complex processing FacadeService
     * <br />複合処理FacadeService
     */
    protected SearchFacadeService<W6002CriteriaDomain, W6002CriteriaDomain> w6002InitFacadeService;
    
    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6002InitAction() {
        super();
    }

    /**
     * Setter method of w6002InitFacadeService.
     * <br />w6002InitFacadeService のセッターメソッドです。
     *
     * @param initFacadeService I set to w6002InitFacadeService<br />
     * w6002InitFacadeService に設定する
     */
    public void setW6002InitFacadeService(
        SearchFacadeService<W6002CriteriaDomain, W6002CriteriaDomain> initFacadeService) {
        w6002InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Control of the screen
     *     Set the button active and non-active.
     * </pre>
     * <pre>
     * - 画面の制御
     *     ボタン活性・非活性を設定します。
     * </pre>
     * 
     * 
     * @see AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        // Setup of action form 
        // アクション・フォームの設定
        W6002ActionForm w6002Form = (W6002ActionForm) form;

        // Setup of a criteria domain 
        // 検索条件ドメインの設定
        W6002CriteriaDomain criteriaDomain = prepareCriteriaDomain(w6002Form, request);
        
        W6002CriteriaDomain resultCriteriaDomain = new W6002CriteriaDomain();
        
        // Execution of search results
        // 検索結果の実行
        resultCriteriaDomain = w6002InitFacadeService.search(criteriaDomain);

        // Setup of search results
        // 検索結果の設定
        w6002Form.setW6002CriteriaDomain(resultCriteriaDomain);
        setParamW6002(resultCriteriaDomain, criteriaDomain);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Copy to dest domain from source domain.
     *
     * @param resultDomain dest domain
     * @param criteriaDomain source domain
     */
    protected void setParamW6002(W6002CriteriaDomain resultDomain, W6002CriteriaDomain criteriaDomain) {
        resultDomain.setFunctionNo(criteriaDomain.getFunctionNo());
        // ST946 MANUAL SCREEN TRANSITION DEL START
        //resultDomain.setTakeOverInvoiceNo(criteriaDomain.getTakeOverInvoiceNo());
        //resultDomain.setTakeOverShipperCd(criteriaDomain.getTakeOverShipperCd());
        //resultDomain.setTakeOverParInvoiceNo(criteriaDomain.getTakeOverParInvoiceNo());
        //resultDomain.setTakeOverInvoiceIssueDt(criteriaDomain.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION DEL END
        resultDomain.setTakeOverFrtContainFlg(criteriaDomain.getTakeOverFrtContainFlg());
        //resultDomain.setSortInvoice(criteriaDomain.getSortInvoice()); // ST946 MANUAL SCREEN TRANSITION DEL
    }
    
    /**
     * Set the {@link W6002CriteriaDomain}
     * <br />{@link W6002CriteriaDomain}を設定します。
     *
     * @param form Action Form of Documentation Manual Invoice Upload screen<br />
     * 通関書類作成業務 Manual Invoice Upload画面のアクションフォーム
     * @param request HTTP Request
     * @return  {@link W8002CriteriaDomain} It set up.<br />
     * 設定した{@link W8002CriteriaDomain}
     */
// ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
// ST946 MANUAL SCREEN TRANSITION MOD START
//    protected W6002CriteriaDomain prepareCriteriaDomain (W6002ActionForm form, HttpServletRequest request) {
//        W6002CriteriaDomain criteriaDomain = form.getW6002CriteriaDomain();
//
//        // Taking over value from a changing agency screen
//        // 遷移元画面からの引継値
//        String functionNo = (String) request.getAttribute("functionNo");
//        String shipperCd = (String) request.getAttribute("shipperCd");
//        String parInvoiceNo = (String) request.getAttribute("parInvoiceNo");
//        String invoiceNo = (String) request.getAttribute("invoiceNo");
//        String invoiceIssueDt = (String) request.getAttribute("invoiceIssueDt");
//        String frtContainFlg = (String) request.getAttribute("frtContainFlg");
//        
//        // Setup of screen common information 
//        // 画面共通情報の設定
//        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
//
//        // Setup of the taking over value from a parent screen 
//        // 親画面からの引継値の設定
//        if (SCREEN_ID_W6001.equals(form.getCallScreenId())) {
//            WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
//            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W6001);
//            W6001ActionForm w6001Form = (W6001ActionForm) screenInfo.getActionForm();
//            // Acquisition of the taking over information from a changing agency screen 
//            // 遷移元画面からの引き継ぎ情報の取得
//            CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w6001Form);
//            form.setFunctionNo(functionNo);
//            form.setShipperCd(shipperCd);
//            form.setParInvoiceNo(parInvoiceNo);
//            form.setInvoiceNo(invoiceNo);
//            form.setInvoiceIssueDt(invoiceIssueDt);
//            form.setFrtContainFlg(frtContainFlg);
//            
//            criteriaDomain.setFunctionNo(functionNo);
//            criteriaDomain.setTakeOverInvoiceNo(invoiceNo);
//            criteriaDomain.setTakeOverShipperCd(shipperCd);
//            criteriaDomain.setTakeOverParInvoiceNo(parInvoiceNo);
//            criteriaDomain.setTakeOverInvoiceIssueDt(invoiceIssueDt);
//            criteriaDomain.setTakeOverFrtContainFlg(frtContainFlg);
//            criteriaDomain.setSortInvoice("0");
//        } else {
//            W6002ActionForm w6002Form = (W6002ActionForm) form;
//            // Acquisition of the taking over information from a changing agency screen 
//            // 遷移元画面からの引き継ぎ情報の取得
//            CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w6002Form);
//            form.setFunctionNo(functionNo);
//            form.setShipperCd(shipperCd);
//            form.setParInvoiceNo(parInvoiceNo);
//            form.setInvoiceNo(invoiceNo);
//            form.setInvoiceIssueDt(invoiceIssueDt);
//            form.setFrtContainFlg(frtContainFlg);
//            
//            criteriaDomain.setFunctionNo(functionNo);
//            criteriaDomain.setTakeOverInvoiceNo(invoiceNo);
//            criteriaDomain.setTakeOverShipperCd(shipperCd);
//            criteriaDomain.setTakeOverParInvoiceNo(parInvoiceNo);
//            criteriaDomain.setTakeOverInvoiceIssueDt(invoiceIssueDt);
//            criteriaDomain.setTakeOverFrtContainFlg(frtContainFlg);
//            criteriaDomain.setSortInvoice((String) request.getAttribute("sortInvoice"));
//        }
//        return criteriaDomain;
//    }


    protected W6002CriteriaDomain prepareCriteriaDomain (W6002ActionForm form, HttpServletRequest request) {

        //
        // - key relay -
        // - キー引渡し -
        //         set to: request area              W6002 form (saved to the stack) PL domain                   BL domain                      result BL domain         result PL domain
        //     class type: -                         W6002ActionForm                 W6002CriteriaDomain         W6001DocCriteriaDomain         W6001DocCriteriaDomain   W6002UpdateDomain
        //     processing: forward original action   W6002InitAction                 W6002RegisterAction         W6002RegisterFacadeServiceImpl W6001DocServiceImpl      W6002RegisterFacadeServiceImpl
        // --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //   main invoice: "parInvoiceShipperCd"(*1) takeOverParInvoiceShipperCd     takeOverParInvoiceShipperCd takeOverParInvoiceShipperCd    -                        -
        //   main invoice: "parInvoiceNo"(*1)        takeOverParInvoiceNo            takeOverParInvoiceNo        takeOverParInvoiceNo           parInvoiceNo(*2)         parInvoiceNo(*2)
        //   main invoice: "parInvoiceIssueDt"(*1)   takeOverParInvoiceIssueDt       takeOverParInvoiceIssueDt   takeOverParInvoiceIssueDt      -                        -
        // target invoice: "shipperCd"               takeOverShipperCd               takeOverShipperCd           takeOverShipperCd              shipperCd                shipperCd
        // target invoice: "invoiceNo"               takeOverInvoiceNo               takeOverInvoiceNo           takeOverInvoiceNo              invoiceNo                invoiceNo
        // target invoice: "invoiceIssueDt"          takeOverInvoiceIssueDt          takeOverInvoiceIssueDt      takeOverInvoiceIssueDt         invoiceIssueDt           invoiceIssueDt
        //    input value: -                         -                               shipperCd(*3)               shipperCd                      -                        -
        //    input value: -                         -                               invoiceNo(*3)               invoiceNo                      -                        -
        //    input value: -                         -                               invoiceIssueDt(*3)          invoiceIssueDt                 -                        -
        // (*1):If it is equal to the target invoice, omitted.
        // (*1):対象インボイスと等しい場合省略
        // (*2):Result of Register, setting if there is a change in the invoice No. of the main invoice. If there is no change null.
        // (*2):Registerの結果、メインインボイスのインボイスNo.に変更があれば設定。なければnull。
        // (*3):Automatic setting through struts.
        // (*3):strutsによる自動設定
        //

        W6002CriteriaDomain criteriaDomain = form.getW6002CriteriaDomain();
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        //
        // Transition from the list screen (W6001).
        // 一覧画面(W6001)からの遷移。
        //
        if (SCREEN_ID_W6001.equals(form.getCallScreenId())) {

            //
            // Get the takeover value from the previous action.
            // 前アクションからの引き継ぎ値を取得する。
            //

            String functionNo = (String)request.getAttribute("functionNo");
            // target invoice
            // 対象のインボイス
            String shipperCd = (String)request.getAttribute("shipperCd");
            String invoiceNo = (String)request.getAttribute("invoiceNo");
            Date invoiceIssueDt = (Date)request.getAttribute("invoiceIssueDt");
            // Main invoice that has been selected in the W6001.
            // W6001で選択されたメインインボイス。
            String takeOverParInvoiceShipperCd = (String)request.getAttribute("parInvoiceShipperCd");
            String takeOverParInvoiceNo = (String)request.getAttribute("parInvoiceNo");
            Date takeOverParInvoiceIssueDt = (Date)request.getAttribute("parInvoiceIssueDt");
            if (StringUtils.isEmpty(takeOverParInvoiceShipperCd)) {
                takeOverParInvoiceShipperCd = shipperCd;
                takeOverParInvoiceNo = invoiceNo;
                takeOverParInvoiceIssueDt = invoiceIssueDt;
            }
            // Others
            String frtContainFlg = (String)request.getAttribute("frtContainFlg");

            //
            // Set to form.
            // Stack and is used for delivery to the next action.
            // フォームへの設定
            // スタックさせ次アクションへの引き渡しに利用。
            //

            form.setFunctionNo(functionNo);
            // target invoice
            // 対象のインボイス
            form.setTakeOverShipperCd(shipperCd);
            form.setTakeOverInvoiceNo(invoiceNo);
            if (invoiceIssueDt != null) { // cause copyProperties can't copy null Date
                form.setTakeOverInvoiceIssueDt(invoiceIssueDt);
            }
            // Main invoice that has been selected in the W6001.
            // W6001で選択されたメインインボイス。
            form.setTakeOverParInvoiceShipperCd(takeOverParInvoiceShipperCd);
            form.setTakeOverParInvoiceNo(takeOverParInvoiceNo);
            if (takeOverParInvoiceIssueDt != null) { // cause copyProperties can't copy null Date
                form.setTakeOverParInvoiceIssueDt(takeOverParInvoiceIssueDt);
            }
            // Others
            form.setFrtContainFlg(frtContainFlg);

            //
            // Delivery to the business layer of this action.
            // このアクションのビジネスレイヤーへの引き渡し。
            //

            WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W6001);
            W6001ActionForm w6001Form = (W6001ActionForm) screenInfo.getActionForm();
            CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w6001Form);
            criteriaDomain.setFunctionNo(functionNo);
            // target invoice
            // 対象のインボイス
            criteriaDomain.setTakeOverInvoiceNo(invoiceNo);
            criteriaDomain.setTakeOverShipperCd(shipperCd);
            if (invoiceIssueDt != null) { // cause copyProperties can't copy null Date
                criteriaDomain.setTakeOverInvoiceIssueDt(invoiceIssueDt);
            }
            // Main invoice that has been selected in the W6001.
            // W6001で選択されたメインインボイス。
            criteriaDomain.setTakeOverParInvoiceShipperCd(form.getTakeOverParInvoiceShipperCd());
            criteriaDomain.setTakeOverParInvoiceNo(form.getTakeOverParInvoiceNo());
            criteriaDomain.setTakeOverParInvoiceIssueDt(form.getTakeOverParInvoiceIssueDt());
            // Others
            criteriaDomain.setTakeOverFrtContainFlg(frtContainFlg);

        //
        // Transition from the own screen (W6002).
        // Forward to refresh from Register / Skip.
        // 自画面(W6002)からの遷移。
        // Register/Skipからの再表示。
        //
        } else {

            //
            // Get the takeover value from the previous action.
            // 前アクションからの引き継ぎ値を取得する。
            //

            String functionNo = (String)request.getAttribute("functionNo");
            // target invoice
            // 対象のインボイス
            String shipperCd = (String)request.getAttribute("shipperCd");
            String invoiceNo = (String)request.getAttribute("invoiceNo");
            Date invoiceIssueDt = (Date)request.getAttribute("invoiceIssueDt");
            // In the supplier invoice update register, main invoice No. is to be delivered if it is changed.
            // Null if it is not changed.
            // 仕入れ先インボイス更新Registerにおいて、メインインボイスのインボイスNo.を変更した場合連携される。
            // 変更しなければnull.
            String takeOverParInvoiceNo = (String)request.getAttribute("parInvoiceNo");
            // Others
            String frtContainFlg = (String)request.getAttribute("frtContainFlg");

            //
            // Set to form.
            // Stack and is used for delivery to the next action.
            // フォームへの設定
            // スタックさせ次アクションへの引き渡しに利用。
            //

            form.setFunctionNo(functionNo);
            // 対象のインボイス
            form.setTakeOverShipperCd(shipperCd);
            form.setTakeOverInvoiceNo(invoiceNo);
            if (invoiceIssueDt != null) { // cause copyProperties can't copy null Date
                form.setTakeOverInvoiceIssueDt(invoiceIssueDt);
            }
            // If any changes to the invoice No. of the selected main invoice in W6001, reflect to stack.
            // W6001で選択されたメインインボイスのインボイスNo.に変更があればスタックへ反映。
            if (StringUtils.isNotEmpty(takeOverParInvoiceNo)) {
                form.setTakeOverParInvoiceNo(takeOverParInvoiceNo);
            }

            //
            // Delivery to the business layer of this action.
            // このアクションのビジネスレイヤーへの引き渡し。
            //

            CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, form);
                // takeOver...,takeOverPar... is copied here./takeOver～,takeOverPar～はここでコピーされる。
            criteriaDomain.setFunctionNo(functionNo);
            // Others
            criteriaDomain.setTakeOverFrtContainFlg(frtContainFlg);
        }

        return criteriaDomain;
    }
    // ST946 MANUAL SCREEN TRANSITION MOD END
    // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
}
