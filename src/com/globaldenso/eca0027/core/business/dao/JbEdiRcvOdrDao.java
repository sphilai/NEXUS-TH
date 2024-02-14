/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrReportDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.B0100EdiRcvOdrDomain;

/**
 * DAO Interface For The Batches Of EDI Orders For Registration
 * <br />EDI受注登録バッチのDAOインタフェースです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12500 $
 */
public interface JbEdiRcvOdrDao {

    /**
     * Clear the error code of EDI orders
     * <br />EDI受注のエラーコードをクリアします。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param rtryFlg Re-try flag
     * @return Update count
     * @throws ApplicationException Business exception
     */
    public int updateClearErrorEdiOdr(String rcvOdrCompCd, String rtryFlg)
        throws ApplicationException;

    /**
     * Search the EDI orders data in accordance with the information transmission date
     * <br />情報送信日に応じたEDI受注データを検索します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param rtryFlg Re-try flag
     * @return Search result
     * @throws ApplicationException Business exception
     */
    public List<Map<String, Object>> searchEdiOdrTransmissionDt(String rcvOdrCompCd, String rtryFlg)
        throws ApplicationException;

    /**
     * Create the data for the direct delivery orders update corresponding to the deleted forecast
     * <br />削除した内示に対応する直納受注更新用のデータを作成します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @throws ApplicationException Business exception
     */
    public void createExpOdrUpdByForecastEdi(String rcvOdrCompCd, Date transmissionDt)
        throws ApplicationException;

    /**
     * Remove the forecast data in accordance with the customers from export orders
     * <br />輸出受注から得意先に応じた内示データを削除します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @return Delete count
     * @throws ApplicationException Business exception
     */
    public int deleteExpOdrForecastByOrgEdi(String rcvOdrCompCd, Date transmissionDt)
        throws ApplicationException;

    /**
     * Remove the forecast data in accordance with the customers from re-try
     * <br />持ち回りから得意先に応じた内示データを削除します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @return Delete count
     * @throws ApplicationException Business exception
     */
    public int deleteEdiOdrRtryForecastByOrgEdi(String rcvOdrCompCd, Date transmissionDt)
        throws ApplicationException;

    /**
     * Search the data of CIGMA side checked
     * <br />CIGMA側チェック対象のデータを検索します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @param addOrChgTyp Add or change type
     * @param rtryFlg Re-try flag
     * @return Search result
     * @throws ApplicationException Business exception
     */
    public List<? extends B0100EdiRcvOdrDomain> searchCheckEdiOdrCigmaSide(String rcvOdrCompCd, Date transmissionDt, String addOrChgTyp, String rtryFlg)
        throws ApplicationException;

    /**
     * Search the NEXUS side check for data in the case of the original order additional
     * <br />オリジナル・発注追加の場合のNEXUS側チェック用データを検索します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @param rtryFlg Re-try flag
     * @return Search result
     * @throws ApplicationException Business exception
     */
    public List<? extends B0100EdiRcvOdrDomain> searchCheckEdiOdrAddTypNxsSide(String rcvOdrCompCd, Date transmissionDt, String rtryFlg)
        throws ApplicationException;

    /**
     * Search the NEXUS side check for data in the case of order change
     * <br />発注変更の場合のNEXUS側チェック用データを検索します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @param rtryFlg Re-try flag
     * @return Search result
     * @throws ApplicationException Business exception
     */
    public List<? extends B0100EdiRcvOdrDomain>searchCheckEdiOdrChgTypNxsSide(String rcvOdrCompCd, Date transmissionDt, String rtryFlg)
        throws ApplicationException;

    /**
     * Create an error report data from EDI orders that caused the error
     * <br />エラーとなったEDI受注よりエラーレポートデータを作成します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @param addOrChgTyp Add or change type
     * @param rtryFlg Re-try flag
     * @throws ApplicationException Business exception
     */
    public void createErrorReportByErrorEdi(String rcvOdrCompCd, Date transmissionDt, String addOrChgTyp, String rtryFlg)
        throws ApplicationException;

    /**
     * Create a re-try data from EDI orders that caused the error
     * <br />エラーとなったEDI受注より持ち回りデータを作成します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @param addOrChgTyp Add or change type
     * @throws ApplicationException Business exception
     */
    public void createEdiOdrRtryByErrorEdi(String rcvOdrCompCd, Date transmissionDt, String addOrChgTyp)
        throws ApplicationException;

