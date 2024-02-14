/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VtRpPltzInstrService;
import com.globaldenso.eca0027.core.business.dao.RpEisProductDao;
import com.globaldenso.eca0027.core.business.domain.criteria.L2001TtPltzInstrItemNoBySumBoxQtyCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * The interface of the service that provides the Palletize Instruction [] output function form.
 * <br/>帳票【 Palletize Instruction 】出力機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:l2001ReportService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface L2001ReportService {

    /**
     * Get the form output information and generate a document [Palletize Instruction].
     * <br/>帳票出力情報を取得し、帳票【 Palletize Instruction 】を生成します。
     * <pre>
     * - Get ( header , item) of the form data
     *   Call {@link VtRpPltzInstrService#searchByCondition(VtRpPltzInstrCriteriaDomain)} with the name of the criteriaDomain.
     *   Get the number is 0 , an error will occur .
     * 
     * - BOX QUANTITY that summary to the unit of PALLETIZE INSTRUCTION NO · ITEM NO · PACKAGE CODE,
     *    the Palletize Instruction Item No, Get Palletize Instruction number .
     *   Call {@link RpEisProductDao#searchTtPltzInstrItemNoBySumBoxQty(L2001TtPltzInstrItemNoBySumBoxQtyCriteriaDomain)} as an argument criteriaDomain.
     * 
     * - Get WEIGHT UNIT
     *   Call {@link CommonService#searchWeightUnit(String)} in the argument shipperCd.
     * 
     * - Get print date
     *   Call {@link CommonService#searchTimezone(String)} in the argument {@link VtRpPltzInstrDomain}.
     *   Call {@link DateUtil#convertTime(Date, String)} to the timezoneId argument that has been acquired .
     * </pre>
     * <pre>
     * - 帳票データ(ヘッダ、明細)の取得
     *     criteriaDomainを引数にして{@link VtRpPltzInstrService#searchByCondition(VtRpPltzInstrCriteriaDomain)}を呼び出します。
     *     取得件数が0であれば、エラーとします。
     *     
     * - 梱包指示品目番号を梱包指示NO・品目番号・包装区分、の単位にサマリした箱数、梱包指示数を取得します。
     *     criteriaDomainを引数に{@link RpEisProductDao#searchTtPltzInstrItemNoBySumBoxQty(L2001TtPltzInstrItemNoBySumBoxQtyCriteriaDomain)}を呼び出します。
     *     
     * - 重量単位の取得
     *     shipperCdを引数に{@link CommonService#searchWeightUnit(String)}を呼び出します。
     *     
     * - 印刷日付の取得
     *     {@link VtRpPltzInstrDomain}を引数に{@link CommonService#searchTimezone(String)}を呼び出します。
     *     取得したtimezoneIdを引数に{@link DateUtil#convertTime(Date, String)}を呼び出します。
     *     
     * - 帳票の生成
     *     明細List, ヘッダHashMap, テンプレートパス文字列, パスワード文字列, pdfStreamを引数に帳票生成メソッドを呼び出します。
     * </pre>
     *
     * @param pltzInstrNo search condition
     * @param dateFormat format
     * @throws ApplicationException application exception
     * @return File
     */
    public File searchPltzInstr(String pltzInstrNo, String dateFormat) throws ApplicationException;
    
}
