/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHAR_SET_UTF8;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ERR_CORRECTION_LV_M;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_PLTZINSTR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_TYPE_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L1003;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.qrcodegenerate.QrcodeGenerator;
import com.globaldenso.ai.library.qrcodegenerate.exception.QrcodeGenerateException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService;
import com.globaldenso.eca0027.core.business.domain.L1003ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L1003ReportDomain;
import com.globaldenso.eca0027.core.business.domain.W1006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1006UpdateDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * The implementation class of form creation service of L1003 [Export Request].<br />
 * L1003【 Export Request 】の帳票作成サービスの実装クラスです。
 * 
 * @version $Revision: 7765 $
 */
public class L1003ReportServiceImpl extends AbstractReportServiceImpl implements L1003ReportService {

    /**
     * TtExpRequest Service
     */
    protected TtExpRequestService ttExpRequestService;
    /**
     * TtExpRequestDtl Service
     */
    protected TtExpRequestDtlService ttExpRequestDtlService;
    /**
     * TtExpRequestDtlKit Service
     */
    protected TtExpRequestDtlKitService ttExpRequestDtlKitService;
    
    /**
     * service of NEXUS Company Master <br />
     * NEXUS会社原単位サービス
     */
    protected TmNxsCompService tmNxsCompService;
    
    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L1003ReportServiceImpl() {
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
     * <p>Setter method for ttExpRequestDtlService.</p>
     *
     * @param ttExpRequestDtlService Set for ttExpRequestDtlService
     */
    public void setTtExpRequestDtlService(TtExpRequestDtlService ttExpRequestDtlService) {
        this.ttExpRequestDtlService = ttExpRequestDtlService;
    }

    /**
     * <p>Setter method for ttExpRequestDtlKitService.</p>
     *
     * @param ttExpRequestDtlKitService Set for ttExpRequestDtlKitService
     */
    public void setTtExpRequestDtlKitService(TtExpRequestDtlKitService ttExpRequestDtlKitService) {
        this.ttExpRequestDtlKitService = ttExpRequestDtlKitService;
    }

    /**
     * Setter method for ttExpRequestService.
     *
     * @param ttExpRequestService Set for ttExpRequestService
     */
    public void setTtExpRequestService(TtExpRequestService ttExpRequestService) {
        this.ttExpRequestService = ttExpRequestService;
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
     * {@inheritDoc}
     * @throws QrcodeGenerateException 
     * @throws IOException 
     * @see com.globaldenso.eca0027.core.business.service.L1001ReportService#searchExpRequestInspect(String, String)
     */
    public File searchExpRequestIdTag(W1006UpdateDomain w1006UpdateDomain, String dateFormat) throws ApplicationException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        L1003ReportDomain reportDomain = new L1003ReportDomain();
        
        List<L1003ReportDetailDomain> detailList = new ArrayList<L1003ReportDetailDomain>();
        // Get header and detail of the report.
        // 帳票情報(Head・Detail)取得
        List<? extends TtExpRequestDomain> ttExpRequestList = getReportMainInfo(w1006UpdateDomain.getCriteriaDomain().getExpRequestNo());
        if (ttExpRequestList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        for(W1006ListDomain w1006ListDomain : w1006UpdateDomain.getListDomainList()){
            if (CHECK_ON.equals(w1006ListDomain.getSelected())) {
                TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
                StringBuffer qrCodeNexus = new StringBuffer();
                // Item
                if(w1006ListDomain.getLineNo() != null && Integer.parseInt(w1006ListDomain.getLineNo()) > 0)
                {
                   
                    // Set detail data
                    L1003ReportDetailDomain detailDomain = new L1003ReportDetailDomain();
                    TtExpRequestCriteriaDomain  headerCriteria = new TtExpRequestCriteriaDomain();
                    headerCriteria.setExpRequestNo(w1006ListDomain.getExpRequestNo());
                    TtExpRequestDomain headDm = ttExpRequestService.searchByKey(headerCriteria);
                    if(headDm != null)
                    {
                        tmNxsCompDomain = getNxsComp(headDm);
                        
                        // Set Nexus QR code data
                        // QRコードNexus
                        qrCodeNexus.append(getQrHeader(headDm.getShipperCd(), QR_HEAD_TYPE_CML, "0", "0", "01", "018"));
                        qrCodeNexus.append(QR_HEAD_PLTZINSTR);
                        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getExpRequestNo()), 17));
                        
                    }
                    
                    // Get detail data
                    TtExpRequestDtlCriteriaDomain criteria = new TtExpRequestDtlCriteriaDomain();
                    criteria.setExpRequestNo(w1006ListDomain.getExpRequestNo());
                    if(w1006ListDomain.getExpRequestItemId() == null)
                    {
                        criteria.setExpRequestItemId (null);
                    }else{
                        criteria.setExpRequestItemId(new BigDecimal(w1006ListDomain.getExpRequestItemId()));
                    }
                    
                    criteria.setLineNo(new BigDecimal(w1006ListDomain.getLineNo()));
                    TtExpRequestDtlDomain ttExpRequestDtlDomain = ttExpRequestDtlService.searchByKey(criteria);
                    
                    if(ttExpRequestDtlDomain != null)
                    {
                        // Copy properties 
                        CommonUtil.copyPropertiesDomainToDomain(detailDomain, ttExpRequestDtlDomain);
                        detailDomain.setCustomerItemNo(ttExpRequestDtlDomain.getCustomerPoNo());
                        detailDomain.setItemNo(ttExpRequestDtlDomain.getCustomerItemNo());
                        String expReq = ttExpRequestDtlDomain.getExpRequestNo() + "-" + ttExpRequestDtlDomain.getLineNo();
                        detailDomain.setExpRequestNo(expReq);
                        detailDomain.setQrCodeNexus(qrCodeNexus.toString());
                        detailDomain.setShipperCd(tmNxsCompDomain.getCompNmAbb());
                        detailDomain.setShipTo(headDm.getShipToCd());
                        detailList.add(detailDomain);
                    }
                        
                }else{ // Kit
                    // Set detail data
                    L1003ReportDetailDomain detailDomain = new L1003ReportDetailDomain();
                    TtExpRequestCriteriaDomain  headerCriteria = new TtExpRequestCriteriaDomain();
                    headerCriteria.setExpRequestNo(w1006ListDomain.getExpRequestNo());
                    TtExpRequestDomain headDm = ttExpRequestService.searchByKey(headerCriteria);
                    if(headDm != null)
                    {
                        tmNxsCompDomain = getNxsComp(headDm);
                        
                        // Set Nexus QR code data
                        // QRコードNexus
                        qrCodeNexus.append(getQrHeader(headDm.getShipperCd(), QR_HEAD_TYPE_CML, "0", "0", "01", "018"));
                        qrCodeNexus.append(QR_HEAD_PLTZINSTR);
                        qrCodeNexus.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getExpRequestNo()), 17));
                        
                    }
                    
