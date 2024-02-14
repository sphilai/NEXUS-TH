/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.WB007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB007ListDomain;
import com.globaldenso.eca0027.core.business.service.WB001OdrRcvService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * This is an implement class of the Facade service to Init action of the Last Digit Change Register Screen.
 * <br />品番末尾変更登録画面のInitアクションに対するFacadeサービスの実装クラスです。
 *
 * @version $Revision: 10246 $
 */
public class WB007InitFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends WB007ListDomain>, WB007CriteriaDomain> {

    /**
     * Ordering business services
     * <br />受注業務サービス
     */
    protected WB001OdrRcvService wb001OdrRcvService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB007InitFacadeServiceImpl() {
    }
    
    /**
     * Setter method for WB001OdrRcvServic.
     *
     * @param wb001OdrRcvService Set for wb001OdrRcvService
     */
    public void setWb001OdrRcvService(WB001OdrRcvService wb001OdrRcvService) {
        this.wb001OdrRcvService = wb001OdrRcvService;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WB007CriteriaDomain filterDomain(WB007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2001_Palletize Instruction Main Screen.xls "a screen item definition" is referred to for details.
     * 
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2001_Palletize Instruction Main Screen.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(WB007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(WB007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WB007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - Customer Order Receiving domain
     *       {@link WB001OdrRcvDomain} is created and the contents of {@link WB007CriteriaDomain} are set up.
     *
     * - Retrieval processing
     *     (the ITEM NO of the information selected on the summary screen is searched)
     *      A non last digit is in agreement and it searches the ITEM NO in which the order received existed in the past one month.
     *      A non last digit is in agreement and it searches an ITEM NO in stock.
     *
     *       This is an argument about created {@link WB001OdrRcvDomain},
     *       This is a call about {@link WB001OdrRcvService#searchOnLstDgtChgRegisterInit (WB001OdrRcvDomain)}.
     *
     * A create of - List domain
     *       {@link WB007ListDomain} is created based on search results.
     *
     * A return of - List domain
     * 
     * - Customer Order Receivingドメインの作成
     *     {@link WB001OdrRcvDomain}を作成し、{@link WB007CriteriaDomain}の内容を設定
     *     
     * - 検索処理
     *   (サマリ画面で選択された情報の品目番号を検索
     *    品番末尾以外が一致し、過去1ヶ月間に受注が存在する品目番号を検索
     *    品番末尾以外が一致し、在庫がある品目番号を検索)
     *   
     *     作成した{@link WB001OdrRcvDomain}を引数に、
     *     {@link WB001OdrRcvService#searchOnLstDgtChgRegisterInit(WB001OdrRcvDomain)}を呼出
     *     
     * - Listドメインの作成
     *     検索結果をもとに{@link WB007ListDomain}を作成する
     *     
     * - Listドメインの返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends WB007ListDomain> callServices(WB007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        // A create of a Customer Order Receiving domain
        // Customer Order Receivingドメインの作成
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        CommonUtil.copyPropertiesDomainToDomain(odrRcv, criteriaDomain, criteriaDomain.getScreenDateFormat());
        if (criteriaDomain.getPkgCd().equals("")) {
            odrRcv.setPkgCd(" ");
        } else {
            odrRcv.setPkgCd(criteriaDomain.getPkgCd());
        }
        odrRcv.setSearchCountCheckFlg(false);
        // Retrieval processing
        // 検索処理
        WB001OdrRcvDomain result = wb001OdrRcvService.searchOnLstDgtChgRegisterInit(odrRcv);
        List<? extends WB001OdrRcvDomain> resultList = result.getOdrRcvDomainList();
        
        // A create of a List domain
        // Listドメインの作成
        int index = 0;
        List<WB007ListDomain> listDomainList = new ArrayList<WB007ListDomain>();
        for (Iterator<? extends WB001OdrRcvDomain> i = resultList.iterator(); i.hasNext();) {
            WB001OdrRcvDomain odrRcvDomain = i.next();
            
            WB007ListDomain listDomain = new WB007ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(listDomain, odrRcvDomain, criteriaDomain.getScreenDateFormat());
            listDomain.setOdrQty(convertZeroToBlank(odrRcvDomain.getOdrQty()));
            if (odrRcvDomain.getUpdateTimestamp() == null){
                listDomain.setUpdateTimestamp("");
            } else {
                listDomain.setUpdateTimestamp(odrRcvDomain.getUpdateTimestamp().toString());
            }
            listDomain.setIndex(Integer.toString(index));
            index++;
            
            listDomainList.add(listDomain);
        }
        
        // A return of a List domain
        // Listドメインの返却
        return listDomainList;
    }

    /**
     * When an argument is Zero is returned, and in except, an argument is returned.
     * <br />引数がZeroの場合Blankを返し、以外の場合引数を返します。
     *
     * @param val Numerical value<br />数値
     * @return In Zero, this is a VALUE of an argument except Blank.<br />Zeroの場合Blank、以外は引数の値
     */
    protected String convertZeroToBlank(BigDecimal val){
        if (val == null || BigDecimal.ZERO.equals(val)){
            return new String("");
        } else {
            return val.toString();
        }
    }
}
