/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CSV_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FILE_EXTENTION_CSV;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FILE_SIZE_MAX;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0036;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0040;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0057;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0079;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0083;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0084;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0085;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0124;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0125;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0127;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0134;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0137;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0138;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0144;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0145;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0146;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_DATA_RECORD_MAX;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.csvlistconvert.CsvListConversion;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.business.domain.WB020CsvListDomain;
import com.globaldenso.eca0027.core.business.domain.WB020OdrUploadReqDomain;
import com.globaldenso.eca0027.core.business.service.WB020OdrUploadService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.util.ECA0027CheckUtil;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.presentation.WindowInfoManager;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * 
 * A service for Facade Upload action of Order Upload screen.
 * <br />受注アップロード画面のUploadアクションに対するFacadeサービスです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 15061 $
 */
public class WB020UploadFacadeServiceImpl extends AbstractTransactFacadeService<Void, WB020OdrUploadReqDomain> {

    /**
     * Common service.<br />
     * 共通サービス
     */
    protected CommonService commonService;

    /**
     * Order Upload service.<br />
     * 受注アップロードサービス
     */
    protected WB020OdrUploadService wb020OdrUploadService;

    /**
     * NEXUS Company Master Service<br />
     * NEXUS会社原単位 サービス
     */
    protected TmNxsCompService tmNxsCompService;
       
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public WB020UploadFacadeServiceImpl() {
        super();
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
     * Setter method for wb020OdrUploadService.
     *
     * @param wb020OdrUploadService Set for wb020OdrUploadService
     */
    public void setWb020OdrUploadService(WB020OdrUploadService wb020OdrUploadService) {
        this.wb020OdrUploadService = wb020OdrUploadService;
    }

    
    /**
     * Setter method for tmNxsCompService.
     *
     * @param tmNxsCompService Set for tmNxsCompService
     */
    public void setTmNxsCompService(TmNxsCompService tmNxsCompService) {
        this.tmNxsCompService = tmNxsCompService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WB020OdrUploadReqDomain filterDomain(WB020OdrUploadReqDomain wb020CriteriaDomain)
        throws GscmApplicationException, ApplicationException
    {
        return wb020CriteriaDomain;
    }
    

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(WB020OdrUploadReqDomain wb020CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException
    {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Check input file path. 
     * - File existence check.
     * - Check file size.
     * - File extension check.
     * - Number of commas check
     * - Required check
     * - Number of the figures check
     * - Attribute check
     * - Format check
     * - Unique check in the file
     * - Allied check
     *  - Forecast replace flag & Process Type
     *  - QTY & Process Type
     *  - New item & Process Type
     * - Number of processing check
     * </pre>
     * 
     * <pre>
     * ‐ ファイルパス入力チェック
     * ‐ ファイル存在チェック
     * ‐ ファイルサイズチェック
     * - ファイル拡張子チェック
     * - カンマの数チェック
     * - 必須チェック
     * - 桁数チェック
     * - 属性チェック
     * - フォーマットチェック
     * - ファイル内ユニークチェック
     * - 関連チェック
     *  - 内示洗い替えフラグと処理区分
     *  - 数量と処理区分
     *  - 処理区分とNEW項目
     * - 処理件数チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(WB020OdrUploadReqDomain wb020CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException
    {

        String fileName = wb020CriteriaDomain.getUploadFileNm();
        int fileSize = wb020CriteriaDomain.getUploadFileSize();
        
        // 2.1.1.Check input file path.
        // 2.1.1.ファイルパス入力チェック
        if (StringUtils.isEmpty(fileName)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0011, null)));
        }
        
        // 2.1.2.File existence check
        // 2.1.2.ファイル存在チェック
        if (fileSize == 0) {
            throw new ValidationException(Arrays.asList(new MessageDomain("wb020CriteriaDomain.formFileData", GSCM_E0_0036, null)));
        }
        
        // 2.1.3.Check file size
        // 2.1.3.ファイルサイズチェック
        if (FILE_SIZE_MAX < fileSize) {
            throw new ValidationException(Arrays.asList(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0057, null)));
        }
        
        // 2.1.4.File extension check
        // 2.1.4.ファイル拡張子チェック
        String[] fileExtentionList = {FILE_EXTENTION_CSV};
        String statment = null;
        int point = fileName.lastIndexOf(".");
        if (point != -1) {
            statment = (fileName.substring(point + 1)).toLowerCase();
        }
        if(!Arrays.asList(fileExtentionList).contains(statment)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("wb020CriteriaDomain.formFileData", GSCM_E0_0040, null)));
        }
        
