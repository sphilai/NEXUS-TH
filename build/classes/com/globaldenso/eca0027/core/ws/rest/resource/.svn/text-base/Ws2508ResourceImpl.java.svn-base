/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BHT_SCREEN_ID_DEFAULT;
import static java.lang.Math.max;
import static org.apache.commons.lang.ArrayUtils.EMPTY_STRING_ARRAY;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2508ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2508CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2508ItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2508MixTagRootCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2508PkgItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2508ProductivityDataInfoCriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * Resource implementation class for the ws2508.
 * This is a resource implement class of ws2508.
 * <br />ws2508のリソース実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7874 $
 */
public class Ws2508ResourceImpl extends AbstractResourceImpl implements Ws2508Resource  {

    /**
     * Update Facade service
     * <br />更新Facadeサービス
     */
    private TransactFacadeService<Ws2508ResultDomain, Ws2508CriteriaDomain> ws2508CreateFacadeService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2508ResourceImpl() {

    }

    /**
     * Getter method for ws2508CreateFacadeService.
     *
     * @return the ws2508CreateFacadeService
     */
    public TransactFacadeService<Ws2508ResultDomain, Ws2508CriteriaDomain> getWs2508CreateFacadeService() {
        return ws2508CreateFacadeService;
    }

    /**
     * Setter method for ws2508CreateFacadeService.
     *
     * @param ws2508CreateFacadeService Set for ws2508CreateFacadeService
     */
    public void setWs2508CreateFacadeService(
        TransactFacadeService<Ws2508ResultDomain, Ws2508CriteriaDomain> ws2508CreateFacadeService) {
        this.ws2508CreateFacadeService = ws2508CreateFacadeService;
    }

