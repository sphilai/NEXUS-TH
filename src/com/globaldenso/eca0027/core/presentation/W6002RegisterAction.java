/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6002;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.W6002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6002UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * Class action Register of Documentation Manual Invoice Upload screen.
 * <br />通関書類作成業務 Manual Invoice Upload画面のRegisterアクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11673 $
 */
public class W6002RegisterAction extends W6002AbstractAction {
    /**
     * Register Facade Service
     * <br />Register Facadeサービス
     */
    protected TransactFacadeService<W6002UpdateDomain, W6002UpdateDomain> w6002RegisterFacadeService;

    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6002RegisterAction() {
        super();
    }

    /**
     * Setter method for w6002RegisterFacadeService.
     *
     * @param registerFacadeService Set for w6002RegisterFacadeService
     */
    public void setW6002RegisterFacadeService(TransactFacadeService<W6002UpdateDomain, W6002UpdateDomain> registerFacadeService) {
        w6002RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Obtaining the Master information
     * - Upload files
     * - Registration and update process
     * - Screen transition
     * </pre>
     * <pre>
     * - マスタ情報の取得
     * - ファイルのアップロード
     * - 登録・更新処理
     * - 画面遷移
     * </pre>
     * 
     * 
     * @see AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        W6002ActionForm w6002form = (W6002ActionForm) form;
        // Setup of a mass update domain
        // 一括更新ドメインの設定
        W6002UpdateDomain updateDomain = prepareUpdateDomain(w6002form);

        // ST943 DEL START
        //// In continuation flag ='N' (after check dialog passage), it returns to a former screen
        //// 継続フラグ='N'の場合（確認ダイアログ通過後）は元画面に戻る
        //if (FLAG_N.equals(updateDomain.getW6002CriteriaDomain().getContinueFlag())) {
        //    return FORWARD_SUCCESS;
        //}
        //updateDomain.getW6002CriteriaDomain().setConfirmMsg("");
        // ST943 DEL END
        
        // Acquisition of master information 
        // Upload of a file 
        // Registration and an update process 
        // マスタ情報の取得
        // ファイルのアップロード
        // 登録・更新処理
        W6002UpdateDomain resultDomain = w6002RegisterFacadeService.transact(updateDomain);

        // ST943 DEL START
        //String confirmMsg = resultDomain.getW6002CriteriaDomain().getConfirmMsg();
        //w6002form.getW6002CriteriaDomain().setConfirmMsg(confirmMsg);
        //
        //// Check dialog 
        //// 確認ダイアログ
        //if (StringUtils.isNotEmpty(confirmMsg)) {
        //    return FORWARD_SUCCESS;
        //}
        // ST943 DEL END

        // Completion message
        // 完了メッセージ
        W6002CriteriaDomain resultCriteria = resultDomain.getW6002CriteriaDomain();
        if (resultCriteria.getUpdateCount() > 0) {
            addGlobalMessage(request, GSCM_I0_0006, resultCriteria.getUpdateCount());
        }
        if (resultCriteria.getCreateCount() > 0) {
            addGlobalMessage(request, GSCM_I0_0008, resultCriteria.getCreateCount());
        }
        
        // Completion of Register processing 
        // Register処理完了
        if (!CheckUtil.isBlankOrNull(resultDomain.getFunctionNo())) {
            request.setAttribute("functionNo", resultDomain.getFunctionNo());
            // ST946 MANUAL SCREEN TRANSITION MOD START
            //request.setAttribute("shipperCd", w6002form.getW6002CriteriaDomain().getTakeOverShipperCd());
            //request.setAttribute("parInvoiceNo", resultDomain.getParInvoiceNo());
            //request.setAttribute("invoiceNo", resultDomain.getInvoiceNo());
            //request.setAttribute("invoiceIssueDt", w6002form.getW6002CriteriaDomain().getTakeOverInvoiceIssueDt());
            request.setAttribute("shipperCd", resultDomain.getShipperCd());
            request.setAttribute("invoiceNo", resultDomain.getInvoiceNo());
            request.setAttribute("invoiceIssueDt", resultDomain.getInvoiceIssueDt());
            request.setAttribute("parInvoiceNo", resultDomain.getParInvoiceNo());
                // Used when the main invoice No. has been changed.
                // メインインボイスNo.が変更された場合に使用。
            // ST946 MANUAL SCREEN TRANSITION MOD END
            
            request.setAttribute("frtContainFlg", w6002form.getW6002CriteriaDomain().getTakeOverFrtContainFlg());
            //request.setAttribute("sortInvoice", "0"); // ST946 MANUAL SCREEN TRANSITION DEL
            return SCREEN_ID_W6002;
        }
        return SCREEN_ID_W6001;
    }

