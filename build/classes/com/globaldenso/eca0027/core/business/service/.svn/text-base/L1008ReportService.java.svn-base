/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlHdrMixedPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VtRpCmlHdrMixedPltzService;
import com.globaldenso.eca0027.core.business.dao.RpEisProductDao;
import com.globaldenso.eca0027.core.business.domain.L2003TtPltzItemByItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzBySingleCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzItemByDetailCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzItemByItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * The interface of the service that provides the output function form [(EIS Parts) CML].
 * <br/>帳票【 CML(EIS Parts) 】出力機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:l1008ReportService
 * </pre>
 * 
 * @author $Author: DCS $
 * @version $Revision: 5759 $
 */
public interface L1008ReportService {

    /**
     * Get the form output information and generate a form [CML (EIS Parts)].
     * <br/>帳票出力情報を取得し、帳票【 CML(EIS Parts) 】を生成します。
     * <pre>
     * - Get printed case mark
     *   - In the case of the takeover VALUE PALLETIZE INSTRUCTION NO ≠ "".
     *     Call {@link RpEisProductDao#searchTtPltzItemByItemNo(L2003TtPltzItemByItemNoCriteriaDomain)} as an argument criteria.
     * 
     *   - In the case of the takeover VALUE PALLETIZE INSTRUCTION NO = "".
     *     Call {@link RpEisProductDao#searchTtPltzItemByItemNo(L2003TtPltzItemByItemNoCriteriaDomain)} as an argument criteria.
     *     Get the number is 0 , an error will occur .
     * 
     * - Get time zone conversion date
     *   Call {@link CommonService#searchTimezone(String)} in the argument {@link L2003TtPltzItemByItemNoDomain}.
     *   Call {@link DateUtil#convertTime(Date, String)} to the timezoneId argument that has been acquired .
     * 
     * - Get the form of information ( header )
     *   - Printed mark case is a case of 1
     *     Call {@link RpEisProductDao#searchTtPltzBySingle(L2003TtPltzBySingleCriteriaDomain)} as an argument criteria.
     *   - If there is 2 or more printed case mark
     *     Call {@link VtRpCmlHdrMixedPltzService#searchByCondition(VtRpCmlHdrMixedPltzCriteriaDomain)} as an argument criteria.
     * 
     * - Get the form of information ( specification )
     *   Call {@link RpEisProductDao#searchTtPltzItemByDetail(L2003TtPltzItemByDetailCriteriaDomain)} as an argument criteria.
     * 
     * - Generation of the form
     *   Call form generation method in argument specification List, header HashMap, template path string , string password , the pdfStream.
     * </pre>
     * <pre>
     * - 印刷対象ケースマークの取得
     *     - 引継値.梱包指示NO ≠ ""の場合 
     *         criteriaを引数に{@link RpEisProductDao#searchTtPltzItemByItemNo(L2003TtPltzItemByItemNoCriteriaDomain)}を呼び出します。
     *         
     *     - 引継値.梱包指示NO ＝ ""の場合 
     *         criteriaを引数に{@link RpEisProductDao#searchTtPltzItemByItemNo(L2003TtPltzItemByItemNoCriteriaDomain)}を呼び出します。
     *   取得件数が0であれば、エラーとします。
     *   
     * - タイムゾーン変換日付の取得
     *     {@link L2003TtPltzItemByItemNoDomain}を引数に{@link CommonService#searchTimezone(String)}を呼び出します。
     *     取得したtimezoneIdを引数に{@link DateUtil#convertTime(Date, String)}を呼び出します。
     *         
     * - 帳票情報(ヘッダ)の取得
     *     - 印刷対象ケースマークが１件の場合 
     *         criteriaを引数に{@link RpEisProductDao#searchTtPltzBySingle(L2003TtPltzBySingleCriteriaDomain)}を呼び出します。
     *     - 印刷対象ケースマーク２件以上ある場合 
     *         criteriaを引数に{@link VtRpCmlHdrMixedPltzService#searchByCondition(VtRpCmlHdrMixedPltzCriteriaDomain)}を呼び出します。
     *         
     * - 帳票情報(明細)の取得
     *     criteriaを引数に{@link RpEisProductDao#searchTtPltzItemByDetail(L2003TtPltzItemByDetailCriteriaDomain)}を呼び出します。
     *     
     * - 帳票の生成
     *     明細List, ヘッダHashMap, テンプレートパス文字列, パスワード文字列, pdfStreamを引数に帳票生成メソッドを呼び出します。
     * </pre>
     * 
     * @param expRequestNo search condition
     * @param cmlNo search condition
     * @param dateFormat Format
     * @throws ApplicationException application exception
     * @return File
     */
    public File searchCml(String expRequestNo, String cmlNo, String dateFormat) throws ApplicationException;
    
}