    /**
     * {@inheritDoc}.
     *
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws2508Resource#createMixTag(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)
     */
    public Ws2508ResultDomain createMixTag(
            String decId,
            String pltzInstrNo,
            String shipperCd,
            String customerCd,
            String lgcyShipTo,
            String trnsCd,
            String plntCd,
            String lgcyWhCd,
            String whComCd,
            String whCd,
            String whFlg,
            String boxNo,
            String itemNo,
            String pkgCd,
            String indusTypCd,
            String kanbanTyp,
            String tagSeq,
            String lotSize,
            String customerItemNo,
            String customerTagSeq,
            String pkgItemNo,
            String pkgItemQty,
            String workTimeStrt,
            String workTimeEnd,
            String errScreenId,
            String errMsgId,
            String bhtUnlockAuthFlg,
            String errWorkTimeStrt,
            String errWorkTimeEnd,
            String screenId
    ) {

        // Generation and a setting of Criteria Domain
        // Criteria Domainの生成と設定
        Ws2508MixTagRootCriteriaDomain xmlRootCriteriaDomain = new Ws2508MixTagRootCriteriaDomain();
        // mixTagRootCriteriaDomain = XmlUtil.unmarshal(Ws2508MixTagRootCriteriaDomain.class, ws2508Criteria);

        xmlRootCriteriaDomain.setPltzInstrNo(pltzInstrNo);
        xmlRootCriteriaDomain.setShipperCd(shipperCd);
        xmlRootCriteriaDomain.setCustomerCd(customerCd);
        xmlRootCriteriaDomain.setLgcyShipTo(lgcyShipTo);
        xmlRootCriteriaDomain.setTrnsCd(trnsCd);
        xmlRootCriteriaDomain.setPlntCd(plntCd);
        xmlRootCriteriaDomain.setLgcyWhCd(lgcyWhCd);
        xmlRootCriteriaDomain.setWhCompCd(whComCd);
        xmlRootCriteriaDomain.setWhCd(whCd);
        xmlRootCriteriaDomain.setNxsStockFlg(whFlg);
        xmlRootCriteriaDomain.setBoxNo(boxNo);

        String[] itemNos = csvToArray(itemNo);
        String[] pkgCds = csvToArray(pkgCd);
        String[] indusTypCds = csvToArray(indusTypCd);
        String[] kanbanTyps = csvToArray(kanbanTyp);
        String[] tagSeqNos = csvToArray(tagSeq);
        String[] lotSizes = csvToArray(lotSize);
        String[] customerItemNos = csvToArray(customerItemNo);
        String[] customeTagSeqNos = csvToArray(customerTagSeq);
        List<Ws2508ItemNoCriteriaDomain> itemNoCriteriaList = new ArrayList<Ws2508ItemNoCriteriaDomain>();
        for (int i = 0; i < itemNos.length; i++) {
            Ws2508ItemNoCriteriaDomain criteria = new Ws2508ItemNoCriteriaDomain();
            criteria.setItemNo(itemNos[i]);
            criteria.setPkgCd(getAt(pkgCds, i));
            criteria.setIndusTypCd(getAt(indusTypCds, i));
            criteria.setKanbanTyp(getAt(kanbanTyps, i));
            criteria.setTagSeqNo(getAt(tagSeqNos, i));
            criteria.setKanbanQty(getAt(lotSizes, i));
            criteria.setCustomerItemNo(getAt(customerItemNos, i));
            criteria.setCustomerTagSeqNo(getAt(customeTagSeqNos, i));
            itemNoCriteriaList.add(criteria);
        }
        xmlRootCriteriaDomain.setItemNoCriteriaList(itemNoCriteriaList);

        String[] pkgItemNos = csvToArray(pkgItemNo);
        String[] pkgItemQtys = csvToArray(pkgItemQty);
        List<Ws2508PkgItemNoCriteriaDomain> pkgItemNoCriteriaList = new ArrayList<Ws2508PkgItemNoCriteriaDomain>();
        for (int i = 0; i < pkgItemNos.length; i++) {
            Ws2508PkgItemNoCriteriaDomain criteria = new Ws2508PkgItemNoCriteriaDomain();
            criteria.setPkgItemNo(pkgItemNos[i]);
            criteria.setPkgQty(getAt(pkgItemQtys, i));
            pkgItemNoCriteriaList.add(criteria);
        }
        xmlRootCriteriaDomain.setPkgItemNoCriteriaList(pkgItemNoCriteriaList);
        xmlRootCriteriaDomain.setBusinessStartTime(workTimeStrt);
        xmlRootCriteriaDomain.setBusinessEndTime(workTimeEnd);
        xmlRootCriteriaDomain.setProductivityDataInfoCriteriaList(createProductivityDataInfoList(errScreenId, errMsgId, bhtUnlockAuthFlg, errWorkTimeStrt, errWorkTimeEnd));

        Ws2508CriteriaDomain criteriaDomain = new Ws2508CriteriaDomain();
        criteriaDomain.setMixTagRoot(xmlRootCriteriaDomain);

        criteriaDomain.setLoginUserDscId(decId);
        criteriaDomain.setLanguageCd(getLanguageCd());
        criteriaDomain.setLocale(new Locale(getLanguageCd()));
        if (!CheckUtil.isBlankOrNull(screenId)) {
            criteriaDomain.setScreenId(screenId);
        } else {
            criteriaDomain.setScreenId(BHT_SCREEN_ID_DEFAULT);
        }

        xmlRootCriteriaDomain.setLoginUserDscId(decId);
        xmlRootCriteriaDomain.setLanguageCd(getLanguageCd());
        xmlRootCriteriaDomain.setLocale(new Locale(getLanguageCd()));

        try {
            // Execution of FacadeService
            // FacadeServiceの実行
            return this.ws2508CreateFacadeService.transact(criteriaDomain);
        } catch (ApplicationException e) {
            return processApplicationException(e, Ws2508ResultDomain.class);
        } 
    }

    /**
     * CSV String to String array
     * <br />カンマ区切りの文字列を文字列配列に変換する。
     *
     * <pre>
     * Split the argument by "," and return the string array. (If the argument is null, replace it to empty string before split.)
     * 文字列をカンマで区切って配列にして返す。(引数がnullの場合は、空文字に置換えてから処理する。)
     * </pre>
     *
     * @param csvSring CSV string<br />カンマ区切りの文字列
     * @return string array<br />文字列の配列
     */
    protected String[] csvToArray(String csvSring) {
        if (csvSring == null) {
            csvSring = "";
        }
        String[] result = csvSring.split(",", -1);
        return result;
    }

