/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PAY_METH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L1001;

import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W1006ExpRequestDao;
import com.globaldenso.eca0027.core.business.dao.W1006ExpRequestDtlDao;
import com.globaldenso.eca0027.core.business.domain.L1001ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L1001ReportDomain;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDtlDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * The implementation class of form creation service of L1001 [Export Request].<br />
 * L1001【 Export Request 】の帳票作成サービスの実装クラスです。
 * 
 * @version $Revision: 7765 $
 */
public class L1001ReportServiceImpl extends AbstractReportServiceImpl implements L1001ReportService {
    /**
     * DecimalFormat
     */
    protected DecimalFormat df = new DecimalFormat("#,###.00");
    /**
     * W1006ExpRequestDao
     */
    protected W1006ExpRequestDao w1006ExpRequestDao;
    
    /**
     * W1006ExpRequestDtlDao
     */
    protected W1006ExpRequestDtlDao w1006ExpRequestDtlDao;
    
    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L1001ReportServiceImpl() {
    }

    /**
     * Setter method for w1006ExpRequestDao.
     *s
     * @param expRequestDao Set for w1006ExpRequestDao
     */
    public void setW1006ExpRequestDao(W1006ExpRequestDao expRequestDao) {
        w1006ExpRequestDao = expRequestDao;
    }
    
    /**
     * Setter method for w1006ExpRequestDtlDao.
     *
     * @param expRequestDtlDao Set for w1006ExpRequestDtlDao
     */
    public void setW1006ExpRequestDtlDao(W1006ExpRequestDtlDao expRequestDtlDao) {
        w1006ExpRequestDtlDao = expRequestDtlDao;
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
     * @see com.globaldenso.eca0027.core.business.service.L1001ReportService#searchExportRequestApproval(String, String)
     */
    public File searchExpRequestApproval(String expRequestNo, String dateFormat , String langCd) throws ApplicationException {

        L1001ReportDomain reportDomain = new L1001ReportDomain();
        // Get header and detail of the report.
        // 帳票情報(Head・Detail)取得
        W1006ExpRequestDomain headDm = getReportMainInfo(expRequestNo);
        if (headDm == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        // Set Header data.
        // Head情報設定
        CommonUtil.copyPropertiesDomainToDomain(reportDomain, headDm, dateFormat);
        reportDomain.setPrintedDate(getTimezoneDate(headDm, dateFormat));
        
        reportDomain.setFreightStatus(headDm.getFreightResponsibleCd());
       
        reportDomain.setRtFlag("Yes");
        if (headDm.getReExpGoodsFlg() != null && headDm.getReExpGoodsFlg().equals(FLAG_Y)) {
            reportDomain.setReExpGoodsFlg("Yes");
        }else {
            reportDomain.setReExpGoodsFlg("No");
        }
       
        // Find Payment Method  //ISSUE 130
        List<? extends SelectListItemDomain> payMethList = commonService.searchPullDownList(CD_TYPE_PAY_METH, langCd, PULLDOWN_DISP_TYPE_VALUE, false);
        if(reportDomain.getPayMeth() != null && reportDomain.getPayMeth().trim().length() > 0)
        {
            for(SelectListItemDomain domain : payMethList ){
                if(domain.getId().equalsIgnoreCase(reportDomain.getPayMeth()))
                {
                    reportDomain.setPayMeth(domain.getName()) ;
                    break;
                }
            }
        }
        
        // Get detail data
        W1006ExpRequestDtlCriteriaDomain criteria = new W1006ExpRequestDtlCriteriaDomain();
        criteria.setExpRequestNo(expRequestNo);
        List<W1006ExpRequestDtlDomain> expRequestDtlList = w1006ExpRequestDtlDao.searchPrintByKey(criteria);
        
        // Set detail data
        double unitPrice = 0;
        int qty = 0;
        double netWeight = 0;
        double totalAmount = 0.0;
        boolean kitFlag = false; //ISSUE 130
        List<L1001ReportDetailDomain> detailList = new ArrayList<L1001ReportDetailDomain>();
        for (W1006ExpRequestDtlDomain detailDm : expRequestDtlList) {
            
            L1001ReportDetailDomain detailDomain = new L1001ReportDetailDomain();
            CommonUtil.copyPropertiesDomainToDomain(detailDomain, detailDm);
            unitPrice += detailDm.getUnitPrice().doubleValue();
            qty += detailDm.getQty().intValue();
            detailDm.setNetWeight(detailDm.getNetWeight().multiply(detailDm.getQty()).setScale(3, RoundingMode.HALF_UP));
            netWeight += detailDm.getNetWeight().doubleValue();
            if(detailDomain.getKitParFlg() != null && detailDomain.getKitParFlg().equalsIgnoreCase("Y"))  //ISSUE 130
            {
                kitFlag = true;
            }
            //Fix ISSUE 16/05/2016
            totalAmount = totalAmount + (detailDm.getUnitPrice().doubleValue() * detailDm.getQty().intValue());
            //end Fix ISSUE 16/05/2016
            detailList.add(detailDomain);
            
        }
        if(kitFlag){ //ISSUE 130
            reportDomain.setKitFlag("Yes");
        }else{
            reportDomain.setKitFlag("No");
        }
        
        reportDomain.setTotalAmount(df.format(totalAmount)); //Fix ISSUE 16/05/2016
        reportDomain.setTotalQty(df.format(qty));
        reportDomain.setTotalWeight(df.format(netWeight) + headDm.getWeightUnit());
        
        reportDomain.setDetailList(detailList);

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
    protected W1006ExpRequestDomain getReportMainInfo(String expRequestNo) throws ApplicationException {
        
        W1006ExpRequestCriteriaDomain viewCriteria = new W1006ExpRequestCriteriaDomain();
        viewCriteria.setExpRequestNo(expRequestNo);
        W1006ExpRequestDomain expRequestDomain = w1006ExpRequestDao.searchPrintByKey(viewCriteria);
        
        return expRequestDomain;
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
    protected String getTimezoneDate(W1006ExpRequestDomain headDm, String dateFormat) throws ApplicationException {
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
    protected File getReportFile(L1001ReportDomain reportDomain) {
        return createReport(REPORT_ID_L1001, reportDomain);
    }

}
