/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_BROWSE_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlDomain;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlPltzItemOdrDomain;
import com.globaldenso.eca0027.core.business.domain.W8002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W8003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W8003ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W8001ProgCtrlService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * An implementation class for facade service to initial action of progress control case mark list screen.
 * <br />進度管理 ケースマーク一覧画面のSortアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W8003InitFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W8003ListDomain>, W8003CriteriaDomain> {

    /**
     * Progress control
     * <br />進度管理のサービス
     */
    protected W8001ProgCtrlService w8001ProgCtrlService;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W8003InitFacadeServiceImpl() {
    }

    /**
     * Setter method for w8001ProgCtrlService.
     *
     * @param progCtrlService Set for w8001ProgCtrlService
     */
    public void setW8001ProgCtrlService(W8001ProgCtrlService progCtrlService) {
        w8001ProgCtrlService = progCtrlService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W8003CriteriaDomain filterDomain(W8003CriteriaDomain w8003CriteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        return w8003CriteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W8003CriteriaDomain w8003CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W8003CriteriaDomain w8003CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre>  
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W8003CriteriaDomain w8003CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }
  
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Create criteria domain for progress control service.
     * Convert {@link W8002CriteriaDomain} to {@link W8001ProgCtrlCriteriaDomain}.
     * - Get search result.
     * Call   {@link W8001ProgCtrlService#searchForPagingOnCmlDetailInit}.
     * </pre>
     * <pre>
     * ‐進度管理サービスの条件ドメインを作成
     *     {@link W8002CriteriaDomain}を{@link W8001ProgCtrlCriteriaDomain}に変換する
     * 
     * ‐検索結果データ取得
     *     {@link W8001ProgCtrlService#searchForPagingOnCmlDetailInit}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W8003ListDomain> callServices(W8003CriteriaDomain w8003CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        W8001ProgCtrlCriteriaDomain criteria = createProgCtrlCriteriaDomain(w8003CriteriaDomain);

        List<? extends W8001ProgCtrlDomain> progCtrlList = w8001ProgCtrlService.searchForPagingOnCmlDetailInit(criteria);
        
        return convertToListDomain(criteria, progCtrlList, w8003CriteriaDomain.getScreenDateFormat(), w8003CriteriaDomain.getAuthFlag());
    }


    /**
     * 
     * Create criteria domain for progress control service.
     * <br />進度管理サービスの条件ドメインを作成します。
     *
     * @param w8003CriteriaDomain Criteria domain of progress control main screen<br />
     * 進度管理Main画面の条件ドメイン
     * @return Criteria domain for progress control service<br />
     * 進度管理サービスの条件ドメイン
     */
    protected W8001ProgCtrlCriteriaDomain createProgCtrlCriteriaDomain(W8003CriteriaDomain w8003CriteriaDomain) {
        String dateFormat = w8003CriteriaDomain.getScreenDateFormat();
        // 条件ドメインの作成
        W8001ProgCtrlCriteriaDomain progCtrlCriteriaDomain = new W8001ProgCtrlCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(progCtrlCriteriaDomain, w8003CriteriaDomain, dateFormat);
        progCtrlCriteriaDomain.setMainMark(w8003CriteriaDomain.getCmlNo());
        progCtrlCriteriaDomain.setSelectSort(w8003CriteriaDomain.getSelectSort());
        progCtrlCriteriaDomain.setCmlTyp(w8003CriteriaDomain.getCmlTyp());

        // Setup of authority 
        // 権限の設定
        progCtrlCriteriaDomain.setUserAuthList(w8003CriteriaDomain.getUserAuthList());

        // Setup of Server-ID 
        // Server-IDの設定
        progCtrlCriteriaDomain.setServerId(w8003CriteriaDomain.getServerId());
        
        // Setup of DSC-ID
        // DSC-IDの設定
        progCtrlCriteriaDomain.setDscId(w8003CriteriaDomain.getLoginUserDscId());
        
        return progCtrlCriteriaDomain;
    }

    /**
     *  Convert progress control domain to list domain.
     * <br />進度管理ドメインをリストドメインに変換します。
     *
     * @param criteria Search criteria list<br />
     * 検索条件のリスト
     * @param progCtrlList Search result list<br />
     * 検索結果のリスト
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @param authFlag Auth Flag
     * @return Conversion result<br />
     * 変換結果
     */
    protected List<? extends W8003ListDomain> convertToListDomain(W8001ProgCtrlCriteriaDomain criteria
        , List<? extends W8001ProgCtrlDomain> progCtrlList, String dateFormat, String authFlag) {
        
        List<W8003ListDomain> listDomainList = new ArrayList<W8003ListDomain>();
        
        if (CML_TYPE_CIGMA.equals(criteria.getCmlTyp())){
            if (progCtrlList != null) {
                for (W8001ProgCtrlDomain progCtrl : progCtrlList) {
                    W8003ListDomain listDomain = new W8003ListDomain();
                    for (W8001ProgCtrlPltzItemDomain pltzItem : progCtrl.getPltzItemList()) {
                        for (W8001ProgCtrlPltzItemOdrDomain pltzItemOdr : pltzItem.getPltzItemOdrList()) {
                     
                            listDomain.setCustomerPoNo(pltzItemOdr.getCustomerPoNo());
                            String etdDueDt = DateUtil.formatDate(pltzItemOdr.getEtdDueDt(), dateFormat);
                            listDomain.setEtdDueDt(etdDueDt);
                            listDomain.setItemDescription(pltzItem.getItemDescription());
                            listDomain.setItemNo(pltzItemOdr.getItemNo());
                            listDomain.setPkgCd(pltzItemOdr.getPkgCd());
                            listDomain.setQty(pltzItemOdr.getSumAllocQty().toString());
                            if (!(AUTH_REGISTER_NUMERIC.equals(authFlag) || AUTH_BROWSE_NUMERIC.equals(authFlag)) 
                                && AUTH_EMPTY_NUMERIC.equals(progCtrl.getAuth())) {
                                // Data is masked when there is no authority. (* Conversion)
                                //権限がない場合、データをマスキング(*変換)
                                listDomain.setCustomerPoNo(mask(listDomain.getCustomerPoNo()));
                                listDomain.setEtdDueDt(mask(listDomain.getEtdDueDt()));
                                listDomain.setItemDescription(mask(listDomain.getItemDescription()));
                                listDomain.setItemNo(mask(listDomain.getItemNo()));
                                listDomain.setPkgCd(mask(listDomain.getPkgCd()));
                                listDomain.setQty(mask(listDomain.getQty()));
                            }
                            listDomainList.add(listDomain);
                        }
                    }
                }
            }
        }
        else {
            if (progCtrlList != null) {
                for (W8001ProgCtrlDomain progCtrl : progCtrlList) {
                    W8003ListDomain listDomain = new W8003ListDomain();
                    for (W8001ProgCtrlPltzItemDomain pltzItem : progCtrl.getPltzItemList()) {
                        listDomain.setCustomerPoNo(pltzItem.getCustomerPoNo());
                        listDomain.setEtdDueDt(StringUtils.EMPTY);
                        listDomain.setItemDescription(pltzItem.getItemDescription());
                        listDomain.setItemNo(pltzItem.getPltzItemNo());
                        listDomain.setPkgCd(pltzItem.getPkgCd());
                        listDomain.setQty(pltzItem.getSumQty().toString());
                        if (!(AUTH_REGISTER_NUMERIC.equals(authFlag) || AUTH_BROWSE_NUMERIC.equals(authFlag)) 
                            && AUTH_EMPTY_NUMERIC.equals(progCtrl.getAuth())) {
                            // Data is masked when there is no authority. (* Conversion)
                            //権限がない場合、データをマスキング(*変換)
                            listDomain.setCustomerPoNo(mask(listDomain.getCustomerPoNo()));
                            listDomain.setEtdDueDt(mask(listDomain.getEtdDueDt()));
                            listDomain.setItemDescription(mask(listDomain.getItemDescription()));
                            listDomain.setItemNo(mask(listDomain.getItemNo()));
                            listDomain.setPkgCd(mask(listDomain.getPkgCd()));
                            listDomain.setQty(mask(listDomain.getQty()));
                        }
                        listDomainList.add(listDomain);
                    }
                }
            }
        }
        return listDomainList;
    }
    /**
     * Replace the input string with '*' .
     * <br />入力文字列を*に置き換えます。
     *
     * @param s Source strings<br />
     * 変換元文字列
     * @return Destination strings<br />
     * 変換先文字列
     */
    protected String mask(String s) {
        
        if (s == null){
            return s;
        }
        return s.replaceAll(".", "*");
    }
}
