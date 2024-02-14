/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the criteria information of Empty RT materials (Contens of a box)
 * <br />返却推奨荷姿作成・再印刷・キャンセル画面の明細情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class WC001CriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    
    /**
     * SHIPPER CODE
     * <br />荷主コード
     */
    private String shipperCd;
    
    /**
     * SHIPPER NAME
     * <br />荷主名
     */
    private String shipperNm;
    
    /**
     * SHIP TO CODE
     * <br />送荷先コード
     */
    private String shipToCd;
    
    /**
     * SHIP TO NAME
     * <br />送荷先名
     */
    private String shipToNm;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;
    
    /**
     * PLANT CODE
     * <br />製造部工場区分
     */
    private String plntCd;
    
    /**
     * CONTAINER SORTING KEY
     * <br />コンテナ層別キー
     */
    private String containerSortingKey;
    
    /**
     * RETURN STYLE CODE
     * <br />返却荷姿コード
     */
    private String returnStyleCd;
    
    /**
     * NET WEIGHT
     * <br />ネット重量
     */
    private String netWeight;
    
    /**
     * GROSS WEIGHT
     * <br />グロス重量
     */
    private String grossWeight;
    
    /**
     * LENGTH
     * <br />縦
     */
    private String length;
    
    /**
     * WIDTH
     * <br />横
     */
    private String width;
    
    /**
     * HEIGHT
     * <br />高さ
     */
    private String height;
    
    /**
     * VOLUME
     * <br />容積
     */
    private String volume;
    
    /**
     * DUE DATE
     * <br />納期
     */
    private String dueDt;
    
    /**
     * PACKING WAREHOUSE COMPANY CODE
     * <br />梱包倉庫会社コード
     */
    private String packingWhCompCd;
    
    /**
     * PACKING WAREHOUSE CODE
     * <br />梱包倉庫コード
     */
    private String packingWhCd;
    
    /**
     * LOADING CODE
     * <br />荷積位置コード
     */
    private String loadingCd;
    
    /**
     * CUSTOM TIMING TYPE
     * <br />通関タイミング区分
     */
    private String customTimingTyp;
    
    /**
     * INVOICE CATEGORY
     * <br />請求分類
     */
    private String invoiceCtgry;
    
    /**
     * PRICE TERMS
     * <br />建値区分
     */
    private String priceTerms;
    
    /**
     * FREIGHT RESPONSIBLE CODE
     * <br />運賃支払いコード
     */
    private String freightResponsibleCd;
    
    /**
     * FROM MAIN MARK
     * <br />開始メインマーク
     */
    private String fromMainMark;
    
    /**
     * TO MAIN MARK
     * <br />終了メインマーク
     */
    private String toMainMark;
    
    /**
     * PALLET QTY
     * <br />パレタイズ数量
     */
    private String palletQty;
    
    /**
     * SHIPPER CODE
     * <br />荷主コード
     */
    private String shipperCdHidden;
    
    /**
     * LENGTH UNIT (LENGTH)
     * <br />長さ単位（長さ）
     */
    private String lengthUnitLength;
    
    /**
     * LENGTH UNIT (WIDTH)
     * <br />長さ単位（幅）
     */
    private String lengthUnitWidth;
    
    /**
     * LENGTH UNIT (HEIGHT)
     * <br />長さ単位（高さ）
     */
    private String lengthUnitHeight;
    
    /**
     * VOLUME UNIT
     * <br />容積単位
     */
    private String volumeUnit;
    
    /**
     * WEIGHT UNIT (N/W)
     * <br />重量単位（N/W）
     */
    private String weightUnitNw;
    
    /**
     * WEIGHT UNIT (G/W)
     * <br />重量単位（G/W）
     */
    private String weightUnitGw;
    
    /**
     * LENGTH UNIT
     * <br />長さ単位
     */
    private String lengthUnitHidden;
    
    /**
     * VOLUME UNIT
     * <br />容積単位
     */
    private String volumeUnitHidden;
    
    /**
     * WEIGHT UNIT
     * <br />重量単位
     */
    private String weightUnitHidden;
    
    /**
     * ACTION SELECT
     * <br />アクション選択
     */
    private String actionSelect;

    /**
     * Date format (for screen display)  
     * <br />日付フォーマット (画面表示用)
     */
    private String screenDateFormat;

    /**
     * SERVER ID
     * <br />サーバID
     */
    private String serverId;
    
    /**
     * List domain
     * <br />リストドメイン
     */
    private List<? extends WC001ListDomain> listDomainList;

    /**
     * COMPANY CODE
     * <br />会社コード
     */
    private String compCd;

    /**
     * VOLUME overflow flag
     * <br />容積桁あふれフラグ
     */
    private boolean volumeOverflow;

    /**
     * NET WEIGHT overflow flag
     * <br />ネット重量桁あふれフラグ
     */
    private boolean netWeightOverflow;

    /**
     * Pallet/Carton Type
     * <br />パレット・カートン区分
     * UT420 ADD
     */
    private String palletCartonTyp;

    /**
     * constructor.
     */
    public WC001CriteriaDomain() {

    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends WC001ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends WC001ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for shipperCd.
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for shipToCd.
     *
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * Setter method for shipToCd.
     *
     * @param shipToCd Set for shipToCd
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }

    /**
     * Getter method for trnsCd.
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * Setter method for trnsCd.
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * Getter method for plntCd.
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * Setter method for plntCd.
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * Getter method for containerSortingKey.
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * Setter method for containerSortingKey.
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * Getter method for returnStyleCd.
     *
     * @return the returnStyleCd
     */
    public String getReturnStyleCd() {
        return returnStyleCd;
    }

    /**
     * Setter method for returnStyleCd.
     *
     * @param returnStyleCd Set for returnStyleCd
     */
    public void setReturnStyleCd(String returnStyleCd) {
        this.returnStyleCd = returnStyleCd;
    }

    /**
     * Getter method for netWeight.
     *
     * @return the netWeight
     */
    public String getNetWeight() {
        return netWeight;
    }

    /**
     * Setter method for netWeight.
     *
     * @param netWeight Set for netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * Getter method for grossWeight.
     *
     * @return the grossWeight
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /**
     * Setter method for grossWeight.
     *
     * @param grossWeight Set for grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * Getter method for length.
     *
     * @return the length
     */
    public String getLength() {
        return length;
    }

    /**
     * Setter method for length.
     *
     * @param length Set for length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     * Getter method for width.
     *
     * @return the width
     */
    public String getWidth() {
        return width;
    }

    /**
     * Setter method for width.
     *
     * @param width Set for width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * Getter method for height.
     *
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * Setter method for height.
     *
     * @param height Set for height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * Getter method for volume.
     *
     * @return the volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Setter method for volume.
     *
     * @param volume Set for volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * Getter method for dueDt.
     *
     * @return the dueDt
     */
    public String getDueDt() {
        return dueDt;
    }

    /**
     * Setter method for dueDt.
     *
     * @param dueDt Set for dueDt
     */
    public void setDueDt(String dueDt) {
        this.dueDt = dueDt;
    }

    /**
     * Getter method for packingWhCompCd.
     *
     * @return the packingWhCompCd
     */
    public String getPackingWhCompCd() {
        return packingWhCompCd;
    }

    /**
     * Setter method for packingWhCompCd.
     *
     * @param packingWhCompCd Set for packingWhCompCd
     */
    public void setPackingWhCompCd(String packingWhCompCd) {
        this.packingWhCompCd = packingWhCompCd;
    }

    /**
     * Getter method for packingWhCd.
     *
     * @return the packingWhCd
     */
    public String getPackingWhCd() {
        return packingWhCd;
    }

    /**
     * Setter method for packingWhCd.
     *
     * @param packingWhCd Set for packingWhCd
     */
    public void setPackingWhCd(String packingWhCd) {
        this.packingWhCd = packingWhCd;
    }

    /**
     * Getter method for loadingCd.
     *
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * Setter method for loadingCd.
     *
     * @param loadingCd Set for loadingCd
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * Getter method for customTimingTyp.
     *
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * Setter method for customTimingTyp.
     *
     * @param customTimingTyp Set for customTimingTyp
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
    }

    /**
     * Getter method for invoiceCtgry.
     *
     * @return the invoiceCtgry
     */
    public String getInvoiceCtgry() {
        return invoiceCtgry;
    }

    /**
     * Setter method for invoiceCtgry.
     *
     * @param invoiceCtgry Set for invoiceCtgry
     */
    public void setInvoiceCtgry(String invoiceCtgry) {
        this.invoiceCtgry = invoiceCtgry;
    }

    /**
     * Getter method for priceTerms.
     *
     * @return the priceTerms
     */
    public String getPriceTerms() {
        return priceTerms;
    }

    /**
     * Setter method for priceTerms.
     *
     * @param priceTerms Set for priceTerms
     */
    public void setPriceTerms(String priceTerms) {
        this.priceTerms = priceTerms;
    }

    /**
     * Getter method for freightResponsibleCd.
     *
     * @return the freightResponsibleCd
     */
    public String getFreightResponsibleCd() {
        return freightResponsibleCd;
    }

    /**
     * Setter method for freightResponsibleCd.
     *
     * @param freightResponsibleCd Set for freightResponsibleCd
     */
    public void setFreightResponsibleCd(String freightResponsibleCd) {
        this.freightResponsibleCd = freightResponsibleCd;
    }

    /**
     * Getter method for fromMainMark.
     *
     * @return the fromMainMark
     */
    public String getFromMainMark() {
        return fromMainMark;
    }

    /**
     * Setter method for fromMainMark.
     *
     * @param fromMainMark Set for fromMainMark
     */
    public void setFromMainMark(String fromMainMark) {
        this.fromMainMark = fromMainMark;
    }

    /**
     * Getter method for toMainMark.
     *
     * @return the toMainMark
     */
    public String getToMainMark() {
        return toMainMark;
    }

    /**
     * Setter method for toMainMark.
     *
     * @param toMainMark Set for toMainMark
     */
    public void setToMainMark(String toMainMark) {
        this.toMainMark = toMainMark;
    }

    /**
     * Getter method for palletQty.
     *
     * @return the palletQty
     */
    public String getPalletQty() {
        return palletQty;
    }

    /**
     * Setter method for palletQty.
     *
     * @param palletQty Set for palletQty
     */
    public void setPalletQty(String palletQty) {
        this.palletQty = palletQty;
    }

    /**
     * Getter method for shipperCdHidden.
     *
     * @return the shipperCdHidden
     */
    public String getShipperCdHidden() {
        return shipperCdHidden;
    }

    /**
     * Setter method for shipperCdHidden.
     *
     * @param shipperCdHidden Set for shipperCdHidden
     */
    public void setShipperCdHidden(String shipperCdHidden) {
        this.shipperCdHidden = shipperCdHidden;
    }
    /**
     * Getter method for lengthUnitLength.
     *
     * @return the lengthUnitLength
     */
    public String getLengthUnitLength() {
        return lengthUnitLength;
    }

    /**
     * Setter method for lengthUnitLength.
     *
     * @param lengthUnitLength Set for lengthUnitLength
     */
    public void setLengthUnitLength(String lengthUnitLength) {
        this.lengthUnitLength = lengthUnitLength;
    }

    /**
     * Getter method for lengthUnitWidth.
     *
     * @return the lengthUnitWidth
     */
    public String getLengthUnitWidth() {
        return lengthUnitWidth;
    }

    /**
     * Setter method for lengthUnitWidth.
     *
     * @param lengthUnitWidth Set for lengthUnitWidth
     */
    public void setLengthUnitWidth(String lengthUnitWidth) {
        this.lengthUnitWidth = lengthUnitWidth;
    }

    /**
     * Getter method for lengthUnitHeight.
     *
     * @return the lengthUnitHeight
     */
    public String getLengthUnitHeight() {
        return lengthUnitHeight;
    }

    /**
     * Setter method for lengthUnitHeight.
     *
     * @param lengthUnitHeight Set for lengthUnitHeight
     */
    public void setLengthUnitHeight(String lengthUnitHeight) {
        this.lengthUnitHeight = lengthUnitHeight;
    }

    /**
     * Getter method for volumeUnit.
     *
     * @return the volumeUnit
     */
    public String getVolumeUnit() {
        return volumeUnit;
    }

    /**
     * Setter method for volumeUnit.
     *
     * @param volumeUnit Set for volumeUnit
     */
    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    /**
     * Getter method for weightUnitNw.
     *
     * @return the weightUnitNw
     */
    public String getWeightUnitNw() {
        return weightUnitNw;
    }

    /**
     * Setter method for weightUnitNw.
     *
     * @param weightUnitNw Set for weightUnitNw
     */
    public void setWeightUnitNw(String weightUnitNw) {
        this.weightUnitNw = weightUnitNw;
    }

    /**
     * Getter method for weightUnitGw.
     *
     * @return the weightUnitGw
     */
    public String getWeightUnitGw() {
        return weightUnitGw;
    }

    /**
     * Setter method for weightUnitGw.
     *
     * @param weightUnitGw Set for weightUnitGw
     */
    public void setWeightUnitGw(String weightUnitGw) {
        this.weightUnitGw = weightUnitGw;
    }

    /**
     * Getter method for lengthUnitHidden.
     *
     * @return the lengthUnitHidden
     */
    public String getLengthUnitHidden() {
        return lengthUnitHidden;
    }

    /**
     * Setter method for lengthUnitHidden.
     *
     * @param lengthUnitHidden Set for lengthUnitHidden
     */
    public void setLengthUnitHidden(String lengthUnitHidden) {
        this.lengthUnitHidden = lengthUnitHidden;
    }

    /**
     * Getter method for volumeUnitHidden.
     *
     * @return the volumeUnitHidden
     */
    public String getVolumeUnitHidden() {
        return volumeUnitHidden;
    }

    /**
     * Setter method for volumeUnitHidden.
     *
     * @param volumeUnitHidden Set for volumeUnitHidden
     */
    public void setVolumeUnitHidden(String volumeUnitHidden) {
        this.volumeUnitHidden = volumeUnitHidden;
    }

    /**
     * Getter method for weightUnitHidden.
     *
     * @return the weightUnitHidden
     */
    public String getWeightUnitHidden() {
        return weightUnitHidden;
    }

    /**
     * Setter method for weightUnitHidden.
     *
     * @param weightUnitHidden Set for weightUnitHidden
     */
    public void setWeightUnitHidden(String weightUnitHidden) {
        this.weightUnitHidden = weightUnitHidden;
    }

    /**
     * Getter method for actionSelect.
     *
     * @return the actionSelect
     */
    public String getActionSelect() {
        return actionSelect;
    }

    /**
     * Setter method for actionSelect.
     *
     * @param actionSelect Set for actionSelect
     */
    public void setActionSelect(String actionSelect) {
        this.actionSelect = actionSelect;
    }

    /**
     * Getter method for shipperNm.
     *
     * @return the shipperNm
     */
    public String getShipperNm() {
        return shipperNm;
    }

    /**
     * Setter method for shipperNm.
     *
     * @param shipperNm Set for shipperNm
     */
    public void setShipperNm(String shipperNm) {
        this.shipperNm = shipperNm;
    }

    /**
     * Getter method for shipToNm.
     *
     * @return the shipToNm
     */
    public String getShipToNm() {
        return shipToNm;
    }

    /**
     * Setter method for shipToNm.
     *
     * @param shipToNm Set for shipToNm
     */
    public void setShipToNm(String shipToNm) {
        this.shipToNm = shipToNm;
    }

    /**
     * Getter method for screenDateFormat.
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method for screenDateFormat.
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * Getter method for serverId.
     *
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Setter method for serverId.
     *
     * @param serverId Set for serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * Getter method for compCd.
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * Setter method for compCd.
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * Getter method for volumeOverflow.
     *
     * @return the volumeOverflow
     */
    public boolean isVolumeOverflow() {
        return volumeOverflow;
    }

    /**
     * Setter method for volumeOverflow.
     *
     * @param volumeOverflow Set for volumeOverflow
     */
    public void setVolumeOverflow(boolean volumeOverflow) {
        this.volumeOverflow = volumeOverflow;
    }

    /**
     * Getter method for netWeightOverflow.
     *
     * @return the netWeightOverflow
     */
    public boolean isNetWeightOverflow() {
        return netWeightOverflow;
    }

    /**
     * Setter method for netWeightOverflow.
     *
     * @param netWeightOverflow Set for netWeightOverflow
     */
    public void setNetWeightOverflow(boolean netWeightOverflow) {
        this.netWeightOverflow = netWeightOverflow;
    }

    /**
     * Getter method for listDomainList.
     *
     * @param index インデックス
     * @return Listドメイン
     */
    public WC001ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<WC001ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new WC001ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter method for listDomainList.
     *
     * @param index インデックス
     * @param listDomain Listドメイン
     */
    public void setListDomainList(int index, WC001ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<WC001ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new WC001ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     *   {@link #listDomainList} is returned. (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> WC001ListDomain
     * @return  {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }

    /**
     * Getter method for palletCartonTyp.
     *
     * @return the palletCartonTyp
     */
    public String getPalletCartonTyp() {
        return palletCartonTyp;
    }

    /**
     * Setter method for palletCartonTyp.
     *
     * @param palletCartonTyp Set for palletCartonTyp
     */
    public void setPalletCartonTyp(String palletCartonTyp) {
        this.palletCartonTyp = palletCartonTyp;
    }
}
