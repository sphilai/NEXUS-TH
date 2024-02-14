package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2509ResultDomain;

/**
 * Resource implementation interface for the ws2509.
 * <br />Ws2509のリソース・インタフェースです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7151 $
 */
@Path("ws2509")
public interface Ws2509Resource {

    /**
     * <pre>
     * (1) Get Print info from the parameter of  HTTP request.
     * (2) Get printer info from printer info and User Info.
     * (3) Create MIX-TAG or MIX-TAG error report PDF file.
     * (4) Print PDF file to printer. 
     * </pre>
     * <pre>
     * (1) HTTPリクエストのパラメタから、印刷情報を取得する。
     * (2) 印刷時に必要な情報(プリンタ情報、ユーザ情報)を取得する。
     * (3) MixタグまたはMixタグエラーレポートのPDFを作成する。
     * (4) (3)で作成したPDFファイルを(2)で取得したプリンタに出力する。
     * </pre>
     *
     * @param dscId login ID <br />ログインID
     * @param compCd COMPANY CD of Printer location. <br />プリンタ保有会社コード
     * @param printerId Printer ID <br />プリンタID
     * @param mixTagNo MIX-TAG <br />MIXタグ
     * @param errCreateTimestamp date of create of error report<br />エラーレポート作成日時
     * @param screenId SCREEN ID<br />画面ID
     * @return Result domain <br />結果ドメイン
     * @throws AiwsApplicationException In the case of BHT data error.<br />入力値に不備がある場合
     */
    @PUT
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public abstract Ws2509ResultDomain printMixTag(
        @HeaderParam("X-DC-DSCID")String dscId,
        @FormParam("compCd") String compCd, 
        @FormParam("printerId") String printerId,
        @FormParam("mixTagNo") String mixTagNo,
        @FormParam("errCreateTimestamp") String errCreateTimestamp,
        @FormParam("screenId") String screenId) throws AiwsApplicationException;

}