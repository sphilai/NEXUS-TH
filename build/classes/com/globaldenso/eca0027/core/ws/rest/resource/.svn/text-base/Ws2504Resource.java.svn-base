/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2504ResultDomain;

/**
 * Resource implementation interface for the ws2504.
 * <br />ws2504のリソースインタフェースです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
@Path("ws2504")
public interface Ws2504Resource {

    /**
     * <pre>
     * (1) Get Register data from parameter.
     * (2) Register Palletize of E-RT.
     * (3) Register Palletize Item of E-RT.
     * (4) Return the MAIN MARK number after Register.
     * </pre>
     * <pre>
     * (1) パラメタから、登録情報を取得する。
     * (2) E-RTのパレタイズ情報を登録する。
     * (3) E-RTのパレタイズ対象品情報を登録する。
     * (4) 登録時に採番したメインマークを返す
     * </pre>
     * 
     * @param dscId DSC-ID<br />DSC-ID
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @param shipperCd Shipper CD<br />荷主コード
     * @param shipToCd SHIP TO CODE<br />送荷先コード
     * @param loadingCd L/D CD<br />荷積位置コード
     * @param trnsCd TRANSPORT CODE<br />輸送手段コード
     * @param payTerms PAYMENT TERMS<br />支払条件
     * @param plntCd Factory code<br />工場コード
     * @param whCompCd W/H Company CD (between bases)<br />倉庫会社コード(拠点間)
     * @param whCd W/H CD (between bases)<br />倉庫コード(拠点間)
     * @param priceTerms PRICE TERMS<br />建値区分
     * @param returnStyleCd Recommendation packing-style CD<br />推奨荷姿コード
     * @param pkgTyp package type<br />パレット/カートン区分
     * @param cmlCreateQty The number of CML creates<br />CML作成数
     * @param weightUnit WEIGHT UNIT<br />重量単位
     * @param grossWeight GROSS WEIGHT<br />グロス重量
     * @param lengthUnit LENGTH UNIT<br />長さ単位
     * @param length LENGTH<br />縦
     * @param width WIDTH<br />横
     * @param height HEIGHT<br />高さ
     * @param volumeUnit Unit of Vol.<br />容積単位
     * @param volume VOLUME<br />容積
     * @param pkgItemNo PACKAGE ITEM NO (it sets up by the number of cases acquired from QR Code)<br />包装材品番(QRコードから取得した件数分設定する)
     * @param pkgItemQty Packing-material QUANTITY (it sets up by the number of cases acquired from QR Code)<br />包装材数量(QRコードから取得した件数分設定する)
     * @param screenId SCREEN ID<br />画面ID
     * @return Result domain<br />結果ドメイン
     * @throws AiwsApplicationException In the case of BHT data error.<br />入力値に不備がある場合
     */
    @POST
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws2504ResultDomain createErtPltz(
        @HeaderParam("X-DC-DSCID") String dscId ,
        @HeaderParam("X-DC-LOCALE") String languageCd ,
        @FormParam("shipperCd")  String shipperCd ,
        @FormParam("shipToCd")  String shipToCd ,
        @FormParam("loadingCd")  String loadingCd ,
        @FormParam("trnsCd")  String trnsCd ,
        @FormParam("payTerms")  String payTerms ,
        @FormParam("plntCd")  String plntCd ,
        @FormParam("whCompCd")  String whCompCd ,
        @FormParam("whCd")  String whCd ,
        @FormParam("priceTerms")  String priceTerms ,
        @FormParam("returnStyleCd")  String returnStyleCd ,
        @FormParam("pkgTyp")  String pkgTyp ,
        @FormParam("cmlCreateQty")  String cmlCreateQty ,
        @FormParam("weightUnit")  String weightUnit ,
        @FormParam("grossWeight")  String grossWeight ,
        @FormParam("lengthUnit")  String lengthUnit ,
        @FormParam("length")  String length ,
        @FormParam("width")  String width ,
        @FormParam("height")  String height ,
        @FormParam("volumeUnit")  String volumeUnit ,
        @FormParam("volume")  String volume ,
        @FormParam("pkgItemNo")  String pkgItemNo ,
        @FormParam("pkgItemQty")  String pkgItemQty,
        @FormParam("screenId") String screenId

    ) throws AiwsApplicationException;

}