/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/01/31
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws0501ResultDomain;

/**
 * <p>
 * The resource interface class of Ws0501.<BR>
 * Ws0501のリソースインターフェースクラスです。
 * </p>
 *
 * @version 1.00
 */
@Path("ws0501")
public interface Ws0501Resource {

    /**
     * <p>
     * Login authentication, BHT module version check, BHT and lock the target message retrieval.<BR>
     * ログイン認証、BHTモジュールバージョンチェック、およびBHTロック対象メッセージ取得の各処理を実施します。
     * </p>
     *
     * @param dscId
     *            DSC-ID of BHT user   (BHT利用ユーザのDSC-ID)
     * @param pinCode
     *            Pin code   (PINコード)
     * @param cntryCd
     *            Country code   (国コード)
     * @param timezoneCode
     *            Timezone code   (タイムゾーンコード)
     * @param deviceTypId
     *            Device type id   (機種タイプID)
     * @param mainExeVer
     *            Main exe version   (メインexeバージョン)
     * @param pltzDllVer
     *            Palletize dll version   (パレタイズdllバージョン)
     * @param carryIODllVer
     *            Carry out/in dll version   (搬出入dllバージョン)
     * @param shippingDllVer
     *            Staging/Shipping dll version   (出荷dllバージョン)
     * @param settingsDllVer
     *            Settings dll version   (管理dllバージョン)
     * @param commonDllVer
     *            Common dll version   (共通dllバージョン)
     * @return User authentication result   (ユーザ認証結果)
     * @throws AiwsApplicationException
     *             Check the parameter input error   (パラメータ入力チェックエラー)
     */
    @GET
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws0501ResultDomain getLoginInformation(@HeaderParam("X-DC-DSCID")
        String dscId, @QueryParam("password")
        String pinCode, @QueryParam("cntryCd")
        String cntryCd, @QueryParam("timezoneId")
        String timezoneCode, @QueryParam("deviceTypId")
        String deviceTypId, @QueryParam("mainExeVer")
        String mainExeVer, @QueryParam("pltzDllVer")
        String pltzDllVer, @QueryParam("carryIODllVer")
        String carryIODllVer, @QueryParam("shippingDllVer")
        String shippingDllVer, @QueryParam("settingsDllVer")
        String settingsDllVer, @QueryParam("commonDllVer")
        String commonDllVer) throws AiwsApplicationException;
}
