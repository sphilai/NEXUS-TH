/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L1002;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService;
import com.globaldenso.eca0027.core.business.domain.L1002ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L1002ReportDomain;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDtlDomain;
import com.globaldenso.eca0027.core.business.domain.W1006ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * The implementation class of form creation service of L1002 [Export Request].<br />
 * L1002【 Export Request 】の帳票作成サービスの実装クラスです。
 * 
 * @version $Revision: 7765 $
 */
public class L1002ReportServiceImpl extends AbstractReportServiceImpl implements L1002ReportService {
    /**
     * TtExpRequestService
     */
    protected TtExpRequestService ttExpRequestService;
    
    /**
     * W1006ExpRequestDtlService
     */
    protected W1006ExpRequestDtlService w1006ExpRequestDtlService;
    
    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * service of NEXUS Company Master <br />
     * NEXUS会社原単位サービス
     */
    protected TmNxsCompService tmNxsCompService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L1002ReportServiceImpl() {
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
     * Setter method for ttExpRequestService.
     *
     * @param ttExpRequestService Set for ttExpRequestService
     */
    public void setTtExpRequestService(TtExpRequestService ttExpRequestService) {
        this.ttExpRequestService = ttExpRequestService;
    }
    

    /**
     * <p>Getter method for w1006ExpRequestDtlService.</p>
     *
     * @return the w1006ExpRequestDtlService
     */
    public W1006ExpRequestDtlService getW1006ExpRequestDtlService() {
        return w1006ExpRequestDtlService;
    }

    /**
     * <p>Setter method for w1006ExpRequestDtlService.</p>
     *
     * @param expRequestDtlService Set for w1006ExpRequestDtlService
     */
    public void setW1006ExpRequestDtlService(W1006ExpRequestDtlService expRequestDtlService) {
        w1006ExpRequestDtlService = expRequestDtlService;
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
     * @see com.globaldenso.eca0027.core.business.service.L1001ReportService#searchExpRequestInspect(String, String)
     */
    public File searchExpRequestInspect(String expRequestNo, String dateFormat) throws ApplicationException {

        L1002ReportDomain reportDomain = new L1002ReportDomain();
        boolean isKit = false;
        // Get header and detail of the report.
        // 帳票情報(Head・Detail)取得
        List<? extends TtExpRequestDomain> ttExpRequestList = getReportMainInfo(expRequestNo);
        if (ttExpRequestList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        // Set Header data.
        // Head情報設定
        TtExpRequestDomain headDm = ttExpRequestList.get(0);
        CommonUtil.copyPropertiesDomainToDomain(reportDomain, headDm, dateFormat);
        
        // Find User
        W1006ExpRequestDtlCriteriaDomain  w1006criteria = new W1006ExpRequestDtlCriteriaDomain();
        w1006criteria.setRequestIssuerNm(headDm.getRequestIssuerNm());
        String userName = w1006ExpRequestDtlService.searchByDscId(w1006criteria);
        if(userName != null && userName.length() > 0)
        {
            reportDomain.setRequestIssuerNm(userName);
        }
        TmNxsCompDomain tmNxsCompDomain = getNxsComp(headDm);
        if(tmNxsCompDomain != null){
            reportDomain.setExpRequest(tmNxsCompDomain.getCompNm());
            reportDomain.setCompName(tmNxsCompDomain.getCompNm());
            reportDomain.setAddr(tmNxsCompDomain.getCompAddr());
            reportDomain.setPkgComp(tmNxsCompDomain.getCompNm());
        }else{
            reportDomain.setExpRequest("");
            reportDomain.setCompName("");
            reportDomain.setAddr("");
            reportDomain.setPkgComp("");
        }
        if(getTimezoneDate(headDm, dateFormat) == null)
        {
            reportDomain.setPrintedDate(new SimpleDateFormat(dateFormat).format(new Date()));
        }else{
            reportDomain.setPrintedDate(getTimezoneDate(headDm, dateFormat));
        }
      
        reportDomain.setContact("");  
        reportDomain.setRtUseFlg("Y");        
        reportDomain.setShipTo(headDm.getShipToCd());
        
        
        // Get detail data
        W1006ExpRequestDtlCriteriaDomain criteria = new W1006ExpRequestDtlCriteriaDomain();
        criteria.setExpRequestNo(expRequestNo);
        List<W1006ExpRequestDtlDomain> w1006ExpRequestDtlList = w1006ExpRequestDtlService.searchKitByCondition(criteria);
        
        // Set detail data
        List<L1002ReportDetailDomain> detailList = new ArrayList<L1002ReportDetailDomain>();
        for (W1006ExpRequestDtlDomain detailDm : w1006ExpRequestDtlList) {
            
            L1002ReportDetailDomain detailDomain = new L1002ReportDetailDomain();
            // Copy properties domain to domain
            CommonUtil.copyPropertiesDomainToDomain(detailDomain, detailDm);
            if(detailDm.getLineNo() == null && detailDm.getExpRequestItemId() != null && detailDm.getExpRequestItemId().intValue() > 0 ){
                isKit = true;
            }
            
            detailList.add(detailDomain);
        }
        if(isKit)
        {
            reportDomain.setKit("Y");
        }else{
            reportDomain.setKit("N");
        }
        
        reportDomain.setDetailList(detailList);
        reportDomain.setTotalTags(String.valueOf(setTotalIDTag(w1006ExpRequestDtlList)) );
        // Convert null to blank 
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
    
    /**
     * Generate a form object.<br />
     * 帳票オブジェクトを生成します。
     *
     * @param reportDomain Form domain<br />
     * 帳票ドメイン
     * @return Document object<br />
     * 帳票オブジェクト
     */
    protected File getReportFile(L1002ReportDomain reportDomain) {
        return createReport(REPORT_ID_L1002, reportDomain);
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
    protected L1002ReportDomain convertToBlank(L1002ReportDomain domain) {
        if(domain.getDueDt() == null )
        {
            domain.setDueDt("");
        }
        if(domain.getIssuerCompTel() == null )
        {
            domain.setIssuerCompTel("");
        }
        if(domain.getRequestToPackingSec() == null )
        {
            domain.setRequestToPackingSec("");
        }
        if(domain.getRequestIssuerDeptNm() == null )
        {
            domain.setRequestIssuerDeptNm("");
        }
        if(domain.getRequestIssuerNm() == null )
        {
            domain.setRequestIssuerNm("");
        }
        if(domain.getIssuerCompNiceNet() == null )
        {
            domain.setIssuerCompNiceNet("");
        }
        if(domain.getAddr() == null )
        {
            domain.setAddr("");
        }
        if(domain.getDetailList() != null && domain.getDetailList().size() > 0 )
        {
            for(L1002ReportDetailDomain l1002ReportDetailDomain : domain.getDetailList() )
            {
                if(l1002ReportDetailDomain.getLineNo() == null )
                {
                    l1002ReportDetailDomain.setLineNo("");                    
                }
                if(l1002ReportDetailDomain.getItem() == null )
                {
                    l1002ReportDetailDomain.setItem("");                    
                }
                if(l1002ReportDetailDomain.getCustomerItemNo() == null )
                {
                    l1002ReportDetailDomain.setCustomerItemNo("");                    
                }
                if(l1002ReportDetailDomain.getItemNo() == null )
                {
                    l1002ReportDetailDomain.setItemNo("");                    
                }
                if(l1002ReportDetailDomain.getDescription() == null )
                {
                    l1002ReportDetailDomain.setDescription("");                    
                }
                if(l1002ReportDetailDomain.getQty() == null )
                {
                    l1002ReportDetailDomain.setQty("");                    
                }
                if(l1002ReportDetailDomain.getQtyUnit() == null )
                {
                    l1002ReportDetailDomain.setQtyUnit("");                    
                }
            }
        }
        return domain;
    }
    /**
     * Setting Total ID Tag
     * 
     *
     * @param expRequestDtlList List<? extends W1006ExpRequestDtlDomain>
     * @return count int
     */
    protected int setTotalIDTag(List<? extends W1006ExpRequestDtlDomain> expRequestDtlList) {
        List<W1006ListDomain> listDomainList = new ArrayList<W1006ListDomain>();
        int index = -1;
        int count = 0;
        if (expRequestDtlList != null) {
            for (W1006ExpRequestDtlDomain w1006ExpRequestDtlDomain : expRequestDtlList) {
                W1006ListDomain listDomain = new W1006ListDomain();
                if(w1006ExpRequestDtlDomain.getLineNo() != null && w1006ExpRequestDtlDomain.getLineNo().intValue() > 0 )
                {
                    w1006ExpRequestDtlDomain.setStatus("parent");
                    w1006ExpRequestDtlDomain.setHaveCheckBox(true);
                    index = count;
                }else{
                    if(index > -1)
                    {
                        W1006ListDomain domain = (W1006ListDomain)listDomainList.get(index);
                        domain.setHaveCheckBox(false);
                        index = -1;
                    }
                    w1006ExpRequestDtlDomain.setStatus("child");
                    w1006ExpRequestDtlDomain.setNoOfChild("");
                    w1006ExpRequestDtlDomain.setHaveCheckBox(true);
                }
                CommonUtil.copyPropertiesDomainToDomain(listDomain, w1006ExpRequestDtlDomain);
                listDomainList.add(listDomain);
                count++;
            }
        }
        count = 0;
        for(W1006ListDomain domain : listDomainList)
        {
            if(domain.isHaveCheckBox())
            {
                count++;
            }
        }
        return count;
    }
}
