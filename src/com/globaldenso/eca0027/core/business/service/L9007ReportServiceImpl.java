/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L9007;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.io.output.ByteArrayOutputStream;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.business.domain.L9007ReportDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * Implementation class of the form creation service L9007 [Sales Contract Header (NonComercial)].<br />
 * L9007【 Sales Contract Header(NonComercial)  】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class L9007ReportServiceImpl extends AbstractReportServiceImpl implements L9007ReportService {

    /**
     * TM_INV_TPL Service
     */
    protected TmInvTplService tmInvTplService;

    /**
     * Instance variable in the file manager<br />
     * ファイルマネージャのインスタンス変数
     */
    protected FileManagementService fileManagerServiceForStream;

    /**
     * Type in the functional overview of the constructor.
     *
     */
    public L9007ReportServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.service.L9007ReportService#searchSmplSalesCntrctHdrForNonCmrcｌ(String company, String documentNo)
     */
    public File searchSmplSalesCntrctHdrForNonCmrcｌ(String company, String documentNo) throws ApplicationException {

        L9007ReportDomain reportDomain = new L9007ReportDomain();
        
        // Get image data.
        // 固定イメージの取得
        TmInvTplDomain tmDomain = getMaster(company, documentNo);
        if (tmDomain == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // Set list data.
        // 一覧情報のセット
        reportDomain.setMaster2(tmDomain.getMaster2());
        reportDomain.setMaster3(tmDomain.getMaster3());
        reportDomain.setMaster7(tmDomain.getMaster7());
        reportDomain.setMaster8(tmDomain.getMaster8());
        reportDomain.setMaster11(tmDomain.getMaster11());
        
        ByteArrayOutputStream output = getOutputStream();
        try {
            if(!CheckUtil.isBlankOrNull(tmDomain.getMaster1())){
                getFileDomain(tmDomain.getMaster1(), output);
                reportDomain.setFileData1(new ByteArrayInputStream(output.toByteArray()));
                output.reset();
            }
            if(!CheckUtil.isBlankOrNull(tmDomain.getMaster12())){
                getFileDomain(tmDomain.getMaster12(), output);
                reportDomain.setFileData12(new ByteArrayInputStream(output.toByteArray()));
                output.reset();
            }
            if(!CheckUtil.isBlankOrNull(tmDomain.getMaster13())){
                getFileDomain(tmDomain.getMaster13(), output);
                reportDomain.setFileData13(new ByteArrayInputStream(output.toByteArray()));
                output.reset();
            }
            if(!CheckUtil.isBlankOrNull(tmDomain.getMaster9())){
                getFileDomain(tmDomain.getMaster9(), output);
                reportDomain.setFileData9(new ByteArrayInputStream(output.toByteArray()));
                output.reset();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new SystemException(NXS_91_0001, e);
        } finally {
            if(output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new SystemException(NXS_91_0001, e);
                }
            }
        }
        
        // Create report.
        // 帳票生成
        return createReport(REPORT_ID_L9007, reportDomain);
    }

    /**
     * Initialization of OutputStream<br />
     * OutputStreamの初期化
     *
     * @return null
     */
    protected ByteArrayOutputStream getOutputStream() {
        return new ByteArrayOutputStream();
    }

    /**
     * Get the image from the file manager.<br />
     * ファイルマネージャより、画像を取得します。
     *
     * @param path FILE ID<br />
     * ファイルID 
     * @param output OutputStream
     * @return fileDate1 image<br />
     * fileDate1 画像
     * @throws IOException Failed to image acquisition<br />
     * 画像取得に失敗したとき
     */
    protected FileManagementDomain getFileDomain(String path, OutputStream output) throws IOException {
        return fileManagerServiceForStream.searchFileDownload(path, true, output);
    }
    
    /**
     * From the master template, and derive a fixed image.<br />
     * テンプレートマスタより、固定イメージを導出します。
     *
     * @param company 9023.Company
     * @param documentNo 9023.Document No.
     * @throws ApplicationException If it is not possible to take the Master<br />
     * Masterを取得できなかった場合
     * @return Master template Domain<br />
     * テンプレートマスタDomain
     */
    protected TmInvTplDomain getMaster(String company, String documentNo) throws ApplicationException {
        TmInvTplCriteriaDomain tmCriteria = new TmInvTplCriteriaDomain();
        tmCriteria.setCompCd(company);
        tmCriteria.setDocNo(documentNo);
        TmInvTplDomain tmDomain = tmInvTplService.searchByKey(tmCriteria);
        return tmDomain;
    }

}