    /**
     * Create a direct delivery orders update data from EDI orders that were successfully registered
     * <br />正常登録されたEDI受注より直納受注更新データを作成します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @param addOrChgTyp Add or change type
     * @param rtryFlg Re-try flag
     * @throws ApplicationException Business exception
     */
    public void createExpOdrUpdBySuccessEdi(String rcvOdrCompCd, Date transmissionDt, String addOrChgTyp, String rtryFlg)
        throws ApplicationException;

    /**
     * Register the export orders of the original order added from EDI orders
     * <br />EDI受注からオリジナル・発注追加の輸出受注を登録します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @param rtryFlg Re-try flag
     * @throws ApplicationException Business exception
     */
    public void createExpOdrByAddEdi(String rcvOdrCompCd, Date transmissionDt, String rtryFlg)
        throws ApplicationException;

    /**
     * Register the export orders of the original order added from EDI orders
     * <br />EDI受注から輸出手続品番原単位の品目名称を更新します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @param rtryFlg Re-try flag
     * @param cigmaAds CIGMA ADS
     * @return Update count
     * @throws ApplicationException Business exception
     */
    public int updateMaItemNameByAddEdi(String rcvOdrCompCd, Date transmissionDt, String rtryFlg, Date cigmaAds)
        throws ApplicationException;

    /**
     * Register the export orders of ordering change from EDI orders
     * <br />EDI受注から発注変更の輸出受注を登録します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @param rtryFlg Re-try flag
     * @return Update count
     * @throws ApplicationException Business exception
     */
    public int updateExpOdrByChgEdi(String rcvOdrCompCd, Date transmissionDt, String rtryFlg)
        throws ApplicationException;

    /**
     * Remove the export orders record results quantity becomes 0 of change
     * <br />変更の結果数量が0となった輸出受注レコードを削除します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @param rtryFlg Re-try flag
     * @return Delete count
     * @throws ApplicationException Business exception
     */
    public int deleteExpOdrZeroQty(String rcvOdrCompCd, Date transmissionDt, String rtryFlg)
        throws ApplicationException;

    /**
     * Remove the export orders of ordering Delete worth
     * <br />発注削除分の輸出受注を削除します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @return Delete count
     * @throws ApplicationException Business exception
     */
    public int deleteExpOdrByDelEdi(String rcvOdrCompCd, Date transmissionDt)
        throws ApplicationException;

    /**
     * Remove it from the re-try Delete worth
     * <br />発注削除分を持ち回りからも削除します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @return Delete count
     * @throws ApplicationException Business exception
     */
    public int deleteEdiOdrRtryByDelEdi(String rcvOdrCompCd, Date transmissionDt)
        throws ApplicationException;

    /**
     * Remove from re-try Once registration is successful in export orders
     * <br />輸出受注に登録が成功したら持ち回りから削除します。
     *
     * @param rcvOdrCompCd Receiving order company code
     * @param transmissionDt Transmission date
     * @param addOrChgTyp Add or change type
     * @return Delete count
     * @throws ApplicationException Business exception
     */
    public int deleteEdiOdrRtryBySuccessEdi(String rcvOdrCompCd, Date transmissionDt, String addOrChgTyp)
        throws ApplicationException;

    /**
     * Bulk registration to EDI orders
     * <br />EDI受注への一括登録を行います。
     *
     * @param domainList Create data domain
     * @throws ApplicationException Business exception
     */
    public void createEdiOdrByBulk(List<? extends B0100EdiRcvOdrDomain> domainList)
        throws ApplicationException;

    /**
     * Bulk update the results of the CIGMA side check to EDI orders
     * <br />CIGMA側チェックの結果をEDI受注に一括更新します。
     *
     * @param domainList Update domain data and criteria
     * @return Update count
     * @throws ApplicationException business exception
     */
    public int updateEdiOdrByCigmaSideCheckResults(final List<? extends B0100EdiRcvOdrDomain> domainList)
        throws ApplicationException;

