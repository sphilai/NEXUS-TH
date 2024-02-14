package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2511ResultDomain;

/**
 * Resource implementation interface for the ws2511.
 * <br />Ws2511のリソース・インタフェースです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7151 $
 */
@Path("ws2511")
public interface Ws2511Resource {

    /**
     * <pre>
     * (1) Get Print info from the parameter of HTTP request.
     * (2) Get Printer info.
     * (3) Create X-TAG PDF file.
     * (4) print PDF file to printer.
     * </pre>
     * <pre>
     * (1) HTTPリクエストのパラメタから、印刷情報を取得する。
     * (2) プリンタ情報を取得する。
     * (3) まとめCMLのPDFを作成する。
     * (4) (3)で作成したPDFファイルを(2)で取得したプリンタに出力する。
     * </pre>
     *
     * @param dscId login ID <br />ログインID
     * @param compCd EIS COMPANY CD <br />拠点間会社コード
     * @param printerId Printer ID<br />プリンタID
     * @param xmainMark X MAIN MARK<br />まとめメインマーク
     * @param screenId SCREEN ID<br />画面ID
     * @return Result domain<br />結果ドメイン
     * @throws AiwsApplicationException In the case of BHT data error.<br />入力値に不備がある場合
     */
    @PUT
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public abstract Ws2511ResultDomain printXtag(
        @HeaderParam("X-DC-DSCID")String dscId,
        @FormParam("compCd") String compCd, 
        @FormParam("printerId") String printerId,
        @FormParam("xMainMark") String xmainMark,
        @FormParam("screenId") String screenId) throws AiwsApplicationException;

}