                    // Get detail data
                    TtExpRequestDtlKitCriteriaDomain criteria = new TtExpRequestDtlKitCriteriaDomain();
                    criteria.setExpRequestNo(w1006ListDomain.getExpRequestNo());
                    if(w1006ListDomain.getExpRequestItemId() == null)
                    {
                        criteria.setExpRequestItemId(null);
                    }else{
                        criteria.setExpRequestItemId( new BigDecimal(w1006ListDomain.getExpRequestItemId()));
                    }
                    if(w1006ListDomain.getItem() == null)
                    {
                        criteria.setKitBrch(null);
                    }else{
                        criteria.setKitBrch( new BigDecimal(w1006ListDomain.getItem()));
                    }
                    if(w1006ListDomain.getExpRequestKitId() == null)
                    {
                        criteria.setExpRequestKitId(null);
                    }else{
                        criteria.setExpRequestKitId( new BigDecimal(w1006ListDomain.getExpRequestKitId()));
                    }
                    TtExpRequestDtlKitDomain ttExpRequestDtlKitDomain = ttExpRequestDtlKitService.searchByKey(criteria);
                    
                    if(ttExpRequestDtlKitDomain != null)
                    {
                        // Copy properties 
                        CommonUtil.copyPropertiesDomainToDomain(detailDomain, ttExpRequestDtlKitDomain);
                        detailDomain.setCustomerItemNo(ttExpRequestDtlKitDomain.getKitCustomerItemNo());
                        detailDomain.setItemNo(ttExpRequestDtlKitDomain.getKitComponentItemNo());
                        detailDomain.setQrCodeNexus(qrCodeNexus.toString());
                        detailDomain.setDescription(ttExpRequestDtlKitDomain.getKitComponentItemNm());
                        detailDomain.setShipperCd(tmNxsCompDomain.getCompNmAbb());
                        detailDomain.setShipTo(headDm.getShipToCd());
                        String expReq = ttExpRequestDtlKitDomain.getExpRequestNo() + "-" + ttExpRequestDtlKitDomain.getKitBrch();
                        detailDomain.setExpRequestNo(expReq);
                        detailList.add(detailDomain);
                    }
                    
                }
            }
        }
        reportDomain.setDetailList(detailList);
        // Set QR
        for(L1003ReportDetailDomain domain : reportDomain.getDetailList()){
            try{
                domain.setQrCdEls(createQrCode(domain.getQrCodeNexus().toString(), 130, baos));
                baos.reset();
            }catch (QrcodeGenerateException e) {
                e.printStackTrace();
                throw new GscmApplicationException("NXS-E1-5065");
            } catch (IOException e) {
                e.printStackTrace();
                throw new GscmApplicationException("NXS-E1-5065");
            } finally {
                try {
                    baos.close();
                } catch(Exception e2) {
                    e2.printStackTrace();
                    throw new SystemException(NXS_91_0001);
                }
            }
        }
        convertToBlank(reportDomain);
        return getReportFile(reportDomain);
    }

    /**
     * Get (header, item) form data.<br />
     * 帳票データ(ヘッダ、明細)を取得します。
     *
     * @param expRequestNo Search condition<br />
     * 検索条件
     * @return (Header, item) information form data<br />
     * 帳票データ(ヘッダ、明細)情報
     * @throws ApplicationException If the form data can not be obtained then ApplicationException.<br />
     * 帳票データが取得できない場合にスローされます。
     */
    protected List<? extends TtExpRequestDomain> getReportMainInfo(String expRequestNo) throws ApplicationException {
        
        TtExpRequestCriteriaDomain viewCriteria = new TtExpRequestCriteriaDomain();
        viewCriteria.setExpRequestNo(expRequestNo);
        List<? extends TtExpRequestDomain> ttExpRequestDomainList = ttExpRequestService.searchByCondition(viewCriteria);
        
        return ttExpRequestDomainList;
    }

    /**
     * Get the print date.<br />
     * 印刷日付を取得します。
     *
     * @param headDm Search conditions domain<br />
     * 検索条件ドメイン
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return Time zone conversion date and time<br />
     * タイムゾーン変換日時
     * @throws ApplicationException If the date can not be obtained then ApplicationException.<br />
     * 日付が取得できない場合にスローされます。
     */
    protected String getTimezoneDate(TtExpRequestDomain headDm, String dateFormat) throws ApplicationException {
        String timezoneId = commonService.searchTimezone(headDm.getShipperCd());
        Date sysdate = DateUtil.convertTime(new Date(), timezoneId);
        return DateUtil.formatDate(sysdate, dateFormat);
    }

    /**
     * Generate a form object.<br />
     * 帳票オブジェクトを生成します。
     *
     * @param reportDomain Form domain<br />
     * 帳票ドメイン
     * @return Document object<br />
     * 帳票オブジェクト
     */
    protected File getReportFile(L1003ReportDomain reportDomain) {
        return createReport(REPORT_ID_L1003, reportDomain);
    }
    /**
     * Convert to blank <br />
     * 指定文字列をカットする
     *
     * @param domain L1002ReportDomain<br />
     * 対象文字列
     * @return domain L1002ReportDomain<br />
     * カット後文字列
     */
    protected L1003ReportDomain convertToBlank(L1003ReportDomain domain) {
        if(domain.getDetailList() != null && domain.getDetailList().size() > 0 )
        {
            for(L1003ReportDetailDomain l1003ReportDetailDomain : domain.getDetailList() )
            {
                if(l1003ReportDetailDomain.getItem() == null )
                {
                    l1003ReportDetailDomain.setItem("");                    
                }
                if(l1003ReportDetailDomain.getCustomerItemNo() == null )
                {
                    l1003ReportDetailDomain.setCustomerItemNo("");                    
                }
                if(l1003ReportDetailDomain.getItemNo() == null )
                {
                    l1003ReportDetailDomain.setItemNo("");                    
                }
                if(l1003ReportDetailDomain.getDescription() == null )
                {
                    l1003ReportDetailDomain.setDescription("");                    
                }
                if(l1003ReportDetailDomain.getQty() == null )
                {
                    l1003ReportDetailDomain.setQty("");                    
                }
                if(l1003ReportDetailDomain.getQtyUnit() == null )
                {
                    l1003ReportDetailDomain.setQtyUnit("");                    
                }
                if(l1003ReportDetailDomain.getShipperCd() == null )
                {
                    l1003ReportDetailDomain.setShipperCd("");                    
                }
                if(l1003ReportDetailDomain.getShipTo() == null )
                {
                    l1003ReportDetailDomain.setShipTo("");                    
                }
            }
        }
        return domain;
    }
    /**
     * Generate a QR CD InputStream.<br />
     * QRコードInputStreamを生成します。
     * 
     * @param insStr String embedded QR CD<br />
     * QRコード埋め込み文字列
     * @param px Pixel<br />
     * ピクセル
     * @param baos storage Stream<br />
     * 格納用Stream
     * @throws IOException It is thrown when an I / O error has occurred then IOException.<br />
     * 入出力エラーが発生した場合にスローされます。
     * @throws QrcodeGenerateException If a eneration of QR CD can not be then QrcodeGenerateException.<br />
     * QRコードの生成ができない場合にスローされます。
     * @return InputStream QR CD object<br />
     * InputStream QRコードオブジェクト
     */
    protected InputStream createQrCode(String insStr, int px, ByteArrayOutputStream baos) throws IOException, QrcodeGenerateException {

        QrcodeGenerator.generateQrcode(insStr, ERR_CORRECTION_LV_M, CHAR_SET_UTF8, px, baos);
        return new ByteArrayInputStream(baos.toByteArray());
    }
    /**
     * Get Nxs Company<br />
     * 印刷日付を取得します。
     *
     * @param headDm TtExpRequestDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @return tmNxsCompDomain TmNxsCompDomain<br />
     * タイムゾーン変換日時
     * @throws ApplicationException If the date can not be obtained then ApplicationException.<br />
     * 日付が取得できない場合にスローされます。
     */
    protected TmNxsCompDomain getNxsComp(TtExpRequestDomain headDm) throws ApplicationException {
        // Acquisition of NEXUS Company Master
        // NEXUS会社原単位の取得
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain.setCompCd(headDm.getShipperCd());
        TmNxsCompDomain tmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
        return tmNxsCompDomain;
    }
}