    /**
     * Bulk update the results of the NEXUS side check to EDI orders
     * <br />NEXUS側チェックの結果をEDI受注に一括更新します。
     *
     * @param domainList update domain data and criteria
     * @return update count
     * @throws ApplicationException business exception
     */
    public int updateEdiOdrByNxsSideCheckResults(final List<? extends B0100EdiRcvOdrDomain> domainList)
        throws ApplicationException;

    /**
     * EDI受注エラーレポートのヘッダ単位を取得します。
     * 
     * <pre>
     * 指定された受注会社コードのEDI受注エラーレポートを下記の項目でグループ化し、その情報を取得します。
     * 
     *   - 得意先輸出入拠点コード
     *   - 情報発信日
     *   - 得意先コード
     *   - LEGACY送荷先
     *   - 製造部工場区分
     * </pre>
     * 
     * @param criteria 検索条件
     * @return EDI受注エラーレポートをグループ化した結果
     * @throws ApplicationException EDI受注エラーレポートが取得できなかった場合
     */
    public List<? extends TtEdiRcvOdrReportDomain> searchEdiRcvOdrReportHeader(TtEdiRcvOdrReportCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * The printer used as the output destination change of a [STEP3:error report output] EDI Receive Order Error Report is acquired.
     * <br />【STEP3:エラーレポート出力】EDI受注エラーレポートの出力先となるプリンタを取得します。
     * <pre>
     * A search of - printer information
     *       Using the following conditions, a pudding single use master, and a printer master are searched.
     *         When a - EDI-Receive-Order-Error-Report . PLANT CODE is not blank
     *             A - Printer-Purpose-Master . COMPANY CODE is equal to an EDI-Receive-Order-Error-Report . COMPANY CODE.
     *             A - Printer-Purpose-Master . PLANT CODE is equal to an EDI-Receive-Order-Error-Report . PLANT CODE.
     *             A - Printer-Purpose-Master . ORDER ERROR PRINTER FLAG is 'Y'.
     *
     *         When a - EDI-Receive-Order-Error-Report . PLANT CODE is blank
     *             A - Printer-Purpose-Master . ORDER ERROR DEFAULT PRITNTER FLAG is 'Y'.
     *
     * - Return of search results
     *       Search results (printer name) are returned by the list of String.
     * 
     * - プリンタ情報の検索
     *     以下の条件を使用して、プリン単用途原単位、プリンタ原単位を検索する
     *       - 製造部工場区分がブランクでない場合
     *         - プリンタ用途原単位.会社コードが指定された値と等しい
     *         - プリンタ用途原単位.製造部工場区分が指定された値と等しい
     *         - プリンタ用途原単位.受注エラー出力プリンタフラグが'Y'である
     *           
     *       - 製造部工場区分がブランクの場合
     *         - プリンタ用途原単位.会社コードが指定された値と等しい
     *         - プリンタ用途原単位.受注エラー出力デフォルトプリンタフラグが'Y'である
     *           
     * - 検索結果の返却
     *     検索結果(プリンタ名)をStringのリストで返す
     *     
     * </pre>
     *
     * @param rcvOdrCompCd The CD between bases of an ordering company<br />受注会社の拠点間コード
     * @param plntCd PLANT CODE<br />製造部工場区分
     * @return An applicable printer name<br />該当するプリンタ名
     * @throws ApplicationException When a printer is not able to be acquired<br />プリンタが取得できなかった場合
     */
    public List<String> searchPrinterForErrReport(String rcvOdrCompCd, String plntCd) throws ApplicationException;

    /**
     * The Export Receive Order applicable to the conditions [for the number reexamination of STEP4:orders received] is updated.
     * <br />【STEP4:受注数見直し用】条件に該当する輸出受注を更新します。
     * <pre>
     * In addition to the specified conditions, the following conditions are added:
     *     - ORDER-QUANTITY <> 0
     * 
     * 指定された条件に加えて、以下の条件が追加される：
     *   ・注文数量 <> 0
     * </pre>
     *
     * @param ttExpRcvOdr The contents of an update<br />更新内容
     * @param criteria Search condition<br />検索条件
     * @return Update number<br />更新件数
     * @throws ApplicationException When an Export Receive Order is not able to be updated<br />輸出受注が更新できなかった場合
     */
    public int updateTtExpRcvOdrForReviseOdrQty(TtExpRcvOdrDomain ttExpRcvOdr, TtExpRcvOdrCriteriaDomain criteria)
        throws ApplicationException;
}
