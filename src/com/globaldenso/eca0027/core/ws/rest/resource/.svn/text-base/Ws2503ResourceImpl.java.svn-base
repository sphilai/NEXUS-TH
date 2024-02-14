/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BHT_SCREEN_ID_DEFAULT;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2503ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2503CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2503ItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2503PkgItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2503ProductivityDataInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2503XmlRootCriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * Resource implementation class for the ws2503
 * <br />ws2503のリソース実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7966 $
 */
public class Ws2503ResourceImpl extends AbstractResourceImpl implements Ws2503Resource  {

    /**
     * Facade service
     * <br />Facadeサービス
     */
    private TransactFacadeService<Ws2503ResultDomain, Ws2503CriteriaDomain> ws2503TransactFacadeService;

    /**
     * constructor.
     */
    public Ws2503ResourceImpl() {

    }

    /**
     * Setter method for ws2503TransactFacadeService.
     *
     * @param ws2503TransactFacadeService Set for ws2503TransactFacadeService
     */
    public void setWs2503TransactFacadeService(
        TransactFacadeService<Ws2503ResultDomain, Ws2503CriteriaDomain> ws2503TransactFacadeService) {
        this.ws2503TransactFacadeService = ws2503TransactFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws2503Resource#createNonInstrPltz(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)
     */
    public Ws2503ResultDomain createNonInstrPltz(
        String dscId,
        String shipperCd,
        String customerCd,
        String lgcyShipTo,
        String trnsCd,
        String plntCd,
        String lgcyWhCd,
        String whComCd,
        String whCd,
        String whFlg,
        String palletNo,
        String itemNo,
        String pkgCd,
        String mixTagFlg,
        String indusTypCd,
        String kanbanTyp,
        String tagSeqNo,
        String kanbanQty,
        String outerCd,
        String outerCdFlg,
        String outerCdItemNo,
        String outerCdQty,
        String workTimeStrt,
        String workTimeEnd,
        String errScreenId,
        String errMsgId,
        String bhtUnlockAuthFlg,
        String errWorkTimeStrt,
        String errWorkTimeEnd,
        String screenId
    ) throws AiwsApplicationException {
        
        // Generation and a setting of Criteria Domain
        // Criteria Domainの生成と設定
        Ws2503XmlRootCriteriaDomain xmlRootCriteriaDomain = new Ws2503XmlRootCriteriaDomain();
//        xmlRootCriteriaDomain = XmlUtil.unmarshal(Ws2503XmlRootCriteriaDomain.class, ws2503Criteria);

        xmlRootCriteriaDomain.setShipperCd(shipperCd);
        xmlRootCriteriaDomain.setCustomerCd(customerCd);
        xmlRootCriteriaDomain.setLgcyShipTo(lgcyShipTo);
        xmlRootCriteriaDomain.setTrnsCd(trnsCd);
        xmlRootCriteriaDomain.setPlntCd(plntCd);
        xmlRootCriteriaDomain.setLgcyWhCd(lgcyWhCd);
        xmlRootCriteriaDomain.setWhCompCd(whComCd);
        xmlRootCriteriaDomain.setWhCd(whCd);
        xmlRootCriteriaDomain.setNexusWhFlg(whFlg);
        xmlRootCriteriaDomain.setPalletNo(palletNo);
        
        String[] itemNos = csvToArray(itemNo);
        String[] pkgCds = csvToArray(pkgCd);
        String[] mixTagFlgs = csvToArray(mixTagFlg);
        String[] indusTypCds = csvToArray(indusTypCd);
        String[] kanbanTyps = csvToArray(kanbanTyp);
        String[] tagSeqNos = csvToArray(tagSeqNo);
        String[] kanbanQtys = csvToArray(kanbanQty);
        List<Ws2503ItemNoCriteriaDomain> itemNoCriteriaList = new ArrayList<Ws2503ItemNoCriteriaDomain>();
        for (int i = 0; i < itemNos.length; i++) {
            Ws2503ItemNoCriteriaDomain criteria = new Ws2503ItemNoCriteriaDomain();
            criteria.setItemNo(itemNos[i]);
            criteria.setPkgCd(getAt(pkgCds, i));
            criteria.setMixTagFlg(getAt(mixTagFlgs, i));
            criteria.setIndusTypCd(getAt(indusTypCds, i));
            criteria.setKanbanTyp(getAt(kanbanTyps, i));
            criteria.setTagSeqNo(getAt(tagSeqNos, i));
            criteria.setKanbanQty(getAt(kanbanQtys, i));
            itemNoCriteriaList.add(criteria);
        }
        xmlRootCriteriaDomain.setItemNoCriteriaList(itemNoCriteriaList);

        xmlRootCriteriaDomain.setOuterCd(outerCd);
        xmlRootCriteriaDomain.setOuterCdFlg(outerCdFlg);

        List<Ws2503PkgItemNoCriteriaDomain> pkgItemNoCriteriaList = new ArrayList<Ws2503PkgItemNoCriteriaDomain>();
        
        if (!CheckUtil.isBlankOrNull(outerCdItemNo)
            || !CheckUtil.isBlankOrNull(outerCdQty)) {
            
            String[] outerCdItemNos = csvToArray(outerCdItemNo);
            String[] outerCdQtys = csvToArray(outerCdQty);
            for (int i = 0; i < outerCdItemNos.length; i++) {
                Ws2503PkgItemNoCriteriaDomain criteria = new Ws2503PkgItemNoCriteriaDomain();
                criteria.setPkgItemNo(outerCdItemNos[i]);
                criteria.setPkgQty(getAt(outerCdQtys, i));
                pkgItemNoCriteriaList.add(criteria);
            }
        }
        
        xmlRootCriteriaDomain.setPkgItemNoCriteriaList(pkgItemNoCriteriaList);
        xmlRootCriteriaDomain.setWorkTimeStrt(workTimeStrt);
        xmlRootCriteriaDomain.setWorkTimeEnd(workTimeEnd);

        String[] screenIds = csvToArray(errScreenId);
        String[] errMsgIds = csvToArray(errMsgId);
        String[] bhtUnlockAuthFlgs = csvToArray(bhtUnlockAuthFlg);
        String[] errWorkTimeStrts = csvToArray(errWorkTimeStrt);
        String[] errWorkTimeEnds = csvToArray(errWorkTimeEnd);
        List<Ws2503ProductivityDataInfoCriteriaDomain> productivityDataInfoCriteriaList = new ArrayList<Ws2503ProductivityDataInfoCriteriaDomain>();
        
        if (!CheckUtil.isBlankOrNull(errScreenId) 
            || !CheckUtil.isBlankOrNull(errMsgId)
            || !CheckUtil.isBlankOrNull(bhtUnlockAuthFlg)
            || !CheckUtil.isBlankOrNull(errWorkTimeStrt)
            || !CheckUtil.isBlankOrNull(errWorkTimeEnd)) {
            for (int i = 0; i < screenIds.length; i++) {
                Ws2503ProductivityDataInfoCriteriaDomain criteria = new Ws2503ProductivityDataInfoCriteriaDomain();
                criteria.setScreenId(screenIds[i]);
                criteria.setMsgId(getAt(errMsgIds, i));
                criteria.setLockFlg(getAt(bhtUnlockAuthFlgs, i));
                criteria.setWorkTimeStrt(getAt(errWorkTimeStrts, i));
                criteria.setWorkTimeEnd(getAt(errWorkTimeEnds, i));
                productivityDataInfoCriteriaList.add(criteria);
            }
        }
        
        xmlRootCriteriaDomain.setProductivityDataInfoCriteriaList(productivityDataInfoCriteriaList);

        Ws2503CriteriaDomain criteriaDomain = new Ws2503CriteriaDomain();
        // criteriaDomain.setXmlRoot(xmlRootCriteriaDomain);
        criteriaDomain.setLoginUserDscId(dscId);
        criteriaDomain.setLocale(new Locale(getLanguageCd()));
        if (!CheckUtil.isBlankOrNull(screenId)) {
            criteriaDomain.setScreenId(screenId);
        } else {
            criteriaDomain.setScreenId(BHT_SCREEN_ID_DEFAULT);
        }
        criteriaDomain.setXmlRoot(xmlRootCriteriaDomain);

        try {
            // Execution of FacadeService
            // FacadeServiceの実行
            return this.ws2503TransactFacadeService.transact(criteriaDomain);
        } catch (ApplicationException e) {
            return processApplicationException(e, Ws2503ResultDomain.class);
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
