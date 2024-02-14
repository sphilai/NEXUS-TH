package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2512ResultDomain;

/**
 * Resource implementation interface for the ws2512.
 * <br />Ws2512のリソース・インタフェースです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12091 $
 */
@Path("ws2512")
public interface Ws2512Resource {

    /**
     * <pre>
     * (1) Get Print info from the parameter of  HTTP request.
     * (2) Get printer info from printer info and User Info and number of sheet.
     * (3) Create Case Mark Label PDF file.
     * (4) Print PDF file to printer. 
     * </pre>
     * <pre>
     * (1) HTTPリクエストのパラメタから、印刷情報を取得する。
     * (2) 印刷時に必要な情報(プリンタ情報、ユーザ情報、印刷枚数)を取得する。
     * (3) ケースマークラベル(件数分)のPDFを作成する。
     * (4) (3)で作成したPDFファイルを(2)で取得したプリンタに出力する。
     * </pre>
     *
     * @param compCd EIS COMPANY CODE<br />拠点間会社コード
     * @param printerId Printer ID<br />プリンタID
     * @param cmlPrintNum CML print num<br />CML印刷枚数 UT300 ADD
     * @param mainMark MAIN MARK<br />メインマーク(複数件)
     * @param screenId SCREEN ID<br />画面ID
     * @return Result domain<br />結果用ドメイン
     * @throws AiwsApplicationException In the case of BHT data error.<br />入力値に不備がある場合
     */
    @PUT
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public abstract Ws2512ResultDomain printErt(
        @FormParam("compCd") String compCd, 
        @FormParam("printerId") String printerId,
        @FormParam("cmlPrintNum") String cmlPrintNum,
        @FormParam("mainMark") String mainMark,
        @FormParam("screenId") String screenId) throws AiwsApplicationException;
    

}