package com.globaldenso.eca0027.asia.business.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BHT_SCREEN_ID_DEFAULT;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.asia.business.domain.criteria.Ws2502ItemNoCriteriaAsiaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2502ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2502CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2502PkgItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2502ProductivityDataInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2502XmlRootCriteriaDomain;
import com.globaldenso.eca0027.core.ws.rest.resource.AbstractResourceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * Resource implementation class of the WS2502.
 * <br />ws2502(Asia固有機能)のリソース実装クラスです。
 * 
 */
public class Ws2502ResourceAsiaImpl extends AbstractResourceImpl implements Ws2502ResourceAsia {

    /**
     * Facade service
     * <br />Facadeサービス
     */
    private TransactFacadeService<Ws2502ResultDomain, Ws2502CriteriaDomain> ws2502TransactFacadeService;

    /**
     * constructor.
     */
    public Ws2502ResourceAsiaImpl() {
    }

    /**
     * This is a setter method of Ws2502CreateFacadeService.
     * <br />Ws2502CreateFacadeService のセッターメソッドです。
     *
     * @param ws2502TransactFacadeService ws2502TransactFacadeService
     */
    public void setWs2502TransactFacadeService(
        TransactFacadeService<Ws2502ResultDomain, Ws2502CriteriaDomain> ws2502TransactFacadeService) {
        this.ws2502TransactFacadeService = ws2502TransactFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws2502Resource#createInstrPltz(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)
     */
    public Ws2502ResultDomain createInstrPltz(String dscId,
        String pltzInstrNo,
        String palletNo,
        String itemNo,
        String pkgCd,
        String mixTagFlg,
        String indusTypCd,
        String kanbanTyp,
        String tagSeqNo,
        String kanbanQty,
        String customerItemNo,
        String customeTagSeqNo,
        String productDate,
        String orderNo,
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
        Ws2502XmlRootCriteriaDomain xmlRootCriteriaDomain = new Ws2502XmlRootCriteriaDomain();
        xmlRootCriteriaDomain.setPltzInstrNo(pltzInstrNo);
        xmlRootCriteriaDomain.setPalletNo(palletNo);
        
        String[] itemNos = csvToArray(itemNo);
        String[] pkgCds = csvToArray(pkgCd);
        String[] mixTagFlgs = csvToArray(mixTagFlg);
        String[] indusTypCds = csvToArray(indusTypCd);
        String[] kanbanTyps = csvToArray(kanbanTyp);
        String[] tagSeqNos = csvToArray(tagSeqNo);
        String[] kanbanQtys = csvToArray(kanbanQty);
        String[] customerItemNos = csvToArray(customerItemNo);
        String[] customeTagSeqNos = csvToArray(customeTagSeqNo);
        String[] productDates = csvToArray(productDate);
        String[] orderNos = csvToArray(orderNo);

        List<Ws2502ItemNoCriteriaAsiaDomain> itemNoCriteriaList = new ArrayList<Ws2502ItemNoCriteriaAsiaDomain>();
        for (int i = 0; i < itemNos.length; i++) {
            Ws2502ItemNoCriteriaAsiaDomain criteria = new Ws2502ItemNoCriteriaAsiaDomain();
            criteria.setItemNo(itemNos[i]);
            criteria.setPkgCd(getAt(pkgCds, i));
            criteria.setMixTagFlg(getAt(mixTagFlgs, i));
            criteria.setIndusTypCd(getAt(indusTypCds, i));
            criteria.setKanbanTyp(getAt(kanbanTyps, i));
            criteria.setTagSeqNo(getAt(tagSeqNos, i));
            criteria.setKanbanQty(getAt(kanbanQtys, i));
            criteria.setCustomerItemNo(getAt(customerItemNos, i));
            criteria.setCustomerTagSeqNo(getAt(customeTagSeqNos, i));
            criteria.setProductDate(getAt(productDates, i));
            criteria.setOrderNo(getAt(orderNos, i));
            itemNoCriteriaList.add(criteria);
        }
        xmlRootCriteriaDomain.setItemNoCriteriaList(itemNoCriteriaList);

        xmlRootCriteriaDomain.setOuterCd(outerCd);
        xmlRootCriteriaDomain.setOuterCdFlg(outerCdFlg);

        List<Ws2502PkgItemNoCriteriaDomain> pkgItemNoCriteriaList = new ArrayList<Ws2502PkgItemNoCriteriaDomain>();
        
        if (!CheckUtil.isBlankOrNull(outerCdItemNo)
            || !CheckUtil.isBlankOrNull(outerCdQty)) {
            
            String[] outerCdItemNos = csvToArray(outerCdItemNo);
            String[] outerCdQtys = csvToArray(outerCdQty);
            for (int i = 0; i < outerCdItemNos.length; i++) {
                Ws2502PkgItemNoCriteriaDomain criteria = new Ws2502PkgItemNoCriteriaDomain();
                criteria.setPkgItemNo(outerCdItemNos[i]);
                criteria.setPkgQty(getAt(outerCdQtys, i));
                pkgItemNoCriteriaList.add(criteria);
            }
        }
        
        xmlRootCriteriaDomain.setPkgItemNoCriteriaList(pkgItemNoCriteriaList);
        xmlRootCriteriaDomain.setWorkTimeStrt(workTimeStrt);
        xmlRootCriteriaDomain.setWorkTimeEnd(workTimeEnd);

        List<Ws2502ProductivityDataInfoCriteriaDomain> productivityDataInfoCriteriaList = new ArrayList<Ws2502ProductivityDataInfoCriteriaDomain>();
        
        if (!CheckUtil.isBlankOrNull(errScreenId) 
                || !CheckUtil.isBlankOrNull(errMsgId)
                || !CheckUtil.isBlankOrNull(bhtUnlockAuthFlg)
                || !CheckUtil.isBlankOrNull(errWorkTimeStrt)
                || !CheckUtil.isBlankOrNull(errWorkTimeEnd)) {

            String[] screenIds = csvToArray(errScreenId);
            String[] errMsgIds = csvToArray(errMsgId);
            String[] bhtUnlockAuthFlgs = csvToArray(bhtUnlockAuthFlg);
            String[] errorWorkTimeStrts = csvToArray(errWorkTimeStrt);
            String[] errorWorkTimeEnds = csvToArray(errWorkTimeEnd);
            
            for (int i = 0; i < screenIds.length; i++) {
                Ws2502ProductivityDataInfoCriteriaDomain criteria = new Ws2502ProductivityDataInfoCriteriaDomain();
                criteria.setScreenId(screenIds[i]);
                criteria.setMsgId(getAt(errMsgIds, i));
                criteria.setLockFlg(getAt(bhtUnlockAuthFlgs, i));
                criteria.setWorkTimeStrt(getAt(errorWorkTimeStrts, i));
                criteria.setWorkTimeEnd(getAt(errorWorkTimeEnds, i));
                productivityDataInfoCriteriaList.add(criteria);
            }
        }
        xmlRootCriteriaDomain.setProductivityDataInfoCriteriaList(productivityDataInfoCriteriaList);

        Ws2502CriteriaDomain criteriaDomain = new Ws2502CriteriaDomain();
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
            return this.ws2502TransactFacadeService.transact(criteriaDomain);
        } catch (ApplicationException e) {
            return processApplicationException(e, Ws2502ResultDomain.class);
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
