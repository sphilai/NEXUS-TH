/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2012;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2019;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_REF;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2013CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2013ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * The search service facade implementation class of CML PKG Info Detail
 * <br />CML PKG Info Detail画面のInitFacadeサービス実装クラスです。
 * <pre>
 * bean W2013InitFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class W2013InitFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W2013ListDomain>, W2013CriteriaDomain> {

    /**
     * CML service
     * <br />CMLサービス
     */
    protected W2009CmlService w2009CmlService;

    /**
     * constructor
     * <br />デフォルトコンストラクタ
     */
    public W2013InitFacadeServiceImpl() {
    }

    /**
     * Setter method for w2009CmlService.
     *
     * @param cmlService Set for w2009CmlService
     */
    public void setW2009CmlService(W2009CmlService cmlService) {
        w2009CmlService = cmlService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2013CriteriaDomain filterDomain(W2013CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2013CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2013CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2013CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - retrieval-result-data acquisition
     * </pre>
     * <pre>
     * - 検索結果データ取得
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2013ListDomain> callServices(W2013CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        
        List<W2013ListDomain> list = new ArrayList<W2013ListDomain>();
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain);

        String functionMode = criteriaDomain.getFunctionMode();
        String originalScreenId = criteriaDomain.getOriginalScreenId();

        W2009CmlDomain w2009CmlDomain = w2009CmlService.searchOnDetailInit(criteria, originalScreenId);

        if (w2009CmlDomain != null ) {
            // UT304 MULTI LABEL MOD START
            //if (SCREEN_ID_W2012.equals(originalScreenId) && W2009_CML_MODE_EDIT.equals(functionMode)) {
            if ((SCREEN_ID_W2012.equals(originalScreenId) || SCREEN_ID_W2020.equals(originalScreenId)) && W2009_CML_MODE_EDIT.equals(functionMode)) {
            // UT304 MULTI LABEL MOD END
                // It changes from W2012 and, in the case of register mode, is.
                // W2012から遷移し、登録モードの場合
                for (W2009CmlItemDomain w2009CmlItemDomain : w2009CmlDomain.getCmlItemDomainList()) {
                    W2013ListDomain w2013ListDomain = new W2013ListDomain();
                    w2013ListDomain.setInputMethod(w2009CmlItemDomain.getInputMethod());
                    w2013ListDomain.setRtFlg(w2009CmlItemDomain.getRtFlg());
                    w2013ListDomain.setPkgTyp(w2009CmlItemDomain.getPkgTyp());
                    w2013ListDomain.setPkgItemNo(w2009CmlItemDomain.getPltzItemNo());
                    w2013ListDomain.setSelected("");
                    w2013ListDomain.setModelCd(w2009CmlItemDomain.getModelCd());
                    w2013ListDomain.setMixTagNo(w2009CmlItemDomain.getMixTagNo());
                    w2013ListDomain.setQty(decimalToString(w2009CmlItemDomain.getQty()));
                    w2013ListDomain.setTotalQty(decimalToString(w2009CmlItemDomain.getTotalQty()));
                    w2013ListDomain.setBrch(decimalToString(w2009CmlItemDomain.getBrch()));
                    w2013ListDomain.setItemDescription(w2009CmlItemDomain.getItemDescription());
                    w2013ListDomain.setPkgTypHidden(w2009CmlItemDomain.getPkgTypHidden());
                    w2013ListDomain.setPkgWeight(decimalToString(w2009CmlItemDomain.getPkgWeight()));
                    w2013ListDomain.setWeightUnit(w2009CmlItemDomain.getWeightUnit());
                    w2013ListDomain.setOriginCntryCd(w2009CmlItemDomain.getOriginCntryCd());
                    w2013ListDomain.setCurrCd(w2009CmlItemDomain.getCurrCd());
                    w2013ListDomain.setInputMethTyp(w2009CmlItemDomain.getInputMethTyp());
                    list.add(w2013ListDomain);
                }
            } else if (SCREEN_ID_W2012.equals(originalScreenId) && W2009_CML_MODE_REF.equals(functionMode)) {
                // It changes from W2012 and, in the case of reference mode, is.
                // W2012から遷移し、参照モードの場合
                criteriaDomain.setPalletNo(w2009CmlDomain.getPalletNo());
                criteriaDomain.setShipperCd(w2009CmlDomain.getShipperCd());
                criteriaDomain.setCustomerCd(w2009CmlDomain.getCustomerCd());
                criteriaDomain.setLgcyShipTo(w2009CmlDomain.getLgcyShipTo());
                criteriaDomain.setTrnsCd(w2009CmlDomain.getTrnsCd());
                criteriaDomain.setPlntCd(w2009CmlDomain.getPlntCd());
                criteriaDomain.setLgcyWhCd(w2009CmlDomain.getLgcyWhCd());
                criteriaDomain.setPltzInstrNo(w2009CmlDomain.getPltzInstrNo());
                criteriaDomain.setPkgFormTyp(w2009CmlDomain.getPkgFormTyp());
                criteriaDomain.setInvoiceKey(w2009CmlDomain.getInvoiceKey());
                criteriaDomain.setContainerSortingKey(w2009CmlDomain.getContainerSortingKey());                
                criteriaDomain.setExpPackingDt(DateUtil.formatDate(w2009CmlDomain.getExpPackingDt(), criteriaDomain.getScreenDateFormat()));
                criteriaDomain.setExpPackingIssuerNm(w2009CmlDomain.getExpPackingIssuerNm());
                
                List<? extends W2009CmlItemDomain> w2009CmlItemList = w2009CmlDomain.getCmlItemDomainList();
                for (W2009CmlItemDomain w2009CmlItemDomain : w2009CmlItemList) {
                    W2013ListDomain w2013ListDomain = new W2013ListDomain();
   
                    w2013ListDomain.setInputMethod(w2009CmlItemDomain.getInputMethod());
                    w2013ListDomain.setRtFlg(w2009CmlItemDomain.getRtFlg());
                    w2013ListDomain.setPkgTyp(w2009CmlItemDomain.getPkgTyp());
                    w2013ListDomain.setPkgItemNo(w2009CmlItemDomain.getPltzItemNo());
                    w2013ListDomain.setSelected("");
                    w2013ListDomain.setModelCd(w2009CmlItemDomain.getModelCd());
                    w2013ListDomain.setMixTagNo(w2009CmlItemDomain.getMixTagNo());
                    w2013ListDomain.setQty(w2009CmlItemDomain.getQty().toString());
                    w2013ListDomain.setTotalQty(w2009CmlItemDomain.getTotalQty().toString());
                    w2013ListDomain.setBrch("");
                    w2013ListDomain.setItemDescription("");
                    w2013ListDomain.setPkgTypHidden("");
                    w2013ListDomain.setPkgWeight("");
                    w2013ListDomain.setWeightUnit("");
                    w2013ListDomain.setOriginCntryCd("");
                    w2013ListDomain.setCurrCd("");
                    w2013ListDomain.setInputMethTyp("");
                    list.add(w2013ListDomain);
                }
            } else if (SCREEN_ID_W2019.equals(originalScreenId)) {
                // In the case of the changes from W2019 CML Trans/PKG Revise
                // W2019 CML Trans/PKG Reviseからの遷移の場合
                criteriaDomain.setPalletNo(w2009CmlDomain.getPalletNo());
                criteriaDomain.setShipperCd(w2009CmlDomain.getShipperCd());
                criteriaDomain.setCustomerCd(w2009CmlDomain.getCustomerCd());
                criteriaDomain.setLgcyShipTo(w2009CmlDomain.getLgcyShipTo());
                criteriaDomain.setTrnsCd(w2009CmlDomain.getTrnsCd());
                criteriaDomain.setPlntCd(w2009CmlDomain.getPlntCd());
                criteriaDomain.setLgcyWhCd(w2009CmlDomain.getLgcyWhCd());
                criteriaDomain.setPltzInstrNo(w2009CmlDomain.getPltzInstrNo());
                criteriaDomain.setPkgFormTyp(w2009CmlDomain.getPkgFormTyp());
                criteriaDomain.setInvoiceKey(w2009CmlDomain.getInvoiceKey());
                criteriaDomain.setContainerSortingKey(w2009CmlDomain.getContainerSortingKey());                
                criteriaDomain.setExpPackingDt(DateUtil.formatDate(w2009CmlDomain.getExpPackingDt(), criteriaDomain.getScreenDateFormat()));
                criteriaDomain.setExpPackingIssuerNm(w2009CmlDomain.getExpPackingIssuerNm());
                
                // It changes from W2012 and, in the case of register mode, is.
                // W2012から遷移し、登録モードの場合
                for (W2009CmlItemDomain w2009CmlItemDomain : w2009CmlDomain.getCmlItemDomainList()) {
                    W2013ListDomain w2013ListDomain = new W2013ListDomain();
                    w2013ListDomain.setInputMethod(w2009CmlItemDomain.getInputMethod());
                    w2013ListDomain.setRtFlg(w2009CmlItemDomain.getRtFlg());
                    w2013ListDomain.setPkgTyp(w2009CmlItemDomain.getPkgTyp());
                    w2013ListDomain.setPkgItemNo(w2009CmlItemDomain.getPltzItemNo());
                    w2013ListDomain.setSelected("");
                    w2013ListDomain.setModelCd(w2009CmlItemDomain.getModelCd());
                    w2013ListDomain.setMixTagNo(w2009CmlItemDomain.getMixTagNo());
                    w2013ListDomain.setQty(decimalToString(w2009CmlItemDomain.getQty()));
                    w2013ListDomain.setTotalQty(decimalToString(w2009CmlItemDomain.getTotalQty()));
                    w2013ListDomain.setBrch(decimalToString(w2009CmlItemDomain.getBrch()));
                    w2013ListDomain.setItemDescription(w2009CmlItemDomain.getItemDescription());
                    w2013ListDomain.setPkgTypHidden(w2009CmlItemDomain.getPkgTypHidden());
                    w2013ListDomain.setPkgWeight(decimalToString(w2009CmlItemDomain.getPkgWeight()));
                    w2013ListDomain.setWeightUnit(w2009CmlItemDomain.getWeightUnit());
                    w2013ListDomain.setOriginCntryCd(w2009CmlItemDomain.getOriginCntryCd());
                    w2013ListDomain.setCurrCd(w2009CmlItemDomain.getCurrCd());
                    w2013ListDomain.setInputMethTyp(w2009CmlItemDomain.getInputMethTyp());
                    list.add(w2013ListDomain);
                }
            }
        }
        return list;
    }
    
    /**
     * Change the VALUE of BigDecimal into a string.
     * <br />BigDecimalの値を文字列に変換する。
     * <pre>
     * - null is returned when an argument is null.
     *     When this is not null, the result of having carried out {@link BigDecimal#toPlainString()} to the argument is returned.
     * </pre>
     * <pre>
     * - 引数がnullの場合は、null を返す。
     *   nullでない場合は、引数に対して {@link BigDecimal#toPlainString()} を実施した結果を返す。
     * </pre>
     * @param decimalVal The VALUE of BigDecimal<br />BigDecimalの値
     * @return String<br />文字列
     */
    protected String decimalToString(BigDecimal decimalVal){
        
        if (decimalVal == null ) {
            return null;
        }
        return decimalVal.toPlainString();
        
    }
}
