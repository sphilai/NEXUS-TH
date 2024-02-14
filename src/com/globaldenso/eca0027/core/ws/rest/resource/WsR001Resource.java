package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.WsR001ResultDomain;

/**
 * Resource implementation interface for the wsR001.
 * <br />WsR001のリソース・インタフェースです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 8952 $
 */
@Path("wsr001")
public interface WsR001Resource {

    /**
     * <pre>
     * (1) Store Case Mark info to temporary table from parameter of request. 
     * (2) repeat the following process in the unit of case mark.
     * (3) join the master data after perform Palletize check.
     * (4) Print error report, if Palletize check error. 
     * (5) Register Palletize info and perform Case Mark print program.
     * </pre>
     * <pre>
     * (1) リクエストパラメータで受け取ったケースマークの情報を一時テーブルに保管する。
     * (2) 保管した情報には複数ケースマークの情報を含むため、ケースマーク単位で以下の処理を繰り返す。
     * (3) 原単位の情報を結合し、パレタイズチェックを行う。
     * (4) パレタイズチェックでエラー検出の場合、エラーレポート出力プログラムを呼び出し、エラーレポートを印刷する。
     * (5) パレタイズチェックで正常の場合、パレタイズ情報を登録後、ケースマーク帳票出力プログラムを呼び出し、ケースマークを印刷する。
     * </pre>
     *
     * @param wsR001Criteria parameter domain <br />パラメータドメイン
     * @return result domain <br />結果用ドメイン
     * @throws AiwsApplicationException In the case of BHT data error.<br />入力値に不備がある場合
     */
    @PUT
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public abstract WsR001ResultDomain migrationCmlPrint(
        @FormParam("wsR001Criteria") String wsR001Criteria) throws AiwsApplicationException;
    

}