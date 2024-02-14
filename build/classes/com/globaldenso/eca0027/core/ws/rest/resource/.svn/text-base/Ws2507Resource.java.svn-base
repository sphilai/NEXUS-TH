package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2507ResultDomain;

/**
 * 
 * Resource implementation interface for the ws2507.
 * <br />Ws2507のリソース・インタフェースです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12091 $
 */
@Path("ws2507")
public interface Ws2507Resource {

    /**
     * <pre>
     * (1) Get Printing info  by HTTP Request parameter.
     * 
     * for Instruction Palletize (*1)
     * (2) Get transaction target Palletize Instr, for Print CML.
     * (3) Get Print necessary Items are CML info, Printer info, USER info and # of print sheets. 
     * (4) Change state of Printed Palletize Instruction.
     * (5) Create PDF of "CML info" or "CML error report" file by above #3 items.
     *   If does not create date on error report, then Create PDF of CML by target Palletize.
     *   If had create date on error report, then Create PDF of CML error report by target Palletize.
     * (6) Print to above #5 PDF file to above #3 printer.
     * 
     * for Non instruction Palletize(*2)
     * (2) Get Print necessary Items are Printer info and # of print sheets.
     * (3) Create PDF file of CML error report by # of MAIN MARK from parameter.
     *   Create PDF file of CML by # of MAIN MARK from parameter.
     *   If there is set to "date of create" of error report, , Create PDF file of CML error report
     * (4) Print to above #3 PDF file to above #2 printer.
     * 
     *  (*1) Instructed(=Pull) Palletizing If the Palletize Instr. No, is specified.
     *       Non instruction (=Push) palletize If the Palletize Instr. No, is not specified.  
     * </pre>
     * <pre>
     * (1) HTTPリクエストのパラメタから、印刷情報を取得する。 
     * 
     * 【指示パレタイズの場合】(*1)
     * (2) CMLを印刷する場合、更新対象の梱包指示情報を取得する。
     * (3) 印刷時に必要な情報(CML情報、プリンタ情報、ユーザ情報、印刷枚数)を取得する。
     * (4) 梱包指示情報を印刷済みの状態に更新する。
     * (5) (3)で取得したCML情報またはCMLエラーレポートのPDFを作成する。
     *  ・エラーレポート作成日時に設定がない場合、対象の梱包指示で作成したCMLのPDFを全て作成する。
     *  ・エラーレポート作成日時に設定がある場合、CMLエラーレポートのPDFを作成する。
     * (6) (5)で作成したPDFファイルを(3)で取得したプリンタに出力する。
     * 
     * 【成行パレタイズの場合】(*1)
     * (2) 印刷時に必要な情報(プリンタ情報、印刷枚数)を取得する。
     * (3) ケースマークラベル(件数分)、CMLエラーレポートのPDFを作成する。
     *  ・パラメタで受け取ったメインマークの件数分のCMLのPDFを全て作成する。
     *  ・エラーレポート作成日時に設定がある場合、CMLエラーレポートのPDFを作成する。
     * (4) (3)で作成したPDFファイルを(2)で取得したプリンタに出力する。
     * 
     * (*1) パラメタ.梱包指示Noに設定がある場合は指示パレタイズ、設定がない場合は成行パレタイズと判断する。 
     * </pre>
     *
     * @param dscId DSC-ID<br />DSC-ID
     * @param compCd inter-DENSO COMPANY CD<br />拠点間会社コード
     * @param printerId Prnter ID<br />プリンタID
     * @param cmlPrintNum CML print num<br />CML印刷枚数 UT300 ADD
     * @param pltzInstrNo Packaging Instruction number<br />梱包指示No
     * @param mainMark Main Mark(s)<br />メインマーク(複数件)
     * @param errCreateTimestamp date of create of error report<br />エラーレポート作成日時
     * @param screenId SCREEN ID<br />画面ID
     * @return Result domain <br />結果ドメイン
     * @throws AiwsApplicationException In the case of BHT data error.<br />入力値に不備がある場合
     */
    @PUT
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws2507ResultDomain printCml(
        @HeaderParam("X-DC-DSCID") String dscId, 
        @FormParam("compCd") String compCd, 
        @FormParam("printerId") String printerId,
        @FormParam("cmlPrintNum") String cmlPrintNum,
        @FormParam("pltzInstrNo") String pltzInstrNo,
        @FormParam("mainMark") String mainMark,
        @FormParam("errCreateTimestamp") String errCreateTimestamp,
        @FormParam("screenId") String screenId) throws AiwsApplicationException;
    
    
    
}

    