    /**
     * Creates the list of {@link Ws2508ProductivityDataInfoCriteriaDomain} objects.
     *
     * @param errScreenId Error SCREEN ID (a part for the error number)<br />エラー画面ID(エラー件数分)
     * @param errMsgId Error message ID (a part for the error number)<br />エラーメッセージID(エラー件数分)
     * @param bhtUnlockAuthFlg Release object flag (a part for the error number)<br />解除対象フラグ(エラー件数分)
     * @param errWorkTimeStrt WORK START TIME (a part for the error number)<br />作業開始時間(エラー件数分)
     * @param errWorkTimeEnd WORK END TIME (a part for the error number)<br />作業終了時間(エラー件数分)
     * @return the list of {@link Ws2508ProductivityDataInfoCriteriaDomain} objects
     */
    private List<Ws2508ProductivityDataInfoCriteriaDomain> createProductivityDataInfoList(
            String errScreenId,
            String errMsgId,
            String bhtUnlockAuthFlg,
            String errWorkTimeStrt,
            String errWorkTimeEnd
    ) {
        String[] screenIds = split(errScreenId);
        String[] errMsgIds = split(errMsgId);
        String[] bhtUnlockAuthFlgs = split(bhtUnlockAuthFlg);
        String[] errorWorkTimeStrts = split(errWorkTimeStrt);
        String[] errorWorkTimeEnds = split(errWorkTimeEnd);

        int size = maxLength(screenIds, errMsgIds, bhtUnlockAuthFlgs, errorWorkTimeStrts, errorWorkTimeEnds);
        List<Ws2508ProductivityDataInfoCriteriaDomain> productivityDataInfoCriteriaList = new ArrayList<Ws2508ProductivityDataInfoCriteriaDomain>(size);
        
        if (!CheckUtil.isBlankOrNull(errScreenId) 
            || !CheckUtil.isBlankOrNull(errMsgId)
            || !CheckUtil.isBlankOrNull(bhtUnlockAuthFlg)
            || !CheckUtil.isBlankOrNull(errWorkTimeStrt)
            || !CheckUtil.isBlankOrNull(errWorkTimeEnd)) {
            
            for (int i = 0; i < size; i++) {
                Ws2508ProductivityDataInfoCriteriaDomain criteria = new Ws2508ProductivityDataInfoCriteriaDomain();
                criteria.setScreenId(getAt(screenIds, i));
                criteria.setMsgId(getAt(errMsgIds, i));
                criteria.setLockFlg(getAt(bhtUnlockAuthFlgs, i));
                criteria.setWorkTimeStrt(getAt(errorWorkTimeStrts, i));
                criteria.setWorkTimeEnd(getAt(errorWorkTimeEnds, i));
                productivityDataInfoCriteriaList.add(criteria);
            }
        }

        return productivityDataInfoCriteriaList;
    }

    /**
     * Splits the specified string. using comma as the separator.
     *
     * @param s the string to split, may be null
     * @return an array of split string, an empty array if the argument is null
     * @see String#split(String)
     */
    protected String[] split(String s) {
        if (s == null) {
            return EMPTY_STRING_ARRAY;
        }

        return s.split(",");

    }

    /**
     * Returns the greatest length of arrays.
     *
     * @param arrays the arrays of strings
     * @return the greatest length of arrays
     */
    protected int maxLength(String[]... arrays) {
        int max = 0;
        for (String[] array : arrays) {
            max = max(max, array.length);
        }
        return max;
    }
    /**
     * Returns the string at the specified index
     *
     * @param array the array of strings
     * @param index index of the string to return
     * @return the string  at the specified index in the specified array, null if the index argument is negative or not less than the length of the array
     */
    protected String getAt(String[] array, int index) {

        if (array == null) {
            return null;
        }

        if (index < array.length) {
            return array[index];
        }
        return null;
    }
}