    /**
     * Create a {@link W6002UpdateDomain}
     * <br />{@link W6002UpdateDomain}を作成します。
     *
     * @param form Action Form of Documentation Manual Invoice Upload screen<br />
     * 通関書類作成業務 Manual Invoice Upload画面のアクションフォーム
     * @return  {@link W6002UpdateDomain} It created. <br />
     * 作成した{@link W6002UpdateDomain}
     * @throws ApplicationException ApplicationException
     */
    protected W6002UpdateDomain prepareUpdateDomain(W6002ActionForm form) throws ApplicationException {
        
        W6002CriteriaDomain criteriaDomain = form.getW6002CriteriaDomain();
        String weightUnit = criteriaDomain.getWeightUnit();
        String volumeUnit = criteriaDomain.getVolumeUnit();
        Timestamp comUpdateTimestamp = criteriaDomain.getComUpdateTimestamp();
        
        // Setup of screen common information 
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        criteriaDomain.setDscId(commonInfo.getLoginUserDscId());
        criteriaDomain.setFunctionNo(form.getFunctionNo());
        criteriaDomain.setTakeOverShipperCd(form.getTakeOverShipperCd());
        criteriaDomain.setTakeOverInvoiceNo(form.getTakeOverInvoiceNo());
        //criteriaDomain.setTakeOverParInvoiceNo(form.getParInvoiceNo()); // ST946 MANUAL SCREEN TRANSITION DEL
        criteriaDomain.setTakeOverInvoiceIssueDt(form.getTakeOverInvoiceIssueDt());
        criteriaDomain.setTakeOverFrtContainFlg(form.getFrtContainFlg());
        criteriaDomain.setWeightUnit(weightUnit);
        criteriaDomain.setVolumeUnit(volumeUnit);
        criteriaDomain.setComUpdateTimestamp(comUpdateTimestamp);
        // ST946 MANUAL SCREEN TRANSITION ADD START
        criteriaDomain.setTakeOverParInvoiceShipperCd(form.getTakeOverParInvoiceShipperCd());
        criteriaDomain.setTakeOverParInvoiceNo(form.getTakeOverParInvoiceNo());
        criteriaDomain.setTakeOverParInvoiceIssueDt(form.getTakeOverParInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION ADD END
        
        //if (!FLAG_Y.equals(criteriaDomain.getContinueFlag())) { // ST943 DEL
        try {
            if (form.getInvoicePdfFile() != null) {
                criteriaDomain.setInvoicePdfFileStream(form.getInvoicePdfFile().getInputStream());
                criteriaDomain.setInvoicePdfFileName(form.getInvoicePdfFile().getFileName());
                criteriaDomain.setInvoicePdfFileSize(form.getInvoicePdfFile().getFileSize());
            }
            if (form.getPackingListPdfFile() != null) {
                criteriaDomain.setPackingListPdfFilaStream(form.getPackingListPdfFile().getInputStream());
                criteriaDomain.setPackingListPdfFileName(form.getPackingListPdfFile().getFileName());
                criteriaDomain.setPackingListPdfFileSize(form.getPackingListPdfFile().getFileSize());
            }
            
        } catch (FileNotFoundException e) {
            throw new SystemException(NXS_91_0001); 
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001); 
        }
        // ST943 DEL START
        //} else {
        //    form.getW6002CriteriaDomain().setInvoicePdfFileStream(getInvoiceStream(form));
        //    form.getW6002CriteriaDomain().setPackingListPdfFilaStream(getPackingListStream(form));
        //    
        //}
        // ST943 DEL END
        
        // setup of a condition domain and a List domain 
        // 条件ドメイン、 Listドメインの設定
        W6002UpdateDomain updateDomain = new W6002UpdateDomain();
        CommonUtil.copyPropertiesActionFormToDomain(updateDomain, form);
        
        return updateDomain;
    }
}
