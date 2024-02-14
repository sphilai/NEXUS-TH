/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FILE_EXTENTION_BMP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FILE_EXTENTION_GIF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FILE_EXTENTION_JPEG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FILE_EXTENTION_JPG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FILE_EXTENTION_PNG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FILE_SIZE_MAX;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0036;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0040;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_FULL_RT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_C;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_I;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LINE_SEPARATOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0057;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0067;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9022R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9023;
import static com.globaldenso.gscm.framework.constants.Constants.ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.filemanagerstream.business.FileManagementException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementCriterionDomain;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.business.dao.W9022InvTplMaDao;
import com.globaldenso.eca0027.core.business.domain.W9022InvTplMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9022InvTplMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.W9023CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * Service implementation class of Invoice Template MA
 * <br />Invoice Template MAのサービス実装クラスです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public class W9022InvTplMaServiceImpl implements W9022InvTplMaService {

    /**
     * ファイルID識別子：削除
     */
    protected final String FILE_ID_DELETE = "del";
    
    /**
     * CommonService
     */
    protected CommonService commonService;
    
    /**
     * UserAuth
     */
    protected UserAuthService userAuthService;
    
    /**
     * TmExpFormalitiItemNo
     */
    protected TmInvTplService tmInvTplService;
    
    
    /**
     * TmInvFreeItem
     */
    protected TmInvFreeItemService tmInvFreeItemService;
    
    /**
     * L9001ReportService
     */
    protected L9001ReportService l9001ReportService;
    
    /**
     * L9002ReportService
     */
    protected L9002ReportService l9002ReportService;
    
    /**
     * L9003ReportService
     */
    protected L9003ReportService l9003ReportService;
    
    /**
     * L9004ReportService
     */
    protected L9004ReportService l9004ReportService;
    
    /**
     * L9005ReportService
     */
    protected L9005ReportService l9005ReportService;
    
    /**
     * L9006ReportService
     */
    protected L9006ReportService l9006ReportService;
    
    /**
     * L9007ReportService
     */
    protected L9007ReportService l9007ReportService;
    
    /**
     * L9008ReportService
     */
    protected L9008ReportService l9008ReportService;
    
    /**
     * L9009ReportService
     */
    protected L9009ReportService l9009ReportService;
    
    /**
     * W9022InvTplMaDao
     */
    protected W9022InvTplMaDao w9022InvTplMaDao;
    
    /**
     * File Manage Service<br />
     * ファイル管理 サービス
     */
    protected FileManagementService fileManagerServiceForStream;
    
    /**
     * Type in the functional overview of the constructor.
     *
     */
    public W9022InvTplMaServiceImpl() {
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
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * Setter method for tmInvTplService.
     *
     * @param tmInvTplService Set for tmInvTplService
     */
    public void setTmInvTplService(TmInvTplService tmInvTplService) {
        this.tmInvTplService = tmInvTplService;
    }

    /**
     * Setter method for tmInvFreeItemService.
     *
     * @param tmInvFreeItemService Set for tmInvFreeItemService
     */
    public void setTmInvFreeItemService(TmInvFreeItemService tmInvFreeItemService) {
        this.tmInvFreeItemService = tmInvFreeItemService;
    }

    /**
     * Setter method for l9001ReportService.
     *
     * @param reportService Set for l9001ReportService
     */
    public void setL9001ReportService(L9001ReportService reportService) {
        l9001ReportService = reportService;
    }

    /**
     * Setter method for l9002ReportService.
     *
     * @param reportService Set for l9002ReportService
     */
    public void setL9002ReportService(L9002ReportService reportService) {
        l9002ReportService = reportService;
    }

    /**
     * Setter method for l9003ReportService.
     *
     * @param reportService Set for l9003ReportService
     */
    public void setL9003ReportService(L9003ReportService reportService) {
        l9003ReportService = reportService;
    }

    /**
     * Setter method for l9004ReportService.
     *
     * @param reportService Set for l9004ReportService
     */
    public void setL9004ReportService(L9004ReportService reportService) {
        l9004ReportService = reportService;
    }

    /**
     * Setter method for l9005ReportService.
     *
     * @param reportService Set for l9005ReportService
     */
    public void setL9005ReportService(L9005ReportService reportService) {
        l9005ReportService = reportService;
    }

    /**
     * Setter method for l9006ReportService.
     *
     * @param reportService Set for l9006ReportService
     */
    public void setL9006ReportService(L9006ReportService reportService) {
        l9006ReportService = reportService;
    }

    /**
     * Setter method for l9007ReportService.
     *
     * @param reportService Set for l9007ReportService
     */
    public void setL9007ReportService(L9007ReportService reportService) {
        l9007ReportService = reportService;
    }

    /**
     * Setter method for l9008ReportService.
     *
     * @param reportService Set for l9008ReportService
     */
    public void setL9008ReportService(L9008ReportService reportService) {
        l9008ReportService = reportService;
    }

    /**
     * Setter method of l9009ReportService.
     *
     * @param l9009ReportService Value to be stored in l9009ReportService.
     */
    public void setL9009ReportService(L9009ReportService l9009ReportService) {
        this.l9009ReportService = l9009ReportService;
    }

    /**
     * Setter method for w9022InvTplMaDao.
     *
     * @param invTplMaDao Set for w9022InvTplMaDao
     */
    public void setW9022InvTplMaDao(W9022InvTplMaDao invTplMaDao) {
        w9022InvTplMaDao = invTplMaDao;
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
     * @see com.globaldenso.eca0027.core.business.service.W9022InvTplMaService#searchForPagingOnInquirySearch(com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain)
     */
    public List<? extends W9022InvTplMaItemDomain> searchForPagingOnInquirySearch(W9022InvTplMaCriteriaDomain criteria) throws ApplicationException{

        // W9022   Processing No.3
        //【W9022  処理№ 3】
        // Get Search count
        // 検索件数の取得
        int count = w9022InvTplMaDao.searchCountTmInvTpl(criteria);
        
        // Getting information page
        // ページ情報の取得
        PageInfoData pageInfoData = criteria.getPageInfoCreator().createPageInfoData(count, null, null, criteria.getLocale());
        
        // Setting the search scope
        // 検索範囲の設定
        criteria.setRowNumFrom(pageInfoData.getFromCount());
        criteria.setRowNumTo(pageInfoData.getToCount());
        
        // Search result
        // 検索結果
        return w9022InvTplMaDao.searchForPagingTmInvTpl(criteria);

    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9022InvTplMaService#deleteOnInquiryDelete(com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain)
     */
    public int deleteOnInquiryDelete(W9022InvTplMaCriteriaDomain criteria) throws ApplicationException{
        
        // W9022   Processing No.5
        //【W9022  処理№ 5】
        
        // Lock of data
        // データをロック  
        TmInvTplCriteriaDomain tmInvTplCriteriaDomain = new TmInvTplCriteriaDomain();
        tmInvTplCriteriaDomain.setCompCd(criteria.getCompCd());
        tmInvTplCriteriaDomain.setDocNo(criteria.getDocNo());
        TmInvTplDomain tmInvTplDomain = tmInvTplService.lockByKeyNoWait(tmInvTplCriteriaDomain);
        if (tmInvTplDomain == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // Delete Selected data
        // 選択データの削除
        tmInvTplCriteriaDomain.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
        return tmInvTplService.deleteByCondition(tmInvTplCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9022InvTplMaService#searchOnEditInit(com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain)
     */
    public W9022InvTplMaDomain searchOnEditInit(W9022InvTplMaCriteriaDomain criteria) throws ApplicationException{

      // W9022   Processing No.1
      //【W9023  処理№ 1】
        
        W9022InvTplMaDomain w9022InvTplMaDomain = new W9022InvTplMaDomain();
        
        // Get of Invoice Template Master
        // 船積書類テンプレート原単位の取得
        TmInvTplCriteriaDomain tmInvTplCriteriaDomain = new TmInvTplCriteriaDomain();
        tmInvTplCriteriaDomain.setCompCd(criteria.getCompCd());
        tmInvTplCriteriaDomain.setDocNo(criteria.getDocNo());
        tmInvTplCriteriaDomain.setLocale(criteria.getLocale());
        tmInvTplService.searchCount(tmInvTplCriteriaDomain);
        
        List<TmInvTplDomain> shipList = tmInvTplService.searchByCondition(tmInvTplCriteriaDomain);
        if (shipList != null && shipList.size() != 0 ) {
            w9022InvTplMaDomain.setCompCd(shipList.get(0).getCompCd());
            w9022InvTplMaDomain.setDocNo(shipList.get(0).getDocNo());
            w9022InvTplMaDomain.setInvoiceCtgry(shipList.get(0).getInvoiceCtgry());
            w9022InvTplMaDomain.setInvoiceClass(shipList.get(0).getInvoiceClass());
            w9022InvTplMaDomain.setMaster2(shipList.get(0).getMaster2());
            w9022InvTplMaDomain.setMaster3(shipList.get(0).getMaster3());
            w9022InvTplMaDomain.setMaster4(shipList.get(0).getMaster4());
            w9022InvTplMaDomain.setMaster7(shipList.get(0).getMaster7());
            w9022InvTplMaDomain.setMaster8(shipList.get(0).getMaster8());
            w9022InvTplMaDomain.setMaster10(shipList.get(0).getMaster10());
            w9022InvTplMaDomain.setMaster11(shipList.get(0).getMaster11());
            w9022InvTplMaDomain.setComUpdateTimestamp(shipList.get(0).getComUpdateTimestamp());
        } else {
            return w9022InvTplMaDomain;
        }
        
        // Get of FILE_NAME
        // FILE_NAMEの取得
        // Search conditions domain configuration file management.
        // ファイル管理の検索条件ドメイン設定
        FileManagementCriterionDomain fileCriteria = new FileManagementCriterionDomain();
        // File Management Search
        // ファイル管理検索
        List<FileManagementDomain> fileList = new ArrayList<FileManagementDomain>();
        String fileName = "";
        // FILE_NAME1
        // ファイル名1
        fileCriteria.setFileId(shipList.get(0).getMaster1());
        try {
            fileList = fileManagerServiceForStream.searchFileInfo(fileCriteria);
            
            if (fileList.size() != 0) {
                fileName = fileList.get(0).getFileName();
            }
            w9022InvTplMaDomain.setFileName1(fileName);
        } catch (FileManagementException e) {
            throw new GscmApplicationException(e.getErrorCode());
        } catch (UnsupportedEncodingException e) {
            throw new SystemException(NXS_91_0001);
        }
        // FILE_NAME5
        // ファイル名5
        if (shipList.get(0).getMaster5() != null && !"".equals(shipList.get(0).getMaster5())) {
            fileCriteria.setFileId(shipList.get(0).getMaster5());
            try {
                fileName = "";
                fileList = fileManagerServiceForStream.searchFileInfo(fileCriteria);
                if (fileList.size() != 0) {
                    fileName = fileList.get(0).getFileName();
                }
                w9022InvTplMaDomain.setFileName5(fileName);
            } catch (FileManagementException e) {
                throw new GscmApplicationException(e.getErrorCode());
            } catch (UnsupportedEncodingException e) {
                throw new SystemException(NXS_91_0001);
            }
        }
        // FILE_NAME6
        // ファイル名6
        fileCriteria.setFileId(shipList.get(0).getMaster6());
        try {
            fileName = "";
            fileList = fileManagerServiceForStream.searchFileInfo(fileCriteria);
            if (fileList.size() != 0) {
                fileName = fileList.get(0).getFileName();
            }
            w9022InvTplMaDomain.setFileName6(fileName);
        } catch (FileManagementException e) {
            throw new GscmApplicationException(e.getErrorCode());
        } catch (UnsupportedEncodingException e) {
            throw new SystemException(NXS_91_0001);
        }
        // FILE_NAME9
        // ファイル名9
        if (shipList.get(0).getMaster9() != null && !"".equals(shipList.get(0).getMaster9())) {
            fileCriteria.setFileId(shipList.get(0).getMaster9());
            try {
                fileName = "";
                fileList = fileManagerServiceForStream.searchFileInfo(fileCriteria);
                if (fileList.size() != 0) {
                    fileName = fileList.get(0).getFileName();
                }
                w9022InvTplMaDomain.setFileName9(fileName);
            } catch (FileManagementException e) {
                throw new GscmApplicationException(e.getErrorCode());
            } catch (UnsupportedEncodingException e) {
                throw new SystemException(NXS_91_0001);
            }
        }
        // FILE_NAME12
        // ファイル名12
        if (shipList.get(0).getMaster12() != null && !"".equals(shipList.get(0).getMaster12())) {
            fileCriteria.setFileId(shipList.get(0).getMaster12());
            try {
                fileName = "";
                fileList = fileManagerServiceForStream.searchFileInfo(fileCriteria);
                if (fileList.size() != 0) {
                    fileName = fileList.get(0).getFileName();
                }
                w9022InvTplMaDomain.setFileName12(fileName);
            } catch (FileManagementException e) {
                throw new GscmApplicationException(e.getErrorCode());
            } catch (UnsupportedEncodingException e) {
                throw new SystemException(NXS_91_0001);
            }
        }
        // FILE_NAME13
        // ファイル名13
        if (shipList.get(0).getMaster13() != null && !"".equals(shipList.get(0).getMaster13())) {
            fileCriteria.setFileId(shipList.get(0).getMaster13());
            try {
                fileName = "";
                fileList = fileManagerServiceForStream.searchFileInfo(fileCriteria);
                if (fileList.size() != 0) {
                    fileName = fileList.get(0).getFileName();
                }
                w9022InvTplMaDomain.setFileName13(fileName);
            } catch (FileManagementException e) {
                throw new GscmApplicationException(e.getErrorCode());
            } catch (UnsupportedEncodingException e) {
                throw new SystemException(NXS_91_0001);
            }
        }
        
        return w9022InvTplMaDomain;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9022InvTplMaService#validateConsistencyTxtLines(String, Integer, Integer)
     */
    public boolean validateConsistencyTxtLines(String spInfo, Integer lineMax, Integer rowMax)
        throws ApplicationException{
        
        // By splitting the line feed code string and stored in the row for each array.
        // 文字列を改行コードで分割して、行ごと配列に格納
        String[] spInfoArr = spInfo.split(LINE_SEPARATOR, -1);
        
        // Maximum number of lines check.
        // 最大行数チェック
        if (spInfoArr.length > rowMax) {
            return false;
        }
        
        // Check number of characters per line.
        // 1行あたりの文字数チェック
        for(String str : spInfoArr) {
            if (str.length() > lineMax) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9022InvTplMaService#validateConsistencyInvoiceCategoryClassOfInvoice(String, String)
     */
    public boolean validateConsistencyInvoiceCategoryClassOfInvoice(String invoiceCategory, String classOfInvoice) throws ApplicationException{

        // W9022   Processing No.3
        //【W9022  処理№ 3】
        
        // Check correlation
        // 相関チェック 
        if (INVOICE_CTGRY_C.equals(invoiceCategory) || INVOICE_CTGRY_I.equals(invoiceCategory)) {
            if (INVOICE_CLASS_FULL_RT.equals(classOfInvoice)) {
                return false;
            }
        }
        return true;
    }
   
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9022InvTplMaService#validateConsistencyFile(java.lang.String, int)
     */
    public String validateConsistencyFile(String fileName, int fileSize) throws ApplicationException{

        // (File size is 0) Indicates whether the file can be retrieved
        // ファイルが取得できるかどうか（ファイルサイズが0）
        if (fileSize == 0) {
            return GSCM_E0_0036;
        }

        // And (that is less than 5MB) file size check
        // ファイルサイズチェック（5MB以下であること）
        if (FILE_SIZE_MAX < fileSize) {
            return NXS_E7_0057;
        }
        
        // Check extension
        // 拡張子チェック
        String[] fileExtentionList = {FILE_EXTENTION_BMP, FILE_EXTENTION_PNG, FILE_EXTENTION_GIF, FILE_EXTENTION_JPG, FILE_EXTENTION_JPEG};
        String statment = null;
        int point = fileName.lastIndexOf(".");
        if (point != -1) {
            statment = (fileName.substring(point + 1)).toLowerCase();
        }
        if(!Arrays.asList(fileExtentionList).contains(statment)) {
            return GSCM_E0_0040;
        }
        
        try {
            if (fileName.getBytes("UTF-8").length != fileName.length()) {
                return NXS_E7_0067;
            }
        } catch (Exception e) {
            throw new SystemException(NXS_91_0001, e);
        }
        
        return null;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9022InvTplMaService#validateDatabaseCompCd(String)
     */
    public boolean validateDatabaseCompCd(String company) throws ApplicationException{

        // W9022   Processing No.3
        //【W9022  処理№ 3】
        
        // 2.4.DB integrity check
        // 2.4.DB整合性チェック1
        return commonService.validateCompCd(company);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9022InvTplMaService#validateConsistencyCompAuth(java.lang.String)
     */
    public boolean validateConsistencyCompanyAuth(String compCd) throws ApplicationException {
        return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9022R, compCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9022InvTplMaService#validateDatabaseTmInvTplOnEditRegister(com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain)
     */
    public boolean validateDatabaseTmInvTplOnEditRegister(String compCd, String docNo, TmInvTplDomain resultDomain)
        throws ApplicationException{
        // Lock of data
        // データをロック  
        TmInvTplCriteriaDomain tmInvTplCriteriaDomain = new TmInvTplCriteriaDomain();
        tmInvTplCriteriaDomain.setCompCd(compCd);
        tmInvTplCriteriaDomain.setDocNo(docNo);

        TmInvTplDomain invTplDomain = tmInvTplService.lockByKeyNoWait(tmInvTplCriteriaDomain);
        if (invTplDomain == null) {
            return false;
        }
        CommonUtil.copyPropertiesDomainToDomain(resultDomain, invTplDomain);
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9022InvTplMaService#createOnEditRegister(W9022InvTplMaCriteriaDomain, TmInvTplDomain)
     */
    public W9023CriteriaDomain createOnEditRegister(W9022InvTplMaCriteriaDomain criteria, TmInvTplDomain lockDomain) 
        throws ApplicationException {

        W9023CriteriaDomain w9023CriteriaDomain = new W9023CriteriaDomain();
        // 1:new,2:update,3:delete
        int updateType = 0; 
        
        String fileId = "";
        String fileId1 = "";
        String fileId5 = "";
        String fileId6 = "";
        String fileId9 = "";
        String fileId12 = "";
        String fileId13 = "";
        
        // Master1
        // judgment of the update, registration, Delete
        // 更新・登録・削除の判定
        if (!"".equals(criteria.getM1FileName()) && CheckUtil.isBlankOrNull(lockDomain.getMaster1())) {
            updateType = 1;
        } else if (!"".equals(criteria.getM1FileName()) && !CheckUtil.isBlankOrNull(lockDomain.getMaster1())) {
            updateType = 2;
            fileId = lockDomain.getMaster1();
        }
        // update, registration, Delete
        // 更新・登録・削除
        fileId1 = updateFileData(criteria.getM1FileData(), criteria.getM1FileName(), criteria.getDscId(), updateType, fileId);
        
        // Master5
        if (!"".equals(criteria.getM5FileName()) || CHECK_ON.equals(criteria.getM5Delete())) {
            // judgment of the update, registration, Delete
            // 更新・登録・削除の判定
            updateType = getUpdateType(criteria.getM5FileName(), lockDomain.getMaster5(), criteria.getM5Delete());
            fileId = "";
            if (updateType == 2 || updateType == 3) {
                fileId = lockDomain.getMaster5();
            }
            // update, registration, Delete
            // 更新・登録・削除
            fileId5 = updateFileData(criteria.getM5FileData(), criteria.getM5FileName(), criteria.getDscId(), updateType, fileId);
        }
        
        // Master6
        // judgment of the update, registration, Delete
        // 更新・登録・削除の判定
        updateType = 0;
        if (!"".equals(criteria.getM6FileName()) && CheckUtil.isBlankOrNull(lockDomain.getMaster6())) {
            updateType = 1;
        } else if (!"".equals(criteria.getM6FileName()) && !CheckUtil.isBlankOrNull(lockDomain.getMaster6())) {
            updateType = 2;
            fileId = lockDomain.getMaster6();
        }
        // update, registration, Delete
        // 更新・登録・削除
        fileId6 = updateFileData(criteria.getM6FileData(), criteria.getM6FileName(), criteria.getDscId(), updateType, fileId);
        
        // Master9
        if (!"".equals(criteria.getM9FileName()) || CHECK_ON.equals(criteria.getM9Delete())) {
            // judgment of the update, registration, Delete
            // 更新・登録・削除の判定
            updateType = getUpdateType(criteria.getM9FileName(), lockDomain.getMaster9(), criteria.getM9Delete());
            if (updateType == 2 || updateType == 3) {
                fileId = lockDomain.getMaster9();
            }
            // update, registration, Delete
            // 更新・登録・削除
            fileId9 = updateFileData(criteria.getM9FileData(), criteria.getM9FileName(), criteria.getDscId(), updateType, fileId);
        }
        
        // Master12
        if (!"".equals(criteria.getM12FileName()) || CHECK_ON.equals(criteria.getM12Delete())) {
            // judgment of the update, registration, Delete
            // 更新・登録・削除の判定
            updateType = getUpdateType(criteria.getM12FileName(), lockDomain.getMaster12(), criteria.getM12Delete());
            if (updateType == 2 || updateType == 3) {
                fileId = lockDomain.getMaster12();
            }
            // update, registration, Delete
            // 更新・登録・削除
            fileId12 = updateFileData(criteria.getM12FileData(), criteria.getM12FileName(), criteria.getDscId(), updateType, fileId);
        }
        
        // Master13
        if (!"".equals(criteria.getM13FileName()) || CHECK_ON.equals(criteria.getM13Delete())) {
            // judgment of the update, registration, Delete
            // 更新・登録・削除の判定
            updateType = getUpdateType(criteria.getM13FileName(), lockDomain.getMaster13(), criteria.getM13Delete());
            if (updateType == 2 || updateType == 3) {
                fileId = lockDomain.getMaster13();
            }
            // update, registration, Delete
            // 更新・登録・削除
            fileId13 = updateFileData(criteria.getM13FileData(), criteria.getM13FileName(), criteria.getDscId(), updateType, fileId);
        }
        
        if(MODE_EDIT.equals(criteria.getProcMode())){
            // update domain data
            TmInvTplDomain invTplDomain = new TmInvTplDomain();
            if (StringUtils.isNotEmpty(fileId1)) {
                invTplDomain.setMaster1(fileId1);
            }
            invTplDomain.setMaster2(criteria.getMaster2());
            invTplDomain.setMaster3(criteria.getMaster3());
            invTplDomain.setMaster4(criteria.getMaster4());
            if (StringUtils.isNotEmpty(fileId5)) {
                if (FILE_ID_DELETE.equals(fileId5)) {
                    invTplDomain.setMaster5("");
                } else {
                    invTplDomain.setMaster5(fileId5);
                }
            }
            if (StringUtils.isNotEmpty(fileId6)) {
                invTplDomain.setMaster6(fileId6);
            }
            invTplDomain.setMaster7(criteria.getMaster7());
            invTplDomain.setMaster8(criteria.getMaster8());
            if (StringUtils.isNotEmpty(fileId9)) {
                if (FILE_ID_DELETE.equals(fileId9)) {
                    invTplDomain.setMaster9("");
                } else {
                    invTplDomain.setMaster9(fileId9);
                }
            }
            invTplDomain.setMaster10(criteria.getMaster10());
            invTplDomain.setMaster11(criteria.getMaster11());
            if (StringUtils.isNotEmpty(fileId12)) {
                if (FILE_ID_DELETE.equals(fileId12)) {
                    invTplDomain.setMaster12("");
                } else {
                    invTplDomain.setMaster12(fileId12);
                }
            }
            
            if (StringUtils.isNotEmpty(fileId13)) {
                if (FILE_ID_DELETE.equals(fileId13)) {
                    invTplDomain.setMaster13("");
                } else {
                    invTplDomain.setMaster13(fileId13);
                }
            }
            commonService.setCommonPropertyForUpdate(invTplDomain, SCREEN_ID_W9023);
            
            // criteria domain data
            TmInvTplCriteriaDomain invTplCriteria = new TmInvTplCriteriaDomain();
            invTplCriteria.setCompCd(criteria.getCompCd());
            invTplCriteria.setDocNo(criteria.getDocNo());
            invTplCriteria.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
            
            int updateCount = tmInvTplService.updateByCondition(invTplDomain, invTplCriteria);

            //Set the number of update count
            w9023CriteriaDomain.setUpdateCount(updateCount);
            
        }
        
        if (MODE_NEW.equals(criteria.getProcMode())) {
            // Registration of the selected data
            // 選択データの登録
            TmInvTplDomain invTplDomain = new TmInvTplDomain();
            invTplDomain.setCompCd(criteria.getCompCd());
            invTplDomain.setDocNo(criteria.getDocNo());
            invTplDomain.setInvoiceCtgry(criteria.getInvoiceCtgry());
            invTplDomain.setInvoiceClass(criteria.getInvoiceClass());
            invTplDomain.setMaster1(fileId1);
            invTplDomain.setMaster2(criteria.getMaster2());
            invTplDomain.setMaster3(criteria.getMaster3());
            invTplDomain.setMaster4(criteria.getMaster4());
            if (StringUtils.isNotEmpty(fileId5)) {
                invTplDomain.setMaster5(fileId5);
            }
            invTplDomain.setMaster6(fileId6);
            invTplDomain.setMaster7(criteria.getMaster7());
            invTplDomain.setMaster8(criteria.getMaster8());
            if (StringUtils.isNotEmpty(fileId9)) {
                invTplDomain.setMaster9(fileId9);
            }
            invTplDomain.setMaster10(criteria.getMaster10());
            invTplDomain.setMaster11(criteria.getMaster11());
            if (StringUtils.isNotEmpty(fileId12)) {
                invTplDomain.setMaster12(fileId12);
            }
            
            if (StringUtils.isNotEmpty(fileId13)) {
                invTplDomain.setMaster13(fileId13);
            }
            invTplDomain.setComCreateFuncId(criteria.getScreenId());
            invTplDomain.setComCreateUserId(criteria.getDscId());
            
            commonService.setCommonPropertyForRegist(invTplDomain, SCREEN_ID_W9023);
            
            try {
                tmInvTplService.create(invTplDomain);
                // Set number of create count.
                w9023CriteriaDomain.setCreateCount(1);
            } catch (IntegrationLayerException e) {
                if (ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX == e.getSqlErrorCode()) {
                    throw new GscmApplicationException(GSCM_E0_0020);
                }
                throw e;
            }
        }
        return w9023CriteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9022InvTplMaService#printSample(com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain)
     */
    public File printSample(W9022InvTplMaCriteriaDomain criteria) throws ApplicationException{

        // W9022   Processing No.4
        //【W9022  処理№ 4】
        
        // Select the data
        // データを選択
        File invoiceFile = null;
        File packingFile = null;
        File scFile = null;
        File packingSummaryFile = null; // NL023 ADD
        if(INVOICE_CTGRY_C.equals(criteria.getInvoiceCtgry()) || INVOICE_CTGRY_I.equals(criteria.getInvoiceCtgry())){
            if(INVOICE_CLASS_MAIN.equals(criteria.getInvoiceClass())){ 
                invoiceFile = l9001ReportService.searchSmplInvHdrForCmrclIntang(criteria.getCompCd(), criteria.getDocNo());
                packingFile = l9004ReportService.searchSmplPackHdrForMain(criteria.getCompCd(), criteria.getDocNo());
                scFile = l9006ReportService.searchSmplSalesCntrctHdrForCmrclIntang(criteria.getCompCd(), criteria.getDocNo());
                packingSummaryFile = l9009ReportService.searchSamplePackingSummary(criteria.getCompCd(), criteria.getDocNo()); // NL023 ADD
            }
        }
        if(INVOICE_CTGRY_N.equals(criteria.getInvoiceCtgry())){
            if(INVOICE_CLASS_MAIN.equals(criteria.getInvoiceClass())){ 
                invoiceFile = l9002ReportService.searchSmplInvHdrForNonCmrcl(criteria.getCompCd(), criteria.getDocNo());
                packingFile = l9004ReportService.searchSmplPackHdrForMain(criteria.getCompCd(), criteria.getDocNo());
                scFile = l9007ReportService.searchSmplSalesCntrctHdrForNonCmrcｌ(criteria.getCompCd(), criteria.getDocNo());
            }
            if(INVOICE_CLASS_FULL_RT.equals(criteria.getInvoiceClass())){ 
                invoiceFile = l9003ReportService.searchSmplInvHdrFor(criteria.getCompCd(), criteria.getDocNo());
                packingFile = l9005ReportService.searchSmplPackHdrForFrt(criteria.getCompCd(), criteria.getDocNo());
                scFile = l9008ReportService.searchSmplSalesCntrctHdrForFrt(criteria.getCompCd(), criteria.getDocNo());
            }
        }
        if (invoiceFile == null || packingFile == null || scFile == null) {
            return null;
        }
        String fileName = criteria.getCompCd() + criteria.getDocNo() + EXT_PDF;
        // UT304 MULTI LABEL MOD START
        //File printDoc = null;
        //InputStream invoiceStream = null;
        //InputStream packingStream = null;
        //InputStream scStream = null;
        //try {
        //    invoiceStream = new FileInputStream(invoiceFile);
        //    packingStream = new FileInputStream(packingFile);
        //    scStream = new FileInputStream(scFile);
        //    
        //    printDoc = commonService.mergePdf(fileName, invoiceStream, packingStream, scStream);
        //    
        //} catch (FileNotFoundException e) {
        //    throw new SystemException(NXS_91_0001);
        //} finally {
        //    try {
        //        if (invoiceStream != null) {
        //            invoiceStream.close();
        //            invoiceStream = null;
        //        }
        //        if (packingStream != null) {
        //            packingStream.close();
        //            packingStream = null;
        //        }
        //        if (scStream != null) {
        //            scStream.close();
        //            scStream = null;
        //        }
        //    } catch (IOException e) {
        //        throw new SystemException(NXS_91_0001);
        //    }
        //}

        File printDoc = commonService.mergePdf(fileName, invoiceFile, packingFile, scFile, packingSummaryFile);
            // NL023 MOD
        // UT304 MULTI LABEL MOD END

        return printDoc;
    }    
    
    /**
     * 
     * <br />Get Type of update.
     * 
     * @param fileName File Name
     * @param value Master Value
     * @param delFlg Delete Flg
     * @return 登録タイプ 1:新規 2:更新 3:削除
     * @throws ApplicationException ファイルデータのアップロードができない場合
     */
    protected int getUpdateType(String fileName, String value, String delFlg) throws ApplicationException {
        
        if (CheckUtil.isBlankOrNull(fileName) && !CheckUtil.isBlankOrNull(value) && CHECK_ON.equals(delFlg)) {
            return 3;
        } else if (!CheckUtil.isBlankOrNull(fileName) && CheckUtil.isBlankOrNull(value)) {
            return 1;
        } else if (!CheckUtil.isBlankOrNull(fileName) && !CheckUtil.isBlankOrNull(value)) {
            return 2;
        }
        return 0;
    }
    
    /**
     * 
     * Get File Manage from FILE ID
     * <br />ファイルIDからファイル管理を取得します。
     * <pre>
     * 
     * <pre>
     * - File Manage Search
     *   Set the following items FileManagementCriterionDomain,
     *   Call FileManagementService.searchFileInfo(FileManagementCriterionDomain) 
     *     - FILE ID
     * </pre>
     * <pre>
     * ‐ファイル管理検索
     *     {@link FileManagementCriterionDomain}に以下の項目を設定し、
     *     {@link FileManagementService#searchFileInfo(FileManagementCriterionDomain)}を呼び出します。
     *       ‐ファイルID
     * </pre>
     * 
     * @param fileId FILE ID<br />
     * ファイルID
     * @return File Manage domain<br />
     * ファイル管理ドメイン
     * @throws ApplicationException can not get the File Manage information<br />
     * ファイル管理情報を取得できない場合
     */
    protected FileManagementDomain getFileManagementDomain(String fileId) throws ApplicationException {
        // Set search conditions domain of file management.
        // ファイル管理の検索条件ドメイン設定
        FileManagementCriterionDomain fileCriteria = new FileManagementCriterionDomain();
        fileCriteria.setFileId(fileId);
        // File Management Search
        // ファイル管理検索
        List<FileManagementDomain> fileList;
        try {
            fileList = fileManagerServiceForStream.searchFileInfo(fileCriteria);
        } catch (FileManagementException e) {
            throw new GscmApplicationException(e.getErrorCode());
        } catch (UnsupportedEncodingException e) {
            throw new SystemException(NXS_91_0001);
        }
        if (fileList.isEmpty()) {
            return null;
        }
        return fileList.get(0);
    }
    
    /**
     * Update FILE DATA
     * <br />ファイルデータを更新します。
     * 
     * @param fileData FILE DATA<br />
     * ファイルデータ
     * @param fileName FILE NAME<br />
     * ファイル名
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param updateType Update Type<br />
     * @param fileId FIELD-ID<br />
     * @return FILE ID<br />
     * ファイルID
     * @throws ApplicationException can not upload FILE DATA<br />
     * ファイルデータのアップロードができない場合
     */
    protected String updateFileData(InputStream fileData, String fileName, String dscId, int updateType, String fileId)
        throws ApplicationException {
        
        if (0 == updateType) {
            return "";
        }else if (1 == updateType) {
            // NEW
            fileId = createFileUpload(fileData, fileName, dscId);
        } else if (2 == updateType) {
            // Get File management information.
            FileManagementDomain fileMng = getFileManagementDomain(fileId);
            
            // File data update
            uploadFileData(fileId, fileData, fileName, dscId, fileMng.getLastUpdateDate());
        } else if (3 == updateType) {
            // File management information acquisition.
            // ファイル管理情報取得
            FileManagementDomain fileMng = getFileManagementDomain(fileId);
            
            // delete
            // 削除
            if (fileMng != null) {
                deleteFileManage(fileId, fileMng.getLastUpdateDate(), dscId);
            }
            fileId = FILE_ID_DELETE;
        }
        
        return fileId;
    }
    
    /**
     * New regist the File Manage
     * <br />ファイル管理に新規登録。
     * <pre>
     * - Register to File Manage the FILE DATA.
     *   Call FileManagementService.createFileUpload(InputStream, String, Number, String)
     * </pre>
     * <pre>
     * ‐ファイルデータをファイル管理に登録。
     *     {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}を呼出します。
     * </pre>
     * 
     * @param fileData FILE DATA<br />
     * ファイルデータ
     * @param fileName FILE NAME<br />
     * ファイル名
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @return FILE ID<br />
     * ファイルID
     * @throws ApplicationException can not upload FILE DATA<br />
     * ファイルデータのアップロードができない場合
     */
    protected String createFileUpload(InputStream fileData, String fileName, String dscId)
        throws ApplicationException {
        
        // And registered in the file management and file data.
        // ファイルデータをファイル管理に登録
        String fileId;
        try {
            fileId = fileManagerServiceForStream.createFileUpload(fileData, fileName, DateUtil.getSaveLimitTerm(DateUtil.PERMANENT, null), dscId);
        } catch (FileManagementException e) {
            throw new GscmApplicationException(e.getErrorCode());
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        }
        return fileId;
    }
    
    /**
     * Update FILE DATA
     * <br />ファイルデータを更新します。
     * <pre>
     * Updating FILE DATA
     *   Updating FILE DATA with an argument
     *   STORED LIMIT Set 12/31/9999
     *   Call FileManagementService.updateFileData(String, InputStream, String, Number, String, Timestamp)
     * </pre>
     * <pre>
     * ファイルデータの更新
     *    引数を使用してファイルデータの更新をします。
     *    保存期限は9999/12/31を設定します。
     *    {@link FileManagementService#updateFileData(String, InputStream, String, Number, String, Timestamp)}を呼び出します。
     * </pre>
     * 
     * @param fileId FILE ID<br />
     * ファイルID
     * @param fileStream FILE DATA<br />
     * ファイルデータ
     * @param fileName FILE NAME<br />
     * ファイル名
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param lastUpdateDate LAST UPDATE DATE<br />
     * 最終更新日
     * @throws ApplicationException ApplicationException
     */
    protected void uploadFileData(String fileId, InputStream fileStream, String fileName, String dscId, Timestamp lastUpdateDate) 
        throws ApplicationException {
        // File data update
        try {
            fileManagerServiceForStream.updateFileData(fileId, fileStream, fileName, DateUtil.getSaveLimitTerm(DateUtil.PERMANENT, null), dscId, lastUpdateDate);
        } catch (FileManagementException e) {
            throw new GscmApplicationException(e.getErrorCode());
        } catch (UnsupportedEncodingException e) {
            throw new SystemException(NXS_91_0001);
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        } finally {
            if (fileStream != null) {
                try {
                    fileStream.close();
                } catch (IOException e) {
                    throw new SystemException(NXS_91_0001);
                }
            }
        }
    }
    
    /**
     * Remove FILE DATA
     * <br />ファイルデータを削除します。
     * 
     * @param fileId FILE ID to be deleted<br />
     * ファイルID
     * @param comUpdateTimestamp LAST UPDATE DATE<br />
     * 最終更新日時
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @return Le CD Number of deleted<br />
     * 削除したレコード数
     * @throws ApplicationException can not remove FILE DATA<br />
     * ファイルデータを削除できなかった場合
     */
    protected int deleteFileManage(String fileId, Timestamp comUpdateTimestamp, String dscId) 
        throws ApplicationException {
        int cnt;
        
        // Delete the file entity holding
        // ファイル保持用のエンティティ削除
        try {
            cnt = fileManagerServiceForStream.deleteFile(fileId, comUpdateTimestamp, dscId);
        } catch (FileManagementException e) {
            throw new GscmApplicationException(e.getErrorCode());
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        }
        return cnt;
    }
}