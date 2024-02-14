/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_DOWNLOAD_TYP_BLANK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_DOWNLOAD_TYP_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_FILE_ID_BLANK;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.business.domain.WB020OdrUploadReqDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of Download Result action for Order Upload screen.
 * <br />受注アップロード画面のDownload Resultアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"error": /WB008
 * </pre>
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13730 $
 */
public class WB020DownloadAction extends WB020AbstractAction {

    /**
     * File Manage Service.<br />
     * ファイル管理 サービス
     */
    protected FileManagementService fileManagerServiceForStream;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB020DownloadAction() {
        super();
    }

    /**
     * Setter method for fileManagerServiceForStream.
     *
     * @param fileManagerServiceForStream Set for fileManagerServiceForStream
     */
    public void setFileManagerServiceForStream(
        FileManagementService fileManagerServiceForStream) {
        this.fileManagerServiceForStream = fileManagerServiceForStream;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of search criteria domain
     *     Set the {@link WB020OdrUploadReqDomain}.
     * 
     * ‐Remove upload FILE DATA
     *     Call the {@link WB008CancelFacadeServiceImpl}.
     * 
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     {@link WB020OdrUploadReqDomain}を設定します。
     * 
     * ‐アップロードファイルデータを削除
     *     {@link WB008CancelFacadeServiceImpl}を呼出します。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm, HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        WB020ActionForm form = (WB020ActionForm)actForm;

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            String fileId = null;
            if (ODR_UPLOAD_DOWNLOAD_TYP_ERROR.equals(form.getWb020CriteriaDomain().getDownloadTyp())) {
                int listIndex = form.getWb020CriteriaDomain().getListIndex();
                fileId = form.getWb020ListDomainList().get(listIndex).getErrFileId();
            } else if (ODR_UPLOAD_DOWNLOAD_TYP_BLANK.equals(form.getWb020CriteriaDomain().getDownloadTyp())) {
                fileId = ODR_UPLOAD_FILE_ID_BLANK;
            }
            FileManagementDomain fileManagementResultDomain
                = fileManagerServiceForStream.searchFileDownload(fileId, true, outputStream);

            ActionUtil.downloadBinary(outputStream.toByteArray(), fileManagementResultDomain.getFileName(), response);

        } catch (Exception e) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }

        return null;
    }
}