        // Read a file
        // ファイル読み込み
        BufferedReader br = null;
        String str = "";
        String tempStr = "";
        List<List<String>> csvList = new ArrayList<List<String>>();
        
        try {
            br = new BufferedReader(new InputStreamReader(wb020CriteriaDomain.getUploadFileInputStream()));
            while ((tempStr = br.readLine()) != null) {
                str = str.concat(tempStr);
                str = str.concat("\r\n");
            }
            csvList = CsvListConversion.getList(str);
        } catch (Exception e) {
            throw new ApplicationException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ie) {
                    ie.printStackTrace();
                }
            }
        }
        
        try {
            wb020CriteriaDomain.setUploadFileInputStream(new ByteArrayInputStream(str.getBytes("utf-8")));
        } catch (Exception e) {
            throw new ApplicationException(e);
        }
        
        // 3.1.12.Number of processing check
        // 3.1.12.処理件数チェック
        if (csvList.size() - 1 < 1 || ODR_UPLOAD_DATA_RECORD_MAX < csvList.size() - 1) { // NL016 MOD
            throw new ValidationException(Arrays.asList(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0145, null)));
        }
        csvList.remove(0);
        wb020CriteriaDomain.setUploadFileLineCnt(String.valueOf(csvList.size()));

        List<WB020CsvListDomain> csvDomainList = new ArrayList<WB020CsvListDomain>();
        for (List<String> csvRecord : csvList) {
            if(csvRecord.size() == 16) {
                csvDomainList.add(loadWB020CsvListDomain(csvRecord));
            } else {
                // 3.1.1.Number of commas check
                // 3.1.1.カンマの数をチェック
                throw new ValidationException(Arrays.asList(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0079, null)));
            }
        }
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        String fcstReplaceFlg = null;
        boolean fcstReplaceFlagUniqueFlag = true;
        String rcvOdrCompCd = null;
        boolean rcvOdrCompCdUniqueFlag = true;
        int checkLine = 0;
        
        for(int i = 0; i < csvDomainList.size(); i++){
            WB020CsvListDomain domain = (WB020CsvListDomain)csvDomainList.get(i);
            checkLine = i + 1;

            // 3.1.2.Required check
            // 3.1.2.必須チェック
            if(CheckUtil.isBlankOrNull(domain.getFcstReplaceFlg())){ 
                Object[] params = {
                    "FORECAST REPLACE FLAG",
                    checkLine
                };
                errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0083, params));
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getFcstReplaceFlg().length() != 1) {
                    Object[] params = {
                        "FORECAST REPLACE FLAG",
                        "1",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0084, params));
                }
                // 3.1.4.Attribute check(alpha)
                // 3.1.4.属性チェック(半角英)
                if (!CheckUtil.isAlpha(domain.getFcstReplaceFlg())) {
                    Object[] params = {
                        "FORECAST REPLACE FLAG",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0124, params));
                }
                // 3.1.5.Format check
                // 3.1.5.フォーマットチェック
                if(!"Y".equals(domain.getFcstReplaceFlg())
                    && !"N".equals(domain.getFcstReplaceFlg())) {
                    Object[] params = {
                        "FORECAST REPLACE FLAG",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0134, params));
                }
                // 3.1.7.Unique check
                // 3.1.7.ユニークチェック
                if(fcstReplaceFlg != null) {
                    if(!fcstReplaceFlg.equals(domain.getFcstReplaceFlg())) {
                        fcstReplaceFlagUniqueFlag = false;
                    }
                } else {
                    fcstReplaceFlg = domain.getFcstReplaceFlg();
                }
            }
            
            // 3.1.2.Required check
            // 3.1.2.必須チェック
            if(CheckUtil.isBlankOrNull(domain.getProcessTyp())){
                Object[] params = {
                    "PROCESS TYPE",
                    checkLine
                };
                errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0083, params));
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getProcessTyp().length() != 1) {
                    Object[] params = {
                        "PROCESS TYPE",
                        "1",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0084, params));
                }
                // 3.1.4.Attribute check(Numeric)
                // 3.1.4.属性チェック(半角数)
                if (!CheckUtil.isNumeric(domain.getProcessTyp())) {
                    Object[] params = {
                        "PROCESS TYPE",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0125, params));
                }
                // 3.1.9.Allied check
                // 3.1.9.関連チェック
                if(!CheckUtil.isBlankOrNull(domain.getFcstReplaceFlg())) {
                    if("Y".equals(domain.getFcstReplaceFlg())
                        && !"1".equals(domain.getProcessTyp())) {
                        Object[] params = {
                            "FORECAST REPLACE FLAG",
                            "Y",
                            "PROCESS TYPE",
                            "1",
                            checkLine
                        };
                        errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0144, params));
                    }
                }
            }
            
            // 3.1.2.Required check
            // 3.1.2.必須チェック
            if(CheckUtil.isBlankOrNull(domain.getRcvOdrCompCd())){
                Object[] params = {
                    "RECEIVE ORDER COMPANY CODE",
                    checkLine
                };
                errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0083, params));
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getRcvOdrCompCd().length() > 5) {
                    Object[] params = {
                        "RECEIVE ORDER COMPANY CODE",
                        "1",
                        "5",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0085, params));
                }
                // 3.1.4.Attribute check(AlphaNumeric)
                // 3.1.4.属性チェック(半角英数)
                if (!CheckUtil.isAlphaNumeric(domain.getRcvOdrCompCd())) {
                    Object[] params = {
                        "RECEIVE ORDER COMPANY CODE",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0124, params));
                }
                // 3.1.8.Unique check
                // 3.1.8.ユニークチェック
                if(rcvOdrCompCd != null) {
                    if(!rcvOdrCompCd.equals(domain.getRcvOdrCompCd())) {
                        rcvOdrCompCdUniqueFlag = false;
                    }
                } else {
                    rcvOdrCompCd = domain.getRcvOdrCompCd();
                }
            }
            
            // 3.1.2.Required check
            // 3.1.2.必須チェック
            if(CheckUtil.isBlankOrNull(domain.getCustomerCd())){
                Object[] params = {
                    "CUSTOMER CODE",
                    checkLine
                };
                errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0083, params));
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getCustomerCd().length() > 8) {
                    Object[] params = {
                        "CUSTOMER CODE",
                        "1",
                        "8",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0085, params));
                }
                // 3.1.4.Attribute check(Numeric)
                // 3.1.4.属性チェック(半角数)
                if (!CheckUtil.isNumeric(domain.getCustomerCd())) {
                    Object[] params = {
                        "CUSTOMER CODE",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0125, params));
                }
            }
            
            // 3.1.2.Required check
            // 3.1.2.必須チェック
            if(CheckUtil.isBlankOrNull(domain.getLgcyShipTo())){
                Object[] params = {
                    "LEGACY SHIP TO",
                    checkLine
                };
                errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0083, params));
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getLgcyShipTo().length() > 2) {
                    Object[] params = {
                        "LEGACY SHIP TO",
                        "1",
                        "2",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0085, params));
                }
                // 3.1.4.Attribute check(Numeric)
                // 3.1.4.属性チェック(半角数)
                if (!CheckUtil.isNumeric(domain.getLgcyShipTo())) {
                    Object[] params = {
                        "LEGACY SHIP TO",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0125, params));
                }
            }
            
            // 3.1.2.Required check
            // 3.1.2.必須チェック
            if(CheckUtil.isBlankOrNull(domain.getCustomerItemNo())){
                Object[] params = {
                    "CUSTOMER ITEM NO",
                    checkLine
                };
                errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0083, params));
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getCustomerItemNo().length() > 27) {
                    Object[] params = {
                        "CUSTOMER ITEM NO",
                        "1",
                        "27",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0085, params));
                }
                // 3.1.4.Attribute check(AlphaNumericSymbol)
                // 3.1.4.属性チェック(半角)
                if (!ECA0027CheckUtil.isAlphaNumericSymbol(domain.getCustomerItemNo())) {
                    Object[] params = {
                        "CUSTOMER ITEM NO",
                        "",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0127, params));
                }
            }
            
            // 3.1.2.Required check
            // 3.1.2.必須チェック
            if(CheckUtil.isBlankOrNull(domain.getTrnsCd())){
                Object[] params = {
                    "TRANSPORT CODE",
                    checkLine
                };
                errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0083, params));
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getTrnsCd().length() != 1) {
                    Object[] params = {
                        "TRANSPORT CODE",
                        "1",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0084, params));
                }
                // 3.1.4.Attribute check(Alpha)
                // 3.1.4.属性チェック(半角英)
                if (!CheckUtil.isAlpha(domain.getTrnsCd())) {
                    Object[] params = {
                        "TRANSPORT CODE",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0124, params));
                }
            }
            
            // 3.1.2.Required check
            // 3.1.2.必須チェック
            if(CheckUtil.isBlankOrNull(domain.getEtdDueDt())){
                Object[] params = {
                    "ETD",
                    checkLine
                };
                errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0083, params));
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getEtdDueDt().length() != 8) {
                    Object[] params = {
                        "ETD",
                        "8",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0084, params));
                }
                // 3.1.4.Attribute check(Numeric)
                // 3.1.4.属性チェック(半角数)
                if (!CheckUtil.isNumeric(domain.getEtdDueDt())) {
                    Object[] params = {
                        "ETD",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0125, params));
                }
                // 3.1.6.Format check
                // 3.1.6.フォーマットチェック
                if(!ECA0027CheckUtil.isDateFormat(domain.getEtdDueDt(), CSV_DATE_FORMAT)) {
                    Object[] params = {
                        "ETD",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0137, params));
                }
            }
            
            // 3.1.2.Required check
            // 3.1.2.必須チェック
            if(CheckUtil.isBlankOrNull(domain.getCustomerPoNo())){
                Object[] params = {
                    "CUSTOMER PO NO",
                    checkLine
                };
                errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0083, params));
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getCustomerPoNo().length() > 20) {
                    Object[] params = {
                        "CUSTOMER PO NO",
                        "1",
                        "20",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0085, params));
                }
                // 3.1.4.Attribute check(AlphaNumericSymbol)
                // 3.1.4.属性チェック(半角)
                if (!ECA0027CheckUtil.isAlphaNumericSymbolNotBlankEnd(domain.getCustomerPoNo())) {
                    Object[] params = {
                        "CUSTOMER PO NO",
                        "",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0127, params));
                }
            }
            
            if(CheckUtil.isBlankOrNull(domain.getNewTrnsCd())) {
                // no action
                // 処理なし
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getNewTrnsCd().length() != 1) {
                    Object[] params = {
                        "NEW TRANSPORT CODE",
                        "1",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0084, params));
                }
                // 3.1.4.Attribute check(Alpha)
                // 3.1.4.属性チェック(半角英)
                if (!CheckUtil.isAlpha(domain.getNewTrnsCd())) {
                    Object[] params = {
                        "NEW TRANSPORT CODE",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0124, params));
                }
                // 3.1.11.Allied check
                // 3.1.11.関連チェック
                if(!CheckUtil.isBlankOrNull(domain.getProcessTyp())) {
                    if("1".equals(domain.getProcessTyp())) {
                        Object[] params = {
                            "PROCESS TYPE",
                            "1",
                            "NEW TRANSPORT CODE",
                            "",
                            checkLine
                        };
                        errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0144, params));
                    }
                }
            }
            
            if(CheckUtil.isBlankOrNull(domain.getNewEtdDueDt())) {
                // none
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getNewEtdDueDt().length() != 8) {
                    Object[] params = {
                        "NEW ETD",
                        "8",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0084, params));
                }
                // 3.1.4.Attribute check(Numeric)
                // 3.1.4.属性チェック(半角数)
                if (!CheckUtil.isNumeric(domain.getNewEtdDueDt())) {
                    Object[] params = {
                        "NEW ETD",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0125, params));
                }
                // 3.1.6.Format check
                // 3.1.6.フォーマットチェック
                if(!ECA0027CheckUtil.isDateFormat(domain.getNewEtdDueDt(), CSV_DATE_FORMAT)) {
                    Object[] params = {
                        "NEW ETD",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0137, params));
                }
                // 3.1.11.Allied check
                // 3.1.11.関連チェック
                if(!CheckUtil.isBlankOrNull(domain.getProcessTyp())) {
                    if("1".equals(domain.getProcessTyp())) {
                        Object[] params = {
                            "PROCESS TYPE",
                            "1",
                            "NEW ETD",
                            "",
                            checkLine
                        };
                        errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0144, params));
                    }
                }
            }
            
            if(CheckUtil.isBlankOrNull(domain.getNewCustomerPoNo())) {
                // no action
                // 処理なし
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getNewCustomerPoNo().length() > 20) {
                    Object[] params = {
                        "NEW CUSTOMER PO NO",
                        "1",
                        "20",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0085, params));
                }
                // 3.1.4.Attribute check(AlphaNumericSymbol)
                // 3.1.4.属性チェック(半角)
                if (!ECA0027CheckUtil.isAlphaNumericSymbolNotBlankEnd(domain.getNewCustomerPoNo())) {
                    Object[] params = {
                        "NEW CUSTOMER PO NO",
                        "",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0127, params));
                }
                // 3.1.11.Allied check
                // 3.1.11.関連チェック
                if(!CheckUtil.isBlankOrNull(domain.getProcessTyp())) {
                    if("1".equals(domain.getProcessTyp())) {
                        Object[] params = {
                            "PROCESS TYPE",
                            "1",
                            "NEW CUSTOMER PO NO",
                            "",
                            checkLine
                        };
                        errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0144, params));
                    }
                }
            }
            
            // 3.1.2.Required check
            // 3.1.2.必須チェック
            if(CheckUtil.isBlankOrNull(domain.getOdrQty())){
                Object[] params = {
                    "ORDER QUANTITY",
                    checkLine
                };
                errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0083, params));
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getOdrQty().length() > 7) {
                    Object[] params = {
                        "ORDER QUANTITY",
                        "1",
                        "7",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0085, params));
                }
                // 3.1.4.Attribute check(Numeric)
                // 3.1.4.属性チェック(半角数)
                if (!CheckUtil.isNumeric(domain.getOdrQty())) {
                    Object[] params = {
                        "ORDER QUANTITY",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0125, params));
                } else {
                    // 3.1.10.Allied check
                    // 3.1.10.関連チェック
                    if(!CheckUtil.isBlankOrNull(domain.getProcessTyp())) {
                        int qty = Integer.parseInt(domain.getOdrQty());
                        if(0 == qty
                            && !"2".equals(domain.getProcessTyp())) {
                            Object[] params = {
                                "ORDER QUANTITY",
                                "0",
                                "PROCESS TYPE",
                                "2",
                                checkLine
                            };
                            errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0144, params));
                        }
                    }
                }
            }
            
            // 3.1.2.Required check
            // 3.1.2.必須チェック
            if(CheckUtil.isBlankOrNull(domain.getCustomerDueDt())){
                Object[] params = {
                    "CUSTOMER DUE DATE",
                    checkLine
                };
                errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0083, params));
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getCustomerDueDt().length() != 8) {
                    Object[] params = {
                        "CUSTOMER DUE DATE",
                        "8",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0084, params));
                }
                // 3.1.4.Attribute check(Numeric)
                // 3.1.4.属性チェック(半角数)
                if (!CheckUtil.isNumeric(domain.getCustomerDueDt())) {
                    Object[] params = {
                        "CUSTOMER DUE DATE",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0125, params));
                }
                // 3.1.6.Format check
                // 3.1.6.フォーマットチェック
                if(!ECA0027CheckUtil.isDateFormat(domain.getCustomerDueDt(), CSV_DATE_FORMAT)) {
                    Object[] params = {
                        "CUSTOMER DUE DATE",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0137, params));
                }
            }
            
            // 3.1.2.Required check
            // 3.1.2.必須チェック
            if(CheckUtil.isBlankOrNull(domain.getOdrFirmFlg())){
                Object[] params = {
                    "ORDER FIRM FLAG",
                    checkLine
                };
                errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0083, params));
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getOdrFirmFlg().length() != 1) {
                    Object[] params = {
                        "ORDER FIRM FLAG",
                        "1",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0084, params));
                }
                // 3.1.4.Attribute check(Alpha)
                // 3.1.4.属性チェック(半角英)
                if (!CheckUtil.isAlpha(domain.getOdrFirmFlg())) {
                    Object[] params = {
                        "ORDER FIRM FLAG",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0124, params));
                }
                // 3.1.5.Format check
                // 3.1.5.フォーマットチェック
                if(!"Y".equals(domain.getOdrFirmFlg())
                    && !"N".equals(domain.getOdrFirmFlg())) {
                    Object[] params = {
                        "ORDER FIRM FLAG",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0134, params));
                }
            }
            
            if(CheckUtil.isBlankOrNull(domain.getSalesCompPoNo())) {
                // no action
                // 処理なし
            } else {
                // 3.1.3.Number of the figures check
                // 3.1.3.桁数チェック
                if(domain.getSalesCompPoNo().length() > 10) {
                    Object[] params = {
                        "SALES COMPANY PO NO",
                        "1",
                        "10",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0085, params));
                }
                // 3.1.4.Attribute check(AlphaNumericSymbol)
                // 3.1.4.属性チェック(半角)
                if (!ECA0027CheckUtil.isAlphaNumericSymbolNotBlankEnd(domain.getSalesCompPoNo())) {
                    Object[] params = {
                        "SALES COMPANY PO NO",
                        "",
                        checkLine
                    };
                    errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0127, params));
                }
            }
            
        } //for

        // 3.1.7.Unique check
        // 3.1.7.ユニークチェック
        if(!fcstReplaceFlagUniqueFlag) {
            Object[] params = {
                "FORECAST REPLACE FLAG"
            };
            errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0138, params));
        }
        // 3.1.8.Unique check
        // 3.1.8.ユニークチェック
        if(!rcvOdrCompCdUniqueFlag) {
            Object[] params = {
                "RECEIVE ORDER COMPANY CODE"
            };
            errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0138, params));
        }
        
        // 3.1.13.Owner company check
        // 3.1.13.責任会社チェック
        WindowInfoManager windowInfo = new WindowInfoManager(WINDOW_ID_0);
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        String ownerComp = commonInfo.getOwnerCompCd();
        if(!ownerComp.equals(csvDomainList.get(0).getRcvOdrCompCd())) {
            errList.add(new MessageDomain("wb020CriteriaDomain.formFileData", NXS_E7_0146, null));
        }
        
        if(errList.size() > 0) {
            throw new ValidationException(errList);
        }
        
        wb020CriteriaDomain.setRcvOdrCompCd(rcvOdrCompCd);
        wb020CriteriaDomain.setFcstReplaceFlg(fcstReplaceFlg);
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - A check among - night batch
     *       Shipper confirms whether to be among a night batch.
     *       details -- common-specifications .xls -- "-- functional specification common: -- behavior" in a CIGMA night batch is referred to
     * - DB consistency check
     *       Ordering company existence check (NEXUS Company Master)
     * </pre>
     * <pre>
     * - 夜間バッチ中チェック
     *     Shipperが夜間バッチ中かをチェックする。
     *     詳細は共通仕様.xls「機能仕様共通：CIGMA夜間バッチ中の振る舞い」を参照
     * - DB整合性チェック
     *     受注会社存在チェックをする（NEXUS会社原単位）
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WB020OdrUploadReqDomain wb020CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException
    {
        // 受注会社存在チェック
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain.setCompCd(wb020CriteriaDomain.getRcvOdrCompCd());
        tmNxsCompCriteriaDomain.setSearchCountCheckFlg(false);
        int count = tmNxsCompService.searchCount(tmNxsCompCriteriaDomain);
        if (count == 0) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            errorList.add(new MessageDomain("wb002CriteriaDomain.rcvOdrCompCd", NXS_E7_0031, null));

            throw new ValidationException(errorList);
        }

        // CIGMA夜間処理中チェック
        if (!commonService.searchCigmaAvailable(false, wb020CriteriaDomain.getRcvOdrCompCd())) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            errorList.add(new MessageDomain("", NXS_E1_0060, null));

            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * -Execution of registration processing
     *     Call {@link WB020OdrUploadService#transactUpload}
     * </pre>
     * <pre>
     * ‐登録処理の実行
     *     {@link WB020OdrUploadService#transactUpload}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(WB020OdrUploadReqDomain wb020CriteriaDomain)
        throws GscmApplicationException, ApplicationException
    {
        // Regist to the File Manager and request to the background job.
        wb020OdrUploadService.transactUpload(wb020CriteriaDomain);

        return null;
    }
    
    /**
     * Load csv data to WB020CsvListDomain for WB020Csv
     *
     * @param data data
     * @return domain from csv
     */
    private WB020CsvListDomain loadWB020CsvListDomain(List<String> data) {
        WB020CsvListDomain domain = new WB020CsvListDomain();
        int j = 0;
        domain.setFcstReplaceFlg(data.get(j));
        domain.setProcessTyp(data.get(++j));
        domain.setRcvOdrCompCd(data.get(++j));
        domain.setCustomerCd(data.get(++j));
        domain.setLgcyShipTo(data.get(++j));
        domain.setCustomerItemNo(data.get(++j));
        domain.setTrnsCd(data.get(++j));
        domain.setEtdDueDt(data.get(++j));
        domain.setCustomerPoNo(data.get(++j));
        domain.setNewTrnsCd(data.get(++j));
        domain.setNewEtdDueDt(data.get(++j));
        domain.setNewCustomerPoNo(data.get(++j));
        domain.setOdrQty(data.get(++j));
        domain.setCustomerDueDt(data.get(++j));
        domain.setOdrFirmFlg(data.get(++j));
        domain.setSalesCompPoNo(data.get(++j));
        return domain;
    }
    
}
