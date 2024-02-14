/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_REQ_STATUS_UNPROCESSED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.aijb.library.business.service.ResidentRequestjobFacadeService;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TtOdrUploadReqMgtDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService;
import com.globaldenso.eca0027.core.business.dao.WB020OdrUploadDao;
import com.globaldenso.eca0027.core.business.domain.WB020OdrUploadReqDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.WindowInfoManager;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * This is an implement class of ordering registration service.
 * <br />受注登録サービスの実装クラスです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13730 $
 */
public class WB020OdrUploadServiceImpl implements WB020OdrUploadService {
    
    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;

    /**
     * File Manage Service.<br />
     * ファイル管理 サービス
     */
    protected FileManagementService fileManagerServiceForStream;

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * Ordering business DAO
     * <br />受注業務DAO
     */
    protected WB020OdrUploadDao wb020OdrUploadDao;

    /**
     * RequestjobFacadeService.
     */
    protected ResidentRequestjobFacadeService residentRequestjobFacadeService;

    /**
     * TtOdrUploadReqMgtService.
     */
    protected TtOdrUploadReqMgtService ttOdrUploadReqMgtService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB020OdrUploadServiceImpl() {
        
    }
    // ------------------- Getter /Setter of dependence service and Dao -------------------
    // ------------------- 依存サービス・DaoのGetter / Setter -------------------
    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
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
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * Setter method for wb020OdrUploadDao.
     *
     * @param wb020OdrUploadDao Set for wb020OdrUploadDao
     */
    public void setWb020OdrUploadDao(WB020OdrUploadDao wb020OdrUploadDao) {
        this.wb020OdrUploadDao = wb020OdrUploadDao;
    }

    /**
     * Setter method for residentRequestjobFacadeService.
     *
     * @param residentRequestjobFacadeService Set for residentRequestjobFacadeService
     */
    public void setResidentRequestjobFacadeService(
        ResidentRequestjobFacadeService residentRequestjobFacadeService) {
        this.residentRequestjobFacadeService = residentRequestjobFacadeService;
    }

    /**
     * Setter method for ttOdrUploadReqMgtService.
     *
     * @param ttOdrUploadReqMgtService Set for ttOdrUploadReqMgtService
     */
    public void setTtOdrUploadReqMgtService(
        TtOdrUploadReqMgtService ttOdrUploadReqMgtService) {
        this.ttOdrUploadReqMgtService = ttOdrUploadReqMgtService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB020OdrUploadService#searchOnInit(com.globaldenso.eca0027.core.business.domain.WB020OdrUploadCriteriaDomain)
     */
    public List<? extends WB020OdrUploadReqDomain> searchOnInit(WB020OdrUploadReqDomain wb020CriteriaDomain)
        throws ApplicationException
    {
        // Acquisition of Owner Company Code
        // 責任会社の取得
        WindowInfoManager windowInfo = new WindowInfoManager(WINDOW_ID_0);
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        wb020CriteriaDomain.setOwnerCompCd(commonInfo.getOwnerCompCd());
        
        List<? extends WB020OdrUploadReqDomain> wb020OdrUploadListDomainList
            = wb020OdrUploadDao.searchOdrUploadReqMgt(wb020CriteriaDomain);

        // 表示日付はログイン者のローカル時刻に変換する。
        int listIndex = 0;
        for (WB020OdrUploadReqDomain wb020OdrUploadListDomain : wb020OdrUploadListDomainList) {
            wb020OdrUploadListDomain.setListIndex(listIndex++);
            Date dtTempDate = DateUtil.convertTime(wb020OdrUploadListDomain.getDtRequestDtUtc(),
                wb020CriteriaDomain.getTimeZone());
            String strTempDate = DateUtil.formatDate(dtTempDate, wb020CriteriaDomain.getScreenDateFormat() + " HH:mm"); 
            wb020OdrUploadListDomain.setRequestDtLocal(strTempDate);
        }

        return wb020OdrUploadListDomainList;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB020OdrUploadService#transactUpload(com.globaldenso.eca0027.core.business.domain.WB020OdrUploadCriteriaDomain)
     */
    public boolean transactUpload(WB020OdrUploadReqDomain wb020CriteriaDomain) throws ApplicationException {

        // アップロードファイルをファイルマネージャーに登録する。
        String uploadFileId = null;
        try {
            uploadFileId = fileManagerServiceForStream.createFileUpload(
                wb020CriteriaDomain.getUploadFileInputStream(), wb020CriteriaDomain.getUploadFileNm(),
                    DateUtil.getSaveLimitTerm(DateUtil.PERMANENT, null), wb020CriteriaDomain.getLoginUserDscId()
            );
        } catch (Exception e) {
            throw new SystemException(NXS_91_0001, e);
        }

        // ジョブに処理をリクエストする。
        String requestId = null;
        try {
            requestId = residentRequestjobFacadeService.createRequest("ECA0027B0200", SCREEN_ID_WB020);
        } catch (Exception e) {
            throw new SystemException(NXS_91_0001, e);
        }
        if (requestId == null) {
            throw new SystemException(NXS_91_0001);
        }

        TtOdrUploadReqMgtDomain ttOdrUploadReqMgtDomain = new TtOdrUploadReqMgtDomain();
        ttOdrUploadReqMgtDomain.setRequestId(requestId);
        ttOdrUploadReqMgtDomain.setRequestDt(new Date()); // APサーバー上で動作するのでUTCとなる。
        ttOdrUploadReqMgtDomain.setUploadFileId(uploadFileId);
        ttOdrUploadReqMgtDomain.setUploadFileNm(wb020CriteriaDomain.getUploadFileNm());
        ttOdrUploadReqMgtDomain.setUploadFileLineCnt(new BigDecimal(wb020CriteriaDomain.getUploadFileLineCnt()));
        ttOdrUploadReqMgtDomain.setUploadUserId(wb020CriteriaDomain.getLoginUserDscId());
        ttOdrUploadReqMgtDomain.setStatus(ODR_UPLOAD_REQ_STATUS_UNPROCESSED);
        ttOdrUploadReqMgtDomain.setErrFileId(null);
        ttOdrUploadReqMgtDomain.setErrFileNm(null);
        ttOdrUploadReqMgtDomain.setRcvOdrCompCd(wb020CriteriaDomain.getRcvOdrCompCd());
        ttOdrUploadReqMgtDomain.setFcstReplaceFlg(wb020CriteriaDomain.getFcstReplaceFlg());
        commonService.setCommonPropertyForRegist(ttOdrUploadReqMgtDomain, SCREEN_ID_WB020);

        ttOdrUploadReqMgtService.create(ttOdrUploadReqMgtDomain);

        return true;
    }
}
